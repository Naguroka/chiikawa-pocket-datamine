package androidx.media3.extractor.metadata.mp4;

/* JADX INFO: loaded from: classes.dex */
public final class MotionPhotoMetadata implements androidx.media3.common.Metadata.Entry {
    public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata>() { // from class: androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata[] newArray(int i) {
            return new androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata[i];
        }
    };
    public final long photoPresentationTimestampUs;
    public final long photoSize;
    public final long photoStartPosition;
    public final long videoSize;
    public final long videoStartPosition;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MotionPhotoMetadata(long j, long j2, long j3, long j4, long j5) {
        this.photoStartPosition = j;
        this.photoSize = j2;
        this.photoPresentationTimestampUs = j3;
        this.videoStartPosition = j4;
        this.videoSize = j5;
    }

    private MotionPhotoMetadata(android.os.Parcel parcel) {
        this.photoStartPosition = parcel.readLong();
        this.photoSize = parcel.readLong();
        this.photoPresentationTimestampUs = parcel.readLong();
        this.videoStartPosition = parcel.readLong();
        this.videoSize = parcel.readLong();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata motionPhotoMetadata = (androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata) obj;
        return this.photoStartPosition == motionPhotoMetadata.photoStartPosition && this.photoSize == motionPhotoMetadata.photoSize && this.photoPresentationTimestampUs == motionPhotoMetadata.photoPresentationTimestampUs && this.videoStartPosition == motionPhotoMetadata.videoStartPosition && this.videoSize == motionPhotoMetadata.videoSize;
    }

    public int hashCode() {
        return ((((((((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + com.google.common.primitives.Longs.hashCode(this.photoStartPosition)) * 31) + com.google.common.primitives.Longs.hashCode(this.photoSize)) * 31) + com.google.common.primitives.Longs.hashCode(this.photoPresentationTimestampUs)) * 31) + com.google.common.primitives.Longs.hashCode(this.videoStartPosition)) * 31) + com.google.common.primitives.Longs.hashCode(this.videoSize);
    }

    public java.lang.String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.photoStartPosition + ", photoSize=" + this.photoSize + ", photoPresentationTimestampUs=" + this.photoPresentationTimestampUs + ", videoStartPosition=" + this.videoStartPosition + ", videoSize=" + this.videoSize;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.photoStartPosition);
        parcel.writeLong(this.photoSize);
        parcel.writeLong(this.photoPresentationTimestampUs);
        parcel.writeLong(this.videoStartPosition);
        parcel.writeLong(this.videoSize);
    }
}
