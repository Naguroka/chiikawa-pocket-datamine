package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
final class PsBinarySearchSeeker extends androidx.media3.extractor.BinarySearchSeeker {
    private static final int MINIMUM_SEARCH_RANGE_BYTES = 1000;
    private static final long SEEK_TOLERANCE_US = 100000;
    private static final int TIMESTAMP_SEARCH_BYTES = 20000;

    public PsBinarySearchSeeker(androidx.media3.common.util.TimestampAdjuster timestampAdjuster, long j, long j2) {
        super(new androidx.media3.extractor.BinarySearchSeeker.DefaultSeekTimestampConverter(), new androidx.media3.extractor.ts.PsBinarySearchSeeker.PsScrSeeker(timestampAdjuster), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    private static final class PsScrSeeker implements androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker {
        private final androidx.media3.common.util.ParsableByteArray packetBuffer;
        private final androidx.media3.common.util.TimestampAdjuster scrTimestampAdjuster;

        private PsScrSeeker(androidx.media3.common.util.TimestampAdjuster timestampAdjuster) {
            this.scrTimestampAdjuster = timestampAdjuster;
            this.packetBuffer = new androidx.media3.common.util.ParsableByteArray();
        }

        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult searchForTimestamp(androidx.media3.extractor.ExtractorInput extractorInput, long j) throws java.io.IOException {
            long position = extractorInput.getPosition();
            int iMin = (int) java.lang.Math.min(20000L, extractorInput.getLength() - position);
            this.packetBuffer.reset(iMin);
            extractorInput.peekFully(this.packetBuffer.getData(), 0, iMin);
            return searchForScrValueInBuffer(this.packetBuffer, j, position);
        }

        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public void onSeekFinished() {
            this.packetBuffer.reset(androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY);
        }

        private androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult searchForScrValueInBuffer(androidx.media3.common.util.ParsableByteArray parsableByteArray, long j, long j2) {
            int position = -1;
            int position2 = -1;
            long j3 = -9223372036854775807L;
            while (parsableByteArray.bytesLeft() >= 4) {
                if (androidx.media3.extractor.ts.PsBinarySearchSeeker.peekIntAtPosition(parsableByteArray.getData(), parsableByteArray.getPosition()) != 442) {
                    parsableByteArray.skipBytes(1);
                } else {
                    parsableByteArray.skipBytes(4);
                    long scrValueFromPack = androidx.media3.extractor.ts.PsDurationReader.readScrValueFromPack(parsableByteArray);
                    if (scrValueFromPack != androidx.media3.common.C.TIME_UNSET) {
                        long jAdjustTsTimestamp = this.scrTimestampAdjuster.adjustTsTimestamp(scrValueFromPack);
                        if (jAdjustTsTimestamp > j) {
                            if (j3 == androidx.media3.common.C.TIME_UNSET) {
                                return androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult.overestimatedResult(jAdjustTsTimestamp, j2);
                            }
                            return androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult.targetFoundResult(j2 + ((long) position2));
                        }
                        if (100000 + jAdjustTsTimestamp > j) {
                            return androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult.targetFoundResult(j2 + ((long) parsableByteArray.getPosition()));
                        }
                        position2 = parsableByteArray.getPosition();
                        j3 = jAdjustTsTimestamp;
                    }
                    skipToEndOfCurrentPack(parsableByteArray);
                    position = parsableByteArray.getPosition();
                }
            }
            if (j3 != androidx.media3.common.C.TIME_UNSET) {
                return androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult.underestimatedResult(j3, j2 + ((long) position));
            }
            return androidx.media3.extractor.BinarySearchSeeker.TimestampSearchResult.NO_TIMESTAMP_IN_RANGE_RESULT;
        }

        private static void skipToEndOfCurrentPack(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
            int iPeekIntAtPosition;
            int iLimit = parsableByteArray.limit();
            if (parsableByteArray.bytesLeft() < 10) {
                parsableByteArray.setPosition(iLimit);
                return;
            }
            parsableByteArray.skipBytes(9);
            int unsignedByte = parsableByteArray.readUnsignedByte() & 7;
            if (parsableByteArray.bytesLeft() < unsignedByte) {
                parsableByteArray.setPosition(iLimit);
                return;
            }
            parsableByteArray.skipBytes(unsignedByte);
            if (parsableByteArray.bytesLeft() >= 4) {
                if (androidx.media3.extractor.ts.PsBinarySearchSeeker.peekIntAtPosition(parsableByteArray.getData(), parsableByteArray.getPosition()) == 443) {
                    parsableByteArray.skipBytes(4);
                    int unsignedShort = parsableByteArray.readUnsignedShort();
                    if (parsableByteArray.bytesLeft() < unsignedShort) {
                        parsableByteArray.setPosition(iLimit);
                        return;
                    }
                    parsableByteArray.skipBytes(unsignedShort);
                }
                while (parsableByteArray.bytesLeft() >= 4 && (iPeekIntAtPosition = androidx.media3.extractor.ts.PsBinarySearchSeeker.peekIntAtPosition(parsableByteArray.getData(), parsableByteArray.getPosition())) != 442 && iPeekIntAtPosition != 441 && (iPeekIntAtPosition >>> 8) == 1) {
                    parsableByteArray.skipBytes(4);
                    if (parsableByteArray.bytesLeft() < 2) {
                        parsableByteArray.setPosition(iLimit);
                        return;
                    }
                    parsableByteArray.setPosition(java.lang.Math.min(parsableByteArray.limit(), parsableByteArray.getPosition() + parsableByteArray.readUnsignedShort()));
                }
                return;
            }
            parsableByteArray.setPosition(iLimit);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int peekIntAtPosition(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
