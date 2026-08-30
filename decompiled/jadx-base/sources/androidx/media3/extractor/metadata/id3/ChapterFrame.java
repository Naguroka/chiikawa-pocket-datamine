package androidx.media3.extractor.metadata.id3;

/* JADX INFO: loaded from: classes.dex */
public final class ChapterFrame extends androidx.media3.extractor.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.id3.ChapterFrame> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.id3.ChapterFrame>() { // from class: androidx.media3.extractor.metadata.id3.ChapterFrame.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.id3.ChapterFrame createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.id3.ChapterFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.id3.ChapterFrame[] newArray(int i) {
            return new androidx.media3.extractor.metadata.id3.ChapterFrame[i];
        }
    };
    public static final java.lang.String ID = "CHAP";
    public final java.lang.String chapterId;
    public final long endOffset;
    public final int endTimeMs;
    public final long startOffset;
    public final int startTimeMs;
    private final androidx.media3.extractor.metadata.id3.Id3Frame[] subFrames;

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ChapterFrame(java.lang.String str, int i, int i2, long j, long j2, androidx.media3.extractor.metadata.id3.Id3Frame[] id3FrameArr) {
        super(ID);
        this.chapterId = str;
        this.startTimeMs = i;
        this.endTimeMs = i2;
        this.startOffset = j;
        this.endOffset = j2;
        this.subFrames = id3FrameArr;
    }

    ChapterFrame(android.os.Parcel parcel) {
        super(ID);
        this.chapterId = (java.lang.String) androidx.media3.common.util.Util.castNonNull(parcel.readString());
        this.startTimeMs = parcel.readInt();
        this.endTimeMs = parcel.readInt();
        this.startOffset = parcel.readLong();
        this.endOffset = parcel.readLong();
        int i = parcel.readInt();
        this.subFrames = new androidx.media3.extractor.metadata.id3.Id3Frame[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.subFrames[i2] = (androidx.media3.extractor.metadata.id3.Id3Frame) parcel.readParcelable(androidx.media3.extractor.metadata.id3.Id3Frame.class.getClassLoader());
        }
    }

    public int getSubFrameCount() {
        return this.subFrames.length;
    }

    public androidx.media3.extractor.metadata.id3.Id3Frame getSubFrame(int i) {
        return this.subFrames[i];
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.extractor.metadata.id3.ChapterFrame chapterFrame = (androidx.media3.extractor.metadata.id3.ChapterFrame) obj;
        return this.startTimeMs == chapterFrame.startTimeMs && this.endTimeMs == chapterFrame.endTimeMs && this.startOffset == chapterFrame.startOffset && this.endOffset == chapterFrame.endOffset && androidx.media3.common.util.Util.areEqual(this.chapterId, chapterFrame.chapterId) && java.util.Arrays.equals(this.subFrames, chapterFrame.subFrames);
    }

    public int hashCode() {
        int i = (((((((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.startTimeMs) * 31) + this.endTimeMs) * 31) + ((int) this.startOffset)) * 31) + ((int) this.endOffset)) * 31;
        java.lang.String str = this.chapterId;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.chapterId);
        parcel.writeInt(this.startTimeMs);
        parcel.writeInt(this.endTimeMs);
        parcel.writeLong(this.startOffset);
        parcel.writeLong(this.endOffset);
        parcel.writeInt(this.subFrames.length);
        for (androidx.media3.extractor.metadata.id3.Id3Frame id3Frame : this.subFrames) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
