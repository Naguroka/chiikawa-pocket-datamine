package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public abstract class DecoderAudioRenderer<T extends androidx.media3.decoder.Decoder<androidx.media3.decoder.DecoderInputBuffer, ? extends androidx.media3.decoder.SimpleDecoderOutputBuffer, ? extends androidx.media3.decoder.DecoderException>> extends androidx.media3.exoplayer.BaseRenderer implements androidx.media3.exoplayer.MediaClock {
    private static final int MAX_PENDING_OUTPUT_STREAM_OFFSET_COUNT = 10;
    private static final int REINITIALIZATION_STATE_NONE = 0;
    private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 2;
    private static final java.lang.String TAG = "DecoderAudioRenderer";
    private boolean allowPositionDiscontinuity;
    private final androidx.media3.exoplayer.audio.AudioSink audioSink;
    private boolean audioTrackNeedsConfigure;
    private long currentPositionUs;
    private T decoder;
    private androidx.media3.exoplayer.DecoderCounters decoderCounters;
    private androidx.media3.exoplayer.drm.DrmSession decoderDrmSession;
    private boolean decoderReceivedBuffers;
    private int decoderReinitializationState;
    private int encoderDelay;
    private int encoderPadding;
    private final androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher eventDispatcher;
    private boolean firstStreamSampleRead;
    private final androidx.media3.decoder.DecoderInputBuffer flagsOnlyBuffer;
    private boolean hasPendingReportedSkippedSilence;
    private androidx.media3.decoder.DecoderInputBuffer inputBuffer;
    private androidx.media3.common.Format inputFormat;
    private boolean inputStreamEnded;
    private androidx.media3.decoder.SimpleDecoderOutputBuffer outputBuffer;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs;
    private int pendingOutputStreamOffsetCount;
    private final long[] pendingOutputStreamOffsetsUs;
    private androidx.media3.exoplayer.drm.DrmSession sourceDrmSession;

    protected abstract T createDecoder(androidx.media3.common.Format format, androidx.media3.decoder.CryptoConfig cryptoConfig) throws androidx.media3.decoder.DecoderException;

    protected int[] getChannelMapping(T t) {
        return null;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public androidx.media3.exoplayer.MediaClock getMediaClock() {
        return this;
    }

    protected abstract androidx.media3.common.Format getOutputFormat(T t);

    protected abstract int supportsFormatInternal(androidx.media3.common.Format format);

    public DecoderAudioRenderer() {
        this((android.os.Handler) null, (androidx.media3.exoplayer.audio.AudioRendererEventListener) null, new androidx.media3.common.audio.AudioProcessor[0]);
    }

    public DecoderAudioRenderer(android.os.Handler handler, androidx.media3.exoplayer.audio.AudioRendererEventListener audioRendererEventListener, androidx.media3.common.audio.AudioProcessor... audioProcessorArr) {
        this(handler, audioRendererEventListener, null, audioProcessorArr);
    }

    public DecoderAudioRenderer(android.os.Handler handler, androidx.media3.exoplayer.audio.AudioRendererEventListener audioRendererEventListener, androidx.media3.exoplayer.audio.AudioCapabilities audioCapabilities, androidx.media3.common.audio.AudioProcessor... audioProcessorArr) {
        this(handler, audioRendererEventListener, new androidx.media3.exoplayer.audio.DefaultAudioSink.Builder().setAudioCapabilities((androidx.media3.exoplayer.audio.AudioCapabilities) com.google.common.base.MoreObjects.firstNonNull(audioCapabilities, androidx.media3.exoplayer.audio.AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES)).setAudioProcessors(audioProcessorArr).build());
    }

    public DecoderAudioRenderer(android.os.Handler handler, androidx.media3.exoplayer.audio.AudioRendererEventListener audioRendererEventListener, androidx.media3.exoplayer.audio.AudioSink audioSink) {
        super(1);
        this.eventDispatcher = new androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher(handler, audioRendererEventListener);
        this.audioSink = audioSink;
        audioSink.setListener(new androidx.media3.exoplayer.audio.DecoderAudioRenderer.AudioSinkListener());
        this.flagsOnlyBuffer = androidx.media3.decoder.DecoderInputBuffer.newNoDataInstance();
        this.decoderReinitializationState = 0;
        this.audioTrackNeedsConfigure = true;
        setOutputStreamOffsetUs(androidx.media3.common.C.TIME_UNSET);
        this.pendingOutputStreamOffsetsUs = new long[10];
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int supportsFormat(androidx.media3.common.Format format) {
        if (!androidx.media3.common.MimeTypes.isAudio(format.sampleMimeType)) {
            return androidx.media3.exoplayer.RendererCapabilities.create(0);
        }
        int iSupportsFormatInternal = supportsFormatInternal(format);
        if (iSupportsFormatInternal <= 2) {
            return androidx.media3.exoplayer.RendererCapabilities.create(iSupportsFormatInternal);
        }
        return androidx.media3.exoplayer.RendererCapabilities.create(iSupportsFormatInternal, 8, androidx.media3.common.util.Util.SDK_INT >= 21 ? 32 : 0);
    }

    protected final boolean sinkSupportsFormat(androidx.media3.common.Format format) {
        return this.audioSink.supportsFormat(format);
    }

    protected final int getSinkFormatSupport(androidx.media3.common.Format format) {
        return this.audioSink.getFormatSupport(format);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j, long j2) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (this.outputStreamEnded) {
            try {
                this.audioSink.playToEndOfStream();
                return;
            } catch (androidx.media3.exoplayer.audio.AudioSink.WriteException e) {
                throw createRendererException(e, e.format, e.isRecoverable, 5002);
            }
        }
        if (this.inputFormat == null) {
            androidx.media3.exoplayer.FormatHolder formatHolder = getFormatHolder();
            this.flagsOnlyBuffer.clear();
            int source = readSource(formatHolder, this.flagsOnlyBuffer, 2);
            if (source != -5) {
                if (source == -4) {
                    androidx.media3.common.util.Assertions.checkState(this.flagsOnlyBuffer.isEndOfStream());
                    this.inputStreamEnded = true;
                    try {
                        processEndOfStream();
                        return;
                    } catch (androidx.media3.exoplayer.audio.AudioSink.WriteException e2) {
                        throw createRendererException(e2, null, 5002);
                    }
                }
                return;
            }
            onInputFormatChanged(formatHolder);
        }
        maybeInitDecoder();
        if (this.decoder != null) {
            try {
                androidx.media3.common.util.TraceUtil.beginSection("drainAndFeed");
                while (drainOutputBuffer()) {
                }
                while (feedInputBuffer()) {
                }
                androidx.media3.common.util.TraceUtil.endSection();
                this.decoderCounters.ensureUpdated();
            } catch (androidx.media3.decoder.DecoderException e3) {
                androidx.media3.common.util.Log.e(TAG, "Audio codec error", e3);
                this.eventDispatcher.audioCodecError(e3);
                throw createRendererException(e3, this.inputFormat, 4003);
            } catch (androidx.media3.exoplayer.audio.AudioSink.ConfigurationException e4) {
                throw createRendererException(e4, e4.format, 5001);
            } catch (androidx.media3.exoplayer.audio.AudioSink.InitializationException e5) {
                throw createRendererException(e5, e5.format, e5.isRecoverable, 5001);
            } catch (androidx.media3.exoplayer.audio.AudioSink.WriteException e6) {
                throw createRendererException(e6, e6.format, e6.isRecoverable, 5002);
            }
        }
    }

    protected void onPositionDiscontinuity() {
        this.allowPositionDiscontinuity = true;
    }

    protected androidx.media3.exoplayer.DecoderReuseEvaluation canReuseDecoder(java.lang.String str, androidx.media3.common.Format format, androidx.media3.common.Format format2) {
        return new androidx.media3.exoplayer.DecoderReuseEvaluation(str, format, format2, 0, 1);
    }

    private boolean drainOutputBuffer() throws androidx.media3.exoplayer.ExoPlaybackException, androidx.media3.decoder.DecoderException, androidx.media3.exoplayer.audio.AudioSink.WriteException, androidx.media3.exoplayer.audio.AudioSink.InitializationException, androidx.media3.exoplayer.audio.AudioSink.ConfigurationException {
        if (this.outputBuffer == null) {
            androidx.media3.decoder.SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (androidx.media3.decoder.SimpleDecoderOutputBuffer) this.decoder.dequeueOutputBuffer();
            this.outputBuffer = simpleDecoderOutputBuffer;
            if (simpleDecoderOutputBuffer == null) {
                return false;
            }
            if (simpleDecoderOutputBuffer.skippedOutputBufferCount > 0) {
                this.decoderCounters.skippedOutputBufferCount += this.outputBuffer.skippedOutputBufferCount;
                this.audioSink.handleDiscontinuity();
            }
            if (this.outputBuffer.isFirstSample()) {
                processFirstSampleOfStream();
            }
        }
        if (this.outputBuffer.isEndOfStream()) {
            if (this.decoderReinitializationState == 2) {
                releaseDecoder();
                maybeInitDecoder();
                this.audioTrackNeedsConfigure = true;
            } else {
                this.outputBuffer.release();
                this.outputBuffer = null;
                try {
                    processEndOfStream();
                } catch (androidx.media3.exoplayer.audio.AudioSink.WriteException e) {
                    throw createRendererException(e, e.format, e.isRecoverable, 5002);
                }
            }
            return false;
        }
        if (this.audioTrackNeedsConfigure) {
            this.audioSink.configure(getOutputFormat(this.decoder).buildUpon().setEncoderDelay(this.encoderDelay).setEncoderPadding(this.encoderPadding).setMetadata(this.inputFormat.metadata).setCustomData(this.inputFormat.customData).setId(this.inputFormat.id).setLabel(this.inputFormat.label).setLabels(this.inputFormat.labels).setLanguage(this.inputFormat.language).setSelectionFlags(this.inputFormat.selectionFlags).setRoleFlags(this.inputFormat.roleFlags).build(), 0, getChannelMapping(this.decoder));
            this.audioTrackNeedsConfigure = false;
        }
        if (!this.audioSink.handleBuffer(this.outputBuffer.data, this.outputBuffer.timeUs, 1)) {
            return false;
        }
        this.decoderCounters.renderedOutputBufferCount++;
        this.outputBuffer.release();
        this.outputBuffer = null;
        return true;
    }

    private void processFirstSampleOfStream() {
        this.audioSink.handleDiscontinuity();
        if (this.pendingOutputStreamOffsetCount != 0) {
            setOutputStreamOffsetUs(this.pendingOutputStreamOffsetsUs[0]);
            int i = this.pendingOutputStreamOffsetCount - 1;
            this.pendingOutputStreamOffsetCount = i;
            long[] jArr = this.pendingOutputStreamOffsetsUs;
            java.lang.System.arraycopy(jArr, 1, jArr, 0, i);
        }
    }

    private void setOutputStreamOffsetUs(long j) {
        this.outputStreamOffsetUs = j;
        if (j != androidx.media3.common.C.TIME_UNSET) {
            this.audioSink.setOutputStreamOffsetUs(j);
        }
    }

    private boolean feedInputBuffer() throws androidx.media3.exoplayer.ExoPlaybackException, androidx.media3.decoder.DecoderException {
        T t = this.decoder;
        if (t == null || this.decoderReinitializationState == 2 || this.inputStreamEnded) {
            return false;
        }
        if (this.inputBuffer == null) {
            androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer = (androidx.media3.decoder.DecoderInputBuffer) t.dequeueInputBuffer();
            this.inputBuffer = decoderInputBuffer;
            if (decoderInputBuffer == null) {
                return false;
            }
        }
        if (this.decoderReinitializationState == 1) {
            this.inputBuffer.setFlags(4);
            this.decoder.queueInputBuffer(this.inputBuffer);
            this.inputBuffer = null;
            this.decoderReinitializationState = 2;
            return false;
        }
        androidx.media3.exoplayer.FormatHolder formatHolder = getFormatHolder();
        int source = readSource(formatHolder, this.inputBuffer, 0);
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
        if (this.inputBuffer.isEndOfStream()) {
            this.inputStreamEnded = true;
            this.decoder.queueInputBuffer(this.inputBuffer);
            this.inputBuffer = null;
            return false;
        }
        if (!this.firstStreamSampleRead) {
            this.firstStreamSampleRead = true;
            this.inputBuffer.addFlag(androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE);
        }
        this.inputBuffer.flip();
        this.inputBuffer.format = this.inputFormat;
        this.decoder.queueInputBuffer(this.inputBuffer);
        this.decoderReceivedBuffers = true;
        this.decoderCounters.queuedInputBufferCount++;
        this.inputBuffer = null;
        return true;
    }

    private void processEndOfStream() throws androidx.media3.exoplayer.audio.AudioSink.WriteException {
        this.outputStreamEnded = true;
        this.audioSink.playToEndOfStream();
    }

    private void flushDecoder() throws androidx.media3.exoplayer.ExoPlaybackException {
        if (this.decoderReinitializationState != 0) {
            releaseDecoder();
            maybeInitDecoder();
            return;
        }
        this.inputBuffer = null;
        androidx.media3.decoder.SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.outputBuffer;
        if (simpleDecoderOutputBuffer != null) {
            simpleDecoderOutputBuffer.release();
            this.outputBuffer = null;
        }
        androidx.media3.decoder.Decoder decoder = (androidx.media3.decoder.Decoder) androidx.media3.common.util.Assertions.checkNotNull(this.decoder);
        decoder.flush();
        decoder.setOutputStartTimeUs(getLastResetPositionUs());
        this.decoderReceivedBuffers = false;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded && this.audioSink.isEnded();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return this.audioSink.hasPendingData() || (this.inputFormat != null && (isSourceReady() || this.outputBuffer != null));
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public long getPositionUs() {
        if (getState() == 2) {
            updateCurrentPosition();
        }
        return this.currentPositionUs;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public boolean hasSkippedSilenceSinceLastCall() {
        boolean z = this.hasPendingReportedSkippedSilence;
        this.hasPendingReportedSkippedSilence = false;
        return z;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        this.audioSink.setPlaybackParameters(playbackParameters);
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public androidx.media3.common.PlaybackParameters getPlaybackParameters() {
        return this.audioSink.getPlaybackParameters();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onEnabled(boolean z, boolean z2) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.DecoderCounters decoderCounters = new androidx.media3.exoplayer.DecoderCounters();
        this.decoderCounters = decoderCounters;
        this.eventDispatcher.enabled(decoderCounters);
        if (getConfiguration().tunneling) {
            this.audioSink.enableTunnelingV21();
        } else {
            this.audioSink.disableTunneling();
        }
        this.audioSink.setPlayerId(getPlayerId());
        this.audioSink.setClock(getClock());
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onPositionReset(long j, boolean z) throws androidx.media3.exoplayer.ExoPlaybackException {
        this.audioSink.flush();
        this.currentPositionUs = j;
        this.hasPendingReportedSkippedSilence = false;
        this.allowPositionDiscontinuity = true;
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        if (this.decoder != null) {
            flushDecoder();
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onStarted() {
        this.audioSink.play();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onStopped() {
        updateCurrentPosition();
        this.audioSink.pause();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onDisabled() {
        this.inputFormat = null;
        this.audioTrackNeedsConfigure = true;
        setOutputStreamOffsetUs(androidx.media3.common.C.TIME_UNSET);
        this.hasPendingReportedSkippedSilence = false;
        try {
            setSourceDrmSession(null);
            releaseDecoder();
            this.audioSink.reset();
        } finally {
            this.eventDispatcher.disabled(this.decoderCounters);
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onStreamChanged(androidx.media3.common.Format[] formatArr, long j, long j2, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) throws androidx.media3.exoplayer.ExoPlaybackException {
        super.onStreamChanged(formatArr, j, j2, mediaPeriodId);
        this.firstStreamSampleRead = false;
        if (this.outputStreamOffsetUs == androidx.media3.common.C.TIME_UNSET) {
            setOutputStreamOffsetUs(j2);
            return;
        }
        int i = this.pendingOutputStreamOffsetCount;
        if (i == this.pendingOutputStreamOffsetsUs.length) {
            androidx.media3.common.util.Log.w(TAG, "Too many stream changes, so dropping offset: " + this.pendingOutputStreamOffsetsUs[this.pendingOutputStreamOffsetCount - 1]);
        } else {
            this.pendingOutputStreamOffsetCount = i + 1;
        }
        this.pendingOutputStreamOffsetsUs[this.pendingOutputStreamOffsetCount - 1] = j2;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, java.lang.Object obj) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (i == 2) {
            this.audioSink.setVolume(((java.lang.Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            this.audioSink.setAudioAttributes((androidx.media3.common.AudioAttributes) obj);
            return;
        }
        if (i == 6) {
            this.audioSink.setAuxEffectInfo((androidx.media3.common.AuxEffectInfo) obj);
            return;
        }
        if (i == 12) {
            if (androidx.media3.common.util.Util.SDK_INT >= 23) {
                androidx.media3.exoplayer.audio.DecoderAudioRenderer.Api23.setAudioSinkPreferredDevice(this.audioSink, obj);
            }
        } else if (i == 9) {
            this.audioSink.setSkipSilenceEnabled(((java.lang.Boolean) obj).booleanValue());
        } else if (i == 10) {
            this.audioSink.setAudioSessionId(((java.lang.Integer) obj).intValue());
        } else {
            super.handleMessage(i, obj);
        }
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
            androidx.media3.common.util.TraceUtil.beginSection("createAudioDecoder");
            T t = (T) createDecoder(this.inputFormat, cryptoConfig);
            this.decoder = t;
            t.setOutputStartTimeUs(getLastResetPositionUs());
            androidx.media3.common.util.TraceUtil.endSection();
            long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            this.eventDispatcher.decoderInitialized(this.decoder.getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.decoderCounters.decoderInitCount++;
        } catch (androidx.media3.decoder.DecoderException e) {
            androidx.media3.common.util.Log.e(TAG, "Audio codec error", e);
            this.eventDispatcher.audioCodecError(e);
            throw createRendererException(e, this.inputFormat, 4001);
        } catch (java.lang.OutOfMemoryError e2) {
            throw createRendererException(e2, this.inputFormat, 4001);
        }
    }

    private void releaseDecoder() {
        this.inputBuffer = null;
        this.outputBuffer = null;
        this.decoderReinitializationState = 0;
        this.decoderReceivedBuffers = false;
        if (this.decoder != null) {
            this.decoderCounters.decoderReleaseCount++;
            this.decoder.release();
            this.eventDispatcher.decoderReleased(this.decoder.getName());
            this.decoder = null;
        }
        setDecoderDrmSession(null);
    }

    private void setSourceDrmSession(androidx.media3.exoplayer.drm.DrmSession drmSession) {
        androidx.media3.exoplayer.drm.DrmSession.replaceSession(this.sourceDrmSession, drmSession);
        this.sourceDrmSession = drmSession;
    }

    private void setDecoderDrmSession(androidx.media3.exoplayer.drm.DrmSession drmSession) {
        androidx.media3.exoplayer.drm.DrmSession.replaceSession(this.decoderDrmSession, drmSession);
        this.decoderDrmSession = drmSession;
    }

    private void onInputFormatChanged(androidx.media3.exoplayer.FormatHolder formatHolder) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluationCanReuseDecoder;
        androidx.media3.common.Format format = (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(formatHolder.format);
        setSourceDrmSession(formatHolder.drmSession);
        androidx.media3.common.Format format2 = this.inputFormat;
        this.inputFormat = format;
        this.encoderDelay = format.encoderDelay;
        this.encoderPadding = format.encoderPadding;
        T t = this.decoder;
        if (t == null) {
            maybeInitDecoder();
            this.eventDispatcher.inputFormatChanged(this.inputFormat, null);
            return;
        }
        if (this.sourceDrmSession != this.decoderDrmSession) {
            decoderReuseEvaluationCanReuseDecoder = new androidx.media3.exoplayer.DecoderReuseEvaluation(this.decoder.getName(), format2, format, 0, 128);
        } else {
            decoderReuseEvaluationCanReuseDecoder = canReuseDecoder(t.getName(), format2, format);
        }
        if (decoderReuseEvaluationCanReuseDecoder.result == 0) {
            if (this.decoderReceivedBuffers) {
                this.decoderReinitializationState = 1;
            } else {
                releaseDecoder();
                maybeInitDecoder();
                this.audioTrackNeedsConfigure = true;
            }
        }
        this.eventDispatcher.inputFormatChanged(this.inputFormat, decoderReuseEvaluationCanReuseDecoder);
    }

    private void updateCurrentPosition() {
        long currentPositionUs = this.audioSink.getCurrentPositionUs(isEnded());
        if (currentPositionUs != Long.MIN_VALUE) {
            if (!this.allowPositionDiscontinuity) {
                currentPositionUs = java.lang.Math.max(this.currentPositionUs, currentPositionUs);
            }
            this.currentPositionUs = currentPositionUs;
            this.allowPositionDiscontinuity = false;
        }
    }

    private final class AudioSinkListener implements androidx.media3.exoplayer.audio.AudioSink.Listener {
        private AudioSinkListener() {
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onPositionDiscontinuity() {
            androidx.media3.exoplayer.audio.DecoderAudioRenderer.this.onPositionDiscontinuity();
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onSilenceSkipped() {
            androidx.media3.exoplayer.audio.DecoderAudioRenderer.this.hasPendingReportedSkippedSilence = true;
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onPositionAdvancing(long j) {
            androidx.media3.exoplayer.audio.DecoderAudioRenderer.this.eventDispatcher.positionAdvancing(j);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onUnderrun(int i, long j, long j2) {
            androidx.media3.exoplayer.audio.DecoderAudioRenderer.this.eventDispatcher.underrun(i, j, j2);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onSkipSilenceEnabledChanged(boolean z) {
            androidx.media3.exoplayer.audio.DecoderAudioRenderer.this.eventDispatcher.skipSilenceEnabledChanged(z);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioSinkError(java.lang.Exception exc) {
            androidx.media3.common.util.Log.e(androidx.media3.exoplayer.audio.DecoderAudioRenderer.TAG, "Audio sink error", exc);
            androidx.media3.exoplayer.audio.DecoderAudioRenderer.this.eventDispatcher.audioSinkError(exc);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioTrackInitialized(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
            androidx.media3.exoplayer.audio.DecoderAudioRenderer.this.eventDispatcher.audioTrackInitialized(audioTrackConfig);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioTrackReleased(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
            androidx.media3.exoplayer.audio.DecoderAudioRenderer.this.eventDispatcher.audioTrackReleased(audioTrackConfig);
        }
    }

    private static final class Api23 {
        private Api23() {
        }

        public static void setAudioSinkPreferredDevice(androidx.media3.exoplayer.audio.AudioSink audioSink, java.lang.Object obj) {
            audioSink.setPreferredDevice((android.media.AudioDeviceInfo) obj);
        }
    }
}
