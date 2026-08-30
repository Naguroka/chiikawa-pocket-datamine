package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class BundledExtractorsAdapter implements androidx.media3.exoplayer.source.ProgressiveMediaExtractor {
    private androidx.media3.extractor.Extractor extractor;
    private androidx.media3.extractor.ExtractorInput extractorInput;
    private final androidx.media3.extractor.ExtractorsFactory extractorsFactory;

    public BundledExtractorsAdapter(androidx.media3.extractor.ExtractorsFactory extractorsFactory) {
        this.extractorsFactory = extractorsFactory;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void init(androidx.media3.common.DataReader dataReader, android.net.Uri uri, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, long j, long j2, androidx.media3.extractor.ExtractorOutput extractorOutput) throws java.io.IOException {
        androidx.media3.extractor.DefaultExtractorInput defaultExtractorInput = new androidx.media3.extractor.DefaultExtractorInput(dataReader, j, j2);
        this.extractorInput = defaultExtractorInput;
        if (this.extractor != null) {
            return;
        }
        androidx.media3.extractor.Extractor[] extractorArrCreateExtractors = this.extractorsFactory.createExtractors(uri, map);
        com.google.common.collect.ImmutableList.Builder builderBuilderWithExpectedSize = com.google.common.collect.ImmutableList.builderWithExpectedSize(extractorArrCreateExtractors.length);
        if (extractorArrCreateExtractors.length == 1) {
            this.extractor = extractorArrCreateExtractors[0];
        } else {
            int length = extractorArrCreateExtractors.length;
            for (int i = 0; i < length; i++) {
                androidx.media3.extractor.Extractor extractor = extractorArrCreateExtractors[i];
                try {
                    if (extractor.sniff(defaultExtractorInput)) {
                        this.extractor = extractor;
                        androidx.media3.common.util.Assertions.checkState(extractor != null || defaultExtractorInput.getPosition() == j);
                        defaultExtractorInput.resetPeekPosition();
                        break;
                    } else {
                        builderBuilderWithExpectedSize.addAll((java.lang.Iterable) extractor.getSniffFailureDetails());
                        boolean z = this.extractor != null || defaultExtractorInput.getPosition() == j;
                        androidx.media3.common.util.Assertions.checkState(z);
                        defaultExtractorInput.resetPeekPosition();
                    }
                } catch (java.io.EOFException unused) {
                    if (this.extractor != null || defaultExtractorInput.getPosition() == j) {
                    }
                } catch (java.lang.Throwable th) {
                    androidx.media3.common.util.Assertions.checkState(this.extractor != null || defaultExtractorInput.getPosition() == j);
                    defaultExtractorInput.resetPeekPosition();
                    throw th;
                }
                androidx.media3.common.util.Assertions.checkState(z);
                defaultExtractorInput.resetPeekPosition();
            }
            if (this.extractor == null) {
                throw new androidx.media3.exoplayer.source.UnrecognizedInputFormatException("None of the available extractors (" + com.google.common.base.Joiner.on(", ").join(com.google.common.collect.Lists.transform(com.google.common.collect.ImmutableList.copyOf(extractorArrCreateExtractors), new com.google.common.base.Function() { // from class: androidx.media3.exoplayer.source.BundledExtractorsAdapter$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return ((androidx.media3.extractor.Extractor) obj).getUnderlyingImplementation().getClass().getSimpleName();
                    }
                })) + ") could read the stream.", (android.net.Uri) androidx.media3.common.util.Assertions.checkNotNull(uri), builderBuilderWithExpectedSize.build());
            }
        }
        this.extractor.init(extractorOutput);
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void release() {
        androidx.media3.extractor.Extractor extractor = this.extractor;
        if (extractor != null) {
            extractor.release();
            this.extractor = null;
        }
        this.extractorInput = null;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void disableSeekingOnMp3Streams() {
        androidx.media3.extractor.Extractor extractor = this.extractor;
        if (extractor == null) {
            return;
        }
        androidx.media3.extractor.Extractor underlyingImplementation = extractor.getUnderlyingImplementation();
        if (underlyingImplementation instanceof androidx.media3.extractor.mp3.Mp3Extractor) {
            ((androidx.media3.extractor.mp3.Mp3Extractor) underlyingImplementation).disableSeeking();
        }
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public long getCurrentInputPosition() {
        androidx.media3.extractor.ExtractorInput extractorInput = this.extractorInput;
        if (extractorInput != null) {
            return extractorInput.getPosition();
        }
        return -1L;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public void seek(long j, long j2) {
        ((androidx.media3.extractor.Extractor) androidx.media3.common.util.Assertions.checkNotNull(this.extractor)).seek(j, j2);
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public int read(androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        return ((androidx.media3.extractor.Extractor) androidx.media3.common.util.Assertions.checkNotNull(this.extractor)).read((androidx.media3.extractor.ExtractorInput) androidx.media3.common.util.Assertions.checkNotNull(this.extractorInput), positionHolder);
    }
}
