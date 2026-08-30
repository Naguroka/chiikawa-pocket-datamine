package com.five_corp.ad.internal.http.movcache;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.http.movcache.h f1928a;

    public e(com.five_corp.ad.internal.http.movcache.h hVar) {
        this.f1928a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.http.movcache.h hVar = this.f1928a;
        hVar.h = null;
        hVar.c();
    }
}
