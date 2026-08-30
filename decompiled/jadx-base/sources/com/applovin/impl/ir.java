package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class ir {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.ic f899a;
    private final com.applovin.impl.cg b;
    private final java.util.List c;

    public ir(org.json.JSONObject jSONObject, com.applovin.mediation.MaxAdFormat maxAdFormat, com.applovin.impl.je jeVar, com.applovin.impl.sdk.j jVar) {
        org.json.JSONObject jSONObject2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject, "bidder_placement", (org.json.JSONObject) null);
        if (jSONObject2 != null) {
            this.b = new com.applovin.impl.cg(jSONObject2, jVar);
        } else {
            this.b = null;
        }
        this.f899a = new com.applovin.impl.ic(com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "name", ""), com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, "display_name", ""), jSONObject2 != null, jeVar);
        org.json.JSONArray jSONArray = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, com.json.op.c, new org.json.JSONArray());
        this.c = new java.util.ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject jSONObject3 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray, i, (org.json.JSONObject) null);
            if (jSONObject3 != null) {
                this.c.add(new com.applovin.impl.cg(jSONObject3, jVar));
            }
        }
    }

    public com.applovin.impl.ic b() {
        return this.f899a;
    }

    public com.applovin.impl.cg a() {
        return this.b;
    }

    public boolean d() {
        return this.b != null;
    }

    public java.util.List c() {
        return this.c;
    }
}
