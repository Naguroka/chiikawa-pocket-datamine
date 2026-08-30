package com.five_corp.ad.internal.http.auxcache;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1914a;
    public final /* synthetic */ com.five_corp.ad.internal.http.auxcache.i b;

    public h(com.five_corp.ad.internal.http.auxcache.i iVar, java.lang.Object obj) {
        this.b = iVar;
        this.f1914a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1914a.equals(this.b.f)) {
            com.five_corp.ad.internal.http.auxcache.i iVar = this.b;
            iVar.f = null;
            if (iVar.g) {
                return;
            }
            iVar.g = true;
            iVar.i.e();
            iVar.j.e();
            iVar.k.e();
            iVar.a((com.five_corp.ad.internal.http.auxcache.j) null);
        }
    }
}
