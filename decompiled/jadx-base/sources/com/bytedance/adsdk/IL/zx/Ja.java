package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
class Ja {
    static com.bytedance.adsdk.IL.bX.IL.WR bg(android.util.JsonReader jsonReader) throws java.io.IOException {
        java.lang.String strNextString = null;
        com.bytedance.adsdk.IL.bX.IL.WR.bg bgVarBg = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "mm":
                    bgVarBg = com.bytedance.adsdk.IL.bX.IL.WR.bg.bg(jsonReader.nextInt());
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.IL.bX.IL.WR(strNextString, bgVarBg, zNextBoolean);
    }
}
