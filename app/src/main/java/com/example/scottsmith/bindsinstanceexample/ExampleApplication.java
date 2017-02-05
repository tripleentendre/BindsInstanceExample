package com.example.scottsmith.bindsinstanceexample;

import android.app.Application;
import android.content.Context;

public class ExampleApplication extends Application {
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.create();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    public static ApplicationComponent get(Context context) {
        return ((ExampleApplication) context.getApplicationContext()).getApplicationComponent();
    }
}