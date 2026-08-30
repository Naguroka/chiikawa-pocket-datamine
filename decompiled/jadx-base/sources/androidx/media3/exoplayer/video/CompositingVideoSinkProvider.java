package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public final class CompositingVideoSinkProvider implements androidx.media3.exoplayer.video.VideoSinkProvider, androidx.media3.common.VideoGraph.Listener {
    private static final java.util.concurrent.Executor NO_OP_EXECUTOR = new java.util.concurrent.Executor() { // from class: androidx.media3.exoplayer.video.CompositingVideoSinkProvider$$ExternalSyntheticLambda2
        @Override // java.util.concurrent.Executor
        public final void execute(java.lang.Runnable runnable) {
            androidx.media3.exoplayer.video.CompositingVideoSinkProvider.lambda$static$0(runnable);
        }
    };
    private static final int STATE_CREATED = 0;
    private static final int STATE_INITIALIZED = 1;
    private static final int STATE_RELEASED = 2;
    private long bufferTimestampAdjustmentUs;
    private final androidx.media3.common.util.Clock clock;
    private final android.content.Context context;
    private android.util.Pair<android.view.Surface, androidx.media3.common.util.Size> currentSurfaceAndSize;
    private androidx.media3.common.util.HandlerWrapper handler;
    private final java.util.concurrent.CopyOnWriteArraySet<androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener> listeners;
    private androidx.media3.common.Format outputFormat;
    private int pendingFlushCount;
    private final androidx.media3.common.PreviewingVideoGraph.Factory previewingVideoGraphFactory;
    private int state;
    private androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener;
    private final androidx.media3.exoplayer.video.VideoFrameReleaseControl videoFrameReleaseControl;
    private final androidx.media3.exoplayer.video.VideoFrameRenderControl videoFrameRenderControl;
    private androidx.media3.common.PreviewingVideoGraph videoGraph;
    private final androidx.media3.exoplayer.video.CompositingVideoSinkProvider.VideoSinkImpl videoSinkImpl;

    public interface Listener {
        void onError(androidx.media3.exoplayer.video.CompositingVideoSinkProvider compositingVideoSinkProvider, androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException);

        void onFirstFrameRendered(androidx.media3.exoplayer.video.CompositingVideoSinkProvider compositingVideoSinkProvider);

        void onFrameDropped(androidx.media3.exoplayer.video.CompositingVideoSinkProvider compositingVideoSinkProvider);

        void onVideoSizeChanged(androidx.media3.exoplayer.video.CompositingVideoSinkProvider compositingVideoSinkProvider, androidx.media3.common.VideoSize videoSize);
    }

    static /* synthetic */ void lambda$static$0(java.lang.Runnable runnable) {
    }

    public static final class Builder {
        private boolean built;
        private androidx.media3.common.util.Clock clock = androidx.media3.common.util.Clock.DEFAULT;
        private final android.content.Context context;
        private androidx.media3.common.PreviewingVideoGraph.Factory previewingVideoGraphFactory;
        private androidx.media3.common.VideoFrameProcessor.Factory videoFrameProcessorFactory;
        private final androidx.media3.exoplayer.video.VideoFrameReleaseControl videoFrameReleaseControl;

        public Builder(android.content.Context context, androidx.media3.exoplayer.video.VideoFrameReleaseControl videoFrameReleaseControl) {
            this.context = context.getApplicationContext();
            this.videoFrameReleaseControl = videoFrameReleaseControl;
        }

        public androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Builder setVideoFrameProcessorFactory(androidx.media3.common.VideoFrameProcessor.Factory factory) {
            this.videoFrameProcessorFactory = factory;
            return this;
        }

        public androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Builder setPreviewingVideoGraphFactory(androidx.media3.common.PreviewingVideoGraph.Factory factory) {
            this.previewingVideoGraphFactory = factory;
            return this;
        }

        public androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Builder setClock(androidx.media3.common.util.Clock clock) {
            this.clock = clock;
            return this;
        }

        public androidx.media3.exoplayer.video.CompositingVideoSinkProvider build() {
            androidx.media3.common.util.Assertions.checkState(!this.built);
            if (this.previewingVideoGraphFactory == null) {
                if (this.videoFrameProcessorFactory == null) {
                    this.videoFrameProcessorFactory = new androidx.media3.exoplayer.video.CompositingVideoSinkProvider.ReflectiveDefaultVideoFrameProcessorFactory();
                }
                this.previewingVideoGraphFactory = new androidx.media3.exoplayer.video.CompositingVideoSinkProvider.ReflectivePreviewingSingleInputVideoGraphFactory(this.videoFrameProcessorFactory);
            }
            androidx.media3.exoplayer.video.CompositingVideoSinkProvider compositingVideoSinkProvider = new androidx.media3.exoplayer.video.CompositingVideoSinkProvider(this);
            this.built = true;
            return compositingVideoSinkProvider;
        }
    }

    private CompositingVideoSinkProvider(androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Builder builder) {
        android.content.Context context = builder.context;
        this.context = context;
        androidx.media3.exoplayer.video.CompositingVideoSinkProvider.VideoSinkImpl videoSinkImpl = new androidx.media3.exoplayer.video.CompositingVideoSinkProvider.VideoSinkImpl(context);
        this.videoSinkImpl = videoSinkImpl;
        androidx.media3.common.util.Clock clock = builder.clock;
        this.clock = clock;
        androidx.media3.exoplayer.video.VideoFrameReleaseControl videoFrameReleaseControl = builder.videoFrameReleaseControl;
        this.videoFrameReleaseControl = videoFrameReleaseControl;
        videoFrameReleaseControl.setClock(clock);
        this.videoFrameRenderControl = new androidx.media3.exoplayer.video.VideoFrameRenderControl(new androidx.media3.exoplayer.video.CompositingVideoSinkProvider.FrameRendererImpl(), videoFrameReleaseControl);
        this.previewingVideoGraphFactory = (androidx.media3.common.PreviewingVideoGraph.Factory) androidx.media3.common.util.Assertions.checkStateNotNull(builder.previewingVideoGraphFactory);
        this.listeners = new java.util.concurrent.CopyOnWriteArraySet<>();
        this.state = 0;
        addListener(videoSinkImpl);
    }

    public void addListener(androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener listener) {
        this.listeners.add(listener);
    }

    public void removeListener(androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener listener) {
        this.listeners.remove(listener);
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public androidx.media3.exoplayer.video.VideoFrameReleaseControl getVideoFrameReleaseControl() {
        return this.videoFrameReleaseControl;
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public androidx.media3.exoplayer.video.VideoSink getSink() {
        return this.videoSinkImpl;
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void setOutputSurfaceInfo(android.view.Surface surface, androidx.media3.common.util.Size size) {
        android.util.Pair<android.view.Surface, androidx.media3.common.util.Size> pair = this.currentSurfaceAndSize;
        if (pair != null && ((android.view.Surface) pair.first).equals(surface) && ((androidx.media3.common.util.Size) this.currentSurfaceAndSize.second).equals(size)) {
            return;
        }
        this.currentSurfaceAndSize = android.util.Pair.create(surface, size);
        maybeSetOutputSurfaceInfo(surface, size.getWidth(), size.getHeight());
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void clearOutputSurfaceInfo() {
        maybeSetOutputSurfaceInfo(null, androidx.media3.common.util.Size.UNKNOWN.getWidth(), androidx.media3.common.util.Size.UNKNOWN.getHeight());
        this.currentSurfaceAndSize = null;
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void release() {
        if (this.state == 2) {
            return;
        }
        androidx.media3.common.util.HandlerWrapper handlerWrapper = this.handler;
        if (handlerWrapper != null) {
            handlerWrapper.removeCallbacksAndMessages(null);
        }
        androidx.media3.common.PreviewingVideoGraph previewingVideoGraph = this.videoGraph;
        if (previewingVideoGraph != null) {
            previewingVideoGraph.release();
        }
        this.currentSurfaceAndSize = null;
        this.state = 2;
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onOutputSizeChanged(int i, int i2) {
        this.videoFrameRenderControl.onOutputSizeChanged(i, i2);
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onOutputFrameAvailableForRendering(long j) {
        if (this.pendingFlushCount > 0) {
            return;
        }
        this.videoFrameRenderControl.onOutputFrameAvailableForRendering(j - this.bufferTimestampAdjustmentUs);
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onEnded(long j) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onError(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
        java.util.Iterator<androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onError(this, videoFrameProcessingException);
        }
    }

    public void render(long j, long j2) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (this.pendingFlushCount == 0) {
            this.videoFrameRenderControl.render(j, j2);
        }
    }

    public android.view.Surface getOutputSurface() {
        android.util.Pair<android.view.Surface, androidx.media3.common.util.Size> pair = this.currentSurfaceAndSize;
        if (pair != null) {
            return (android.view.Surface) pair.first;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public androidx.media3.common.VideoFrameProcessor initialize(androidx.media3.common.Format format) throws androidx.media3.exoplayer.video.VideoSink.VideoSinkException {
        androidx.media3.common.util.Assertions.checkState(this.state == 0);
        androidx.media3.common.ColorInfo adjustedInputColorInfo = getAdjustedInputColorInfo(format.colorInfo);
        if (adjustedInputColorInfo.colorTransfer == 7 && androidx.media3.common.util.Util.SDK_INT < 34) {
            adjustedInputColorInfo = adjustedInputColorInfo.buildUpon().setColorTransfer(6).build();
        }
        androidx.media3.common.ColorInfo colorInfo = adjustedInputColorInfo;
        this.handler = this.clock.createHandler((android.os.Looper) androidx.media3.common.util.Assertions.checkStateNotNull(android.os.Looper.myLooper()), null);
        try {
            androidx.media3.common.PreviewingVideoGraph.Factory factory = this.previewingVideoGraphFactory;
            android.content.Context context = this.context;
            androidx.media3.common.DebugViewProvider debugViewProvider = androidx.media3.common.DebugViewProvider.NONE;
            androidx.media3.common.util.HandlerWrapper handlerWrapper = this.handler;
            java.util.Objects.requireNonNull(handlerWrapper);
            this.videoGraph = factory.create(context, colorInfo, debugViewProvider, this, new androidx.media3.exoplayer.video.CompositingVideoSinkProvider$$ExternalSyntheticLambda0(handlerWrapper), com.google.common.collect.ImmutableList.of(), 0L);
            android.util.Pair<android.view.Surface, androidx.media3.common.util.Size> pair = this.currentSurfaceAndSize;
            if (pair != null) {
                android.view.Surface surface = (android.view.Surface) pair.first;
                androidx.media3.common.util.Size size = (androidx.media3.common.util.Size) this.currentSurfaceAndSize.second;
                maybeSetOutputSurfaceInfo(surface, size.getWidth(), size.getHeight());
            }
            this.videoGraph.registerInput(0);
            this.state = 1;
            return this.videoGraph.getProcessor(0);
        } catch (androidx.media3.common.VideoFrameProcessingException e) {
            throw new androidx.media3.exoplayer.video.VideoSink.VideoSinkException(e, format);
        }
    }

    private boolean isInitialized() {
        return this.state == 1;
    }

    private void maybeSetOutputSurfaceInfo(android.view.Surface surface, int i, int i2) {
        if (this.videoGraph != null) {
            this.videoGraph.setOutputSurfaceInfo(surface != null ? new androidx.media3.common.SurfaceInfo(surface, i, i2) : null);
            this.videoFrameReleaseControl.setOutputSurface(surface);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isReady() {
        return this.pendingFlushCount == 0 && this.videoFrameRenderControl.isReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasReleasedFrame(long j) {
        return this.pendingFlushCount == 0 && this.videoFrameRenderControl.hasReleasedFrame(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flush() {
        if (isInitialized()) {
            this.pendingFlushCount++;
            this.videoFrameRenderControl.flush();
            ((androidx.media3.common.util.HandlerWrapper) androidx.media3.common.util.Assertions.checkStateNotNull(this.handler)).post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.video.CompositingVideoSinkProvider$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.flushInternal();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flushInternal() {
        int i = this.pendingFlushCount - 1;
        this.pendingFlushCount = i;
        if (i > 0) {
            return;
        }
        if (i < 0) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(this.pendingFlushCount));
        }
        this.videoFrameRenderControl.flush();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoFrameMetadataListener(androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener) {
        this.videoFrameMetadataListener = videoFrameMetadataListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        this.videoFrameRenderControl.setPlaybackSpeed(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onStreamOffsetChange(long j, long j2, long j3) {
        this.bufferTimestampAdjustmentUs = j;
        this.videoFrameRenderControl.onStreamOffsetChange(j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static androidx.media3.common.ColorInfo getAdjustedInputColorInfo(androidx.media3.common.ColorInfo colorInfo) {
        return (colorInfo == null || !colorInfo.isDataSpaceValid()) ? androidx.media3.common.ColorInfo.SDR_BT709_LIMITED : colorInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class VideoSinkImpl implements androidx.media3.exoplayer.video.VideoSink, androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener {
        private final android.content.Context context;
        private boolean hasRegisteredFirstInputStream;
        private long inputBufferTimestampAdjustmentUs;
        private androidx.media3.common.Format inputFormat;
        private long inputStreamOffsetUs;
        private int inputType;
        private long pendingInputStreamBufferPresentationTimeUs;
        private boolean pendingInputStreamOffsetChange;
        private androidx.media3.common.Effect rotationEffect;
        private androidx.media3.common.VideoFrameProcessor videoFrameProcessor;
        private final int videoFrameProcessorMaxPendingFrameCount;
        private final java.util.ArrayList<androidx.media3.common.Effect> videoEffects = new java.util.ArrayList<>();
        private long finalBufferPresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
        private long lastBufferPresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
        private androidx.media3.exoplayer.video.VideoSink.Listener listener = androidx.media3.exoplayer.video.VideoSink.Listener.NO_OP;
        private java.util.concurrent.Executor listenerExecutor = androidx.media3.exoplayer.video.CompositingVideoSinkProvider.NO_OP_EXECUTOR;

        public VideoSinkImpl(android.content.Context context) {
            this.context = context;
            this.videoFrameProcessorMaxPendingFrameCount = androidx.media3.common.util.Util.getMaxPendingFramesCountForMediaCodecDecoders(context);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void onRendererEnabled(boolean z) {
            androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.videoFrameReleaseControl.onEnabled(z);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void onRendererDisabled() {
            androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.videoFrameReleaseControl.onDisabled();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void onRendererStarted() {
            androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.videoFrameReleaseControl.onStarted();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void onRendererStopped() {
            androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.videoFrameReleaseControl.onStopped();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setListener(androidx.media3.exoplayer.video.VideoSink.Listener listener, java.util.concurrent.Executor executor) {
            this.listener = listener;
            this.listenerExecutor = executor;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void initialize(androidx.media3.common.Format format) throws androidx.media3.exoplayer.video.VideoSink.VideoSinkException {
            androidx.media3.common.util.Assertions.checkState(!isInitialized());
            this.videoFrameProcessor = androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.initialize(format);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"videoFrameProcessor"}, result = true)
        public boolean isInitialized() {
            return this.videoFrameProcessor != null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void flush(boolean z) {
            if (isInitialized()) {
                this.videoFrameProcessor.flush();
            }
            this.hasRegisteredFirstInputStream = false;
            this.finalBufferPresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
            this.lastBufferPresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
            androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.flush();
            if (z) {
                androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.videoFrameReleaseControl.reset();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isReady() {
            return isInitialized() && androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.isReady();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isEnded() {
            if (isInitialized()) {
                long j = this.finalBufferPresentationTimeUs;
                if (j != androidx.media3.common.C.TIME_UNSET && androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.hasReleasedFrame(j)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void registerInputStream(int i, androidx.media3.common.Format format) {
            androidx.media3.common.Format format2;
            androidx.media3.common.util.Assertions.checkState(isInitialized());
            if (i == 1 || i == 2) {
                androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.videoFrameReleaseControl.setFrameRate(format.frameRate);
                if (i == 1 && androidx.media3.common.util.Util.SDK_INT < 21 && format.rotationDegrees != -1 && format.rotationDegrees != 0) {
                    if (this.rotationEffect == null || (format2 = this.inputFormat) == null || format2.rotationDegrees != format.rotationDegrees) {
                        this.rotationEffect = androidx.media3.exoplayer.video.CompositingVideoSinkProvider.ScaleAndRotateAccessor.createRotationEffect(format.rotationDegrees);
                    }
                } else {
                    this.rotationEffect = null;
                }
                this.inputType = i;
                this.inputFormat = format;
                if (!this.hasRegisteredFirstInputStream) {
                    maybeRegisterInputStream();
                    this.hasRegisteredFirstInputStream = true;
                    this.pendingInputStreamBufferPresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
                    return;
                } else {
                    androidx.media3.common.util.Assertions.checkState(this.lastBufferPresentationTimeUs != androidx.media3.common.C.TIME_UNSET);
                    this.pendingInputStreamBufferPresentationTimeUs = this.lastBufferPresentationTimeUs;
                    return;
                }
            }
            throw new java.lang.UnsupportedOperationException("Unsupported input type " + i);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isFrameDropAllowedOnInput() {
            return androidx.media3.common.util.Util.isFrameDropAllowedOnSurfaceInput(this.context);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public android.view.Surface getInputSurface() {
            androidx.media3.common.util.Assertions.checkState(isInitialized());
            return ((androidx.media3.common.VideoFrameProcessor) androidx.media3.common.util.Assertions.checkStateNotNull(this.videoFrameProcessor)).getInputSurface();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setVideoFrameMetadataListener(androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener) {
            androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.setVideoFrameMetadataListener(videoFrameMetadataListener);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setPlaybackSpeed(float f) {
            androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.setPlaybackSpeed(f);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setVideoEffects(java.util.List<androidx.media3.common.Effect> list) {
            if (this.videoEffects.equals(list)) {
                return;
            }
            setPendingVideoEffects(list);
            maybeRegisterInputStream();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setPendingVideoEffects(java.util.List<androidx.media3.common.Effect> list) {
            this.videoEffects.clear();
            this.videoEffects.addAll(list);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setStreamOffsetAndAdjustmentUs(long j, long j2) {
            this.pendingInputStreamOffsetChange |= (this.inputStreamOffsetUs == j && this.inputBufferTimestampAdjustmentUs == j2) ? false : true;
            this.inputStreamOffsetUs = j;
            this.inputBufferTimestampAdjustmentUs = j2;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setOutputSurfaceInfo(android.view.Surface surface, androidx.media3.common.util.Size size) {
            androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.setOutputSurfaceInfo(surface, size);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void clearOutputSurfaceInfo() {
            androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.clearOutputSurfaceInfo();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void enableMayRenderStartOfStream() {
            androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.videoFrameReleaseControl.allowReleaseFirstFrameBeforeStarted();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public long registerInputFrame(long j, boolean z) {
            androidx.media3.common.util.Assertions.checkState(isInitialized());
            androidx.media3.common.util.Assertions.checkState(this.videoFrameProcessorMaxPendingFrameCount != -1);
            long j2 = this.pendingInputStreamBufferPresentationTimeUs;
            if (j2 != androidx.media3.common.C.TIME_UNSET) {
                if (!androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.hasReleasedFrame(j2)) {
                    return androidx.media3.common.C.TIME_UNSET;
                }
                maybeRegisterInputStream();
                this.pendingInputStreamBufferPresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
            }
            if (((androidx.media3.common.VideoFrameProcessor) androidx.media3.common.util.Assertions.checkStateNotNull(this.videoFrameProcessor)).getPendingInputFrameCount() >= this.videoFrameProcessorMaxPendingFrameCount || !((androidx.media3.common.VideoFrameProcessor) androidx.media3.common.util.Assertions.checkStateNotNull(this.videoFrameProcessor)).registerInputFrame()) {
                return androidx.media3.common.C.TIME_UNSET;
            }
            long j3 = j - this.inputBufferTimestampAdjustmentUs;
            maybeSetStreamOffsetChange(j3);
            this.lastBufferPresentationTimeUs = j3;
            if (z) {
                this.finalBufferPresentationTimeUs = j3;
            }
            return j * 1000;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean queueBitmap(android.graphics.Bitmap bitmap, androidx.media3.common.util.TimestampIterator timestampIterator) {
            androidx.media3.common.util.Assertions.checkState(isInitialized());
            if (!maybeRegisterPendingInputStream() || !((androidx.media3.common.VideoFrameProcessor) androidx.media3.common.util.Assertions.checkStateNotNull(this.videoFrameProcessor)).queueInputBitmap(bitmap, timestampIterator)) {
                return false;
            }
            androidx.media3.common.util.TimestampIterator timestampIteratorCopyOf = timestampIterator.copyOf();
            long next = timestampIteratorCopyOf.next();
            long lastTimestampUs = timestampIteratorCopyOf.getLastTimestampUs() - this.inputBufferTimestampAdjustmentUs;
            androidx.media3.common.util.Assertions.checkState(lastTimestampUs != androidx.media3.common.C.TIME_UNSET);
            maybeSetStreamOffsetChange(next);
            this.lastBufferPresentationTimeUs = lastTimestampUs;
            this.finalBufferPresentationTimeUs = lastTimestampUs;
            return true;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void render(long j, long j2) throws androidx.media3.exoplayer.video.VideoSink.VideoSinkException {
            try {
                androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.render(j, j2);
            } catch (androidx.media3.exoplayer.ExoPlaybackException e) {
                androidx.media3.common.Format formatBuild = this.inputFormat;
                if (formatBuild == null) {
                    formatBuild = new androidx.media3.common.Format.Builder().build();
                }
                throw new androidx.media3.exoplayer.video.VideoSink.VideoSinkException(e, formatBuild);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void release() {
            androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.release();
        }

        private void maybeSetStreamOffsetChange(long j) {
            if (this.pendingInputStreamOffsetChange) {
                androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.onStreamOffsetChange(this.inputBufferTimestampAdjustmentUs, j, this.inputStreamOffsetUs);
                this.pendingInputStreamOffsetChange = false;
            }
        }

        private boolean maybeRegisterPendingInputStream() {
            long j = this.pendingInputStreamBufferPresentationTimeUs;
            if (j == androidx.media3.common.C.TIME_UNSET) {
                return true;
            }
            if (!androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.hasReleasedFrame(j)) {
                return false;
            }
            maybeRegisterInputStream();
            this.pendingInputStreamBufferPresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
            return true;
        }

        private void maybeRegisterInputStream() {
            if (this.inputFormat == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            androidx.media3.common.Effect effect = this.rotationEffect;
            if (effect != null) {
                arrayList.add(effect);
            }
            arrayList.addAll(this.videoEffects);
            androidx.media3.common.Format format = (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.inputFormat);
            ((androidx.media3.common.VideoFrameProcessor) androidx.media3.common.util.Assertions.checkStateNotNull(this.videoFrameProcessor)).registerInputStream(this.inputType, arrayList, new androidx.media3.common.FrameInfo.Builder(androidx.media3.exoplayer.video.CompositingVideoSinkProvider.getAdjustedInputColorInfo(format.colorInfo), format.width, format.height).setPixelWidthHeightRatio(format.pixelWidthHeightRatio).build());
            this.finalBufferPresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
        }

        @Override // androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener
        public void onFirstFrameRendered(androidx.media3.exoplayer.video.CompositingVideoSinkProvider compositingVideoSinkProvider) {
            final androidx.media3.exoplayer.video.VideoSink.Listener listener = this.listener;
            this.listenerExecutor.execute(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.video.CompositingVideoSinkProvider$VideoSinkImpl$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m207x348684b(listener);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onFirstFrameRendered$0$androidx-media3-exoplayer-video-CompositingVideoSinkProvider$VideoSinkImpl, reason: not valid java name */
        /* synthetic */ void m207x348684b(androidx.media3.exoplayer.video.VideoSink.Listener listener) {
            listener.onFirstFrameRendered(this);
        }

        @Override // androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener
        public void onFrameDropped(androidx.media3.exoplayer.video.CompositingVideoSinkProvider compositingVideoSinkProvider) {
            final androidx.media3.exoplayer.video.VideoSink.Listener listener = this.listener;
            this.listenerExecutor.execute(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.video.CompositingVideoSinkProvider$VideoSinkImpl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m208x461c6929(listener);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onFrameDropped$1$androidx-media3-exoplayer-video-CompositingVideoSinkProvider$VideoSinkImpl, reason: not valid java name */
        /* synthetic */ void m208x461c6929(androidx.media3.exoplayer.video.VideoSink.Listener listener) {
            listener.onFrameDropped((androidx.media3.exoplayer.video.VideoSink) androidx.media3.common.util.Assertions.checkStateNotNull(this));
        }

        @Override // androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener
        public void onVideoSizeChanged(androidx.media3.exoplayer.video.CompositingVideoSinkProvider compositingVideoSinkProvider, final androidx.media3.common.VideoSize videoSize) {
            final androidx.media3.exoplayer.video.VideoSink.Listener listener = this.listener;
            this.listenerExecutor.execute(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.video.CompositingVideoSinkProvider$VideoSinkImpl$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m209xf251aa43(listener, videoSize);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onVideoSizeChanged$2$androidx-media3-exoplayer-video-CompositingVideoSinkProvider$VideoSinkImpl, reason: not valid java name */
        /* synthetic */ void m209xf251aa43(androidx.media3.exoplayer.video.VideoSink.Listener listener, androidx.media3.common.VideoSize videoSize) {
            listener.onVideoSizeChanged(this, videoSize);
        }

        @Override // androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener
        public void onError(androidx.media3.exoplayer.video.CompositingVideoSinkProvider compositingVideoSinkProvider, final androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
            final androidx.media3.exoplayer.video.VideoSink.Listener listener = this.listener;
            this.listenerExecutor.execute(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.video.CompositingVideoSinkProvider$VideoSinkImpl$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m206x1676cf0a(listener, videoFrameProcessingException);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onError$3$androidx-media3-exoplayer-video-CompositingVideoSinkProvider$VideoSinkImpl, reason: not valid java name */
        /* synthetic */ void m206x1676cf0a(androidx.media3.exoplayer.video.VideoSink.Listener listener, androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
            listener.onError(this, new androidx.media3.exoplayer.video.VideoSink.VideoSinkException(videoFrameProcessingException, (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkStateNotNull(this.inputFormat)));
        }
    }

    private final class FrameRendererImpl implements androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer {
        private FrameRendererImpl() {
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer
        public void onVideoSizeChanged(androidx.media3.common.VideoSize videoSize) {
            androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.outputFormat = new androidx.media3.common.Format.Builder().setWidth(videoSize.width).setHeight(videoSize.height).setSampleMimeType(androidx.media3.common.MimeTypes.VIDEO_RAW).build();
            java.util.Iterator it = androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.listeners.iterator();
            while (it.hasNext()) {
                ((androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener) it.next()).onVideoSizeChanged(androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this, videoSize);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer
        public void renderFrame(long j, long j2, long j3, boolean z) {
            if (z && androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.currentSurfaceAndSize != null) {
                java.util.Iterator it = androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.listeners.iterator();
                while (it.hasNext()) {
                    ((androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener) it.next()).onFirstFrameRendered(androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this);
                }
            }
            if (androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.videoFrameMetadataListener != null) {
                androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j2, androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.clock.nanoTime(), androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.outputFormat == null ? new androidx.media3.common.Format.Builder().build() : androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.outputFormat, null);
            }
            ((androidx.media3.common.PreviewingVideoGraph) androidx.media3.common.util.Assertions.checkStateNotNull(androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.videoGraph)).renderOutputFrame(j);
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer
        public void dropFrame() {
            java.util.Iterator it = androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.listeners.iterator();
            while (it.hasNext()) {
                ((androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Listener) it.next()).onFrameDropped(androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this);
            }
            ((androidx.media3.common.PreviewingVideoGraph) androidx.media3.common.util.Assertions.checkStateNotNull(androidx.media3.exoplayer.video.CompositingVideoSinkProvider.this.videoGraph)).renderOutputFrame(-2L);
        }
    }

    private static final class ReflectivePreviewingSingleInputVideoGraphFactory implements androidx.media3.common.PreviewingVideoGraph.Factory {
        private final androidx.media3.common.VideoFrameProcessor.Factory videoFrameProcessorFactory;

        public ReflectivePreviewingSingleInputVideoGraphFactory(androidx.media3.common.VideoFrameProcessor.Factory factory) {
            this.videoFrameProcessorFactory = factory;
        }

        @Override // androidx.media3.common.PreviewingVideoGraph.Factory
        public androidx.media3.common.PreviewingVideoGraph create(android.content.Context context, androidx.media3.common.ColorInfo colorInfo, androidx.media3.common.DebugViewProvider debugViewProvider, androidx.media3.common.VideoGraph.Listener listener, java.util.concurrent.Executor executor, java.util.List<androidx.media3.common.Effect> list, long j) throws androidx.media3.common.VideoFrameProcessingException {
            try {
                java.lang.reflect.Constructor<?> constructor = java.lang.Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(androidx.media3.common.VideoFrameProcessor.Factory.class);
                java.lang.Object[] objArr = new java.lang.Object[1];
                try {
                    objArr[0] = this.videoFrameProcessorFactory;
                    return ((androidx.media3.common.PreviewingVideoGraph.Factory) constructor.newInstance(objArr)).create(context, colorInfo, debugViewProvider, listener, executor, list, j);
                } catch (java.lang.Exception e) {
                    e = e;
                    throw androidx.media3.common.VideoFrameProcessingException.from(e);
                }
            } catch (java.lang.Exception e2) {
                e = e2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class ReflectiveDefaultVideoFrameProcessorFactory implements androidx.media3.common.VideoFrameProcessor.Factory {
        private static final com.google.common.base.Supplier<androidx.media3.common.VideoFrameProcessor.Factory> VIDEO_FRAME_PROCESSOR_FACTORY_SUPPLIER = com.google.common.base.Suppliers.memoize(new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.video.CompositingVideoSinkProvider$ReflectiveDefaultVideoFrameProcessorFactory$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return androidx.media3.exoplayer.video.CompositingVideoSinkProvider.ReflectiveDefaultVideoFrameProcessorFactory.lambda$static$0();
            }
        });

        private ReflectiveDefaultVideoFrameProcessorFactory() {
        }

        static /* synthetic */ androidx.media3.common.VideoFrameProcessor.Factory lambda$static$0() {
            try {
                java.lang.Class<?> cls = java.lang.Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                return (androidx.media3.common.VideoFrameProcessor.Factory) androidx.media3.common.util.Assertions.checkNotNull(cls.getMethod("build", new java.lang.Class[0]).invoke(cls.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]), new java.lang.Object[0]));
            } catch (java.lang.Exception e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Factory
        public androidx.media3.common.VideoFrameProcessor create(android.content.Context context, androidx.media3.common.DebugViewProvider debugViewProvider, androidx.media3.common.ColorInfo colorInfo, boolean z, java.util.concurrent.Executor executor, androidx.media3.common.VideoFrameProcessor.Listener listener) throws androidx.media3.common.VideoFrameProcessingException {
            return VIDEO_FRAME_PROCESSOR_FACTORY_SUPPLIER.get().create(context, debugViewProvider, colorInfo, z, executor, listener);
        }
    }

    private static final class ScaleAndRotateAccessor {
        private static java.lang.reflect.Method buildScaleAndRotateTransformationMethod;
        private static java.lang.reflect.Constructor<?> scaleAndRotateTransformationBuilderConstructor;
        private static java.lang.reflect.Method setRotationMethod;

        private ScaleAndRotateAccessor() {
        }

        public static androidx.media3.common.Effect createRotationEffect(float f) {
            try {
                prepare();
                java.lang.Object objNewInstance = scaleAndRotateTransformationBuilderConstructor.newInstance(new java.lang.Object[0]);
                setRotationMethod.invoke(objNewInstance, java.lang.Float.valueOf(f));
                return (androidx.media3.common.Effect) androidx.media3.common.util.Assertions.checkNotNull(buildScaleAndRotateTransformationMethod.invoke(objNewInstance, new java.lang.Object[0]));
            } catch (java.lang.Exception e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"scaleAndRotateTransformationBuilderConstructor", "setRotationMethod", "buildScaleAndRotateTransformationMethod"})
        private static void prepare() throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
            if (scaleAndRotateTransformationBuilderConstructor == null || setRotationMethod == null || buildScaleAndRotateTransformationMethod == null) {
                java.lang.Class<?> cls = java.lang.Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
                scaleAndRotateTransformationBuilderConstructor = cls.getConstructor(new java.lang.Class[0]);
                setRotationMethod = cls.getMethod("setRotationDegrees", java.lang.Float.TYPE);
                buildScaleAndRotateTransformationMethod = cls.getMethod("build", new java.lang.Class[0]);
            }
        }
    }
}
