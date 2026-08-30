package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class go {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f829a;
    private java.util.Timer b;
    private long c;
    private long d;
    private long e;
    private boolean f;
    private final java.lang.Runnable g;
    private long h;
    private final java.lang.Object i = new java.lang.Object();

    private java.util.TimerTask b() {
        return new com.applovin.impl.go.a();
    }

    private go(com.applovin.impl.sdk.j jVar, java.lang.Runnable runnable) {
        this.f829a = jVar;
        this.g = runnable;
    }

    public long c() {
        if (this.b != null) {
            return this.d - (java.lang.System.currentTimeMillis() - this.c);
        }
        return this.d - this.h;
    }

    public void d() {
        synchronized (this.i) {
            java.util.Timer timer = this.b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.h = java.lang.Math.max(1L, java.lang.System.currentTimeMillis() - this.c);
                    this.b = null;
                } catch (java.lang.Throwable th) {
                    try {
                        com.applovin.impl.sdk.j jVar = this.f829a;
                        if (jVar != null) {
                            jVar.I();
                            if (com.applovin.impl.sdk.n.a()) {
                                this.f829a.I();
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.f829a.I().a("Timer", "Encountered error while pausing timer", th);
                                }
                            }
                        }
                        this.b = null;
                    } catch (java.lang.Throwable th2) {
                        this.b = null;
                        throw th2;
                    }
                }
            }
        }
    }

    public void e() {
        synchronized (this.i) {
            long j = this.h;
            if (j > 0) {
                try {
                    long j2 = this.d - j;
                    this.d = j2;
                    if (j2 < 0) {
                        this.d = 0L;
                    }
                    this.b = new java.util.Timer();
                    a(b(), this.d, this.f, this.e);
                    this.c = java.lang.System.currentTimeMillis();
                    this.h = 0L;
                } catch (java.lang.Throwable th) {
                    try {
                        com.applovin.impl.sdk.j jVar = this.f829a;
                        if (jVar != null) {
                            jVar.I();
                            if (com.applovin.impl.sdk.n.a()) {
                                this.f829a.I();
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.f829a.I().a("Timer", "Encountered error while resuming timer", th);
                                }
                            }
                        }
                        this.h = 0L;
                    } catch (java.lang.Throwable th2) {
                        this.h = 0L;
                        throw th2;
                    }
                }
            }
        }
    }

    class a extends java.util.TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                com.applovin.impl.go.this.g.run();
                synchronized (com.applovin.impl.go.this.i) {
                    if (!com.applovin.impl.go.this.f) {
                        com.applovin.impl.go.this.b = null;
                    } else {
                        com.applovin.impl.go.this.c = java.lang.System.currentTimeMillis();
                        com.applovin.impl.go goVar = com.applovin.impl.go.this;
                        goVar.d = goVar.e;
                    }
                }
            } catch (java.lang.Throwable th) {
                try {
                    if (com.applovin.impl.go.this.f829a != null) {
                        com.applovin.impl.go.this.f829a.I();
                        if (com.applovin.impl.sdk.n.a()) {
                            com.applovin.impl.go.this.f829a.I().a("Timer", "Encountered error while executing timed task", th);
                        }
                        com.applovin.impl.go.this.f829a.D().a("Timer", "executingTimedTask", th);
                    }
                } finally {
                    synchronized (com.applovin.impl.go.this.i) {
                        if (!com.applovin.impl.go.this.f) {
                            com.applovin.impl.go.this.b = null;
                        } else {
                            com.applovin.impl.go.this.c = java.lang.System.currentTimeMillis();
                            com.applovin.impl.go goVar2 = com.applovin.impl.go.this;
                            goVar2.d = goVar2.e;
                        }
                    }
                }
            }
        }
    }

    public void a() {
        synchronized (this.i) {
            java.util.Timer timer = this.b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.b = null;
                } catch (java.lang.Throwable th) {
                    try {
                        com.applovin.impl.sdk.j jVar = this.f829a;
                        if (jVar != null) {
                            jVar.I();
                            if (com.applovin.impl.sdk.n.a()) {
                                this.f829a.I();
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.f829a.I().a("Timer", "Encountered error while cancelling timer", th);
                                }
                            }
                        }
                        this.b = null;
                    } catch (java.lang.Throwable th2) {
                        this.b = null;
                        this.h = 0L;
                        throw th2;
                    }
                }
                this.h = 0L;
            }
        }
    }

    public static com.applovin.impl.go a(long j, com.applovin.impl.sdk.j jVar, java.lang.Runnable runnable) {
        return a(j, false, jVar, runnable);
    }

    public static com.applovin.impl.go a(long j, boolean z, com.applovin.impl.sdk.j jVar, java.lang.Runnable runnable) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j + ".");
        }
        if (runnable != null) {
            com.applovin.impl.go goVar = new com.applovin.impl.go(jVar, runnable);
            goVar.c = java.lang.System.currentTimeMillis();
            goVar.d = j;
            goVar.f = z;
            goVar.e = j;
            try {
                goVar.b = new java.util.Timer();
                goVar.a(goVar.b(), j, z, goVar.e);
            } catch (java.lang.OutOfMemoryError e) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().a("Timer", "Failed to create timer due to OOM error", e);
                }
            }
            return goVar;
        }
        throw new java.lang.IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
    }

    private void a(java.util.TimerTask timerTask, long j, boolean z, long j2) {
        if (z) {
            this.b.schedule(timerTask, j, j2);
        } else {
            this.b.schedule(timerTask, j);
        }
    }
}
