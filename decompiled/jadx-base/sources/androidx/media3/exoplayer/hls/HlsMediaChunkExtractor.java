package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
public interface HlsMediaChunkExtractor {
    void init(androidx.media3.extractor.ExtractorOutput extractorOutput);

    boolean isPackedAudioExtractor();

    boolean isReusable();

    void onTruncatedSegmentParsed();

    boolean read(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException;

    androidx.media3.exoplayer.hls.HlsMediaChunkExtractor recreate();
}
