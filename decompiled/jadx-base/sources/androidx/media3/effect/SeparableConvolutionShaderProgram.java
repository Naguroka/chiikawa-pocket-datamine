package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public class SeparableConvolutionShaderProgram implements androidx.media3.effect.GlShaderProgram {
    private static final java.lang.String FRAGMENT_SHADER_PATH = "shaders/fragment_shader_separable_convolution_es2.glsl";
    private static final int FUNCTION_LUT_PADDING = 5;
    private static final int RASTER_SAMPLES_PER_TEXEL = 5;
    private static final java.lang.String VERTEX_SHADER_PATH = "shaders/vertex_shader_transformation_es2.glsl";
    private final androidx.media3.effect.ConvolutionFunction1D.Provider convolutionFunction1DProvider;
    private androidx.media3.effect.GlShaderProgram.ErrorListener errorListener;
    private java.util.concurrent.Executor errorListenerExecutor;
    private float functionLutCenterX;
    private float functionLutDomainStart;
    private float functionLutTexelStep;
    private androidx.media3.common.GlTextureInfo functionLutTexture;
    private float functionLutWidth;
    private final androidx.media3.common.util.GlProgram glProgram;
    private androidx.media3.effect.GlShaderProgram.InputListener inputListener;
    private androidx.media3.common.util.Size intermediateSize;
    private androidx.media3.common.GlTextureInfo intermediateTexture;
    private androidx.media3.effect.ConvolutionFunction1D lastConvolutionFunction;
    private androidx.media3.common.util.Size lastInputSize;
    private androidx.media3.effect.GlShaderProgram.OutputListener outputListener;
    private androidx.media3.common.util.Size outputSize;
    private androidx.media3.common.GlTextureInfo outputTexture;
    private boolean outputTextureInUse;
    private final boolean useHdr;

    static /* synthetic */ void lambda$new$0(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
    }

    protected void onBlurRendered(androidx.media3.common.GlTextureInfo glTextureInfo) throws androidx.media3.common.util.GlUtil.GlException {
    }

    public SeparableConvolutionShaderProgram(android.content.Context context, boolean z, androidx.media3.effect.SeparableConvolution separableConvolution, float f, float f2) throws androidx.media3.common.VideoFrameProcessingException {
        this(context, z, new androidx.media3.effect.SeparableConvolutionShaderProgram.SeparableConvolutionWrapper(separableConvolution, f, f2));
    }

    public SeparableConvolutionShaderProgram(android.content.Context context, boolean z, androidx.media3.effect.ConvolutionFunction1D.Provider provider) throws androidx.media3.common.VideoFrameProcessingException {
        this.useHdr = z;
        this.convolutionFunction1DProvider = provider;
        this.inputListener = new androidx.media3.effect.GlShaderProgram.InputListener() { // from class: androidx.media3.effect.SeparableConvolutionShaderProgram.1
        };
        this.outputListener = new androidx.media3.effect.GlShaderProgram.OutputListener() { // from class: androidx.media3.effect.SeparableConvolutionShaderProgram.2
        };
        this.errorListener = new androidx.media3.effect.GlShaderProgram.ErrorListener() { // from class: androidx.media3.effect.SeparableConvolutionShaderProgram$$ExternalSyntheticLambda1
            @Override // androidx.media3.effect.GlShaderProgram.ErrorListener
            public final void onError(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
                androidx.media3.effect.SeparableConvolutionShaderProgram.lambda$new$0(videoFrameProcessingException);
            }
        };
        this.errorListenerExecutor = com.google.common.util.concurrent.MoreExecutors.directExecutor();
        this.functionLutTexture = androidx.media3.common.GlTextureInfo.UNSET;
        this.intermediateTexture = androidx.media3.common.GlTextureInfo.UNSET;
        this.outputTexture = androidx.media3.common.GlTextureInfo.UNSET;
        this.lastInputSize = androidx.media3.common.util.Size.ZERO;
        this.intermediateSize = androidx.media3.common.util.Size.ZERO;
        this.outputSize = androidx.media3.common.util.Size.ZERO;
        this.lastConvolutionFunction = null;
        try {
            this.glProgram = new androidx.media3.common.util.GlProgram(context, VERTEX_SHADER_PATH, FRAGMENT_SHADER_PATH);
        } catch (androidx.media3.common.util.GlUtil.GlException | java.io.IOException e) {
            throw new androidx.media3.common.VideoFrameProcessingException(e);
        }
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public final void setInputListener(androidx.media3.effect.GlShaderProgram.InputListener inputListener) {
        this.inputListener = inputListener;
        if (this.outputTextureInUse) {
            return;
        }
        inputListener.onReadyToAcceptInputFrame();
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public final void setOutputListener(androidx.media3.effect.GlShaderProgram.OutputListener outputListener) {
        this.outputListener = outputListener;
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public final void setErrorListener(java.util.concurrent.Executor executor, androidx.media3.effect.GlShaderProgram.ErrorListener errorListener) {
        this.errorListenerExecutor = executor;
        this.errorListener = errorListener;
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public final void queueInputFrame(androidx.media3.common.GlObjectsProvider glObjectsProvider, androidx.media3.common.GlTextureInfo glTextureInfo, final long j) {
        androidx.media3.common.util.Assertions.checkState(!this.outputTextureInUse, "The shader program does not currently accept input frames. Release prior output frames first.");
        try {
            ensureTexturesAreConfigured(glObjectsProvider, new androidx.media3.common.util.Size(glTextureInfo.width, glTextureInfo.height), j);
            this.outputTextureInUse = true;
            renderHorizontal(glTextureInfo);
            renderVertical();
            onBlurRendered(glTextureInfo);
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
            androidx.media3.common.util.GlUtil.checkGlError();
            this.inputListener.onInputFrameProcessed(glTextureInfo);
            this.outputListener.onOutputFrameAvailable(this.outputTexture, j);
        } catch (androidx.media3.common.util.GlUtil.GlException e) {
            this.errorListenerExecutor.execute(new java.lang.Runnable() { // from class: androidx.media3.effect.SeparableConvolutionShaderProgram$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m103xa4ff972e(e, j);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$queueInputFrame$1$androidx-media3-effect-SeparableConvolutionShaderProgram, reason: not valid java name */
    /* synthetic */ void m103xa4ff972e(androidx.media3.common.util.GlUtil.GlException glException, long j) {
        this.errorListener.onError(androidx.media3.common.VideoFrameProcessingException.from(glException, j));
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public final void releaseOutputFrame(androidx.media3.common.GlTextureInfo glTextureInfo) {
        this.outputTextureInUse = false;
        this.inputListener.onReadyToAcceptInputFrame();
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public final void signalEndOfCurrentInputStream() {
        this.outputListener.onCurrentOutputStreamEnded();
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public final void flush() {
        this.outputTextureInUse = false;
        this.inputListener.onFlush();
        this.inputListener.onReadyToAcceptInputFrame();
    }

    @Override // androidx.media3.effect.GlShaderProgram
    public void release() throws androidx.media3.common.VideoFrameProcessingException {
        try {
            this.outputTexture.release();
            this.intermediateTexture.release();
            this.functionLutTexture.release();
            this.glProgram.delete();
        } catch (androidx.media3.common.util.GlUtil.GlException e) {
            throw new androidx.media3.common.VideoFrameProcessingException(e);
        }
    }

    private void renderOnePass(int i, boolean z) throws androidx.media3.common.util.GlUtil.GlException {
        int width = z ? this.lastInputSize.getWidth() : this.intermediateSize.getHeight();
        this.glProgram.use();
        this.glProgram.setSamplerTexIdUniform("uTexSampler", i, 0);
        this.glProgram.setIntUniform("uIsHorizontal", z ? 1 : 0);
        float f = width;
        this.glProgram.setFloatUniform("uSourceTexelSize", 1.0f / f);
        this.glProgram.setFloatUniform("uSourceFullSize", f);
        this.glProgram.setFloatUniform("uConvStartTexels", this.functionLutDomainStart);
        this.glProgram.setFloatUniform("uConvWidthTexels", this.functionLutWidth);
        this.glProgram.setFloatUniform("uFunctionLookupStepSize", this.functionLutTexelStep);
        this.glProgram.setFloatsUniform("uFunctionLookupCenter", new float[]{this.functionLutCenterX, 0.5f});
        this.glProgram.setSamplerTexIdUniform("uFunctionLookupSampler", this.functionLutTexture.texId, 1);
        this.glProgram.bindAttributesAndUniforms();
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        androidx.media3.common.util.GlUtil.checkGlError();
    }

    private void renderHorizontal(androidx.media3.common.GlTextureInfo glTextureInfo) throws androidx.media3.common.util.GlUtil.GlException {
        androidx.media3.common.util.GlUtil.focusFramebufferUsingCurrentContext(this.intermediateTexture.fboId, this.intermediateTexture.width, this.intermediateTexture.height);
        androidx.media3.common.util.GlUtil.clearFocusedBuffers();
        renderOnePass(glTextureInfo.texId, true);
    }

    private void renderVertical() throws androidx.media3.common.util.GlUtil.GlException {
        androidx.media3.common.util.GlUtil.focusFramebufferUsingCurrentContext(this.outputTexture.fboId, this.outputTexture.width, this.outputTexture.height);
        androidx.media3.common.util.GlUtil.clearFocusedBuffers();
        renderOnePass(this.intermediateTexture.texId, false);
    }

    private void ensureTexturesAreConfigured(androidx.media3.common.GlObjectsProvider glObjectsProvider, androidx.media3.common.util.Size size, long j) throws androidx.media3.common.util.GlUtil.GlException {
        this.outputSize = this.convolutionFunction1DProvider.configure(size);
        androidx.media3.effect.ConvolutionFunction1D convolution = this.convolutionFunction1DProvider.getConvolution(j);
        if (!convolution.equals(this.lastConvolutionFunction)) {
            updateFunctionTexture(convolution);
            this.lastConvolutionFunction = convolution;
        }
        if (size.equals(this.lastInputSize)) {
            return;
        }
        this.glProgram.setBufferAttribute("aFramePosition", androidx.media3.common.util.GlUtil.getNormalizedCoordinateBounds(), 4);
        float[] fArrCreate4x4IdentityMatrix = androidx.media3.common.util.GlUtil.create4x4IdentityMatrix();
        this.glProgram.setFloatsUniform("uTransformationMatrix", fArrCreate4x4IdentityMatrix);
        this.glProgram.setFloatsUniform("uTexTransformationMatrix", fArrCreate4x4IdentityMatrix);
        androidx.media3.common.util.Size size2 = new androidx.media3.common.util.Size(this.outputSize.getWidth(), size.getHeight());
        this.intermediateSize = size2;
        this.intermediateTexture = configurePixelTexture(glObjectsProvider, this.intermediateTexture, size2);
        this.outputTexture = configurePixelTexture(glObjectsProvider, this.outputTexture, this.outputSize);
        this.lastInputSize = size;
    }

    private void updateFunctionTexture(androidx.media3.effect.ConvolutionFunction1D convolutionFunction1D) throws androidx.media3.common.util.GlUtil.GlException {
        int iCeil = (int) java.lang.Math.ceil((convolutionFunction1D.width() * 5.0f) + 10.0f);
        float f = iCeil;
        this.functionLutTexelStep = 1.0f / (f / 5.0f);
        java.nio.FloatBuffer floatBufferAllocate = java.nio.FloatBuffer.allocate(iCeil);
        float fDomainStart = convolutionFunction1D.domainStart();
        int i = 0;
        int i2 = 0;
        while (i < iCeil) {
            int i3 = i - 5;
            floatBufferAllocate.put(i2, (i3 < 0 || i > iCeil + (-5)) ? 0.0f : convolutionFunction1D.value((i3 * 0.2f) + fDomainStart));
            i++;
            i2++;
        }
        this.functionLutCenterX = (-(fDomainStart - 1.1f)) / (0.2f * f);
        this.functionLutDomainStart = convolutionFunction1D.domainStart();
        this.functionLutWidth = convolutionFunction1D.width();
        if (this.functionLutTexture == androidx.media3.common.GlTextureInfo.UNSET || this.functionLutTexture.width != iCeil) {
            this.functionLutTexture.release();
            this.functionLutTexture = new androidx.media3.common.GlTextureInfo(androidx.media3.common.util.GlUtil.generateTexture(), -1, -1, iCeil, 1);
        }
        androidx.media3.common.util.GlUtil.bindTexture(3553, this.functionLutTexture.texId, 9729);
        android.opengl.GLES20.glTexImage2D(3553, 0, 33325, iCeil, 1, 0, 6403, 5126, floatBufferAllocate);
        androidx.media3.common.util.GlUtil.checkGlError();
    }

    private androidx.media3.common.GlTextureInfo configurePixelTexture(androidx.media3.common.GlObjectsProvider glObjectsProvider, androidx.media3.common.GlTextureInfo glTextureInfo, androidx.media3.common.util.Size size) throws androidx.media3.common.util.GlUtil.GlException {
        if (size.getWidth() == glTextureInfo.width && size.getHeight() == glTextureInfo.height) {
            return glTextureInfo;
        }
        glTextureInfo.release();
        return glObjectsProvider.createBuffersForTexture(androidx.media3.common.util.GlUtil.createTexture(size.getWidth(), size.getHeight(), this.useHdr), size.getWidth(), size.getHeight());
    }

    private static final class SeparableConvolutionWrapper implements androidx.media3.effect.ConvolutionFunction1D.Provider {
        private final float scaleHeight;
        private final float scaleWidth;
        private final androidx.media3.effect.SeparableConvolution separableConvolution;

        public SeparableConvolutionWrapper(androidx.media3.effect.SeparableConvolution separableConvolution, float f, float f2) {
            this.separableConvolution = separableConvolution;
            this.scaleWidth = f;
            this.scaleHeight = f2;
        }

        @Override // androidx.media3.effect.ConvolutionFunction1D.Provider
        public androidx.media3.effect.ConvolutionFunction1D getConvolution(long j) {
            return this.separableConvolution.getConvolution(j);
        }

        @Override // androidx.media3.effect.ConvolutionFunction1D.Provider
        public androidx.media3.common.util.Size configure(androidx.media3.common.util.Size size) {
            return new androidx.media3.common.util.Size((int) (size.getWidth() * this.scaleWidth), (int) (size.getHeight() * this.scaleHeight));
        }
    }
}
