package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public interface SeekMap {
    long getDurationUs();

    androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j);

    boolean isSeekable();

    public static class Unseekable implements androidx.media3.extractor.SeekMap {
        private final long durationUs;
        private final androidx.media3.extractor.SeekMap.SeekPoints startSeekPoints;

        @Override // androidx.media3.extractor.SeekMap
        public boolean isSeekable() {
            return false;
        }

        public Unseekable(long j) {
            this(j, 0L);
        }

        public Unseekable(long j, long j2) {
            this.durationUs = j;
            this.startSeekPoints = new androidx.media3.extractor.SeekMap.SeekPoints(j2 == 0 ? androidx.media3.extractor.SeekPoint.START : new androidx.media3.extractor.SeekPoint(0L, j2));
        }

        @Override // androidx.media3.extractor.SeekMap
        public long getDurationUs() {
            return this.durationUs;
        }

        @Override // androidx.media3.extractor.SeekMap
        public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
            return this.startSeekPoints;
        }
    }

    public static final class SeekPoints {
        public final androidx.media3.extractor.SeekPoint first;
        public final androidx.media3.extractor.SeekPoint second;

        public SeekPoints(androidx.media3.extractor.SeekPoint seekPoint) {
            this(seekPoint, seekPoint);
        }

        public SeekPoints(androidx.media3.extractor.SeekPoint seekPoint, androidx.media3.extractor.SeekPoint seekPoint2) {
            this.first = (androidx.media3.extractor.SeekPoint) androidx.media3.common.util.Assertions.checkNotNull(seekPoint);
            this.second = (androidx.media3.extractor.SeekPoint) androidx.media3.common.util.Assertions.checkNotNull(seekPoint2);
        }

        public java.lang.String toString() {
            return com.ironsource.y8.i.d + this.first + (this.first.equals(this.second) ? "" : ", " + this.second) + com.ironsource.y8.i.e;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            androidx.media3.extractor.SeekMap.SeekPoints seekPoints = (androidx.media3.extractor.SeekMap.SeekPoints) obj;
            return this.first.equals(seekPoints.first) && this.second.equals(seekPoints.second);
        }

        public int hashCode() {
            return (this.first.hashCode() * 31) + this.second.hashCode();
        }
    }
}
