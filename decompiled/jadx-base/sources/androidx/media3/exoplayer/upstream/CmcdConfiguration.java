package androidx.media3.exoplayer.upstream;

/* JADX INFO: loaded from: classes.dex */
public final class CmcdConfiguration {
    public static final java.lang.String CMCD_QUERY_PARAMETER_KEY = "CMCD";
    public static final java.lang.String KEY_BITRATE = "br";
    public static final java.lang.String KEY_BUFFER_LENGTH = "bl";
    public static final java.lang.String KEY_BUFFER_STARVATION = "bs";
    public static final java.lang.String KEY_CMCD_OBJECT = "CMCD-Object";
    public static final java.lang.String KEY_CMCD_REQUEST = "CMCD-Request";
    public static final java.lang.String KEY_CMCD_SESSION = "CMCD-Session";
    public static final java.lang.String KEY_CMCD_STATUS = "CMCD-Status";
    public static final java.lang.String KEY_CONTENT_ID = "cid";
    public static final java.lang.String KEY_DEADLINE = "dl";
    public static final java.lang.String KEY_MAXIMUM_REQUESTED_BITRATE = "rtp";
    public static final java.lang.String KEY_MEASURED_THROUGHPUT = "mtp";
    public static final java.lang.String KEY_NEXT_OBJECT_REQUEST = "nor";
    public static final java.lang.String KEY_NEXT_RANGE_REQUEST = "nrr";
    public static final java.lang.String KEY_OBJECT_DURATION = "d";
    public static final java.lang.String KEY_OBJECT_TYPE = "ot";
    public static final java.lang.String KEY_PLAYBACK_RATE = "pr";
    public static final java.lang.String KEY_SESSION_ID = "sid";
    public static final java.lang.String KEY_STARTUP = "su";
    public static final java.lang.String KEY_STREAMING_FORMAT = "sf";
    public static final java.lang.String KEY_STREAM_TYPE = "st";
    public static final java.lang.String KEY_TOP_BITRATE = "tb";
    public static final java.lang.String KEY_VERSION = "v";
    public static final int MAX_ID_LENGTH = 64;
    public static final int MODE_QUERY_PARAMETER = 1;
    public static final int MODE_REQUEST_HEADER = 0;
    public final java.lang.String contentId;
    public final int dataTransmissionMode;
    public final androidx.media3.exoplayer.upstream.CmcdConfiguration.RequestConfig requestConfig;
    public final java.lang.String sessionId;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface CmcdKey {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface DataTransmissionMode {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface HeaderKey {
    }

    public interface Factory {
        public static final androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory DEFAULT = new androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory() { // from class: androidx.media3.exoplayer.upstream.CmcdConfiguration$Factory$$ExternalSyntheticLambda0
            @Override // androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory
            public final androidx.media3.exoplayer.upstream.CmcdConfiguration createCmcdConfiguration(androidx.media3.common.MediaItem mediaItem) {
                return androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory.lambda$static$0(mediaItem);
            }
        };

        androidx.media3.exoplayer.upstream.CmcdConfiguration createCmcdConfiguration(androidx.media3.common.MediaItem mediaItem);

        static /* synthetic */ androidx.media3.exoplayer.upstream.CmcdConfiguration lambda$static$0(androidx.media3.common.MediaItem mediaItem) {
            return new androidx.media3.exoplayer.upstream.CmcdConfiguration(java.util.UUID.randomUUID().toString(), mediaItem.mediaId != null ? mediaItem.mediaId : "", new androidx.media3.exoplayer.upstream.CmcdConfiguration.RequestConfig() { // from class: androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory.1
            });
        }
    }

    public interface RequestConfig {
        default int getRequestedMaximumThroughputKbps(int i) {
            return androidx.media3.common.C.RATE_UNSET_INT;
        }

        default boolean isKeyAllowed(java.lang.String str) {
            return true;
        }

        default com.google.common.collect.ImmutableListMultimap<java.lang.String, java.lang.String> getCustomData() {
            return com.google.common.collect.ImmutableListMultimap.of();
        }
    }

    public CmcdConfiguration(java.lang.String str, java.lang.String str2, androidx.media3.exoplayer.upstream.CmcdConfiguration.RequestConfig requestConfig) {
        this(str, str2, requestConfig, 0);
    }

    public CmcdConfiguration(java.lang.String str, java.lang.String str2, androidx.media3.exoplayer.upstream.CmcdConfiguration.RequestConfig requestConfig, int i) {
        androidx.media3.common.util.Assertions.checkArgument(str == null || str.length() <= 64);
        androidx.media3.common.util.Assertions.checkArgument(str2 == null || str2.length() <= 64);
        androidx.media3.common.util.Assertions.checkNotNull(requestConfig);
        this.sessionId = str;
        this.contentId = str2;
        this.requestConfig = requestConfig;
        this.dataTransmissionMode = i;
    }

    public boolean isBitrateLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("br");
    }

    public boolean isBufferLengthLoggingAllowed() {
        return this.requestConfig.isKeyAllowed(KEY_BUFFER_LENGTH);
    }

    public boolean isContentIdLoggingAllowed() {
        return this.requestConfig.isKeyAllowed(KEY_CONTENT_ID);
    }

    public boolean isSessionIdLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("sid");
    }

    public boolean isMaximumRequestThroughputLoggingAllowed() {
        return this.requestConfig.isKeyAllowed(KEY_MAXIMUM_REQUESTED_BITRATE);
    }

    public boolean isStreamingFormatLoggingAllowed() {
        return this.requestConfig.isKeyAllowed(KEY_STREAMING_FORMAT);
    }

    public boolean isStreamTypeLoggingAllowed() {
        return this.requestConfig.isKeyAllowed(KEY_STREAM_TYPE);
    }

    public boolean isTopBitrateLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("tb");
    }

    public boolean isObjectDurationLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("d");
    }

    public boolean isMeasuredThroughputLoggingAllowed() {
        return this.requestConfig.isKeyAllowed(KEY_MEASURED_THROUGHPUT);
    }

    public boolean isObjectTypeLoggingAllowed() {
        return this.requestConfig.isKeyAllowed(KEY_OBJECT_TYPE);
    }

    public boolean isBufferStarvationLoggingAllowed() {
        return this.requestConfig.isKeyAllowed(KEY_BUFFER_STARVATION);
    }

    public boolean isDeadlineLoggingAllowed() {
        return this.requestConfig.isKeyAllowed(KEY_DEADLINE);
    }

    public boolean isPlaybackRateLoggingAllowed() {
        return this.requestConfig.isKeyAllowed(KEY_PLAYBACK_RATE);
    }

    public boolean isStartupLoggingAllowed() {
        return this.requestConfig.isKeyAllowed("su");
    }

    public boolean isNextObjectRequestLoggingAllowed() {
        return this.requestConfig.isKeyAllowed(KEY_NEXT_OBJECT_REQUEST);
    }

    public boolean isNextRangeRequestLoggingAllowed() {
        return this.requestConfig.isKeyAllowed(KEY_NEXT_RANGE_REQUEST);
    }
}
