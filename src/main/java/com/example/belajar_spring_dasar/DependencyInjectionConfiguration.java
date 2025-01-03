package com.example.belajar_spring_dasar;

import com.example.belajar_spring_dasar.data.Bar;
import com.example.belajar_spring_dasar.data.Foo;
import com.example.belajar_spring_dasar.data.FooBar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyInjectionConfiguration {

    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    @Bean
    public FooBar fooBar(Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }
}
