package com.kucoin.sdk.rest.request;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program margin-api
 * @description:
 * @author: corki.tan
 * @create: 2022/12/07 15:16
 */
@Data
public class RepaySingleV2Request {

    private Boolean isIsolated;

    private String symbol;

    private String tradeId;

    private String currency;

    private BigDecimal size;
}
