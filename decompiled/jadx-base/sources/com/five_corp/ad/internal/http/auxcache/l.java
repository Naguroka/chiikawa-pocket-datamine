package com.five_corp.ad.internal.http.auxcache;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1918a;
    public final java.util.ArrayDeque b = new java.util.ArrayDeque();
    public java.util.HashSet c = new java.util.HashSet();

    public l(long j) {
        this.f1918a = j;
    }

    public static com.five_corp.ad.internal.http.auxcache.l b() {
        return new com.five_corp.ad.internal.http.auxcache.l(30000L);
    }

    public static com.five_corp.ad.internal.http.auxcache.l c() {
        return new com.five_corp.ad.internal.http.auxcache.l(androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    public static com.five_corp.ad.internal.http.auxcache.l d() {
        return new com.five_corp.ad.internal.http.auxcache.l(500L);
    }

    public final long a() {
        long j;
        int iMin = 10;
        if (this.c.isEmpty()) {
            j = this.f1918a;
        } else {
            java.util.Iterator it = this.c.iterator();
            while (it.hasNext()) {
                iMin = java.lang.Math.min(iMin, ((com.five_corp.ad.internal.http.auxcache.k) it.next()).i);
            }
            j = this.f1918a;
        }
        return j << iMin;
    }

    public final void e() {
        for (com.five_corp.ad.internal.http.auxcache.k kVar : this.c) {
            kVar.i++;
            java.util.Iterator it = kVar.f.iterator();
            while (it.hasNext()) {
                kVar.e.addLast((com.five_corp.ad.internal.ad.w) it.next());
            }
            kVar.f = new java.util.ArrayList();
            this.b.addLast(kVar);
        }
        this.c = new java.util.HashSet();
    }
}
