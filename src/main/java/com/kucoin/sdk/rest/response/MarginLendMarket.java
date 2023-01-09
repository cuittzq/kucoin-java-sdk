package com.kucoin.sdk.rest.response;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program kucoin-java-sdk
 * @description:
 * @author: corki.tan
 * @create: 2022/12/24 21:09
 */
@Data
public class MarginLendMarket {
    private String currency;
    private BigDecimal size;
    private BigDecimal dailyIntRate;
    private Integer term;
}
