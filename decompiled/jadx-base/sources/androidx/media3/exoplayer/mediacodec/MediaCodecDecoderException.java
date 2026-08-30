package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
public class MediaCodecDecoderException extends androidx.media3.decoder.DecoderException {
    public final androidx.media3.exoplayer.mediacodec.MediaCodecInfo codecInfo;
    public final java.lang.String diagnosticInfo;
    public final int errorCode;

    public MediaCodecDecoderException(java.lang.Throwable th, androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo) {
        int errorCodeFromPlatformDiagnosticsInfo;
        super("Decoder failed: " + (mediaCodecInfo == null ? null : mediaCodecInfo.name), th);
        this.codecInfo = mediaCodecInfo;
        java.lang.String diagnosticInfoV21 = androidx.media3.common.util.Util.SDK_INT >= 21 ? getDiagnosticInfoV21(th) : null;
        this.diagnosticInfo = diagnosticInfoV21;
        if (androidx.media3.common.util.Util.SDK_INT >= 23) {
            errorCodeFromPlatformDiagnosticsInfo = getErrorCodeV23(th);
        } else {
            errorCodeFromPlatformDiagnosticsInfo = androidx.media3.common.util.Util.getErrorCodeFromPlatformDiagnosticsInfo(diagnosticInfoV21);
        }
        this.errorCode = errorCodeFromPlatformDiagnosticsInfo;
    }

    private static java.lang.String getDiagnosticInfoV21(java.lang.Throwable th) {
        if (th instanceof android.media.MediaCodec.CodecException) {
            return ((android.media.MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }

    private static int getErrorCodeV23(java.lang.Throwable th) {
        if (th instanceof android.media.MediaCodec.CodecException) {
            return ((android.media.MediaCodec.CodecException) th).getErrorCode();
        }
        return 0;
    }
}
