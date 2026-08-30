package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ExecutorC0844Lx implements java.util.concurrent.Executor {
    public static final com.facebook.ads.redexgen.core.ExecutorC0844Lx A01 = new com.facebook.ads.redexgen.core.ExecutorC0844Lx();
    public final android.os.Handler A00 = new android.os.Handler(android.os.Looper.getMainLooper());

    public static void A00(java.lang.Runnable runnable) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            runnable.run();
        } else {
            A01.execute(runnable);
        }
    }

    public final android.os.Handler A01() {
        return this.A00;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.A00.post(runnable);
    }
}
