package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
final class CapturingDecoderFactory implements androidx.media3.transformer.Codec.DecoderFactory {
    private java.lang.String audioDecoderName;
    private final androidx.media3.transformer.Codec.DecoderFactory decoderFactory;
    private java.lang.String videoDecoderName;

    public CapturingDecoderFactory(androidx.media3.transformer.Codec.DecoderFactory decoderFactory) {
        this.decoderFactory = decoderFactory;
    }

    @Override // androidx.media3.transformer.Codec.DecoderFactory
    public androidx.media3.transformer.Codec createForAudioDecoding(androidx.media3.common.Format format) throws androidx.media3.transformer.ExportException {
        androidx.media3.transformer.Codec codecCreateForAudioDecoding = this.decoderFactory.createForAudioDecoding(format);
        this.audioDecoderName = codecCreateForAudioDecoding.getName();
        return codecCreateForAudioDecoding;
    }

    @Override // androidx.media3.transformer.Codec.DecoderFactory
    public androidx.media3.transformer.Codec createForVideoDecoding(androidx.media3.common.Format format, android.view.Surface surface, boolean z) throws androidx.media3.transformer.ExportException {
        androidx.media3.transformer.Codec codecCreateForVideoDecoding = this.decoderFactory.createForVideoDecoding(format, surface, z);
        this.videoDecoderName = codecCreateForVideoDecoding.getName();
        return codecCreateForVideoDecoding;
    }

    public java.lang.String getAudioDecoderName() {
        return this.audioDecoderName;
    }

    public java.lang.String getVideoDecoderName() {
        return this.videoDecoderName;
    }
}
