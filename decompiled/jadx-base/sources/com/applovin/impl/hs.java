package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
abstract class hs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String[] f862a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final java.lang.String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final java.lang.String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    private static com.applovin.impl.lf b(java.lang.String str) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        org.xmlpull.v1.XmlPullParser xmlPullParserNewPullParser = org.xmlpull.v1.XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new java.io.StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!com.applovin.impl.gs.c(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw com.applovin.impl.ch.a("Couldn't find xmp metadata", null);
        }
        com.applovin.impl.db dbVarH = com.applovin.impl.db.h();
        long jC = androidx.media3.common.C.TIME_UNSET;
        do {
            xmlPullParserNewPullParser.next();
            if (com.applovin.impl.gs.c(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!b(xmlPullParserNewPullParser)) {
                    return null;
                }
                jC = c(xmlPullParserNewPullParser);
                dbVarH = a(xmlPullParserNewPullParser);
            } else if (com.applovin.impl.gs.c(xmlPullParserNewPullParser, "Container:Directory")) {
                dbVarH = a(xmlPullParserNewPullParser, "Container", "Item");
            } else if (com.applovin.impl.gs.c(xmlPullParserNewPullParser, "GContainer:Directory")) {
                dbVarH = a(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!com.applovin.impl.gs.b(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (dbVarH.isEmpty()) {
            return null;
        }
        return new com.applovin.impl.lf(jC, dbVarH);
    }

    private static long c(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        for (java.lang.String str : b) {
            java.lang.String strA = com.applovin.impl.gs.a(xmlPullParser, str);
            if (strA != null) {
                long j = java.lang.Long.parseLong(strA);
                return j == -1 ? androidx.media3.common.C.TIME_UNSET : j;
            }
        }
        return androidx.media3.common.C.TIME_UNSET;
    }

    private static boolean b(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        for (java.lang.String str : f862a) {
            java.lang.String strA = com.applovin.impl.gs.a(xmlPullParser, str);
            if (strA != null) {
                return java.lang.Integer.parseInt(strA) == 1;
            }
        }
        return false;
    }

    public static com.applovin.impl.lf a(java.lang.String str) {
        try {
            return b(str);
        } catch (com.applovin.impl.ch | java.lang.NumberFormatException | org.xmlpull.v1.XmlPullParserException unused) {
            com.applovin.impl.oc.d("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static com.applovin.impl.db a(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        for (java.lang.String str : c) {
            java.lang.String strA = com.applovin.impl.gs.a(xmlPullParser, str);
            if (strA != null) {
                return com.applovin.impl.db.a(new com.applovin.impl.lf.a(androidx.media3.common.MimeTypes.IMAGE_JPEG, "Primary", 0L, 0L), new com.applovin.impl.lf.a(androidx.media3.common.MimeTypes.VIDEO_MP4, "MotionPhoto", java.lang.Long.parseLong(strA), 0L));
            }
        }
        return com.applovin.impl.db.h();
    }

    private static com.applovin.impl.db a(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, java.lang.String str2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        com.applovin.impl.db.a aVarF = com.applovin.impl.db.f();
        java.lang.String str3 = str + ":Item";
        java.lang.String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (com.applovin.impl.gs.c(xmlPullParser, str3)) {
                java.lang.String strA = com.applovin.impl.gs.a(xmlPullParser, str2 + ":Mime");
                java.lang.String strA2 = com.applovin.impl.gs.a(xmlPullParser, str2 + ":Semantic");
                java.lang.String strA3 = com.applovin.impl.gs.a(xmlPullParser, str2 + ":Length");
                java.lang.String strA4 = com.applovin.impl.gs.a(xmlPullParser, str2 + ":Padding");
                if (strA != null && strA2 != null) {
                    aVarF.b(new com.applovin.impl.lf.a(strA, strA2, strA3 != null ? java.lang.Long.parseLong(strA3) : 0L, strA4 != null ? java.lang.Long.parseLong(strA4) : 0L));
                } else {
                    return com.applovin.impl.db.h();
                }
            }
        } while (!com.applovin.impl.gs.b(xmlPullParser, str4));
        return aVarF.a();
    }
}
