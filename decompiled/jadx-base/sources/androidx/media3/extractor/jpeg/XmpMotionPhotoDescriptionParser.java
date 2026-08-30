package androidx.media3.extractor.jpeg;

/* JADX INFO: loaded from: classes.dex */
final class XmpMotionPhotoDescriptionParser {
    private static final java.lang.String TAG = "MotionPhotoXmpParser";
    private static final java.lang.String[] MOTION_PHOTO_ATTRIBUTE_NAMES = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final java.lang.String[] DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final java.lang.String[] DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static androidx.media3.extractor.jpeg.MotionPhotoDescription parse(java.lang.String str) throws java.io.IOException {
        try {
            return parseInternal(str);
        } catch (androidx.media3.common.ParserException | java.lang.NumberFormatException | org.xmlpull.v1.XmlPullParserException unused) {
            androidx.media3.common.util.Log.w(TAG, "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static androidx.media3.extractor.jpeg.MotionPhotoDescription parseInternal(java.lang.String str) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        org.xmlpull.v1.XmlPullParser xmlPullParserNewPullParser = org.xmlpull.v1.XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new java.io.StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("Couldn't find xmp metadata", null);
        }
        com.google.common.collect.ImmutableList<androidx.media3.extractor.jpeg.MotionPhotoDescription.ContainerItem> immutableListOf = com.google.common.collect.ImmutableList.of();
        long motionPhotoPresentationTimestampUsFromDescription = androidx.media3.common.C.TIME_UNSET;
        do {
            xmlPullParserNewPullParser.next();
            if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!parseMotionPhotoFlagFromDescription(xmlPullParserNewPullParser)) {
                    return null;
                }
                motionPhotoPresentationTimestampUsFromDescription = parseMotionPhotoPresentationTimestampUsFromDescription(xmlPullParserNewPullParser);
                immutableListOf = parseMicroVideoOffsetFromDescription(xmlPullParserNewPullParser);
            } else if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "Container:Directory")) {
                immutableListOf = parseMotionPhotoV1Directory(xmlPullParserNewPullParser, "Container", "Item");
            } else if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "GContainer:Directory")) {
                immutableListOf = parseMotionPhotoV1Directory(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!androidx.media3.common.util.XmlPullParserUtil.isEndTag(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (immutableListOf.isEmpty()) {
            return null;
        }
        return new androidx.media3.extractor.jpeg.MotionPhotoDescription(motionPhotoPresentationTimestampUsFromDescription, immutableListOf);
    }

    private static boolean parseMotionPhotoFlagFromDescription(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        for (java.lang.String str : MOTION_PHOTO_ATTRIBUTE_NAMES) {
            java.lang.String attributeValue = androidx.media3.common.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                return java.lang.Integer.parseInt(attributeValue) == 1;
            }
        }
        return false;
    }

    private static long parseMotionPhotoPresentationTimestampUsFromDescription(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        for (java.lang.String str : DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES) {
            java.lang.String attributeValue = androidx.media3.common.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                long j = java.lang.Long.parseLong(attributeValue);
                return j == -1 ? androidx.media3.common.C.TIME_UNSET : j;
            }
        }
        return androidx.media3.common.C.TIME_UNSET;
    }

    private static com.google.common.collect.ImmutableList<androidx.media3.extractor.jpeg.MotionPhotoDescription.ContainerItem> parseMicroVideoOffsetFromDescription(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        for (java.lang.String str : DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES) {
            java.lang.String attributeValue = androidx.media3.common.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                return com.google.common.collect.ImmutableList.of(new androidx.media3.extractor.jpeg.MotionPhotoDescription.ContainerItem(androidx.media3.common.MimeTypes.IMAGE_JPEG, "Primary", 0L, 0L), new androidx.media3.extractor.jpeg.MotionPhotoDescription.ContainerItem(androidx.media3.common.MimeTypes.VIDEO_MP4, "MotionPhoto", java.lang.Long.parseLong(attributeValue), 0L));
            }
        }
        return com.google.common.collect.ImmutableList.of();
    }

    private static com.google.common.collect.ImmutableList<androidx.media3.extractor.jpeg.MotionPhotoDescription.ContainerItem> parseMotionPhotoV1Directory(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, java.lang.String str2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        java.lang.String str3 = str + ":Item";
        java.lang.String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (androidx.media3.common.util.XmlPullParserUtil.isStartTag(xmlPullParser, str3)) {
                java.lang.String attributeValue = androidx.media3.common.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, str2 + ":Mime");
                java.lang.String attributeValue2 = androidx.media3.common.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, str2 + ":Semantic");
                java.lang.String attributeValue3 = androidx.media3.common.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, str2 + ":Length");
                java.lang.String attributeValue4 = androidx.media3.common.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, str2 + ":Padding");
                if (attributeValue == null || attributeValue2 == null) {
                    return com.google.common.collect.ImmutableList.of();
                }
                builder.add(new androidx.media3.extractor.jpeg.MotionPhotoDescription.ContainerItem(attributeValue, attributeValue2, attributeValue3 != null ? java.lang.Long.parseLong(attributeValue3) : 0L, attributeValue4 != null ? java.lang.Long.parseLong(attributeValue4) : 0L));
            }
        } while (!androidx.media3.common.util.XmlPullParserUtil.isEndTag(xmlPullParser, str4));
        return builder.build();
    }

    private XmpMotionPhotoDescriptionParser() {
    }
}
