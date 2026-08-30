package com.five_corp.ad.internal.cache;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.cache.e f1867a;
    public final /* synthetic */ com.five_corp.ad.internal.s b;

    public g(com.five_corp.ad.internal.cache.e eVar, com.five_corp.ad.internal.s sVar) {
        this.f1867a = eVar;
        this.b = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1867a.a(this.b);
    }
}
