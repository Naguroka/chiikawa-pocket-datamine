package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
final class PsDurationReader {
    private static final java.lang.String TAG = "PsDurationReader";
    private static final int TIMESTAMP_SEARCH_BYTES = 20000;
    private boolean isDurationRead;
    private boolean isFirstScrValueRead;
    private boolean isLastScrValueRead;
    private final androidx.media3.common.util.TimestampAdjuster scrTimestampAdjuster = new androidx.media3.common.util.TimestampAdjuster(0);
    private long firstScrValue = androidx.media3.common.C.TIME_UNSET;
    private long lastScrValue = androidx.media3.common.C.TIME_UNSET;
    private long durationUs = androidx.media3.common.C.TIME_UNSET;
    private final androidx.media3.common.util.ParsableByteArray packetBuffer = new androidx.media3.common.util.ParsableByteArray();

    PsDurationReader() {
    }

    public boolean isDurationReadFinished() {
        return this.isDurationRead;
    }

    public androidx.media3.common.util.TimestampAdjuster getScrTimestampAdjuster() {
        return this.scrTimestampAdjuster;
    }

    public int readDuration(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        if (!this.isLastScrValueRead) {
            return readLastScrValue(extractorInput, positionHolder);
        }
        if (this.lastScrValue == androidx.media3.common.C.TIME_UNSET) {
            return finishReadDuration(extractorInput);
        }
        if (!this.isFirstScrValueRead) {
            return readFirstScrValue(extractorInput, positionHolder);
        }
        long j = this.firstScrValue;
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return finishReadDuration(extractorInput);
        }
        this.durationUs = this.scrTimestampAdjuster.adjustTsTimestampGreaterThanPreviousTimestamp(this.lastScrValue) - this.scrTimestampAdjuster.adjustTsTimestamp(j);
        return finishReadDuration(extractorInput);
    }

    public long getDurationUs() {
        return this.durationUs;
    }

    public static long readScrValueFromPack(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        if (parsableByteArray.bytesLeft() < 9) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        parsableByteArray.readBytes(bArr, 0, 9);
        parsableByteArray.setPosition(position);
        return !checkMarkerBits(bArr) ? androidx.media3.common.C.TIME_UNSET : readScrValueFromPackHeader(bArr);
    }

    private int finishReadDuration(androidx.media3.extractor.ExtractorInput extractorInput) {
        this.packetBuffer.reset(androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY);
        this.isDurationRead = true;
        extractorInput.resetPeekPosition();
        return 0;
    }

    private int readFirstScrValue(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        int iMin = (int) java.lang.Math.min(20000L, extractorInput.getLength());
        long j = 0;
        if (extractorInput.getPosition() != j) {
            positionHolder.position = j;
            return 1;
        }
        this.packetBuffer.reset(iMin);
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.packetBuffer.getData(), 0, iMin);
        this.firstScrValue = readFirstScrValueFromBuffer(this.packetBuffer);
        this.isFirstScrValueRead = true;
        return 0;
    }

    private long readFirstScrValueFromBuffer(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int iLimit = parsableByteArray.limit();
        for (int position = parsableByteArray.getPosition(); position < iLimit - 3; position++) {
            if (peekIntAtPosition(parsableByteArray.getData(), position) == 442) {
                parsableByteArray.setPosition(position + 4);
                long scrValueFromPack = readScrValueFromPack(parsableByteArray);
                if (scrValueFromPack != androidx.media3.common.C.TIME_UNSET) {
                    return scrValueFromPack;
                }
            }
        }
        return androidx.media3.common.C.TIME_UNSET;
    }

    private int readLastScrValue(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        long length = extractorInput.getLength();
        int iMin = (int) java.lang.Math.min(20000L, length);
        long j = length - ((long) iMin);
        if (extractorInput.getPosition() != j) {
            positionHolder.position = j;
            return 1;
        }
        this.packetBuffer.reset(iMin);
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.packetBuffer.getData(), 0, iMin);
        this.lastScrValue = readLastScrValueFromBuffer(this.packetBuffer);
        this.isLastScrValueRead = true;
        return 0;
    }

    private long readLastScrValueFromBuffer(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        for (int iLimit = parsableByteArray.limit() - 4; iLimit >= position; iLimit--) {
            if (peekIntAtPosition(parsableByteArray.getData(), iLimit) == 442) {
                parsableByteArray.setPosition(iLimit + 4);
                long scrValueFromPack = readScrValueFromPack(parsableByteArray);
                if (scrValueFromPack != androidx.media3.common.C.TIME_UNSET) {
                    return scrValueFromPack;
                }
            }
        }
        return androidx.media3.common.C.TIME_UNSET;
    }

    private int peekIntAtPosition(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    private static boolean checkMarkerBits(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private static long readScrValueFromPackHeader(byte[] bArr) {
        byte b = bArr[0];
        long j = (((((long) b) & 56) >> 3) << 30) | ((((long) b) & 3) << 28) | ((((long) bArr[1]) & 255) << 20);
        byte b2 = bArr[2];
        return j | (((((long) b2) & 248) >> 3) << 15) | ((((long) b2) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }
}
