package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes5.dex */
public class FirebaseExecutors {
    private FirebaseExecutors() {
    }

    public static java.util.concurrent.Executor newSequentialExecutor(java.util.concurrent.Executor executor) {
        return new com.google.firebase.concurrent.SequentialExecutor(executor);
    }

    public static java.util.concurrent.Executor newLimitedConcurrencyExecutor(java.util.concurrent.Executor executor, int i) {
        return new com.google.firebase.concurrent.LimitedConcurrencyExecutor(executor, i);
    }

    public static java.util.concurrent.ExecutorService newLimitedConcurrencyExecutorService(java.util.concurrent.ExecutorService executorService, int i) {
        return new com.google.firebase.concurrent.LimitedConcurrencyExecutorService(executorService, i);
    }

    public static java.util.concurrent.ScheduledExecutorService newLimitedConcurrencyScheduledExecutorService(java.util.concurrent.ExecutorService executorService, int i) {
        return new com.google.firebase.concurrent.DelegatingScheduledExecutorService(newLimitedConcurrencyExecutorService(executorService, i), com.google.firebase.concurrent.ExecutorsRegistrar.SCHEDULER.get());
    }

    public static com.google.firebase.concurrent.PausableExecutor newPausableExecutor(java.util.concurrent.Executor executor) {
        return new com.google.firebase.concurrent.PausableExecutorImpl(false, executor);
    }

    public static com.google.firebase.concurrent.PausableExecutorService newPausableExecutorService(java.util.concurrent.ExecutorService executorService) {
        return new com.google.firebase.concurrent.PausableExecutorServiceImpl(false, executorService);
    }

    public static com.google.firebase.concurrent.PausableScheduledExecutorService newPausableScheduledExecutorService(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        return new com.google.firebase.concurrent.PausableScheduledExecutorServiceImpl(newPausableExecutorService(scheduledExecutorService), com.google.firebase.concurrent.ExecutorsRegistrar.SCHEDULER.get());
    }

    public static java.util.concurrent.Executor directExecutor() {
        return com.google.firebase.concurrent.FirebaseExecutors.DirectExecutor.INSTANCE;
    }

    private enum DirectExecutor implements java.util.concurrent.Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            runnable.run();
        }
    }
}
