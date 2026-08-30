package com.bytedance.sdk.component.Kg.bX;

/* JADX INFO: loaded from: classes3.dex */
public class ldr extends java.util.concurrent.ThreadPoolExecutor {
    private int IL;
    private java.util.LinkedHashMap<java.lang.String, com.bytedance.sdk.component.Kg.bX.bg.bg> Kg;
    private int bX;
    private final java.lang.String bg;
    private int eqN;
    private boolean iR;
    private int ldr;
    private int zx;

    private ldr(com.bytedance.sdk.component.Kg.bX.ldr.bg bgVar) {
        super(bgVar.IL, Integer.MAX_VALUE, bgVar.zx, bgVar.iR, (java.util.concurrent.BlockingQueue<java.lang.Runnable>) bgVar.VB, bgVar.PX);
        this.iR = false;
        java.lang.Object[] objArr = new java.lang.Object[16];
        java.lang.String unused = bgVar.bg;
        java.lang.Integer.valueOf(bgVar.IL);
        java.lang.Integer.valueOf(bgVar.bX);
        java.lang.Long.valueOf(bgVar.zx);
        java.lang.Integer.valueOf(bgVar.eqN);
        java.lang.Integer.valueOf(bgVar.WR);
        java.lang.Boolean.valueOf(bgVar.eo);
        java.util.concurrent.BlockingQueue unused2 = bgVar.VB;
        this.bg = bgVar.bg;
        this.eqN = bgVar.IL;
        this.zx = bgVar.bX;
        this.ldr = bgVar.eqN;
        allowCoreThreadTimeOut(bgVar.ldr);
        this.IL = bgVar.Kg;
        this.bX = bgVar.WR;
        this.iR = bgVar.eo;
        if (iR()) {
            final int i = this.bX + 4;
            this.Kg = new java.util.LinkedHashMap<java.lang.String, com.bytedance.sdk.component.Kg.bX.bg.bg>(i, 0.75f, true) { // from class: com.bytedance.sdk.component.Kg.bX.ldr.1
                @Override // java.util.LinkedHashMap
                protected boolean removeEldestEntry(java.util.Map.Entry<java.lang.String, com.bytedance.sdk.component.Kg.bX.bg.bg> entry) {
                    return size() > i;
                }
            };
        }
    }

