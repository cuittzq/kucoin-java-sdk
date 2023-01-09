package com.kucoin.sdk.rest.response;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @program kucoin-java-sdk
 * @description:
 * @author: corki.tan
 * @create: 2022/12/24 20:42
 */
@Data
public class MarginSymbolResponse implements Serializable {
    private static final long serialVersionUID = 10000000111123121L;

    private Long timestamp;

    private List<MarginSymbol> items;
}
