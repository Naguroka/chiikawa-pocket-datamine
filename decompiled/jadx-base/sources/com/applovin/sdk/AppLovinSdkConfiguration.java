package com.applovin.sdk;

/* JADX INFO: loaded from: classes3.dex */
public interface AppLovinSdkConfiguration {

    @java.lang.Deprecated
    public enum ConsentDialogState {
        UNKNOWN,
        APPLIES,
        DOES_NOT_APPLY
    }

    public enum ConsentFlowUserGeography {
        UNKNOWN,
        GDPR,
        OTHER
    }

    @java.lang.Deprecated
    com.applovin.sdk.AppLovinSdkConfiguration.ConsentDialogState getConsentDialogState();

    com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography getConsentFlowUserGeography();

    java.lang.String getCountryCode();

    java.util.List<java.lang.String> getEnabledAmazonAdUnitIds();

    boolean isTestModeEnabled();
}
