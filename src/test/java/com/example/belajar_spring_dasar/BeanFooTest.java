package com.example.belajar_spring_dasar;

import com.example.belajar_spring_dasar.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanFooTest {

    private ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
    }

    @Test
    void testCreateBean() {
        Assertions.assertNotNull(context);
    }

    @Test
    void testGetBean() {

        var foo1 = context.getBean(Foo.class);
        var foo2 = context.getBean(Foo.class);

        Assertions.assertSame(foo1, foo2);
    }

//    @Test
//    void testErrorDuplicateBean() {
//        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
//            Foo foo = context.getBean(Foo.class);
//        });
//    }

    @Test
    void testCreateDuplicateBean() {

        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);

        Assertions.assertNotSame(foo1, foo2);
    }

    @Test
    void testPrimaryBean() {
        Foo foo = context.getBean(Foo.class);
        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);

        Assertions.assertSame(foo, foo1);
        Assertions.assertNotSame(foo, foo2);
        Assertions.assertNotSame(foo1, foo2);
    }
}
