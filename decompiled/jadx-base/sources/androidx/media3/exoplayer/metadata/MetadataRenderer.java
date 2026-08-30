package androidx.media3.exoplayer.metadata;

/* JADX INFO: loaded from: classes.dex */
public final class MetadataRenderer extends androidx.media3.exoplayer.BaseRenderer implements android.os.Handler.Callback {
    private static final int MSG_INVOKE_RENDERER = 1;
    private static final java.lang.String TAG = "MetadataRenderer";
    private final androidx.media3.extractor.metadata.MetadataInputBuffer buffer;
    private androidx.media3.extractor.metadata.MetadataDecoder decoder;
    private final androidx.media3.exoplayer.metadata.MetadataDecoderFactory decoderFactory;
    private boolean inputStreamEnded;
    private final androidx.media3.exoplayer.metadata.MetadataOutput output;
    private final android.os.Handler outputHandler;
    private final boolean outputMetadataEarly;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs;
    private androidx.media3.common.Metadata pendingMetadata;
    private long subsampleOffsetUs;

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public java.lang.String getName() {
        return TAG;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return true;
    }

    public MetadataRenderer(androidx.media3.exoplayer.metadata.MetadataOutput metadataOutput, android.os.Looper looper) {
        this(metadataOutput, looper, androidx.media3.exoplayer.metadata.MetadataDecoderFactory.DEFAULT);
    }

    public MetadataRenderer(androidx.media3.exoplayer.metadata.MetadataOutput metadataOutput, android.os.Looper looper, androidx.media3.exoplayer.metadata.MetadataDecoderFactory metadataDecoderFactory) {
        this(metadataOutput, looper, metadataDecoderFactory, false);
    }

