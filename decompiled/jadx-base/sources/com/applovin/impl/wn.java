package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class wn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1475a;
    private boolean b;
    private java.util.List c;

    public wn(com.applovin.impl.sdk.j jVar) {
        this.f1475a = jVar;
        com.applovin.impl.uj ujVar = com.applovin.impl.uj.J;
        this.b = ((java.lang.Boolean) jVar.a(ujVar, java.lang.Boolean.FALSE)).booleanValue() || com.applovin.impl.t0.a(com.applovin.impl.sdk.j.m()).a("applovin.sdk.is_test_environment") || com.applovin.sdk.AppLovinSdkUtils.isEmulator() || jVar.x().M();
        jVar.c(ujVar);
    }

    public boolean c() {
        return this.b;
    }

    public boolean d() {
        java.util.List list = this.c;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public java.util.List b() {
        return this.c;
    }

    public void a() {
        this.f1475a.b(com.applovin.impl.uj.J, java.lang.Boolean.TRUE);
    }

    private void e() {
        com.applovin.impl.sdk.i iVarQ = this.f1475a.q();
        if (this.b) {
            iVarQ.b(this.c);
        } else {
            iVarQ.a(this.c);
        }
    }

    public void a(java.lang.String str) {
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            a(java.util.Collections.singletonList(str));
        } else {
            a((java.util.List) null);
        }
    }

    public void a(java.util.List list) {
        if (list == null && this.c == null) {
            return;
        }
        if (list == null || !list.equals(this.c)) {
            this.c = list;
            e();
        }
    }

    public void a(org.json.JSONObject jSONObject) {
        if (this.b) {
            return;
        }
        org.json.JSONArray jSONArray = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "test_mode_idfas", new org.json.JSONArray());
        com.applovin.impl.sdk.k kVarX = this.f1475a.x();
        boolean zM = kVarX.M();
        java.lang.String strA = kVarX.f().a();
        com.applovin.impl.sdk.k.b bVarC = kVarX.C();
        this.b = zM || com.applovin.impl.sdk.utils.JsonUtils.containsCaseInsensitiveString(strA, jSONArray) || com.applovin.impl.sdk.utils.JsonUtils.containsCaseInsensitiveString(bVarC != null ? bVarC.f1300a : null, jSONArray);
    }
}
