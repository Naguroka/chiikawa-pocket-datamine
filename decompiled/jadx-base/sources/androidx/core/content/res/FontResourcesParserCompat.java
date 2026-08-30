package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
public class FontResourcesParserCompat {
    private static final int DEFAULT_TIMEOUT_MILLIS = 500;
    public static final int FETCH_STRATEGY_ASYNC = 1;
    public static final int FETCH_STRATEGY_BLOCKING = 0;
    public static final int INFINITE_TIMEOUT_VALUE = -1;
    private static final int ITALIC = 1;
    private static final int NORMAL_WEIGHT = 400;

    public interface FamilyResourceEntry {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FetchStrategy {
    }

    public static final class ProviderResourceEntry implements androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry {
        private final androidx.core.provider.FontRequest mRequest;
        private final int mStrategy;
        private final java.lang.String mSystemFontFamilyName;
        private final int mTimeoutMs;

        public ProviderResourceEntry(androidx.core.provider.FontRequest fontRequest, int i, int i2, java.lang.String str) {
            this.mRequest = fontRequest;
            this.mStrategy = i;
            this.mTimeoutMs = i2;
            this.mSystemFontFamilyName = str;
        }

        public ProviderResourceEntry(androidx.core.provider.FontRequest fontRequest, int i, int i2) {
            this(fontRequest, i, i2, null);
        }

        public androidx.core.provider.FontRequest getRequest() {
            return this.mRequest;
        }

        public int getFetchStrategy() {
            return this.mStrategy;
        }

        public int getTimeout() {
            return this.mTimeoutMs;
        }

        public java.lang.String getSystemFontFamilyName() {
            return this.mSystemFontFamilyName;
        }
    }

    public static final class FontFileResourceEntry {
        private final java.lang.String mFileName;
        private final boolean mItalic;
        private final int mResourceId;
        private final int mTtcIndex;
        private final java.lang.String mVariationSettings;
        private final int mWeight;

        public FontFileResourceEntry(java.lang.String str, int i, boolean z, java.lang.String str2, int i2, int i3) {
            this.mFileName = str;
            this.mWeight = i;
            this.mItalic = z;
            this.mVariationSettings = str2;
            this.mTtcIndex = i2;
            this.mResourceId = i3;
        }

        public java.lang.String getFileName() {
            return this.mFileName;
        }

        public int getWeight() {
            return this.mWeight;
        }

        public boolean isItalic() {
            return this.mItalic;
        }

        public java.lang.String getVariationSettings() {
            return this.mVariationSettings;
        }

        public int getTtcIndex() {
            return this.mTtcIndex;
        }

        public int getResourceId() {
            return this.mResourceId;
        }
    }

    public static final class FontFamilyFilesResourceEntry implements androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry {
        private final androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[] mEntries;

        public FontFamilyFilesResourceEntry(androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[] fontFileResourceEntryArr) {
            this.mEntries = fontFileResourceEntryArr;
        }

        public androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[] getEntries() {
            return this.mEntries;
        }
    }

    public static androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry parse(org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources resources) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
        }
        return readFamilies(xmlPullParser, resources);
    }

    private static androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry readFamilies(org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources resources) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return readFamily(xmlPullParser, resources);
        }
        skip(xmlPullParser);
        return null;
    }

    private static androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry readFamily(org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources resources) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        android.content.res.TypedArray typedArrayObtainAttributes = resources.obtainAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.core.R.styleable.FontFamily);
        java.lang.String string = typedArrayObtainAttributes.getString(androidx.core.R.styleable.FontFamily_fontProviderAuthority);
        java.lang.String string2 = typedArrayObtainAttributes.getString(androidx.core.R.styleable.FontFamily_fontProviderPackage);
        java.lang.String string3 = typedArrayObtainAttributes.getString(androidx.core.R.styleable.FontFamily_fontProviderQuery);
        int resourceId = typedArrayObtainAttributes.getResourceId(androidx.core.R.styleable.FontFamily_fontProviderCerts, 0);
        int integer = typedArrayObtainAttributes.getInteger(androidx.core.R.styleable.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(androidx.core.R.styleable.FontFamily_fontProviderFetchTimeout, 500);
        java.lang.String string4 = typedArrayObtainAttributes.getString(androidx.core.R.styleable.FontFamily_fontProviderSystemFontFamily);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                skip(xmlPullParser);
            }
            return new androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry(new androidx.core.provider.FontRequest(string, string2, string3, readCerts(resources, resourceId)), integer, integer2, string4);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(readFont(xmlPullParser, resources));
                } else {
                    skip(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry((androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[]) arrayList.toArray(new androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[0]));
    }

    private static int getType(android.content.res.TypedArray typedArray, int i) {
        return androidx.core.content.res.FontResourcesParserCompat.Api21Impl.getType(typedArray, i);
    }

    public static java.util.List<java.util.List<byte[]>> readCerts(android.content.res.Resources resources, int i) {
        if (i == 0) {
            return java.util.Collections.emptyList();
        }
        android.content.res.TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return java.util.Collections.emptyList();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (getType(typedArrayObtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(toByteArrayList(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(toByteArrayList(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static java.util.List<byte[]> toByteArrayList(java.lang.String[] strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            arrayList.add(android.util.Base64.decode(str, 0));
        }
        return arrayList;
    }

    private static androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry readFont(org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources resources) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        android.content.res.TypedArray typedArrayObtainAttributes = resources.obtainAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.core.R.styleable.FontFamilyFont);
        if (typedArrayObtainAttributes.hasValue(androidx.core.R.styleable.FontFamilyFont_fontWeight)) {
            i = androidx.core.R.styleable.FontFamilyFont_fontWeight;
        } else {
            i = androidx.core.R.styleable.FontFamilyFont_android_fontWeight;
        }
        int i6 = typedArrayObtainAttributes.getInt(i, 400);
        if (typedArrayObtainAttributes.hasValue(androidx.core.R.styleable.FontFamilyFont_fontStyle)) {
            i2 = androidx.core.R.styleable.FontFamilyFont_fontStyle;
        } else {
            i2 = androidx.core.R.styleable.FontFamilyFont_android_fontStyle;
        }
        boolean z = 1 == typedArrayObtainAttributes.getInt(i2, 0);
        if (typedArrayObtainAttributes.hasValue(androidx.core.R.styleable.FontFamilyFont_ttcIndex)) {
            i3 = androidx.core.R.styleable.FontFamilyFont_ttcIndex;
        } else {
            i3 = androidx.core.R.styleable.FontFamilyFont_android_ttcIndex;
        }
        if (typedArrayObtainAttributes.hasValue(androidx.core.R.styleable.FontFamilyFont_fontVariationSettings)) {
            i4 = androidx.core.R.styleable.FontFamilyFont_fontVariationSettings;
        } else {
            i4 = androidx.core.R.styleable.FontFamilyFont_android_fontVariationSettings;
        }
        java.lang.String string = typedArrayObtainAttributes.getString(i4);
        int i7 = typedArrayObtainAttributes.getInt(i3, 0);
        if (typedArrayObtainAttributes.hasValue(androidx.core.R.styleable.FontFamilyFont_font)) {
            i5 = androidx.core.R.styleable.FontFamilyFont_font;
        } else {
            i5 = androidx.core.R.styleable.FontFamilyFont_android_font;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i5, 0);
        java.lang.String string2 = typedArrayObtainAttributes.getString(i5);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            skip(xmlPullParser);
        }
        return new androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry(string2, i6, z, string, i7, resourceId);
    }

    private static void skip(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    private FontResourcesParserCompat() {
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static int getType(android.content.res.TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }
}
