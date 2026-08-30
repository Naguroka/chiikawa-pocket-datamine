package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gs {
    public static boolean b(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        return a(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean c(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        return b(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static java.lang.String a(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static boolean b(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean a(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }
}
