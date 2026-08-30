package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class e5 extends com.ironsource.mediationsdk.e.a {
    public e5(com.json.p4 p4Var, java.net.URL url, org.json.JSONObject jSONObject, boolean z, int i, long j, boolean z2, boolean z3, int i2) {
        super(p4Var, url, jSONObject, z, i, j, z2, z3, i2);
    }

    @Override // com.ironsource.mediationsdk.e.a
    protected void a(boolean z, com.json.p4 p4Var, long j) {
        try {
            if (z) {
                ((com.json.x4) p4Var).a(this.b, this.f + 1, j, this.j, this.i);
            } else {
                p4Var.a(this.c, this.d, this.f + 1, this.g, j);
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            p4Var.a(1009, e.getMessage(), this.f + 1, this.g, j);
        }
    }
}
