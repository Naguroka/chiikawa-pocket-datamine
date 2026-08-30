package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
final class ExoAssetLoaderAudioRenderer extends androidx.media3.transformer.ExoAssetLoaderBaseRenderer {
    private static final java.lang.String TAG = "ExoAssetLoaderAudioRenderer";
    private final androidx.media3.transformer.Codec.DecoderFactory decoderFactory;
    private boolean hasPendingConsumerInput;

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public java.lang.String getName() {
        return TAG;
    }

    public ExoAssetLoaderAudioRenderer(androidx.media3.transformer.Codec.DecoderFactory decoderFactory, androidx.media3.transformer.TransformerMediaClock transformerMediaClock, androidx.media3.transformer.AssetLoader.Listener listener) {
        super(1, transformerMediaClock, listener);
        this.decoderFactory = decoderFactory;
    }

    @Override // androidx.media3.transformer.ExoAssetLoaderBaseRenderer
    protected void initDecoder(androidx.media3.common.Format format) throws androidx.media3.transformer.ExportException {
        this.decoder = this.decoderFactory.createForAudioDecoding(format);
    }

    @Override // androidx.media3.transformer.ExoAssetLoaderBaseRenderer
    protected boolean shouldDropInputBuffer(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) {
        if (decoderInputBuffer.isEndOfStream()) {
            return false;
        }
        decoderInputBuffer.timeUs -= this.streamStartPositionUs;
        if (this.decoder == null || decoderInputBuffer.timeUs >= 0) {
            return false;
        }
        decoderInputBuffer.clear();
        return true;
    }

    @Override // androidx.media3.transformer.ExoAssetLoaderBaseRenderer
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sampleConsumer", "decoder"})
    protected boolean feedConsumerFromDecoder() throws androidx.media3.transformer.ExportException {
        androidx.media3.decoder.DecoderInputBuffer inputBuffer = this.sampleConsumer.getInputBuffer();
        if (inputBuffer == null) {
            return false;
        }
        if (!this.hasPendingConsumerInput) {
            if (this.decoder.isEnded()) {
                ((java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkNotNull(inputBuffer.data)).limit(0);
                inputBuffer.addFlag(4);
                this.isEnded = this.sampleConsumer.queueInputBuffer();
                return false;
            }
            java.nio.ByteBuffer outputBuffer = this.decoder.getOutputBuffer();
            if (outputBuffer == null) {
                return false;
            }
            inputBuffer.ensureSpaceForWrite(outputBuffer.limit());
            inputBuffer.data.put(outputBuffer).flip();
            android.media.MediaCodec.BufferInfo bufferInfo = (android.media.MediaCodec.BufferInfo) androidx.media3.common.util.Assertions.checkNotNull(this.decoder.getOutputBufferInfo());
            inputBuffer.timeUs = bufferInfo.presentationTimeUs;
            inputBuffer.setFlags(bufferInfo.flags);
            this.decoder.releaseOutputBuffer(false);
            this.hasPendingConsumerInput = true;
        }
        if (!this.sampleConsumer.queueInputBuffer()) {
            return false;
        }
        this.hasPendingConsumerInput = false;
        return true;
    }
}
