package androidx.media3.extractor.metadata.scte35;

/* JADX INFO: loaded from: classes.dex */
public final class SpliceNullCommand extends androidx.media3.extractor.metadata.scte35.SpliceCommand {
    public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.scte35.SpliceNullCommand> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.scte35.SpliceNullCommand>() { // from class: androidx.media3.extractor.metadata.scte35.SpliceNullCommand.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.scte35.SpliceNullCommand createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.scte35.SpliceNullCommand();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.scte35.SpliceNullCommand[] newArray(int i) {
            return new androidx.media3.extractor.metadata.scte35.SpliceNullCommand[i];
        }
    };

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
    }
}
