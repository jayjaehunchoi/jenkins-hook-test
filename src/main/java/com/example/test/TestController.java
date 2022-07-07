package com.example.test;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestConfig testConfig;

    @GetMapping("/api/get")
    public String get() {
        return "say Hi" + testConfig.getName();
    }
}
