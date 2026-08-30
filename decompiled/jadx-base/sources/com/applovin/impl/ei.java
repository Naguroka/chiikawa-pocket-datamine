package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
final class ei {
    private static final java.lang.String[] j = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};
    private static final java.lang.String[] k = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};
    private static final float[] l = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] m = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    private static final float[] n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] o = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f763a;
    private com.applovin.impl.ei.a b;
    private com.applovin.impl.ei.a c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    ei() {
    }

    public void b(com.applovin.impl.ci ciVar) {
        if (a(ciVar)) {
            this.f763a = ciVar.c;
            com.applovin.impl.ei.a aVar = new com.applovin.impl.ei.a(ciVar.f680a.a(0));
            this.b = aVar;
            if (!ciVar.d) {
                aVar = new com.applovin.impl.ei.a(ciVar.b.a(0));
            }
            this.c = aVar;
        }
    }

    void a(int i, float[] fArr, boolean z) {
        float[] fArr2;
        com.applovin.impl.ei.a aVar = z ? this.c : this.b;
        if (aVar == null) {
            return;
        }
        android.opengl.GLES20.glUseProgram(this.d);
        com.applovin.impl.aa.a();
        android.opengl.GLES20.glEnableVertexAttribArray(this.g);
        android.opengl.GLES20.glEnableVertexAttribArray(this.h);
        com.applovin.impl.aa.a();
        int i2 = this.f763a;
        if (i2 == 1) {
            fArr2 = z ? n : m;
        } else if (i2 == 2) {
            fArr2 = z ? p : o;
        } else {
            fArr2 = l;
        }
        android.opengl.GLES20.glUniformMatrix3fv(this.f, 1, false, fArr2, 0);
        android.opengl.GLES20.glUniformMatrix4fv(this.e, 1, false, fArr, 0);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(36197, i);
        android.opengl.GLES20.glUniform1i(this.i, 0);
        com.applovin.impl.aa.a();
        android.opengl.GLES20.glVertexAttribPointer(this.g, 3, 5126, false, 12, (java.nio.Buffer) aVar.b);
        com.applovin.impl.aa.a();
        android.opengl.GLES20.glVertexAttribPointer(this.h, 2, 5126, false, 8, (java.nio.Buffer) aVar.c);
        com.applovin.impl.aa.a();
        android.opengl.GLES20.glDrawArrays(aVar.d, 0, aVar.f764a);
        com.applovin.impl.aa.a();
        android.opengl.GLES20.glDisableVertexAttribArray(this.g);
        android.opengl.GLES20.glDisableVertexAttribArray(this.h);
    }

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f764a;
        private final java.nio.FloatBuffer b;
        private final java.nio.FloatBuffer c;
        private final int d;

        public a(com.applovin.impl.ci.b bVar) {
            this.f764a = bVar.a();
            this.b = com.applovin.impl.aa.a(bVar.c);
            this.c = com.applovin.impl.aa.a(bVar.d);
            int i = bVar.b;
            if (i == 1) {
                this.d = 5;
            } else if (i != 2) {
                this.d = 4;
            } else {
                this.d = 6;
            }
        }
    }

    void a() {
        int iA = com.applovin.impl.aa.a(j, k);
        this.d = iA;
        this.e = android.opengl.GLES20.glGetUniformLocation(iA, "uMvpMatrix");
        this.f = android.opengl.GLES20.glGetUniformLocation(this.d, "uTexMatrix");
        this.g = android.opengl.GLES20.glGetAttribLocation(this.d, "aPosition");
        this.h = android.opengl.GLES20.glGetAttribLocation(this.d, "aTexCoords");
        this.i = android.opengl.GLES20.glGetUniformLocation(this.d, "uTexture");
    }

    public static boolean a(com.applovin.impl.ci ciVar) {
        com.applovin.impl.ci.a aVar = ciVar.f680a;
        com.applovin.impl.ci.a aVar2 = ciVar.b;
        return aVar.a() == 1 && aVar.a(0).f682a == 0 && aVar2.a() == 1 && aVar2.a(0).f682a == 0;
    }
}
