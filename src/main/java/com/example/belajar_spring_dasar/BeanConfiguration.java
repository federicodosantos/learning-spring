package com.example.belajar_spring_dasar;

import com.example.belajar_spring_dasar.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Slf4j
@Configuration
public class BeanConfiguration {

    private static final Logger log = LoggerFactory.getLogger(BeanConfiguration.class);

    @Primary
    @Bean
    public Foo foo1() {
        var foo = new Foo();
        log.info("Membuat foo1");

        return foo;
    }

    @Bean
    public Foo foo2() {
        var foo = new Foo();
        log.info("Membuat foo2");

        return foo;
    }
}
