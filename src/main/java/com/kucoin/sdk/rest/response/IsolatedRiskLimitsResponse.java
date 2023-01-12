package com.kucoin.sdk.rest.response;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program margin-api
 * @description:
 * @author: corki.tan
 * @create: 2022/12/07 16:11
 */
@Data
public class IsolatedRiskLimitsResponse extends RiskLimitsResponse {
    private String symbol;

    private BigDecimal baseMaxBorrowAmount;

    private BigDecimal quoteMaxBorrowAmount;

    private BigDecimal baseMaxBuyAmount;

    private BigDecimal quoteMaxBuyAmount;

    private BigDecimal baseMaxHoldAmount;

    private BigDecimal quoteMaxHoldAmount;

    private int basePrecision;

    private int quotePrecision;
}
