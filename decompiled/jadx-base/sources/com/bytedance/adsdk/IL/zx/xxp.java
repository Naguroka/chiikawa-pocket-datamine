package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
class xxp {
    static com.bytedance.adsdk.IL.bX.IL.zx bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar) throws java.io.IOException {
        com.bytedance.adsdk.IL.bX.bg.eqN eqnIL = null;
        android.graphics.Path.FillType fillType = android.graphics.Path.FillType.WINDING;
        java.lang.String strNextString = null;
        com.bytedance.adsdk.IL.bX.IL.iR iRVar2 = null;
        com.bytedance.adsdk.IL.bX.bg.bX bXVarBg = null;
        com.bytedance.adsdk.IL.bX.bg.ldr ldrVarBX = null;
        com.bytedance.adsdk.IL.bX.bg.ldr ldrVarBX2 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            int iNextInt = -1;
            switch (strNextName) {
                case "e":
                    ldrVarBX2 = com.bytedance.adsdk.IL.zx.eqN.bX(jsonReader, iRVar);
                    break;
                case "g":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        java.lang.String strNextName2 = jsonReader.nextName();
                        strNextName2.hashCode();
                        if (strNextName2.equals("k")) {
                            bXVarBg = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar, iNextInt);
                        } else if (strNextName2.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_P)) {
                            iNextInt = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case "o":
                    eqnIL = com.bytedance.adsdk.IL.zx.eqN.IL(jsonReader, iRVar);
                    break;
                case "r":
                    fillType = jsonReader.nextInt() == 1 ? android.graphics.Path.FillType.WINDING : android.graphics.Path.FillType.EVEN_ODD;
                    break;
                case "s":
                    ldrVarBX = com.bytedance.adsdk.IL.zx.eqN.bX(jsonReader, iRVar);
                    break;
                case "t":
                    iRVar2 = jsonReader.nextInt() == 1 ? com.bytedance.adsdk.IL.bX.IL.iR.LINEAR : com.bytedance.adsdk.IL.bX.IL.iR.RADIAL;
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
        return new com.bytedance.adsdk.IL.bX.IL.zx(strNextString, iRVar2, fillType, bXVarBg, eqnIL == null ? new com.bytedance.adsdk.IL.bX.bg.eqN(java.util.Collections.singletonList(new com.bytedance.adsdk.IL.iR.bg(100))) : eqnIL, ldrVarBX, ldrVarBX2, null, null, zNextBoolean);
    }
}
