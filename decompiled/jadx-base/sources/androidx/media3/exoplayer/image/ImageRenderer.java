package androidx.media3.exoplayer.image;

/* JADX INFO: loaded from: classes.dex */
public class ImageRenderer extends androidx.media3.exoplayer.BaseRenderer {
    private static final long IMAGE_PRESENTATION_WINDOW_THRESHOLD_US = 30000;
    private static final int REINITIALIZATION_STATE_NONE = 0;
    private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM_THEN_WAIT = 2;
    private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 3;
    private static final java.lang.String TAG = "ImageRenderer";
    private int currentTileIndex;
    private androidx.media3.exoplayer.image.ImageDecoder decoder;
    private final androidx.media3.exoplayer.image.ImageDecoder.Factory decoderFactory;
    private int decoderReinitializationState;
    private int firstFrameState;
    private final androidx.media3.decoder.DecoderInputBuffer flagsOnlyBuffer;
    private androidx.media3.exoplayer.image.ImageOutput imageOutput;
    private androidx.media3.decoder.DecoderInputBuffer inputBuffer;
    private androidx.media3.common.Format inputFormat;
    private boolean inputStreamEnded;
    private long largestQueuedPresentationTimeUs;
    private long lastProcessedOutputBufferTimeUs;
    private androidx.media3.exoplayer.image.ImageRenderer.TileInfo nextTileInfo;
    private android.graphics.Bitmap outputBitmap;
    private boolean outputStreamEnded;
    private androidx.media3.exoplayer.image.ImageRenderer.OutputStreamInfo outputStreamInfo;
    private final java.util.ArrayDeque<androidx.media3.exoplayer.image.ImageRenderer.OutputStreamInfo> pendingOutputStreamChanges;
    private boolean readyToOutputTiles;
    private androidx.media3.exoplayer.image.ImageRenderer.TileInfo tileInfo;

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public java.lang.String getName() {
        return TAG;
    }

