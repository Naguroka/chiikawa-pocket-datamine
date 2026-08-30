package androidx.media3.container;

/* JADX INFO: loaded from: classes.dex */
public final class Mp4TimestampData implements androidx.media3.common.Metadata.Entry {
    public static final android.os.Parcelable.Creator<androidx.media3.container.Mp4TimestampData> CREATOR = new android.os.Parcelable.Creator<androidx.media3.container.Mp4TimestampData>() { // from class: androidx.media3.container.Mp4TimestampData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.container.Mp4TimestampData createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.container.Mp4TimestampData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.container.Mp4TimestampData[] newArray(int i) {
            return new androidx.media3.container.Mp4TimestampData[i];
        }
    };
    public static final int TIMESCALE_UNSET = -1;
    private static final int UNIX_EPOCH_TO_MP4_TIME_DELTA_SECONDS = 2082844800;
    public final long creationTimestampSeconds;
    public final long modificationTimestampSeconds;
    public final long timescale;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Mp4TimestampData(long j, long j2) {
        this.creationTimestampSeconds = j;
        this.modificationTimestampSeconds = j2;
        this.timescale = -1L;
    }

    public Mp4TimestampData(long j, long j2, long j3) {
        this.creationTimestampSeconds = j;
        this.modificationTimestampSeconds = j2;
        this.timescale = j3;
    }

    private Mp4TimestampData(android.os.Parcel parcel) {
        this.creationTimestampSeconds = parcel.readLong();
        this.modificationTimestampSeconds = parcel.readLong();
        this.timescale = parcel.readLong();
    }

    public static long unixTimeToMp4TimeSeconds(long j) {
        return (j / 1000) + 2082844800;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.container.Mp4TimestampData)) {
            return false;
        }
        androidx.media3.container.Mp4TimestampData mp4TimestampData = (androidx.media3.container.Mp4TimestampData) obj;
        return this.creationTimestampSeconds == mp4TimestampData.creationTimestampSeconds && this.modificationTimestampSeconds == mp4TimestampData.modificationTimestampSeconds && this.timescale == mp4TimestampData.timescale;
    }

    public int hashCode() {
        return ((((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + com.google.common.primitives.Longs.hashCode(this.creationTimestampSeconds)) * 31) + com.google.common.primitives.Longs.hashCode(this.modificationTimestampSeconds)) * 31) + com.google.common.primitives.Longs.hashCode(this.timescale);
    }

    public java.lang.String toString() {
        return "Mp4Timestamp: creation time=" + this.creationTimestampSeconds + ", modification time=" + this.modificationTimestampSeconds + ", timescale=" + this.timescale;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.creationTimestampSeconds);
        parcel.writeLong(this.modificationTimestampSeconds);
        parcel.writeLong(this.timescale);
    }
}
