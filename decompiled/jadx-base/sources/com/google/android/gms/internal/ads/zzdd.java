package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdd implements android.graphics.SurfaceTexture.OnFrameAvailableListener, java.lang.Runnable {
    private static final int[] zza = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    private final android.os.Handler zzb;
    private final int[] zzc = new int[1];
    private android.opengl.EGLDisplay zzd;
    private android.opengl.EGLContext zze;
    private android.opengl.EGLSurface zzf;
    private android.graphics.SurfaceTexture zzg;

    public zzdd(android.os.Handler handler, com.google.android.gms.internal.ads.zzdc zzdcVar) {
        this.zzb = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        this.zzb.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.SurfaceTexture surfaceTexture = this.zzg;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (java.lang.RuntimeException unused) {
            }
        }
    }

    public final void zzb(int i) throws com.google.android.gms.internal.ads.zzde {
        android.opengl.EGLSurface eGLSurfaceEglCreatePbufferSurface;
        android.opengl.EGLDisplay eGLDisplayEglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        com.google.android.gms.internal.ads.zzdf.zza(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        com.google.android.gms.internal.ads.zzdf.zza(android.opengl.EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        this.zzd = eGLDisplayEglGetDisplay;
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = android.opengl.EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, zza, 0, eGLConfigArr, 0, 1, iArr2, 0);
        com.google.android.gms.internal.ads.zzdf.zza(zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null, java.lang.String.format(java.util.Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", java.lang.Boolean.valueOf(zEglChooseConfig), java.lang.Integer.valueOf(iArr2[0]), eGLConfigArr[0]));
        android.opengl.EGLConfig eGLConfig = eGLConfigArr[0];
        android.opengl.EGLContext eGLContextEglCreateContext = android.opengl.EGL14.eglCreateContext(this.zzd, eGLConfig, android.opengl.EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        com.google.android.gms.internal.ads.zzdf.zza(eGLContextEglCreateContext != null, "eglCreateContext failed");
        this.zze = eGLContextEglCreateContext;
        android.opengl.EGLDisplay eGLDisplay = this.zzd;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            com.google.android.gms.internal.ads.zzdf.zza(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        com.google.android.gms.internal.ads.zzdf.zza(android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext), "eglMakeCurrent failed");
        this.zzf = eGLSurfaceEglCreatePbufferSurface;
        android.opengl.GLES20.glGenTextures(1, this.zzc, 0);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = android.opengl.GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            java.lang.String strGluErrorString = android.opengl.GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(iGlGetError)));
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z = true;
        }
        if (z) {
            throw new com.google.android.gms.internal.ads.zzde(sb.toString());
        }
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(this.zzc[0]);
        this.zzg = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc() {
        this.zzb.removeCallbacks(this);
        try {
            android.graphics.SurfaceTexture surfaceTexture = this.zzg;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                android.opengl.GLES20.glDeleteTextures(1, this.zzc, 0);
            }
            android.opengl.EGLDisplay eGLDisplay = this.zzd;
            if (eGLDisplay != null && !eGLDisplay.equals(android.opengl.EGL14.EGL_NO_DISPLAY)) {
                android.opengl.EGL14.eglMakeCurrent(this.zzd, android.opengl.EGL14.EGL_NO_SURFACE, android.opengl.EGL14.EGL_NO_SURFACE, android.opengl.EGL14.EGL_NO_CONTEXT);
            }
            android.opengl.EGLSurface eGLSurface = this.zzf;
            if (eGLSurface != null && !eGLSurface.equals(android.opengl.EGL14.EGL_NO_SURFACE)) {
                android.opengl.EGL14.eglDestroySurface(this.zzd, this.zzf);
            }
            android.opengl.EGLContext eGLContext = this.zze;
            if (eGLContext != null) {
                android.opengl.EGL14.eglDestroyContext(this.zzd, eGLContext);
            }
            android.opengl.EGL14.eglReleaseThread();
            android.opengl.EGLDisplay eGLDisplay2 = this.zzd;
            if (eGLDisplay2 != null && !eGLDisplay2.equals(android.opengl.EGL14.EGL_NO_DISPLAY)) {
            }
        } finally {
            android.opengl.EGLDisplay eGLDisplay3 = this.zzd;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(android.opengl.EGL14.EGL_NO_DISPLAY)) {
                android.opengl.EGL14.eglMakeCurrent(this.zzd, android.opengl.EGL14.EGL_NO_SURFACE, android.opengl.EGL14.EGL_NO_SURFACE, android.opengl.EGL14.EGL_NO_CONTEXT);
            }
            android.opengl.EGLSurface eGLSurface2 = this.zzf;
            if (eGLSurface2 != null && !eGLSurface2.equals(android.opengl.EGL14.EGL_NO_SURFACE)) {
                android.opengl.EGL14.eglDestroySurface(this.zzd, this.zzf);
            }
            android.opengl.EGLContext eGLContext2 = this.zze;
            if (eGLContext2 != null) {
                android.opengl.EGL14.eglDestroyContext(this.zzd, eGLContext2);
            }
            android.opengl.EGL14.eglReleaseThread();
            android.opengl.EGLDisplay eGLDisplay4 = this.zzd;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(android.opengl.EGL14.EGL_NO_DISPLAY)) {
                android.opengl.EGL14.eglTerminate(this.zzd);
            }
            this.zzd = null;
            this.zze = null;
            this.zzf = null;
            this.zzg = null;
        }
    }

    public final android.graphics.SurfaceTexture zza() {
        android.graphics.SurfaceTexture surfaceTexture = this.zzg;
        surfaceTexture.getClass();
        return surfaceTexture;
    }
}
