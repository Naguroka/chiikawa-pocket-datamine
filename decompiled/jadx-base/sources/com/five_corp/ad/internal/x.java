package com.five_corp.ad.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements com.five_corp.ad.internal.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.FiveAdInterstitialEventListener f2117a;
    public final /* synthetic */ com.five_corp.ad.FiveAdInterstitial b;

    public x(com.five_corp.ad.FiveAdInterstitial fiveAdInterstitial, com.five_corp.ad.FiveAdInterstitialEventListener fiveAdInterstitialEventListener) {
        this.f2117a = fiveAdInterstitialEventListener;
        this.b = fiveAdInterstitial;
    }

    @Override // com.five_corp.ad.internal.z
    public final void a() {
    }

    @Override // com.five_corp.ad.internal.z
    public final void b() {
        this.f2117a.onFullScreenOpen(this.b);
    }

    @Override // com.five_corp.ad.internal.z
    public final void c() {
        this.f2117a.onFullScreenClose(this.b);
    }
}
