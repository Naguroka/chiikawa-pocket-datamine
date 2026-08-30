package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
class yDt {
    static com.bytedance.adsdk.IL.bX.bX bg(android.util.JsonReader jsonReader) throws java.io.IOException {
        jsonReader.beginObject();
        java.lang.String strNextString = null;
        java.lang.String strNextString2 = null;
        float fNextDouble = 0.0f;
        java.lang.String strNextString3 = null;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "fFamily":
                    strNextString = jsonReader.nextString();
                    break;
                case "ascent":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "fStyle":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "fName":
                    strNextString3 = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.IL.bX.bX(strNextString, strNextString3, strNextString2, fNextDouble);
    }
}
