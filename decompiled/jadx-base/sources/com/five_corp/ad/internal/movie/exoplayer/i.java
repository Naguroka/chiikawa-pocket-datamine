package com.five_corp.ad.internal.movie.exoplayer;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends com.five_corp.ad.internal.movie.exoplayer.h {
    public i(com.five_corp.ad.internal.movie.exoplayer.o oVar, com.five_corp.ad.internal.movie.exoplayer.n nVar, com.five_corp.ad.internal.movie.exoplayer.c cVar) {
        super(oVar, nVar, cVar);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.m
    public final com.five_corp.ad.internal.movie.exoplayer.m c() {
        com.five_corp.ad.internal.movie.exoplayer.q qVar = (com.five_corp.ad.internal.movie.exoplayer.q) this.b;
        com.five_corp.ad.internal.view.D d = qVar.c;
        d.e.post(new com.five_corp.ad.internal.view.A(d));
        qVar.a();
        if (qVar.e != null) {
            com.five_corp.ad.internal.movie.exoplayer.p pVar = new com.five_corp.ad.internal.movie.exoplayer.p(qVar.e.longValue() + android.os.SystemClock.uptimeMillis());
            qVar.f = pVar;
            qVar.b(pVar);
        }
        ((com.five_corp.ad.internal.movie.exoplayer.a) this.c).j(b());
        return new com.five_corp.ad.internal.movie.exoplayer.l(this.f1970a, this.b, this.c);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.m
    public final com.five_corp.ad.internal.movie.exoplayer.m d() {
        int currentPosition = (int) ((com.five_corp.ad.internal.movie.exoplayer.q) this.b).f1973a.getCurrentPosition();
        boolean z = ((com.five_corp.ad.internal.movie.exoplayer.q) this.b).f1973a.getVolume() > 0.0f;
        com.five_corp.ad.internal.view.D d = ((com.five_corp.ad.internal.movie.exoplayer.q) this.b).c;
        d.e.post(new com.five_corp.ad.internal.view.z(d));
        ((com.five_corp.ad.internal.movie.exoplayer.a) this.c).f(currentPosition);
        com.five_corp.ad.internal.movie.exoplayer.q qVar = (com.five_corp.ad.internal.movie.exoplayer.q) this.b;
        qVar.a();
        qVar.f1973a.release();
        ((com.five_corp.ad.internal.movie.exoplayer.a) this.c).o();
        return new com.five_corp.ad.internal.movie.exoplayer.d(this.f1970a, this.c, currentPosition, z);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.m
    public final com.five_corp.ad.internal.movie.exoplayer.m f() {
        com.five_corp.ad.internal.movie.exoplayer.q qVar = (com.five_corp.ad.internal.movie.exoplayer.q) this.b;
        qVar.a();
        qVar.f1973a.pause();
        com.five_corp.ad.internal.view.D d = qVar.c;
        d.e.post(new com.five_corp.ad.internal.view.y(d));
        ((com.five_corp.ad.internal.movie.exoplayer.a) this.c).g(b());
        return new com.five_corp.ad.internal.movie.exoplayer.g(this.f1970a, this.b, this.c);
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
