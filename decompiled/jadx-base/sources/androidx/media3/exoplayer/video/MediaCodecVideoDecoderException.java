package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public class MediaCodecVideoDecoderException extends androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException {
    public final boolean isSurfaceValid;
    public final int surfaceIdentityHashCode;

    public MediaCodecVideoDecoderException(java.lang.Throwable th, androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, android.view.Surface surface) {
        super(th, mediaCodecInfo);
        this.surfaceIdentityHashCode = java.lang.System.identityHashCode(surface);
        this.isSurfaceValid = surface == null || surface.isValid();
    }
}
