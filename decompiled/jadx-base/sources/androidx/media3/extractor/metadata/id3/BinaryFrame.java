package androidx.media3.extractor.metadata.id3;

/* JADX INFO: loaded from: classes.dex */
public final class BinaryFrame extends androidx.media3.extractor.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.id3.BinaryFrame> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.id3.BinaryFrame>() { // from class: androidx.media3.extractor.metadata.id3.BinaryFrame.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.id3.BinaryFrame createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.id3.BinaryFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.id3.BinaryFrame[] newArray(int i) {
            return new androidx.media3.extractor.metadata.id3.BinaryFrame[i];
        }
    };
    public final byte[] data;

    public BinaryFrame(java.lang.String str, byte[] bArr) {
        super(str);
        this.data = bArr;
    }

    BinaryFrame(android.os.Parcel parcel) {
        super((java.lang.String) androidx.media3.common.util.Util.castNonNull(parcel.readString()));
        this.data = (byte[]) androidx.media3.common.util.Util.castNonNull(parcel.createByteArray());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.extractor.metadata.id3.BinaryFrame binaryFrame = (androidx.media3.extractor.metadata.id3.BinaryFrame) obj;
        return this.id.equals(binaryFrame.id) && java.util.Arrays.equals(this.data, binaryFrame.data);
    }

    public int hashCode() {
        return ((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.id.hashCode()) * 31) + java.util.Arrays.hashCode(this.data);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeByteArray(this.data);
    }
}
