package androidx.media3.exoplayer.image;

/* JADX INFO: loaded from: classes.dex */
public final class BitmapFactoryImageDecoder extends androidx.media3.decoder.SimpleDecoder<androidx.media3.decoder.DecoderInputBuffer, androidx.media3.exoplayer.image.ImageOutputBuffer, androidx.media3.exoplayer.image.ImageDecoderException> implements androidx.media3.exoplayer.image.ImageDecoder {
    private final androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.BitmapDecoder bitmapDecoder;

    public interface BitmapDecoder {
        android.graphics.Bitmap decode(byte[] bArr, int i) throws androidx.media3.exoplayer.image.ImageDecoderException;
    }

    @Override // androidx.media3.decoder.Decoder
    public java.lang.String getName() {
        return "BitmapFactoryImageDecoder";
    }

    @Override // androidx.media3.decoder.SimpleDecoder, androidx.media3.decoder.Decoder
    public /* bridge */ /* synthetic */ androidx.media3.exoplayer.image.ImageOutputBuffer dequeueOutputBuffer() throws androidx.media3.exoplayer.image.ImageDecoderException {
        return (androidx.media3.exoplayer.image.ImageOutputBuffer) super.dequeueOutputBuffer();
    }

    public static final class Factory implements androidx.media3.exoplayer.image.ImageDecoder.Factory {
        private final androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.BitmapDecoder bitmapDecoder;

        public Factory() {
            this.bitmapDecoder = new androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.BitmapDecoder() { // from class: androidx.media3.exoplayer.image.BitmapFactoryImageDecoder$Factory$$ExternalSyntheticLambda0
                @Override // androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.BitmapDecoder
                public final android.graphics.Bitmap decode(byte[] bArr, int i) {
                    return androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.decode(bArr, i);
                }
            };
        }

        public Factory(androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.BitmapDecoder bitmapDecoder) {
            this.bitmapDecoder = bitmapDecoder;
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public int supportsFormat(androidx.media3.common.Format format) {
            if (format.sampleMimeType == null || !androidx.media3.common.MimeTypes.isImage(format.sampleMimeType)) {
                return androidx.media3.exoplayer.RendererCapabilities.create(0);
            }
            if (androidx.media3.common.util.Util.isBitmapFactorySupportedMimeType(format.sampleMimeType)) {
                return androidx.media3.exoplayer.RendererCapabilities.create(4);
            }
            return androidx.media3.exoplayer.RendererCapabilities.create(1);
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public androidx.media3.exoplayer.image.BitmapFactoryImageDecoder createImageDecoder() {
            return new androidx.media3.exoplayer.image.BitmapFactoryImageDecoder(this.bitmapDecoder);
        }
    }

    private BitmapFactoryImageDecoder(androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.BitmapDecoder bitmapDecoder) {
        super(new androidx.media3.decoder.DecoderInputBuffer[1], new androidx.media3.exoplayer.image.ImageOutputBuffer[1]);
        this.bitmapDecoder = bitmapDecoder;
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    protected androidx.media3.decoder.DecoderInputBuffer createInputBuffer() {
        return new androidx.media3.decoder.DecoderInputBuffer(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.decoder.SimpleDecoder
    public androidx.media3.exoplayer.image.ImageOutputBuffer createOutputBuffer() {
        return new androidx.media3.exoplayer.image.ImageOutputBuffer() { // from class: androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.1
            @Override // androidx.media3.decoder.DecoderOutputBuffer
            public void release() {
                androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.this.releaseOutputBuffer(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.decoder.SimpleDecoder
    public androidx.media3.exoplayer.image.ImageDecoderException createUnexpectedDecodeException(java.lang.Throwable th) {
        return new androidx.media3.exoplayer.image.ImageDecoderException("Unexpected decode error", th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.decoder.SimpleDecoder
    public androidx.media3.exoplayer.image.ImageDecoderException decode(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, androidx.media3.exoplayer.image.ImageOutputBuffer imageOutputBuffer, boolean z) {
        try {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkNotNull(decoderInputBuffer.data);
            androidx.media3.common.util.Assertions.checkState(byteBuffer.hasArray());
            androidx.media3.common.util.Assertions.checkArgument(byteBuffer.arrayOffset() == 0);
            imageOutputBuffer.bitmap = this.bitmapDecoder.decode(byteBuffer.array(), byteBuffer.remaining());
            imageOutputBuffer.timeUs = decoderInputBuffer.timeUs;
            return null;
        } catch (androidx.media3.exoplayer.image.ImageDecoderException e) {
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static android.graphics.Bitmap decode(byte[] bArr, int i) throws androidx.media3.exoplayer.image.ImageDecoderException {
        try {
            return androidx.media3.datasource.BitmapUtil.decode(bArr, i, null);
        } catch (androidx.media3.common.ParserException e) {
            throw new androidx.media3.exoplayer.image.ImageDecoderException("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i + ")", e);
        } catch (java.io.IOException e2) {
            throw new androidx.media3.exoplayer.image.ImageDecoderException(e2);
        }
    }
}
