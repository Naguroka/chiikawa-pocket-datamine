package androidx.media3.extractor.metadata.mp4;

/* JADX INFO: loaded from: classes.dex */
public final class SlowMotionData implements androidx.media3.common.Metadata.Entry {
    public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.mp4.SlowMotionData> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.mp4.SlowMotionData>() { // from class: androidx.media3.extractor.metadata.mp4.SlowMotionData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.mp4.SlowMotionData createFromParcel(android.os.Parcel parcel) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            parcel.readList(arrayList, androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment.class.getClassLoader());
            return new androidx.media3.extractor.metadata.mp4.SlowMotionData(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.mp4.SlowMotionData[] newArray(int i) {
            return new androidx.media3.extractor.metadata.mp4.SlowMotionData[i];
        }
    };
    public final java.util.List<androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment> segments;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static final class Segment implements android.os.Parcelable {
        public static final java.util.Comparator<androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment> BY_START_THEN_END_THEN_DIVISOR = new java.util.Comparator() { // from class: androidx.media3.extractor.metadata.mp4.SlowMotionData$Segment$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment segment = (androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment) obj;
                androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment segment2 = (androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment) obj2;
                return com.google.common.collect.ComparisonChain.start().compare(segment.startTimeMs, segment2.startTimeMs).compare(segment.endTimeMs, segment2.endTimeMs).compare(segment.speedDivisor, segment2.speedDivisor).result();
            }
        };
        public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment>() { // from class: androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment createFromParcel(android.os.Parcel parcel) {
                return new androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment[] newArray(int i) {
                return new androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment[i];
            }
        };
        public final long endTimeMs;
        public final int speedDivisor;
        public final long startTimeMs;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Segment(long j, long j2, int i) {
            androidx.media3.common.util.Assertions.checkArgument(j < j2);
            this.startTimeMs = j;
            this.endTimeMs = j2;
            this.speedDivisor = i;
        }

        public java.lang.String toString() {
            return androidx.media3.common.util.Util.formatInvariant("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", java.lang.Long.valueOf(this.startTimeMs), java.lang.Long.valueOf(this.endTimeMs), java.lang.Integer.valueOf(this.speedDivisor));
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment segment = (androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment) obj;
            return this.startTimeMs == segment.startTimeMs && this.endTimeMs == segment.endTimeMs && this.speedDivisor == segment.speedDivisor;
        }

        public int hashCode() {
            return com.google.common.base.Objects.hashCode(java.lang.Long.valueOf(this.startTimeMs), java.lang.Long.valueOf(this.endTimeMs), java.lang.Integer.valueOf(this.speedDivisor));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeLong(this.startTimeMs);
            parcel.writeLong(this.endTimeMs);
            parcel.writeInt(this.speedDivisor);
        }
    }

    public SlowMotionData(java.util.List<androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment> list) {
        this.segments = list;
        androidx.media3.common.util.Assertions.checkArgument(!doSegmentsOverlap(list));
    }

    public java.lang.String toString() {
        return "SlowMotion: segments=" + this.segments;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.segments.equals(((androidx.media3.extractor.metadata.mp4.SlowMotionData) obj).segments);
    }

    public int hashCode() {
        return this.segments.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeList(this.segments);
    }

    private static boolean doSegmentsOverlap(java.util.List<androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = list.get(0).endTimeMs;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).startTimeMs < j) {
                return true;
            }
            j = list.get(i).endTimeMs;
        }
        return false;
    }
}
