package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class rq extends android.opengl.GLSurfaceView implements com.applovin.impl.tq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.rq.a f1233a;

    @java.lang.Deprecated
    public com.applovin.impl.tq getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public rq(android.content.Context context) {
        this(context, null);
    }

    public void setOutputBuffer(com.applovin.impl.sq sqVar) {
        this.f1233a.a(sqVar);
    }

    public rq(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        com.applovin.impl.rq.a aVar = new com.applovin.impl.rq.a(this);
        this.f1233a = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    private static final class a implements android.opengl.GLSurfaceView.Renderer {
        private static final float[] j = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};
        private static final float[] k = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
        private static final float[] l = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};
        private static final java.lang.String[] m = {"y_tex", "u_tex", "v_tex"};
        private static final java.nio.FloatBuffer n = com.applovin.impl.aa.a(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.opengl.GLSurfaceView f1234a;
        private final int[] b = new int[3];
        private final int[] c = new int[3];
        private final int[] d = new int[3];
        private final int[] e = new int[3];
        private final java.util.concurrent.atomic.AtomicReference f = new java.util.concurrent.atomic.AtomicReference();
        private final java.nio.FloatBuffer[] g = new java.nio.FloatBuffer[3];
        private int h;
        private int i;

        public a(android.opengl.GLSurfaceView gLSurfaceView) {
            this.f1234a = gLSurfaceView;
            for (int i = 0; i < 3; i++) {
                int[] iArr = this.d;
                this.e[i] = -1;
                iArr[i] = -1;
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
            int iA = com.applovin.impl.aa.a("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.h = iA;
            android.opengl.GLES20.glUseProgram(iA);
            int iGlGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(this.h, "in_pos");
            android.opengl.GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
            android.opengl.GLES20.glVertexAttribPointer(iGlGetAttribLocation, 2, 5126, false, 0, (java.nio.Buffer) n);
            this.c[0] = android.opengl.GLES20.glGetAttribLocation(this.h, "in_tc_y");
            android.opengl.GLES20.glEnableVertexAttribArray(this.c[0]);
            this.c[1] = android.opengl.GLES20.glGetAttribLocation(this.h, "in_tc_u");
            android.opengl.GLES20.glEnableVertexAttribArray(this.c[1]);
            this.c[2] = android.opengl.GLES20.glGetAttribLocation(this.h, "in_tc_v");
            android.opengl.GLES20.glEnableVertexAttribArray(this.c[2]);
            com.applovin.impl.aa.a();
            this.i = android.opengl.GLES20.glGetUniformLocation(this.h, "mColorConversion");
            com.applovin.impl.aa.a();
            a();
            com.applovin.impl.aa.a();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl10, int i, int i2) {
            android.opengl.GLES20.glViewport(0, 0, i, i2);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl10) {
            com.applovin.impl.c8.a(this.f.getAndSet(null));
        }

        public void a(com.applovin.impl.sq sqVar) {
            com.applovin.impl.c8.a(this.f.getAndSet(sqVar));
            this.f1234a.requestRender();
        }

        private void a() {
            android.opengl.GLES20.glGenTextures(3, this.b, 0);
            for (int i = 0; i < 3; i++) {
                android.opengl.GLES20.glUniform1i(android.opengl.GLES20.glGetUniformLocation(this.h, m[i]), i);
                android.opengl.GLES20.glActiveTexture(33984 + i);
                android.opengl.GLES20.glBindTexture(3553, this.b[i]);
                android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
                android.opengl.GLES20.glTexParameterf(3553, androidx.work.Data.MAX_DATA_BYTES, 9729.0f);
                android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
                android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
            }
            com.applovin.impl.aa.a();
        }
    }
}
