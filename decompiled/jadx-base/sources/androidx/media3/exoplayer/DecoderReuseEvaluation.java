package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final class DecoderReuseEvaluation {
    public static final int DISCARD_REASON_APP_OVERRIDE = 4;
    public static final int DISCARD_REASON_AUDIO_BYPASS_POSSIBLE = 32768;
    public static final int DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED = 4096;
    public static final int DISCARD_REASON_AUDIO_ENCODING_CHANGED = 16384;
    public static final int DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED = 8192;
    public static final int DISCARD_REASON_DRM_SESSION_CHANGED = 128;
    public static final int DISCARD_REASON_INITIALIZATION_DATA_CHANGED = 32;
    public static final int DISCARD_REASON_MAX_INPUT_SIZE_EXCEEDED = 64;
    public static final int DISCARD_REASON_MIME_TYPE_CHANGED = 8;
    public static final int DISCARD_REASON_OPERATING_RATE_CHANGED = 16;
    public static final int DISCARD_REASON_REUSE_NOT_IMPLEMENTED = 1;
    public static final int DISCARD_REASON_VIDEO_COLOR_INFO_CHANGED = 2048;
    public static final int DISCARD_REASON_VIDEO_MAX_RESOLUTION_EXCEEDED = 256;
    public static final int DISCARD_REASON_VIDEO_RESOLUTION_CHANGED = 512;
    public static final int DISCARD_REASON_VIDEO_ROTATION_CHANGED = 1024;
    public static final int DISCARD_REASON_WORKAROUND = 2;
    public static final int REUSE_RESULT_NO = 0;
    public static final int REUSE_RESULT_YES_WITHOUT_RECONFIGURATION = 3;
    public static final int REUSE_RESULT_YES_WITH_FLUSH = 1;
    public static final int REUSE_RESULT_YES_WITH_RECONFIGURATION = 2;
    public final java.lang.String decoderName;
    public final int discardReasons;
    public final androidx.media3.common.Format newFormat;
    public final androidx.media3.common.Format oldFormat;
    public final int result;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface DecoderDiscardReasons {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface DecoderReuseResult {
    }

    public DecoderReuseEvaluation(java.lang.String str, androidx.media3.common.Format format, androidx.media3.common.Format format2, int i, int i2) {
        androidx.media3.common.util.Assertions.checkArgument(i == 0 || i2 == 0);
        this.decoderName = androidx.media3.common.util.Assertions.checkNotEmpty(str);
        this.oldFormat = (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(format);
        this.newFormat = (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(format2);
        this.result = i;
        this.discardReasons = i2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation = (androidx.media3.exoplayer.DecoderReuseEvaluation) obj;
        return this.result == decoderReuseEvaluation.result && this.discardReasons == decoderReuseEvaluation.discardReasons && this.decoderName.equals(decoderReuseEvaluation.decoderName) && this.oldFormat.equals(decoderReuseEvaluation.oldFormat) && this.newFormat.equals(decoderReuseEvaluation.newFormat);
    }

    public int hashCode() {
        return ((((((((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.result) * 31) + this.discardReasons) * 31) + this.decoderName.hashCode()) * 31) + this.oldFormat.hashCode()) * 31) + this.newFormat.hashCode();
    }
}
