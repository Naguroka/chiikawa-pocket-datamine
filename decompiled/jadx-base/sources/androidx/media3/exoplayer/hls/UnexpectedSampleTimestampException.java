package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
final class UnexpectedSampleTimestampException extends java.io.IOException {
    public final long lastAcceptedSampleTimeUs;
    public final androidx.media3.exoplayer.source.chunk.MediaChunk mediaChunk;
    public final long rejectedSampleTimeUs;

    public UnexpectedSampleTimestampException(androidx.media3.exoplayer.source.chunk.MediaChunk mediaChunk, long j, long j2) {
        super("Unexpected sample timestamp: " + androidx.media3.common.util.Util.usToMs(j2) + " in chunk [" + mediaChunk.startTimeUs + ", " + mediaChunk.endTimeUs + com.ironsource.y8.i.e);
        this.mediaChunk = mediaChunk;
        this.lastAcceptedSampleTimeUs = j;
        this.rejectedSampleTimeUs = j2;
    }
}
