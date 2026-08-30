package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class tm {
    private static final java.util.concurrent.ExecutorService o = java.util.concurrent.Executors.newFixedThreadPool(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1368a;
    private final com.applovin.impl.sdk.n b;
    private final java.util.concurrent.ScheduledThreadPoolExecutor c;
    private final java.util.concurrent.ScheduledThreadPoolExecutor d;
    private final java.util.concurrent.ScheduledThreadPoolExecutor e;
    private final java.util.concurrent.ScheduledThreadPoolExecutor f;
    private final java.util.concurrent.ScheduledThreadPoolExecutor g;
    private final java.util.concurrent.ScheduledThreadPoolExecutor h;
    private final java.util.concurrent.ScheduledThreadPoolExecutor i;
    private final java.util.Map j = new java.util.HashMap();
    private final java.util.List k = new java.util.ArrayList(5);
    private final java.lang.Object l = new java.lang.Object();
    private boolean m;
    private boolean n;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1369a;

        static {
            int[] iArr = new int[com.applovin.impl.tm.b.values().length];
            f1369a = iArr;
            try {
                iArr[com.applovin.impl.tm.b.CORE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f1369a[com.applovin.impl.tm.b.CACHING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f1369a[com.applovin.impl.tm.b.MEDIATION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f1369a[com.applovin.impl.tm.b.TIMEOUT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        CORE,
        CACHING,
        MEDIATION,
        TIMEOUT,
        OTHER
    }

    public tm(com.applovin.impl.sdk.j jVar) {
        this.f1368a = jVar;
        this.b = jVar.I();
        this.n = ((java.lang.Boolean) jVar.a(com.applovin.impl.sj.V)).booleanValue();
        this.c = b("auxiliary_operations", ((java.lang.Integer) jVar.a(com.applovin.impl.sj.Q)).intValue());
        this.d = b("shared_thread_pool", ((java.lang.Integer) jVar.a(com.applovin.impl.sj.P)).intValue());
        this.e = b("core", ((java.lang.Integer) jVar.a(com.applovin.impl.sj.W)).intValue());
        this.g = b("caching", ((java.lang.Integer) jVar.a(com.applovin.impl.sj.X)).intValue());
        this.h = b("mediation", ((java.lang.Integer) jVar.a(com.applovin.impl.sj.Y)).intValue());
        this.f = b("timeout", ((java.lang.Integer) jVar.a(com.applovin.impl.sj.Z)).intValue());
        this.i = b("other", ((java.lang.Integer) jVar.a(com.applovin.impl.sj.a0)).intValue());
    }

    public boolean d() {
        return this.m;
    }

    public java.util.concurrent.Executor c() {
        return this.n ? this.e : this.d;
    }

    public java.util.concurrent.ExecutorService b() {
        return this.n ? this.g : o;
    }

    public void f() {
        synchronized (this.l) {
            this.m = false;
        }
    }

    public java.util.concurrent.ExecutorService a(java.lang.String str, int i) {
        return java.util.concurrent.Executors.newFixedThreadPool(i, new com.applovin.impl.tm.c(str));
    }

    public void e() {
        synchronized (this.l) {
            this.m = true;
            for (com.applovin.impl.tm.d dVar : this.k) {
                a(dVar.d, dVar.f);
            }
            this.k.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.j f1373a;
        private final java.lang.String b;
        private final com.applovin.impl.sdk.n c;
        private final com.applovin.impl.yl d;
        private final com.applovin.impl.tm.b f;

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.applovin.impl.z3.a();
                if (!this.f1373a.v0() || this.d.d()) {
                    java.util.concurrent.ScheduledFuture scheduledFutureB = this.d.b(java.lang.Thread.currentThread(), ((java.lang.Long) this.f1373a.a(com.applovin.impl.sj.y)).longValue());
                    this.d.run();
                    if (scheduledFutureB != null) {
                        scheduledFutureB.cancel(false);
                    }
                } else {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.d(this.b, "Task re-scheduled...");
                    }
                    this.f1373a.i0().a(this.d, this.f, 2000L);
                }
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.d(this.b, this.f + " queue finished task " + this.d.c());
                }
            } catch (java.lang.Throwable th) {
                try {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.a(this.b, "Task failed execution", th);
                    }
                    this.d.a(th);
                } finally {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.c.d(this.b, this.f + " queue finished task " + this.d.c());
                    }
                }
            }
        }

        public d(com.applovin.impl.sdk.j jVar, com.applovin.impl.yl ylVar, com.applovin.impl.tm.b bVar) {
            this.f1373a = jVar;
            this.c = jVar.I();
            this.b = ylVar.c();
            this.d = ylVar;
            this.f = bVar;
        }
    }

    private class c implements java.util.concurrent.ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f1371a;

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            java.lang.Thread thread = new java.lang.Thread(runnable, "AppLovinSdk:" + this.f1371a);
            thread.setDaemon(true);
            thread.setPriority(((java.lang.Integer) com.applovin.impl.tm.this.f1368a.a(com.applovin.impl.sj.S)).intValue());
            thread.setUncaughtExceptionHandler(new com.applovin.impl.tm.c.a());
            return thread;
        }

        c(java.lang.String str) {
            this.f1371a = str;
        }

        class a implements java.lang.Thread.UncaughtExceptionHandler {
            a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
                com.applovin.impl.sdk.n unused = com.applovin.impl.tm.this.b;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.tm.this.b.a("TaskManager", "Caught unhandled exception", th);
                }
            }
        }
    }

    public void a(com.applovin.impl.yl ylVar, com.applovin.impl.tm.b bVar) {
        a(ylVar, bVar, 0L);
    }

    public void a(com.applovin.impl.yl ylVar, com.applovin.impl.tm.b bVar, long j) {
        a(ylVar, bVar, j, false);
    }

    private boolean b(com.applovin.impl.tm.d dVar) {
        if (dVar.d.d()) {
            return false;
        }
        synchronized (this.l) {
            if (this.m) {
                return false;
            }
            this.k.add(dVar);
            return true;
        }
    }

    public void a(com.applovin.impl.yl ylVar, com.applovin.impl.tm.b bVar, long j, boolean z) {
        if (ylVar == null) {
            throw new java.lang.IllegalArgumentException("No task specified");
        }
        if (j >= 0) {
            com.applovin.impl.tm.d dVar = new com.applovin.impl.tm.d(this.f1368a, ylVar, bVar);
            if (!b(dVar)) {
                a(dVar, j, z);
                return;
            } else {
                if (com.applovin.impl.sdk.n.a()) {
                    this.b.d(ylVar.c(), "Task execution delayed until after init");
                    return;
                }
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("Invalid delay (millis) specified: " + j);
    }

    public java.util.concurrent.ScheduledFuture b(com.applovin.impl.yl ylVar, com.applovin.impl.tm.b bVar, long j) {
        if (this.n) {
            return a(new com.applovin.impl.tm.d(this.f1368a, ylVar, bVar)).schedule(ylVar, j, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        return this.c.schedule(ylVar, j, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    private java.util.concurrent.ScheduledThreadPoolExecutor b(java.lang.String str, int i) {
        return new java.util.concurrent.ScheduledThreadPoolExecutor(i, new com.applovin.impl.tm.c(str));
    }

    public void a(com.applovin.impl.yl ylVar, com.applovin.impl.oe oeVar) {
        java.lang.String strB = oeVar.b();
        java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = (java.util.concurrent.ScheduledThreadPoolExecutor) this.j.get(strB);
        if (scheduledThreadPoolExecutorB == null) {
            scheduledThreadPoolExecutorB = b(strB, 1);
            this.j.put(strB, scheduledThreadPoolExecutorB);
        }
        scheduledThreadPoolExecutorB.submit(new com.applovin.impl.tm.d(this.f1368a, ylVar, com.applovin.impl.tm.b.MEDIATION));
    }

    public void a(java.lang.Runnable runnable, com.applovin.impl.tm.b bVar) {
        if (this.n) {
            com.applovin.impl.sdk.j jVar = this.f1368a;
            com.applovin.impl.tm.d dVar = new com.applovin.impl.tm.d(jVar, new com.applovin.impl.jn(jVar, "auxiliaryOperation", runnable), bVar);
            a(dVar).submit(dVar);
            return;
        }
        this.c.submit(runnable);
    }

    public void a(com.applovin.impl.yl ylVar) {
        if (ylVar != null) {
            java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.n ? this.e : this.d;
            try {
                if (com.applovin.impl.yp.h()) {
                    scheduledThreadPoolExecutor.submit(new com.applovin.impl.tm.d(this.f1368a, ylVar, com.applovin.impl.tm.b.CORE));
                    return;
                }
                java.util.concurrent.ScheduledFuture scheduledFutureB = ylVar.b(java.lang.Thread.currentThread(), ((java.lang.Long) this.f1368a.a(com.applovin.impl.sj.y)).longValue());
                ylVar.run();
                if (scheduledFutureB != null) {
                    scheduledFutureB.cancel(false);
                    return;
                }
                return;
            } catch (java.lang.Throwable th) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.b.a(ylVar.c(), "Task failed execution", th);
                }
                ylVar.a(th);
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("No task specified");
    }

    public java.util.concurrent.ExecutorService a() {
        return this.n ? this.i : this.c;
    }

    private void a(final com.applovin.impl.tm.d dVar, long j, boolean z) {
        final java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutorA = this.n ? a(dVar) : this.d;
        if (j <= 0) {
            scheduledThreadPoolExecutorA.submit(dVar);
        } else if (z) {
            com.applovin.impl.x1.a(j, this.f1368a, new java.lang.Runnable() { // from class: com.applovin.impl.tm$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledThreadPoolExecutorA.execute(dVar);
                }
            });
        } else {
            scheduledThreadPoolExecutorA.schedule(dVar, j, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
    }

    private java.util.concurrent.ScheduledThreadPoolExecutor a(com.applovin.impl.tm.d dVar) {
        int i = com.applovin.impl.tm.a.f1369a[dVar.f.ordinal()];
        if (i == 1) {
            return this.e;
        }
        if (i == 2) {
            return this.g;
        }
        if (i == 3) {
            return this.h;
        }
        if (i != 4) {
            return this.i;
        }
        return this.f;
    }

    public java.util.List a(java.util.List list, java.util.concurrent.ExecutorService executorService) {
        try {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.a("TaskManager", "Awaiting " + list.size() + " tasks...");
            }
            return executorService.invokeAll(list);
        } catch (java.lang.Throwable th) {
            if (!com.applovin.impl.sdk.n.a()) {
                return null;
            }
            this.b.a("TaskManager", "Awaiting tasks were interrupted", th);
            return null;
        }
    }
}