    public void bg(com.bytedance.sdk.component.Kg.bX.ldr.bg bgVar) {
        try {
            if (bgVar.IL >= 0 && this.eqN != bgVar.IL) {
                int i = bgVar.IL;
                this.eqN = i;
                setCorePoolSize(i);
            }
            this.zx = bgVar.bX;
            this.ldr = bgVar.eqN;
            allowCoreThreadTimeOut(bgVar.ldr);
            this.IL = bgVar.Kg;
            this.bX = bgVar.WR;
            this.iR = bgVar.eo;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("PAGThreadPoolExecutor", th.getMessage());
        }
        java.lang.Object[] objArr = new java.lang.Object[16];
        java.lang.String unused = bgVar.bg;
        java.lang.Integer.valueOf(bgVar.IL);
        java.lang.Integer.valueOf(bgVar.bX);
        java.lang.Long.valueOf(bgVar.zx);
        java.lang.Integer.valueOf(bgVar.eqN);
        java.lang.Integer.valueOf(bgVar.WR);
        java.lang.Boolean.valueOf(bgVar.eo);
        java.util.concurrent.BlockingQueue unused2 = bgVar.VB;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void beforeExecute(java.lang.Thread thread, java.lang.Runnable runnable) {
        if (runnable instanceof com.bytedance.sdk.component.Kg.bX.IL) {
            ((com.bytedance.sdk.component.Kg.bX.IL) runnable).IL(android.os.SystemClock.elapsedRealtime());
        }
        super.beforeExecute(thread, runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(java.lang.Runnable runnable, java.lang.Throwable th) {
        boolean z = runnable instanceof com.bytedance.sdk.component.Kg.bX.IL;
        if (z) {
            ((com.bytedance.sdk.component.Kg.bX.IL) runnable).bX(android.os.SystemClock.elapsedRealtime());
            try {
                if (iR() && this.Kg != null) {
                    bg((com.bytedance.sdk.component.Kg.bX.IL) runnable);
                    ldr();
                }
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.utils.PX.bg("PAGThreadPoolExecutor", e.getMessage());
            }
        }
        super.afterExecute(runnable, th);
        if (z) {
            com.bytedance.sdk.component.Kg.bX.IL il = (com.bytedance.sdk.component.Kg.bX.IL) runnable;
            java.lang.Object[] objArr = new java.lang.Object[13];
            il.IL();
            java.lang.Integer.valueOf(il.bg());
            java.lang.Long.valueOf(il.bX());
            java.lang.Long.valueOf(il.eqN());
            java.lang.Long.valueOf(il.zx());
        }
        zx();
    }

    private void eqN() {
        int corePoolSize;
        try {
            if (this.eqN != 0 && (corePoolSize = getCorePoolSize()) < this.zx) {
                int size = getQueue().size();
                if (getActiveCount() < this.eqN || size < this.ldr) {
                    return;
                }
                setCorePoolSize(this.zx);
                java.lang.Object[] objArr = new java.lang.Object[7];
                java.lang.Integer.valueOf(size);
                java.lang.Integer.valueOf(corePoolSize);
                java.lang.Integer.valueOf(this.zx);
            }
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
    }

    private void zx() {
        int corePoolSize;
        int size;
        try {
            if (this.eqN != 0 && (corePoolSize = getCorePoolSize()) > this.eqN && (size = getQueue().size()) == 0) {
                setCorePoolSize(this.eqN);
                java.lang.Object[] objArr = new java.lang.Object[7];
                java.lang.Integer.valueOf(size);
                java.lang.Integer.valueOf(corePoolSize);
                java.lang.Integer.valueOf(this.eqN);
            }
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public java.util.concurrent.Future<?> submit(java.lang.Runnable runnable) {
        int iBg;
        java.lang.String strIL;
        runnable.getClass();
        final java.util.concurrent.RunnableFuture runnableFutureNewTaskFor = newTaskFor(runnable, null);
        if (runnable instanceof com.bytedance.sdk.component.Kg.bX.IL) {
            com.bytedance.sdk.component.Kg.bX.IL il = (com.bytedance.sdk.component.Kg.bX.IL) runnable;
            iBg = il.bg();
            strIL = il.IL();
        } else {
            iBg = 6;
            strIL = "";
        }
        if (iBg == 0 || android.text.TextUtils.isEmpty(strIL)) {
            new java.lang.RuntimeException();
        }
        execute(new com.bytedance.sdk.component.Kg.bX.IL(iBg, strIL) { // from class: com.bytedance.sdk.component.Kg.bX.ldr.2
            @Override // java.lang.Runnable
            public void run() {
                runnableFutureNewTaskFor.run();
            }
        });
        return runnableFutureNewTaskFor;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        com.bytedance.sdk.component.Kg.bX.bg bgVarIL;
        if (!(runnable instanceof com.bytedance.sdk.component.Kg.bX.IL)) {
            runnable = new com.bytedance.sdk.component.Kg.bX.IL("unknown", runnable) { // from class: com.bytedance.sdk.component.Kg.bX.ldr.3
                @Override // java.lang.Runnable
                public void run() {
                    java.lang.Runnable runnableKg = Kg();
                    if (runnableKg != null) {
                        runnableKg.run();
                    }
                }
            };
        }
        if (!"cache".equals(this.bg)) {
            java.lang.String name = java.lang.Thread.currentThread().getName();
            if (!android.text.TextUtils.isEmpty(name) && name.startsWith(com.bytedance.sdk.component.Kg.bX.eqN.bg(this.bg)) && (bgVarIL = com.bytedance.sdk.component.Kg.bX.bX.IL()) != null) {
                bgVarIL.bg(this, (com.bytedance.sdk.component.Kg.bX.IL) runnable);
            }
        }
        ((com.bytedance.sdk.component.Kg.bX.IL) runnable).bg(android.os.SystemClock.elapsedRealtime());
        try {
            super.execute(runnable);
            eqN();
        } catch (java.lang.Throwable th) {
            bg(runnable, th);
        }
    }

    private void bg(java.lang.Runnable runnable, java.lang.Throwable th) {
        try {
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                android.os.Handler handlerBX = com.bytedance.sdk.component.Kg.bX.bX.bX();
                if (handlerBX != null) {
                    handlerBX.post(runnable);
                    return;
                }
                return;
            }
            runnable.run();
        } catch (java.lang.Throwable th2) {
            com.bytedance.sdk.component.utils.PX.bg("PAGThreadPoolExecutor", "try exc failed", th2);
        }
    }

    private void bg(com.bytedance.sdk.component.Kg.bX.IL il) {
        java.util.LinkedHashMap<java.lang.String, com.bytedance.sdk.component.Kg.bX.bg.bg> linkedHashMap = this.Kg;
        if (linkedHashMap != null) {
            com.bytedance.sdk.component.Kg.bX.bg.bg bgVar = linkedHashMap.get(il.IL());
            if (bgVar == null) {
                synchronized (linkedHashMap) {
                    bgVar = linkedHashMap.get(il.IL());
                    if (bgVar == null) {
                        bgVar = new com.bytedance.sdk.component.Kg.bX.bg.bg();
                        linkedHashMap.put(il.IL(), bgVar);
                    }
                }
            }
            bgVar.bg(il);
        }
    }

    public java.util.LinkedHashMap<java.lang.String, com.bytedance.sdk.component.Kg.bX.bg.bg> bg() {
        return this.Kg;
    }

    private void ldr() {
        if (getCompletedTaskCount() > this.IL) {
            com.bytedance.sdk.component.Kg.bX.zx zxVarBg = com.bytedance.sdk.component.Kg.bX.bX.bg();
            if (zxVarBg != null) {
                zxVarBg.bg(this);
            }
            this.IL = -1;
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public java.util.List<java.lang.Runnable> shutdownNow() {
        if ("aidl".equals(this.bg)) {
            return java.util.Collections.emptyList();
        }
        return super.shutdownNow();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("aidl".equals(this.bg)) {
            return;
        }
        super.shutdown();
    }

    public java.lang.String IL() {
        return this.bg;
    }

    private boolean iR() {
        return this.IL > 0;
    }

    public boolean bX() {
        return this.iR;
    }

    public static class bg {
        private java.lang.String bg = "cache";
        private int IL = 4;
        private int bX = 100;
        private int eqN = 0;
        private long zx = 30000;
        private boolean ldr = false;
        private java.util.concurrent.TimeUnit iR = java.util.concurrent.TimeUnit.MILLISECONDS;
        private int Kg = -1;
        private int WR = 20;
        private boolean eo = false;
        private java.util.concurrent.BlockingQueue<java.lang.Runnable> VB = new java.util.concurrent.PriorityBlockingQueue();
        private java.util.concurrent.ThreadFactory PX = null;

        public com.bytedance.sdk.component.Kg.bX.ldr.bg bg(java.lang.String str) {
            this.bg = str;
            return this;
        }

        public com.bytedance.sdk.component.Kg.bX.ldr.bg bg(int i) {
            this.IL = i;
            return this;
        }

        public com.bytedance.sdk.component.Kg.bX.ldr.bg IL(int i) {
            this.bX = i;
            return this;
        }

        public com.bytedance.sdk.component.Kg.bX.ldr.bg bX(int i) {
            this.eqN = i;
            return this;
        }

        public com.bytedance.sdk.component.Kg.bX.ldr.bg bg(long j) {
            this.zx = j;
            return this;
        }

        public com.bytedance.sdk.component.Kg.bX.ldr.bg bg(boolean z) {
            this.ldr = z;
            return this;
        }

        public com.bytedance.sdk.component.Kg.bX.ldr.bg eqN(int i) {
            this.WR = i;
            return this;
        }

        public com.bytedance.sdk.component.Kg.bX.ldr.bg zx(int i) {
            this.Kg = i;
            return this;
        }

        public com.bytedance.sdk.component.Kg.bX.ldr.bg IL(boolean z) {
            this.eo = z;
            return this;
        }

        public com.bytedance.sdk.component.Kg.bX.ldr bg() {
            if (this.PX == null) {
                this.PX = new com.bytedance.sdk.component.Kg.bX.eqN(this.bg);
            }
            if (this.IL < 0) {
                this.IL = 8;
            }
            if (this.IL == 0) {
                this.VB = new java.util.concurrent.SynchronousQueue();
            }
            if (this.VB == null) {
                this.VB = new java.util.concurrent.LinkedBlockingQueue();
            }
            if (this.bX > 100) {
                this.bX = 100;
            }
            int i = this.bX;
            int i2 = this.IL;
            if (i < i2) {
                this.bX = i2;
            }
            if (this.WR < 0) {
                this.WR = 20;
            }
            if (this.WR > 100) {
                this.WR = 100;
            }
            return new com.bytedance.sdk.component.Kg.bX.ldr(this);
        }
    }
}
