package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes5.dex */
class CustomThreadFactory implements java.util.concurrent.ThreadFactory {
    private static final java.util.concurrent.ThreadFactory DEFAULT = java.util.concurrent.Executors.defaultThreadFactory();
    private final java.lang.String namePrefix;
    private final android.os.StrictMode.ThreadPolicy policy;
    private final int priority;
    private final java.util.concurrent.atomic.AtomicLong threadCount = new java.util.concurrent.atomic.AtomicLong();

    CustomThreadFactory(java.lang.String str, int i, @javax.annotation.Nullable android.os.StrictMode.ThreadPolicy threadPolicy) {
        this.namePrefix = str;
        this.priority = i;
        this.policy = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(final java.lang.Runnable runnable) {
        java.lang.Thread threadNewThread = DEFAULT.newThread(new java.lang.Runnable() { // from class: com.google.firebase.concurrent.CustomThreadFactory$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m818x29e2b42(runnable);
            }
        });
        threadNewThread.setName(java.lang.String.format(java.util.Locale.ROOT, "%s Thread #%d", this.namePrefix, java.lang.Long.valueOf(this.threadCount.getAndIncrement())));
        return threadNewThread;
    }

    /* JADX INFO: renamed from: lambda$newThread$0$com-google-firebase-concurrent-CustomThreadFactory, reason: not valid java name */
    /* synthetic */ void m818x29e2b42(java.lang.Runnable runnable) {
        android.os.Process.setThreadPriority(this.priority);
        android.os.StrictMode.ThreadPolicy threadPolicy = this.policy;
        if (threadPolicy != null) {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }
}
