package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
class ldr {
    static com.bytedance.adsdk.IL.bX.IL.IL bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar, int i) throws java.io.IOException {
        boolean z = i == 3;
        boolean zNextBoolean = false;
        java.lang.String strNextString = null;
        com.bytedance.adsdk.IL.bX.bg.Ta<android.graphics.PointF, android.graphics.PointF> taIL = null;
        com.bytedance.adsdk.IL.bX.bg.ldr ldrVarBX = null;
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
        return new com.bytedance.adsdk.IL.bX.IL.IL(strNextString, taIL, ldrVarBX, z, zNextBoolean);
    }
}
