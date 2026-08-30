package com.five_corp.ad.internal.movie.exoplayer;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends com.five_corp.ad.internal.movie.exoplayer.h {
    public l(com.five_corp.ad.internal.movie.exoplayer.o oVar, com.five_corp.ad.internal.movie.exoplayer.n nVar, com.five_corp.ad.internal.movie.exoplayer.c cVar) {
        super(oVar, nVar, cVar);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.m
    public final com.five_corp.ad.internal.movie.exoplayer.m e() {
        com.five_corp.ad.internal.movie.exoplayer.q qVar = (com.five_corp.ad.internal.movie.exoplayer.q) this.b;
        qVar.a();
        qVar.f1973a.play();
        com.five_corp.ad.internal.view.D d = qVar.c;
        d.e.post(new com.five_corp.ad.internal.view.x(d));
        ((com.five_corp.ad.internal.movie.exoplayer.a) this.c).h(b());
        return new com.five_corp.ad.internal.movie.exoplayer.i(this.f1970a, this.b, this.c);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.m
    public final com.five_corp.ad.internal.movie.exoplayer.m f() {
        com.five_corp.ad.internal.movie.exoplayer.q qVar = (com.five_corp.ad.internal.movie.exoplayer.q) this.b;
        qVar.a();
        qVar.f1973a.pause();
        com.five_corp.ad.internal.view.D d = qVar.c;
        d.e.post(new com.five_corp.ad.internal.view.y(d));
        ((com.five_corp.ad.internal.movie.exoplayer.a) this.c).g(b());
        return new com.five_corp.ad.internal.movie.exoplayer.k(this.f1970a, this.b, this.c);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.h, com.five_corp.ad.internal.movie.exoplayer.m
    public final com.five_corp.ad.internal.movie.exoplayer.m h() {
        ((com.five_corp.ad.internal.movie.exoplayer.a) this.c).g(b());
        return super.h();
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.m
    public final com.five_corp.ad.internal.movie.exoplayer.m i() {
        return this;
    }
}
