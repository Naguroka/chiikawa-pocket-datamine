package androidx.media3.exoplayer.source.chunk;

/* JADX INFO: loaded from: classes.dex */
public interface ChunkExtractor {

    public interface Factory {
        androidx.media3.exoplayer.source.chunk.ChunkExtractor createProgressiveMediaExtractor(int i, androidx.media3.common.Format format, boolean z, java.util.List<androidx.media3.common.Format> list, androidx.media3.extractor.TrackOutput trackOutput, androidx.media3.exoplayer.analytics.PlayerId playerId);

        default androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory experimentalParseSubtitlesDuringExtraction(boolean z) {
            return this;
        }

        default androidx.media3.common.Format getOutputTextFormat(androidx.media3.common.Format format) {
            return format;
        }

        default androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory setSubtitleParserFactory(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
            return this;
        }
    }

    public interface TrackOutputProvider {
        androidx.media3.extractor.TrackOutput track(int i, int i2);
    }

    androidx.media3.extractor.ChunkIndex getChunkIndex();

    androidx.media3.common.Format[] getSampleFormats();

    void init(androidx.media3.exoplayer.source.chunk.ChunkExtractor.TrackOutputProvider trackOutputProvider, long j, long j2);

    boolean read(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException;

    void release();
}
