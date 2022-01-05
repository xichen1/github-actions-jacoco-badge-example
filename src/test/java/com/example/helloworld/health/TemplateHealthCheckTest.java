package com.example.helloworld.health;

import com.codahale.metrics.health.HealthCheck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemplateHealthCheckTest {

    @Test
    void check() throws Exception {
        TemplateHealthCheck template = new TemplateHealthCheck("template %s");

        HealthCheck.Result result = template.check();

        assertTrue(result.isHealthy());
    }

    @Test
    void check_when_template_is_wrong() throws Exception {
        TemplateHealthCheck template = new TemplateHealthCheck("template");

        HealthCheck.Result result = template.check();

        assertFalse(result.isHealthy());
    }
}