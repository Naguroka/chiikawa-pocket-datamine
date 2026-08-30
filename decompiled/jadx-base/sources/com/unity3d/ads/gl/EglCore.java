package com.unity3d.ads.gl;

/* JADX INFO: compiled from: EglCore.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005J\b\u0010\u001a\u001a\u00020\u0013H\u0004J\u001a\u0010\u001b\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0002J\u0010\u0010\u001d\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u0017J\u0006\u0010\u001f\u001a\u00020\u0013J\u0010\u0010 \u001a\u00020!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0017R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u000f*\u0004\u0018\u00010\u00030\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u00110\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/unity3d/ads/gl/EglCore;", "", "sharedContext", "Landroid/opengl/EGLContext;", "flags", "", "(Landroid/opengl/EGLContext;I)V", "glVersion", "getGlVersion", "()I", "setGlVersion", "(I)V", "mEGLConfig", "Landroid/opengl/EGLConfig;", "mEGLContext", "kotlin.jvm.PlatformType", "mEGLDisplay", "Landroid/opengl/EGLDisplay;", "checkEglError", "", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "", "createOffscreenSurface", "Landroid/opengl/EGLSurface;", "width", "height", "finalize", "getConfig", "version", "makeCurrent", "eglSurface", "release", "releaseSurface", "", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EglCore {
    private static final int EGL_RECORDABLE_ANDROID = 12610;
    public static final int FLAG_RECORDABLE = 1;
    public static final int FLAG_TRY_GLES3 = 2;
    private int glVersion;
    private android.opengl.EGLConfig mEGLConfig;
    private android.opengl.EGLContext mEGLContext;
    private android.opengl.EGLDisplay mEGLDisplay;

    /* JADX WARN: Multi-variable type inference failed */
    public EglCore() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public EglCore(android.opengl.EGLContext eGLContext, int i) {
        android.opengl.EGLConfig config;
        this.mEGLDisplay = android.opengl.EGL14.EGL_NO_DISPLAY;
        this.mEGLContext = android.opengl.EGL14.EGL_NO_CONTEXT;
        this.glVersion = -1;
        if (this.mEGLDisplay != android.opengl.EGL14.EGL_NO_DISPLAY) {
            throw new java.lang.RuntimeException("EGL already set up");
        }
        eGLContext = eGLContext == null ? android.opengl.EGL14.EGL_NO_CONTEXT : eGLContext;
        android.opengl.EGLDisplay eGLDisplayEglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        this.mEGLDisplay = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == android.opengl.EGL14.EGL_NO_DISPLAY) {
            throw new java.lang.RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!android.opengl.EGL14.eglInitialize(this.mEGLDisplay, iArr, 0, iArr, 1)) {
            this.mEGLDisplay = null;
            throw new java.lang.RuntimeException("unable to initialize EGL14");
        }
        if ((i & 2) != 0 && (config = getConfig(i, 3)) != null) {
            android.opengl.EGLContext eGLContextEglCreateContext = android.opengl.EGL14.eglCreateContext(this.mEGLDisplay, config, eGLContext, new int[]{12440, 3, 12344}, 0);
            if (android.opengl.EGL14.eglGetError() == 12288) {
                this.mEGLConfig = config;
                this.mEGLContext = eGLContextEglCreateContext;
                this.glVersion = 3;
            }
        }
        if (this.mEGLContext == android.opengl.EGL14.EGL_NO_CONTEXT) {
            android.opengl.EGLConfig config2 = getConfig(i, 2);
            if (config2 == null) {
                throw new java.lang.RuntimeException("Unable to find a suitable EGLConfig");
            }
            android.opengl.EGLContext eGLContextEglCreateContext2 = android.opengl.EGL14.eglCreateContext(this.mEGLDisplay, config2, eGLContext, new int[]{12440, 2, 12344}, 0);
            checkEglError("eglCreateContext");
            this.mEGLConfig = config2;
            this.mEGLContext = eGLContextEglCreateContext2;
            this.glVersion = 2;
        }
        android.opengl.EGL14.eglQueryContext(this.mEGLDisplay, this.mEGLContext, 12440, new int[1], 0);
    }

    public /* synthetic */ EglCore(android.opengl.EGLContext eGLContext, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : eGLContext, (i2 & 2) != 0 ? 0 : i);
    }

    public final int getGlVersion() {
        return this.glVersion;
    }

    public final void setGlVersion(int i) {
        this.glVersion = i;
    }

    private final android.opengl.EGLConfig getConfig(int flags, int version) {
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, version >= 3 ? 68 : 4, 12344, 0, 12344};
        if ((flags & 1) != 0) {
            iArr[10] = EGL_RECORDABLE_ANDROID;
            iArr[11] = 1;
        }
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        if (android.opengl.EGL14.eglChooseConfig(this.mEGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        return null;
    }

    public final void release() {
        if (this.mEGLDisplay != android.opengl.EGL14.EGL_NO_DISPLAY) {
            android.opengl.EGL14.eglMakeCurrent(this.mEGLDisplay, android.opengl.EGL14.EGL_NO_SURFACE, android.opengl.EGL14.EGL_NO_SURFACE, android.opengl.EGL14.EGL_NO_CONTEXT);
            android.opengl.EGL14.eglDestroyContext(this.mEGLDisplay, this.mEGLContext);
            android.opengl.EGL14.eglReleaseThread();
            android.opengl.EGL14.eglTerminate(this.mEGLDisplay);
        }
        this.mEGLDisplay = android.opengl.EGL14.EGL_NO_DISPLAY;
        this.mEGLContext = android.opengl.EGL14.EGL_NO_CONTEXT;
        this.mEGLConfig = null;
    }

    protected final void finalize() {
        if (this.mEGLDisplay != android.opengl.EGL14.EGL_NO_DISPLAY) {
            release();
        }
    }

    public final boolean releaseSurface(android.opengl.EGLSurface eglSurface) {
        return android.opengl.EGL14.eglDestroySurface(this.mEGLDisplay, eglSurface);
    }

    public final android.opengl.EGLSurface createOffscreenSurface(int width, int height) {
        android.opengl.EGLSurface eGLSurfaceEglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(this.mEGLDisplay, this.mEGLConfig, new int[]{12375, width, 12374, height, 12344}, 0);
        checkEglError("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new java.lang.RuntimeException("surface was null");
    }

    public final void makeCurrent(android.opengl.EGLSurface eglSurface) {
        if (!android.opengl.EGL14.eglMakeCurrent(this.mEGLDisplay, eglSurface, eglSurface, this.mEGLContext)) {
            throw new java.lang.RuntimeException("eglMakeCurrent failed");
        }
    }

    private final void checkEglError(java.lang.String msg) {
        int iEglGetError = android.opengl.EGL14.eglGetError();
        if (iEglGetError != 12288) {
            throw new java.lang.RuntimeException(msg + ": EGL error: 0x" + java.lang.Integer.toHexString(iEglGetError));
        }
    }
}
