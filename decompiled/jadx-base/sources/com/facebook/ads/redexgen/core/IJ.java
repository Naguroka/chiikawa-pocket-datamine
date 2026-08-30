package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class IJ implements java.util.concurrent.ThreadFactory {
    public final /* synthetic */ java.lang.String A00;

    public IJ(java.lang.String str) {
        this.A00 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, this.A00);
    }
}
