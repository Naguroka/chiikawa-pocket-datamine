package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultAudioOffloadSupportProvider implements androidx.media3.exoplayer.audio.DefaultAudioSink.AudioOffloadSupportProvider {
    private static final java.lang.String OFFLOAD_VARIABLE_RATE_SUPPORTED_KEY = "offloadVariableRateSupported";
    private final android.content.Context context;
    private java.lang.Boolean isOffloadVariableRateSupported;

    public DefaultAudioOffloadSupportProvider() {
        this(null);
    }

    public DefaultAudioOffloadSupportProvider(android.content.Context context) {
        this.context = context;
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.AudioOffloadSupportProvider
    public androidx.media3.exoplayer.audio.AudioOffloadSupport getAudioOffloadSupport(androidx.media3.common.Format format, androidx.media3.common.AudioAttributes audioAttributes) {
        androidx.media3.common.util.Assertions.checkNotNull(format);
        androidx.media3.common.util.Assertions.checkNotNull(audioAttributes);
        if (androidx.media3.common.util.Util.SDK_INT < 29 || format.sampleRate == -1) {
            return androidx.media3.exoplayer.audio.AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        boolean zIsOffloadVariableRateSupported = isOffloadVariableRateSupported(this.context);
        int encoding = androidx.media3.common.MimeTypes.getEncoding((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(format.sampleMimeType), format.codecs);
        if (encoding == 0 || androidx.media3.common.util.Util.SDK_INT < androidx.media3.common.util.Util.getApiLevelThatAudioFormatIntroducedAudioEncoding(encoding)) {
            return androidx.media3.exoplayer.audio.AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        int audioTrackChannelConfig = androidx.media3.common.util.Util.getAudioTrackChannelConfig(format.channelCount);
        if (audioTrackChannelConfig == 0) {
            return androidx.media3.exoplayer.audio.AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        try {
            android.media.AudioFormat audioFormat = androidx.media3.common.util.Util.getAudioFormat(format.sampleRate, audioTrackChannelConfig, encoding);
            if (androidx.media3.common.util.Util.SDK_INT >= 31) {
                return androidx.media3.exoplayer.audio.DefaultAudioOffloadSupportProvider.Api31.getOffloadedPlaybackSupport(audioFormat, audioAttributes.getAudioAttributesV21().audioAttributes, zIsOffloadVariableRateSupported);
            }
            return androidx.media3.exoplayer.audio.DefaultAudioOffloadSupportProvider.Api29.getOffloadedPlaybackSupport(audioFormat, audioAttributes.getAudioAttributesV21().audioAttributes, zIsOffloadVariableRateSupported);
        } catch (java.lang.IllegalArgumentException unused) {
            return androidx.media3.exoplayer.audio.AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
    }

    private boolean isOffloadVariableRateSupported(android.content.Context context) {
        android.media.AudioManager audioManager;
        java.lang.Boolean bool = this.isOffloadVariableRateSupported;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        if (context != null && (audioManager = (android.media.AudioManager) context.getSystemService("audio")) != null) {
            java.lang.String parameters = audioManager.getParameters(OFFLOAD_VARIABLE_RATE_SUPPORTED_KEY);
            if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                z = true;
            }
            this.isOffloadVariableRateSupported = java.lang.Boolean.valueOf(z);
        } else {
            this.isOffloadVariableRateSupported = false;
        }
        return this.isOffloadVariableRateSupported.booleanValue();
    }

    private static final class Api29 {
        private Api29() {
        }

        public static androidx.media3.exoplayer.audio.AudioOffloadSupport getOffloadedPlaybackSupport(android.media.AudioFormat audioFormat, android.media.AudioAttributes audioAttributes, boolean z) {
            if (!android.media.AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
                return androidx.media3.exoplayer.audio.AudioOffloadSupport.DEFAULT_UNSUPPORTED;
            }
            return new androidx.media3.exoplayer.audio.AudioOffloadSupport.Builder().setIsFormatSupported(true).setIsSpeedChangeSupported(z).build();
        }
    }

    private static final class Api31 {
        private Api31() {
        }

        public static androidx.media3.exoplayer.audio.AudioOffloadSupport getOffloadedPlaybackSupport(android.media.AudioFormat audioFormat, android.media.AudioAttributes audioAttributes, boolean z) {
            int playbackOffloadSupport = android.media.AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return androidx.media3.exoplayer.audio.AudioOffloadSupport.DEFAULT_UNSUPPORTED;
            }
            return new androidx.media3.exoplayer.audio.AudioOffloadSupport.Builder().setIsFormatSupported(true).setIsGaplessSupported(androidx.media3.common.util.Util.SDK_INT > 32 && playbackOffloadSupport == 2).setIsSpeedChangeSupported(z).build();
        }
    }
}
