package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
abstract class ExoAssetLoaderBaseRenderer extends androidx.media3.exoplayer.BaseRenderer {
    private final androidx.media3.transformer.AssetLoader.Listener assetLoaderListener;
    protected androidx.media3.transformer.Codec decoder;
    private final androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer;
    private boolean hasPendingConsumerInput;
    private androidx.media3.common.Format inputFormat;
    protected boolean isEnded;
    private boolean isRunning;
    private final androidx.media3.transformer.TransformerMediaClock mediaClock;
    private androidx.media3.common.Format outputFormat;
    protected androidx.media3.transformer.SampleConsumer sampleConsumer;
    private boolean shouldInitDecoder;
    protected long streamOffsetUs;
    protected long streamStartPositionUs;

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sampleConsumer", "decoder"})
    protected abstract boolean feedConsumerFromDecoder() throws androidx.media3.transformer.ExportException;

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"decoder"})
    protected abstract void initDecoder(androidx.media3.common.Format format) throws androidx.media3.transformer.ExportException;

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return true;
    }

    protected void onDecoderInputReady(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) {
    }

    protected void onInputFormatRead(androidx.media3.common.Format format) {
    }

    protected androidx.media3.common.Format overrideInputFormat(androidx.media3.common.Format format) {
        return format;
    }

    protected androidx.media3.common.Format overrideOutputFormat(androidx.media3.common.Format format) {
        return format;
    }

    protected abstract boolean shouldDropInputBuffer(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer);

    public ExoAssetLoaderBaseRenderer(int i, androidx.media3.transformer.TransformerMediaClock transformerMediaClock, androidx.media3.transformer.AssetLoader.Listener listener) {
        super(i);
        this.mediaClock = transformerMediaClock;
        this.assetLoaderListener = listener;
        this.decoderInputBuffer = new androidx.media3.decoder.DecoderInputBuffer(0);
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsFormat(androidx.media3.common.Format format) {
        return androidx.media3.exoplayer.RendererCapabilities.create(androidx.media3.common.MimeTypes.getTrackType(format.sampleMimeType) == getTrackType() ? 4 : 0);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public androidx.media3.exoplayer.MediaClock getMediaClock() {
        return this.mediaClock;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.isEnded;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j, long j2) {
        try {
            if (this.isRunning && !isEnded() && readInputFormatAndInitDecoderIfNeeded()) {
                if (this.decoder != null) {
                    do {
                    } while ((ensureSampleConsumerInitialized() ? feedConsumerFromDecoder() : false) | feedDecoderFromInput());
                } else if (ensureSampleConsumerInitialized()) {
                    while (feedConsumerFromInput()) {
                    }
                }
            }
        } catch (androidx.media3.transformer.ExportException e) {
            this.isRunning = false;
            this.assetLoaderListener.onError(e);
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onStreamChanged(androidx.media3.common.Format[] formatArr, long j, long j2, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        this.streamStartPositionUs = j;
        this.streamOffsetUs = j2;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onEnabled(boolean z, boolean z2) {
        this.mediaClock.updateTimeForTrackType(getTrackType(), 0L);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onStarted() {
        this.isRunning = true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onStopped() {
        this.isRunning = false;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onReset() {
        androidx.media3.transformer.Codec codec = this.decoder;
        if (codec != null) {
            codec.release();
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"inputFormat"}, result = true)
    private boolean readInputFormatAndInitDecoderIfNeeded() throws androidx.media3.transformer.ExportException {
        androidx.media3.common.Format format = this.inputFormat;
        if (format != null && !this.shouldInitDecoder) {
            return true;
        }
        if (format == null) {
            androidx.media3.exoplayer.FormatHolder formatHolder = getFormatHolder();
            if (readSource(formatHolder, this.decoderInputBuffer, 2) != -5) {
                return false;
            }
            androidx.media3.common.Format formatOverrideInputFormat = overrideInputFormat((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(formatHolder.format));
            this.inputFormat = formatOverrideInputFormat;
            onInputFormatRead(formatOverrideInputFormat);
            this.shouldInitDecoder = this.assetLoaderListener.onTrackAdded(this.inputFormat, 3);
        }
        if (this.shouldInitDecoder) {
            if (androidx.media3.transformer.TransformerUtil.getProcessedTrackType(this.inputFormat.sampleMimeType) == 2 && !ensureSampleConsumerInitialized()) {
                return false;
            }
            initDecoder(this.inputFormat);
            this.shouldInitDecoder = false;
        }
        return true;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"sampleConsumer"}, result = true)
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"inputFormat"})
    private boolean ensureSampleConsumerInitialized() throws androidx.media3.transformer.ExportException {
        if (this.sampleConsumer != null) {
            return true;
        }
        if (this.outputFormat == null) {
            if (this.decoder != null && androidx.media3.transformer.TransformerUtil.getProcessedTrackType(this.inputFormat.sampleMimeType) == 1) {
                androidx.media3.common.Format outputFormat = this.decoder.getOutputFormat();
                if (outputFormat == null) {
                    return false;
                }
                this.outputFormat = overrideOutputFormat(outputFormat);
            } else {
                this.outputFormat = overrideOutputFormat(this.inputFormat);
            }
        }
        androidx.media3.transformer.SampleConsumer sampleConsumerOnOutputFormat = this.assetLoaderListener.onOutputFormat(this.outputFormat);
        if (sampleConsumerOnOutputFormat == null) {
            return false;
        }
        this.sampleConsumer = sampleConsumerOnOutputFormat;
        return true;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"decoder"})
    private boolean feedDecoderFromInput() throws androidx.media3.transformer.ExportException {
        if (!this.decoder.maybeDequeueInputBuffer(this.decoderInputBuffer) || !readInput(this.decoderInputBuffer)) {
            return false;
        }
        if (shouldDropInputBuffer(this.decoderInputBuffer)) {
            return true;
        }
        onDecoderInputReady(this.decoderInputBuffer);
        this.decoder.queueInputBuffer(this.decoderInputBuffer);
        return true;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sampleConsumer"})
    private boolean feedConsumerFromInput() {
        androidx.media3.decoder.DecoderInputBuffer inputBuffer = this.sampleConsumer.getInputBuffer();
        if (inputBuffer == null) {
            return false;
        }
        if (!this.hasPendingConsumerInput) {
            if (!readInput(inputBuffer)) {
                return false;
            }
            if (shouldDropInputBuffer(inputBuffer)) {
                return true;
            }
            this.hasPendingConsumerInput = true;
        }
        boolean zIsEndOfStream = inputBuffer.isEndOfStream();
        if (!this.sampleConsumer.queueInputBuffer()) {
            return false;
        }
        this.hasPendingConsumerInput = false;
        this.isEnded = zIsEndOfStream;
        return !zIsEndOfStream;
    }

    private boolean readInput(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) {
        int source = readSource(getFormatHolder(), decoderInputBuffer, 0);
        if (source == -5) {
            throw new java.lang.IllegalStateException("Format changes are not supported.");
        }
        if (source != -4) {
            return false;
        }
        decoderInputBuffer.flip();
        if (decoderInputBuffer.isEndOfStream()) {
            return true;
        }
        this.mediaClock.updateTimeForTrackType(getTrackType(), decoderInputBuffer.timeUs);
        return true;
    }
}
