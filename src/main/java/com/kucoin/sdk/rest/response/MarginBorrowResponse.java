package com.kucoin.sdk.rest.response;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @description:
 * @author: corki.tan
 * @create: 2022/12/07 19:10
 */
@Data
public class MarginBorrowResponse {

    /**
     * 借入委托订单ID
     */
    private String orderId;
    /**
     * 成交金额
     */
    private BigDecimal size;
}
