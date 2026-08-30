package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes5.dex */
public enum UiExecutor implements java.util.concurrent.Executor {
    INSTANCE;

    private static final android.os.Handler HANDLER = new android.os.Handler(android.os.Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        HANDLER.post(runnable);
    }
}
