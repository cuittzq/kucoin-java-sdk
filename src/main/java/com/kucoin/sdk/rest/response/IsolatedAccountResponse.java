package com.kucoin.sdk.rest.response;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

/**
 * api-逐仓账户信息响应对象
 *
 * @author liliang
 */
@Data
@ToString
public class IsolatedAccountResponse {

    private BigDecimal totalAssetOfQuoteCurrency;

    private BigDecimal totalLiabilityOfQuoteCurrency;

    private Long timestamp = System.currentTimeMillis();

    private List<PositionApiV2Resp> assets;

    @Data
    @ToString
    public static class PositionApiV2Resp {

        private String symbol;

        private String status;

        private BigDecimal debtRatio;

        private AssetResp baseAsset;

        private AssetResp quoteAsset;
    }

    @Data
    @ToString
    public static class AssetResp {

        private String currency;

        private Boolean borrowEnabled;

        private Boolean transferInEnabled;

        private BigDecimal liability;

        private BigDecimal total;

        private BigDecimal available;

        private BigDecimal hold;

        private BigDecimal maxBorrowSize;
    }
}
