package androidx.media3.extractor.text.ttml;

/* JADX INFO: loaded from: classes.dex */
public final class TtmlParser implements androidx.media3.extractor.text.SubtitleParser {
    private static final java.lang.String ATTR_BEGIN = "begin";
    private static final java.lang.String ATTR_DURATION = "dur";
    private static final java.lang.String ATTR_END = "end";
    private static final java.lang.String ATTR_IMAGE = "backgroundImage";
    private static final java.lang.String ATTR_REGION = "region";
    private static final java.lang.String ATTR_STYLE = "style";
    public static final int CUE_REPLACEMENT_BEHAVIOR = 1;
    private static final int DEFAULT_CELL_ROWS = 15;
    private static final int DEFAULT_FRAME_RATE = 30;
    private static final java.lang.String TAG = "TtmlParser";
    private static final java.lang.String TTP = "http://www.w3.org/ns/ttml#parameter";
    private final org.xmlpull.v1.XmlPullParserFactory xmlParserFactory;
    private static final java.util.regex.Pattern CLOCK_TIME = java.util.regex.Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final java.util.regex.Pattern OFFSET_TIME = java.util.regex.Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final java.util.regex.Pattern FONT_SIZE = java.util.regex.Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final java.util.regex.Pattern SIGNED_PERCENTAGE = java.util.regex.Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final java.util.regex.Pattern PERCENTAGE_COORDINATES = java.util.regex.Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final java.util.regex.Pattern PIXEL_COORDINATES = java.util.regex.Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final java.util.regex.Pattern CELL_RESOLUTION = java.util.regex.Pattern.compile("^(\\d+) (\\d+)$");
    private static final androidx.media3.extractor.text.ttml.TtmlParser.FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE = new androidx.media3.extractor.text.ttml.TtmlParser.FrameAndTickRate(30.0f, 1, 1);

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 1;
    }

    public TtmlParser() {
        try {
            org.xmlpull.v1.XmlPullParserFactory xmlPullParserFactoryNewInstance = org.xmlpull.v1.XmlPullParserFactory.newInstance();
            this.xmlParserFactory = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (org.xmlpull.v1.XmlPullParserException e) {
            throw new java.lang.RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i, int i2, androidx.media3.extractor.text.SubtitleParser.OutputOptions outputOptions, androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer) {
        androidx.media3.extractor.text.LegacySubtitleUtil.toCuesWithTiming(parseToLegacySubtitle(bArr, i, i2), outputOptions, consumer);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public androidx.media3.extractor.text.Subtitle parseToLegacySubtitle(byte[] bArr, int i, int i2) {
        char c;
        androidx.media3.extractor.text.ttml.TtmlParser.FrameAndTickRate frameAndTickRate;
        try {
            org.xmlpull.v1.XmlPullParser xmlPullParserNewPullParser = this.xmlParserFactory.newPullParser();
            java.util.HashMap map = new java.util.HashMap();
            java.util.HashMap map2 = new java.util.HashMap();
            java.util.HashMap map3 = new java.util.HashMap();
            map2.put("", new androidx.media3.extractor.text.ttml.TtmlRegion(""));
            androidx.media3.extractor.text.ttml.TtmlParser.TtsExtent ttsExtent = null;
            xmlPullParserNewPullParser.setInput(new java.io.ByteArrayInputStream(bArr, i, i2), null);
            java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
            androidx.media3.extractor.text.ttml.TtmlParser.FrameAndTickRate frameAndTickRates = DEFAULT_FRAME_AND_TICK_RATE;
            androidx.media3.extractor.text.ttml.TtmlSubtitle ttmlSubtitle = null;
            int i3 = 0;
            int cellRows = 15;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                androidx.media3.extractor.text.ttml.TtmlNode ttmlNode = (androidx.media3.extractor.text.ttml.TtmlNode) arrayDeque.peek();
                if (i3 == 0) {
                    java.lang.String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if (androidx.media3.extractor.text.ttml.TtmlNode.TAG_TT.equals(name)) {
                            frameAndTickRates = parseFrameAndTickRates(xmlPullParserNewPullParser);
                            c = 15;
                            cellRows = parseCellRows(xmlPullParserNewPullParser, 15);
                            ttsExtent = parseTtsExtent(xmlPullParserNewPullParser);
                        } else {
                            c = 15;
                        }
                        androidx.media3.extractor.text.ttml.TtmlParser.TtsExtent ttsExtent2 = ttsExtent;
                        androidx.media3.extractor.text.ttml.TtmlParser.FrameAndTickRate frameAndTickRate2 = frameAndTickRates;
                        int i4 = cellRows;
                        if (!isSupportedTag(name)) {
                            androidx.media3.common.util.Log.i(TAG, "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            i3++;
                            frameAndTickRates = frameAndTickRate2;
                            ttsExtent = ttsExtent2;
                            cellRows = i4;
                        } else {
                            if (androidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD.equals(name)) {
                                frameAndTickRate = frameAndTickRate2;
                                parseHeader(xmlPullParserNewPullParser, map, i4, ttsExtent2, map2, map3);
                            } else {
                                frameAndTickRate = frameAndTickRate2;
                                try {
                                    androidx.media3.extractor.text.ttml.TtmlNode node = parseNode(xmlPullParserNewPullParser, ttmlNode, map2, frameAndTickRate);
                                    arrayDeque.push(node);
                                    if (ttmlNode != null) {
                                        ttmlNode.addChild(node);
                                    }
                                } catch (androidx.media3.extractor.text.SubtitleDecoderException e) {
                                    androidx.media3.common.util.Log.w(TAG, "Suppressing parser error", e);
                                    i3++;
                                }
                            }
                            frameAndTickRates = frameAndTickRate;
                            ttsExtent = ttsExtent2;
                            cellRows = i4;
                        }
                    } else if (eventType == 4) {
                        ((androidx.media3.extractor.text.ttml.TtmlNode) androidx.media3.common.util.Assertions.checkNotNull(ttmlNode)).addChild(androidx.media3.extractor.text.ttml.TtmlNode.buildTextNode(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_TT)) {
                            ttmlSubtitle = new androidx.media3.extractor.text.ttml.TtmlSubtitle((androidx.media3.extractor.text.ttml.TtmlNode) androidx.media3.common.util.Assertions.checkNotNull((androidx.media3.extractor.text.ttml.TtmlNode) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i3++;
                } else if (eventType == 3) {
                    i3--;
                }
                xmlPullParserNewPullParser.next();
            }
            return (androidx.media3.extractor.text.Subtitle) androidx.media3.common.util.Assertions.checkNotNull(ttmlSubtitle);
        } catch (java.io.IOException e2) {
            throw new java.lang.IllegalStateException("Unexpected error when reading input.", e2);
        } catch (org.xmlpull.v1.XmlPullParserException e3) {
            throw new java.lang.IllegalStateException("Unable to decode source", e3);
        }
    }

    private static androidx.media3.extractor.text.ttml.TtmlParser.FrameAndTickRate parseFrameAndTickRates(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        float f;
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(TTP, "frameRate");
        int i = attributeValue != null ? java.lang.Integer.parseInt(attributeValue) : 30;
        java.lang.String attributeValue2 = xmlPullParser.getAttributeValue(TTP, "frameRateMultiplier");
        if (attributeValue2 != null) {
            java.lang.String[] strArrSplit = androidx.media3.common.util.Util.split(attributeValue2, " ");
            androidx.media3.common.util.Assertions.checkArgument(strArrSplit.length == 2, "frameRateMultiplier doesn't have 2 parts");
            f = java.lang.Integer.parseInt(strArrSplit[0]) / java.lang.Integer.parseInt(strArrSplit[1]);
        } else {
            f = 1.0f;
        }
        androidx.media3.extractor.text.ttml.TtmlParser.FrameAndTickRate frameAndTickRate = DEFAULT_FRAME_AND_TICK_RATE;
        int i2 = frameAndTickRate.subFrameRate;
        java.lang.String attributeValue3 = xmlPullParser.getAttributeValue(TTP, "subFrameRate");
        if (attributeValue3 != null) {
            i2 = java.lang.Integer.parseInt(attributeValue3);
        }
        int i3 = frameAndTickRate.tickRate;
        java.lang.String attributeValue4 = xmlPullParser.getAttributeValue(TTP, "tickRate");
        if (attributeValue4 != null) {
            i3 = java.lang.Integer.parseInt(attributeValue4);
        }
        return new androidx.media3.extractor.text.ttml.TtmlParser.FrameAndTickRate(i * f, i2, i3);
    }

    private static int parseCellRows(org.xmlpull.v1.XmlPullParser xmlPullParser, int i) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(TTP, "cellResolution");
        if (attributeValue == null) {
            return i;
        }
        java.util.regex.Matcher matcher = CELL_RESOLUTION.matcher(attributeValue);
        if (!matcher.matches()) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed cell resolution: " + attributeValue);
            return i;
        }
        boolean z = true;
        try {
            int i2 = java.lang.Integer.parseInt((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(1)));
            int i3 = java.lang.Integer.parseInt((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(2)));
            if (i2 == 0 || i3 == 0) {
                z = false;
            }
            androidx.media3.common.util.Assertions.checkArgument(z, "Invalid cell resolution " + i2 + " " + i3);
            return i3;
        } catch (java.lang.NumberFormatException unused) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed cell resolution: " + attributeValue);
            return i;
        }
    }

    private static androidx.media3.extractor.text.ttml.TtmlParser.TtsExtent parseTtsExtent(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.lang.String attributeValue = androidx.media3.common.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_EXTENT);
        if (attributeValue == null) {
            return null;
        }
        java.util.regex.Matcher matcher = PIXEL_COORDINATES.matcher(attributeValue);
        if (!matcher.matches()) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring non-pixel tts extent: " + attributeValue);
            return null;
        }
        try {
            return new androidx.media3.extractor.text.ttml.TtmlParser.TtsExtent(java.lang.Integer.parseInt((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(1))), java.lang.Integer.parseInt((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(2))));
        } catch (java.lang.NumberFormatException unused) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring malformed tts extent: " + attributeValue);
            return null;
        }
    }

    private static java.util.Map<java.lang.String, androidx.media3.extractor.text.ttml.TtmlStyle> parseHeader(org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.Map<java.lang.String, androidx.media3.extractor.text.ttml.TtmlStyle> map, int i, androidx.media3.extractor.text.ttml.TtmlParser.TtsExtent ttsExtent, java.util.Map<java.lang.String, androidx.media3.extractor.text.ttml.TtmlRegion> map2, java.util.Map<java.lang.String, java.lang.String> map3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        do {
            xmlPullParser.next();
            if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "style")) {
                java.lang.String attributeValue = androidx.media3.common.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, "style");
                androidx.media3.extractor.text.ttml.TtmlStyle styleAttributes = parseStyleAttributes(xmlPullParser, new androidx.media3.extractor.text.ttml.TtmlStyle());
                if (attributeValue != null) {
                    for (java.lang.String str : parseStyleIds(attributeValue)) {
                        styleAttributes.chain(map.get(str));
                    }
                }
                java.lang.String id = styleAttributes.getId();
                if (id != null) {
                    map.put(id, styleAttributes);
                }
            } else if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "region")) {
                androidx.media3.extractor.text.ttml.TtmlRegion regionAttributes = parseRegionAttributes(xmlPullParser, i, ttsExtent);
                if (regionAttributes != null) {
                    map2.put(regionAttributes.id, regionAttributes);
                }
            } else if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, androidx.media3.extractor.text.ttml.TtmlNode.TAG_METADATA)) {
                parseMetadata(xmlPullParser, map3);
            }
        } while (!androidx.media3.common.util.XmlPullParserUtil.isEndTag(xmlPullParser, androidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD));
        return map;
    }

    private static void parseMetadata(org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.Map<java.lang.String, java.lang.String> map) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        java.lang.String attributeValue;
        do {
            xmlPullParser.next();
            if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "image") && (attributeValue = androidx.media3.common.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, "id")) != null) {
                map.put(attributeValue, xmlPullParser.nextText());
            }
        } while (!androidx.media3.common.util.XmlPullParserUtil.isEndTag(xmlPullParser, androidx.media3.extractor.text.ttml.TtmlNode.TAG_METADATA));
    }

    /* JADX WARN: Code duplicated, block: B:44:0x015d  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a6  */
    private static androidx.media3.extractor.text.ttml.TtmlRegion parseRegionAttributes(org.xmlpull.v1.XmlPullParser xmlPullParser, int i, androidx.media3.extractor.text.ttml.TtmlParser.TtsExtent ttsExtent) {
        float f;
        float f2;
        float f3;
        float f4;
        int i2;
        float f5;
        int i3;
        java.lang.String attributeValue = androidx.media3.common.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, "id");
        if (attributeValue == null) {
            return null;
        }
        java.lang.String attributeValue2 = androidx.media3.common.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, "origin");
        if (attributeValue2 != null) {
            java.util.regex.Pattern pattern = PERCENTAGE_COORDINATES;
            java.util.regex.Matcher matcher = pattern.matcher(attributeValue2);
            java.util.regex.Pattern pattern2 = PIXEL_COORDINATES;
            java.util.regex.Matcher matcher2 = pattern2.matcher(attributeValue2);
            if (matcher.matches()) {
                try {
                    float f6 = java.lang.Float.parseFloat((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(1))) / 100.0f;
                    f = java.lang.Float.parseFloat((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(2))) / 100.0f;
                    f2 = f6;
                } catch (java.lang.NumberFormatException unused) {
                    androidx.media3.common.util.Log.w(TAG, "Ignoring region with malformed origin: " + attributeValue2);
                    return null;
                }
            } else {
                if (!matcher2.matches()) {
                    androidx.media3.common.util.Log.w(TAG, "Ignoring region with unsupported origin: " + attributeValue2);
                    return null;
                }
                if (ttsExtent == null) {
                    androidx.media3.common.util.Log.w(TAG, "Ignoring region with missing tts:extent: " + attributeValue2);
                    return null;
                }
                try {
                    int i4 = java.lang.Integer.parseInt((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher2.group(1)));
                    int i5 = java.lang.Integer.parseInt((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher2.group(2)));
                    f2 = i4 / ttsExtent.width;
                    f = i5 / ttsExtent.height;
                } catch (java.lang.NumberFormatException unused2) {
                    androidx.media3.common.util.Log.w(TAG, "Ignoring region with malformed origin: " + attributeValue2);
                    return null;
                }
            }
            java.lang.String attributeValue3 = androidx.media3.common.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_EXTENT);
            if (attributeValue3 != null) {
                java.util.regex.Matcher matcher3 = pattern.matcher(attributeValue3);
                java.util.regex.Matcher matcher4 = pattern2.matcher(attributeValue3);
                if (matcher3.matches()) {
                    try {
                        f3 = java.lang.Float.parseFloat((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher3.group(1))) / 100.0f;
                        f4 = java.lang.Float.parseFloat((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher3.group(2))) / 100.0f;
                    } catch (java.lang.NumberFormatException unused3) {
                        androidx.media3.common.util.Log.w(TAG, "Ignoring region with malformed extent: " + attributeValue2);
                        return null;
                    }
                } else {
                    if (!matcher4.matches()) {
                        androidx.media3.common.util.Log.w(TAG, "Ignoring region with unsupported extent: " + attributeValue2);
                        return null;
                    }
                    if (ttsExtent == null) {
                        androidx.media3.common.util.Log.w(TAG, "Ignoring region with missing tts:extent: " + attributeValue2);
                        return null;
                    }
                    try {
                        int i6 = java.lang.Integer.parseInt((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher4.group(1)));
                        int i7 = java.lang.Integer.parseInt((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher4.group(2)));
                        f3 = i6 / ttsExtent.width;
                        f4 = i7 / ttsExtent.height;
                    } catch (java.lang.NumberFormatException unused4) {
                        androidx.media3.common.util.Log.w(TAG, "Ignoring region with malformed extent: " + attributeValue2);
                        return null;
                    }
                }
                java.lang.String attributeValue4 = androidx.media3.common.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                if (attributeValue4 != null) {
                    java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(attributeValue4);
                    lowerCase.hashCode();
                    if (lowerCase.equals(androidx.media3.extractor.text.ttml.TtmlNode.CENTER)) {
                        f5 = f + (f4 / 2.0f);
                        i2 = 1;
                    } else if (lowerCase.equals(androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_AFTER)) {
                        f5 = f + f4;
                        i2 = 2;
                    } else {
                        i2 = 0;
                        f5 = f;
                    }
                } else {
                    i2 = 0;
                    f5 = f;
                }
                float f7 = 1.0f / i;
                java.lang.String attributeValue5 = androidx.media3.common.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_WRITING_MODE);
                if (attributeValue5 != null) {
                    java.lang.String lowerCase2 = com.google.common.base.Ascii.toLowerCase(attributeValue5);
                    lowerCase2.hashCode();
                    switch (lowerCase2) {
                        case "tb":
                        case "tblr":
                            i3 = 2;
                            break;
                        case "tbrl":
                            i3 = 1;
                            break;
                        default:
                            i3 = Integer.MIN_VALUE;
                            break;
                    }
                } else {
                    i3 = Integer.MIN_VALUE;
                }
                return new androidx.media3.extractor.text.ttml.TtmlRegion(attributeValue, f2, f5, 0, i2, f3, f4, 1, f7, i3);
            }
            androidx.media3.common.util.Log.w(TAG, "Ignoring region without an extent");
            return null;
        }
        androidx.media3.common.util.Log.w(TAG, "Ignoring region without an origin");
        return null;
    }

    private static java.lang.String[] parseStyleIds(java.lang.String str) {
        java.lang.String strTrim = str.trim();
        return strTrim.isEmpty() ? new java.lang.String[0] : androidx.media3.common.util.Util.split(strTrim, "\\s+");
    }

    private static androidx.media3.extractor.text.ttml.TtmlStyle parseStyleAttributes(org.xmlpull.v1.XmlPullParser xmlPullParser, androidx.media3.extractor.text.ttml.TtmlStyle ttmlStyle) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            java.lang.String attributeValue = xmlPullParser.getAttributeValue(i);
            java.lang.String attributeName = xmlPullParser.getAttributeName(i);
            attributeName.hashCode();
            switch (attributeName) {
                case "fontStyle":
                    ttmlStyle = createIfNull(ttmlStyle).setItalic(androidx.media3.extractor.text.ttml.TtmlNode.ITALIC.equalsIgnoreCase(attributeValue));
                    break;
                case "fontFamily":
                    ttmlStyle = createIfNull(ttmlStyle).setFontFamily(attributeValue);
                    break;
                case "textAlign":
                    ttmlStyle = createIfNull(ttmlStyle).setTextAlign(parseAlignment(attributeValue));
                    break;
                case "textDecoration":
                    java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(attributeValue);
                    lowerCase.hashCode();
                    switch (lowerCase) {
                        case "nounderline":
                            ttmlStyle = createIfNull(ttmlStyle).setUnderline(false);
                            break;
                        case "underline":
                            ttmlStyle = createIfNull(ttmlStyle).setUnderline(true);
                            break;
                        case "nolinethrough":
                            ttmlStyle = createIfNull(ttmlStyle).setLinethrough(false);
                            break;
                        case "linethrough":
                            ttmlStyle = createIfNull(ttmlStyle).setLinethrough(true);
                            break;
                    }
                    break;
                case "fontWeight":
                    ttmlStyle = createIfNull(ttmlStyle).setBold(androidx.media3.extractor.text.ttml.TtmlNode.BOLD.equalsIgnoreCase(attributeValue));
                    break;
                case "id":
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        ttmlStyle = createIfNull(ttmlStyle).setId(attributeValue);
                        break;
                    }
                    break;
                case "ruby":
                    java.lang.String lowerCase2 = com.google.common.base.Ascii.toLowerCase(attributeValue);
                    lowerCase2.hashCode();
                    switch (lowerCase2) {
                        case "baseContainer":
                        case "base":
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(2);
                            break;
                        case "container":
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(1);
                            break;
                        case "delimiter":
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(4);
                            break;
                        case "textContainer":
                        case "text":
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(3);
                            break;
                    }
                    break;
                case "color":
                    ttmlStyle = createIfNull(ttmlStyle);
                    try {
                        ttmlStyle.setFontColor(androidx.media3.common.util.ColorParser.parseTtmlColor(attributeValue));
                        break;
                    } catch (java.lang.IllegalArgumentException unused) {
                        androidx.media3.common.util.Log.w(TAG, "Failed parsing color value: " + attributeValue);
                        break;
                    }
                    break;
                case "shear":
                    ttmlStyle = createIfNull(ttmlStyle).setShearPercentage(parseShear(attributeValue));
                    break;
                case "textCombine":
                    java.lang.String lowerCase3 = com.google.common.base.Ascii.toLowerCase(attributeValue);
                    lowerCase3.hashCode();
                    if (!lowerCase3.equals(androidx.media3.extractor.text.ttml.TtmlNode.COMBINE_ALL)) {
                        if (lowerCase3.equals("none")) {
                            ttmlStyle = createIfNull(ttmlStyle).setTextCombine(false);
                        }
                        break;
                    } else {
                        ttmlStyle = createIfNull(ttmlStyle).setTextCombine(true);
                        break;
                    }
                    break;
                case "fontSize":
                    try {
                        ttmlStyle = createIfNull(ttmlStyle);
                        parseFontSize(attributeValue, ttmlStyle);
                        break;
                    } catch (androidx.media3.extractor.text.SubtitleDecoderException unused2) {
                        androidx.media3.common.util.Log.w(TAG, "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                    break;
                case "textEmphasis":
                    ttmlStyle = createIfNull(ttmlStyle).setTextEmphasis(androidx.media3.extractor.text.ttml.TextEmphasis.parse(attributeValue));
                    break;
                case "rubyPosition":
                    java.lang.String lowerCase4 = com.google.common.base.Ascii.toLowerCase(attributeValue);
                    lowerCase4.hashCode();
                    if (!lowerCase4.equals(androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_BEFORE)) {
                        if (lowerCase4.equals(androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_AFTER)) {
                            ttmlStyle = createIfNull(ttmlStyle).setRubyPosition(2);
                        }
                        break;
                    } else {
                        ttmlStyle = createIfNull(ttmlStyle).setRubyPosition(1);
                        break;
                    }
                    break;
                case "backgroundColor":
                    ttmlStyle = createIfNull(ttmlStyle);
                    try {
                        ttmlStyle.setBackgroundColor(androidx.media3.common.util.ColorParser.parseTtmlColor(attributeValue));
                        break;
                    } catch (java.lang.IllegalArgumentException unused3) {
                        androidx.media3.common.util.Log.w(TAG, "Failed parsing background value: " + attributeValue);
                        break;
                    }
                    break;
                case "multiRowAlign":
                    ttmlStyle = createIfNull(ttmlStyle).setMultiRowAlign(parseAlignment(attributeValue));
                    break;
            }
        }
        return ttmlStyle;
    }

    private static androidx.media3.extractor.text.ttml.TtmlStyle createIfNull(androidx.media3.extractor.text.ttml.TtmlStyle ttmlStyle) {
        return ttmlStyle == null ? new androidx.media3.extractor.text.ttml.TtmlStyle() : ttmlStyle;
    }

    private static android.text.Layout.Alignment parseAlignment(java.lang.String str) {
        java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(str);
        lowerCase.hashCode();
        switch (lowerCase) {
            case "center":
                return android.text.Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return android.text.Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return android.text.Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:66:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:6:0x0039  */
    private static androidx.media3.extractor.text.ttml.TtmlNode parseNode(org.xmlpull.v1.XmlPullParser xmlPullParser, androidx.media3.extractor.text.ttml.TtmlNode ttmlNode, java.util.Map<java.lang.String, androidx.media3.extractor.text.ttml.TtmlRegion> map, androidx.media3.extractor.text.ttml.TtmlParser.FrameAndTickRate frameAndTickRate) throws androidx.media3.extractor.text.SubtitleDecoderException {
        long j;
        long j2;
        int attributeCount = xmlPullParser.getAttributeCount();
        androidx.media3.extractor.text.ttml.TtmlStyle styleAttributes = parseStyleAttributes(xmlPullParser, null);
        java.lang.String[] strArr = null;
        java.lang.String strSubstring = null;
        java.lang.String str = "";
        long timeExpression = androidx.media3.common.C.TIME_UNSET;
        long timeExpression2 = androidx.media3.common.C.TIME_UNSET;
        long timeExpression3 = androidx.media3.common.C.TIME_UNSET;
        for (int i = 0; i < attributeCount; i++) {
            java.lang.String attributeName = xmlPullParser.getAttributeName(i);
            java.lang.String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.hashCode();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    break;
                case "dur":
                    timeExpression3 = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case "end":
                    timeExpression2 = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case "begin":
                    timeExpression = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case "style":
                    java.lang.String[] styleIds = parseStyleIds(attributeValue);
                    if (styleIds.length > 0) {
                        strArr = styleIds;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (ttmlNode != null) {
            long j3 = ttmlNode.startTimeUs;
            j = androidx.media3.common.C.TIME_UNSET;
            if (j3 != androidx.media3.common.C.TIME_UNSET) {
                if (timeExpression != androidx.media3.common.C.TIME_UNSET) {
                    timeExpression += ttmlNode.startTimeUs;
                }
                if (timeExpression2 != androidx.media3.common.C.TIME_UNSET) {
                    timeExpression2 += ttmlNode.startTimeUs;
                }
            }
        } else {
            j = androidx.media3.common.C.TIME_UNSET;
        }
        long j4 = timeExpression;
        if (timeExpression2 != j) {
            j2 = timeExpression2;
        } else if (timeExpression3 != j) {
            j2 = j4 + timeExpression3;
        } else if (ttmlNode == null || ttmlNode.endTimeUs == j) {
            j2 = timeExpression2;
        } else {
            j2 = ttmlNode.endTimeUs;
        }
        return androidx.media3.extractor.text.ttml.TtmlNode.buildNode(xmlPullParser.getName(), j4, j2, styleAttributes, strArr, str, strSubstring, ttmlNode);
    }

    private static boolean isSupportedTag(java.lang.String str) {
        return str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_TT) || str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD) || str.equals("body") || str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_DIV) || str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_P) || str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_SPAN) || str.equals("br") || str.equals("style") || str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_STYLING) || str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_LAYOUT) || str.equals("region") || str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_METADATA) || str.equals("image") || str.equals("data") || str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_INFORMATION);
    }

    private static void parseFontSize(java.lang.String str, androidx.media3.extractor.text.ttml.TtmlStyle ttmlStyle) throws androidx.media3.extractor.text.SubtitleDecoderException {
        java.util.regex.Matcher matcher;
        java.lang.String[] strArrSplit = androidx.media3.common.util.Util.split(str, "\\s+");
        if (strArrSplit.length == 1) {
            matcher = FONT_SIZE.matcher(str);
        } else if (strArrSplit.length == 2) {
            matcher = FONT_SIZE.matcher(strArrSplit[1]);
            androidx.media3.common.util.Log.w(TAG, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new androidx.media3.extractor.text.SubtitleDecoderException("Invalid number of entries for fontSize: " + strArrSplit.length + ".");
        }
        if (matcher.matches()) {
            java.lang.String str2 = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(3));
            str2.hashCode();
            switch (str2) {
                case "%":
                    ttmlStyle.setFontSizeUnit(3);
                    break;
                case "em":
                    ttmlStyle.setFontSizeUnit(2);
                    break;
                case "px":
                    ttmlStyle.setFontSizeUnit(1);
                    break;
                default:
                    throw new androidx.media3.extractor.text.SubtitleDecoderException("Invalid unit for fontSize: '" + str2 + "'.");
            }
            ttmlStyle.setFontSize(java.lang.Float.parseFloat((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(1))));
            return;
        }
        throw new androidx.media3.extractor.text.SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
    }

    private static float parseShear(java.lang.String str) {
        java.util.regex.Matcher matcher = SIGNED_PERCENTAGE.matcher(str);
        if (!matcher.matches()) {
            androidx.media3.common.util.Log.w(TAG, "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return java.lang.Math.min(100.0f, java.lang.Math.max(-100.0f, java.lang.Float.parseFloat((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(1)))));
        } catch (java.lang.NumberFormatException e) {
            androidx.media3.common.util.Log.w(TAG, "Failed to parse shear: " + str, e);
            return Float.MAX_VALUE;
        }
    }

    private static long parseTimeExpression(java.lang.String str, androidx.media3.extractor.text.ttml.TtmlParser.FrameAndTickRate frameAndTickRate) throws androidx.media3.extractor.text.SubtitleDecoderException {
        double d;
        double d2;
        java.util.regex.Matcher matcher = CLOCK_TIME.matcher(str);
        if (matcher.matches()) {
            double d3 = (java.lang.Long.parseLong((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(1))) * 3600) + (java.lang.Long.parseLong((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(2))) * 60) + java.lang.Long.parseLong((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(3)));
            java.lang.String strGroup = matcher.group(4);
            double d4 = d3 + (strGroup != null ? java.lang.Double.parseDouble(strGroup) : 0.0d);
            java.lang.String strGroup2 = matcher.group(5);
            double d5 = d4 + (strGroup2 != null ? java.lang.Long.parseLong(strGroup2) / frameAndTickRate.effectiveFrameRate : 0.0d);
            java.lang.String strGroup3 = matcher.group(6);
            return (long) ((d5 + (strGroup3 != null ? (java.lang.Long.parseLong(strGroup3) / ((double) frameAndTickRate.subFrameRate)) / ((double) frameAndTickRate.effectiveFrameRate) : 0.0d)) * 1000000.0d);
        }
        java.util.regex.Matcher matcher2 = OFFSET_TIME.matcher(str);
        if (matcher2.matches()) {
            double d6 = java.lang.Double.parseDouble((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher2.group(1)));
            java.lang.String str2 = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher2.group(2));
            str2.hashCode();
            switch (str2) {
                case "f":
                    d = frameAndTickRate.effectiveFrameRate;
                    d6 /= d;
                    return (long) (d6 * 1000000.0d);
                case "h":
                    d2 = 3600.0d;
                    break;
                case "m":
                    d2 = 60.0d;
                    break;
                case "t":
                    d = frameAndTickRate.tickRate;
                    d6 /= d;
                    return (long) (d6 * 1000000.0d);
                case "ms":
                    d = 1000.0d;
                    d6 /= d;
                    return (long) (d6 * 1000000.0d);
                default:
                    return (long) (d6 * 1000000.0d);
            }
            d6 *= d2;
            return (long) (d6 * 1000000.0d);
        }
        throw new androidx.media3.extractor.text.SubtitleDecoderException("Malformed time expression: " + str);
    }

    private static final class FrameAndTickRate {
        final float effectiveFrameRate;
        final int subFrameRate;
        final int tickRate;

        FrameAndTickRate(float f, int i, int i2) {
            this.effectiveFrameRate = f;
            this.subFrameRate = i;
            this.tickRate = i2;
        }
    }

    private static final class TtsExtent {
        final int height;
        final int width;

        TtsExtent(int i, int i2) {
            this.width = i;
            this.height = i2;
        }
    }
}
