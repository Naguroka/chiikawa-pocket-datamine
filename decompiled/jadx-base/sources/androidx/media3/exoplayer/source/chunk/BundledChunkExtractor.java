package androidx.media3.exoplayer.source.chunk;

/* JADX INFO: loaded from: classes.dex */
public final class BundledChunkExtractor implements androidx.media3.extractor.ExtractorOutput, androidx.media3.exoplayer.source.chunk.ChunkExtractor {
    public static final androidx.media3.exoplayer.source.chunk.BundledChunkExtractor.Factory FACTORY = new androidx.media3.exoplayer.source.chunk.BundledChunkExtractor.Factory();
    private static final androidx.media3.extractor.PositionHolder POSITION_HOLDER = new androidx.media3.extractor.PositionHolder();
    private final android.util.SparseArray<androidx.media3.exoplayer.source.chunk.BundledChunkExtractor.BindingTrackOutput> bindingTrackOutputs = new android.util.SparseArray<>();
    private long endTimeUs;
    private final androidx.media3.extractor.Extractor extractor;
    private boolean extractorInitialized;
    private final androidx.media3.common.Format primaryTrackManifestFormat;
    private final int primaryTrackType;
    private androidx.media3.common.Format[] sampleFormats;
    private androidx.media3.extractor.SeekMap seekMap;
    private androidx.media3.exoplayer.source.chunk.ChunkExtractor.TrackOutputProvider trackOutputProvider;

    public static final class Factory implements androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory {
        private boolean parseSubtitlesDuringExtraction;
        private androidx.media3.extractor.text.SubtitleParser.Factory subtitleParserFactory = new androidx.media3.extractor.text.DefaultSubtitleParserFactory();

        @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        public androidx.media3.exoplayer.source.chunk.BundledChunkExtractor.Factory setSubtitleParserFactory(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
            this.subtitleParserFactory = (androidx.media3.extractor.text.SubtitleParser.Factory) androidx.media3.common.util.Assertions.checkNotNull(factory);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        public androidx.media3.exoplayer.source.chunk.BundledChunkExtractor.Factory experimentalParseSubtitlesDuringExtraction(boolean z) {
            this.parseSubtitlesDuringExtraction = z;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        public androidx.media3.common.Format getOutputTextFormat(androidx.media3.common.Format format) {
            if (this.parseSubtitlesDuringExtraction && this.subtitleParserFactory.supportsFormat(format)) {
                return format.buildUpon().setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_MEDIA3_CUES).setCueReplacementBehavior(this.subtitleParserFactory.getCueReplacementBehavior(format)).setCodecs(format.sampleMimeType + (format.codecs != null ? " " + format.codecs : "")).setSubsampleOffsetUs(Long.MAX_VALUE).build();
            }
            return format;
        }

        @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        public androidx.media3.exoplayer.source.chunk.ChunkExtractor createProgressiveMediaExtractor(int i, androidx.media3.common.Format format, boolean z, java.util.List<androidx.media3.common.Format> list, androidx.media3.extractor.TrackOutput trackOutput, androidx.media3.exoplayer.analytics.PlayerId playerId) {
            androidx.media3.extractor.Extractor fragmentedMp4Extractor;
            java.lang.String str = format.containerMimeType;
            if (androidx.media3.common.MimeTypes.isText(str)) {
                if (!this.parseSubtitlesDuringExtraction) {
                    return null;
                }
                fragmentedMp4Extractor = new androidx.media3.extractor.text.SubtitleExtractor(this.subtitleParserFactory.create(format), format);
            } else {
                if (androidx.media3.common.MimeTypes.isMatroska(str)) {
                    fragmentedMp4Extractor = new androidx.media3.extractor.mkv.MatroskaExtractor(this.subtitleParserFactory, this.parseSubtitlesDuringExtraction ? 1 : 3);
                } else if (java.util.Objects.equals(str, androidx.media3.common.MimeTypes.IMAGE_JPEG)) {
                    fragmentedMp4Extractor = new androidx.media3.extractor.jpeg.JpegExtractor(1);
                } else if (java.util.Objects.equals(str, androidx.media3.common.MimeTypes.IMAGE_PNG)) {
                    fragmentedMp4Extractor = new androidx.media3.extractor.png.PngExtractor();
                } else {
                    int i2 = z ? 4 : 0;
                    if (!this.parseSubtitlesDuringExtraction) {
                        i2 |= 32;
                    }
                    fragmentedMp4Extractor = new androidx.media3.extractor.mp4.FragmentedMp4Extractor(this.subtitleParserFactory, i2, null, null, list, trackOutput);
                }
            }
            if (this.parseSubtitlesDuringExtraction && !androidx.media3.common.MimeTypes.isText(str) && !(fragmentedMp4Extractor.getUnderlyingImplementation() instanceof androidx.media3.extractor.mp4.FragmentedMp4Extractor) && !(fragmentedMp4Extractor.getUnderlyingImplementation() instanceof androidx.media3.extractor.mkv.MatroskaExtractor)) {
                fragmentedMp4Extractor = new androidx.media3.extractor.text.SubtitleTranscodingExtractor(fragmentedMp4Extractor, this.subtitleParserFactory);
            }
            return new androidx.media3.exoplayer.source.chunk.BundledChunkExtractor(fragmentedMp4Extractor, i, format);
        }
    }

