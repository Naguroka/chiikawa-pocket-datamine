package com.five_corp.ad.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.FiveAdInterface f1782a;
    public final java.util.concurrent.atomic.AtomicReference b = new java.util.concurrent.atomic.AtomicReference(null);
    public final java.util.concurrent.atomic.AtomicReference c = new java.util.concurrent.atomic.AtomicReference(null);
    public final java.util.concurrent.atomic.AtomicReference d = new java.util.concurrent.atomic.AtomicReference(null);
    public final java.util.concurrent.atomic.AtomicReference e = new java.util.concurrent.atomic.AtomicReference(null);
    public final java.util.concurrent.atomic.AtomicReference f = new java.util.concurrent.atomic.AtomicReference(null);

    public D(com.five_corp.ad.FiveAdInterface fiveAdInterface) {
        this.f1782a = fiveAdInterface;
    }

    public final void a() {
        com.five_corp.ad.internal.z zVar = (com.five_corp.ad.internal.z) this.e.get();
        if (zVar != null) {
            zVar.c();
        }
    }

    public final void b() {
        com.five_corp.ad.internal.z zVar = (com.five_corp.ad.internal.z) this.e.get();
        if (zVar != null) {
            zVar.b();
        }
    }
}
