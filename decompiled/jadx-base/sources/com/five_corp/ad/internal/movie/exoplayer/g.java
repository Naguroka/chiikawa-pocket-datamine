package com.five_corp.ad.internal.movie.exoplayer;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends com.five_corp.ad.internal.movie.exoplayer.h {
    public g(com.five_corp.ad.internal.movie.exoplayer.o oVar, com.five_corp.ad.internal.movie.exoplayer.n nVar, com.five_corp.ad.internal.movie.exoplayer.c cVar) {
        super(oVar, nVar, cVar);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.m
    public final com.five_corp.ad.internal.movie.exoplayer.m f() {
        return this;
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.m
    public final com.five_corp.ad.internal.movie.exoplayer.m i() {
        com.five_corp.ad.internal.movie.exoplayer.q qVar = (com.five_corp.ad.internal.movie.exoplayer.q) this.b;
        qVar.a();
        qVar.f1973a.play();
        com.five_corp.ad.internal.view.D d = qVar.c;
        d.e.post(new com.five_corp.ad.internal.view.x(d));
        ((com.five_corp.ad.internal.movie.exoplayer.a) this.c).i(b());
        return new com.five_corp.ad.internal.movie.exoplayer.i(this.f1970a, this.b, this.c);
    }
}
