package com.five_corp.ad.internal.storage;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2056a;
    public final /* synthetic */ com.five_corp.ad.internal.storage.k b;

    public h(com.five_corp.ad.internal.storage.k kVar, int i) {
        this.b = kVar;
        this.f2056a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.storage.k.a(this.b, this.f2056a);
    }
}
