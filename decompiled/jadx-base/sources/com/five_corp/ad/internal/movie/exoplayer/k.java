package com.five_corp.ad.internal.movie.exoplayer;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends com.five_corp.ad.internal.movie.exoplayer.h {
    public k(com.five_corp.ad.internal.movie.exoplayer.o oVar, com.five_corp.ad.internal.movie.exoplayer.n nVar, com.five_corp.ad.internal.movie.exoplayer.c cVar) {
        super(oVar, nVar, cVar);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.m
    public final com.five_corp.ad.internal.movie.exoplayer.m e() {
        com.five_corp.ad.internal.view.D d = ((com.five_corp.ad.internal.movie.exoplayer.q) this.b).c;
        d.e.post(new com.five_corp.ad.internal.view.B(d));
        ((com.five_corp.ad.internal.movie.exoplayer.a) this.c).h(b());
        return new com.five_corp.ad.internal.movie.exoplayer.g(this.f1970a, this.b, this.c);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.m
    public final com.five_corp.ad.internal.movie.exoplayer.m f() {
        return this;
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.m
    public final com.five_corp.ad.internal.movie.exoplayer.m i() {
        com.five_corp.ad.internal.movie.exoplayer.q qVar = (com.five_corp.ad.internal.movie.exoplayer.q) this.b;
        qVar.f1973a.play();
        qVar.a();
        if (qVar.e != null) {
            com.five_corp.ad.internal.movie.exoplayer.p pVar = new com.five_corp.ad.internal.movie.exoplayer.p(qVar.e.longValue() + android.os.SystemClock.uptimeMillis());
            qVar.f = pVar;
            qVar.b(pVar);
        }
        ((com.five_corp.ad.internal.movie.exoplayer.a) this.c).i(b());
        return new com.five_corp.ad.internal.movie.exoplayer.l(this.f1970a, this.b, this.c);
    }
}
