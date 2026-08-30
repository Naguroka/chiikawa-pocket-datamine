package androidx.media3.exoplayer.dash;

/* JADX INFO: loaded from: classes.dex */
public final class DashUtil {
    public static androidx.media3.datasource.DataSpec buildDataSpec(androidx.media3.exoplayer.dash.manifest.Representation representation, java.lang.String str, androidx.media3.exoplayer.dash.manifest.RangedUri rangedUri, int i, java.util.Map<java.lang.String, java.lang.String> map) {
        return new androidx.media3.datasource.DataSpec.Builder().setUri(rangedUri.resolveUri(str)).setPosition(rangedUri.start).setLength(rangedUri.length).setKey(resolveCacheKey(representation, rangedUri)).setFlags(i).setHttpRequestHeaders(map).build();
    }

    @java.lang.Deprecated
    public static androidx.media3.datasource.DataSpec buildDataSpec(androidx.media3.exoplayer.dash.manifest.Representation representation, java.lang.String str, androidx.media3.exoplayer.dash.manifest.RangedUri rangedUri, int i) {
        return buildDataSpec(representation, str, rangedUri, i, com.google.common.collect.ImmutableMap.of());
    }

    @java.lang.Deprecated
    public static androidx.media3.datasource.DataSpec buildDataSpec(androidx.media3.exoplayer.dash.manifest.Representation representation, androidx.media3.exoplayer.dash.manifest.RangedUri rangedUri, int i) {
        return buildDataSpec(representation, representation.baseUrls.get(0).url, rangedUri, i, com.google.common.collect.ImmutableMap.of());
    }

    public static androidx.media3.exoplayer.dash.manifest.DashManifest loadManifest(androidx.media3.datasource.DataSource dataSource, android.net.Uri uri) throws java.io.IOException {
        return (androidx.media3.exoplayer.dash.manifest.DashManifest) androidx.media3.exoplayer.upstream.ParsingLoadable.load(dataSource, new androidx.media3.exoplayer.dash.manifest.DashManifestParser(), uri, 4);
    }

    public static androidx.media3.common.Format loadFormatWithDrmInitData(androidx.media3.datasource.DataSource dataSource, androidx.media3.exoplayer.dash.manifest.Period period) throws java.io.IOException {
        int i = 2;
        androidx.media3.exoplayer.dash.manifest.Representation firstRepresentation = getFirstRepresentation(period, 2);
        if (firstRepresentation == null) {
            i = 1;
            firstRepresentation = getFirstRepresentation(period, 1);
            if (firstRepresentation == null) {
                return null;
            }
        }
        androidx.media3.common.Format format = firstRepresentation.format;
        androidx.media3.common.Format formatLoadSampleFormat = loadSampleFormat(dataSource, i, firstRepresentation);
        return formatLoadSampleFormat == null ? format : formatLoadSampleFormat.withManifestFormatInfo(format);
    }

    public static androidx.media3.common.Format loadSampleFormat(androidx.media3.datasource.DataSource dataSource, int i, androidx.media3.exoplayer.dash.manifest.Representation representation, int i2) throws java.io.IOException {
        if (representation.getInitializationUri() == null) {
            return null;
        }
        androidx.media3.exoplayer.source.chunk.ChunkExtractor chunkExtractorNewChunkExtractor = newChunkExtractor(i, representation.format);
        try {
            loadInitializationData(chunkExtractorNewChunkExtractor, dataSource, representation, i2, false);
            return ((androidx.media3.common.Format[]) androidx.media3.common.util.Assertions.checkStateNotNull(chunkExtractorNewChunkExtractor.getSampleFormats()))[0];
        } finally {
            chunkExtractorNewChunkExtractor.release();
        }
    }

    public static androidx.media3.common.Format loadSampleFormat(androidx.media3.datasource.DataSource dataSource, int i, androidx.media3.exoplayer.dash.manifest.Representation representation) throws java.io.IOException {
        return loadSampleFormat(dataSource, i, representation, 0);
    }

    public static androidx.media3.extractor.ChunkIndex loadChunkIndex(androidx.media3.datasource.DataSource dataSource, int i, androidx.media3.exoplayer.dash.manifest.Representation representation, int i2) throws java.io.IOException {
        if (representation.getInitializationUri() == null) {
            return null;
        }
        androidx.media3.exoplayer.source.chunk.ChunkExtractor chunkExtractorNewChunkExtractor = newChunkExtractor(i, representation.format);
        try {
            loadInitializationData(chunkExtractorNewChunkExtractor, dataSource, representation, i2, true);
            return chunkExtractorNewChunkExtractor.getChunkIndex();
        } finally {
            chunkExtractorNewChunkExtractor.release();
        }
    }

