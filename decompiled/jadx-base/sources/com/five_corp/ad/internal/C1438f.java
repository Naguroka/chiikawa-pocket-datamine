package com.five_corp.ad.internal;

/* JADX INFO: renamed from: com.five_corp.ad.internal.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1438f implements com.five_corp.ad.internal.InterfaceC1440h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.FiveAdVideoRewardEventListener f1900a;
    public final /* synthetic */ com.five_corp.ad.FiveAdVideoReward b;

    public C1438f(com.five_corp.ad.FiveAdVideoReward fiveAdVideoReward, com.five_corp.ad.FiveAdVideoRewardEventListener fiveAdVideoRewardEventListener) {
        this.f1900a = fiveAdVideoRewardEventListener;
        this.b = fiveAdVideoReward;
    }

    @Override // com.five_corp.ad.internal.InterfaceC1440h
    public final void a() {
        this.f1900a.onPlay(this.b);
    }

    @Override // com.five_corp.ad.internal.InterfaceC1440h
    public final void b() {
        this.f1900a.onViewThrough(this.b);
    }

    @Override // com.five_corp.ad.internal.InterfaceC1440h
    public final void c() {
        this.f1900a.onPause(this.b);
    }

    @Override // com.five_corp.ad.internal.InterfaceC1440h
    public final void d() {
        this.f1900a.onClick(this.b);
    }

    @Override // com.five_corp.ad.internal.InterfaceC1440h
    public final void e() {
        this.f1900a.onImpression(this.b);
    }

    @Override // com.five_corp.ad.internal.InterfaceC1440h
    public final void a(com.five_corp.ad.FiveAdErrorCode fiveAdErrorCode) {
        this.f1900a.onViewError(this.b, fiveAdErrorCode);
    }
}
