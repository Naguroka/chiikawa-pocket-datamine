package com.five_corp.ad.internal.soundstate;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements com.five_corp.ad.internal.cache.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f2049a = new java.lang.Object();
    public com.five_corp.ad.internal.soundstate.d b;

    public e(int i) {
        this.b = new com.five_corp.ad.internal.soundstate.d(i, a((com.five_corp.ad.internal.media_config.a) null));
    }

    public final com.five_corp.ad.internal.soundstate.d a() {
        com.five_corp.ad.internal.soundstate.d dVar;
        synchronized (this.f2049a) {
            dVar = this.b;
        }
        return dVar;
    }

    public static int a(com.five_corp.ad.internal.media_config.a aVar) {
        if (aVar == null) {
            return 1;
        }
        return aVar.c ? 2 : 3;
    }

    @Override // com.five_corp.ad.internal.cache.y
    public final void a(com.five_corp.ad.internal.cache.x xVar) {
        int iA = a(xVar.b);
        synchronized (this.f2049a) {
            this.b = new com.five_corp.ad.internal.soundstate.d(this.b.f2048a, iA);
        }
    }
}
