package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mn extends com.applovin.impl.in {
    protected abstract void a(com.applovin.impl.eh ehVar);

    protected abstract boolean h();

    protected mn(java.lang.String str, com.applovin.impl.sdk.j jVar) {
        super(str, jVar);
    }

    class a implements com.applovin.impl.d4.e {
        a() {
        }

        @Override // com.applovin.impl.d4.e
        public void a(java.lang.String str, int i, java.lang.String str2, org.json.JSONObject jSONObject) {
            if (com.applovin.impl.mn.this.h()) {
                com.applovin.impl.sdk.n nVar = com.applovin.impl.mn.this.c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.mn mnVar = com.applovin.impl.mn.this;
                    mnVar.c.b(mnVar.b, "Reward validation failed with error code " + i + " but task was cancelled already");
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.n nVar2 = com.applovin.impl.mn.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mn mnVar2 = com.applovin.impl.mn.this;
                mnVar2.c.b(mnVar2.b, "Reward validation failed with code " + i + " and error: " + str2);
            }
            com.applovin.impl.mn.this.a(i);
        }

        @Override // com.applovin.impl.d4.e
        public void a(java.lang.String str, org.json.JSONObject jSONObject, int i) {
            if (com.applovin.impl.mn.this.h()) {
                com.applovin.impl.sdk.n nVar = com.applovin.impl.mn.this.c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.mn mnVar = com.applovin.impl.mn.this;
                    mnVar.c.b(mnVar.b, "Reward validation succeeded with code " + i + " but task was cancelled already");
                }
                com.applovin.impl.sdk.n nVar2 = com.applovin.impl.mn.this.c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.mn mnVar2 = com.applovin.impl.mn.this;
                    mnVar2.c.b(mnVar2.b, "Response: " + jSONObject);
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.n nVar3 = com.applovin.impl.mn.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.mn mnVar3 = com.applovin.impl.mn.this;
                mnVar3.c.a(mnVar3.b, "Reward validation succeeded with code " + i + " and response: " + jSONObject);
            }
            com.applovin.impl.mn.this.c(jSONObject);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        a(e(), new com.applovin.impl.mn.a());
    }

    @Override // com.applovin.impl.in
    protected int g() {
        return ((java.lang.Integer) this.f1547a.a(com.applovin.impl.sj.f1)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(org.json.JSONObject jSONObject) {
        com.applovin.impl.eh ehVarB = b(jSONObject);
        a(ehVarB);
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Pending reward handled: " + ehVarB);
        }
    }

    private com.applovin.impl.eh b(org.json.JSONObject jSONObject) {
        java.util.Map<java.lang.String, java.lang.String> mapEmptyMap;
        java.lang.String string;
        org.json.JSONObject jSONObject2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "results", new org.json.JSONArray()), 0, new org.json.JSONObject());
        com.applovin.impl.e4.c(jSONObject2, this.f1547a);
        com.applovin.impl.e4.b(jSONObject, this.f1547a);
        com.applovin.impl.e4.a(jSONObject, this.f1547a);
        try {
            mapEmptyMap = com.applovin.impl.sdk.utils.JsonUtils.toStringMap((org.json.JSONObject) jSONObject2.get("params"));
        } catch (java.lang.Throwable unused) {
            mapEmptyMap = java.util.Collections.emptyMap();
        }
        try {
            string = jSONObject2.getString("result");
        } catch (java.lang.Throwable unused2) {
            string = "network_timeout";
        }
        return com.applovin.impl.eh.a(string, mapEmptyMap);
    }
}
