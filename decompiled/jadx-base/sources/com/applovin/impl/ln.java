package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class ln extends com.applovin.impl.mn {
    private final com.applovin.impl.he h;

    @Override // com.applovin.impl.in
    protected java.lang.String f() {
        return "2.0/mvr";
    }

    public ln(com.applovin.impl.he heVar, com.applovin.impl.sdk.j jVar) {
        super("TaskValidateMaxReward", jVar);
        this.h = heVar;
    }

    @Override // com.applovin.impl.mn
    protected void a(com.applovin.impl.eh ehVar) {
        this.h.a(ehVar);
    }

    @Override // com.applovin.impl.mn
    protected boolean h() {
        return this.h.r0();
    }

    @Override // com.applovin.impl.in
    protected void a(int i) {
        super.a(i);
        this.h.a(com.applovin.impl.eh.a((i < 400 || i >= 500) ? "network_timeout" : "rejected"));
    }

    @Override // com.applovin.impl.in
    protected void a(org.json.JSONObject jSONObject) {
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "ad_unit_id", this.h.getAdUnitId());
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "placement", this.h.getPlacement());
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, "custom_data", this.h.e());
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObject, com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, this.h.getFormat().getLabel());
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
