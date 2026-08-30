package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultHlsExtractorFactory implements androidx.media3.exoplayer.hls.HlsExtractorFactory {
    private static final int[] DEFAULT_EXTRACTOR_ORDER = {8, 13, 11, 2, 0, 1, 7};
    private final boolean exposeCea608WhenMissingDeclarations;
    private boolean parseSubtitlesDuringExtraction;
    private final int payloadReaderFactoryFlags;
    private androidx.media3.extractor.text.SubtitleParser.Factory subtitleParserFactory;

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public /* bridge */ /* synthetic */ androidx.media3.exoplayer.hls.HlsMediaChunkExtractor createExtractor(android.net.Uri uri, androidx.media3.common.Format format, java.util.List list, androidx.media3.common.util.TimestampAdjuster timestampAdjuster, java.util.Map map, androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.exoplayer.analytics.PlayerId playerId) throws java.io.IOException {
        return createExtractor(uri, format, (java.util.List<androidx.media3.common.Format>) list, timestampAdjuster, (java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map, extractorInput, playerId);
    }

    public DefaultHlsExtractorFactory() {
        this(0, true);
    }

    public DefaultHlsExtractorFactory(int i, boolean z) {
        this.payloadReaderFactoryFlags = i;
        this.exposeCea608WhenMissingDeclarations = z;
        this.subtitleParserFactory = new androidx.media3.extractor.text.DefaultSubtitleParserFactory();
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public androidx.media3.exoplayer.hls.BundledHlsMediaChunkExtractor createExtractor(android.net.Uri uri, androidx.media3.common.Format format, java.util.List<androidx.media3.common.Format> list, androidx.media3.common.util.TimestampAdjuster timestampAdjuster, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.exoplayer.analytics.PlayerId playerId) throws java.io.IOException {
        int iInferFileTypeFromMimeType = androidx.media3.common.FileTypes.inferFileTypeFromMimeType(format.sampleMimeType);
        int iInferFileTypeFromResponseHeaders = androidx.media3.common.FileTypes.inferFileTypeFromResponseHeaders(map);
        int iInferFileTypeFromUri = androidx.media3.common.FileTypes.inferFileTypeFromUri(uri);
        int[] iArr = DEFAULT_EXTRACTOR_ORDER;
        java.util.ArrayList arrayList = new java.util.ArrayList(iArr.length);
        addFileTypeIfValidAndNotPresent(iInferFileTypeFromMimeType, arrayList);
        addFileTypeIfValidAndNotPresent(iInferFileTypeFromResponseHeaders, arrayList);
        addFileTypeIfValidAndNotPresent(iInferFileTypeFromUri, arrayList);
        for (int i : iArr) {
            addFileTypeIfValidAndNotPresent(i, arrayList);
        }
        extractorInput.resetPeekPosition();
        androidx.media3.extractor.Extractor extractor = null;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            int iIntValue = ((java.lang.Integer) arrayList.get(i2)).intValue();
            androidx.media3.extractor.Extractor extractor2 = (androidx.media3.extractor.Extractor) androidx.media3.common.util.Assertions.checkNotNull(createExtractorByFileType(iIntValue, format, list, timestampAdjuster));
            if (sniffQuietly(extractor2, extractorInput)) {
                return new androidx.media3.exoplayer.hls.BundledHlsMediaChunkExtractor(extractor2, format, timestampAdjuster, this.subtitleParserFactory, this.parseSubtitlesDuringExtraction);
            }
            if (extractor == null && (iIntValue == iInferFileTypeFromMimeType || iIntValue == iInferFileTypeFromResponseHeaders || iIntValue == iInferFileTypeFromUri || iIntValue == 11)) {
                extractor = extractor2;
            }
        }
        return new androidx.media3.exoplayer.hls.BundledHlsMediaChunkExtractor((androidx.media3.extractor.Extractor) androidx.media3.common.util.Assertions.checkNotNull(extractor), format, timestampAdjuster, this.subtitleParserFactory, this.parseSubtitlesDuringExtraction);
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public androidx.media3.exoplayer.hls.DefaultHlsExtractorFactory setSubtitleParserFactory(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        this.subtitleParserFactory = factory;
        return this;
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public androidx.media3.exoplayer.hls.DefaultHlsExtractorFactory experimentalParseSubtitlesDuringExtraction(boolean z) {
        this.parseSubtitlesDuringExtraction = z;
        return this;
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public androidx.media3.common.Format getOutputTextFormat(androidx.media3.common.Format format) {
        if (this.parseSubtitlesDuringExtraction && this.subtitleParserFactory.supportsFormat(format)) {
            return format.buildUpon().setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_MEDIA3_CUES).setCueReplacementBehavior(this.subtitleParserFactory.getCueReplacementBehavior(format)).setCodecs(format.sampleMimeType + (format.codecs != null ? " " + format.codecs : "")).setSubsampleOffsetUs(Long.MAX_VALUE).build();
        }
        return format;
    }

    private static void addFileTypeIfValidAndNotPresent(int i, java.util.List<java.lang.Integer> list) {
        if (com.google.common.primitives.Ints.indexOf(DEFAULT_EXTRACTOR_ORDER, i) == -1 || list.contains(java.lang.Integer.valueOf(i))) {
            return;
        }
        list.add(java.lang.Integer.valueOf(i));
    }

    private androidx.media3.extractor.Extractor createExtractorByFileType(int i, androidx.media3.common.Format format, java.util.List<androidx.media3.common.Format> list, androidx.media3.common.util.TimestampAdjuster timestampAdjuster) {
        if (i == 0) {
            return new androidx.media3.extractor.ts.Ac3Extractor();
        }
        if (i == 1) {
            return new androidx.media3.extractor.ts.Ac4Extractor();
        }
        if (i == 2) {
            return new androidx.media3.extractor.ts.AdtsExtractor();
        }
        if (i == 7) {
            return new androidx.media3.extractor.mp3.Mp3Extractor(0, 0L);
        }
        if (i == 8) {
            return createFragmentedMp4Extractor(this.subtitleParserFactory, this.parseSubtitlesDuringExtraction, timestampAdjuster, format, list);
        }
        if (i == 11) {
            return createTsExtractor(this.payloadReaderFactoryFlags, this.exposeCea608WhenMissingDeclarations, format, list, timestampAdjuster, this.subtitleParserFactory, this.parseSubtitlesDuringExtraction);
        }
        if (i != 13) {
            return null;
        }
        return new androidx.media3.exoplayer.hls.WebvttExtractor(format.language, timestampAdjuster, this.subtitleParserFactory, this.parseSubtitlesDuringExtraction);
    }

    private static androidx.media3.extractor.ts.TsExtractor createTsExtractor(int i, boolean z, androidx.media3.common.Format format, java.util.List<androidx.media3.common.Format> list, androidx.media3.common.util.TimestampAdjuster timestampAdjuster, androidx.media3.extractor.text.SubtitleParser.Factory factory, boolean z2) {
        int i2;
        int i3 = i | 16;
        if (list != null) {
            i3 |= 32;
        } else if (z) {
            list = java.util.Collections.singletonList(new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_CEA608).build());
        } else {
            list = java.util.Collections.emptyList();
        }
        java.lang.String str = format.codecs;
        if (!android.text.TextUtils.isEmpty(str)) {
            if (!androidx.media3.common.MimeTypes.containsCodecsCorrespondingToMimeType(str, androidx.media3.common.MimeTypes.AUDIO_AAC)) {
                i3 |= 2;
            }
            if (!androidx.media3.common.MimeTypes.containsCodecsCorrespondingToMimeType(str, "video/avc")) {
                i3 |= 4;
            }
        }
        if (z2) {
            i2 = 0;
        } else {
            factory = androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED;
            i2 = 1;
        }
        return new androidx.media3.extractor.ts.TsExtractor(2, i2, factory, timestampAdjuster, new androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory(i3, list), androidx.media3.extractor.ts.TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    private static androidx.media3.extractor.mp4.FragmentedMp4Extractor createFragmentedMp4Extractor(androidx.media3.extractor.text.SubtitleParser.Factory factory, boolean z, androidx.media3.common.util.TimestampAdjuster timestampAdjuster, androidx.media3.common.Format format, java.util.List<androidx.media3.common.Format> list) {
        int i = isFmp4Variant(format) ? 4 : 0;
        if (!z) {
            factory = androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED;
            i |= 32;
        }
        androidx.media3.extractor.text.SubtitleParser.Factory factory2 = factory;
        int i2 = i;
        if (list == null) {
            list = com.google.common.collect.ImmutableList.of();
        }
        return new androidx.media3.extractor.mp4.FragmentedMp4Extractor(factory2, i2, timestampAdjuster, null, list, null);
    }

    private static boolean isFmp4Variant(androidx.media3.common.Format format) {
        androidx.media3.common.Metadata metadata = format.metadata;
        if (metadata == null) {
            return false;
        }
        for (int i = 0; i < metadata.length(); i++) {
            androidx.media3.common.Metadata.Entry entry = metadata.get(i);
            if (entry instanceof androidx.media3.exoplayer.hls.HlsTrackMetadataEntry) {
                return !((androidx.media3.exoplayer.hls.HlsTrackMetadataEntry) entry).variantInfos.isEmpty();
            }
        }
        return false;
    }

    private static boolean sniffQuietly(androidx.media3.extractor.Extractor extractor, androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        try {
            return extractor.sniff(extractorInput);
        } catch (java.io.EOFException unused) {
            return false;
        } finally {
            extractorInput.resetPeekPosition();
        }
    }
}
