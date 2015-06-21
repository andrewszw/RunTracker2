package com.bignerdranch.android.runtracker;

import android.support.v4.app.Fragment;

/**
 * Created by andrewszw on 6/21/15.
 */
public class RunMapActivity extends SingleFragmentActivity {

    public static final String EXTRA_RUN_ID =
            "com.bignerdranch.android.runtracker.run_id";

    @Override
    protected Fragment createFragment() {
        long runId = getIntent().getLongExtra(EXTRA_RUN_ID, -1);
        if(runId != -1) {
            return RunMapFragment.newInstance(runId);
        } else {
            return new RunMapFragment();
        }
    }
}
