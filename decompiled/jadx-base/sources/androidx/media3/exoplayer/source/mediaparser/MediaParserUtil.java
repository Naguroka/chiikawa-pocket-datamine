package androidx.media3.exoplayer.source.mediaparser;

/* JADX INFO: loaded from: classes.dex */
public final class MediaParserUtil {
    public static final java.lang.String PARAMETER_EAGERLY_EXPOSE_TRACK_TYPE = "android.media.mediaparser.eagerlyExposeTrackType";
    public static final java.lang.String PARAMETER_EXPOSE_CAPTION_FORMATS = "android.media.mediaParser.exposeCaptionFormats";
    public static final java.lang.String PARAMETER_EXPOSE_CHUNK_INDEX_AS_MEDIA_FORMAT = "android.media.mediaParser.exposeChunkIndexAsMediaFormat";
    public static final java.lang.String PARAMETER_EXPOSE_DUMMY_SEEK_MAP = "android.media.mediaparser.exposeDummySeekMap";
    public static final java.lang.String PARAMETER_IGNORE_TIMESTAMP_OFFSET = "android.media.mediaparser.ignoreTimestampOffset";
    public static final java.lang.String PARAMETER_INCLUDE_SUPPLEMENTAL_DATA = "android.media.mediaparser.includeSupplementalData";
    public static final java.lang.String PARAMETER_IN_BAND_CRYPTO_INFO = "android.media.mediaparser.inBandCryptoInfo";
    public static final java.lang.String PARAMETER_OVERRIDE_IN_BAND_CAPTION_DECLARATIONS = "android.media.mediaParser.overrideInBandCaptionDeclarations";

    private MediaParserUtil() {
    }

    public static android.media.MediaFormat toCaptionsMediaFormat(androidx.media3.common.Format format) {
        android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
        mediaFormat.setString("mime", format.sampleMimeType);
        if (format.accessibilityChannel != -1) {
            mediaFormat.setInteger("caption-service-number", format.accessibilityChannel);
        }
        return mediaFormat;
    }

    public static void setLogSessionIdOnMediaParser(android.media.MediaParser mediaParser, androidx.media3.exoplayer.analytics.PlayerId playerId) {
        androidx.media3.exoplayer.source.mediaparser.MediaParserUtil.Api31.setLogSessionIdOnMediaParser(mediaParser, playerId);
    }

    private static final class Api31 {
        private Api31() {
        }

        public static void setLogSessionIdOnMediaParser(android.media.MediaParser mediaParser, androidx.media3.exoplayer.analytics.PlayerId playerId) {
            android.media.metrics.LogSessionId logSessionId = playerId.getLogSessionId();
            if (logSessionId.equals(android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            mediaParser.setLogSessionId(logSessionId);
        }
    }
}
