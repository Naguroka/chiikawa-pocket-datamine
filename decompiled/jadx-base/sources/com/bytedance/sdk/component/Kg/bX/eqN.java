package com.bytedance.sdk.component.Kg.bX;

/* JADX INFO: loaded from: classes3.dex */
public class eqN implements java.util.concurrent.ThreadFactory {
    protected final java.lang.String IL;
    private final java.util.concurrent.atomic.AtomicInteger bX = new java.util.concurrent.atomic.AtomicInteger(1);
    protected final java.lang.ThreadGroup bg;

    public eqN(java.lang.String str) {
        this.bg = new java.lang.ThreadGroup("pag_g_".concat(java.lang.String.valueOf(str)));
        this.IL = bg(str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread threadBg = bg(this.bg, runnable, this.IL + "_" + this.bX.getAndIncrement());
        if (threadBg.isDaemon()) {
            threadBg.setDaemon(false);
        }
        return threadBg;
    }

    protected java.lang.Thread bg(java.lang.ThreadGroup threadGroup, java.lang.Runnable runnable, java.lang.String str) {
        return new java.lang.Thread(threadGroup, runnable, str);
    }

    public static java.lang.String bg(java.lang.String str) {
        return "pag_".concat(java.lang.String.valueOf(str));
    }
}
