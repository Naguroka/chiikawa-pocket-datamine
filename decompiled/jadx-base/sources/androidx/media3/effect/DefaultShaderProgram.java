package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
final class DefaultShaderProgram extends androidx.media3.effect.BaseGlShaderProgram implements androidx.media3.effect.ExternalShaderProgram, androidx.media3.effect.RepeatingGainmapShaderProgram {
    private static final java.lang.String FRAGMENT_SHADER_COPY_PATH = "shaders/fragment_shader_copy_es2.glsl";
    private static final java.lang.String FRAGMENT_SHADER_OETF_ES3_PATH = "shaders/fragment_shader_oetf_es3.glsl";
    private static final java.lang.String FRAGMENT_SHADER_TRANSFORMATION_EXTERNAL_YUV_ES3_PATH = "shaders/fragment_shader_transformation_external_yuv_es3.glsl";
    private static final java.lang.String FRAGMENT_SHADER_TRANSFORMATION_HDR_INTERNAL_ES3_PATH = "shaders/fragment_shader_transformation_hdr_internal_es3.glsl";
    private static final java.lang.String FRAGMENT_SHADER_TRANSFORMATION_PATH = "shaders/fragment_shader_transformation_es2.glsl";
    private static final java.lang.String FRAGMENT_SHADER_TRANSFORMATION_SDR_EXTERNAL_PATH = "shaders/fragment_shader_transformation_sdr_external_es2.glsl";
    private static final java.lang.String FRAGMENT_SHADER_TRANSFORMATION_SDR_INTERNAL_PATH = "shaders/fragment_shader_transformation_sdr_internal_es2.glsl";
    private static final java.lang.String FRAGMENT_SHADER_TRANSFORMATION_SDR_OETF_ES2_PATH = "shaders/fragment_shader_transformation_sdr_oetf_es2.glsl";
    private static final java.lang.String FRAGMENT_SHADER_TRANSFORMATION_ULTRA_HDR_ES3_PATH = "shaders/fragment_shader_transformation_ultra_hdr_es3.glsl";
    private static final java.lang.String VERTEX_SHADER_TRANSFORMATION_ES3_PATH = "shaders/vertex_shader_transformation_es3.glsl";
    private static final java.lang.String VERTEX_SHADER_TRANSFORMATION_PATH = "shaders/vertex_shader_transformation_es2.glsl";
    private final float[] compositeRgbMatrixArray;
    private final float[] compositeTransformationMatrixArray;
    private int gainmapTexId;
    private final androidx.media3.common.util.GlProgram glProgram;
    private boolean isRepeatingFrameDrawn;
    private android.graphics.Gainmap lastGainmap;
    private final com.google.common.collect.ImmutableList<androidx.media3.effect.GlMatrixTransformation> matrixTransformations;
    private int outputColorTransfer;
    private final com.google.common.collect.ImmutableList<androidx.media3.effect.RgbMatrix> rgbMatrices;
    private final float[][] rgbMatrixCache;
    private boolean shouldRepeatLastFrame;
    private final float[] tempResultMatrix;
    private final float[][] transformationMatrixCache;
    private final boolean useHdr;
    private com.google.common.collect.ImmutableList<float[]> visiblePolygon;
    private static final com.google.common.collect.ImmutableList<float[]> NDC_SQUARE = com.google.common.collect.ImmutableList.of(new float[]{-1.0f, -1.0f, 0.0f, 1.0f}, new float[]{-1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, -1.0f, 0.0f, 1.0f});
    private static final float[] BT2020_FULL_RANGE_YUV_TO_RGB_COLOR_TRANSFORM_MATRIX = {1.0f, 1.0f, 1.0f, 0.0f, -0.1646f, 1.8814f, 1.4746f, -0.5714f, 0.0f};
    private static final float[] BT2020_LIMITED_RANGE_YUV_TO_RGB_COLOR_TRANSFORM_MATRIX = {1.1689f, 1.1689f, 1.1689f, 0.0f, -0.1881f, 2.1502f, 1.6853f, -0.653f, 0.0f};

