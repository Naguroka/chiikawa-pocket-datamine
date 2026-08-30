package com.applovin.sdk;

/* JADX INFO: loaded from: classes3.dex */
public interface AppLovinTermsAndPrivacyPolicyFlowSettings {
    com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography getDebugUserGeography();

    android.net.Uri getPrivacyPolicyUri();

    android.net.Uri getTermsOfServiceUri();

    boolean isEnabled();

    void setDebugUserGeography(com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography);

    void setEnabled(boolean z);

    void setPrivacyPolicyUri(android.net.Uri uri);

    void setTermsOfServiceUri(android.net.Uri uri);
}
