/**
 * Copyright 2019 Mek Global Limited.
 */
package com.kucoin.sdk.rest.interfaces;

import com.kucoin.sdk.rest.request.MarginBorrowRequest;
import com.kucoin.sdk.rest.request.MarginOrderCreateRequest;
import com.kucoin.sdk.rest.request.MarginOrderCreateV2Request;
import com.kucoin.sdk.rest.request.RepayAllV2Request;
import com.kucoin.sdk.rest.request.RepaySingleV2Request;
import com.kucoin.sdk.rest.response.IsolatedAccountResponse;
import com.kucoin.sdk.rest.response.IsolatedRiskLimitsResponse;
import com.kucoin.sdk.rest.response.KucoinResponse;
import com.kucoin.sdk.rest.response.MarginAccountResponse;
import com.kucoin.sdk.rest.response.MarginAccountV2Response;
import com.kucoin.sdk.rest.response.MarginBorrowResponse;
import com.kucoin.sdk.rest.response.MarginConfigResponse;
import com.kucoin.sdk.rest.response.MarginOrderCreateResponse;
import com.kucoin.sdk.rest.response.MarginPriceStrategyResponse;
import com.kucoin.sdk.rest.response.MarginRiskLimitsResponse;
import com.kucoin.sdk.rest.response.MarginSymbolResponse;
import com.kucoin.sdk.rest.response.MarkPriceResponse;
import com.kucoin.sdk.rest.response.Pagination;
import com.kucoin.sdk.rest.response.RepayRecord;
import com.kucoin.sdk.rest.response.RepayResponse;
import com.kucoin.sdk.rest.response.RiskLimitsResponse;
import com.kucoin.sdk.rest.response.TransferableResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import java.io.IOException;
import java.util.List;

/**
 * Created by ezreal on 2020/12/08.
 */
public interface MarginAPI {

    /**
     * Get Mark Price
     * <p>
     * Request via this endpoint to get the index price of the specified symbol.
     * </p>
     * @param symbol
     * @return
     */
    MarkPriceResponse getMarkPrice(String symbol) throws IOException;

    /**
     * Get Margin Configuration Info
     * <p>
     * Request via this endpoint to get the configure info of the margin.
     * </p>
     * @return
     */
    MarginConfigResponse getMarginConfig() throws IOException;

    /**
     * Get Margin Account
     * <p>
     * Request via this endpoint to get the info of the margin account.
     * </p>
     * @return
     */
    MarginAccountResponse getMarginAccount() throws IOException;

    /**
     * You can place two types of orders: limit and market. Orders can only be placed if your account has sufficient funds.
     * Once an order is placed, your account funds will be put on hold for the duration of the order.
     * How much and which funds are put on hold depends on the order type and parameters specified. See the Holds details below.
     * @param request
     * @return
     */
    @Deprecated
    MarginOrderCreateResponse createMarginOrder(MarginOrderCreateRequest request) throws IOException;

    /**
     *  Get Margin Price Strategy
     *  <p>
     *  Request via this endpoint to get the cross/isolated margin risk limit.
     *  </p>
     * @param marginModel
     * @return
     */
    MarginPriceStrategyResponse getMarginPriceStrategy(String marginModel) throws IOException;


    /**
     * @param isIsolated
     * @param symbol
     * @return
     * @throws IOException
     */
    MarginSymbolResponse getMarginSymbols(Boolean isIsolated, String symbol) throws IOException;


    /**
     * @param isIsolated
     * @param symbol
     * @param currency
     * @return
     */
    TransferableResponse getMarginTransferable(Boolean isIsolated, String symbol, String currency) throws IOException;

    /**
     * @param symbol
     * @param currency
     * @return
     */
    List<MarginRiskLimitsResponse> getMarginRiskLimits(String symbol, String currency) throws IOException;


    /**
     * @param symbol
     * @param currency
     * @return
     */
    List<IsolatedRiskLimitsResponse> getIsolatedRiskLimits(String symbol, String currency) throws IOException;

    /**
     * @param marginBorrowRequest
     * @return
     */
    MarginBorrowResponse marginBorrow(MarginBorrowRequest marginBorrowRequest) throws IOException;

    /**
     * @param request
     * @return
     */
    RepayResponse repayAll(RepayAllV2Request request) throws IOException;

    /**
     * @param request
     * @return
     */
    RepayResponse repaySingle(RepaySingleV2Request request) throws IOException;

    /**
     * @param isIsolated
     * @param symbol
     * @param currency
     * @param status
     * @param startTime
     * @param endTime
     * @param currentPage
     * @param pageSize
     * @return
     */
    Pagination<RepayRecord> getRepayRecordByPage(
            Boolean isIsolated,
            String symbol,
            String currency,
            String status,
            Long startTime,
            Long endTime,
            Integer currentPage,
            Integer pageSize) throws IOException;

    /**
     * @param request
     * @return
     */
    MarginOrderCreateResponse createOrder(MarginOrderCreateV2Request request) throws IOException;


    /**
     * @param quoteCurrency
     * @return
     */
    MarginAccountV2Response getMarginAccountV2(String quoteCurrency) throws IOException;


    /**
     * @param symbol
     * @param quoteCurrency
     * @return
     */
    IsolatedAccountResponse getIsolatedAccounts(String symbol, String quoteCurrency) throws IOException;

}
