package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
public final class ColorStateListInflaterCompat {
    private static final java.lang.ThreadLocal<android.util.TypedValue> sTempTypedValue = new java.lang.ThreadLocal<>();

    private ColorStateListInflaterCompat() {
    }

    public static android.content.res.ColorStateList inflate(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) {
        try {
            return createFromXml(resources, resources.getXml(i), theme);
        } catch (java.lang.Exception e) {
            android.util.Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    public static android.content.res.ColorStateList createFromXml(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int next;
        android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
        }
        return createFromXmlInner(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
    }

    public static android.content.res.ColorStateList createFromXmlInner(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        java.lang.String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new org.xmlpull.v1.XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        return inflate(resources, xmlPullParser, attributeSet, theme);
    }

    private static android.content.res.ColorStateList inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int depth;
        int color;
        float f;
        int i = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrAppend = new int[20];
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                android.content.res.TypedArray typedArrayObtainAttributes = obtainAttributes(resources, theme, attributeSet, androidx.core.R.styleable.ColorStateListItem);
                int resourceId = typedArrayObtainAttributes.getResourceId(androidx.core.R.styleable.ColorStateListItem_android_color, -1);
                if (resourceId != -1 && !isColorInt(resources, resourceId)) {
                    try {
                        color = createFromXml(resources, resources.getXml(resourceId), theme).getDefaultColor();
                    } catch (java.lang.Exception unused) {
                        color = typedArrayObtainAttributes.getColor(androidx.core.R.styleable.ColorStateListItem_android_color, -65281);
                    }
                } else {
                    color = typedArrayObtainAttributes.getColor(androidx.core.R.styleable.ColorStateListItem_android_color, -65281);
                }
                float f2 = 1.0f;
                if (typedArrayObtainAttributes.hasValue(androidx.core.R.styleable.ColorStateListItem_android_alpha)) {
                    f2 = typedArrayObtainAttributes.getFloat(androidx.core.R.styleable.ColorStateListItem_android_alpha, 1.0f);
                } else if (typedArrayObtainAttributes.hasValue(androidx.core.R.styleable.ColorStateListItem_alpha)) {
                    f2 = typedArrayObtainAttributes.getFloat(androidx.core.R.styleable.ColorStateListItem_alpha, 1.0f);
                }
                if (android.os.Build.VERSION.SDK_INT >= 31 && typedArrayObtainAttributes.hasValue(androidx.core.R.styleable.ColorStateListItem_android_lStar)) {
                    f = typedArrayObtainAttributes.getFloat(androidx.core.R.styleable.ColorStateListItem_android_lStar, -1.0f);
                } else {
                    f = typedArrayObtainAttributes.getFloat(androidx.core.R.styleable.ColorStateListItem_lStar, -1.0f);
                }
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i3 = 0;
                for (int i4 = 0; i4 < attributeCount; i4++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != androidx.core.R.attr.alpha && attributeNameResource != androidx.core.R.attr.lStar) {
                        int i5 = i3 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i3] = attributeNameResource;
                        i3 = i5;
                    }
                }
                int[] iArrTrimStateSet = android.util.StateSet.trimStateSet(iArr2, i3);
                iArrAppend = androidx.core.content.res.GrowingArrayUtils.append(iArrAppend, i2, modulateColorAlpha(color, f2, f));
                iArr = (int[][]) androidx.core.content.res.GrowingArrayUtils.append(iArr, i2, iArrTrimStateSet);
                i2++;
            }
            i = 1;
        }
        int[] iArr3 = new int[i2];
        int[][] iArr4 = new int[i2][];
        java.lang.System.arraycopy(iArrAppend, 0, iArr3, 0, i2);
        java.lang.System.arraycopy(iArr, 0, iArr4, 0, i2);
        return new android.content.res.ColorStateList(iArr4, iArr3);
    }

    private static boolean isColorInt(android.content.res.Resources resources, int i) {
        android.util.TypedValue typedValue = getTypedValue();
        resources.getValue(i, typedValue, true);
        return typedValue.type >= 28 && typedValue.type <= 31;
    }

    private static android.util.TypedValue getTypedValue() {
        java.lang.ThreadLocal<android.util.TypedValue> threadLocal = sTempTypedValue;
        android.util.TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        android.util.TypedValue typedValue2 = new android.util.TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static android.content.res.TypedArray obtainAttributes(android.content.res.Resources resources, android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    private static int modulateColorAlpha(int i, float f, float f2) {
        boolean z = f2 >= 0.0f && f2 <= 100.0f;
        if (f == 1.0f && !z) {
            return i;
        }
        int iClamp = androidx.core.math.MathUtils.clamp((int) ((android.graphics.Color.alpha(i) * f) + 0.5f), 0, 255);
        if (z) {
            androidx.core.content.res.CamColor camColorFromColor = androidx.core.content.res.CamColor.fromColor(i);
            i = androidx.core.content.res.CamColor.toColor(camColorFromColor.getHue(), camColorFromColor.getChroma(), f2);
        }
        return (i & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK) | (iClamp << 24);
    }
}
