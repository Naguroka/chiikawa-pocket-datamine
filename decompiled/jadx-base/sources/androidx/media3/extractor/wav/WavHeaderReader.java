package androidx.media3.extractor.wav;

/* JADX INFO: loaded from: classes.dex */
final class WavHeaderReader {
    private static final java.lang.String TAG = "WavHeaderReader";

    public static boolean checkFileType(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(8);
        androidx.media3.extractor.wav.WavHeaderReader.ChunkHeader chunkHeaderPeek = androidx.media3.extractor.wav.WavHeaderReader.ChunkHeader.peek(extractorInput, parsableByteArray);
        if (chunkHeaderPeek.id != 1380533830 && chunkHeaderPeek.id != 1380333108) {
            return false;
        }
        extractorInput.peekFully(parsableByteArray.getData(), 0, 4);
        parsableByteArray.setPosition(0);
        int i = parsableByteArray.readInt();
        if (i == 1463899717) {
            return true;
        }
        androidx.media3.common.util.Log.e(TAG, "Unsupported form type: " + i);
        return false;
    }

    public static long readRf64SampleDataSize(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(8);
        androidx.media3.extractor.wav.WavHeaderReader.ChunkHeader chunkHeaderPeek = androidx.media3.extractor.wav.WavHeaderReader.ChunkHeader.peek(extractorInput, parsableByteArray);
        if (chunkHeaderPeek.id != 1685272116) {
            extractorInput.resetPeekPosition();
            return -1L;
        }
        extractorInput.advancePeekPosition(8);
        parsableByteArray.setPosition(0);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 8);
        long littleEndianLong = parsableByteArray.readLittleEndianLong();
        extractorInput.skipFully(((int) chunkHeaderPeek.size) + 8);
        return littleEndianLong;
    }

    public static androidx.media3.extractor.wav.WavFormat readFormat(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        byte[] bArr;
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(16);
        androidx.media3.extractor.wav.WavHeaderReader.ChunkHeader chunkHeaderSkipToChunk = skipToChunk(androidx.media3.extractor.WavUtil.FMT_FOURCC, extractorInput, parsableByteArray);
        androidx.media3.common.util.Assertions.checkState(chunkHeaderSkipToChunk.size >= 16);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 16);
        parsableByteArray.setPosition(0);
        int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedIntToInt = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedIntToInt2 = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedShort3 = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort4 = parsableByteArray.readLittleEndianUnsignedShort();
        int i = ((int) chunkHeaderSkipToChunk.size) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            extractorInput.peekFully(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
        }
        extractorInput.skipFully((int) (extractorInput.getPeekPosition() - extractorInput.getPosition()));
        return new androidx.media3.extractor.wav.WavFormat(littleEndianUnsignedShort, littleEndianUnsignedShort2, littleEndianUnsignedIntToInt, littleEndianUnsignedIntToInt2, littleEndianUnsignedShort3, littleEndianUnsignedShort4, bArr);
    }

    public static android.util.Pair<java.lang.Long, java.lang.Long> skipToSampleData(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        extractorInput.resetPeekPosition();
        androidx.media3.extractor.wav.WavHeaderReader.ChunkHeader chunkHeaderSkipToChunk = skipToChunk(1684108385, extractorInput, new androidx.media3.common.util.ParsableByteArray(8));
        extractorInput.skipFully(8);
        return android.util.Pair.create(java.lang.Long.valueOf(extractorInput.getPosition()), java.lang.Long.valueOf(chunkHeaderSkipToChunk.size));
    }

    private static androidx.media3.extractor.wav.WavHeaderReader.ChunkHeader skipToChunk(int i, androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.common.util.ParsableByteArray parsableByteArray) throws java.io.IOException {
        androidx.media3.extractor.wav.WavHeaderReader.ChunkHeader chunkHeaderPeek = androidx.media3.extractor.wav.WavHeaderReader.ChunkHeader.peek(extractorInput, parsableByteArray);
        while (chunkHeaderPeek.id != i) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring unknown WAV chunk: " + chunkHeaderPeek.id);
            long j = chunkHeaderPeek.size + 8;
            if (chunkHeaderPeek.size % 2 != 0) {
                j++;
            }
            if (j > 2147483647L) {
                throw androidx.media3.common.ParserException.createForUnsupportedContainerFeature("Chunk is too large (~2GB+) to skip; id: " + chunkHeaderPeek.id);
            }
            extractorInput.skipFully((int) j);
            chunkHeaderPeek = androidx.media3.extractor.wav.WavHeaderReader.ChunkHeader.peek(extractorInput, parsableByteArray);
        }
        return chunkHeaderPeek;
    }

    private WavHeaderReader() {
    }

    private static final class ChunkHeader {
        public static final int SIZE_IN_BYTES = 8;
        public final int id;
        public final long size;

        private ChunkHeader(int i, long j) {
            this.id = i;
            this.size = j;
        }

        public static androidx.media3.extractor.wav.WavHeaderReader.ChunkHeader peek(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.common.util.ParsableByteArray parsableByteArray) throws java.io.IOException {
            extractorInput.peekFully(parsableByteArray.getData(), 0, 8);
            parsableByteArray.setPosition(0);
            return new androidx.media3.extractor.wav.WavHeaderReader.ChunkHeader(parsableByteArray.readInt(), parsableByteArray.readLittleEndianUnsignedInt());
        }
    }
}
