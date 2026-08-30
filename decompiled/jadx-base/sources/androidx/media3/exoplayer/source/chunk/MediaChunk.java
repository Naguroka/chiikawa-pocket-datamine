package androidx.media3.exoplayer.source.chunk;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaChunk extends androidx.media3.exoplayer.source.chunk.Chunk {
    public final long chunkIndex;

    public abstract boolean isLoadCompleted();

    public MediaChunk(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, androidx.media3.common.Format format, int i, java.lang.Object obj, long j, long j2, long j3) {
        super(dataSource, dataSpec, 1, format, i, obj, j, j2);
        androidx.media3.common.util.Assertions.checkNotNull(format);
        this.chunkIndex = j3;
    }

    public long getNextChunkIndex() {
        long j = this.chunkIndex;
        if (j != -1) {
            return 1 + j;
        }
        return -1L;
    }
}
