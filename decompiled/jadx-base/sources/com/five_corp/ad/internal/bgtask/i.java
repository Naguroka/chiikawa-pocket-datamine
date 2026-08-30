package com.five_corp.ad.internal.bgtask;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends com.five_corp.ad.internal.bgtask.m {
    public final com.five_corp.ad.internal.beacon.a c;
    public final com.five_corp.ad.internal.E d;
    public final com.five_corp.ad.internal.http.d e;

    public i(com.five_corp.ad.internal.beacon.a aVar, com.five_corp.ad.internal.E e, com.five_corp.ad.internal.http.d dVar) {
        super(1);
        this.c = aVar;
        this.d = e;
        this.e = dVar;
    }

    @Override // com.five_corp.ad.internal.bgtask.m
    public final boolean b() {
        com.five_corp.ad.internal.util.f fVarA = this.e.a(this.d.a(this.c), "GET", null, null);
        return fVarA.f2085a && ((com.five_corp.ad.internal.http.c) fVarA.c).f1919a == 200;
    }
}
