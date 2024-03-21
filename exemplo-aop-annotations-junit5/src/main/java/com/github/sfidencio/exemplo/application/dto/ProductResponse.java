package com.github.sfidencio.exemplo.application.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductResponse {
    private Long id;
    private String description;
    private BigDecimal price;
    private BigDecimal stock;
}
