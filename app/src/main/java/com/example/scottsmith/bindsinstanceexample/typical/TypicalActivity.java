package com.example.scottsmith.bindsinstanceexample.typical;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.scottsmith.bindsinstanceexample.ExampleApplication;

import javax.inject.Inject;

public class TypicalActivity extends AppCompatActivity implements TypicalView {

    @Inject
    TypicalPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ExampleApplication.get(this).plus(new TypicalModule(this)).injectMembers(this);
    }
}