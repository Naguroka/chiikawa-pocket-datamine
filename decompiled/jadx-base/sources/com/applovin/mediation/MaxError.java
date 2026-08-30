package com.applovin.mediation;

/* JADX INFO: loaded from: classes3.dex */
public interface MaxError {
    @java.lang.Deprecated
    java.lang.String getAdLoadFailureInfo();

    int getCode();

    int getMediatedNetworkErrorCode();

    java.lang.String getMediatedNetworkErrorMessage();

    java.lang.String getMessage();

    long getRequestLatencyMillis();

    com.applovin.mediation.MaxAdWaterfallInfo getWaterfall();
}
