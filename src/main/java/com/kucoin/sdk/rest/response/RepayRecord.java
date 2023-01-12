package com.kucoin.sdk.rest.response;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program margin-api
 * @description:
 * @author: corki.tan
 * @create: 2022/12/08 16:34
 */
@Data
public class RepayRecord {
    private String tradeId;

    private String currency;

    private BigDecimal principal;

    private BigDecimal interest;

    private BigDecimal repaidSize;

    private Long maturityTime;

    private BigDecimal dailyIntRate;

    private Integer term;

    private String status;
}
