package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
class LKE {
    static com.bytedance.adsdk.IL.bX.IL.Lq bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar) throws java.io.IOException {
        com.bytedance.adsdk.IL.bX.bg.eqN eqn = null;
        java.lang.String strNextString = null;
        com.bytedance.adsdk.IL.bX.bg.bg bgVarIR = null;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        int iNextInt = 1;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "fillEnabled":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "c":
                    bgVarIR = com.bytedance.adsdk.IL.zx.eqN.iR(jsonReader, iRVar);
                    break;
                case "o":
                    eqn = com.bytedance.adsdk.IL.zx.eqN.IL(jsonReader, iRVar);
                    break;
                case "r":
                    iNextInt = jsonReader.nextInt();
                    break;
                case "hd":
                    zNextBoolean2 = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (eqn == null) {
            eqn = new com.bytedance.adsdk.IL.bX.bg.eqN(java.util.Collections.singletonList(new com.bytedance.adsdk.IL.iR.bg(100)));
        }
        return new com.bytedance.adsdk.IL.bX.IL.Lq(strNextString, zNextBoolean, iNextInt == 1 ? android.graphics.Path.FillType.WINDING : android.graphics.Path.FillType.EVEN_ODD, bgVarIR, eqn, zNextBoolean2);
    }
}
