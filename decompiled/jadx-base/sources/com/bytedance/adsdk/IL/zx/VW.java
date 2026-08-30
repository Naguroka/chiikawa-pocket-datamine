package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
class VW {
    static com.bytedance.adsdk.IL.bX.IL.VB bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar) throws java.io.IOException {
        java.lang.String strNextString = null;
        com.bytedance.adsdk.IL.bX.bg.Ta<android.graphics.PointF, android.graphics.PointF> taIL = null;
        com.bytedance.adsdk.IL.bX.bg.ldr ldrVarBX = null;
        com.bytedance.adsdk.IL.bX.bg.IL ilBg = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "p":
                    taIL = com.bytedance.adsdk.IL.zx.bg.IL(jsonReader, iRVar);
                    break;
                case "r":
                    ilBg = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar);
                    break;
                case "s":
                    ldrVarBX = com.bytedance.adsdk.IL.zx.eqN.bX(jsonReader, iRVar);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.IL.bX.IL.VB(strNextString, taIL, ldrVarBX, ilBg, zNextBoolean);
    }
}
