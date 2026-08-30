package androidx.media3.extractor.text;

/* JADX INFO: loaded from: classes.dex */
final class SubtitleTranscodingTrackOutput implements androidx.media3.extractor.TrackOutput {
    private androidx.media3.common.Format currentFormat;
    private androidx.media3.extractor.text.SubtitleParser currentSubtitleParser;
    private final androidx.media3.extractor.TrackOutput delegate;
    private final androidx.media3.extractor.text.SubtitleParser.Factory subtitleParserFactory;
    private final androidx.media3.extractor.text.CueEncoder cueEncoder = new androidx.media3.extractor.text.CueEncoder();
    private int sampleDataStart = 0;
    private int sampleDataEnd = 0;
    private byte[] sampleData = androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
    private final androidx.media3.common.util.ParsableByteArray parsableScratch = new androidx.media3.common.util.ParsableByteArray();

    public SubtitleTranscodingTrackOutput(androidx.media3.extractor.TrackOutput trackOutput, androidx.media3.extractor.text.SubtitleParser.Factory factory) {
        this.delegate = trackOutput;
        this.subtitleParserFactory = factory;
    }

    public void resetSubtitleParser() {
        androidx.media3.extractor.text.SubtitleParser subtitleParser = this.currentSubtitleParser;
        if (subtitleParser != null) {
            subtitleParser.reset();
        }
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void format(androidx.media3.common.Format format) {
        androidx.media3.common.util.Assertions.checkNotNull(format.sampleMimeType);
        androidx.media3.common.util.Assertions.checkArgument(androidx.media3.common.MimeTypes.getTrackType(format.sampleMimeType) == 3);
        if (!format.equals(this.currentFormat)) {
            this.currentFormat = format;
            this.currentSubtitleParser = this.subtitleParserFactory.supportsFormat(format) ? this.subtitleParserFactory.create(format) : null;
        }
        if (this.currentSubtitleParser == null) {
            this.delegate.format(format);
        } else {
            this.delegate.format(format.buildUpon().setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_MEDIA3_CUES).setCodecs(format.sampleMimeType).setSubsampleOffsetUs(Long.MAX_VALUE).setCueReplacementBehavior(this.subtitleParserFactory.getCueReplacementBehavior(format)).build());
        }
    }

    @Override // androidx.media3.extractor.TrackOutput
    public int sampleData(androidx.media3.common.DataReader dataReader, int i, boolean z, int i2) throws java.io.IOException {
        if (this.currentSubtitleParser == null) {
            return this.delegate.sampleData(dataReader, i, z, i2);
        }
        ensureSampleDataCapacity(i);
        int i3 = dataReader.read(this.sampleData, this.sampleDataEnd, i);
        if (i3 != -1) {
            this.sampleDataEnd += i3;
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new java.io.EOFException();
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleData(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i, int i2) {
        if (this.currentSubtitleParser == null) {
            this.delegate.sampleData(parsableByteArray, i, i2);
            return;
        }
        ensureSampleDataCapacity(i);
        parsableByteArray.readBytes(this.sampleData, this.sampleDataEnd, i);
        this.sampleDataEnd += i;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleMetadata(final long j, final int i, int i2, int i3, androidx.media3.extractor.TrackOutput.CryptoData cryptoData) {
        if (this.currentSubtitleParser == null) {
            this.delegate.sampleMetadata(j, i, i2, i3, cryptoData);
            return;
        }
        androidx.media3.common.util.Assertions.checkArgument(cryptoData == null, "DRM on subtitles is not supported");
        int i4 = (this.sampleDataEnd - i3) - i2;
        this.currentSubtitleParser.parse(this.sampleData, i4, i2, androidx.media3.extractor.text.SubtitleParser.OutputOptions.allCues(), new androidx.media3.common.util.Consumer() { // from class: androidx.media3.extractor.text.SubtitleTranscodingTrackOutput$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.util.Consumer
            public final void accept(java.lang.Object obj) {
                this.f$0.m225xa18018cd(j, i, (androidx.media3.extractor.text.CuesWithTiming) obj);
            }
        });
        int i5 = i4 + i2;
        this.sampleDataStart = i5;
        if (i5 == this.sampleDataEnd) {
            this.sampleDataStart = 0;
            this.sampleDataEnd = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: outputSample, reason: merged with bridge method [inline-methods] */
    public void m225xa18018cd(androidx.media3.extractor.text.CuesWithTiming cuesWithTiming, long j, int i) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.currentFormat);
        byte[] bArrEncode = this.cueEncoder.encode(cuesWithTiming.cues, cuesWithTiming.durationUs);
        this.parsableScratch.reset(bArrEncode);
        this.delegate.sampleData(this.parsableScratch, bArrEncode.length);
        if (cuesWithTiming.startTimeUs == androidx.media3.common.C.TIME_UNSET) {
            androidx.media3.common.util.Assertions.checkState(this.currentFormat.subsampleOffsetUs == Long.MAX_VALUE);
        } else if (this.currentFormat.subsampleOffsetUs == Long.MAX_VALUE) {
            j += cuesWithTiming.startTimeUs;
        } else {
            j = cuesWithTiming.startTimeUs + this.currentFormat.subsampleOffsetUs;
        }
        this.delegate.sampleMetadata(j, i, bArrEncode.length, 0, null);
    }

    private void ensureSampleDataCapacity(int i) {
        int length = this.sampleData.length;
        int i2 = this.sampleDataEnd;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.sampleDataStart;
        int iMax = java.lang.Math.max(i3 * 2, i + i3);
        byte[] bArr = this.sampleData;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        java.lang.System.arraycopy(bArr, this.sampleDataStart, bArr2, 0, i3);
        this.sampleDataStart = 0;
        this.sampleDataEnd = i3;
        this.sampleData = bArr2;
    }
}
