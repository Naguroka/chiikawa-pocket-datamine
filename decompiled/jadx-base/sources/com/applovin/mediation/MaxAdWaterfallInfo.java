package com.applovin.mediation;

/* JADX INFO: loaded from: classes3.dex */
public interface MaxAdWaterfallInfo {
    long getLatencyMillis();

    com.applovin.mediation.MaxAd getLoadedAd();

    java.lang.String getName();

    java.util.List<com.applovin.mediation.MaxNetworkResponseInfo> getNetworkResponses();

    java.lang.String getTestName();
}
