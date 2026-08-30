package com.five_corp.ad.internal.http.auxcache;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f1907a;
    public final /* synthetic */ com.five_corp.ad.internal.http.auxcache.i b;

    public a(com.five_corp.ad.internal.http.auxcache.i iVar, java.util.List list) {
        this.b = iVar;
        this.f1907a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = this.f1907a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            com.five_corp.ad.internal.http.auxcache.k kVarA = com.five_corp.ad.internal.http.auxcache.i.a(this.b, new com.five_corp.ad.internal.http.a((com.five_corp.ad.internal.ad.a) it.next(), null, 1));
            if (kVarA != null) {
                this.b.i.b.addLast(kVarA);
                z = true;
            }
        }
        if (z) {
            com.five_corp.ad.internal.http.auxcache.i.a(this.b);
        }
    }
}
