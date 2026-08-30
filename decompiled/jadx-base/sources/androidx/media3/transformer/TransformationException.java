package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public final class TransformationException extends java.lang.Exception {
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
    public static final int ERROR_CODE_MUXING_FAILED = 7001;
    public static final int ERROR_CODE_UNSPECIFIED = 1000;
    public static final int ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED = 5001;
    static final com.google.common.collect.ImmutableBiMap<java.lang.String, java.lang.Integer> NAME_TO_ERROR_CODE = new com.google.common.collect.ImmutableBiMap.Builder().put("ERROR_CODE_FAILED_RUNTIME_CHECK", 1001).put("ERROR_CODE_IO_UNSPECIFIED", 2000).put("ERROR_CODE_IO_NETWORK_CONNECTION_FAILED", 2001).put("ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT", 2002).put("ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE", 2003).put("ERROR_CODE_IO_BAD_HTTP_STATUS", 2004).put("ERROR_CODE_IO_FILE_NOT_FOUND", 2005).put("ERROR_CODE_IO_NO_PERMISSION", 2006).put("ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED", 2007).put("ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE", 2008).put("ERROR_CODE_DECODER_INIT_FAILED", 3001).put("ERROR_CODE_DECODING_FAILED", 3002).put("ERROR_CODE_DECODING_FORMAT_UNSUPPORTED", 3003).put("ERROR_CODE_ENCODER_INIT_FAILED", 4001).put("ERROR_CODE_ENCODING_FAILED", 4002).put("ERROR_CODE_ENCODING_FORMAT_UNSUPPORTED", 4003).put("ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED", 5001).put("ERROR_CODE_AUDIO_PROCESSING_FAILED", 6001).put("ERROR_CODE_MUXING_FAILED", 7001).buildOrThrow();
    public final int errorCode;
    public final long timestampMs;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ErrorCode {
    }

    public static java.lang.String getErrorCodeName(int i) {
        return NAME_TO_ERROR_CODE.inverse().getOrDefault(java.lang.Integer.valueOf(i), "invalid error code");
    }

    public java.lang.String getErrorCodeName() {
        return getErrorCodeName(this.errorCode);
    }

    public static androidx.media3.transformer.TransformationException createForAssetLoader(java.lang.Throwable th, int i) {
        return new androidx.media3.transformer.TransformationException("Asset loader error", th, i);
    }

    public static androidx.media3.transformer.TransformationException createForCodec(java.lang.Throwable th, int i, boolean z, boolean z2, androidx.media3.common.Format format) {
        return createForCodec(th, i, z, z2, "format=" + format);
    }

    public static androidx.media3.transformer.TransformationException createForCodec(java.lang.Throwable th, int i, boolean z, boolean z2, java.lang.String str) {
        return new androidx.media3.transformer.TransformationException((z ? "Video" : "Audio").concat(z2 ? "Decoder" : "Encoder") + " error: " + str, th, i);
    }

    public static androidx.media3.transformer.TransformationException createForAudioProcessing(java.lang.Throwable th, androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) {
        return new androidx.media3.transformer.TransformationException("Audio processing error, audio_format=" + audioFormat, th, 6001);
    }

    static androidx.media3.transformer.TransformationException createForVideoFrameProcessingException(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException, int i) {
        return new androidx.media3.transformer.TransformationException("Video frame processing error", videoFrameProcessingException, i);
    }

    static androidx.media3.transformer.TransformationException createForMuxer(java.lang.Throwable th, int i) {
        return new androidx.media3.transformer.TransformationException("Muxer error", th, i);
    }

    public static androidx.media3.transformer.TransformationException createForUnexpected(java.lang.Exception exc) {
        if (exc instanceof java.lang.RuntimeException) {
            return new androidx.media3.transformer.TransformationException("Unexpected runtime error", exc, 1001);
        }
        return new androidx.media3.transformer.TransformationException("Unexpected error", exc, 1000);
    }

    private TransformationException(java.lang.String str, java.lang.Throwable th, int i) {
        super(str, th);
        this.errorCode = i;
        this.timestampMs = androidx.media3.common.util.Clock.DEFAULT.elapsedRealtime();
    }

    TransformationException(androidx.media3.transformer.ExportException exportException) {
        super(exportException.getMessage(), exportException.getCause());
        this.errorCode = exportException.errorCode;
        this.timestampMs = exportException.timestampMs;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r3 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean errorInfoEquals(androidx.media3.transformer.TransformationException transformationException) {
        if (this == transformationException) {
            return true;
        }
        if (transformationException != null && getClass() == transformationException.getClass()) {
            java.lang.Throwable cause = getCause();
            java.lang.Throwable cause2 = transformationException.getCause();
            if (cause == null || cause2 == null) {
                if (cause == null) {
                }
            } else if (!androidx.media3.common.util.Util.areEqual(cause.getMessage(), cause2.getMessage()) || !androidx.media3.common.util.Util.areEqual(cause.getClass(), cause2.getClass())) {
                return false;
            }
            return this.errorCode == transformationException.errorCode && androidx.media3.common.util.Util.areEqual(getMessage(), transformationException.getMessage()) && this.timestampMs == transformationException.timestampMs;
        }
        return false;
    }
}
