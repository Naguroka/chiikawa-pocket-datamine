package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RunnableC0740Hp implements android.graphics.SurfaceTexture.OnFrameAvailableListener, java.lang.Runnable {
    public static byte[] A06;
    public static java.lang.String[] A07 = {"feH6P3nQc3OotB4oQb1UE4FOCH6DqRKq", "ul8YptaadtnD", "q4PkZUS7m1HQSRKJ6o4wpu1", "XXuYebdEWKh7urEHiQwrXLDoBbLcg7", "7R8f8O3Jq8ptPdlyh265i6bwGIY3AnOr", "VVgrfIl8yumQyldYn3WSYqBvmAVi9h2x", "B0KhbmvhQV1sBquLYa8NcmTHXN0flo", "NAMxGSXXDRlS3a9YhTQZIWUlxo26242h"};
    public static final int[] A08;
    public android.graphics.SurfaceTexture A00;
    public android.opengl.EGLContext A01;
    public android.opengl.EGLDisplay A02;
    public android.opengl.EGLSurface A03;
    public final android.os.Handler A04;
    public final int[] A05 = new int[1];

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = bArrCopyOfRange[i4] ^ i3;
            if (A07[5].charAt(20) == '6') {
                throw new java.lang.RuntimeException();
            }
            A07[5] = "lcJc9HVFX4T0AsiVqO0X3akbdgs9NHnd";
            bArrCopyOfRange[i4] = (byte) (i5 ^ 109);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{57, 59, 48, 31, 52, 51, 51, 47, 57, 31, 51, 50, 58, 53, 59, 124, 58, kotlin.io.encoding.Base64.padSymbol, 53, 48, 57, 56, 102, 124, 47, 41, okio.Utf8.REPLACEMENT_BYTE, okio.Utf8.REPLACEMENT_BYTE, 57, 47, 47, 97, 121, 62, 112, 124, 50, 41, 49, 31, 51, 50, 58, 53, 59, 47, 7, 108, 1, 97, 121, 56, 112, 124, okio.Utf8.REPLACEMENT_BYTE, 51, 50, 58, 53, 59, 47, 7, 108, 1, 97, 121, 47, 28, 30, 21, 58, 11, 28, 24, 13, 28, 58, 22, 23, 13, 28, 1, 13, 89, 31, 24, 16, 21, 28, 29, 7, 5, 14, 33, 16, 7, 3, 22, 7, 50, 0, 23, 4, 4, 7, 16, 49, 23, 16, 4, 3, 1, 7, 66, 4, 3, 11, 14, 7, 6, 72, 74, 65, 106, 72, 89, 105, 68, 94, 93, 65, 76, 84, 13, 75, 76, 68, 65, 72, 73, 31, 29, 22, 51, 20, 19, 14, 19, 27, 22, 19, 0, 31, 90, 28, 27, 19, 22, 31, 30, 68, 70, 77, 108, 64, 74, 68, 98, 84, 83, 83, 68, 79, 85, 1, 71, 64, 72, 77, 68, 69, 81, 90, 113, 83, 88, 98, 83, 78, 66, 67, 68, 83, 69, 22, 80, 87, 95, 90, 83, 82, 24, 22, 115, 68, 68, 89, 68, 12, 22};
    }

    static {
        A05();
        A08 = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    }

    public RunnableC0740Hp(android.os.Handler handler) {
        this.A04 = handler;
    }

    public static android.opengl.EGLConfig A00(android.opengl.EGLDisplay eGLDisplay) {
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = android.opengl.EGL14.eglChooseConfig(eGLDisplay, A08, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (zEglChooseConfig && iArr[0] > 0) {
            android.opengl.EGLConfig eGLConfig = eGLConfigArr[0];
            if (A07[2].length() == 26) {
                throw new java.lang.RuntimeException();
            }
            A07[7] = "SLLQjWjncbGd9Rz2WSR3ZqU1MRAKPCr3";
            if (eGLConfig != null) {
                return eGLConfigArr[0];
            }
        }
        throw new com.facebook.ads.redexgen.core.C0738Hn(com.facebook.ads.redexgen.core.IK.A0P(A04(0, 67, 49), java.lang.Boolean.valueOf(zEglChooseConfig), java.lang.Integer.valueOf(iArr[0]), eGLConfigArr[0]));
    }

    public static android.opengl.EGLContext A01(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLConfig eGLConfig, int i) {
        int[] iArr;
        if (i != 0) {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        } else {
            iArr = new int[]{12440, 2, 12344};
        }
        android.opengl.EGLContext eGLContextEglCreateContext = android.opengl.EGL14.eglCreateContext(eGLDisplay, eGLConfig, android.opengl.EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eGLContextEglCreateContext != null) {
            return eGLContextEglCreateContext;
        }
        throw new com.facebook.ads.redexgen.core.C0738Hn(A04(67, 23, 20));
    }

    public static android.opengl.EGLDisplay A02() {
        android.opengl.EGLDisplay eGLDisplayEglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == null) {
            throw new com.facebook.ads.redexgen.core.C0738Hn(A04(120, 20, 64));
        }
        int[] iArr = new int[2];
        boolean eglInitialized = android.opengl.EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1);
        if (!eglInitialized) {
            throw new com.facebook.ads.redexgen.core.C0738Hn(A04(140, 20, 23));
        }
        return eGLDisplayEglGetDisplay;
    }

    public static android.opengl.EGLSurface A03(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLConfig eGLConfig, android.opengl.EGLContext eGLContext, int i) {
        int[] pbufferAttributes;
        android.opengl.EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        } else {
            if (i == 2) {
                pbufferAttributes = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                pbufferAttributes = new int[]{12375, 1, 12374, 1, 12344};
            }
            eGLSurfaceEglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, pbufferAttributes, 0);
            if (eGLSurfaceEglCreatePbufferSurface == null) {
                throw new com.facebook.ads.redexgen.core.C0738Hn(A04(90, 30, 15));
            }
        }
        if (!android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext)) {
            throw new com.facebook.ads.redexgen.core.C0738Hn(A04(org.objectweb.asm.Opcodes.IF_ICMPNE, 21, 76));
        }
        return eGLSurfaceEglCreatePbufferSurface;
    }

    public static void A06(int[] iArr) {
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        int iGlGetError = android.opengl.GLES20.glGetError();
        if (iGlGetError == 0) {
        } else {
            throw new com.facebook.ads.redexgen.core.C0738Hn(A04(org.objectweb.asm.Opcodes.PUTFIELD, 29, 91) + java.lang.Integer.toHexString(iGlGetError));
        }
    }

    public final android.graphics.SurfaceTexture A07() {
        return (android.graphics.SurfaceTexture) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(this.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A08() {
        this.A04.removeCallbacks(this);
        try {
            if (this.A00 != null) {
                this.A00.release();
                android.opengl.GLES20.glDeleteTextures(1, this.A05, 0);
            }
        } finally {
            if (this.A02 != null && !this.A02.equals(android.opengl.EGL14.EGL_NO_DISPLAY)) {
                android.opengl.EGL14.eglMakeCurrent(this.A02, android.opengl.EGL14.EGL_NO_SURFACE, android.opengl.EGL14.EGL_NO_SURFACE, android.opengl.EGL14.EGL_NO_CONTEXT);
            }
            if (this.A03 != null && !this.A03.equals(android.opengl.EGL14.EGL_NO_SURFACE)) {
                android.opengl.EGL14.eglDestroySurface(this.A02, this.A03);
            }
            if (this.A01 != null) {
                android.opengl.EGL14.eglDestroyContext(this.A02, this.A01);
            }
            if (com.facebook.ads.redexgen.core.IK.A02 >= 19) {
                android.opengl.EGL14.eglReleaseThread();
            }
            this.A02 = null;
            this.A01 = null;
            this.A03 = null;
            this.A00 = null;
        }
    }

    public final void A09(int i) {
        this.A02 = A02();
        android.opengl.EGLConfig eGLConfigA00 = A00(this.A02);
        this.A01 = A01(this.A02, eGLConfigA00, i);
        this.A03 = A03(this.A02, eGLConfigA00, this.A01, i);
        A06(this.A05);
        this.A00 = new android.graphics.SurfaceTexture(this.A05[0]);
        this.A00.setOnFrameAvailableListener(this);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        this.A04.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        if (com.facebook.ads.redexgen.core.KQ.A02(this)) {
            return;
        }
        try {
            if (this.A00 != null) {
                this.A00.updateTexImage();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.KQ.A00(th, this);
        }
    }
}
