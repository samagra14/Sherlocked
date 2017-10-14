package com.example.samagra.sherlocked_samagra;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import data.SherlockContract;

/**
 * Created by samagra on 06-01-2017.
 */

public class SeasonCursorAdapter extends CursorAdapter {
    /**
     * Constructs a new {@link SeasonCursorAdapter}.
     *
     * @param context The context
     * @param cursor     The cursor from which to get the data.
     */
    public SeasonCursorAdapter(Context context, Cursor cursor){
        super(context,cursor, 0 /* flags */);
    }

    /**
     * Makes a new blank list item view. No data is set (or bound) to the views yet.
     *
     * @param context app context
     * @param cursor  The cursor from which to get the data. The cursor is already
     *                moved to the correct position.
     * @param parent  The parent to which the new view is attached to
     * @return the newly created list item view.
     */
    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        // TODO: Fill out this method and return the list item view (instead of null)

        return LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
    }

    /**
     * This method binds the pet data (in the current row pointed to by cursor) to the given
     * list item layout. For example, the name for the current pet can be set on the name TextView
     * in the list item layout.
     *
     * @param view    Existing view, returned earlier by newView() method
     * @param context app context
     * @param cursor  The cursor from which to get the data. The cursor is already moved to the
     *                correct row.
     */
    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        // Fill out this method
        //first find individual views that you want to set out
        ImageView imageView = (ImageView) view.findViewById(R.id.seasonImage);
        TextView textView = (TextView) view.findViewById(R.id.textView);

        //find the column indices of the information from the pets database
        int seasonColumnIndex = cursor.getColumnIndex(SherlockContract.SeasonEntry.COLUMN_SEASON_NAME);
        int imageColumnIndex = cursor.getColumnIndex(SherlockContract.SeasonEntry.COLUMN_RESOURCE_ID);

        //now get the data from the database
        String seasonName = cursor.getString(seasonColumnIndex);
        int imageResourceId = cursor.getInt(imageColumnIndex);

        //now set the data on the screen
        textView.setText(seasonName);
        imageView.setImageResource(imageResourceId);
    }

}
