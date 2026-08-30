package com.five_corp.ad.internal;

/* JADX INFO: renamed from: com.five_corp.ad.internal.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1439g implements com.five_corp.ad.internal.InterfaceC1440h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.FiveAdNativeEventListener f1904a;
    public final /* synthetic */ com.five_corp.ad.FiveAdNative b;

    public C1439g(com.five_corp.ad.FiveAdNativeEventListener fiveAdNativeEventListener, com.five_corp.ad.FiveAdNative fiveAdNative) {
        this.f1904a = fiveAdNativeEventListener;
        this.b = fiveAdNative;
    }

    @Override // com.five_corp.ad.internal.InterfaceC1440h
    public final void a() {
        this.f1904a.onPlay(this.b);
    }

    @Override // com.five_corp.ad.internal.InterfaceC1440h
    public final void b() {
        this.f1904a.onViewThrough(this.b);
    }

    @Override // com.five_corp.ad.internal.InterfaceC1440h
    public final void c() {
        this.f1904a.onPause(this.b);
    }

    @Override // com.five_corp.ad.internal.InterfaceC1440h
    public final void d() {
        this.f1904a.onClick(this.b);
    }

    @Override // com.five_corp.ad.internal.InterfaceC1440h
    public final void e() {
        this.f1904a.onImpression(this.b);
    }

    @Override // com.five_corp.ad.internal.InterfaceC1440h
    public final void a(com.five_corp.ad.FiveAdErrorCode fiveAdErrorCode) {
        this.f1904a.onViewError(this.b, fiveAdErrorCode);
    }
}
