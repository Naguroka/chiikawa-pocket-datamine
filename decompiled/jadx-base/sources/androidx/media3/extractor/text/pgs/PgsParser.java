package androidx.media3.extractor.text.pgs;

/* JADX INFO: loaded from: classes.dex */
public final class PgsParser implements androidx.media3.extractor.text.SubtitleParser {
    public static final int CUE_REPLACEMENT_BEHAVIOR = 2;
    private static final byte INFLATE_HEADER = 120;
    private static final int SECTION_TYPE_BITMAP_PICTURE = 21;
    private static final int SECTION_TYPE_END = 128;
    private static final int SECTION_TYPE_IDENTIFIER = 22;
    private static final int SECTION_TYPE_PALETTE = 20;
    private java.util.zip.Inflater inflater;
    private final androidx.media3.common.util.ParsableByteArray buffer = new androidx.media3.common.util.ParsableByteArray();
    private final androidx.media3.common.util.ParsableByteArray inflatedBuffer = new androidx.media3.common.util.ParsableByteArray();
    private final androidx.media3.extractor.text.pgs.PgsParser.CueBuilder cueBuilder = new androidx.media3.extractor.text.pgs.PgsParser.CueBuilder();

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 2;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i, int i2, androidx.media3.extractor.text.SubtitleParser.OutputOptions outputOptions, androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer) {
        this.buffer.reset(bArr, i2 + i);
        this.buffer.setPosition(i);
        maybeInflateData(this.buffer);
        this.cueBuilder.reset();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (this.buffer.bytesLeft() >= 3) {
            androidx.media3.common.text.Cue nextSection = readNextSection(this.buffer, this.cueBuilder);
            if (nextSection != null) {
                arrayList.add(nextSection);
            }
        }
        consumer.accept(new androidx.media3.extractor.text.CuesWithTiming(arrayList, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET));
    }

    private void maybeInflateData(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() <= 0 || parsableByteArray.peekUnsignedByte() != 120) {
            return;
        }
        if (this.inflater == null) {
            this.inflater = new java.util.zip.Inflater();
        }
        if (androidx.media3.common.util.Util.inflate(parsableByteArray, this.inflatedBuffer, this.inflater)) {
            parsableByteArray.reset(this.inflatedBuffer.getData(), this.inflatedBuffer.limit());
        }
    }

    private static androidx.media3.common.text.Cue readNextSection(androidx.media3.common.util.ParsableByteArray parsableByteArray, androidx.media3.extractor.text.pgs.PgsParser.CueBuilder cueBuilder) {
        int iLimit = parsableByteArray.limit();
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int position = parsableByteArray.getPosition() + unsignedShort;
        androidx.media3.common.text.Cue cueBuild = null;
        if (position > iLimit) {
            parsableByteArray.setPosition(iLimit);
            return null;
        }
        if (unsignedByte == 128) {
            cueBuild = cueBuilder.build();
            cueBuilder.reset();
        } else {
            switch (unsignedByte) {
                case 20:
                    cueBuilder.parsePaletteSection(parsableByteArray, unsignedShort);
                    break;
                case 21:
                    cueBuilder.parseBitmapSection(parsableByteArray, unsignedShort);
                    break;
                case 22:
                    cueBuilder.parseIdentifierSection(parsableByteArray, unsignedShort);
                    break;
            }
        }
        parsableByteArray.setPosition(position);
        return cueBuild;
    }

    private static final class CueBuilder {
        private int bitmapHeight;
        private int bitmapWidth;
        private int bitmapX;
        private int bitmapY;
        private boolean colorsSet;
        private int planeHeight;
        private int planeWidth;
        private final androidx.media3.common.util.ParsableByteArray bitmapData = new androidx.media3.common.util.ParsableByteArray();
        private final int[] colors = new int[256];

        /* JADX INFO: Access modifiers changed from: private */
        public void parsePaletteSection(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
            if (i % 5 != 2) {
                return;
            }
            parsableByteArray.skipBytes(2);
            java.util.Arrays.fill(this.colors, 0);
            int i2 = i / 5;
            for (int i3 = 0; i3 < i2; i3++) {
                int unsignedByte = parsableByteArray.readUnsignedByte();
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                int unsignedByte3 = parsableByteArray.readUnsignedByte();
                int unsignedByte4 = parsableByteArray.readUnsignedByte();
                double d = unsignedByte2;
                double d2 = unsignedByte3 - 128;
                double d3 = unsignedByte4 - 128;
                this.colors[unsignedByte] = (androidx.media3.common.util.Util.constrainValue((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (parsableByteArray.readUnsignedByte() << 24) | (androidx.media3.common.util.Util.constrainValue((int) ((1.402d * d2) + d), 0, 255) << 16) | androidx.media3.common.util.Util.constrainValue((int) (d + (d3 * 1.772d)), 0, 255);
            }
            this.colorsSet = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void parseBitmapSection(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
            int unsignedInt24;
            if (i < 4) {
                return;
            }
            parsableByteArray.skipBytes(3);
            int i2 = i - 4;
            if ((parsableByteArray.readUnsignedByte() & 128) != 0) {
                if (i2 < 7 || (unsignedInt24 = parsableByteArray.readUnsignedInt24()) < 4) {
                    return;
                }
                this.bitmapWidth = parsableByteArray.readUnsignedShort();
                this.bitmapHeight = parsableByteArray.readUnsignedShort();
                this.bitmapData.reset(unsignedInt24 - 4);
                i2 -= 7;
            }
            int position = this.bitmapData.getPosition();
            int iLimit = this.bitmapData.limit();
            if (position >= iLimit || i2 <= 0) {
                return;
            }
            int iMin = java.lang.Math.min(i2, iLimit - position);
            parsableByteArray.readBytes(this.bitmapData.getData(), position, iMin);
            this.bitmapData.setPosition(position + iMin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void parseIdentifierSection(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
            if (i < 19) {
                return;
            }
            this.planeWidth = parsableByteArray.readUnsignedShort();
            this.planeHeight = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(11);
            this.bitmapX = parsableByteArray.readUnsignedShort();
            this.bitmapY = parsableByteArray.readUnsignedShort();
        }

        public androidx.media3.common.text.Cue build() {
            int unsignedByte;
            if (this.planeWidth == 0 || this.planeHeight == 0 || this.bitmapWidth == 0 || this.bitmapHeight == 0 || this.bitmapData.limit() == 0 || this.bitmapData.getPosition() != this.bitmapData.limit() || !this.colorsSet) {
                return null;
            }
            this.bitmapData.setPosition(0);
            int i = this.bitmapWidth * this.bitmapHeight;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int unsignedByte2 = this.bitmapData.readUnsignedByte();
                if (unsignedByte2 != 0) {
                    unsignedByte = i2 + 1;
                    iArr[i2] = this.colors[unsignedByte2];
                } else {
                    int unsignedByte3 = this.bitmapData.readUnsignedByte();
                    if (unsignedByte3 != 0) {
                        unsignedByte = ((unsignedByte3 & 64) == 0 ? unsignedByte3 & 63 : ((unsignedByte3 & 63) << 8) | this.bitmapData.readUnsignedByte()) + i2;
                        java.util.Arrays.fill(iArr, i2, unsignedByte, (unsignedByte3 & 128) == 0 ? this.colors[0] : this.colors[this.bitmapData.readUnsignedByte()]);
                    }
                }
                i2 = unsignedByte;
            }
            return new androidx.media3.common.text.Cue.Builder().setBitmap(android.graphics.Bitmap.createBitmap(iArr, this.bitmapWidth, this.bitmapHeight, android.graphics.Bitmap.Config.ARGB_8888)).setPosition(this.bitmapX / this.planeWidth).setPositionAnchor(0).setLine(this.bitmapY / this.planeHeight, 0).setLineAnchor(0).setSize(this.bitmapWidth / this.planeWidth).setBitmapHeight(this.bitmapHeight / this.planeHeight).build();
        }

        public void reset() {
            this.planeWidth = 0;
            this.planeHeight = 0;
            this.bitmapX = 0;
            this.bitmapY = 0;
            this.bitmapWidth = 0;
            this.bitmapHeight = 0;
            this.bitmapData.reset(0);
            this.colorsSet = false;
        }
    }
}
