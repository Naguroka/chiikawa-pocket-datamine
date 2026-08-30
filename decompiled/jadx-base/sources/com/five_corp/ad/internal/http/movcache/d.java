package com.five_corp.ad.internal.http.movcache;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.http.movcache.h f1927a;

    public d(com.five_corp.ad.internal.http.movcache.h hVar) {
        this.f1927a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.http.movcache.h.a(this.f1927a);
    }
}
