package com.bytedance.sdk.component.IL.bg.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class zx extends com.bytedance.sdk.component.IL.bg.eqN {
    private java.util.concurrent.ExecutorService bg;
    private java.util.List<com.bytedance.sdk.component.IL.bg.IL> IL = new java.util.concurrent.CopyOnWriteArrayList();
    private java.util.List<com.bytedance.sdk.component.IL.bg.IL> bX = new java.util.concurrent.CopyOnWriteArrayList();
    private java.util.concurrent.atomic.AtomicInteger eqN = new java.util.concurrent.atomic.AtomicInteger(64);

    public zx() {
        if (this.bg == null) {
            this.bg = new java.util.concurrent.ThreadPoolExecutor(0, Integer.MAX_VALUE, 20L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), new java.util.concurrent.ThreadFactory() { // from class: com.bytedance.sdk.component.IL.bg.bg.bg.zx.1
                @Override // java.util.concurrent.ThreadFactory
                public java.lang.Thread newThread(java.lang.Runnable runnable) {
                    java.lang.Thread thread = new java.lang.Thread(runnable, "systemHttp Dispatcher");
                    thread.setDaemon(false);
                    thread.setPriority(10);
                    return thread;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.IL.bg.eqN
    public java.util.concurrent.ExecutorService IL() {
        return this.bg;
    }

    @Override // com.bytedance.sdk.component.IL.bg.eqN
    public void bg(int i) {
        this.eqN.set(i);
    }

    @Override // com.bytedance.sdk.component.IL.bg.eqN
    public java.util.List<com.bytedance.sdk.component.IL.bg.IL> bX() {
        return this.IL;
    }

    @Override // com.bytedance.sdk.component.IL.bg.eqN
    public java.util.List<com.bytedance.sdk.component.IL.bg.IL> eqN() {
        return this.bX;
    }

    @Override // com.bytedance.sdk.component.IL.bg.eqN
    public int bg() {
        return this.eqN.get();
    }
}
