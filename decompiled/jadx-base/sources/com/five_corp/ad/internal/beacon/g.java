package com.five_corp.ad.internal.beacon;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements com.five_corp.ad.internal.beacon.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.beacon.j f1850a;

    public g(com.five_corp.ad.internal.beacon.j jVar) {
        this.f1850a = jVar;
    }

    @Override // com.five_corp.ad.internal.beacon.c
    public final void a(long j, com.five_corp.ad.internal.ad.beacon.a aVar) {
        com.five_corp.ad.f fVar = (com.five_corp.ad.f) this.f1850a;
        com.five_corp.ad.internal.B b = fVar.o;
        b.a(14, j, fVar.t, b.g.b.C.b, null);
        b.a(com.five_corp.ad.internal.ad.beacon.e.VIEWABLE_IMPRESSION);
    }
}
