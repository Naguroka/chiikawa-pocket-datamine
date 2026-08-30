package com.bytedance.sdk.component.Kg;

/* JADX INFO: loaded from: classes3.dex */
public class WR implements java.util.concurrent.ThreadFactory {
    public static final java.lang.String THREAD_GROUP_NAME_PRE = "csj_g_";
    public static final java.lang.String THREAD_NAME_PRE = "csj_";
    protected final java.lang.String IL;
    protected int bX;
    protected final java.lang.ThreadGroup bg;
    private final java.util.concurrent.atomic.AtomicInteger eqN;

    public WR(java.lang.String str) {
        this(5, str);
    }

    public WR(int i, java.lang.String str) {
        this.eqN = new java.util.concurrent.atomic.AtomicInteger(1);
        this.bX = i;
        this.bg = new java.lang.ThreadGroup(THREAD_GROUP_NAME_PRE.concat(java.lang.String.valueOf(str)));
        this.IL = THREAD_NAME_PRE.concat(java.lang.String.valueOf(str));
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread threadBg = bg(this.bg, runnable, this.IL + this.eqN.getAndIncrement());
        if (threadBg.isDaemon()) {
            threadBg.setDaemon(false);
        }
        int i = this.bX;
        if (i > 10 || i <= 0) {
            this.bX = 5;
        }
        threadBg.setPriority(this.bX);
        return threadBg;
    }

    protected java.lang.Thread bg(java.lang.ThreadGroup threadGroup, java.lang.Runnable runnable, java.lang.String str) {
        return new java.lang.Thread(threadGroup, runnable, str);
    }
}
