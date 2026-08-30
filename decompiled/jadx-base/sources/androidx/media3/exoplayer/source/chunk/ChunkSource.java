package androidx.media3.exoplayer.source.chunk;

/* JADX INFO: loaded from: classes.dex */
public interface ChunkSource {
    long getAdjustedSeekPositionUs(long j, androidx.media3.exoplayer.SeekParameters seekParameters);

    void getNextChunk(androidx.media3.exoplayer.LoadingInfo loadingInfo, long j, java.util.List<? extends androidx.media3.exoplayer.source.chunk.MediaChunk> list, androidx.media3.exoplayer.source.chunk.ChunkHolder chunkHolder);

    int getPreferredQueueSize(long j, java.util.List<? extends androidx.media3.exoplayer.source.chunk.MediaChunk> list);

    void maybeThrowError() throws java.io.IOException;

    void onChunkLoadCompleted(androidx.media3.exoplayer.source.chunk.Chunk chunk);

    boolean onChunkLoadError(androidx.media3.exoplayer.source.chunk.Chunk chunk, boolean z, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy);

    void release();

    boolean shouldCancelLoad(long j, androidx.media3.exoplayer.source.chunk.Chunk chunk, java.util.List<? extends androidx.media3.exoplayer.source.chunk.MediaChunk> list);
}
