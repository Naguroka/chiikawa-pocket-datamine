package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class he extends com.applovin.impl.fe implements com.applovin.impl.i8 {
    private boolean A;
    private final android.os.Bundle v;
    private final java.util.concurrent.atomic.AtomicReference w;
    private final java.util.concurrent.atomic.AtomicBoolean x;
    private final java.util.concurrent.atomic.AtomicBoolean y;
    private boolean z;

    public android.os.Bundle m0() {
        return this.v;
    }

    public boolean q0() {
        return this.z;
    }

    public void a(boolean z) {
        this.z = z;
    }

    public he(int i, java.util.Map map, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        super(i, map, jSONObject, jSONObject2, null, jVar);
        this.v = new android.os.Bundle();
        this.y = new java.util.concurrent.atomic.AtomicBoolean();
        this.w = new java.util.concurrent.atomic.AtomicReference();
        this.x = new java.util.concurrent.atomic.AtomicBoolean();
    }

    public long j0() {
        long jA = a("ad_hidden_timeout_ms", -1L);
        return jA >= 0 ? jA : b("ad_hidden_timeout_ms", ((java.lang.Long) this.f1122a.a(com.applovin.impl.ue.l7)).longValue());
    }

    public boolean s0() {
        if (a("schedule_ad_hidden_on_ad_dismiss", java.lang.Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_ad_dismiss", (java.lang.Boolean) this.f1122a.a(com.applovin.impl.ue.m7)).booleanValue();
    }

    public boolean t0() {
        if (a("schedule_ad_hidden_on_single_task_app_relaunch", java.lang.Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_single_task_app_relaunch", (java.lang.Boolean) this.f1122a.a(com.applovin.impl.ue.n7)).booleanValue();
    }

    public long i0() {
        long jA = a("ad_hidden_on_ad_dismiss_callback_delay_ms", -1L);
        return jA >= 0 ? jA : b("ad_hidden_on_ad_dismiss_callback_delay_ms", ((java.lang.Long) this.f1122a.a(com.applovin.impl.ue.o7)).longValue());
    }

    public long l0() {
        if (K() > 0) {
            return android.os.SystemClock.elapsedRealtime() - K();
        }
        return -1L;
    }

    public long n0() {
        long jA = a("fullscreen_display_delay_ms", -1L);
        return jA >= 0 ? jA : ((java.lang.Long) this.f1122a.a(com.applovin.impl.ue.Y6)).longValue();
    }

    private he(com.applovin.impl.he heVar, com.applovin.impl.mediation.g gVar) {
        super(heVar.J(), heVar.i(), heVar.a(), heVar.g(), gVar, heVar.f1122a);
        this.v = new android.os.Bundle();
        this.y = new java.util.concurrent.atomic.AtomicBoolean();
        this.w = heVar.w;
        this.x = heVar.x;
    }

    public long h0() {
        return a("ahdm", ((java.lang.Long) this.f1122a.a(com.applovin.impl.ue.a7)).longValue());
    }

    public boolean u0() {
        return a("susaode", (java.lang.Boolean) this.f1122a.a(com.applovin.impl.ue.Z6)).booleanValue();
    }

    public java.lang.String o0() {
        return b("mcode", "");
    }

    public boolean r0() {
        return this.x.get();
    }

    public void f0() {
        this.x.set(true);
    }

    public com.applovin.impl.eh k0() {
        return (com.applovin.impl.eh) this.w.getAndSet(null);
    }

    public java.util.concurrent.atomic.AtomicBoolean p0() {
        return this.y;
    }

    @Override // com.applovin.impl.i8
    public long getTimeToLiveMillis() {
        return g0() - (android.os.SystemClock.elapsedRealtime() - K());
    }

    private long g0() {
        long jA = a("ad_expiration_ms", -1L);
        return jA < 0 ? b("ad_expiration_ms", ((java.lang.Long) this.f1122a.a(com.applovin.impl.ue.g7)).longValue()) : jA;
    }

    @Override // com.applovin.impl.i8
    public void setExpired() {
        this.A = true;
    }

    public void a(com.applovin.impl.eh ehVar) {
        this.w.set(ehVar);
    }

    @Override // com.applovin.impl.fe
    public void a(android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        super.a(bundle);
        if (bundle == null || (bundle2 = bundle.getBundle("applovin_ad_view_info")) == null) {
            return;
        }
        this.v.putBundle("applovin_ad_view_info", bundle2);
    }

    @Override // com.applovin.impl.fe
    public com.applovin.impl.fe a(com.applovin.impl.mediation.g gVar) {
        return new com.applovin.impl.he(this, gVar);
    }
}
