package androidx.media3.extractor.metadata.scte35;

/* JADX INFO: loaded from: classes.dex */
public final class SpliceInsertCommand extends androidx.media3.extractor.metadata.scte35.SpliceCommand {
    public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.scte35.SpliceInsertCommand> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.scte35.SpliceInsertCommand>() { // from class: androidx.media3.extractor.metadata.scte35.SpliceInsertCommand.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.scte35.SpliceInsertCommand createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.scte35.SpliceInsertCommand(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.scte35.SpliceInsertCommand[] newArray(int i) {
            return new androidx.media3.extractor.metadata.scte35.SpliceInsertCommand[i];
        }
    };
    public final boolean autoReturn;
    public final int availNum;
    public final int availsExpected;
    public final long breakDurationUs;
    public final java.util.List<androidx.media3.extractor.metadata.scte35.SpliceInsertCommand.ComponentSplice> componentSpliceList;
    public final boolean outOfNetworkIndicator;
    public final boolean programSpliceFlag;
    public final long programSplicePlaybackPositionUs;
    public final long programSplicePts;
    public final boolean spliceEventCancelIndicator;
    public final long spliceEventId;
    public final boolean spliceImmediateFlag;
    public final int uniqueProgramId;

    private SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, java.util.List<androidx.media3.extractor.metadata.scte35.SpliceInsertCommand.ComponentSplice> list, boolean z5, long j4, int i, int i2, int i3) {
        this.spliceEventId = j;
        this.spliceEventCancelIndicator = z;
        this.outOfNetworkIndicator = z2;
        this.programSpliceFlag = z3;
        this.spliceImmediateFlag = z4;
        this.programSplicePts = j2;
        this.programSplicePlaybackPositionUs = j3;
        this.componentSpliceList = java.util.Collections.unmodifiableList(list);
        this.autoReturn = z5;
        this.breakDurationUs = j4;
        this.uniqueProgramId = i;
        this.availNum = i2;
        this.availsExpected = i3;
    }

    private SpliceInsertCommand(android.os.Parcel parcel) {
        this.spliceEventId = parcel.readLong();
        this.spliceEventCancelIndicator = parcel.readByte() == 1;
        this.outOfNetworkIndicator = parcel.readByte() == 1;
        this.programSpliceFlag = parcel.readByte() == 1;
        this.spliceImmediateFlag = parcel.readByte() == 1;
        this.programSplicePts = parcel.readLong();
        this.programSplicePlaybackPositionUs = parcel.readLong();
        int i = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(androidx.media3.extractor.metadata.scte35.SpliceInsertCommand.ComponentSplice.createFromParcel(parcel));
        }
        this.componentSpliceList = java.util.Collections.unmodifiableList(arrayList);
        this.autoReturn = parcel.readByte() == 1;
        this.breakDurationUs = parcel.readLong();
        this.uniqueProgramId = parcel.readInt();
        this.availNum = parcel.readInt();
        this.availsExpected = parcel.readInt();
    }

    static androidx.media3.extractor.metadata.scte35.SpliceInsertCommand parseFromSection(androidx.media3.common.util.ParsableByteArray parsableByteArray, long j, androidx.media3.common.util.TimestampAdjuster timestampAdjuster) {
        java.util.List list;
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        long j3;
        int unsignedShort;
        int unsignedByte;
        int unsignedByte2;
        boolean z4;
        boolean z5;
        long unsignedInt;
        long unsignedInt2 = parsableByteArray.readUnsignedInt();
        boolean z6 = (parsableByteArray.readUnsignedByte() & 128) != 0;
        java.util.List listEmptyList = java.util.Collections.emptyList();
        if (z6) {
            list = listEmptyList;
            z = false;
            z2 = false;
            j2 = androidx.media3.common.C.TIME_UNSET;
            z3 = false;
            j3 = androidx.media3.common.C.TIME_UNSET;
            unsignedShort = 0;
            unsignedByte = 0;
            unsignedByte2 = 0;
            z4 = false;
        } else {
            int unsignedByte3 = parsableByteArray.readUnsignedByte();
            boolean z7 = (unsignedByte3 & 128) != 0;
            boolean z8 = (unsignedByte3 & 64) != 0;
            boolean z9 = (unsignedByte3 & 32) != 0;
            boolean z10 = (unsignedByte3 & 16) != 0;
            long spliceTime = (!z8 || z10) ? androidx.media3.common.C.TIME_UNSET : androidx.media3.extractor.metadata.scte35.TimeSignalCommand.parseSpliceTime(parsableByteArray, j);
            if (!z8) {
                int unsignedByte4 = parsableByteArray.readUnsignedByte();
                java.util.ArrayList arrayList = new java.util.ArrayList(unsignedByte4);
                for (int i = 0; i < unsignedByte4; i++) {
                    int unsignedByte5 = parsableByteArray.readUnsignedByte();
                    long spliceTime2 = !z10 ? androidx.media3.extractor.metadata.scte35.TimeSignalCommand.parseSpliceTime(parsableByteArray, j) : androidx.media3.common.C.TIME_UNSET;
                    arrayList.add(new androidx.media3.extractor.metadata.scte35.SpliceInsertCommand.ComponentSplice(unsignedByte5, spliceTime2, timestampAdjuster.adjustTsTimestamp(spliceTime2)));
                }
                listEmptyList = arrayList;
            }
            if (z9) {
                long unsignedByte6 = parsableByteArray.readUnsignedByte();
                boolean z11 = (128 & unsignedByte6) != 0;
                unsignedInt = ((((unsignedByte6 & 1) << 32) | parsableByteArray.readUnsignedInt()) * 1000) / 90;
                z5 = z11;
            } else {
                z5 = false;
                unsignedInt = androidx.media3.common.C.TIME_UNSET;
            }
            unsignedShort = parsableByteArray.readUnsignedShort();
            z4 = z8;
            unsignedByte = parsableByteArray.readUnsignedByte();
            unsignedByte2 = parsableByteArray.readUnsignedByte();
            list = listEmptyList;
            long j4 = spliceTime;
            z3 = z5;
            j3 = unsignedInt;
            z2 = z10;
            z = z7;
            j2 = j4;
        }
        return new androidx.media3.extractor.metadata.scte35.SpliceInsertCommand(unsignedInt2, z6, z, z4, z2, j2, timestampAdjuster.adjustTsTimestamp(j2), list, z3, j3, unsignedShort, unsignedByte, unsignedByte2);
    }

    public static final class ComponentSplice {
        public final long componentSplicePlaybackPositionUs;
        public final long componentSplicePts;
        public final int componentTag;

        private ComponentSplice(int i, long j, long j2) {
            this.componentTag = i;
            this.componentSplicePts = j;
            this.componentSplicePlaybackPositionUs = j2;
        }

        public void writeToParcel(android.os.Parcel parcel) {
            parcel.writeInt(this.componentTag);
            parcel.writeLong(this.componentSplicePts);
            parcel.writeLong(this.componentSplicePlaybackPositionUs);
        }

        public static androidx.media3.extractor.metadata.scte35.SpliceInsertCommand.ComponentSplice createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.scte35.SpliceInsertCommand.ComponentSplice(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public java.lang.String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.programSplicePts + ", programSplicePlaybackPositionUs= " + this.programSplicePlaybackPositionUs + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.spliceEventId);
        parcel.writeByte(this.spliceEventCancelIndicator ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.outOfNetworkIndicator ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.programSpliceFlag ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.spliceImmediateFlag ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.programSplicePts);
        parcel.writeLong(this.programSplicePlaybackPositionUs);
        int size = this.componentSpliceList.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.componentSpliceList.get(i2).writeToParcel(parcel);
        }
        parcel.writeByte(this.autoReturn ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.breakDurationUs);
        parcel.writeInt(this.uniqueProgramId);
        parcel.writeInt(this.availNum);
        parcel.writeInt(this.availsExpected);
    }
}
