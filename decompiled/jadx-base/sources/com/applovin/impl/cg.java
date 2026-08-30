package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class cg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f678a;
    private final java.lang.String b;

    public cg(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        this.f678a = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "id", "");
        this.b = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "price", null);
    }

    public java.lang.String a() {
        return this.f678a;
    }

    public java.lang.String b() {
        return this.b;
    }
}
