package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
final class InputSwitcher {
    private androidx.media3.effect.TextureManager activeTextureManager;
    private final android.content.Context context;
    private androidx.media3.effect.GlShaderProgram downstreamShaderProgram;
    private final java.util.concurrent.Executor errorListenerExecutor;
    private final boolean experimentalAdjustSurfaceTextureTransformationMatrix;
    private final androidx.media3.common.GlObjectsProvider glObjectsProvider;
    private final android.util.SparseArray<androidx.media3.effect.InputSwitcher.Input> inputs;
    private final androidx.media3.common.ColorInfo outputColorInfo;
    private final androidx.media3.effect.GlShaderProgram.ErrorListener samplingShaderProgramErrorListener;
    private final int sdrWorkingColorSpace;
    private final androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor;

    public InputSwitcher(android.content.Context context, androidx.media3.common.ColorInfo colorInfo, androidx.media3.common.GlObjectsProvider glObjectsProvider, androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor, java.util.concurrent.Executor executor, androidx.media3.effect.GlShaderProgram.ErrorListener errorListener, int i, boolean z, boolean z2, boolean z3) throws androidx.media3.common.VideoFrameProcessingException {
        this.context = context;
        this.outputColorInfo = colorInfo;
        this.glObjectsProvider = glObjectsProvider;
        this.videoFrameProcessingTaskExecutor = videoFrameProcessingTaskExecutor;
        this.errorListenerExecutor = executor;
        this.samplingShaderProgramErrorListener = errorListener;
        android.util.SparseArray<androidx.media3.effect.InputSwitcher.Input> sparseArray = new android.util.SparseArray<>();
        this.inputs = sparseArray;
        this.sdrWorkingColorSpace = i;
        this.experimentalAdjustSurfaceTextureTransformationMatrix = z2;
        sparseArray.put(1, new androidx.media3.effect.InputSwitcher.Input(new androidx.media3.effect.ExternalTextureManager(glObjectsProvider, videoFrameProcessingTaskExecutor, z, z2)));
        sparseArray.put(2, new androidx.media3.effect.InputSwitcher.Input(new androidx.media3.effect.BitmapTextureManager(glObjectsProvider, videoFrameProcessingTaskExecutor, z3)));
        sparseArray.put(3, new androidx.media3.effect.InputSwitcher.Input(new androidx.media3.effect.TexIdTextureManager(glObjectsProvider, videoFrameProcessingTaskExecutor)));
    }

    private androidx.media3.effect.DefaultShaderProgram createSamplingShaderProgram(androidx.media3.common.ColorInfo colorInfo, int i) throws androidx.media3.common.VideoFrameProcessingException {
        androidx.media3.effect.DefaultShaderProgram defaultShaderProgramCreateWithExternalSampler;
        if (i == 1) {
            defaultShaderProgramCreateWithExternalSampler = androidx.media3.effect.DefaultShaderProgram.createWithExternalSampler(this.context, colorInfo, this.outputColorInfo, this.sdrWorkingColorSpace, this.experimentalAdjustSurfaceTextureTransformationMatrix);
        } else if (i == 2 || i == 3) {
            defaultShaderProgramCreateWithExternalSampler = androidx.media3.effect.DefaultShaderProgram.createWithInternalSampler(this.context, colorInfo, this.outputColorInfo, this.sdrWorkingColorSpace, i);
        } else {
            throw new androidx.media3.common.VideoFrameProcessingException("Unsupported input type " + i);
        }
        defaultShaderProgramCreateWithExternalSampler.setErrorListener(this.errorListenerExecutor, this.samplingShaderProgramErrorListener);
        return defaultShaderProgramCreateWithExternalSampler;
    }

    public void setDownstreamShaderProgram(androidx.media3.effect.GlShaderProgram glShaderProgram) {
        this.downstreamShaderProgram = glShaderProgram;
    }

