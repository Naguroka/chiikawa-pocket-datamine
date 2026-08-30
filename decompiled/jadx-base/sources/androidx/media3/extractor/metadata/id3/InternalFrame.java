package androidx.media3.extractor.metadata.id3;

/* JADX INFO: loaded from: classes.dex */
public final class InternalFrame extends androidx.media3.extractor.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.id3.InternalFrame> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.id3.InternalFrame>() { // from class: androidx.media3.extractor.metadata.id3.InternalFrame.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.id3.InternalFrame createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.id3.InternalFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.id3.InternalFrame[] newArray(int i) {
            return new androidx.media3.extractor.metadata.id3.InternalFrame[i];
        }
    };
    public static final java.lang.String ID = "----";
    public final java.lang.String description;
    public final java.lang.String domain;
    public final java.lang.String text;

    public InternalFrame(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(ID);
        this.domain = str;
        this.description = str2;
        this.text = str3;
    }

    InternalFrame(android.os.Parcel parcel) {
        super(ID);
        this.domain = (java.lang.String) androidx.media3.common.util.Util.castNonNull(parcel.readString());
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
        androidx.media3.extractor.metadata.id3.InternalFrame internalFrame = (androidx.media3.extractor.metadata.id3.InternalFrame) obj;
        return androidx.media3.common.util.Util.areEqual(this.description, internalFrame.description) && androidx.media3.common.util.Util.areEqual(this.domain, internalFrame.domain) && androidx.media3.common.util.Util.areEqual(this.text, internalFrame.text);
    }

    public int hashCode() {
        java.lang.String str = this.domain;
        int iHashCode = (com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.text;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public java.lang.String toString() {
        return this.id + ": domain=" + this.domain + ", description=" + this.description;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.domain);
        parcel.writeString(this.text);
    }
}
