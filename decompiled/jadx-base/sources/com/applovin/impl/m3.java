package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography f1007a;

    public java.lang.String toString() {
        return "CmpAdapterParameters(debugUserGeography=" + a() + ")";
    }

    protected boolean a(java.lang.Object obj) {
        return obj instanceof com.applovin.impl.m3;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.applovin.impl.m3)) {
            return false;
        }
        com.applovin.impl.m3 m3Var = (com.applovin.impl.m3) obj;
        if (!m3Var.a(this)) {
            return false;
        }
        com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyA = a();
        com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyA2 = m3Var.a();
        return consentFlowUserGeographyA != null ? consentFlowUserGeographyA.equals(consentFlowUserGeographyA2) : consentFlowUserGeographyA2 == null;
    }

    public int hashCode() {
        com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyA = a();
        return (consentFlowUserGeographyA == null ? 43 : consentFlowUserGeographyA.hashCode()) + 59;
    }

    public m3(com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        this.f1007a = consentFlowUserGeography;
    }

    public com.applovin.sdk.AppLovinSdkConfiguration.ConsentFlowUserGeography a() {
        return this.f1007a;
    }
}
