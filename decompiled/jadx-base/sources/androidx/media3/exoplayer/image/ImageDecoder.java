package androidx.media3.exoplayer.image;

/* JADX INFO: loaded from: classes.dex */
public interface ImageDecoder extends androidx.media3.decoder.Decoder<androidx.media3.decoder.DecoderInputBuffer, androidx.media3.exoplayer.image.ImageOutputBuffer, androidx.media3.exoplayer.image.ImageDecoderException> {

    public interface Factory {
        public static final androidx.media3.exoplayer.image.ImageDecoder.Factory DEFAULT = new androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.Factory();

        androidx.media3.exoplayer.image.ImageDecoder createImageDecoder();

        int supportsFormat(androidx.media3.common.Format format);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.decoder.Decoder
    androidx.media3.exoplayer.image.ImageOutputBuffer dequeueOutputBuffer() throws androidx.media3.exoplayer.image.ImageDecoderException;

    @Override // androidx.media3.decoder.Decoder
    void queueInputBuffer(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) throws androidx.media3.exoplayer.image.ImageDecoderException;
}
