package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class fp extends com.applovin.impl.ek {
    private static final java.util.regex.Pattern p = java.util.regex.Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final java.util.regex.Pattern q = java.util.regex.Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final java.util.regex.Pattern r = java.util.regex.Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final java.util.regex.Pattern s = java.util.regex.Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final java.util.regex.Pattern t = java.util.regex.Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final java.util.regex.Pattern u = java.util.regex.Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final java.util.regex.Pattern v = java.util.regex.Pattern.compile("^(\\d+) (\\d+)$");
    private static final com.applovin.impl.fp.b w = new com.applovin.impl.fp.b(30.0f, 1, 1);
    private static final com.applovin.impl.fp.a x = new com.applovin.impl.fp.a(32, 15);
    private final org.xmlpull.v1.XmlPullParserFactory o;

    private static float c(java.lang.String str) {
        java.util.regex.Matcher matcher = s.matcher(str);
        if (!matcher.matches()) {
            com.applovin.impl.oc.d("TtmlDecoder", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return java.lang.Math.min(100.0f, java.lang.Math.max(-100.0f, java.lang.Float.parseFloat((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(1)))));
        } catch (java.lang.NumberFormatException e) {
            com.applovin.impl.oc.c("TtmlDecoder", "Failed to parse shear: " + str, e);
            return Float.MAX_VALUE;
        }
    }

    public fp() {
        super("TtmlDecoder");
        try {
            org.xmlpull.v1.XmlPullParserFactory xmlPullParserFactoryNewInstance = org.xmlpull.v1.XmlPullParserFactory.newInstance();
            this.o = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (org.xmlpull.v1.XmlPullParserException e) {
            throw new java.lang.RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    private static java.lang.String[] d(java.lang.String str) {
        java.lang.String strTrim = str.trim();
        return strTrim.isEmpty() ? new java.lang.String[0] : com.applovin.impl.xp.a(strTrim, "\\s+");
    }

    private static com.applovin.impl.jp a(com.applovin.impl.jp jpVar) {
        return jpVar == null ? new com.applovin.impl.jp() : jpVar;
    }

    private static android.text.Layout.Alignment b(java.lang.String str) {
        java.lang.String lowerCase = com.applovin.exoplayer2.common.base.Ascii.toLowerCase(str);
        lowerCase.hashCode();
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

    @Override // com.applovin.impl.ek
    protected com.applovin.impl.nl a(byte[] bArr, int i, boolean z) throws com.applovin.impl.pl {
        com.applovin.impl.fp.b bVar;
        try {
            org.xmlpull.v1.XmlPullParser xmlPullParserNewPullParser = this.o.newPullParser();
            java.util.HashMap map = new java.util.HashMap();
            java.util.HashMap map2 = new java.util.HashMap();
            java.util.HashMap map3 = new java.util.HashMap();
            map2.put("", new com.applovin.impl.hp(""));
            com.applovin.impl.fp.c cVarB = null;
            xmlPullParserNewPullParser.setInput(new java.io.ByteArrayInputStream(bArr, 0, i), null);
            java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
            com.applovin.impl.fp.b bVarA = w;
            com.applovin.impl.fp.a aVarA = x;
            int i2 = 0;
            com.applovin.impl.kp kpVar = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                com.applovin.impl.gp gpVar = (com.applovin.impl.gp) arrayDeque.peek();
                if (i2 == 0) {
                    java.lang.String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if (androidx.media3.extractor.text.ttml.TtmlNode.TAG_TT.equals(name)) {
                            bVarA = a(xmlPullParserNewPullParser);
                            aVarA = a(xmlPullParserNewPullParser, x);
                            cVarB = b(xmlPullParserNewPullParser);
                        }
                        com.applovin.impl.fp.c cVar = cVarB;
                        com.applovin.impl.fp.b bVar2 = bVarA;
                        com.applovin.impl.fp.a aVar = aVarA;
                        if (!a(name)) {
                            com.applovin.impl.oc.c("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            bVar = bVar2;
                        } else {
                            if (androidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD.equals(name)) {
                                bVar = bVar2;
                                a(xmlPullParserNewPullParser, map, aVar, cVar, map2, map3);
                            } else {
                                bVar = bVar2;
                                try {
                                    com.applovin.impl.gp gpVarA = a(xmlPullParserNewPullParser, gpVar, map2, bVar);
                                    arrayDeque.push(gpVarA);
                                    if (gpVar != null) {
                                        gpVar.a(gpVarA);
                                    }
                                } catch (com.applovin.impl.pl e) {
                                    com.applovin.impl.oc.c("TtmlDecoder", "Suppressing parser error", e);
                                    bVarA = bVar;
                                    cVarB = cVar;
                                    aVarA = aVar;
                                    i2++;
                                }
                            }
                            bVarA = bVar;
                            cVarB = cVar;
                            aVarA = aVar;
                        }
                        bVarA = bVar;
                        cVarB = cVar;
                        aVarA = aVar;
                        i2++;
                    } else if (eventType == 4) {
                        ((com.applovin.impl.gp) com.applovin.impl.b1.a(gpVar)).a(com.applovin.impl.gp.a(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_TT)) {
                            kpVar = new com.applovin.impl.kp((com.applovin.impl.gp) com.applovin.impl.b1.a((com.applovin.impl.gp) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                xmlPullParserNewPullParser.next();
            }
            if (kpVar != null) {
                return kpVar;
            }
            throw new com.applovin.impl.pl("No TTML subtitles found");
        } catch (java.io.IOException e2) {
            throw new java.lang.IllegalStateException("Unexpected error when reading input.", e2);
        } catch (org.xmlpull.v1.XmlPullParserException e3) {
            throw new com.applovin.impl.pl("Unable to decode source", e3);
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f796a;
        final int b;
        final int c;

        b(float f, int i, int i2) {
            this.f796a = f;
            this.b = i;
            this.c = i2;
        }
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f795a;
        final int b;

        a(int i, int i2) {
            this.f795a = i;
            this.b = i2;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f797a;
        final int b;

        c(int i, int i2) {
            this.f797a = i;
            this.b = i2;
        }
    }

    private static com.applovin.impl.fp.c b(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.lang.String strA = com.applovin.impl.gs.a(xmlPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_EXTENT);
        if (strA == null) {
            return null;
        }
        java.util.regex.Matcher matcher = u.matcher(strA);
        if (!matcher.matches()) {
            com.applovin.impl.oc.d("TtmlDecoder", "Ignoring non-pixel tts extent: " + strA);
            return null;
        }
        try {
            return new com.applovin.impl.fp.c(java.lang.Integer.parseInt((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(1))), java.lang.Integer.parseInt((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(2))));
        } catch (java.lang.NumberFormatException unused) {
            com.applovin.impl.oc.d("TtmlDecoder", "Ignoring malformed tts extent: " + strA);
            return null;
        }
    }

    private static boolean a(java.lang.String str) {
        return str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_TT) || str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD) || str.equals("body") || str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_DIV) || str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_P) || str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_SPAN) || str.equals("br") || str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_STYLE) || str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_STYLING) || str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_LAYOUT) || str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_REGION) || str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_METADATA) || str.equals("image") || str.equals("data") || str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_INFORMATION);
    }

    private static com.applovin.impl.fp.a a(org.xmlpull.v1.XmlPullParser xmlPullParser, com.applovin.impl.fp.a aVar) throws com.applovin.impl.pl {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        java.util.regex.Matcher matcher = v.matcher(attributeValue);
        if (!matcher.matches()) {
            com.applovin.impl.oc.d("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
        try {
            int i = java.lang.Integer.parseInt((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(1)));
            int i2 = java.lang.Integer.parseInt((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(2)));
            if (i != 0 && i2 != 0) {
                return new com.applovin.impl.fp.a(i, i2);
            }
            throw new com.applovin.impl.pl("Invalid cell resolution " + i + " " + i2);
        } catch (java.lang.NumberFormatException unused) {
            com.applovin.impl.oc.d("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
    }

    private static void a(java.lang.String str, com.applovin.impl.jp jpVar) throws com.applovin.impl.pl {
        java.util.regex.Matcher matcher;
        java.lang.String[] strArrA = com.applovin.impl.xp.a(str, "\\s+");
        if (strArrA.length == 1) {
            matcher = r.matcher(str);
        } else if (strArrA.length == 2) {
            matcher = r.matcher(strArrA[1]);
            com.applovin.impl.oc.d("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new com.applovin.impl.pl("Invalid number of entries for fontSize: " + strArrA.length + ".");
        }
        if (matcher.matches()) {
            java.lang.String str2 = (java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(3));
            str2.hashCode();
            str2.hashCode();
            switch (str2) {
                case "%":
                    jpVar.c(3);
                    break;
                case "em":
                    jpVar.c(2);
                    break;
                case "px":
                    jpVar.c(1);
                    break;
                default:
                    throw new com.applovin.impl.pl("Invalid unit for fontSize: '" + str2 + "'.");
            }
            jpVar.a(java.lang.Float.parseFloat((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(1))));
            return;
        }
        throw new com.applovin.impl.pl("Invalid expression for fontSize: '" + str + "'.");
    }

    private static com.applovin.impl.fp.b a(org.xmlpull.v1.XmlPullParser xmlPullParser) throws com.applovin.impl.pl {
        float f;
        java.lang.String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? java.lang.Integer.parseInt(attributeValue) : 30;
        java.lang.String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            java.lang.String[] strArrA = com.applovin.impl.xp.a(attributeValue2, " ");
            if (strArrA.length == 2) {
                f = java.lang.Integer.parseInt(strArrA[0]) / java.lang.Integer.parseInt(strArrA[1]);
            } else {
                throw new com.applovin.impl.pl("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f = 1.0f;
        }
        com.applovin.impl.fp.b bVar = w;
        int i2 = bVar.b;
        java.lang.String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = java.lang.Integer.parseInt(attributeValue3);
        }
        int i3 = bVar.c;
        java.lang.String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = java.lang.Integer.parseInt(attributeValue4);
        }
        return new com.applovin.impl.fp.b(i * f, i2, i3);
    }

    private static java.util.Map a(org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.Map map, com.applovin.impl.fp.a aVar, com.applovin.impl.fp.c cVar, java.util.Map map2, java.util.Map map3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        do {
            xmlPullParser.next();
            if (com.applovin.impl.gs.c(xmlPullParser, androidx.media3.extractor.text.ttml.TtmlNode.TAG_STYLE)) {
                java.lang.String strA = com.applovin.impl.gs.a(xmlPullParser, androidx.media3.extractor.text.ttml.TtmlNode.TAG_STYLE);
                com.applovin.impl.jp jpVarA = a(xmlPullParser, new com.applovin.impl.jp());
                if (strA != null) {
                    for (java.lang.String str : d(strA)) {
                        jpVarA.a((com.applovin.impl.jp) map.get(str));
                    }
                }
                java.lang.String strF = jpVarA.f();
                if (strF != null) {
                    map.put(strF, jpVarA);
                }
            } else if (com.applovin.impl.gs.c(xmlPullParser, androidx.media3.extractor.text.ttml.TtmlNode.TAG_REGION)) {
                com.applovin.impl.hp hpVarA = a(xmlPullParser, aVar, cVar);
                if (hpVarA != null) {
                    map2.put(hpVarA.f857a, hpVarA);
                }
            } else if (com.applovin.impl.gs.c(xmlPullParser, androidx.media3.extractor.text.ttml.TtmlNode.TAG_METADATA)) {
                a(xmlPullParser, map3);
            }
        } while (!com.applovin.impl.gs.b(xmlPullParser, androidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD));
        return map;
    }

    private static void a(org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.Map map) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        java.lang.String strA;
        do {
            xmlPullParser.next();
            if (com.applovin.impl.gs.c(xmlPullParser, "image") && (strA = com.applovin.impl.gs.a(xmlPullParser, "id")) != null) {
                map.put(strA, xmlPullParser.nextText());
            }
        } while (!com.applovin.impl.gs.b(xmlPullParser, androidx.media3.extractor.text.ttml.TtmlNode.TAG_METADATA));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:6:0x003c  */
    private static com.applovin.impl.gp a(org.xmlpull.v1.XmlPullParser xmlPullParser, com.applovin.impl.gp gpVar, java.util.Map map, com.applovin.impl.fp.b bVar) throws com.applovin.impl.pl {
        long j;
        long j2;
        int attributeCount = xmlPullParser.getAttributeCount();
        com.applovin.impl.jp jpVarA = a(xmlPullParser, (com.applovin.impl.jp) null);
        java.lang.String[] strArr = null;
        java.lang.String strSubstring = null;
        java.lang.String str = "";
        long jA = androidx.media3.common.C.TIME_UNSET;
        long jA2 = androidx.media3.common.C.TIME_UNSET;
        long jA3 = androidx.media3.common.C.TIME_UNSET;
        for (int i = 0; i < attributeCount; i++) {
            java.lang.String attributeName = xmlPullParser.getAttributeName(i);
            java.lang.String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.hashCode();
            attributeName.hashCode();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    break;
                case "dur":
                    jA3 = a(attributeValue, bVar);
                    break;
                case "end":
                    jA2 = a(attributeValue, bVar);
                    break;
                case "begin":
                    jA = a(attributeValue, bVar);
                    break;
                case "style":
                    java.lang.String[] strArrD = d(attributeValue);
                    if (strArrD.length > 0) {
                        strArr = strArrD;
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
        if (gpVar != null) {
            long j3 = gpVar.d;
            j = androidx.media3.common.C.TIME_UNSET;
            if (j3 != androidx.media3.common.C.TIME_UNSET) {
                if (jA != androidx.media3.common.C.TIME_UNSET) {
                    jA += j3;
                }
                if (jA2 != androidx.media3.common.C.TIME_UNSET) {
                    jA2 += j3;
                }
            }
        } else {
            j = androidx.media3.common.C.TIME_UNSET;
        }
        long j4 = jA;
        if (jA2 != j) {
            j2 = jA2;
        } else if (jA3 != j) {
            j2 = j4 + jA3;
        } else if (gpVar != null) {
            long j5 = gpVar.e;
            if (j5 != j) {
                j2 = j5;
            } else {
                j2 = jA2;
            }
        } else {
            j2 = jA2;
        }
        return com.applovin.impl.gp.a(xmlPullParser.getName(), j4, j2, jpVarA, strArr, str, strSubstring, gpVar);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0161  */
    /* JADX WARN: Code duplicated, block: B:65:0x01af  */
    private static com.applovin.impl.hp a(org.xmlpull.v1.XmlPullParser xmlPullParser, com.applovin.impl.fp.a aVar, com.applovin.impl.fp.c cVar) {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        float f5;
        int i2;
        java.lang.String strA = com.applovin.impl.gs.a(xmlPullParser, "id");
        if (strA == null) {
            return null;
        }
        java.lang.String strA2 = com.applovin.impl.gs.a(xmlPullParser, "origin");
        if (strA2 != null) {
            java.util.regex.Pattern pattern = t;
            java.util.regex.Matcher matcher = pattern.matcher(strA2);
            java.util.regex.Pattern pattern2 = u;
            java.util.regex.Matcher matcher2 = pattern2.matcher(strA2);
            if (matcher.matches()) {
                try {
                    float f6 = java.lang.Float.parseFloat((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(1))) / 100.0f;
                    f = java.lang.Float.parseFloat((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(2))) / 100.0f;
                    f2 = f6;
                } catch (java.lang.NumberFormatException unused) {
                    com.applovin.impl.oc.d("TtmlDecoder", "Ignoring region with malformed origin: " + strA2);
                    return null;
                }
            } else {
                if (!matcher2.matches()) {
                    com.applovin.impl.oc.d("TtmlDecoder", "Ignoring region with unsupported origin: " + strA2);
                    return null;
                }
                if (cVar == null) {
                    com.applovin.impl.oc.d("TtmlDecoder", "Ignoring region with missing tts:extent: " + strA2);
                    return null;
                }
                try {
                    int i3 = java.lang.Integer.parseInt((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher2.group(1)));
                    int i4 = java.lang.Integer.parseInt((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher2.group(2)));
                    f2 = i3 / cVar.f797a;
                    f = i4 / cVar.b;
                } catch (java.lang.NumberFormatException unused2) {
                    com.applovin.impl.oc.d("TtmlDecoder", "Ignoring region with malformed origin: " + strA2);
                    return null;
                }
            }
            java.lang.String strA3 = com.applovin.impl.gs.a(xmlPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_EXTENT);
            if (strA3 != null) {
                java.util.regex.Matcher matcher3 = pattern.matcher(strA3);
                java.util.regex.Matcher matcher4 = pattern2.matcher(strA3);
                if (matcher3.matches()) {
                    try {
                        f3 = java.lang.Float.parseFloat((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher3.group(1))) / 100.0f;
                        f4 = java.lang.Float.parseFloat((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher3.group(2))) / 100.0f;
                    } catch (java.lang.NumberFormatException unused3) {
                        com.applovin.impl.oc.d("TtmlDecoder", "Ignoring region with malformed extent: " + strA2);
                        return null;
                    }
                } else {
                    if (!matcher4.matches()) {
                        com.applovin.impl.oc.d("TtmlDecoder", "Ignoring region with unsupported extent: " + strA2);
                        return null;
                    }
                    if (cVar == null) {
                        com.applovin.impl.oc.d("TtmlDecoder", "Ignoring region with missing tts:extent: " + strA2);
                        return null;
                    }
                    try {
                        int i5 = java.lang.Integer.parseInt((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher4.group(1)));
                        int i6 = java.lang.Integer.parseInt((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher4.group(2)));
                        f3 = i5 / cVar.f797a;
                        f4 = i6 / cVar.b;
                    } catch (java.lang.NumberFormatException unused4) {
                        com.applovin.impl.oc.d("TtmlDecoder", "Ignoring region with malformed extent: " + strA2);
                        return null;
                    }
                }
                java.lang.String strA4 = com.applovin.impl.gs.a(xmlPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                if (strA4 != null) {
                    java.lang.String lowerCase = com.applovin.exoplayer2.common.base.Ascii.toLowerCase(strA4);
                    lowerCase.hashCode();
                    if (lowerCase.equals(androidx.media3.extractor.text.ttml.TtmlNode.CENTER)) {
                        f5 = f + (f4 / 2.0f);
                        i = 1;
                    } else if (lowerCase.equals(androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_AFTER)) {
                        f5 = f + f4;
                        i = 2;
                    } else {
                        i = 0;
                        f5 = f;
                    }
                } else {
                    i = 0;
                    f5 = f;
                }
                float f7 = 1.0f / aVar.b;
                java.lang.String strA5 = com.applovin.impl.gs.a(xmlPullParser, androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_WRITING_MODE);
                if (strA5 != null) {
                    java.lang.String lowerCase2 = com.applovin.exoplayer2.common.base.Ascii.toLowerCase(strA5);
                    lowerCase2.hashCode();
                    lowerCase2.hashCode();
                    switch (lowerCase2) {
                        case "tb":
                        case "tblr":
                            i2 = 2;
                            break;
                        case "tbrl":
                            i2 = 1;
                            break;
                        default:
                            i2 = Integer.MIN_VALUE;
                            break;
                    }
                } else {
                    i2 = Integer.MIN_VALUE;
                }
                return new com.applovin.impl.hp(strA, f2, f5, 0, i, f3, f4, 1, f7, i2);
            }
            com.applovin.impl.oc.d("TtmlDecoder", "Ignoring region without an extent");
            return null;
        }
        com.applovin.impl.oc.d("TtmlDecoder", "Ignoring region without an origin");
        return null;
    }

    private static com.applovin.impl.jp a(org.xmlpull.v1.XmlPullParser xmlPullParser, com.applovin.impl.jp jpVar) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            java.lang.String attributeValue = xmlPullParser.getAttributeValue(i);
            java.lang.String attributeName = xmlPullParser.getAttributeName(i);
            attributeName.hashCode();
            attributeName.hashCode();
            switch (attributeName) {
                case "fontStyle":
                    jpVar = a(jpVar).b(androidx.media3.extractor.text.ttml.TtmlNode.ITALIC.equalsIgnoreCase(attributeValue));
                    break;
                case "fontFamily":
                    jpVar = a(jpVar).a(attributeValue);
                    break;
                case "textAlign":
                    jpVar = a(jpVar).b(b(attributeValue));
                    break;
                case "textDecoration":
                    java.lang.String lowerCase = com.applovin.exoplayer2.common.base.Ascii.toLowerCase(attributeValue);
                    lowerCase.hashCode();
                    lowerCase.hashCode();
                    switch (lowerCase) {
                        case "nounderline":
                            jpVar = a(jpVar).e(false);
                            break;
                        case "underline":
                            jpVar = a(jpVar).e(true);
                            break;
                        case "nolinethrough":
                            jpVar = a(jpVar).c(false);
                            break;
                        case "linethrough":
                            jpVar = a(jpVar).c(true);
                            break;
                    }
                    break;
                case "fontWeight":
                    jpVar = a(jpVar).a(androidx.media3.extractor.text.ttml.TtmlNode.BOLD.equalsIgnoreCase(attributeValue));
                    break;
                case "id":
                    if (!androidx.media3.extractor.text.ttml.TtmlNode.TAG_STYLE.equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        jpVar = a(jpVar).b(attributeValue);
                        break;
                    }
                    break;
                case "ruby":
                    java.lang.String lowerCase2 = com.applovin.exoplayer2.common.base.Ascii.toLowerCase(attributeValue);
                    lowerCase2.hashCode();
                    lowerCase2.hashCode();
                    switch (lowerCase2) {
                        case "baseContainer":
                        case "base":
                            jpVar = a(jpVar).e(2);
                            break;
                        case "container":
                            jpVar = a(jpVar).e(1);
                            break;
                        case "delimiter":
                            jpVar = a(jpVar).e(4);
                            break;
                        case "textContainer":
                        case "text":
                            jpVar = a(jpVar).e(3);
                            break;
                    }
                    break;
                case "color":
                    jpVar = a(jpVar);
                    try {
                        jpVar.b(com.applovin.impl.s3.b(attributeValue));
                        break;
                    } catch (java.lang.IllegalArgumentException unused) {
                        com.applovin.impl.oc.d("TtmlDecoder", "Failed parsing color value: " + attributeValue);
                        break;
                    }
                    break;
                case "shear":
                    jpVar = a(jpVar).b(c(attributeValue));
                    break;
                case "textCombine":
                    java.lang.String lowerCase3 = com.applovin.exoplayer2.common.base.Ascii.toLowerCase(attributeValue);
                    lowerCase3.hashCode();
                    if (!lowerCase3.equals(androidx.media3.extractor.text.ttml.TtmlNode.COMBINE_ALL)) {
                        if (lowerCase3.equals("none")) {
                            jpVar = a(jpVar).d(false);
                        }
                        break;
                    } else {
                        jpVar = a(jpVar).d(true);
                        break;
                    }
                    break;
                case "fontSize":
                    try {
                        jpVar = a(jpVar);
                        a(attributeValue, jpVar);
                        break;
                    } catch (com.applovin.impl.pl unused2) {
                        com.applovin.impl.oc.d("TtmlDecoder", "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                    break;
                case "textEmphasis":
                    jpVar = a(jpVar).a(com.applovin.impl.xn.a(attributeValue));
                    break;
                case "rubyPosition":
                    java.lang.String lowerCase4 = com.applovin.exoplayer2.common.base.Ascii.toLowerCase(attributeValue);
                    lowerCase4.hashCode();
                    if (!lowerCase4.equals(androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_BEFORE)) {
                        if (lowerCase4.equals(androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_AFTER)) {
                            jpVar = a(jpVar).d(2);
                        }
                        break;
                    } else {
                        jpVar = a(jpVar).d(1);
                        break;
                    }
                    break;
                case "backgroundColor":
                    jpVar = a(jpVar);
                    try {
                        jpVar.a(com.applovin.impl.s3.b(attributeValue));
                        break;
                    } catch (java.lang.IllegalArgumentException unused3) {
                        com.applovin.impl.oc.d("TtmlDecoder", "Failed parsing background value: " + attributeValue);
                        break;
                    }
                    break;
                case "multiRowAlign":
                    jpVar = a(jpVar).a(b(attributeValue));
                    break;
            }
        }
        return jpVar;
    }

    private static long a(java.lang.String str, com.applovin.impl.fp.b bVar) throws com.applovin.impl.pl {
        double d;
        double d2;
        java.util.regex.Matcher matcher = p.matcher(str);
        if (matcher.matches()) {
            double d3 = (java.lang.Long.parseLong((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(1))) * 3600) + (java.lang.Long.parseLong((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(2))) * 60) + java.lang.Long.parseLong((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher.group(3)));
            java.lang.String strGroup = matcher.group(4);
            double d4 = d3 + (strGroup != null ? java.lang.Double.parseDouble(strGroup) : 0.0d);
            java.lang.String strGroup2 = matcher.group(5);
            double d5 = d4 + (strGroup2 != null ? java.lang.Long.parseLong(strGroup2) / bVar.f796a : 0.0d);
            java.lang.String strGroup3 = matcher.group(6);
            return (long) ((d5 + (strGroup3 != null ? (java.lang.Long.parseLong(strGroup3) / ((double) bVar.b)) / ((double) bVar.f796a) : 0.0d)) * 1000000.0d);
        }
        java.util.regex.Matcher matcher2 = q.matcher(str);
        if (matcher2.matches()) {
            double d6 = java.lang.Double.parseDouble((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher2.group(1)));
            java.lang.String str2 = (java.lang.String) com.applovin.impl.b1.a((java.lang.Object) matcher2.group(2));
            str2.hashCode();
            str2.hashCode();
            switch (str2) {
                case "f":
                    d = bVar.f796a;
                    d6 /= d;
                    return (long) (d6 * 1000000.0d);
                case "h":
                    d2 = 3600.0d;
                    break;
                case "m":
                    d2 = 60.0d;
                    break;
                case "t":
                    d = bVar.c;
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
        throw new com.applovin.impl.pl("Malformed time expression: " + str);
    }
}
