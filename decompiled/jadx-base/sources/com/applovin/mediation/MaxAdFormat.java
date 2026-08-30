package com.applovin.mediation;

/* JADX INFO: loaded from: classes3.dex */
public class MaxAdFormat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f1581a;
    private final java.lang.String b;
    public static final com.applovin.mediation.MaxAdFormat BANNER = new com.applovin.mediation.MaxAdFormat(com.json.mediationsdk.l.f2983a, "Banner");
    public static final com.applovin.mediation.MaxAdFormat MREC = new com.applovin.mediation.MaxAdFormat("MREC", "MREC");
    public static final com.applovin.mediation.MaxAdFormat LEADER = new com.applovin.mediation.MaxAdFormat("LEADER", "Leader");
    public static final com.applovin.mediation.MaxAdFormat INTERSTITIAL = new com.applovin.mediation.MaxAdFormat("INTER", "Interstitial");
    public static final com.applovin.mediation.MaxAdFormat APP_OPEN = new com.applovin.mediation.MaxAdFormat("APPOPEN", "App Open");
    public static final com.applovin.mediation.MaxAdFormat REWARDED = new com.applovin.mediation.MaxAdFormat("REWARDED", "Rewarded");
    public static final com.applovin.mediation.MaxAdFormat REWARDED_INTERSTITIAL = new com.applovin.mediation.MaxAdFormat("REWARDED_INTER", "Rewarded Interstitial");
    public static final com.applovin.mediation.MaxAdFormat NATIVE = new com.applovin.mediation.MaxAdFormat("NATIVE", "Native");

    private MaxAdFormat(java.lang.String str, java.lang.String str2) {
        this.f1581a = str;
        this.b = str2;
    }

    public static com.applovin.mediation.MaxAdFormat formatFromString(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase("banner")) {
            return BANNER;
        }
        if (str.equalsIgnoreCase("mrec")) {
            return MREC;
        }
        if (str.equalsIgnoreCase(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_NATIVE)) {
            return NATIVE;
        }
        if (str.equalsIgnoreCase("leaderboard") || str.equalsIgnoreCase("leader")) {
            return LEADER;
        }
        if (str.equalsIgnoreCase("interstitial") || str.equalsIgnoreCase("inter")) {
            return INTERSTITIAL;
        }
        if (str.equalsIgnoreCase("appopen") || str.equalsIgnoreCase(com.google.firebase.analytics.FirebaseAnalytics.Event.APP_OPEN)) {
            return APP_OPEN;
        }
        if (str.equalsIgnoreCase("rewarded") || str.equalsIgnoreCase(com.json.s.j)) {
            return REWARDED;
        }
        if (str.equalsIgnoreCase("rewarded_inter") || str.equalsIgnoreCase("rewarded_interstitial")) {
            return REWARDED_INTERSTITIAL;
        }
        com.applovin.impl.sdk.n.h("AppLovinSdk", "Unknown ad format: " + str);
        return null;
    }

    public com.applovin.sdk.AppLovinSdkUtils.Size getAdaptiveSize(android.content.Context context) {
        return getAdaptiveSize(-1, context);
    }

    @java.lang.Deprecated
    public java.lang.String getDisplayName() {
        return this.b;
    }

    public java.lang.String getLabel() {
        return this.f1581a;
    }

    public com.applovin.sdk.AppLovinSdkUtils.Size getSize() {
        if (this == BANNER) {
            return new com.applovin.sdk.AppLovinSdkUtils.Size(320, 50);
        }
        if (this == LEADER) {
            return new com.applovin.sdk.AppLovinSdkUtils.Size(728, 90);
        }
        return this == MREC ? new com.applovin.sdk.AppLovinSdkUtils.Size(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 250) : new com.applovin.sdk.AppLovinSdkUtils.Size(0, 0);
    }

    public boolean isAdViewAd() {
        return this == BANNER || this == MREC || this == LEADER;
    }

    public boolean isBannerOrLeaderAd() {
        return this == BANNER || this == LEADER;
    }

    public boolean isFullscreenAd() {
        return this == INTERSTITIAL || this == APP_OPEN || this == REWARDED || this == REWARDED_INTERSTITIAL;
    }

    public java.lang.String toString() {
        return "MaxAdFormat{label='" + this.f1581a + "'}";
    }

    public com.applovin.sdk.AppLovinSdkUtils.Size getAdaptiveSize(int i, android.content.Context context) {
        return (this == BANNER || this == LEADER) ? com.applovin.impl.ze.a(i, this, context) : getSize();
    }
}
