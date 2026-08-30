package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class g7 extends android.view.Surface {
    private static int d;
    private static boolean f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f808a;
    private final com.applovin.impl.g7.b b;
    private boolean c;

    public static synchronized boolean b(android.content.Context context) {
        if (!f) {
            d = a(context);
            f = true;
        }
        return d != 0;
    }

    private g7(com.applovin.impl.g7.b bVar, android.graphics.SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = bVar;
        this.f808a = z;
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.b) {
            if (!this.c) {
                this.b.a();
                this.c = true;
            }
        }
    }

    private static int a(android.content.Context context) {
        if (com.applovin.impl.aa.a(context)) {
            return com.applovin.impl.aa.c() ? 1 : 2;
        }
        return 0;
    }

    private static class b extends android.os.HandlerThread implements android.os.Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.applovin.impl.m7 f809a;
        private android.os.Handler b;
        private java.lang.Error c;
        private java.lang.RuntimeException d;
        private com.applovin.impl.g7 f;

        public b() {
            super("ExoPlayer:DummySurface");
        }

        public com.applovin.impl.g7 a(int i) {
            boolean z;
            start();
            this.b = new android.os.Handler(getLooper(), this);
            this.f809a = new com.applovin.impl.m7(this.b);
            synchronized (this) {
                z = false;
                this.b.obtainMessage(1, i, 0).sendToTarget();
                while (this.f == null && this.d == null && this.c == null) {
                    try {
                        wait();
                    } catch (java.lang.InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
            java.lang.RuntimeException runtimeException = this.d;
            if (runtimeException == null) {
                java.lang.Error error = this.c;
                if (error == null) {
                    return (com.applovin.impl.g7) com.applovin.impl.b1.a(this.f);
                }
                throw error;
            }
            throw runtimeException;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        b();
                    } catch (java.lang.Throwable th) {
                        try {
                            com.applovin.impl.oc.a("DummySurface", "Failed to release dummy surface", th);
                        } finally {
                            quit();
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (java.lang.Error e) {
                    com.applovin.impl.oc.a("DummySurface", "Failed to initialize dummy surface", e);
                    this.c = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (java.lang.RuntimeException e2) {
                    com.applovin.impl.oc.a("DummySurface", "Failed to initialize dummy surface", e2);
                    this.d = e2;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (java.lang.Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }

        private void b(int i) {
            com.applovin.impl.b1.a(this.f809a);
            this.f809a.a(i);
            this.f = new com.applovin.impl.g7(this, this.f809a.c(), i != 0);
        }

        public void a() {
            com.applovin.impl.b1.a(this.b);
            this.b.sendEmptyMessage(2);
        }

        private void b() {
            com.applovin.impl.b1.a(this.f809a);
            this.f809a.d();
        }
    }

    public static com.applovin.impl.g7 a(android.content.Context context, boolean z) {
        com.applovin.impl.b1.b(!z || b(context));
        return new com.applovin.impl.g7.b().a(z ? d : 0);
    }
}
