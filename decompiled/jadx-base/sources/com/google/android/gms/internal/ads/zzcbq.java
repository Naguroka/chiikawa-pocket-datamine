package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcbq extends java.lang.Thread implements android.graphics.SurfaceTexture.OnFrameAvailableListener, com.google.android.gms.internal.ads.zzcbo {
    private static final float[] zza = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private volatile boolean zzA;
    private volatile boolean zzB;
    private final com.google.android.gms.internal.ads.zzcbp zzb;
    private final float[] zzc;
    private final float[] zzd;
    private final float[] zze;
    private final float[] zzf;
    private final float[] zzg;
    private final float[] zzh;
    private final float[] zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;
    private int zzn;
    private android.graphics.SurfaceTexture zzo;
    private android.graphics.SurfaceTexture zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private final java.nio.FloatBuffer zzt;
    private final java.util.concurrent.CountDownLatch zzu;
    private final java.lang.Object zzv;
    private javax.microedition.khronos.egl.EGL10 zzw;
    private javax.microedition.khronos.egl.EGLDisplay zzx;
    private javax.microedition.khronos.egl.EGLContext zzy;
    private javax.microedition.khronos.egl.EGLSurface zzz;

    public zzcbq(android.content.Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = zza;
        int length = fArr.length;
        java.nio.FloatBuffer floatBufferAsFloatBuffer = java.nio.ByteBuffer.allocateDirect(48).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.zzt = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        this.zzc = new float[9];
        this.zzd = new float[9];
        this.zze = new float[9];
        this.zzf = new float[9];
        this.zzg = new float[9];
        this.zzh = new float[9];
        this.zzi = new float[9];
        this.zzj = Float.NaN;
        com.google.android.gms.internal.ads.zzcbp zzcbpVar = new com.google.android.gms.internal.ads.zzcbp(context);
        this.zzb = zzcbpVar;
        zzcbpVar.zzb(this);
        this.zzu = new java.util.concurrent.CountDownLatch(1);
        this.zzv = new java.lang.Object();
    }

    private static final void zzh(java.lang.String str) {
        int iGlGetError = android.opengl.GLES20.glGetError();
        if (iGlGetError != 0) {
            android.util.Log.e("SphericalVideoRenderer", str + ": glError " + iGlGetError);
        }
    }

    private static final void zzi(float[] fArr, float[] fArr2, float[] fArr3) {
        float f = fArr2[0] * fArr3[0];
        float f2 = fArr2[1];
        float f3 = fArr3[3];
        float f4 = fArr2[2];
        float f5 = fArr3[6];
        fArr[0] = f + (f2 * f3) + (f4 * f5);
        float f6 = fArr2[0];
        float f7 = fArr3[1] * f6;
        float f8 = fArr3[4];
        float f9 = fArr3[7];
        fArr[1] = f7 + (f2 * f8) + (f4 * f9);
        float f10 = f6 * fArr3[2];
        float f11 = fArr2[1];
        float f12 = fArr3[5];
        float f13 = fArr3[8];
        fArr[2] = f10 + (f11 * f12) + (f4 * f13);
        float f14 = fArr2[3];
        float f15 = fArr3[0];
        float f16 = fArr2[4];
        float f17 = fArr2[5];
        fArr[3] = (f14 * f15) + (f3 * f16) + (f17 * f5);
        float f18 = fArr2[3];
        float f19 = fArr3[1];
        fArr[4] = (f18 * f19) + (f16 * f8) + (f17 * f9);
        float f20 = fArr3[2];
        fArr[5] = (f18 * f20) + (fArr2[4] * f12) + (f17 * f13);
        float f21 = fArr2[6] * f15;
        float f22 = fArr2[7];
        float f23 = fArr3[3] * f22;
        float f24 = fArr2[8];
        fArr[6] = f21 + f23 + (f5 * f24);
        float f25 = fArr2[6];
        fArr[7] = (f19 * f25) + (f22 * fArr3[4]) + (f9 * f24);
        fArr[8] = (f25 * f20) + (fArr2[7] * fArr3[5]) + (f24 * f13);
    }

    private static final void zzj(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = f;
        fArr[4] = (float) java.lang.Math.cos(d);
        fArr[5] = (float) (-java.lang.Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) java.lang.Math.sin(d);
        fArr[8] = (float) java.lang.Math.cos(d);
    }

    private static final void zzk(float[] fArr, float f) {
        double d = f;
        fArr[0] = (float) java.lang.Math.cos(d);
        fArr[1] = (float) (-java.lang.Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) java.lang.Math.sin(d);
        fArr[4] = (float) java.lang.Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static final int zzl(int i, java.lang.String str) {
        int iGlCreateShader = android.opengl.GLES20.glCreateShader(i);
        zzh("createShader");
        if (iGlCreateShader != 0) {
            android.opengl.GLES20.glShaderSource(iGlCreateShader, str);
            zzh("shaderSource");
            android.opengl.GLES20.glCompileShader(iGlCreateShader);
            zzh("compileShader");
            int[] iArr = new int[1];
            android.opengl.GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            zzh("getShaderiv");
            if (iArr[0] == 0) {
                android.util.Log.e("SphericalVideoRenderer", "Could not compile shader " + i + ":");
                android.util.Log.e("SphericalVideoRenderer", android.opengl.GLES20.glGetShaderInfoLog(iGlCreateShader));
                android.opengl.GLES20.glDeleteShader(iGlCreateShader);
                zzh("deleteShader");
                return 0;
            }
        }
        return iGlCreateShader;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        this.zzs++;
        synchronized (this.zzv) {
            this.zzv.notifyAll();
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:6:0x001d  */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z;
        int iGlCreateProgram;
        if (this.zzp == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("SphericalVideoProcessor started with no output texture.");
            this.zzu.countDown();
            return;
        }
        javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
        this.zzw = egl10;
        javax.microedition.khronos.egl.EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
        this.zzx = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
            z = false;
        } else {
            if (this.zzw.eglInitialize(this.zzx, new int[2])) {
                int[] iArr = new int[1];
                javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[1];
                javax.microedition.khronos.egl.EGLConfig eGLConfig = (this.zzw.eglChooseConfig(this.zzx, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) && iArr[0] > 0) ? eGLConfigArr[0] : null;
                if (eGLConfig == null) {
                    z = false;
                } else {
                    javax.microedition.khronos.egl.EGLContext eGLContextEglCreateContext = this.zzw.eglCreateContext(this.zzx, eGLConfig, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                    this.zzy = eGLContextEglCreateContext;
                    if (eGLContextEglCreateContext == null || eGLContextEglCreateContext == javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
                        z = false;
                    } else {
                        javax.microedition.khronos.egl.EGLSurface eGLSurfaceEglCreateWindowSurface = this.zzw.eglCreateWindowSurface(this.zzx, eGLConfig, this.zzp, null);
                        this.zzz = eGLSurfaceEglCreateWindowSurface;
                        if (eGLSurfaceEglCreateWindowSurface == null || eGLSurfaceEglCreateWindowSurface == javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
                            z = false;
                        } else {
                            javax.microedition.khronos.egl.EGL10 egl11 = this.zzw;
                            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.zzx;
                            javax.microedition.khronos.egl.EGLSurface eGLSurface = this.zzz;
                            if (egl11.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.zzy)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                    }
                }
            } else {
                z = false;
            }
        }
        com.google.android.gms.internal.ads.zzbcc zzbccVar = com.google.android.gms.internal.ads.zzbcl.zzbs;
        int iZzl = zzl(35633, !((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).equals(zzbccVar.zzk()) ? (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
        if (iZzl == 0) {
            iGlCreateProgram = 0;
        } else {
            com.google.android.gms.internal.ads.zzbcc zzbccVar2 = com.google.android.gms.internal.ads.zzbcl.zzbt;
            int iZzl2 = zzl(35632, !((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar2)).equals(zzbccVar2.zzk()) ? (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar2) : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}");
            if (iZzl2 == 0) {
                iGlCreateProgram = 0;
            } else {
                iGlCreateProgram = android.opengl.GLES20.glCreateProgram();
                zzh("createProgram");
                if (iGlCreateProgram != 0) {
                    android.opengl.GLES20.glAttachShader(iGlCreateProgram, iZzl);
                    zzh("attachShader");
                    android.opengl.GLES20.glAttachShader(iGlCreateProgram, iZzl2);
                    zzh("attachShader");
                    android.opengl.GLES20.glLinkProgram(iGlCreateProgram);
                    zzh("linkProgram");
                    int[] iArr2 = new int[1];
                    android.opengl.GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr2, 0);
                    zzh("getProgramiv");
                    if (iArr2[0] != 1) {
                        android.util.Log.e("SphericalVideoRenderer", "Could not link program: ");
                        android.util.Log.e("SphericalVideoRenderer", android.opengl.GLES20.glGetProgramInfoLog(iGlCreateProgram));
                        android.opengl.GLES20.glDeleteProgram(iGlCreateProgram);
                        zzh("deleteProgram");
                        iGlCreateProgram = 0;
                    } else {
                        android.opengl.GLES20.glValidateProgram(iGlCreateProgram);
                        zzh("validateProgram");
                    }
                }
            }
        }
        this.zzq = iGlCreateProgram;
        android.opengl.GLES20.glUseProgram(iGlCreateProgram);
        zzh("useProgram");
        int iGlGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(this.zzq, "aPosition");
        android.opengl.GLES20.glVertexAttribPointer(iGlGetAttribLocation, 3, 5126, false, 12, (java.nio.Buffer) this.zzt);
        zzh("vertexAttribPointer");
        android.opengl.GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        zzh("enableVertexAttribArray");
        int[] iArr3 = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr3, 0);
        zzh("genTextures");
        int i = iArr3[0];
        android.opengl.GLES20.glBindTexture(36197, i);
        zzh("bindTextures");
        android.opengl.GLES20.glTexParameteri(36197, androidx.work.Data.MAX_DATA_BYTES, 9729);
        zzh("texParameteri");
        android.opengl.GLES20.glTexParameteri(36197, 10241, 9729);
        zzh("texParameteri");
        android.opengl.GLES20.glTexParameteri(36197, 10242, 33071);
        zzh("texParameteri");
        android.opengl.GLES20.glTexParameteri(36197, 10243, 33071);
        zzh("texParameteri");
        int iGlGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(this.zzq, "uVMat");
        this.zzr = iGlGetUniformLocation;
        android.opengl.GLES20.glUniformMatrix3fv(iGlGetUniformLocation, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
        int i2 = this.zzq;
        if (!z || i2 == 0) {
            java.lang.String strConcat = "EGL initialization failed: ".concat(java.lang.String.valueOf(android.opengl.GLUtils.getEGLErrorString(this.zzw.eglGetError())));
            com.google.android.gms.ads.internal.util.client.zzo.zzg(strConcat);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(new java.lang.Throwable(strConcat), "SphericalVideoProcessor.run.1");
            zzg();
            this.zzu.countDown();
            return;
        }
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(i);
        this.zzo = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.zzu.countDown();
        this.zzb.zzc();
        try {
            try {
                this.zzA = true;
                while (!this.zzB) {
                    while (this.zzs > 0) {
                        this.zzo.updateTexImage();
                        this.zzs--;
                    }
                    if (this.zzb.zze(this.zzc)) {
                        if (java.lang.Float.isNaN(this.zzj)) {
                            float[] fArr = this.zzc;
                            float f = (fArr[0] * 0.0f) + (fArr[1] * 1.0f) + (fArr[2] * 0.0f);
                            float f2 = (fArr[3] * 0.0f) + (fArr[4] * 1.0f) + (fArr[5] * 0.0f);
                            float f3 = fArr[6];
                            float f4 = fArr[7];
                            float f5 = fArr[8];
                            this.zzj = -(((float) java.lang.Math.atan2(f2, f)) - 1.5707964f);
                        }
                        zzk(this.zzh, this.zzj + this.zzk);
                    } else {
                        zzj(this.zzc, -1.5707964f);
                        zzk(this.zzh, this.zzk);
                    }
                    zzj(this.zzd, 1.5707964f);
                    zzi(this.zze, this.zzh, this.zzd);
                    zzi(this.zzf, this.zzc, this.zze);
                    zzj(this.zzg, this.zzl);
                    zzi(this.zzi, this.zzg, this.zzf);
                    android.opengl.GLES20.glUniformMatrix3fv(this.zzr, 1, false, this.zzi, 0);
                    android.opengl.GLES20.glDrawArrays(5, 0, 4);
                    zzh("drawArrays");
                    android.opengl.GLES20.glFinish();
                    this.zzw.eglSwapBuffers(this.zzx, this.zzz);
                    if (this.zzA) {
                        android.opengl.GLES20.glViewport(0, 0, this.zzn, this.zzm);
                        zzh("viewport");
                        int iGlGetUniformLocation2 = android.opengl.GLES20.glGetUniformLocation(this.zzq, "uFOVx");
                        int iGlGetUniformLocation3 = android.opengl.GLES20.glGetUniformLocation(this.zzq, "uFOVy");
                        int i3 = this.zzn;
                        int i4 = this.zzm;
                        if (i3 > i4) {
                            android.opengl.GLES20.glUniform1f(iGlGetUniformLocation2, 0.87266463f);
                            android.opengl.GLES20.glUniform1f(iGlGetUniformLocation3, (this.zzm * 0.87266463f) / this.zzn);
                        } else {
                            android.opengl.GLES20.glUniform1f(iGlGetUniformLocation2, (i3 * 0.87266463f) / i4);
                            android.opengl.GLES20.glUniform1f(iGlGetUniformLocation3, 0.87266463f);
                        }
                        this.zzA = false;
                    }
                    try {
                        synchronized (this.zzv) {
                            try {
                                if (!this.zzB && !this.zzA && this.zzs == 0) {
                                    this.zzv.wait();
                                }
                            } catch (java.lang.Throwable th) {
                                throw th;
                            }
                        }
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
            } catch (java.lang.Throwable th2) {
                this.zzb.zzd();
                this.zzo.setOnFrameAvailableListener(null);
                this.zzo = null;
                zzg();
                throw th2;
            }
        } catch (java.lang.IllegalStateException unused2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("SphericalVideoProcessor halted unexpectedly.");
        } catch (java.lang.Throwable th3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("SphericalVideoProcessor died.", th3);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th3, "SphericalVideoProcessor.run.2");
        }
        this.zzb.zzd();
        this.zzo.setOnFrameAvailableListener(null);
        this.zzo = null;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zza() {
        synchronized (this.zzv) {
            this.zzv.notifyAll();
        }
    }

    public final android.graphics.SurfaceTexture zzb() {
        if (this.zzp == null) {
            return null;
        }
        try {
            this.zzu.await();
        } catch (java.lang.InterruptedException unused) {
        }
        return this.zzo;
    }

    public final void zzc(int i, int i2) {
        synchronized (this.zzv) {
            this.zzn = i;
            this.zzm = i2;
            this.zzA = true;
            this.zzv.notifyAll();
        }
    }

    public final void zzd(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        this.zzn = i;
        this.zzm = i2;
        this.zzp = surfaceTexture;
    }

    public final void zze() {
        synchronized (this.zzv) {
            this.zzB = true;
            this.zzp = null;
            this.zzv.notifyAll();
        }
    }

    public final void zzf(float f, float f2) {
        int i = this.zzn;
        int i2 = this.zzm;
        if (i <= i2) {
            i = i2;
        }
        float f3 = i;
        this.zzk -= (f * 1.7453293f) / f3;
        float f4 = this.zzl - ((f2 * 1.7453293f) / f3);
        this.zzl = f4;
        if (f4 < -1.5707964f) {
            this.zzl = -1.5707964f;
            f4 = -1.5707964f;
        }
        if (f4 > 1.5707964f) {
            this.zzl = 1.5707964f;
        }
    }

    final boolean zzg() {
        javax.microedition.khronos.egl.EGLSurface eGLSurface = this.zzz;
        boolean zEglDestroyContext = false;
        if (eGLSurface != null && eGLSurface != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
            zEglDestroyContext = this.zzw.eglDestroySurface(this.zzx, this.zzz) | this.zzw.eglMakeCurrent(this.zzx, javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE, javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
            this.zzz = null;
        }
        javax.microedition.khronos.egl.EGLContext eGLContext = this.zzy;
        if (eGLContext != null) {
            zEglDestroyContext |= this.zzw.eglDestroyContext(this.zzx, eGLContext);
            this.zzy = null;
        }
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.zzx;
        if (eGLDisplay == null) {
            return zEglDestroyContext;
        }
        boolean zEglTerminate = this.zzw.eglTerminate(eGLDisplay) | zEglDestroyContext;
        this.zzx = null;
        return zEglTerminate;
    }
}
