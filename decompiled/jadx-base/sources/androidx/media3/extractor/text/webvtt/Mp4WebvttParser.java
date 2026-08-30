package androidx.media3.extractor.text.webvtt;

/* JADX INFO: loaded from: classes.dex */
public final class Mp4WebvttParser implements androidx.media3.extractor.text.SubtitleParser {
    private static final int BOX_HEADER_SIZE = 8;
    public static final int CUE_REPLACEMENT_BEHAVIOR = 2;
    private static final int TYPE_payl = 1885436268;
    private static final int TYPE_sttg = 1937011815;
    private static final int TYPE_vttc = 1987343459;
    private final androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray();

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 2;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i, int i2, androidx.media3.extractor.text.SubtitleParser.OutputOptions outputOptions, androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer) {
        this.parsableByteArray.reset(bArr, i2 + i);
        this.parsableByteArray.setPosition(i);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (this.parsableByteArray.bytesLeft() > 0) {
            androidx.media3.common.util.Assertions.checkArgument(this.parsableByteArray.bytesLeft() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int i3 = this.parsableByteArray.readInt();
            if (this.parsableByteArray.readInt() == TYPE_vttc) {
                arrayList.add(parseVttCueBox(this.parsableByteArray, i3 - 8));
            } else {
                this.parsableByteArray.skipBytes(i3 - 8);
            }
        }
        consumer.accept(new androidx.media3.extractor.text.CuesWithTiming(arrayList, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET));
    }

    private static androidx.media3.common.text.Cue parseVttCueBox(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        java.lang.CharSequence cueText = null;
        androidx.media3.common.text.Cue.Builder cueSettingsList = null;
        while (i > 0) {
            androidx.media3.common.util.Assertions.checkArgument(i >= 8, "Incomplete vtt cue box header found.");
            int i2 = parsableByteArray.readInt();
            int i3 = parsableByteArray.readInt();
            int i4 = i2 - 8;
            java.lang.String strFromUtf8Bytes = androidx.media3.common.util.Util.fromUtf8Bytes(parsableByteArray.getData(), parsableByteArray.getPosition(), i4);
            parsableByteArray.skipBytes(i4);
            i = (i - 8) - i4;
            if (i3 == TYPE_sttg) {
                cueSettingsList = androidx.media3.extractor.text.webvtt.WebvttCueParser.parseCueSettingsList(strFromUtf8Bytes);
            } else if (i3 == TYPE_payl) {
                cueText = androidx.media3.extractor.text.webvtt.WebvttCueParser.parseCueText(null, strFromUtf8Bytes.trim(), java.util.Collections.emptyList());
            }
        }
        if (cueText == null) {
            cueText = "";
        }
        if (cueSettingsList != null) {
            return cueSettingsList.setText(cueText).build();
        }
        return androidx.media3.extractor.text.webvtt.WebvttCueParser.newCueForText(cueText);
    }
}
