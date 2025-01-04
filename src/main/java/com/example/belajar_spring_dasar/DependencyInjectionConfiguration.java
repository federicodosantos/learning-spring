package com.example.belajar_spring_dasar;

import com.example.belajar_spring_dasar.data.Bar;
import com.example.belajar_spring_dasar.data.Foo;
import com.example.belajar_spring_dasar.data.FooBar;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Slf4j
@Configuration
public class DependencyInjectionConfiguration {

    @Lazy
    @Bean
    @DependsOn({"bar"})
    public Foo foo() {
        log.info("membuat foo");
        return new Foo();
    }

    @Bean
    public Bar bar() {
        log.info("membuat bar");
        return new Bar();
    }

    @Bean
    public FooBar fooBar(Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }
}
