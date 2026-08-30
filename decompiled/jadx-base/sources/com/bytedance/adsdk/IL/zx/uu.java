package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
class uu {
    static com.bytedance.adsdk.IL.bX.IL.VzQ bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar) throws java.io.IOException {
        java.lang.String strNextString = null;
        com.bytedance.adsdk.IL.bX.bg.Kg kgZx = null;
        int iNextInt = 0;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ks":
                    kgZx = com.bytedance.adsdk.IL.zx.eqN.zx(jsonReader, iRVar);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "ind":
                    iNextInt = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.IL.bX.IL.VzQ(strNextString, iNextInt, kgZx, zNextBoolean);
    }
}
