package com.journeytech.mark.mark.getaccuratelocation.location;

import android.location.Location;

public interface LocationManagerInterface {
    void locationFetched(Location mLocation, Location oldLocation, String time, String locationProvider);
}
