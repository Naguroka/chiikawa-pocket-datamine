package androidx.media3.extractor.text.ssa;

/* JADX INFO: loaded from: classes.dex */
public final class SsaParser implements androidx.media3.extractor.text.SubtitleParser {
    public static final int CUE_REPLACEMENT_BEHAVIOR = 1;
    private static final float DEFAULT_MARGIN = 0.05f;
    private static final java.lang.String DIALOGUE_LINE_PREFIX = "Dialogue:";
    static final java.lang.String FORMAT_LINE_PREFIX = "Format:";
    private static final java.util.regex.Pattern SSA_TIMECODE_PATTERN = java.util.regex.Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    static final java.lang.String STYLE_LINE_PREFIX = "Style:";
    private static final java.lang.String TAG = "SsaParser";
    private final androidx.media3.extractor.text.ssa.SsaDialogueFormat dialogueFormatFromInitializationData;
    private final boolean haveInitializationData;
    private final androidx.media3.common.util.ParsableByteArray parsableByteArray;
    private float screenHeight;
    private float screenWidth;
    private java.util.Map<java.lang.String, androidx.media3.extractor.text.ssa.SsaStyle> styles;

    private static float computeDefaultLineOrPosition(int i) {
        if (i == 0) {
            return DEFAULT_MARGIN;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 1;
    }

    public SsaParser() {
        this(null);
    }

    public SsaParser(java.util.List<byte[]> list) {
        this.screenWidth = -3.4028235E38f;
        this.screenHeight = -3.4028235E38f;
        this.parsableByteArray = new androidx.media3.common.util.ParsableByteArray();
        if (list != null && !list.isEmpty()) {
            this.haveInitializationData = true;
            java.lang.String strFromUtf8Bytes = androidx.media3.common.util.Util.fromUtf8Bytes(list.get(0));
            androidx.media3.common.util.Assertions.checkArgument(strFromUtf8Bytes.startsWith(FORMAT_LINE_PREFIX));
            this.dialogueFormatFromInitializationData = (androidx.media3.extractor.text.ssa.SsaDialogueFormat) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.extractor.text.ssa.SsaDialogueFormat.fromFormatLine(strFromUtf8Bytes));
            parseHeader(new androidx.media3.common.util.ParsableByteArray(list.get(1)), com.google.common.base.Charsets.UTF_8);
            return;
        }
        this.haveInitializationData = false;
        this.dialogueFormatFromInitializationData = null;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i, int i2, androidx.media3.extractor.text.SubtitleParser.OutputOptions outputOptions, androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        this.parsableByteArray.reset(bArr, i + i2);
        this.parsableByteArray.setPosition(i);
        java.nio.charset.Charset charsetDetectUtfCharset = detectUtfCharset(this.parsableByteArray);
        if (!this.haveInitializationData) {
            parseHeader(this.parsableByteArray, charsetDetectUtfCharset);
        }
        parseEventBody(this.parsableByteArray, arrayList3, arrayList4, charsetDetectUtfCharset);
        java.util.ArrayList arrayList5 = (outputOptions.startTimeUs == androidx.media3.common.C.TIME_UNSET || !outputOptions.outputAllCues) ? null : new java.util.ArrayList();
        int i3 = 0;
        while (i3 < arrayList3.size()) {
            java.util.List<androidx.media3.common.text.Cue> list = arrayList3.get(i3);
            if (list.isEmpty() && i3 != 0) {
                arrayList = arrayList3;
                arrayList2 = arrayList4;
            } else {
                if (i3 == arrayList3.size() - 1) {
                    throw new java.lang.IllegalStateException();
                }
                long jLongValue = arrayList4.get(i3).longValue();
                long jLongValue2 = arrayList4.get(i3 + 1).longValue() - arrayList4.get(i3).longValue();
                arrayList = arrayList3;
                arrayList2 = arrayList4;
                if (outputOptions.startTimeUs == androidx.media3.common.C.TIME_UNSET || jLongValue >= outputOptions.startTimeUs) {
                    consumer.accept(new androidx.media3.extractor.text.CuesWithTiming(list, jLongValue, jLongValue2));
                } else if (arrayList5 != null) {
                    arrayList5.add(new androidx.media3.extractor.text.CuesWithTiming(list, jLongValue, jLongValue2));
                }
            }
            i3++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
        }
        if (arrayList5 != null) {
            java.util.Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                consumer.accept((androidx.media3.extractor.text.CuesWithTiming) it.next());
            }
        }
    }

    private java.nio.charset.Charset detectUtfCharset(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        java.nio.charset.Charset utfCharsetFromBom = parsableByteArray.readUtfCharsetFromBom();
        return utfCharsetFromBom != null ? utfCharsetFromBom : com.google.common.base.Charsets.UTF_8;
    }

    private void parseHeader(androidx.media3.common.util.ParsableByteArray parsableByteArray, java.nio.charset.Charset charset) {
        while (true) {
            java.lang.String line = parsableByteArray.readLine(charset);
            if (line == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(line)) {
                parseScriptInfo(parsableByteArray, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(line)) {
                this.styles = parseStyles(parsableByteArray, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(line)) {
                androidx.media3.common.util.Log.i(TAG, "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(line)) {
                return;
            }
        }
    }

    private void parseScriptInfo(androidx.media3.common.util.ParsableByteArray parsableByteArray, java.nio.charset.Charset charset) {
        while (true) {
            java.lang.String line = parsableByteArray.readLine(charset);
            if (line == null) {
                return;
            }
            if (parsableByteArray.bytesLeft() != 0 && parsableByteArray.peekChar(charset) == '[') {
                return;
            }
            java.lang.String[] strArrSplit = line.split(":");
            if (strArrSplit.length == 2) {
                java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(strArrSplit[0].trim());
                lowerCase.hashCode();
                if (lowerCase.equals("playresx")) {
                    this.screenWidth = java.lang.Float.parseFloat(strArrSplit[1].trim());
                } else if (lowerCase.equals("playresy")) {
                    try {
                        this.screenHeight = java.lang.Float.parseFloat(strArrSplit[1].trim());
                    } catch (java.lang.NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static java.util.Map<java.lang.String, androidx.media3.extractor.text.ssa.SsaStyle> parseStyles(androidx.media3.common.util.ParsableByteArray parsableByteArray, java.nio.charset.Charset charset) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        androidx.media3.extractor.text.ssa.SsaStyle.Format formatFromFormatLine = null;
        while (true) {
            java.lang.String line = parsableByteArray.readLine(charset);
            if (line == null || (parsableByteArray.bytesLeft() != 0 && parsableByteArray.peekChar(charset) == '[')) {
                break;
            }
            if (line.startsWith(FORMAT_LINE_PREFIX)) {
                formatFromFormatLine = androidx.media3.extractor.text.ssa.SsaStyle.Format.fromFormatLine(line);
            } else if (line.startsWith(STYLE_LINE_PREFIX)) {
                if (formatFromFormatLine == null) {
                    androidx.media3.common.util.Log.w(TAG, "Skipping 'Style:' line before 'Format:' line: " + line);
                } else {
                    androidx.media3.extractor.text.ssa.SsaStyle ssaStyleFromStyleLine = androidx.media3.extractor.text.ssa.SsaStyle.fromStyleLine(line, formatFromFormatLine);
                    if (ssaStyleFromStyleLine != null) {
                        linkedHashMap.put(ssaStyleFromStyleLine.name, ssaStyleFromStyleLine);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private void parseEventBody(androidx.media3.common.util.ParsableByteArray parsableByteArray, java.util.List<java.util.List<androidx.media3.common.text.Cue>> list, java.util.List<java.lang.Long> list2, java.nio.charset.Charset charset) {
        androidx.media3.extractor.text.ssa.SsaDialogueFormat ssaDialogueFormatFromFormatLine = this.haveInitializationData ? this.dialogueFormatFromInitializationData : null;
        while (true) {
            java.lang.String line = parsableByteArray.readLine(charset);
            if (line == null) {
                return;
            }
            if (line.startsWith(FORMAT_LINE_PREFIX)) {
                ssaDialogueFormatFromFormatLine = androidx.media3.extractor.text.ssa.SsaDialogueFormat.fromFormatLine(line);
            } else if (line.startsWith(DIALOGUE_LINE_PREFIX)) {
                if (ssaDialogueFormatFromFormatLine == null) {
                    androidx.media3.common.util.Log.w(TAG, "Skipping dialogue line before complete format: " + line);
                } else {
                    parseDialogueLine(line, ssaDialogueFormatFromFormatLine, list, list2);
                }
            }
        }
    }

    private void parseDialogueLine(java.lang.String str, androidx.media3.extractor.text.ssa.SsaDialogueFormat ssaDialogueFormat, java.util.List<java.util.List<androidx.media3.common.text.Cue>> list, java.util.List<java.lang.Long> list2) {
        androidx.media3.common.util.Assertions.checkArgument(str.startsWith(DIALOGUE_LINE_PREFIX));
        java.lang.String[] strArrSplit = str.substring(9).split(",", ssaDialogueFormat.length);
        if (strArrSplit.length != ssaDialogueFormat.length) {
            androidx.media3.common.util.Log.w(TAG, "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long timecodeUs = parseTimecodeUs(strArrSplit[ssaDialogueFormat.startTimeIndex]);
        if (timecodeUs == androidx.media3.common.C.TIME_UNSET) {
            androidx.media3.common.util.Log.w(TAG, "Skipping invalid timing: " + str);
            return;
        }
        long timecodeUs2 = parseTimecodeUs(strArrSplit[ssaDialogueFormat.endTimeIndex]);
        if (timecodeUs2 == androidx.media3.common.C.TIME_UNSET) {
            androidx.media3.common.util.Log.w(TAG, "Skipping invalid timing: " + str);
            return;
        }
        androidx.media3.extractor.text.ssa.SsaStyle ssaStyle = (this.styles == null || ssaDialogueFormat.styleIndex == -1) ? null : this.styles.get(strArrSplit[ssaDialogueFormat.styleIndex].trim());
        java.lang.String str2 = strArrSplit[ssaDialogueFormat.textIndex];
        androidx.media3.common.text.Cue cueCreateCue = createCue(androidx.media3.extractor.text.ssa.SsaStyle.Overrides.stripStyleOverrides(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), ssaStyle, androidx.media3.extractor.text.ssa.SsaStyle.Overrides.parseFromDialogue(str2), this.screenWidth, this.screenHeight);
        int iAddCuePlacerholderByTime = addCuePlacerholderByTime(timecodeUs2, list2, list);
        for (int iAddCuePlacerholderByTime2 = addCuePlacerholderByTime(timecodeUs, list2, list); iAddCuePlacerholderByTime2 < iAddCuePlacerholderByTime; iAddCuePlacerholderByTime2++) {
            list.get(iAddCuePlacerholderByTime2).add(cueCreateCue);
        }
    }

    private static long parseTimecodeUs(java.lang.String str) {
        java.util.regex.Matcher matcher = SSA_TIMECODE_PATTERN.matcher(str.trim());
        return !matcher.matches() ? androidx.media3.common.C.TIME_UNSET : (java.lang.Long.parseLong((java.lang.String) androidx.media3.common.util.Util.castNonNull(matcher.group(1))) * 60 * 60 * 1000000) + (java.lang.Long.parseLong((java.lang.String) androidx.media3.common.util.Util.castNonNull(matcher.group(2))) * 60 * 1000000) + (java.lang.Long.parseLong((java.lang.String) androidx.media3.common.util.Util.castNonNull(matcher.group(3))) * 1000000) + (java.lang.Long.parseLong((java.lang.String) androidx.media3.common.util.Util.castNonNull(matcher.group(4))) * 10000);
    }

    private static androidx.media3.common.text.Cue createCue(java.lang.String str, androidx.media3.extractor.text.ssa.SsaStyle ssaStyle, androidx.media3.extractor.text.ssa.SsaStyle.Overrides overrides, float f, float f2) {
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        androidx.media3.common.text.Cue.Builder text = new androidx.media3.common.text.Cue.Builder().setText(spannableString);
        if (ssaStyle != null) {
            if (ssaStyle.primaryColor != null) {
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(ssaStyle.primaryColor.intValue()), 0, spannableString.length(), 33);
            }
            if (ssaStyle.borderStyle == 3 && ssaStyle.outlineColor != null) {
                spannableString.setSpan(new android.text.style.BackgroundColorSpan(ssaStyle.outlineColor.intValue()), 0, spannableString.length(), 33);
            }
            if (ssaStyle.fontSize != -3.4028235E38f && f2 != -3.4028235E38f) {
                text.setTextSize(ssaStyle.fontSize / f2, 1);
            }
            if (ssaStyle.bold && ssaStyle.italic) {
                spannableString.setSpan(new android.text.style.StyleSpan(3), 0, spannableString.length(), 33);
            } else if (ssaStyle.bold) {
                spannableString.setSpan(new android.text.style.StyleSpan(1), 0, spannableString.length(), 33);
            } else if (ssaStyle.italic) {
                spannableString.setSpan(new android.text.style.StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (ssaStyle.underline) {
                spannableString.setSpan(new android.text.style.UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (ssaStyle.strikeout) {
                spannableString.setSpan(new android.text.style.StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i = -1;
        if (overrides.alignment != -1) {
            i = overrides.alignment;
        } else if (ssaStyle != null) {
            i = ssaStyle.alignment;
        }
        text.setTextAlignment(toTextAlignment(i)).setPositionAnchor(toPositionAnchor(i)).setLineAnchor(toLineAnchor(i));
        if (overrides.position != null && f2 != -3.4028235E38f && f != -3.4028235E38f) {
            text.setPosition(overrides.position.x / f);
            text.setLine(overrides.position.y / f2, 0);
        } else {
            text.setPosition(computeDefaultLineOrPosition(text.getPositionAnchor()));
            text.setLine(computeDefaultLineOrPosition(text.getLineAnchor()), 0);
        }
        return text.build();
    }

    private static android.text.Layout.Alignment toTextAlignment(int i) {
        switch (i) {
            case -1:
                return null;
            case 0:
            default:
                androidx.media3.common.util.Log.w(TAG, "Unknown alignment: " + i);
                return null;
            case 1:
            case 4:
            case 7:
                return android.text.Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return android.text.Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return android.text.Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    private static int toLineAnchor(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                androidx.media3.common.util.Log.w(TAG, "Unknown alignment: " + i);
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    private static int toPositionAnchor(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                androidx.media3.common.util.Log.w(TAG, "Unknown alignment: " + i);
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    private static int addCuePlacerholderByTime(long j, java.util.List<java.lang.Long> list, java.util.List<java.util.List<androidx.media3.common.text.Cue>> list2) {
        int i;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (list.get(size).longValue() == j) {
                return size;
            }
            if (list.get(size).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        list.add(i, java.lang.Long.valueOf(j));
        list2.add(i, i == 0 ? new java.util.ArrayList() : new java.util.ArrayList(list2.get(i - 1)));
        return i;
    }
}
