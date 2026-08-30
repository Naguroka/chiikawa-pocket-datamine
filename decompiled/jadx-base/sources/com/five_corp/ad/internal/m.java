package com.five_corp.ad.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements com.five_corp.ad.internal.cache.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.context.g f1948a;
    public final com.five_corp.ad.internal.E b;
    public final com.five_corp.ad.internal.l c;
    public final com.five_corp.ad.internal.cache.w d;
    public final com.five_corp.ad.internal.bgtask.b e;
    public final com.five_corp.ad.internal.http.d f;
    public final com.five_corp.ad.internal.p g;
    public final java.lang.Object h = new java.lang.Object();
    public boolean i = false;
    public com.five_corp.ad.internal.cache.x j;

    public m(com.five_corp.ad.internal.context.g gVar, com.five_corp.ad.internal.E e, com.five_corp.ad.internal.l lVar, com.five_corp.ad.internal.cache.w wVar, com.five_corp.ad.internal.bgtask.b bVar, com.five_corp.ad.internal.http.d dVar, com.five_corp.ad.internal.p pVar, com.five_corp.ad.internal.cache.x xVar) {
        this.f1948a = gVar;
        this.b = e;
        this.c = lVar;
        this.d = wVar;
        this.e = bVar;
        this.f = dVar;
        this.g = pVar;
        this.j = xVar;
    }

    @Override // com.five_corp.ad.internal.cache.y
    public final void a(com.five_corp.ad.internal.cache.x xVar) {
        synchronized (this.h) {
            this.j = xVar;
        }
    }

    public final void a(int i) {
        synchronized (this.h) {
            if (this.i) {
                return;
            }
            this.i = true;
            this.e.a(new com.five_corp.ad.internal.C1441i(this.f1948a, this.b, this.c, this.d, this.f, this.g, i, this));
        }
    }
}
