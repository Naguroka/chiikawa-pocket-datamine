package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public class MediaCodecAudioRenderer extends androidx.media3.exoplayer.mediacodec.MediaCodecRenderer implements androidx.media3.exoplayer.MediaClock {
    private static final java.lang.String TAG = "MediaCodecAudioRenderer";
    private static final java.lang.String VIVO_BITS_PER_SAMPLE_KEY = "v-bits-per-sample";
    private boolean allowPositionDiscontinuity;
    private final androidx.media3.exoplayer.audio.AudioSink audioSink;
    private boolean audioSinkNeedsReset;
    private int codecMaxInputSize;
    private boolean codecNeedsDiscardChannelsWorkaround;
    private boolean codecNeedsVorbisToAndroidChannelMappingWorkaround;
    private final android.content.Context context;
    private long currentPositionUs;
    private androidx.media3.common.Format decryptOnlyCodecFormat;
    private final androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher eventDispatcher;
    private boolean hasPendingReportedSkippedSilence;
    private androidx.media3.common.Format inputFormat;
    private boolean isStarted;
    private long nextBufferToWritePresentationTimeUs;
    private int rendererPriority;

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public androidx.media3.exoplayer.MediaClock getMediaClock() {
        return this;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public java.lang.String getName() {
        return TAG;
    }

    public MediaCodecAudioRenderer(android.content.Context context, androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector) {
        this(context, mediaCodecSelector, null, null);
    }

    public MediaCodecAudioRenderer(android.content.Context context, androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, android.os.Handler handler, androidx.media3.exoplayer.audio.AudioRendererEventListener audioRendererEventListener) {
        this(context, mediaCodecSelector, handler, audioRendererEventListener, new androidx.media3.exoplayer.audio.DefaultAudioSink.Builder(context).build());
    }

    @java.lang.Deprecated
    public MediaCodecAudioRenderer(android.content.Context context, androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, android.os.Handler handler, androidx.media3.exoplayer.audio.AudioRendererEventListener audioRendererEventListener, androidx.media3.exoplayer.audio.AudioCapabilities audioCapabilities, androidx.media3.common.audio.AudioProcessor... audioProcessorArr) {
        this(context, mediaCodecSelector, handler, audioRendererEventListener, new androidx.media3.exoplayer.audio.DefaultAudioSink.Builder().setAudioCapabilities((androidx.media3.exoplayer.audio.AudioCapabilities) com.google.common.base.MoreObjects.firstNonNull(audioCapabilities, androidx.media3.exoplayer.audio.AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES)).setAudioProcessors(audioProcessorArr).build());
    }

    public MediaCodecAudioRenderer(android.content.Context context, androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, android.os.Handler handler, androidx.media3.exoplayer.audio.AudioRendererEventListener audioRendererEventListener, androidx.media3.exoplayer.audio.AudioSink audioSink) {
        this(context, androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory.getDefault(context), mediaCodecSelector, false, handler, audioRendererEventListener, audioSink);
    }

    public MediaCodecAudioRenderer(android.content.Context context, androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, boolean z, android.os.Handler handler, androidx.media3.exoplayer.audio.AudioRendererEventListener audioRendererEventListener, androidx.media3.exoplayer.audio.AudioSink audioSink) {
        this(context, androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory.getDefault(context), mediaCodecSelector, z, handler, audioRendererEventListener, audioSink);
    }

    public MediaCodecAudioRenderer(android.content.Context context, androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory factory, androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, boolean z, android.os.Handler handler, androidx.media3.exoplayer.audio.AudioRendererEventListener audioRendererEventListener, androidx.media3.exoplayer.audio.AudioSink audioSink) {
        super(1, factory, mediaCodecSelector, z, 44100.0f);
        this.context = context.getApplicationContext();
        this.audioSink = audioSink;
        this.rendererPriority = -1000;
        this.eventDispatcher = new androidx.media3.exoplayer.audio.AudioRendererEventListener.EventDispatcher(handler, audioRendererEventListener);
        this.nextBufferToWritePresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
        audioSink.setListener(new androidx.media3.exoplayer.audio.MediaCodecAudioRenderer.AudioSinkListener());
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected int supportsFormat(androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, androidx.media3.common.Format format) throws androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException {
        int i;
        boolean z;
        if (!androidx.media3.common.MimeTypes.isAudio(format.sampleMimeType)) {
            return androidx.media3.exoplayer.RendererCapabilities.create(0);
        }
        int i2 = androidx.media3.common.util.Util.SDK_INT >= 21 ? 32 : 0;
        boolean z2 = true;
        boolean z3 = format.cryptoType != 0;
        boolean zSupportsFormatDrm = supportsFormatDrm(format);
        if (!zSupportsFormatDrm || (z3 && androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getDecryptOnlyDecoderInfo() == null)) {
            i = 0;
        } else {
            int audioOffloadSupport = getAudioOffloadSupport(format);
            if (this.audioSink.supportsFormat(format)) {
                return androidx.media3.exoplayer.RendererCapabilities.create(4, 8, i2, audioOffloadSupport);
            }
            i = audioOffloadSupport;
        }
        if (androidx.media3.common.MimeTypes.AUDIO_RAW.equals(format.sampleMimeType) && !this.audioSink.supportsFormat(format)) {
            return androidx.media3.exoplayer.RendererCapabilities.create(1);
        }
        if (!this.audioSink.supportsFormat(androidx.media3.common.util.Util.getPcmFormat(2, format.channelCount, format.sampleRate))) {
            return androidx.media3.exoplayer.RendererCapabilities.create(1);
        }
        java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> decoderInfos = getDecoderInfos(mediaCodecSelector, format, false, this.audioSink);
        if (decoderInfos.isEmpty()) {
            return androidx.media3.exoplayer.RendererCapabilities.create(1);
        }
        if (!zSupportsFormatDrm) {
            return androidx.media3.exoplayer.RendererCapabilities.create(2);
        }
        androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo = decoderInfos.get(0);
        boolean zIsFormatSupported = mediaCodecInfo.isFormatSupported(format);
        if (!zIsFormatSupported) {
            int i3 = 1;
            while (true) {
                if (i3 >= decoderInfos.size()) {
                    z = true;
                    z2 = zIsFormatSupported;
                    break;
                }
                androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo2 = decoderInfos.get(i3);
                if (mediaCodecInfo2.isFormatSupported(format)) {
                    z = false;
                    mediaCodecInfo = mediaCodecInfo2;
                    break;
                }
                i3++;
            }
        } else {
            z = true;
            z2 = zIsFormatSupported;
            break;
        }
        return androidx.media3.exoplayer.RendererCapabilities.create(z2 ? 4 : 3, (z2 && mediaCodecInfo.isSeamlessAdaptationSupported(format)) ? 16 : 8, i2, mediaCodecInfo.hardwareAccelerated ? 64 : 0, z ? 128 : 0, i);
    }

    private int getAudioOffloadSupport(androidx.media3.common.Format format) {
        androidx.media3.exoplayer.audio.AudioOffloadSupport formatOffloadSupport = this.audioSink.getFormatOffloadSupport(format);
        if (!formatOffloadSupport.isFormatSupported) {
            return 0;
        }
        int i = formatOffloadSupport.isGaplessSupported ? 1536 : 512;
        return formatOffloadSupport.isSpeedChangeSupported ? i | 2048 : i;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> getDecoderInfos(androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, androidx.media3.common.Format format, boolean z) throws androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException {
        return androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getDecoderInfosSortedByFormatSupport(getDecoderInfos(mediaCodecSelector, format, z, this.audioSink), format);
    }

    private static java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> getDecoderInfos(androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, androidx.media3.common.Format format, boolean z, androidx.media3.exoplayer.audio.AudioSink audioSink) throws androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException {
        androidx.media3.exoplayer.mediacodec.MediaCodecInfo decryptOnlyDecoderInfo;
        if (format.sampleMimeType == null) {
            return com.google.common.collect.ImmutableList.of();
        }
        if (audioSink.supportsFormat(format) && (decryptOnlyDecoderInfo = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getDecryptOnlyDecoderInfo()) != null) {
            return com.google.common.collect.ImmutableList.of(decryptOnlyDecoderInfo);
        }
        return androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getDecoderInfosSoftMatch(mediaCodecSelector, format, z, false);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean shouldUseBypass(androidx.media3.common.Format format) {
        if (getConfiguration().offloadModePreferred != 0) {
            int audioOffloadSupport = getAudioOffloadSupport(format);
            if ((audioOffloadSupport & 512) != 0) {
                if (getConfiguration().offloadModePreferred == 2 || (audioOffloadSupport & 1024) != 0) {
                    return true;
                }
                if (format.encoderDelay == 0 && format.encoderPadding == 0) {
                    return true;
                }
            }
        }
        return this.audioSink.supportsFormat(format);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration getMediaCodecConfiguration(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, androidx.media3.common.Format format, android.media.MediaCrypto mediaCrypto, float f) {
        this.codecMaxInputSize = getCodecMaxInputSize(mediaCodecInfo, format, getStreamFormats());
        this.codecNeedsDiscardChannelsWorkaround = codecNeedsDiscardChannelsWorkaround(mediaCodecInfo.name);
        this.codecNeedsVorbisToAndroidChannelMappingWorkaround = codecNeedsVorbisToAndroidChannelMappingWorkaround(mediaCodecInfo.name);
        android.media.MediaFormat mediaFormat = getMediaFormat(format, mediaCodecInfo.codecMimeType, this.codecMaxInputSize, f);
        this.decryptOnlyCodecFormat = androidx.media3.common.MimeTypes.AUDIO_RAW.equals(mediaCodecInfo.mimeType) && !androidx.media3.common.MimeTypes.AUDIO_RAW.equals(format.sampleMimeType) ? format : null;
        return androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration.createForAudioDecoding(mediaCodecInfo, mediaFormat, format, mediaCrypto);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected androidx.media3.exoplayer.DecoderReuseEvaluation canReuseCodec(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, androidx.media3.common.Format format, androidx.media3.common.Format format2) {
        androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluationCanReuseCodec = mediaCodecInfo.canReuseCodec(format, format2);
        int i = decoderReuseEvaluationCanReuseCodec.discardReasons;
        if (isBypassPossible(format2)) {
            i |= 32768;
        }
        if (getCodecMaxInputSize(mediaCodecInfo, format2) > this.codecMaxInputSize) {
            i |= 64;
        }
        int i2 = i;
        return new androidx.media3.exoplayer.DecoderReuseEvaluation(mediaCodecInfo.name, format, format2, i2 != 0 ? 0 : decoderReuseEvaluationCanReuseCodec.result, i2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public long getDurationToProgressUs(boolean z, long j, long j2) {
        long j3 = this.nextBufferToWritePresentationTimeUs;
        if (j3 != androidx.media3.common.C.TIME_UNSET) {
            long jMsToUs = (long) (((j3 - j) / (getPlaybackParameters() != null ? getPlaybackParameters().speed : 1.0f)) / 2.0f);
            if (this.isStarted) {
                jMsToUs -= androidx.media3.common.util.Util.msToUs(getClock().elapsedRealtime()) - j2;
            }
            return java.lang.Math.max(10000L, jMsToUs);
        }
        return super.getDurationToProgressUs(z, j, j2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected float getCodecOperatingRateV23(float f, androidx.media3.common.Format format, androidx.media3.common.Format[] formatArr) {
        int iMax = -1;
        for (androidx.media3.common.Format format2 : formatArr) {
            int i = format2.sampleRate;
            if (i != -1) {
                iMax = java.lang.Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f * iMax;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onCodecInitialized(java.lang.String str, androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration configuration, long j, long j2) {
        this.eventDispatcher.decoderInitialized(str, j, j2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onCodecReleased(java.lang.String str) {
        this.eventDispatcher.decoderReleased(str);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onCodecError(java.lang.Exception exc) {
        androidx.media3.common.util.Log.e(TAG, "Audio codec error", exc);
        this.eventDispatcher.audioCodecError(exc);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected androidx.media3.exoplayer.DecoderReuseEvaluation onInputFormatChanged(androidx.media3.exoplayer.FormatHolder formatHolder) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.common.Format format = (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(formatHolder.format);
        this.inputFormat = format;
        androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluationOnInputFormatChanged = super.onInputFormatChanged(formatHolder);
        this.eventDispatcher.inputFormatChanged(format, decoderReuseEvaluationOnInputFormatChanged);
        return decoderReuseEvaluationOnInputFormatChanged;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onOutputFormatChanged(androidx.media3.common.Format format, android.media.MediaFormat mediaFormat) throws androidx.media3.exoplayer.ExoPlaybackException {
        int pcmEncoding;
        androidx.media3.common.Format format2 = this.decryptOnlyCodecFormat;
        int[] vorbisToAndroidChannelLayoutMapping = null;
        if (format2 != null) {
            format = format2;
        } else if (getCodec() != null) {
            androidx.media3.common.util.Assertions.checkNotNull(mediaFormat);
            if (androidx.media3.common.MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) {
                pcmEncoding = format.pcmEncoding;
            } else if (androidx.media3.common.util.Util.SDK_INT >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                pcmEncoding = mediaFormat.getInteger("pcm-encoding");
            } else {
                pcmEncoding = mediaFormat.containsKey(VIVO_BITS_PER_SAMPLE_KEY) ? androidx.media3.common.util.Util.getPcmEncoding(mediaFormat.getInteger(VIVO_BITS_PER_SAMPLE_KEY)) : 2;
            }
            androidx.media3.common.Format formatBuild = new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.AUDIO_RAW).setPcmEncoding(pcmEncoding).setEncoderDelay(format.encoderDelay).setEncoderPadding(format.encoderPadding).setMetadata(format.metadata).setCustomData(format.customData).setId(format.id).setLabel(format.label).setLabels(format.labels).setLanguage(format.language).setSelectionFlags(format.selectionFlags).setRoleFlags(format.roleFlags).setChannelCount(mediaFormat.getInteger("channel-count")).setSampleRate(mediaFormat.getInteger("sample-rate")).build();
            if (this.codecNeedsDiscardChannelsWorkaround && formatBuild.channelCount == 6 && format.channelCount < 6) {
                vorbisToAndroidChannelLayoutMapping = new int[format.channelCount];
                for (int i = 0; i < format.channelCount; i++) {
                    vorbisToAndroidChannelLayoutMapping[i] = i;
                }
            } else if (this.codecNeedsVorbisToAndroidChannelMappingWorkaround) {
                vorbisToAndroidChannelLayoutMapping = androidx.media3.extractor.VorbisUtil.getVorbisToAndroidChannelLayoutMapping(formatBuild.channelCount);
            }
            format = formatBuild;
        }
        try {
            if (androidx.media3.common.util.Util.SDK_INT >= 29) {
                if (isBypassEnabled() && getConfiguration().offloadModePreferred != 0) {
                    this.audioSink.setOffloadMode(getConfiguration().offloadModePreferred);
                } else {
                    this.audioSink.setOffloadMode(0);
                }
            }
            this.audioSink.configure(format, 0, vorbisToAndroidChannelLayoutMapping);
        } catch (androidx.media3.exoplayer.audio.AudioSink.ConfigurationException e) {
            throw createRendererException(e, e.format, 5001);
        }
    }

    protected void onPositionDiscontinuity() {
        this.allowPositionDiscontinuity = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onEnabled(boolean z, boolean z2) throws androidx.media3.exoplayer.ExoPlaybackException {
        super.onEnabled(z, z2);
        this.eventDispatcher.enabled(this.decoderCounters);
        if (getConfiguration().tunneling) {
            this.audioSink.enableTunnelingV21();
        } else {
            this.audioSink.disableTunneling();
        }
        this.audioSink.setPlayerId(getPlayerId());
        this.audioSink.setClock(getClock());
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onPositionReset(long j, boolean z) throws androidx.media3.exoplayer.ExoPlaybackException {
        super.onPositionReset(j, z);
        this.audioSink.flush();
        this.currentPositionUs = j;
        this.hasPendingReportedSkippedSilence = false;
        this.allowPositionDiscontinuity = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onStarted() {
        super.onStarted();
        this.audioSink.play();
        this.isStarted = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onStopped() {
        updateCurrentPosition();
        this.isStarted = false;
        this.audioSink.pause();
        super.onStopped();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onDisabled() {
        this.audioSinkNeedsReset = true;
        this.inputFormat = null;
        try {
            this.audioSink.flush();
            try {
                super.onDisabled();
            } finally {
                this.eventDispatcher.disabled(this.decoderCounters);
            }
        } catch (java.lang.Throwable th) {
            try {
                super.onDisabled();
                throw th;
            } finally {
                this.eventDispatcher.disabled(this.decoderCounters);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onReset() {
        this.hasPendingReportedSkippedSilence = false;
        try {
            super.onReset();
        } finally {
            if (this.audioSinkNeedsReset) {
                this.audioSinkNeedsReset = false;
                this.audioSink.reset();
            }
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onRelease() {
        this.audioSink.release();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return super.isEnded() && this.audioSink.isEnded();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return this.audioSink.hasPendingData() || super.isReady();
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

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onProcessedStreamChange() {
        super.onProcessedStreamChange();
        this.audioSink.handleDiscontinuity();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean processOutputBuffer(long j, long j2, androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter, java.nio.ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, androidx.media3.common.Format format) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.common.util.Assertions.checkNotNull(byteBuffer);
        this.nextBufferToWritePresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
        if (this.decryptOnlyCodecFormat != null && (i2 & 2) != 0) {
            ((androidx.media3.exoplayer.mediacodec.MediaCodecAdapter) androidx.media3.common.util.Assertions.checkNotNull(mediaCodecAdapter)).releaseOutputBuffer(i, false);
            return true;
        }
        if (z) {
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.releaseOutputBuffer(i, false);
            }
            this.decoderCounters.skippedOutputBufferCount += i3;
            this.audioSink.handleDiscontinuity();
            return true;
        }
        try {
            if (this.audioSink.handleBuffer(byteBuffer, j3, i3)) {
                if (mediaCodecAdapter != null) {
                    mediaCodecAdapter.releaseOutputBuffer(i, false);
                }
                this.decoderCounters.renderedOutputBufferCount += i3;
                return true;
            }
            this.nextBufferToWritePresentationTimeUs = j3;
            return false;
        } catch (androidx.media3.exoplayer.audio.AudioSink.InitializationException e) {
            throw createRendererException(e, this.inputFormat, e.isRecoverable, (!isBypassEnabled() || getConfiguration().offloadModePreferred == 0) ? 5001 : 5004);
        } catch (androidx.media3.exoplayer.audio.AudioSink.WriteException e2) {
            throw createRendererException(e2, format, e2.isRecoverable, (!isBypassEnabled() || getConfiguration().offloadModePreferred == 0) ? 5002 : 5003);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void renderToEndOfStream() throws androidx.media3.exoplayer.ExoPlaybackException {
        try {
            this.audioSink.playToEndOfStream();
            if (getLastBufferInStreamPresentationTimeUs() != androidx.media3.common.C.TIME_UNSET) {
                this.nextBufferToWritePresentationTimeUs = getLastBufferInStreamPresentationTimeUs();
            }
        } catch (androidx.media3.exoplayer.audio.AudioSink.WriteException e) {
            throw createRendererException(e, e.format, e.isRecoverable, isBypassEnabled() ? 5003 : 5002);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onOutputStreamOffsetUsChanged(long j) {
        this.audioSink.setOutputStreamOffsetUs(j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, java.lang.Object obj) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (i == 2) {
            this.audioSink.setVolume(((java.lang.Float) androidx.media3.common.util.Assertions.checkNotNull(obj)).floatValue());
            return;
        }
        if (i == 3) {
            this.audioSink.setAudioAttributes((androidx.media3.common.AudioAttributes) androidx.media3.common.util.Assertions.checkNotNull((androidx.media3.common.AudioAttributes) obj));
            return;
        }
        if (i == 6) {
            this.audioSink.setAuxEffectInfo((androidx.media3.common.AuxEffectInfo) androidx.media3.common.util.Assertions.checkNotNull((androidx.media3.common.AuxEffectInfo) obj));
            return;
        }
        if (i == 12) {
            if (androidx.media3.common.util.Util.SDK_INT >= 23) {
                androidx.media3.exoplayer.audio.MediaCodecAudioRenderer.Api23.setAudioSinkPreferredDevice(this.audioSink, obj);
            }
        } else if (i == 16) {
            this.rendererPriority = ((java.lang.Integer) androidx.media3.common.util.Assertions.checkNotNull(obj)).intValue();
            updateCodecImportance();
        } else if (i == 9) {
            this.audioSink.setSkipSilenceEnabled(((java.lang.Boolean) androidx.media3.common.util.Assertions.checkNotNull(obj)).booleanValue());
        } else if (i == 10) {
            this.audioSink.setAudioSessionId(((java.lang.Integer) androidx.media3.common.util.Assertions.checkNotNull(obj)).intValue());
        } else {
            super.handleMessage(i, obj);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void handleInputBufferSupplementalData(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) {
        if (androidx.media3.common.util.Util.SDK_INT < 29 || decoderInputBuffer.format == null || !java.util.Objects.equals(decoderInputBuffer.format.sampleMimeType, androidx.media3.common.MimeTypes.AUDIO_OPUS) || !isBypassEnabled()) {
            return;
        }
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkNotNull(decoderInputBuffer.supplementalData);
        int i = ((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(decoderInputBuffer.format)).encoderDelay;
        if (byteBuffer.remaining() == 8) {
            this.audioSink.setOffloadDelayPadding(i, (int) ((byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / androidx.media3.common.C.NANOS_PER_SECOND));
        }
    }

    protected int getCodecMaxInputSize(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, androidx.media3.common.Format format, androidx.media3.common.Format[] formatArr) {
        int codecMaxInputSize = getCodecMaxInputSize(mediaCodecInfo, format);
        if (formatArr.length == 1) {
            return codecMaxInputSize;
        }
        for (androidx.media3.common.Format format2 : formatArr) {
            if (mediaCodecInfo.canReuseCodec(format, format2).result != 0) {
                codecMaxInputSize = java.lang.Math.max(codecMaxInputSize, getCodecMaxInputSize(mediaCodecInfo, format2));
            }
        }
        return codecMaxInputSize;
    }

    private int getCodecMaxInputSize(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, androidx.media3.common.Format format) {
        if (!"OMX.google.raw.decoder".equals(mediaCodecInfo.name) || androidx.media3.common.util.Util.SDK_INT >= 24 || (androidx.media3.common.util.Util.SDK_INT == 23 && androidx.media3.common.util.Util.isTv(this.context))) {
            return format.maxInputSize;
        }
        return -1;
    }

    protected android.media.MediaFormat getMediaFormat(androidx.media3.common.Format format, java.lang.String str, int i, float f) {
        android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", format.channelCount);
        mediaFormat.setInteger("sample-rate", format.sampleRate);
        androidx.media3.common.util.MediaFormatUtil.setCsdBuffers(mediaFormat, format.initializationData);
        androidx.media3.common.util.MediaFormatUtil.maybeSetInteger(mediaFormat, "max-input-size", i);
        if (androidx.media3.common.util.Util.SDK_INT >= 23) {
            mediaFormat.setInteger(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f != -1.0f && !deviceDoesntSupportOperatingRate()) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (androidx.media3.common.util.Util.SDK_INT <= 28 && androidx.media3.common.MimeTypes.AUDIO_AC4.equals(format.sampleMimeType)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 24 && this.audioSink.getFormatSupport(androidx.media3.common.util.Util.getPcmFormat(4, format.channelCount, format.sampleRate)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", java.lang.Math.max(0, -this.rendererPriority));
        }
        return mediaFormat;
    }

    private void updateCodecImportance() {
        androidx.media3.exoplayer.mediacodec.MediaCodecAdapter codec = getCodec();
        if (codec != null && androidx.media3.common.util.Util.SDK_INT >= 35) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("importance", java.lang.Math.max(0, -this.rendererPriority));
            codec.setParameters(bundle);
        }
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

    private static boolean deviceDoesntSupportOperatingRate() {
        return androidx.media3.common.util.Util.SDK_INT == 23 && ("ZTE B2017G".equals(androidx.media3.common.util.Util.MODEL) || "AXON 7 mini".equals(androidx.media3.common.util.Util.MODEL));
    }

    private static boolean codecNeedsDiscardChannelsWorkaround(java.lang.String str) {
        return androidx.media3.common.util.Util.SDK_INT < 24 && "OMX.SEC.aac.dec".equals(str) && com.adjust.sdk.Constants.REFERRER_API_SAMSUNG.equals(androidx.media3.common.util.Util.MANUFACTURER) && (androidx.media3.common.util.Util.DEVICE.startsWith("zeroflte") || androidx.media3.common.util.Util.DEVICE.startsWith("herolte") || androidx.media3.common.util.Util.DEVICE.startsWith("heroqlte"));
    }

    private static boolean codecNeedsVorbisToAndroidChannelMappingWorkaround(java.lang.String str) {
        return str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
    }

    private final class AudioSinkListener implements androidx.media3.exoplayer.audio.AudioSink.Listener {
        private AudioSinkListener() {
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onPositionDiscontinuity() {
            androidx.media3.exoplayer.audio.MediaCodecAudioRenderer.this.onPositionDiscontinuity();
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onSilenceSkipped() {
            androidx.media3.exoplayer.audio.MediaCodecAudioRenderer.this.hasPendingReportedSkippedSilence = true;
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onPositionAdvancing(long j) {
            androidx.media3.exoplayer.audio.MediaCodecAudioRenderer.this.eventDispatcher.positionAdvancing(j);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onUnderrun(int i, long j, long j2) {
            androidx.media3.exoplayer.audio.MediaCodecAudioRenderer.this.eventDispatcher.underrun(i, j, j2);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onSkipSilenceEnabledChanged(boolean z) {
            androidx.media3.exoplayer.audio.MediaCodecAudioRenderer.this.eventDispatcher.skipSilenceEnabledChanged(z);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onOffloadBufferEmptying() {
            androidx.media3.exoplayer.Renderer.WakeupListener wakeupListener = androidx.media3.exoplayer.audio.MediaCodecAudioRenderer.this.getWakeupListener();
            if (wakeupListener != null) {
                wakeupListener.onWakeup();
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onOffloadBufferFull() {
            androidx.media3.exoplayer.Renderer.WakeupListener wakeupListener = androidx.media3.exoplayer.audio.MediaCodecAudioRenderer.this.getWakeupListener();
            if (wakeupListener != null) {
                wakeupListener.onSleep();
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioSinkError(java.lang.Exception exc) {
            androidx.media3.common.util.Log.e(androidx.media3.exoplayer.audio.MediaCodecAudioRenderer.TAG, "Audio sink error", exc);
            androidx.media3.exoplayer.audio.MediaCodecAudioRenderer.this.eventDispatcher.audioSinkError(exc);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioCapabilitiesChanged() {
            androidx.media3.exoplayer.audio.MediaCodecAudioRenderer.this.onRendererCapabilitiesChanged();
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioTrackInitialized(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
            androidx.media3.exoplayer.audio.MediaCodecAudioRenderer.this.eventDispatcher.audioTrackInitialized(audioTrackConfig);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioTrackReleased(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
            androidx.media3.exoplayer.audio.MediaCodecAudioRenderer.this.eventDispatcher.audioTrackReleased(audioTrackConfig);
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
