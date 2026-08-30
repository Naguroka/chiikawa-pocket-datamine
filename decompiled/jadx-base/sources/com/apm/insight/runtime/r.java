package com.apm.insight.runtime;

/* JADX INFO: compiled from: ThreadWithHandler.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.HandlerThread f498a;
    private volatile android.os.Handler d;
    private final java.util.Queue<com.apm.insight.runtime.r.c> b = new java.util.concurrent.ConcurrentLinkedQueue();
    private final java.util.Queue<android.os.Message> c = new java.util.concurrent.ConcurrentLinkedQueue();
    private final java.lang.Object e = new java.lang.Object();

    public r(java.lang.String str) {
        this.f498a = new com.apm.insight.runtime.r.b(str);
    }

    public final android.os.Handler a() {
        return this.d;
    }

    public final void b() {
        this.f498a.start();
    }

    public final android.os.HandlerThread c() {
        return this.f498a;
    }

    private android.os.Message b(java.lang.Runnable runnable) {
        return android.os.Message.obtain(this.d, runnable);
    }

    public final boolean a(java.lang.Runnable runnable) {
        return a(b(runnable), 0L);
    }

    public final boolean a(java.lang.Runnable runnable, long j) {
        return a(b(runnable), j);
    }

    static {
        new java.lang.Object() { // from class: com.apm.insight.runtime.r.1
        };
        new java.lang.Object() { // from class: com.apm.insight.runtime.r.2
        };
    }

    private boolean a(android.os.Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return b(message, android.os.SystemClock.uptimeMillis() + j);
    }

    private boolean b(android.os.Message message, long j) {
        if (this.d == null) {
            synchronized (this.e) {
                if (this.d == null) {
                    this.b.add(new com.apm.insight.runtime.r.c(message, j));
                    return true;
                }
            }
        }
        try {
            return this.d.sendMessageAtTime(message, j);
        } catch (java.lang.Throwable unused) {
            return true;
        }
    }

    /* JADX INFO: compiled from: ThreadWithHandler.java */
    class b extends android.os.HandlerThread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile int f500a;
        private volatile boolean b;

        b(java.lang.String str) {
            super(str);
            this.f500a = 0;
            this.b = false;
        }

        /* JADX INFO: Infinite loop detected, blocks: 19, insns: 0 */
        @Override // android.os.HandlerThread
        protected final void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (com.apm.insight.runtime.r.this.e) {
                try {
                    com.apm.insight.runtime.r.this.d = new android.os.Handler();
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            com.apm.insight.runtime.r.this.d.post(com.apm.insight.runtime.r.this.new a());
            while (true) {
                try {
                    android.os.Looper.loop();
                } catch (java.lang.Throwable th2) {
                    try {
                        com.apm.insight.b.f.a(com.apm.insight.e.g()).a().c();
                        if (this.f500a < 5) {
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.k.a(th2, "NPTH_CATCH");
                        } else if (!this.b) {
                            this.b = true;
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.k.a(new java.lang.RuntimeException(), "NPTH_ERR_MAX");
                        }
                        this.f500a++;
                    } catch (java.lang.Throwable unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: ThreadWithHandler.java */
    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!com.apm.insight.runtime.r.this.c.isEmpty()) {
                if (com.apm.insight.runtime.r.this.d != null) {
                    try {
                        com.apm.insight.runtime.r.this.d.sendMessageAtFrontOfQueue((android.os.Message) com.apm.insight.runtime.r.this.c.poll());
                    } catch (java.lang.Throwable unused) {
                    }
                }
            }
            while (!com.apm.insight.runtime.r.this.b.isEmpty()) {
                com.apm.insight.runtime.r.c cVar = (com.apm.insight.runtime.r.c) com.apm.insight.runtime.r.this.b.poll();
                if (com.apm.insight.runtime.r.this.d != null) {
                    try {
                        com.apm.insight.runtime.r.this.d.sendMessageAtTime(cVar.f501a, cVar.b);
                    } catch (java.lang.Throwable unused2) {
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: ThreadWithHandler.java */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        android.os.Message f501a;
        long b;

        c(android.os.Message message, long j) {
            this.f501a = message;
            this.b = j;
        }
    }
}
