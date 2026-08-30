package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class m7 implements android.graphics.SurfaceTexture.OnFrameAvailableListener, java.lang.Runnable {
    private static final int[] h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.Handler f1018a;
    private final int[] b;
    private android.opengl.EGLDisplay c;
    private android.opengl.EGLContext d;
    private android.opengl.EGLSurface f;
    private android.graphics.SurfaceTexture g;

    public interface c {
    }

    private void a() {
    }

    public static final class b extends java.lang.RuntimeException {
        private b(java.lang.String str) {
            super(str);
        }
    }

    public m7(android.os.Handler handler) {
        this(handler, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d() {
        this.f1018a.removeCallbacks(this);
        try {
            android.graphics.SurfaceTexture surfaceTexture = this.g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                android.opengl.GLES20.glDeleteTextures(1, this.b, 0);
            }
        } finally {
            android.opengl.EGLDisplay eGLDisplay = this.c;
            if (eGLDisplay != null && !eGLDisplay.equals(android.opengl.EGL14.EGL_NO_DISPLAY)) {
                android.opengl.EGLDisplay eGLDisplay2 = this.c;
                android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
                android.opengl.EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
            }
            android.opengl.EGLSurface eGLSurface2 = this.f;
            if (eGLSurface2 != null && !eGLSurface2.equals(android.opengl.EGL14.EGL_NO_SURFACE)) {
                android.opengl.EGL14.eglDestroySurface(this.c, this.f);
            }
            android.opengl.EGLContext eGLContext = this.d;
            if (eGLContext != null) {
                android.opengl.EGL14.eglDestroyContext(this.c, eGLContext);
            }
            if (com.applovin.impl.xp.f1515a >= 19) {
                android.opengl.EGL14.eglReleaseThread();
            }
            android.opengl.EGLDisplay eGLDisplay3 = this.c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(android.opengl.EGL14.EGL_NO_DISPLAY)) {
                android.opengl.EGL14.eglTerminate(this.c);
            }
            this.c = null;
            this.d = null;
            this.f = null;
            this.g = null;
        }
    }

    public android.graphics.SurfaceTexture c() {
        return (android.graphics.SurfaceTexture) com.applovin.impl.b1.a(this.g);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        this.f1018a.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        a();
        android.graphics.SurfaceTexture surfaceTexture = this.g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (java.lang.RuntimeException unused) {
            }
        }
    }

    private static android.opengl.EGLDisplay b() {
        android.opengl.EGLDisplay eGLDisplayEglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay != null) {
            int[] iArr = new int[2];
            if (android.opengl.EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                return eGLDisplayEglGetDisplay;
            }
            throw new com.applovin.impl.m7.b("eglInitialize failed");
        }
        throw new com.applovin.impl.m7.b("eglGetDisplay failed");
    }

    public m7(android.os.Handler handler, com.applovin.impl.m7.c cVar) {
        this.f1018a = handler;
        this.b = new int[1];
    }

    private static android.opengl.EGLConfig a(android.opengl.EGLDisplay eGLDisplay) {
        android.opengl.EGLConfig eGLConfig;
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = android.opengl.EGL14.eglChooseConfig(eGLDisplay, h, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (!zEglChooseConfig || iArr[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
            throw new com.applovin.impl.m7.b(com.applovin.impl.xp.a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", java.lang.Boolean.valueOf(zEglChooseConfig), java.lang.Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        }
        return eGLConfig;
    }

    private static android.opengl.EGLContext a(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLConfig eGLConfig, int i) {
        android.opengl.EGLContext eGLContextEglCreateContext = android.opengl.EGL14.eglCreateContext(eGLDisplay, eGLConfig, android.opengl.EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eGLContextEglCreateContext != null) {
            return eGLContextEglCreateContext;
        }
        throw new com.applovin.impl.m7.b("eglCreateContext failed");
    }

    private static android.opengl.EGLSurface a(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLConfig eGLConfig, android.opengl.EGLContext eGLContext, int i) {
        android.opengl.EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eGLSurfaceEglCreatePbufferSurface == null) {
                throw new com.applovin.impl.m7.b("eglCreatePbufferSurface failed");
            }
        }
        if (android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext)) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new com.applovin.impl.m7.b("eglMakeCurrent failed");
    }

    private static void a(int[] iArr) {
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        com.applovin.impl.aa.a();
    }

    public void a(int i) {
        android.opengl.EGLDisplay eGLDisplayB = b();
        this.c = eGLDisplayB;
        android.opengl.EGLConfig eGLConfigA = a(eGLDisplayB);
        android.opengl.EGLContext eGLContextA = a(this.c, eGLConfigA, i);
        this.d = eGLContextA;
        this.f = a(this.c, eGLConfigA, eGLContextA, i);
        a(this.b);
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(this.b[0]);
        this.g = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }
}
