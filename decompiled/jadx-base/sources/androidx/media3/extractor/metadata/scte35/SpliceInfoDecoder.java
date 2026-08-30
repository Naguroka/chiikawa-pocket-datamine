package androidx.media3.extractor.metadata.scte35;

/* JADX INFO: loaded from: classes.dex */
public final class SpliceInfoDecoder extends androidx.media3.extractor.metadata.SimpleMetadataDecoder {
    private static final int TYPE_PRIVATE_COMMAND = 255;
    private static final int TYPE_SPLICE_INSERT = 5;
    private static final int TYPE_SPLICE_NULL = 0;
    private static final int TYPE_SPLICE_SCHEDULE = 4;
    private static final int TYPE_TIME_SIGNAL = 6;
    private final androidx.media3.common.util.ParsableByteArray sectionData = new androidx.media3.common.util.ParsableByteArray();
    private final androidx.media3.common.util.ParsableBitArray sectionHeader = new androidx.media3.common.util.ParsableBitArray();
    private androidx.media3.common.util.TimestampAdjuster timestampAdjuster;

    @Override // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    protected androidx.media3.common.Metadata decode(androidx.media3.extractor.metadata.MetadataInputBuffer metadataInputBuffer, java.nio.ByteBuffer byteBuffer) {
        androidx.media3.common.Metadata.Entry spliceNullCommand;
        if (this.timestampAdjuster == null || metadataInputBuffer.subsampleOffsetUs != this.timestampAdjuster.getTimestampOffsetUs()) {
            androidx.media3.common.util.TimestampAdjuster timestampAdjuster = new androidx.media3.common.util.TimestampAdjuster(metadataInputBuffer.timeUs);
            this.timestampAdjuster = timestampAdjuster;
            timestampAdjuster.adjustSampleTimestamp(metadataInputBuffer.timeUs - metadataInputBuffer.subsampleOffsetUs);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.sectionData.reset(bArrArray, iLimit);
        this.sectionHeader.reset(bArrArray, iLimit);
        this.sectionHeader.skipBits(39);
        long bits = (((long) this.sectionHeader.readBits(1)) << 32) | ((long) this.sectionHeader.readBits(32));
        this.sectionHeader.skipBits(20);
        int bits2 = this.sectionHeader.readBits(12);
        int bits3 = this.sectionHeader.readBits(8);
        this.sectionData.skipBytes(14);
        if (bits3 == 0) {
            spliceNullCommand = new androidx.media3.extractor.metadata.scte35.SpliceNullCommand();
        } else if (bits3 == 255) {
            spliceNullCommand = androidx.media3.extractor.metadata.scte35.PrivateCommand.parseFromSection(this.sectionData, bits2, bits);
        } else if (bits3 == 4) {
            spliceNullCommand = androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.parseFromSection(this.sectionData);
        } else if (bits3 == 5) {
            spliceNullCommand = androidx.media3.extractor.metadata.scte35.SpliceInsertCommand.parseFromSection(this.sectionData, bits, this.timestampAdjuster);
        } else {
            spliceNullCommand = bits3 != 6 ? null : androidx.media3.extractor.metadata.scte35.TimeSignalCommand.parseFromSection(this.sectionData, bits, this.timestampAdjuster);
        }
        return spliceNullCommand == null ? new androidx.media3.common.Metadata(new androidx.media3.common.Metadata.Entry[0]) : new androidx.media3.common.Metadata(spliceNullCommand);
    }
}
