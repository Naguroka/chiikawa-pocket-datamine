package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
public class TypedArrayUtils {
    private static final java.lang.String NAMESPACE = "http://schemas.android.com/apk/res/android";

    public static boolean hasAttribute(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        return xmlPullParser.getAttributeValue(NAMESPACE, str) != null;
    }

    public static float getNamedFloat(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i, float f) {
        return !hasAttribute(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static boolean getNamedBoolean(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i, boolean z) {
        return !hasAttribute(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    public static int getNamedInt(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i, int i2) {
        return !hasAttribute(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static int getNamedColor(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i, int i2) {
        return !hasAttribute(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    public static androidx.core.content.res.ComplexColorCompat getNamedComplexColor(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources.Theme theme, java.lang.String str, int i, int i2) {
        if (hasAttribute(xmlPullParser, str)) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            typedArray.getValue(i, typedValue);
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return androidx.core.content.res.ComplexColorCompat.from(typedValue.data);
            }
            androidx.core.content.res.ComplexColorCompat complexColorCompatInflate = androidx.core.content.res.ComplexColorCompat.inflate(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (complexColorCompatInflate != null) {
                return complexColorCompatInflate;
            }
        }
        return androidx.core.content.res.ComplexColorCompat.from(i2);
    }

    public static android.content.res.ColorStateList getNamedColorStateList(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources.Theme theme, java.lang.String str, int i) {
        if (!hasAttribute(xmlPullParser, str)) {
            return null;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        typedArray.getValue(i, typedValue);
        if (typedValue.type == 2) {
            throw new java.lang.UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
        }
        if (typedValue.type >= 28 && typedValue.type <= 31) {
            return getNamedColorStateListFromInt(typedValue);
        }
        return androidx.core.content.res.ColorStateListInflaterCompat.inflate(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
    }

    private static android.content.res.ColorStateList getNamedColorStateListFromInt(android.util.TypedValue typedValue) {
        return android.content.res.ColorStateList.valueOf(typedValue.data);
    }

    public static int getNamedResourceId(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i, int i2) {
        return !hasAttribute(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }

    public static java.lang.String getNamedString(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i) {
        if (hasAttribute(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    public static android.util.TypedValue peekNamedValue(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i) {
        if (hasAttribute(xmlPullParser, str)) {
            return typedArray.peekValue(i);
        }
        return null;
    }

    public static android.content.res.TypedArray obtainAttributes(android.content.res.Resources resources, android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static boolean getBoolean(android.content.res.TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.res.TypedArray typedArray, int i, int i2) {
        android.graphics.drawable.Drawable drawable = typedArray.getDrawable(i);
        return drawable == null ? typedArray.getDrawable(i2) : drawable;
    }

    public static int getInt(android.content.res.TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getInt(i, typedArray.getInt(i2, i3));
    }

    public static int getResourceId(android.content.res.TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    public static java.lang.String getString(android.content.res.TypedArray typedArray, int i, int i2) {
        java.lang.String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    public static java.lang.CharSequence getText(android.content.res.TypedArray typedArray, int i, int i2) {
        java.lang.CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    public static java.lang.CharSequence[] getTextArray(android.content.res.TypedArray typedArray, int i, int i2) {
        java.lang.CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    public static int getAttr(android.content.Context context, int i, int i2) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    private TypedArrayUtils() {
    }
}
