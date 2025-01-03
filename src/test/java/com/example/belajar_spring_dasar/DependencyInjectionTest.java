package com.example.belajar_spring_dasar;

import com.example.belajar_spring_dasar.data.Bar;
import com.example.belajar_spring_dasar.data.Foo;
import com.example.belajar_spring_dasar.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionTest {

    @Test
    void testDI() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);

        Foo foo = context.getBean(Foo.class);
        Bar bar = context.getBean(Bar.class);
        FooBar fooBar = context.getBean(FooBar.class);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }
}
