package com.example.samagra.sherlocked_samagra;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import data.SherlockContract;


/**
 * Created by samagra on 06-01-2017.
 */

public class EpisodeAdapter extends FragmentPagerAdapter {

    /**
     * this class needs to be implemented in order to show the fragments
     * @param fm
     */

    public EpisodeAdapter(FragmentManager fm){
        super(fm);
    }

    /**
     * this method decides which fragment is to be displyed in the pageviewer
     * @param position
     * @return
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            SeasonFragment fragment = new SeasonFragment();
            fragment.setmSeasonName(1);
            return  fragment;
        } else if (position == 1){
            SeasonFragment fragment = new SeasonFragment();
            fragment.setmSeasonName(2);
            return  fragment;
        }else if (position == 2) {
            SeasonFragment fragment = new SeasonFragment();
            fragment.setmSeasonName(3);
            return  fragment;}
        else if (position == 3) {
            SeasonFragment fragment = new SeasonFragment();
            fragment.setmSeasonName(4);
            return  fragment;}
        else {
            SeasonFragment fragment = new SeasonFragment();
            fragment.setmSeasonName(5);
            return  fragment;
        }

    }


    //this method needs to be implemented in order to declare how many different fragments need to be
    //shown on the screen
    @Override
    public int getCount() {
        return 5;
    }


    /**
     * this fragment sets the title of the page when fragments are being displayeds
     * @param position
     * @return
     */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Season 1";
        } else if (position == 1) {
            return "Season 2";
        } else if (position==2)  {
            return "Season 3";
        }
        else if (position==3)  {
            return "Season 4";
        }
        else  {
            return "Specials";
        }
    }
}
