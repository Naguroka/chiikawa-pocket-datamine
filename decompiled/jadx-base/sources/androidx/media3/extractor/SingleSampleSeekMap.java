package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class SingleSampleSeekMap implements androidx.media3.extractor.SeekMap {
    private final long durationUs;
    private final long startPosition;

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    public SingleSampleSeekMap(long j) {
        this(j, 0L);
    }

    public SingleSampleSeekMap(long j, long j2) {
        this.durationUs = j;
        this.startPosition = j2;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
        return new androidx.media3.extractor.SeekMap.SeekPoints(new androidx.media3.extractor.SeekPoint(j, this.startPosition));
    }
}
