package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class me extends com.applovin.impl.fe {
    protected me(int i, java.util.Map map, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.applovin.impl.mediation.g gVar, com.applovin.impl.sdk.j jVar) {
        super(i, map, jSONObject, jSONObject2, gVar, jVar);
    }

    public int l0() {
        com.applovin.impl.sj sjVar;
        com.applovin.mediation.MaxAdFormat format = getFormat();
        if (format == com.applovin.mediation.MaxAdFormat.BANNER) {
            sjVar = com.applovin.impl.sj.w1;
        } else if (format == com.applovin.mediation.MaxAdFormat.MREC) {
            sjVar = com.applovin.impl.sj.y1;
        } else if (format == com.applovin.mediation.MaxAdFormat.LEADER) {
            sjVar = com.applovin.impl.sj.A1;
        } else {
            sjVar = format == com.applovin.mediation.MaxAdFormat.NATIVE ? com.applovin.impl.sj.C1 : null;
        }
        if (sjVar != null) {
            return a("viewability_min_width", ((java.lang.Integer) this.f1122a.a(sjVar)).intValue());
        }
        return 0;
    }

    public int h0() {
        com.applovin.impl.sj sjVar;
        com.applovin.mediation.MaxAdFormat format = getFormat();
        if (format == com.applovin.mediation.MaxAdFormat.BANNER) {
            sjVar = com.applovin.impl.sj.x1;
        } else if (format == com.applovin.mediation.MaxAdFormat.MREC) {
            sjVar = com.applovin.impl.sj.z1;
        } else if (format == com.applovin.mediation.MaxAdFormat.LEADER) {
            sjVar = com.applovin.impl.sj.B1;
        } else {
            sjVar = format == com.applovin.mediation.MaxAdFormat.NATIVE ? com.applovin.impl.sj.D1 : null;
        }
        if (sjVar != null) {
            return a("viewability_min_height", ((java.lang.Integer) this.f1122a.a(sjVar)).intValue());
        }
        return 0;
    }

    public float f0() {
        return b("viewability_min_alpha", ((java.lang.Float) this.f1122a.a(com.applovin.impl.sj.E1)).floatValue() / 100.0f);
    }

    public int g0() {
        return a("viewability_min_pixels", -1);
    }

    public float i0() {
        return b("viewability_min_percentage_dp", -1.0f);
    }

    public float j0() {
        return b("viewability_min_percentage_pixels", -1.0f);
    }

    public boolean m0() {
        return g0() >= 0 || i0() >= 0.0f || j0() >= 0.0f;
    }

    public long k0() {
        return a("viewability_timer_min_visible_ms", ((java.lang.Long) this.f1122a.a(com.applovin.impl.sj.F1)).longValue());
    }
}
