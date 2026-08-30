package androidx.media3.exoplayer.source.chunk;

/* JADX INFO: loaded from: classes.dex */
public class ContainerMediaChunk extends androidx.media3.exoplayer.source.chunk.BaseMediaChunk {
    private final int chunkCount;
    private final androidx.media3.exoplayer.source.chunk.ChunkExtractor chunkExtractor;
    private volatile boolean loadCanceled;
    private boolean loadCompleted;
    private long nextLoadPosition;
    private final long sampleOffsetUs;

    protected androidx.media3.exoplayer.source.chunk.ChunkExtractor.TrackOutputProvider getTrackOutputProvider(androidx.media3.exoplayer.source.chunk.BaseMediaChunkOutput baseMediaChunkOutput) {
        return baseMediaChunkOutput;
    }

    public ContainerMediaChunk(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, androidx.media3.common.Format format, int i, java.lang.Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, androidx.media3.exoplayer.source.chunk.ChunkExtractor chunkExtractor) {
        super(dataSource, dataSpec, format, i, obj, j, j2, j3, j4, j5);
        this.chunkCount = i2;
        this.sampleOffsetUs = j6;
        this.chunkExtractor = chunkExtractor;
    }

    @Override // androidx.media3.exoplayer.source.chunk.MediaChunk
    public long getNextChunkIndex() {
        return this.chunkIndex + ((long) this.chunkCount);
    }

    @Override // androidx.media3.exoplayer.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void cancelLoad() {
        this.loadCanceled = true;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void load() throws java.io.IOException {
        androidx.media3.exoplayer.source.chunk.BaseMediaChunkOutput output = getOutput();
        if (this.nextLoadPosition == 0) {
            output.setSampleOffsetUs(this.sampleOffsetUs);
            androidx.media3.exoplayer.source.chunk.ChunkExtractor chunkExtractor = this.chunkExtractor;
            androidx.media3.exoplayer.source.chunk.ChunkExtractor.TrackOutputProvider trackOutputProvider = getTrackOutputProvider(output);
            long j = this.clippedStartTimeUs;
            long j2 = androidx.media3.common.C.TIME_UNSET;
            long j3 = j == androidx.media3.common.C.TIME_UNSET ? -9223372036854775807L : this.clippedStartTimeUs - this.sampleOffsetUs;
            if (this.clippedEndTimeUs != androidx.media3.common.C.TIME_UNSET) {
                j2 = this.clippedEndTimeUs - this.sampleOffsetUs;
            }
            chunkExtractor.init(trackOutputProvider, j3, j2);
        }
        try {
            androidx.media3.datasource.DataSpec dataSpecSubrange = this.dataSpec.subrange(this.nextLoadPosition);
            androidx.media3.extractor.DefaultExtractorInput defaultExtractorInput = new androidx.media3.extractor.DefaultExtractorInput(this.dataSource, dataSpecSubrange.position, this.dataSource.open(dataSpecSubrange));
            do {
                try {
                    if (this.loadCanceled) {
                        break;
                    }
                } catch (java.lang.Throwable th) {
                    this.nextLoadPosition = defaultExtractorInput.getPosition() - this.dataSpec.position;
                    throw th;
                }
            } while (this.chunkExtractor.read(defaultExtractorInput));
            maybeWriteEmptySamples(output);
            this.nextLoadPosition = defaultExtractorInput.getPosition() - this.dataSpec.position;
            androidx.media3.datasource.DataSourceUtil.closeQuietly(this.dataSource);
            this.loadCompleted = !this.loadCanceled;
        } catch (java.lang.Throwable th2) {
            androidx.media3.datasource.DataSourceUtil.closeQuietly(this.dataSource);
            throw th2;
        }
    }

    private void maybeWriteEmptySamples(androidx.media3.exoplayer.source.chunk.BaseMediaChunkOutput baseMediaChunkOutput) {
        if (androidx.media3.common.MimeTypes.isImage(this.trackFormat.containerMimeType)) {
            if ((this.trackFormat.tileCountHorizontal <= 1 && this.trackFormat.tileCountVertical <= 1) || this.trackFormat.tileCountHorizontal == -1 || this.trackFormat.tileCountVertical == -1) {
                return;
            }
            androidx.media3.extractor.TrackOutput trackOutputTrack = baseMediaChunkOutput.track(0, 4);
            int i = this.trackFormat.tileCountHorizontal * this.trackFormat.tileCountVertical;
            long j = (this.endTimeUs - this.startTimeUs) / ((long) i);
            for (int i2 = 1; i2 < i; i2++) {
                trackOutputTrack.sampleData(new androidx.media3.common.util.ParsableByteArray(), 0);
                trackOutputTrack.sampleMetadata(((long) i2) * j, 0, 0, 0, null);
            }
        }
    }
}
