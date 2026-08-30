package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
enum DirectExecutor implements java.util.concurrent.Executor {
    INSTANCE;

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "MoreExecutors.directExecutor()";
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable command) {
        command.run();
    }
}
