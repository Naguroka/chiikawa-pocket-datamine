package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
final class TsDurationReader {
    private static final java.lang.String TAG = "TsDurationReader";
    private boolean isDurationRead;
    private boolean isFirstPcrValueRead;
    private boolean isLastPcrValueRead;
    private final int timestampSearchBytes;
    private final androidx.media3.common.util.TimestampAdjuster pcrTimestampAdjuster = new androidx.media3.common.util.TimestampAdjuster(0);
    private long firstPcrValue = androidx.media3.common.C.TIME_UNSET;
    private long lastPcrValue = androidx.media3.common.C.TIME_UNSET;
    private long durationUs = androidx.media3.common.C.TIME_UNSET;
    private final androidx.media3.common.util.ParsableByteArray packetBuffer = new androidx.media3.common.util.ParsableByteArray();

    TsDurationReader(int i) {
        this.timestampSearchBytes = i;
    }

    public boolean isDurationReadFinished() {
        return this.isDurationRead;
    }

    public int readDuration(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder, int i) throws java.io.IOException {
        if (i <= 0) {
            return finishReadDuration(extractorInput);
        }
        if (!this.isLastPcrValueRead) {
            return readLastPcrValue(extractorInput, positionHolder, i);
        }
        if (this.lastPcrValue == androidx.media3.common.C.TIME_UNSET) {
            return finishReadDuration(extractorInput);
        }
        if (!this.isFirstPcrValueRead) {
            return readFirstPcrValue(extractorInput, positionHolder, i);
        }
        long j = this.firstPcrValue;
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return finishReadDuration(extractorInput);
        }
        this.durationUs = this.pcrTimestampAdjuster.adjustTsTimestampGreaterThanPreviousTimestamp(this.lastPcrValue) - this.pcrTimestampAdjuster.adjustTsTimestamp(j);
        return finishReadDuration(extractorInput);
    }

    public long getDurationUs() {
        return this.durationUs;
    }

    public androidx.media3.common.util.TimestampAdjuster getPcrTimestampAdjuster() {
        return this.pcrTimestampAdjuster;
    }

    private int finishReadDuration(androidx.media3.extractor.ExtractorInput extractorInput) {
        this.packetBuffer.reset(androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY);
        this.isDurationRead = true;
        extractorInput.resetPeekPosition();
        return 0;
    }

    private int readFirstPcrValue(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder, int i) throws java.io.IOException {
        int iMin = (int) java.lang.Math.min(this.timestampSearchBytes, extractorInput.getLength());
        long j = 0;
        if (extractorInput.getPosition() != j) {
            positionHolder.position = j;
            return 1;
        }
        this.packetBuffer.reset(iMin);
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.packetBuffer.getData(), 0, iMin);
        this.firstPcrValue = readFirstPcrValueFromBuffer(this.packetBuffer, i);
        this.isFirstPcrValueRead = true;
        return 0;
    }

    private long readFirstPcrValueFromBuffer(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        int iLimit = parsableByteArray.limit();
        for (int position = parsableByteArray.getPosition(); position < iLimit; position++) {
            if (parsableByteArray.getData()[position] == 71) {
                long pcrFromPacket = androidx.media3.extractor.ts.TsUtil.readPcrFromPacket(parsableByteArray, position, i);
                if (pcrFromPacket != androidx.media3.common.C.TIME_UNSET) {
                    return pcrFromPacket;
                }
            }
        }
        return androidx.media3.common.C.TIME_UNSET;
    }

    private int readLastPcrValue(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder, int i) throws java.io.IOException {
        long length = extractorInput.getLength();
        int iMin = (int) java.lang.Math.min(this.timestampSearchBytes, length);
        long j = length - ((long) iMin);
        if (extractorInput.getPosition() != j) {
            positionHolder.position = j;
            return 1;
        }
        this.packetBuffer.reset(iMin);
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.packetBuffer.getData(), 0, iMin);
        this.lastPcrValue = readLastPcrValueFromBuffer(this.packetBuffer, i);
        this.isLastPcrValueRead = true;
        return 0;
    }

    private long readLastPcrValueFromBuffer(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        for (int i2 = iLimit - 188; i2 >= position; i2--) {
            if (androidx.media3.extractor.ts.TsUtil.isStartOfTsPacket(parsableByteArray.getData(), position, iLimit, i2)) {
                long pcrFromPacket = androidx.media3.extractor.ts.TsUtil.readPcrFromPacket(parsableByteArray, i2, i);
                if (pcrFromPacket != androidx.media3.common.C.TIME_UNSET) {
                    return pcrFromPacket;
                }
            }
        }
        return androidx.media3.common.C.TIME_UNSET;
    }
}
