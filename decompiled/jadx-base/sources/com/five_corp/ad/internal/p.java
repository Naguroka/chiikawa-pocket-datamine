package com.five_corp.ad.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f2043a = new java.lang.Object();
    public com.five_corp.ad.internal.s b = null;

    public final boolean a() {
        boolean z;
        synchronized (this.f2043a) {
            z = this.b == null;
        }
        return z;
    }

    public final void a(com.five_corp.ad.internal.s sVar) {
        sVar.b();
        synchronized (this.f2043a) {
            this.b = sVar;
        }
    }
}
