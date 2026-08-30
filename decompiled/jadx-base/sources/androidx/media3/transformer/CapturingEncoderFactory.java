package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
final class CapturingEncoderFactory implements androidx.media3.transformer.Codec.EncoderFactory {
    private java.lang.String audioEncoderName;
    private final androidx.media3.transformer.Codec.EncoderFactory encoderFactory;
    private java.lang.String videoEncoderName;

    public CapturingEncoderFactory(androidx.media3.transformer.Codec.EncoderFactory encoderFactory) {
        this.encoderFactory = encoderFactory;
    }

    @Override // androidx.media3.transformer.Codec.EncoderFactory
    public androidx.media3.transformer.Codec createForAudioEncoding(androidx.media3.common.Format format) throws androidx.media3.transformer.ExportException {
        androidx.media3.transformer.Codec codecCreateForAudioEncoding = this.encoderFactory.createForAudioEncoding(format);
        this.audioEncoderName = codecCreateForAudioEncoding.getName();
        return codecCreateForAudioEncoding;
    }

    @Override // androidx.media3.transformer.Codec.EncoderFactory
    public androidx.media3.transformer.Codec createForVideoEncoding(androidx.media3.common.Format format) throws androidx.media3.transformer.ExportException {
        androidx.media3.transformer.Codec codecCreateForVideoEncoding = this.encoderFactory.createForVideoEncoding(format);
        this.videoEncoderName = codecCreateForVideoEncoding.getName();
        return codecCreateForVideoEncoding;
    }

    @Override // androidx.media3.transformer.Codec.EncoderFactory
    public boolean audioNeedsEncoding() {
        return this.encoderFactory.audioNeedsEncoding();
    }

    @Override // androidx.media3.transformer.Codec.EncoderFactory
    public boolean videoNeedsEncoding() {
        return this.encoderFactory.videoNeedsEncoding();
    }

    public java.lang.String getAudioEncoderName() {
        return this.audioEncoderName;
    }

    public java.lang.String getVideoEncoderName() {
        return this.videoEncoderName;
    }
}
