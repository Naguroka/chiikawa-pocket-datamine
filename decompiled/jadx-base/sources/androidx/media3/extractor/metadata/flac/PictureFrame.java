package androidx.media3.extractor.metadata.flac;

/* JADX INFO: loaded from: classes.dex */
public final class PictureFrame implements androidx.media3.common.Metadata.Entry {
    public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.flac.PictureFrame> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.flac.PictureFrame>() { // from class: androidx.media3.extractor.metadata.flac.PictureFrame.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.flac.PictureFrame createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.flac.PictureFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.flac.PictureFrame[] newArray(int i) {
            return new androidx.media3.extractor.metadata.flac.PictureFrame[i];
        }
    };
    public final int colors;
    public final int depth;
    public final java.lang.String description;
    public final int height;
    public final java.lang.String mimeType;
    public final byte[] pictureData;
    public final int pictureType;
    public final int width;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PictureFrame(int i, java.lang.String str, java.lang.String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.pictureType = i;
        this.mimeType = str;
        this.description = str2;
        this.width = i2;
        this.height = i3;
        this.depth = i4;
        this.colors = i5;
        this.pictureData = bArr;
    }

    PictureFrame(android.os.Parcel parcel) {
        this.pictureType = parcel.readInt();
        this.mimeType = (java.lang.String) androidx.media3.common.util.Util.castNonNull(parcel.readString());
        this.description = (java.lang.String) androidx.media3.common.util.Util.castNonNull(parcel.readString());
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.depth = parcel.readInt();
        this.colors = parcel.readInt();
        this.pictureData = (byte[]) androidx.media3.common.util.Util.castNonNull(parcel.createByteArray());
    }

    @Override // androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(androidx.media3.common.MediaMetadata.Builder builder) {
        builder.maybeSetArtworkData(this.pictureData, this.pictureType);
    }

    public java.lang.String toString() {
        return "Picture: mimeType=" + this.mimeType + ", description=" + this.description;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.extractor.metadata.flac.PictureFrame pictureFrame = (androidx.media3.extractor.metadata.flac.PictureFrame) obj;
        return this.pictureType == pictureFrame.pictureType && this.mimeType.equals(pictureFrame.mimeType) && this.description.equals(pictureFrame.description) && this.width == pictureFrame.width && this.height == pictureFrame.height && this.depth == pictureFrame.depth && this.colors == pictureFrame.colors && java.util.Arrays.equals(this.pictureData, pictureFrame.pictureData);
    }

    public int hashCode() {
        return ((((((((((((((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.pictureType) * 31) + this.mimeType.hashCode()) * 31) + this.description.hashCode()) * 31) + this.width) * 31) + this.height) * 31) + this.depth) * 31) + this.colors) * 31) + java.util.Arrays.hashCode(this.pictureData);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.pictureType);
        parcel.writeString(this.mimeType);
        parcel.writeString(this.description);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.depth);
        parcel.writeInt(this.colors);
        parcel.writeByteArray(this.pictureData);
    }

    public static androidx.media3.extractor.metadata.flac.PictureFrame fromPictureBlock(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int i = parsableByteArray.readInt();
        java.lang.String strNormalizeMimeType = androidx.media3.common.MimeTypes.normalizeMimeType(parsableByteArray.readString(parsableByteArray.readInt(), com.google.common.base.Charsets.US_ASCII));
        java.lang.String string = parsableByteArray.readString(parsableByteArray.readInt());
        int i2 = parsableByteArray.readInt();
        int i3 = parsableByteArray.readInt();
        int i4 = parsableByteArray.readInt();
        int i5 = parsableByteArray.readInt();
        int i6 = parsableByteArray.readInt();
        byte[] bArr = new byte[i6];
        parsableByteArray.readBytes(bArr, 0, i6);
        return new androidx.media3.extractor.metadata.flac.PictureFrame(i, strNormalizeMimeType, string, i2, i3, i4, i5, bArr);
    }
}
