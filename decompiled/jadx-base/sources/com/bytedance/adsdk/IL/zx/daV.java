package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
public class daV {
    static com.bytedance.adsdk.IL.bX.IL.Ta bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar) throws java.io.IOException {
        java.lang.String strNextString = null;
        com.bytedance.adsdk.IL.bX.bg.IL ilBg = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "r":
                    ilBg = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar, true);
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
        if (zNextBoolean) {
            return null;
        }
        return new com.bytedance.adsdk.IL.bX.IL.Ta(strNextString, ilBg);
    }
}
