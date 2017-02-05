package com.example.scottsmith.bindsinstanceexample.typical;

import dagger.Module;
import dagger.Provides;

@Module
public class TypicalModule {

    TypicalView view;

    public TypicalModule(TypicalView view) {
        this.view = view;
    }

    @Provides
    public TypicalView providesTypicalView() {
        return this.view;
    }
}