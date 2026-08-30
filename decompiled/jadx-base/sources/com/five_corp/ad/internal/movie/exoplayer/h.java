package com.five_corp.ad.internal.movie.exoplayer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h extends com.five_corp.ad.internal.movie.exoplayer.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.movie.exoplayer.o f1970a;
    public final com.five_corp.ad.internal.movie.exoplayer.n b;
    public final com.five_corp.ad.internal.movie.exoplayer.c c;

    public h(com.five_corp.ad.internal.movie.exoplayer.o oVar, com.five_corp.ad.internal.movie.exoplayer.n nVar, com.five_corp.ad.internal.movie.exoplayer.c cVar) {
        this.f1970a = oVar;
        this.b = nVar;
        this.c = cVar;
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.m
    public com.five_corp.ad.internal.movie.exoplayer.m a() {
        com.five_corp.ad.internal.movie.exoplayer.q qVar = (com.five_corp.ad.internal.movie.exoplayer.q) this.b;
        qVar.f1973a.seekTo(0);
        com.five_corp.ad.internal.view.D d = qVar.c;
        d.e.post(new com.five_corp.ad.internal.view.v(d));
        qVar.a();
        if (qVar.e != null) {
            com.five_corp.ad.internal.movie.exoplayer.p pVar = new com.five_corp.ad.internal.movie.exoplayer.p(qVar.e.longValue() + android.os.SystemClock.uptimeMillis());
            qVar.f = pVar;
            qVar.b(pVar);
        }
        return new com.five_corp.ad.internal.movie.exoplayer.j(this.f1970a, this.b, this.c);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.m
    public final int b() {
        return (int) ((com.five_corp.ad.internal.movie.exoplayer.q) this.b).f1973a.getCurrentPosition();
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.m
    public final com.five_corp.ad.internal.movie.exoplayer.m g() {
        return this;
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.m
    public com.five_corp.ad.internal.movie.exoplayer.m h() {
        int currentPosition = (int) ((com.five_corp.ad.internal.movie.exoplayer.q) this.b).f1973a.getCurrentPosition();
        boolean z = ((com.five_corp.ad.internal.movie.exoplayer.q) this.b).f1973a.getVolume() > 0.0f;
        com.five_corp.ad.internal.movie.exoplayer.q qVar = (com.five_corp.ad.internal.movie.exoplayer.q) this.b;
        qVar.a();
        qVar.f1973a.release();
        ((com.five_corp.ad.internal.movie.exoplayer.a) this.c).o();
        return new com.five_corp.ad.internal.movie.exoplayer.f(this.f1970a, this.c, currentPosition, z);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.m
    public final com.five_corp.ad.internal.movie.exoplayer.e a(com.five_corp.ad.internal.s sVar) {
        sVar.b();
        int iB = b();
        com.five_corp.ad.internal.movie.exoplayer.q qVar = (com.five_corp.ad.internal.movie.exoplayer.q) this.b;
        qVar.a();
        qVar.f1973a.release();
        ((com.five_corp.ad.internal.movie.exoplayer.a) this.c).b(iB, sVar);
        ((com.five_corp.ad.internal.movie.exoplayer.a) this.c).o();
        return new com.five_corp.ad.internal.movie.exoplayer.e(iB);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.m
    public final void a(boolean z) {
        ((com.five_corp.ad.internal.movie.exoplayer.q) this.b).f1973a.setVolume(z ? 1.0f : 0.0f);
    }
}
