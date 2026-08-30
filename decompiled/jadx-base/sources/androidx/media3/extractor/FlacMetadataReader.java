package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class FlacMetadataReader {
    private static final int SEEK_POINT_SIZE = 18;
    private static final int STREAM_MARKER = 1716281667;
    private static final int SYNC_CODE = 16382;

    public static final class FlacStreamMetadataHolder {
        public androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata;

        public FlacStreamMetadataHolder(androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata) {
            this.flacStreamMetadata = flacStreamMetadata;
        }
    }

    public static androidx.media3.common.Metadata peekId3Metadata(androidx.media3.extractor.ExtractorInput extractorInput, boolean z) throws java.io.IOException {
        androidx.media3.common.Metadata metadataPeekId3Data = new androidx.media3.extractor.Id3Peeker().peekId3Data(extractorInput, z ? null : androidx.media3.extractor.metadata.id3.Id3Decoder.NO_FRAMES_PREDICATE);
        if (metadataPeekId3Data == null || metadataPeekId3Data.length() == 0) {
            return null;
        }
        return metadataPeekId3Data;
    }

    public static boolean checkAndPeekStreamMarker(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(4);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 4);
        return parsableByteArray.readUnsignedInt() == 1716281667;
    }

    public static androidx.media3.common.Metadata readId3Metadata(androidx.media3.extractor.ExtractorInput extractorInput, boolean z) throws java.io.IOException {
        extractorInput.resetPeekPosition();
        long peekPosition = extractorInput.getPeekPosition();
        androidx.media3.common.Metadata metadataPeekId3Metadata = peekId3Metadata(extractorInput, z);
        extractorInput.skipFully((int) (extractorInput.getPeekPosition() - peekPosition));
        return metadataPeekId3Metadata;
    }

    public static void readStreamMarker(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(4);
        extractorInput.readFully(parsableByteArray.getData(), 0, 4);
        if (parsableByteArray.readUnsignedInt() != 1716281667) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("Failed to read FLAC stream marker.", null);
        }
    }

    public static boolean readMetadataBlock(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.FlacMetadataReader.FlacStreamMetadataHolder flacStreamMetadataHolder) throws java.io.IOException {
        extractorInput.resetPeekPosition();
        androidx.media3.common.util.ParsableBitArray parsableBitArray = new androidx.media3.common.util.ParsableBitArray(new byte[4]);
        extractorInput.peekFully(parsableBitArray.data, 0, 4);
        boolean bit = parsableBitArray.readBit();
        int bits = parsableBitArray.readBits(7);
        int bits2 = parsableBitArray.readBits(24) + 4;
        if (bits == 0) {
            flacStreamMetadataHolder.flacStreamMetadata = readStreamInfoBlock(extractorInput);
        } else {
            androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata = flacStreamMetadataHolder.flacStreamMetadata;
            if (flacStreamMetadata == null) {
                throw new java.lang.IllegalArgumentException();
            }
            if (bits == 3) {
                flacStreamMetadataHolder.flacStreamMetadata = flacStreamMetadata.copyWithSeekTable(readSeekTableMetadataBlock(extractorInput, bits2));
            } else if (bits == 4) {
                flacStreamMetadataHolder.flacStreamMetadata = flacStreamMetadata.copyWithVorbisComments(readVorbisCommentMetadataBlock(extractorInput, bits2));
            } else if (bits == 6) {
                androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(bits2);
                extractorInput.readFully(parsableByteArray.getData(), 0, bits2);
                parsableByteArray.skipBytes(4);
                flacStreamMetadataHolder.flacStreamMetadata = flacStreamMetadata.copyWithPictureFrames(com.google.common.collect.ImmutableList.of(androidx.media3.extractor.metadata.flac.PictureFrame.fromPictureBlock(parsableByteArray)));
            } else {
                extractorInput.skipFully(bits2);
            }
        }
        return bit;
    }

    public static androidx.media3.extractor.FlacStreamMetadata.SeekTable readSeekTableMetadataBlock(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(1);
        int unsignedInt24 = parsableByteArray.readUnsignedInt24();
        long position = ((long) parsableByteArray.getPosition()) + ((long) unsignedInt24);
        int i = unsignedInt24 / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long j = parsableByteArray.readLong();
            if (j == -1) {
                jArrCopyOf = java.util.Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = java.util.Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = j;
            jArrCopyOf2[i2] = parsableByteArray.readLong();
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes((int) (position - ((long) parsableByteArray.getPosition())));
        return new androidx.media3.extractor.FlacStreamMetadata.SeekTable(jArrCopyOf, jArrCopyOf2);
    }

    public static int getFrameStartMarker(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        extractorInput.resetPeekPosition();
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(2);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 2);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        if ((unsignedShort >> 2) != SYNC_CODE) {
            extractorInput.resetPeekPosition();
            throw androidx.media3.common.ParserException.createForMalformedContainer("First frame does not start with sync code.", null);
        }
        extractorInput.resetPeekPosition();
        return unsignedShort;
    }

    private static androidx.media3.extractor.FlacStreamMetadata readStreamInfoBlock(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        byte[] bArr = new byte[38];
        extractorInput.readFully(bArr, 0, 38);
        return new androidx.media3.extractor.FlacStreamMetadata(bArr, 4);
    }

    private static androidx.media3.extractor.FlacStreamMetadata.SeekTable readSeekTableMetadataBlock(androidx.media3.extractor.ExtractorInput extractorInput, int i) throws java.io.IOException {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(i);
        extractorInput.readFully(parsableByteArray.getData(), 0, i);
        return readSeekTableMetadataBlock(parsableByteArray);
    }

    private static java.util.List<java.lang.String> readVorbisCommentMetadataBlock(androidx.media3.extractor.ExtractorInput extractorInput, int i) throws java.io.IOException {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(i);
        extractorInput.readFully(parsableByteArray.getData(), 0, i);
        parsableByteArray.skipBytes(4);
        return java.util.Arrays.asList(androidx.media3.extractor.VorbisUtil.readVorbisCommentHeader(parsableByteArray, false, false).comments);
    }

    private FlacMetadataReader() {
    }
}
