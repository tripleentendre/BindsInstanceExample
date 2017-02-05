# `@BindsInstance` Example
An example of using the new `@BindsInstance` annotation included in the 2.9 release.

I've had the opportunity to work with Dagger pretty intensively lately, and it's been awesome. Two of my main complaints have been a lack of good examples of how to best use the library and the amount of boilerplate that seems to be required for certain use cases. This is an attempt to submit some ideas and distribute knowledge to help solve thesse issues.

When using an MVP architecture I've found myself repeating the following pattern:

* Create an Activity/Fragment
* Create a Presenter
* Create a Module so that I can take the View(Activity/Fragement) and make it available to the Dagger object graph
* Create a Component to wire everything together and handle injecting the presenter into the Activity/Fragment

Using the new `@BindsInstance` annotation included in the 2.9 realease, we can eliminate the need for the Module creation step by using a Builder in the component like:

```
@Subcomponent
public interface BindsInstanceComponent extends MembersInjector<BindsInstanceActivity> {

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance Builder with(BindsInstanceView view);
        BindsInstanceComponent build();
    }
}
```

We make that builder available in the parent component which allows us to use it in our Activity/Fragment like:

```
ExampleApplication.get(this).bindsInstanceBuilder().with(this).build().injectMembers(this);
```

I've included examples of both my previous approach and the technique outline above so please take a look!