package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultAudioSink implements androidx.media3.exoplayer.audio.AudioSink {
    private static final int AUDIO_TRACK_RETRY_DURATION_MS = 100;
    private static final int AUDIO_TRACK_SMALLER_BUFFER_RETRY_SIZE = 1000000;
    public static final float DEFAULT_PLAYBACK_SPEED = 1.0f;
    private static final boolean DEFAULT_SKIP_SILENCE = false;
    private static final int ERROR_NATIVE_DEAD_OBJECT = -32;
    public static final float MAX_PITCH = 8.0f;
    public static final float MAX_PLAYBACK_SPEED = 8.0f;
    private static final int MINIMUM_REPORT_SKIPPED_SILENCE_DURATION_US = 300000;
    public static final float MIN_PITCH = 0.1f;
    public static final float MIN_PLAYBACK_SPEED = 0.1f;
    public static final int OUTPUT_MODE_OFFLOAD = 1;
    public static final int OUTPUT_MODE_PASSTHROUGH = 2;
    public static final int OUTPUT_MODE_PCM = 0;
    private static final int REPORT_SKIPPED_SILENCE_DELAY_MS = 100;
    private static final java.lang.String TAG = "DefaultAudioSink";
    public static boolean failOnSpuriousAudioTimestamp = false;
    private static int pendingReleaseCount;
    private static java.util.concurrent.ExecutorService releaseExecutor;
    private static final java.lang.Object releaseExecutorLock = new java.lang.Object();
    private long accumulatedSkippedSilenceDurationUs;
    private androidx.media3.exoplayer.audio.DefaultAudioSink.MediaPositionParameters afterDrainParameters;
    private androidx.media3.common.AudioAttributes audioAttributes;
    private androidx.media3.exoplayer.audio.AudioCapabilities audioCapabilities;
    private androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver audioCapabilitiesReceiver;
    private final androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener audioOffloadListener;
    private final androidx.media3.exoplayer.audio.DefaultAudioSink.AudioOffloadSupportProvider audioOffloadSupportProvider;
    private androidx.media3.common.audio.AudioProcessingPipeline audioProcessingPipeline;
    private final androidx.media3.common.audio.AudioProcessorChain audioProcessorChain;
    private int audioSessionId;
    private android.media.AudioTrack audioTrack;
    private final androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackBufferSizeProvider audioTrackBufferSizeProvider;
    private final androidx.media3.exoplayer.audio.AudioTrackPositionTracker audioTrackPositionTracker;
    private androidx.media3.common.AuxEffectInfo auxEffectInfo;
    private java.nio.ByteBuffer avSyncHeader;
    private int bytesUntilNextAvSync;
    private final androidx.media3.exoplayer.audio.ChannelMappingAudioProcessor channelMappingAudioProcessor;
    private androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration configuration;
    private final android.content.Context context;
    private final boolean enableFloatOutput;
    private boolean externalAudioSessionIdProvided;
    private int framesPerEncodedSample;
    private boolean handledEndOfStream;
    private boolean handledOffloadOnPresentationEnded;
    private final androidx.media3.exoplayer.audio.DefaultAudioSink.PendingExceptionHolder<androidx.media3.exoplayer.audio.AudioSink.InitializationException> initializationExceptionPendingExceptionHolder;
    private java.nio.ByteBuffer inputBuffer;
    private int inputBufferAccessUnitCount;
    private boolean isWaitingForOffloadEndOfStreamHandled;
    private long lastFeedElapsedRealtimeMs;
    private long lastTunnelingAvSyncPresentationTimeUs;
    private androidx.media3.exoplayer.audio.AudioSink.Listener listener;
    private androidx.media3.exoplayer.audio.DefaultAudioSink.MediaPositionParameters mediaPositionParameters;
    private final java.util.ArrayDeque<androidx.media3.exoplayer.audio.DefaultAudioSink.MediaPositionParameters> mediaPositionParametersCheckpoints;
    private boolean offloadDisabledUntilNextConfiguration;
    private int offloadMode;
    private androidx.media3.exoplayer.audio.DefaultAudioSink.StreamEventCallbackV29 offloadStreamEventCallbackV29;
    private androidx.media3.exoplayer.audio.DefaultAudioSink.OnRoutingChangedListenerApi24 onRoutingChangedListener;
    private java.nio.ByteBuffer outputBuffer;
    private androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration pendingConfiguration;
    private android.os.Looper playbackLooper;
    private androidx.media3.common.PlaybackParameters playbackParameters;
    private androidx.media3.exoplayer.analytics.PlayerId playerId;
    private boolean playing;
    private byte[] preV21OutputBuffer;
    private int preV21OutputBufferOffset;
    private final boolean preferAudioTrackPlaybackParams;
    private androidx.media3.exoplayer.audio.AudioDeviceInfoApi23 preferredDevice;
    private final androidx.media3.common.util.ConditionVariable releasingConditionVariable;
    private android.os.Handler reportSkippedSilenceHandler;
    private boolean skipSilenceEnabled;
    private long skippedOutputFrameCountAtLastPosition;
    private long startMediaTimeUs;
    private boolean startMediaTimeUsNeedsInit;
    private boolean startMediaTimeUsNeedsSync;
    private boolean stoppedAudioTrack;
    private long submittedEncodedFrames;
    private long submittedPcmBytes;
    private final com.google.common.collect.ImmutableList<androidx.media3.common.audio.AudioProcessor> toFloatPcmAvailableAudioProcessors;
    private final com.google.common.collect.ImmutableList<androidx.media3.common.audio.AudioProcessor> toIntPcmAvailableAudioProcessors;
    private final androidx.media3.exoplayer.audio.TrimmingAudioProcessor trimmingAudioProcessor;
    private boolean tunneling;
    private float volume;
    private final androidx.media3.exoplayer.audio.DefaultAudioSink.PendingExceptionHolder<androidx.media3.exoplayer.audio.AudioSink.WriteException> writeExceptionPendingExceptionHolder;
    private long writtenEncodedFrames;
    private long writtenPcmBytes;

    public interface AudioOffloadSupportProvider {
        androidx.media3.exoplayer.audio.AudioOffloadSupport getAudioOffloadSupport(androidx.media3.common.Format format, androidx.media3.common.AudioAttributes audioAttributes);
    }

    @java.lang.Deprecated
    public interface AudioProcessorChain extends androidx.media3.common.audio.AudioProcessorChain {
    }

    public interface AudioTrackBufferSizeProvider {
        public static final androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackBufferSizeProvider DEFAULT = new androidx.media3.exoplayer.audio.DefaultAudioTrackBufferSizeProvider.Builder().build();

        int getBufferSizeInBytes(int i, int i2, int i3, int i4, int i5, int i6, double d);
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface OutputMode {
    }

    public static final class InvalidAudioTrackTimestampException extends java.lang.RuntimeException {
        private InvalidAudioTrackTimestampException(java.lang.String str) {
            super(str);
        }
    }

    public static class DefaultAudioProcessorChain implements androidx.media3.exoplayer.audio.DefaultAudioSink.AudioProcessorChain {
        private final androidx.media3.common.audio.AudioProcessor[] audioProcessors;
        private final androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor silenceSkippingAudioProcessor;
        private final androidx.media3.common.audio.SonicAudioProcessor sonicAudioProcessor;

        public DefaultAudioProcessorChain(androidx.media3.common.audio.AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor(), new androidx.media3.common.audio.SonicAudioProcessor());
        }

        public DefaultAudioProcessorChain(androidx.media3.common.audio.AudioProcessor[] audioProcessorArr, androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor silenceSkippingAudioProcessor, androidx.media3.common.audio.SonicAudioProcessor sonicAudioProcessor) {
            androidx.media3.common.audio.AudioProcessor[] audioProcessorArr2 = new androidx.media3.common.audio.AudioProcessor[audioProcessorArr.length + 2];
            this.audioProcessors = audioProcessorArr2;
            java.lang.System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.silenceSkippingAudioProcessor = silenceSkippingAudioProcessor;
            this.sonicAudioProcessor = sonicAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length] = silenceSkippingAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length + 1] = sonicAudioProcessor;
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public androidx.media3.common.audio.AudioProcessor[] getAudioProcessors() {
            return this.audioProcessors;
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public androidx.media3.common.PlaybackParameters applyPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
            this.sonicAudioProcessor.setSpeed(playbackParameters.speed);
            this.sonicAudioProcessor.setPitch(playbackParameters.pitch);
            return playbackParameters;
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public boolean applySkipSilenceEnabled(boolean z) {
            this.silenceSkippingAudioProcessor.setEnabled(z);
            return z;
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public long getMediaDuration(long j) {
            return this.sonicAudioProcessor.isActive() ? this.sonicAudioProcessor.getMediaDuration(j) : j;
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public long getSkippedOutputFrameCount() {
            return this.silenceSkippingAudioProcessor.getSkippedFrames();
        }
    }

    public static final class Builder {
        private androidx.media3.exoplayer.audio.AudioCapabilities audioCapabilities;
        private androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener audioOffloadListener;
        private androidx.media3.exoplayer.audio.DefaultAudioSink.AudioOffloadSupportProvider audioOffloadSupportProvider;
        private androidx.media3.common.audio.AudioProcessorChain audioProcessorChain;
        private androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackBufferSizeProvider audioTrackBufferSizeProvider;
        private boolean buildCalled;
        private final android.content.Context context;
        private boolean enableAudioTrackPlaybackParams;
        private boolean enableFloatOutput;

        @java.lang.Deprecated
        public Builder() {
            this.context = null;
            this.audioCapabilities = androidx.media3.exoplayer.audio.AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
            this.audioTrackBufferSizeProvider = androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackBufferSizeProvider.DEFAULT;
        }

        public Builder(android.content.Context context) {
            this.context = context;
            this.audioCapabilities = androidx.media3.exoplayer.audio.AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
            this.audioTrackBufferSizeProvider = androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackBufferSizeProvider.DEFAULT;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder setAudioCapabilities(androidx.media3.exoplayer.audio.AudioCapabilities audioCapabilities) {
            androidx.media3.common.util.Assertions.checkNotNull(audioCapabilities);
            this.audioCapabilities = audioCapabilities;
            return this;
        }

        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder setAudioProcessors(androidx.media3.common.audio.AudioProcessor[] audioProcessorArr) {
            androidx.media3.common.util.Assertions.checkNotNull(audioProcessorArr);
            return setAudioProcessorChain(new androidx.media3.exoplayer.audio.DefaultAudioSink.DefaultAudioProcessorChain(audioProcessorArr));
        }

        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder setAudioProcessorChain(androidx.media3.common.audio.AudioProcessorChain audioProcessorChain) {
            androidx.media3.common.util.Assertions.checkNotNull(audioProcessorChain);
            this.audioProcessorChain = audioProcessorChain;
            return this;
        }

        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder setEnableFloatOutput(boolean z) {
            this.enableFloatOutput = z;
            return this;
        }

        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder setEnableAudioTrackPlaybackParams(boolean z) {
            this.enableAudioTrackPlaybackParams = z;
            return this;
        }

        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder setAudioTrackBufferSizeProvider(androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackBufferSizeProvider audioTrackBufferSizeProvider) {
            this.audioTrackBufferSizeProvider = audioTrackBufferSizeProvider;
            return this;
        }

        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder setAudioOffloadSupportProvider(androidx.media3.exoplayer.audio.DefaultAudioSink.AudioOffloadSupportProvider audioOffloadSupportProvider) {
            this.audioOffloadSupportProvider = audioOffloadSupportProvider;
            return this;
        }

        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder setExperimentalAudioOffloadListener(androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener audioOffloadListener) {
            this.audioOffloadListener = audioOffloadListener;
            return this;
        }

        public androidx.media3.exoplayer.audio.DefaultAudioSink build() {
            androidx.media3.common.util.Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            if (this.audioProcessorChain == null) {
                this.audioProcessorChain = new androidx.media3.exoplayer.audio.DefaultAudioSink.DefaultAudioProcessorChain(new androidx.media3.common.audio.AudioProcessor[0]);
            }
            if (this.audioOffloadSupportProvider == null) {
                this.audioOffloadSupportProvider = new androidx.media3.exoplayer.audio.DefaultAudioOffloadSupportProvider(this.context);
            }
            return new androidx.media3.exoplayer.audio.DefaultAudioSink(this);
        }
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.audioProcessorChain"})
    private DefaultAudioSink(androidx.media3.exoplayer.audio.DefaultAudioSink.Builder builder) {
        androidx.media3.exoplayer.audio.AudioCapabilities capabilities;
        android.content.Context context = builder.context;
        this.context = context;
        androidx.media3.common.AudioAttributes audioAttributes = androidx.media3.common.AudioAttributes.DEFAULT;
        this.audioAttributes = audioAttributes;
        if (context == null) {
            capabilities = builder.audioCapabilities;
        } else {
            capabilities = androidx.media3.exoplayer.audio.AudioCapabilities.getCapabilities(context, audioAttributes, null);
        }
        this.audioCapabilities = capabilities;
        this.audioProcessorChain = builder.audioProcessorChain;
        this.enableFloatOutput = androidx.media3.common.util.Util.SDK_INT >= 21 && builder.enableFloatOutput;
        this.preferAudioTrackPlaybackParams = androidx.media3.common.util.Util.SDK_INT >= 23 && builder.enableAudioTrackPlaybackParams;
        this.offloadMode = 0;
        this.audioTrackBufferSizeProvider = builder.audioTrackBufferSizeProvider;
        this.audioOffloadSupportProvider = (androidx.media3.exoplayer.audio.DefaultAudioSink.AudioOffloadSupportProvider) androidx.media3.common.util.Assertions.checkNotNull(builder.audioOffloadSupportProvider);
        androidx.media3.common.util.ConditionVariable conditionVariable = new androidx.media3.common.util.ConditionVariable(androidx.media3.common.util.Clock.DEFAULT);
        this.releasingConditionVariable = conditionVariable;
        conditionVariable.open();
        this.audioTrackPositionTracker = new androidx.media3.exoplayer.audio.AudioTrackPositionTracker(new androidx.media3.exoplayer.audio.DefaultAudioSink.PositionTrackerListener());
        androidx.media3.exoplayer.audio.ChannelMappingAudioProcessor channelMappingAudioProcessor = new androidx.media3.exoplayer.audio.ChannelMappingAudioProcessor();
        this.channelMappingAudioProcessor = channelMappingAudioProcessor;
        androidx.media3.exoplayer.audio.TrimmingAudioProcessor trimmingAudioProcessor = new androidx.media3.exoplayer.audio.TrimmingAudioProcessor();
        this.trimmingAudioProcessor = trimmingAudioProcessor;
        this.toIntPcmAvailableAudioProcessors = com.google.common.collect.ImmutableList.of((androidx.media3.exoplayer.audio.TrimmingAudioProcessor) new androidx.media3.common.audio.ToInt16PcmAudioProcessor(), (androidx.media3.exoplayer.audio.TrimmingAudioProcessor) channelMappingAudioProcessor, trimmingAudioProcessor);
        this.toFloatPcmAvailableAudioProcessors = com.google.common.collect.ImmutableList.of(new androidx.media3.exoplayer.audio.ToFloatPcmAudioProcessor());
        this.volume = 1.0f;
        this.audioSessionId = 0;
        this.auxEffectInfo = new androidx.media3.common.AuxEffectInfo(0, 0.0f);
        this.mediaPositionParameters = new androidx.media3.exoplayer.audio.DefaultAudioSink.MediaPositionParameters(androidx.media3.common.PlaybackParameters.DEFAULT, 0L, 0L);
        this.playbackParameters = androidx.media3.common.PlaybackParameters.DEFAULT;
        this.skipSilenceEnabled = false;
        this.mediaPositionParametersCheckpoints = new java.util.ArrayDeque<>();
        this.initializationExceptionPendingExceptionHolder = new androidx.media3.exoplayer.audio.DefaultAudioSink.PendingExceptionHolder<>(100L);
        this.writeExceptionPendingExceptionHolder = new androidx.media3.exoplayer.audio.DefaultAudioSink.PendingExceptionHolder<>(100L);
        this.audioOffloadListener = builder.audioOffloadListener;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setListener(androidx.media3.exoplayer.audio.AudioSink.Listener listener) {
        this.listener = listener;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPlayerId(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        this.playerId = playerId;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setClock(androidx.media3.common.util.Clock clock) {
        this.audioTrackPositionTracker.setClock(clock);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean supportsFormat(androidx.media3.common.Format format) {
        return getFormatSupport(format) != 0;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public int getFormatSupport(androidx.media3.common.Format format) {
        maybeStartAudioCapabilitiesReceiver();
        if (!androidx.media3.common.MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) {
            return this.audioCapabilities.isPassthroughPlaybackSupported(format, this.audioAttributes) ? 2 : 0;
        }
        if (androidx.media3.common.util.Util.isEncodingLinearPcm(format.pcmEncoding)) {
            return (format.pcmEncoding == 2 || (this.enableFloatOutput && format.pcmEncoding == 4)) ? 2 : 1;
        }
        androidx.media3.common.util.Log.w(TAG, "Invalid PCM encoding: " + format.pcmEncoding);
        return 0;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public androidx.media3.exoplayer.audio.AudioOffloadSupport getFormatOffloadSupport(androidx.media3.common.Format format) {
        if (this.offloadDisabledUntilNextConfiguration) {
            return androidx.media3.exoplayer.audio.AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        return this.audioOffloadSupportProvider.getAudioOffloadSupport(format, this.audioAttributes);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public long getCurrentPositionUs(boolean z) {
        if (!isAudioTrackInitialized() || this.startMediaTimeUsNeedsInit) {
            return Long.MIN_VALUE;
        }
        return applySkipping(applyMediaPositionParameters(java.lang.Math.min(this.audioTrackPositionTracker.getCurrentPositionUs(z), this.configuration.framesToDurationUs(getWrittenFrames()))));
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void configure(androidx.media3.common.Format format, int i, int[] iArr) throws androidx.media3.exoplayer.audio.AudioSink.ConfigurationException {
        androidx.media3.exoplayer.audio.AudioOffloadSupport formatOffloadSupport;
        androidx.media3.common.audio.AudioProcessingPipeline audioProcessingPipeline;
        int pcmFrameSize;
        int pcmFrameSize2;
        boolean z;
        int i2;
        int iIntValue;
        int i3;
        boolean z2;
        int i4;
        int bufferSizeInBytes;
        int[] iArr2;
        maybeStartAudioCapabilitiesReceiver();
        if (androidx.media3.common.MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) {
            androidx.media3.common.util.Assertions.checkArgument(androidx.media3.common.util.Util.isEncodingLinearPcm(format.pcmEncoding));
            pcmFrameSize = androidx.media3.common.util.Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
            com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
            if (shouldUseFloatOutput(format.pcmEncoding)) {
                builder.addAll((java.lang.Iterable) this.toFloatPcmAvailableAudioProcessors);
            } else {
                builder.addAll((java.lang.Iterable) this.toIntPcmAvailableAudioProcessors);
                builder.add((java.lang.Object[]) this.audioProcessorChain.getAudioProcessors());
            }
            androidx.media3.common.audio.AudioProcessingPipeline audioProcessingPipeline2 = new androidx.media3.common.audio.AudioProcessingPipeline(builder.build());
            if (audioProcessingPipeline2.equals(this.audioProcessingPipeline)) {
                audioProcessingPipeline2 = this.audioProcessingPipeline;
            }
            this.trimmingAudioProcessor.setTrimFrameCount(format.encoderDelay, format.encoderPadding);
            if (androidx.media3.common.util.Util.SDK_INT < 21 && format.channelCount == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i5 = 0; i5 < 6; i5++) {
                    iArr2[i5] = i5;
                }
            } else {
                iArr2 = iArr;
            }
            this.channelMappingAudioProcessor.setChannelMap(iArr2);
            try {
                androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormatConfigure = audioProcessingPipeline2.configure(new androidx.media3.common.audio.AudioProcessor.AudioFormat(format));
                int i6 = audioFormatConfigure.encoding;
                int i7 = audioFormatConfigure.sampleRate;
                int audioTrackChannelConfig = androidx.media3.common.util.Util.getAudioTrackChannelConfig(audioFormatConfigure.channelCount);
                i4 = 0;
                z = false;
                pcmFrameSize2 = androidx.media3.common.util.Util.getPcmFrameSize(i6, audioFormatConfigure.channelCount);
                audioProcessingPipeline = audioProcessingPipeline2;
                i2 = i7;
                iIntValue = audioTrackChannelConfig;
                z2 = this.preferAudioTrackPlaybackParams;
                i3 = i6;
            } catch (androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException e) {
                throw new androidx.media3.exoplayer.audio.AudioSink.ConfigurationException(e, format);
            }
        } else {
            androidx.media3.common.audio.AudioProcessingPipeline audioProcessingPipeline3 = new androidx.media3.common.audio.AudioProcessingPipeline(com.google.common.collect.ImmutableList.of());
            int i8 = format.sampleRate;
            if (this.offloadMode != 0) {
                formatOffloadSupport = getFormatOffloadSupport(format);
            } else {
                formatOffloadSupport = androidx.media3.exoplayer.audio.AudioOffloadSupport.DEFAULT_UNSUPPORTED;
            }
            if (this.offloadMode != 0 && formatOffloadSupport.isFormatSupported) {
                int encoding = androidx.media3.common.MimeTypes.getEncoding((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(format.sampleMimeType), format.codecs);
                int audioTrackChannelConfig2 = androidx.media3.common.util.Util.getAudioTrackChannelConfig(format.channelCount);
                audioProcessingPipeline = audioProcessingPipeline3;
                i4 = 1;
                z2 = true;
                pcmFrameSize = -1;
                pcmFrameSize2 = -1;
                i2 = i8;
                z = formatOffloadSupport.isGaplessSupported;
                i3 = encoding;
                iIntValue = audioTrackChannelConfig2;
            } else {
                android.util.Pair<java.lang.Integer, java.lang.Integer> encodingAndChannelConfigForPassthrough = this.audioCapabilities.getEncodingAndChannelConfigForPassthrough(format, this.audioAttributes);
                if (encodingAndChannelConfigForPassthrough == null) {
                    throw new androidx.media3.exoplayer.audio.AudioSink.ConfigurationException("Unable to configure passthrough for: " + format, format);
                }
                int iIntValue2 = ((java.lang.Integer) encodingAndChannelConfigForPassthrough.first).intValue();
                audioProcessingPipeline = audioProcessingPipeline3;
                pcmFrameSize = -1;
                pcmFrameSize2 = -1;
                z = false;
                i2 = i8;
                iIntValue = ((java.lang.Integer) encodingAndChannelConfigForPassthrough.second).intValue();
                i3 = iIntValue2;
                z2 = this.preferAudioTrackPlaybackParams;
                i4 = 2;
            }
        }
        if (i3 == 0) {
            throw new androidx.media3.exoplayer.audio.AudioSink.ConfigurationException("Invalid output encoding (mode=" + i4 + ") for: " + format, format);
        }
        if (iIntValue == 0) {
            throw new androidx.media3.exoplayer.audio.AudioSink.ConfigurationException("Invalid output channel config (mode=" + i4 + ") for: " + format, format);
        }
        int i9 = format.bitrate;
        if (androidx.media3.common.MimeTypes.AUDIO_DTS_EXPRESS.equals(format.sampleMimeType) && i9 == -1) {
            i9 = 768000;
        }
        int i10 = i9;
        if (i != 0) {
            bufferSizeInBytes = i;
        } else {
            bufferSizeInBytes = this.audioTrackBufferSizeProvider.getBufferSizeInBytes(getAudioTrackMinBufferSize(i2, iIntValue, i3), i3, i4, pcmFrameSize2 != -1 ? pcmFrameSize2 : 1, i2, i10, z2 ? 8.0d : 1.0d);
        }
        this.offloadDisabledUntilNextConfiguration = false;
        androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration configuration = new androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration(format, pcmFrameSize, i4, pcmFrameSize2, i2, iIntValue, i3, bufferSizeInBytes, audioProcessingPipeline, z2, z, this.tunneling);
        if (isAudioTrackInitialized()) {
            this.pendingConfiguration = configuration;
        } else {
            this.configuration = configuration;
        }
    }

    private void setupAudioProcessors() {
        androidx.media3.common.audio.AudioProcessingPipeline audioProcessingPipeline = this.configuration.audioProcessingPipeline;
        this.audioProcessingPipeline = audioProcessingPipeline;
        audioProcessingPipeline.flush();
    }

    private boolean initializeAudioTrack() throws androidx.media3.exoplayer.audio.AudioSink.InitializationException {
        androidx.media3.exoplayer.analytics.PlayerId playerId;
        if (!this.releasingConditionVariable.isOpen()) {
            return false;
        }
        android.media.AudioTrack audioTrackBuildAudioTrackWithRetry = buildAudioTrackWithRetry();
        this.audioTrack = audioTrackBuildAudioTrackWithRetry;
        if (isOffloadedPlayback(audioTrackBuildAudioTrackWithRetry)) {
            registerStreamEventCallbackV29(this.audioTrack);
            if (this.configuration.enableOffloadGapless) {
                this.audioTrack.setOffloadDelayPadding(this.configuration.inputFormat.encoderDelay, this.configuration.inputFormat.encoderPadding);
            }
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 31 && (playerId = this.playerId) != null) {
            androidx.media3.exoplayer.audio.DefaultAudioSink.Api31.setLogSessionIdOnAudioTrack(this.audioTrack, playerId);
        }
        this.audioSessionId = this.audioTrack.getAudioSessionId();
        this.audioTrackPositionTracker.setAudioTrack(this.audioTrack, this.configuration.outputMode == 2, this.configuration.outputEncoding, this.configuration.outputPcmFrameSize, this.configuration.bufferSize);
        setVolumeInternal();
        if (this.auxEffectInfo.effectId != 0) {
            this.audioTrack.attachAuxEffect(this.auxEffectInfo.effectId);
            this.audioTrack.setAuxEffectSendLevel(this.auxEffectInfo.sendLevel);
        }
        if (this.preferredDevice != null && androidx.media3.common.util.Util.SDK_INT >= 23) {
            androidx.media3.exoplayer.audio.DefaultAudioSink.Api23.setPreferredDeviceOnAudioTrack(this.audioTrack, this.preferredDevice);
            androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.audioCapabilitiesReceiver;
            if (audioCapabilitiesReceiver != null) {
                audioCapabilitiesReceiver.setRoutedDevice(this.preferredDevice.audioDeviceInfo);
            }
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 24 && this.audioCapabilitiesReceiver != null) {
            this.onRoutingChangedListener = new androidx.media3.exoplayer.audio.DefaultAudioSink.OnRoutingChangedListenerApi24(this.audioTrack, this.audioCapabilitiesReceiver);
        }
        this.startMediaTimeUsNeedsInit = true;
        androidx.media3.exoplayer.audio.AudioSink.Listener listener = this.listener;
        if (listener != null) {
            listener.onAudioTrackInitialized(this.configuration.buildAudioTrackConfig());
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void play() {
        this.playing = true;
        if (isAudioTrackInitialized()) {
            this.audioTrackPositionTracker.start();
            this.audioTrack.play();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void handleDiscontinuity() {
        this.startMediaTimeUsNeedsSync = true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean handleBuffer(java.nio.ByteBuffer byteBuffer, long j, int i) throws java.lang.Exception {
        java.nio.ByteBuffer byteBuffer2 = this.inputBuffer;
        androidx.media3.common.util.Assertions.checkArgument(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.pendingConfiguration != null) {
            if (!drainToEndOfStream()) {
                return false;
            }
            if (!this.pendingConfiguration.canReuseAudioTrack(this.configuration)) {
                playPendingData();
                if (hasPendingData()) {
                    return false;
                }
                flush();
            } else {
                this.configuration = this.pendingConfiguration;
                this.pendingConfiguration = null;
                android.media.AudioTrack audioTrack = this.audioTrack;
                if (audioTrack != null && isOffloadedPlayback(audioTrack) && this.configuration.enableOffloadGapless) {
                    if (this.audioTrack.getPlayState() == 3) {
                        this.audioTrack.setOffloadEndOfStream();
                        this.audioTrackPositionTracker.expectRawPlaybackHeadReset();
                    }
                    this.audioTrack.setOffloadDelayPadding(this.configuration.inputFormat.encoderDelay, this.configuration.inputFormat.encoderPadding);
                    this.isWaitingForOffloadEndOfStreamHandled = true;
                }
            }
            applyAudioProcessorPlaybackParametersAndSkipSilence(j);
        }
        if (!isAudioTrackInitialized()) {
            try {
                if (!initializeAudioTrack()) {
                    return false;
                }
            } catch (androidx.media3.exoplayer.audio.AudioSink.InitializationException e) {
                if (e.isRecoverable) {
                    throw e;
                }
                this.initializationExceptionPendingExceptionHolder.throwExceptionIfDeadlineIsReached(e);
                return false;
            }
        }
        this.initializationExceptionPendingExceptionHolder.clear();
        if (this.startMediaTimeUsNeedsInit) {
            this.startMediaTimeUs = java.lang.Math.max(0L, j);
            this.startMediaTimeUsNeedsSync = false;
            this.startMediaTimeUsNeedsInit = false;
            if (useAudioTrackPlaybackParams()) {
                setAudioTrackPlaybackParametersV23();
            }
            applyAudioProcessorPlaybackParametersAndSkipSilence(j);
            if (this.playing) {
                play();
            }
        }
        if (!this.audioTrackPositionTracker.mayHandleBuffer(getWrittenFrames())) {
            return false;
        }
        if (this.inputBuffer == null) {
            androidx.media3.common.util.Assertions.checkArgument(byteBuffer.order() == java.nio.ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.configuration.outputMode != 0 && this.framesPerEncodedSample == 0) {
                int framesPerEncodedSample = getFramesPerEncodedSample(this.configuration.outputEncoding, byteBuffer);
                this.framesPerEncodedSample = framesPerEncodedSample;
                if (framesPerEncodedSample == 0) {
                    return true;
                }
            }
            if (this.afterDrainParameters != null) {
                if (!drainToEndOfStream()) {
                    return false;
                }
                applyAudioProcessorPlaybackParametersAndSkipSilence(j);
                this.afterDrainParameters = null;
            }
            long jInputFramesToDurationUs = this.startMediaTimeUs + this.configuration.inputFramesToDurationUs(getSubmittedFrames() - this.trimmingAudioProcessor.getTrimmedFrameCount());
            if (!this.startMediaTimeUsNeedsSync && java.lang.Math.abs(jInputFramesToDurationUs - j) > 200000) {
                androidx.media3.exoplayer.audio.AudioSink.Listener listener = this.listener;
                if (listener != null) {
                    listener.onAudioSinkError(new androidx.media3.exoplayer.audio.AudioSink.UnexpectedDiscontinuityException(j, jInputFramesToDurationUs));
                }
                this.startMediaTimeUsNeedsSync = true;
            }
            if (this.startMediaTimeUsNeedsSync) {
                if (!drainToEndOfStream()) {
                    return false;
                }
                long j2 = j - jInputFramesToDurationUs;
                this.startMediaTimeUs += j2;
                this.startMediaTimeUsNeedsSync = false;
                applyAudioProcessorPlaybackParametersAndSkipSilence(j);
                androidx.media3.exoplayer.audio.AudioSink.Listener listener2 = this.listener;
                if (listener2 != null && j2 != 0) {
                    listener2.onPositionDiscontinuity();
                }
            }
            if (this.configuration.outputMode == 0) {
                this.submittedPcmBytes += (long) byteBuffer.remaining();
            } else {
                this.submittedEncodedFrames += ((long) this.framesPerEncodedSample) * ((long) i);
            }
            this.inputBuffer = byteBuffer;
            this.inputBufferAccessUnitCount = i;
        }
        processBuffers(j);
        if (!this.inputBuffer.hasRemaining()) {
            this.inputBuffer = null;
            this.inputBufferAccessUnitCount = 0;
            return true;
        }
        if (!this.audioTrackPositionTracker.isStalled(getWrittenFrames())) {
            return false;
        }
        androidx.media3.common.util.Log.w(TAG, "Resetting stalled audio track");
        flush();
        return true;
    }

    private android.media.AudioTrack buildAudioTrackWithRetry() throws androidx.media3.exoplayer.audio.AudioSink.InitializationException {
        try {
            return buildAudioTrack((androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration) androidx.media3.common.util.Assertions.checkNotNull(this.configuration));
        } catch (androidx.media3.exoplayer.audio.AudioSink.InitializationException e) {
            if (this.configuration.bufferSize > 1000000) {
                androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration configurationCopyWithBufferSize = this.configuration.copyWithBufferSize(1000000);
                try {
                    android.media.AudioTrack audioTrackBuildAudioTrack = buildAudioTrack(configurationCopyWithBufferSize);
                    this.configuration = configurationCopyWithBufferSize;
                    return audioTrackBuildAudioTrack;
                } catch (androidx.media3.exoplayer.audio.AudioSink.InitializationException e2) {
                    e.addSuppressed(e2);
                    maybeDisableOffload();
                    throw e;
                }
            }
            maybeDisableOffload();
            throw e;
        }
    }

    private android.media.AudioTrack buildAudioTrack(androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration configuration) throws androidx.media3.exoplayer.audio.AudioSink.InitializationException {
        try {
            android.media.AudioTrack audioTrackBuildAudioTrack = configuration.buildAudioTrack(this.audioAttributes, this.audioSessionId);
            androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener audioOffloadListener = this.audioOffloadListener;
            if (audioOffloadListener != null) {
                audioOffloadListener.onOffloadedPlayback(isOffloadedPlayback(audioTrackBuildAudioTrack));
            }
            return audioTrackBuildAudioTrack;
        } catch (androidx.media3.exoplayer.audio.AudioSink.InitializationException e) {
            androidx.media3.exoplayer.audio.AudioSink.Listener listener = this.listener;
            if (listener != null) {
                listener.onAudioSinkError(e);
            }
            throw e;
        }
    }

    private void registerStreamEventCallbackV29(android.media.AudioTrack audioTrack) {
        if (this.offloadStreamEventCallbackV29 == null) {
            this.offloadStreamEventCallbackV29 = new androidx.media3.exoplayer.audio.DefaultAudioSink.StreamEventCallbackV29();
        }
        this.offloadStreamEventCallbackV29.register(audioTrack);
    }

    private void processBuffers(long j) throws java.lang.Exception {
        java.nio.ByteBuffer output;
        if (!this.audioProcessingPipeline.isOperational()) {
            java.nio.ByteBuffer byteBuffer = this.inputBuffer;
            if (byteBuffer == null) {
                byteBuffer = androidx.media3.common.audio.AudioProcessor.EMPTY_BUFFER;
            }
            writeBuffer(byteBuffer, j);
            return;
        }
        while (!this.audioProcessingPipeline.isEnded()) {
            do {
                output = this.audioProcessingPipeline.getOutput();
                if (output.hasRemaining()) {
                    writeBuffer(output, j);
                } else {
                    java.nio.ByteBuffer byteBuffer2 = this.inputBuffer;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.audioProcessingPipeline.queueInput(this.inputBuffer);
                    }
                }
            } while (!output.hasRemaining());
            return;
        }
    }

    private boolean drainToEndOfStream() throws java.lang.Exception {
        if (!this.audioProcessingPipeline.isOperational()) {
            java.nio.ByteBuffer byteBuffer = this.outputBuffer;
            if (byteBuffer == null) {
                return true;
            }
            writeBuffer(byteBuffer, Long.MIN_VALUE);
            return this.outputBuffer == null;
        }
        this.audioProcessingPipeline.queueEndOfStream();
        processBuffers(Long.MIN_VALUE);
        if (!this.audioProcessingPipeline.isEnded()) {
            return false;
        }
        java.nio.ByteBuffer byteBuffer2 = this.outputBuffer;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c1  */
    private void writeBuffer(java.nio.ByteBuffer byteBuffer, long j) throws java.lang.Exception {
        int iWriteNonBlockingV21;
        androidx.media3.exoplayer.audio.AudioSink.Listener listener;
        if (byteBuffer.hasRemaining()) {
            java.nio.ByteBuffer byteBuffer2 = this.outputBuffer;
            boolean z = true;
            if (byteBuffer2 != null) {
                androidx.media3.common.util.Assertions.checkArgument(byteBuffer2 == byteBuffer);
            } else {
                this.outputBuffer = byteBuffer;
                if (androidx.media3.common.util.Util.SDK_INT < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.preV21OutputBuffer;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.preV21OutputBuffer = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.preV21OutputBuffer, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.preV21OutputBufferOffset = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (androidx.media3.common.util.Util.SDK_INT < 21) {
                int availableBufferSize = this.audioTrackPositionTracker.getAvailableBufferSize(this.writtenPcmBytes);
                if (availableBufferSize > 0) {
                    iWriteNonBlockingV21 = this.audioTrack.write(this.preV21OutputBuffer, this.preV21OutputBufferOffset, java.lang.Math.min(iRemaining2, availableBufferSize));
                    if (iWriteNonBlockingV21 > 0) {
                        this.preV21OutputBufferOffset += iWriteNonBlockingV21;
                        byteBuffer.position(byteBuffer.position() + iWriteNonBlockingV21);
                    }
                } else {
                    iWriteNonBlockingV21 = 0;
                }
            } else if (this.tunneling) {
                androidx.media3.common.util.Assertions.checkState(j != androidx.media3.common.C.TIME_UNSET);
                if (j == Long.MIN_VALUE) {
                    j = this.lastTunnelingAvSyncPresentationTimeUs;
                } else {
                    this.lastTunnelingAvSyncPresentationTimeUs = j;
                }
                iWriteNonBlockingV21 = writeNonBlockingWithAvSyncV21(this.audioTrack, byteBuffer, iRemaining2, j);
            } else {
                iWriteNonBlockingV21 = writeNonBlockingV21(this.audioTrack, byteBuffer, iRemaining2);
            }
            this.lastFeedElapsedRealtimeMs = android.os.SystemClock.elapsedRealtime();
            if (iWriteNonBlockingV21 < 0) {
                if (!isAudioTrackDeadObject(iWriteNonBlockingV21)) {
                    z = false;
                } else if (getWrittenFrames() <= 0) {
                    if (isOffloadedPlayback(this.audioTrack)) {
                        maybeDisableOffload();
                    } else {
                        z = false;
                    }
                }
                androidx.media3.exoplayer.audio.AudioSink.WriteException writeException = new androidx.media3.exoplayer.audio.AudioSink.WriteException(iWriteNonBlockingV21, this.configuration.inputFormat, z);
                androidx.media3.exoplayer.audio.AudioSink.Listener listener2 = this.listener;
                if (listener2 != null) {
                    listener2.onAudioSinkError(writeException);
                }
                if (writeException.isRecoverable) {
                    this.audioCapabilities = androidx.media3.exoplayer.audio.AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
                    throw writeException;
                }
                this.writeExceptionPendingExceptionHolder.throwExceptionIfDeadlineIsReached(writeException);
                return;
            }
            this.writeExceptionPendingExceptionHolder.clear();
            if (isOffloadedPlayback(this.audioTrack)) {
                if (this.writtenEncodedFrames > 0) {
                    this.isWaitingForOffloadEndOfStreamHandled = false;
                }
                if (this.playing && (listener = this.listener) != null && iWriteNonBlockingV21 < iRemaining2 && !this.isWaitingForOffloadEndOfStreamHandled) {
                    listener.onOffloadBufferFull();
                }
            }
            if (this.configuration.outputMode == 0) {
                this.writtenPcmBytes += (long) iWriteNonBlockingV21;
            }
            if (iWriteNonBlockingV21 == iRemaining2) {
                if (this.configuration.outputMode != 0) {
                    androidx.media3.common.util.Assertions.checkState(byteBuffer == this.inputBuffer);
                    this.writtenEncodedFrames += ((long) this.framesPerEncodedSample) * ((long) this.inputBufferAccessUnitCount);
                }
                this.outputBuffer = null;
            }
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void playToEndOfStream() throws androidx.media3.exoplayer.audio.AudioSink.WriteException {
        if (!this.handledEndOfStream && isAudioTrackInitialized() && drainToEndOfStream()) {
            playPendingData();
            this.handledEndOfStream = true;
        }
    }

    private void maybeDisableOffload() {
        if (this.configuration.outputModeIsOffload()) {
            this.offloadDisabledUntilNextConfiguration = true;
        }
    }

    private static boolean isAudioTrackDeadObject(int i) {
        return (androidx.media3.common.util.Util.SDK_INT >= 24 && i == -6) || i == ERROR_NATIVE_DEAD_OBJECT;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean isEnded() {
        return !isAudioTrackInitialized() || (this.handledEndOfStream && !hasPendingData());
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean hasPendingData() {
        return isAudioTrackInitialized() && !(androidx.media3.common.util.Util.SDK_INT >= 29 && this.audioTrack.isOffloadedPlayback() && this.handledOffloadOnPresentationEnded) && this.audioTrackPositionTracker.hasPendingData(getWrittenFrames());
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        this.playbackParameters = new androidx.media3.common.PlaybackParameters(androidx.media3.common.util.Util.constrainValue(playbackParameters.speed, 0.1f, 8.0f), androidx.media3.common.util.Util.constrainValue(playbackParameters.pitch, 0.1f, 8.0f));
        if (useAudioTrackPlaybackParams()) {
            setAudioTrackPlaybackParametersV23();
        } else {
            setAudioProcessorPlaybackParameters(playbackParameters);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public androidx.media3.common.PlaybackParameters getPlaybackParameters() {
        return this.playbackParameters;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setSkipSilenceEnabled(boolean z) {
        this.skipSilenceEnabled = z;
        setAudioProcessorPlaybackParameters(useAudioTrackPlaybackParams() ? androidx.media3.common.PlaybackParameters.DEFAULT : this.playbackParameters);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean getSkipSilenceEnabled() {
        return this.skipSilenceEnabled;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes) {
        if (this.audioAttributes.equals(audioAttributes)) {
            return;
        }
        this.audioAttributes = audioAttributes;
        if (this.tunneling) {
            return;
        }
        androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.audioCapabilitiesReceiver;
        if (audioCapabilitiesReceiver != null) {
            audioCapabilitiesReceiver.setAudioAttributes(audioAttributes);
        }
        flush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public androidx.media3.common.AudioAttributes getAudioAttributes() {
        return this.audioAttributes;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioSessionId(int i) {
        if (this.audioSessionId != i) {
            this.audioSessionId = i;
            this.externalAudioSessionIdProvided = i != 0;
            flush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAuxEffectInfo(androidx.media3.common.AuxEffectInfo auxEffectInfo) {
        if (this.auxEffectInfo.equals(auxEffectInfo)) {
            return;
        }
        int i = auxEffectInfo.effectId;
        float f = auxEffectInfo.sendLevel;
        if (this.audioTrack != null) {
            if (this.auxEffectInfo.effectId != i) {
                this.audioTrack.attachAuxEffect(i);
            }
            if (i != 0) {
                this.audioTrack.setAuxEffectSendLevel(f);
            }
        }
        this.auxEffectInfo = auxEffectInfo;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPreferredDevice(android.media.AudioDeviceInfo audioDeviceInfo) {
        this.preferredDevice = audioDeviceInfo == null ? null : new androidx.media3.exoplayer.audio.AudioDeviceInfoApi23(audioDeviceInfo);
        androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.audioCapabilitiesReceiver;
        if (audioCapabilitiesReceiver != null) {
            audioCapabilitiesReceiver.setRoutedDevice(audioDeviceInfo);
        }
        android.media.AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            androidx.media3.exoplayer.audio.DefaultAudioSink.Api23.setPreferredDeviceOnAudioTrack(audioTrack, this.preferredDevice);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void enableTunnelingV21() {
        androidx.media3.common.util.Assertions.checkState(androidx.media3.common.util.Util.SDK_INT >= 21);
        androidx.media3.common.util.Assertions.checkState(this.externalAudioSessionIdProvided);
        if (this.tunneling) {
            return;
        }
        this.tunneling = true;
        flush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void disableTunneling() {
        if (this.tunneling) {
            this.tunneling = false;
            flush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setOffloadMode(int i) {
        androidx.media3.common.util.Assertions.checkState(androidx.media3.common.util.Util.SDK_INT >= 29);
        this.offloadMode = i;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setOffloadDelayPadding(int i, int i2) {
        androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration configuration;
        android.media.AudioTrack audioTrack = this.audioTrack;
        if (audioTrack == null || !isOffloadedPlayback(audioTrack) || (configuration = this.configuration) == null || !configuration.enableOffloadGapless) {
            return;
        }
        this.audioTrack.setOffloadDelayPadding(i, i2);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setVolume(float f) {
        if (this.volume != f) {
            this.volume = f;
            setVolumeInternal();
        }
    }

    private void setVolumeInternal() {
        if (isAudioTrackInitialized()) {
            if (androidx.media3.common.util.Util.SDK_INT >= 21) {
                setVolumeInternalV21(this.audioTrack, this.volume);
            } else {
                setVolumeInternalV3(this.audioTrack, this.volume);
            }
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void pause() {
        this.playing = false;
        if (isAudioTrackInitialized()) {
            if (this.audioTrackPositionTracker.pause() || isOffloadedPlayback(this.audioTrack)) {
                this.audioTrack.pause();
            }
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void flush() {
        androidx.media3.exoplayer.audio.DefaultAudioSink.OnRoutingChangedListenerApi24 onRoutingChangedListenerApi24;
        if (isAudioTrackInitialized()) {
            resetSinkStateForFlush();
            if (this.audioTrackPositionTracker.isPlaying()) {
                this.audioTrack.pause();
            }
            if (isOffloadedPlayback(this.audioTrack)) {
                ((androidx.media3.exoplayer.audio.DefaultAudioSink.StreamEventCallbackV29) androidx.media3.common.util.Assertions.checkNotNull(this.offloadStreamEventCallbackV29)).unregister(this.audioTrack);
            }
            if (androidx.media3.common.util.Util.SDK_INT < 21 && !this.externalAudioSessionIdProvided) {
                this.audioSessionId = 0;
            }
            androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfigBuildAudioTrackConfig = this.configuration.buildAudioTrackConfig();
            androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration configuration = this.pendingConfiguration;
            if (configuration != null) {
                this.configuration = configuration;
                this.pendingConfiguration = null;
            }
            this.audioTrackPositionTracker.reset();
            if (androidx.media3.common.util.Util.SDK_INT >= 24 && (onRoutingChangedListenerApi24 = this.onRoutingChangedListener) != null) {
                onRoutingChangedListenerApi24.release();
                this.onRoutingChangedListener = null;
            }
            releaseAudioTrackAsync(this.audioTrack, this.releasingConditionVariable, this.listener, audioTrackConfigBuildAudioTrackConfig);
            this.audioTrack = null;
        }
        this.writeExceptionPendingExceptionHolder.clear();
        this.initializationExceptionPendingExceptionHolder.clear();
        this.skippedOutputFrameCountAtLastPosition = 0L;
        this.accumulatedSkippedSilenceDurationUs = 0L;
        android.os.Handler handler = this.reportSkippedSilenceHandler;
        if (handler != null) {
            ((android.os.Handler) androidx.media3.common.util.Assertions.checkNotNull(handler)).removeCallbacksAndMessages(null);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void reset() {
        flush();
        com.google.common.collect.UnmodifiableIterator<androidx.media3.common.audio.AudioProcessor> it = this.toIntPcmAvailableAudioProcessors.iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
        com.google.common.collect.UnmodifiableIterator<androidx.media3.common.audio.AudioProcessor> it2 = this.toFloatPcmAvailableAudioProcessors.iterator();
        while (it2.hasNext()) {
            it2.next().reset();
        }
        androidx.media3.common.audio.AudioProcessingPipeline audioProcessingPipeline = this.audioProcessingPipeline;
        if (audioProcessingPipeline != null) {
            audioProcessingPipeline.reset();
        }
        this.playing = false;
        this.offloadDisabledUntilNextConfiguration = false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void release() {
        androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.audioCapabilitiesReceiver;
        if (audioCapabilitiesReceiver != null) {
            audioCapabilitiesReceiver.unregister();
        }
    }

    public void onAudioCapabilitiesChanged(androidx.media3.exoplayer.audio.AudioCapabilities audioCapabilities) {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        android.os.Looper looper = this.playbackLooper;
        if (looper != looperMyLooper) {
            throw new java.lang.IllegalStateException("Current looper (" + (looperMyLooper != null ? looperMyLooper.getThread().getName() : "null") + ") is not the playback looper (" + (looper == null ? "null" : looper.getThread().getName()) + ")");
        }
        if (audioCapabilities.equals(this.audioCapabilities)) {
            return;
        }
        this.audioCapabilities = audioCapabilities;
        androidx.media3.exoplayer.audio.AudioSink.Listener listener = this.listener;
        if (listener != null) {
            listener.onAudioCapabilitiesChanged();
        }
    }

    private void resetSinkStateForFlush() {
        this.submittedPcmBytes = 0L;
        this.submittedEncodedFrames = 0L;
        this.writtenPcmBytes = 0L;
        this.writtenEncodedFrames = 0L;
        this.isWaitingForOffloadEndOfStreamHandled = false;
        this.framesPerEncodedSample = 0;
        this.mediaPositionParameters = new androidx.media3.exoplayer.audio.DefaultAudioSink.MediaPositionParameters(this.playbackParameters, 0L, 0L);
        this.startMediaTimeUs = 0L;
        this.afterDrainParameters = null;
        this.mediaPositionParametersCheckpoints.clear();
        this.inputBuffer = null;
        this.inputBufferAccessUnitCount = 0;
        this.outputBuffer = null;
        this.stoppedAudioTrack = false;
        this.handledEndOfStream = false;
        this.handledOffloadOnPresentationEnded = false;
        this.avSyncHeader = null;
        this.bytesUntilNextAvSync = 0;
        this.trimmingAudioProcessor.resetTrimmedFrameCount();
        setupAudioProcessors();
    }

    private void setAudioTrackPlaybackParametersV23() {
        if (isAudioTrackInitialized()) {
            try {
                this.audioTrack.setPlaybackParams(new android.media.PlaybackParams().allowDefaults().setSpeed(this.playbackParameters.speed).setPitch(this.playbackParameters.pitch).setAudioFallbackMode(2));
            } catch (java.lang.IllegalArgumentException e) {
                androidx.media3.common.util.Log.w(TAG, "Failed to set playback params", e);
            }
            androidx.media3.common.PlaybackParameters playbackParameters = new androidx.media3.common.PlaybackParameters(this.audioTrack.getPlaybackParams().getSpeed(), this.audioTrack.getPlaybackParams().getPitch());
            this.playbackParameters = playbackParameters;
            this.audioTrackPositionTracker.setAudioTrackPlaybackSpeed(playbackParameters.speed);
        }
    }

    private void setAudioProcessorPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        androidx.media3.exoplayer.audio.DefaultAudioSink.MediaPositionParameters mediaPositionParameters = new androidx.media3.exoplayer.audio.DefaultAudioSink.MediaPositionParameters(playbackParameters, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET);
        if (isAudioTrackInitialized()) {
            this.afterDrainParameters = mediaPositionParameters;
        } else {
            this.mediaPositionParameters = mediaPositionParameters;
        }
    }

    private void applyAudioProcessorPlaybackParametersAndSkipSilence(long j) {
        androidx.media3.common.PlaybackParameters playbackParametersApplyPlaybackParameters;
        if (!useAudioTrackPlaybackParams()) {
            if (shouldApplyAudioProcessorPlaybackParameters()) {
                playbackParametersApplyPlaybackParameters = this.audioProcessorChain.applyPlaybackParameters(this.playbackParameters);
            } else {
                playbackParametersApplyPlaybackParameters = androidx.media3.common.PlaybackParameters.DEFAULT;
            }
            this.playbackParameters = playbackParametersApplyPlaybackParameters;
        } else {
            playbackParametersApplyPlaybackParameters = androidx.media3.common.PlaybackParameters.DEFAULT;
        }
        androidx.media3.common.PlaybackParameters playbackParameters = playbackParametersApplyPlaybackParameters;
        this.skipSilenceEnabled = shouldApplyAudioProcessorPlaybackParameters() ? this.audioProcessorChain.applySkipSilenceEnabled(this.skipSilenceEnabled) : false;
        this.mediaPositionParametersCheckpoints.add(new androidx.media3.exoplayer.audio.DefaultAudioSink.MediaPositionParameters(playbackParameters, java.lang.Math.max(0L, j), this.configuration.framesToDurationUs(getWrittenFrames())));
        setupAudioProcessors();
        androidx.media3.exoplayer.audio.AudioSink.Listener listener = this.listener;
        if (listener != null) {
            listener.onSkipSilenceEnabledChanged(this.skipSilenceEnabled);
        }
    }

    private boolean shouldApplyAudioProcessorPlaybackParameters() {
        return (this.tunneling || this.configuration.outputMode != 0 || shouldUseFloatOutput(this.configuration.inputFormat.pcmEncoding)) ? false : true;
    }

    private boolean useAudioTrackPlaybackParams() {
        androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration configuration = this.configuration;
        return configuration != null && configuration.enableAudioTrackPlaybackParams && androidx.media3.common.util.Util.SDK_INT >= 23;
    }

    private boolean shouldUseFloatOutput(int i) {
        return this.enableFloatOutput && androidx.media3.common.util.Util.isEncodingHighResolutionPcm(i);
    }

    private long applyMediaPositionParameters(long j) {
        while (!this.mediaPositionParametersCheckpoints.isEmpty() && j >= this.mediaPositionParametersCheckpoints.getFirst().audioTrackPositionUs) {
            this.mediaPositionParameters = this.mediaPositionParametersCheckpoints.remove();
        }
        long j2 = j - this.mediaPositionParameters.audioTrackPositionUs;
        if (this.mediaPositionParametersCheckpoints.isEmpty()) {
            return this.mediaPositionParameters.mediaTimeUs + this.audioProcessorChain.getMediaDuration(j2);
        }
        androidx.media3.exoplayer.audio.DefaultAudioSink.MediaPositionParameters first = this.mediaPositionParametersCheckpoints.getFirst();
        return first.mediaTimeUs - androidx.media3.common.util.Util.getMediaDurationForPlayoutDuration(first.audioTrackPositionUs - j, this.mediaPositionParameters.playbackParameters.speed);
    }

    private long applySkipping(long j) {
        long skippedOutputFrameCount = this.audioProcessorChain.getSkippedOutputFrameCount();
        long jFramesToDurationUs = j + this.configuration.framesToDurationUs(skippedOutputFrameCount);
        long j2 = this.skippedOutputFrameCountAtLastPosition;
        if (skippedOutputFrameCount > j2) {
            long jFramesToDurationUs2 = this.configuration.framesToDurationUs(skippedOutputFrameCount - j2);
            this.skippedOutputFrameCountAtLastPosition = skippedOutputFrameCount;
            handleSkippedSilence(jFramesToDurationUs2);
        }
        return jFramesToDurationUs;
    }

    private void handleSkippedSilence(long j) {
        this.accumulatedSkippedSilenceDurationUs += j;
        if (this.reportSkippedSilenceHandler == null) {
            this.reportSkippedSilenceHandler = new android.os.Handler(android.os.Looper.myLooper());
        }
        this.reportSkippedSilenceHandler.removeCallbacksAndMessages(null);
        this.reportSkippedSilenceHandler.postDelayed(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.DefaultAudioSink$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.maybeReportSkippedSilence();
            }
        }, 100L);
    }

    private boolean isAudioTrackInitialized() {
        return this.audioTrack != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getSubmittedFrames() {
        if (this.configuration.outputMode == 0) {
            return this.submittedPcmBytes / ((long) this.configuration.inputPcmFrameSize);
        }
        return this.submittedEncodedFrames;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getWrittenFrames() {
        if (this.configuration.outputMode == 0) {
            return androidx.media3.common.util.Util.ceilDivide(this.writtenPcmBytes, this.configuration.outputPcmFrameSize);
        }
        return this.writtenEncodedFrames;
    }

    private void maybeStartAudioCapabilitiesReceiver() {
        if (this.audioCapabilitiesReceiver != null || this.context == null) {
            return;
        }
        this.playbackLooper = android.os.Looper.myLooper();
        androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver audioCapabilitiesReceiver = new androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver(this.context, new androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.Listener() { // from class: androidx.media3.exoplayer.audio.DefaultAudioSink$$ExternalSyntheticLambda3
            @Override // androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver.Listener
            public final void onAudioCapabilitiesChanged(androidx.media3.exoplayer.audio.AudioCapabilities audioCapabilities) {
                this.f$0.onAudioCapabilitiesChanged(audioCapabilities);
            }
        }, this.audioAttributes, this.preferredDevice);
        this.audioCapabilitiesReceiver = audioCapabilitiesReceiver;
        this.audioCapabilities = audioCapabilitiesReceiver.register();
    }

    private static boolean isOffloadedPlayback(android.media.AudioTrack audioTrack) {
        return androidx.media3.common.util.Util.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    private static int getFramesPerEncodedSample(int i, java.nio.ByteBuffer byteBuffer) {
        if (i != 20) {
            if (i != 30) {
                switch (i) {
                    case 5:
                    case 6:
                        break;
                    case 7:
                    case 8:
                        break;
                    case 9:
                        int mpegAudioFrameSampleCount = androidx.media3.extractor.MpegAudioUtil.parseMpegAudioFrameSampleCount(androidx.media3.common.util.Util.getBigEndianInt(byteBuffer, byteBuffer.position()));
                        if (mpegAudioFrameSampleCount != -1) {
                            return mpegAudioFrameSampleCount;
                        }
                        throw new java.lang.IllegalArgumentException();
                    case 10:
                        return 1024;
                    case 11:
                    case 12:
                        return 2048;
                    default:
                        switch (i) {
                            case 14:
                                int iFindTrueHdSyncframeOffset = androidx.media3.extractor.Ac3Util.findTrueHdSyncframeOffset(byteBuffer);
                                if (iFindTrueHdSyncframeOffset == -1) {
                                    return 0;
                                }
                                return androidx.media3.extractor.Ac3Util.parseTrueHdSyncframeAudioSampleCount(byteBuffer, iFindTrueHdSyncframeOffset) * 16;
                            case 15:
                                return 512;
                            case 16:
                                return 1024;
                            case 17:
                                return androidx.media3.extractor.Ac4Util.parseAc4SyncframeAudioSampleCount(byteBuffer);
                            case 18:
                                break;
                            default:
                                throw new java.lang.IllegalStateException("Unexpected audio encoding: " + i);
                        }
                        break;
                }
                return androidx.media3.extractor.Ac3Util.parseAc3SyncframeAudioSampleCount(byteBuffer);
            }
            return androidx.media3.extractor.DtsUtil.parseDtsAudioSampleCount(byteBuffer);
        }
        return androidx.media3.extractor.OpusUtil.parseOggPacketAudioSampleCount(byteBuffer);
    }

    private static int writeNonBlockingV21(android.media.AudioTrack audioTrack, java.nio.ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    private int writeNonBlockingWithAvSyncV21(android.media.AudioTrack audioTrack, java.nio.ByteBuffer byteBuffer, int i, long j) {
        if (androidx.media3.common.util.Util.SDK_INT >= 26) {
            return audioTrack.write(byteBuffer, i, 1, j * 1000);
        }
        if (this.avSyncHeader == null) {
            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(16);
            this.avSyncHeader = byteBufferAllocate;
            byteBufferAllocate.order(java.nio.ByteOrder.BIG_ENDIAN);
            this.avSyncHeader.putInt(1431633921);
        }
        if (this.bytesUntilNextAvSync == 0) {
            this.avSyncHeader.putInt(4, i);
            this.avSyncHeader.putLong(8, j * 1000);
            this.avSyncHeader.position(0);
            this.bytesUntilNextAvSync = i;
        }
        int iRemaining = this.avSyncHeader.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.avSyncHeader, iRemaining, 1);
            if (iWrite < 0) {
                this.bytesUntilNextAvSync = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iWriteNonBlockingV21 = writeNonBlockingV21(audioTrack, byteBuffer, i);
        if (iWriteNonBlockingV21 < 0) {
            this.bytesUntilNextAvSync = 0;
            return iWriteNonBlockingV21;
        }
        this.bytesUntilNextAvSync -= iWriteNonBlockingV21;
        return iWriteNonBlockingV21;
    }

    private static void setVolumeInternalV21(android.media.AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    private static void setVolumeInternalV3(android.media.AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    private void playPendingData() {
        if (this.stoppedAudioTrack) {
            return;
        }
        this.stoppedAudioTrack = true;
        this.audioTrackPositionTracker.handleEndOfStream(getWrittenFrames());
        if (isOffloadedPlayback(this.audioTrack)) {
            this.handledOffloadOnPresentationEnded = false;
        }
        this.audioTrack.stop();
        this.bytesUntilNextAvSync = 0;
    }

    private static void releaseAudioTrackAsync(final android.media.AudioTrack audioTrack, final androidx.media3.common.util.ConditionVariable conditionVariable, final androidx.media3.exoplayer.audio.AudioSink.Listener listener, final androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
        conditionVariable.close();
        final android.os.Handler handler = new android.os.Handler(android.os.Looper.myLooper());
        synchronized (releaseExecutorLock) {
            if (releaseExecutor == null) {
                releaseExecutor = androidx.media3.common.util.Util.newSingleThreadExecutor("ExoPlayer:AudioTrackReleaseThread");
            }
            pendingReleaseCount++;
            releaseExecutor.execute(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.DefaultAudioSink$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.exoplayer.audio.DefaultAudioSink.lambda$releaseAudioTrackAsync$1(audioTrack, listener, handler, audioTrackConfig, conditionVariable);
                }
            });
        }
    }

    static /* synthetic */ void lambda$releaseAudioTrackAsync$1(android.media.AudioTrack audioTrack, final androidx.media3.exoplayer.audio.AudioSink.Listener listener, android.os.Handler handler, final androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig, androidx.media3.common.util.ConditionVariable conditionVariable) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (listener != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.DefaultAudioSink$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        listener.onAudioTrackReleased(audioTrackConfig);
                    }
                });
            }
            conditionVariable.open();
            synchronized (releaseExecutorLock) {
                int i = pendingReleaseCount - 1;
                pendingReleaseCount = i;
                if (i == 0) {
                    releaseExecutor.shutdown();
                    releaseExecutor = null;
                }
            }
        } catch (java.lang.Throwable th) {
            if (listener != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.audio.DefaultAudioSink$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        listener.onAudioTrackReleased(audioTrackConfig);
                    }
                });
            }
            conditionVariable.open();
            synchronized (releaseExecutorLock) {
                int i2 = pendingReleaseCount - 1;
                pendingReleaseCount = i2;
                if (i2 == 0) {
                    releaseExecutor.shutdown();
                    releaseExecutor = null;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class OnRoutingChangedListenerApi24 {
        private final android.media.AudioTrack audioTrack;
        private final androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver capabilitiesReceiver;
        private android.media.AudioRouting.OnRoutingChangedListener listener = new android.media.AudioRouting.OnRoutingChangedListener() { // from class: androidx.media3.exoplayer.audio.DefaultAudioSink$OnRoutingChangedListenerApi24$$ExternalSyntheticLambda0
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(android.media.AudioRouting audioRouting) {
                this.f$0.onRoutingChanged(audioRouting);
            }
        };

        public OnRoutingChangedListenerApi24(android.media.AudioTrack audioTrack, androidx.media3.exoplayer.audio.AudioCapabilitiesReceiver audioCapabilitiesReceiver) {
            this.audioTrack = audioTrack;
            this.capabilitiesReceiver = audioCapabilitiesReceiver;
            audioTrack.addOnRoutingChangedListener(this.listener, new android.os.Handler(android.os.Looper.myLooper()));
        }

        public void release() {
            this.audioTrack.removeOnRoutingChangedListener((android.media.AudioRouting.OnRoutingChangedListener) androidx.media3.common.util.Assertions.checkNotNull(this.listener));
            this.listener = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onRoutingChanged(android.media.AudioRouting audioRouting) {
            if (this.listener == null || audioRouting.getRoutedDevice() == null) {
                return;
            }
            this.capabilitiesReceiver.setRoutedDevice(audioRouting.getRoutedDevice());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class StreamEventCallbackV29 {
        private final android.media.AudioTrack.StreamEventCallback callback;
        private final android.os.Handler handler = new android.os.Handler(android.os.Looper.myLooper());

        public StreamEventCallbackV29() {
            this.callback = new android.media.AudioTrack.StreamEventCallback() { // from class: androidx.media3.exoplayer.audio.DefaultAudioSink.StreamEventCallbackV29.1
                @Override // android.media.AudioTrack.StreamEventCallback
                public void onDataRequest(android.media.AudioTrack audioTrack, int i) {
                    if (audioTrack.equals(androidx.media3.exoplayer.audio.DefaultAudioSink.this.audioTrack) && androidx.media3.exoplayer.audio.DefaultAudioSink.this.listener != null && androidx.media3.exoplayer.audio.DefaultAudioSink.this.playing) {
                        androidx.media3.exoplayer.audio.DefaultAudioSink.this.listener.onOffloadBufferEmptying();
                    }
                }

                @Override // android.media.AudioTrack.StreamEventCallback
                public void onPresentationEnded(android.media.AudioTrack audioTrack) {
                    if (audioTrack.equals(androidx.media3.exoplayer.audio.DefaultAudioSink.this.audioTrack)) {
                        androidx.media3.exoplayer.audio.DefaultAudioSink.this.handledOffloadOnPresentationEnded = true;
                    }
                }

                @Override // android.media.AudioTrack.StreamEventCallback
                public void onTearDown(android.media.AudioTrack audioTrack) {
                    if (audioTrack.equals(androidx.media3.exoplayer.audio.DefaultAudioSink.this.audioTrack) && androidx.media3.exoplayer.audio.DefaultAudioSink.this.listener != null && androidx.media3.exoplayer.audio.DefaultAudioSink.this.playing) {
                        androidx.media3.exoplayer.audio.DefaultAudioSink.this.listener.onOffloadBufferEmptying();
                    }
                }
            };
        }

        public void register(android.media.AudioTrack audioTrack) {
            final android.os.Handler handler = this.handler;
            java.util.Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new java.util.concurrent.Executor() { // from class: androidx.media3.exoplayer.audio.DefaultAudioSink$StreamEventCallbackV29$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Executor
                public final void execute(java.lang.Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.callback);
        }

        public void unregister(android.media.AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.callback);
            this.handler.removeCallbacksAndMessages(null);
        }
    }

    private static final class MediaPositionParameters {
        public final long audioTrackPositionUs;
        public final long mediaTimeUs;
        public final androidx.media3.common.PlaybackParameters playbackParameters;

        private MediaPositionParameters(androidx.media3.common.PlaybackParameters playbackParameters, long j, long j2) {
            this.playbackParameters = playbackParameters;
            this.mediaTimeUs = j;
            this.audioTrackPositionUs = j2;
        }
    }

    private static int getAudioTrackMinBufferSize(int i, int i2, int i3) {
        int minBufferSize = android.media.AudioTrack.getMinBufferSize(i, i2, i3);
        androidx.media3.common.util.Assertions.checkState(minBufferSize != -2);
        return minBufferSize;
    }

    private final class PositionTrackerListener implements androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener {
        private PositionTrackerListener() {
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onPositionFramesMismatch(long j, long j2, long j3, long j4) {
            java.lang.String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + androidx.media3.exoplayer.audio.DefaultAudioSink.this.getSubmittedFrames() + ", " + androidx.media3.exoplayer.audio.DefaultAudioSink.this.getWrittenFrames();
            if (androidx.media3.exoplayer.audio.DefaultAudioSink.failOnSpuriousAudioTimestamp) {
                throw new androidx.media3.exoplayer.audio.DefaultAudioSink.InvalidAudioTrackTimestampException(str);
            }
            androidx.media3.common.util.Log.w(androidx.media3.exoplayer.audio.DefaultAudioSink.TAG, str);
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onSystemTimeUsMismatch(long j, long j2, long j3, long j4) {
            java.lang.String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + androidx.media3.exoplayer.audio.DefaultAudioSink.this.getSubmittedFrames() + ", " + androidx.media3.exoplayer.audio.DefaultAudioSink.this.getWrittenFrames();
            if (androidx.media3.exoplayer.audio.DefaultAudioSink.failOnSpuriousAudioTimestamp) {
                throw new androidx.media3.exoplayer.audio.DefaultAudioSink.InvalidAudioTrackTimestampException(str);
            }
            androidx.media3.common.util.Log.w(androidx.media3.exoplayer.audio.DefaultAudioSink.TAG, str);
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onInvalidLatency(long j) {
            androidx.media3.common.util.Log.w(androidx.media3.exoplayer.audio.DefaultAudioSink.TAG, "Ignoring impossibly large audio latency: " + j);
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onPositionAdvancing(long j) {
            if (androidx.media3.exoplayer.audio.DefaultAudioSink.this.listener != null) {
                androidx.media3.exoplayer.audio.DefaultAudioSink.this.listener.onPositionAdvancing(j);
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioTrackPositionTracker.Listener
        public void onUnderrun(int i, long j) {
            if (androidx.media3.exoplayer.audio.DefaultAudioSink.this.listener != null) {
                androidx.media3.exoplayer.audio.DefaultAudioSink.this.listener.onUnderrun(i, j, android.os.SystemClock.elapsedRealtime() - androidx.media3.exoplayer.audio.DefaultAudioSink.this.lastFeedElapsedRealtimeMs);
            }
        }
    }

    private static final class Configuration {
        public final androidx.media3.common.audio.AudioProcessingPipeline audioProcessingPipeline;
        public final int bufferSize;
        public final boolean enableAudioTrackPlaybackParams;
        public final boolean enableOffloadGapless;
        public final androidx.media3.common.Format inputFormat;
        public final int inputPcmFrameSize;
        public final int outputChannelConfig;
        public final int outputEncoding;
        public final int outputMode;
        public final int outputPcmFrameSize;
        public final int outputSampleRate;
        public final boolean tunneling;

        public Configuration(androidx.media3.common.Format format, int i, int i2, int i3, int i4, int i5, int i6, int i7, androidx.media3.common.audio.AudioProcessingPipeline audioProcessingPipeline, boolean z, boolean z2, boolean z3) {
            this.inputFormat = format;
            this.inputPcmFrameSize = i;
            this.outputMode = i2;
            this.outputPcmFrameSize = i3;
            this.outputSampleRate = i4;
            this.outputChannelConfig = i5;
            this.outputEncoding = i6;
            this.bufferSize = i7;
            this.audioProcessingPipeline = audioProcessingPipeline;
            this.enableAudioTrackPlaybackParams = z;
            this.enableOffloadGapless = z2;
            this.tunneling = z3;
        }

        public androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration copyWithBufferSize(int i) {
            return new androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration(this.inputFormat, this.inputPcmFrameSize, this.outputMode, this.outputPcmFrameSize, this.outputSampleRate, this.outputChannelConfig, this.outputEncoding, i, this.audioProcessingPipeline, this.enableAudioTrackPlaybackParams, this.enableOffloadGapless, this.tunneling);
        }

        public boolean canReuseAudioTrack(androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration configuration) {
            return configuration.outputMode == this.outputMode && configuration.outputEncoding == this.outputEncoding && configuration.outputSampleRate == this.outputSampleRate && configuration.outputChannelConfig == this.outputChannelConfig && configuration.outputPcmFrameSize == this.outputPcmFrameSize && configuration.enableAudioTrackPlaybackParams == this.enableAudioTrackPlaybackParams && configuration.enableOffloadGapless == this.enableOffloadGapless;
        }

        public long inputFramesToDurationUs(long j) {
            return androidx.media3.common.util.Util.sampleCountToDurationUs(j, this.inputFormat.sampleRate);
        }

        public long framesToDurationUs(long j) {
            return androidx.media3.common.util.Util.sampleCountToDurationUs(j, this.outputSampleRate);
        }

        public androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig buildAudioTrackConfig() {
            return new androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig(this.outputEncoding, this.outputSampleRate, this.outputChannelConfig, this.tunneling, this.outputMode == 1, this.bufferSize);
        }

        public android.media.AudioTrack buildAudioTrack(androidx.media3.common.AudioAttributes audioAttributes, int i) throws androidx.media3.exoplayer.audio.AudioSink.InitializationException {
            try {
                android.media.AudioTrack audioTrackCreateAudioTrack = createAudioTrack(audioAttributes, i);
                int state = audioTrackCreateAudioTrack.getState();
                if (state == 1) {
                    return audioTrackCreateAudioTrack;
                }
                try {
                    audioTrackCreateAudioTrack.release();
                } catch (java.lang.Exception unused) {
                }
                throw new androidx.media3.exoplayer.audio.AudioSink.InitializationException(state, this.outputSampleRate, this.outputChannelConfig, this.bufferSize, this.inputFormat, outputModeIsOffload(), null);
            } catch (java.lang.IllegalArgumentException | java.lang.UnsupportedOperationException e) {
                throw new androidx.media3.exoplayer.audio.AudioSink.InitializationException(0, this.outputSampleRate, this.outputChannelConfig, this.bufferSize, this.inputFormat, outputModeIsOffload(), e);
            }
        }

        private android.media.AudioTrack createAudioTrack(androidx.media3.common.AudioAttributes audioAttributes, int i) {
            if (androidx.media3.common.util.Util.SDK_INT >= 29) {
                return createAudioTrackV29(audioAttributes, i);
            }
            if (androidx.media3.common.util.Util.SDK_INT >= 21) {
                return createAudioTrackV21(audioAttributes, i);
            }
            return createAudioTrackV9(audioAttributes, i);
        }

        private android.media.AudioTrack createAudioTrackV29(androidx.media3.common.AudioAttributes audioAttributes, int i) {
            return new android.media.AudioTrack.Builder().setAudioAttributes(getAudioTrackAttributesV21(audioAttributes, this.tunneling)).setAudioFormat(androidx.media3.common.util.Util.getAudioFormat(this.outputSampleRate, this.outputChannelConfig, this.outputEncoding)).setTransferMode(1).setBufferSizeInBytes(this.bufferSize).setSessionId(i).setOffloadedPlayback(this.outputMode == 1).build();
        }

        private android.media.AudioTrack createAudioTrackV21(androidx.media3.common.AudioAttributes audioAttributes, int i) {
            return new android.media.AudioTrack(getAudioTrackAttributesV21(audioAttributes, this.tunneling), androidx.media3.common.util.Util.getAudioFormat(this.outputSampleRate, this.outputChannelConfig, this.outputEncoding), this.bufferSize, 1, i);
        }

        private android.media.AudioTrack createAudioTrackV9(androidx.media3.common.AudioAttributes audioAttributes, int i) {
            int streamTypeForAudioUsage = androidx.media3.common.util.Util.getStreamTypeForAudioUsage(audioAttributes.usage);
            if (i == 0) {
                return new android.media.AudioTrack(streamTypeForAudioUsage, this.outputSampleRate, this.outputChannelConfig, this.outputEncoding, this.bufferSize, 1);
            }
            return new android.media.AudioTrack(streamTypeForAudioUsage, this.outputSampleRate, this.outputChannelConfig, this.outputEncoding, this.bufferSize, 1, i);
        }

        private static android.media.AudioAttributes getAudioTrackAttributesV21(androidx.media3.common.AudioAttributes audioAttributes, boolean z) {
            if (z) {
                return getAudioTrackTunnelingAttributesV21();
            }
            return audioAttributes.getAudioAttributesV21().audioAttributes;
        }

        private static android.media.AudioAttributes getAudioTrackTunnelingAttributesV21() {
            return new android.media.AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public boolean outputModeIsOffload() {
            return this.outputMode == 1;
        }
    }

    private static final class PendingExceptionHolder<T extends java.lang.Exception> {
        private T pendingException;
        private long throwDeadlineMs;
        private final long throwDelayMs;

        public PendingExceptionHolder(long j) {
            this.throwDelayMs = j;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void throwExceptionIfDeadlineIsReached(T t) throws java.lang.Exception {
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            if (this.pendingException == null) {
                this.pendingException = t;
                this.throwDeadlineMs = this.throwDelayMs + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.throwDeadlineMs) {
                T t2 = this.pendingException;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.pendingException;
                clear();
                throw t3;
            }
        }

        public void clear() {
            this.pendingException = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeReportSkippedSilence() {
        if (this.accumulatedSkippedSilenceDurationUs >= 300000) {
            this.listener.onSilenceSkipped();
            this.accumulatedSkippedSilenceDurationUs = 0L;
        }
    }

    private static final class Api23 {
        private Api23() {
        }

        public static void setPreferredDeviceOnAudioTrack(android.media.AudioTrack audioTrack, androidx.media3.exoplayer.audio.AudioDeviceInfoApi23 audioDeviceInfoApi23) {
            audioTrack.setPreferredDevice(audioDeviceInfoApi23 == null ? null : audioDeviceInfoApi23.audioDeviceInfo);
        }
    }

    private static final class Api31 {
        private Api31() {
        }

        public static void setLogSessionIdOnAudioTrack(android.media.AudioTrack audioTrack, androidx.media3.exoplayer.analytics.PlayerId playerId) {
            android.media.metrics.LogSessionId logSessionId = playerId.getLogSessionId();
            if (logSessionId.equals(android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionId);
        }
    }
}
