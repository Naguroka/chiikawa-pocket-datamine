package com.bytedance.sdk.component.zx.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bX {
    private static final java.util.concurrent.TimeUnit bg = java.util.concurrent.TimeUnit.SECONDS;

    public static java.util.concurrent.ExecutorService bg() {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(1, 2, 30L, bg, new java.util.concurrent.LinkedBlockingQueue(), new com.bytedance.sdk.component.zx.bg.bg("default"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
