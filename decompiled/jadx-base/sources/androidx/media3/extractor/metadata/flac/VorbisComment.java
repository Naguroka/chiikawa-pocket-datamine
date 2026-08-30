package androidx.media3.extractor.metadata.flac;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class VorbisComment implements androidx.media3.common.Metadata.Entry {
    public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.flac.VorbisComment> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.flac.VorbisComment>() { // from class: androidx.media3.extractor.metadata.flac.VorbisComment.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.flac.VorbisComment createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.flac.VorbisComment(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.flac.VorbisComment[] newArray(int i) {
            return new androidx.media3.extractor.metadata.flac.VorbisComment[i];
        }
    };
    public final java.lang.String key;
    public final java.lang.String value;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VorbisComment(java.lang.String str, java.lang.String str2) {
        this.key = com.google.common.base.Ascii.toUpperCase(str);
        this.value = str2;
    }

    protected VorbisComment(android.os.Parcel parcel) {
        this.key = (java.lang.String) androidx.media3.common.util.Util.castNonNull(parcel.readString());
        this.value = (java.lang.String) androidx.media3.common.util.Util.castNonNull(parcel.readString());
    }

    @Override // androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(androidx.media3.common.MediaMetadata.Builder builder) {
        java.lang.String str = this.key;
        str.hashCode();
        switch (str) {
            case "ALBUM":
                builder.setAlbumTitle(this.value);
                break;
            case "TITLE":
                builder.setTitle(this.value);
                break;
            case "DESCRIPTION":
                builder.setDescription(this.value);
                break;
            case "ALBUMARTIST":
                builder.setAlbumArtist(this.value);
                break;
            case "ARTIST":
                builder.setArtist(this.value);
                break;
        }
    }

    public java.lang.String toString() {
        return "VC: " + this.key + com.ironsource.y8.i.b + this.value;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.extractor.metadata.flac.VorbisComment vorbisComment = (androidx.media3.extractor.metadata.flac.VorbisComment) obj;
        return this.key.equals(vorbisComment.key) && this.value.equals(vorbisComment.value);
    }

    public int hashCode() {
        return ((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.key.hashCode()) * 31) + this.value.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeString(this.value);
    }
}
