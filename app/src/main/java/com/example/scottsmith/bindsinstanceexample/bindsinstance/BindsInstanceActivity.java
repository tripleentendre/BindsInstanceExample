package com.example.scottsmith.bindsinstanceexample.bindsinstance;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.scottsmith.bindsinstanceexample.ExampleApplication;
import com.example.scottsmith.bindsinstanceexample.R;

import javax.inject.Inject;

public class BindsInstanceActivity extends AppCompatActivity implements BindsInstanceView {

    @Inject
    BindsInstancePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binds_instance);

        ExampleApplication.get(this).bindsInstanceBuilder().with(this).build().injectMembers(this);
    }
}