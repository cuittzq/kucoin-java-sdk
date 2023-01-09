package com.kucoin.sdk.rest.response;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @program kucoin-java-sdk
 * @description:
 * @author: corki.tan
 * @create: 2022/12/24 21:08
 */
@Data
public class LendMarketResponse implements Serializable {
    private static final long serialVersionUID = 10000001111456743L;
    private Long timestamp;
    private List<MarginLendMarket> items;
}
