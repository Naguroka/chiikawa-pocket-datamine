package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
public interface MediaCodecSelector {
    public static final androidx.media3.exoplayer.mediacodec.MediaCodecSelector DEFAULT = new androidx.media3.exoplayer.mediacodec.MediaCodecSelector() { // from class: androidx.media3.exoplayer.mediacodec.MediaCodecSelector$$ExternalSyntheticLambda0
        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecSelector
        public final java.util.List getDecoderInfos(java.lang.String str, boolean z, boolean z2) {
            return androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getDecoderInfos(str, z, z2);
        }
    };

    java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> getDecoderInfos(java.lang.String str, boolean z, boolean z2) throws androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException;
}
