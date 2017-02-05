package com.example.scottsmith.bindsinstanceexample.bindsinstance;

import dagger.BindsInstance;
import dagger.MembersInjector;
import dagger.Subcomponent;

@Subcomponent
public interface BindsInstanceComponent extends MembersInjector<BindsInstanceActivity> {

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance Builder with(BindsInstanceView view);
        BindsInstanceComponent build();
    }
}