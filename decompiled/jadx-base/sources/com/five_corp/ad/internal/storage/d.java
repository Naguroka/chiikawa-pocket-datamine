package com.five_corp.ad.internal.storage;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.storage.a f2052a;

    public d(com.five_corp.ad.internal.storage.a aVar) {
        this.f2052a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.storage.a aVar = this.f2052a;
        ((com.five_corp.ad.internal.storage.c) aVar.f2050a).a(aVar.b, new byte[0]);
    }
}
