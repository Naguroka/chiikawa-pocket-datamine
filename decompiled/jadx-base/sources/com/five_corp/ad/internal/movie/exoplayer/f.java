package com.five_corp.ad.internal.movie.exoplayer;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends com.five_corp.ad.internal.movie.exoplayer.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.movie.exoplayer.o f1969a;
    public final com.five_corp.ad.internal.movie.exoplayer.c b;
    public final int c;
    public boolean d;

    public f(com.five_corp.ad.internal.movie.exoplayer.o oVar, com.five_corp.ad.internal.movie.exoplayer.c cVar, int i, boolean z) {
        this.f1969a = oVar;
        this.b = cVar;
        this.c = i;
        this.d = z;
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.m
    public final com.five_corp.ad.internal.movie.exoplayer.e a(com.five_corp.ad.internal.s sVar) {
        sVar.b();
        ((com.five_corp.ad.internal.movie.exoplayer.a) this.b).b(this.c, sVar);
        ((com.five_corp.ad.internal.movie.exoplayer.a) this.b).o();
        return new com.five_corp.ad.internal.movie.exoplayer.e(this.c);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.m
    public final int b() {
        return this.c;
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.m
    public final com.five_corp.ad.internal.movie.exoplayer.m g() {
        com.five_corp.ad.internal.movie.exoplayer.q qVarA = this.f1969a.a();
        qVarA.f1973a.seekTo(this.c);
        com.five_corp.ad.internal.view.D d = qVarA.c;
        d.e.post(new com.five_corp.ad.internal.view.v(d));
        qVarA.a();
        if (qVarA.e != null) {
            com.five_corp.ad.internal.movie.exoplayer.p pVar = new com.five_corp.ad.internal.movie.exoplayer.p(qVarA.e.longValue() + android.os.SystemClock.uptimeMillis());
            qVarA.f = pVar;
            qVarA.b(pVar);
        }
        qVarA.f1973a.setVolume(this.d ? 1.0f : 0.0f);
        qVarA.f1973a.prepare();
        return new com.five_corp.ad.internal.movie.exoplayer.j(this.f1969a, qVarA, this.b);
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.m
    public final com.five_corp.ad.internal.movie.exoplayer.m h() {
        return this;
    }

    @Override // com.five_corp.ad.internal.movie.exoplayer.m
    public final void a(boolean z) {
        this.d = z;
    }
}
