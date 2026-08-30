package androidx.media3.extractor.mp4;

/* JADX INFO: loaded from: classes.dex */
public final class AtomSizeTooSmallSniffFailure implements androidx.media3.extractor.SniffFailure {
    public final long atomSize;
    public final int atomType;
    public final int minimumHeaderSize;

    public AtomSizeTooSmallSniffFailure(int i, long j, int i2) {
        this.atomType = i;
        this.atomSize = j;
        this.minimumHeaderSize = i2;
    }
}
