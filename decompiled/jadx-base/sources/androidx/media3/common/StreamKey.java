package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class StreamKey implements java.lang.Comparable<androidx.media3.common.StreamKey>, android.os.Parcelable {
    public final int groupIndex;
    public final int periodIndex;
    public final int streamIndex;
    public static final android.os.Parcelable.Creator<androidx.media3.common.StreamKey> CREATOR = new android.os.Parcelable.Creator<androidx.media3.common.StreamKey>() { // from class: androidx.media3.common.StreamKey.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.common.StreamKey createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.common.StreamKey(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.common.StreamKey[] newArray(int i) {
            return new androidx.media3.common.StreamKey[i];
        }
    };
    private static final java.lang.String FIELD_PERIOD_INDEX = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_GROUP_INDEX = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_STREAM_INDEX = androidx.media3.common.util.Util.intToStringMaxRadix(2);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public StreamKey(int i, int i2) {
        this(0, i, i2);
    }

    public StreamKey(int i, int i2, int i3) {
        this.periodIndex = i;
        this.groupIndex = i2;
        this.streamIndex = i3;
    }

    StreamKey(android.os.Parcel parcel) {
        this.periodIndex = parcel.readInt();
        this.groupIndex = parcel.readInt();
        this.streamIndex = parcel.readInt();
    }

    public java.lang.String toString() {
        return this.periodIndex + "." + this.groupIndex + "." + this.streamIndex;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.common.StreamKey streamKey = (androidx.media3.common.StreamKey) obj;
        return this.periodIndex == streamKey.periodIndex && this.groupIndex == streamKey.groupIndex && this.streamIndex == streamKey.streamIndex;
    }

    public int hashCode() {
        return (((this.periodIndex * 31) + this.groupIndex) * 31) + this.streamIndex;
    }

    @Override // java.lang.Comparable
    public int compareTo(androidx.media3.common.StreamKey streamKey) {
        int i = this.periodIndex - streamKey.periodIndex;
        if (i != 0) {
            return i;
        }
        int i2 = this.groupIndex - streamKey.groupIndex;
        return i2 == 0 ? this.streamIndex - streamKey.streamIndex : i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.periodIndex);
        parcel.writeInt(this.groupIndex);
        parcel.writeInt(this.streamIndex);
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        int i = this.periodIndex;
        if (i != 0) {
            bundle.putInt(FIELD_PERIOD_INDEX, i);
        }
        int i2 = this.groupIndex;
        if (i2 != 0) {
            bundle.putInt(FIELD_GROUP_INDEX, i2);
        }
        int i3 = this.streamIndex;
        if (i3 != 0) {
            bundle.putInt(FIELD_STREAM_INDEX, i3);
        }
        return bundle;
    }

    public static androidx.media3.common.StreamKey fromBundle(android.os.Bundle bundle) {
        return new androidx.media3.common.StreamKey(bundle.getInt(FIELD_PERIOD_INDEX, 0), bundle.getInt(FIELD_GROUP_INDEX, 0), bundle.getInt(FIELD_STREAM_INDEX, 0));
    }
}
