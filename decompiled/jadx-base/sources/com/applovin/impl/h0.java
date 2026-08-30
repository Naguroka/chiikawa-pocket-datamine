package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 {
    private static final java.util.Map e = new java.util.HashMap();
    private static final java.lang.Object f = new java.lang.Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.json.JSONObject f836a;
    private final java.lang.String b;
    private com.applovin.sdk.AppLovinAdSize c;
    private com.applovin.sdk.AppLovinAdType d;

    public static com.applovin.impl.h0 b(java.lang.String str) {
        return a(com.applovin.sdk.AppLovinAdSize.INTERSTITIAL, com.applovin.sdk.AppLovinAdType.INCENTIVIZED, str);
    }

    public static com.applovin.impl.h0 c() {
        return a(com.applovin.sdk.AppLovinAdSize.BANNER, com.applovin.sdk.AppLovinAdType.REGULAR);
    }

    public static com.applovin.impl.h0 h() {
        return a(com.applovin.sdk.AppLovinAdSize.INTERSTITIAL, com.applovin.sdk.AppLovinAdType.INCENTIVIZED);
    }

    public static com.applovin.impl.h0 j() {
        return a(com.applovin.sdk.AppLovinAdSize.LEADER, com.applovin.sdk.AppLovinAdType.REGULAR);
    }

    public static com.applovin.impl.h0 k() {
        return a(com.applovin.sdk.AppLovinAdSize.MREC, com.applovin.sdk.AppLovinAdType.REGULAR);
    }

    public static com.applovin.impl.h0 l() {
        return a(com.applovin.sdk.AppLovinAdSize.NATIVE, com.applovin.sdk.AppLovinAdType.NATIVE);
    }

    public static com.applovin.impl.h0 m() {
        return a(com.applovin.sdk.AppLovinAdSize.INTERSTITIAL, com.applovin.sdk.AppLovinAdType.REGULAR);
    }

    public boolean i() {
        return a().contains(this);
    }

    public java.lang.String toString() {
        return "AdZone{id=" + this.b + ", zoneObject=" + this.f836a + '}';
    }

    public static com.applovin.impl.h0 b() {
        return a(com.applovin.sdk.AppLovinAdSize.INTERSTITIAL, com.applovin.sdk.AppLovinAdType.APP_OPEN);
    }

    public static com.applovin.impl.h0 a(com.applovin.sdk.AppLovinAdSize appLovinAdSize, com.applovin.sdk.AppLovinAdType appLovinAdType) {
        return a(appLovinAdSize, appLovinAdType, null);
    }

    private h0(com.applovin.sdk.AppLovinAdSize appLovinAdSize, com.applovin.sdk.AppLovinAdType appLovinAdType, java.lang.String str, boolean z, boolean z2) {
        java.lang.String lowerCase;
        if (android.text.TextUtils.isEmpty(str) && (appLovinAdType == null || appLovinAdSize == null)) {
            throw new java.lang.IllegalArgumentException("No zone identifier or type or size specified");
        }
        this.c = appLovinAdSize;
        this.d = appLovinAdType;
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            lowerCase = str.trim().toLowerCase(java.util.Locale.ENGLISH);
        } else {
            lowerCase = (appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel()).toLowerCase(java.util.Locale.ENGLISH);
        }
        lowerCase = z ? lowerCase + "_bidding" : lowerCase;
        this.b = z2 ? lowerCase + "_direct_sold" : lowerCase;
    }

    public static com.applovin.impl.h0 a(com.applovin.sdk.AppLovinAdSize appLovinAdSize, com.applovin.sdk.AppLovinAdType appLovinAdType, java.lang.String str) {
        return a(appLovinAdSize, appLovinAdType, str, false, false);
    }

    public java.lang.String e() {
        return this.b;
    }

    public com.applovin.mediation.MaxAdFormat d() {
        com.applovin.sdk.AppLovinAdSize appLovinAdSizeF = f();
        if (appLovinAdSizeF == com.applovin.sdk.AppLovinAdSize.BANNER) {
            return com.applovin.mediation.MaxAdFormat.BANNER;
        }
        if (appLovinAdSizeF == com.applovin.sdk.AppLovinAdSize.LEADER) {
            return com.applovin.mediation.MaxAdFormat.LEADER;
        }
        if (appLovinAdSizeF == com.applovin.sdk.AppLovinAdSize.MREC) {
            return com.applovin.mediation.MaxAdFormat.MREC;
        }
        if (appLovinAdSizeF == com.applovin.sdk.AppLovinAdSize.INTERSTITIAL) {
            if (g() == com.applovin.sdk.AppLovinAdType.REGULAR) {
                return com.applovin.mediation.MaxAdFormat.INTERSTITIAL;
            }
            if (g() == com.applovin.sdk.AppLovinAdType.APP_OPEN) {
                return com.applovin.mediation.MaxAdFormat.APP_OPEN;
            }
            if (g() == com.applovin.sdk.AppLovinAdType.INCENTIVIZED) {
                return com.applovin.mediation.MaxAdFormat.REWARDED;
            }
            if (g() == com.applovin.sdk.AppLovinAdType.AUTO_INCENTIVIZED) {
                return com.applovin.mediation.MaxAdFormat.REWARDED_INTERSTITIAL;
            }
            return null;
        }
        if (appLovinAdSizeF == com.applovin.sdk.AppLovinAdSize.NATIVE) {
            return com.applovin.mediation.MaxAdFormat.NATIVE;
        }
        return null;
    }

    public static com.applovin.impl.h0 a(java.lang.String str) {
        return a(null, null, str);
    }

    public com.applovin.sdk.AppLovinAdSize f() {
        if (this.c == null && com.applovin.impl.sdk.utils.JsonUtils.valueExists(this.f836a, "ad_size")) {
            this.c = com.applovin.sdk.AppLovinAdSize.fromString(com.applovin.impl.sdk.utils.JsonUtils.getString(this.f836a, "ad_size", null));
        }
        return this.c;
    }

    public com.applovin.sdk.AppLovinAdType g() {
        if (this.d == null && com.applovin.impl.sdk.utils.JsonUtils.valueExists(this.f836a, "ad_type")) {
            this.d = com.applovin.sdk.AppLovinAdType.fromString(com.applovin.impl.sdk.utils.JsonUtils.getString(this.f836a, "ad_type", null));
        }
        return this.d;
    }

    public static void a(org.json.JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has("ad_type")) {
            synchronized (f) {
                com.applovin.impl.h0 h0Var = (com.applovin.impl.h0) e.get(com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, com.applovin.mediation.AppLovinUtils.ServerParameterKeys.ZONE_ID, ""));
                if (h0Var != null) {
                    h0Var.c = com.applovin.sdk.AppLovinAdSize.fromString(com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "ad_size", ""));
                    h0Var.d = com.applovin.sdk.AppLovinAdType.fromString(com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "ad_type", ""));
                }
            }
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.h0.class != obj.getClass()) {
            return false;
        }
        return this.b.equalsIgnoreCase(((com.applovin.impl.h0) obj).b);
    }

    public static com.applovin.impl.h0 a(com.applovin.sdk.AppLovinAdSize appLovinAdSize, com.applovin.sdk.AppLovinAdType appLovinAdType, java.lang.String str, boolean z, boolean z2) {
        com.applovin.impl.h0 h0Var = new com.applovin.impl.h0(appLovinAdSize, appLovinAdType, str, z, z2);
        synchronized (f) {
            java.lang.String str2 = h0Var.b;
            java.util.Map map = e;
            if (map.containsKey(str2)) {
                h0Var = (com.applovin.impl.h0) map.get(str2);
            } else {
                map.put(str2, h0Var);
            }
        }
        return h0Var;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public static java.util.Collection a() {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(7);
        java.util.Collections.addAll(linkedHashSet, c(), k(), j(), m(), b(), h(), l());
        return java.util.Collections.unmodifiableSet(linkedHashSet);
    }
}
