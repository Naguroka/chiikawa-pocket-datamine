package androidx.media3.exoplayer.dash.manifest;

/* JADX INFO: loaded from: classes.dex */
public class DashManifestParser extends org.xml.sax.helpers.DefaultHandler implements androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<androidx.media3.exoplayer.dash.manifest.DashManifest> {
    private static final java.lang.String TAG = "MpdParser";
    private final org.xmlpull.v1.XmlPullParserFactory xmlParserFactory;
    private static final java.util.regex.Pattern FRAME_RATE_PATTERN = java.util.regex.Pattern.compile("(\\d+)(?:/(\\d+))?");
    private static final java.util.regex.Pattern CEA_608_ACCESSIBILITY_PATTERN = java.util.regex.Pattern.compile("CC([1-4])=.*");
    private static final java.util.regex.Pattern CEA_708_ACCESSIBILITY_PATTERN = java.util.regex.Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    private static final int[] MPEG_CHANNEL_CONFIGURATION_MAPPING = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    private static long getFinalAvailabilityTimeOffset(long j, long j2) {
        if (j2 != androidx.media3.common.C.TIME_UNSET) {
            j = j2;
        }
        return j == Long.MAX_VALUE ? androidx.media3.common.C.TIME_UNSET : j;
    }

    public DashManifestParser() {
        try {
            this.xmlParserFactory = org.xmlpull.v1.XmlPullParserFactory.newInstance();
        } catch (org.xmlpull.v1.XmlPullParserException e) {
            throw new java.lang.RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
    public androidx.media3.exoplayer.dash.manifest.DashManifest parse(android.net.Uri uri, java.io.InputStream inputStream) throws java.io.IOException {
        try {
            org.xmlpull.v1.XmlPullParser xmlPullParserNewPullParser = this.xmlParserFactory.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() != 2 || !"MPD".equals(xmlPullParserNewPullParser.getName())) {
                throw androidx.media3.common.ParserException.createForMalformedManifest("inputStream does not contain a valid media presentation description", null);
            }
            return parseMediaPresentationDescription(xmlPullParserNewPullParser, uri);
        } catch (org.xmlpull.v1.XmlPullParserException e) {
            throw androidx.media3.common.ParserException.createForMalformedManifest(null, e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x01af  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:78:0x01be  */
    /* JADX WARN: Code duplicated, block: B:80:0x01de  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e5 A[LOOP:0: B:25:0x00a4->B:82:0x01e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x01a1 A[SYNTHETIC] */
    protected androidx.media3.exoplayer.dash.manifest.DashManifest parseMediaPresentationDescription(org.xmlpull.v1.XmlPullParser xmlPullParser, android.net.Uri uri) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        long j;
        boolean z;
        long j2;
        java.lang.Throwable th;
        java.util.ArrayList arrayList;
        boolean z2;
        long j3;
        androidx.media3.exoplayer.dash.manifest.DashManifestParser dashManifestParser = this;
        boolean zIsDvbProfileDeclared = dashManifestParser.isDvbProfileDeclared(dashManifestParser.parseProfiles(xmlPullParser, "profiles", new java.lang.String[0]));
        long j4 = androidx.media3.common.C.TIME_UNSET;
        long dateTime = parseDateTime(xmlPullParser, "availabilityStartTime", androidx.media3.common.C.TIME_UNSET);
        long duration = parseDuration(xmlPullParser, "mediaPresentationDuration", androidx.media3.common.C.TIME_UNSET);
        long duration2 = parseDuration(xmlPullParser, "minBufferTime", androidx.media3.common.C.TIME_UNSET);
        java.lang.Throwable th2 = null;
        boolean zEquals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long duration3 = zEquals ? parseDuration(xmlPullParser, "minimumUpdatePeriod", androidx.media3.common.C.TIME_UNSET) : -9223372036854775807L;
        long duration4 = zEquals ? parseDuration(xmlPullParser, "timeShiftBufferDepth", androidx.media3.common.C.TIME_UNSET) : -9223372036854775807L;
        long duration5 = zEquals ? parseDuration(xmlPullParser, "suggestedPresentationDelay", androidx.media3.common.C.TIME_UNSET) : -9223372036854775807L;
        long dateTime2 = parseDateTime(xmlPullParser, "publishTime", androidx.media3.common.C.TIME_UNSET);
        long availabilityTimeOffsetUs = zEquals ? 0L : -9223372036854775807L;
        boolean z3 = true;
        java.util.ArrayList arrayListNewArrayList = com.google.common.collect.Lists.newArrayList(new androidx.media3.exoplayer.dash.manifest.BaseUrl(uri.toString(), uri.toString(), zIsDvbProfileDeclared ? 1 : Integer.MIN_VALUE, 1));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        boolean z4 = false;
        boolean z5 = false;
        long j5 = zEquals ? -9223372036854775807L : 0L;
        androidx.media3.exoplayer.dash.manifest.ProgramInformation programInformation = null;
        androidx.media3.exoplayer.dash.manifest.UtcTimingElement utcTiming = null;
        android.net.Uri uriResolveToUri = null;
        androidx.media3.exoplayer.dash.manifest.ServiceDescriptionElement serviceDescription = null;
        while (true) {
            xmlPullParser.next();
            if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "BaseURL")) {
                if (!z4) {
                    availabilityTimeOffsetUs = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser, availabilityTimeOffsetUs);
                    z4 = z3;
                }
                arrayList3.addAll(dashManifestParser.parseBaseUrl(xmlPullParser, arrayListNewArrayList, zIsDvbProfileDeclared));
            } else if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "ProgramInformation")) {
                programInformation = parseProgramInformation(xmlPullParser);
            } else if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "UTCTiming")) {
                utcTiming = parseUtcTiming(xmlPullParser);
            } else if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, com.google.common.net.HttpHeaders.LOCATION)) {
                uriResolveToUri = androidx.media3.common.util.UriUtil.resolveToUri(uri.toString(), xmlPullParser.nextText());
            } else {
                if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "ServiceDescription")) {
                    serviceDescription = parseServiceDescription(xmlPullParser);
                } else {
                    if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "Period") && !z5) {
                        j = availabilityTimeOffsetUs;
                        arrayList = arrayList2;
                        z = z3;
                        j2 = j4;
                        th = th2;
                        android.util.Pair<androidx.media3.exoplayer.dash.manifest.Period, java.lang.Long> period = parsePeriod(xmlPullParser, !arrayList3.isEmpty() ? arrayList3 : arrayListNewArrayList, j5, j, dateTime, duration4, zIsDvbProfileDeclared);
                        androidx.media3.exoplayer.dash.manifest.Period period2 = (androidx.media3.exoplayer.dash.manifest.Period) period.first;
                        if (period2.startMs != j2) {
                            long jLongValue = ((java.lang.Long) period.second).longValue();
                            long j6 = jLongValue == j2 ? j2 : period2.startMs + jLongValue;
                            arrayList.add(period2);
                            j5 = j6;
                            z2 = z5;
                        } else {
                            if (!zEquals) {
                                throw androidx.media3.common.ParserException.createForMalformedManifest("Unable to determine start of period " + arrayList.size(), th);
                            }
                            arrayList = arrayList;
                            z2 = z;
                        }
                        z5 = z2;
                    } else {
                        j = availabilityTimeOffsetUs;
                        z = z3;
                        j2 = j4;
                        th = th2;
                        arrayList = arrayList2;
                        maybeSkipTag(xmlPullParser);
                    }
                    availabilityTimeOffsetUs = j;
                }
                if (androidx.media3.common.util.XmlPullParserUtil.isEndTag(xmlPullParser, "MPD")) {
                    if (duration != j2) {
                        j3 = duration;
                    } else if (j5 != j2) {
                        j3 = j5;
                    } else {
                        if (!zEquals) {
                            throw androidx.media3.common.ParserException.createForMalformedManifest("Unable to determine duration of static manifest.", th);
                        }
                        j3 = duration;
                    }
                    if (!arrayList.isEmpty()) {
                        throw androidx.media3.common.ParserException.createForMalformedManifest("No periods found.", th);
                    }
                    return buildMediaPresentationDescription(dateTime, j3, duration2, zEquals, duration3, duration4, duration5, dateTime2, programInformation, utcTiming, serviceDescription, uriResolveToUri, arrayList);
                }
                arrayList2 = arrayList;
                th2 = th;
                arrayList3 = arrayList3;
                z3 = z;
                arrayListNewArrayList = arrayListNewArrayList;
                j4 = j2;
                dashManifestParser = this;
            }
            arrayList3 = arrayList3;
            arrayListNewArrayList = arrayListNewArrayList;
            z = z3;
            j2 = j4;
            th = th2;
            arrayList = arrayList2;
            if (androidx.media3.common.util.XmlPullParserUtil.isEndTag(xmlPullParser, "MPD")) {
                if (duration != j2) {
                    j3 = duration;
                } else if (j5 != j2) {
                    j3 = j5;
                } else {
                    if (!zEquals) {
                        throw androidx.media3.common.ParserException.createForMalformedManifest("Unable to determine duration of static manifest.", th);
                    }
                    j3 = duration;
                }
                if (!arrayList.isEmpty()) {
                    throw androidx.media3.common.ParserException.createForMalformedManifest("No periods found.", th);
                }
                return buildMediaPresentationDescription(dateTime, j3, duration2, zEquals, duration3, duration4, duration5, dateTime2, programInformation, utcTiming, serviceDescription, uriResolveToUri, arrayList);
            }
            arrayList2 = arrayList;
            th2 = th;
            arrayList3 = arrayList3;
            z3 = z;
            arrayListNewArrayList = arrayListNewArrayList;
            j4 = j2;
            dashManifestParser = this;
        }
    }

    protected androidx.media3.exoplayer.dash.manifest.DashManifest buildMediaPresentationDescription(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, androidx.media3.exoplayer.dash.manifest.ProgramInformation programInformation, androidx.media3.exoplayer.dash.manifest.UtcTimingElement utcTimingElement, androidx.media3.exoplayer.dash.manifest.ServiceDescriptionElement serviceDescriptionElement, android.net.Uri uri, java.util.List<androidx.media3.exoplayer.dash.manifest.Period> list) {
        return new androidx.media3.exoplayer.dash.manifest.DashManifest(j, j2, j3, z, j4, j5, j6, j7, programInformation, utcTimingElement, serviceDescriptionElement, uri, list);
    }

    protected androidx.media3.exoplayer.dash.manifest.UtcTimingElement parseUtcTiming(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        return buildUtcTimingElement(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    protected androidx.media3.exoplayer.dash.manifest.UtcTimingElement buildUtcTimingElement(java.lang.String str, java.lang.String str2) {
        return new androidx.media3.exoplayer.dash.manifest.UtcTimingElement(str, str2);
    }

    protected androidx.media3.exoplayer.dash.manifest.ServiceDescriptionElement parseServiceDescription(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        long j = -9223372036854775807L;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        float f = -3.4028235E38f;
        float f2 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "Latency")) {
                j = parseLong(xmlPullParser, androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, androidx.media3.common.C.TIME_UNSET);
                j2 = parseLong(xmlPullParser, "min", androidx.media3.common.C.TIME_UNSET);
                j3 = parseLong(xmlPullParser, com.applovin.sdk.AppLovinMediationProvider.MAX, androidx.media3.common.C.TIME_UNSET);
            } else if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "PlaybackRate")) {
                f = parseFloat(xmlPullParser, "min", -3.4028235E38f);
                f2 = parseFloat(xmlPullParser, com.applovin.sdk.AppLovinMediationProvider.MAX, -3.4028235E38f);
            }
            long j4 = j;
            long j5 = j2;
            long j6 = j3;
            float f3 = f;
            float f4 = f2;
            if (androidx.media3.common.util.XmlPullParserUtil.isEndTag(xmlPullParser, "ServiceDescription")) {
                return new androidx.media3.exoplayer.dash.manifest.ServiceDescriptionElement(j4, j5, j6, f3, f4);
            }
            j = j4;
            j2 = j5;
            j3 = j6;
            f = f3;
            f2 = f4;
        }
    }

    protected android.util.Pair<androidx.media3.exoplayer.dash.manifest.Period, java.lang.Long> parsePeriod(org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> list, long j, long j2, long j3, long j4, boolean z) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        java.util.ArrayList arrayList;
        java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> list2;
        java.util.List<androidx.media3.exoplayer.dash.manifest.EventStream> list3;
        java.lang.Object obj;
        long j5;
        androidx.media3.exoplayer.dash.manifest.SegmentBase segmentTemplate;
        org.xmlpull.v1.XmlPullParser xmlPullParser2 = xmlPullParser;
        java.lang.Object obj2 = null;
        java.lang.String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        long duration = parseDuration(xmlPullParser2, androidx.media3.extractor.text.ttml.TtmlNode.START, j);
        long j6 = androidx.media3.common.C.TIME_UNSET;
        long j7 = j3 != androidx.media3.common.C.TIME_UNSET ? j3 + duration : -9223372036854775807L;
        long duration2 = parseDuration(xmlPullParser2, "duration", androidx.media3.common.C.TIME_UNSET);
        java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> arrayList2 = new java.util.ArrayList<>();
        java.util.List<androidx.media3.exoplayer.dash.manifest.EventStream> arrayList3 = new java.util.ArrayList<>();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        long availabilityTimeOffsetUs = j2;
        boolean z2 = false;
        long j8 = -9223372036854775807L;
        androidx.media3.exoplayer.dash.manifest.SegmentBase segmentBase = null;
        androidx.media3.exoplayer.dash.manifest.Descriptor descriptor = null;
        while (true) {
            xmlPullParser.next();
            if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser2, "BaseURL")) {
                if (!z2) {
                    availabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser2, availabilityTimeOffsetUs);
                    z2 = true;
                }
                arrayList4.addAll(parseBaseUrl(xmlPullParser2, list, z));
                list3 = arrayList3;
                arrayList = arrayList4;
                j5 = j6;
                obj = obj2;
                list2 = arrayList2;
            } else {
                if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser2, "AdaptationSet")) {
                    availabilityTimeOffsetUs = availabilityTimeOffsetUs;
                    arrayList = arrayList4;
                    list2 = arrayList2;
                    list2.add(parseAdaptationSet(xmlPullParser, !arrayList4.isEmpty() ? arrayList4 : list, segmentBase, duration2, availabilityTimeOffsetUs, j8, j7, j4, z));
                    xmlPullParser2 = xmlPullParser;
                    list3 = arrayList3;
                } else {
                    availabilityTimeOffsetUs = availabilityTimeOffsetUs;
                    java.util.List<androidx.media3.exoplayer.dash.manifest.EventStream> list4 = arrayList3;
                    arrayList = arrayList4;
                    list2 = arrayList2;
                    xmlPullParser2 = xmlPullParser;
                    if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser2, "EventStream")) {
                        list4.add(parseEventStream(xmlPullParser));
                        list3 = list4;
                    } else if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentBase")) {
                        list3 = list4;
                        segmentBase = parseSegmentBase(xmlPullParser2, null);
                        obj = null;
                        availabilityTimeOffsetUs = availabilityTimeOffsetUs;
                        j5 = androidx.media3.common.C.TIME_UNSET;
                    } else {
                        list3 = list4;
                        if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentList")) {
                            long availabilityTimeOffsetUs2 = parseAvailabilityTimeOffsetUs(xmlPullParser2, androidx.media3.common.C.TIME_UNSET);
                            obj = null;
                            segmentTemplate = parseSegmentList(xmlPullParser, null, j7, duration2, availabilityTimeOffsetUs, availabilityTimeOffsetUs2, j4);
                            j8 = availabilityTimeOffsetUs2;
                            j5 = androidx.media3.common.C.TIME_UNSET;
                        } else {
                            obj = null;
                            if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentTemplate")) {
                                long availabilityTimeOffsetUs3 = parseAvailabilityTimeOffsetUs(xmlPullParser2, androidx.media3.common.C.TIME_UNSET);
                                j5 = -9223372036854775807L;
                                segmentTemplate = parseSegmentTemplate(xmlPullParser, null, com.google.common.collect.ImmutableList.of(), j7, duration2, availabilityTimeOffsetUs, availabilityTimeOffsetUs3, j4);
                                j8 = availabilityTimeOffsetUs3;
                            } else {
                                j5 = androidx.media3.common.C.TIME_UNSET;
                                if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser2, "AssetIdentifier")) {
                                    descriptor = parseDescriptor(xmlPullParser2, "AssetIdentifier");
                                } else {
                                    maybeSkipTag(xmlPullParser);
                                }
                                availabilityTimeOffsetUs = availabilityTimeOffsetUs;
                            }
                        }
                        segmentBase = segmentTemplate;
                    }
                }
                obj = null;
                j5 = androidx.media3.common.C.TIME_UNSET;
                availabilityTimeOffsetUs = availabilityTimeOffsetUs;
            }
            if (androidx.media3.common.util.XmlPullParserUtil.isEndTag(xmlPullParser2, "Period")) {
                return android.util.Pair.create(buildPeriod(attributeValue, duration, list2, list3, descriptor), java.lang.Long.valueOf(duration2));
            }
            arrayList2 = list2;
            arrayList4 = arrayList;
            obj2 = obj;
            arrayList3 = list3;
            j6 = j5;
        }
    }

    protected androidx.media3.exoplayer.dash.manifest.Period buildPeriod(java.lang.String str, long j, java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> list, java.util.List<androidx.media3.exoplayer.dash.manifest.EventStream> list2, androidx.media3.exoplayer.dash.manifest.Descriptor descriptor) {
        return new androidx.media3.exoplayer.dash.manifest.Period(str, j, list, list2, descriptor);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0357 A[LOOP:0: B:3:0x007f->B:74:0x0357, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x0315 A[EDGE_INSN: B:75:0x0315->B:68:0x0315 BREAK  A[LOOP:0: B:3:0x007f->B:74:0x0357], SYNTHETIC] */
    protected androidx.media3.exoplayer.dash.manifest.AdaptationSet parseAdaptationSet(org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> list, androidx.media3.exoplayer.dash.manifest.SegmentBase segmentBase, long j, long j2, long j3, long j4, long j5, boolean z) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        java.util.List<androidx.media3.common.Label> list2;
        java.lang.Object obj;
        java.util.ArrayList<androidx.media3.exoplayer.dash.manifest.Descriptor> arrayList;
        java.lang.String str;
        java.util.List<androidx.media3.common.Label> list3;
        long j6;
        long j7;
        int i;
        long availabilityTimeOffsetUs;
        org.xmlpull.v1.XmlPullParser xmlPullParser2 = xmlPullParser;
        long j8 = parseLong(xmlPullParser2, "id", -1L);
        int contentType = parseContentType(xmlPullParser);
        java.lang.String attributeValue = xmlPullParser2.getAttributeValue(null, "mimeType");
        java.lang.String attributeValue2 = xmlPullParser2.getAttributeValue(null, "codecs");
        int i2 = parseInt(xmlPullParser2, "width", -1);
        int i3 = parseInt(xmlPullParser2, "height", -1);
        float frameRate = parseFrameRate(xmlPullParser2, -1.0f);
        int i4 = parseInt(xmlPullParser2, "audioSamplingRate", -1);
        java.lang.String str2 = com.json.ce.p;
        java.lang.String attributeValue3 = xmlPullParser2.getAttributeValue(null, com.json.ce.p);
        java.lang.String attributeValue4 = xmlPullParser2.getAttributeValue(null, "label");
        java.util.List<androidx.media3.common.Label> arrayList2 = new java.util.ArrayList<>();
        java.util.ArrayList<androidx.media3.common.DrmInitData.SchemeData> arrayList3 = new java.util.ArrayList<>();
        java.util.ArrayList<androidx.media3.exoplayer.dash.manifest.Descriptor> arrayList4 = new java.util.ArrayList<>();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        androidx.media3.exoplayer.dash.manifest.SegmentBase segmentTemplate = segmentBase;
        java.lang.String str3 = attributeValue3;
        int audioChannelConfiguration = -1;
        java.lang.String str4 = null;
        boolean z2 = false;
        long availabilityTimeOffsetUs2 = j2;
        long j9 = j3;
        while (true) {
            xmlPullParser.next();
            if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser2, "BaseURL")) {
                if (!z2) {
                    availabilityTimeOffsetUs2 = parseAvailabilityTimeOffsetUs(xmlPullParser2, availabilityTimeOffsetUs2);
                    z2 = true;
                }
                arrayList10.addAll(parseBaseUrl(xmlPullParser2, list, z));
                availabilityTimeOffsetUs2 = availabilityTimeOffsetUs2;
                list2 = arrayList2;
            } else {
                availabilityTimeOffsetUs2 = availabilityTimeOffsetUs2;
                list2 = arrayList2;
                if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser2, "ContentProtection")) {
                    android.util.Pair<java.lang.String, androidx.media3.common.DrmInitData.SchemeData> contentProtection = parseContentProtection(xmlPullParser);
                    if (contentProtection.first != null) {
                        str4 = (java.lang.String) contentProtection.first;
                    }
                    if (contentProtection.second != null) {
                        arrayList3.add((androidx.media3.common.DrmInitData.SchemeData) contentProtection.second);
                    }
                    list2 = list2;
                    availabilityTimeOffsetUs2 = availabilityTimeOffsetUs2;
                } else {
                    if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser2, "ContentComponent")) {
                        java.lang.String strCheckLanguageConsistency = checkLanguageConsistency(str3, xmlPullParser2.getAttributeValue(null, str2));
                        contentType = checkContentTypeConsistency(contentType, parseContentType(xmlPullParser));
                        str = strCheckLanguageConsistency;
                        obj = null;
                    } else {
                        java.lang.String str5 = str3;
                        if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser2, "Role")) {
                            arrayList6.add(parseDescriptor(xmlPullParser2, "Role"));
                        } else if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser2, "AudioChannelConfiguration")) {
                            audioChannelConfiguration = parseAudioChannelConfiguration(xmlPullParser);
                            obj = null;
                            str = str5;
                        } else if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser2, "Accessibility")) {
                            arrayList5.add(parseDescriptor(xmlPullParser2, "Accessibility"));
                        } else if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser2, "EssentialProperty")) {
                            arrayList7.add(parseDescriptor(xmlPullParser2, "EssentialProperty"));
                        } else if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser2, "SupplementalProperty")) {
                            arrayList8.add(parseDescriptor(xmlPullParser2, "SupplementalProperty"));
                        } else {
                            if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser2, "Representation")) {
                                int i5 = contentType;
                                arrayList10 = arrayList10;
                                arrayList8 = arrayList8;
                                arrayList7 = arrayList7;
                                arrayList6 = arrayList6;
                                arrayList5 = arrayList5;
                                arrayList = arrayList4;
                                arrayList3 = arrayList3;
                                list3 = list2;
                                str2 = str2;
                                obj = null;
                                str = str5;
                                androidx.media3.exoplayer.dash.manifest.DashManifestParser.RepresentationInfo representation = parseRepresentation(xmlPullParser, !arrayList10.isEmpty() ? arrayList10 : list, attributeValue, attributeValue2, i2, i3, frameRate, audioChannelConfiguration, i4, str5, arrayList6, arrayList5, arrayList7, arrayList8, segmentTemplate, j4, j, availabilityTimeOffsetUs2, j9, j5, z);
                                int iCheckContentTypeConsistency = checkContentTypeConsistency(i5, androidx.media3.common.MimeTypes.getTrackType(representation.format.sampleMimeType));
                                arrayList9 = arrayList9;
                                arrayList9.add(representation);
                                xmlPullParser2 = xmlPullParser;
                                availabilityTimeOffsetUs = j9;
                                contentType = iCheckContentTypeConsistency;
                                availabilityTimeOffsetUs2 = availabilityTimeOffsetUs2;
                            } else {
                                int i6 = contentType;
                                obj = null;
                                arrayList10 = arrayList10;
                                arrayList8 = arrayList8;
                                arrayList7 = arrayList7;
                                arrayList6 = arrayList6;
                                arrayList5 = arrayList5;
                                arrayList = arrayList4;
                                arrayList3 = arrayList3;
                                str2 = str2;
                                str = str5;
                                list3 = list2;
                                j6 = availabilityTimeOffsetUs2;
                                arrayList9 = arrayList9;
                                xmlPullParser2 = xmlPullParser;
                                if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentBase")) {
                                    availabilityTimeOffsetUs = j9;
                                    segmentTemplate = parseSegmentBase(xmlPullParser2, (androidx.media3.exoplayer.dash.manifest.SegmentBase.SingleSegmentBase) segmentTemplate);
                                    contentType = i6;
                                    availabilityTimeOffsetUs2 = j6;
                                    arrayList4 = arrayList;
                                    list2 = list3;
                                    xmlPullParser2 = xmlPullParser2;
                                } else {
                                    if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentList")) {
                                        availabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser2, j9);
                                        i = i6;
                                        segmentTemplate = parseSegmentList(xmlPullParser, (androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentList) segmentTemplate, j4, j, j6, availabilityTimeOffsetUs, j5);
                                    } else {
                                        j7 = j9;
                                        i = i6;
                                        if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentTemplate")) {
                                            availabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser2, j7);
                                            segmentTemplate = parseSegmentTemplate(xmlPullParser, (androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTemplate) segmentTemplate, arrayList8, j4, j, j6, availabilityTimeOffsetUs, j5);
                                        } else {
                                            xmlPullParser2 = xmlPullParser2;
                                            if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser2, "InbandEventStream")) {
                                                arrayList4 = arrayList;
                                                arrayList4.add(parseDescriptor(xmlPullParser2, "InbandEventStream"));
                                                list2 = list3;
                                            } else {
                                                arrayList4 = arrayList;
                                                if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser2, "Label")) {
                                                    list2 = list3;
                                                    list2.add(parseLabel(xmlPullParser));
                                                } else {
                                                    list2 = list3;
                                                    if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser)) {
                                                        parseAdaptationSetChild(xmlPullParser);
                                                    }
                                                }
                                            }
                                            availabilityTimeOffsetUs = j7;
                                            availabilityTimeOffsetUs2 = j6;
                                            contentType = i;
                                        }
                                    }
                                    availabilityTimeOffsetUs2 = j6;
                                    contentType = i;
                                }
                            }
                            arrayList4 = arrayList;
                            list2 = list3;
                        }
                        i = contentType;
                        obj = null;
                        arrayList10 = arrayList10;
                        arrayList8 = arrayList8;
                        arrayList7 = arrayList7;
                        arrayList6 = arrayList6;
                        arrayList5 = arrayList5;
                        arrayList4 = arrayList4;
                        arrayList3 = arrayList3;
                        str2 = str2;
                        str = str5;
                        j6 = availabilityTimeOffsetUs2;
                        j7 = j9;
                        arrayList9 = arrayList9;
                        list2 = list2;
                        availabilityTimeOffsetUs = j7;
                        availabilityTimeOffsetUs2 = j6;
                        contentType = i;
                    }
                    availabilityTimeOffsetUs = j9;
                }
                if (androidx.media3.common.util.XmlPullParserUtil.isEndTag(xmlPullParser2, "AdaptationSet")) {
                    break;
                }
                arrayList4 = arrayList4;
                arrayList2 = list2;
                arrayList9 = arrayList9;
                j9 = availabilityTimeOffsetUs;
                arrayList10 = arrayList10;
                arrayList8 = arrayList8;
                arrayList7 = arrayList7;
                arrayList6 = arrayList6;
                arrayList5 = arrayList5;
                arrayList3 = arrayList3;
                str2 = str2;
                str3 = str;
            }
            str = str3;
            obj = null;
            availabilityTimeOffsetUs = j9;
            arrayList10 = arrayList10;
            arrayList4 = arrayList4;
            if (androidx.media3.common.util.XmlPullParserUtil.isEndTag(xmlPullParser2, "AdaptationSet")) {
                break;
                break;
            }
            arrayList4 = arrayList4;
            arrayList2 = list2;
            arrayList9 = arrayList9;
            j9 = availabilityTimeOffsetUs;
            arrayList10 = arrayList10;
            arrayList8 = arrayList8;
            arrayList7 = arrayList7;
            arrayList6 = arrayList6;
            arrayList5 = arrayList5;
            arrayList3 = arrayList3;
            str2 = str2;
            str3 = str;
        }
        java.util.List<androidx.media3.exoplayer.dash.manifest.Representation> arrayList11 = new java.util.ArrayList<>(arrayList9.size());
        for (int i7 = 0; i7 < arrayList9.size(); i7++) {
            arrayList11.add(buildRepresentation((androidx.media3.exoplayer.dash.manifest.DashManifestParser.RepresentationInfo) arrayList9.get(i7), attributeValue4, list2, str4, arrayList3, arrayList4));
        }
        return buildAdaptationSet(j8, contentType, arrayList11, arrayList5, arrayList7, arrayList8);
    }

    protected androidx.media3.exoplayer.dash.manifest.AdaptationSet buildAdaptationSet(long j, int i, java.util.List<androidx.media3.exoplayer.dash.manifest.Representation> list, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list2, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list3, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list4) {
        return new androidx.media3.exoplayer.dash.manifest.AdaptationSet(j, i, list, list2, list3, list4);
    }

    protected int parseContentType(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (android.text.TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.UUID] */
    protected android.util.Pair<java.lang.String, androidx.media3.common.DrmInitData.SchemeData> parseContentProtection(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        java.lang.String attributeValue;
        byte[] bArrBuildPsshAtom;
        ?? text;
        ?? r5;
        java.util.UUID uuid;
        java.util.UUID uuid2;
        java.lang.String attributeValue2 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue2 != null) {
            java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(attributeValue2);
            lowerCase.hashCode();
            switch (lowerCase) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    uuid2 = androidx.media3.common.C.CLEARKEY_UUID;
                    attributeValue = null;
                    bArrBuildPsshAtom = null;
                    text = 0;
                    r5 = uuid2;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid2 = androidx.media3.common.C.PLAYREADY_UUID;
                    attributeValue = null;
                    bArrBuildPsshAtom = null;
                    text = 0;
                    r5 = uuid2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid2 = androidx.media3.common.C.WIDEVINE_UUID;
                    attributeValue = null;
                    bArrBuildPsshAtom = null;
                    text = 0;
                    r5 = uuid2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, "value");
                    java.lang.String attributeValueIgnorePrefix = androidx.media3.common.util.XmlPullParserUtil.getAttributeValueIgnorePrefix(xmlPullParser, "default_KID");
                    if (!android.text.TextUtils.isEmpty(attributeValueIgnorePrefix) && !"00000000-0000-0000-0000-000000000000".equals(attributeValueIgnorePrefix)) {
                        java.lang.String[] strArrSplit = attributeValueIgnorePrefix.split("\\s+");
                        java.util.UUID[] uuidArr = new java.util.UUID[strArrSplit.length];
                        for (int i = 0; i < strArrSplit.length; i++) {
                            uuidArr[i] = java.util.UUID.fromString(strArrSplit[i]);
                        }
                        bArrBuildPsshAtom = androidx.media3.extractor.mp4.PsshAtomUtil.buildPsshAtom(androidx.media3.common.C.COMMON_PSSH_UUID, uuidArr, null);
                        text = 0;
                        r5 = androidx.media3.common.C.COMMON_PSSH_UUID;
                        break;
                    } else {
                        androidx.media3.common.util.Log.w(TAG, "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        bArrBuildPsshAtom = null;
                        byte[] bArr = bArrBuildPsshAtom;
                        text = bArr;
                        r5 = bArr;
                        break;
                    }
                    break;
                default:
                    attributeValue = null;
                    bArrBuildPsshAtom = null;
                    byte[] bArr2 = bArrBuildPsshAtom;
                    text = bArr2;
                    r5 = bArr2;
                    break;
            }
        } else {
            attributeValue = null;
            bArrBuildPsshAtom = null;
            byte[] bArr3 = bArrBuildPsshAtom;
            text = bArr3;
            r5 = bArr3;
        }
        do {
            xmlPullParser.next();
            if ((androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "clearkey:Laurl") || androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                r5 = r5;
                text = xmlPullParser.getText();
            } else if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "ms:laurl")) {
                r5 = r5;
                text = xmlPullParser.getAttributeValue(null, "licenseUrl");
            } else if (bArrBuildPsshAtom == null && androidx.media3.common.util.XmlPullParserUtil.isStartTagIgnorePrefix(xmlPullParser, "pssh") && xmlPullParser.next() == 4) {
                bArrBuildPsshAtom = android.util.Base64.decode(xmlPullParser.getText(), 0);
                uuid = androidx.media3.extractor.mp4.PsshAtomUtil.parseUuid(bArrBuildPsshAtom);
                if (uuid == null) {
                    r5 = uuid;
                    text = text;
                    androidx.media3.common.util.Log.w(TAG, "Skipping malformed cenc:pssh data");
                    bArrBuildPsshAtom = null;
                    r5 = uuid;
                    text = text;
                }
            } else if (bArrBuildPsshAtom == null && androidx.media3.common.C.PLAYREADY_UUID.equals(r5) && androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                bArrBuildPsshAtom = androidx.media3.extractor.mp4.PsshAtomUtil.buildPsshAtom(androidx.media3.common.C.PLAYREADY_UUID, android.util.Base64.decode(xmlPullParser.getText(), 0));
                r5 = r5;
                text = text;
            } else {
                maybeSkipTag(xmlPullParser);
                r5 = r5;
                text = text;
            }
            r5 = uuid;
            text = text;
        } while (!androidx.media3.common.util.XmlPullParserUtil.isEndTag(xmlPullParser, "ContentProtection"));
        return android.util.Pair.create(attributeValue, r5 != 0 ? new androidx.media3.common.DrmInitData.SchemeData(r5, text, androidx.media3.common.MimeTypes.VIDEO_MP4, bArrBuildPsshAtom) : null);
    }

    protected void parseAdaptationSetChild(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        maybeSkipTag(xmlPullParser);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01f2 A[LOOP:0: B:3:0x006a->B:57:0x01f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x019c A[EDGE_INSN: B:58:0x019c->B:47:0x019c BREAK  A[LOOP:0: B:3:0x006a->B:57:0x01f2], SYNTHETIC] */
    protected androidx.media3.exoplayer.dash.manifest.DashManifestParser.RepresentationInfo parseRepresentation(org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> list, java.lang.String str, java.lang.String str2, int i, int i2, float f, int i3, int i4, java.lang.String str3, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list2, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list3, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list4, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list5, androidx.media3.exoplayer.dash.manifest.SegmentBase segmentBase, long j, long j2, long j3, long j4, long j5, boolean z) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        long j6;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        java.util.ArrayList arrayList4;
        java.util.ArrayList arrayList5;
        long availabilityTimeOffsetUs;
        java.util.ArrayList arrayList6;
        androidx.media3.exoplayer.dash.manifest.SegmentBase singleSegmentBase;
        java.util.ArrayList arrayList7;
        java.util.ArrayList arrayList8;
        java.util.ArrayList arrayList9;
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        int i5 = parseInt(xmlPullParser, "bandwidth", -1);
        java.lang.String string = parseString(xmlPullParser, "mimeType", str);
        java.lang.String string2 = parseString(xmlPullParser, "codecs", str2);
        int i6 = parseInt(xmlPullParser, "width", i);
        int i7 = parseInt(xmlPullParser, "height", i2);
        float frameRate = parseFrameRate(xmlPullParser, f);
        int i8 = parseInt(xmlPullParser, "audioSamplingRate", i4);
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        java.util.ArrayList arrayList11 = new java.util.ArrayList();
        java.util.ArrayList arrayList12 = new java.util.ArrayList(list4);
        java.util.ArrayList arrayList13 = new java.util.ArrayList(list5);
        int audioChannelConfiguration = i3;
        long availabilityTimeOffsetUs2 = j3;
        boolean z2 = false;
        java.lang.String str4 = null;
        androidx.media3.exoplayer.dash.manifest.SegmentBase segmentTemplate = segmentBase;
        long j7 = j4;
        java.util.ArrayList arrayList14 = new java.util.ArrayList();
        while (true) {
            xmlPullParser.next();
            if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "BaseURL")) {
                if (!z2) {
                    availabilityTimeOffsetUs2 = parseAvailabilityTimeOffsetUs(xmlPullParser, availabilityTimeOffsetUs2);
                    z2 = true;
                }
                arrayList14.addAll(parseBaseUrl(xmlPullParser, list, z));
            } else {
                if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "AudioChannelConfiguration")) {
                    singleSegmentBase = segmentTemplate;
                    audioChannelConfiguration = parseAudioChannelConfiguration(xmlPullParser);
                    arrayList4 = arrayList11;
                    arrayList5 = arrayList13;
                    arrayList9 = arrayList14;
                } else if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentBase")) {
                    segmentTemplate = parseSegmentBase(xmlPullParser, (androidx.media3.exoplayer.dash.manifest.SegmentBase.SingleSegmentBase) segmentTemplate);
                } else {
                    if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentList")) {
                        availabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser, j7);
                        j6 = availabilityTimeOffsetUs2;
                        arrayList8 = arrayList14;
                        arrayList = arrayList13;
                        arrayList2 = arrayList11;
                        arrayList3 = arrayList12;
                        segmentTemplate = parseSegmentList(xmlPullParser, (androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentList) segmentTemplate, j, j2, j6, availabilityTimeOffsetUs, j5);
                    } else {
                        j6 = availabilityTimeOffsetUs2;
                        java.util.ArrayList arrayList15 = arrayList14;
                        arrayList = arrayList13;
                        arrayList2 = arrayList11;
                        arrayList3 = arrayList12;
                        if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTemplate")) {
                            availabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser, j7);
                            segmentTemplate = parseSegmentTemplate(xmlPullParser, (androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTemplate) segmentTemplate, list5, j, j2, j6, availabilityTimeOffsetUs, j5);
                            arrayList8 = arrayList15;
                        } else {
                            arrayList10 = arrayList10;
                            if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "ContentProtection")) {
                                android.util.Pair<java.lang.String, androidx.media3.common.DrmInitData.SchemeData> contentProtection = parseContentProtection(xmlPullParser);
                                if (contentProtection.first != null) {
                                    str4 = (java.lang.String) contentProtection.first;
                                }
                                if (contentProtection.second != null) {
                                    arrayList10.add((androidx.media3.common.DrmInitData.SchemeData) contentProtection.second);
                                }
                                arrayList7 = arrayList15;
                                availabilityTimeOffsetUs2 = j6;
                                arrayList5 = arrayList;
                                arrayList4 = arrayList2;
                                arrayList12 = arrayList3;
                                arrayList6 = arrayList7;
                            } else {
                                if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "InbandEventStream")) {
                                    arrayList4 = arrayList2;
                                    arrayList4.add(parseDescriptor(xmlPullParser, "InbandEventStream"));
                                    arrayList5 = arrayList;
                                    arrayList12 = arrayList3;
                                } else {
                                    arrayList4 = arrayList2;
                                    if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "EssentialProperty")) {
                                        arrayList12 = arrayList3;
                                        arrayList12.add(parseDescriptor(xmlPullParser, "EssentialProperty"));
                                        arrayList5 = arrayList;
                                    } else {
                                        arrayList12 = arrayList3;
                                        if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "SupplementalProperty")) {
                                            arrayList5 = arrayList;
                                            arrayList5.add(parseDescriptor(xmlPullParser, "SupplementalProperty"));
                                        } else {
                                            arrayList5 = arrayList;
                                            maybeSkipTag(xmlPullParser);
                                        }
                                    }
                                }
                                audioChannelConfiguration = audioChannelConfiguration;
                                availabilityTimeOffsetUs2 = j6;
                                arrayList6 = arrayList15;
                            }
                        }
                        singleSegmentBase = segmentTemplate;
                        arrayList9 = arrayList6;
                    }
                    j7 = availabilityTimeOffsetUs;
                    arrayList7 = arrayList8;
                    availabilityTimeOffsetUs2 = j6;
                    arrayList5 = arrayList;
                    arrayList4 = arrayList2;
                    arrayList12 = arrayList3;
                    arrayList6 = arrayList7;
                    singleSegmentBase = segmentTemplate;
                    arrayList9 = arrayList6;
                }
                if (androidx.media3.common.util.XmlPullParserUtil.isEndTag(xmlPullParser, "Representation")) {
                    break;
                }
                arrayList13 = arrayList5;
                arrayList11 = arrayList4;
                arrayList10 = arrayList10;
                segmentTemplate = singleSegmentBase;
                audioChannelConfiguration = audioChannelConfiguration;
                arrayList14 = arrayList9;
            }
            audioChannelConfiguration = audioChannelConfiguration;
            singleSegmentBase = segmentTemplate;
            arrayList4 = arrayList11;
            arrayList5 = arrayList13;
            arrayList9 = arrayList14;
            if (androidx.media3.common.util.XmlPullParserUtil.isEndTag(xmlPullParser, "Representation")) {
                break;
                break;
            }
            arrayList13 = arrayList5;
            arrayList11 = arrayList4;
            arrayList10 = arrayList10;
            segmentTemplate = singleSegmentBase;
            audioChannelConfiguration = audioChannelConfiguration;
            arrayList14 = arrayList9;
        }
        java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list6 = arrayList5;
        java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list7 = arrayList12;
        java.util.ArrayList arrayList16 = arrayList4;
        androidx.media3.common.Format formatBuildFormat = buildFormat(attributeValue, string, i6, i7, frameRate, audioChannelConfiguration, i8, i5, str3, list2, list3, string2, list7, list6);
        if (singleSegmentBase == null) {
            singleSegmentBase = new androidx.media3.exoplayer.dash.manifest.SegmentBase.SingleSegmentBase();
        }
        boolean zIsEmpty = arrayList9.isEmpty();
        java.util.List list8 = arrayList9;
        if (zIsEmpty) {
            list8 = list;
        }
        return new androidx.media3.exoplayer.dash.manifest.DashManifestParser.RepresentationInfo(formatBuildFormat, list8, singleSegmentBase, str4, arrayList10, arrayList16, list7, list6, -1L);
    }

    protected androidx.media3.common.Format buildFormat(java.lang.String str, java.lang.String str2, int i, int i2, float f, int i3, int i4, int i5, java.lang.String str3, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list2, java.lang.String str4, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list3, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list4) {
        java.lang.String str5 = str4;
        java.lang.String sampleMimeType = getSampleMimeType(str2, str5);
        if (androidx.media3.common.MimeTypes.AUDIO_E_AC3.equals(sampleMimeType)) {
            sampleMimeType = parseEac3SupplementalProperties(list4);
            if (androidx.media3.common.MimeTypes.AUDIO_E_AC3_JOC.equals(sampleMimeType)) {
                str5 = androidx.media3.common.MimeTypes.CODEC_E_AC3_JOC;
            }
        }
        int selectionFlagsFromRoleDescriptors = parseSelectionFlagsFromRoleDescriptors(list);
        int roleFlagsFromRoleDescriptors = parseRoleFlagsFromRoleDescriptors(list) | parseRoleFlagsFromAccessibilityDescriptors(list2) | parseRoleFlagsFromProperties(list3) | parseRoleFlagsFromProperties(list4);
        android.util.Pair<java.lang.Integer, java.lang.Integer> tileCountFromProperties = parseTileCountFromProperties(list3);
        androidx.media3.common.Format.Builder language = new androidx.media3.common.Format.Builder().setId(str).setContainerMimeType(str2).setSampleMimeType(sampleMimeType).setCodecs(str5).setPeakBitrate(i5).setSelectionFlags(selectionFlagsFromRoleDescriptors).setRoleFlags(roleFlagsFromRoleDescriptors).setLanguage(str3);
        int cea708AccessibilityChannel = -1;
        androidx.media3.common.Format.Builder tileCountVertical = language.setTileCountHorizontal(tileCountFromProperties != null ? ((java.lang.Integer) tileCountFromProperties.first).intValue() : -1).setTileCountVertical(tileCountFromProperties != null ? ((java.lang.Integer) tileCountFromProperties.second).intValue() : -1);
        if (androidx.media3.common.MimeTypes.isVideo(sampleMimeType)) {
            tileCountVertical.setWidth(i).setHeight(i2).setFrameRate(f);
        } else if (androidx.media3.common.MimeTypes.isAudio(sampleMimeType)) {
            tileCountVertical.setChannelCount(i3).setSampleRate(i4);
        } else if (androidx.media3.common.MimeTypes.isText(sampleMimeType)) {
            if (androidx.media3.common.MimeTypes.APPLICATION_CEA608.equals(sampleMimeType)) {
                cea708AccessibilityChannel = parseCea608AccessibilityChannel(list2);
            } else if (androidx.media3.common.MimeTypes.APPLICATION_CEA708.equals(sampleMimeType)) {
                cea708AccessibilityChannel = parseCea708AccessibilityChannel(list2);
            }
            tileCountVertical.setAccessibilityChannel(cea708AccessibilityChannel);
        } else if (androidx.media3.common.MimeTypes.isImage(sampleMimeType)) {
            tileCountVertical.setWidth(i).setHeight(i2);
        }
        return tileCountVertical.build();
    }

    protected androidx.media3.exoplayer.dash.manifest.Representation buildRepresentation(androidx.media3.exoplayer.dash.manifest.DashManifestParser.RepresentationInfo representationInfo, java.lang.String str, java.util.List<androidx.media3.common.Label> list, java.lang.String str2, java.util.ArrayList<androidx.media3.common.DrmInitData.SchemeData> arrayList, java.util.ArrayList<androidx.media3.exoplayer.dash.manifest.Descriptor> arrayList2) {
        androidx.media3.common.Format.Builder builderBuildUpon = representationInfo.format.buildUpon();
        if (str != null && list.isEmpty()) {
            builderBuildUpon.setLabel(str);
        } else {
            builderBuildUpon.setLabels(list);
        }
        java.lang.String str3 = representationInfo.drmSchemeType;
        if (str3 == null) {
            str3 = str2;
        }
        java.util.ArrayList<androidx.media3.common.DrmInitData.SchemeData> arrayList3 = representationInfo.drmSchemeDatas;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            fillInClearKeyInformation(arrayList3);
            filterRedundantIncompleteSchemeDatas(arrayList3);
            builderBuildUpon.setDrmInitData(new androidx.media3.common.DrmInitData(str3, arrayList3));
        }
        java.util.ArrayList<androidx.media3.exoplayer.dash.manifest.Descriptor> arrayList4 = representationInfo.inbandEventStreams;
        arrayList4.addAll(arrayList2);
        return androidx.media3.exoplayer.dash.manifest.Representation.newInstance(representationInfo.revisionId, builderBuildUpon.build(), representationInfo.baseUrls, representationInfo.segmentBase, arrayList4, representationInfo.essentialProperties, representationInfo.supplementalProperties, null);
    }

    protected androidx.media3.exoplayer.dash.manifest.SegmentBase.SingleSegmentBase parseSegmentBase(org.xmlpull.v1.XmlPullParser xmlPullParser, androidx.media3.exoplayer.dash.manifest.SegmentBase.SingleSegmentBase singleSegmentBase) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        long j;
        long j2;
        long j3 = parseLong(xmlPullParser, "timescale", singleSegmentBase != null ? singleSegmentBase.timescale : 1L);
        long j4 = parseLong(xmlPullParser, "presentationTimeOffset", singleSegmentBase != null ? singleSegmentBase.presentationTimeOffset : 0L);
        long j5 = singleSegmentBase != null ? singleSegmentBase.indexStart : 0L;
        long j6 = singleSegmentBase != null ? singleSegmentBase.indexLength : 0L;
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            java.lang.String[] strArrSplit = attributeValue.split("-");
            j2 = java.lang.Long.parseLong(strArrSplit[0]);
            j = (java.lang.Long.parseLong(strArrSplit[1]) - j2) + 1;
        } else {
            j = j6;
            j2 = j5;
        }
        androidx.media3.exoplayer.dash.manifest.RangedUri initialization = singleSegmentBase != null ? singleSegmentBase.initialization : null;
        do {
            xmlPullParser.next();
            if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                initialization = parseInitialization(xmlPullParser);
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!androidx.media3.common.util.XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentBase"));
        return buildSingleSegmentBase(initialization, j3, j4, j2, j);
    }

    protected androidx.media3.exoplayer.dash.manifest.SegmentBase.SingleSegmentBase buildSingleSegmentBase(androidx.media3.exoplayer.dash.manifest.RangedUri rangedUri, long j, long j2, long j3, long j4) {
        return new androidx.media3.exoplayer.dash.manifest.SegmentBase.SingleSegmentBase(rangedUri, j, j2, j3, j4);
    }

    protected androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentList parseSegmentList(org.xmlpull.v1.XmlPullParser xmlPullParser, androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentList segmentList, long j, long j2, long j3, long j4, long j5) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        long j6 = parseLong(xmlPullParser, "timescale", segmentList != null ? segmentList.timescale : 1L);
        long j7 = parseLong(xmlPullParser, "presentationTimeOffset", segmentList != null ? segmentList.presentationTimeOffset : 0L);
        long j8 = parseLong(xmlPullParser, "duration", segmentList != null ? segmentList.duration : androidx.media3.common.C.TIME_UNSET);
        long j9 = parseLong(xmlPullParser, "startNumber", segmentList != null ? segmentList.startNumber : 1L);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j3, j4);
        java.util.List<androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTimelineElement> segmentTimeline = null;
        java.util.List<androidx.media3.exoplayer.dash.manifest.RangedUri> arrayList = null;
        androidx.media3.exoplayer.dash.manifest.RangedUri initialization = null;
        do {
            xmlPullParser.next();
            if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                initialization = parseInitialization(xmlPullParser);
            } else if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTimeline")) {
                segmentTimeline = parseSegmentTimeline(xmlPullParser, j6, j2);
            } else if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList<>();
                }
                arrayList.add(parseSegmentUrl(xmlPullParser));
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!androidx.media3.common.util.XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentList"));
        if (segmentList != null) {
            if (initialization == null) {
                initialization = segmentList.initialization;
            }
            if (segmentTimeline == null) {
                segmentTimeline = segmentList.segmentTimeline;
            }
            if (arrayList == null) {
                arrayList = segmentList.mediaSegments;
            }
        }
        return buildSegmentList(initialization, j6, j7, j9, j8, segmentTimeline, finalAvailabilityTimeOffset, arrayList, j5, j);
    }

    protected androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentList buildSegmentList(androidx.media3.exoplayer.dash.manifest.RangedUri rangedUri, long j, long j2, long j3, long j4, java.util.List<androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTimelineElement> list, long j5, java.util.List<androidx.media3.exoplayer.dash.manifest.RangedUri> list2, long j6, long j7) {
        return new androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentList(rangedUri, j, j2, j3, j4, list, j5, list2, androidx.media3.common.util.Util.msToUs(j6), androidx.media3.common.util.Util.msToUs(j7));
    }

    protected androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTemplate parseSegmentTemplate(org.xmlpull.v1.XmlPullParser xmlPullParser, androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTemplate segmentTemplate, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list, long j, long j2, long j3, long j4, long j5) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        long j6 = parseLong(xmlPullParser, "timescale", segmentTemplate != null ? segmentTemplate.timescale : 1L);
        long j7 = parseLong(xmlPullParser, "presentationTimeOffset", segmentTemplate != null ? segmentTemplate.presentationTimeOffset : 0L);
        long j8 = parseLong(xmlPullParser, "duration", segmentTemplate != null ? segmentTemplate.duration : androidx.media3.common.C.TIME_UNSET);
        long j9 = parseLong(xmlPullParser, "startNumber", segmentTemplate != null ? segmentTemplate.startNumber : 1L);
        long lastSegmentNumberSupplementalProperty = parseLastSegmentNumberSupplementalProperty(list);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j3, j4);
        java.util.List<androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTimelineElement> segmentTimeline = null;
        androidx.media3.exoplayer.dash.manifest.UrlTemplate urlTemplate = parseUrlTemplate(xmlPullParser, com.ironsource.y8.h.I0, segmentTemplate != null ? segmentTemplate.mediaTemplate : null);
        androidx.media3.exoplayer.dash.manifest.UrlTemplate urlTemplate2 = parseUrlTemplate(xmlPullParser, com.unity3d.ads.core.data.model.exception.GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION, segmentTemplate != null ? segmentTemplate.initializationTemplate : null);
        androidx.media3.exoplayer.dash.manifest.RangedUri initialization = null;
        do {
            xmlPullParser.next();
            if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                initialization = parseInitialization(xmlPullParser);
            } else if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTimeline")) {
                segmentTimeline = parseSegmentTimeline(xmlPullParser, j6, j2);
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!androidx.media3.common.util.XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentTemplate"));
        if (segmentTemplate != null) {
            if (initialization == null) {
                initialization = segmentTemplate.initialization;
            }
            if (segmentTimeline == null) {
                segmentTimeline = segmentTemplate.segmentTimeline;
            }
        }
        return buildSegmentTemplate(initialization, j6, j7, j9, lastSegmentNumberSupplementalProperty, j8, segmentTimeline, finalAvailabilityTimeOffset, urlTemplate2, urlTemplate, j5, j);
    }

    protected androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTemplate buildSegmentTemplate(androidx.media3.exoplayer.dash.manifest.RangedUri rangedUri, long j, long j2, long j3, long j4, long j5, java.util.List<androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTimelineElement> list, long j6, androidx.media3.exoplayer.dash.manifest.UrlTemplate urlTemplate, androidx.media3.exoplayer.dash.manifest.UrlTemplate urlTemplate2, long j7, long j8) {
        return new androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTemplate(rangedUri, j, j2, j3, j4, j5, list, j6, urlTemplate, urlTemplate2, androidx.media3.common.util.Util.msToUs(j7), androidx.media3.common.util.Util.msToUs(j8));
    }

    protected androidx.media3.exoplayer.dash.manifest.EventStream parseEventStream(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.util.ArrayList arrayList;
        java.lang.String string = parseString(xmlPullParser, "schemeIdUri", "");
        java.lang.String string2 = parseString(xmlPullParser, "value", "");
        long j = parseLong(xmlPullParser, "timescale", 1L);
        long j2 = parseLong(xmlPullParser, "presentationTimeOffset", 0L);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "Event")) {
                byteArrayOutputStream = byteArrayOutputStream2;
                long j3 = j2;
                arrayList = arrayList2;
                arrayList.add(parseEvent(xmlPullParser, string, string2, j, j3, byteArrayOutputStream));
            } else {
                byteArrayOutputStream = byteArrayOutputStream2;
                arrayList = arrayList2;
                maybeSkipTag(xmlPullParser);
            }
            if (androidx.media3.common.util.XmlPullParserUtil.isEndTag(xmlPullParser, "EventStream")) {
                break;
            }
            arrayList2 = arrayList;
            byteArrayOutputStream2 = byteArrayOutputStream;
            j2 = j2;
        }
        long[] jArr = new long[arrayList.size()];
        androidx.media3.extractor.metadata.emsg.EventMessage[] eventMessageArr = new androidx.media3.extractor.metadata.emsg.EventMessage[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            android.util.Pair pair = (android.util.Pair) arrayList.get(i);
            jArr[i] = ((java.lang.Long) pair.first).longValue();
            eventMessageArr[i] = (androidx.media3.extractor.metadata.emsg.EventMessage) pair.second;
        }
        return buildEventStream(string, string2, j, jArr, eventMessageArr);
    }

    protected androidx.media3.exoplayer.dash.manifest.EventStream buildEventStream(java.lang.String str, java.lang.String str2, long j, long[] jArr, androidx.media3.extractor.metadata.emsg.EventMessage[] eventMessageArr) {
        return new androidx.media3.exoplayer.dash.manifest.EventStream(str, str2, j, jArr, eventMessageArr);
    }

    protected android.util.Pair<java.lang.Long, androidx.media3.extractor.metadata.emsg.EventMessage> parseEvent(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, java.lang.String str2, long j, long j2, java.io.ByteArrayOutputStream byteArrayOutputStream) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        long j3 = parseLong(xmlPullParser, "id", 0L);
        long j4 = parseLong(xmlPullParser, "duration", androidx.media3.common.C.TIME_UNSET);
        long j5 = parseLong(xmlPullParser, "presentationTime", 0L);
        long jScaleLargeTimestamp = androidx.media3.common.util.Util.scaleLargeTimestamp(j4, 1000L, j);
        long jScaleLargeTimestamp2 = androidx.media3.common.util.Util.scaleLargeTimestamp(j5 - j2, 1000000L, j);
        java.lang.String string = parseString(xmlPullParser, "messageData", null);
        byte[] eventObject = parseEventObject(xmlPullParser, byteArrayOutputStream);
        java.lang.Long lValueOf = java.lang.Long.valueOf(jScaleLargeTimestamp2);
        if (string != null) {
            eventObject = androidx.media3.common.util.Util.getUtf8Bytes(string);
        }
        return android.util.Pair.create(lValueOf, buildEvent(str, str2, j3, jScaleLargeTimestamp, eventObject));
    }

    protected byte[] parseEventObject(org.xmlpull.v1.XmlPullParser xmlPullParser, java.io.ByteArrayOutputStream byteArrayOutputStream) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        byteArrayOutputStream.reset();
        org.xmlpull.v1.XmlSerializer xmlSerializerNewSerializer = android.util.Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, com.google.common.base.Charsets.UTF_8.name());
        xmlPullParser.nextToken();
        while (!androidx.media3.common.util.XmlPullParserUtil.isEndTag(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    xmlSerializerNewSerializer.startDocument(null, false);
                    break;
                case 1:
                    xmlSerializerNewSerializer.endDocument();
                    break;
                case 2:
                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                        xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    }
                    break;
                case 3:
                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        xmlSerializerNewSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    protected androidx.media3.extractor.metadata.emsg.EventMessage buildEvent(java.lang.String str, java.lang.String str2, long j, long j2, byte[] bArr) {
        return new androidx.media3.extractor.metadata.emsg.EventMessage(str, str2, j2, j, bArr);
    }

    protected java.util.List<androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTimelineElement> parseSegmentTimeline(org.xmlpull.v1.XmlPullParser xmlPullParser, long j, long j2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        long jAddSegmentTimelineElementsToList = 0;
        long j3 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH)) {
                long j4 = parseLong(xmlPullParser, "t", androidx.media3.common.C.TIME_UNSET);
                if (z) {
                    jAddSegmentTimelineElementsToList = addSegmentTimelineElementsToList(arrayList, jAddSegmentTimelineElementsToList, j3, i, j4);
                }
                if (j4 == androidx.media3.common.C.TIME_UNSET) {
                    j4 = jAddSegmentTimelineElementsToList;
                }
                j3 = parseLong(xmlPullParser, "d", androidx.media3.common.C.TIME_UNSET);
                i = parseInt(xmlPullParser, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, 0);
                z = true;
                jAddSegmentTimelineElementsToList = j4;
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!androidx.media3.common.util.XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentTimeline"));
        if (z) {
            addSegmentTimelineElementsToList(arrayList, jAddSegmentTimelineElementsToList, j3, i, androidx.media3.common.util.Util.scaleLargeTimestamp(j2, j, 1000L));
        }
        return arrayList;
    }

    private long addSegmentTimelineElementsToList(java.util.List<androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTimelineElement> list, long j, long j2, int i, long j3) {
        int iCeilDivide = i >= 0 ? i + 1 : (int) androidx.media3.common.util.Util.ceilDivide(j3 - j, j2);
        for (int i2 = 0; i2 < iCeilDivide; i2++) {
            list.add(buildSegmentTimelineElement(j, j2));
            j += j2;
        }
        return j;
    }

    protected androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTimelineElement buildSegmentTimelineElement(long j, long j2) {
        return new androidx.media3.exoplayer.dash.manifest.SegmentBase.SegmentTimelineElement(j, j2);
    }

    protected androidx.media3.exoplayer.dash.manifest.UrlTemplate parseUrlTemplate(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, androidx.media3.exoplayer.dash.manifest.UrlTemplate urlTemplate) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? androidx.media3.exoplayer.dash.manifest.UrlTemplate.compile(attributeValue) : urlTemplate;
    }

    protected androidx.media3.exoplayer.dash.manifest.RangedUri parseInitialization(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, "sourceURL", "range");
    }

    protected androidx.media3.exoplayer.dash.manifest.RangedUri parseSegmentUrl(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, com.ironsource.y8.h.I0, "mediaRange");
    }

    protected androidx.media3.exoplayer.dash.manifest.RangedUri parseRangedUrl(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, java.lang.String str2) {
        long j;
        long j2;
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, str);
        java.lang.String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            java.lang.String[] strArrSplit = attributeValue2.split("-");
            j = java.lang.Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j2 = (java.lang.Long.parseLong(strArrSplit[1]) - j) + 1;
            }
            return buildRangedUri(attributeValue, j, j2);
        }
        j = 0;
        j2 = -1;
        return buildRangedUri(attributeValue, j, j2);
    }

    protected androidx.media3.exoplayer.dash.manifest.RangedUri buildRangedUri(java.lang.String str, long j, long j2) {
        return new androidx.media3.exoplayer.dash.manifest.RangedUri(str, j, j2);
    }

    protected androidx.media3.exoplayer.dash.manifest.ProgramInformation parseProgramInformation(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        java.lang.String strNextText = null;
        java.lang.String string = parseString(xmlPullParser, "moreInformationURL", null);
        java.lang.String string2 = parseString(xmlPullParser, com.json.ce.p, null);
        java.lang.String strNextText2 = null;
        java.lang.String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "Title")) {
                strNextText = xmlPullParser.nextText();
            } else if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, androidx.exifinterface.media.ExifInterface.TAG_COPYRIGHT)) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
            java.lang.String str = strNextText3;
            if (androidx.media3.common.util.XmlPullParserUtil.isEndTag(xmlPullParser, "ProgramInformation")) {
                return new androidx.media3.exoplayer.dash.manifest.ProgramInformation(strNextText, strNextText2, str, string, string2);
            }
            strNextText3 = str;
        }
    }

    protected androidx.media3.common.Label parseLabel(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        return new androidx.media3.common.Label(xmlPullParser.getAttributeValue(null, com.json.ce.p), parseText(xmlPullParser, "Label"));
    }

    protected java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> parseBaseUrl(org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> list, boolean z) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int i;
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        if (attributeValue != null) {
            i = java.lang.Integer.parseInt(attributeValue);
        } else {
            i = z ? 1 : Integer.MIN_VALUE;
        }
        java.lang.String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i2 = attributeValue2 != null ? java.lang.Integer.parseInt(attributeValue2) : 1;
        java.lang.String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        java.lang.String text = parseText(xmlPullParser, "BaseURL");
        if (androidx.media3.common.util.UriUtil.isAbsolute(text)) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return com.google.common.collect.Lists.newArrayList(new androidx.media3.exoplayer.dash.manifest.BaseUrl(text, attributeValue3, i, i2));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            androidx.media3.exoplayer.dash.manifest.BaseUrl baseUrl = list.get(i3);
            java.lang.String strResolve = androidx.media3.common.util.UriUtil.resolve(baseUrl.url, text);
            java.lang.String str = attributeValue3 == null ? strResolve : attributeValue3;
            if (z) {
                i = baseUrl.priority;
                i2 = baseUrl.weight;
                str = baseUrl.serviceLocation;
            }
            arrayList.add(new androidx.media3.exoplayer.dash.manifest.BaseUrl(strResolve, str, i, i2));
        }
        return arrayList;
    }

    protected long parseAvailabilityTimeOffsetUs(org.xmlpull.v1.XmlPullParser xmlPullParser, long j) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (java.lang.Float.parseFloat(attributeValue) * 1000000.0f);
    }

    protected int parseAudioChannelConfiguration(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        java.lang.String string = parseString(xmlPullParser, "schemeIdUri", null);
        string.hashCode();
        int dtsChannelConfiguration = -1;
        switch (string) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                dtsChannelConfiguration = parseDtsChannelConfiguration(xmlPullParser);
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                dtsChannelConfiguration = parseInt(xmlPullParser, "value", -1);
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                dtsChannelConfiguration = parseDolbyChannelConfiguration(xmlPullParser);
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                dtsChannelConfiguration = parseMpegChannelConfiguration(xmlPullParser);
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                dtsChannelConfiguration = parseDtsxChannelConfiguration(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!androidx.media3.common.util.XmlPullParserUtil.isEndTag(xmlPullParser, "AudioChannelConfiguration"));
        return dtsChannelConfiguration;
    }

    protected int parseSelectionFlagsFromRoleDescriptors(java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list) {
        int selectionFlagsFromDashRoleScheme = 0;
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.exoplayer.dash.manifest.Descriptor descriptor = list.get(i);
            if (com.google.common.base.Ascii.equalsIgnoreCase("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                selectionFlagsFromDashRoleScheme |= parseSelectionFlagsFromDashRoleScheme(descriptor.value);
            }
        }
        return selectionFlagsFromDashRoleScheme;
    }

    protected int parseSelectionFlagsFromDashRoleScheme(java.lang.String str) {
        if (str == null) {
            return 0;
        }
        str.hashCode();
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    protected int parseRoleFlagsFromRoleDescriptors(java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list) {
        int roleFlagsFromDashRoleScheme = 0;
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.exoplayer.dash.manifest.Descriptor descriptor = list.get(i);
            if (com.google.common.base.Ascii.equalsIgnoreCase("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                roleFlagsFromDashRoleScheme |= parseRoleFlagsFromDashRoleScheme(descriptor.value);
            }
        }
        return roleFlagsFromDashRoleScheme;
    }

    protected int parseRoleFlagsFromAccessibilityDescriptors(java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list) {
        int tvaAudioPurposeCsValue;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            androidx.media3.exoplayer.dash.manifest.Descriptor descriptor = list.get(i2);
            if (com.google.common.base.Ascii.equalsIgnoreCase("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                tvaAudioPurposeCsValue = parseRoleFlagsFromDashRoleScheme(descriptor.value);
            } else {
                if (com.google.common.base.Ascii.equalsIgnoreCase("urn:tva:metadata:cs:AudioPurposeCS:2007", descriptor.schemeIdUri)) {
                    tvaAudioPurposeCsValue = parseTvaAudioPurposeCsValue(descriptor.value);
                }
            }
            i |= tvaAudioPurposeCsValue;
        }
        return i;
    }

    protected int parseRoleFlagsFromProperties(java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (com.google.common.base.Ascii.equalsIgnoreCase("http://dashif.org/guidelines/trickmode", list.get(i2).schemeIdUri)) {
                i |= 16384;
            }
        }
        return i;
    }

    protected int parseRoleFlagsFromDashRoleScheme(java.lang.String str) {
        if (str == null) {
            return 0;
        }
        str.hashCode();
        switch (str) {
            case "subtitle":
            case "forced_subtitle":
            case "forced-subtitle":
                return 128;
            case "description":
                return 512;
            case "enhanced-audio-intelligibility":
                return 2048;
            case "alternate":
                return 2;
            case "dub":
                return 16;
            case "main":
                return 1;
            case "sign":
                return 256;
            case "caption":
                return 64;
            case "commentary":
                return 8;
            case "emergency":
                return 32;
            case "supplementary":
                return 4;
            default:
                return 0;
        }
    }

    protected int parseTvaAudioPurposeCsValue(java.lang.String str) {
        if (str == null) {
            return 0;
        }
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    b = 0;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    b = 1;
                }
                break;
            case 51:
                if (str.equals(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D)) {
                    b = 2;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    b = 3;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    b = 4;
                }
                break;
        }
        switch (b) {
            case 0:
                return 512;
            case 1:
                return 2048;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    protected java.lang.String[] parseProfiles(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, java.lang.String[] strArr) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    protected android.util.Pair<java.lang.Integer, java.lang.Integer> parseTileCountFromProperties(java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list) {
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.exoplayer.dash.manifest.Descriptor descriptor = list.get(i);
            if ((com.google.common.base.Ascii.equalsIgnoreCase("http://dashif.org/thumbnail_tile", descriptor.schemeIdUri) || com.google.common.base.Ascii.equalsIgnoreCase("http://dashif.org/guidelines/thumbnail_tile", descriptor.schemeIdUri)) && descriptor.value != null) {
                java.lang.String[] strArrSplit = androidx.media3.common.util.Util.split(descriptor.value, "x");
                if (strArrSplit.length != 2) {
                    continue;
                } else {
                    try {
                        return android.util.Pair.create(java.lang.Integer.valueOf(java.lang.Integer.parseInt(strArrSplit[0])), java.lang.Integer.valueOf(java.lang.Integer.parseInt(strArrSplit[1])));
                    } catch (java.lang.NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public static void maybeSkipTag(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser)) {
                    i++;
                } else if (androidx.media3.common.util.XmlPullParserUtil.isEndTag(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    private static void filterRedundantIncompleteSchemeDatas(java.util.ArrayList<androidx.media3.common.DrmInitData.SchemeData> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            androidx.media3.common.DrmInitData.SchemeData schemeData = arrayList.get(size);
            if (!schemeData.hasData()) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i).canReplace(schemeData)) {
                        arrayList.remove(size);
                        break;
                    }
                }
            }
        }
    }

    private static void fillInClearKeyInformation(java.util.ArrayList<androidx.media3.common.DrmInitData.SchemeData> arrayList) {
        java.lang.String str;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                str = null;
                break;
            }
            androidx.media3.common.DrmInitData.SchemeData schemeData = arrayList.get(i);
            if (androidx.media3.common.C.CLEARKEY_UUID.equals(schemeData.uuid) && schemeData.licenseServerUrl != null) {
                str = schemeData.licenseServerUrl;
                arrayList.remove(i);
                break;
            }
            i++;
        }
        if (str == null) {
            return;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            androidx.media3.common.DrmInitData.SchemeData schemeData2 = arrayList.get(i2);
            if (androidx.media3.common.C.COMMON_PSSH_UUID.equals(schemeData2.uuid) && schemeData2.licenseServerUrl == null) {
                arrayList.set(i2, new androidx.media3.common.DrmInitData.SchemeData(androidx.media3.common.C.CLEARKEY_UUID, str, schemeData2.mimeType, schemeData2.data));
            }
        }
    }

    private static java.lang.String getSampleMimeType(java.lang.String str, java.lang.String str2) {
        if (androidx.media3.common.MimeTypes.isAudio(str)) {
            return androidx.media3.common.MimeTypes.getAudioMediaMimeType(str2);
        }
        if (androidx.media3.common.MimeTypes.isVideo(str)) {
            return androidx.media3.common.MimeTypes.getVideoMediaMimeType(str2);
        }
        if (androidx.media3.common.MimeTypes.isText(str) || androidx.media3.common.MimeTypes.isImage(str)) {
            return str;
        }
        if (!androidx.media3.common.MimeTypes.APPLICATION_MP4.equals(str)) {
            return null;
        }
        java.lang.String mediaMimeType = androidx.media3.common.MimeTypes.getMediaMimeType(str2);
        return androidx.media3.common.MimeTypes.TEXT_VTT.equals(mediaMimeType) ? androidx.media3.common.MimeTypes.APPLICATION_MP4VTT : mediaMimeType;
    }

    private static java.lang.String checkLanguageConsistency(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        androidx.media3.common.util.Assertions.checkState(str.equals(str2));
        return str;
    }

    private static int checkContentTypeConsistency(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        androidx.media3.common.util.Assertions.checkState(i == i2);
        return i;
    }

    protected static androidx.media3.exoplayer.dash.manifest.Descriptor parseDescriptor(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        java.lang.String string = parseString(xmlPullParser, "schemeIdUri", "");
        java.lang.String string2 = parseString(xmlPullParser, "value", null);
        java.lang.String string3 = parseString(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!androidx.media3.common.util.XmlPullParserUtil.isEndTag(xmlPullParser, str));
        return new androidx.media3.exoplayer.dash.manifest.Descriptor(string, string2, string3);
    }

    protected static int parseCea608AccessibilityChannel(java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list) {
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.exoplayer.dash.manifest.Descriptor descriptor = list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(descriptor.schemeIdUri) && descriptor.value != null) {
                java.util.regex.Matcher matcher = CEA_608_ACCESSIBILITY_PATTERN.matcher(descriptor.value);
                if (matcher.matches()) {
                    return java.lang.Integer.parseInt(matcher.group(1));
                }
                androidx.media3.common.util.Log.w(TAG, "Unable to parse CEA-608 channel number from: " + descriptor.value);
            }
        }
        return -1;
    }

    protected static int parseCea708AccessibilityChannel(java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list) {
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.exoplayer.dash.manifest.Descriptor descriptor = list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(descriptor.schemeIdUri) && descriptor.value != null) {
                java.util.regex.Matcher matcher = CEA_708_ACCESSIBILITY_PATTERN.matcher(descriptor.value);
                if (matcher.matches()) {
                    return java.lang.Integer.parseInt(matcher.group(1));
                }
                androidx.media3.common.util.Log.w(TAG, "Unable to parse CEA-708 service block number from: " + descriptor.value);
            }
        }
        return -1;
    }

    protected static java.lang.String parseEac3SupplementalProperties(java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list) {
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.exoplayer.dash.manifest.Descriptor descriptor = list.get(i);
            java.lang.String str = descriptor.schemeIdUri;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(descriptor.value)) {
                return androidx.media3.common.MimeTypes.AUDIO_E_AC3_JOC;
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && androidx.media3.common.MimeTypes.CODEC_E_AC3_JOC.equals(descriptor.value)) {
                return androidx.media3.common.MimeTypes.AUDIO_E_AC3_JOC;
            }
        }
        return androidx.media3.common.MimeTypes.AUDIO_E_AC3;
    }

    protected static float parseFrameRate(org.xmlpull.v1.XmlPullParser xmlPullParser, float f) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        java.util.regex.Matcher matcher = FRAME_RATE_PATTERN.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int i = java.lang.Integer.parseInt(matcher.group(1));
        java.lang.String strGroup = matcher.group(2);
        return !android.text.TextUtils.isEmpty(strGroup) ? i / java.lang.Integer.parseInt(strGroup) : i;
    }

    protected static long parseDuration(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, long j) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : androidx.media3.common.util.Util.parseXsDuration(attributeValue);
    }

    protected static long parseDateTime(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, long j) throws androidx.media3.common.ParserException {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : androidx.media3.common.util.Util.parseXsDateTime(attributeValue);
    }

    protected static java.lang.String parseText(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        java.lang.String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!androidx.media3.common.util.XmlPullParserUtil.isEndTag(xmlPullParser, str));
        return text;
    }

    protected static int parseInt(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : java.lang.Integer.parseInt(attributeValue);
    }

    protected static long parseLong(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, long j) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : java.lang.Long.parseLong(attributeValue);
    }

    protected static float parseFloat(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, float f) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f : java.lang.Float.parseFloat(attributeValue);
    }

    protected static java.lang.String parseString(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, java.lang.String str2) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    protected static int parseMpegChannelConfiguration(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        int i = parseInt(xmlPullParser, "value", -1);
        if (i < 0) {
            return -1;
        }
        int[] iArr = MPEG_CHANNEL_CONFIGURATION_MAPPING;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    protected static int parseDtsChannelConfiguration(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        int i = parseInt(xmlPullParser, "value", -1);
        if (i <= 0 || i >= 33) {
            return -1;
        }
        return i;
    }

    protected static int parseDtsxChannelConfiguration(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        int iBitCount;
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (iBitCount = java.lang.Integer.bitCount(java.lang.Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return iBitCount;
    }

    protected static int parseDolbyChannelConfiguration(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(attributeValue);
        lowerCase.hashCode();
        switch (lowerCase) {
            case "4000":
                return 1;
            case "a000":
                return 2;
            case "f800":
                return 5;
            case "f801":
                return 6;
            case "fa01":
                return 8;
            default:
                return -1;
        }
    }

    protected static long parseLastSegmentNumberSupplementalProperty(java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list) {
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.exoplayer.dash.manifest.Descriptor descriptor = list.get(i);
            if (com.google.common.base.Ascii.equalsIgnoreCase("http://dashif.org/guidelines/last-segment-number", descriptor.schemeIdUri)) {
                return java.lang.Long.parseLong(descriptor.value);
            }
        }
        return -1L;
    }

    private boolean isDvbProfileDeclared(java.lang.String[] strArr) {
        for (java.lang.String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    protected static final class RepresentationInfo {
        public final com.google.common.collect.ImmutableList<androidx.media3.exoplayer.dash.manifest.BaseUrl> baseUrls;
        public final java.util.ArrayList<androidx.media3.common.DrmInitData.SchemeData> drmSchemeDatas;
        public final java.lang.String drmSchemeType;
        public final java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> essentialProperties;
        public final androidx.media3.common.Format format;
        public final java.util.ArrayList<androidx.media3.exoplayer.dash.manifest.Descriptor> inbandEventStreams;
        public final long revisionId;
        public final androidx.media3.exoplayer.dash.manifest.SegmentBase segmentBase;
        public final java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> supplementalProperties;

        public RepresentationInfo(androidx.media3.common.Format format, java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> list, androidx.media3.exoplayer.dash.manifest.SegmentBase segmentBase, java.lang.String str, java.util.ArrayList<androidx.media3.common.DrmInitData.SchemeData> arrayList, java.util.ArrayList<androidx.media3.exoplayer.dash.manifest.Descriptor> arrayList2, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list2, java.util.List<androidx.media3.exoplayer.dash.manifest.Descriptor> list3, long j) {
            this.format = format;
            this.baseUrls = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
            this.segmentBase = segmentBase;
            this.drmSchemeType = str;
            this.drmSchemeDatas = arrayList;
            this.inbandEventStreams = arrayList2;
            this.essentialProperties = list2;
            this.supplementalProperties = list3;
            this.revisionId = j;
        }
    }
}
