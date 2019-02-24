package adapter;

/**
 * Created by kotak on 19/08/2018.
 */

import android.content.Context;
import android.dhruvil.com.viewpagernavigation.Fragment0;
import android.dhruvil.com.viewpagernavigation.Fragment1;
import android.dhruvil.com.viewpagernavigation.Fragment2;
import android.dhruvil.com.viewpagernavigation.Fragment3;
import android.dhruvil.com.viewpagernavigation.Fragment4;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    Context context;

    public ViewPagerAdapter(FragmentManager fm, int NumOfTabs, Context context) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
        this.context=context;
    }

    @Override
    public Fragment getItem(int position) {

        Log.d("positionhomiee:",position+"");


        switch (position) {
            case 0:
                Log.d("Fragment:","homiee");
                return new Fragment0();

            case 1:
                return new Fragment1();
            case 2:
                return new Fragment2();
            case 3:
                return new Fragment3();
            case 4:
                return new Fragment4();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}