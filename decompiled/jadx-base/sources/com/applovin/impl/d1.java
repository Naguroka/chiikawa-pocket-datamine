package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d1 implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.j f700a;
    protected final java.lang.String b;
    protected final com.applovin.impl.sdk.n c;
    protected final java.util.concurrent.atomic.AtomicBoolean e = new java.util.concurrent.atomic.AtomicBoolean();
    private final android.content.Context d = com.applovin.impl.sdk.j.m();

    public android.content.Context a() {
        return this.d;
    }

    public d1(java.lang.String str, com.applovin.impl.sdk.j jVar) {
        this.b = str;
        this.f700a = jVar;
        this.c = jVar.I();
    }

    public void a(boolean z) {
        this.e.set(z);
    }
}
