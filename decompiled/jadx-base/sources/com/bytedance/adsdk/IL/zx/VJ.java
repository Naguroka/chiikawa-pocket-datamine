package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
class VJ {
    static com.bytedance.adsdk.IL.bX.IL.PX bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar) throws java.io.IOException {
        java.lang.String strNextString = null;
        com.bytedance.adsdk.IL.bX.bg.IL ilBg = null;
        com.bytedance.adsdk.IL.bX.bg.IL ilBg2 = null;
        com.bytedance.adsdk.IL.bX.bg.PX pxBg = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "c":
                    ilBg = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar, false);
                    break;
                case "o":
                    ilBg2 = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar, false);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "tr":
                    pxBg = com.bytedance.adsdk.IL.zx.bX.bg(jsonReader, iRVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.IL.bX.IL.PX(strNextString, ilBg, ilBg2, pxBg, zNextBoolean);
    }
}
