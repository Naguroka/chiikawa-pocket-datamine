package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    public static com.bytedance.adsdk.IL.bX.bg.zx bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jsonReader.peek() == android.util.JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(com.bytedance.adsdk.IL.zx.Uw.bg(jsonReader, iRVar));
            }
            jsonReader.endArray();
            com.bytedance.adsdk.IL.zx.tC.bg(arrayList);
        } else {
            arrayList.add(new com.bytedance.adsdk.IL.iR.bg(com.bytedance.adsdk.IL.zx.Fy.IL(jsonReader, com.bytedance.adsdk.IL.ldr.ldr.bg())));
        }
        return new com.bytedance.adsdk.IL.bX.bg.zx(arrayList);
    }

    static com.bytedance.adsdk.IL.bX.bg.Ta<android.graphics.PointF, android.graphics.PointF> IL(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar) throws java.io.IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.IL.bX.bg.zx zxVarBg = null;
        com.bytedance.adsdk.IL.bX.bg.IL ilBg = null;
        com.bytedance.adsdk.IL.bX.bg.IL ilBg2 = null;
        boolean z = false;
        while (jsonReader.peek() != android.util.JsonToken.END_OBJECT) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "k":
                    zxVarBg = bg(jsonReader, iRVar);
                    break;
                case "x":
                    if (jsonReader.peek() != android.util.JsonToken.STRING) {
                        ilBg = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar);
                        break;
                    } else {
                        z = true;
                        jsonReader.skipValue();
                        break;
                    }
                    break;
                case "y":
                    if (jsonReader.peek() != android.util.JsonToken.STRING) {
                        ilBg2 = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar);
                        break;
                    } else {
                        z = true;
                        jsonReader.skipValue();
                        break;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            iRVar.bg("Lottie doesn't support expressions.");
        }
        return zxVarBg != null ? zxVarBg : new com.bytedance.adsdk.IL.bX.bg.WR(ilBg, ilBg2);
    }
}
