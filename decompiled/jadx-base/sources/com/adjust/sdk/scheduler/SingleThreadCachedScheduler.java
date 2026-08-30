package com.adjust.sdk.scheduler;

/* JADX INFO: loaded from: classes3.dex */
public class SingleThreadCachedScheduler implements com.adjust.sdk.scheduler.ThreadScheduler {
    private java.util.concurrent.ThreadPoolExecutor threadPoolExecutor;
    private final java.util.List<java.lang.Runnable> queue = new java.util.ArrayList();
    private boolean isThreadProcessing = false;
    private boolean isTeardown = false;

    public class a implements java.util.concurrent.RejectedExecutionHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.lang.String f108a;

        public a(java.lang.String str) {
            this.f108a = str;
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(java.lang.Runnable runnable, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
            com.adjust.sdk.AdjustFactory.getLogger().warn("Runnable [%s] rejected from [%s] ", runnable.toString(), this.f108a);
        }
    }

    public class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f109a;
        public final /* synthetic */ java.lang.Runnable b;

        public b(long j, java.lang.Runnable runnable) {
            this.f109a = j;
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                java.lang.Thread.sleep(this.f109a);
            } catch (java.lang.InterruptedException e) {
                com.adjust.sdk.AdjustFactory.getLogger().warn("Sleep delay exception: %s", e.getMessage());
            }
            com.adjust.sdk.scheduler.SingleThreadCachedScheduler.this.submit(this.b);
        }
    }

    public class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.lang.Runnable f110a;

        public c(java.lang.Runnable runnable) {
            this.f110a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.adjust.sdk.scheduler.SingleThreadCachedScheduler singleThreadCachedScheduler = com.adjust.sdk.scheduler.SingleThreadCachedScheduler.this;
            java.lang.Runnable runnable = this.f110a;
            while (true) {
                singleThreadCachedScheduler.tryExecuteRunnable(runnable);
                synchronized (com.adjust.sdk.scheduler.SingleThreadCachedScheduler.this.queue) {
                    if (com.adjust.sdk.scheduler.SingleThreadCachedScheduler.this.isTeardown) {
                        return;
                    }
                    if (com.adjust.sdk.scheduler.SingleThreadCachedScheduler.this.queue.isEmpty()) {
                        com.adjust.sdk.scheduler.SingleThreadCachedScheduler.this.isThreadProcessing = false;
                        return;
                    } else {
                        runnable = (java.lang.Runnable) com.adjust.sdk.scheduler.SingleThreadCachedScheduler.this.queue.get(0);
                        com.adjust.sdk.scheduler.SingleThreadCachedScheduler.this.queue.remove(0);
                    }
                }
                singleThreadCachedScheduler = com.adjust.sdk.scheduler.SingleThreadCachedScheduler.this;
            }
        }
    }

    public SingleThreadCachedScheduler(java.lang.String str) {
        this.threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), new com.adjust.sdk.scheduler.ThreadFactoryWrapper(str), new com.adjust.sdk.scheduler.SingleThreadCachedScheduler.a(str));
    }

    private void processQueue(java.lang.Runnable runnable) {
        this.threadPoolExecutor.submit(new com.adjust.sdk.scheduler.SingleThreadCachedScheduler.c(runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryExecuteRunnable(java.lang.Runnable runnable) {
        try {
            if (this.isTeardown) {
                return;
            }
            runnable.run();
        } catch (java.lang.Throwable th) {
            com.adjust.sdk.AdjustFactory.getLogger().warn("Execution failed: %s", th.getMessage());
        }
    }

    @Override // com.adjust.sdk.scheduler.ThreadScheduler
    public void schedule(java.lang.Runnable runnable, long j) {
        synchronized (this.queue) {
            if (this.isTeardown) {
                return;
            }
            this.threadPoolExecutor.submit(new com.adjust.sdk.scheduler.SingleThreadCachedScheduler.b(j, runnable));
        }
    }

    @Override // com.adjust.sdk.scheduler.ThreadExecutor
    public void submit(java.lang.Runnable runnable) {
        synchronized (this.queue) {
            if (this.isTeardown) {
                return;
            }
            if (this.isThreadProcessing) {
                this.queue.add(runnable);
            } else {
                this.isThreadProcessing = true;
                processQueue(runnable);
            }
        }
    }

    @Override // com.adjust.sdk.scheduler.ThreadExecutor
    public void teardown() {
        synchronized (this.queue) {
            this.isTeardown = true;
            this.queue.clear();
            this.threadPoolExecutor.shutdown();
        }
    }
}
