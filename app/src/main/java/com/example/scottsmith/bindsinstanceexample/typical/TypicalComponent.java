package com.example.scottsmith.bindsinstanceexample.typical;

import dagger.MembersInjector;
import dagger.Subcomponent;

@Subcomponent(modules = TypicalModule.class)
public interface TypicalComponent extends MembersInjector<TypicalActivity> {

}