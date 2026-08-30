package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class nc {
    public static final com.applovin.impl.nc.c d;
    public static final com.applovin.impl.nc.c e;
    public static final com.applovin.impl.nc.c f;
    public static final com.applovin.impl.nc.c g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.ExecutorService f1090a;
    private com.applovin.impl.nc.d b;
    private java.io.IOException c;

    public interface b {
        com.applovin.impl.nc.c a(com.applovin.impl.nc.e eVar, long j, long j2, java.io.IOException iOException, int i);

        void a(com.applovin.impl.nc.e eVar, long j, long j2);

        void a(com.applovin.impl.nc.e eVar, long j, long j2, boolean z);
    }

    public interface e {
        void a();

        void b();
    }

    public interface f {
        void d();
    }

    public static final class h extends java.io.IOException {
        public h(java.lang.Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    static {
        long j = androidx.media3.common.C.TIME_UNSET;
        d = a(false, androidx.media3.common.C.TIME_UNSET);
        e = a(true, androidx.media3.common.C.TIME_UNSET);
        f = new com.applovin.impl.nc.c(2, j);
        g = new com.applovin.impl.nc.c(3, j);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1091a;
        private final long b;

        private c(int i, long j) {
            this.f1091a = i;
            this.b = j;
        }

        public boolean a() {
            int i = this.f1091a;
            return i == 0 || i == 1;
        }
    }

    public nc(java.lang.String str) {
        this.f1090a = com.applovin.impl.xp.e("ExoPlayer:Loader:" + str);
    }

    public boolean c() {
        return this.c != null;
    }

    public boolean d() {
        return this.b != null;
    }

    public void b() {
        this.c = null;
    }

    private final class d extends android.os.Handler implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1092a;
        private final com.applovin.impl.nc.e b;
        private final long c;
        private com.applovin.impl.nc.b d;
        private java.io.IOException f;
        private int g;
        private java.lang.Thread h;
        private boolean i;
        private volatile boolean j;

        public d(android.os.Looper looper, com.applovin.impl.nc.e eVar, com.applovin.impl.nc.b bVar, int i, long j) {
            super(looper);
            this.b = eVar;
            this.d = bVar;
            this.f1092a = i;
            this.c = j;
        }

        public void a(boolean z) {
            this.j = z;
            this.f = null;
            if (hasMessages(0)) {
                this.i = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.i = true;
                    this.b.b();
                    java.lang.Thread thread = this.h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                b();
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                ((com.applovin.impl.nc.b) com.applovin.impl.b1.a(this.d)).a(this.b, jElapsedRealtime, jElapsedRealtime - this.c, true);
                this.d = null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = !this.i;
                    this.h = java.lang.Thread.currentThread();
                }
                if (z) {
                    com.applovin.impl.ko.a("load:" + this.b.getClass().getSimpleName());
                    try {
                        this.b.a();
                        com.applovin.impl.ko.a();
                    } catch (java.lang.Throwable th) {
                        com.applovin.impl.ko.a();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.h = null;
                    java.lang.Thread.interrupted();
                }
                if (this.j) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (java.io.IOException e) {
                if (this.j) {
                    return;
                }
                obtainMessage(2, e).sendToTarget();
            } catch (java.lang.Error e2) {
                if (!this.j) {
                    com.applovin.impl.oc.a("LoadTask", "Unexpected error loading stream", e2);
                    obtainMessage(3, e2).sendToTarget();
                }
                throw e2;
            } catch (java.lang.Exception e3) {
                if (this.j) {
                    return;
                }
                com.applovin.impl.oc.a("LoadTask", "Unexpected exception loading stream", e3);
                obtainMessage(2, new com.applovin.impl.nc.h(e3)).sendToTarget();
            } catch (java.lang.OutOfMemoryError e4) {
                if (this.j) {
                    return;
                }
                com.applovin.impl.oc.a("LoadTask", "OutOfMemory error loading stream", e4);
                obtainMessage(2, new com.applovin.impl.nc.h(e4)).sendToTarget();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            long jC;
            if (this.j) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                a();
                return;
            }
            if (i != 3) {
                b();
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - this.c;
                com.applovin.impl.nc.b bVar = (com.applovin.impl.nc.b) com.applovin.impl.b1.a(this.d);
                if (this.i) {
                    bVar.a(this.b, jElapsedRealtime, j, false);
                    return;
                }
                int i2 = message.what;
                if (i2 == 1) {
                    try {
                        bVar.a(this.b, jElapsedRealtime, j);
                        return;
                    } catch (java.lang.RuntimeException e) {
                        com.applovin.impl.oc.a("LoadTask", "Unexpected exception handling load completed", e);
                        com.applovin.impl.nc.this.c = new com.applovin.impl.nc.h(e);
                        return;
                    }
                }
                if (i2 != 2) {
                    return;
                }
                java.io.IOException iOException = (java.io.IOException) message.obj;
                this.f = iOException;
                int i3 = this.g + 1;
                this.g = i3;
                com.applovin.impl.nc.c cVarA = bVar.a(this.b, jElapsedRealtime, j, iOException, i3);
                if (cVarA.f1091a != 3) {
                    if (cVarA.f1091a != 2) {
                        if (cVarA.f1091a == 1) {
                            this.g = 1;
                        }
                        if (cVarA.b != androidx.media3.common.C.TIME_UNSET) {
                            jC = cVarA.b;
                        } else {
                            jC = c();
                        }
                        a(jC);
                        return;
                    }
                    return;
                }
                com.applovin.impl.nc.this.c = this.f;
                return;
            }
            throw ((java.lang.Error) message.obj);
        }

        private void b() {
            com.applovin.impl.nc.this.b = null;
        }

        private long c() {
            return java.lang.Math.min((this.g - 1) * 1000, 5000);
        }

        private void a() {
            this.f = null;
            com.applovin.impl.nc.this.f1090a.execute((java.lang.Runnable) com.applovin.impl.b1.a(com.applovin.impl.nc.this.b));
        }

        public void a(int i) throws java.io.IOException {
            java.io.IOException iOException = this.f;
            if (iOException != null && this.g > i) {
                throw iOException;
            }
        }

        public void a(long j) {
            com.applovin.impl.b1.b(com.applovin.impl.nc.this.b == null);
            com.applovin.impl.nc.this.b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                a();
            }
        }
    }

    public void a() {
        ((com.applovin.impl.nc.d) com.applovin.impl.b1.b(this.b)).a(false);
    }

    private static final class g implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.nc.f f1093a;

        public g(com.applovin.impl.nc.f fVar) {
            this.f1093a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1093a.d();
        }
    }

    public void a(int i) throws java.io.IOException {
        java.io.IOException iOException = this.c;
        if (iOException == null) {
            com.applovin.impl.nc.d dVar = this.b;
            if (dVar != null) {
                if (i == Integer.MIN_VALUE) {
                    i = dVar.f1092a;
                }
                dVar.a(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    public void a(com.applovin.impl.nc.f fVar) {
        com.applovin.impl.nc.d dVar = this.b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f1090a.execute(new com.applovin.impl.nc.g(fVar));
        }
        this.f1090a.shutdown();
    }

    public long a(com.applovin.impl.nc.e eVar, com.applovin.impl.nc.b bVar, int i) {
        android.os.Looper looper = (android.os.Looper) com.applovin.impl.b1.b(android.os.Looper.myLooper());
        this.c = null;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        new com.applovin.impl.nc.d(looper, eVar, bVar, i, jElapsedRealtime).a(0L);
        return jElapsedRealtime;
    }

    public static com.applovin.impl.nc.c a(boolean z, long j) {
        return new com.applovin.impl.nc.c(z ? 1 : 0, j);
    }
}
