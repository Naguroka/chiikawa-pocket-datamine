package androidx.media3.container;

/* JADX INFO: loaded from: classes.dex */
public final class Mp4LocationData implements androidx.media3.common.Metadata.Entry {
    public static final android.os.Parcelable.Creator<androidx.media3.container.Mp4LocationData> CREATOR = new android.os.Parcelable.Creator<androidx.media3.container.Mp4LocationData>() { // from class: androidx.media3.container.Mp4LocationData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.container.Mp4LocationData createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.container.Mp4LocationData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.container.Mp4LocationData[] newArray(int i) {
            return new androidx.media3.container.Mp4LocationData[i];
        }
    };
    public final float latitude;
    public final float longitude;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Mp4LocationData(float f, float f2) {
        androidx.media3.common.util.Assertions.checkArgument(f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f, "Invalid latitude or longitude");
        this.latitude = f;
        this.longitude = f2;
    }

    private Mp4LocationData(android.os.Parcel parcel) {
        this.latitude = parcel.readFloat();
        this.longitude = parcel.readFloat();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.container.Mp4LocationData mp4LocationData = (androidx.media3.container.Mp4LocationData) obj;
        return this.latitude == mp4LocationData.latitude && this.longitude == mp4LocationData.longitude;
    }

    public int hashCode() {
        return ((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + com.google.common.primitives.Floats.hashCode(this.latitude)) * 31) + com.google.common.primitives.Floats.hashCode(this.longitude);
    }

    public java.lang.String toString() {
        return "xyz: latitude=" + this.latitude + ", longitude=" + this.longitude;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeFloat(this.latitude);
        parcel.writeFloat(this.longitude);
    }
}
