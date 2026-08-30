package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class l4 extends com.applovin.impl.i4 {
    private java.util.Map c;

    @Override // com.applovin.impl.i4
    public java.lang.String toString() {
        return "ConsentFlowState{id=" + b() + "type=" + c() + "isInitialState=" + d() + "name=" + f() + "}";
    }

    public java.util.Map e() {
        return this.c;
    }

    public l4(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        super(jSONObject, jVar);
    }

    public java.lang.String f() {
        return com.applovin.impl.sdk.utils.JsonUtils.getString(this.b, "name", null);
    }
}
