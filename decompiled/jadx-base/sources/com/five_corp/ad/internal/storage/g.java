package com.five_corp.ad.internal.storage;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2055a;
    public final /* synthetic */ com.five_corp.ad.internal.storage.k b;

    public g(com.five_corp.ad.internal.storage.k kVar, int i) {
        this.b = kVar;
        this.f2055a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.storage.k.a(this.b, this.f2055a);
    }
}
