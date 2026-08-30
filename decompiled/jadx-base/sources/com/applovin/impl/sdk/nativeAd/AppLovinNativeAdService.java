package com.applovin.impl.sdk.nativeAd;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinNativeAdService {
    private static final java.lang.String TAG = "AppLovinNativeAdService";
    private final com.applovin.impl.sdk.n logger;
    private final com.applovin.impl.sdk.j sdk;

    public AppLovinNativeAdService(com.applovin.impl.sdk.j jVar) {
        this.sdk = jVar;
        this.logger = jVar.I();
    }

    public void loadNextAdForAdToken(java.lang.String str, com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        java.lang.String strTrim = str != null ? str.trim() : null;
        if (android.text.TextUtils.isEmpty(strTrim)) {
            com.applovin.impl.sdk.n.h(TAG, "Empty ad token");
            com.applovin.impl.fc.b(appLovinNativeAdLoadListener, new com.applovin.impl.sdk.AppLovinError(-8, "Empty ad token"));
            return;
        }
        com.applovin.impl.w wVar = new com.applovin.impl.w(strTrim, this.sdk);
        if (wVar.c() == com.applovin.impl.w.a.REGULAR) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(TAG, "Loading next ad for token: " + wVar);
            }
            this.sdk.i0().a((com.applovin.impl.yl) new com.applovin.impl.nm(wVar, appLovinNativeAdLoadListener, this.sdk), com.applovin.impl.tm.b.CORE);
            return;
        }
        if (wVar.c() != com.applovin.impl.w.a.AD_RESPONSE_JSON) {
            com.applovin.impl.sdk.AppLovinError appLovinError = new com.applovin.impl.sdk.AppLovinError(-8, "Invalid token type");
            com.applovin.impl.sdk.n.h(TAG, "Invalid token type");
            com.applovin.impl.fc.b(appLovinNativeAdLoadListener, appLovinError);
            return;
        }
        org.json.JSONObject jSONObjectA = wVar.a();
        if (jSONObjectA == null) {
            java.lang.String str2 = "Unable to retrieve ad response JSON from token: " + wVar.b();
            com.applovin.impl.sdk.AppLovinError appLovinError2 = new com.applovin.impl.sdk.AppLovinError(-8, str2);
            com.applovin.impl.sdk.n.h(TAG, str2);
            com.applovin.impl.fc.b(appLovinNativeAdLoadListener, appLovinError2);
            return;
        }
        com.applovin.impl.e4.c(jSONObjectA, this.sdk);
        com.applovin.impl.e4.b(jSONObjectA, this.sdk);
        com.applovin.impl.e4.a(jSONObjectA, this.sdk);
        if (com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObjectA, "ads", new org.json.JSONArray()).length() > 0) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(TAG, "Rendering ad for token: " + wVar);
            }
            this.sdk.i0().a((com.applovin.impl.yl) new com.applovin.impl.ym(jSONObjectA, appLovinNativeAdLoadListener, this.sdk), com.applovin.impl.tm.b.CORE);
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.b(TAG, "No ad returned from the server for token: " + wVar);
            }
            com.applovin.impl.fc.b(appLovinNativeAdLoadListener, com.applovin.impl.sdk.AppLovinError.NO_FILL);
        }
    }
}
