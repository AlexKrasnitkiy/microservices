package com.demo.limits.service.controller;

import com.demo.limits.service.bean.Limits;
import com.demo.limits.service.configuration.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/limits")
public class LimitsController {

    private final Configuration configuration;

    public LimitsController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping
    public Limits retriveLimits() {
        return new Limits(configuration.getMiniumum(), configuration.getMaximum());
    }
}
