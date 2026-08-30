package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
class FcmExecutors {
    private static final java.lang.String THREAD_FILE = "Firebase-Messaging-File";
    static final java.lang.String THREAD_FILE_IO = "Firebase-Messaging-File-Io";
    private static final java.lang.String THREAD_INIT = "Firebase-Messaging-Init";
    private static final java.lang.String THREAD_INTENT_HANDLE = "Firebase-Messaging-Intent-Handle";
    private static final java.lang.String THREAD_NETWORK_IO = "Firebase-Messaging-Network-Io";
    static final java.lang.String THREAD_RPC_TASK = "Firebase-Messaging-Rpc-Task";
    private static final java.lang.String THREAD_TASK = "Firebase-Messaging-Task";
    private static final java.lang.String THREAD_TOPICS_IO = "Firebase-Messaging-Topics-Io";

    static java.util.concurrent.Executor newRpcTasksExecutor() {
        return newCachedSingleThreadExecutor(THREAD_RPC_TASK);
    }

    static java.util.concurrent.Executor newFileIOExecutor() {
        return newCachedSingleThreadExecutor(THREAD_FILE_IO);
    }

    private static java.util.concurrent.Executor newCachedSingleThreadExecutor(java.lang.String str) {
        return new java.util.concurrent.ThreadPoolExecutor(0, 1, 30L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.NamedThreadFactory(str));
    }

    static java.util.concurrent.ScheduledExecutorService newTopicsSyncExecutor() {
        return new java.util.concurrent.ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.concurrent.NamedThreadFactory(THREAD_TOPICS_IO));
    }

    static java.util.concurrent.ExecutorService newNetworkIOExecutor() {
        return java.util.concurrent.Executors.newSingleThreadExecutor(new com.google.android.gms.common.util.concurrent.NamedThreadFactory(THREAD_NETWORK_IO));
    }

    static java.util.concurrent.ExecutorService newTaskExecutor() {
        return java.util.concurrent.Executors.newSingleThreadExecutor(new com.google.android.gms.common.util.concurrent.NamedThreadFactory(THREAD_TASK));
    }

    static java.util.concurrent.ExecutorService newFileExecutor() {
        return java.util.concurrent.Executors.newSingleThreadExecutor(new com.google.android.gms.common.util.concurrent.NamedThreadFactory(THREAD_FILE));
    }

    static java.util.concurrent.ExecutorService newIntentHandleExecutor() {
        return com.google.firebase.messaging.threads.PoolableExecutors.factory().newSingleThreadExecutor(new com.google.android.gms.common.util.concurrent.NamedThreadFactory(THREAD_INTENT_HANDLE), com.google.firebase.messaging.threads.ThreadPriority.HIGH_SPEED);
    }

    static java.util.concurrent.ScheduledExecutorService newInitExecutor() {
        return new java.util.concurrent.ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.concurrent.NamedThreadFactory(THREAD_INIT));
    }

    private FcmExecutors() {
    }
}