    public void switchToInput(int i, androidx.media3.common.FrameInfo frameInfo) throws androidx.media3.common.VideoFrameProcessingException {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.downstreamShaderProgram);
        androidx.media3.common.util.Assertions.checkState(androidx.media3.common.util.Util.contains(this.inputs, i), "Input type not registered: " + i);
        for (int i2 = 0; i2 < this.inputs.size(); i2++) {
            int iKeyAt = this.inputs.keyAt(i2);
            androidx.media3.effect.InputSwitcher.Input input = this.inputs.get(iKeyAt);
            if (iKeyAt == i) {
                if (input.getInputColorInfo() == null || !frameInfo.colorInfo.equals(input.getInputColorInfo())) {
                    input.setSamplingGlShaderProgram(createSamplingShaderProgram(frameInfo.colorInfo, i));
                    input.setInputColorInfo(frameInfo.colorInfo);
                }
                input.setChainingListener(new androidx.media3.effect.InputSwitcher.GatedChainingListenerWrapper(this.glObjectsProvider, (androidx.media3.effect.GlShaderProgram) androidx.media3.common.util.Assertions.checkNotNull(input.getSamplingGlShaderProgram()), this.downstreamShaderProgram, this.videoFrameProcessingTaskExecutor));
                input.setActive(true);
                this.downstreamShaderProgram.setInputListener((androidx.media3.effect.GlShaderProgram.InputListener) androidx.media3.common.util.Assertions.checkNotNull(input.gatedChainingListenerWrapper));
                this.activeTextureManager = input.textureManager;
            } else {
                input.setActive(false);
            }
        }
        ((androidx.media3.effect.TextureManager) androidx.media3.common.util.Assertions.checkNotNull(this.activeTextureManager)).setInputFrameInfo(frameInfo);
    }

    public boolean hasActiveInput() {
        return this.activeTextureManager != null;
    }

    public androidx.media3.effect.TextureManager activeTextureManager() {
        return (androidx.media3.effect.TextureManager) androidx.media3.common.util.Assertions.checkStateNotNull(this.activeTextureManager);
    }

    public void signalEndOfInputStream() {
        ((androidx.media3.effect.TextureManager) androidx.media3.common.util.Assertions.checkNotNull(this.activeTextureManager)).signalEndOfCurrentInputStream();
    }

    public android.view.Surface getInputSurface() {
        androidx.media3.common.util.Assertions.checkState(androidx.media3.common.util.Util.contains(this.inputs, 1));
        return this.inputs.get(1).textureManager.getInputSurface();
    }

    public void setInputDefaultBufferSize(int i, int i2) {
        androidx.media3.common.util.Assertions.checkState(androidx.media3.common.util.Util.contains(this.inputs, 1));
        this.inputs.get(1).textureManager.setDefaultBufferSize(i, i2);
    }

    public void setOnInputFrameProcessedListener(androidx.media3.common.OnInputFrameProcessedListener onInputFrameProcessedListener) {
        androidx.media3.common.util.Assertions.checkState(androidx.media3.common.util.Util.contains(this.inputs, 3));
        this.inputs.get(3).textureManager.setOnInputFrameProcessedListener(onInputFrameProcessedListener);
    }

    public void release() throws androidx.media3.common.VideoFrameProcessingException {
        for (int i = 0; i < this.inputs.size(); i++) {
            android.util.SparseArray<androidx.media3.effect.InputSwitcher.Input> sparseArray = this.inputs;
            sparseArray.get(sparseArray.keyAt(i)).release();
        }
    }

    private static final class Input {
        private androidx.media3.effect.InputSwitcher.GatedChainingListenerWrapper gatedChainingListenerWrapper;
        private androidx.media3.common.ColorInfo inputColorInfo;
        private androidx.media3.effect.ExternalShaderProgram samplingGlShaderProgram;
        public final androidx.media3.effect.TextureManager textureManager;

        public Input(androidx.media3.effect.TextureManager textureManager) {
            this.textureManager = textureManager;
        }

        public void setSamplingGlShaderProgram(androidx.media3.effect.ExternalShaderProgram externalShaderProgram) throws androidx.media3.common.VideoFrameProcessingException {
            androidx.media3.effect.ExternalShaderProgram externalShaderProgram2 = this.samplingGlShaderProgram;
            if (externalShaderProgram2 != null) {
                externalShaderProgram2.release();
            }
            this.samplingGlShaderProgram = externalShaderProgram;
            this.textureManager.setSamplingGlShaderProgram(externalShaderProgram);
            externalShaderProgram.setInputListener(this.textureManager);
        }

        public void setInputColorInfo(androidx.media3.common.ColorInfo colorInfo) {
            this.inputColorInfo = colorInfo;
        }

        public void setChainingListener(androidx.media3.effect.InputSwitcher.GatedChainingListenerWrapper gatedChainingListenerWrapper) {
            this.gatedChainingListenerWrapper = gatedChainingListenerWrapper;
            ((androidx.media3.effect.ExternalShaderProgram) androidx.media3.common.util.Assertions.checkNotNull(this.samplingGlShaderProgram)).setOutputListener(gatedChainingListenerWrapper);
        }

        public androidx.media3.effect.ExternalShaderProgram getSamplingGlShaderProgram() {
            return this.samplingGlShaderProgram;
        }

        public androidx.media3.common.ColorInfo getInputColorInfo() {
            return this.inputColorInfo;
        }

        public void setActive(boolean z) {
            androidx.media3.effect.InputSwitcher.GatedChainingListenerWrapper gatedChainingListenerWrapper = this.gatedChainingListenerWrapper;
            if (gatedChainingListenerWrapper == null) {
                return;
            }
            gatedChainingListenerWrapper.setActive(z);
        }

        public void release() throws androidx.media3.common.VideoFrameProcessingException {
            this.textureManager.release();
            androidx.media3.effect.ExternalShaderProgram externalShaderProgram = this.samplingGlShaderProgram;
            if (externalShaderProgram != null) {
                externalShaderProgram.release();
            }
        }
    }

    private static final class GatedChainingListenerWrapper implements androidx.media3.effect.GlShaderProgram.OutputListener, androidx.media3.effect.GlShaderProgram.InputListener {
        private final androidx.media3.effect.ChainingGlShaderProgramListener chainingGlShaderProgramListener;
        private boolean isActive;

        public GatedChainingListenerWrapper(androidx.media3.common.GlObjectsProvider glObjectsProvider, androidx.media3.effect.GlShaderProgram glShaderProgram, androidx.media3.effect.GlShaderProgram glShaderProgram2, androidx.media3.effect.VideoFrameProcessingTaskExecutor videoFrameProcessingTaskExecutor) {
            this.chainingGlShaderProgramListener = new androidx.media3.effect.ChainingGlShaderProgramListener(glObjectsProvider, glShaderProgram, glShaderProgram2, videoFrameProcessingTaskExecutor);
        }

        @Override // androidx.media3.effect.GlShaderProgram.InputListener
        public void onReadyToAcceptInputFrame() {
            if (this.isActive) {
                this.chainingGlShaderProgramListener.onReadyToAcceptInputFrame();
            }
        }

        @Override // androidx.media3.effect.GlShaderProgram.InputListener
        public void onInputFrameProcessed(androidx.media3.common.GlTextureInfo glTextureInfo) {
            if (this.isActive) {
                this.chainingGlShaderProgramListener.onInputFrameProcessed(glTextureInfo);
            }
        }

        @Override // androidx.media3.effect.GlShaderProgram.InputListener
        public synchronized void onFlush() {
            if (this.isActive) {
                this.chainingGlShaderProgramListener.onFlush();
            }
        }

        @Override // androidx.media3.effect.GlShaderProgram.OutputListener
        public synchronized void onOutputFrameAvailable(androidx.media3.common.GlTextureInfo glTextureInfo, long j) {
            if (this.isActive) {
                this.chainingGlShaderProgramListener.onOutputFrameAvailable(glTextureInfo, j);
            }
        }

        @Override // androidx.media3.effect.GlShaderProgram.OutputListener
        public synchronized void onCurrentOutputStreamEnded() {
            if (this.isActive) {
                this.chainingGlShaderProgramListener.onCurrentOutputStreamEnded();
            }
        }

        public void setActive(boolean z) {
            this.isActive = z;
        }
    }
}
