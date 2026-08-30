package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public final class ExportException extends java.lang.Exception {
    public static final int ERROR_CODE_AUDIO_PROCESSING_FAILED = 6001;
    public static final int ERROR_CODE_DECODER_INIT_FAILED = 3001;
    public static final int ERROR_CODE_DECODING_FAILED = 3002;
    public static final int ERROR_CODE_DECODING_FORMAT_UNSUPPORTED = 3003;
    public static final int ERROR_CODE_ENCODER_INIT_FAILED = 4001;
    public static final int ERROR_CODE_ENCODING_FAILED = 4002;
    public static final int ERROR_CODE_ENCODING_FORMAT_UNSUPPORTED = 4003;
    public static final int ERROR_CODE_FAILED_RUNTIME_CHECK = 1001;
    public static final int ERROR_CODE_IO_BAD_HTTP_STATUS = 2004;
    public static final int ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED = 2007;
    public static final int ERROR_CODE_IO_FILE_NOT_FOUND = 2005;
    public static final int ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE = 2003;
    public static final int ERROR_CODE_IO_NETWORK_CONNECTION_FAILED = 2001;
    public static final int ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT = 2002;
    public static final int ERROR_CODE_IO_NO_PERMISSION = 2006;
    public static final int ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE = 2008;
    public static final int ERROR_CODE_IO_UNSPECIFIED = 2000;
    public static final int ERROR_CODE_MUXING_APPEND = 7003;
    public static final int ERROR_CODE_MUXING_FAILED = 7001;
    public static final int ERROR_CODE_MUXING_TIMEOUT = 7002;
    public static final int ERROR_CODE_UNSPECIFIED = 1000;
    public static final int ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED = 5001;
    static final com.google.common.collect.ImmutableBiMap<java.lang.String, java.lang.Integer> NAME_TO_ERROR_CODE = new com.google.common.collect.ImmutableBiMap.Builder().put("ERROR_CODE_FAILED_RUNTIME_CHECK", 1001).put("ERROR_CODE_IO_UNSPECIFIED", 2000).put("ERROR_CODE_IO_NETWORK_CONNECTION_FAILED", 2001).put("ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT", 2002).put("ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE", 2003).put("ERROR_CODE_IO_BAD_HTTP_STATUS", 2004).put("ERROR_CODE_IO_FILE_NOT_FOUND", 2005).put("ERROR_CODE_IO_NO_PERMISSION", 2006).put("ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED", 2007).put("ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE", 2008).put("ERROR_CODE_DECODER_INIT_FAILED", 3001).put("ERROR_CODE_DECODING_FAILED", 3002).put("ERROR_CODE_DECODING_FORMAT_UNSUPPORTED", 3003).put("ERROR_CODE_ENCODER_INIT_FAILED", 4001).put("ERROR_CODE_ENCODING_FAILED", 4002).put("ERROR_CODE_ENCODING_FORMAT_UNSUPPORTED", 4003).put("ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED", 5001).put("ERROR_CODE_AUDIO_PROCESSING_FAILED", 6001).put("ERROR_CODE_MUXING_FAILED", 7001).put("ERROR_CODE_MUXING_TIMEOUT", 7002).put("ERROR_CODE_MUXING_APPEND", 7003).buildOrThrow();
    public final androidx.media3.transformer.ExportException.CodecInfo codecInfo;
    public final int errorCode;
    public final long timestampMs;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ErrorCode {
    }

    public static final class CodecInfo {
        public final java.lang.String configurationFormat;
        public final boolean isDecoder;
        public final boolean isVideo;
        public final java.lang.String name;

        public CodecInfo(java.lang.String str, boolean z, boolean z2, java.lang.String str2) {
            this.configurationFormat = str;
            this.isVideo = z;
            this.isDecoder = z2;
            this.name = str2;
        }

        public java.lang.String toString() {
            return "CodecInfo{type=" + (this.isVideo ? "Video" : "Audio").concat(this.isDecoder ? "Decoder" : "Encoder") + ", configurationFormat=" + this.configurationFormat + ", name=" + this.name + '}';
        }
    }

    public static java.lang.String getErrorCodeName(int i) {
        return NAME_TO_ERROR_CODE.inverse().getOrDefault(java.lang.Integer.valueOf(i), "invalid error code");
    }

    public java.lang.String getErrorCodeName() {
        return getErrorCodeName(this.errorCode);
    }

    public static androidx.media3.transformer.ExportException createForAssetLoader(java.lang.Throwable th, int i) {
        return new androidx.media3.transformer.ExportException("Asset loader error", th, i);
    }

    public static androidx.media3.transformer.ExportException createForCodec(java.lang.Throwable th, int i, androidx.media3.transformer.ExportException.CodecInfo codecInfo) {
        return new androidx.media3.transformer.ExportException("Codec exception: " + codecInfo, th, i, codecInfo);
    }

    public static androidx.media3.transformer.ExportException createForAudioProcessing(androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException unhandledAudioFormatException, java.lang.String str) {
        return new androidx.media3.transformer.ExportException("Audio error: " + str + ", audioFormat=" + unhandledAudioFormatException.inputAudioFormat, unhandledAudioFormatException, 6001);
    }

    static androidx.media3.transformer.ExportException createForVideoFrameProcessingException(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
        return new androidx.media3.transformer.ExportException("Video frame processing error", videoFrameProcessingException, 5001);
    }

    static androidx.media3.transformer.ExportException createForMuxer(java.lang.Throwable th, int i) {
        return new androidx.media3.transformer.ExportException("Muxer error", th, i);
    }

    public static androidx.media3.transformer.ExportException createForUnexpected(java.lang.Exception exc) {
        if (exc instanceof java.lang.RuntimeException) {
            return new androidx.media3.transformer.ExportException("Unexpected runtime error", exc, 1001);
        }
        return new androidx.media3.transformer.ExportException("Unexpected error", exc, 1000);
    }

    private ExportException(java.lang.String str, java.lang.Throwable th, int i) {
        this(str, th, i, null);
    }

    private ExportException(java.lang.String str, java.lang.Throwable th, int i, androidx.media3.transformer.ExportException.CodecInfo codecInfo) {
        super(str, th);
        this.errorCode = i;
        this.timestampMs = androidx.media3.common.util.Clock.DEFAULT.elapsedRealtime();
        this.codecInfo = codecInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r3 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean errorInfoEquals(androidx.media3.transformer.ExportException exportException) {
        if (this == exportException) {
            return true;
        }
        if (exportException != null && getClass() == exportException.getClass()) {
            java.lang.Throwable cause = getCause();
            java.lang.Throwable cause2 = exportException.getCause();
            if (cause == null || cause2 == null) {
                if (cause == null) {
                }
            } else if (!androidx.media3.common.util.Util.areEqual(cause.getMessage(), cause2.getMessage()) || !androidx.media3.common.util.Util.areEqual(cause.getClass(), cause2.getClass())) {
                return false;
            }
            return this.errorCode == exportException.errorCode && androidx.media3.common.util.Util.areEqual(getMessage(), exportException.getMessage()) && this.timestampMs == exportException.timestampMs;
        }
        return false;
    }
}
