package com.five_corp.ad.internal.http.movcache;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.http.movcache.n f1929a;
    public final /* synthetic */ com.five_corp.ad.internal.http.movcache.h b;

    public f(com.five_corp.ad.internal.http.movcache.h hVar, com.five_corp.ad.internal.http.movcache.n nVar) {
        this.b = hVar;
        this.f1929a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.g.remove(this.f1929a);
        this.b.c();
    }
}
