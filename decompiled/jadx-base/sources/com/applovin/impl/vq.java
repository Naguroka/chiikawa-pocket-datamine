package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class vq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.q8 f1437a = new com.applovin.impl.q8();
    private final com.applovin.impl.vq.b b;
    private final com.applovin.impl.vq.e c;
    private boolean d;
    private android.view.Surface e;
    private float f;
    private float g;
    private float h;
    private float i;
    private int j;
    private long k;
    private long l;
    private long m;
    private long n;
    private long o;
    private long p;
    private long q;

    /* JADX INFO: Access modifiers changed from: private */
    interface b {

        public interface a {
            void a(android.view.Display display);
        }

        void a();

        void a(com.applovin.impl.vq.b.a aVar);
    }

    private void h() {
        if (com.applovin.impl.xp.f1515a < 30 || this.e == null) {
            return;
        }
        float fB = this.f1437a.e() ? this.f1437a.b() : this.f;
        float f = this.g;
        if (fB == f) {
            return;
        }
        if (fB != -1.0f && f != -1.0f) {
            if (java.lang.Math.abs(fB - this.g) < ((!this.f1437a.e() || this.f1437a.d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (fB == -1.0f && this.f1437a.c() < 30) {
            return;
        }
        this.g = fB;
        a(false);
    }

    public vq(android.content.Context context) {
        com.applovin.impl.vq.b bVarA = a(context);
        this.b = bVarA;
        this.c = bVarA != null ? com.applovin.impl.vq.e.d() : null;
        this.k = androidx.media3.common.C.TIME_UNSET;
        this.l = androidx.media3.common.C.TIME_UNSET;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public void c() {
        if (this.b != null) {
            ((com.applovin.impl.vq.e) com.applovin.impl.b1.a(this.c)).a();
            this.b.a(new com.applovin.impl.vq.b.a() { // from class: com.applovin.impl.vq$$ExternalSyntheticLambda0
                @Override // com.applovin.impl.vq.b.a
                public final void a(android.view.Display display) {
                    this.f$0.a(display);
                }
            });
        }
    }

    public void e() {
        this.d = true;
        g();
        a(false);
    }

    public void d() {
        g();
    }

    public void f() {
        this.d = false;
        a();
    }

    public void b() {
        com.applovin.impl.vq.b bVar = this.b;
        if (bVar != null) {
            bVar.a();
            ((com.applovin.impl.vq.e) com.applovin.impl.b1.a(this.c)).e();
        }
    }

    public long a(long j) {
        long j2;
        if (this.p == -1 || !this.f1437a.e()) {
            j2 = j;
        } else {
            long jA = this.q + ((long) ((this.f1437a.a() * (this.m - this.p)) / this.i));
            if (a(j, jA)) {
                j2 = jA;
            } else {
                g();
                j2 = j;
            }
        }
        this.n = this.m;
        this.o = j2;
        com.applovin.impl.vq.e eVar = this.c;
        if (eVar == null || this.k == androidx.media3.common.C.TIME_UNSET) {
            return j2;
        }
        long j3 = eVar.f1440a;
        return j3 == androidx.media3.common.C.TIME_UNSET ? j2 : a(j2, j3, this.k) - this.l;
    }

    private void g() {
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
    }

    private static final class a {
        public static void a(android.view.Surface surface, float f) {
            try {
                surface.setFrameRate(f, f == 0.0f ? 0 : 1);
            } catch (java.lang.IllegalStateException e) {
                com.applovin.impl.oc.a("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    public void b(long j) {
        long j2 = this.n;
        if (j2 != -1) {
            this.p = j2;
            this.q = this.o;
        }
        this.m++;
        this.f1437a.a(j * 1000);
        h();
    }

    private static final class c implements com.applovin.impl.vq.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.view.WindowManager f1438a;

        @Override // com.applovin.impl.vq.b
        public void a() {
        }

        public static com.applovin.impl.vq.b a(android.content.Context context) {
            android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new com.applovin.impl.vq.c(windowManager);
            }
            return null;
        }

        private c(android.view.WindowManager windowManager) {
            this.f1438a = windowManager;
        }

        @Override // com.applovin.impl.vq.b
        public void a(com.applovin.impl.vq.b.a aVar) {
            aVar.a(this.f1438a.getDefaultDisplay());
        }
    }

    private static final class d implements com.applovin.impl.vq.b, android.hardware.display.DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.hardware.display.DisplayManager f1439a;
        private com.applovin.impl.vq.b.a b;

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }

        public static com.applovin.impl.vq.b a(android.content.Context context) {
            android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new com.applovin.impl.vq.d(displayManager);
            }
            return null;
        }

        private d(android.hardware.display.DisplayManager displayManager) {
            this.f1439a = displayManager;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            com.applovin.impl.vq.b.a aVar = this.b;
            if (aVar == null || i != 0) {
                return;
            }
            aVar.a(b());
        }

        private android.view.Display b() {
            return this.f1439a.getDisplay(0);
        }

        @Override // com.applovin.impl.vq.b
        public void a(com.applovin.impl.vq.b.a aVar) {
            this.b = aVar;
            this.f1439a.registerDisplayListener(this, com.applovin.impl.xp.a());
            aVar.a(b());
        }

        @Override // com.applovin.impl.vq.b
        public void a() {
            this.f1439a.unregisterDisplayListener(this);
            this.b = null;
        }
    }

    private static boolean a(long j, long j2) {
        return java.lang.Math.abs(j - j2) <= 20000000;
    }

    private static final class e implements android.view.Choreographer.FrameCallback, android.os.Handler.Callback {
        private static final com.applovin.impl.vq.e g = new com.applovin.impl.vq.e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile long f1440a = androidx.media3.common.C.TIME_UNSET;
        private final android.os.Handler b;
        private final android.os.HandlerThread c;
        private android.view.Choreographer d;
        private int f;

        public static com.applovin.impl.vq.e d() {
            return g;
        }

        private e() {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.c = handlerThread;
            handlerThread.start();
            android.os.Handler handlerA = com.applovin.impl.xp.a(handlerThread.getLooper(), (android.os.Handler.Callback) this);
            this.b = handlerA;
            handlerA.sendEmptyMessage(0);
        }

        public void a() {
            this.b.sendEmptyMessage(1);
        }

        public void e() {
            this.b.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.f1440a = j;
            ((android.view.Choreographer) com.applovin.impl.b1.a(this.d)).postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            int i = message.what;
            if (i == 0) {
                c();
                return true;
            }
            if (i == 1) {
                b();
                return true;
            }
            if (i != 2) {
                return false;
            }
            f();
            return true;
        }

        private void c() {
            this.d = android.view.Choreographer.getInstance();
        }

        private void b() {
            int i = this.f + 1;
            this.f = i;
            if (i == 1) {
                ((android.view.Choreographer) com.applovin.impl.b1.a(this.d)).postFrameCallback(this);
            }
        }

        private void f() {
            int i = this.f - 1;
            this.f = i;
            if (i == 0) {
                ((android.view.Choreographer) com.applovin.impl.b1.a(this.d)).removeFrameCallback(this);
                this.f1440a = androidx.media3.common.C.TIME_UNSET;
            }
        }
    }

    public void b(float f) {
        this.i = f;
        g();
        a(false);
    }

    private static long a(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            j5 = j3 + j5;
            j4 = j5;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    private static com.applovin.impl.vq.b a(android.content.Context context) {
        if (context == null) {
            return null;
        }
        android.content.Context applicationContext = context.getApplicationContext();
        com.applovin.impl.vq.b bVarA = com.applovin.impl.xp.f1515a >= 17 ? com.applovin.impl.vq.d.a(applicationContext) : null;
        return bVarA == null ? com.applovin.impl.vq.c.a(applicationContext) : bVarA;
    }

    public void a(float f) {
        this.f = f;
        this.f1437a.f();
        h();
    }

    public void a(android.view.Surface surface) {
        if (surface instanceof com.applovin.impl.g7) {
            surface = null;
        }
        if (this.e == surface) {
            return;
        }
        a();
        this.e = surface;
        a(true);
    }

    public void a(int i) {
        if (this.j == i) {
            return;
        }
        this.j = i;
        a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(android.view.Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.k = refreshRate;
            this.l = (refreshRate * 80) / 100;
        } else {
            com.applovin.impl.oc.d("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.k = androidx.media3.common.C.TIME_UNSET;
            this.l = androidx.media3.common.C.TIME_UNSET;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    private void a(boolean z) {
        android.view.Surface surface;
        float f;
        if (com.applovin.impl.xp.f1515a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        if (this.d) {
            float f2 = this.g;
            if (f2 != -1.0f) {
                f = f2 * this.i;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z || this.h != f) {
            this.h = f;
            com.applovin.impl.vq.a.a(surface, f);
        }
    }

    private void a() {
        android.view.Surface surface;
        if (com.applovin.impl.xp.f1515a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f) {
            return;
        }
        this.h = 0.0f;
        com.applovin.impl.vq.a.a(surface, 0.0f);
    }
}
