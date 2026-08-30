package com.applovin.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinPrivacySettings {
    public static java.lang.Boolean getAdditionalConsentStatus(int i) {
        com.applovin.impl.sdk.j jVar = com.applovin.impl.sdk.j.u0;
        if (jVar != null) {
            return jVar.j0().a(i);
        }
        com.applovin.impl.sdk.n.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getAdditionalConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
        return null;
    }

    public static java.lang.Boolean getPurposeConsentStatus(int i) {
        com.applovin.impl.sdk.j jVar = com.applovin.impl.sdk.j.u0;
        if (jVar != null) {
            return jVar.j0().b(i);
        }
        com.applovin.impl.sdk.n.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getPurposeConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
        return null;
    }

    public static java.lang.Boolean getSpecialFeatureOptInStatus(int i) {
        com.applovin.impl.sdk.j jVar = com.applovin.impl.sdk.j.u0;
        if (jVar != null) {
            return jVar.j0().c(i);
        }
        com.applovin.impl.sdk.n.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getSpecialFeatureOptInStatus(...) called when AppLovin MAX SDK is not initialized yet");
        return null;
    }

    public static java.lang.Boolean getTcfVendorConsentStatus(int i) {
        com.applovin.impl.sdk.j jVar = com.applovin.impl.sdk.j.u0;
        if (jVar != null) {
            return jVar.j0().d(i);
        }
        com.applovin.impl.sdk.n.h("AppLovinPrivacySettings", "AppLovinPrivacySettings.getTcfVendorConsentStatus(...) called when AppLovin MAX SDK is not initialized yet");
        return null;
    }

    public static boolean hasUserConsent(android.content.Context context) {
        java.lang.Boolean boolB = com.applovin.impl.a4.b().b(context);
        if (boolB != null) {
            return boolB.booleanValue();
        }
        return false;
    }

    public static boolean isDoNotSell(android.content.Context context) {
        java.lang.Boolean boolB = com.applovin.impl.a4.a().b(context);
        if (boolB != null) {
            return boolB.booleanValue();
        }
        return false;
    }

    public static boolean isDoNotSellSet(android.content.Context context) {
        return com.applovin.impl.a4.a().b(context) != null;
    }

    public static boolean isUserConsentSet(android.content.Context context) {
        return com.applovin.impl.a4.b().b(context) != null;
    }

    public static void setDoNotSell(boolean z, android.content.Context context) {
        com.applovin.impl.sdk.n.g("AppLovinPrivacySettings", "setDoNotSell()");
        if (com.applovin.impl.a4.a(z, context)) {
            com.applovin.sdk.AppLovinSdk.reinitializeAll(null, java.lang.Boolean.valueOf(z));
        }
    }

    public static void setHasUserConsent(boolean z, android.content.Context context) {
        com.applovin.impl.sdk.n.g("AppLovinPrivacySettings", "setHasUserConsent()");
        if (com.applovin.impl.a4.b(z, context)) {
            com.applovin.sdk.AppLovinSdk.reinitializeAll(java.lang.Boolean.valueOf(z), null);
        }
    }
}
