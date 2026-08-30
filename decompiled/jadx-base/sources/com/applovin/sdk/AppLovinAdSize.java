package com.applovin.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinAdSize {
    public static final int SPAN = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f1603a;
    private final int b;
    private final int c;
    public static final com.applovin.sdk.AppLovinAdSize BANNER = new com.applovin.sdk.AppLovinAdSize(-1, 50, com.json.mediationsdk.l.f2983a);
    public static final com.applovin.sdk.AppLovinAdSize LEADER = new com.applovin.sdk.AppLovinAdSize(-1, 90, "LEADER");
    public static final com.applovin.sdk.AppLovinAdSize MREC = new com.applovin.sdk.AppLovinAdSize(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 250, "MREC");
    public static final com.applovin.sdk.AppLovinAdSize INTERSTITIAL = new com.applovin.sdk.AppLovinAdSize(-1, -1, "INTER");
    public static final com.applovin.sdk.AppLovinAdSize NATIVE = new com.applovin.sdk.AppLovinAdSize(-1, -1, "NATIVE");

    private AppLovinAdSize(int i, int i2, java.lang.String str) {
        this.b = i;
        this.c = i2;
        this.f1603a = str;
    }

    public static com.applovin.sdk.AppLovinAdSize fromString(java.lang.String str) {
        if (com.json.mediationsdk.l.f2983a.equalsIgnoreCase(str)) {
            return BANNER;
        }
        if ("MREC".equalsIgnoreCase(str)) {
            return MREC;
        }
        if ("LEADER".equalsIgnoreCase(str)) {
            return LEADER;
        }
        if ("INTERSTITIAL".equalsIgnoreCase(str) || "INTER".equalsIgnoreCase(str)) {
            return INTERSTITIAL;
        }
        if ("NATIVE".equalsIgnoreCase(str)) {
            return NATIVE;
        }
        throw new java.lang.IllegalArgumentException("Unknown Ad Size: " + str);
    }

    public int getHeight() {
        return this.c;
    }

    public java.lang.String getLabel() {
        return this.f1603a.toUpperCase(java.util.Locale.ENGLISH);
    }

    public int getWidth() {
        return this.b;
    }

    public java.lang.String toString() {
        return getLabel();
    }
}
