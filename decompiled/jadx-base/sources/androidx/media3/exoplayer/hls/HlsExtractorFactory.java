package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
public interface HlsExtractorFactory {
    public static final androidx.media3.exoplayer.hls.HlsExtractorFactory DEFAULT = new androidx.media3.exoplayer.hls.DefaultHlsExtractorFactory();

    androidx.media3.exoplayer.hls.HlsMediaChunkExtractor createExtractor(android.net.Uri uri, androidx.media3.common.Format format, java.util.List<androidx.media3.common.Format> list, androidx.media3.common.util.TimestampAdjuster timestampAdjuster, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.exoplayer.analytics.PlayerId playerId) throws java.io.IOException;

    default androidx.media3.exoplayer.hls.HlsExtractorFactory experimentalParseSubtitlesDuringExtraction(boolean z) {
        return this;
    }

    default androidx.media3.common.Format getOutputTextFormat(androidx.media3.common.Format format) {
        return format;
    }

    default androidx.media3.exoplayer.hls.HlsExtractorFactory setSubtitleParserFactory(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        return this;
    }
}