    public MetadataRenderer(androidx.media3.exoplayer.metadata.MetadataOutput metadataOutput, android.os.Looper looper, androidx.media3.exoplayer.metadata.MetadataDecoderFactory metadataDecoderFactory, boolean z) {
        super(5);
        this.output = (androidx.media3.exoplayer.metadata.MetadataOutput) androidx.media3.common.util.Assertions.checkNotNull(metadataOutput);
        this.outputHandler = looper == null ? null : androidx.media3.common.util.Util.createHandler(looper, this);
        this.decoderFactory = (androidx.media3.exoplayer.metadata.MetadataDecoderFactory) androidx.media3.common.util.Assertions.checkNotNull(metadataDecoderFactory);
        this.outputMetadataEarly = z;
        this.buffer = new androidx.media3.extractor.metadata.MetadataInputBuffer();
        this.outputStreamOffsetUs = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsFormat(androidx.media3.common.Format format) {
        if (this.decoderFactory.supportsFormat(format)) {
            return androidx.media3.exoplayer.RendererCapabilities.create(format.cryptoType == 0 ? 4 : 2);
        }
        return androidx.media3.exoplayer.RendererCapabilities.create(0);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onStreamChanged(androidx.media3.common.Format[] formatArr, long j, long j2, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        this.decoder = this.decoderFactory.createDecoder(formatArr[0]);
        androidx.media3.common.Metadata metadata = this.pendingMetadata;
        if (metadata != null) {
            this.pendingMetadata = metadata.copyWithPresentationTimeUs((metadata.presentationTimeUs + this.outputStreamOffsetUs) - j2);
        }
        this.outputStreamOffsetUs = j2;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onPositionReset(long j, boolean z) {
        this.pendingMetadata = null;
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j, long j2) {
        boolean zOutputMetadata = true;
        while (zOutputMetadata) {
            readMetadata();
            zOutputMetadata = outputMetadata(j);
        }
    }

    private void decodeWrappedMetadata(androidx.media3.common.Metadata metadata, java.util.List<androidx.media3.common.Metadata.Entry> list) {
        for (int i = 0; i < metadata.length(); i++) {
            androidx.media3.common.Format wrappedMetadataFormat = metadata.get(i).getWrappedMetadataFormat();
            if (wrappedMetadataFormat != null && this.decoderFactory.supportsFormat(wrappedMetadataFormat)) {
                androidx.media3.extractor.metadata.MetadataDecoder metadataDecoderCreateDecoder = this.decoderFactory.createDecoder(wrappedMetadataFormat);
                byte[] bArr = (byte[]) androidx.media3.common.util.Assertions.checkNotNull(metadata.get(i).getWrappedMetadataBytes());
                this.buffer.clear();
                this.buffer.ensureSpaceForWrite(bArr.length);
                ((java.nio.ByteBuffer) androidx.media3.common.util.Util.castNonNull(this.buffer.data)).put(bArr);
                this.buffer.flip();
                androidx.media3.common.Metadata metadataDecode = metadataDecoderCreateDecoder.decode(this.buffer);
                if (metadataDecode != null) {
                    decodeWrappedMetadata(metadataDecode, list);
                }
            } else {
                list.add(metadata.get(i));
            }
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onDisabled() {
        this.pendingMetadata = null;
        this.decoder = null;
        this.outputStreamOffsetUs = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (message.what == 1) {
            invokeRendererInternal((androidx.media3.common.Metadata) message.obj);
            return true;
        }
        throw new java.lang.IllegalStateException();
    }

    private void readMetadata() {
        if (this.inputStreamEnded || this.pendingMetadata != null) {
            return;
        }
        this.buffer.clear();
        androidx.media3.exoplayer.FormatHolder formatHolder = getFormatHolder();
        int source = readSource(formatHolder, this.buffer, 0);
        if (source != -4) {
            if (source == -5) {
                this.subsampleOffsetUs = ((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(formatHolder.format)).subsampleOffsetUs;
                return;
            }
            return;
        }
        if (this.buffer.isEndOfStream()) {
            this.inputStreamEnded = true;
            return;
        }
        if (this.buffer.timeUs >= getLastResetPositionUs()) {
            this.buffer.subsampleOffsetUs = this.subsampleOffsetUs;
            this.buffer.flip();
            androidx.media3.common.Metadata metadataDecode = ((androidx.media3.extractor.metadata.MetadataDecoder) androidx.media3.common.util.Util.castNonNull(this.decoder)).decode(this.buffer);
            if (metadataDecode != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(metadataDecode.length());
                decodeWrappedMetadata(metadataDecode, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.pendingMetadata = new androidx.media3.common.Metadata(getPresentationTimeUs(this.buffer.timeUs), arrayList);
            }
        }
    }

    private boolean outputMetadata(long j) {
        boolean z;
        androidx.media3.common.Metadata metadata = this.pendingMetadata;
        if (metadata == null || (!this.outputMetadataEarly && metadata.presentationTimeUs > getPresentationTimeUs(j))) {
            z = false;
        } else {
            invokeRenderer(this.pendingMetadata);
            this.pendingMetadata = null;
            z = true;
        }
        if (this.inputStreamEnded && this.pendingMetadata == null) {
            this.outputStreamEnded = true;
        }
        return z;
    }

    private void invokeRenderer(androidx.media3.common.Metadata metadata) {
        android.os.Handler handler = this.outputHandler;
        if (handler != null) {
            handler.obtainMessage(1, metadata).sendToTarget();
        } else {
            invokeRendererInternal(metadata);
        }
    }

    private void invokeRendererInternal(androidx.media3.common.Metadata metadata) {
        this.output.onMetadata(metadata);
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    private long getPresentationTimeUs(long j) {
        androidx.media3.common.util.Assertions.checkState(j != androidx.media3.common.C.TIME_UNSET);
        androidx.media3.common.util.Assertions.checkState(this.outputStreamOffsetUs != androidx.media3.common.C.TIME_UNSET);
        return j - this.outputStreamOffsetUs;
    }
}
