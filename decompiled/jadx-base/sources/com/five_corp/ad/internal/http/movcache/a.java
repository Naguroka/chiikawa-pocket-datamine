package com.five_corp.ad.internal.http.movcache;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f1924a;
    public final /* synthetic */ com.five_corp.ad.internal.http.movcache.h b;

    public a(com.five_corp.ad.internal.http.movcache.h hVar, java.util.List list) {
        this.b = hVar;
        this.f1924a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = this.f1924a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            com.five_corp.ad.internal.util.f fVarA = com.five_corp.ad.internal.http.movcache.h.a(this.b, new com.five_corp.ad.internal.http.a((com.five_corp.ad.internal.ad.a) it.next(), null, 1));
            if (fVarA.f2085a && ((java.lang.Boolean) fVarA.c).booleanValue()) {
                z = true;
            }
        }
        if (z) {
            com.five_corp.ad.internal.http.movcache.h.a(this.b);
        }
    }
}
