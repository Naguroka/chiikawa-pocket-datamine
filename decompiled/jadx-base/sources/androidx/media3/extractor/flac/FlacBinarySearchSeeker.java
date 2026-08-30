package androidx.media3.extractor.flac;

/* JADX INFO: loaded from: classes.dex */
final class FlacBinarySearchSeeker extends androidx.media3.extractor.BinarySearchSeeker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlacBinarySearchSeeker(final androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata, int i, long j, long j2) {
        super(new androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter() { // from class: androidx.media3.extractor.flac.FlacBinarySearchSeeker$$ExternalSyntheticLambda0
            @Override // androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter
            public final long timeUsToTargetTime(long j3) {
                return flacStreamMetadata.getSampleNumber(j3);
            }
        }, new androidx.media3.extractor.flac.FlacBinarySearchSeeker.FlacTimestampSeeker(flacStreamMetadata, i), flacStreamMetadata.getDurationUs(), 0L, flacStreamMetadata.totalSamples, j, j2, flacStreamMetadata.getApproxBytesPerFrame(), java.lang.Math.max(6, flacStreamMetadata.minFrameSize));
        java.util.Objects.requireNonNull(flacStreamMetadata);
    }

    private static final class FlacTimestampSeeker implements androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker {
        private final androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata;
        private final int frameStartMarker;
        private final androidx.media3.extractor.FlacFrameReader.SampleNumberHolder sampleNumberHolder;

        private FlacTimestampSeeker(androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata, int i) {
            this.flacStreamMetadata = flacStreamMetadata;
            this.frameStartMarker = i;
            this.sampleNumberHolder = new androidx.media3.extractor.FlacFrameReader.SampleNumberHolder();
        }

        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult searchForTimestamp(androidx.media3.extractor.ExtractorInput extractorInput, long j) throws java.io.IOException {
            long position = extractorInput.getPosition();
            long jFindNextFrame = findNextFrame(extractorInput);
            long peekPosition = extractorInput.getPeekPosition();
            extractorInput.advancePeekPosition(java.lang.Math.max(6, this.flacStreamMetadata.minFrameSize));
            long jFindNextFrame2 = findNextFrame(extractorInput);
            long peekPosition2 = extractorInput.getPeekPosition();
            if (jFindNextFrame <= j && jFindNextFrame2 > j) {
                return androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult.targetFoundResult(peekPosition);
            }
            if (jFindNextFrame2 <= j) {
                return androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult.underestimatedResult(jFindNextFrame2, peekPosition2);
            }
            return androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult.overestimatedResult(jFindNextFrame, position);
        }

        private long findNextFrame(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
            while (extractorInput.getPeekPosition() < extractorInput.getLength() - 6 && !androidx.media3.extractor.FlacFrameReader.checkFrameHeaderFromPeek(extractorInput, this.flacStreamMetadata, this.frameStartMarker, this.sampleNumberHolder)) {
                extractorInput.advancePeekPosition(1);
            }
            if (extractorInput.getPeekPosition() >= extractorInput.getLength() - 6) {
                extractorInput.advancePeekPosition((int) (extractorInput.getLength() - extractorInput.getPeekPosition()));
                return this.flacStreamMetadata.totalSamples;
            }
            return this.sampleNumberHolder.sampleNumber;
        }
    }
}
