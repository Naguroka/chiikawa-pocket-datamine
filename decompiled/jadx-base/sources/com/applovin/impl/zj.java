package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class zj extends com.applovin.impl.oe {
    @Override // com.applovin.impl.oe
    public java.lang.String toString() {
        return "SignalProviderSpec{adObject=" + a() + '}';
    }

    public zj(java.util.Map map, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        super(map, jSONObject, jSONObject2, jVar);
    }

    public boolean v() {
        return a("only_collect_signal_when_initialized", java.lang.Boolean.FALSE).booleanValue();
    }

    public boolean z() {
        return a("initialize_before_collecting_signal", java.lang.Boolean.TRUE).booleanValue();
    }

    public boolean w() {
        return a("prefer_collect_signal_when_initialized", java.lang.Boolean.TRUE).booleanValue();
    }

    public boolean y() {
        return a("ignore_init_failure", java.lang.Boolean.FALSE).booleanValue();
    }

    public boolean A() {
        return a("use_cached_adapter", java.lang.Boolean.TRUE).booleanValue();
    }

    public long u() {
        return a("signal_expiration_ms", ((java.lang.Long) this.f1122a.a(com.applovin.impl.ue.e7)).longValue());
    }

    public boolean x() {
        return a("fail_collection_for_empty_signal", (java.lang.Boolean) this.f1122a.a(com.applovin.impl.ue.L7)).booleanValue();
    }

    public com.applovin.impl.xj.b t() {
        return com.applovin.impl.xj.b.values()[a("signal_cache_level", ((java.lang.Integer) this.f1122a.a(com.applovin.impl.ue.f7)).intValue())];
    }
}
