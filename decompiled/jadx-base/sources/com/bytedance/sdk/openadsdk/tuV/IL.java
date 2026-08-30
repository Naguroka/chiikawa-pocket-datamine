package com.bytedance.sdk.openadsdk.tuV;

/* JADX INFO: loaded from: classes4.dex */
public class IL {
    private com.bytedance.sdk.openadsdk.tuV.Kg IL;
    private int eqN;
    private com.bytedance.sdk.openadsdk.tuV.IL.bg zx;
    private java.util.concurrent.ScheduledExecutorService bg = null;
    private long bX = 0;

    public interface bg {
    }

    public IL(com.bytedance.sdk.openadsdk.tuV.Kg kg, int i) {
        this.IL = kg;
        this.eqN = i;
    }

    public void bg(long j) {
        this.bX = j;
    }

    public void bg(int i) {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = java.util.concurrent.Executors.newScheduledThreadPool(1);
        this.bg = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.tuV.IL.1
            @Override // java.lang.Runnable
            public void run() {
                java.lang.System.currentTimeMillis();
                long unused = com.bytedance.sdk.openadsdk.tuV.IL.this.bX;
                if (java.lang.System.currentTimeMillis() - com.bytedance.sdk.openadsdk.tuV.IL.this.bX > com.bytedance.sdk.openadsdk.tuV.IL.this.eqN) {
                    com.bytedance.sdk.openadsdk.tuV.IL.this.bg.shutdown();
                    if (com.bytedance.sdk.openadsdk.tuV.IL.this.IL != null) {
                        com.bytedance.sdk.openadsdk.tuV.IL.this.IL.IL(0, "Automatic detection of stuck");
                    }
                    if (com.bytedance.sdk.openadsdk.tuV.IL.this.zx != null) {
                        com.bytedance.sdk.openadsdk.tuV.IL.bg unused2 = com.bytedance.sdk.openadsdk.tuV.IL.this.zx;
                    }
                }
            }
        }, 0L, i, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public void bg() {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.bg;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }

    public boolean IL() {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.bg;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.isShutdown();
        }
        return true;
    }
}
