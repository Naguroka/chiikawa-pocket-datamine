package com.five_corp.ad.internal.cache;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.cache.e f1865a;
    public final /* synthetic */ com.five_corp.ad.internal.util.f b;

    public d(com.five_corp.ad.internal.cache.e eVar, com.five_corp.ad.internal.util.f fVar) {
        this.f1865a = eVar;
        this.b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1865a.a(this.b.b);
    }
}
