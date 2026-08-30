package com.five_corp.ad.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class G implements com.five_corp.ad.internal.cache.y {
    public static final /* synthetic */ int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.E f1785a;
    public final com.five_corp.ad.internal.l b;
    public final com.five_corp.ad.internal.http.d c;
    public final com.five_corp.ad.internal.bgtask.b d;
    public final com.five_corp.ad.internal.bgtask.b e;
    public java.util.Set f = java.util.Collections.emptySet();

    static {
        com.five_corp.ad.internal.G.class.toString();
    }

    public G(com.five_corp.ad.internal.E e, com.five_corp.ad.internal.l lVar, com.five_corp.ad.internal.http.d dVar, com.five_corp.ad.internal.bgtask.b bVar, com.five_corp.ad.internal.bgtask.b bVar2) {
        this.f1785a = e;
        this.b = lVar;
        this.c = dVar;
        this.d = bVar;
        this.e = bVar2;
    }

    @Override // com.five_corp.ad.internal.cache.y
    public final void a(com.five_corp.ad.internal.cache.x xVar) {
        if (xVar.b != null) {
            java.util.HashSet hashSet = new java.util.HashSet();
            this.f = hashSet;
            hashSet.addAll(xVar.b.i);
            boolean z = xVar.b.d;
        }
    }

    public final void a(com.five_corp.ad.internal.beacon.b bVar) {
        if (this.f.contains(java.lang.Integer.valueOf(bVar.d.f2045a.f2075a))) {
            return;
        }
        this.d.a(new com.five_corp.ad.internal.bgtask.f(bVar, this.f1785a, this.c));
    }

    public final void a(com.five_corp.ad.internal.beacon.a aVar) {
        this.d.a(new com.five_corp.ad.internal.bgtask.i(aVar, this.f1785a, this.c));
    }
}
