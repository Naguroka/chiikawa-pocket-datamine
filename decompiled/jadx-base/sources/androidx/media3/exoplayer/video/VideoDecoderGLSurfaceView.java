package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public final class VideoDecoderGLSurfaceView extends android.opengl.GLSurfaceView implements androidx.media3.exoplayer.video.VideoDecoderOutputBufferRenderer {
    private static final java.lang.String TAG = "VideoDecoderGLSV";
    private final androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView.Renderer renderer;

    @java.lang.Deprecated
    public androidx.media3.exoplayer.video.VideoDecoderOutputBufferRenderer getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public VideoDecoderGLSurfaceView(android.content.Context context) {
        this(context, null);
    }

    public VideoDecoderGLSurfaceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView.Renderer renderer = new androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView.Renderer(this);
        this.renderer = renderer;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(renderer);
        setRenderMode(0);
    }

    @Override // androidx.media3.exoplayer.video.VideoDecoderOutputBufferRenderer
    public void setOutputBuffer(androidx.media3.decoder.VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        this.renderer.setOutputBuffer(videoDecoderOutputBuffer);
    }

    private static final class Renderer implements android.opengl.GLSurfaceView.Renderer {
        private static final java.lang.String FRAGMENT_SHADER = "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n";
        private static final java.lang.String VERTEX_SHADER = "varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n";
        private int colorMatrixLocation;
        private androidx.media3.common.util.GlProgram program;
        private androidx.media3.decoder.VideoDecoderOutputBuffer renderedOutputBuffer;
        private final android.opengl.GLSurfaceView surfaceView;
        private static final float[] kColorConversion601 = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};
        private static final float[] kColorConversion709 = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
        private static final float[] kColorConversion2020 = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};
        private static final java.lang.String[] TEXTURE_UNIFORMS = {"y_tex", "u_tex", "v_tex"};
        private static final java.nio.FloatBuffer TEXTURE_VERTICES = androidx.media3.common.util.GlUtil.createBuffer(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
        private final int[] yuvTextures = new int[3];
        private final int[] texLocations = new int[3];
        private final int[] previousWidths = new int[3];
        private final int[] previousStrides = new int[3];
        private final java.util.concurrent.atomic.AtomicReference<androidx.media3.decoder.VideoDecoderOutputBuffer> pendingOutputBufferReference = new java.util.concurrent.atomic.AtomicReference<>();
        private final java.nio.FloatBuffer[] textureCoords = new java.nio.FloatBuffer[3];

        public Renderer(android.opengl.GLSurfaceView gLSurfaceView) {
            this.surfaceView = gLSurfaceView;
            for (int i = 0; i < 3; i++) {
                int[] iArr = this.previousWidths;
                this.previousStrides[i] = -1;
                iArr[i] = -1;
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
            try {
                androidx.media3.common.util.GlProgram glProgram = new androidx.media3.common.util.GlProgram(VERTEX_SHADER, FRAGMENT_SHADER);
                this.program = glProgram;
                android.opengl.GLES20.glVertexAttribPointer(glProgram.getAttributeArrayLocationAndEnable("in_pos"), 2, 5126, false, 0, (java.nio.Buffer) TEXTURE_VERTICES);
                this.texLocations[0] = this.program.getAttributeArrayLocationAndEnable("in_tc_y");
                this.texLocations[1] = this.program.getAttributeArrayLocationAndEnable("in_tc_u");
                this.texLocations[2] = this.program.getAttributeArrayLocationAndEnable("in_tc_v");
                this.colorMatrixLocation = this.program.getUniformLocation("mColorConversion");
                androidx.media3.common.util.GlUtil.checkGlError();
                setupTextures();
                androidx.media3.common.util.GlUtil.checkGlError();
            } catch (androidx.media3.common.util.GlUtil.GlException e) {
                android.util.Log.e(androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView.TAG, "Failed to set up the textures and program", e);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl10, int i, int i2) {
            android.opengl.GLES20.glViewport(0, 0, i, i2);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl10) {
            androidx.media3.decoder.VideoDecoderOutputBuffer andSet = this.pendingOutputBufferReference.getAndSet(null);
            if (andSet == null && this.renderedOutputBuffer == null) {
                return;
            }
            if (andSet != null) {
                androidx.media3.decoder.VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.renderedOutputBuffer;
                if (videoDecoderOutputBuffer != null) {
                    videoDecoderOutputBuffer.release();
                }
                this.renderedOutputBuffer = andSet;
            }
            androidx.media3.decoder.VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = (androidx.media3.decoder.VideoDecoderOutputBuffer) androidx.media3.common.util.Assertions.checkNotNull(this.renderedOutputBuffer);
            float[] fArr = kColorConversion709;
            int i = videoDecoderOutputBuffer2.colorspace;
            if (i == 1) {
                fArr = kColorConversion601;
            } else if (i == 3) {
                fArr = kColorConversion2020;
            }
            android.opengl.GLES20.glUniformMatrix3fv(this.colorMatrixLocation, 1, false, fArr, 0);
            int[] iArr = (int[]) androidx.media3.common.util.Assertions.checkNotNull(videoDecoderOutputBuffer2.yuvStrides);
            java.nio.ByteBuffer[] byteBufferArr = (java.nio.ByteBuffer[]) androidx.media3.common.util.Assertions.checkNotNull(videoDecoderOutputBuffer2.yuvPlanes);
            int i2 = 0;
            while (i2 < 3) {
                int i3 = i2 == 0 ? videoDecoderOutputBuffer2.height : (videoDecoderOutputBuffer2.height + 1) / 2;
                android.opengl.GLES20.glActiveTexture(33984 + i2);
                android.opengl.GLES20.glBindTexture(3553, this.yuvTextures[i2]);
                android.opengl.GLES20.glPixelStorei(3317, 1);
                android.opengl.GLES20.glTexImage2D(3553, 0, 6409, iArr[i2], i3, 0, 6409, 5121, byteBufferArr[i2]);
                i2++;
            }
            int i4 = videoDecoderOutputBuffer2.width;
            int i5 = (i4 + 1) / 2;
            int[] iArr2 = {i4, i5, i5};
            for (int i6 = 0; i6 < 3; i6++) {
                if (this.previousWidths[i6] != iArr2[i6] || this.previousStrides[i6] != iArr[i6]) {
                    androidx.media3.common.util.Assertions.checkState(iArr[i6] != 0);
                    float f = iArr2[i6] / iArr[i6];
                    this.textureCoords[i6] = androidx.media3.common.util.GlUtil.createBuffer(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f, 0.0f, f, 1.0f});
                    android.opengl.GLES20.glVertexAttribPointer(this.texLocations[i6], 2, 5126, false, 0, (java.nio.Buffer) this.textureCoords[i6]);
                    this.previousWidths[i6] = iArr2[i6];
                    this.previousStrides[i6] = iArr[i6];
                }
            }
            android.opengl.GLES20.glClear(16384);
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
            try {
                androidx.media3.common.util.GlUtil.checkGlError();
            } catch (androidx.media3.common.util.GlUtil.GlException e) {
                android.util.Log.e(androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView.TAG, "Failed to draw a frame", e);
            }
        }

        public void setOutputBuffer(androidx.media3.decoder.VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
            androidx.media3.decoder.VideoDecoderOutputBuffer andSet = this.pendingOutputBufferReference.getAndSet(videoDecoderOutputBuffer);
            if (andSet != null) {
                andSet.release();
            }
            this.surfaceView.requestRender();
        }

        @org.checkerframework.checker.nullness.qual.RequiresNonNull({"program"})
        private void setupTextures() {
            try {
                android.opengl.GLES20.glGenTextures(3, this.yuvTextures, 0);
                for (int i = 0; i < 3; i++) {
                    android.opengl.GLES20.glUniform1i(this.program.getUniformLocation(TEXTURE_UNIFORMS[i]), i);
                    android.opengl.GLES20.glActiveTexture(33984 + i);
                    androidx.media3.common.util.GlUtil.bindTexture(3553, this.yuvTextures[i], 9729);
                }
                androidx.media3.common.util.GlUtil.checkGlError();
            } catch (androidx.media3.common.util.GlUtil.GlException e) {
                android.util.Log.e(androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView.TAG, "Failed to set up the textures", e);
            }
        }
    }
}