    public BundledChunkExtractor(androidx.media3.extractor.Extractor extractor, int i, androidx.media3.common.Format format) {
        this.extractor = extractor;
        this.primaryTrackType = i;
        this.primaryTrackManifestFormat = format;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public androidx.media3.extractor.ChunkIndex getChunkIndex() {
        androidx.media3.extractor.SeekMap seekMap = this.seekMap;
        if (seekMap instanceof androidx.media3.extractor.ChunkIndex) {
            return (androidx.media3.extractor.ChunkIndex) seekMap;
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public androidx.media3.common.Format[] getSampleFormats() {
        return this.sampleFormats;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public void init(androidx.media3.exoplayer.source.chunk.ChunkExtractor.TrackOutputProvider trackOutputProvider, long j, long j2) {
        this.trackOutputProvider = trackOutputProvider;
        this.endTimeUs = j2;
        if (!this.extractorInitialized) {
            this.extractor.init(this);
            if (j != androidx.media3.common.C.TIME_UNSET) {
                this.extractor.seek(0L, j);
            }
            this.extractorInitialized = true;
            return;
        }
        androidx.media3.extractor.Extractor extractor = this.extractor;
        if (j == androidx.media3.common.C.TIME_UNSET) {
            j = 0;
        }
        extractor.seek(0L, j);
        for (int i = 0; i < this.bindingTrackOutputs.size(); i++) {
            this.bindingTrackOutputs.valueAt(i).bind(trackOutputProvider, j2);
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public void release() {
        this.extractor.release();
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public boolean read(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        int i = this.extractor.read(extractorInput, POSITION_HOLDER);
        androidx.media3.common.util.Assertions.checkState(i != 1);
        return i == 0;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public androidx.media3.extractor.TrackOutput track(int i, int i2) {
        androidx.media3.exoplayer.source.chunk.BundledChunkExtractor.BindingTrackOutput bindingTrackOutput = this.bindingTrackOutputs.get(i);
        if (bindingTrackOutput == null) {
            androidx.media3.common.util.Assertions.checkState(this.sampleFormats == null);
            bindingTrackOutput = new androidx.media3.exoplayer.source.chunk.BundledChunkExtractor.BindingTrackOutput(i, i2, i2 == this.primaryTrackType ? this.primaryTrackManifestFormat : null);
            bindingTrackOutput.bind(this.trackOutputProvider, this.endTimeUs);
            this.bindingTrackOutputs.put(i, bindingTrackOutput);
        }
        return bindingTrackOutput;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
        androidx.media3.common.Format[] formatArr = new androidx.media3.common.Format[this.bindingTrackOutputs.size()];
        for (int i = 0; i < this.bindingTrackOutputs.size(); i++) {
            formatArr[i] = (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkStateNotNull(this.bindingTrackOutputs.valueAt(i).sampleFormat);
        }
        this.sampleFormats = formatArr;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(androidx.media3.extractor.SeekMap seekMap) {
        this.seekMap = seekMap;
    }

    private static final class BindingTrackOutput implements androidx.media3.extractor.TrackOutput {
        private long endTimeUs;
        private final androidx.media3.extractor.DiscardingTrackOutput fakeTrackOutput = new androidx.media3.extractor.DiscardingTrackOutput();
        private final int id;
        private final androidx.media3.common.Format manifestFormat;
        public androidx.media3.common.Format sampleFormat;
        private androidx.media3.extractor.TrackOutput trackOutput;
        private final int type;

        public BindingTrackOutput(int i, int i2, androidx.media3.common.Format format) {
            this.id = i;
            this.type = i2;
            this.manifestFormat = format;
        }

        public void bind(androidx.media3.exoplayer.source.chunk.ChunkExtractor.TrackOutputProvider trackOutputProvider, long j) {
            if (trackOutputProvider == null) {
                this.trackOutput = this.fakeTrackOutput;
                return;
            }
            this.endTimeUs = j;
            androidx.media3.extractor.TrackOutput trackOutputTrack = trackOutputProvider.track(this.id, this.type);
            this.trackOutput = trackOutputTrack;
            androidx.media3.common.Format format = this.sampleFormat;
            if (format != null) {
                trackOutputTrack.format(format);
            }
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void format(androidx.media3.common.Format format) {
            androidx.media3.common.Format format2 = this.manifestFormat;
            if (format2 != null) {
                format = format.withManifestFormatInfo(format2);
            }
            this.sampleFormat = format;
            ((androidx.media3.extractor.TrackOutput) androidx.media3.common.util.Util.castNonNull(this.trackOutput)).format(this.sampleFormat);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public int sampleData(androidx.media3.common.DataReader dataReader, int i, boolean z, int i2) throws java.io.IOException {
            return ((androidx.media3.extractor.TrackOutput) androidx.media3.common.util.Util.castNonNull(this.trackOutput)).sampleData(dataReader, i, z);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void sampleData(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i, int i2) {
            ((androidx.media3.extractor.TrackOutput) androidx.media3.common.util.Util.castNonNull(this.trackOutput)).sampleData(parsableByteArray, i);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public void sampleMetadata(long j, int i, int i2, int i3, androidx.media3.extractor.TrackOutput.CryptoData cryptoData) {
            long j2 = this.endTimeUs;
            if (j2 != androidx.media3.common.C.TIME_UNSET && j >= j2) {
                this.trackOutput = this.fakeTrackOutput;
            }
            ((androidx.media3.extractor.TrackOutput) androidx.media3.common.util.Util.castNonNull(this.trackOutput)).sampleMetadata(j, i, i2, i3, cryptoData);
        }
    }
}
