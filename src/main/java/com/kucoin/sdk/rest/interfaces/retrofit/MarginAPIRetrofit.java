/**
 * Copyright 2019 Mek Global Limited.
 */
package com.kucoin.sdk.rest.interfaces.retrofit;

import com.kucoin.sdk.rest.request.MarginBorrowRequest;
import com.kucoin.sdk.rest.request.MarginOrderCreateRequest;
import com.kucoin.sdk.rest.request.MarginOrderCreateV2Request;
import com.kucoin.sdk.rest.request.MultiOrderCreateRequest;
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
import com.kucoin.sdk.rest.response.MultiOrderCreateResponse;
import com.kucoin.sdk.rest.response.Pagination;
import com.kucoin.sdk.rest.response.RepayRecord;
import com.kucoin.sdk.rest.response.RepayResponse;
import com.kucoin.sdk.rest.response.RiskLimitsResponse;
import com.kucoin.sdk.rest.response.TransferableResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

/**
 * Created by ezreal on 2020/12/08.
 */
public interface MarginAPIRetrofit {

    @GET("api/v1/mark-price/{symbol}/current")
    Call<KucoinResponse<MarkPriceResponse>> getMarkPrice(@Path("symbol") String symbol);

    @GET("api/v1/margin/config")
    Call<KucoinResponse<MarginConfigResponse>> getMarginConfig();

    @GET("api/v1/margin/account")
    Call<KucoinResponse<MarginAccountResponse>> getMarginAccount();

    @POST("api/v1/margin/order")
    Call<KucoinResponse<MarginOrderCreateResponse>> createMarginOrder(@Body MarginOrderCreateRequest request);

    @GET("api/v1/risk/limit/strategy")
    Call<KucoinResponse<MarginPriceStrategyResponse>> getMarginPriceStrategy(@Query("marginModel") String marginModel);

    @GET("api/v2/margin/symbols")
    Call<KucoinResponse<MarginSymbolResponse>> getMarginSymbols(@Query("isIsolated") Boolean isIsolated, @Query("symbol") String symbol);

    @GET("api/v2/margin/transferable")
    Call<KucoinResponse<TransferableResponse>> getMarginTransferable(@Query("isIsolated") Boolean isIsolated,
                                                                   @Query("symbol") String symbol,
                                                                   @Query("currency") String currency);
    @GET("api/v2/margin/riskLimits")
    Call<KucoinResponse<List<RiskLimitsResponse>>> getMarginRiskLimits(@Query("isIsolated") Boolean isIsolated,
                                                                       @Query("symbol") String symbol,
                                                                       @Query("currency") String currency);
    @POST("api/v2/margin/borrow")
    Call<KucoinResponse<MarginBorrowResponse>> marginBorrow(@Body MarginBorrowRequest marginBorrowRequest);

    @POST("api/v2/margin/repay/all")
    Call<KucoinResponse<RepayResponse>> repayAll(@Body RepayAllV2Request request);

    @POST("api/v2/margin/repay/single")
    Call<KucoinResponse<RepayResponse>> repaySingle(@Body RepaySingleV2Request request);

    @GET("api/v2/margin/repay")
    Call<KucoinResponse<Pagination<RepayRecord>>> getRepayRecordByPage(
            @Query("isIsolated") Boolean isIsolated,
            @Query("symbol") String symbol,
            @Query("currency") String currency,
            @Query("status") String status,
            @Query("startTime") Long startTime,
            @Query("endTime") Long endTime,
            @Query("currentPage") Integer currentPage,
            @Query("pageSize") Integer pageSize);



    @POST("api/v2/margin/order")
    Call<KucoinResponse<MarginOrderCreateResponse>> createOrder(@Body MarginOrderCreateV2Request request);


    @GET("api/v2/margin/accounts")
    Call<KucoinResponse<MarginAccountV2Response>> getMarginAccountV2(@Query(value = "quoteCurrency") String quoteCurrency);



    @GET("api/v2/isolated/accounts")
    Call<KucoinResponse<IsolatedAccountResponse>> getIsolatedAccounts(@Query(value = "symbol") String symbol,
                                                                      @Query(value = "quoteCurrency") String quoteCurrency);

}
