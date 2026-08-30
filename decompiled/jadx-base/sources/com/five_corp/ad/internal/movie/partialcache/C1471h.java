package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: renamed from: com.five_corp.ad.internal.movie.partialcache.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1471h implements android.animation.TimeAnimator.TimeListener {
    public final com.five_corp.ad.internal.movie.partialcache.InterfaceC1469g f;
    public boolean c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.animation.TimeAnimator f2004a = null;
    public long d = 0;
    public long e = 0;
    public boolean b = true;

    public C1471h(com.five_corp.ad.internal.movie.partialcache.InterfaceC1469g interfaceC1469g) {
        this.f = interfaceC1469g;
    }

    public final void a(long j) {
        this.d = j;
        this.e = 0L;
        this.b = true;
        android.animation.TimeAnimator timeAnimator = new android.animation.TimeAnimator();
        this.f2004a = timeAnimator;
        timeAnimator.setTimeListener(this);
        this.f2004a.start();
    }

    @Override // android.animation.TimeAnimator.TimeListener
    public final void onTimeUpdate(android.animation.TimeAnimator timeAnimator, long j, long j2) {
        if (this.c) {
            return;
        }
        if (this.b) {
            this.b = false;
            com.five_corp.ad.internal.movie.partialcache.InterfaceC1469g interfaceC1469g = this.f;
            long j3 = this.d;
            com.five_corp.ad.internal.movie.x xVar = (com.five_corp.ad.internal.movie.x) interfaceC1469g;
            xVar.getClass();
            xVar.n.post(new com.five_corp.ad.internal.movie.RunnableC1455l(xVar, new com.five_corp.ad.internal.movie.u(xVar, j3)));
            return;
        }
        long j4 = (j2 * 1000) + this.e;
        this.e = j4;
        com.five_corp.ad.internal.movie.partialcache.InterfaceC1469g interfaceC1469g2 = this.f;
        long j5 = this.d + j4;
        com.five_corp.ad.internal.movie.x xVar2 = (com.five_corp.ad.internal.movie.x) interfaceC1469g2;
        xVar2.getClass();
        xVar2.n.post(new com.five_corp.ad.internal.movie.RunnableC1455l(xVar2, new com.five_corp.ad.internal.movie.u(xVar2, j5)));
    }

    public final void a() {
        android.animation.TimeAnimator timeAnimator = this.f2004a;
        if (timeAnimator == null) {
            return;
        }
        timeAnimator.end();
        this.f2004a = null;
    }
}
