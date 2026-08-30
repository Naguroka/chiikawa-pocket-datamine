package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class EGLSurfaceTexture implements android.graphics.SurfaceTexture.OnFrameAvailableListener, java.lang.Runnable {
    private static final int[] EGL_CONFIG_ATTRIBUTES = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    private static final int EGL_PROTECTED_CONTENT_EXT = 12992;
    private static final int EGL_SURFACE_HEIGHT = 1;
    private static final int EGL_SURFACE_WIDTH = 1;
    public static final int SECURE_MODE_NONE = 0;
    public static final int SECURE_MODE_PROTECTED_PBUFFER = 2;
    public static final int SECURE_MODE_SURFACELESS_CONTEXT = 1;
    private final androidx.media3.common.util.EGLSurfaceTexture.TextureImageListener callback;
    private android.opengl.EGLContext context;
    private android.opengl.EGLDisplay display;
    private final android.os.Handler handler;
    private android.opengl.EGLSurface surface;
    private android.graphics.SurfaceTexture texture;
    private final int[] textureIdHolder;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SecureMode {
    }

    public interface TextureImageListener {
        void onFrameAvailable();
    }

    public EGLSurfaceTexture(android.os.Handler handler) {
        this(handler, null);
    }

    public EGLSurfaceTexture(android.os.Handler handler, androidx.media3.common.util.EGLSurfaceTexture.TextureImageListener textureImageListener) {
        this.handler = handler;
        this.callback = textureImageListener;
        this.textureIdHolder = new int[1];
    }

    public void init(int i) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.EGLDisplay defaultDisplay = getDefaultDisplay();
        this.display = defaultDisplay;
        android.opengl.EGLConfig eGLConfigChooseEGLConfig = chooseEGLConfig(defaultDisplay);
        android.opengl.EGLContext eGLContextCreateEGLContext = createEGLContext(this.display, eGLConfigChooseEGLConfig, i);
        this.context = eGLContextCreateEGLContext;
        this.surface = createEGLSurface(this.display, eGLConfigChooseEGLConfig, eGLContextCreateEGLContext, i);
        generateTextureIds(this.textureIdHolder);
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(this.textureIdHolder[0]);
        this.texture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void release() {
        this.handler.removeCallbacks(this);
        try {
            android.graphics.SurfaceTexture surfaceTexture = this.texture;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                android.opengl.GLES20.glDeleteTextures(1, this.textureIdHolder, 0);
            }
        } finally {
            android.opengl.EGLDisplay eGLDisplay = this.display;
            if (eGLDisplay != null && !eGLDisplay.equals(android.opengl.EGL14.EGL_NO_DISPLAY)) {
                android.opengl.EGL14.eglMakeCurrent(this.display, android.opengl.EGL14.EGL_NO_SURFACE, android.opengl.EGL14.EGL_NO_SURFACE, android.opengl.EGL14.EGL_NO_CONTEXT);
            }
            android.opengl.EGLSurface eGLSurface = this.surface;
            if (eGLSurface != null && !eGLSurface.equals(android.opengl.EGL14.EGL_NO_SURFACE)) {
                android.opengl.EGL14.eglDestroySurface(this.display, this.surface);
            }
            android.opengl.EGLContext eGLContext = this.context;
            if (eGLContext != null) {
                android.opengl.EGL14.eglDestroyContext(this.display, eGLContext);
            }
            android.opengl.EGL14.eglReleaseThread();
            android.opengl.EGLDisplay eGLDisplay2 = this.display;
            if (eGLDisplay2 != null && !eGLDisplay2.equals(android.opengl.EGL14.EGL_NO_DISPLAY)) {
                android.opengl.EGL14.eglTerminate(this.display);
            }
            this.display = null;
            this.context = null;
            this.surface = null;
            this.texture = null;
        }
    }

    public android.graphics.SurfaceTexture getSurfaceTexture() {
        return (android.graphics.SurfaceTexture) androidx.media3.common.util.Assertions.checkNotNull(this.texture);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        this.handler.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        dispatchOnFrameAvailable();
        android.graphics.SurfaceTexture surfaceTexture = this.texture;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (java.lang.RuntimeException unused) {
            }
        }
    }

    private void dispatchOnFrameAvailable() {
        androidx.media3.common.util.EGLSurfaceTexture.TextureImageListener textureImageListener = this.callback;
        if (textureImageListener != null) {
            textureImageListener.onFrameAvailable();
        }
    }

    private static android.opengl.EGLDisplay getDefaultDisplay() throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.EGLDisplay eGLDisplayEglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        androidx.media3.common.util.GlUtil.checkGlException(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        androidx.media3.common.util.GlUtil.checkGlException(android.opengl.EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eGLDisplayEglGetDisplay;
    }

    private static android.opengl.EGLConfig chooseEGLConfig(android.opengl.EGLDisplay eGLDisplay) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = android.opengl.EGL14.eglChooseConfig(eGLDisplay, EGL_CONFIG_ATTRIBUTES, 0, eGLConfigArr, 0, 1, iArr, 0);
        androidx.media3.common.util.GlUtil.checkGlException(zEglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, androidx.media3.common.util.Util.formatInvariant("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", java.lang.Boolean.valueOf(zEglChooseConfig), java.lang.Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    private static android.opengl.EGLContext createEGLContext(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLConfig eGLConfig, int i) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.EGLContext eGLContextEglCreateContext = android.opengl.EGL14.eglCreateContext(eGLDisplay, eGLConfig, android.opengl.EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, EGL_PROTECTED_CONTENT_EXT, 1, 12344}, 0);
        androidx.media3.common.util.GlUtil.checkGlException(eGLContextEglCreateContext != null, "eglCreateContext failed");
        return eGLContextEglCreateContext;
    }

    private static android.opengl.EGLSurface createEGLSurface(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLConfig eGLConfig, android.opengl.EGLContext eGLContext, int i) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, EGL_PROTECTED_CONTENT_EXT, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            androidx.media3.common.util.GlUtil.checkGlException(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        androidx.media3.common.util.GlUtil.checkGlException(android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    private static void generateTextureIds(int[] iArr) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        androidx.media3.common.util.GlUtil.checkGlError();
    }
}
