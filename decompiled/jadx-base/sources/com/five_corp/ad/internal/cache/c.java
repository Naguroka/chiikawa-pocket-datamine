package com.five_corp.ad.internal.cache;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.cache.e f1864a;

    public c(com.five_corp.ad.internal.cache.e eVar) {
        this.f1864a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1864a.a(new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.N, null, null, null));
    }
}
