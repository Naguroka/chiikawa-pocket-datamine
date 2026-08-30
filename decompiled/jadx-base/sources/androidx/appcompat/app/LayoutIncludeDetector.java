package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
class LayoutIncludeDetector {
    private final java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> mXmlParserStack = new java.util.ArrayDeque();

    LayoutIncludeDetector() {
    }

    boolean detect(android.util.AttributeSet attributeSet) {
        if (!(attributeSet instanceof org.xmlpull.v1.XmlPullParser)) {
            return false;
        }
        org.xmlpull.v1.XmlPullParser xmlPullParser = (org.xmlpull.v1.XmlPullParser) attributeSet;
        if (xmlPullParser.getDepth() != 1) {
            return false;
        }
        org.xmlpull.v1.XmlPullParser xmlPullParserPopOutdatedAttrHolders = popOutdatedAttrHolders(this.mXmlParserStack);
        this.mXmlParserStack.push(new java.lang.ref.WeakReference<>(xmlPullParser));
        return shouldInheritContext(xmlPullParser, xmlPullParserPopOutdatedAttrHolders);
    }

    private static boolean shouldInheritContext(org.xmlpull.v1.XmlPullParser xmlPullParser, org.xmlpull.v1.XmlPullParser xmlPullParser2) {
        if (xmlPullParser2 == null || xmlPullParser == xmlPullParser2) {
            return false;
        }
        try {
            if (xmlPullParser2.getEventType() == 2) {
                return "include".equals(xmlPullParser2.getName());
            }
            return false;
        } catch (org.xmlpull.v1.XmlPullParserException unused) {
            return false;
        }
    }

    private static org.xmlpull.v1.XmlPullParser popOutdatedAttrHolders(java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> deque) {
        while (!deque.isEmpty()) {
            org.xmlpull.v1.XmlPullParser xmlPullParser = deque.peek().get();
            if (!isParserOutdated(xmlPullParser)) {
                return xmlPullParser;
            }
            deque.pop();
        }
        return null;
    }

    private static boolean isParserOutdated(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        if (xmlPullParser == null) {
            return true;
        }
        try {
            return xmlPullParser.getEventType() == 3 || xmlPullParser.getEventType() == 1;
        } catch (org.xmlpull.v1.XmlPullParserException unused) {
            return true;
        }
    }
}
