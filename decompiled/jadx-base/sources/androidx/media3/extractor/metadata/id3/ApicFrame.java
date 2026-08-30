package androidx.media3.extractor.metadata.id3;

/* JADX INFO: loaded from: classes.dex */
public final class ApicFrame extends androidx.media3.extractor.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.id3.ApicFrame> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.id3.ApicFrame>() { // from class: androidx.media3.extractor.metadata.id3.ApicFrame.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.id3.ApicFrame createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.id3.ApicFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.id3.ApicFrame[] newArray(int i) {
            return new androidx.media3.extractor.metadata.id3.ApicFrame[i];
        }
    };
    public static final java.lang.String ID = "APIC";
    public final java.lang.String description;
    public final java.lang.String mimeType;
    public final byte[] pictureData;
    public final int pictureType;

    public ApicFrame(java.lang.String str, java.lang.String str2, int i, byte[] bArr) {
        super(ID);
        this.mimeType = str;
        this.description = str2;
        this.pictureType = i;
        this.pictureData = bArr;
    }

    ApicFrame(android.os.Parcel parcel) {
        super(ID);
        this.mimeType = (java.lang.String) androidx.media3.common.util.Util.castNonNull(parcel.readString());
        this.description = parcel.readString();
        this.pictureType = parcel.readInt();
        this.pictureData = (byte[]) androidx.media3.common.util.Util.castNonNull(parcel.createByteArray());
    }

    @Override // androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(androidx.media3.common.MediaMetadata.Builder builder) {
        builder.maybeSetArtworkData(this.pictureData, this.pictureType);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.extractor.metadata.id3.ApicFrame apicFrame = (androidx.media3.extractor.metadata.id3.ApicFrame) obj;
        return this.pictureType == apicFrame.pictureType && androidx.media3.common.util.Util.areEqual(this.mimeType, apicFrame.mimeType) && androidx.media3.common.util.Util.areEqual(this.description, apicFrame.description) && java.util.Arrays.equals(this.pictureData, apicFrame.pictureData);
    }

    public int hashCode() {
        int i = (com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.pictureType) * 31;
        java.lang.String str = this.mimeType;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.description;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + java.util.Arrays.hashCode(this.pictureData);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public java.lang.String toString() {
        return this.id + ": mimeType=" + this.mimeType + ", description=" + this.description;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.mimeType);
        parcel.writeString(this.description);
        parcel.writeInt(this.pictureType);
        parcel.writeByteArray(this.pictureData);
    }
}
