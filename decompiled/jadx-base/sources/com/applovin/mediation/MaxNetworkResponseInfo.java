package com.applovin.mediation;

/* JADX INFO: loaded from: classes3.dex */
public interface MaxNetworkResponseInfo {

    public enum AdLoadState {
        AD_LOAD_NOT_ATTEMPTED,
        AD_LOADED,
        FAILED_TO_LOAD
    }

    com.applovin.mediation.MaxNetworkResponseInfo.AdLoadState getAdLoadState();

    android.os.Bundle getCredentials();

    com.applovin.mediation.MaxError getError();

    long getLatencyMillis();

    com.applovin.mediation.MaxMediatedNetworkInfo getMediatedNetwork();

    boolean isBidding();
}
