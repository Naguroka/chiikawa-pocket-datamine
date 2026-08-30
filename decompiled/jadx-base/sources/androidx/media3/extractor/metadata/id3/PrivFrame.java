package androidx.media3.extractor.metadata.id3;

/* JADX INFO: loaded from: classes.dex */
public final class PrivFrame extends androidx.media3.extractor.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.id3.PrivFrame> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.id3.PrivFrame>() { // from class: androidx.media3.extractor.metadata.id3.PrivFrame.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.id3.PrivFrame createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.id3.PrivFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.id3.PrivFrame[] newArray(int i) {
            return new androidx.media3.extractor.metadata.id3.PrivFrame[i];
        }
    };
    public static final java.lang.String ID = "PRIV";
    public final java.lang.String owner;
    public final byte[] privateData;

    public PrivFrame(java.lang.String str, byte[] bArr) {
        super(ID);
        this.owner = str;
        this.privateData = bArr;
    }

    PrivFrame(android.os.Parcel parcel) {
        super(ID);
        this.owner = (java.lang.String) androidx.media3.common.util.Util.castNonNull(parcel.readString());
        this.privateData = (byte[]) androidx.media3.common.util.Util.castNonNull(parcel.createByteArray());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.extractor.metadata.id3.PrivFrame privFrame = (androidx.media3.extractor.metadata.id3.PrivFrame) obj;
        return androidx.media3.common.util.Util.areEqual(this.owner, privFrame.owner) && java.util.Arrays.equals(this.privateData, privFrame.privateData);
    }

    public int hashCode() {
        java.lang.String str = this.owner;
        return ((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31) + java.util.Arrays.hashCode(this.privateData);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public java.lang.String toString() {
        return this.id + ": owner=" + this.owner;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.owner);
        parcel.writeByteArray(this.privateData);
    }
}
