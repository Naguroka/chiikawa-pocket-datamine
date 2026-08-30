package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
enum zzcp implements java.util.concurrent.Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
