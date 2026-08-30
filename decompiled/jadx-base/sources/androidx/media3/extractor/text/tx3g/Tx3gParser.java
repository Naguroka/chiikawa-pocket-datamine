package androidx.media3.extractor.text.tx3g;

/* JADX INFO: loaded from: classes.dex */
public final class Tx3gParser implements androidx.media3.extractor.text.SubtitleParser {
    public static final int CUE_REPLACEMENT_BEHAVIOR = 2;
    private static final int DEFAULT_COLOR = -1;
    private static final int DEFAULT_FONT_FACE = 0;
    private static final java.lang.String DEFAULT_FONT_FAMILY = "sans-serif";
    private static final float DEFAULT_VERTICAL_PLACEMENT = 0.85f;
    private static final int FONT_FACE_BOLD = 1;
    private static final int FONT_FACE_ITALIC = 2;
    private static final int FONT_FACE_UNDERLINE = 4;
    private static final int SIZE_ATOM_HEADER = 8;
    private static final int SIZE_SHORT = 2;
    private static final int SIZE_STYLE_RECORD = 12;
    private static final int SPAN_PRIORITY_HIGH = 0;
    private static final int SPAN_PRIORITY_LOW = 16711680;
    private static final java.lang.String TAG = "Tx3gParser";
    private static final java.lang.String TX3G_SERIF = "Serif";
    private static final int TYPE_STYL = 1937013100;
    private static final int TYPE_TBOX = 1952608120;
    private final int calculatedVideoTrackHeight;
    private final boolean customVerticalPlacement;
    private final int defaultColorRgba;
    private final int defaultFontFace;
    private final java.lang.String defaultFontFamily;
    private final float defaultVerticalPlacement;
    private final androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray();

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 2;
    }

    public Tx3gParser(java.util.List<byte[]> list) {
        if (list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.defaultFontFace = bArr[24];
            this.defaultColorRgba = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.defaultFontFamily = TX3G_SERIF.equals(androidx.media3.common.util.Util.fromUtf8Bytes(bArr, 43, bArr.length - 43)) ? androidx.media3.common.C.SERIF_NAME : "sans-serif";
            int i = bArr[25] * 20;
            this.calculatedVideoTrackHeight = i;
            boolean z = (bArr[0] & 32) != 0;
            this.customVerticalPlacement = z;
            if (z) {
                this.defaultVerticalPlacement = androidx.media3.common.util.Util.constrainValue(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
                return;
            } else {
                this.defaultVerticalPlacement = DEFAULT_VERTICAL_PLACEMENT;
                return;
            }
        }
        this.defaultFontFace = 0;
        this.defaultColorRgba = -1;
        this.defaultFontFamily = "sans-serif";
        this.customVerticalPlacement = false;
        this.defaultVerticalPlacement = DEFAULT_VERTICAL_PLACEMENT;
        this.calculatedVideoTrackHeight = -1;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i, int i2, androidx.media3.extractor.text.SubtitleParser.OutputOptions outputOptions, androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer) {
        this.parsableByteArray.reset(bArr, i + i2);
        this.parsableByteArray.setPosition(i);
        java.lang.String subtitleText = readSubtitleText(this.parsableByteArray);
        if (subtitleText.isEmpty()) {
            consumer.accept(new androidx.media3.extractor.text.CuesWithTiming(com.google.common.collect.ImmutableList.of(), androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET));
            return;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(subtitleText);
        attachFontFace(spannableStringBuilder, this.defaultFontFace, 0, 0, spannableStringBuilder.length(), SPAN_PRIORITY_LOW);
        attachColor(spannableStringBuilder, this.defaultColorRgba, -1, 0, spannableStringBuilder.length(), SPAN_PRIORITY_LOW);
        attachFontFamily(spannableStringBuilder, this.defaultFontFamily, 0, spannableStringBuilder.length());
        float fConstrainValue = this.defaultVerticalPlacement;
        while (this.parsableByteArray.bytesLeft() >= 8) {
            int position = this.parsableByteArray.getPosition();
            int i3 = this.parsableByteArray.readInt();
            int i4 = this.parsableByteArray.readInt();
            if (i4 == TYPE_STYL) {
                androidx.media3.common.util.Assertions.checkArgument(this.parsableByteArray.bytesLeft() >= 2);
                int unsignedShort = this.parsableByteArray.readUnsignedShort();
                for (int i5 = 0; i5 < unsignedShort; i5++) {
                    applyStyleRecord(this.parsableByteArray, spannableStringBuilder);
                }
            } else if (i4 == TYPE_TBOX && this.customVerticalPlacement) {
                androidx.media3.common.util.Assertions.checkArgument(this.parsableByteArray.bytesLeft() >= 2);
                fConstrainValue = androidx.media3.common.util.Util.constrainValue(this.parsableByteArray.readUnsignedShort() / this.calculatedVideoTrackHeight, 0.0f, 0.95f);
            }
            this.parsableByteArray.setPosition(position + i3);
        }
        consumer.accept(new androidx.media3.extractor.text.CuesWithTiming(com.google.common.collect.ImmutableList.of(new androidx.media3.common.text.Cue.Builder().setText(spannableStringBuilder).setLine(fConstrainValue, 0).setLineAnchor(0).build()), androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET));
    }

    private static java.lang.String readSubtitleText(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        androidx.media3.common.util.Assertions.checkArgument(parsableByteArray.bytesLeft() >= 2);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        if (unsignedShort == 0) {
            return "";
        }
        int position = parsableByteArray.getPosition();
        java.nio.charset.Charset utfCharsetFromBom = parsableByteArray.readUtfCharsetFromBom();
        int position2 = unsignedShort - (parsableByteArray.getPosition() - position);
        if (utfCharsetFromBom == null) {
            utfCharsetFromBom = com.google.common.base.Charsets.UTF_8;
        }
        return parsableByteArray.readString(position2, utfCharsetFromBom);
    }

    private void applyStyleRecord(androidx.media3.common.util.ParsableByteArray parsableByteArray, android.text.SpannableStringBuilder spannableStringBuilder) {
        androidx.media3.common.util.Assertions.checkArgument(parsableByteArray.bytesLeft() >= 12);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.skipBytes(1);
        int i = parsableByteArray.readInt();
        if (unsignedShort2 > spannableStringBuilder.length()) {
            androidx.media3.common.util.Log.w(TAG, "Truncating styl end (" + unsignedShort2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            unsignedShort2 = spannableStringBuilder.length();
        }
        if (unsignedShort >= unsignedShort2) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring styl with start (" + unsignedShort + ") >= end (" + unsignedShort2 + ").");
            return;
        }
        int i2 = unsignedShort2;
        attachFontFace(spannableStringBuilder, unsignedByte, this.defaultFontFace, unsignedShort, i2, 0);
        attachColor(spannableStringBuilder, i, this.defaultColorRgba, unsignedShort, i2, 0);
    }

    private static void attachFontFace(android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new android.text.style.StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new android.text.style.StyleSpan(0), i3, i4, i6);
        }
    }

    private static void attachColor(android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    private static void attachFontFamily(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.String str, int i, int i2) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new android.text.style.TypefaceSpan(str), i, i2, 16711713);
        }
    }
}
