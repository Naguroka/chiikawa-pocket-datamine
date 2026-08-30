package com.five_corp.ad.internal;

/* JADX INFO: renamed from: com.five_corp.ad.internal.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1437e implements com.five_corp.ad.internal.InterfaceC1440h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.FiveAdInterstitialEventListener f1898a;
    public final /* synthetic */ com.five_corp.ad.FiveAdInterstitial b;

    public C1437e(com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial, com.five_corp.ad.FiveAdInterstitialEventListener fiveAdInterstitialEventListener) {
        this.f1898a = fiveAdInterstitialEventListener;
        this.b = fiveAdInterstitial;
    }

    @Override // com.five_corp.ad.internal.InterfaceC1440h
    public final void a() {
        this.f1898a.onPlay(this.b);
    }

    @Override // com.five_corp.ad.internal.InterfaceC1440h
    public final void b() {
        this.f1898a.onViewThrough(this.b);
    }

    @Override // com.five_corp.ad.internal.InterfaceC1440h
    public final void c() {
        this.f1898a.onPause(this.b);
    }

    @Override // com.five_corp.ad.internal.InterfaceC1440h
    public final void d() {
        this.f1898a.onClick(this.b);
    }

    @Override // com.five_corp.ad.internal.InterfaceC1440h
    public final void e() {
        this.f1898a.onImpression(this.b);
    }

    @Override // com.five_corp.ad.internal.InterfaceC1440h
    public final void a(com.five_corp.ad.FiveAdErrorCode fiveAdErrorCode) {
        this.f1898a.onViewError(this.b, fiveAdErrorCode);
    }
}
