package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gn extends com.applovin.impl.in {
    protected abstract void b(org.json.JSONObject jSONObject);

    protected abstract com.applovin.impl.eh h();

    protected abstract void i();

    protected gn(java.lang.String str, com.applovin.impl.sdk.j jVar) {
        super(str, jVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        com.applovin.impl.eh ehVarH = h();
        if (ehVarH != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Reporting pending reward: " + ehVarH + "...");
            }
            a(a(ehVarH), new com.applovin.impl.gn.a());
        } else {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.b(this.b, "Pending reward not found");
            }
            i();
        }
    }

    class a implements com.applovin.impl.d4.e {
        a() {
        }

        @Override // com.applovin.impl.d4.e
        public void a(java.lang.String str, int i, java.lang.String str2, org.json.JSONObject jSONObject) {
            com.applovin.impl.gn.this.a(i);
        }

        @Override // com.applovin.impl.d4.e
        public void a(java.lang.String str, org.json.JSONObject jSONObject, int i) {
            com.applovin.impl.gn.this.b(jSONObject);
        }
    }

    @Override // com.applovin.impl.in
    protected int g() {
        return ((java.lang.Integer) this.f1547a.a(com.applovin.impl.sj.g1)).intValue();
    }

    private org.json.JSONObject a(com.applovin.impl.eh ehVar) {
        org.json.JSONObject jSONObjectE = e();
        com.applovin.impl.sdk.utils.JsonUtils.putString(jSONObjectE, "result", ehVar.b());
        java.util.Map mapA = ehVar.a();
        if (mapA != null) {
            com.applovin.impl.sdk.utils.JsonUtils.putJSONObject(jSONObjectE, "params", new org.json.JSONObject(mapA));
        }
        return jSONObjectE;
    }
}
