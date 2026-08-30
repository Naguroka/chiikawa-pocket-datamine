package androidx.core.provider;

/* JADX INFO: loaded from: classes.dex */
class RequestExecutor {
    private RequestExecutor() {
    }

    static <T> void execute(java.util.concurrent.Executor executor, java.util.concurrent.Callable<T> callable, androidx.core.util.Consumer<T> consumer) {
        executor.execute(new androidx.core.provider.RequestExecutor.ReplyRunnable(androidx.core.provider.CalleeHandler.create(), callable, consumer));
    }

    static <T> T submit(java.util.concurrent.ExecutorService executorService, java.util.concurrent.Callable<T> callable, int i) throws java.lang.InterruptedException {
        try {
            return executorService.submit(callable).get(i, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException e) {
            throw e;
        } catch (java.util.concurrent.ExecutionException e2) {
            throw new java.lang.RuntimeException(e2);
        } catch (java.util.concurrent.TimeoutException unused) {
            throw new java.lang.InterruptedException("timeout");
        }
    }

    static java.util.concurrent.ThreadPoolExecutor createDefaultExecutor(java.lang.String str, int i, int i2) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(0, 1, i2, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingDeque(), new androidx.core.provider.RequestExecutor.DefaultThreadFactory(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static java.util.concurrent.Executor createHandlerExecutor(android.os.Handler handler) {
        return new androidx.core.provider.RequestExecutor.HandlerExecutor(handler);
    }

    private static class HandlerExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler mHandler;

        HandlerExecutor(android.os.Handler handler) {
            this.mHandler = (android.os.Handler) androidx.core.util.Preconditions.checkNotNull(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            if (!this.mHandler.post((java.lang.Runnable) androidx.core.util.Preconditions.checkNotNull(runnable))) {
                throw new java.util.concurrent.RejectedExecutionException(this.mHandler + " is shutting down");
            }
        }
    }

    private static class ReplyRunnable<T> implements java.lang.Runnable {
        private java.util.concurrent.Callable<T> mCallable;
        private androidx.core.util.Consumer<T> mConsumer;
        private android.os.Handler mHandler;

        ReplyRunnable(android.os.Handler handler, java.util.concurrent.Callable<T> callable, androidx.core.util.Consumer<T> consumer) {
            this.mCallable = callable;
            this.mConsumer = consumer;
            this.mHandler = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            final T tCall;
            try {
                tCall = this.mCallable.call();
            } catch (java.lang.Exception unused) {
                tCall = null;
            }
            final androidx.core.util.Consumer<T> consumer = this.mConsumer;
            this.mHandler.post(new java.lang.Runnable() { // from class: androidx.core.provider.RequestExecutor.ReplyRunnable.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    consumer.accept(tCall);
                }
            });
        }
    }

    private static class DefaultThreadFactory implements java.util.concurrent.ThreadFactory {
        private int mPriority;
        private java.lang.String mThreadName;

        DefaultThreadFactory(java.lang.String str, int i) {
            this.mThreadName = str;
            this.mPriority = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            return new androidx.core.provider.RequestExecutor.DefaultThreadFactory.ProcessPriorityThread(runnable, this.mThreadName, this.mPriority);
        }

        private static class ProcessPriorityThread extends java.lang.Thread {
            private final int mPriority;

            ProcessPriorityThread(java.lang.Runnable runnable, java.lang.String str, int i) {
                super(runnable, str);
                this.mPriority = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                android.os.Process.setThreadPriority(this.mPriority);
                super.run();
            }
        }
    }
}
