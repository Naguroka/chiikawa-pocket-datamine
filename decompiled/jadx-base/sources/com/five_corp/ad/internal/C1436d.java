package com.five_corp.ad.internal;

/* JADX INFO: renamed from: com.five_corp.ad.internal.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1436d implements com.five_corp.ad.internal.InterfaceC1440h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.FiveAdCustomLayoutEventListener f1897a;
    public final /* synthetic */ com.five_corp.ad.FiveAdCustomLayout b;

    public C1436d(com.five_corp.ad.FiveAdCustomLayoutEventListener fiveAdCustomLayoutEventListener, com.five_corp.ad.FiveAdCustomLayout fiveAdCustomLayout) {
        this.f1897a = fiveAdCustomLayoutEventListener;
        this.b = fiveAdCustomLayout;
    }

    @Override // com.five_corp.ad.internal.InterfaceC1440h
    public final void a() {
        this.f1897a.onPlay(this.b);
    }

    @Override // com.five_corp.ad.internal.InterfaceC1440h
    public final void b() {
        this.f1897a.onViewThrough(this.b);
    }

    @Override // com.five_corp.ad.internal.InterfaceC1440h
    public final void c() {
        this.f1897a.onPause(this.b);
    }

    @Override // com.five_corp.ad.internal.InterfaceC1440h
    public final void d() {
        this.f1897a.onClick(this.b);
    }

    @Override // com.five_corp.ad.internal.InterfaceC1440h
    public final void e() {
        this.f1897a.onImpression(this.b);
    }

    @Override // com.five_corp.ad.internal.InterfaceC1440h
    public final void a(com.five_corp.ad.FiveAdErrorCode fiveAdErrorCode) {
        this.f1897a.onViewError(this.b, fiveAdErrorCode);
    }
}
