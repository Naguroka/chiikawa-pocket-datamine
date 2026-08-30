package androidx.media3.extractor.metadata.id3;

/* JADX INFO: loaded from: classes.dex */
public final class MlltFrame extends androidx.media3.extractor.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.id3.MlltFrame> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.id3.MlltFrame>() { // from class: androidx.media3.extractor.metadata.id3.MlltFrame.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.id3.MlltFrame createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.id3.MlltFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.id3.MlltFrame[] newArray(int i) {
            return new androidx.media3.extractor.metadata.id3.MlltFrame[i];
        }
    };
    public static final java.lang.String ID = "MLLT";
    public final int bytesBetweenReference;
    public final int[] bytesDeviations;
    public final int millisecondsBetweenReference;
    public final int[] millisecondsDeviations;
    public final int mpegFramesBetweenReference;

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MlltFrame(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super(ID);
        this.mpegFramesBetweenReference = i;
        this.bytesBetweenReference = i2;
        this.millisecondsBetweenReference = i3;
        this.bytesDeviations = iArr;
        this.millisecondsDeviations = iArr2;
    }

    MlltFrame(android.os.Parcel parcel) {
        super(ID);
        this.mpegFramesBetweenReference = parcel.readInt();
        this.bytesBetweenReference = parcel.readInt();
        this.millisecondsBetweenReference = parcel.readInt();
        this.bytesDeviations = (int[]) androidx.media3.common.util.Util.castNonNull(parcel.createIntArray());
        this.millisecondsDeviations = (int[]) androidx.media3.common.util.Util.castNonNull(parcel.createIntArray());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.extractor.metadata.id3.MlltFrame mlltFrame = (androidx.media3.extractor.metadata.id3.MlltFrame) obj;
        return this.mpegFramesBetweenReference == mlltFrame.mpegFramesBetweenReference && this.bytesBetweenReference == mlltFrame.bytesBetweenReference && this.millisecondsBetweenReference == mlltFrame.millisecondsBetweenReference && java.util.Arrays.equals(this.bytesDeviations, mlltFrame.bytesDeviations) && java.util.Arrays.equals(this.millisecondsDeviations, mlltFrame.millisecondsDeviations);
    }

    public int hashCode() {
        return ((((((((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.mpegFramesBetweenReference) * 31) + this.bytesBetweenReference) * 31) + this.millisecondsBetweenReference) * 31) + java.util.Arrays.hashCode(this.bytesDeviations)) * 31) + java.util.Arrays.hashCode(this.millisecondsDeviations);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.mpegFramesBetweenReference);
        parcel.writeInt(this.bytesBetweenReference);
        parcel.writeInt(this.millisecondsBetweenReference);
        parcel.writeIntArray(this.bytesDeviations);
        parcel.writeIntArray(this.millisecondsDeviations);
    }
}
