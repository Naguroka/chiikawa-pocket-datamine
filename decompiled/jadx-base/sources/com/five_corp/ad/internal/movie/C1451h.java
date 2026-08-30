package com.five_corp.ad.internal.movie;

/* JADX INFO: renamed from: com.five_corp.ad.internal.movie.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1451h implements com.five_corp.ad.internal.movie.partialcache.w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.x f1976a;

    public C1451h(com.five_corp.ad.internal.movie.x xVar) {
        this.f1976a = xVar;
    }

    @Override // com.five_corp.ad.internal.movie.partialcache.w1
    public final void a(java.lang.Object obj) {
        com.five_corp.ad.internal.movie.partialcache.C1459b c1459b = (com.five_corp.ad.internal.movie.partialcache.C1459b) obj;
        com.five_corp.ad.internal.movie.x xVar = this.f1976a;
        if (xVar.o == 13) {
            return;
        }
        com.five_corp.ad.internal.movie.x.a(xVar, c1459b);
    }
}
