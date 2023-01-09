package com.kucoin.sdk.rest.response;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program kucoin-java-sdk
 * @description:
 * @author: corki.tan
 * @create: 2022/12/24 20:45
 */
@Data
public class MarginSymbol {
    private String symbol;

    private String name;

    private Boolean enableTrading;

    private String market;

    private String baseCurrency;

    private String quoteCurrency;

    private BigDecimal baseIncrement;

    private BigDecimal baseMinSize;

    private BigDecimal quoteIncrement;

    private BigDecimal quoteMinSize;

    private BigDecimal baseMaxSize;

    private BigDecimal quoteMaxSize;

    private BigDecimal priceIncrement;

    private String feeCurrency;

    private BigDecimal priceLimitRate;

    private BigDecimal minFunds;
}
