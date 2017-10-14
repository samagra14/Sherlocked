package com.example.samagra.sherlocked_samagra;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import data.SherlockContract;
import data.SherlockDbHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayDatabaseInfo();
    }

    private void displayDatabaseInfo() {
        // To access our database, we instantiate our subclass of SQLiteOpenHelper
        // and pass the context, which is the current activity.
        SherlockDbHelper mDbHelper = new SherlockDbHelper(this);

        // Create and/or open a database to read from it
        SQLiteDatabase db = mDbHelper.getReadableDatabase();

        // Perform this raw SQL query "SELECT * FROM pets"
        // to get a Cursor that contains all rows from the pets table.
        /**
         * The method commented below can be used easily but this is not a good method for SQL queries
         * So instead we will use the projection and selection type arguements for the same
         */
        //Cursor cursor = db.rawQuery("SELECT * FROM " + PetEntry.TABLE_NAME, null);
        //This is a better way to carry out the above task

        //creating the projection variable
        String[] projection = {
                SherlockContract.SeasonEntry._ID,
                SherlockContract.SeasonEntry.COLUMN_SEASON_NAME,    //contract class constants for
                SherlockContract.SeasonEntry.COLUMN_RESOURCE_ID};
        Cursor cursor = db.query(SherlockContract.SeasonEntry.TABLE_NAME, projection, null, null, null, null, null);

        //Cursor cursor = getContentResolver().query(PetEntry.CONTENT_URI,projection,null,null,null);
        //find the listView
        ListView listView = (ListView) findViewById(R.id.episodes_list);



        /**
         * this code gets the information from the cursor object and displays it on the screen
         */


        //instantiate the PetCursorAdapter
        SeasonCursorAdapter seasonCursorAdapter = new SeasonCursorAdapter(this, cursor);
        //set the adapter with the listview
        listView.setAdapter(seasonCursorAdapter);

        //set on item click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(MainActivity.this,EpisodeActivity.class);
                intent.putExtra("Season",position);
                startActivity(intent);

            }
        });


    }
}
