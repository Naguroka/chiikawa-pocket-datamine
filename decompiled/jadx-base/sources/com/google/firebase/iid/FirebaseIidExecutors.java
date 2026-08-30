package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes5.dex */
class FirebaseIidExecutors {
    private static final java.util.concurrent.Executor DIRECT_EXECUTOR = com.google.firebase.iid.FirebaseIidExecutors$$Lambda$0.$instance;

    static java.util.concurrent.Executor directExecutor() {
        return DIRECT_EXECUTOR;
    }

    static java.util.concurrent.ExecutorService newCachedSingleThreadExecutor() {
        return new java.util.concurrent.ThreadPoolExecutor(0, 1, 30L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.NamedThreadFactory("firebase-iid-executor"));
    }
}
