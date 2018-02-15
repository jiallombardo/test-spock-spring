package com.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Lazy
public class TestLazyBean {

    @PostConstruct
    private void init() {
        System.out.println("I AM INITIALIZED");
    }
}
