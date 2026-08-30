package androidx.media3.extractor.text.subrip;

/* JADX INFO: loaded from: classes.dex */
public final class SubripParser implements androidx.media3.extractor.text.SubtitleParser {
    private static final java.lang.String ALIGN_BOTTOM_LEFT = "{\\an1}";
    private static final java.lang.String ALIGN_BOTTOM_MID = "{\\an2}";
    private static final java.lang.String ALIGN_BOTTOM_RIGHT = "{\\an3}";
    private static final java.lang.String ALIGN_MID_LEFT = "{\\an4}";
    private static final java.lang.String ALIGN_MID_MID = "{\\an5}";
    private static final java.lang.String ALIGN_MID_RIGHT = "{\\an6}";
    private static final java.lang.String ALIGN_TOP_LEFT = "{\\an7}";
    private static final java.lang.String ALIGN_TOP_MID = "{\\an8}";
    private static final java.lang.String ALIGN_TOP_RIGHT = "{\\an9}";
    public static final int CUE_REPLACEMENT_BEHAVIOR = 1;
    private static final float END_FRACTION = 0.92f;
    private static final float MID_FRACTION = 0.5f;
    private static final float START_FRACTION = 0.08f;
    private static final java.lang.String SUBRIP_ALIGNMENT_TAG = "\\{\\\\an[1-9]\\}";
    private static final java.lang.String SUBRIP_TIMECODE = "(?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?";
    private static final java.lang.String TAG = "SubripParser";
    private static final java.util.regex.Pattern SUBRIP_TIMING_LINE = java.util.regex.Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final java.util.regex.Pattern SUBRIP_TAG_PATTERN = java.util.regex.Pattern.compile("\\{\\\\.*?\\}");
    private final java.lang.StringBuilder textBuilder = new java.lang.StringBuilder();
    private final java.util.ArrayList<java.lang.String> tags = new java.util.ArrayList<>();
    private final androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray();

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 1;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i, int i2, androidx.media3.extractor.text.SubtitleParser.OutputOptions outputOptions, androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer) {
        java.lang.String str;
        java.lang.String str2;
        androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer2;
        androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer3 = consumer;
        java.lang.String str3 = TAG;
        this.parsableByteArray.reset(bArr, i + i2);
        this.parsableByteArray.setPosition(i);
        java.nio.charset.Charset charsetDetectUtfCharset = detectUtfCharset(this.parsableByteArray);
        java.util.ArrayList arrayList = (outputOptions.startTimeUs == androidx.media3.common.C.TIME_UNSET || !outputOptions.outputAllCues) ? null : new java.util.ArrayList();
        while (true) {
            java.lang.String line = this.parsableByteArray.readLine(charsetDetectUtfCharset);
            if (line == null) {
                break;
            }
            if (line.length() != 0) {
                try {
                    java.lang.Integer.parseInt(line);
                    java.lang.String line2 = this.parsableByteArray.readLine(charsetDetectUtfCharset);
                    if (line2 == null) {
                        androidx.media3.common.util.Log.w(str3, "Unexpected end");
                        break;
                    }
                    java.util.regex.Matcher matcher = SUBRIP_TIMING_LINE.matcher(line2);
                    if (matcher.matches()) {
                        long timecode = parseTimecode(matcher, 1);
                        long timecode2 = parseTimecode(matcher, 6);
                        int i3 = 0;
                        this.textBuilder.setLength(0);
                        this.tags.clear();
                        java.lang.String line3 = this.parsableByteArray.readLine(charsetDetectUtfCharset);
                        while (!android.text.TextUtils.isEmpty(line3)) {
                            if (this.textBuilder.length() > 0) {
                                this.textBuilder.append("<br>");
                            }
                            this.textBuilder.append(processLine(line3, this.tags));
                            line3 = this.parsableByteArray.readLine(charsetDetectUtfCharset);
                        }
                        android.text.Spanned spannedFromHtml = android.text.Html.fromHtml(this.textBuilder.toString());
                        while (true) {
                            if (i3 >= this.tags.size()) {
                                str2 = null;
                                break;
                            }
                            str2 = this.tags.get(i3);
                            if (str2.matches(SUBRIP_ALIGNMENT_TAG)) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        if (outputOptions.startTimeUs == androidx.media3.common.C.TIME_UNSET || timecode >= outputOptions.startTimeUs) {
                            consumer2 = consumer;
                            consumer2.accept(new androidx.media3.extractor.text.CuesWithTiming(com.google.common.collect.ImmutableList.of(buildCue(spannedFromHtml, str2)), timecode, timecode2 - timecode));
                        } else {
                            if (arrayList != null) {
                                arrayList.add(new androidx.media3.extractor.text.CuesWithTiming(com.google.common.collect.ImmutableList.of(buildCue(spannedFromHtml, str2)), timecode, timecode2 - timecode));
                            }
                            consumer2 = consumer;
                        }
                        consumer3 = consumer2;
                        str3 = str3;
                    } else {
                        str = str3;
                        androidx.media3.common.util.Log.w(str, "Skipping invalid timing: " + line2);
                        consumer3 = consumer3;
                        str3 = str;
                    }
                } catch (java.lang.NumberFormatException unused) {
                    str = str3;
                    androidx.media3.common.util.Log.w(str, "Skipping invalid index: " + line);
                }
            }
        }
        androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer4 = consumer3;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                consumer4.accept((androidx.media3.extractor.text.CuesWithTiming) it.next());
            }
        }
    }

    private java.nio.charset.Charset detectUtfCharset(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        java.nio.charset.Charset utfCharsetFromBom = parsableByteArray.readUtfCharsetFromBom();
        return utfCharsetFromBom != null ? utfCharsetFromBom : com.google.common.base.Charsets.UTF_8;
    }

    private java.lang.String processLine(java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
        java.lang.String strTrim = str.trim();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(strTrim);
        java.util.regex.Matcher matcher = SUBRIP_TAG_PATTERN.matcher(strTrim);
        int i = 0;
        while (matcher.find()) {
            java.lang.String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i;
            int length = strGroup.length();
            sb.replace(iStart, iStart + length, "");
            i += length;
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x007b  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    private androidx.media3.common.text.Cue buildCue(android.text.Spanned spanned, java.lang.String str) {
        byte b;
        byte b2;
        androidx.media3.common.text.Cue.Builder text = new androidx.media3.common.text.Cue.Builder().setText(spanned);
        if (str == null) {
            return text.build();
        }
        switch (str) {
            case "{\an1}":
                b = 0;
                break;
            case "{\an2}":
                b = 6;
                break;
            case "{\an3}":
                b = 3;
                break;
            case "{\an4}":
                b = 1;
                break;
            case "{\an5}":
                b = 7;
                break;
            case "{\an6}":
                b = 4;
                break;
            case "{\an7}":
                b = 2;
                break;
            case "{\an8}":
                b = 8;
                break;
            case "{\an9}":
                b = 5;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0 || b == 1 || b == 2) {
            text.setPositionAnchor(0);
        } else if (b == 3 || b == 4 || b == 5) {
            text.setPositionAnchor(2);
        } else {
            text.setPositionAnchor(1);
        }
        switch (str) {
            case "{\an1}":
                b2 = 0;
                break;
            case "{\an2}":
                b2 = 1;
                break;
            case "{\an3}":
                b2 = 2;
                break;
            case "{\an4}":
                b2 = 6;
                break;
            case "{\an5}":
                b2 = 7;
                break;
            case "{\an6}":
                b2 = 8;
                break;
            case "{\an7}":
                b2 = 3;
                break;
            case "{\an8}":
                b2 = 4;
                break;
            case "{\an9}":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0 || b2 == 1 || b2 == 2) {
            text.setLineAnchor(2);
        } else if (b2 == 3 || b2 == 4 || b2 == 5) {
            text.setLineAnchor(0);
        } else {
            text.setLineAnchor(1);
        }
        return text.setPosition(getFractionalPositionForAnchorType(text.getPositionAnchor())).setLine(getFractionalPositionForAnchorType(text.getLineAnchor()), 0).build();
    }

    private static long parseTimecode(java.util.regex.Matcher matcher, int i) {
        java.lang.String strGroup = matcher.group(i + 1);
        long j = (strGroup != null ? java.lang.Long.parseLong(strGroup) * 60 * 60 * 1000 : 0L) + (java.lang.Long.parseLong((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(i + 2))) * 60 * 1000) + (java.lang.Long.parseLong((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(i + 3))) * 1000);
        java.lang.String strGroup2 = matcher.group(i + 4);
        if (strGroup2 != null) {
            j += java.lang.Long.parseLong(strGroup2);
        }
        return j * 1000;
    }

    public static float getFractionalPositionForAnchorType(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return END_FRACTION;
        }
        throw new java.lang.IllegalArgumentException();
    }
}
