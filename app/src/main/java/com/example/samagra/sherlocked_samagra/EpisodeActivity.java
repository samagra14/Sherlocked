package com.example.samagra.sherlocked_samagra;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;



import static android.view.View.Z;

/**
 * Created by samagra on 07-01-2017.
 */

public class EpisodeActivity extends AppCompatActivity {

    //variable for season name




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_episode);
        Intent intent = getIntent();
        int mSeason = intent.getIntExtra("Season",0);

        //find the viewpager present to display our pages
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        //create the instance of the custom adapter created by us
        EpisodeAdapter adapter = new EpisodeAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(mSeason);
        //animation

        viewPager.setPageTransformer(true,new ZoomOutPageTransformer());

        //set up the tabLayout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);
        //set up tablayout with the viewpager
        tabLayout.setupWithViewPager(viewPager);



    }
}
