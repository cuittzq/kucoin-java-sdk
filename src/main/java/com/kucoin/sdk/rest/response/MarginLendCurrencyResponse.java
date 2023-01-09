package com.kucoin.sdk.rest.response;

import java.io.Serializable;
import java.util.List;

/**
 * @program kucoin-java-sdk
 * @description:
 * @author: corki.tan
 * @create: 2022/12/24 21:03
 */
public class MarginLendCurrencyResponse implements Serializable {
    private static final long serialVersionUID = 100000001121345L;

    private Long timestamp;

    private List<MarginLendCurrency> items;
}
