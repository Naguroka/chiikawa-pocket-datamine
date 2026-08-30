package androidx.media3.extractor.metadata.scte35;

/* JADX INFO: loaded from: classes.dex */
public final class PrivateCommand extends androidx.media3.extractor.metadata.scte35.SpliceCommand {
    public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.scte35.PrivateCommand> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.scte35.PrivateCommand>() { // from class: androidx.media3.extractor.metadata.scte35.PrivateCommand.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.scte35.PrivateCommand createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.scte35.PrivateCommand(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.scte35.PrivateCommand[] newArray(int i) {
            return new androidx.media3.extractor.metadata.scte35.PrivateCommand[i];
        }
    };
    public final byte[] commandBytes;
    public final long identifier;
    public final long ptsAdjustment;

    private PrivateCommand(long j, byte[] bArr, long j2) {
        this.ptsAdjustment = j2;
        this.identifier = j;
        this.commandBytes = bArr;
    }

    private PrivateCommand(android.os.Parcel parcel) {
        this.ptsAdjustment = parcel.readLong();
        this.identifier = parcel.readLong();
        this.commandBytes = (byte[]) androidx.media3.common.util.Util.castNonNull(parcel.createByteArray());
    }

    static androidx.media3.extractor.metadata.scte35.PrivateCommand parseFromSection(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i, long j) {
        long unsignedInt = parsableByteArray.readUnsignedInt();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        return new androidx.media3.extractor.metadata.scte35.PrivateCommand(unsignedInt, bArr, j);
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public java.lang.String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.ptsAdjustment + ", identifier= " + this.identifier + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.ptsAdjustment);
        parcel.writeLong(this.identifier);
        parcel.writeByteArray(this.commandBytes);
    }
}
