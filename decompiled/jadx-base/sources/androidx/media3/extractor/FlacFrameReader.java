package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class FlacFrameReader {

    public static final class SampleNumberHolder {
        public long sampleNumber;
    }

    public static boolean checkAndReadFrameHeader(androidx.media3.common.util.ParsableByteArray parsableByteArray, androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata, int i, androidx.media3.extractor.FlacFrameReader.SampleNumberHolder sampleNumberHolder) {
        int position = parsableByteArray.getPosition();
        long unsignedInt = parsableByteArray.readUnsignedInt();
        long j = unsignedInt >>> 16;
        if (j != i) {
            return false;
        }
        return checkChannelAssignment((int) ((unsignedInt >> 4) & 15), flacStreamMetadata) && checkBitsPerSample((int) ((unsignedInt >> 1) & 7), flacStreamMetadata) && !(((unsignedInt & 1) > 1L ? 1 : ((unsignedInt & 1) == 1L ? 0 : -1)) == 0) && checkAndReadFirstSampleNumber(parsableByteArray, flacStreamMetadata, ((j & 1) > 1L ? 1 : ((j & 1) == 1L ? 0 : -1)) == 0, sampleNumberHolder) && checkAndReadBlockSizeSamples(parsableByteArray, flacStreamMetadata, (int) ((unsignedInt >> 12) & 15)) && checkAndReadSampleRate(parsableByteArray, flacStreamMetadata, (int) ((unsignedInt >> 8) & 15)) && checkAndReadCrc(parsableByteArray, position);
    }

    public static boolean checkFrameHeaderFromPeek(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata, int i, androidx.media3.extractor.FlacFrameReader.SampleNumberHolder sampleNumberHolder) throws java.io.IOException {
        long peekPosition = extractorInput.getPeekPosition();
        byte[] bArr = new byte[2];
        extractorInput.peekFully(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            extractorInput.resetPeekPosition();
            extractorInput.advancePeekPosition((int) (peekPosition - extractorInput.getPosition()));
            return false;
        }
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(16);
        java.lang.System.arraycopy(bArr, 0, parsableByteArray.getData(), 0, 2);
        parsableByteArray.setLimit(androidx.media3.extractor.ExtractorUtil.peekToLength(extractorInput, parsableByteArray.getData(), 2, 14));
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition((int) (peekPosition - extractorInput.getPosition()));
        return checkAndReadFrameHeader(parsableByteArray, flacStreamMetadata, i, sampleNumberHolder);
    }

    public static long getFirstSampleNumber(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata) throws java.io.IOException {
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(1);
        byte[] bArr = new byte[1];
        extractorInput.peekFully(bArr, 0, 1);
        boolean z = (bArr[0] & 1) == 1;
        extractorInput.advancePeekPosition(2);
        int i = z ? 7 : 6;
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(i);
        parsableByteArray.setLimit(androidx.media3.extractor.ExtractorUtil.peekToLength(extractorInput, parsableByteArray.getData(), 0, i));
        extractorInput.resetPeekPosition();
        androidx.media3.extractor.FlacFrameReader.SampleNumberHolder sampleNumberHolder = new androidx.media3.extractor.FlacFrameReader.SampleNumberHolder();
        if (!checkAndReadFirstSampleNumber(parsableByteArray, flacStreamMetadata, z, sampleNumberHolder)) {
            throw androidx.media3.common.ParserException.createForMalformedContainer(null, null);
        }
        return sampleNumberHolder.sampleNumber;
    }

    public static int readFrameBlockSizeSamplesFromKey(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return parsableByteArray.readUnsignedByte() + 1;
            case 7:
                return parsableByteArray.readUnsignedShort() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    private static boolean checkChannelAssignment(int i, androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata) {
        if (i <= 7) {
            return i == flacStreamMetadata.channels - 1;
        }
        return i <= 10 && flacStreamMetadata.channels == 2;
    }

    private static boolean checkBitsPerSample(int i, androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata) {
        return i == 0 || i == flacStreamMetadata.bitsPerSampleLookupKey;
    }

    private static boolean checkAndReadFirstSampleNumber(androidx.media3.common.util.ParsableByteArray parsableByteArray, androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata, boolean z, androidx.media3.extractor.FlacFrameReader.SampleNumberHolder sampleNumberHolder) {
        try {
            long utf8EncodedLong = parsableByteArray.readUtf8EncodedLong();
            if (!z) {
                utf8EncodedLong *= (long) flacStreamMetadata.maxBlockSizeSamples;
            }
            sampleNumberHolder.sampleNumber = utf8EncodedLong;
            return true;
        } catch (java.lang.NumberFormatException unused) {
            return false;
        }
    }

    private static boolean checkAndReadBlockSizeSamples(androidx.media3.common.util.ParsableByteArray parsableByteArray, androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata, int i) {
        int frameBlockSizeSamplesFromKey = readFrameBlockSizeSamplesFromKey(parsableByteArray, i);
        return frameBlockSizeSamplesFromKey != -1 && frameBlockSizeSamplesFromKey <= flacStreamMetadata.maxBlockSizeSamples;
    }

    private static boolean checkAndReadSampleRate(androidx.media3.common.util.ParsableByteArray parsableByteArray, androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata, int i) {
        int i2 = flacStreamMetadata.sampleRate;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == flacStreamMetadata.sampleRateLookupKey;
        }
        if (i == 12) {
            return parsableByteArray.readUnsignedByte() * 1000 == i2;
        }
        if (i > 14) {
            return false;
        }
        int unsignedShort = parsableByteArray.readUnsignedShort();
        if (i == 14) {
            unsignedShort *= 10;
        }
        return unsignedShort == i2;
    }

    private static boolean checkAndReadCrc(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        return parsableByteArray.readUnsignedByte() == androidx.media3.common.util.Util.crc8(parsableByteArray.getData(), i, parsableByteArray.getPosition() - 1, 0);
    }

    private FlacFrameReader() {
    }
}
