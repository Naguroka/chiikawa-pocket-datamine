package androidx.media3.extractor.jpeg;

/* JADX INFO: loaded from: classes.dex */
final class StartOffsetExtractorInput extends androidx.media3.extractor.ForwardingExtractorInput {
    private final long startOffset;

    public StartOffsetExtractorInput(androidx.media3.extractor.ExtractorInput extractorInput, long j) {
        super(extractorInput);
        androidx.media3.common.util.Assertions.checkArgument(extractorInput.getPosition() >= j);
        this.startOffset = j;
    }

    @Override // androidx.media3.extractor.ForwardingExtractorInput, androidx.media3.extractor.ExtractorInput
    public long getPosition() {
        return super.getPosition() - this.startOffset;
    }

    @Override // androidx.media3.extractor.ForwardingExtractorInput, androidx.media3.extractor.ExtractorInput
    public long getPeekPosition() {
        return super.getPeekPosition() - this.startOffset;
    }

    @Override // androidx.media3.extractor.ForwardingExtractorInput, androidx.media3.extractor.ExtractorInput
    public long getLength() {
        return super.getLength() - this.startOffset;
    }

    @Override // androidx.media3.extractor.ForwardingExtractorInput, androidx.media3.extractor.ExtractorInput
    public <E extends java.lang.Throwable> void setRetryPosition(long j, E e) throws java.lang.Throwable {
        super.setRetryPosition(j + this.startOffset, e);
    }
}
