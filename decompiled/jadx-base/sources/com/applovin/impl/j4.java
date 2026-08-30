package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class j4 extends com.applovin.impl.i4 {
    @Override // com.applovin.impl.i4
    public java.lang.String toString() {
        return "ConsentFlowState{id=" + b() + "type=" + c() + "isInitialState=" + d() + "title=" + g() + "message=" + f() + "actions=" + e() + "}";
    }

    public j4(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        super(jSONObject, jVar);
    }

    public java.lang.String g() {
        return b(com.ironsource.y8.h.D0);
    }

    public java.lang.String f() {
        return b(com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE);
    }

    public java.util.List e() {
        com.applovin.impl.k4 k4VarA;
        org.json.JSONArray jSONArray = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(this.b, "transitions", null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject jSONObject = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray, i, (org.json.JSONObject) null);
            if (jSONObject != null && (k4VarA = com.applovin.impl.k4.a(jSONObject, this.f871a)) != null) {
                arrayList.add(k4VarA);
            }
        }
        return arrayList;
    }
}
