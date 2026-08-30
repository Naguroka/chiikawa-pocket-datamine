package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaCodecRenderer extends androidx.media3.exoplayer.BaseRenderer {
    private static final byte[] ADAPTATION_WORKAROUND_BUFFER = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private static final int ADAPTATION_WORKAROUND_MODE_ALWAYS = 2;
    private static final int ADAPTATION_WORKAROUND_MODE_NEVER = 0;
    private static final int ADAPTATION_WORKAROUND_MODE_SAME_RESOLUTION = 1;
    private static final int ADAPTATION_WORKAROUND_SLICE_WIDTH_HEIGHT = 32;
    protected static final float CODEC_OPERATING_RATE_UNSET = -1.0f;
    private static final int DRAIN_ACTION_FLUSH = 1;
    private static final int DRAIN_ACTION_FLUSH_AND_UPDATE_DRM_SESSION = 2;
    private static final int DRAIN_ACTION_NONE = 0;
    private static final int DRAIN_ACTION_REINITIALIZE = 3;
    private static final int DRAIN_STATE_NONE = 0;
    private static final int DRAIN_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int DRAIN_STATE_WAIT_END_OF_STREAM = 2;
    private static final long MAX_CODEC_HOTSWAP_TIME_MS = 1000;
    private static final int RECONFIGURATION_STATE_NONE = 0;
    private static final int RECONFIGURATION_STATE_QUEUE_PENDING = 2;
    private static final int RECONFIGURATION_STATE_WRITE_PENDING = 1;
    private static final java.lang.String TAG = "MediaCodecRenderer";
    private final float assumedMinimumCodecOperatingRate;
    private java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> availableCodecInfos;
    private final androidx.media3.decoder.DecoderInputBuffer buffer;
    private final androidx.media3.exoplayer.mediacodec.BatchBuffer bypassBatchBuffer;
    private boolean bypassDrainAndReinitialize;
    private boolean bypassEnabled;
    private final androidx.media3.decoder.DecoderInputBuffer bypassSampleBuffer;
    private boolean bypassSampleBufferPending;
    private androidx.media3.exoplayer.mediacodec.MediaCodecAdapter codec;
    private int codecAdaptationWorkaroundMode;
    private final androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory codecAdapterFactory;
    private int codecDrainAction;
    private int codecDrainState;
    private androidx.media3.exoplayer.drm.DrmSession codecDrmSession;
    private boolean codecHasOutputMediaFormat;
    private long codecHotswapDeadlineMs;
    private androidx.media3.exoplayer.mediacodec.MediaCodecInfo codecInfo;
    private androidx.media3.common.Format codecInputFormat;
    private boolean codecNeedsAdaptationWorkaroundBuffer;
    private boolean codecNeedsDiscardToSpsWorkaround;
    private boolean codecNeedsEosBufferTimestampWorkaround;
    private boolean codecNeedsEosFlushWorkaround;
    private boolean codecNeedsEosOutputExceptionWorkaround;
    private boolean codecNeedsEosPropagation;
    private boolean codecNeedsFlushWorkaround;
    private boolean codecNeedsMonoChannelCountWorkaround;
    private boolean codecNeedsSosFlushWorkaround;
    private float codecOperatingRate;
    private android.media.MediaFormat codecOutputMediaFormat;
    private boolean codecOutputMediaFormatChanged;
    private boolean codecReceivedBuffers;
    private boolean codecReceivedEos;
    private int codecReconfigurationState;
    private boolean codecReconfigured;
    private boolean codecRegisteredOnBufferAvailableListener;
    private float currentPlaybackSpeed;
    protected androidx.media3.exoplayer.DecoderCounters decoderCounters;
    private final boolean enableDecoderFallback;
    private androidx.media3.common.Format inputFormat;
    private int inputIndex;
    private boolean inputStreamEnded;
    private boolean isDecodeOnlyOutputBuffer;
    private boolean isLastOutputBuffer;
    private long largestQueuedPresentationTimeUs;
    private long lastBufferInStreamPresentationTimeUs;
    private long lastProcessedOutputBufferTimeUs;
    private final androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector;
    private android.media.MediaCrypto mediaCrypto;
    private boolean needToNotifyOutputFormatChangeAfterStreamChange;
    private final androidx.media3.decoder.DecoderInputBuffer noDataBuffer;
    private final androidx.media3.exoplayer.audio.OggOpusAudioPacketizer oggOpusAudioPacketizer;
    private java.nio.ByteBuffer outputBuffer;
    private final android.media.MediaCodec.BufferInfo outputBufferInfo;
    private androidx.media3.common.Format outputFormat;
    private int outputIndex;
    private boolean outputStreamEnded;
    private androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.OutputStreamInfo outputStreamInfo;
    private boolean pendingOutputEndOfStream;
    private final java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.OutputStreamInfo> pendingOutputStreamChanges;
    private androidx.media3.exoplayer.ExoPlaybackException pendingPlaybackException;
    private androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException preferredDecoderInitializationException;
    private long renderTimeLimitMs;
    private boolean shouldSkipAdaptationWorkaroundOutputBuffer;
    private androidx.media3.exoplayer.drm.DrmSession sourceDrmSession;
    private float targetPlaybackSpeed;
    private boolean waitingForFirstSampleInFormat;
    private androidx.media3.exoplayer.Renderer.WakeupListener wakeupListener;

    protected int getCodecBufferFlags(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) {
        return 0;
    }

    protected boolean getCodecNeedsEosPropagation() {
        return false;
    }

    protected float getCodecOperatingRateV23(float f, androidx.media3.common.Format format, androidx.media3.common.Format[] formatArr) {
        return -1.0f;
    }

    protected abstract java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> getDecoderInfos(androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, androidx.media3.common.Format format, boolean z) throws androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException;

    protected abstract androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration getMediaCodecConfiguration(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, androidx.media3.common.Format format, android.media.MediaCrypto mediaCrypto, float f);

    protected void handleInputBufferSupplementalData(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) throws androidx.media3.exoplayer.ExoPlaybackException {
    }

    protected void onCodecError(java.lang.Exception exc) {
    }

    protected void onCodecInitialized(java.lang.String str, androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration configuration, long j, long j2) {
    }

    protected void onCodecReleased(java.lang.String str) {
    }

    protected void onOutputFormatChanged(androidx.media3.common.Format format, android.media.MediaFormat mediaFormat) throws androidx.media3.exoplayer.ExoPlaybackException {
    }

    protected void onOutputStreamOffsetUsChanged(long j) {
    }

    protected void onProcessedStreamChange() {
    }

    protected void onQueueInputBuffer(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) throws androidx.media3.exoplayer.ExoPlaybackException {
    }

    protected void onReadyToInitializeCodec(androidx.media3.common.Format format) throws androidx.media3.exoplayer.ExoPlaybackException {
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onStarted() {
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onStopped() {
    }

    protected abstract boolean processOutputBuffer(long j, long j2, androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter, java.nio.ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, androidx.media3.common.Format format) throws androidx.media3.exoplayer.ExoPlaybackException;

    protected void renderToEndOfStream() throws androidx.media3.exoplayer.ExoPlaybackException {
    }

    protected boolean shouldInitCodec(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo) {
        return true;
    }

    protected boolean shouldReinitCodec() {
        return false;
    }

    protected boolean shouldUseBypass(androidx.media3.common.Format format) {
        return false;
    }

    protected abstract int supportsFormat(androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, androidx.media3.common.Format format) throws androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException;

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.RendererCapabilities
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    public static class DecoderInitializationException extends java.lang.Exception {
        private static final int CUSTOM_ERROR_CODE_BASE = -50000;
        private static final int DECODER_QUERY_ERROR = -49998;
        private static final int NO_SUITABLE_DECODER_ERROR = -49999;
        public final androidx.media3.exoplayer.mediacodec.MediaCodecInfo codecInfo;
        public final java.lang.String diagnosticInfo;
        public final androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException fallbackDecoderInitializationException;
        public final java.lang.String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(androidx.media3.common.Format format, java.lang.Throwable th, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + format, th, format.sampleMimeType, z, null, buildCustomDiagnosticInfo(i), null);
        }

        public DecoderInitializationException(androidx.media3.common.Format format, java.lang.Throwable th, boolean z, androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo) {
            this("Decoder init failed: " + mediaCodecInfo.name + ", " + format, th, format.sampleMimeType, z, mediaCodecInfo, androidx.media3.common.util.Util.SDK_INT >= 21 ? getDiagnosticInfoV21(th) : null, null);
        }

        private DecoderInitializationException(java.lang.String str, java.lang.Throwable th, java.lang.String str2, boolean z, androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, java.lang.String str3, androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.mimeType = str2;
            this.secureDecoderRequired = z;
            this.codecInfo = mediaCodecInfo;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException copyWithFallbackException(androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException decoderInitializationException) {
            return new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException(getMessage(), getCause(), this.mimeType, this.secureDecoderRequired, this.codecInfo, this.diagnosticInfo, decoderInitializationException);
        }

        private static java.lang.String getDiagnosticInfoV21(java.lang.Throwable th) {
            if (th instanceof android.media.MediaCodec.CodecException) {
                return ((android.media.MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        private static java.lang.String buildCustomDiagnosticInfo(int i) {
            return "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + java.lang.Math.abs(i);
        }
    }

    public MediaCodecRenderer(int i, androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory factory, androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, boolean z, float f) {
        super(i);
        this.codecAdapterFactory = factory;
        this.mediaCodecSelector = (androidx.media3.exoplayer.mediacodec.MediaCodecSelector) androidx.media3.common.util.Assertions.checkNotNull(mediaCodecSelector);
        this.enableDecoderFallback = z;
        this.assumedMinimumCodecOperatingRate = f;
        this.noDataBuffer = androidx.media3.decoder.DecoderInputBuffer.newNoDataInstance();
        this.buffer = new androidx.media3.decoder.DecoderInputBuffer(0);
        this.bypassSampleBuffer = new androidx.media3.decoder.DecoderInputBuffer(2);
        androidx.media3.exoplayer.mediacodec.BatchBuffer batchBuffer = new androidx.media3.exoplayer.mediacodec.BatchBuffer();
        this.bypassBatchBuffer = batchBuffer;
        this.outputBufferInfo = new android.media.MediaCodec.BufferInfo();
        this.currentPlaybackSpeed = 1.0f;
        this.targetPlaybackSpeed = 1.0f;
        this.renderTimeLimitMs = androidx.media3.common.C.TIME_UNSET;
        this.pendingOutputStreamChanges = new java.util.ArrayDeque<>();
        this.outputStreamInfo = androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.OutputStreamInfo.UNSET;
        batchBuffer.ensureSpaceForWrite(0);
        batchBuffer.data.order(java.nio.ByteOrder.nativeOrder());
        this.oggOpusAudioPacketizer = new androidx.media3.exoplayer.audio.OggOpusAudioPacketizer();
        this.codecOperatingRate = -1.0f;
        this.codecAdaptationWorkaroundMode = 0;
        this.codecReconfigurationState = 0;
        this.inputIndex = -1;
        this.outputIndex = -1;
        this.codecHotswapDeadlineMs = androidx.media3.common.C.TIME_UNSET;
        this.largestQueuedPresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.lastBufferInStreamPresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.lastProcessedOutputBufferTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
        this.decoderCounters = new androidx.media3.exoplayer.DecoderCounters();
    }

    public void setRenderTimeLimitMs(long j) {
        this.renderTimeLimitMs = j;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int supportsFormat(androidx.media3.common.Format format) throws androidx.media3.exoplayer.ExoPlaybackException {
        try {
            return supportsFormat(this.mediaCodecSelector, format);
        } catch (androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException e) {
            throw createRendererException(e, format, 4002);
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final long getDurationToProgressUs(long j, long j2) {
        return getDurationToProgressUs(this.codecRegisteredOnBufferAvailableListener, j, j2);
    }

    protected long getDurationToProgressUs(boolean z, long j, long j2) {
        return super.getDurationToProgressUs(j, j2);
    }

    protected final void maybeInitCodecOrBypass() throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.common.Format format;
        if (this.codec != null || this.bypassEnabled || (format = this.inputFormat) == null) {
            return;
        }
        if (isBypassPossible(format)) {
            initBypass(format);
            return;
        }
        setCodecDrmSession(this.sourceDrmSession);
        if (this.codecDrmSession == null || initMediaCryptoIfDrmSessionReady()) {
            try {
                androidx.media3.exoplayer.drm.DrmSession drmSession = this.codecDrmSession;
                maybeInitCodecWithFallback(this.mediaCrypto, drmSession != null && drmSession.requiresSecureDecoder((java.lang.String) androidx.media3.common.util.Assertions.checkStateNotNull(format.sampleMimeType)));
            } catch (androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException e) {
                throw createRendererException(e, format, 4001);
            }
        }
        android.media.MediaCrypto mediaCrypto = this.mediaCrypto;
        if (mediaCrypto == null || this.codec != null) {
            return;
        }
        mediaCrypto.release();
        this.mediaCrypto = null;
    }

    protected final boolean isBypassPossible(androidx.media3.common.Format format) {
        return this.sourceDrmSession == null && shouldUseBypass(format);
    }

    protected final boolean isBypassEnabled() {
        return this.bypassEnabled;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setPendingPlaybackException(androidx.media3.exoplayer.ExoPlaybackException exoPlaybackException) {
        this.pendingPlaybackException = exoPlaybackException;
    }

    protected final void updateOutputFormatForTime(long j) throws androidx.media3.exoplayer.ExoPlaybackException {
        boolean z;
        androidx.media3.common.Format formatPollFloor = this.outputStreamInfo.formatQueue.pollFloor(j);
        if (formatPollFloor == null && this.needToNotifyOutputFormatChangeAfterStreamChange && this.codecOutputMediaFormat != null) {
            formatPollFloor = this.outputStreamInfo.formatQueue.pollFirst();
        }
        if (formatPollFloor != null) {
            this.outputFormat = formatPollFloor;
            z = true;
        } else {
            z = false;
        }
        if (z || (this.codecOutputMediaFormatChanged && this.outputFormat != null)) {
            onOutputFormatChanged((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.outputFormat), this.codecOutputMediaFormat);
            this.codecOutputMediaFormatChanged = false;
            this.needToNotifyOutputFormatChangeAfterStreamChange = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final androidx.media3.exoplayer.mediacodec.MediaCodecAdapter getCodec() {
        return this.codec;
    }

    protected final android.media.MediaFormat getCodecOutputMediaFormat() {
        return this.codecOutputMediaFormat;
    }

    protected final androidx.media3.exoplayer.mediacodec.MediaCodecInfo getCodecInfo() {
        return this.codecInfo;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onEnabled(boolean z, boolean z2) throws androidx.media3.exoplayer.ExoPlaybackException {
        this.decoderCounters = new androidx.media3.exoplayer.DecoderCounters();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r5 >= r1) goto L13;
     */
    @Override // androidx.media3.exoplayer.BaseRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onStreamChanged(androidx.media3.common.Format[] formatArr, long j, long j2, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (this.outputStreamInfo.streamOffsetUs == androidx.media3.common.C.TIME_UNSET) {
            setOutputStreamInfo(new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.OutputStreamInfo(androidx.media3.common.C.TIME_UNSET, j, j2));
            return;
        }
        if (this.pendingOutputStreamChanges.isEmpty()) {
            long j3 = this.largestQueuedPresentationTimeUs;
            if (j3 != androidx.media3.common.C.TIME_UNSET) {
                long j4 = this.lastProcessedOutputBufferTimeUs;
                if (j4 != androidx.media3.common.C.TIME_UNSET) {
                }
            }
            setOutputStreamInfo(new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.OutputStreamInfo(androidx.media3.common.C.TIME_UNSET, j, j2));
            if (this.outputStreamInfo.streamOffsetUs != androidx.media3.common.C.TIME_UNSET) {
                onProcessedStreamChange();
                return;
            }
            return;
        }
        this.pendingOutputStreamChanges.add(new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.OutputStreamInfo(this.largestQueuedPresentationTimeUs, j, j2));
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onPositionReset(long j, boolean z) throws androidx.media3.exoplayer.ExoPlaybackException {
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        this.pendingOutputEndOfStream = false;
        if (this.bypassEnabled) {
            this.bypassBatchBuffer.clear();
            this.bypassSampleBuffer.clear();
            this.bypassSampleBufferPending = false;
            this.oggOpusAudioPacketizer.reset();
        } else {
            flushOrReinitializeCodec();
        }
        if (this.outputStreamInfo.formatQueue.size() > 0) {
            this.waitingForFirstSampleInFormat = true;
        }
        this.outputStreamInfo.formatQueue.clear();
        this.pendingOutputStreamChanges.clear();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void setPlaybackSpeed(float f, float f2) throws androidx.media3.exoplayer.ExoPlaybackException {
        this.currentPlaybackSpeed = f;
        this.targetPlaybackSpeed = f2;
        updateCodecOperatingRate(this.codecInputFormat);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onDisabled() {
        this.inputFormat = null;
        setOutputStreamInfo(androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.OutputStreamInfo.UNSET);
        this.pendingOutputStreamChanges.clear();
        flushOrReleaseCodec();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onReset() {
        try {
            disableBypass();
            releaseCodec();
        } finally {
            setSourceDrmSession(null);
        }
    }

    private void disableBypass() {
        this.bypassDrainAndReinitialize = false;
        this.bypassBatchBuffer.clear();
        this.bypassSampleBuffer.clear();
        this.bypassSampleBufferPending = false;
        this.bypassEnabled = false;
        this.oggOpusAudioPacketizer.reset();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void releaseCodec() {
        try {
            androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter = this.codec;
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.release();
                this.decoderCounters.decoderReleaseCount++;
                onCodecReleased(((androidx.media3.exoplayer.mediacodec.MediaCodecInfo) androidx.media3.common.util.Assertions.checkNotNull(this.codecInfo)).name);
            }
            this.codec = null;
            try {
                android.media.MediaCrypto mediaCrypto = this.mediaCrypto;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.mediaCrypto = null;
                setCodecDrmSession(null);
                resetCodecStateForRelease();
            }
        } catch (java.lang.Throwable th) {
            this.codec = null;
            try {
                android.media.MediaCrypto mediaCrypto2 = this.mediaCrypto;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.mediaCrypto = null;
                setCodecDrmSession(null);
                resetCodecStateForRelease();
            }
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, java.lang.Object obj) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (i == 11) {
            this.wakeupListener = (androidx.media3.exoplayer.Renderer.WakeupListener) obj;
        } else {
            super.handleMessage(i, obj);
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j, long j2) throws androidx.media3.exoplayer.ExoPlaybackException {
        boolean z = false;
        if (this.pendingOutputEndOfStream) {
            this.pendingOutputEndOfStream = false;
            processEndOfStream();
        }
        androidx.media3.exoplayer.ExoPlaybackException exoPlaybackException = this.pendingPlaybackException;
        if (exoPlaybackException != null) {
            this.pendingPlaybackException = null;
            throw exoPlaybackException;
        }
        try {
            if (this.outputStreamEnded) {
                renderToEndOfStream();
                return;
            }
            if (this.inputFormat != null || readSourceOmittingSampleData(2)) {
                maybeInitCodecOrBypass();
                if (this.bypassEnabled) {
                    androidx.media3.common.util.TraceUtil.beginSection("bypassRender");
                    while (bypassRender(j, j2)) {
                    }
                    androidx.media3.common.util.TraceUtil.endSection();
                } else if (this.codec != null) {
                    long jElapsedRealtime = getClock().elapsedRealtime();
                    androidx.media3.common.util.TraceUtil.beginSection("drainAndFeed");
                    while (drainOutputBuffer(j, j2) && shouldContinueRendering(jElapsedRealtime)) {
                    }
                    while (feedInputBuffer() && shouldContinueRendering(jElapsedRealtime)) {
                    }
                    androidx.media3.common.util.TraceUtil.endSection();
                } else {
                    this.decoderCounters.skippedInputBufferCount += skipSource(j);
                    readSourceOmittingSampleData(1);
                }
                this.decoderCounters.ensureUpdated();
            }
        } catch (java.lang.IllegalStateException e) {
            if (isMediaCodecException(e)) {
                onCodecError(e);
                if (androidx.media3.common.util.Util.SDK_INT >= 21 && isRecoverableMediaCodecExceptionV21(e)) {
                    z = true;
                }
                if (z) {
                    releaseCodec();
                }
                androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException mediaCodecDecoderExceptionCreateDecoderException = createDecoderException(e, getCodecInfo());
                throw createRendererException(mediaCodecDecoderExceptionCreateDecoderException, this.inputFormat, z, mediaCodecDecoderExceptionCreateDecoderException.errorCode == 1101 ? androidx.media3.common.PlaybackException.ERROR_CODE_DECODING_RESOURCES_RECLAIMED : 4003);
            }
            throw e;
        }
    }

    protected final boolean flushOrReinitializeCodec() throws androidx.media3.exoplayer.ExoPlaybackException {
        boolean zFlushOrReleaseCodec = flushOrReleaseCodec();
        if (zFlushOrReleaseCodec) {
            maybeInitCodecOrBypass();
        }
        return zFlushOrReleaseCodec;
    }

    protected boolean flushOrReleaseCodec() {
        if (this.codec == null) {
            return false;
        }
        int i = this.codecDrainAction;
        if (i == 3 || this.codecNeedsFlushWorkaround || ((this.codecNeedsSosFlushWorkaround && !this.codecHasOutputMediaFormat) || (this.codecNeedsEosFlushWorkaround && this.codecReceivedEos))) {
            releaseCodec();
            return true;
        }
        if (i == 2) {
            androidx.media3.common.util.Assertions.checkState(androidx.media3.common.util.Util.SDK_INT >= 23);
            if (androidx.media3.common.util.Util.SDK_INT >= 23) {
                try {
                    updateDrmSessionV23();
                } catch (androidx.media3.exoplayer.ExoPlaybackException e) {
                    androidx.media3.common.util.Log.w(TAG, "Failed to update the DRM session, releasing the codec instead.", e);
                    releaseCodec();
                    return true;
                }
            }
        }
        flushCodec();
        return false;
    }

    private void flushCodec() {
        try {
            ((androidx.media3.exoplayer.mediacodec.MediaCodecAdapter) androidx.media3.common.util.Assertions.checkStateNotNull(this.codec)).flush();
        } finally {
            resetCodecStateForFlush();
        }
    }

    protected void resetCodecStateForFlush() {
        resetInputBuffer();
        resetOutputBuffer();
        this.codecHotswapDeadlineMs = androidx.media3.common.C.TIME_UNSET;
        this.codecReceivedEos = false;
        this.codecReceivedBuffers = false;
        this.codecNeedsAdaptationWorkaroundBuffer = false;
        this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
        this.isDecodeOnlyOutputBuffer = false;
        this.isLastOutputBuffer = false;
        this.largestQueuedPresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.lastBufferInStreamPresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.lastProcessedOutputBufferTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
        this.codecReconfigurationState = this.codecReconfigured ? 1 : 0;
    }

    protected void resetCodecStateForRelease() {
        resetCodecStateForFlush();
        this.pendingPlaybackException = null;
        this.availableCodecInfos = null;
        this.codecInfo = null;
        this.codecInputFormat = null;
        this.codecOutputMediaFormat = null;
        this.codecOutputMediaFormatChanged = false;
        this.codecHasOutputMediaFormat = false;
        this.codecOperatingRate = -1.0f;
        this.codecAdaptationWorkaroundMode = 0;
        this.codecNeedsDiscardToSpsWorkaround = false;
        this.codecNeedsFlushWorkaround = false;
        this.codecNeedsSosFlushWorkaround = false;
        this.codecNeedsEosFlushWorkaround = false;
        this.codecNeedsEosOutputExceptionWorkaround = false;
        this.codecNeedsEosBufferTimestampWorkaround = false;
        this.codecNeedsMonoChannelCountWorkaround = false;
        this.codecNeedsEosPropagation = false;
        this.codecRegisteredOnBufferAvailableListener = false;
        this.codecReconfigured = false;
        this.codecReconfigurationState = 0;
    }

    protected androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException createDecoderException(java.lang.Throwable th, androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo) {
        return new androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException(th, mediaCodecInfo);
    }

    private boolean readSourceOmittingSampleData(int i) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.FormatHolder formatHolder = getFormatHolder();
        this.noDataBuffer.clear();
        int source = readSource(formatHolder, this.noDataBuffer, i | 4);
        if (source == -5) {
            onInputFormatChanged(formatHolder);
            return true;
        }
        if (source != -4 || !this.noDataBuffer.isEndOfStream()) {
            return false;
        }
        this.inputStreamEnded = true;
        processEndOfStream();
        return false;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"this.codecDrmSession"})
    private boolean initMediaCryptoIfDrmSessionReady() throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.common.util.Assertions.checkState(this.mediaCrypto == null);
        androidx.media3.exoplayer.drm.DrmSession drmSession = this.codecDrmSession;
        androidx.media3.decoder.CryptoConfig cryptoConfig = drmSession.getCryptoConfig();
        if (androidx.media3.exoplayer.drm.FrameworkCryptoConfig.WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC && (cryptoConfig instanceof androidx.media3.exoplayer.drm.FrameworkCryptoConfig)) {
            int state = drmSession.getState();
            if (state == 1) {
                androidx.media3.exoplayer.drm.DrmSession.DrmSessionException drmSessionException = (androidx.media3.exoplayer.drm.DrmSession.DrmSessionException) androidx.media3.common.util.Assertions.checkNotNull(drmSession.getError());
                throw createRendererException(drmSessionException, this.inputFormat, drmSessionException.errorCode);
            }
            if (state != 4) {
                return false;
            }
        }
        if (cryptoConfig == null) {
            return drmSession.getError() != null;
        }
        if (cryptoConfig instanceof androidx.media3.exoplayer.drm.FrameworkCryptoConfig) {
            androidx.media3.exoplayer.drm.FrameworkCryptoConfig frameworkCryptoConfig = (androidx.media3.exoplayer.drm.FrameworkCryptoConfig) cryptoConfig;
            try {
                this.mediaCrypto = new android.media.MediaCrypto(frameworkCryptoConfig.uuid, frameworkCryptoConfig.sessionId);
            } catch (android.media.MediaCryptoException e) {
                throw createRendererException(e, this.inputFormat, androidx.media3.common.PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
            }
        }
        return true;
    }

    private void maybeInitCodecWithFallback(android.media.MediaCrypto mediaCrypto, boolean z) throws androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException {
        androidx.media3.common.Format format = (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.inputFormat);
        if (this.availableCodecInfos == null) {
            try {
                java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> availableCodecInfos = getAvailableCodecInfos(z);
                java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> arrayDeque = new java.util.ArrayDeque<>();
                this.availableCodecInfos = arrayDeque;
                if (this.enableDecoderFallback) {
                    arrayDeque.addAll(availableCodecInfos);
                } else if (!availableCodecInfos.isEmpty()) {
                    this.availableCodecInfos.add(availableCodecInfos.get(0));
                }
                this.preferredDecoderInitializationException = null;
            } catch (androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException e) {
                throw new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException(format, e, z, -49998);
            }
        }
        if (this.availableCodecInfos.isEmpty()) {
            throw new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException(format, (java.lang.Throwable) null, z, -49999);
        }
        java.util.ArrayDeque arrayDeque2 = (java.util.ArrayDeque) androidx.media3.common.util.Assertions.checkNotNull(this.availableCodecInfos);
        while (this.codec == null) {
            androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo = (androidx.media3.exoplayer.mediacodec.MediaCodecInfo) androidx.media3.common.util.Assertions.checkNotNull((androidx.media3.exoplayer.mediacodec.MediaCodecInfo) arrayDeque2.peekFirst());
            if (!shouldInitCodec(mediaCodecInfo)) {
                return;
            }
            try {
                initCodec(mediaCodecInfo, mediaCrypto);
            } catch (java.lang.Exception e2) {
                androidx.media3.common.util.Log.w(TAG, "Failed to initialize decoder: " + mediaCodecInfo, e2);
                arrayDeque2.removeFirst();
                androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException decoderInitializationException = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException(format, e2, z, mediaCodecInfo);
                onCodecError(decoderInitializationException);
                if (this.preferredDecoderInitializationException != null) {
                    this.preferredDecoderInitializationException = this.preferredDecoderInitializationException.copyWithFallbackException(decoderInitializationException);
                } else {
                    this.preferredDecoderInitializationException = decoderInitializationException;
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.preferredDecoderInitializationException;
                }
            }
        }
        this.availableCodecInfos = null;
    }

    private java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> getAvailableCodecInfos(boolean z) throws androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException {
        androidx.media3.common.Format format = (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.inputFormat);
        java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> decoderInfos = getDecoderInfos(this.mediaCodecSelector, format, z);
        if (decoderInfos.isEmpty() && z) {
            decoderInfos = getDecoderInfos(this.mediaCodecSelector, format, false);
            if (!decoderInfos.isEmpty()) {
                androidx.media3.common.util.Log.w(TAG, "Drm session requires secure decoder for " + format.sampleMimeType + ", but no secure decoder available. Trying to proceed with " + decoderInfos + ".");
            }
        }
        return decoderInfos;
    }

    private void initBypass(androidx.media3.common.Format format) {
        disableBypass();
        java.lang.String str = format.sampleMimeType;
        if (!androidx.media3.common.MimeTypes.AUDIO_AAC.equals(str) && !androidx.media3.common.MimeTypes.AUDIO_MPEG.equals(str) && !androidx.media3.common.MimeTypes.AUDIO_OPUS.equals(str)) {
            this.bypassBatchBuffer.setMaxSampleCount(1);
        } else {
            this.bypassBatchBuffer.setMaxSampleCount(32);
        }
        this.bypassEnabled = true;
    }

    private void initCodec(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, android.media.MediaCrypto mediaCrypto) throws java.lang.Exception {
        androidx.media3.common.Format format = (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.inputFormat);
        java.lang.String str = mediaCodecInfo.name;
        float codecOperatingRateV23 = androidx.media3.common.util.Util.SDK_INT < 23 ? -1.0f : getCodecOperatingRateV23(this.targetPlaybackSpeed, format, getStreamFormats());
        float f = codecOperatingRateV23 > this.assumedMinimumCodecOperatingRate ? codecOperatingRateV23 : -1.0f;
        onReadyToInitializeCodec(format);
        long jElapsedRealtime = getClock().elapsedRealtime();
        androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration mediaCodecConfiguration = getMediaCodecConfiguration(mediaCodecInfo, format, mediaCrypto, f);
        if (androidx.media3.common.util.Util.SDK_INT >= 31) {
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.Api31.setLogSessionIdToMediaCodecFormat(mediaCodecConfiguration, getPlayerId());
        }
        try {
            androidx.media3.common.util.TraceUtil.beginSection("createCodec:" + str);
            this.codec = this.codecAdapterFactory.createAdapter(mediaCodecConfiguration);
            this.codecRegisteredOnBufferAvailableListener = androidx.media3.common.util.Util.SDK_INT >= 21 && androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.Api21.registerOnBufferAvailableListener(this.codec, new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.MediaCodecRendererCodecAdapterListener());
            androidx.media3.common.util.TraceUtil.endSection();
            long jElapsedRealtime2 = getClock().elapsedRealtime();
            if (!mediaCodecInfo.isFormatSupported(format)) {
                androidx.media3.common.util.Log.w(TAG, androidx.media3.common.util.Util.formatInvariant("Format exceeds selected codec's capabilities [%s, %s]", androidx.media3.common.Format.toLogString(format), str));
            }
            this.codecInfo = mediaCodecInfo;
            this.codecOperatingRate = f;
            this.codecInputFormat = format;
            this.codecAdaptationWorkaroundMode = codecAdaptationWorkaroundMode(str);
            this.codecNeedsDiscardToSpsWorkaround = codecNeedsDiscardToSpsWorkaround(str, (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.codecInputFormat));
            this.codecNeedsFlushWorkaround = codecNeedsFlushWorkaround(str);
            this.codecNeedsSosFlushWorkaround = codecNeedsSosFlushWorkaround(str);
            this.codecNeedsEosFlushWorkaround = codecNeedsEosFlushWorkaround(str);
            this.codecNeedsEosOutputExceptionWorkaround = codecNeedsEosOutputExceptionWorkaround(str);
            this.codecNeedsEosBufferTimestampWorkaround = codecNeedsEosBufferTimestampWorkaround(str);
            this.codecNeedsMonoChannelCountWorkaround = false;
            this.codecNeedsEosPropagation = codecNeedsEosPropagationWorkaround(mediaCodecInfo) || getCodecNeedsEosPropagation();
            if (((androidx.media3.exoplayer.mediacodec.MediaCodecAdapter) androidx.media3.common.util.Assertions.checkNotNull(this.codec)).needsReconfiguration()) {
                this.codecReconfigured = true;
                this.codecReconfigurationState = 1;
                this.codecNeedsAdaptationWorkaroundBuffer = this.codecAdaptationWorkaroundMode != 0;
            }
            if (getState() == 2) {
                this.codecHotswapDeadlineMs = getClock().elapsedRealtime() + 1000;
            }
            this.decoderCounters.decoderInitCount++;
            onCodecInitialized(str, mediaCodecConfiguration, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (java.lang.Throwable th) {
            androidx.media3.common.util.TraceUtil.endSection();
            throw th;
        }
    }

    private boolean shouldContinueRendering(long j) {
        return this.renderTimeLimitMs == androidx.media3.common.C.TIME_UNSET || getClock().elapsedRealtime() - j < this.renderTimeLimitMs;
    }

    private boolean hasOutputBuffer() {
        return this.outputIndex >= 0;
    }

    private void resetInputBuffer() {
        this.inputIndex = -1;
        this.buffer.data = null;
    }

    private void resetOutputBuffer() {
        this.outputIndex = -1;
        this.outputBuffer = null;
    }

    private void setSourceDrmSession(androidx.media3.exoplayer.drm.DrmSession drmSession) {
        androidx.media3.exoplayer.drm.DrmSession.replaceSession(this.sourceDrmSession, drmSession);
        this.sourceDrmSession = drmSession;
    }

    private void setCodecDrmSession(androidx.media3.exoplayer.drm.DrmSession drmSession) {
        androidx.media3.exoplayer.drm.DrmSession.replaceSession(this.codecDrmSession, drmSession);
        this.codecDrmSession = drmSession;
    }

    private boolean feedInputBuffer() throws androidx.media3.exoplayer.ExoPlaybackException {
        int i;
        if (this.codec == null || (i = this.codecDrainState) == 2 || this.inputStreamEnded) {
            return false;
        }
        if (i == 0 && shouldReinitCodec()) {
            drainAndReinitializeCodec();
        }
        androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter = (androidx.media3.exoplayer.mediacodec.MediaCodecAdapter) androidx.media3.common.util.Assertions.checkNotNull(this.codec);
        if (this.inputIndex < 0) {
            int iDequeueInputBufferIndex = mediaCodecAdapter.dequeueInputBufferIndex();
            this.inputIndex = iDequeueInputBufferIndex;
            if (iDequeueInputBufferIndex < 0) {
                return false;
            }
            this.buffer.data = mediaCodecAdapter.getInputBuffer(iDequeueInputBufferIndex);
            this.buffer.clear();
        }
        if (this.codecDrainState == 1) {
            if (!this.codecNeedsEosPropagation) {
                this.codecReceivedEos = true;
                mediaCodecAdapter.queueInputBuffer(this.inputIndex, 0, 0, 0L, 4);
                resetInputBuffer();
            }
            this.codecDrainState = 2;
            return false;
        }
        if (this.codecNeedsAdaptationWorkaroundBuffer) {
            this.codecNeedsAdaptationWorkaroundBuffer = false;
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkNotNull(this.buffer.data);
            byte[] bArr = ADAPTATION_WORKAROUND_BUFFER;
            byteBuffer.put(bArr);
            mediaCodecAdapter.queueInputBuffer(this.inputIndex, 0, bArr.length, 0L, 0);
            resetInputBuffer();
            this.codecReceivedBuffers = true;
            return true;
        }
        if (this.codecReconfigurationState == 1) {
            for (int i2 = 0; i2 < ((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.codecInputFormat)).initializationData.size(); i2++) {
                ((java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkNotNull(this.buffer.data)).put(this.codecInputFormat.initializationData.get(i2));
            }
            this.codecReconfigurationState = 2;
        }
        int iPosition = ((java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkNotNull(this.buffer.data)).position();
        androidx.media3.exoplayer.FormatHolder formatHolder = getFormatHolder();
        try {
            int source = readSource(formatHolder, this.buffer, 0);
            if (source == -3) {
                if (hasReadStreamToEnd()) {
                    this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
                }
                return false;
            }
            if (source == -5) {
                if (this.codecReconfigurationState == 2) {
                    this.buffer.clear();
                    this.codecReconfigurationState = 1;
                }
                onInputFormatChanged(formatHolder);
                return true;
            }
            if (this.buffer.isEndOfStream()) {
                this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
                if (this.codecReconfigurationState == 2) {
                    this.buffer.clear();
                    this.codecReconfigurationState = 1;
                }
                this.inputStreamEnded = true;
                if (!this.codecReceivedBuffers) {
                    processEndOfStream();
                    return false;
                }
                try {
                    if (!this.codecNeedsEosPropagation) {
                        this.codecReceivedEos = true;
                        mediaCodecAdapter.queueInputBuffer(this.inputIndex, 0, 0, 0L, 4);
                        resetInputBuffer();
                    }
                    return false;
                } catch (android.media.MediaCodec.CryptoException e) {
                    throw createRendererException(e, this.inputFormat, androidx.media3.common.util.Util.getErrorCodeForMediaDrmErrorCode(e.getErrorCode()));
                }
            }
            if (!this.codecReceivedBuffers && !this.buffer.isKeyFrame()) {
                this.buffer.clear();
                if (this.codecReconfigurationState == 2) {
                    this.codecReconfigurationState = 1;
                }
                return true;
            }
            boolean zIsEncrypted = this.buffer.isEncrypted();
            if (zIsEncrypted) {
                this.buffer.cryptoInfo.increaseClearDataFirstSubSampleBy(iPosition);
            }
            if (this.codecNeedsDiscardToSpsWorkaround && !zIsEncrypted) {
                androidx.media3.container.NalUnitUtil.discardToSps((java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkNotNull(this.buffer.data));
                if (((java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkNotNull(this.buffer.data)).position() == 0) {
                    return true;
                }
                this.codecNeedsDiscardToSpsWorkaround = false;
            }
            long j = this.buffer.timeUs;
            if (this.waitingForFirstSampleInFormat) {
                if (!this.pendingOutputStreamChanges.isEmpty()) {
                    this.pendingOutputStreamChanges.peekLast().formatQueue.add(j, (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.inputFormat));
                } else {
                    this.outputStreamInfo.formatQueue.add(j, (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.inputFormat));
                }
                this.waitingForFirstSampleInFormat = false;
            }
            this.largestQueuedPresentationTimeUs = java.lang.Math.max(this.largestQueuedPresentationTimeUs, j);
            if (hasReadStreamToEnd() || this.buffer.isLastSample()) {
                this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
            }
            this.buffer.flip();
            if (this.buffer.hasSupplementalData()) {
                handleInputBufferSupplementalData(this.buffer);
            }
            onQueueInputBuffer(this.buffer);
            int codecBufferFlags = getCodecBufferFlags(this.buffer);
            try {
                if (zIsEncrypted) {
                    ((androidx.media3.exoplayer.mediacodec.MediaCodecAdapter) androidx.media3.common.util.Assertions.checkNotNull(mediaCodecAdapter)).queueSecureInputBuffer(this.inputIndex, 0, this.buffer.cryptoInfo, j, codecBufferFlags);
                } else {
                    ((androidx.media3.exoplayer.mediacodec.MediaCodecAdapter) androidx.media3.common.util.Assertions.checkNotNull(mediaCodecAdapter)).queueInputBuffer(this.inputIndex, 0, ((java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkNotNull(this.buffer.data)).limit(), j, codecBufferFlags);
                }
                resetInputBuffer();
                this.codecReceivedBuffers = true;
                this.codecReconfigurationState = 0;
                this.decoderCounters.queuedInputBufferCount++;
                return true;
            } catch (android.media.MediaCodec.CryptoException e2) {
                throw createRendererException(e2, this.inputFormat, androidx.media3.common.util.Util.getErrorCodeForMediaDrmErrorCode(e2.getErrorCode()));
            }
        } catch (androidx.media3.decoder.DecoderInputBuffer.InsufficientCapacityException e3) {
            onCodecError(e3);
            readSourceOmittingSampleData(0);
            flushCodec();
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00f8  */
    protected androidx.media3.exoplayer.DecoderReuseEvaluation onInputFormatChanged(androidx.media3.exoplayer.FormatHolder formatHolder) throws androidx.media3.exoplayer.ExoPlaybackException {
        int i;
        boolean z = true;
        this.waitingForFirstSampleInFormat = true;
        androidx.media3.common.Format formatBuild = (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(formatHolder.format);
        if (formatBuild.sampleMimeType == null) {
            throw createRendererException(new java.lang.IllegalArgumentException("Sample MIME type is null."), formatBuild, 4005);
        }
        if (java.util.Objects.equals(formatBuild.sampleMimeType, "video/av01") && !formatBuild.initializationData.isEmpty()) {
            formatBuild = formatBuild.buildUpon().setInitializationData(null).build();
        }
        androidx.media3.common.Format format = formatBuild;
        setSourceDrmSession(formatHolder.drmSession);
        this.inputFormat = format;
        if (this.bypassEnabled) {
            this.bypassDrainAndReinitialize = true;
            return null;
        }
        androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter = this.codec;
        if (mediaCodecAdapter == null) {
            this.availableCodecInfos = null;
            maybeInitCodecOrBypass();
            return null;
        }
        androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo = (androidx.media3.exoplayer.mediacodec.MediaCodecInfo) androidx.media3.common.util.Assertions.checkNotNull(this.codecInfo);
        androidx.media3.common.Format format2 = (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.codecInputFormat);
        if (drmNeedsCodecReinitialization(mediaCodecInfo, format, this.codecDrmSession, this.sourceDrmSession)) {
            drainAndReinitializeCodec();
            return new androidx.media3.exoplayer.DecoderReuseEvaluation(mediaCodecInfo.name, format2, format, 0, 128);
        }
        boolean z2 = this.sourceDrmSession != this.codecDrmSession;
        androidx.media3.common.util.Assertions.checkState(!z2 || androidx.media3.common.util.Util.SDK_INT >= 23);
        androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluationCanReuseCodec = canReuseCodec(mediaCodecInfo, format2, format);
        int i2 = decoderReuseEvaluationCanReuseCodec.result;
        if (i2 != 0) {
            i = 16;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (updateCodecOperatingRate(format)) {
                            this.codecInputFormat = format;
                            if (z2 && !drainAndUpdateCodecDrmSessionV23()) {
                                i = 2;
                            }
                        }
                    } else {
                        throw new java.lang.IllegalStateException();
                    }
                } else if (updateCodecOperatingRate(format)) {
                    this.codecReconfigured = true;
                    this.codecReconfigurationState = 1;
                    int i3 = this.codecAdaptationWorkaroundMode;
                    if (i3 != 2 && (i3 != 1 || format.width != format2.width || format.height != format2.height)) {
                        z = false;
                    }
                    this.codecNeedsAdaptationWorkaroundBuffer = z;
                    this.codecInputFormat = format;
                    if (z2 && !drainAndUpdateCodecDrmSessionV23()) {
                        i = 2;
                    }
                }
            } else if (updateCodecOperatingRate(format)) {
                this.codecInputFormat = format;
                if (!z2 ? !drainAndFlushCodec() : !drainAndUpdateCodecDrmSessionV23()) {
                    i = 2;
                }
            }
            return (decoderReuseEvaluationCanReuseCodec.result != 0 || (this.codec == mediaCodecAdapter && this.codecDrainAction != 3)) ? decoderReuseEvaluationCanReuseCodec : new androidx.media3.exoplayer.DecoderReuseEvaluation(mediaCodecInfo.name, format2, format, 0, i);
        }
        drainAndReinitializeCodec();
        i = 0;
        if (decoderReuseEvaluationCanReuseCodec.result != 0) {
        }
    }

    protected long getLastBufferInStreamPresentationTimeUs() {
        return this.lastBufferInStreamPresentationTimeUs;
    }

    protected void onProcessedOutputBuffer(long j) {
        this.lastProcessedOutputBufferTimeUs = j;
        while (!this.pendingOutputStreamChanges.isEmpty() && j >= this.pendingOutputStreamChanges.peek().previousStreamLastBufferTimeUs) {
            setOutputStreamInfo((androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.OutputStreamInfo) androidx.media3.common.util.Assertions.checkNotNull(this.pendingOutputStreamChanges.poll()));
            onProcessedStreamChange();
        }
    }

    protected androidx.media3.exoplayer.DecoderReuseEvaluation canReuseCodec(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, androidx.media3.common.Format format, androidx.media3.common.Format format2) {
        return new androidx.media3.exoplayer.DecoderReuseEvaluation(mediaCodecInfo.name, format, format2, 0, 1);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return this.inputFormat != null && (isSourceReady() || hasOutputBuffer() || (this.codecHotswapDeadlineMs != androidx.media3.common.C.TIME_UNSET && getClock().elapsedRealtime() < this.codecHotswapDeadlineMs));
    }

    protected float getPlaybackSpeed() {
        return this.currentPlaybackSpeed;
    }

    protected float getCodecOperatingRate() {
        return this.codecOperatingRate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final androidx.media3.exoplayer.Renderer.WakeupListener getWakeupListener() {
        return this.wakeupListener;
    }

    protected final boolean updateCodecOperatingRate() throws androidx.media3.exoplayer.ExoPlaybackException {
        return updateCodecOperatingRate(this.codecInputFormat);
    }

    private boolean updateCodecOperatingRate(androidx.media3.common.Format format) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (androidx.media3.common.util.Util.SDK_INT >= 23 && this.codec != null && this.codecDrainAction != 3 && getState() != 0) {
            float codecOperatingRateV23 = getCodecOperatingRateV23(this.targetPlaybackSpeed, (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(format), getStreamFormats());
            float f = this.codecOperatingRate;
            if (f == codecOperatingRateV23) {
                return true;
            }
            if (codecOperatingRateV23 == -1.0f) {
                drainAndReinitializeCodec();
                return false;
            }
            if (f == -1.0f && codecOperatingRateV23 <= this.assumedMinimumCodecOperatingRate) {
                return true;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putFloat("operating-rate", codecOperatingRateV23);
            ((androidx.media3.exoplayer.mediacodec.MediaCodecAdapter) androidx.media3.common.util.Assertions.checkNotNull(this.codec)).setParameters(bundle);
            this.codecOperatingRate = codecOperatingRateV23;
        }
        return true;
    }

    private boolean drainAndFlushCodec() {
        if (this.codecReceivedBuffers) {
            this.codecDrainState = 1;
            if (this.codecNeedsFlushWorkaround || this.codecNeedsEosFlushWorkaround) {
                this.codecDrainAction = 3;
                return false;
            }
            this.codecDrainAction = 1;
        }
        return true;
    }

    private boolean drainAndUpdateCodecDrmSessionV23() throws androidx.media3.exoplayer.ExoPlaybackException {
        if (this.codecReceivedBuffers) {
            this.codecDrainState = 1;
            if (this.codecNeedsFlushWorkaround || this.codecNeedsEosFlushWorkaround) {
                this.codecDrainAction = 3;
                return false;
            }
            this.codecDrainAction = 2;
        } else {
            updateDrmSessionV23();
        }
        return true;
    }

    private void drainAndReinitializeCodec() throws androidx.media3.exoplayer.ExoPlaybackException {
        if (this.codecReceivedBuffers) {
            this.codecDrainState = 1;
            this.codecDrainAction = 3;
        } else {
            reinitializeCodec();
        }
    }

    private boolean drainOutputBuffer(long j, long j2) throws androidx.media3.exoplayer.ExoPlaybackException {
        boolean z;
        boolean zProcessOutputBuffer;
        int iDequeueOutputBufferIndex;
        androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter = (androidx.media3.exoplayer.mediacodec.MediaCodecAdapter) androidx.media3.common.util.Assertions.checkNotNull(this.codec);
        if (!hasOutputBuffer()) {
            if (this.codecNeedsEosOutputExceptionWorkaround && this.codecReceivedEos) {
                try {
                    iDequeueOutputBufferIndex = mediaCodecAdapter.dequeueOutputBufferIndex(this.outputBufferInfo);
                } catch (java.lang.IllegalStateException unused) {
                    processEndOfStream();
                    if (this.outputStreamEnded) {
                        releaseCodec();
                    }
                    return false;
                }
            } else {
                iDequeueOutputBufferIndex = mediaCodecAdapter.dequeueOutputBufferIndex(this.outputBufferInfo);
            }
            if (iDequeueOutputBufferIndex < 0) {
                if (iDequeueOutputBufferIndex == -2) {
                    processOutputMediaFormatChanged();
                    return true;
                }
                if (this.codecNeedsEosPropagation && (this.inputStreamEnded || this.codecDrainState == 2)) {
                    processEndOfStream();
                }
                return false;
            }
            if (this.shouldSkipAdaptationWorkaroundOutputBuffer) {
                this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
                mediaCodecAdapter.releaseOutputBuffer(iDequeueOutputBufferIndex, false);
                return true;
            }
            if (this.outputBufferInfo.size == 0 && (this.outputBufferInfo.flags & 4) != 0) {
                processEndOfStream();
                return false;
            }
            this.outputIndex = iDequeueOutputBufferIndex;
            java.nio.ByteBuffer outputBuffer = mediaCodecAdapter.getOutputBuffer(iDequeueOutputBufferIndex);
            this.outputBuffer = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(this.outputBufferInfo.offset);
                this.outputBuffer.limit(this.outputBufferInfo.offset + this.outputBufferInfo.size);
            }
            if (this.codecNeedsEosBufferTimestampWorkaround && this.outputBufferInfo.presentationTimeUs == 0 && (this.outputBufferInfo.flags & 4) != 0 && this.largestQueuedPresentationTimeUs != androidx.media3.common.C.TIME_UNSET) {
                this.outputBufferInfo.presentationTimeUs = this.lastBufferInStreamPresentationTimeUs;
            }
            this.isDecodeOnlyOutputBuffer = this.outputBufferInfo.presentationTimeUs < getLastResetPositionUs();
            long j3 = this.lastBufferInStreamPresentationTimeUs;
            this.isLastOutputBuffer = j3 != androidx.media3.common.C.TIME_UNSET && j3 <= this.outputBufferInfo.presentationTimeUs;
            updateOutputFormatForTime(this.outputBufferInfo.presentationTimeUs);
        }
        if (this.codecNeedsEosOutputExceptionWorkaround && this.codecReceivedEos) {
            try {
                z = false;
                try {
                    zProcessOutputBuffer = processOutputBuffer(j, j2, mediaCodecAdapter, this.outputBuffer, this.outputIndex, this.outputBufferInfo.flags, 1, this.outputBufferInfo.presentationTimeUs, this.isDecodeOnlyOutputBuffer, this.isLastOutputBuffer, (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.outputFormat));
                } catch (java.lang.IllegalStateException unused2) {
                    processEndOfStream();
                    if (this.outputStreamEnded) {
                        releaseCodec();
                    }
                    return z;
                }
            } catch (java.lang.IllegalStateException unused3) {
                z = false;
            }
        } else {
            z = false;
            zProcessOutputBuffer = processOutputBuffer(j, j2, mediaCodecAdapter, this.outputBuffer, this.outputIndex, this.outputBufferInfo.flags, 1, this.outputBufferInfo.presentationTimeUs, this.isDecodeOnlyOutputBuffer, this.isLastOutputBuffer, (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.outputFormat));
        }
        if (zProcessOutputBuffer) {
            onProcessedOutputBuffer(this.outputBufferInfo.presentationTimeUs);
            boolean z2 = (this.outputBufferInfo.flags & 4) != 0 ? true : z;
            resetOutputBuffer();
            if (!z2) {
                return true;
            }
            processEndOfStream();
        }
        return z;
    }

    private void processOutputMediaFormatChanged() {
        this.codecHasOutputMediaFormat = true;
        android.media.MediaFormat outputFormat = ((androidx.media3.exoplayer.mediacodec.MediaCodecAdapter) androidx.media3.common.util.Assertions.checkNotNull(this.codec)).getOutputFormat();
        if (this.codecAdaptationWorkaroundMode != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.shouldSkipAdaptationWorkaroundOutputBuffer = true;
            return;
        }
        if (this.codecNeedsMonoChannelCountWorkaround) {
            outputFormat.setInteger("channel-count", 1);
        }
        this.codecOutputMediaFormat = outputFormat;
        this.codecOutputMediaFormatChanged = true;
    }

    private void processEndOfStream() throws androidx.media3.exoplayer.ExoPlaybackException {
        int i = this.codecDrainAction;
        if (i == 1) {
            flushCodec();
            return;
        }
        if (i == 2) {
            flushCodec();
            updateDrmSessionV23();
        } else if (i == 3) {
            reinitializeCodec();
        } else {
            this.outputStreamEnded = true;
            renderToEndOfStream();
        }
    }

    protected final void setPendingOutputEndOfStream() {
        this.pendingOutputEndOfStream = true;
    }

    protected final long getOutputStreamOffsetUs() {
        return this.outputStreamInfo.streamOffsetUs;
    }

    protected final long getOutputStreamStartPositionUs() {
        return this.outputStreamInfo.startPositionUs;
    }

    private void setOutputStreamInfo(androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.OutputStreamInfo outputStreamInfo) {
        this.outputStreamInfo = outputStreamInfo;
        if (outputStreamInfo.streamOffsetUs != androidx.media3.common.C.TIME_UNSET) {
            this.needToNotifyOutputFormatChangeAfterStreamChange = true;
            onOutputStreamOffsetUsChanged(outputStreamInfo.streamOffsetUs);
        }
    }

    protected static boolean supportsFormatDrm(androidx.media3.common.Format format) {
        return format.cryptoType == 0 || format.cryptoType == 2;
    }

    private boolean drmNeedsCodecReinitialization(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, androidx.media3.common.Format format, androidx.media3.exoplayer.drm.DrmSession drmSession, androidx.media3.exoplayer.drm.DrmSession drmSession2) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.decoder.CryptoConfig cryptoConfig;
        androidx.media3.decoder.CryptoConfig cryptoConfig2;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 != null && drmSession != null && (cryptoConfig = drmSession2.getCryptoConfig()) != null && (cryptoConfig2 = drmSession.getCryptoConfig()) != null && cryptoConfig.getClass().equals(cryptoConfig2.getClass())) {
            if (!(cryptoConfig instanceof androidx.media3.exoplayer.drm.FrameworkCryptoConfig)) {
                return false;
            }
            if (drmSession2.getSchemeUuid().equals(drmSession.getSchemeUuid()) && androidx.media3.common.util.Util.SDK_INT >= 23 && !androidx.media3.common.C.PLAYREADY_UUID.equals(drmSession.getSchemeUuid()) && !androidx.media3.common.C.PLAYREADY_UUID.equals(drmSession2.getSchemeUuid())) {
                return !mediaCodecInfo.secure && drmSession2.requiresSecureDecoder((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(format.sampleMimeType));
            }
        }
        return true;
    }

    private void reinitializeCodec() throws androidx.media3.exoplayer.ExoPlaybackException {
        releaseCodec();
        maybeInitCodecOrBypass();
    }

    private void updateDrmSessionV23() throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.decoder.CryptoConfig cryptoConfig = ((androidx.media3.exoplayer.drm.DrmSession) androidx.media3.common.util.Assertions.checkNotNull(this.sourceDrmSession)).getCryptoConfig();
        if (cryptoConfig instanceof androidx.media3.exoplayer.drm.FrameworkCryptoConfig) {
            try {
                ((android.media.MediaCrypto) androidx.media3.common.util.Assertions.checkNotNull(this.mediaCrypto)).setMediaDrmSession(((androidx.media3.exoplayer.drm.FrameworkCryptoConfig) cryptoConfig).sessionId);
            } catch (android.media.MediaCryptoException e) {
                throw createRendererException(e, this.inputFormat, androidx.media3.common.PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
            }
        }
        setCodecDrmSession(this.sourceDrmSession);
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
    }

    private boolean bypassRender(long j, long j2) throws androidx.media3.exoplayer.ExoPlaybackException {
        boolean z;
        androidx.media3.common.util.Assertions.checkState(!this.outputStreamEnded);
        if (!this.bypassBatchBuffer.hasSamples()) {
            z = false;
        } else {
            if (!processOutputBuffer(j, j2, null, this.bypassBatchBuffer.data, this.outputIndex, 0, this.bypassBatchBuffer.getSampleCount(), this.bypassBatchBuffer.getFirstSampleTimeUs(), isDecodeOnly(getLastResetPositionUs(), this.bypassBatchBuffer.getLastSampleTimeUs()), this.bypassBatchBuffer.isEndOfStream(), (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.outputFormat))) {
                return false;
            }
            onProcessedOutputBuffer(this.bypassBatchBuffer.getLastSampleTimeUs());
            this.bypassBatchBuffer.clear();
            z = false;
        }
        if (this.inputStreamEnded) {
            this.outputStreamEnded = true;
            return z;
        }
        if (this.bypassSampleBufferPending) {
            androidx.media3.common.util.Assertions.checkState(this.bypassBatchBuffer.append(this.bypassSampleBuffer));
            this.bypassSampleBufferPending = z;
        }
        if (this.bypassDrainAndReinitialize) {
            if (this.bypassBatchBuffer.hasSamples()) {
                return true;
            }
            disableBypass();
            this.bypassDrainAndReinitialize = z;
            maybeInitCodecOrBypass();
            if (!this.bypassEnabled) {
                return z;
            }
        }
        bypassRead();
        if (this.bypassBatchBuffer.hasSamples()) {
            this.bypassBatchBuffer.flip();
        }
        if (this.bypassBatchBuffer.hasSamples() || this.inputStreamEnded || this.bypassDrainAndReinitialize) {
            return true;
        }
        return z;
    }

    private void bypassRead() throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.common.util.Assertions.checkState(!this.inputStreamEnded);
        androidx.media3.exoplayer.FormatHolder formatHolder = getFormatHolder();
        this.bypassSampleBuffer.clear();
        do {
            this.bypassSampleBuffer.clear();
            int source = readSource(formatHolder, this.bypassSampleBuffer, 0);
            if (source == -5) {
                onInputFormatChanged(formatHolder);
                return;
            }
            if (source == -4) {
                if (this.bypassSampleBuffer.isEndOfStream()) {
                    this.inputStreamEnded = true;
                    this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
                    return;
                }
                this.largestQueuedPresentationTimeUs = java.lang.Math.max(this.largestQueuedPresentationTimeUs, this.bypassSampleBuffer.timeUs);
                if (hasReadStreamToEnd() || this.buffer.isLastSample()) {
                    this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
                }
                if (this.waitingForFirstSampleInFormat) {
                    androidx.media3.common.Format format = (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.inputFormat);
                    this.outputFormat = format;
                    if (java.util.Objects.equals(format.sampleMimeType, androidx.media3.common.MimeTypes.AUDIO_OPUS) && !this.outputFormat.initializationData.isEmpty()) {
                        this.outputFormat = ((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.outputFormat)).buildUpon().setEncoderDelay(androidx.media3.extractor.OpusUtil.getPreSkipSamples(this.outputFormat.initializationData.get(0))).build();
                    }
                    onOutputFormatChanged(this.outputFormat, null);
                    this.waitingForFirstSampleInFormat = false;
                }
                this.bypassSampleBuffer.flip();
                androidx.media3.common.Format format2 = this.outputFormat;
                if (format2 != null && java.util.Objects.equals(format2.sampleMimeType, androidx.media3.common.MimeTypes.AUDIO_OPUS)) {
                    if (this.bypassSampleBuffer.hasSupplementalData()) {
                        this.bypassSampleBuffer.format = this.outputFormat;
                        handleInputBufferSupplementalData(this.bypassSampleBuffer);
                    }
                    if (androidx.media3.extractor.OpusUtil.needToDecodeOpusFrame(getLastResetPositionUs(), this.bypassSampleBuffer.timeUs)) {
                        this.oggOpusAudioPacketizer.packetize(this.bypassSampleBuffer, ((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.outputFormat)).initializationData);
                    }
                }
                if (!haveBypassBatchBufferAndNewSampleSameDecodeOnlyState()) {
                    break;
                }
            } else {
                if (source == -3) {
                    if (hasReadStreamToEnd()) {
                        this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
                        return;
                    }
                    return;
                }
                throw new java.lang.IllegalStateException();
            }
        } while (this.bypassBatchBuffer.append(this.bypassSampleBuffer));
        this.bypassSampleBufferPending = true;
    }

    private boolean haveBypassBatchBufferAndNewSampleSameDecodeOnlyState() {
        if (!this.bypassBatchBuffer.hasSamples()) {
            return true;
        }
        long lastResetPositionUs = getLastResetPositionUs();
        return isDecodeOnly(lastResetPositionUs, this.bypassBatchBuffer.getLastSampleTimeUs()) == isDecodeOnly(lastResetPositionUs, this.bypassSampleBuffer.timeUs);
    }

    private boolean isDecodeOnly(long j, long j2) {
        androidx.media3.common.Format format;
        return j2 < j && !((format = this.outputFormat) != null && java.util.Objects.equals(format.sampleMimeType, androidx.media3.common.MimeTypes.AUDIO_OPUS) && androidx.media3.extractor.OpusUtil.needToDecodeOpusFrame(j, j2));
    }

    private static boolean isMediaCodecException(java.lang.IllegalStateException illegalStateException) {
        if (androidx.media3.common.util.Util.SDK_INT >= 21 && isMediaCodecExceptionV21(illegalStateException)) {
            return true;
        }
        java.lang.StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private static boolean isMediaCodecExceptionV21(java.lang.IllegalStateException illegalStateException) {
        return illegalStateException instanceof android.media.MediaCodec.CodecException;
    }

    private static boolean isRecoverableMediaCodecExceptionV21(java.lang.IllegalStateException illegalStateException) {
        if (illegalStateException instanceof android.media.MediaCodec.CodecException) {
            return ((android.media.MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    private static boolean codecNeedsFlushWorkaround(java.lang.String str) {
        return androidx.media3.common.util.Util.SDK_INT == 19 && androidx.media3.common.util.Util.MODEL.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str));
    }

    private int codecAdaptationWorkaroundMode(java.lang.String str) {
        if (androidx.media3.common.util.Util.SDK_INT <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (androidx.media3.common.util.Util.MODEL.startsWith("SM-T585") || androidx.media3.common.util.Util.MODEL.startsWith("SM-A510") || androidx.media3.common.util.Util.MODEL.startsWith("SM-A520") || androidx.media3.common.util.Util.MODEL.startsWith("SM-J700"))) {
            return 2;
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 24) {
            return 0;
        }
        if ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) {
            return ("flounder".equals(androidx.media3.common.util.Util.DEVICE) || "flounder_lte".equals(androidx.media3.common.util.Util.DEVICE) || "grouper".equals(androidx.media3.common.util.Util.DEVICE) || "tilapia".equals(androidx.media3.common.util.Util.DEVICE)) ? 1 : 0;
        }
        return 0;
    }

    private static boolean codecNeedsDiscardToSpsWorkaround(java.lang.String str, androidx.media3.common.Format format) {
        return androidx.media3.common.util.Util.SDK_INT < 21 && format.initializationData.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private static boolean codecNeedsSosFlushWorkaround(java.lang.String str) {
        return androidx.media3.common.util.Util.SDK_INT == 29 && "c2.android.aac.decoder".equals(str);
    }

    private static boolean codecNeedsEosPropagationWorkaround(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo) {
        java.lang.String str = mediaCodecInfo.name;
        return (androidx.media3.common.util.Util.SDK_INT <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (androidx.media3.common.util.Util.SDK_INT <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || ("Amazon".equals(androidx.media3.common.util.Util.MANUFACTURER) && "AFTS".equals(androidx.media3.common.util.Util.MODEL) && mediaCodecInfo.secure);
    }

    private static boolean codecNeedsEosFlushWorkaround(java.lang.String str) {
        return (androidx.media3.common.util.Util.SDK_INT <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (androidx.media3.common.util.Util.SDK_INT == 19 && (("hb2000".equals(androidx.media3.common.util.Util.DEVICE) || "stvm8".equals(androidx.media3.common.util.Util.DEVICE)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))));
    }

    private static boolean codecNeedsEosBufferTimestampWorkaround(java.lang.String str) {
        return androidx.media3.common.util.Util.SDK_INT < 21 && "OMX.SEC.mp3.dec".equals(str) && com.adjust.sdk.Constants.REFERRER_API_SAMSUNG.equals(androidx.media3.common.util.Util.MANUFACTURER) && (androidx.media3.common.util.Util.DEVICE.startsWith("baffin") || androidx.media3.common.util.Util.DEVICE.startsWith("grand") || androidx.media3.common.util.Util.DEVICE.startsWith("fortuna") || androidx.media3.common.util.Util.DEVICE.startsWith("gprimelte") || androidx.media3.common.util.Util.DEVICE.startsWith("j2y18lte") || androidx.media3.common.util.Util.DEVICE.startsWith("ms01"));
    }

    private static boolean codecNeedsEosOutputExceptionWorkaround(java.lang.String str) {
        return androidx.media3.common.util.Util.SDK_INT == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static final class OutputStreamInfo {
        public static final androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.OutputStreamInfo UNSET = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.OutputStreamInfo(androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET);
        public final androidx.media3.common.util.TimedValueQueue<androidx.media3.common.Format> formatQueue = new androidx.media3.common.util.TimedValueQueue<>();
        public final long previousStreamLastBufferTimeUs;
        public final long startPositionUs;
        public final long streamOffsetUs;

        public OutputStreamInfo(long j, long j2, long j3) {
            this.previousStreamLastBufferTimeUs = j;
            this.startPositionUs = j2;
            this.streamOffsetUs = j3;
        }
    }

    private static final class Api21 {
        private Api21() {
        }

        public static boolean registerOnBufferAvailableListener(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter, androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.MediaCodecRendererCodecAdapterListener mediaCodecRendererCodecAdapterListener) {
            return mediaCodecAdapter.registerOnBufferAvailableListener(mediaCodecRendererCodecAdapterListener);
        }
    }

    private static final class Api31 {
        private Api31() {
        }

        public static void setLogSessionIdToMediaCodecFormat(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration configuration, androidx.media3.exoplayer.analytics.PlayerId playerId) {
            android.media.metrics.LogSessionId logSessionId = playerId.getLogSessionId();
            if (logSessionId.equals(android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            configuration.mediaFormat.setString("log-session-id", logSessionId.getStringId());
        }
    }

    private final class MediaCodecRendererCodecAdapterListener implements androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener {
        private MediaCodecRendererCodecAdapterListener() {
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener
        public void onInputBufferAvailable() {
            if (androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.this.wakeupListener != null) {
                androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.this.wakeupListener.onWakeup();
            }
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener
        public void onOutputBufferAvailable() {
            if (androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.this.wakeupListener != null) {
                androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.this.wakeupListener.onWakeup();
            }
        }
    }
}
