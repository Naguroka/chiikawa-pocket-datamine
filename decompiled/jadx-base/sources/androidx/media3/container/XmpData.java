package androidx.media3.container;

/* JADX INFO: loaded from: classes.dex */
public final class XmpData implements androidx.media3.common.Metadata.Entry {
    public static final android.os.Parcelable.Creator<androidx.media3.container.XmpData> CREATOR = new android.os.Parcelable.Creator<androidx.media3.container.XmpData>() { // from class: androidx.media3.container.XmpData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.container.XmpData createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.container.XmpData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.container.XmpData[] newArray(int i) {
            return new androidx.media3.container.XmpData[i];
        }
    };
    public final byte[] data;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public XmpData(byte[] bArr) {
        this.data = bArr;
    }

    private XmpData(android.os.Parcel parcel) {
        this.data = (byte[]) androidx.media3.common.util.Util.castNonNull(parcel.createByteArray());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return java.util.Arrays.equals(this.data, ((androidx.media3.container.XmpData) obj).data);
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.data);
    }

    public java.lang.String toString() {
        return "XMP: " + androidx.media3.common.util.Util.toHexString(this.data);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeByteArray(this.data);
    }
}
