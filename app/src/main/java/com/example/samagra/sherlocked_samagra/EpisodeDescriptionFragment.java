package com.example.samagra.sherlocked_samagra;


import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import data.SherlockContract;
import data.SherlockDbHelper;

/**
 * A simple {@link Fragment} subclass.
 */
public class EpisodeDescriptionFragment extends Fragment {


    public EpisodeDescriptionFragment() {
        // Required empty public constructor
    }
    private int mEpisode;
    public void setmEpisode(int episode){
        mEpisode = episode;
    }

    private int mSeason;
    public void setmSeason(int episode){
        mSeason = episode;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //inflating the fragment
        View rootView = inflater.inflate(R.layout.episode_description,container,false);
        //find image view
        ImageView imageView = (ImageView) rootView.findViewById(R.id.episodeImage);

        //find director view
        TextView directorView = (TextView) rootView.findViewById(R.id.director);
        //find episode image
        TextView episodeNameView = (TextView) rootView.findViewById(R.id.episodeName);
        //find writer
        TextView writerView = (TextView) rootView.findViewById(R.id.writer);
        //find date
        TextView dateView = (TextView) rootView.findViewById(R.id.aired_on);

        //find time
        TextView timeView = (TextView) rootView.findViewById(R.id.running_time);

        //find summary
        TextView summaryView = (TextView) rootView.findViewById(R.id.summary);

        // To access our database, we instantiate our subclass of SQLiteOpenHelper
        // and pass the context, which is the current activity.
        SherlockDbHelper mDbHelper = new SherlockDbHelper(getActivity());
        // Create and/or open a database to read from it
        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        Cursor cursor;
        //cursor from database
        if(mSeason==1){
        String[] projection = {
                SherlockContract.DescriptionEpisodesSeasonOne._ID,
                SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_EPISODE_NAME,
                SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_DIRECTOR,
                SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_WRITER,    //contract class constants for
                SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_DATE,
                SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_RUNNING_TIME,
                SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_SUMMARY,
                SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_RESOURCE_ID};
        //String selection = SherlockContract.DescriptionEpisodesSeasonOne._ID +"=?";
        //String[] selectionArgs = {"1"};


        cursor = db.query(SherlockContract.DescriptionEpisodesSeasonOne.TABLE_NAME, projection, null, null, null, null, null);}
        else if (mSeason==2){
            String[] projection = {
                    SherlockContract.DescriptionEpisodesSeasonTwo._ID,
                    SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_EPISODE_NAME,
                    SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_DIRECTOR,
                    SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_WRITER,    //contract class constants for
                    SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_DATE,
                    SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_RUNNING_TIME,
                    SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_SUMMARY,
                    SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_RESOURCE_ID};
            //String selection = SherlockContract.DescriptionEpisodesSeasonOne._ID +"=?";
            //String[] selectionArgs = {"1"};


            cursor = db.query(SherlockContract.DescriptionEpisodesSeasonTwo.TABLE_NAME, projection, null, null, null, null, null);
        }
        else if (mSeason==3){
            String[] projection = {
                    SherlockContract.DescriptionEpisodesSeasonThree._ID,
                    SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_EPISODE_NAME,
                    SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_DIRECTOR,
                    SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_WRITER,    //contract class constants for
                    SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_DATE,
                    SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_RUNNING_TIME,
                    SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_SUMMARY,
                    SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_RESOURCE_ID};
            //String selection = SherlockContract.DescriptionEpisodesSeasonOne._ID +"=?";
            //String[] selectionArgs = {"1"};


            cursor = db.query(SherlockContract.DescriptionEpisodesSeasonThree.TABLE_NAME, projection, null, null, null, null, null);
        }
        else if (mSeason==4){
            String[] projection = {
                    SherlockContract.DescriptionEpisodesSeasonFour._ID,
                    SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_EPISODE_NAME,
                    SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_DIRECTOR,
                    SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_WRITER,    //contract class constants for
                    SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_DATE,
                    SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_RUNNING_TIME,
                    SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_SUMMARY,
                    SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_RESOURCE_ID};
            //String selection = SherlockContract.DescriptionEpisodesSeasonOne._ID +"=?";
            //String[] selectionArgs = {"1"};


            cursor = db.query(SherlockContract.DescriptionEpisodesSeasonFour.TABLE_NAME, projection, null, null, null, null, null);
        }

        else {
            String[] projection = {
                    SherlockContract.DescriptionEpisodesSeasonSpecial._ID,
                    SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_EPISODE_NAME,
                    SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_DIRECTOR,
                    SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_WRITER,    //contract class constants for
                    SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_DATE,
                    SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_RUNNING_TIME,
                    SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_SUMMARY,
                    SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_RESOURCE_ID};
            //String selection = SherlockContract.DescriptionEpisodesSeasonOne._ID +"=?";
            //String[] selectionArgs = {"1"};


            cursor = db.query(SherlockContract.DescriptionEpisodesSeasonSpecial.TABLE_NAME, projection, null, null, null, null, null);
        }

        if (mEpisode==1)
        cursor.moveToFirst();
        else if (mEpisode==2)
            cursor.moveToPosition(1);
        else
            cursor.moveToPosition(2);


        /**
         *
         *
         * common code
         *
         */
        int episodeColumnIndex = cursor.getColumnIndex(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_EPISODE_NAME);
         int directorColumnIndex= cursor.getColumnIndex(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_DIRECTOR);
        int writerColumnIndex = cursor.getColumnIndex(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_WRITER);
        int dateColumnIndex = cursor.getColumnIndex(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_DATE);
        int imageResourceIndex = cursor.getColumnIndex(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_RESOURCE_ID);
        int timeColumnIndex = cursor.getColumnIndex(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_RUNNING_TIME);
        int summaryColumnIndex = cursor.getColumnIndex(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_SUMMARY);

        String episodeName = cursor.getString(episodeColumnIndex);
        String directorName = cursor.getString(directorColumnIndex);
        String writerName = cursor.getString(writerColumnIndex);
        String date = cursor.getString(dateColumnIndex);
        int time = cursor.getInt(timeColumnIndex);
        String timeString = ""+time;

        String summary = cursor.getString(summaryColumnIndex);
        int image = cursor.getInt(imageResourceIndex);


        imageView.setImageResource(image);
        episodeNameView.setText(episodeName);
        directorView.setText(directorName);
        writerView.setText(writerName);
        dateView.setText(date);
        timeView.setText(timeString);
        summaryView.setText(summary);

        return rootView;

    }

}
