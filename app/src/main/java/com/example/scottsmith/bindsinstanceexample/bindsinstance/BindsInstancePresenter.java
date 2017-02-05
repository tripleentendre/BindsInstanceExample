package com.example.scottsmith.bindsinstanceexample.bindsinstance;

import javax.inject.Inject;

public class BindsInstancePresenter {

    private BindsInstanceView view;

    @Inject
    public BindsInstancePresenter(BindsInstanceView view) {
        this.view = view;
    }
}