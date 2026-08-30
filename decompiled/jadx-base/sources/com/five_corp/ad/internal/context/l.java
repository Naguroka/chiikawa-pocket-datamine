package com.five_corp.ad.internal.context;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.context.j f1890a;
    public final com.five_corp.ad.internal.ad.a b;
    public final java.lang.String c;
    public final com.five_corp.ad.internal.context.t d;
    public final com.five_corp.ad.internal.ad.format_config.a e;
    public final com.five_corp.ad.internal.context.h f;
    public final com.five_corp.ad.internal.cache.q g;
    public final com.five_corp.ad.internal.cache.f h;
    public final com.five_corp.ad.internal.beacon.e i;
    public final android.os.Looper j;
    public long k = 0;

    public l(com.five_corp.ad.internal.context.j jVar, java.lang.String str, com.five_corp.ad.internal.context.t tVar, com.five_corp.ad.internal.ad.format_config.a aVar, com.five_corp.ad.internal.context.h hVar, com.five_corp.ad.internal.cache.q qVar, com.five_corp.ad.internal.beacon.e eVar, android.os.Looper looper) {
        this.f1890a = jVar;
        this.b = jVar.f1888a;
        this.c = str;
        this.d = tVar;
        this.e = aVar;
        this.f = hVar;
        this.g = qVar;
        this.h = new com.five_corp.ad.internal.cache.f(qVar);
        this.i = eVar;
        this.j = looper;
    }

    public final synchronized long a() {
        return this.k;
    }
}
