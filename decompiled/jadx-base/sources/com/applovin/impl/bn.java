package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class bn extends com.applovin.impl.yl {
    private final org.json.JSONObject h;
    private final org.json.JSONObject i;
    private final com.applovin.sdk.AppLovinAdLoadListener j;

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Rendering ad...");
        }
        com.applovin.impl.sdk.ad.a aVar = new com.applovin.impl.sdk.ad.a(this.h, this.i, this.f1547a);
        boolean zBooleanValue = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.h, "gs_load_immediately", java.lang.Boolean.FALSE).booleanValue();
        boolean zBooleanValue2 = com.applovin.impl.sdk.utils.JsonUtils.getBoolean(this.h, "vs_load_immediately", java.lang.Boolean.TRUE).booleanValue();
        com.applovin.impl.cm cmVar = new com.applovin.impl.cm(aVar, this.f1547a, this.j);
        cmVar.c(zBooleanValue2);
        cmVar.b(zBooleanValue);
        this.f1547a.i0().a((com.applovin.impl.yl) cmVar, com.applovin.impl.tm.b.CACHING);
    }

    public bn(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskRenderAppLovinAd", jVar);
        this.h = jSONObject;
        this.i = jSONObject2;
        this.j = appLovinAdLoadListener;
    }
}
