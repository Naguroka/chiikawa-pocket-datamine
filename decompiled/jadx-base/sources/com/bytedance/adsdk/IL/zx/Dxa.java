package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
class Dxa {
    static com.bytedance.adsdk.IL.bX.IL.Fy bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar) throws java.io.IOException {
        java.lang.String strNextString = null;
        com.bytedance.adsdk.IL.bX.IL.Fy.bg bgVarBg = null;
        com.bytedance.adsdk.IL.bX.bg.IL ilBg = null;
        com.bytedance.adsdk.IL.bX.bg.IL ilBg2 = null;
        com.bytedance.adsdk.IL.bX.bg.IL ilBg3 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "e":
                    ilBg2 = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar, false);
                    break;
                case "m":
                    bgVarBg = com.bytedance.adsdk.IL.bX.IL.Fy.bg.bg(jsonReader.nextInt());
                    break;
                case "o":
                    ilBg3 = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar, false);
                    break;
                case "s":
                    ilBg = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar, false);
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
        return new com.bytedance.adsdk.IL.bX.IL.Fy(strNextString, bgVarBg, ilBg, ilBg2, ilBg3, zNextBoolean);
    }
}
