package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
class Fy {
    static int bg(android.util.JsonReader jsonReader) throws java.io.IOException {
        jsonReader.beginArray();
        int iNextDouble = (int) (jsonReader.nextDouble() * 255.0d);
        int iNextDouble2 = (int) (jsonReader.nextDouble() * 255.0d);
        int iNextDouble3 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return android.graphics.Color.argb(255, iNextDouble, iNextDouble2, iNextDouble3);
    }

    static java.util.List<android.graphics.PointF> bg(android.util.JsonReader jsonReader, float f) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == android.util.JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(IL(jsonReader, f));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.IL.zx.Fy$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] bg;

        static {
            int[] iArr = new int[android.util.JsonToken.values().length];
            bg = iArr;
            try {
                iArr[android.util.JsonToken.NUMBER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                bg[android.util.JsonToken.BEGIN_ARRAY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                bg[android.util.JsonToken.BEGIN_OBJECT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    static android.graphics.PointF IL(android.util.JsonReader jsonReader, float f) throws java.io.IOException {
        int i = com.bytedance.adsdk.IL.zx.Fy.AnonymousClass1.bg[jsonReader.peek().ordinal()];
        if (i == 1) {
            return bX(jsonReader, f);
        }
        if (i == 2) {
            return eqN(jsonReader, f);
        }
        if (i == 3) {
            return zx(jsonReader, f);
        }
        throw new java.lang.IllegalArgumentException("Unknown point starts with " + jsonReader.peek());
    }

    private static android.graphics.PointF bX(android.util.JsonReader jsonReader, float f) throws java.io.IOException {
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return new android.graphics.PointF(fNextDouble * f, fNextDouble2 * f);
    }

    private static android.graphics.PointF eqN(android.util.JsonReader jsonReader, float f) throws java.io.IOException {
        jsonReader.beginArray();
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.peek() != android.util.JsonToken.END_ARRAY) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return new android.graphics.PointF(fNextDouble * f, fNextDouble2 * f);
    }

    private static android.graphics.PointF zx(android.util.JsonReader jsonReader, float f) throws java.io.IOException {
        jsonReader.beginObject();
        float fIL = 0.0f;
        float fIL2 = 0.0f;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("x")) {
                fIL = IL(jsonReader);
            } else if (strNextName.equals("y")) {
                fIL2 = IL(jsonReader);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new android.graphics.PointF(fIL * f, fIL2 * f);
    }

    static float IL(android.util.JsonReader jsonReader) throws java.io.IOException {
        android.util.JsonToken jsonTokenPeek = jsonReader.peek();
        int i = com.bytedance.adsdk.IL.zx.Fy.AnonymousClass1.bg[jsonTokenPeek.ordinal()];
        if (i == 1) {
            return (float) jsonReader.nextDouble();
        }
        if (i == 2) {
            jsonReader.beginArray();
            float fNextDouble = (float) jsonReader.nextDouble();
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            jsonReader.endArray();
            return fNextDouble;
        }
        throw new java.lang.IllegalArgumentException("Unknown value for token of type ".concat(java.lang.String.valueOf(jsonTokenPeek)));
    }
}
