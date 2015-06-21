package com.bignerdranch.android.runtracker;

import android.support.v4.app.Fragment;

/**
 * Created by andrewszw on 6/20/15.
 */
public class RunListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new RunListFragment();
    }
}
