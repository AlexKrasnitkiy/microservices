package com.demo.limits.service.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("limits-service")
@Component
public class Configuration {
    private Integer miniumum;
    private Integer maximum;

    public Integer getMiniumum() {
        return miniumum;
    }

    public void setMiniumum(Integer miniumum) {
        this.miniumum = miniumum;
    }

    public Integer getMaximum() {
        return maximum;
    }

    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }
}
