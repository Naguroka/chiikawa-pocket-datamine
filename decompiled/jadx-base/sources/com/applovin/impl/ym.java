package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class ym extends com.applovin.impl.yl {
    private final org.json.JSONObject h;
    private final com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener i;

    public ym(org.json.JSONObject jSONObject, com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskProcessNativeAdResponse", jVar);
        this.h = jSONObject;
        this.i = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        org.json.JSONArray jSONArray = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(this.h, "ads", new org.json.JSONArray());
        if (jSONArray.length() > 0) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Processing ad...");
            }
            this.f1547a.i0().a(new com.applovin.impl.sdk.nativeAd.b(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray, 0, new org.json.JSONObject()), this.h, this.i, this.f1547a));
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.k(this.b, "No ads were returned from the server");
        }
        com.applovin.impl.yp.a("native_native", com.applovin.mediation.MaxAdFormat.NATIVE, this.h, this.f1547a);
        this.i.onNativeAdLoadFailed(com.applovin.impl.sdk.AppLovinError.NO_FILL);
    }
}
