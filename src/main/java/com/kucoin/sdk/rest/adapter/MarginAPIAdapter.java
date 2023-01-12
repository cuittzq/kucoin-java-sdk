/**
 * Copyright 2019 Mek Global Limited.
 */
package com.kucoin.sdk.rest.adapter;

import com.kucoin.sdk.rest.impl.retrofit.AuthRetrofitAPIImpl;
import com.kucoin.sdk.rest.interfaces.MarginAPI;
import com.kucoin.sdk.rest.interfaces.retrofit.MarginAPIRetrofit;
import com.kucoin.sdk.rest.request.MarginBorrowRequest;
import com.kucoin.sdk.rest.request.MarginOrderCreateRequest;
import com.kucoin.sdk.rest.request.MarginOrderCreateV2Request;
import com.kucoin.sdk.rest.request.RepayAllV2Request;
import com.kucoin.sdk.rest.request.RepaySingleV2Request;
import com.kucoin.sdk.rest.response.IsolatedAccountResponse;
import com.kucoin.sdk.rest.response.IsolatedRiskLimitsResponse;
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

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ezreal on 2020/12/08.
 */
public class MarginAPIAdapter extends AuthRetrofitAPIImpl<MarginAPIRetrofit> implements MarginAPI {

    public MarginAPIAdapter(String baseUrl, String apiKey, String secret, String passPhrase, Integer apiKeyVersion) {
        this.baseUrl = baseUrl;
        this.apiKey = apiKey;
        this.secret = secret;
        this.passPhrase = passPhrase;
        this.apiKeyVersion = apiKeyVersion;
    }


    @Override
    public MarkPriceResponse getMarkPrice(String symbol) throws IOException{
        return executeSync(getAPIImpl().getMarkPrice(symbol));
    }

    @Override
    public MarginConfigResponse getMarginConfig() throws IOException {
        return executeSync(getAPIImpl().getMarginConfig());
    }

    @Override
    public MarginAccountResponse getMarginAccount() throws IOException {
        return executeSync(getAPIImpl().getMarginAccount());
    }

    @Override
    public MarginOrderCreateResponse createMarginOrder(MarginOrderCreateRequest request) throws IOException {
        return executeSync(getAPIImpl().createMarginOrder(request));
    }

    @Override
    public MarginPriceStrategyResponse getMarginPriceStrategy(String marginModel) throws IOException {
        return executeSync(getAPIImpl().getMarginPriceStrategy(marginModel));
    }

    @Override
    public MarginSymbolResponse getMarginSymbols(Boolean isIsolated, String symbol) throws IOException {
        return executeSync(getAPIImpl().getMarginSymbols(isIsolated, symbol));
    }

    @Override
    public TransferableResponse getMarginTransferable(Boolean isIsolated, String symbol, String currency) throws IOException {
        return executeSync(getAPIImpl().getMarginTransferable(isIsolated, symbol, currency));
    }

    @Override
    public List<MarginRiskLimitsResponse> getMarginRiskLimits(String symbol, String currency) throws IOException {
        List<RiskLimitsResponse> responses = executeSync(getAPIImpl().getMarginRiskLimits(Boolean.FALSE, symbol, currency));
        List<MarginRiskLimitsResponse> marginRiskLimitsResponses = responses.stream().map(p -> (MarginRiskLimitsResponse) p).collect(Collectors.toList());
        return marginRiskLimitsResponses;
    }

    @Override
    public List<IsolatedRiskLimitsResponse> getIsolatedRiskLimits(String symbol, String currency) throws IOException {
        List<RiskLimitsResponse> responses = executeSync(getAPIImpl().getMarginRiskLimits(Boolean.TRUE, symbol, currency));
        List<IsolatedRiskLimitsResponse> isolatedRiskLimitsResponses = responses.stream().map(p -> (IsolatedRiskLimitsResponse) p).collect(Collectors.toList());
        return isolatedRiskLimitsResponses;
    }

    @Override
    public MarginBorrowResponse marginBorrow(MarginBorrowRequest marginBorrowRequest) throws IOException {
        return executeSync(getAPIImpl().marginBorrow(marginBorrowRequest));
    }

    @Override
    public RepayResponse repayAll(RepayAllV2Request request) throws IOException {
        return executeSync(getAPIImpl().repayAll(request));
    }

    @Override
    public RepayResponse repaySingle(RepaySingleV2Request request) throws IOException {
        return executeSync(getAPIImpl().repaySingle(request));
    }

    @Override
    public Pagination<RepayRecord> getRepayRecordByPage(Boolean isIsolated,
                                                        String symbol,
                                                        String currency,
                                                        String status,
                                                        Long startTime,
                                                        Long endTime,
                                                        Integer currentPage,
                                                        Integer pageSize) throws IOException {
        return executeSync(getAPIImpl().getRepayRecordByPage(isIsolated, symbol, currency, status, startTime, endTime, currentPage, pageSize));
    }

    @Override
    public MarginOrderCreateResponse createOrder(MarginOrderCreateV2Request request) throws IOException {
        return executeSync(getAPIImpl().createOrder(request));
    }

    @Override
    public MarginAccountV2Response getMarginAccountV2(String quoteCurrency) throws IOException {
        return executeSync(getAPIImpl().getMarginAccountV2(quoteCurrency));
    }

    @Override
    public IsolatedAccountResponse getIsolatedAccounts(String symbol, String quoteCurrency) throws IOException {
        return executeSync(getAPIImpl().getIsolatedAccounts(symbol, quoteCurrency));
    }
}
