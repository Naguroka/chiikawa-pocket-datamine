package com.five_corp.ad.internal.http.movcache;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.context.l f1925a;
    public final /* synthetic */ com.five_corp.ad.internal.http.movcache.h b;

    public b(com.five_corp.ad.internal.http.movcache.h hVar, com.five_corp.ad.internal.context.l lVar) {
        this.b = hVar;
        this.f1925a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.util.f fVarA = com.five_corp.ad.internal.http.movcache.h.a(this.b, new com.five_corp.ad.internal.http.a(null, this.f1925a, 2));
        if (fVarA.f2085a && ((java.lang.Boolean) fVarA.c).booleanValue()) {
            com.five_corp.ad.internal.http.movcache.h.a(this.b);
        }
    }
}
