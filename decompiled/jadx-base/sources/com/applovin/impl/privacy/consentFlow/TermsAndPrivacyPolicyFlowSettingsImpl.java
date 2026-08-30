package com.applovin.impl.privacy.consentFlow;

/* JADX INFO: loaded from: classes3.dex */
public class TermsAndPrivacyPolicyFlowSettingsImpl implements com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1167a;
    private com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography b;
    private android.net.Uri c;
    private android.net.Uri d;

    public TermsAndPrivacyPolicyFlowSettingsImpl(boolean z, com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, android.net.Uri uri, android.net.Uri uri2) {
        this.f1167a = z;
        this.b = consentFlowUserGeography;
        this.c = uri;
        this.d = uri2;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography getDebugUserGeography() {
        return this.b;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public android.net.Uri getPrivacyPolicyUri() {
        return this.c;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public android.net.Uri getTermsOfServiceUri() {
        return this.d;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public boolean isEnabled() {
        return this.f1167a;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setDebugUserGeography(com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        com.applovin.impl.sdk.n.g("ConsentFlowSettingsImpl", "Setting user debug geography: " + consentFlowUserGeography);
        this.b = consentFlowUserGeography;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setEnabled(boolean z) {
        com.applovin.impl.sdk.n.g("ConsentFlowSettingsImpl", "Setting Terms and Privacy Policy Flow enabled: " + z);
        this.f1167a = z;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setPrivacyPolicyUri(android.net.Uri uri) {
        com.applovin.impl.sdk.n.g("ConsentFlowSettingsImpl", "Setting privacy policy: " + uri);
        this.c = uri;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setTermsOfServiceUri(android.net.Uri uri) {
        com.applovin.impl.sdk.n.g("ConsentFlowSettingsImpl", "Setting terms of service: " + uri);
        this.d = uri;
    }

    public java.lang.String toString() {
        return "ConsentFlowSettings{isEnabled=" + this.f1167a + ", privacyPolicyUri=" + this.c + ", termsOfServiceUri=" + this.d + '}';
    }
}
