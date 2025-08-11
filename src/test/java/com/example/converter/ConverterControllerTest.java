package com.example.converter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class ConverterControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testConversion() {
        Map body = this.restTemplate.getForObject("/convert?amount=100&rate=4.2", Map.class);
        assertThat(body.get("convertedAmount")).isEqualTo(420.00);
    }
}
