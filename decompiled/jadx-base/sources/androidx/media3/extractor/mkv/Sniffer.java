package androidx.media3.extractor.mkv;

/* JADX INFO: loaded from: classes.dex */
final class Sniffer {
    private static final int ID_EBML = 440786851;
    private static final int SEARCH_LENGTH = 1024;
    private int peekLength;
    private final androidx.media3.common.util.ParsableByteArray scratch = new androidx.media3.common.util.ParsableByteArray(8);

    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        long length = extractorInput.getLength();
        long j = 1024;
        if (length != -1 && length <= 1024) {
            j = length;
        }
        int i = (int) j;
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        long unsignedInt = this.scratch.readUnsignedInt();
        this.peekLength = 4;
        while (unsignedInt != 440786851) {
            int i2 = this.peekLength + 1;
            this.peekLength = i2;
            if (i2 == i) {
                return false;
            }
            extractorInput.peekFully(this.scratch.getData(), 0, 1);
            unsignedInt = ((unsignedInt << 8) & (-256)) | ((long) (this.scratch.getData()[0] & 255));
        }
        long uint = readUint(extractorInput);
        long j2 = this.peekLength;
        if (uint == Long.MIN_VALUE) {
            return false;
        }
        if (length != -1 && j2 + uint >= length) {
            return false;
        }
        while (true) {
            int i3 = this.peekLength;
            long j3 = j2 + uint;
            if (i3 >= j3) {
                return ((long) i3) == j3;
            }
            if (readUint(extractorInput) == Long.MIN_VALUE) {
                return false;
            }
            long uint2 = readUint(extractorInput);
            if (uint2 < 0 || uint2 > 2147483647L) {
                return false;
            }
            if (uint2 != 0) {
                int i4 = (int) uint2;
                extractorInput.advancePeekPosition(i4);
                this.peekLength += i4;
            }
        }
    }

    private long readUint(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        int i = 0;
        extractorInput.peekFully(this.scratch.getData(), 0, 1);
        int i2 = this.scratch.getData()[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        extractorInput.peekFully(this.scratch.getData(), 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.scratch.getData()[i] & 255) + (i5 << 8);
        }
        this.peekLength += i4 + 1;
        return i5;
    }
}
