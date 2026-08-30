package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
public final class WebvttExtractor implements androidx.media3.extractor.Extractor {
    private static final int HEADER_MAX_LENGTH = 9;
    private static final int HEADER_MIN_LENGTH = 6;
    private static final java.util.regex.Pattern LOCAL_TIMESTAMP = java.util.regex.Pattern.compile("LOCAL:([^,]+)");
    private static final java.util.regex.Pattern MEDIA_TIMESTAMP = java.util.regex.Pattern.compile("MPEGTS:(-?\\d+)");
    private final java.lang.String language;
    private androidx.media3.extractor.ExtractorOutput output;
    private final boolean parseSubtitlesDuringExtraction;
    private byte[] sampleData;
    private final androidx.media3.common.util.ParsableByteArray sampleDataWrapper;
    private int sampleSize;
    private final androidx.media3.extractor.text.SubtitleParser.Factory subtitleParserFactory;
    private final androidx.media3.common.util.TimestampAdjuster timestampAdjuster;

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    @java.lang.Deprecated
    public WebvttExtractor(java.lang.String str, androidx.media3.common.util.TimestampAdjuster timestampAdjuster) {
        this(str, timestampAdjuster, androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED, false);
    }

    public WebvttExtractor(java.lang.String str, androidx.media3.common.util.TimestampAdjuster timestampAdjuster, androidx.media3.extractor.text.SubtitleParser.Factory factory, boolean z) {
        this.language = str;
        this.timestampAdjuster = timestampAdjuster;
        this.sampleDataWrapper = new androidx.media3.common.util.ParsableByteArray();
        this.sampleData = new byte[1024];
        this.subtitleParserFactory = factory;
        this.parseSubtitlesDuringExtraction = z;
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        extractorInput.peekFully(this.sampleData, 0, 6, false);
        this.sampleDataWrapper.reset(this.sampleData, 6);
        if (androidx.media3.extractor.text.webvtt.WebvttParserUtil.isWebvttHeaderLine(this.sampleDataWrapper)) {
            return true;
        }
        extractorInput.peekFully(this.sampleData, 6, 3, false);
        this.sampleDataWrapper.reset(this.sampleData, 9);
        return androidx.media3.extractor.text.webvtt.WebvttParserUtil.isWebvttHeaderLine(this.sampleDataWrapper);
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.output = this.parseSubtitlesDuringExtraction ? new androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory) : extractorOutput;
        extractorOutput.seekMap(new androidx.media3.extractor.SeekMap.Unseekable(androidx.media3.common.C.TIME_UNSET));
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        throw new java.lang.IllegalStateException();
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        androidx.media3.common.util.Assertions.checkNotNull(this.output);
        int length = (int) extractorInput.getLength();
        int i = this.sampleSize;
        byte[] bArr = this.sampleData;
        if (i == bArr.length) {
            this.sampleData = java.util.Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.sampleData;
        int i2 = this.sampleSize;
        int i3 = extractorInput.read(bArr2, i2, bArr2.length - i2);
        if (i3 != -1) {
            int i4 = this.sampleSize + i3;
            this.sampleSize = i4;
            if (length == -1 || i4 != length) {
                return 0;
            }
        }
        processSample();
        return -1;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({org.jacoco.core.runtime.AgentOptions.OUTPUT})
    private void processSample() throws androidx.media3.common.ParserException {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(this.sampleData);
        androidx.media3.extractor.text.webvtt.WebvttParserUtil.validateWebvttHeaderLine(parsableByteArray);
        long jPtsToUs = 0;
        long timestampUs = 0;
        for (java.lang.String line = parsableByteArray.readLine(); !android.text.TextUtils.isEmpty(line); line = parsableByteArray.readLine()) {
            if (line.startsWith("X-TIMESTAMP-MAP")) {
                java.util.regex.Matcher matcher = LOCAL_TIMESTAMP.matcher(line);
                if (!matcher.find()) {
                    throw androidx.media3.common.ParserException.createForMalformedContainer("X-TIMESTAMP-MAP doesn't contain local timestamp: " + line, null);
                }
                java.util.regex.Matcher matcher2 = MEDIA_TIMESTAMP.matcher(line);
                if (!matcher2.find()) {
                    throw androidx.media3.common.ParserException.createForMalformedContainer("X-TIMESTAMP-MAP doesn't contain media timestamp: " + line, null);
                }
                timestampUs = androidx.media3.extractor.text.webvtt.WebvttParserUtil.parseTimestampUs((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(1)));
                jPtsToUs = androidx.media3.common.util.TimestampAdjuster.ptsToUs(java.lang.Long.parseLong((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher2.group(1))));
            }
        }
        java.util.regex.Matcher matcherFindNextCueHeader = androidx.media3.extractor.text.webvtt.WebvttParserUtil.findNextCueHeader(parsableByteArray);
        if (matcherFindNextCueHeader == null) {
            buildTrackOutput(0L);
            return;
        }
        long timestampUs2 = androidx.media3.extractor.text.webvtt.WebvttParserUtil.parseTimestampUs((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcherFindNextCueHeader.group(1)));
        long jAdjustTsTimestamp = this.timestampAdjuster.adjustTsTimestamp(androidx.media3.common.util.TimestampAdjuster.usToWrappedPts((jPtsToUs + timestampUs2) - timestampUs));
        androidx.media3.extractor.TrackOutput trackOutputBuildTrackOutput = buildTrackOutput(jAdjustTsTimestamp - timestampUs2);
        this.sampleDataWrapper.reset(this.sampleData, this.sampleSize);
        trackOutputBuildTrackOutput.sampleData(this.sampleDataWrapper, this.sampleSize);
        trackOutputBuildTrackOutput.sampleMetadata(jAdjustTsTimestamp, 1, this.sampleSize, 0, null);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({org.jacoco.core.runtime.AgentOptions.OUTPUT})
    private androidx.media3.extractor.TrackOutput buildTrackOutput(long j) {
        androidx.media3.extractor.TrackOutput trackOutputTrack = this.output.track(0, 3);
        trackOutputTrack.format(new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.TEXT_VTT).setLanguage(this.language).setSubsampleOffsetUs(j).build());
        this.output.endTracks();
        return trackOutputTrack;
    }
}
