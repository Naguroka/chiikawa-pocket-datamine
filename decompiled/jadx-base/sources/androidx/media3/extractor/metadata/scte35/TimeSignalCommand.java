package androidx.media3.extractor.metadata.scte35;

/* JADX INFO: loaded from: classes.dex */
public final class TimeSignalCommand extends androidx.media3.extractor.metadata.scte35.SpliceCommand {
    public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.scte35.TimeSignalCommand> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.scte35.TimeSignalCommand>() { // from class: androidx.media3.extractor.metadata.scte35.TimeSignalCommand.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.scte35.TimeSignalCommand createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.scte35.TimeSignalCommand(parcel.readLong(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.scte35.TimeSignalCommand[] newArray(int i) {
            return new androidx.media3.extractor.metadata.scte35.TimeSignalCommand[i];
        }
    };
    public final long playbackPositionUs;
    public final long ptsTime;

    private TimeSignalCommand(long j, long j2) {
        this.ptsTime = j;
        this.playbackPositionUs = j2;
    }

    static androidx.media3.extractor.metadata.scte35.TimeSignalCommand parseFromSection(androidx.media3.common.util.ParsableByteArray parsableByteArray, long j, androidx.media3.common.util.TimestampAdjuster timestampAdjuster) {
        long spliceTime = parseSpliceTime(parsableByteArray, j);
        return new androidx.media3.extractor.metadata.scte35.TimeSignalCommand(spliceTime, timestampAdjuster.adjustTsTimestamp(spliceTime));
    }

    static long parseSpliceTime(androidx.media3.common.util.ParsableByteArray parsableByteArray, long j) {
        long unsignedByte = parsableByteArray.readUnsignedByte();
        return (128 & unsignedByte) != 0 ? 8589934591L & ((((unsignedByte & 1) << 32) | parsableByteArray.readUnsignedInt()) + j) : androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public java.lang.String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.ptsTime + ", playbackPositionUs= " + this.playbackPositionUs + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.ptsTime);
        parcel.writeLong(this.playbackPositionUs);
    }
}
