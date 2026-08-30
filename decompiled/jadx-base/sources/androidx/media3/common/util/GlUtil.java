package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class GlUtil {
    private static final java.lang.String EXTENSION_COLORSPACE_BT2020_HLG = "EGL_EXT_gl_colorspace_bt2020_hlg";
    private static final java.lang.String EXTENSION_COLORSPACE_BT2020_PQ = "EGL_EXT_gl_colorspace_bt2020_pq";
    private static final java.lang.String EXTENSION_PROTECTED_CONTENT = "EGL_EXT_protected_content";
    private static final java.lang.String EXTENSION_SURFACELESS_CONTEXT = "EGL_KHR_surfaceless_context";
    private static final java.lang.String EXTENSION_YUV_TARGET = "GL_EXT_YUV_target";
    private static final long GL_FENCE_SYNC_FAILED = 0;
    public static final int HOMOGENEOUS_COORDINATE_VECTOR_SIZE = 4;
    public static final float LENGTH_NDC = 2.0f;
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_8888 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_1010102 = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    private static final int EGL_GL_COLORSPACE_KHR = 12445;
    private static final int EGL_GL_COLORSPACE_BT2020_PQ_EXT = 13120;
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ = {EGL_GL_COLORSPACE_KHR, EGL_GL_COLORSPACE_BT2020_PQ_EXT, 12344, 12344};
    private static final int EGL_GL_COLORSPACE_BT2020_HLG_EXT = 13632;
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_HLG = {EGL_GL_COLORSPACE_KHR, EGL_GL_COLORSPACE_BT2020_HLG_EXT, 12344, 12344};
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_NONE = {12344};

    public static final class GlException extends java.lang.Exception {
        public GlException(java.lang.String str) {
            super(str);
        }
    }

    private GlUtil() {
    }

    public static float[] getNormalizedCoordinateBounds() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static float[] getTextureCoordinateBounds() {
        return new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static float[] create4x4IdentityMatrix() {
        float[] fArr = new float[16];
        setToIdentity(fArr);
        return fArr;
    }

    public static void setToIdentity(float[] fArr) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
    }

    public static float[] createVertexBuffer(java.util.List<float[]> list) {
        float[] fArr = new float[list.size() * 4];
        for (int i = 0; i < list.size(); i++) {
            java.lang.System.arraycopy(list.get(i), 0, fArr, i * 4, 4);
        }
        return fArr;
    }

    public static boolean isProtectedContentExtensionSupported(android.content.Context context) {
        if (androidx.media3.common.util.Util.SDK_INT < 24) {
            return false;
        }
        if (androidx.media3.common.util.Util.SDK_INT < 26 && (com.adjust.sdk.Constants.REFERRER_API_SAMSUNG.equals(androidx.media3.common.util.Util.MANUFACTURER) || "XT1650".equals(androidx.media3.common.util.Util.MODEL))) {
            return false;
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return isExtensionSupported(EXTENSION_PROTECTED_CONTENT);
        }
        return false;
    }

    public static boolean isSurfacelessContextExtensionSupported() {
        return isExtensionSupported(EXTENSION_SURFACELESS_CONTEXT);
    }

    public static boolean isYuvTargetExtensionSupported() {
        java.lang.String strGlGetString;
        if (androidx.media3.common.util.Util.areEqual(android.opengl.EGL14.eglGetCurrentContext(), android.opengl.EGL14.EGL_NO_CONTEXT)) {
            try {
                android.opengl.EGLDisplay defaultEglDisplay = getDefaultEglDisplay();
                android.opengl.EGLContext eGLContextCreateEglContext = createEglContext(defaultEglDisplay);
                createFocusedPlaceholderEglSurface(eGLContextCreateEglContext, defaultEglDisplay);
                strGlGetString = android.opengl.GLES20.glGetString(7939);
                destroyEglContext(defaultEglDisplay, eGLContextCreateEglContext);
            } catch (androidx.media3.common.util.GlUtil.GlException unused) {
                return false;
            }
        } else {
            strGlGetString = android.opengl.GLES20.glGetString(7939);
        }
        return strGlGetString != null && strGlGetString.contains(EXTENSION_YUV_TARGET);
    }

    public static boolean isBt2020PqExtensionSupported() {
        return androidx.media3.common.util.Util.SDK_INT >= 33 && isExtensionSupported(EXTENSION_COLORSPACE_BT2020_PQ);
    }

    public static boolean isBt2020HlgExtensionSupported() {
        return isExtensionSupported(EXTENSION_COLORSPACE_BT2020_HLG);
    }

    public static android.opengl.EGLDisplay getDefaultEglDisplay() throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.EGLDisplay eGLDisplayEglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        checkGlException(!eGLDisplayEglGetDisplay.equals(android.opengl.EGL14.EGL_NO_DISPLAY), "No EGL display.");
        checkGlException(android.opengl.EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        checkGlError();
        return eGLDisplayEglGetDisplay;
    }

    public static android.opengl.EGLContext createEglContext(android.opengl.EGLDisplay eGLDisplay) throws androidx.media3.common.util.GlUtil.GlException {
        return createEglContext(android.opengl.EGL14.EGL_NO_CONTEXT, eGLDisplay, 2, EGL_CONFIG_ATTRIBUTES_RGBA_8888);
    }

    public static android.opengl.EGLContext createEglContext(android.opengl.EGLContext eGLContext, android.opengl.EGLDisplay eGLDisplay, int i, int[] iArr) throws androidx.media3.common.util.GlUtil.GlException {
        androidx.media3.common.util.Assertions.checkArgument(java.util.Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_8888) || java.util.Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_1010102));
        androidx.media3.common.util.Assertions.checkArgument(i == 2 || i == 3);
        android.opengl.EGLContext eGLContextEglCreateContext = android.opengl.EGL14.eglCreateContext(eGLDisplay, getEglConfig(eGLDisplay, iArr), eGLContext, new int[]{12440, i, 12344}, 0);
        if (eGLContextEglCreateContext == null) {
            android.opengl.EGL14.eglTerminate(eGLDisplay);
            throw new androidx.media3.common.util.GlUtil.GlException("eglCreateContext() failed to create a valid context. The device may not support EGL version " + i);
        }
        checkGlError();
        return eGLContextEglCreateContext;
    }

    public static android.opengl.EGLSurface createEglSurface(android.opengl.EGLDisplay eGLDisplay, java.lang.Object obj, int i, boolean z) throws androidx.media3.common.util.GlUtil.GlException {
        int[] iArr;
        int[] iArr2;
        if (i == 3 || i == 10) {
            iArr = EGL_CONFIG_ATTRIBUTES_RGBA_8888;
            iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_NONE;
        } else if (i == 7 || i == 6) {
            iArr = EGL_CONFIG_ATTRIBUTES_RGBA_1010102;
            if (z) {
                iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_NONE;
            } else if (i == 6) {
                if (!isBt2020PqExtensionSupported()) {
                    throw new androidx.media3.common.util.GlUtil.GlException("BT.2020 PQ OpenGL output isn't supported.");
                }
                iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ;
            } else {
                if (!isBt2020HlgExtensionSupported()) {
                    throw new androidx.media3.common.util.GlUtil.GlException("BT.2020 HLG OpenGL output isn't supported.");
                }
                iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_HLG;
            }
        } else {
            throw new java.lang.IllegalArgumentException("Unsupported color transfer: " + i);
        }
        android.opengl.EGLSurface eGLSurfaceEglCreateWindowSurface = android.opengl.EGL14.eglCreateWindowSurface(eGLDisplay, getEglConfig(eGLDisplay, iArr), obj, iArr2, 0);
        checkEglException("Error creating a new EGL surface");
        return eGLSurfaceEglCreateWindowSurface;
    }

    private static android.opengl.EGLSurface createPbufferSurface(android.opengl.EGLDisplay eGLDisplay, int i, int i2, int[] iArr) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.EGLSurface eGLSurfaceEglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(eGLDisplay, getEglConfig(eGLDisplay, iArr), new int[]{12375, i, 12374, i2, 12344}, 0);
        checkEglException("Error creating a new EGL Pbuffer surface");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    public static android.opengl.EGLSurface createFocusedPlaceholderEglSurface(android.opengl.EGLContext eGLContext, android.opengl.EGLDisplay eGLDisplay) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.EGLSurface eGLSurfaceCreatePbufferSurface;
        int[] iArr = EGL_CONFIG_ATTRIBUTES_RGBA_8888;
        if (isSurfacelessContextExtensionSupported()) {
            eGLSurfaceCreatePbufferSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceCreatePbufferSurface = createPbufferSurface(eGLDisplay, 1, 1, iArr);
        }
        focusEglSurface(eGLDisplay, eGLContext, eGLSurfaceCreatePbufferSurface, 1, 1);
        return eGLSurfaceCreatePbufferSurface;
    }

    public static long getContextMajorVersion() throws androidx.media3.common.util.GlUtil.GlException {
        int[] iArr = new int[1];
        android.opengl.EGL14.eglQueryContext(android.opengl.EGL14.eglGetDisplay(0), android.opengl.EGL14.eglGetCurrentContext(), 12440, iArr, 0);
        checkGlError();
        return iArr[0];
    }

    public static long createGlSyncFence() throws androidx.media3.common.util.GlUtil.GlException {
        if (getContextMajorVersion() < 3) {
            return 0L;
        }
        long jGlFenceSync = android.opengl.GLES30.glFenceSync(37143, 0);
        checkGlError();
        android.opengl.GLES20.glFlush();
        checkGlError();
        return jGlFenceSync;
    }

    public static void deleteSyncObject(long j) throws androidx.media3.common.util.GlUtil.GlException {
        deleteSyncObjectQuietly(j);
        checkGlError();
    }

    public static void deleteSyncObjectQuietly(long j) {
        android.opengl.GLES30.glDeleteSync(j);
    }

    public static void awaitSyncObject(long j) throws androidx.media3.common.util.GlUtil.GlException {
        if (j == 0) {
            android.opengl.GLES20.glFinish();
        } else {
            android.opengl.GLES30.glWaitSync(j, 0, -1L);
            checkGlError();
        }
    }

    public static android.opengl.EGLContext getCurrentContext() {
        return android.opengl.EGL14.eglGetCurrentContext();
    }

    public static void checkGlError() throws androidx.media3.common.util.GlUtil.GlException {
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
                strGluErrorString = "error code: 0x" + java.lang.Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ").append(strGluErrorString);
            z = true;
        }
        if (z) {
            throw new androidx.media3.common.util.GlUtil.GlException(sb.toString());
        }
    }

    private static void assertValidTextureSize(int i, int i2) throws androidx.media3.common.util.GlUtil.GlException {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetIntegerv(3379, iArr, 0);
        int i3 = iArr[0];
        androidx.media3.common.util.Assertions.checkState(i3 > 0, "Create a OpenGL context first or run the GL methods on an OpenGL thread.");
        if (i < 0 || i2 < 0) {
            throw new androidx.media3.common.util.GlUtil.GlException("width or height is less than 0");
        }
        if (i > i3 || i2 > i3) {
            throw new androidx.media3.common.util.GlUtil.GlException("width or height is greater than GL_MAX_TEXTURE_SIZE " + i3);
        }
    }

    public static void clearFocusedBuffers() throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClearDepthf(1.0f);
        android.opengl.GLES20.glClear(16640);
        checkGlError();
    }

    public static void focusEglSurface(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLContext eGLContext, android.opengl.EGLSurface eGLSurface, int i, int i2) throws androidx.media3.common.util.GlUtil.GlException {
        focusRenderTarget(eGLDisplay, eGLContext, eGLSurface, 0, i, i2);
    }

    public static void focusFramebuffer(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLContext eGLContext, android.opengl.EGLSurface eGLSurface, int i, int i2, int i3) throws androidx.media3.common.util.GlUtil.GlException {
        focusRenderTarget(eGLDisplay, eGLContext, eGLSurface, i, i2, i3);
    }

    public static void focusFramebufferUsingCurrentContext(int i, int i2, int i3) throws androidx.media3.common.util.GlUtil.GlException {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i) {
            android.opengl.GLES20.glBindFramebuffer(36160, i);
        }
        checkGlError();
        android.opengl.GLES20.glViewport(0, 0, i2, i3);
        checkGlError();
    }

    public static java.nio.FloatBuffer createBuffer(float[] fArr) {
        return (java.nio.FloatBuffer) createBuffer(fArr.length).put(fArr).flip();
    }

    private static java.nio.FloatBuffer createBuffer(int i) {
        return java.nio.ByteBuffer.allocateDirect(i * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static int createExternalTexture() throws androidx.media3.common.util.GlUtil.GlException {
        int iGenerateTexture = generateTexture();
        bindTexture(36197, iGenerateTexture, 9729);
        return iGenerateTexture;
    }

    public static int createTexture(android.graphics.Bitmap bitmap) throws androidx.media3.common.util.GlUtil.GlException {
        int iGenerateTexture = generateTexture();
        setTexture(iGenerateTexture, bitmap);
        return iGenerateTexture;
    }

    public static int createTexture(int i, int i2, boolean z) throws androidx.media3.common.util.GlUtil.GlException {
        if (z) {
            return createTextureUninitialized(i, i2, 34842, 5131);
        }
        return createTextureUninitialized(i, i2, 6408, 5121);
    }

    private static int createTextureUninitialized(int i, int i2, int i3, int i4) throws androidx.media3.common.util.GlUtil.GlException {
        assertValidTextureSize(i, i2);
        int iGenerateTexture = generateTexture();
        bindTexture(3553, iGenerateTexture, 9729);
        android.opengl.GLES20.glTexImage2D(3553, 0, i3, i, i2, 0, 6408, i4, null);
        checkGlError();
        return iGenerateTexture;
    }

    public static int generateTexture() throws androidx.media3.common.util.GlUtil.GlException {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        checkGlError();
        return iArr[0];
    }

    public static void setTexture(int i, android.graphics.Bitmap bitmap) throws androidx.media3.common.util.GlUtil.GlException {
        assertValidTextureSize(bitmap.getWidth(), bitmap.getHeight());
        bindTexture(3553, i, 9729);
        android.opengl.GLUtils.texImage2D(3553, 0, bitmap, 0);
        checkGlError();
    }

    public static void bindTexture(int i, int i2, int i3) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.GLES20.glBindTexture(i, i2);
        checkGlError();
        android.opengl.GLES20.glTexParameteri(i, androidx.work.Data.MAX_DATA_BYTES, i3);
        checkGlError();
        android.opengl.GLES20.glTexParameteri(i, 10241, i3);
        checkGlError();
        android.opengl.GLES20.glTexParameteri(i, 10242, 33071);
        checkGlError();
        android.opengl.GLES20.glTexParameteri(i, 10243, 33071);
        checkGlError();
    }

    public static int createFboForTexture(int i) throws androidx.media3.common.util.GlUtil.GlException {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
        checkGlError();
        android.opengl.GLES20.glBindFramebuffer(36160, iArr[0]);
        checkGlError();
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        checkGlError();
        return iArr[0];
    }

    public static void deleteTexture(int i) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.GLES20.glDeleteTextures(1, new int[]{i}, 0);
        checkGlError();
    }

    public static void destroyEglContext(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLContext eGLContext) throws androidx.media3.common.util.GlUtil.GlException {
        if (eGLDisplay == null) {
            return;
        }
        android.opengl.EGL14.eglMakeCurrent(eGLDisplay, android.opengl.EGL14.EGL_NO_SURFACE, android.opengl.EGL14.EGL_NO_SURFACE, android.opengl.EGL14.EGL_NO_CONTEXT);
        checkEglException("Error releasing context");
        if (eGLContext != null) {
            android.opengl.EGL14.eglDestroyContext(eGLDisplay, eGLContext);
            checkEglException("Error destroying context");
        }
        android.opengl.EGL14.eglReleaseThread();
        checkEglException("Error releasing thread");
        android.opengl.EGL14.eglTerminate(eGLDisplay);
        checkEglException("Error terminating display");
    }

    public static void destroyEglSurface(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLSurface eGLSurface) throws androidx.media3.common.util.GlUtil.GlException {
        if (eGLDisplay == null || eGLSurface == null || android.opengl.EGL14.eglGetCurrentSurface(12377) == android.opengl.EGL14.EGL_NO_SURFACE) {
            return;
        }
        android.opengl.EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        checkEglException("Error destroying surface");
    }

    public static void deleteFbo(int i) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
        checkGlError();
    }

    public static void deleteRbo(int i) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.GLES20.glDeleteRenderbuffers(1, new int[]{i}, 0);
        checkGlError();
    }

    public static void checkGlException(boolean z, java.lang.String str) throws androidx.media3.common.util.GlUtil.GlException {
        if (!z) {
            throw new androidx.media3.common.util.GlUtil.GlException(str);
        }
    }

    private static android.opengl.EGLConfig getEglConfig(android.opengl.EGLDisplay eGLDisplay, int[] iArr) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        if (android.opengl.EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new androidx.media3.common.util.GlUtil.GlException("eglChooseConfig failed.");
    }

    private static boolean isExtensionSupported(java.lang.String str) {
        java.lang.String strEglQueryString = android.opengl.EGL14.eglQueryString(android.opengl.EGL14.eglGetDisplay(0), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    private static void focusRenderTarget(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLContext eGLContext, android.opengl.EGLSurface eGLSurface, int i, int i2, int i3) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        checkEglException("Error making context current");
        focusFramebufferUsingCurrentContext(i, i2, i3);
    }

    private static void checkEglException(java.lang.String str) throws androidx.media3.common.util.GlUtil.GlException {
        int iEglGetError = android.opengl.EGL14.eglGetError();
        if (iEglGetError != 12288) {
            throw new androidx.media3.common.util.GlUtil.GlException(str + ", error code: 0x" + java.lang.Integer.toHexString(iEglGetError));
        }
    }
}
