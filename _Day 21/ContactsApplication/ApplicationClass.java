package com.example.contactsapplicationbackend;

import android.app.Application;

import com.backendless.Backendless;

public class ApplicationClass extends Application {
    public static final String APPLICATION_ID = "6E5113DF-6449-FD02-FF91-345DE3D34900";
    public static final String API_KEY = "87B9B73B-5C8D-42B7-A545-1D200A7A5628";
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
