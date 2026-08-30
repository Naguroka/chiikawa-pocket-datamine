package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class fn extends com.applovin.impl.gn {
    private final com.applovin.impl.he h;

    @Override // com.applovin.impl.gn
    protected void b(org.json.JSONObject jSONObject) {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Reported reward successfully for mediated ad: " + this.h);
        }
    }

    @Override // com.applovin.impl.in
    protected java.lang.String f() {
        return "2.0/mcr";
    }

    @Override // com.applovin.impl.gn
    protected void i() {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.b(this.b, "No reward result was found for mediated ad: " + this.h);
        }
    }

    public fn(com.applovin.impl.he heVar, com.applovin.impl.sdk.j jVar) {
        super("TaskReportMaxReward", jVar);
        this.h = heVar;
    }

    @Override // com.applovin.impl.gn
    protected com.applovin.impl.eh h() {
        return this.h.k0();
    }

    @Override // com.applovin.impl.in
    protected void a(int i) {
        super.a(i);
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Failed to report reward for mediated ad: " + this.h + " - error code: " + i);
        }
    }

    @Override // com.applovin.impl.in
    protected void a(org.json.JSONObject jSONObject) {
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "ad_unit_id", this.h.getAdUnitId());
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "placement", this.h.getPlacement());
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "custom_data", this.h.e());
        java.lang.String strO0 = this.h.o0();
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(strO0)) {
            strO0 = "NO_MCODE";
        }
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "mcode", strO0);
        java.lang.String strB = this.h.B();
        if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(strB)) {
            strB = "NO_BCODE";
        }
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "bcode", strB);
    }
}
