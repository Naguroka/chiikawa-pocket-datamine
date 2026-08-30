package com.five_corp.ad.internal.bgtask;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends com.five_corp.ad.internal.bgtask.m {
    public final java.lang.String c;
    public final com.five_corp.ad.internal.http.d d;

    public k(java.lang.String str, com.five_corp.ad.internal.http.d dVar) {
        super(2);
        this.c = str;
        this.d = dVar;
    }

    @Override // com.five_corp.ad.internal.bgtask.m
    public final boolean b() {
        com.five_corp.ad.internal.util.f fVarA = this.d.a(this.c, "GET", null, null);
        return fVarA.f2085a && ((com.five_corp.ad.internal.http.c) fVarA.c).f1919a == 200;
    }
}
