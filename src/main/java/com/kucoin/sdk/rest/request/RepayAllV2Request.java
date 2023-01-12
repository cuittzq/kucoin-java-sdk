package com.kucoin.sdk.rest.request;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @description:
 * @author: corki.tan
 * @create: 2022/12/07 15:16
 */
@Data
public class RepayAllV2Request {

    private Boolean isIsolated;

    private String symbol;

    private String currency;

    private BigDecimal size;

    private String sequence;
}

