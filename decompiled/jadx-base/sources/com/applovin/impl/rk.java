package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class rk extends android.opengl.GLSurfaceView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.CopyOnWriteArrayList f1228a;
    private final android.hardware.SensorManager b;
    private final android.hardware.Sensor c;
    private final com.applovin.impl.wg d;
    private final android.os.Handler f;
    private final com.applovin.impl.jo g;
    private final com.applovin.impl.dj h;
    private android.graphics.SurfaceTexture i;
    private android.view.Surface j;
    private boolean k;
    private boolean l;
    private boolean m;

    public interface b {
        void a(android.view.Surface surface);

        void b(android.view.Surface surface);
    }

    public rk(android.content.Context context) {
        this(context, null);
    }

    public android.view.Surface getVideoSurface() {
        return this.j;
    }

    public com.applovin.impl.uq getVideoFrameMetadataListener() {
        return this.h;
    }

    public com.applovin.impl.v2 getCameraMotionListener() {
        return this.h;
    }

    public void setDefaultStereoMode(int i) {
        this.h.a(i);
    }

    public void setUseSensorRotation(boolean z) {
        this.k = z;
        b();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.l = true;
        b();
    }

    public rk(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1228a = new java.util.concurrent.CopyOnWriteArrayList();
        this.f = new android.os.Handler(android.os.Looper.getMainLooper());
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) com.applovin.impl.b1.a(context.getSystemService("sensor"));
        this.b = sensorManager;
        android.hardware.Sensor defaultSensor = com.applovin.impl.xp.f1515a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        com.applovin.impl.dj djVar = new com.applovin.impl.dj();
        this.h = djVar;
        com.applovin.impl.rk.a aVar = new com.applovin.impl.rk.a(djVar);
        com.applovin.impl.jo joVar = new com.applovin.impl.jo(context, aVar, 25.0f);
        this.g = joVar;
        this.d = new com.applovin.impl.wg(((android.view.WindowManager) com.applovin.impl.b1.a((android.view.WindowManager) context.getSystemService("window"))).getDefaultDisplay(), joVar, aVar);
        this.k = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(joVar);
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.l = false;
        b();
        super.onPause();
    }

    public void a(com.applovin.impl.rk.b bVar) {
        this.f1228a.add(bVar);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.post(new java.lang.Runnable() { // from class: com.applovin.impl.rk$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final android.graphics.SurfaceTexture surfaceTexture) {
        this.f.post(new java.lang.Runnable() { // from class: com.applovin.impl.rk$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(surfaceTexture);
            }
        });
    }

    final class a implements android.opengl.GLSurfaceView.Renderer, com.applovin.impl.jo.a, com.applovin.impl.wg.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.dj f1229a;
        private final float[] d;
        private final float[] e;
        private final float[] f;
        private float g;
        private float h;
        private final float[] b = new float[16];
        private final float[] c = new float[16];
        private final float[] i = new float[16];
        private final float[] j = new float[16];

        public a(com.applovin.impl.dj djVar) {
            float[] fArr = new float[16];
            this.d = fArr;
            float[] fArr2 = new float[16];
            this.e = fArr2;
            float[] fArr3 = new float[16];
            this.f = fArr3;
            this.f1229a = djVar;
            android.opengl.Matrix.setIdentityM(fArr, 0);
            android.opengl.Matrix.setIdentityM(fArr2, 0);
            android.opengl.Matrix.setIdentityM(fArr3, 0);
            this.h = 3.1415927f;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
            com.applovin.impl.rk.this.b(this.f1229a.b());
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl10, int i, int i2) {
            android.opengl.GLES20.glViewport(0, 0, i, i2);
            float f = i / i2;
            android.opengl.Matrix.perspectiveM(this.b, 0, a(f), f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl10) {
            synchronized (this) {
                android.opengl.Matrix.multiplyMM(this.j, 0, this.d, 0, this.f, 0);
                android.opengl.Matrix.multiplyMM(this.i, 0, this.e, 0, this.j, 0);
            }
            android.opengl.Matrix.multiplyMM(this.c, 0, this.b, 0, this.i, 0);
            this.f1229a.a(this.c, false);
        }

        @Override // com.applovin.impl.jo.a
        public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
            return com.applovin.impl.rk.this.performClick();
        }

        private float a(float f) {
            if (f > 1.0f) {
                return (float) (java.lang.Math.toDegrees(java.lang.Math.atan(java.lang.Math.tan(java.lang.Math.toRadians(45.0d)) / ((double) f))) * 2.0d);
            }
            return 90.0f;
        }

        @Override // com.applovin.impl.wg.a
        public synchronized void a(float[] fArr, float f) {
            float[] fArr2 = this.d;
            java.lang.System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.h = -f;
            a();
        }

        @Override // com.applovin.impl.jo.a
        public synchronized void a(android.graphics.PointF pointF) {
            this.g = pointF.y;
            a();
            android.opengl.Matrix.setRotateM(this.f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        private void a() {
            android.opengl.Matrix.setRotateM(this.e, 0, -this.g, (float) java.lang.Math.cos(this.h), (float) java.lang.Math.sin(this.h), 0.0f);
        }
    }

    public void b(com.applovin.impl.rk.b bVar) {
        this.f1228a.remove(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        android.view.Surface surface = this.j;
        if (surface != null) {
            java.util.Iterator it = this.f1228a.iterator();
            while (it.hasNext()) {
                ((com.applovin.impl.rk.b) it.next()).a(surface);
            }
        }
        a(this.i, surface);
        this.i = null;
        this.j = null;
    }

    private void b() {
        boolean z = this.k && this.l;
        android.hardware.Sensor sensor = this.c;
        if (sensor == null || z == this.m) {
            return;
        }
        if (z) {
            this.b.registerListener(this.d, sensor, 0);
        } else {
            this.b.unregisterListener(this.d);
        }
        this.m = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(android.graphics.SurfaceTexture surfaceTexture) {
        android.graphics.SurfaceTexture surfaceTexture2 = this.i;
        android.view.Surface surface = this.j;
        android.view.Surface surface2 = new android.view.Surface(surfaceTexture);
        this.i = surfaceTexture;
        this.j = surface2;
        java.util.Iterator it = this.f1228a.iterator();
        while (it.hasNext()) {
            ((com.applovin.impl.rk.b) it.next()).b(surface2);
        }
        a(surfaceTexture2, surface);
    }

    private static void a(android.graphics.SurfaceTexture surfaceTexture, android.view.Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }
}
