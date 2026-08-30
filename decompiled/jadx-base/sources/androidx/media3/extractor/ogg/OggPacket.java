package androidx.media3.extractor.ogg;

/* JADX INFO: loaded from: classes.dex */
final class OggPacket {
    private boolean populated;
    private int segmentCount;
    private final androidx.media3.extractor.ogg.OggPageHeader pageHeader = new androidx.media3.extractor.ogg.OggPageHeader();
    private final androidx.media3.common.util.ParsableByteArray packetArray = new androidx.media3.common.util.ParsableByteArray(new byte[androidx.media3.extractor.ogg.OggPageHeader.MAX_PAGE_PAYLOAD], 0);
    private int currentSegmentIndex = -1;

    OggPacket() {
    }

    public void reset() {
        this.pageHeader.reset();
        this.packetArray.reset(0);
        this.currentSegmentIndex = -1;
        this.populated = false;
    }

    public boolean populate(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        int i;
        androidx.media3.common.util.Assertions.checkState(extractorInput != null);
        if (this.populated) {
            this.populated = false;
            this.packetArray.reset(0);
        }
        while (!this.populated) {
            if (this.currentSegmentIndex < 0) {
                if (!this.pageHeader.skipToNextPage(extractorInput) || !this.pageHeader.populate(extractorInput, true)) {
                    return false;
                }
                int iCalculatePacketSize = this.pageHeader.headerSize;
                if ((this.pageHeader.type & 1) == 1 && this.packetArray.limit() == 0) {
                    iCalculatePacketSize += calculatePacketSize(0);
                    i = this.segmentCount + 0;
                } else {
                    i = 0;
                }
                if (!androidx.media3.extractor.ExtractorUtil.skipFullyQuietly(extractorInput, iCalculatePacketSize)) {
                    return false;
                }
                this.currentSegmentIndex = i;
            }
            int iCalculatePacketSize2 = calculatePacketSize(this.currentSegmentIndex);
            int i2 = this.currentSegmentIndex + this.segmentCount;
            if (iCalculatePacketSize2 > 0) {
                androidx.media3.common.util.ParsableByteArray parsableByteArray = this.packetArray;
                parsableByteArray.ensureCapacity(parsableByteArray.limit() + iCalculatePacketSize2);
                if (!androidx.media3.extractor.ExtractorUtil.readFullyQuietly(extractorInput, this.packetArray.getData(), this.packetArray.limit(), iCalculatePacketSize2)) {
                    return false;
                }
                androidx.media3.common.util.ParsableByteArray parsableByteArray2 = this.packetArray;
                parsableByteArray2.setLimit(parsableByteArray2.limit() + iCalculatePacketSize2);
                this.populated = this.pageHeader.laces[i2 + (-1)] != 255;
            }
            if (i2 == this.pageHeader.pageSegmentCount) {
                i2 = -1;
            }
            this.currentSegmentIndex = i2;
        }
        return true;
    }

    public androidx.media3.extractor.ogg.OggPageHeader getPageHeader() {
        return this.pageHeader;
    }

    public androidx.media3.common.util.ParsableByteArray getPayload() {
        return this.packetArray;
    }

    public void trimPayload() {
        if (this.packetArray.getData().length == 65025) {
            return;
        }
        androidx.media3.common.util.ParsableByteArray parsableByteArray = this.packetArray;
        parsableByteArray.reset(java.util.Arrays.copyOf(parsableByteArray.getData(), java.lang.Math.max(androidx.media3.extractor.ogg.OggPageHeader.MAX_PAGE_PAYLOAD, this.packetArray.limit())), this.packetArray.limit());
    }

    private int calculatePacketSize(int i) {
        int i2 = 0;
        this.segmentCount = 0;
        while (this.segmentCount + i < this.pageHeader.pageSegmentCount) {
            int[] iArr = this.pageHeader.laces;
            int i3 = this.segmentCount;
            this.segmentCount = i3 + 1;
            int i4 = iArr[i3 + i];
            i2 += i4;
            if (i4 != 255) {
                break;
            }
        }
        return i2;
    }
}
