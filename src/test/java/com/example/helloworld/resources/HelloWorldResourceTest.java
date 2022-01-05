package com.example.helloworld.resources;

import com.example.helloworld.api.Saying;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldResourceTest {

    @Test
    void sayHello_when_no_name_is_given() {
        HelloWorldResource resource = new HelloWorldResource(
                "Hello, %s", "Jinx"
        );

        Saying saying = resource.sayHello(Optional.empty());

        assertEquals("Hello, Jinx", saying.getContent());
    }

    @Test
    void sayHello_when_a_name_is_given() {
        HelloWorldResource resource = new HelloWorldResource(
                "Hello, %s", "Jinx"
        );

        Saying saying = resource.sayHello(Optional.of("Vi"));

        assertEquals("Hello, Vi", saying.getContent());
    }
}