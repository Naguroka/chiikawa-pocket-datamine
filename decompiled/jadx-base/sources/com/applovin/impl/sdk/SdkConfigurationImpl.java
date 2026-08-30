package com.applovin.impl.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class SdkConfigurationImpl implements com.applovin.sdk.AppLovinSdkConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f1271a;
    private final com.applovin.impl.sdk.j b;

    public SdkConfigurationImpl(java.util.List<java.lang.String> list, com.applovin.impl.sdk.j jVar) {
        this.f1271a = list;
        this.b = jVar;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public com.applovin.sdk.AppLovinSdkConfiguration.ConsentDialogState getConsentDialogState() {
        java.lang.String str = this.b.f0().getExtraParameters().get("consent_dialog_state");
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            str = (java.lang.String) this.b.a(com.applovin.impl.sj.m6);
        }
        if ("applies".equalsIgnoreCase(str)) {
            return com.applovin.sdk.AppLovinSdkConfiguration.ConsentDialogState.APPLIES;
        }
        return "does_not_apply".equalsIgnoreCase(str) ? com.applovin.sdk.AppLovinSdkConfiguration.ConsentDialogState.DOES_NOT_APPLY : com.applovin.sdk.AppLovinSdkConfiguration.ConsentDialogState.UNKNOWN;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography getConsentFlowUserGeography() {
        java.lang.String str = (java.lang.String) this.b.a(com.applovin.impl.sj.m6);
        if ("applies".equalsIgnoreCase(str)) {
            return com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
        }
        return "does_not_apply".equalsIgnoreCase(str) ? com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER : com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public java.lang.String getCountryCode() {
        return (java.lang.String) this.b.a(com.applovin.impl.sj.n6);
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public java.util.List<java.lang.String> getEnabledAmazonAdUnitIds() {
        return this.f1271a;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public boolean isTestModeEnabled() {
        return this.b.k0().c();
    }

    public java.lang.String toString() {
        return "AppLovinSdkConfiguration{, countryCode=" + getCountryCode() + ", enabledAmazonAdUnitIds=" + getEnabledAmazonAdUnitIds() + ", testModeEnabled=" + isTestModeEnabled() + '}';
    }
}
