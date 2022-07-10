package com.example.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestConfig {

    private String name;

    public TestConfig(@Value("${say.hi}") final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
