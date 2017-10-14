package com.example.samagra.sherlocked_samagra;


import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import data.SherlockContract;
import data.SherlockDbHelper;

/**
 * A simple {@link Fragment} subclass.
 */
public class SeasonFragment extends Fragment {

    private int mSeasonName;

    /**
     * since fragment is an abstract class or an interface therefore its default constructor has to be
     * overridden in order to implement the interface
     */
   /** public static SeasonFragment newInstance(int position){
        Bundle args = new Bundle();
        args.putInt("Position",position);
        SeasonFragment fragment = new SeasonFragment();
        fragment.setArguments(args);
        return fragment;
    }*/
    public SeasonFragment() {
        //required empty public constructor
    }
    public void setmSeasonName(int season){
        mSeasonName = season;
    }



    /**@Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mSeasonName = getArguments().getInt("Position");

    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //inflating the fragment
        View rootView = inflater.inflate(R.layout.activity_main,container,false);
        //find listview
        ListView listView = (ListView) rootView.findViewById(R.id.episodes_list);
        //now get the database
        // To access our database, we instantiate our subclass of SQLiteOpenHelper
        // and pass the context, which is the current activity.
        SherlockDbHelper mDbHelper = new SherlockDbHelper(getActivity());

        // Create and/or open a database to read from it
        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        Cursor cursor;

        /**String[] projection = {
                SherlockContract.EpisodeSeasonOneEntry._ID,
                SherlockContract.EpisodeSeasonOneEntry.COLUMN_EPISODE_NAME,    //contract class constants for
                SherlockContract.EpisodeSeasonOneEntry.COLUMN_RESOURCE_ID};
        Cursor cursor = db.query(SherlockContract.EpisodeSeasonOneEntry.TABLE_NAME, projection, null, null, null, null, null);*/
        if(mSeasonName==1){
            String[] projection = {
                    SherlockContract.EpisodeSeasonOneEntry._ID,
                    SherlockContract.EpisodeSeasonOneEntry.COLUMN_EPISODE_NAME,    //contract class constants for
                    SherlockContract.EpisodeSeasonOneEntry.COLUMN_RESOURCE_ID};
             cursor = db.query(SherlockContract.EpisodeSeasonOneEntry.TABLE_NAME, projection, null, null, null, null, null);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    Intent intent = new Intent(getContext(),IndividualEpisodeActivity.class);
                    intent.putExtra("Season",mSeasonName);
                    intent.putExtra("Episode",position);
                    startActivity(intent);
                }
            });

        }
        else if (mSeasonName==2){
            String[] projection = {
                    SherlockContract.EpisodeSeasonTwoEntry._ID,
                    SherlockContract.EpisodeSeasonTwoEntry.COLUMN_EPISODE_NAME,    //contract class constants for
                    SherlockContract.EpisodeSeasonTwoEntry.COLUMN_RESOURCE_ID};
             cursor = db.query(SherlockContract.EpisodeSeasonTwoEntry.TABLE_NAME, projection, null, null, null, null, null);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    Intent intent = new Intent(getContext(),IndividualEpisodeActivity.class);
                    intent.putExtra("Season",mSeasonName);
                    intent.putExtra("Episode",position);
                    startActivity(intent);
                }
            });
        }
        else if (mSeasonName==3) {
            String[] projection = {
                    SherlockContract.EpisodeSeasonThreeEntry._ID,
                    SherlockContract.EpisodeSeasonThreeEntry.COLUMN_EPISODE_NAME,    //contract class constants for
                    SherlockContract.EpisodeSeasonThreeEntry.COLUMN_RESOURCE_ID};
             cursor = db.query(SherlockContract.EpisodeSeasonThreeEntry.TABLE_NAME, projection, null, null, null, null, null);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    Intent intent = new Intent(getContext(),IndividualEpisodeActivity.class);
                    intent.putExtra("Season",mSeasonName);
                    intent.putExtra("Episode",position);
                    startActivity(intent);
                }
            });
        }
        else if (mSeasonName==4) {
            String[] projection = {
                    SherlockContract.EpisodeSeasonFourEntry._ID,
                    SherlockContract.EpisodeSeasonFourEntry.COLUMN_EPISODE_NAME,    //contract class constants for
                    SherlockContract.EpisodeSeasonFourEntry.COLUMN_RESOURCE_ID};
            cursor = db.query(SherlockContract.EpisodeSeasonFourEntry.TABLE_NAME, projection, null, null, null, null, null);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    Intent intent = new Intent(getContext(),IndividualEpisodeActivity.class);
                    intent.putExtra("Season",mSeasonName);
                    intent.putExtra("Episode",position);
                    startActivity(intent);
                }
            });
        }

        else  {
            String[] projection = {
                    SherlockContract.EpisodeSeasonSpecialEntry._ID,
                    SherlockContract.EpisodeSeasonSpecialEntry.COLUMN_EPISODE_NAME,    //contract class constants for
                    SherlockContract.EpisodeSeasonSpecialEntry.COLUMN_RESOURCE_ID};
            cursor = db.query(SherlockContract.EpisodeSeasonSpecialEntry.TABLE_NAME, projection, null, null, null, null, null);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    Intent intent = new Intent(getContext(),IndividualEpisodeActivity.class);
                    intent.putExtra("Season",mSeasonName);
                    intent.putExtra("Episode",position);
                    startActivity(intent);
                }
            });
        }


        //instantiate the PetCursorAdapter
        SeasonCursorAdapter seasonCursorAdapter = new SeasonCursorAdapter(getActivity(), cursor);
        //set the adapter with the listview
        listView.setAdapter(seasonCursorAdapter);



        return rootView;
    }

}
