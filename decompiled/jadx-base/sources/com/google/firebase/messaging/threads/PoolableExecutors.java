package com.google.firebase.messaging.threads;

/* JADX INFO: loaded from: classes5.dex */
public class PoolableExecutors {
    private static final com.google.firebase.messaging.threads.ExecutorFactory DEFAULT_INSTANCE;
    private static volatile com.google.firebase.messaging.threads.ExecutorFactory instance;

    static {
        com.google.firebase.messaging.threads.PoolableExecutors.DefaultExecutorFactory defaultExecutorFactory = new com.google.firebase.messaging.threads.PoolableExecutors.DefaultExecutorFactory();
        DEFAULT_INSTANCE = defaultExecutorFactory;
        instance = defaultExecutorFactory;
    }

    private PoolableExecutors() {
    }

    public static com.google.firebase.messaging.threads.ExecutorFactory factory() {
        return instance;
    }

    private static class DefaultExecutorFactory implements com.google.firebase.messaging.threads.ExecutorFactory {
        private static final long CORE_THREAD_TIMEOUT_SECS = 60;

        private DefaultExecutorFactory() {
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        public java.util.concurrent.ExecutorService newThreadPool(com.google.firebase.messaging.threads.ThreadPriority threadPriority) {
            return java.util.concurrent.Executors.unconfigurableExecutorService(java.util.concurrent.Executors.newCachedThreadPool());
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        public java.util.concurrent.ExecutorService newThreadPool(java.util.concurrent.ThreadFactory threadFactory, com.google.firebase.messaging.threads.ThreadPriority threadPriority) {
            return java.util.concurrent.Executors.unconfigurableExecutorService(java.util.concurrent.Executors.newCachedThreadPool(threadFactory));
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        public java.util.concurrent.ExecutorService newThreadPool(int i, com.google.firebase.messaging.threads.ThreadPriority threadPriority) {
            return newThreadPool(i, java.util.concurrent.Executors.defaultThreadFactory(), threadPriority);
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        public java.util.concurrent.ExecutorService newThreadPool(int i, java.util.concurrent.ThreadFactory threadFactory, com.google.firebase.messaging.threads.ThreadPriority threadPriority) {
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(i, i, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return java.util.concurrent.Executors.unconfigurableExecutorService(threadPoolExecutor);
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        public java.util.concurrent.ExecutorService newSingleThreadExecutor(com.google.firebase.messaging.threads.ThreadPriority threadPriority) {
            return newThreadPool(1, threadPriority);
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        public java.util.concurrent.ExecutorService newSingleThreadExecutor(java.util.concurrent.ThreadFactory threadFactory, com.google.firebase.messaging.threads.ThreadPriority threadPriority) {
            return newThreadPool(1, threadFactory, threadPriority);
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        public java.util.concurrent.ScheduledExecutorService newScheduledThreadPool(int i, com.google.firebase.messaging.threads.ThreadPriority threadPriority) {
            return java.util.concurrent.Executors.unconfigurableScheduledExecutorService(java.util.concurrent.Executors.newScheduledThreadPool(i));
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        public java.util.concurrent.ScheduledExecutorService newScheduledThreadPool(int i, java.util.concurrent.ThreadFactory threadFactory, com.google.firebase.messaging.threads.ThreadPriority threadPriority) {
            return java.util.concurrent.Executors.unconfigurableScheduledExecutorService(java.util.concurrent.Executors.newScheduledThreadPool(i, threadFactory));
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        public void executeOneOff(java.lang.String str, java.lang.String str2, com.google.firebase.messaging.threads.ThreadPriority threadPriority, java.lang.Runnable runnable) {
            new java.lang.Thread(runnable, str2).start();
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        public java.util.concurrent.Future<?> submitOneOff(java.lang.String str, java.lang.String str2, com.google.firebase.messaging.threads.ThreadPriority threadPriority, java.lang.Runnable runnable) {
            java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(runnable, null);
            new java.lang.Thread(futureTask, str2).start();
            return futureTask;
        }
    }

    static void installExecutorFactory(com.google.firebase.messaging.threads.ExecutorFactory executorFactory) {
        if (instance != DEFAULT_INSTANCE) {
            throw new java.lang.IllegalStateException("Trying to install an ExecutorFactory twice!");
        }
        instance = executorFactory;
    }
}
