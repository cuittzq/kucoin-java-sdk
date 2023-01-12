package com.kucoin.sdk.rest.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: corki.tan
 * @create: 2022/12/08 09:51
 */
@Data
public class RepayResponse implements Serializable {
    private static final long serialVersionUID = 1000001233111L;

    private Long timestamp;

   private String tradeId;
}