    public static androidx.media3.extractor.ChunkIndex loadChunkIndex(androidx.media3.datasource.DataSource dataSource, int i, androidx.media3.exoplayer.dash.manifest.Representation representation) throws java.io.IOException {
        return loadChunkIndex(dataSource, i, representation, 0);
    }

    private static void loadInitializationData(androidx.media3.exoplayer.source.chunk.ChunkExtractor chunkExtractor, androidx.media3.datasource.DataSource dataSource, androidx.media3.exoplayer.dash.manifest.Representation representation, int i, boolean z) throws java.io.IOException {
        androidx.media3.exoplayer.dash.manifest.RangedUri rangedUri = (androidx.media3.exoplayer.dash.manifest.RangedUri) androidx.media3.common.util.Assertions.checkNotNull(representation.getInitializationUri());
        if (z) {
            androidx.media3.exoplayer.dash.manifest.RangedUri indexUri = representation.getIndexUri();
            if (indexUri == null) {
                return;
            }
            androidx.media3.exoplayer.dash.manifest.RangedUri rangedUriAttemptMerge = rangedUri.attemptMerge(indexUri, representation.baseUrls.get(i).url);
            if (rangedUriAttemptMerge == null) {
                loadInitializationData(dataSource, representation, i, chunkExtractor, rangedUri);
                rangedUri = indexUri;
            } else {
                rangedUri = rangedUriAttemptMerge;
            }
        }
        loadInitializationData(dataSource, representation, i, chunkExtractor, rangedUri);
    }

    public static void loadInitializationData(androidx.media3.exoplayer.source.chunk.ChunkExtractor chunkExtractor, androidx.media3.datasource.DataSource dataSource, androidx.media3.exoplayer.dash.manifest.Representation representation, boolean z) throws java.io.IOException {
        loadInitializationData(chunkExtractor, dataSource, representation, 0, z);
    }

    private static void loadInitializationData(androidx.media3.datasource.DataSource dataSource, androidx.media3.exoplayer.dash.manifest.Representation representation, int i, androidx.media3.exoplayer.source.chunk.ChunkExtractor chunkExtractor, androidx.media3.exoplayer.dash.manifest.RangedUri rangedUri) throws java.io.IOException {
        new androidx.media3.exoplayer.source.chunk.InitializationChunk(dataSource, buildDataSpec(representation, representation.baseUrls.get(i).url, rangedUri, 0, com.google.common.collect.ImmutableMap.of()), representation.format, 0, null, chunkExtractor).load();
    }

    public static java.lang.String resolveCacheKey(androidx.media3.exoplayer.dash.manifest.Representation representation, androidx.media3.exoplayer.dash.manifest.RangedUri rangedUri) {
        java.lang.String cacheKey = representation.getCacheKey();
        return cacheKey != null ? cacheKey : rangedUri.resolveUri(representation.baseUrls.get(0).url).toString();
    }

    private static androidx.media3.exoplayer.source.chunk.ChunkExtractor newChunkExtractor(int i, androidx.media3.common.Format format) {
        androidx.media3.extractor.Extractor fragmentedMp4Extractor;
        java.lang.String str = format.containerMimeType;
        if (str != null && (str.startsWith("video/webm") || str.startsWith(androidx.media3.common.MimeTypes.AUDIO_WEBM))) {
            fragmentedMp4Extractor = new androidx.media3.extractor.mkv.MatroskaExtractor(androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED, 2);
        } else {
            fragmentedMp4Extractor = new androidx.media3.extractor.mp4.FragmentedMp4Extractor(androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED, 32);
        }
        return new androidx.media3.exoplayer.source.chunk.BundledChunkExtractor(fragmentedMp4Extractor, i, format);
    }

    private static androidx.media3.exoplayer.dash.manifest.Representation getFirstRepresentation(androidx.media3.exoplayer.dash.manifest.Period period, int i) {
        int adaptationSetIndex = period.getAdaptationSetIndex(i);
        if (adaptationSetIndex == -1) {
            return null;
        }
        java.util.List<androidx.media3.exoplayer.dash.manifest.Representation> list = period.adaptationSets.get(adaptationSetIndex).representations;
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private DashUtil() {
    }
}
