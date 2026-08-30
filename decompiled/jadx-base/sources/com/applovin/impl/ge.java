package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class ge extends com.applovin.impl.me {
    @Override // com.applovin.impl.fe
    public com.applovin.impl.fe a(com.applovin.impl.mediation.g gVar) {
        return new com.applovin.impl.ge(this, gVar);
    }

    public ge(int i, java.util.Map map, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        super(i, map, jSONObject, jSONObject2, null, jVar);
    }

    public int r0() {
        int iA = a("ad_view_width", -2);
        if (iA != -2) {
            return iA;
        }
        com.applovin.mediation.MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getWidth();
        }
        throw new java.lang.IllegalStateException("Invalid ad format");
    }

    public int p0() {
        int iA = a("ad_view_height", -2);
        if (iA != -2) {
            return iA;
        }
        com.applovin.mediation.MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getHeight();
        }
        throw new java.lang.IllegalStateException("Invalid ad format");
    }

    private ge(com.applovin.impl.ge geVar, com.applovin.impl.mediation.g gVar) {
        super(geVar.J(), geVar.i(), geVar.a(), geVar.g(), gVar, geVar.f1122a);
    }

    public long q0() {
        return a("viewability_imp_delay_ms", ((java.lang.Long) this.f1122a.a(com.applovin.impl.sj.v1)).longValue());
    }

    public boolean s0() {
        return n0() >= 0;
    }

    public long n0() {
        long jA = a("ad_refresh_ms", -1L);
        return jA >= 0 ? jA : b("ad_refresh_ms", ((java.lang.Long) this.f1122a.a(com.applovin.impl.ue.O6)).longValue());
    }

    public boolean t0() {
        return a("proe", (java.lang.Boolean) this.f1122a.a(com.applovin.impl.ue.p7)).booleanValue();
    }

    public long o0() {
        return com.applovin.impl.yp.d(a("bg_color", (java.lang.String) null));
    }
}