    public ImageRenderer(androidx.media3.exoplayer.image.ImageDecoder.Factory factory, androidx.media3.exoplayer.image.ImageOutput imageOutput) {
        super(4);
        this.decoderFactory = factory;
        this.imageOutput = getImageOutput(imageOutput);
        this.flagsOnlyBuffer = androidx.media3.decoder.DecoderInputBuffer.newNoDataInstance();
        this.outputStreamInfo = androidx.media3.exoplayer.image.ImageRenderer.OutputStreamInfo.UNSET;
        this.pendingOutputStreamChanges = new java.util.ArrayDeque<>();
        this.largestQueuedPresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.lastProcessedOutputBufferTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.decoderReinitializationState = 0;
        this.firstFrameState = 1;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsFormat(androidx.media3.common.Format format) {
        return this.decoderFactory.supportsFormat(format);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j, long j2) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (this.outputStreamEnded) {
            return;
        }
        if (this.inputFormat == null) {
            androidx.media3.exoplayer.FormatHolder formatHolder = getFormatHolder();
            this.flagsOnlyBuffer.clear();
            int source = readSource(formatHolder, this.flagsOnlyBuffer, 2);
            if (source != -5) {
                if (source == -4) {
                    androidx.media3.common.util.Assertions.checkState(this.flagsOnlyBuffer.isEndOfStream());
                    this.inputStreamEnded = true;
                    this.outputStreamEnded = true;
                    return;
                }
                return;
            }
            this.inputFormat = (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkStateNotNull(formatHolder.format);
            initDecoder();
        }
        try {
            androidx.media3.common.util.TraceUtil.beginSection("drainAndFeedDecoder");
            while (drainOutput(j, j2)) {
            }
            while (feedInputBuffer(j)) {
            }
            androidx.media3.common.util.TraceUtil.endSection();
        } catch (androidx.media3.exoplayer.image.ImageDecoderException e) {
            throw createRendererException(e, null, 4003);
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        int i = this.firstFrameState;
        return i == 3 || (i == 0 && this.readyToOutputTiles);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onEnabled(boolean z, boolean z2) throws androidx.media3.exoplayer.ExoPlaybackException {
        this.firstFrameState = z2 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r2 >= r5) goto L14;
     */
    @Override // androidx.media3.exoplayer.BaseRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onStreamChanged(androidx.media3.common.Format[] formatArr, long j, long j2, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) throws androidx.media3.exoplayer.ExoPlaybackException {
        super.onStreamChanged(formatArr, j, j2, mediaPeriodId);
        if (this.outputStreamInfo.streamOffsetUs != androidx.media3.common.C.TIME_UNSET) {
            if (this.pendingOutputStreamChanges.isEmpty()) {
                long j3 = this.largestQueuedPresentationTimeUs;
                if (j3 != androidx.media3.common.C.TIME_UNSET) {
                    long j4 = this.lastProcessedOutputBufferTimeUs;
                    if (j4 != androidx.media3.common.C.TIME_UNSET) {
                    }
                }
            }
            this.pendingOutputStreamChanges.add(new androidx.media3.exoplayer.image.ImageRenderer.OutputStreamInfo(this.largestQueuedPresentationTimeUs, j2));
            return;
        }
        this.outputStreamInfo = new androidx.media3.exoplayer.image.ImageRenderer.OutputStreamInfo(androidx.media3.common.C.TIME_UNSET, j2);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onPositionReset(long j, boolean z) throws androidx.media3.exoplayer.ExoPlaybackException {
        lowerFirstFrameState(1);
        this.outputStreamEnded = false;
        this.inputStreamEnded = false;
        this.outputBitmap = null;
        this.tileInfo = null;
        this.nextTileInfo = null;
        this.readyToOutputTiles = false;
        this.inputBuffer = null;
        androidx.media3.exoplayer.image.ImageDecoder imageDecoder = this.decoder;
        if (imageDecoder != null) {
            imageDecoder.flush();
        }
        this.pendingOutputStreamChanges.clear();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onDisabled() {
        this.inputFormat = null;
        this.outputStreamInfo = androidx.media3.exoplayer.image.ImageRenderer.OutputStreamInfo.UNSET;
        this.pendingOutputStreamChanges.clear();
        releaseDecoderResources();
        this.imageOutput.onDisabled();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onReset() {
        releaseDecoderResources();
        lowerFirstFrameState(1);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onRelease() {
        releaseDecoderResources();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, java.lang.Object obj) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (i == 15) {
            setImageOutput(obj instanceof androidx.media3.exoplayer.image.ImageOutput ? (androidx.media3.exoplayer.image.ImageOutput) obj : null);
        } else {
            super.handleMessage(i, obj);
        }
    }

    private boolean drainOutput(long j, long j2) throws androidx.media3.exoplayer.ExoPlaybackException, androidx.media3.exoplayer.image.ImageDecoderException {
        android.graphics.Bitmap bitmapCropTileFromImageGrid;
        if (this.outputBitmap != null && this.tileInfo == null) {
            return false;
        }
        if (this.firstFrameState == 0 && getState() != 2) {
            return false;
        }
        if (this.outputBitmap == null) {
            androidx.media3.common.util.Assertions.checkStateNotNull(this.decoder);
            androidx.media3.exoplayer.image.ImageOutputBuffer imageOutputBufferDequeueOutputBuffer = this.decoder.dequeueOutputBuffer();
            if (imageOutputBufferDequeueOutputBuffer == null) {
                return false;
            }
            if (((androidx.media3.exoplayer.image.ImageOutputBuffer) androidx.media3.common.util.Assertions.checkStateNotNull(imageOutputBufferDequeueOutputBuffer)).isEndOfStream()) {
                if (this.decoderReinitializationState == 3) {
                    releaseDecoderResources();
                    androidx.media3.common.util.Assertions.checkStateNotNull(this.inputFormat);
                    initDecoder();
                } else {
                    ((androidx.media3.exoplayer.image.ImageOutputBuffer) androidx.media3.common.util.Assertions.checkStateNotNull(imageOutputBufferDequeueOutputBuffer)).release();
                    if (this.pendingOutputStreamChanges.isEmpty()) {
                        this.outputStreamEnded = true;
                    }
                }
                return false;
            }
            androidx.media3.common.util.Assertions.checkStateNotNull(imageOutputBufferDequeueOutputBuffer.bitmap, "Non-EOS buffer came back from the decoder without bitmap.");
            this.outputBitmap = imageOutputBufferDequeueOutputBuffer.bitmap;
            ((androidx.media3.exoplayer.image.ImageOutputBuffer) androidx.media3.common.util.Assertions.checkStateNotNull(imageOutputBufferDequeueOutputBuffer)).release();
        }
        if (!this.readyToOutputTiles || this.outputBitmap == null || this.tileInfo == null) {
            return false;
        }
        androidx.media3.common.util.Assertions.checkStateNotNull(this.inputFormat);
        boolean z = ((this.inputFormat.tileCountHorizontal == 1 && this.inputFormat.tileCountVertical == 1) || this.inputFormat.tileCountHorizontal == -1 || this.inputFormat.tileCountVertical == -1) ? false : true;
        if (!this.tileInfo.hasTileBitmap()) {
            androidx.media3.exoplayer.image.ImageRenderer.TileInfo tileInfo = this.tileInfo;
            if (z) {
                bitmapCropTileFromImageGrid = cropTileFromImageGrid(tileInfo.getTileIndex());
            } else {
                bitmapCropTileFromImageGrid = (android.graphics.Bitmap) androidx.media3.common.util.Assertions.checkStateNotNull(this.outputBitmap);
            }
            tileInfo.setTileBitmap(bitmapCropTileFromImageGrid);
        }
        if (!processOutputBuffer(j, j2, (android.graphics.Bitmap) androidx.media3.common.util.Assertions.checkStateNotNull(this.tileInfo.getTileBitmap()), this.tileInfo.getPresentationTimeUs())) {
            return false;
        }
        onProcessedOutputBuffer(((androidx.media3.exoplayer.image.ImageRenderer.TileInfo) androidx.media3.common.util.Assertions.checkStateNotNull(this.tileInfo)).getPresentationTimeUs());
        this.firstFrameState = 3;
        if (!z || ((androidx.media3.exoplayer.image.ImageRenderer.TileInfo) androidx.media3.common.util.Assertions.checkStateNotNull(this.tileInfo)).getTileIndex() == (((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkStateNotNull(this.inputFormat)).tileCountVertical * ((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkStateNotNull(this.inputFormat)).tileCountHorizontal) - 1) {
            this.outputBitmap = null;
        }
        this.tileInfo = this.nextTileInfo;
        this.nextTileInfo = null;
        return true;
    }

    private boolean shouldForceRender() {
        boolean z = getState() == 2;
        int i = this.firstFrameState;
        if (i == 0) {
            return z;
        }
        if (i == 1) {
            return true;
        }
        if (i == 3) {
            return false;
        }
        throw new java.lang.IllegalStateException();
    }

    protected boolean processOutputBuffer(long j, long j2, android.graphics.Bitmap bitmap, long j3) throws androidx.media3.exoplayer.ExoPlaybackException {
        long j4 = j3 - j;
        if (!shouldForceRender() && j4 >= 30000) {
            return false;
        }
        this.imageOutput.onImageAvailable(j3 - this.outputStreamInfo.streamOffsetUs, bitmap);
        return true;
    }

    private void onProcessedOutputBuffer(long j) {
        this.lastProcessedOutputBufferTimeUs = j;
        while (!this.pendingOutputStreamChanges.isEmpty() && j >= this.pendingOutputStreamChanges.peek().previousStreamLastBufferTimeUs) {
            this.outputStreamInfo = this.pendingOutputStreamChanges.removeFirst();
        }
    }

    private boolean feedInputBuffer(long j) throws androidx.media3.exoplayer.image.ImageDecoderException {
        if (this.readyToOutputTiles && this.tileInfo != null) {
            return false;
        }
        androidx.media3.exoplayer.FormatHolder formatHolder = getFormatHolder();
        androidx.media3.exoplayer.image.ImageDecoder imageDecoder = this.decoder;
        if (imageDecoder == null || this.decoderReinitializationState == 3 || this.inputStreamEnded) {
            return false;
        }
        if (this.inputBuffer == null) {
            androidx.media3.decoder.DecoderInputBuffer decoderInputBufferDequeueInputBuffer = imageDecoder.dequeueInputBuffer();
            this.inputBuffer = decoderInputBufferDequeueInputBuffer;
            if (decoderInputBufferDequeueInputBuffer == null) {
                return false;
            }
        }
        if (this.decoderReinitializationState == 2) {
            androidx.media3.common.util.Assertions.checkStateNotNull(this.inputBuffer);
            this.inputBuffer.setFlags(4);
            ((androidx.media3.exoplayer.image.ImageDecoder) androidx.media3.common.util.Assertions.checkStateNotNull(this.decoder)).queueInputBuffer(this.inputBuffer);
            this.inputBuffer = null;
            this.decoderReinitializationState = 3;
            return false;
        }
        int source = readSource(formatHolder, this.inputBuffer, 0);
        if (source == -5) {
            this.inputFormat = (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkStateNotNull(formatHolder.format);
            this.decoderReinitializationState = 2;
            return true;
        }
        if (source != -4) {
            if (source == -3) {
                return false;
            }
            throw new java.lang.IllegalStateException();
        }
        this.inputBuffer.flip();
        boolean z = ((java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkStateNotNull(this.inputBuffer.data)).remaining() > 0 || ((androidx.media3.decoder.DecoderInputBuffer) androidx.media3.common.util.Assertions.checkStateNotNull(this.inputBuffer)).isEndOfStream();
        if (z) {
            ((androidx.media3.exoplayer.image.ImageDecoder) androidx.media3.common.util.Assertions.checkStateNotNull(this.decoder)).queueInputBuffer((androidx.media3.decoder.DecoderInputBuffer) androidx.media3.common.util.Assertions.checkStateNotNull(this.inputBuffer));
            this.currentTileIndex = 0;
        }
        maybeAdvanceTileInfo(j, (androidx.media3.decoder.DecoderInputBuffer) androidx.media3.common.util.Assertions.checkStateNotNull(this.inputBuffer));
        if (((androidx.media3.decoder.DecoderInputBuffer) androidx.media3.common.util.Assertions.checkStateNotNull(this.inputBuffer)).isEndOfStream()) {
            this.inputStreamEnded = true;
            this.inputBuffer = null;
            return false;
        }
        this.largestQueuedPresentationTimeUs = java.lang.Math.max(this.largestQueuedPresentationTimeUs, ((androidx.media3.decoder.DecoderInputBuffer) androidx.media3.common.util.Assertions.checkStateNotNull(this.inputBuffer)).timeUs);
        if (z) {
            this.inputBuffer = null;
        } else {
            ((androidx.media3.decoder.DecoderInputBuffer) androidx.media3.common.util.Assertions.checkStateNotNull(this.inputBuffer)).clear();
        }
        return !this.readyToOutputTiles;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"decoder"})
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"inputFormat"})
    private void initDecoder() throws androidx.media3.exoplayer.ExoPlaybackException {
        if (canCreateDecoderForFormat(this.inputFormat)) {
            androidx.media3.exoplayer.image.ImageDecoder imageDecoder = this.decoder;
            if (imageDecoder != null) {
                imageDecoder.release();
            }
            this.decoder = this.decoderFactory.createImageDecoder();
            return;
        }
        throw createRendererException(new androidx.media3.exoplayer.image.ImageDecoderException("Provided decoder factory can't create decoder for format."), this.inputFormat, 4005);
    }

    private boolean canCreateDecoderForFormat(androidx.media3.common.Format format) {
        int iSupportsFormat = this.decoderFactory.supportsFormat(format);
        return iSupportsFormat == androidx.media3.exoplayer.RendererCapabilities.create(4) || iSupportsFormat == androidx.media3.exoplayer.RendererCapabilities.create(3);
    }

    private void lowerFirstFrameState(int i) {
        this.firstFrameState = java.lang.Math.min(this.firstFrameState, i);
    }

    private void releaseDecoderResources() {
        this.inputBuffer = null;
        this.decoderReinitializationState = 0;
        this.largestQueuedPresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
        androidx.media3.exoplayer.image.ImageDecoder imageDecoder = this.decoder;
        if (imageDecoder != null) {
            imageDecoder.release();
            this.decoder = null;
        }
    }

    private void setImageOutput(androidx.media3.exoplayer.image.ImageOutput imageOutput) {
        this.imageOutput = getImageOutput(imageOutput);
    }

    private void maybeAdvanceTileInfo(long j, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) {
        boolean z = true;
        if (decoderInputBuffer.isEndOfStream()) {
            this.readyToOutputTiles = true;
            return;
        }
        androidx.media3.exoplayer.image.ImageRenderer.TileInfo tileInfo = new androidx.media3.exoplayer.image.ImageRenderer.TileInfo(this.currentTileIndex, decoderInputBuffer.timeUs);
        this.nextTileInfo = tileInfo;
        this.currentTileIndex++;
        if (!this.readyToOutputTiles) {
            long presentationTimeUs = tileInfo.getPresentationTimeUs();
            boolean z2 = presentationTimeUs - 30000 <= j && j <= 30000 + presentationTimeUs;
            androidx.media3.exoplayer.image.ImageRenderer.TileInfo tileInfo2 = this.tileInfo;
            boolean z3 = tileInfo2 != null && tileInfo2.getPresentationTimeUs() <= j && j < presentationTimeUs;
            boolean zIsTileLastInGrid = isTileLastInGrid((androidx.media3.exoplayer.image.ImageRenderer.TileInfo) androidx.media3.common.util.Assertions.checkStateNotNull(this.nextTileInfo));
            if (!z2 && !z3 && !zIsTileLastInGrid) {
                z = false;
            }
            this.readyToOutputTiles = z;
            if (z3 && !z2) {
                return;
            }
        }
        this.tileInfo = this.nextTileInfo;
        this.nextTileInfo = null;
    }

    private boolean isTileLastInGrid(androidx.media3.exoplayer.image.ImageRenderer.TileInfo tileInfo) {
        return ((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkStateNotNull(this.inputFormat)).tileCountHorizontal == -1 || this.inputFormat.tileCountVertical == -1 || tileInfo.getTileIndex() == (((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkStateNotNull(this.inputFormat)).tileCountVertical * this.inputFormat.tileCountHorizontal) - 1;
    }

    private android.graphics.Bitmap cropTileFromImageGrid(int i) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.outputBitmap);
        int width = this.outputBitmap.getWidth() / ((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkStateNotNull(this.inputFormat)).tileCountHorizontal;
        int height = this.outputBitmap.getHeight() / ((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkStateNotNull(this.inputFormat)).tileCountVertical;
        return android.graphics.Bitmap.createBitmap(this.outputBitmap, (i % this.inputFormat.tileCountHorizontal) * width, (i / this.inputFormat.tileCountHorizontal) * height, width, height);
    }

    private static androidx.media3.exoplayer.image.ImageOutput getImageOutput(androidx.media3.exoplayer.image.ImageOutput imageOutput) {
        return imageOutput == null ? androidx.media3.exoplayer.image.ImageOutput.NO_OP : imageOutput;
    }

    private static class TileInfo {
        private final long presentationTimeUs;
        private android.graphics.Bitmap tileBitmap;
        private final int tileIndex;

        public TileInfo(int i, long j) {
            this.tileIndex = i;
            this.presentationTimeUs = j;
        }

        public int getTileIndex() {
            return this.tileIndex;
        }

        public long getPresentationTimeUs() {
            return this.presentationTimeUs;
        }

        public android.graphics.Bitmap getTileBitmap() {
            return this.tileBitmap;
        }

        public void setTileBitmap(android.graphics.Bitmap bitmap) {
            this.tileBitmap = bitmap;
        }

        public boolean hasTileBitmap() {
            return this.tileBitmap != null;
        }
    }

    private static final class OutputStreamInfo {
        public static final androidx.media3.exoplayer.image.ImageRenderer.OutputStreamInfo UNSET = new androidx.media3.exoplayer.image.ImageRenderer.OutputStreamInfo(androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET);
        public final long previousStreamLastBufferTimeUs;
        public final long streamOffsetUs;

        public OutputStreamInfo(long j, long j2) {
            this.previousStreamLastBufferTimeUs = j;
            this.streamOffsetUs = j2;
        }
    }
}
