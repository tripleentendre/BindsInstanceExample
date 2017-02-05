package com.example.scottsmith.bindsinstanceexample.typical;

import javax.inject.Inject;

public class TypicalPresenter {

    private TypicalView view;

    @Inject
    public TypicalPresenter(TypicalView view) { this.view = view; }
}