package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f587a = false;

    public static boolean c() {
        java.lang.String strEglQueryString;
        return com.applovin.impl.xp.f1515a >= 17 && (strEglQueryString = android.opengl.EGL14.eglQueryString(android.opengl.EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    public static final class a extends java.lang.RuntimeException {
        public a(java.lang.String str) {
            super(str);
        }
    }

    public static int b() {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, java.nio.IntBuffer.wrap(iArr));
        android.opengl.GLES20.glBindTexture(36197, iArr[0]);
        android.opengl.GLES20.glTexParameteri(36197, 10241, 9729);
        android.opengl.GLES20.glTexParameteri(36197, androidx.work.Data.MAX_DATA_BYTES, 9729);
        android.opengl.GLES20.glTexParameteri(36197, 10242, 33071);
        android.opengl.GLES20.glTexParameteri(36197, 10243, 33071);
        a();
        return iArr[0];
    }

    private static void a(int i, java.lang.String str, int i2) {
        int iGlCreateShader = android.opengl.GLES20.glCreateShader(i);
        android.opengl.GLES20.glShaderSource(iGlCreateShader, str);
        android.opengl.GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        android.opengl.GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            a(android.opengl.GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: " + str);
        }
        android.opengl.GLES20.glAttachShader(i2, iGlCreateShader);
        android.opengl.GLES20.glDeleteShader(iGlCreateShader);
        a();
    }

    public static void a() {
        int i = 0;
        while (true) {
            int iGlGetError = android.opengl.GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            com.applovin.impl.oc.b("GlUtil", "glError " + android.opengl.GLU.gluErrorString(iGlGetError));
            i = iGlGetError;
        }
        if (i != 0) {
            a("glError " + android.opengl.GLU.gluErrorString(i));
        }
    }

    public static java.nio.FloatBuffer a(int i) {
        return java.nio.ByteBuffer.allocateDirect(i * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static java.nio.FloatBuffer a(float[] fArr) {
        return (java.nio.FloatBuffer) a(fArr.length).put(fArr).flip();
    }

    public static boolean a(android.content.Context context) {
        java.lang.String strEglQueryString;
        int i = com.applovin.impl.xp.f1515a;
        if (i < 24) {
            return false;
        }
        if (i >= 26 || !(com.adjust.sdk.Constants.REFERRER_API_SAMSUNG.equals(com.applovin.impl.xp.c) || "XT1650".equals(com.applovin.impl.xp.d))) {
            return (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = android.opengl.EGL14.eglQueryString(android.opengl.EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content");
        }
        return false;
    }

    public static int a(java.lang.String[] strArr, java.lang.String[] strArr2) {
        return a(android.text.TextUtils.join("\n", strArr), android.text.TextUtils.join("\n", strArr2));
    }

    public static int a(java.lang.String str, java.lang.String str2) {
        int iGlCreateProgram = android.opengl.GLES20.glCreateProgram();
        a();
        a(35633, str, iGlCreateProgram);
        a(35632, str2, iGlCreateProgram);
        android.opengl.GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        android.opengl.GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            a("Unable to link shader program: \n" + android.opengl.GLES20.glGetProgramInfoLog(iGlCreateProgram));
        }
        a();
        return iGlCreateProgram;
    }

    private static void a(java.lang.String str) {
        com.applovin.impl.oc.b("GlUtil", str);
        if (f587a) {
            throw new com.applovin.impl.aa.a(str);
        }
    }
}
