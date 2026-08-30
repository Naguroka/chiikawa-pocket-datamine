package com.five_corp.ad;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements com.five_corp.ad.internal.adselector.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.h f1778a;
    public final /* synthetic */ com.five_corp.ad.internal.context.i b;
    public final /* synthetic */ com.five_corp.ad.internal.context.h c;
    public final /* synthetic */ com.five_corp.ad.i d;
    public final /* synthetic */ com.five_corp.ad.AdLoader e;

    public g(com.five_corp.ad.AdLoader adLoader, com.five_corp.ad.h hVar, com.five_corp.ad.internal.context.i iVar, com.five_corp.ad.internal.context.h hVar2, com.five_corp.ad.i iVar2) {
        this.e = adLoader;
        this.f1778a = hVar;
        this.b = iVar;
        this.c = hVar2;
        this.d = iVar2;
    }

    @Override // com.five_corp.ad.internal.adselector.c
    public final void onAdSuccessfullySelected(com.five_corp.ad.internal.context.l lVar) {
        com.five_corp.ad.AdLoader adLoader = this.e;
        com.five_corp.ad.h hVar = this.f1778a;
        java.lang.Object obj = com.five_corp.ad.AdLoader.m;
        adLoader.a(hVar, lVar);
    }

    @Override // com.five_corp.ad.internal.adselector.c
    public final void onFailureToSelectAd(com.five_corp.ad.internal.s sVar) {
        com.five_corp.ad.AdLoader adLoader = this.e;
        com.five_corp.ad.internal.context.i iVar = this.b;
        com.five_corp.ad.internal.context.h hVar = this.c;
        com.five_corp.ad.i iVar2 = this.d;
        java.lang.Object obj = com.five_corp.ad.AdLoader.m;
        adLoader.b(iVar2, sVar, null, iVar, hVar);
    }
}
