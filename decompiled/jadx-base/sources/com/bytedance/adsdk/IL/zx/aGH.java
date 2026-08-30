package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
class aGH {
    static com.bytedance.adsdk.IL.bX.IL.eo bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar, int i) throws java.io.IOException {
        boolean zNextBoolean = false;
        boolean z = i == 3;
        java.lang.String strNextString = null;
        com.bytedance.adsdk.IL.bX.IL.eo.bg bgVarBg = null;
        com.bytedance.adsdk.IL.bX.bg.IL ilBg = null;
        com.bytedance.adsdk.IL.bX.bg.Ta<android.graphics.PointF, android.graphics.PointF> taIL = null;
        com.bytedance.adsdk.IL.bX.bg.IL ilBg2 = null;
        com.bytedance.adsdk.IL.bX.bg.IL ilBg3 = null;
        com.bytedance.adsdk.IL.bX.bg.IL ilBg4 = null;
        com.bytedance.adsdk.IL.bX.bg.IL ilBg5 = null;
        com.bytedance.adsdk.IL.bX.bg.IL ilBg6 = null;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "d":
                    if (jsonReader.nextInt() != 3) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                    break;
                case "p":
                    taIL = com.bytedance.adsdk.IL.zx.bg.IL(jsonReader, iRVar);
                    break;
                case "r":
                    ilBg2 = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar, false);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ir":
                    ilBg3 = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar);
                    break;
                case "is":
                    ilBg5 = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar, false);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "or":
                    ilBg4 = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar);
                    break;
                case "os":
                    ilBg6 = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar, false);
                    break;
                case "pt":
                    ilBg = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar, false);
                    break;
                case "sy":
                    bgVarBg = com.bytedance.adsdk.IL.bX.IL.eo.bg.bg(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.IL.bX.IL.eo(strNextString, bgVarBg, ilBg, taIL, ilBg2, ilBg3, ilBg4, ilBg5, ilBg6, zNextBoolean, z);
    }
}
