package com.bignerdranch.android.runtracker;

import android.content.Context;
import android.location.Location;

/**
 * Created by andrewszw on 6/18/15.
 */
public class TrackingLocationReceiver extends LocationReceiver {

    @Override
    protected void onLocationReceived(Context context, Location loc) {
        RunManager.get(context).insertLocation(loc);
    }
}
