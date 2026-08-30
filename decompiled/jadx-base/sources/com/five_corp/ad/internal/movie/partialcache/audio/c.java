package com.five_corp.ad.internal.movie.partialcache.audio;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements com.five_corp.ad.internal.movie.partialcache.audio.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.os.Handler f1993a;
    public final com.five_corp.ad.internal.movie.partialcache.C1459b b;
    public final com.five_corp.ad.internal.movie.x c;
    public int d = 1;

    public c(android.os.Looper looper, com.five_corp.ad.internal.movie.partialcache.C1459b c1459b, com.five_corp.ad.internal.movie.x xVar) {
        this.f1993a = new android.os.Handler(looper);
        this.b = c1459b;
        this.c = xVar;
    }

    public final void a(com.five_corp.ad.internal.movie.partialcache.C1459b c1459b) {
        int iA = com.five_corp.ad.e.a(this.d);
        int i = 1;
        if (iA != 1) {
            i = 7;
            if (iA != 7) {
                i = 3;
                if (iA != 3 && iA != 4 && iA != 5) {
                    return;
                } else {
                    c1459b.c.b();
                }
            }
        }
        this.d = i;
    }
}
