package com.example.samagra.sherlocked_samagra;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import static com.example.samagra.sherlocked_samagra.R.id.viewPager;

/**
 * Created by samagra on 07-01-2017.
 */

public class IndividualEpisodeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_episode);
        //TODO : set proper intent
       Intent intent = getIntent();
       // int mSeason = intent.getIntExtra("Season",0);
         int episodeNumber = intent.getIntExtra("Episode",0);
        int seasonNumber = intent.getIntExtra("Season",1);

        //find the viewpager present to display our pages
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        //create the instance of the custom adapter created by us
        //TODO : create and set proper adapter
        EpisodeDescriptionAdapter adapter = new EpisodeDescriptionAdapter(getSupportFragmentManager());
        adapter.setmSeason(seasonNumber);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(episodeNumber);
        viewPager.setPageTransformer(true, new DepthPageTransformer());




        //set up the tabLayout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);
        //set up tablayout with the viewpager
        tabLayout.setupWithViewPager(viewPager);



    }
}
