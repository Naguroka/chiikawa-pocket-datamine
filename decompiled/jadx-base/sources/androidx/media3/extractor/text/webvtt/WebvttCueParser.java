package androidx.media3.extractor.text.webvtt;

/* JADX INFO: loaded from: classes.dex */
public final class WebvttCueParser {
    private static final char CHAR_AMPERSAND = '&';
    private static final char CHAR_GREATER_THAN = '>';
    private static final char CHAR_LESS_THAN = '<';
    private static final char CHAR_SEMI_COLON = ';';
    private static final char CHAR_SLASH = '/';
    private static final char CHAR_SPACE = ' ';
    public static final java.util.regex.Pattern CUE_HEADER_PATTERN = java.util.regex.Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final java.util.regex.Pattern CUE_SETTING_PATTERN = java.util.regex.Pattern.compile("(\\S+?):(\\S+)");
    private static final java.util.Map<java.lang.String, java.lang.Integer> DEFAULT_BACKGROUND_COLORS;
    static final float DEFAULT_POSITION = 0.5f;
    private static final java.util.Map<java.lang.String, java.lang.Integer> DEFAULT_TEXT_COLORS;
    private static final java.lang.String ENTITY_AMPERSAND = "amp";
    private static final java.lang.String ENTITY_GREATER_THAN = "gt";
    private static final java.lang.String ENTITY_LESS_THAN = "lt";
    private static final java.lang.String ENTITY_NON_BREAK_SPACE = "nbsp";
    private static final int STYLE_BOLD = 1;
    private static final int STYLE_ITALIC = 2;
    private static final java.lang.String TAG = "WebvttCueParser";
    private static final java.lang.String TAG_BOLD = "b";
    private static final java.lang.String TAG_CLASS = "c";
    private static final java.lang.String TAG_ITALIC = "i";
    private static final java.lang.String TAG_LANG = "lang";
    private static final java.lang.String TAG_RUBY = "ruby";
    private static final java.lang.String TAG_RUBY_TEXT = "rt";
    private static final java.lang.String TAG_UNDERLINE = "u";
    private static final java.lang.String TAG_VOICE = "v";
    private static final int TEXT_ALIGNMENT_CENTER = 2;
    private static final int TEXT_ALIGNMENT_END = 3;
    private static final int TEXT_ALIGNMENT_LEFT = 4;
    private static final int TEXT_ALIGNMENT_RIGHT = 5;
    private static final int TEXT_ALIGNMENT_START = 1;

