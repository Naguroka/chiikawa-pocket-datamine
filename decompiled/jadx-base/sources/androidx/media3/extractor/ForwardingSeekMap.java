package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public class ForwardingSeekMap implements androidx.media3.extractor.SeekMap {
    private final androidx.media3.extractor.SeekMap seekMap;

    public ForwardingSeekMap(androidx.media3.extractor.SeekMap seekMap) {
        this.seekMap = seekMap;
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.seekMap.isSeekable();
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.seekMap.getDurationUs();
    }

    @Override // androidx.media3.extractor.SeekMap
    public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
        return this.seekMap.getSeekPoints(j);
    }
}
