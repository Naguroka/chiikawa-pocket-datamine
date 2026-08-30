package com.bytedance.sdk.component.Kg;

/* JADX INFO: loaded from: classes3.dex */
class bg extends java.util.concurrent.ThreadPoolExecutor {
    private java.lang.String bg;

    public bg(java.lang.String str, int i, int i2, long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.BlockingQueue<java.lang.Runnable> blockingQueue, java.util.concurrent.ThreadFactory threadFactory, java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.bg = str;
    }

    private void bg(java.lang.Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (java.lang.OutOfMemoryError e) {
            bg(runnable, e);
        } catch (java.lang.Throwable th) {
            bg(runnable, th);
        }
    }

    private void bg(java.lang.Runnable runnable, java.lang.OutOfMemoryError outOfMemoryError) {
        bg(runnable, (java.lang.Throwable) outOfMemoryError);
    }

    private void bg(java.lang.Runnable runnable, java.lang.Throwable th) {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            try {
                runnable.run();
            } catch (java.lang.Throwable th2) {
                com.bytedance.sdk.component.utils.PX.bg("", "try exc failed", th2);
            }
        }
    }

    private void bg(java.util.concurrent.BlockingQueue<java.lang.Runnable> blockingQueue, int i) {
        if (getCorePoolSize() == i || blockingQueue == null || blockingQueue.size() > 0) {
            return;
        }
        try {
            setCorePoolSize(i);
            java.lang.Object[] objArr = new java.lang.Object[6];
            java.lang.Integer.valueOf(getCorePoolSize());
            java.lang.Integer.valueOf(getMaximumPoolSize());
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
    }

    private void bg(java.util.concurrent.BlockingQueue<java.lang.Runnable> blockingQueue, int i, int i2) {
        if (getCorePoolSize() == i || blockingQueue == null || blockingQueue.size() < i2) {
            return;
        }
        try {
            setCorePoolSize(i);
            java.lang.Object[] objArr = new java.lang.Object[6];
            java.lang.Integer.valueOf(getCorePoolSize());
            java.lang.Integer.valueOf(getMaximumPoolSize());
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(final java.lang.Runnable runnable) {
        java.util.concurrent.BlockingQueue<java.lang.Runnable> queue;
        if (runnable instanceof com.bytedance.sdk.component.Kg.Kg) {
            bg(new com.bytedance.sdk.component.Kg.IL((com.bytedance.sdk.component.Kg.Kg) runnable, this));
        } else {
            bg(new com.bytedance.sdk.component.Kg.IL(new com.bytedance.sdk.component.Kg.Kg("unknown") { // from class: com.bytedance.sdk.component.Kg.bg.1
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                }
            }, this));
        }
        if (!com.bytedance.sdk.component.Kg.ldr.iR() || android.text.TextUtils.isEmpty(this.bg) || (queue = getQueue()) == null) {
            return;
        }
        java.lang.String str = this.bg;
        str.hashCode();
        switch (str) {
            case "io":
                bg(queue, com.bytedance.sdk.component.Kg.ldr.bg + 2, getCorePoolSize() * 2);
                break;
            case "log":
                bg(queue, 8, 8);
                break;
            case "aidl":
                bg(queue, 5, 5);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(java.lang.Runnable runnable, java.lang.Throwable th) {
        java.util.concurrent.BlockingQueue<java.lang.Runnable> queue;
        super.afterExecute(runnable, th);
        if (!com.bytedance.sdk.component.Kg.ldr.iR() || android.text.TextUtils.isEmpty(this.bg) || (queue = getQueue()) == null) {
            return;
        }
        java.lang.String str = this.bg;
        str.hashCode();
        switch (str) {
            case "io":
                bg(queue, 2);
                break;
            case "log":
                bg(queue, 4);
                break;
            case "aidl":
                bg(queue, 2);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public java.util.List<java.lang.Runnable> shutdownNow() {
        if ("io".equals(this.bg) || "aidl".equals(this.bg)) {
            return java.util.Collections.emptyList();
        }
        return super.shutdownNow();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("io".equals(this.bg) || "aidl".equals(this.bg)) {
            return;
        }
        super.shutdown();
    }

    public java.lang.String bg() {
        return this.bg;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.Kg.bg$bg, reason: collision with other inner class name */
    public static class C0099bg {
        private java.util.concurrent.RejectedExecutionHandler Kg;
        private java.lang.String bg = "io";
        private int IL = 1;
        private long bX = 30;
        private java.util.concurrent.TimeUnit eqN = java.util.concurrent.TimeUnit.SECONDS;
        private int zx = Integer.MAX_VALUE;
        private java.util.concurrent.BlockingQueue<java.lang.Runnable> ldr = null;
        private java.util.concurrent.ThreadFactory iR = null;
        private int WR = 5;

        public com.bytedance.sdk.component.Kg.bg.C0099bg bg(java.lang.String str) {
            this.bg = str;
            return this;
        }

        public com.bytedance.sdk.component.Kg.bg.C0099bg bg(int i) {
            this.IL = i;
            return this;
        }

        public com.bytedance.sdk.component.Kg.bg.C0099bg bg(long j) {
            this.bX = j;
            return this;
        }

        public com.bytedance.sdk.component.Kg.bg.C0099bg bg(java.util.concurrent.TimeUnit timeUnit) {
            this.eqN = timeUnit;
            return this;
        }

        public com.bytedance.sdk.component.Kg.bg.C0099bg bg(java.util.concurrent.BlockingQueue<java.lang.Runnable> blockingQueue) {
            this.ldr = blockingQueue;
            return this;
        }

        public com.bytedance.sdk.component.Kg.bg.C0099bg bg(java.util.concurrent.ThreadFactory threadFactory) {
            this.iR = threadFactory;
            return this;
        }

        public com.bytedance.sdk.component.Kg.bg.C0099bg bg(java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler) {
            this.Kg = rejectedExecutionHandler;
            return this;
        }

        public com.bytedance.sdk.component.Kg.bg.C0099bg IL(int i) {
            this.WR = i;
            return this;
        }

        public com.bytedance.sdk.component.Kg.bg bg() {
            if (this.iR == null) {
                this.iR = com.bytedance.sdk.component.Kg.zx.bg().createThreadFactory(this.WR, this.bg);
            }
            if (this.Kg == null) {
                this.Kg = com.bytedance.sdk.component.Kg.ldr.Kg();
            }
            if (this.ldr == null) {
                this.ldr = new java.util.concurrent.LinkedBlockingQueue();
            }
            return new com.bytedance.sdk.component.Kg.bg(this.bg, this.IL, this.zx, this.bX, this.eqN, this.ldr, this.iR, this.Kg);
        }
    }
}
