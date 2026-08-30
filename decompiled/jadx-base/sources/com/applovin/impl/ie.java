package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class ie extends com.applovin.impl.me implements com.applovin.impl.i8 {
    private final java.util.concurrent.atomic.AtomicBoolean v;
    private final java.util.concurrent.atomic.AtomicBoolean w;

    public ie(int i, java.util.Map map, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        super(i, map, jSONObject, jSONObject2, null, jVar);
        this.v = new java.util.concurrent.atomic.AtomicBoolean();
        this.w = new java.util.concurrent.atomic.AtomicBoolean();
    }

    public void a(com.applovin.mediation.nativeAds.MaxNativeAdView maxNativeAdView) {
        this.o.a(maxNativeAdView);
    }

    public com.applovin.mediation.nativeAds.MaxNativeAdView o0() {
        return this.o.f();
    }

    private ie(com.applovin.impl.ie ieVar, com.applovin.impl.mediation.g gVar) {
        super(ieVar.J(), ieVar.i(), ieVar.a(), ieVar.g(), gVar, ieVar.f1122a);
        this.v = new java.util.concurrent.atomic.AtomicBoolean();
        this.w = new java.util.concurrent.atomic.AtomicBoolean();
    }

    public android.view.ViewGroup p0() {
        return this.o.h();
    }

    public java.lang.String r0() {
        return com.applovin.impl.sdk.utils.BundleUtils.getString("template", "", l());
    }

    public boolean t0() {
        return a("inacc", (java.lang.Boolean) this.f1122a.a(com.applovin.impl.ue.z7)).booleanValue();
    }

    public boolean u0() {
        return this.o == null;
    }

    public java.util.concurrent.atomic.AtomicBoolean q0() {
        return this.v;
    }

    public java.util.concurrent.atomic.AtomicBoolean s0() {
        return this.w;
    }

    public void a(android.view.ViewGroup viewGroup) {
        this.o.a(viewGroup);
    }

    @Override // com.applovin.impl.fe
    public com.applovin.impl.fe a(com.applovin.impl.mediation.g gVar) {
        return new com.applovin.impl.ie(this, gVar);
    }

    @Override // com.applovin.impl.i8
    public long getTimeToLiveMillis() {
        return n0() - (android.os.SystemClock.elapsedRealtime() - K());
    }

    private long n0() {
        long jA = a("ad_expiration_ms", -1L);
        return jA < 0 ? b("ad_expiration_ms", ((java.lang.Long) this.f1122a.a(com.applovin.impl.ue.h7)).longValue()) : jA;
    }

    @Override // com.applovin.impl.i8
    public void setExpired() {
        com.applovin.mediation.nativeAds.MaxNativeAd nativeAd = getNativeAd();
        if (nativeAd != null) {
            nativeAd.setExpired();
        }
    }
}
