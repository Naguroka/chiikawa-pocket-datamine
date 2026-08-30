package androidx.media3.extractor.mp4;

/* JADX INFO: loaded from: classes.dex */
final class SefReader {
    private static final int LENGTH_OF_ONE_SDR = 12;
    private static final int SAMSUNG_TAIL_SIGNATURE = 1397048916;
    private static final int STATE_CHECKING_FOR_SEF = 1;
    private static final int STATE_READING_SDRS = 2;
    private static final int STATE_READING_SEF_DATA = 3;
    private static final int STATE_SHOULD_CHECK_FOR_SEF = 0;
    private static final java.lang.String TAG = "SefReader";
    private static final int TAIL_FOOTER_LENGTH = 8;
    private static final int TAIL_HEADER_LENGTH = 12;
    private static final int TYPE_SLOW_MOTION_DATA = 2192;
    private static final int TYPE_SUPER_SLOW_DEFLICKERING_ON = 2820;
    private static final int TYPE_SUPER_SLOW_MOTION_BGM = 2817;
    private static final int TYPE_SUPER_SLOW_MOTION_DATA = 2816;
    private static final int TYPE_SUPER_SLOW_MOTION_EDIT_DATA = 2819;
    private final java.util.List<androidx.media3.extractor.mp4.SefReader.DataReference> dataReferences = new java.util.ArrayList();
    private int readerState = 0;
    private int tailLength;
    private static final com.google.common.base.Splitter COLON_SPLITTER = com.google.common.base.Splitter.on(':');
    private static final com.google.common.base.Splitter ASTERISK_SPLITTER = com.google.common.base.Splitter.on('*');

    public void reset() {
        this.dataReferences.clear();
        this.readerState = 0;
    }

    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder, java.util.List<androidx.media3.common.Metadata.Entry> list) throws java.io.IOException {
        int i = this.readerState;
        long j = 0;
        if (i == 0) {
            long length = extractorInput.getLength();
            if (length != -1 && length >= 8) {
                j = length - 8;
            }
            positionHolder.position = j;
            this.readerState = 1;
        } else if (i == 1) {
            checkForSefData(extractorInput, positionHolder);
        } else if (i == 2) {
            readSdrs(extractorInput, positionHolder);
        } else if (i == 3) {
            readSefData(extractorInput, list);
            positionHolder.position = 0L;
        } else {
            throw new java.lang.IllegalStateException();
        }
        return 1;
    }

    private void checkForSefData(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(8);
        extractorInput.readFully(parsableByteArray.getData(), 0, 8);
        this.tailLength = parsableByteArray.readLittleEndianInt() + 8;
        if (parsableByteArray.readInt() != SAMSUNG_TAIL_SIGNATURE) {
            positionHolder.position = 0L;
        } else {
            positionHolder.position = extractorInput.getPosition() - ((long) (this.tailLength - 12));
            this.readerState = 2;
        }
    }

    private void readSdrs(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) throws java.io.IOException {
        long length = extractorInput.getLength();
        int i = (this.tailLength - 12) - 8;
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(i);
        extractorInput.readFully(parsableByteArray.getData(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            parsableByteArray.skipBytes(2);
            short littleEndianShort = parsableByteArray.readLittleEndianShort();
            if (littleEndianShort == TYPE_SLOW_MOTION_DATA || littleEndianShort == TYPE_SUPER_SLOW_MOTION_DATA || littleEndianShort == TYPE_SUPER_SLOW_MOTION_BGM || littleEndianShort == TYPE_SUPER_SLOW_MOTION_EDIT_DATA || littleEndianShort == 2820) {
                this.dataReferences.add(new androidx.media3.extractor.mp4.SefReader.DataReference(littleEndianShort, (length - ((long) this.tailLength)) - ((long) parsableByteArray.readLittleEndianInt()), parsableByteArray.readLittleEndianInt()));
            } else {
                parsableByteArray.skipBytes(8);
            }
        }
        if (this.dataReferences.isEmpty()) {
            positionHolder.position = 0L;
        } else {
            this.readerState = 3;
            positionHolder.position = this.dataReferences.get(0).startOffset;
        }
    }

    private void readSefData(androidx.media3.extractor.ExtractorInput extractorInput, java.util.List<androidx.media3.common.Metadata.Entry> list) throws java.io.IOException {
        long position = extractorInput.getPosition();
        int length = (int) ((extractorInput.getLength() - extractorInput.getPosition()) - ((long) this.tailLength));
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(length);
        extractorInput.readFully(parsableByteArray.getData(), 0, length);
        for (int i = 0; i < this.dataReferences.size(); i++) {
            androidx.media3.extractor.mp4.SefReader.DataReference dataReference = this.dataReferences.get(i);
            parsableByteArray.setPosition((int) (dataReference.startOffset - position));
            parsableByteArray.skipBytes(4);
            int littleEndianInt = parsableByteArray.readLittleEndianInt();
            int iNameToDataType = nameToDataType(parsableByteArray.readString(littleEndianInt));
            int i2 = dataReference.size - (littleEndianInt + 8);
            if (iNameToDataType == TYPE_SLOW_MOTION_DATA) {
                list.add(readSlowMotionData(parsableByteArray, i2));
            } else if (iNameToDataType != TYPE_SUPER_SLOW_MOTION_DATA && iNameToDataType != TYPE_SUPER_SLOW_MOTION_BGM && iNameToDataType != TYPE_SUPER_SLOW_MOTION_EDIT_DATA && iNameToDataType != 2820) {
                throw new java.lang.IllegalStateException();
            }
        }
    }

    private static androidx.media3.extractor.metadata.mp4.SlowMotionData readSlowMotionData(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) throws androidx.media3.common.ParserException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<java.lang.String> listSplitToList = ASTERISK_SPLITTER.splitToList(parsableByteArray.readString(i));
        for (int i2 = 0; i2 < listSplitToList.size(); i2++) {
            java.util.List<java.lang.String> listSplitToList2 = COLON_SPLITTER.splitToList(listSplitToList.get(i2));
            if (listSplitToList2.size() != 3) {
                throw androidx.media3.common.ParserException.createForMalformedContainer(null, null);
            }
            try {
                arrayList.add(new androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment(java.lang.Long.parseLong(listSplitToList2.get(0)), java.lang.Long.parseLong(listSplitToList2.get(1)), 1 << (java.lang.Integer.parseInt(listSplitToList2.get(2)) - 1)));
            } catch (java.lang.NumberFormatException e) {
                throw androidx.media3.common.ParserException.createForMalformedContainer(null, e);
            }
        }
        return new androidx.media3.extractor.metadata.mp4.SlowMotionData(arrayList);
    }

    private static int nameToDataType(java.lang.String str) throws androidx.media3.common.ParserException {
        str.hashCode();
        switch (str) {
            case "SlowMotion_Data":
                return TYPE_SLOW_MOTION_DATA;
            case "Super_SlowMotion_Edit_Data":
                return TYPE_SUPER_SLOW_MOTION_EDIT_DATA;
            case "Super_SlowMotion_Data":
                return TYPE_SUPER_SLOW_MOTION_DATA;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return TYPE_SUPER_SLOW_MOTION_BGM;
            default:
                throw androidx.media3.common.ParserException.createForMalformedContainer("Invalid SEF name", null);
        }
    }

    private static final class DataReference {
        public final int dataType;
        public final int size;
        public final long startOffset;

        public DataReference(int i, long j, int i2) {
            this.dataType = i;
            this.startOffset = j;
            this.size = i2;
        }
    }
}
