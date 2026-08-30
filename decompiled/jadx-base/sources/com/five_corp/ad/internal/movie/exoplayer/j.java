package com.five_corp.ad.internal.movie.exoplayer;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends com.five_corp.ad.internal.movie.exoplayer.h {
    public j(com.five_corp.ad.internal.movie.exoplayer.o oVar, com.five_corp.ad.internal.movie.exoplayer.n nVar, com.five_corp.ad.internal.movie.exoplayer.c cVar) {
        super(oVar, nVar, cVar);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.h, com.five_corp.ad.internal.movie.exoplayer.m
    public final com.five_corp.ad.internal.movie.exoplayer.m a() {
        return this;
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.m
    public final com.five_corp.ad.internal.movie.exoplayer.m e() {
        com.five_corp.ad.internal.movie.exoplayer.q qVar = (com.five_corp.ad.internal.movie.exoplayer.q) this.b;
        qVar.a();
        com.five_corp.ad.internal.view.D d = qVar.c;
        d.e.post(new com.five_corp.ad.internal.view.w(d));
        ((com.five_corp.ad.internal.movie.exoplayer.a) this.c).n();
        return new com.five_corp.ad.internal.movie.exoplayer.g(this.f1970a, this.b, this.c);
    }
}
