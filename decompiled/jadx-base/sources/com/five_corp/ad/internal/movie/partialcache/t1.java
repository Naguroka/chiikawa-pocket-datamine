package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: loaded from: classes4.dex */
public final class t1 implements com.five_corp.ad.internal.movie.partialcache.w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.partialcache.u1 f2022a;

    public t1(com.five_corp.ad.internal.movie.partialcache.u1 u1Var) {
        this.f2022a = u1Var;
    }

    @Override // com.five_corp.ad.internal.movie.partialcache.w1
    public final void a(java.lang.Object obj) {
        com.five_corp.ad.internal.movie.partialcache.C1467f c1467f = ((com.five_corp.ad.internal.movie.partialcache.v1) obj).f2024a;
        if (c1467f != null) {
            c1467f.d();
        }
        this.f2022a.g.removeCallbacksAndMessages(null);
        com.five_corp.ad.internal.movie.partialcache.u1 u1Var = this.f2022a;
        u1Var.g = null;
        u1Var.h = null;
    }
}
