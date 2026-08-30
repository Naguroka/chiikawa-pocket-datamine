package com.google.firebase.messaging.threads;

/* JADX INFO: loaded from: classes5.dex */
public interface ExecutorFactory {
    void executeOneOff(java.lang.String str, java.lang.String str2, com.google.firebase.messaging.threads.ThreadPriority threadPriority, java.lang.Runnable runnable);

    java.util.concurrent.ScheduledExecutorService newScheduledThreadPool(int i, com.google.firebase.messaging.threads.ThreadPriority threadPriority);

    java.util.concurrent.ScheduledExecutorService newScheduledThreadPool(int i, java.util.concurrent.ThreadFactory threadFactory, com.google.firebase.messaging.threads.ThreadPriority threadPriority);

    java.util.concurrent.ExecutorService newSingleThreadExecutor(com.google.firebase.messaging.threads.ThreadPriority threadPriority);

    java.util.concurrent.ExecutorService newSingleThreadExecutor(java.util.concurrent.ThreadFactory threadFactory, com.google.firebase.messaging.threads.ThreadPriority threadPriority);

    java.util.concurrent.ExecutorService newThreadPool(int i, com.google.firebase.messaging.threads.ThreadPriority threadPriority);

    java.util.concurrent.ExecutorService newThreadPool(int i, java.util.concurrent.ThreadFactory threadFactory, com.google.firebase.messaging.threads.ThreadPriority threadPriority);

    java.util.concurrent.ExecutorService newThreadPool(com.google.firebase.messaging.threads.ThreadPriority threadPriority);

    java.util.concurrent.ExecutorService newThreadPool(java.util.concurrent.ThreadFactory threadFactory, com.google.firebase.messaging.threads.ThreadPriority threadPriority);

    java.util.concurrent.Future<?> submitOneOff(java.lang.String str, java.lang.String str2, com.google.firebase.messaging.threads.ThreadPriority threadPriority, java.lang.Runnable runnable);
}
