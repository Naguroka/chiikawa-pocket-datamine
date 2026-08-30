package com.five_corp.ad.internal.movie;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.x f2038a;

    public v(com.five_corp.ad.internal.movie.x xVar) {
        this.f2038a = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.movie.x xVar = this.f2038a;
        if (xVar.q != null) {
            if (android.os.SystemClock.uptimeMillis() > xVar.p) {
                xVar.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.B0, null, null, null));
            } else {
                xVar.n.postAtTime(new com.five_corp.ad.internal.movie.v(xVar), xVar.q, android.os.SystemClock.uptimeMillis() + 500);
            }
        }
    }
}