    static {
        java.util.HashMap map = new java.util.HashMap();
        map.put("white", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 255)));
        map.put("lime", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 0)));
        map.put("cyan", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 255)));
        map.put("red", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 0)));
        map.put("yellow", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 0)));
        map.put("magenta", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 255)));
        map.put("blue", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 255)));
        map.put("black", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 0)));
        DEFAULT_TEXT_COLORS = java.util.Collections.unmodifiableMap(map);
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("bg_white", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 255)));
        map2.put("bg_lime", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 255)));
        map2.put("bg_red", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 255)));
        map2.put("bg_blue", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 255)));
        map2.put("bg_black", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 0)));
        DEFAULT_BACKGROUND_COLORS = java.util.Collections.unmodifiableMap(map2);
    }

    public static androidx.media3.extractor.text.webvtt.WebvttCueInfo parseCue(androidx.media3.common.util.ParsableByteArray parsableByteArray, java.util.List<androidx.media3.extractor.text.webvtt.WebvttCssStyle> list) {
        java.lang.String line = parsableByteArray.readLine();
        if (line == null) {
            return null;
        }
        java.util.regex.Pattern pattern = CUE_HEADER_PATTERN;
        java.util.regex.Matcher matcher = pattern.matcher(line);
        if (matcher.matches()) {
            return parseCue(null, matcher, parsableByteArray, list);
        }
        java.lang.String line2 = parsableByteArray.readLine();
        if (line2 == null) {
            return null;
        }
        java.util.regex.Matcher matcher2 = pattern.matcher(line2);
        if (matcher2.matches()) {
            return parseCue(line.trim(), matcher2, parsableByteArray, list);
        }
        return null;
    }

    static androidx.media3.common.text.Cue.Builder parseCueSettingsList(java.lang.String str) {
        androidx.media3.extractor.text.webvtt.WebvttCueParser.WebvttCueInfoBuilder webvttCueInfoBuilder = new androidx.media3.extractor.text.webvtt.WebvttCueParser.WebvttCueInfoBuilder();
        parseCueSettingsList(str, webvttCueInfoBuilder);
        return webvttCueInfoBuilder.toCueBuilder();
    }

    public static androidx.media3.common.text.Cue newCueForText(java.lang.CharSequence charSequence) {
        androidx.media3.extractor.text.webvtt.WebvttCueParser.WebvttCueInfoBuilder webvttCueInfoBuilder = new androidx.media3.extractor.text.webvtt.WebvttCueParser.WebvttCueInfoBuilder();
        webvttCueInfoBuilder.text = charSequence;
        return webvttCueInfoBuilder.toCueBuilder().build();
    }

    static android.text.SpannedString parseCueText(java.lang.String str, java.lang.String str2, java.util.List<androidx.media3.extractor.text.webvtt.WebvttCssStyle> list) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = java.lang.Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    applyEntity(str2.substring(i, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((java.lang.CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt == '<') {
                int iFindEndOfTag = i + 1;
                if (iFindEndOfTag < str2.length()) {
                    boolean z = str2.charAt(iFindEndOfTag) == '/';
                    iFindEndOfTag = findEndOfTag(str2, iFindEndOfTag);
                    int i2 = iFindEndOfTag - 2;
                    boolean z2 = str2.charAt(i2) == '/';
                    int i3 = i + (z ? 2 : 1);
                    if (!z2) {
                        i2 = iFindEndOfTag - 1;
                    }
                    java.lang.String strSubstring = str2.substring(i3, i2);
                    if (!strSubstring.trim().isEmpty()) {
                        java.lang.String tagName = getTagName(strSubstring);
                        if (isSupportedTag(tagName)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag startTag = (androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag) arrayDeque.pop();
                                    applySpansForTag(str, startTag, arrayList, spannableStringBuilder, list);
                                    if (!arrayDeque.isEmpty()) {
                                        arrayList.add(new androidx.media3.extractor.text.webvtt.WebvttCueParser.Element(startTag, spannableStringBuilder.length()));
                                    } else {
                                        arrayList.clear();
                                    }
                                    if (startTag.name.equals(tagName)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag.buildStartTag(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i = iFindEndOfTag;
            } else {
                spannableStringBuilder.append(cCharAt);
                i++;
            }
        }
        while (!arrayDeque.isEmpty()) {
            applySpansForTag(str, (androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        applySpansForTag(str, androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag.buildWholeCueVirtualTag(), java.util.Collections.emptyList(), spannableStringBuilder, list);
        return android.text.SpannedString.valueOf(spannableStringBuilder);
    }

    private static androidx.media3.extractor.text.webvtt.WebvttCueInfo parseCue(java.lang.String str, java.util.regex.Matcher matcher, androidx.media3.common.util.ParsableByteArray parsableByteArray, java.util.List<androidx.media3.extractor.text.webvtt.WebvttCssStyle> list) {
        androidx.media3.extractor.text.webvtt.WebvttCueParser.WebvttCueInfoBuilder webvttCueInfoBuilder = new androidx.media3.extractor.text.webvtt.WebvttCueParser.WebvttCueInfoBuilder();
        try {
            webvttCueInfoBuilder.startTimeUs = androidx.media3.extractor.text.webvtt.WebvttParserUtil.parseTimestampUs((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(1)));
            webvttCueInfoBuilder.endTimeUs = androidx.media3.extractor.text.webvtt.WebvttParserUtil.parseTimestampUs((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(2)));
            parseCueSettingsList((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(3)), webvttCueInfoBuilder);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String line = parsableByteArray.readLine();
            while (!android.text.TextUtils.isEmpty(line)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(line.trim());
                line = parsableByteArray.readLine();
            }
            webvttCueInfoBuilder.text = parseCueText(str, sb.toString(), list);
            return webvttCueInfoBuilder.build();
        } catch (java.lang.NumberFormatException unused) {
            androidx.media3.common.util.Log.w(TAG, "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    private static void parseCueSettingsList(java.lang.String str, androidx.media3.extractor.text.webvtt.WebvttCueParser.WebvttCueInfoBuilder webvttCueInfoBuilder) {
        java.util.regex.Matcher matcher = CUE_SETTING_PATTERN.matcher(str);
        while (matcher.find()) {
            java.lang.String str2 = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(1));
            java.lang.String str3 = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    parseLineAttribute(str3, webvttCueInfoBuilder);
                } else if ("align".equals(str2)) {
                    webvttCueInfoBuilder.textAlignment = parseTextAlignment(str3);
                } else if (com.ironsource.y8.h.L.equals(str2)) {
                    parsePositionAttribute(str3, webvttCueInfoBuilder);
                } else if ("size".equals(str2)) {
                    webvttCueInfoBuilder.size = androidx.media3.extractor.text.webvtt.WebvttParserUtil.parsePercentage(str3);
                } else if ("vertical".equals(str2)) {
                    webvttCueInfoBuilder.verticalType = parseVerticalAttribute(str3);
                } else {
                    androidx.media3.common.util.Log.w(TAG, "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (java.lang.NumberFormatException unused) {
                androidx.media3.common.util.Log.w(TAG, "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    private static void parseLineAttribute(java.lang.String str, androidx.media3.extractor.text.webvtt.WebvttCueParser.WebvttCueInfoBuilder webvttCueInfoBuilder) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            webvttCueInfoBuilder.lineAnchor = parseLineAnchor(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            webvttCueInfoBuilder.line = androidx.media3.extractor.text.webvtt.WebvttParserUtil.parsePercentage(str);
            webvttCueInfoBuilder.lineType = 0;
        } else {
            webvttCueInfoBuilder.line = java.lang.Integer.parseInt(str);
            webvttCueInfoBuilder.lineType = 1;
        }
    }

    private static int parseLineAnchor(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                androidx.media3.common.util.Log.w(TAG, "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void parsePositionAttribute(java.lang.String str, androidx.media3.extractor.text.webvtt.WebvttCueParser.WebvttCueInfoBuilder webvttCueInfoBuilder) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            webvttCueInfoBuilder.positionAnchor = parsePositionAnchor(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        webvttCueInfoBuilder.position = androidx.media3.extractor.text.webvtt.WebvttParserUtil.parsePercentage(str);
    }

    private static int parsePositionAnchor(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                androidx.media3.common.util.Log.w(TAG, "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static int parseVerticalAttribute(java.lang.String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        androidx.media3.common.util.Log.w(TAG, "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }

    private static int parseTextAlignment(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                androidx.media3.common.util.Log.w(TAG, "Invalid alignment value: " + str);
                return 2;
        }
    }

    private static int findEndOfTag(java.lang.String str, int i) {
        int iIndexOf = str.indexOf(62, i);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    private static void applyEntity(java.lang.String str, android.text.SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        switch (str) {
            case "gt":
                spannableStringBuilder.append('>');
                break;
            case "lt":
                spannableStringBuilder.append('<');
                break;
            case "amp":
                spannableStringBuilder.append('&');
                break;
            case "nbsp":
                spannableStringBuilder.append(CHAR_SPACE);
                break;
            default:
                androidx.media3.common.util.Log.w(TAG, "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    private static boolean isSupportedTag(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    private static void applySpansForTag(java.lang.String str, androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag startTag, java.util.List<androidx.media3.extractor.text.webvtt.WebvttCueParser.Element> list, android.text.SpannableStringBuilder spannableStringBuilder, java.util.List<androidx.media3.extractor.text.webvtt.WebvttCssStyle> list2) {
        int i = startTag.position;
        int length = spannableStringBuilder.length();
        java.lang.String str2 = startTag.name;
        str2.hashCode();
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), i, length, 33);
                break;
            case "c":
                applyDefaultColors(spannableStringBuilder, startTag.classes, i, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i, length, 33);
                break;
            case "ruby":
                applyRubySpans(spannableStringBuilder, str, startTag, list, list2);
                break;
            default:
                return;
        }
        java.util.List<androidx.media3.extractor.text.webvtt.WebvttCueParser.StyleMatch> applicableStyles = getApplicableStyles(list2, str, startTag);
        for (int i2 = 0; i2 < applicableStyles.size(); i2++) {
            applyStyleToText(spannableStringBuilder, applicableStyles.get(i2).style, i, length);
        }
    }

    private static void applyRubySpans(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.String str, androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag startTag, java.util.List<androidx.media3.extractor.text.webvtt.WebvttCueParser.Element> list, java.util.List<androidx.media3.extractor.text.webvtt.WebvttCssStyle> list2) {
        int rubyPosition = getRubyPosition(list2, str, startTag);
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        arrayList.addAll(list);
        java.util.Collections.sort(arrayList, androidx.media3.extractor.text.webvtt.WebvttCueParser.Element.BY_START_POSITION_ASC);
        int i = startTag.position;
        int length = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if ("rt".equals(((androidx.media3.extractor.text.webvtt.WebvttCueParser.Element) arrayList.get(i2)).startTag.name)) {
                androidx.media3.extractor.text.webvtt.WebvttCueParser.Element element = (androidx.media3.extractor.text.webvtt.WebvttCueParser.Element) arrayList.get(i2);
                int iFirstKnownRubyPosition = firstKnownRubyPosition(getRubyPosition(list2, str, element.startTag), rubyPosition, 1);
                int i3 = element.startTag.position - length;
                int i4 = element.endPosition - length;
                java.lang.CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i3, i4);
                spannableStringBuilder.delete(i3, i4);
                spannableStringBuilder.setSpan(new androidx.media3.common.text.RubySpan(charSequenceSubSequence.toString(), iFirstKnownRubyPosition), i, i3, 33);
                length += charSequenceSubSequence.length();
                i = i3;
            }
        }
    }

    private static int getRubyPosition(java.util.List<androidx.media3.extractor.text.webvtt.WebvttCssStyle> list, java.lang.String str, androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag startTag) {
        java.util.List<androidx.media3.extractor.text.webvtt.WebvttCueParser.StyleMatch> applicableStyles = getApplicableStyles(list, str, startTag);
        for (int i = 0; i < applicableStyles.size(); i++) {
            androidx.media3.extractor.text.webvtt.WebvttCssStyle webvttCssStyle = applicableStyles.get(i).style;
            if (webvttCssStyle.getRubyPosition() != -1) {
                return webvttCssStyle.getRubyPosition();
            }
        }
        return -1;
    }

    private static int firstKnownRubyPosition(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        throw new java.lang.IllegalArgumentException();
    }

    private static void applyDefaultColors(android.text.SpannableStringBuilder spannableStringBuilder, java.util.Set<java.lang.String> set, int i, int i2) {
        for (java.lang.String str : set) {
            java.util.Map<java.lang.String, java.lang.Integer> map = DEFAULT_TEXT_COLORS;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(map.get(str).intValue()), i, i2, 33);
            } else {
                java.util.Map<java.lang.String, java.lang.Integer> map2 = DEFAULT_BACKGROUND_COLORS;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new android.text.style.BackgroundColorSpan(map2.get(str).intValue()), i, i2, 33);
                }
            }
        }
    }

    private static void applyStyleToText(android.text.SpannableStringBuilder spannableStringBuilder, androidx.media3.extractor.text.webvtt.WebvttCssStyle webvttCssStyle, int i, int i2) {
        if (webvttCssStyle == null) {
            return;
        }
        if (webvttCssStyle.getStyle() != -1) {
            androidx.media3.common.text.SpanUtil.addOrReplaceSpan(spannableStringBuilder, new android.text.style.StyleSpan(webvttCssStyle.getStyle()), i, i2, 33);
        }
        if (webvttCssStyle.isLinethrough()) {
            spannableStringBuilder.setSpan(new android.text.style.StrikethroughSpan(), i, i2, 33);
        }
        if (webvttCssStyle.isUnderline()) {
            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i, i2, 33);
        }
        if (webvttCssStyle.hasFontColor()) {
            androidx.media3.common.text.SpanUtil.addOrReplaceSpan(spannableStringBuilder, new android.text.style.ForegroundColorSpan(webvttCssStyle.getFontColor()), i, i2, 33);
        }
        if (webvttCssStyle.hasBackgroundColor()) {
            androidx.media3.common.text.SpanUtil.addOrReplaceSpan(spannableStringBuilder, new android.text.style.BackgroundColorSpan(webvttCssStyle.getBackgroundColor()), i, i2, 33);
        }
        if (webvttCssStyle.getFontFamily() != null) {
            androidx.media3.common.text.SpanUtil.addOrReplaceSpan(spannableStringBuilder, new android.text.style.TypefaceSpan(webvttCssStyle.getFontFamily()), i, i2, 33);
        }
        int fontSizeUnit = webvttCssStyle.getFontSizeUnit();
        if (fontSizeUnit == 1) {
            androidx.media3.common.text.SpanUtil.addOrReplaceSpan(spannableStringBuilder, new android.text.style.AbsoluteSizeSpan((int) webvttCssStyle.getFontSize(), true), i, i2, 33);
        } else if (fontSizeUnit == 2) {
            androidx.media3.common.text.SpanUtil.addOrReplaceSpan(spannableStringBuilder, new android.text.style.RelativeSizeSpan(webvttCssStyle.getFontSize()), i, i2, 33);
        } else if (fontSizeUnit == 3) {
            androidx.media3.common.text.SpanUtil.addOrReplaceSpan(spannableStringBuilder, new android.text.style.RelativeSizeSpan(webvttCssStyle.getFontSize() / 100.0f), i, i2, 33);
        }
        if (webvttCssStyle.getCombineUpright()) {
            spannableStringBuilder.setSpan(new androidx.media3.common.text.HorizontalTextInVerticalContextSpan(), i, i2, 33);
        }
    }

    private static java.lang.String getTagName(java.lang.String str) {
        java.lang.String strTrim = str.trim();
        androidx.media3.common.util.Assertions.checkArgument(!strTrim.isEmpty());
        return androidx.media3.common.util.Util.splitAtFirst(strTrim, "[ \\.]")[0];
    }

    private static java.util.List<androidx.media3.extractor.text.webvtt.WebvttCueParser.StyleMatch> getApplicableStyles(java.util.List<androidx.media3.extractor.text.webvtt.WebvttCssStyle> list, java.lang.String str, androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag startTag) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.extractor.text.webvtt.WebvttCssStyle webvttCssStyle = list.get(i);
            int specificityScore = webvttCssStyle.getSpecificityScore(str, startTag.name, startTag.classes, startTag.voice);
            if (specificityScore > 0) {
                arrayList.add(new androidx.media3.extractor.text.webvtt.WebvttCueParser.StyleMatch(specificityScore, webvttCssStyle));
            }
        }
        java.util.Collections.sort(arrayList);
        return arrayList;
    }

    private static final class WebvttCueInfoBuilder {
        public java.lang.CharSequence text;
        public long startTimeUs = 0;
        public long endTimeUs = 0;
        public int textAlignment = 2;
        public float line = -3.4028235E38f;
        public int lineType = 1;
        public int lineAnchor = 0;
        public float position = -3.4028235E38f;
        public int positionAnchor = Integer.MIN_VALUE;
        public float size = 1.0f;
        public int verticalType = Integer.MIN_VALUE;

        private static float computeLine(float f, int i) {
            if (f != -3.4028235E38f && i == 0 && (f < 0.0f || f > 1.0f)) {
                return 1.0f;
            }
            if (f != -3.4028235E38f) {
                return f;
            }
            return i == 0 ? 1.0f : -3.4028235E38f;
        }

        private static float derivePosition(int i) {
            if (i != 4) {
                return i != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int derivePositionAnchor(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 3) {
                return 2;
            }
            if (i != 4) {
                return i != 5 ? 1 : 2;
            }
            return 0;
        }

        public androidx.media3.extractor.text.webvtt.WebvttCueInfo build() {
            return new androidx.media3.extractor.text.webvtt.WebvttCueInfo(toCueBuilder().build(), this.startTimeUs, this.endTimeUs);
        }

        public androidx.media3.common.text.Cue.Builder toCueBuilder() {
            float fDerivePosition = this.position;
            if (fDerivePosition == -3.4028235E38f) {
                fDerivePosition = derivePosition(this.textAlignment);
            }
            int iDerivePositionAnchor = this.positionAnchor;
            if (iDerivePositionAnchor == Integer.MIN_VALUE) {
                iDerivePositionAnchor = derivePositionAnchor(this.textAlignment);
            }
            androidx.media3.common.text.Cue.Builder verticalType = new androidx.media3.common.text.Cue.Builder().setTextAlignment(convertTextAlignment(this.textAlignment)).setLine(computeLine(this.line, this.lineType), this.lineType).setLineAnchor(this.lineAnchor).setPosition(fDerivePosition).setPositionAnchor(iDerivePositionAnchor).setSize(java.lang.Math.min(this.size, deriveMaxSize(iDerivePositionAnchor, fDerivePosition))).setVerticalType(this.verticalType);
            java.lang.CharSequence charSequence = this.text;
            if (charSequence != null) {
                verticalType.setText(charSequence);
            }
            return verticalType;
        }

        private static android.text.Layout.Alignment convertTextAlignment(int i) {
            if (i != 1) {
                if (i == 2) {
                    return android.text.Layout.Alignment.ALIGN_CENTER;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            androidx.media3.common.util.Log.w(androidx.media3.extractor.text.webvtt.WebvttCueParser.TAG, "Unknown textAlignment: " + i);
                            return null;
                        }
                    }
                }
                return android.text.Layout.Alignment.ALIGN_OPPOSITE;
            }
            return android.text.Layout.Alignment.ALIGN_NORMAL;
        }

        private static float deriveMaxSize(int i, float f) {
            if (i == 0) {
                return 1.0f - f;
            }
            if (i == 1) {
                return f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
            }
            if (i == 2) {
                return f;
            }
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(i));
        }
    }

    private static final class StyleMatch implements java.lang.Comparable<androidx.media3.extractor.text.webvtt.WebvttCueParser.StyleMatch> {
        public final int score;
        public final androidx.media3.extractor.text.webvtt.WebvttCssStyle style;

        public StyleMatch(int i, androidx.media3.extractor.text.webvtt.WebvttCssStyle webvttCssStyle) {
            this.score = i;
            this.style = webvttCssStyle;
        }

        @Override // java.lang.Comparable
        public int compareTo(androidx.media3.extractor.text.webvtt.WebvttCueParser.StyleMatch styleMatch) {
            return java.lang.Integer.compare(this.score, styleMatch.score);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class StartTag {
        public final java.util.Set<java.lang.String> classes;
        public final java.lang.String name;
        public final int position;
        public final java.lang.String voice;

        private StartTag(java.lang.String str, int i, java.lang.String str2, java.util.Set<java.lang.String> set) {
            this.position = i;
            this.name = str;
            this.voice = str2;
            this.classes = set;
        }

        public static androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag buildStartTag(java.lang.String str, int i) {
            java.lang.String str2;
            java.lang.String strTrim = str.trim();
            androidx.media3.common.util.Assertions.checkArgument(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                java.lang.String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            java.lang.String[] strArrSplit = androidx.media3.common.util.Util.split(strTrim, "\\.");
            java.lang.String str3 = strArrSplit[0];
            java.util.HashSet hashSet = new java.util.HashSet();
            for (int i2 = 1; i2 < strArrSplit.length; i2++) {
                hashSet.add(strArrSplit[i2]);
            }
            return new androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag(str3, i, str2, hashSet);
        }

        public static androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag buildWholeCueVirtualTag() {
            return new androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag("", 0, "", java.util.Collections.emptySet());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class Element {
        private static final java.util.Comparator<androidx.media3.extractor.text.webvtt.WebvttCueParser.Element> BY_START_POSITION_ASC = new java.util.Comparator() { // from class: androidx.media3.extractor.text.webvtt.WebvttCueParser$Element$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Integer.compare(((androidx.media3.extractor.text.webvtt.WebvttCueParser.Element) obj).startTag.position, ((androidx.media3.extractor.text.webvtt.WebvttCueParser.Element) obj2).startTag.position);
            }
        };
        private final int endPosition;
        private final androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag startTag;

        private Element(androidx.media3.extractor.text.webvtt.WebvttCueParser.StartTag startTag, int i) {
            this.startTag = startTag;
            this.endPosition = i;
        }
    }
}
