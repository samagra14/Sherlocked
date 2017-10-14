package com.example.samagra.sherlocked_samagra;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by samagra on 08-01-2017.
 */

public class EpisodeDescriptionAdapter extends FragmentPagerAdapter {
    /**
     * this class needs to be implemented in order to show the fragments
     *
     * @param fm
     */

    public EpisodeDescriptionAdapter(FragmentManager fm) {
        super(fm);
    }
    private int mSeason;
    public void setmSeason(int season){
        mSeason=season;
    }

    /**
     * this method decides which fragment is to be displyed in the pageviewer
     *
     * @param position
     * @return
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {

            EpisodeDescriptionFragment fragment= new EpisodeDescriptionFragment();
            fragment.setmEpisode(1);
            fragment.setmSeason(mSeason);
            return fragment;
        } else if (position == 1) {

            EpisodeDescriptionFragment fragment= new EpisodeDescriptionFragment();
            fragment.setmEpisode(2);
            fragment.setmSeason(mSeason);
            return fragment;
        } else {

            EpisodeDescriptionFragment fragment= new EpisodeDescriptionFragment();
            fragment.setmEpisode(3);
            fragment.setmSeason(mSeason);
            return fragment;
        }

    }


    //this method needs to be implemented in order to declare how many different fragments need to be
    //shown on the screen
    @Override
    public int getCount() {
        return 3;
    }


    /**
     * this fragment sets the title of the page when fragments are being displayeds
     *
     * @param position
     * @return
     */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Episode 1";
        } else if (position == 1) {
            return "Episode 2";
        } else {
            return "Episode 3";
        }
    }
}
