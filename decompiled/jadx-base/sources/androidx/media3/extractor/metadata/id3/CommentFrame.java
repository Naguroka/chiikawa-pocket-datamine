package androidx.media3.extractor.metadata.id3;

/* JADX INFO: loaded from: classes.dex */
public final class CommentFrame extends androidx.media3.extractor.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.id3.CommentFrame> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.id3.CommentFrame>() { // from class: androidx.media3.extractor.metadata.id3.CommentFrame.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.id3.CommentFrame createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.id3.CommentFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.id3.CommentFrame[] newArray(int i) {
            return new androidx.media3.extractor.metadata.id3.CommentFrame[i];
        }
    };
    public static final java.lang.String ID = "COMM";
    public final java.lang.String description;
    public final java.lang.String language;
    public final java.lang.String text;

    public CommentFrame(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(ID);
        this.language = str;
        this.description = str2;
        this.text = str3;
    }

    CommentFrame(android.os.Parcel parcel) {
        super(ID);
        this.language = (java.lang.String) androidx.media3.common.util.Util.castNonNull(parcel.readString());
        this.description = (java.lang.String) androidx.media3.common.util.Util.castNonNull(parcel.readString());
        this.text = (java.lang.String) androidx.media3.common.util.Util.castNonNull(parcel.readString());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.extractor.metadata.id3.CommentFrame commentFrame = (androidx.media3.extractor.metadata.id3.CommentFrame) obj;
        return androidx.media3.common.util.Util.areEqual(this.description, commentFrame.description) && androidx.media3.common.util.Util.areEqual(this.language, commentFrame.language) && androidx.media3.common.util.Util.areEqual(this.text, commentFrame.text);
    }

    public int hashCode() {
        java.lang.String str = this.language;
        int iHashCode = (com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.text;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public java.lang.String toString() {
        return this.id + ": language=" + this.language + ", description=" + this.description + ", text=" + this.text;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.language);
        parcel.writeString(this.text);
    }
}
