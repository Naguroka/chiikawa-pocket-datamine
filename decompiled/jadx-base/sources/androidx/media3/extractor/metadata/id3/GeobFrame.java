package androidx.media3.extractor.metadata.id3;

/* JADX INFO: loaded from: classes.dex */
public final class GeobFrame extends androidx.media3.extractor.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.id3.GeobFrame> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.id3.GeobFrame>() { // from class: androidx.media3.extractor.metadata.id3.GeobFrame.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.id3.GeobFrame createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.id3.GeobFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.id3.GeobFrame[] newArray(int i) {
            return new androidx.media3.extractor.metadata.id3.GeobFrame[i];
        }
    };
    public static final java.lang.String ID = "GEOB";
    public final byte[] data;
    public final java.lang.String description;
    public final java.lang.String filename;
    public final java.lang.String mimeType;

    public GeobFrame(java.lang.String str, java.lang.String str2, java.lang.String str3, byte[] bArr) {
        super(ID);
        this.mimeType = str;
        this.filename = str2;
        this.description = str3;
        this.data = bArr;
    }

    GeobFrame(android.os.Parcel parcel) {
        super(ID);
        this.mimeType = (java.lang.String) androidx.media3.common.util.Util.castNonNull(parcel.readString());
        this.filename = (java.lang.String) androidx.media3.common.util.Util.castNonNull(parcel.readString());
        this.description = (java.lang.String) androidx.media3.common.util.Util.castNonNull(parcel.readString());
        this.data = (byte[]) androidx.media3.common.util.Util.castNonNull(parcel.createByteArray());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.extractor.metadata.id3.GeobFrame geobFrame = (androidx.media3.extractor.metadata.id3.GeobFrame) obj;
        return androidx.media3.common.util.Util.areEqual(this.mimeType, geobFrame.mimeType) && androidx.media3.common.util.Util.areEqual(this.filename, geobFrame.filename) && androidx.media3.common.util.Util.areEqual(this.description, geobFrame.description) && java.util.Arrays.equals(this.data, geobFrame.data);
    }

    public int hashCode() {
        java.lang.String str = this.mimeType;
        int iHashCode = (com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.filename;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.description;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + java.util.Arrays.hashCode(this.data);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public java.lang.String toString() {
        return this.id + ": mimeType=" + this.mimeType + ", filename=" + this.filename + ", description=" + this.description;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.mimeType);
        parcel.writeString(this.filename);
        parcel.writeString(this.description);
        parcel.writeByteArray(this.data);
    }
}
