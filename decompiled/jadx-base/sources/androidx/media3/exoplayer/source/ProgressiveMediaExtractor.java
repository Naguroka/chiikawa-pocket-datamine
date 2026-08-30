package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public interface ProgressiveMediaExtractor {

    public interface Factory {
        androidx.media3.exoplayer.source.ProgressiveMediaExtractor createProgressiveMediaExtractor(androidx.media3.exoplayer.analytics.PlayerId playerId);
    }

    void disableSeekingOnMp3Streams();

    long getCurrentInputPosition();

    void init(androidx.media3.common.DataReader dataReader, android.net.Uri uri, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, long j, long j2, androidx.media3.extractor.ExtractorOutput extractorOutput) throws java.io.IOException;

    int read(androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException;

    void release();

    void seek(long j, long j2);
}
