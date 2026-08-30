package com.adjust.sdk.scheduler;

/* JADX INFO: loaded from: classes3.dex */
public interface ThreadExecutor {
    void submit(java.lang.Runnable runnable);

    void teardown();
}
