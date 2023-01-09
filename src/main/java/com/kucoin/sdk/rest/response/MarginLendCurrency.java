package com.kucoin.sdk.rest.response;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program kucoin-java-sdk
 * @description:
 * @author: corki.tan
 * @create: 2022/12/24 21:04
 */
@Data
public class MarginLendCurrency {
    private String currency;
    private BigDecimal lendMinSize;
    private BigDecimal lendMaxSize;
    private BigDecimal increment;
    private BigDecimal minDailyIntRate;
    private BigDecimal maxDailyIntRate;
    private BigDecimal precisionDailyIntRate;
    private String terms;
}
