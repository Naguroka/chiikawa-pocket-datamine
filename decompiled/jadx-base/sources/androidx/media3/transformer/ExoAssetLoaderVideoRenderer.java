package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
final class ExoAssetLoaderVideoRenderer extends androidx.media3.transformer.ExoAssetLoaderBaseRenderer {
    private static final java.lang.String TAG = "ExoAssetLoaderVideoRenderer";
    private final java.util.List<java.lang.Long> decodeOnlyPresentationTimestamps;
    private final androidx.media3.transformer.Codec.DecoderFactory decoderFactory;
    private final boolean flattenForSlowMotion;
    private final int hdrMode;
    private int maxDecoderPendingFrameCount;
    private androidx.media3.transformer.SefSlowMotionFlattener sefVideoSlowMotionFlattener;

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public java.lang.String getName() {
        return TAG;
    }

    public ExoAssetLoaderVideoRenderer(boolean z, androidx.media3.transformer.Codec.DecoderFactory decoderFactory, int i, androidx.media3.transformer.TransformerMediaClock transformerMediaClock, androidx.media3.transformer.AssetLoader.Listener listener) {
        super(2, transformerMediaClock, listener);
        this.flattenForSlowMotion = z;
        this.decoderFactory = decoderFactory;
        this.hdrMode = i;
        this.decodeOnlyPresentationTimestamps = new java.util.ArrayList();
    }

    @Override // androidx.media3.transformer.ExoAssetLoaderBaseRenderer
    protected androidx.media3.common.Format overrideInputFormat(androidx.media3.common.Format format) {
        return (this.hdrMode == 3 && androidx.media3.common.ColorInfo.isTransferHdr(format.colorInfo)) ? format.buildUpon().setColorInfo(androidx.media3.common.ColorInfo.SDR_BT709_LIMITED).build() : format;
    }

    @Override // androidx.media3.transformer.ExoAssetLoaderBaseRenderer
    protected androidx.media3.common.Format overrideOutputFormat(androidx.media3.common.Format format) {
        return format.buildUpon().setColorInfo(androidx.media3.transformer.TransformerUtil.getDecoderOutputColor(androidx.media3.transformer.TransformerUtil.getValidColor(format.colorInfo), this.hdrMode == 1)).build();
    }

    @Override // androidx.media3.transformer.ExoAssetLoaderBaseRenderer
    protected void onInputFormatRead(androidx.media3.common.Format format) {
        if (this.flattenForSlowMotion) {
            this.sefVideoSlowMotionFlattener = new androidx.media3.transformer.SefSlowMotionFlattener(format);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.media3.transformer.ExoAssetLoaderBaseRenderer
    protected void initDecoder(androidx.media3.common.Format format) throws androidx.media3.transformer.ExportException {
        boolean z;
        androidx.media3.common.util.Assertions.checkStateNotNull(this.sampleConsumer);
        if (androidx.media3.common.ColorInfo.isTransferHdr(format.colorInfo)) {
            z = this.hdrMode == 1;
        }
        this.decoder = this.decoderFactory.createForVideoDecoding(format, (android.view.Surface) androidx.media3.common.util.Assertions.checkNotNull(this.sampleConsumer.getInputSurface()), z);
        this.maxDecoderPendingFrameCount = this.decoder.getMaxPendingFrameCount();
    }

    @Override // androidx.media3.transformer.ExoAssetLoaderBaseRenderer
    protected boolean shouldDropInputBuffer(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) {
        if (decoderInputBuffer.isEndOfStream()) {
            return false;
        }
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkNotNull(decoderInputBuffer.data);
        if (this.sefVideoSlowMotionFlattener != null) {
            if (this.sefVideoSlowMotionFlattener.dropOrTransformSample(byteBuffer, decoderInputBuffer.timeUs - this.streamOffsetUs)) {
                byteBuffer.clear();
                return true;
            }
            decoderInputBuffer.timeUs = this.streamOffsetUs + this.sefVideoSlowMotionFlattener.getSamplePresentationTimeUs();
        }
        if (this.decoder == null) {
            decoderInputBuffer.timeUs -= this.streamStartPositionUs;
            if (decoderInputBuffer.timeUs < 0) {
                decoderInputBuffer.clear();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.transformer.ExoAssetLoaderBaseRenderer
    protected void onDecoderInputReady(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) {
        if (decoderInputBuffer.timeUs < getLastResetPositionUs()) {
            this.decodeOnlyPresentationTimestamps.add(java.lang.Long.valueOf(decoderInputBuffer.timeUs));
        }
    }

    @Override // androidx.media3.transformer.ExoAssetLoaderBaseRenderer
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sampleConsumer", "decoder"})
    protected boolean feedConsumerFromDecoder() throws androidx.media3.transformer.ExportException {
        if (this.decoder.isEnded()) {
            this.sampleConsumer.signalEndOfVideoInput();
            this.isEnded = true;
            return false;
        }
        android.media.MediaCodec.BufferInfo outputBufferInfo = this.decoder.getOutputBufferInfo();
        if (outputBufferInfo == null) {
            return false;
        }
        long j = outputBufferInfo.presentationTimeUs - this.streamStartPositionUs;
        if (j < 0 || isDecodeOnlyBuffer(outputBufferInfo.presentationTimeUs)) {
            this.decoder.releaseOutputBuffer(false);
            return true;
        }
        if (this.sampleConsumer.getPendingVideoFrameCount() == this.maxDecoderPendingFrameCount || !this.sampleConsumer.registerVideoFrame(j)) {
            return false;
        }
        this.decoder.releaseOutputBuffer(j);
        return true;
    }

    private boolean isDecodeOnlyBuffer(long j) {
        int size = this.decodeOnlyPresentationTimestamps.size();
        for (int i = 0; i < size; i++) {
            if (this.decodeOnlyPresentationTimestamps.get(i).longValue() == j) {
                this.decodeOnlyPresentationTimestamps.remove(i);
                return true;
            }
        }
        return false;
    }
}
