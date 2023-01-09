package com.kucoin.sdk.rest.response;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program kucoin-java-sdk
 * @description:
 * @author: corki.tan
 * @create: 2022/12/24 21:18
 */
@Data
public class MarginLendTradeOrder {
    private String tradeId;

    private String currency;

    private BigDecimal size;

    private BigDecimal repaidSize;

    private BigDecimal interest;

    private BigDecimal accruedInterest;

    private Integer term;

    private Long maturityTime;

    private String status;

    private String note;
}
