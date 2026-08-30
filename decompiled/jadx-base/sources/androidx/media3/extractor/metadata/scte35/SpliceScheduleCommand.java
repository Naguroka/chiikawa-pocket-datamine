package androidx.media3.extractor.metadata.scte35;

/* JADX INFO: loaded from: classes.dex */
public final class SpliceScheduleCommand extends androidx.media3.extractor.metadata.scte35.SpliceCommand {
    public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand>() { // from class: androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand[] newArray(int i) {
            return new androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand[i];
        }
    };
    public final java.util.List<androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.Event> events;

    public static final class Event {
        public final boolean autoReturn;
        public final int availNum;
        public final int availsExpected;
        public final long breakDurationUs;
        public final java.util.List<androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.ComponentSplice> componentSpliceList;
        public final boolean outOfNetworkIndicator;
        public final boolean programSpliceFlag;
        public final boolean spliceEventCancelIndicator;
        public final long spliceEventId;
        public final int uniqueProgramId;
        public final long utcSpliceTime;

        private Event(long j, boolean z, boolean z2, boolean z3, java.util.List<androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.ComponentSplice> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.spliceEventId = j;
            this.spliceEventCancelIndicator = z;
            this.outOfNetworkIndicator = z2;
            this.programSpliceFlag = z3;
            this.componentSpliceList = java.util.Collections.unmodifiableList(list);
            this.utcSpliceTime = j2;
            this.autoReturn = z4;
            this.breakDurationUs = j3;
            this.uniqueProgramId = i;
            this.availNum = i2;
            this.availsExpected = i3;
        }

        private Event(android.os.Parcel parcel) {
            this.spliceEventId = parcel.readLong();
            this.spliceEventCancelIndicator = parcel.readByte() == 1;
            this.outOfNetworkIndicator = parcel.readByte() == 1;
            this.programSpliceFlag = parcel.readByte() == 1;
            int i = parcel.readInt();
            java.util.ArrayList arrayList = new java.util.ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.ComponentSplice.createFromParcel(parcel));
            }
            this.componentSpliceList = java.util.Collections.unmodifiableList(arrayList);
            this.utcSpliceTime = parcel.readLong();
            this.autoReturn = parcel.readByte() == 1;
            this.breakDurationUs = parcel.readLong();
            this.uniqueProgramId = parcel.readInt();
            this.availNum = parcel.readInt();
            this.availsExpected = parcel.readInt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.Event parseFromSection(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
            java.util.ArrayList arrayList;
            boolean z;
            long j;
            boolean z2;
            long j2;
            int i;
            int i2;
            int unsignedByte;
            boolean z3;
            boolean z4;
            long unsignedInt;
            long unsignedInt2 = parsableByteArray.readUnsignedInt();
            boolean z5 = (parsableByteArray.readUnsignedByte() & 128) != 0;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (z5) {
                arrayList = arrayList2;
                z = false;
                j = androidx.media3.common.C.TIME_UNSET;
                z2 = false;
                j2 = androidx.media3.common.C.TIME_UNSET;
                i = 0;
                i2 = 0;
                unsignedByte = 0;
                z3 = false;
            } else {
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                boolean z6 = (unsignedByte2 & 128) != 0;
                boolean z7 = (unsignedByte2 & 64) != 0;
                boolean z8 = (unsignedByte2 & 32) != 0;
                long unsignedInt3 = z7 ? parsableByteArray.readUnsignedInt() : androidx.media3.common.C.TIME_UNSET;
                if (!z7) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(unsignedByte3);
                    for (int i3 = 0; i3 < unsignedByte3; i3++) {
                        arrayList3.add(new androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.ComponentSplice(parsableByteArray.readUnsignedByte(), parsableByteArray.readUnsignedInt()));
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long unsignedByte4 = parsableByteArray.readUnsignedByte();
                    boolean z9 = (128 & unsignedByte4) != 0;
                    unsignedInt = ((((unsignedByte4 & 1) << 32) | parsableByteArray.readUnsignedInt()) * 1000) / 90;
                    z4 = z9;
                } else {
                    z4 = false;
                    unsignedInt = androidx.media3.common.C.TIME_UNSET;
                }
                int unsignedShort = parsableByteArray.readUnsignedShort();
                int unsignedByte5 = parsableByteArray.readUnsignedByte();
                z3 = z7;
                unsignedByte = parsableByteArray.readUnsignedByte();
                j2 = unsignedInt;
                arrayList = arrayList2;
                long j3 = unsignedInt3;
                i = unsignedShort;
                i2 = unsignedByte5;
                j = j3;
                boolean z10 = z6;
                z2 = z4;
                z = z10;
            }
            return new androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.Event(unsignedInt2, z5, z, z3, arrayList, j, z2, j2, i, i2, unsignedByte);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeToParcel(android.os.Parcel parcel) {
            parcel.writeLong(this.spliceEventId);
            parcel.writeByte(this.spliceEventCancelIndicator ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.outOfNetworkIndicator ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.programSpliceFlag ? (byte) 1 : (byte) 0);
            int size = this.componentSpliceList.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                this.componentSpliceList.get(i).writeToParcel(parcel);
            }
            parcel.writeLong(this.utcSpliceTime);
            parcel.writeByte(this.autoReturn ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.breakDurationUs);
            parcel.writeInt(this.uniqueProgramId);
            parcel.writeInt(this.availNum);
            parcel.writeInt(this.availsExpected);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.Event createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.Event(parcel);
        }
    }

    public static final class ComponentSplice {
        public final int componentTag;
        public final long utcSpliceTime;

        private ComponentSplice(int i, long j) {
            this.componentTag = i;
            this.utcSpliceTime = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.ComponentSplice createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.ComponentSplice(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeToParcel(android.os.Parcel parcel) {
            parcel.writeInt(this.componentTag);
            parcel.writeLong(this.utcSpliceTime);
        }
    }

    private SpliceScheduleCommand(java.util.List<androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.Event> list) {
        this.events = java.util.Collections.unmodifiableList(list);
    }

    private SpliceScheduleCommand(android.os.Parcel parcel) {
        int i = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.Event.createFromParcel(parcel));
        }
        this.events = java.util.Collections.unmodifiableList(arrayList);
    }

    static androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand parseFromSection(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        java.util.ArrayList arrayList = new java.util.ArrayList(unsignedByte);
        for (int i = 0; i < unsignedByte; i++) {
            arrayList.add(androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.Event.parseFromSection(parsableByteArray));
        }
        return new androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int size = this.events.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.events.get(i2).writeToParcel(parcel);
        }
    }
}
