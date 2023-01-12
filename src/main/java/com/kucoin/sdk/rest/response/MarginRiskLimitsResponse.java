package com.kucoin.sdk.rest.response;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @description:
 * @author: corki.tan
 * @create: 2022/12/07 16:11
 */
@Data
public class MarginRiskLimitsResponse extends RiskLimitsResponse{
    private String currency;

    private BigDecimal borrowMaxAmount;

    private BigDecimal buyMaxAmount;

    private BigDecimal holdMaxAmount;

    private int precision;
}
