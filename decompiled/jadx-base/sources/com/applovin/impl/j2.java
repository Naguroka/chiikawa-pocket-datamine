package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f903a;
    private final com.applovin.impl.sdk.n b;
    private final long c;
    private final long d;
    private final int e;
    private final int f;
    private final int g;
    private android.os.Handler k;
    private android.os.HandlerThread l;
    private com.applovin.impl.j2.c n;
    private java.lang.ref.WeakReference h = new java.lang.ref.WeakReference(null);
    private int i = 0;
    private java.lang.Integer j = null;
    private final java.lang.Runnable m = new java.lang.Runnable() { // from class: com.applovin.impl.j2$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.a();
        }
    };

    public interface c {
        void a(android.view.View view);
    }

    private interface d {
        void a(android.graphics.Bitmap bitmap);

        void a(boolean z);
    }

    static /* synthetic */ int e(com.applovin.impl.j2 j2Var) {
        int i = j2Var.i;
        j2Var.i = i + 1;
        return i;
    }

    public j2(com.applovin.impl.sdk.j jVar) {
        this.f903a = jVar;
        this.b = jVar.I();
        this.c = ((java.lang.Long) jVar.a(com.applovin.impl.sj.T5)).longValue();
        this.d = ((java.lang.Long) jVar.a(com.applovin.impl.sj.S5)).longValue();
        this.e = ((java.lang.Integer) jVar.a(com.applovin.impl.sj.U5)).intValue();
        this.f = ((java.lang.Integer) jVar.a(com.applovin.impl.sj.V5)).intValue();
        this.g = ((java.lang.Integer) jVar.a(com.applovin.impl.sj.W5)).intValue();
    }

    public void b() {
        g();
        android.os.HandlerThread handlerThread = this.l;
        if (handlerThread != null) {
            handlerThread.quit();
            this.l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.h.get() != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.a("BlackViewDetector", "Stopped monitoring view: " + this.h.get());
            }
            this.h.clear();
        }
        android.os.Handler handler = this.k;
        if (handler != null) {
            handler.removeCallbacks(this.m);
            this.k = null;
        }
        if (this.n != null) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.j2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.c();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.n = null;
    }

    class a implements com.applovin.impl.j2.d {
        a() {
        }

        @Override // com.applovin.impl.j2.d
        public void a(android.graphics.Bitmap bitmap) {
            try {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i = width / com.applovin.impl.j2.this.e;
                int i2 = height / com.applovin.impl.j2.this.e;
                int i3 = i / 2;
                for (int i4 = i2 / 2; i4 < height; i4 += i2) {
                    for (int i5 = i3; i5 < width; i5 += i) {
                        int pixel = bitmap.getPixel(i5, i4);
                        if (!com.applovin.impl.j2.this.a(pixel)) {
                            if (com.applovin.impl.j2.this.j == null) {
                                com.applovin.impl.j2.this.j = java.lang.Integer.valueOf(pixel);
                            }
                        } else {
                            bitmap.recycle();
                            com.applovin.impl.j2.this.f();
                            com.applovin.impl.j2.this.d();
                            return;
                        }
                    }
                }
                com.applovin.impl.j2.e(com.applovin.impl.j2.this);
                bitmap.recycle();
                com.applovin.impl.j2.this.d();
            } catch (java.lang.Exception e) {
                com.applovin.impl.j2.this.f903a.D().a("BlackViewDetector", "onScreenshotCaptured", e);
                com.applovin.impl.j2.this.g();
            }
        }

        @Override // com.applovin.impl.j2.d
        public void a(boolean z) {
            if (z) {
                com.applovin.impl.j2.this.g();
            } else {
                com.applovin.impl.j2.this.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        android.app.ActivityManager.MemoryInfo memoryInfoA;
        android.view.View view = (android.view.View) this.h.get();
        if (view == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.k("BlackViewDetector", "Monitored view no longer exists.");
            }
            g();
            return;
        }
        java.lang.Long l = (java.lang.Long) this.f903a.a(com.applovin.impl.sj.a6);
        if (l.longValue() > 0 && (memoryInfoA = com.applovin.impl.yp.a((android.app.ActivityManager) com.applovin.impl.sdk.j.m().getSystemService("activity"))) != null && memoryInfoA.availMem < l.longValue()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.k("BlackViewDetector", "Cancelling black view detection due to low memory");
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.b.a("BlackViewDetector", "Checking for black view: " + view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0) {
            a(view, new com.applovin.impl.j2.a());
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.b.k("BlackViewDetector", "Monitored view is not visible due to dimensions (width = " + measuredWidth + ", height = " + measuredHeight + ")");
        }
        f();
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        long j = this.c;
        if (j > 0) {
            if (this.i > 1) {
                e();
                g();
                return;
            }
            android.os.Handler handler = this.k;
            if (handler != null) {
                handler.postDelayed(this.m, j);
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.b.k("BlackViewDetector", "Monitoring handler was unexpectedly null");
            }
            g();
            return;
        }
        if (this.i == 1) {
            e();
        }
        g();
    }

    private void e() {
        final android.view.View view = (android.view.View) this.h.get();
        if (com.applovin.impl.sdk.n.a()) {
            this.b.k("BlackViewDetector", "Detected black view: " + view);
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.j2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.i = 0;
        this.j = null;
    }

    class b implements android.view.PixelCopy.OnPixelCopyFinishedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.j2.d f905a;
        final /* synthetic */ android.graphics.Bitmap b;

        b(com.applovin.impl.j2.d dVar, android.graphics.Bitmap bitmap) {
            this.f905a = dVar;
            this.b = bitmap;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i) {
            if (i != 0) {
                com.applovin.impl.sdk.n unused = com.applovin.impl.j2.this.b;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.j2.this.b.b("BlackViewDetector", "Failed to capture screenshot with error code: " + i);
                }
                this.f905a.a(true);
                return;
            }
            this.f905a.a(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x004e  */
    public boolean a(int i) {
        boolean z;
        int iRed = android.graphics.Color.red(i);
        int iGreen = android.graphics.Color.green(i);
        int iBlue = android.graphics.Color.blue(i);
        java.lang.Integer num = this.j;
        if (num != null) {
            int iRed2 = android.graphics.Color.red(num.intValue());
            int iGreen2 = android.graphics.Color.green(this.j.intValue());
            int iBlue2 = android.graphics.Color.blue(this.j.intValue());
            if (java.lang.Math.abs(iRed - iRed2) > this.g || java.lang.Math.abs(iGreen - iGreen2) > this.g || java.lang.Math.abs(iBlue - iBlue2) > this.g) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        int i2 = this.f;
        return iRed > i2 || iGreen > i2 || iBlue > i2 || z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.view.View view) {
        com.applovin.impl.j2.c cVar = this.n;
        if (cVar != null) {
            cVar.a(view);
        }
    }

    public void a(android.view.View view, com.applovin.impl.j2.c cVar) {
        if (((java.lang.Boolean) this.f903a.a(com.applovin.impl.sj.R5)).booleanValue()) {
            android.view.View view2 = (android.view.View) this.h.get();
            if (view2 != null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.b.k("BlackViewDetector", "Monitoring is already in progress for a view: " + view2);
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.b.a("BlackViewDetector", "Started monitoring view: " + view);
            }
            try {
                if (this.l == null) {
                    android.os.HandlerThread handlerThread = new android.os.HandlerThread("AppLovinSdk:black_view_detector");
                    this.l = handlerThread;
                    handlerThread.start();
                } else {
                    this.f903a.D().a(com.applovin.impl.ka.P, "BlackViewDetector:maybeStartMonitoring() unexpectedly called multiple times");
                    g();
                }
                this.n = cVar;
                this.h = new java.lang.ref.WeakReference(view);
                f();
                android.os.Handler handler = new android.os.Handler(this.l.getLooper());
                this.k = handler;
                handler.postDelayed(this.m, this.d);
            } catch (java.lang.Throwable th) {
                g();
                this.f903a.D().a("BlackViewDetector", "maybeStartMonitoring", th);
            }
        }
    }

    private void a(android.view.View view, com.applovin.impl.j2.d dVar) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            android.app.Activity activityA = this.f903a.e().a();
            if (activityA == null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.b.b("BlackViewDetector", "Failed to capture screenshot due to no active activity");
                }
                dVar.a(false);
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            android.graphics.Rect rect = new android.graphics.Rect(i, i2, i + measuredWidth, i2 + measuredHeight);
            try {
                android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(measuredWidth, measuredHeight, android.graphics.Bitmap.Config.ARGB_8888);
                android.view.PixelCopy.request(activityA.getWindow(), rect, bitmapCreateBitmap, new com.applovin.impl.j2.b(dVar, bitmapCreateBitmap), new android.os.Handler());
                return;
            } catch (java.lang.Throwable th) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.b.b("BlackViewDetector", "Failed to capture screenshot due to exception: " + th);
                }
                dVar.a(true);
                return;
            }
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.b.k("BlackViewDetector", "Unable to capture screenshots on views below API 26");
        }
        dVar.a(true);
    }
}
