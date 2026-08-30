package androidx.media3.extractor.metadata.id3;

/* JADX INFO: loaded from: classes.dex */
public final class UrlLinkFrame extends androidx.media3.extractor.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.id3.UrlLinkFrame> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.id3.UrlLinkFrame>() { // from class: androidx.media3.extractor.metadata.id3.UrlLinkFrame.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.id3.UrlLinkFrame createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.id3.UrlLinkFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.id3.UrlLinkFrame[] newArray(int i) {
            return new androidx.media3.extractor.metadata.id3.UrlLinkFrame[i];
        }
    };
    public final java.lang.String description;
    public final java.lang.String url;

    public UrlLinkFrame(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(str);
        this.description = str2;
        this.url = str3;
    }

    UrlLinkFrame(android.os.Parcel parcel) {
        super((java.lang.String) androidx.media3.common.util.Util.castNonNull(parcel.readString()));
        this.description = parcel.readString();
        this.url = (java.lang.String) androidx.media3.common.util.Util.castNonNull(parcel.readString());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.extractor.metadata.id3.UrlLinkFrame urlLinkFrame = (androidx.media3.extractor.metadata.id3.UrlLinkFrame) obj;
        return this.id.equals(urlLinkFrame.id) && androidx.media3.common.util.Util.areEqual(this.description, urlLinkFrame.description) && androidx.media3.common.util.Util.areEqual(this.url, urlLinkFrame.url);
    }

    public int hashCode() {
        int iHashCode = (com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.id.hashCode()) * 31;
        java.lang.String str = this.description;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.url;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public java.lang.String toString() {
        return this.id + ": url=" + this.url;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.description);
        parcel.writeString(this.url);
    }
}
