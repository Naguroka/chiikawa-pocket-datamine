package com.five_corp.ad.internal.http.movcache;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1930a;
    public final /* synthetic */ com.five_corp.ad.internal.http.movcache.h b;

    public g(com.five_corp.ad.internal.http.movcache.h hVar, java.lang.Object obj) {
        this.b = hVar;
        this.f1930a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1930a.equals(this.b.h)) {
            com.five_corp.ad.internal.http.movcache.h.a(this.b);
        }
    }
}
