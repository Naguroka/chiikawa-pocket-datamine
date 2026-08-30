package com.five_corp.ad.internal.http.auxcache;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.http.auxcache.i f1910a;

    public d(com.five_corp.ad.internal.http.auxcache.i iVar) {
        this.f1910a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.http.auxcache.i iVar = this.f1910a;
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
