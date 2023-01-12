package com.kucoin.sdk.rest.response;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @description:
 * @author: corki.tan
 * @create: 2022/12/07 15:12
 */
@Data
public class TransferableResponse implements Serializable {
    private static final long serialVersionUID = 10000001111456745L;
    private Long timestamp;
    /**
     * 总资产
     */
    private BigDecimal total;
    /**
     * 可用资产
     */
    private BigDecimal available;
    /**
     * 冻结资产
     */
    private BigDecimal hold;
    /**
     * 最大可转出数量
     */
    private BigDecimal transferable;
}
