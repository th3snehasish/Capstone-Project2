package com.th3snehasish.tripit.Utils;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentStatePagerAdapter;

import com.th3snehasish.tripit.TouristFragments.Museum;
import com.th3snehasish.tripit.TouristFragments.NightClub;
import com.th3snehasish.tripit.TouristFragments.Temple;

public class ViewPagerAdapterTourist extends FragmentStatePagerAdapter {

    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created

    public ViewPagerAdapterTourist(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Temple temple = new Temple();
                return temple;
            case 1:
                Museum museum = new Museum();
                return museum;
            case 2:
                NightClub nightClub = new NightClub();
                return nightClub;

            default:
                return null;
        }

    }

    // This method return the titles for the Tabs in the Tab Strip
    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    // This method return the Number of tabs for the tabs Strip
    @Override
    public int getCount() {
        return NumbOfTabs;
    }
}