    public static androidx.media3.effect.DefaultShaderProgram create(android.content.Context context, java.util.List<androidx.media3.effect.GlMatrixTransformation> list, java.util.List<androidx.media3.effect.RgbMatrix> list2, boolean z) throws androidx.media3.common.VideoFrameProcessingException {
        return new androidx.media3.effect.DefaultShaderProgram(createGlProgram(context, VERTEX_SHADER_TRANSFORMATION_PATH, list2.isEmpty() ? FRAGMENT_SHADER_COPY_PATH : FRAGMENT_SHADER_TRANSFORMATION_PATH), com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list), com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list2), 1, z);
    }

    public static androidx.media3.effect.DefaultShaderProgram createWithInternalSampler(android.content.Context context, androidx.media3.common.ColorInfo colorInfo, androidx.media3.common.ColorInfo colorInfo2, int i, int i2) throws androidx.media3.common.VideoFrameProcessingException {
        java.lang.String str;
        androidx.media3.common.util.Assertions.checkState(colorInfo.colorTransfer != 2 || i2 == 2);
        boolean zIsTransferHdr = androidx.media3.common.ColorInfo.isTransferHdr(colorInfo);
        boolean z = i2 == 2 && colorInfo2.colorSpace == 6;
        java.lang.String str2 = (zIsTransferHdr || z) ? VERTEX_SHADER_TRANSFORMATION_ES3_PATH : VERTEX_SHADER_TRANSFORMATION_PATH;
        if (z) {
            str = FRAGMENT_SHADER_TRANSFORMATION_ULTRA_HDR_ES3_PATH;
        } else {
            str = zIsTransferHdr ? FRAGMENT_SHADER_TRANSFORMATION_HDR_INTERNAL_ES3_PATH : FRAGMENT_SHADER_TRANSFORMATION_SDR_INTERNAL_PATH;
        }
        androidx.media3.common.util.GlProgram glProgramCreateGlProgram = createGlProgram(context, str2, str);
        if (!z) {
            androidx.media3.common.util.Assertions.checkArgument(zIsTransferHdr || colorInfo.colorTransfer == 2 || colorInfo.colorTransfer == 3);
            glProgramCreateGlProgram.setIntUniform("uInputColorTransfer", colorInfo.colorTransfer);
        }
        if (zIsTransferHdr) {
            glProgramCreateGlProgram.setIntUniform("uApplyHdrToSdrToneMapping", colorInfo2.colorSpace != 6 ? 1 : 0);
        }
        com.google.common.collect.ImmutableList immutableListOf = com.google.common.collect.ImmutableList.of();
        if (i2 == 2) {
            immutableListOf = com.google.common.collect.ImmutableList.of(new androidx.media3.effect.MatrixTransformation() { // from class: androidx.media3.effect.DefaultShaderProgram$$ExternalSyntheticLambda0
                @Override // androidx.media3.effect.MatrixTransformation
                public final android.graphics.Matrix getMatrix(long j) {
                    return androidx.media3.effect.DefaultShaderProgram.lambda$createWithInternalSampler$0(j);
                }
            });
        }
        return createWithSampler(glProgramCreateGlProgram, colorInfo, colorInfo2, i, immutableListOf);
    }

    static /* synthetic */ android.graphics.Matrix lambda$createWithInternalSampler$0(long j) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(1.0f, -1.0f);
        return matrix;
    }

    public static androidx.media3.effect.DefaultShaderProgram createWithExternalSampler(android.content.Context context, androidx.media3.common.ColorInfo colorInfo, androidx.media3.common.ColorInfo colorInfo2, int i, boolean z) throws androidx.media3.common.VideoFrameProcessingException {
        float[] fArr;
        boolean zIsTransferHdr = androidx.media3.common.ColorInfo.isTransferHdr(colorInfo);
        androidx.media3.common.util.GlProgram glProgramCreateGlProgram = createGlProgram(context, zIsTransferHdr ? VERTEX_SHADER_TRANSFORMATION_ES3_PATH : VERTEX_SHADER_TRANSFORMATION_PATH, zIsTransferHdr ? FRAGMENT_SHADER_TRANSFORMATION_EXTERNAL_YUV_ES3_PATH : FRAGMENT_SHADER_TRANSFORMATION_SDR_EXTERNAL_PATH);
        if (zIsTransferHdr) {
            if (!androidx.media3.common.util.GlUtil.isYuvTargetExtensionSupported()) {
                throw new androidx.media3.common.VideoFrameProcessingException("The EXT_YUV_target extension is required for HDR editing input.");
            }
            if (colorInfo.colorRange == 1) {
                fArr = BT2020_FULL_RANGE_YUV_TO_RGB_COLOR_TRANSFORM_MATRIX;
            } else {
                fArr = BT2020_LIMITED_RANGE_YUV_TO_RGB_COLOR_TRANSFORM_MATRIX;
            }
            glProgramCreateGlProgram.setFloatsUniform("uYuvToRgbColorTransform", fArr);
            glProgramCreateGlProgram.setIntUniform("uInputColorTransfer", colorInfo.colorTransfer);
            glProgramCreateGlProgram.setIntUniform("uApplyHdrToSdrToneMapping", colorInfo2.colorSpace == 6 ? 0 : 1);
        }
        glProgramCreateGlProgram.setExternalTexturesRequireNearestSampling(z);
        return createWithSampler(glProgramCreateGlProgram, colorInfo, colorInfo2, i, com.google.common.collect.ImmutableList.of());
    }

    public static androidx.media3.effect.DefaultShaderProgram createApplyingOetf(android.content.Context context, java.util.List<androidx.media3.effect.GlMatrixTransformation> list, java.util.List<androidx.media3.effect.RgbMatrix> list2, androidx.media3.common.ColorInfo colorInfo, int i) throws androidx.media3.common.VideoFrameProcessingException {
        java.lang.String str;
        boolean zIsTransferHdr = androidx.media3.common.ColorInfo.isTransferHdr(colorInfo);
        boolean z = true;
        boolean z2 = i == 2;
        java.lang.String str2 = zIsTransferHdr ? VERTEX_SHADER_TRANSFORMATION_ES3_PATH : VERTEX_SHADER_TRANSFORMATION_PATH;
        if (zIsTransferHdr) {
            str = FRAGMENT_SHADER_OETF_ES3_PATH;
        } else if (z2) {
            str = FRAGMENT_SHADER_TRANSFORMATION_SDR_OETF_ES2_PATH;
        } else {
            str = list2.isEmpty() ? FRAGMENT_SHADER_COPY_PATH : FRAGMENT_SHADER_TRANSFORMATION_PATH;
        }
        androidx.media3.common.util.GlProgram glProgramCreateGlProgram = createGlProgram(context, str2, str);
        int i2 = colorInfo.colorTransfer;
        if (zIsTransferHdr) {
            if (i2 != 7 && i2 != 6) {
                z = false;
            }
            androidx.media3.common.util.Assertions.checkArgument(z);
            glProgramCreateGlProgram.setIntUniform("uOutputColorTransfer", i2);
        } else if (z2) {
            if (i2 != 3 && i2 != 10) {
                z = false;
            }
            androidx.media3.common.util.Assertions.checkArgument(z);
            glProgramCreateGlProgram.setIntUniform("uOutputColorTransfer", i2);
        }
        return new androidx.media3.effect.DefaultShaderProgram(glProgramCreateGlProgram, com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list), com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list2), colorInfo.colorTransfer, zIsTransferHdr);
    }

    private static androidx.media3.effect.DefaultShaderProgram createWithSampler(androidx.media3.common.util.GlProgram glProgram, androidx.media3.common.ColorInfo colorInfo, androidx.media3.common.ColorInfo colorInfo2, int i, com.google.common.collect.ImmutableList<androidx.media3.effect.GlMatrixTransformation> immutableList) {
        boolean zIsTransferHdr = androidx.media3.common.ColorInfo.isTransferHdr(colorInfo);
        boolean z = (colorInfo.colorSpace == 1 || colorInfo.colorSpace == 2) && colorInfo2.colorSpace == 6;
        int i2 = colorInfo2.colorTransfer;
        if (zIsTransferHdr) {
            if (i2 == 3) {
                i2 = 10;
            }
            androidx.media3.common.util.Assertions.checkArgument(i2 == 1 || i2 == 10 || i2 == 6 || i2 == 7);
            glProgram.setIntUniform("uOutputColorTransfer", i2);
        } else if (z) {
            androidx.media3.common.util.Assertions.checkArgument(i2 == 1 || i2 == 6 || i2 == 7);
            glProgram.setIntUniform("uOutputColorTransfer", i2);
        } else {
            glProgram.setIntUniform("uSdrWorkingColorSpace", i);
            androidx.media3.common.util.Assertions.checkArgument(i2 == 3 || i2 == 1);
            glProgram.setIntUniform("uOutputColorTransfer", i2);
        }
        return new androidx.media3.effect.DefaultShaderProgram(glProgram, immutableList, com.google.common.collect.ImmutableList.of(), colorInfo2.colorTransfer, zIsTransferHdr || z);
    }

    private DefaultShaderProgram(androidx.media3.common.util.GlProgram glProgram, com.google.common.collect.ImmutableList<androidx.media3.effect.GlMatrixTransformation> immutableList, com.google.common.collect.ImmutableList<androidx.media3.effect.RgbMatrix> immutableList2, int i, boolean z) {
        super(z, 1);
        this.glProgram = glProgram;
        this.outputColorTransfer = i;
        this.matrixTransformations = immutableList;
        this.rgbMatrices = immutableList2;
        this.useHdr = z;
        this.transformationMatrixCache = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, immutableList.size(), 16);
        this.rgbMatrixCache = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, immutableList2.size(), 16);
        this.compositeTransformationMatrixArray = androidx.media3.common.util.GlUtil.create4x4IdentityMatrix();
        this.compositeRgbMatrixArray = androidx.media3.common.util.GlUtil.create4x4IdentityMatrix();
        this.tempResultMatrix = new float[16];
        this.visiblePolygon = NDC_SQUARE;
        this.gainmapTexId = -1;
    }

    private static androidx.media3.common.util.GlProgram createGlProgram(android.content.Context context, java.lang.String str, java.lang.String str2) throws androidx.media3.common.VideoFrameProcessingException {
        try {
            androidx.media3.common.util.GlProgram glProgram = new androidx.media3.common.util.GlProgram(context, str, str2);
            glProgram.setFloatsUniform("uTexTransformationMatrix", androidx.media3.common.util.GlUtil.create4x4IdentityMatrix());
            return glProgram;
        } catch (androidx.media3.common.util.GlUtil.GlException | java.io.IOException e) {
            throw new androidx.media3.common.VideoFrameProcessingException(e);
        }
    }

    @Override // androidx.media3.effect.ExternalShaderProgram
    public void setTextureTransformMatrix(float[] fArr) {
        this.glProgram.setFloatsUniform("uTexTransformationMatrix", fArr);
    }

    @Override // androidx.media3.effect.BaseGlShaderProgram
    public androidx.media3.common.util.Size configure(int i, int i2) {
        return androidx.media3.effect.MatrixUtils.configureAndGetOutputSize(i, i2, this.matrixTransformations);
    }

    @Override // androidx.media3.effect.BaseGlShaderProgram
    public void drawFrame(int i, long j) throws androidx.media3.common.VideoFrameProcessingException {
        boolean z = updateCompositeRgbMatrixArray(j) || updateCompositeTransformationMatrixAndVisiblePolygon(j);
        if (this.visiblePolygon.size() < 3) {
            return;
        }
        if (this.shouldRepeatLastFrame && !z && this.isRepeatingFrameDrawn) {
            return;
        }
        try {
            this.glProgram.use();
            setGainmapSamplerAndUniforms();
            this.glProgram.setSamplerTexIdUniform("uTexSampler", i, 0);
            this.glProgram.setFloatsUniform("uTransformationMatrix", this.compositeTransformationMatrixArray);
            this.glProgram.setFloatsUniformIfPresent("uRgbMatrix", this.compositeRgbMatrixArray);
            this.glProgram.setBufferAttribute("aFramePosition", androidx.media3.common.util.GlUtil.createVertexBuffer(this.visiblePolygon), 4);
            this.glProgram.bindAttributesAndUniforms();
            android.opengl.GLES20.glDrawArrays(6, 0, this.visiblePolygon.size());
            androidx.media3.common.util.GlUtil.checkGlError();
            this.isRepeatingFrameDrawn = true;
        } catch (androidx.media3.common.util.GlUtil.GlException e) {
            throw new androidx.media3.common.VideoFrameProcessingException(e, j);
        }
    }

    @Override // androidx.media3.effect.BaseGlShaderProgram, androidx.media3.effect.GlShaderProgram
    public void release() throws androidx.media3.common.VideoFrameProcessingException {
        super.release();
        try {
            this.glProgram.delete();
            int i = this.gainmapTexId;
            if (i != -1) {
                androidx.media3.common.util.GlUtil.deleteTexture(i);
            }
        } catch (androidx.media3.common.util.GlUtil.GlException e) {
            throw new androidx.media3.common.VideoFrameProcessingException(e);
        }
    }

    @Override // androidx.media3.effect.GainmapShaderProgram
    public void setGainmap(android.graphics.Gainmap gainmap) throws androidx.media3.common.util.GlUtil.GlException {
        if (this.useHdr) {
            android.graphics.Gainmap gainmap2 = this.lastGainmap;
            if (gainmap2 == null || !androidx.media3.effect.GainmapUtil.equals(gainmap2, gainmap)) {
                this.isRepeatingFrameDrawn = false;
                this.lastGainmap = gainmap;
                int i = this.gainmapTexId;
                if (i == -1) {
                    this.gainmapTexId = androidx.media3.common.util.GlUtil.createTexture(gainmap.getGainmapContents());
                } else {
                    androidx.media3.common.util.GlUtil.setTexture(i, gainmap.getGainmapContents());
                }
            }
        }
    }

    @Override // androidx.media3.effect.RepeatingFrameShaderProgram
    public void signalNewRepeatingFrameSequence() {
        androidx.media3.common.util.Assertions.checkState(this.outputTexturePool.capacity() == 1);
        this.shouldRepeatLastFrame = true;
        this.isRepeatingFrameDrawn = false;
    }

    @Override // androidx.media3.effect.BaseGlShaderProgram
    public boolean shouldClearTextureBuffer() {
        return (this.isRepeatingFrameDrawn && this.shouldRepeatLastFrame) ? false : true;
    }

    public void setOutputColorTransfer(int i) {
        androidx.media3.common.util.Assertions.checkState(this.outputColorTransfer != 1);
        this.outputColorTransfer = i;
        this.glProgram.setIntUniform("uOutputColorTransfer", i);
    }

    public int getOutputColorTransfer() {
        return this.outputColorTransfer;
    }

    private boolean updateCompositeTransformationMatrixAndVisiblePolygon(long j) {
        float[][] fArr = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, this.matrixTransformations.size(), 16);
        for (int i = 0; i < this.matrixTransformations.size(); i++) {
            fArr[i] = this.matrixTransformations.get(i).getGlMatrixArray(j);
        }
        if (!updateMatrixCache(this.transformationMatrixCache, fArr)) {
            return false;
        }
        androidx.media3.common.util.GlUtil.setToIdentity(this.compositeTransformationMatrixArray);
        this.visiblePolygon = NDC_SQUARE;
        for (float[] fArr2 : this.transformationMatrixCache) {
            android.opengl.Matrix.multiplyMM(this.tempResultMatrix, 0, fArr2, 0, this.compositeTransformationMatrixArray, 0);
            float[] fArr3 = this.tempResultMatrix;
            java.lang.System.arraycopy(fArr3, 0, this.compositeTransformationMatrixArray, 0, fArr3.length);
            com.google.common.collect.ImmutableList<float[]> immutableListClipConvexPolygonToNdcRange = androidx.media3.effect.MatrixUtils.clipConvexPolygonToNdcRange(androidx.media3.effect.MatrixUtils.transformPoints(fArr2, this.visiblePolygon));
            this.visiblePolygon = immutableListClipConvexPolygonToNdcRange;
            if (immutableListClipConvexPolygonToNdcRange.size() < 3) {
                return true;
            }
        }
        android.opengl.Matrix.invertM(this.tempResultMatrix, 0, this.compositeTransformationMatrixArray, 0);
        this.visiblePolygon = androidx.media3.effect.MatrixUtils.transformPoints(this.tempResultMatrix, this.visiblePolygon);
        return true;
    }

    private boolean updateCompositeRgbMatrixArray(long j) {
        float[][] fArr = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, this.rgbMatrices.size(), 16);
        for (int i = 0; i < this.rgbMatrices.size(); i++) {
            fArr[i] = this.rgbMatrices.get(i).getMatrix(j, this.useHdr);
        }
        if (!updateMatrixCache(this.rgbMatrixCache, fArr)) {
            return false;
        }
        androidx.media3.common.util.GlUtil.setToIdentity(this.compositeRgbMatrixArray);
        for (int i2 = 0; i2 < this.rgbMatrices.size(); i2++) {
            android.opengl.Matrix.multiplyMM(this.tempResultMatrix, 0, this.rgbMatrices.get(i2).getMatrix(j, this.useHdr), 0, this.compositeRgbMatrixArray, 0);
            float[] fArr2 = this.tempResultMatrix;
            java.lang.System.arraycopy(fArr2, 0, this.compositeRgbMatrixArray, 0, fArr2.length);
        }
        return true;
    }

    private static boolean updateMatrixCache(float[][] fArr, float[][] fArr2) {
        boolean z = false;
        for (int i = 0; i < fArr.length; i++) {
            float[] fArr3 = fArr[i];
            float[] fArr4 = fArr2[i];
            if (!java.util.Arrays.equals(fArr3, fArr4)) {
                androidx.media3.common.util.Assertions.checkState(fArr4.length == 16, "A 4x4 transformation matrix must have 16 elements");
                java.lang.System.arraycopy(fArr4, 0, fArr3, 0, fArr4.length);
                z = true;
            }
        }
        return z;
    }

    private void setGainmapSamplerAndUniforms() throws androidx.media3.common.util.GlUtil.GlException {
        if (this.lastGainmap == null) {
            return;
        }
        if (androidx.media3.common.util.Util.SDK_INT < 34) {
            throw new java.lang.IllegalStateException("Gainmaps not supported under API 34.");
        }
        this.glProgram.setSamplerTexIdUniform("uGainmapTexSampler", this.gainmapTexId, 1);
        androidx.media3.effect.GainmapUtil.setGainmapUniforms(this.glProgram, this.lastGainmap, -1);
    }
}
