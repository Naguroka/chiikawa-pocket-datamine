package com.bytedance.adsdk.IL;

/* JADX INFO: loaded from: classes3.dex */
public class Ta<T> {
    public static java.util.concurrent.Executor bg = java.util.concurrent.Executors.newCachedThreadPool();
    private final java.util.Set<com.bytedance.adsdk.IL.VB<T>> IL;
    private final java.util.Set<com.bytedance.adsdk.IL.VB<java.lang.Throwable>> bX;
    private final android.os.Handler eqN;
    private volatile com.bytedance.adsdk.IL.PX<T> zx;

    public Ta(java.util.concurrent.Callable<com.bytedance.adsdk.IL.PX<T>> callable) {
        this(callable, false);
    }

    Ta(java.util.concurrent.Callable<com.bytedance.adsdk.IL.PX<T>> callable, boolean z) {
        this.IL = new java.util.LinkedHashSet(1);
        this.bX = new java.util.LinkedHashSet(1);
        this.eqN = new android.os.Handler(android.os.Looper.getMainLooper());
        this.zx = null;
        if (z) {
            try {
                bg((com.bytedance.adsdk.IL.PX) callable.call());
                return;
            } catch (java.lang.Throwable th) {
                bg((com.bytedance.adsdk.IL.PX) new com.bytedance.adsdk.IL.PX<>(th));
                return;
            }
        }
        bg.execute(new com.bytedance.adsdk.IL.Ta.bg(callable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(com.bytedance.adsdk.IL.PX<T> px) {
        if (this.zx != null) {
            throw new java.lang.IllegalStateException("A task may only be set once.");
        }
        this.zx = px;
        bg();
    }

    public synchronized com.bytedance.adsdk.IL.Ta<T> bg(com.bytedance.adsdk.IL.VB<T> vb) {
        com.bytedance.adsdk.IL.PX<T> px = this.zx;
        if (px != null && px.bg() != null) {
            vb.bg(px.bg());
        }
        this.IL.add(vb);
        return this;
    }

    public synchronized com.bytedance.adsdk.IL.Ta<T> IL(com.bytedance.adsdk.IL.VB<T> vb) {
        this.IL.remove(vb);
        return this;
    }

    public synchronized com.bytedance.adsdk.IL.Ta<T> bX(com.bytedance.adsdk.IL.VB<java.lang.Throwable> vb) {
        com.bytedance.adsdk.IL.PX<T> px = this.zx;
        if (px != null && px.IL() != null) {
            vb.bg(px.IL());
        }
        this.bX.add(vb);
        return this;
    }

    public synchronized com.bytedance.adsdk.IL.Ta<T> eqN(com.bytedance.adsdk.IL.VB<java.lang.Throwable> vb) {
        this.bX.remove(vb);
        return this;
    }

    private void bg() {
        this.eqN.post(new java.lang.Runnable() { // from class: com.bytedance.adsdk.IL.Ta.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.adsdk.IL.PX px = com.bytedance.adsdk.IL.Ta.this.zx;
                if (px == null) {
                    return;
                }
                if (px.bg() != null) {
                    com.bytedance.adsdk.IL.Ta.this.bg(px.bg());
                } else {
                    com.bytedance.adsdk.IL.Ta.this.bg(px.IL());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void bg(T t) {
        java.util.Iterator it = new java.util.ArrayList(this.IL).iterator();
        while (it.hasNext()) {
            ((com.bytedance.adsdk.IL.VB) it.next()).bg(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void bg(java.lang.Throwable th) {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.bX);
        if (arrayList.isEmpty()) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.bytedance.adsdk.IL.VB) it.next()).bg(th);
        }
    }

    private class bg extends java.util.concurrent.FutureTask<com.bytedance.adsdk.IL.PX<T>> {
        bg(java.util.concurrent.Callable<com.bytedance.adsdk.IL.PX<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                com.bytedance.adsdk.IL.Ta.this.bg((com.bytedance.adsdk.IL.PX) get());
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
                com.bytedance.adsdk.IL.Ta.this.bg(new com.bytedance.adsdk.IL.PX(e));
            }
        }
    }
}
