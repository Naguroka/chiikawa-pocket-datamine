package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
class Ta {
    static com.bytedance.adsdk.IL.bX.eqN bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        jsonReader.beginObject();
        double dNextDouble = 0.0d;
        java.lang.String strNextString = null;
        java.lang.String strNextString2 = null;
        char cCharAt = 0;
        double dNextDouble2 = 0.0d;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "fFamily":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "w":
                    dNextDouble = jsonReader.nextDouble();
                    break;
                case "ch":
                    cCharAt = jsonReader.nextString().charAt(0);
                    break;
                case "data":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if ("shapes".equals(jsonReader.nextName())) {
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                arrayList.add((com.bytedance.adsdk.IL.bX.IL.xxp) com.bytedance.adsdk.IL.zx.Kg.bg(jsonReader, iRVar));
                            }
                            jsonReader.endArray();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case "size":
                    dNextDouble2 = jsonReader.nextDouble();
                    break;
                case "style":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.IL.bX.eqN(arrayList, cCharAt, dNextDouble2, dNextDouble, strNextString, strNextString2);
    }
}
