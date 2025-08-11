package com.example.converter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

@RestController
public class ConverterController {

    @GetMapping("/convert")
    public Map<String, Object> convert(@RequestParam BigDecimal amount, @RequestParam BigDecimal rate) {
        BigDecimal converted = amount.multiply(rate).setScale(2, RoundingMode.HALF_UP);
        return Map.of(
                "originalAmount", amount,
                "rate", rate,
                "convertedAmount", converted
        );
    }
}
