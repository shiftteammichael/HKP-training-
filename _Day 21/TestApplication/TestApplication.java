package com.example.testapplication;

import android.app.Application;

import com.backendless.Backendless;

public class TestApplication extends Application {
    public static final String APPLICATION_ID = "1935A6DE-DD3E-2F2F-FFAF-C8CA2142E800";
    public static final String API_KEY = "CFDD7561-2869-4DF5-A5AD-7DCA0FB93A25";
    public static final String SERVER_URL = "https://api.backendless.com";
    @Override
    public void onCreate() {
        super.onCreate();
        Backendless.setUrl( SERVER_URL );
        Backendless.initApp( getApplicationContext(),
                APPLICATION_ID,
                API_KEY );

    }
}
