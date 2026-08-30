package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class SeekPoint {
    public static final androidx.media3.extractor.SeekPoint START = new androidx.media3.extractor.SeekPoint(0, 0);
    public final long position;
    public final long timeUs;

    public SeekPoint(long j, long j2) {
        this.timeUs = j;
        this.position = j2;
    }

    public java.lang.String toString() {
        return "[timeUs=" + this.timeUs + ", position=" + this.position + com.ironsource.y8.i.e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.extractor.SeekPoint seekPoint = (androidx.media3.extractor.SeekPoint) obj;
        return this.timeUs == seekPoint.timeUs && this.position == seekPoint.position;
    }

    public int hashCode() {
        return (((int) this.timeUs) * 31) + ((int) this.position);
    }
}
