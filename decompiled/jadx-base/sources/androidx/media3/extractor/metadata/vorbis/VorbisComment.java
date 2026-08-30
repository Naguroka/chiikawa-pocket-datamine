package androidx.media3.extractor.metadata.vorbis;

/* JADX INFO: loaded from: classes.dex */
public final class VorbisComment extends androidx.media3.extractor.metadata.flac.VorbisComment {
    public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.vorbis.VorbisComment> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.vorbis.VorbisComment>() { // from class: androidx.media3.extractor.metadata.vorbis.VorbisComment.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.vorbis.VorbisComment createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.vorbis.VorbisComment(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.vorbis.VorbisComment[] newArray(int i) {
            return new androidx.media3.extractor.metadata.vorbis.VorbisComment[i];
        }
    };

    public VorbisComment(java.lang.String str, java.lang.String str2) {
        super(str, str2);
    }

    VorbisComment(android.os.Parcel parcel) {
        super(parcel);
    }
}
