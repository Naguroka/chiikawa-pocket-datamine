package com.applovin.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinAdType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f1604a;
    public static final com.applovin.sdk.AppLovinAdType REGULAR = new com.applovin.sdk.AppLovinAdType("REGULAR");
    public static final com.applovin.sdk.AppLovinAdType APP_OPEN = new com.applovin.sdk.AppLovinAdType("APPOPEN");
    public static final com.applovin.sdk.AppLovinAdType INCENTIVIZED = new com.applovin.sdk.AppLovinAdType("VIDEOA");
    public static final com.applovin.sdk.AppLovinAdType AUTO_INCENTIVIZED = new com.applovin.sdk.AppLovinAdType("AUTOREW");
    public static final com.applovin.sdk.AppLovinAdType NATIVE = new com.applovin.sdk.AppLovinAdType("NATIVE");

    private AppLovinAdType(java.lang.String str) {
        this.f1604a = str;
    }

    public static com.applovin.sdk.AppLovinAdType fromString(java.lang.String str) {
        if ("REGULAR".equalsIgnoreCase(str)) {
            return REGULAR;
        }
        if ("APPOPEN".equalsIgnoreCase(str)) {
            return APP_OPEN;
        }
        if ("VIDEOA".equalsIgnoreCase(str)) {
            return INCENTIVIZED;
        }
        if ("AUTOREW".equalsIgnoreCase(str)) {
            return AUTO_INCENTIVIZED;
        }
        if ("NATIVE".equalsIgnoreCase(str)) {
            return NATIVE;
        }
        throw new java.lang.IllegalArgumentException("Unknown Ad Type: " + str);
    }

    public java.lang.String getLabel() {
        return this.f1604a.toUpperCase(java.util.Locale.ENGLISH);
    }

    public java.lang.String toString() {
        return getLabel();
    }
}
