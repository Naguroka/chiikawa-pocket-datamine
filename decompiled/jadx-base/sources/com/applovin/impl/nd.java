package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class nd extends com.applovin.impl.id {
    public final int c;
    public final boolean d;

    public nd(java.lang.Throwable th, com.applovin.impl.jd jdVar, android.view.Surface surface) {
        super(th, jdVar);
        this.c = java.lang.System.identityHashCode(surface);
        this.d = surface == null || surface.isValid();
    }
}
