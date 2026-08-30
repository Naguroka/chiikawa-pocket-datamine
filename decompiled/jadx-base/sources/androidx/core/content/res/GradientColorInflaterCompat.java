package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
final class GradientColorInflaterCompat {
    private static final int TILE_MODE_CLAMP = 0;
    private static final int TILE_MODE_MIRROR = 2;
    private static final int TILE_MODE_REPEAT = 1;

    private GradientColorInflaterCompat() {
    }

    static android.graphics.Shader createFromXml(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
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

    static android.graphics.Shader createFromXmlInner(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        java.lang.String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new org.xmlpull.v1.XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        android.content.res.TypedArray typedArrayObtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.core.R.styleable.GradientColor);
        float namedFloat = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "startX", androidx.core.R.styleable.GradientColor_android_startX, 0.0f);
        float namedFloat2 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "startY", androidx.core.R.styleable.GradientColor_android_startY, 0.0f);
        float namedFloat3 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "endX", androidx.core.R.styleable.GradientColor_android_endX, 0.0f);
        float namedFloat4 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "endY", androidx.core.R.styleable.GradientColor_android_endY, 0.0f);
        float namedFloat5 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "centerX", androidx.core.R.styleable.GradientColor_android_centerX, 0.0f);
        float namedFloat6 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "centerY", androidx.core.R.styleable.GradientColor_android_centerY, 0.0f);
        int namedInt = androidx.core.content.res.TypedArrayUtils.getNamedInt(typedArrayObtainAttributes, xmlPullParser, "type", androidx.core.R.styleable.GradientColor_android_type, 0);
        int namedColor = androidx.core.content.res.TypedArrayUtils.getNamedColor(typedArrayObtainAttributes, xmlPullParser, "startColor", androidx.core.R.styleable.GradientColor_android_startColor, 0);
        boolean zHasAttribute = androidx.core.content.res.TypedArrayUtils.hasAttribute(xmlPullParser, "centerColor");
        int namedColor2 = androidx.core.content.res.TypedArrayUtils.getNamedColor(typedArrayObtainAttributes, xmlPullParser, "centerColor", androidx.core.R.styleable.GradientColor_android_centerColor, 0);
        int namedColor3 = androidx.core.content.res.TypedArrayUtils.getNamedColor(typedArrayObtainAttributes, xmlPullParser, "endColor", androidx.core.R.styleable.GradientColor_android_endColor, 0);
        int namedInt2 = androidx.core.content.res.TypedArrayUtils.getNamedInt(typedArrayObtainAttributes, xmlPullParser, "tileMode", androidx.core.R.styleable.GradientColor_android_tileMode, 0);
        float namedFloat7 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "gradientRadius", androidx.core.R.styleable.GradientColor_android_gradientRadius, 0.0f);
        typedArrayObtainAttributes.recycle();
        androidx.core.content.res.GradientColorInflaterCompat.ColorStops colorStopsCheckColors = checkColors(inflateChildElements(resources, xmlPullParser, attributeSet, theme), namedColor, namedColor3, zHasAttribute, namedColor2);
        if (namedInt != 1) {
            if (namedInt == 2) {
                return new android.graphics.SweepGradient(namedFloat5, namedFloat6, colorStopsCheckColors.mColors, colorStopsCheckColors.mOffsets);
            }
            return new android.graphics.LinearGradient(namedFloat, namedFloat2, namedFloat3, namedFloat4, colorStopsCheckColors.mColors, colorStopsCheckColors.mOffsets, parseTileMode(namedInt2));
        }
        if (namedFloat7 <= 0.0f) {
            throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
        return new android.graphics.RadialGradient(namedFloat5, namedFloat6, namedFloat7, colorStopsCheckColors.mColors, colorStopsCheckColors.mOffsets, parseTileMode(namedInt2));
    }

    private static androidx.core.content.res.GradientColorInflaterCompat.ColorStops inflateChildElements(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        java.util.ArrayList arrayList = new java.util.ArrayList(20);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                android.content.res.TypedArray typedArrayObtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.core.R.styleable.GradientColorItem);
                boolean zHasValue = typedArrayObtainAttributes.hasValue(androidx.core.R.styleable.GradientColorItem_android_color);
                boolean zHasValue2 = typedArrayObtainAttributes.hasValue(androidx.core.R.styleable.GradientColorItem_android_offset);
                if (!zHasValue || !zHasValue2) {
                    throw new org.xmlpull.v1.XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color = typedArrayObtainAttributes.getColor(androidx.core.R.styleable.GradientColorItem_android_color, 0);
                float f = typedArrayObtainAttributes.getFloat(androidx.core.R.styleable.GradientColorItem_android_offset, 0.0f);
                typedArrayObtainAttributes.recycle();
                arrayList2.add(java.lang.Integer.valueOf(color));
                arrayList.add(java.lang.Float.valueOf(f));
            }
        }
        if (arrayList2.size() > 0) {
            return new androidx.core.content.res.GradientColorInflaterCompat.ColorStops(arrayList2, arrayList);
        }
        return null;
    }

    private static androidx.core.content.res.GradientColorInflaterCompat.ColorStops checkColors(androidx.core.content.res.GradientColorInflaterCompat.ColorStops colorStops, int i, int i2, boolean z, int i3) {
        if (colorStops != null) {
            return colorStops;
        }
        if (z) {
            return new androidx.core.content.res.GradientColorInflaterCompat.ColorStops(i, i3, i2);
        }
        return new androidx.core.content.res.GradientColorInflaterCompat.ColorStops(i, i2);
    }

    private static android.graphics.Shader.TileMode parseTileMode(int i) {
        if (i == 1) {
            return android.graphics.Shader.TileMode.REPEAT;
        }
        if (i == 2) {
            return android.graphics.Shader.TileMode.MIRROR;
        }
        return android.graphics.Shader.TileMode.CLAMP;
    }

    static final class ColorStops {
        final int[] mColors;
        final float[] mOffsets;

        ColorStops(java.util.List<java.lang.Integer> list, java.util.List<java.lang.Float> list2) {
            int size = list.size();
            this.mColors = new int[size];
            this.mOffsets = new float[size];
            for (int i = 0; i < size; i++) {
                this.mColors[i] = list.get(i).intValue();
                this.mOffsets[i] = list2.get(i).floatValue();
            }
        }

        ColorStops(int i, int i2) {
            this.mColors = new int[]{i, i2};
            this.mOffsets = new float[]{0.0f, 1.0f};
        }

        ColorStops(int i, int i2, int i3) {
            this.mColors = new int[]{i, i2, i3};
            this.mOffsets = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
