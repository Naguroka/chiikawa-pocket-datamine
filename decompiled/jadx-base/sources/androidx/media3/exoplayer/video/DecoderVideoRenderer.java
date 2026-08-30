package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public abstract class DecoderVideoRenderer extends androidx.media3.exoplayer.BaseRenderer {
    private static final int REINITIALIZATION_STATE_NONE = 0;
    private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 2;
    private static final java.lang.String TAG = "DecoderVideoRenderer";
    private final long allowedJoiningTimeMs;
    private int buffersInCodecCount;
    private int consecutiveDroppedFrameCount;
    private androidx.media3.decoder.Decoder<androidx.media3.decoder.DecoderInputBuffer, ? extends androidx.media3.decoder.VideoDecoderOutputBuffer, ? extends androidx.media3.decoder.DecoderException> decoder;
    protected androidx.media3.exoplayer.DecoderCounters decoderCounters;
    private androidx.media3.exoplayer.drm.DrmSession decoderDrmSession;
    private boolean decoderReceivedBuffers;
    private int decoderReinitializationState;
    private long droppedFrameAccumulationStartTimeMs;
    private int droppedFrames;
    private final androidx.media3.exoplayer.video.VideoRendererEventListener.EventDispatcher eventDispatcher;
    private int firstFrameState;
    private final androidx.media3.decoder.DecoderInputBuffer flagsOnlyBuffer;
    private final androidx.media3.common.util.TimedValueQueue<androidx.media3.common.Format> formatQueue;
    private androidx.media3.exoplayer.video.VideoFrameMetadataListener frameMetadataListener;
    private long initialPositionUs;
    private androidx.media3.decoder.DecoderInputBuffer inputBuffer;
    private androidx.media3.common.Format inputFormat;
    private boolean inputStreamEnded;
    private long joiningDeadlineMs;
    private long lastRenderTimeUs;
    private final int maxDroppedFramesToNotify;
    private java.lang.Object output;
    private androidx.media3.decoder.VideoDecoderOutputBuffer outputBuffer;
    private androidx.media3.exoplayer.video.VideoDecoderOutputBufferRenderer outputBufferRenderer;
    private androidx.media3.common.Format outputFormat;
    private int outputMode;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs;
    private android.view.Surface outputSurface;
    private androidx.media3.common.VideoSize reportedVideoSize;
    private androidx.media3.exoplayer.drm.DrmSession sourceDrmSession;
    private boolean waitingForFirstSampleInFormat;

    private static boolean isBufferLate(long j) {
        return j < -30000;
    }

    private static boolean isBufferVeryLate(long j) {
        return j < -500000;
    }

    protected abstract androidx.media3.decoder.Decoder<androidx.media3.decoder.DecoderInputBuffer, ? extends androidx.media3.decoder.VideoDecoderOutputBuffer, ? extends androidx.media3.decoder.DecoderException> createDecoder(androidx.media3.common.Format format, androidx.media3.decoder.CryptoConfig cryptoConfig) throws androidx.media3.decoder.DecoderException;

    protected void onQueueInputBuffer(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) {
    }

    protected abstract void renderOutputBufferToSurface(androidx.media3.decoder.VideoDecoderOutputBuffer videoDecoderOutputBuffer, android.view.Surface surface) throws androidx.media3.decoder.DecoderException;

    protected abstract void setDecoderOutputMode(int i);

    protected DecoderVideoRenderer(long j, android.os.Handler handler, androidx.media3.exoplayer.video.VideoRendererEventListener videoRendererEventListener, int i) {
        super(2);
        this.allowedJoiningTimeMs = j;
        this.maxDroppedFramesToNotify = i;
        this.joiningDeadlineMs = androidx.media3.common.C.TIME_UNSET;
        this.formatQueue = new androidx.media3.common.util.TimedValueQueue<>();
        this.flagsOnlyBuffer = androidx.media3.decoder.DecoderInputBuffer.newNoDataInstance();
        this.eventDispatcher = new androidx.media3.exoplayer.video.VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        this.decoderReinitializationState = 0;
        this.outputMode = -1;
        this.firstFrameState = 0;
        this.decoderCounters = new androidx.media3.exoplayer.DecoderCounters();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j, long j2) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (this.outputStreamEnded) {
            return;
        }
        if (this.inputFormat == null) {
            androidx.media3.exoplayer.FormatHolder formatHolder = getFormatHolder();
            this.flagsOnlyBuffer.clear();
            int source = readSource(formatHolder, this.flagsOnlyBuffer, 2);
            if (source != -5) {
                if (source == -4) {
                    androidx.media3.common.util.Assertions.checkState(this.flagsOnlyBuffer.isEndOfStream());
                    this.inputStreamEnded = true;
                    this.outputStreamEnded = true;
                    return;
                }
                return;
            }
            onInputFormatChanged(formatHolder);
        }
        maybeInitDecoder();
        if (this.decoder != null) {
            try {
                androidx.media3.common.util.TraceUtil.beginSection("drainAndFeed");
                while (drainOutputBuffer(j, j2)) {
                }
                while (feedInputBuffer()) {
                }
                androidx.media3.common.util.TraceUtil.endSection();
                this.decoderCounters.ensureUpdated();
            } catch (androidx.media3.decoder.DecoderException e) {
                androidx.media3.common.util.Log.e(TAG, "Video codec error", e);
                this.eventDispatcher.videoCodecError(e);
                throw createRendererException(e, this.inputFormat, 4003);
            }
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        if (this.inputFormat != null && ((isSourceReady() || this.outputBuffer != null) && (this.firstFrameState == 3 || !hasOutput()))) {
            this.joiningDeadlineMs = androidx.media3.common.C.TIME_UNSET;
            return true;
        }
        if (this.joiningDeadlineMs == androidx.media3.common.C.TIME_UNSET) {
            return false;
        }
        if (android.os.SystemClock.elapsedRealtime() < this.joiningDeadlineMs) {
            return true;
        }
        this.joiningDeadlineMs = androidx.media3.common.C.TIME_UNSET;
        return false;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, java.lang.Object obj) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (i == 1) {
            setOutput(obj);
        } else if (i == 7) {
            this.frameMetadataListener = (androidx.media3.exoplayer.video.VideoFrameMetadataListener) obj;
        } else {
            super.handleMessage(i, obj);
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onEnabled(boolean z, boolean z2) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.DecoderCounters decoderCounters = new androidx.media3.exoplayer.DecoderCounters();
        this.decoderCounters = decoderCounters;
        this.eventDispatcher.enabled(decoderCounters);
        this.firstFrameState = z2 ? 1 : 0;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void enableMayRenderStartOfStream() {
        if (this.firstFrameState == 0) {
            this.firstFrameState = 1;
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onPositionReset(long j, boolean z) throws androidx.media3.exoplayer.ExoPlaybackException {
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        lowerFirstFrameState(1);
        this.initialPositionUs = androidx.media3.common.C.TIME_UNSET;
        this.consecutiveDroppedFrameCount = 0;
        if (this.decoder != null) {
            flushDecoder();
        }
        if (z) {
            setJoiningDeadlineMs();
        } else {
            this.joiningDeadlineMs = androidx.media3.common.C.TIME_UNSET;
        }
        this.formatQueue.clear();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onStarted() {
        this.droppedFrames = 0;
        this.droppedFrameAccumulationStartTimeMs = android.os.SystemClock.elapsedRealtime();
        this.lastRenderTimeUs = androidx.media3.common.util.Util.msToUs(android.os.SystemClock.elapsedRealtime());
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onStopped() {
        this.joiningDeadlineMs = androidx.media3.common.C.TIME_UNSET;
        maybeNotifyDroppedFrames();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onDisabled() {
        this.inputFormat = null;
        this.reportedVideoSize = null;
        lowerFirstFrameState(0);
        try {
            setSourceDrmSession(null);
            releaseDecoder();
        } finally {
            this.eventDispatcher.disabled(this.decoderCounters);
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onStreamChanged(androidx.media3.common.Format[] formatArr, long j, long j2, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) throws androidx.media3.exoplayer.ExoPlaybackException {
        this.outputStreamOffsetUs = j2;
        super.onStreamChanged(formatArr, j, j2, mediaPeriodId);
    }

    protected void flushDecoder() throws androidx.media3.exoplayer.ExoPlaybackException {
        this.buffersInCodecCount = 0;
        if (this.decoderReinitializationState != 0) {
            releaseDecoder();
            maybeInitDecoder();
            return;
        }
        this.inputBuffer = null;
        androidx.media3.decoder.VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.outputBuffer;
        if (videoDecoderOutputBuffer != null) {
            videoDecoderOutputBuffer.release();
            this.outputBuffer = null;
        }
        androidx.media3.decoder.Decoder decoder = (androidx.media3.decoder.Decoder) androidx.media3.common.util.Assertions.checkNotNull(this.decoder);
        decoder.flush();
        decoder.setOutputStartTimeUs(getLastResetPositionUs());
        this.decoderReceivedBuffers = false;
    }

    protected void releaseDecoder() {
        this.inputBuffer = null;
        this.outputBuffer = null;
        this.decoderReinitializationState = 0;
        this.decoderReceivedBuffers = false;
        this.buffersInCodecCount = 0;
        if (this.decoder != null) {
            this.decoderCounters.decoderReleaseCount++;
            this.decoder.release();
            this.eventDispatcher.decoderReleased(this.decoder.getName());
            this.decoder = null;
        }
        setDecoderDrmSession(null);
    }

    protected void onInputFormatChanged(androidx.media3.exoplayer.FormatHolder formatHolder) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluationCanReuseDecoder;
        this.waitingForFirstSampleInFormat = true;
        androidx.media3.common.Format format = (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(formatHolder.format);
        setSourceDrmSession(formatHolder.drmSession);
        androidx.media3.common.Format format2 = this.inputFormat;
        this.inputFormat = format;
        androidx.media3.decoder.Decoder<androidx.media3.decoder.DecoderInputBuffer, ? extends androidx.media3.decoder.VideoDecoderOutputBuffer, ? extends androidx.media3.decoder.DecoderException> decoder = this.decoder;
        if (decoder == null) {
            maybeInitDecoder();
            this.eventDispatcher.inputFormatChanged((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.inputFormat), null);
            return;
        }
        if (this.sourceDrmSession != this.decoderDrmSession) {
            decoderReuseEvaluationCanReuseDecoder = new androidx.media3.exoplayer.DecoderReuseEvaluation(this.decoder.getName(), (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(format2), format, 0, 128);
        } else {
            decoderReuseEvaluationCanReuseDecoder = canReuseDecoder(decoder.getName(), (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(format2), format);
        }
        if (decoderReuseEvaluationCanReuseDecoder.result == 0) {
            if (this.decoderReceivedBuffers) {
                this.decoderReinitializationState = 1;
            } else {
                releaseDecoder();
                maybeInitDecoder();
            }
        }
        this.eventDispatcher.inputFormatChanged((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.inputFormat), decoderReuseEvaluationCanReuseDecoder);
    }

    protected void onProcessedOutputBuffer(long j) {
        this.buffersInCodecCount--;
    }

    protected boolean shouldDropOutputBuffer(long j, long j2) {
        return isBufferLate(j);
    }

    protected boolean shouldDropBuffersToKeyframe(long j, long j2) {
        return isBufferVeryLate(j);
    }

    protected boolean shouldForceRenderOutputBuffer(long j, long j2) {
        return isBufferLate(j) && j2 > androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }

    protected void skipOutputBuffer(androidx.media3.decoder.VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        this.decoderCounters.skippedOutputBufferCount++;
        videoDecoderOutputBuffer.release();
    }

    protected void dropOutputBuffer(androidx.media3.decoder.VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        updateDroppedBufferCounters(0, 1);
        videoDecoderOutputBuffer.release();
    }

    protected boolean maybeDropBuffersToKeyframe(long j) throws androidx.media3.exoplayer.ExoPlaybackException {
        int iSkipSource = skipSource(j);
        if (iSkipSource == 0) {
            return false;
        }
        this.decoderCounters.droppedToKeyframeCount++;
        updateDroppedBufferCounters(iSkipSource, this.buffersInCodecCount);
        flushDecoder();
        return true;
    }

    protected void updateDroppedBufferCounters(int i, int i2) {
        this.decoderCounters.droppedInputBufferCount += i;
        int i3 = i + i2;
        this.decoderCounters.droppedBufferCount += i3;
        this.droppedFrames += i3;
        int i4 = this.consecutiveDroppedFrameCount + i3;
        this.consecutiveDroppedFrameCount = i4;
        androidx.media3.exoplayer.DecoderCounters decoderCounters = this.decoderCounters;
        decoderCounters.maxConsecutiveDroppedBufferCount = java.lang.Math.max(i4, decoderCounters.maxConsecutiveDroppedBufferCount);
        int i5 = this.maxDroppedFramesToNotify;
        if (i5 <= 0 || this.droppedFrames < i5) {
            return;
        }
        maybeNotifyDroppedFrames();
    }

    protected void renderOutputBuffer(androidx.media3.decoder.VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j, androidx.media3.common.Format format) throws androidx.media3.decoder.DecoderException {
        androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener = this.frameMetadataListener;
        if (videoFrameMetadataListener != null) {
            videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j, getClock().nanoTime(), format, null);
        }
        this.lastRenderTimeUs = androidx.media3.common.util.Util.msToUs(android.os.SystemClock.elapsedRealtime());
        int i = videoDecoderOutputBuffer.mode;
        boolean z = i == 1 && this.outputSurface != null;
        boolean z2 = i == 0 && this.outputBufferRenderer != null;
        if (!z2 && !z) {
            dropOutputBuffer(videoDecoderOutputBuffer);
            return;
        }
        maybeNotifyVideoSizeChanged(videoDecoderOutputBuffer.width, videoDecoderOutputBuffer.height);
        if (z2) {
            ((androidx.media3.exoplayer.video.VideoDecoderOutputBufferRenderer) androidx.media3.common.util.Assertions.checkNotNull(this.outputBufferRenderer)).setOutputBuffer(videoDecoderOutputBuffer);
        } else {
            renderOutputBufferToSurface(videoDecoderOutputBuffer, (android.view.Surface) androidx.media3.common.util.Assertions.checkNotNull(this.outputSurface));
        }
        this.consecutiveDroppedFrameCount = 0;
        this.decoderCounters.renderedOutputBufferCount++;
        maybeNotifyRenderedFirstFrame();
    }

    protected final void setOutput(java.lang.Object obj) {
        if (obj instanceof android.view.Surface) {
            this.outputSurface = (android.view.Surface) obj;
            this.outputBufferRenderer = null;
            this.outputMode = 1;
        } else if (obj instanceof androidx.media3.exoplayer.video.VideoDecoderOutputBufferRenderer) {
            this.outputSurface = null;
            this.outputBufferRenderer = (androidx.media3.exoplayer.video.VideoDecoderOutputBufferRenderer) obj;
            this.outputMode = 0;
        } else {
            this.outputSurface = null;
            this.outputBufferRenderer = null;
            this.outputMode = -1;
            obj = null;
        }
        if (this.output == obj) {
            if (obj != null) {
                onOutputReset();
                return;
            }
            return;
        }
        this.output = obj;
        if (obj != null) {
            if (this.decoder != null) {
                setDecoderOutputMode(this.outputMode);
            }
            onOutputChanged();
            return;
        }
        onOutputRemoved();
    }

    protected androidx.media3.exoplayer.DecoderReuseEvaluation canReuseDecoder(java.lang.String str, androidx.media3.common.Format format, androidx.media3.common.Format format2) {
        return new androidx.media3.exoplayer.DecoderReuseEvaluation(str, format, format2, 0, 1);
    }

    private void setSourceDrmSession(androidx.media3.exoplayer.drm.DrmSession drmSession) {
        androidx.media3.exoplayer.drm.DrmSession.replaceSession(this.sourceDrmSession, drmSession);
        this.sourceDrmSession = drmSession;
    }

    private void setDecoderDrmSession(androidx.media3.exoplayer.drm.DrmSession drmSession) {
        androidx.media3.exoplayer.drm.DrmSession.replaceSession(this.decoderDrmSession, drmSession);
        this.decoderDrmSession = drmSession;
    }

    private void maybeInitDecoder() throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.decoder.CryptoConfig cryptoConfig;
        if (this.decoder != null) {
            return;
        }
        setDecoderDrmSession(this.sourceDrmSession);
        androidx.media3.exoplayer.drm.DrmSession drmSession = this.decoderDrmSession;
        if (drmSession != null) {
            cryptoConfig = drmSession.getCryptoConfig();
            if (cryptoConfig == null && this.decoderDrmSession.getError() == null) {
                return;
            }
        } else {
            cryptoConfig = null;
        }
        try {
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            androidx.media3.decoder.Decoder<androidx.media3.decoder.DecoderInputBuffer, ? extends androidx.media3.decoder.VideoDecoderOutputBuffer, ? extends androidx.media3.decoder.DecoderException> decoderCreateDecoder = createDecoder((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.inputFormat), cryptoConfig);
            this.decoder = decoderCreateDecoder;
            decoderCreateDecoder.setOutputStartTimeUs(getLastResetPositionUs());
            setDecoderOutputMode(this.outputMode);
            long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            this.eventDispatcher.decoderInitialized(((androidx.media3.decoder.Decoder) androidx.media3.common.util.Assertions.checkNotNull(this.decoder)).getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.decoderCounters.decoderInitCount++;
        } catch (androidx.media3.decoder.DecoderException e) {
            androidx.media3.common.util.Log.e(TAG, "Video codec error", e);
            this.eventDispatcher.videoCodecError(e);
            throw createRendererException(e, this.inputFormat, 4001);
        } catch (java.lang.OutOfMemoryError e2) {
            throw createRendererException(e2, this.inputFormat, 4001);
        }
    }

    private boolean feedInputBuffer() throws androidx.media3.exoplayer.ExoPlaybackException, androidx.media3.decoder.DecoderException {
        androidx.media3.decoder.Decoder<androidx.media3.decoder.DecoderInputBuffer, ? extends androidx.media3.decoder.VideoDecoderOutputBuffer, ? extends androidx.media3.decoder.DecoderException> decoder = this.decoder;
        if (decoder == null || this.decoderReinitializationState == 2 || this.inputStreamEnded) {
            return false;
        }
        if (this.inputBuffer == null) {
            androidx.media3.decoder.DecoderInputBuffer decoderInputBufferDequeueInputBuffer = decoder.dequeueInputBuffer();
            this.inputBuffer = decoderInputBufferDequeueInputBuffer;
            if (decoderInputBufferDequeueInputBuffer == null) {
                return false;
            }
        }
        androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer = (androidx.media3.decoder.DecoderInputBuffer) androidx.media3.common.util.Assertions.checkNotNull(this.inputBuffer);
        if (this.decoderReinitializationState == 1) {
            decoderInputBuffer.setFlags(4);
            ((androidx.media3.decoder.Decoder) androidx.media3.common.util.Assertions.checkNotNull(this.decoder)).queueInputBuffer(decoderInputBuffer);
            this.inputBuffer = null;
            this.decoderReinitializationState = 2;
            return false;
        }
        androidx.media3.exoplayer.FormatHolder formatHolder = getFormatHolder();
        int source = readSource(formatHolder, decoderInputBuffer, 0);
        if (source == -5) {
            onInputFormatChanged(formatHolder);
            return true;
        }
        if (source != -4) {
            if (source == -3) {
                return false;
            }
            throw new java.lang.IllegalStateException();
        }
        if (decoderInputBuffer.isEndOfStream()) {
            this.inputStreamEnded = true;
            ((androidx.media3.decoder.Decoder) androidx.media3.common.util.Assertions.checkNotNull(this.decoder)).queueInputBuffer(decoderInputBuffer);
            this.inputBuffer = null;
            return false;
        }
        if (this.waitingForFirstSampleInFormat) {
            this.formatQueue.add(decoderInputBuffer.timeUs, (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.inputFormat));
            this.waitingForFirstSampleInFormat = false;
        }
        decoderInputBuffer.flip();
        decoderInputBuffer.format = this.inputFormat;
        onQueueInputBuffer(decoderInputBuffer);
        ((androidx.media3.decoder.Decoder) androidx.media3.common.util.Assertions.checkNotNull(this.decoder)).queueInputBuffer(decoderInputBuffer);
        this.buffersInCodecCount++;
        this.decoderReceivedBuffers = true;
        this.decoderCounters.queuedInputBufferCount++;
        this.inputBuffer = null;
        return true;
    }

    private boolean drainOutputBuffer(long j, long j2) throws androidx.media3.exoplayer.ExoPlaybackException, androidx.media3.decoder.DecoderException {
        if (this.outputBuffer == null) {
            androidx.media3.decoder.VideoDecoderOutputBuffer videoDecoderOutputBuffer = (androidx.media3.decoder.VideoDecoderOutputBuffer) ((androidx.media3.decoder.Decoder) androidx.media3.common.util.Assertions.checkNotNull(this.decoder)).dequeueOutputBuffer();
            this.outputBuffer = videoDecoderOutputBuffer;
            if (videoDecoderOutputBuffer == null) {
                return false;
            }
            this.decoderCounters.skippedOutputBufferCount += this.outputBuffer.skippedOutputBufferCount;
            this.buffersInCodecCount -= this.outputBuffer.skippedOutputBufferCount;
        }
        if (this.outputBuffer.isEndOfStream()) {
            if (this.decoderReinitializationState == 2) {
                releaseDecoder();
                maybeInitDecoder();
            } else {
                this.outputBuffer.release();
                this.outputBuffer = null;
                this.outputStreamEnded = true;
            }
            return false;
        }
        boolean zProcessOutputBuffer = processOutputBuffer(j, j2);
        if (zProcessOutputBuffer) {
            onProcessedOutputBuffer(((androidx.media3.decoder.VideoDecoderOutputBuffer) androidx.media3.common.util.Assertions.checkNotNull(this.outputBuffer)).timeUs);
            this.outputBuffer = null;
        }
        return zProcessOutputBuffer;
    }

    private boolean processOutputBuffer(long j, long j2) throws androidx.media3.exoplayer.ExoPlaybackException, androidx.media3.decoder.DecoderException {
        if (this.initialPositionUs == androidx.media3.common.C.TIME_UNSET) {
            this.initialPositionUs = j;
        }
        androidx.media3.decoder.VideoDecoderOutputBuffer videoDecoderOutputBuffer = (androidx.media3.decoder.VideoDecoderOutputBuffer) androidx.media3.common.util.Assertions.checkNotNull(this.outputBuffer);
        long j3 = videoDecoderOutputBuffer.timeUs;
        long j4 = j3 - j;
        if (!hasOutput()) {
            if (!isBufferLate(j4)) {
                return false;
            }
            skipOutputBuffer(videoDecoderOutputBuffer);
            return true;
        }
        androidx.media3.common.Format formatPollFloor = this.formatQueue.pollFloor(j3);
        if (formatPollFloor != null) {
            this.outputFormat = formatPollFloor;
        } else if (this.outputFormat == null) {
            this.outputFormat = this.formatQueue.pollFirst();
        }
        long j5 = j3 - this.outputStreamOffsetUs;
        if (shouldForceRender(j4)) {
            renderOutputBuffer(videoDecoderOutputBuffer, j5, (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.outputFormat));
            return true;
        }
        if (!(getState() == 2) || j == this.initialPositionUs || (shouldDropBuffersToKeyframe(j4, j2) && maybeDropBuffersToKeyframe(j))) {
            return false;
        }
        if (shouldDropOutputBuffer(j4, j2)) {
            dropOutputBuffer(videoDecoderOutputBuffer);
            return true;
        }
        if (j4 < 30000) {
            renderOutputBuffer(videoDecoderOutputBuffer, j5, (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.outputFormat));
            return true;
        }
        return false;
    }

    private boolean shouldForceRender(long j) {
        boolean z = getState() == 2;
        int i = this.firstFrameState;
        if (i == 0) {
            return z;
        }
        if (i == 1) {
            return true;
        }
        if (i == 3) {
            return z && shouldForceRenderOutputBuffer(j, androidx.media3.common.util.Util.msToUs(android.os.SystemClock.elapsedRealtime()) - this.lastRenderTimeUs);
        }
        throw new java.lang.IllegalStateException();
    }

    private boolean hasOutput() {
        return this.outputMode != -1;
    }

    private void onOutputChanged() {
        maybeRenotifyVideoSizeChanged();
        lowerFirstFrameState(1);
        if (getState() == 2) {
            setJoiningDeadlineMs();
        }
    }

    private void onOutputRemoved() {
        this.reportedVideoSize = null;
        lowerFirstFrameState(1);
    }

    private void onOutputReset() {
        maybeRenotifyVideoSizeChanged();
        maybeRenotifyRenderedFirstFrame();
    }

    private void setJoiningDeadlineMs() {
        this.joiningDeadlineMs = this.allowedJoiningTimeMs > 0 ? android.os.SystemClock.elapsedRealtime() + this.allowedJoiningTimeMs : androidx.media3.common.C.TIME_UNSET;
    }

    private void lowerFirstFrameState(int i) {
        this.firstFrameState = java.lang.Math.min(this.firstFrameState, i);
    }

    private void maybeNotifyRenderedFirstFrame() {
        if (this.firstFrameState != 3) {
            this.firstFrameState = 3;
            java.lang.Object obj = this.output;
            if (obj != null) {
                this.eventDispatcher.renderedFirstFrame(obj);
            }
        }
    }

    private void maybeRenotifyRenderedFirstFrame() {
        java.lang.Object obj;
        if (this.firstFrameState != 3 || (obj = this.output) == null) {
            return;
        }
        this.eventDispatcher.renderedFirstFrame(obj);
    }

    private void maybeNotifyVideoSizeChanged(int i, int i2) {
        androidx.media3.common.VideoSize videoSize = this.reportedVideoSize;
        if (videoSize != null && videoSize.width == i && this.reportedVideoSize.height == i2) {
            return;
        }
        androidx.media3.common.VideoSize videoSize2 = new androidx.media3.common.VideoSize(i, i2);
        this.reportedVideoSize = videoSize2;
        this.eventDispatcher.videoSizeChanged(videoSize2);
    }

    private void maybeRenotifyVideoSizeChanged() {
        androidx.media3.common.VideoSize videoSize = this.reportedVideoSize;
        if (videoSize != null) {
            this.eventDispatcher.videoSizeChanged(videoSize);
        }
    }

    private void maybeNotifyDroppedFrames() {
        if (this.droppedFrames > 0) {
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            this.eventDispatcher.droppedFrames(this.droppedFrames, jElapsedRealtime - this.droppedFrameAccumulationStartTimeMs);
            this.droppedFrames = 0;
            this.droppedFrameAccumulationStartTimeMs = jElapsedRealtime;
        }
    }
}
