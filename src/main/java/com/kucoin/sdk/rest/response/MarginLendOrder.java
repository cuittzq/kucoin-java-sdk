package com.kucoin.sdk.rest.response;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program kucoin-java-sdk
 * @description:
 * @author: corki.tan
 * @create: 2022/12/24 21:12
 */
@Data
public class MarginLendOrder {
    private String orderId;
    private String currency;
    private BigDecimal size;
    private BigDecimal filledSize;
    private BigDecimal dailyIntRate;
    private Integer term;
    private Long createdAt;
    private String status;
}
