package com.bytedance.sdk.component.zx.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bg implements java.util.concurrent.ThreadFactory {
    private final java.util.concurrent.atomic.AtomicInteger IL = new java.util.concurrent.atomic.AtomicInteger(1);
    private final java.lang.ThreadGroup bg;

    public bg(java.lang.String str) {
        this.bg = new java.lang.ThreadGroup("tt_img_".concat(java.lang.String.valueOf(str)));
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(this.bg, runnable, "tt_img_" + this.IL.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
