/*
 * Copyright (c) 2019 Mek Global Limited
 */

package com.kucoin.sdk.rest.response;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Description
 */
@Data
@ToString
public class MarginAccountV2Response {

    private BigDecimal totalAssetOfQuoteCurrency;

    private BigDecimal totalLiabilityOfQuoteCurrency;

    private BigDecimal debtRatio;

    private String status;

    private List<MarginAccountV2> accounts;

    @Data
    public class MarginAccountV2 {
        private String currency;
        private BigDecimal total;
        private BigDecimal available;
        private BigDecimal hold;
        private BigDecimal liability;
        private BigDecimal maxBorrowSize;
        private Boolean borrowEnabled;
        private Boolean transferInEnabled;
    }
}
