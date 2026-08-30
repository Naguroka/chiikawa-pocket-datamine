package com.five_corp.ad.internal.bgtask;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.bgtask.e f1855a;

    public c(com.five_corp.ad.internal.bgtask.e eVar) {
        this.f1855a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.bgtask.e.a(this.f1855a, false);
    }
}
