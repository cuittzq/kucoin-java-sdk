package com.kucoin.sdk.rest.request;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @description:
 * @author: corki.tan
 * @create: 2022/12/07 19:02
 */
@Data
@Builder
public class MarginBorrowRequest{

    private Boolean isIsolated;

    private String symbol;

    private String currency;

    private String timeInForce;

    private BigDecimal size;

    private BigDecimal maxRate;

    private Integer term;
}
