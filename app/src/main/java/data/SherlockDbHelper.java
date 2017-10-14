package data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.samagra.sherlocked_samagra.R;

/**
 * Created by samagra on 06-01-2017.
 */

public class SherlockDbHelper extends SQLiteOpenHelper {
    //constant for database name
    private static final String DATABASE_NAME = "sherlock.db";
    //constant for database version
    private static final int DATABASE_VERSION = 1;
    public SherlockDbHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //CREATE TAble command will be implemented here
        //store it in a string variable
        String SQL_CREATE_SEASONS_TABLE = "CREATE TABLE " + SherlockContract.SeasonEntry.TABLE_NAME + "("
                + SherlockContract.SeasonEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + SherlockContract.SeasonEntry.COLUMN_SEASON_NAME + " TEXT NOT NULL,"

                + SherlockContract.SeasonEntry.COLUMN_RESOURCE_ID + " INTEGER NOT NULL);";
        sqLiteDatabase.execSQL(SQL_CREATE_SEASONS_TABLE);

        ContentValues initialValues = new ContentValues();
        initialValues.put(SherlockContract.SeasonEntry.COLUMN_SEASON_NAME, SherlockContract.SeasonEntry.SEASON_1);
        initialValues.put(SherlockContract.SeasonEntry.COLUMN_RESOURCE_ID, R.drawable.sherlock_season_1);
        sqLiteDatabase.insert(SherlockContract.SeasonEntry.TABLE_NAME,null,initialValues);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.SeasonEntry.COLUMN_SEASON_NAME, SherlockContract.SeasonEntry.SEASON_2);
        initialValues.put(SherlockContract.SeasonEntry.COLUMN_RESOURCE_ID, R.drawable.sherlock_season_2);
        sqLiteDatabase.insert(SherlockContract.SeasonEntry.TABLE_NAME,null,initialValues);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.SeasonEntry.COLUMN_SEASON_NAME,SherlockContract.SeasonEntry.SEASON_3);
        initialValues.put(SherlockContract.SeasonEntry.COLUMN_RESOURCE_ID, R.drawable.sherlock_season_3);
        sqLiteDatabase.insert(SherlockContract.SeasonEntry.TABLE_NAME,null,initialValues);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.SeasonEntry.COLUMN_SEASON_NAME,SherlockContract.SeasonEntry.SEASON_4);
        initialValues.put(SherlockContract.SeasonEntry.COLUMN_RESOURCE_ID, R.drawable.sherlock_season_4);
        sqLiteDatabase.insert(SherlockContract.SeasonEntry.TABLE_NAME,null,initialValues);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.SeasonEntry.COLUMN_SEASON_NAME,SherlockContract.SeasonEntry.SEASON_SPECIAL);
        initialValues.put(SherlockContract.SeasonEntry.COLUMN_RESOURCE_ID, R.drawable.sherlock_season_special);
        sqLiteDatabase.insert(SherlockContract.SeasonEntry.TABLE_NAME,null,initialValues);
        /**
         * for season one episodes
         */

        String SQL_CREATE_EPISODES_ONE_TABLE = "CREATE TABLE " + SherlockContract.EpisodeSeasonOneEntry.TABLE_NAME + "("
                + SherlockContract.EpisodeSeasonOneEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + SherlockContract.EpisodeSeasonOneEntry.COLUMN_EPISODE_NAME + " TEXT NOT NULL,"

                + SherlockContract.EpisodeSeasonOneEntry.COLUMN_RESOURCE_ID + " INTEGER NOT NULL);";
        sqLiteDatabase.execSQL(SQL_CREATE_EPISODES_ONE_TABLE);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.EpisodeSeasonOneEntry.COLUMN_EPISODE_NAME, SherlockContract.EpisodeSeasonOneEntry.EPISODE_1);
        initialValues.put(SherlockContract.EpisodeSeasonOneEntry.COLUMN_RESOURCE_ID, R.drawable.s01_ep01);
        sqLiteDatabase.insert(SherlockContract.EpisodeSeasonOneEntry.TABLE_NAME,null,initialValues);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.EpisodeSeasonOneEntry.COLUMN_EPISODE_NAME, SherlockContract.EpisodeSeasonOneEntry.EPISODE_2);
        initialValues.put(SherlockContract.EpisodeSeasonOneEntry.COLUMN_RESOURCE_ID, R.drawable.s01_ep02);
        sqLiteDatabase.insert(SherlockContract.EpisodeSeasonOneEntry.TABLE_NAME,null,initialValues);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.EpisodeSeasonOneEntry.COLUMN_EPISODE_NAME, SherlockContract.EpisodeSeasonOneEntry.EPISODE_3);
        initialValues.put(SherlockContract.EpisodeSeasonOneEntry.COLUMN_RESOURCE_ID, R.drawable.s01_ep03);
        sqLiteDatabase.insert(SherlockContract.EpisodeSeasonOneEntry.TABLE_NAME,null,initialValues);

        /**
         * for season two episodes
         */

        String SQL_CREATE_EPISODES_TWO_TABLE = "CREATE TABLE " + SherlockContract.EpisodeSeasonTwoEntry.TABLE_NAME + "("
                + SherlockContract.EpisodeSeasonTwoEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + SherlockContract.EpisodeSeasonTwoEntry.COLUMN_EPISODE_NAME + " TEXT NOT NULL,"

                + SherlockContract.EpisodeSeasonTwoEntry.COLUMN_RESOURCE_ID + " INTEGER NOT NULL);";
        sqLiteDatabase.execSQL(SQL_CREATE_EPISODES_TWO_TABLE);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.EpisodeSeasonTwoEntry.COLUMN_EPISODE_NAME, SherlockContract.EpisodeSeasonTwoEntry.EPISODE_1);
        initialValues.put(SherlockContract.EpisodeSeasonTwoEntry.COLUMN_RESOURCE_ID, R.drawable.s02_ep01);
        sqLiteDatabase.insert(SherlockContract.EpisodeSeasonTwoEntry.TABLE_NAME,null,initialValues);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.EpisodeSeasonTwoEntry.COLUMN_EPISODE_NAME, SherlockContract.EpisodeSeasonTwoEntry.EPISODE_2);
        initialValues.put(SherlockContract.EpisodeSeasonTwoEntry.COLUMN_RESOURCE_ID, R.drawable.s02_ep02);
        sqLiteDatabase.insert(SherlockContract.EpisodeSeasonTwoEntry.TABLE_NAME,null,initialValues);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.EpisodeSeasonTwoEntry.COLUMN_EPISODE_NAME, SherlockContract.EpisodeSeasonTwoEntry.EPISODE_3);
        initialValues.put(SherlockContract.EpisodeSeasonTwoEntry.COLUMN_RESOURCE_ID, R.drawable.s02_ep03);
        sqLiteDatabase.insert(SherlockContract.EpisodeSeasonTwoEntry.TABLE_NAME,null,initialValues);

        /**
         * for season three episodes
         */

        String SQL_CREATE_EPISODES_THREE_TABLE = "CREATE TABLE " + SherlockContract.EpisodeSeasonThreeEntry.TABLE_NAME + "("
                + SherlockContract.EpisodeSeasonThreeEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + SherlockContract.EpisodeSeasonThreeEntry.COLUMN_EPISODE_NAME + " TEXT NOT NULL,"

                + SherlockContract.EpisodeSeasonThreeEntry.COLUMN_RESOURCE_ID + " INTEGER NOT NULL);";
        sqLiteDatabase.execSQL(SQL_CREATE_EPISODES_THREE_TABLE);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.EpisodeSeasonThreeEntry.COLUMN_EPISODE_NAME, SherlockContract.EpisodeSeasonThreeEntry.EPISODE_1);
        initialValues.put(SherlockContract.EpisodeSeasonThreeEntry.COLUMN_RESOURCE_ID, R.drawable.s03_ep01);
        sqLiteDatabase.insert(SherlockContract.EpisodeSeasonThreeEntry.TABLE_NAME,null,initialValues);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.EpisodeSeasonThreeEntry.COLUMN_EPISODE_NAME, SherlockContract.EpisodeSeasonThreeEntry.EPISODE_2);
        initialValues.put(SherlockContract.EpisodeSeasonThreeEntry.COLUMN_RESOURCE_ID, R.drawable.s03_ep02);
        sqLiteDatabase.insert(SherlockContract.EpisodeSeasonThreeEntry.TABLE_NAME,null,initialValues);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.EpisodeSeasonThreeEntry.COLUMN_EPISODE_NAME, SherlockContract.EpisodeSeasonThreeEntry.EPISODE_3);
        initialValues.put(SherlockContract.EpisodeSeasonThreeEntry.COLUMN_RESOURCE_ID, R.drawable.s03_ep03);
        sqLiteDatabase.insert(SherlockContract.EpisodeSeasonThreeEntry.TABLE_NAME,null,initialValues);

        /**
         * for season four
         */

        String SQL_CREATE_EPISODES_FOUR_TABLE = "CREATE TABLE " + SherlockContract.EpisodeSeasonFourEntry.TABLE_NAME + "("
                + SherlockContract.EpisodeSeasonFourEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + SherlockContract.EpisodeSeasonFourEntry.COLUMN_EPISODE_NAME + " TEXT NOT NULL,"

                + SherlockContract.EpisodeSeasonFourEntry.COLUMN_RESOURCE_ID + " INTEGER NOT NULL);";
        sqLiteDatabase.execSQL(SQL_CREATE_EPISODES_FOUR_TABLE);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.EpisodeSeasonFourEntry.COLUMN_EPISODE_NAME, SherlockContract.EpisodeSeasonFourEntry.EPISODE_1);
        initialValues.put(SherlockContract.EpisodeSeasonFourEntry.COLUMN_RESOURCE_ID, R.drawable.s04_ep01);
        sqLiteDatabase.insert(SherlockContract.EpisodeSeasonFourEntry.TABLE_NAME,null,initialValues);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.EpisodeSeasonFourEntry.COLUMN_EPISODE_NAME, SherlockContract.EpisodeSeasonFourEntry.EPISODE_2);
        initialValues.put(SherlockContract.EpisodeSeasonFourEntry.COLUMN_RESOURCE_ID, R.drawable.s04_ep02);
        sqLiteDatabase.insert(SherlockContract.EpisodeSeasonFourEntry.TABLE_NAME,null,initialValues);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.EpisodeSeasonOneEntry.COLUMN_EPISODE_NAME, SherlockContract.EpisodeSeasonFourEntry.EPISODE_3);
        initialValues.put(SherlockContract.EpisodeSeasonOneEntry.COLUMN_RESOURCE_ID, R.drawable.s04_ep03);
        sqLiteDatabase.insert(SherlockContract.EpisodeSeasonFourEntry.TABLE_NAME,null,initialValues);


        String SQL_CREATE_EPISODES_SPECIAL_TABLE = "CREATE TABLE " + SherlockContract.EpisodeSeasonSpecialEntry.TABLE_NAME + "("
                + SherlockContract.EpisodeSeasonSpecialEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + SherlockContract.EpisodeSeasonSpecialEntry.COLUMN_EPISODE_NAME + " TEXT NOT NULL,"

                + SherlockContract.EpisodeSeasonSpecialEntry.COLUMN_RESOURCE_ID + " INTEGER NOT NULL);";
        sqLiteDatabase.execSQL(SQL_CREATE_EPISODES_SPECIAL_TABLE);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.EpisodeSeasonSpecialEntry.COLUMN_EPISODE_NAME, SherlockContract.EpisodeSeasonSpecialEntry.EPISODE_1);
        initialValues.put(SherlockContract.EpisodeSeasonSpecialEntry.COLUMN_RESOURCE_ID, R.drawable.s05_ep01);
        sqLiteDatabase.insert(SherlockContract.EpisodeSeasonSpecialEntry.TABLE_NAME,null,initialValues);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.EpisodeSeasonSpecialEntry.COLUMN_EPISODE_NAME, SherlockContract.EpisodeSeasonSpecialEntry.EPISODE_2);
        initialValues.put(SherlockContract.EpisodeSeasonSpecialEntry.COLUMN_RESOURCE_ID, R.drawable.s05_ep02);
        sqLiteDatabase.insert(SherlockContract.EpisodeSeasonSpecialEntry.TABLE_NAME,null,initialValues);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.EpisodeSeasonSpecialEntry.COLUMN_EPISODE_NAME, SherlockContract.EpisodeSeasonSpecialEntry.EPISODE_3);
        initialValues.put(SherlockContract.EpisodeSeasonSpecialEntry.COLUMN_RESOURCE_ID, R.drawable.s05_ep03);
        sqLiteDatabase.insert(SherlockContract.EpisodeSeasonSpecialEntry.TABLE_NAME,null,initialValues);

        /**
         * creating tables for episode descriptions
         * episode one description
         */
        String SQL_CREATE_EPISODES_SEASON_ONE_TABLE = "CREATE TABLE " + SherlockContract.DescriptionEpisodesSeasonOne.TABLE_NAME + "("
                + SherlockContract.DescriptionEpisodesSeasonOne._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_EPISODE_NAME + " TEXT NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_DIRECTOR + " TEXT NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_WRITER + " TEXT NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_DATE + " TEXT NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_RUNNING_TIME + " INTEGER NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_SUMMARY + " TEXT NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_RESOURCE_ID + " INTEGER NOT NULL);";
        sqLiteDatabase.execSQL(SQL_CREATE_EPISODES_SEASON_ONE_TABLE);


        initialValues = new ContentValues();
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_EPISODE_NAME, SherlockContract.DescriptionEpisodesSeasonOne.EPISODE_1);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_RESOURCE_ID, R.drawable.s01_ep01);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_DIRECTOR, SherlockContract.DescriptionEpisodesSeasonOne.EPISODE_1_DIRECTOR);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_WRITER, SherlockContract.DescriptionEpisodesSeasonOne.EPISODE_1_WRITER);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_DATE, SherlockContract.DescriptionEpisodesSeasonOne.EPISODE_1_DATE);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_RUNNING_TIME, SherlockContract.DescriptionEpisodesSeasonOne.EPISODE_1_TIME);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_SUMMARY, SherlockContract.DescriptionEpisodesSeasonOne.EPISODE_1_SUMMARY);
        sqLiteDatabase.insert(SherlockContract.DescriptionEpisodesSeasonOne.TABLE_NAME,null,initialValues);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_EPISODE_NAME, SherlockContract.DescriptionEpisodesSeasonOne.EPISODE_2);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_RESOURCE_ID, R.drawable.s01_ep02);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_DIRECTOR, SherlockContract.DescriptionEpisodesSeasonOne.EPISODE_2_DIRECTOR);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_WRITER, SherlockContract.DescriptionEpisodesSeasonOne.EPISODE_2_WRITER);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_DATE, SherlockContract.DescriptionEpisodesSeasonOne.EPISODE_2_DATE);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_RUNNING_TIME, SherlockContract.DescriptionEpisodesSeasonOne.EPISODE_2_TIME);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_SUMMARY, SherlockContract.DescriptionEpisodesSeasonOne.EPISODE_2_SUMMARY);
        sqLiteDatabase.insert(SherlockContract.DescriptionEpisodesSeasonOne.TABLE_NAME,null,initialValues);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_EPISODE_NAME, SherlockContract.DescriptionEpisodesSeasonOne.EPISODE_3);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_RESOURCE_ID, R.drawable.s01_ep03);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_DIRECTOR, SherlockContract.DescriptionEpisodesSeasonOne.EPISODE_3_DIRECTOR);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_WRITER, SherlockContract.DescriptionEpisodesSeasonOne.EPISODE_3_WRITER);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_DATE, SherlockContract.DescriptionEpisodesSeasonOne.EPISODE_3_DATE);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_RUNNING_TIME, SherlockContract.DescriptionEpisodesSeasonOne.EPISODE_3_TIME);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonOne.COLUMN_SUMMARY, SherlockContract.DescriptionEpisodesSeasonOne.EPISODE_3_SUMMARY);
        sqLiteDatabase.insert(SherlockContract.DescriptionEpisodesSeasonOne.TABLE_NAME,null,initialValues);

        /**
         * creating tables for episode descriptions
         * episode one description
         */
        String SQL_CREATE_EPISODES_SEASON_TWO_TABLE = "CREATE TABLE " + SherlockContract.DescriptionEpisodesSeasonTwo.TABLE_NAME + "("
                + SherlockContract.DescriptionEpisodesSeasonTwo._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_EPISODE_NAME + " TEXT NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_DIRECTOR + " TEXT NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_WRITER + " TEXT NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_DATE + " TEXT NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_RUNNING_TIME + " INTEGER NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_SUMMARY + " TEXT NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_RESOURCE_ID + " INTEGER NOT NULL);";
        sqLiteDatabase.execSQL(SQL_CREATE_EPISODES_SEASON_TWO_TABLE);


        initialValues = new ContentValues();
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_EPISODE_NAME, SherlockContract.DescriptionEpisodesSeasonTwo.EPISODE_1);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_RESOURCE_ID, R.drawable.s02_ep01);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_DIRECTOR, SherlockContract.DescriptionEpisodesSeasonTwo.EPISODE_1_DIRECTOR);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_WRITER, SherlockContract.DescriptionEpisodesSeasonTwo.EPISODE_1_WRITER);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_DATE, SherlockContract.DescriptionEpisodesSeasonTwo.EPISODE_1_DATE);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_RUNNING_TIME, SherlockContract.DescriptionEpisodesSeasonTwo.EPISODE_1_TIME);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_SUMMARY, SherlockContract.DescriptionEpisodesSeasonTwo.EPISODE_1_SUMMARY);
        sqLiteDatabase.insert(SherlockContract.DescriptionEpisodesSeasonTwo.TABLE_NAME,null,initialValues);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_EPISODE_NAME, SherlockContract.DescriptionEpisodesSeasonTwo.EPISODE_2);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_RESOURCE_ID, R.drawable.s02_ep02);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_DIRECTOR, SherlockContract.DescriptionEpisodesSeasonTwo.EPISODE_2_DIRECTOR);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_WRITER, SherlockContract.DescriptionEpisodesSeasonTwo.EPISODE_2_WRITER);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_DATE, SherlockContract.DescriptionEpisodesSeasonTwo.EPISODE_2_DATE);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_RUNNING_TIME, SherlockContract.DescriptionEpisodesSeasonTwo.EPISODE_2_TIME);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_SUMMARY, SherlockContract.DescriptionEpisodesSeasonTwo.EPISODE_2_SUMMARY);
        sqLiteDatabase.insert(SherlockContract.DescriptionEpisodesSeasonTwo.TABLE_NAME,null,initialValues);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_EPISODE_NAME, SherlockContract.DescriptionEpisodesSeasonTwo.EPISODE_3);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_RESOURCE_ID, R.drawable.s02_ep03);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_DIRECTOR, SherlockContract.DescriptionEpisodesSeasonTwo.EPISODE_3_DIRECTOR);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_WRITER, SherlockContract.DescriptionEpisodesSeasonTwo.EPISODE_3_WRITER);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_DATE, SherlockContract.DescriptionEpisodesSeasonTwo.EPISODE_3_DATE);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_RUNNING_TIME, SherlockContract.DescriptionEpisodesSeasonTwo.EPISODE_3_TIME);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonTwo.COLUMN_SUMMARY, SherlockContract.DescriptionEpisodesSeasonTwo.EPISODE_3_SUMMARY);
        sqLiteDatabase.insert(SherlockContract.DescriptionEpisodesSeasonTwo.TABLE_NAME,null,initialValues);


        String SQL_CREATE_EPISODES_SEASON_THREE_TABLE = "CREATE TABLE " + SherlockContract.DescriptionEpisodesSeasonThree.TABLE_NAME + "("
                + SherlockContract.DescriptionEpisodesSeasonThree._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_EPISODE_NAME + " TEXT NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_DIRECTOR + " TEXT NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_WRITER + " TEXT NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_DATE + " TEXT NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_RUNNING_TIME + " INTEGER NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_SUMMARY + " TEXT NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_RESOURCE_ID + " INTEGER NOT NULL);";
        sqLiteDatabase.execSQL(SQL_CREATE_EPISODES_SEASON_THREE_TABLE);


        initialValues = new ContentValues();
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_EPISODE_NAME, SherlockContract.DescriptionEpisodesSeasonThree.EPISODE_1);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_RESOURCE_ID, R.drawable.s03_ep01);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_DIRECTOR, SherlockContract.DescriptionEpisodesSeasonThree.EPISODE_1_DIRECTOR);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_WRITER, SherlockContract.DescriptionEpisodesSeasonThree.EPISODE_1_WRITER);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_DATE, SherlockContract.DescriptionEpisodesSeasonThree.EPISODE_1_DATE);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_RUNNING_TIME, SherlockContract.DescriptionEpisodesSeasonThree.EPISODE_1_TIME);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_SUMMARY, SherlockContract.DescriptionEpisodesSeasonThree.EPISODE_1_SUMMARY);
        sqLiteDatabase.insert(SherlockContract.DescriptionEpisodesSeasonThree.TABLE_NAME,null,initialValues);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_EPISODE_NAME, SherlockContract.DescriptionEpisodesSeasonThree.EPISODE_2);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_RESOURCE_ID, R.drawable.s03_ep02);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_DIRECTOR, SherlockContract.DescriptionEpisodesSeasonThree.EPISODE_2_DIRECTOR);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_WRITER, SherlockContract.DescriptionEpisodesSeasonThree.EPISODE_2_WRITER);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_DATE, SherlockContract.DescriptionEpisodesSeasonThree.EPISODE_2_DATE);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_RUNNING_TIME, SherlockContract.DescriptionEpisodesSeasonThree.EPISODE_2_TIME);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_SUMMARY, SherlockContract.DescriptionEpisodesSeasonThree.EPISODE_2_SUMMARY);
        sqLiteDatabase.insert(SherlockContract.DescriptionEpisodesSeasonThree.TABLE_NAME,null,initialValues);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_EPISODE_NAME, SherlockContract.DescriptionEpisodesSeasonThree.EPISODE_3);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_RESOURCE_ID, R.drawable.s03_ep02);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_DIRECTOR, SherlockContract.DescriptionEpisodesSeasonThree.EPISODE_3_DIRECTOR);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_WRITER, SherlockContract.DescriptionEpisodesSeasonThree.EPISODE_3_WRITER);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_DATE, SherlockContract.DescriptionEpisodesSeasonThree.EPISODE_3_DATE);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_RUNNING_TIME, SherlockContract.DescriptionEpisodesSeasonThree.EPISODE_3_TIME);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonThree.COLUMN_SUMMARY, SherlockContract.DescriptionEpisodesSeasonThree.EPISODE_3_SUMMARY);
        sqLiteDatabase.insert(SherlockContract.DescriptionEpisodesSeasonThree.TABLE_NAME,null,initialValues);


        /**
         * creating tables for episode descriptions
         * episode one description
         */
        String SQL_CREATE_EPISODES_SEASON_FOUR_TABLE = "CREATE TABLE " + SherlockContract.DescriptionEpisodesSeasonFour.TABLE_NAME + "("
                + SherlockContract.DescriptionEpisodesSeasonFour._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_EPISODE_NAME + " TEXT NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_DIRECTOR + " TEXT NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_WRITER + " TEXT NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_DATE + " TEXT NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_RUNNING_TIME + " INTEGER NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_SUMMARY + " TEXT NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_RESOURCE_ID + " INTEGER NOT NULL);";
        sqLiteDatabase.execSQL(SQL_CREATE_EPISODES_SEASON_FOUR_TABLE);


        initialValues = new ContentValues();
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_EPISODE_NAME, SherlockContract.DescriptionEpisodesSeasonFour.EPISODE_1);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_RESOURCE_ID, R.drawable.s04_ep01);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_DIRECTOR, SherlockContract.DescriptionEpisodesSeasonFour.EPISODE_1_DIRECTOR);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_WRITER, SherlockContract.DescriptionEpisodesSeasonFour.EPISODE_1_WRITER);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_DATE, SherlockContract.DescriptionEpisodesSeasonFour.EPISODE_1_DATE);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_RUNNING_TIME, SherlockContract.DescriptionEpisodesSeasonFour.EPISODE_1_TIME);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_SUMMARY, SherlockContract.DescriptionEpisodesSeasonFour.EPISODE_1_SUMMARY);
        sqLiteDatabase.insert(SherlockContract.DescriptionEpisodesSeasonFour.TABLE_NAME,null,initialValues);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_EPISODE_NAME, SherlockContract.DescriptionEpisodesSeasonFour.EPISODE_2);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_RESOURCE_ID, R.drawable.s04_ep02);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_DIRECTOR, SherlockContract.DescriptionEpisodesSeasonFour.EPISODE_2_DIRECTOR);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_WRITER, SherlockContract.DescriptionEpisodesSeasonFour.EPISODE_2_WRITER);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_DATE, SherlockContract.DescriptionEpisodesSeasonFour.EPISODE_2_DATE);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_RUNNING_TIME, SherlockContract.DescriptionEpisodesSeasonFour.EPISODE_2_TIME);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_SUMMARY, SherlockContract.DescriptionEpisodesSeasonFour.EPISODE_2_SUMMARY);
        sqLiteDatabase.insert(SherlockContract.DescriptionEpisodesSeasonFour.TABLE_NAME,null,initialValues);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_EPISODE_NAME, SherlockContract.DescriptionEpisodesSeasonFour.EPISODE_3);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_RESOURCE_ID, R.drawable.s04_ep03);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_DIRECTOR, SherlockContract.DescriptionEpisodesSeasonFour.EPISODE_3_DIRECTOR);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_WRITER, SherlockContract.DescriptionEpisodesSeasonFour.EPISODE_3_WRITER);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_DATE, SherlockContract.DescriptionEpisodesSeasonFour.EPISODE_3_DATE);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_RUNNING_TIME, SherlockContract.DescriptionEpisodesSeasonFour.EPISODE_3_TIME);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonFour.COLUMN_SUMMARY, SherlockContract.DescriptionEpisodesSeasonFour.EPISODE_3_SUMMARY);
        sqLiteDatabase.insert(SherlockContract.DescriptionEpisodesSeasonFour.TABLE_NAME,null,initialValues);



        /**
         *
         *
         *
         *
         *
         *
         *
         *
         */
        String SQL_CREATE_EPISODES_SEASON_SPECIAL_TABLE = "CREATE TABLE " + SherlockContract.DescriptionEpisodesSeasonSpecial.TABLE_NAME + "("
                + SherlockContract.DescriptionEpisodesSeasonSpecial._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_EPISODE_NAME + " TEXT NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_DIRECTOR + " TEXT NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_WRITER + " TEXT NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_DATE + " TEXT NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_RUNNING_TIME + " INTEGER NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_SUMMARY + " TEXT NOT NULL,"
                + SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_RESOURCE_ID + " INTEGER NOT NULL);";
        sqLiteDatabase.execSQL(SQL_CREATE_EPISODES_SEASON_SPECIAL_TABLE);


        initialValues = new ContentValues();
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_EPISODE_NAME, SherlockContract.DescriptionEpisodesSeasonSpecial.EPISODE_1);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_RESOURCE_ID, R.drawable.s05_ep01);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_DIRECTOR, SherlockContract.DescriptionEpisodesSeasonSpecial.EPISODE_1_DIRECTOR);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_WRITER, SherlockContract.DescriptionEpisodesSeasonSpecial.EPISODE_1_WRITER);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_DATE, SherlockContract.DescriptionEpisodesSeasonSpecial.EPISODE_1_DATE);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_RUNNING_TIME, SherlockContract.DescriptionEpisodesSeasonSpecial.EPISODE_1_TIME);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_SUMMARY, SherlockContract.DescriptionEpisodesSeasonSpecial.EPISODE_1_SUMMARY);
        sqLiteDatabase.insert(SherlockContract.DescriptionEpisodesSeasonSpecial.TABLE_NAME,null,initialValues);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_EPISODE_NAME, SherlockContract.DescriptionEpisodesSeasonSpecial.EPISODE_2);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_RESOURCE_ID, R.drawable.s05_ep02);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_DIRECTOR, SherlockContract.DescriptionEpisodesSeasonSpecial.EPISODE_2_DIRECTOR);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_WRITER, SherlockContract.DescriptionEpisodesSeasonSpecial.EPISODE_2_WRITER);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_DATE, SherlockContract.DescriptionEpisodesSeasonSpecial.EPISODE_2_DATE);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_RUNNING_TIME, SherlockContract.DescriptionEpisodesSeasonSpecial.EPISODE_2_TIME);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_SUMMARY, SherlockContract.DescriptionEpisodesSeasonSpecial.EPISODE_2_SUMMARY);
        sqLiteDatabase.insert(SherlockContract.DescriptionEpisodesSeasonSpecial.TABLE_NAME,null,initialValues);

        initialValues = new ContentValues();
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_EPISODE_NAME, SherlockContract.DescriptionEpisodesSeasonSpecial.EPISODE_3);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_RESOURCE_ID, R.drawable.s05_ep03);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_DIRECTOR, SherlockContract.DescriptionEpisodesSeasonSpecial.EPISODE_3_DIRECTOR);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_WRITER, SherlockContract.DescriptionEpisodesSeasonSpecial.EPISODE_3_WRITER);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_DATE, SherlockContract.DescriptionEpisodesSeasonSpecial.EPISODE_3_DATE);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_RUNNING_TIME, SherlockContract.DescriptionEpisodesSeasonSpecial.EPISODE_3_TIME);
        initialValues.put(SherlockContract.DescriptionEpisodesSeasonSpecial.COLUMN_SUMMARY, SherlockContract.DescriptionEpisodesSeasonSpecial.EPISODE_3_SUMMARY);
        sqLiteDatabase.insert(SherlockContract.DescriptionEpisodesSeasonSpecial.TABLE_NAME,null,initialValues);







    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


}
