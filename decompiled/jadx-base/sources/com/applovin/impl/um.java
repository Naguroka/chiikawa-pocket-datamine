package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class um extends com.applovin.impl.yl implements com.applovin.impl.qb {
    private final org.json.JSONObject h;
    private final com.applovin.impl.h0 i;
    private final com.applovin.sdk.AppLovinAdLoadListener j;
    private final boolean k;

    public um(org.json.JSONObject jSONObject, com.applovin.impl.h0 h0Var, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        this(jSONObject, h0Var, false, appLovinAdLoadListener, jVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        org.json.JSONArray jSONArray = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(this.h, "ads", new org.json.JSONArray());
        if (jSONArray.length() > 0) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Processing ad...");
            }
            a(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray, 0, new org.json.JSONObject()));
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.k(this.b, "No ads were returned from the server");
            }
            com.applovin.impl.yp.a(this.i.e(), this.i.d(), this.h, this.f1547a);
            failedToReceiveAdV2(com.applovin.impl.sdk.AppLovinError.NO_FILL);
        }
    }

    private void a(org.json.JSONObject jSONObject) {
        java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "type", com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN);
        if ("applovin".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Starting task for AppLovin ad...");
            }
            this.f1547a.i0().a(new com.applovin.impl.bn(jSONObject, this.h, this, this.f1547a));
            return;
        }
        if ("vast".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Starting task for VAST ad...");
            }
            this.f1547a.i0().a(com.applovin.impl.zm.a(jSONObject, this.h, this, this.f1547a));
            return;
        }
        if ("js_tag".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Starting task for JS tag ad...");
            }
            this.f1547a.i0().a(new com.applovin.impl.vm(jSONObject, this.h, this, this.f1547a));
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.c.b(this.b, "Unable to process ad of unknown type: " + string);
        }
        failedToReceiveAdV2(new com.applovin.impl.sdk.AppLovinError(com.applovin.sdk.AppLovinErrorCodes.INVALID_RESPONSE, "Unknown ad type: " + string));
    }

    public um(org.json.JSONObject jSONObject, com.applovin.impl.h0 h0Var, boolean z, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskProcessAdResponse", jVar);
        if (jSONObject == null) {
            throw new java.lang.IllegalArgumentException("No response specified");
        }
        if (h0Var != null) {
            this.h = jSONObject;
            this.i = h0Var;
            this.j = appLovinAdLoadListener;
            this.k = z;
            return;
        }
        throw new java.lang.IllegalArgumentException("No zone specified");
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(com.applovin.sdk.AppLovinAd appLovinAd) {
        com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener = this.j;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
        if (this.k || !(appLovinAd instanceof com.applovin.impl.sdk.ad.b)) {
            return;
        }
        this.f1547a.D().a(com.applovin.impl.ka.i, (com.applovin.impl.sdk.ad.b) appLovinAd);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        failedToReceiveAdV2(new com.applovin.impl.sdk.AppLovinError(i, ""));
    }

    @Override // com.applovin.impl.qb
    public void failedToReceiveAdV2(com.applovin.impl.sdk.AppLovinError appLovinError) {
        com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener = this.j;
        if (appLovinAdLoadListener == null) {
            return;
        }
        if (appLovinAdLoadListener instanceof com.applovin.impl.qb) {
            ((com.applovin.impl.qb) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
        if (this.k) {
            return;
        }
        this.f1547a.D().a(com.applovin.impl.ka.j, this.i, appLovinError);
    }
}
