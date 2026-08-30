package com.applovin.impl.mediation.ads;

/* JADX INFO: loaded from: classes3.dex */
public class b implements com.applovin.impl.br.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1048a;
    private final com.applovin.impl.ie b;
    private final com.applovin.impl.br c;
    private final com.applovin.impl.ar d;
    private final com.applovin.impl.mediation.ads.a.InterfaceC0040a e;

    public void a() {
        this.c.b();
    }

    public void c() {
        this.f1048a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1048a.I().a("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.b.q0().compareAndSet(false, true)) {
            this.f1048a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1048a.I().a("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.b.getNativeAd().isExpired()) {
                com.applovin.impl.sdk.n.h("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.f1048a.f().a(this.b);
            }
            this.f1048a.P().processRawAdImpression(this.b, this.e);
        }
    }

    @Override // com.applovin.impl.br.a
    public void onLogVisibilityImpression() {
        a(this.d.a(this.b));
    }

    private void a(long j) {
        if (this.b.s0().compareAndSet(false, true)) {
            this.f1048a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1048a.I().a("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f1048a.P().processViewabilityAdImpressionPostback(this.b, j, this.e);
        }
    }

    public b(com.applovin.impl.ie ieVar, android.view.ViewGroup viewGroup, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a, com.applovin.impl.sdk.j jVar) {
        this.f1048a = jVar;
        this.b = ieVar;
        this.e = interfaceC0040a;
        this.d = new com.applovin.impl.ar(viewGroup, jVar);
        com.applovin.impl.br brVar = new com.applovin.impl.br(viewGroup, jVar, this);
        this.c = brVar;
        brVar.a(ieVar);
        jVar.I();
        if (com.applovin.impl.sdk.n.a()) {
            jVar.I().a("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    public com.applovin.impl.ie b() {
        return this.b;
    }
}
