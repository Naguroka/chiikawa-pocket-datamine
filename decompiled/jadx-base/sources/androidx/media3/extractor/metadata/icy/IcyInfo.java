package androidx.media3.extractor.metadata.icy;

/* JADX INFO: loaded from: classes.dex */
public final class IcyInfo implements androidx.media3.common.Metadata.Entry {
    public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.icy.IcyInfo> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.icy.IcyInfo>() { // from class: androidx.media3.extractor.metadata.icy.IcyInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.icy.IcyInfo createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.icy.IcyInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.icy.IcyInfo[] newArray(int i) {
            return new androidx.media3.extractor.metadata.icy.IcyInfo[i];
        }
    };
    public final byte[] rawMetadata;
    public final java.lang.String title;
    public final java.lang.String url;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public IcyInfo(byte[] bArr, java.lang.String str, java.lang.String str2) {
        this.rawMetadata = bArr;
        this.title = str;
        this.url = str2;
    }

    IcyInfo(android.os.Parcel parcel) {
        this.rawMetadata = (byte[]) androidx.media3.common.util.Assertions.checkNotNull(parcel.createByteArray());
        this.title = parcel.readString();
        this.url = parcel.readString();
    }

    @Override // androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(androidx.media3.common.MediaMetadata.Builder builder) {
        java.lang.String str = this.title;
        if (str != null) {
            builder.setTitle(str);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return java.util.Arrays.equals(this.rawMetadata, ((androidx.media3.extractor.metadata.icy.IcyInfo) obj).rawMetadata);
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.rawMetadata);
    }

    public java.lang.String toString() {
        return java.lang.String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.title, this.url, java.lang.Integer.valueOf(this.rawMetadata.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeByteArray(this.rawMetadata);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
    }
}
