package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class en extends com.applovin.impl.gn {
    private final com.applovin.impl.sdk.ad.b h;

    @Override // com.applovin.impl.gn
    protected void b(org.json.JSONObject jSONObject) {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Reported reward successfully for ad: " + this.h);
        }
    }

    @Override // com.applovin.impl.in
    protected java.lang.String f() {
        return "2.0/cr";
    }

    @Override // com.applovin.impl.gn
    protected void i() {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.b(this.b, "No reward result was found for ad: " + this.h);
        }
    }

    public en(com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.j jVar) {
        super("TaskReportAppLovinReward", jVar);
        this.h = bVar;
    }

    @Override // com.applovin.impl.gn
    protected com.applovin.impl.eh h() {
        return this.h.f();
    }

    @Override // com.applovin.impl.in
    protected void a(int i) {
        super.a(i);
        if (com.applovin.impl.sdk.n.a()) {
            this.c.b(this.b, "Failed to report reward for ad: " + this.h + " - error code: " + i);
        }
    }

    @Override // com.applovin.impl.in
    protected void a(org.json.JSONObject jSONObject) {
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, com.applovin.mediation.AppLovinUtils.ServerParameterKeys.ZONE_ID, this.h.getAdZone().e());
        com.applovin.impl.sdk.utils.JsonUtils.putInt(jSONObject, "fire_percent", this.h.W());
        java.lang.String clCode = this.h.getClCode();
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "clcode", clCode);
    }
}
