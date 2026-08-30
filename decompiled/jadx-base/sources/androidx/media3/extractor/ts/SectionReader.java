package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class SectionReader implements androidx.media3.extractor.ts.TsPayloadReader {
    private static final int DEFAULT_SECTION_BUFFER_LENGTH = 32;
    private static final int MAX_SECTION_LENGTH = 4098;
    private static final int SECTION_HEADER_LENGTH = 3;
    private int bytesRead;
    private final androidx.media3.extractor.ts.SectionPayloadReader reader;
    private final androidx.media3.common.util.ParsableByteArray sectionData = new androidx.media3.common.util.ParsableByteArray(32);
    private boolean sectionSyntaxIndicator;
    private int totalSectionLength;
    private boolean waitingForPayloadStart;

    public SectionReader(androidx.media3.extractor.ts.SectionPayloadReader sectionPayloadReader) {
        this.reader = sectionPayloadReader;
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public void init(androidx.media3.common.util.TimestampAdjuster timestampAdjuster, androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.ts.TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.reader.init(timestampAdjuster, extractorOutput, trackIdGenerator);
        this.waitingForPayloadStart = true;
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public void seek() {
        this.waitingForPayloadStart = true;
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public void consume(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        int position;
        boolean z = (i & 1) != 0;
        if (z) {
            position = parsableByteArray.getPosition() + parsableByteArray.readUnsignedByte();
        } else {
            position = -1;
        }
        if (this.waitingForPayloadStart) {
            if (!z) {
                return;
            }
            this.waitingForPayloadStart = false;
            parsableByteArray.setPosition(position);
            this.bytesRead = 0;
        }
        while (parsableByteArray.bytesLeft() > 0) {
            int i2 = this.bytesRead;
            if (i2 < 3) {
                if (i2 == 0) {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    parsableByteArray.setPosition(parsableByteArray.getPosition() - 1);
                    if (unsignedByte == 255) {
                        this.waitingForPayloadStart = true;
                        return;
                    }
                }
                int iMin = java.lang.Math.min(parsableByteArray.bytesLeft(), 3 - this.bytesRead);
                parsableByteArray.readBytes(this.sectionData.getData(), this.bytesRead, iMin);
                int i3 = this.bytesRead + iMin;
                this.bytesRead = i3;
                if (i3 == 3) {
                    this.sectionData.setPosition(0);
                    this.sectionData.setLimit(3);
                    this.sectionData.skipBytes(1);
                    int unsignedByte2 = this.sectionData.readUnsignedByte();
                    int unsignedByte3 = this.sectionData.readUnsignedByte();
                    this.sectionSyntaxIndicator = (unsignedByte2 & 128) != 0;
                    this.totalSectionLength = (((unsignedByte2 & 15) << 8) | unsignedByte3) + 3;
                    int iCapacity = this.sectionData.capacity();
                    int i4 = this.totalSectionLength;
                    if (iCapacity < i4) {
                        this.sectionData.ensureCapacity(java.lang.Math.min(4098, java.lang.Math.max(i4, this.sectionData.capacity() * 2)));
                    }
                }
            } else {
                int iMin2 = java.lang.Math.min(parsableByteArray.bytesLeft(), this.totalSectionLength - this.bytesRead);
                parsableByteArray.readBytes(this.sectionData.getData(), this.bytesRead, iMin2);
                int i5 = this.bytesRead + iMin2;
                this.bytesRead = i5;
                int i6 = this.totalSectionLength;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.sectionSyntaxIndicator) {
                        if (androidx.media3.common.util.Util.crc32(this.sectionData.getData(), 0, this.totalSectionLength, -1) != 0) {
                            this.waitingForPayloadStart = true;
                            return;
                        }
                        this.sectionData.setLimit(this.totalSectionLength - 4);
                    } else {
                        this.sectionData.setLimit(i6);
                    }
                    this.sectionData.setPosition(0);
                    this.reader.consume(this.sectionData);
                    this.bytesRead = 0;
                }
            }
        }
    }
}
