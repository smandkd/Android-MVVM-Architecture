package org.techtowm.bindsinstance;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void testBindsInstance() {
        String hello = "Hello World";

        Foo foo = new Foo();
        BindsComponent component = DaggerBindsComponent.builder()
                .setString(hello)
                .build();
        component.inject(foo);
        assertEquals("Hello World", foo.str);
    }
}