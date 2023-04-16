package org.techtowm.bindsinstance;

import dagger.BindsInstance;
import dagger.Component;

@Component
public interface BindsComponent {
    void inject(Foo foo);

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder setString(String str);
        BindsComponent build();
    }
}
