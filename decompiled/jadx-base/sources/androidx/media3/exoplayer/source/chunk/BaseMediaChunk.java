package androidx.media3.exoplayer.source.chunk;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseMediaChunk extends androidx.media3.exoplayer.source.chunk.MediaChunk {
    public final long clippedEndTimeUs;
    public final long clippedStartTimeUs;
    private int[] firstSampleIndices;
    private androidx.media3.exoplayer.source.chunk.BaseMediaChunkOutput output;

    public BaseMediaChunk(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, androidx.media3.common.Format format, int i, java.lang.Object obj, long j, long j2, long j3, long j4, long j5) {
        super(dataSource, dataSpec, format, i, obj, j, j2, j5);
        this.clippedStartTimeUs = j3;
        this.clippedEndTimeUs = j4;
    }

    public void init(androidx.media3.exoplayer.source.chunk.BaseMediaChunkOutput baseMediaChunkOutput) {
        this.output = baseMediaChunkOutput;
        this.firstSampleIndices = baseMediaChunkOutput.getWriteIndices();
    }

    public final int getFirstSampleIndex(int i) {
        return ((int[]) androidx.media3.common.util.Assertions.checkStateNotNull(this.firstSampleIndices))[i];
    }

    protected final androidx.media3.exoplayer.source.chunk.BaseMediaChunkOutput getOutput() {
        return (androidx.media3.exoplayer.source.chunk.BaseMediaChunkOutput) androidx.media3.common.util.Assertions.checkStateNotNull(this.output);
    }
}
