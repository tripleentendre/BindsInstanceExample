package com.example.scottsmith.bindsinstanceexample;

import com.example.scottsmith.bindsinstanceexample.bindsinstance.BindsInstanceComponent;
import com.example.scottsmith.bindsinstanceexample.typical.TypicalComponent;
import com.example.scottsmith.bindsinstanceexample.typical.TypicalModule;

import dagger.Component;

@Component
public interface ApplicationComponent {
    TypicalComponent plus(TypicalModule typicalModule);
    BindsInstanceComponent.Builder bindsInstanceBuilder();
}