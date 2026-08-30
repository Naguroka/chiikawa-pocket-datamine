package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
class VzQ {
    static com.bytedance.adsdk.IL.bX.IL.ldr bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar) throws java.io.IOException {
        com.bytedance.adsdk.IL.bX.IL.tuV.bg bgVar;
        com.bytedance.adsdk.IL.bX.IL.tuV.IL il;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        float fNextDouble = 0.0f;
        java.lang.String strNextString = null;
        com.bytedance.adsdk.IL.bX.IL.iR iRVar2 = null;
        com.bytedance.adsdk.IL.bX.bg.bX bXVarBg = null;
        com.bytedance.adsdk.IL.bX.bg.ldr ldrVarBX = null;
        com.bytedance.adsdk.IL.bX.bg.ldr ldrVarBX2 = null;
        com.bytedance.adsdk.IL.bX.bg.IL ilBg = null;
        com.bytedance.adsdk.IL.bX.IL.tuV.bg bgVar2 = null;
        com.bytedance.adsdk.IL.bX.IL.tuV.IL il2 = null;
        com.bytedance.adsdk.IL.bX.bg.IL il3 = null;
        boolean zNextBoolean = false;
        com.bytedance.adsdk.IL.bX.bg.eqN eqn = null;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            zNextBoolean = zNextBoolean;
            com.bytedance.adsdk.IL.bX.bg.IL il4 = il3;
            float f = fNextDouble;
            switch (strNextName) {
                case "d":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        java.lang.String strNextString2 = null;
                        com.bytedance.adsdk.IL.bX.bg.IL ilBg2 = null;
                        while (jsonReader.hasNext()) {
                            com.bytedance.adsdk.IL.bX.IL.tuV.IL il5 = il2;
                            java.lang.String strNextName2 = jsonReader.nextName();
                            strNextName2.hashCode();
                            com.bytedance.adsdk.IL.bX.IL.tuV.bg bgVar3 = bgVar2;
                            if (strNextName2.equals(com.json.zb.q)) {
                                strNextString2 = jsonReader.nextString();
                            } else if (strNextName2.equals("v")) {
                                ilBg2 = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar);
                            } else {
                                jsonReader.skipValue();
                            }
                            il2 = il5;
                            bgVar2 = bgVar3;
                        }
                        bgVar2 = bgVar2;
                        il2 = il2;
                        jsonReader.endObject();
                        if (strNextString2.equals("o")) {
                            il4 = ilBg2;
                        } else if (strNextString2.equals("d") || strNextString2.equals("g")) {
                            iRVar.bg(true);
                            arrayList.add(ilBg2);
                        }
                    }
                    bgVar = bgVar2;
                    il = il2;
                    jsonReader.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                        il3 = il4;
                    } else {
                        il3 = il4;
                    }
                    il2 = il;
                    fNextDouble = f;
                    bgVar2 = bgVar;
                    break;
                case "e":
                    ldrVarBX2 = com.bytedance.adsdk.IL.zx.eqN.bX(jsonReader, iRVar);
                    zNextBoolean = zNextBoolean;
                    il3 = il4;
                    fNextDouble = f;
                    break;
                case "g":
                    jsonReader.beginObject();
                    int iNextInt = -1;
                    while (jsonReader.hasNext()) {
                        java.lang.String strNextName3 = jsonReader.nextName();
                        strNextName3.hashCode();
                        if (strNextName3.equals("k")) {
                            bXVarBg = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar, iNextInt);
                        } else if (strNextName3.equals(androidx.media3.extractor.text.ttml.TtmlNode.TAG_P)) {
                            iNextInt = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    zNextBoolean = zNextBoolean;
                    il3 = il4;
                    fNextDouble = f;
                    break;
                case "o":
                    eqn = com.bytedance.adsdk.IL.zx.eqN.IL(jsonReader, iRVar);
                    zNextBoolean = zNextBoolean;
                    il3 = il4;
                    fNextDouble = f;
                    break;
                case "s":
                    ldrVarBX = com.bytedance.adsdk.IL.zx.eqN.bX(jsonReader, iRVar);
                    zNextBoolean = zNextBoolean;
                    il3 = il4;
                    fNextDouble = f;
                    break;
                case "t":
                    iRVar2 = jsonReader.nextInt() == 1 ? com.bytedance.adsdk.IL.bX.IL.iR.LINEAR : com.bytedance.adsdk.IL.bX.IL.iR.RADIAL;
                    zNextBoolean = zNextBoolean;
                    il3 = il4;
                    fNextDouble = f;
                    break;
                case "w":
                    ilBg = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar);
                    zNextBoolean = zNextBoolean;
                    il3 = il4;
                    fNextDouble = f;
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    il3 = il4;
                    fNextDouble = f;
                    break;
                case "lc":
                    bgVar2 = com.bytedance.adsdk.IL.bX.IL.tuV.bg.values()[jsonReader.nextInt() - 1];
                    zNextBoolean = zNextBoolean;
                    il3 = il4;
                    fNextDouble = f;
                    break;
                case "lj":
                    il2 = com.bytedance.adsdk.IL.bX.IL.tuV.IL.values()[jsonReader.nextInt() - 1];
                    zNextBoolean = zNextBoolean;
                    il3 = il4;
                    fNextDouble = f;
                    break;
                case "ml":
                    fNextDouble = (float) jsonReader.nextDouble();
                    zNextBoolean = zNextBoolean;
                    il3 = il4;
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    zNextBoolean = zNextBoolean;
                    il3 = il4;
                    fNextDouble = f;
                    break;
                default:
                    jsonReader.skipValue();
                    bgVar = bgVar2;
                    il = il2;
                    il3 = il4;
                    il2 = il;
                    fNextDouble = f;
                    bgVar2 = bgVar;
                    break;
            }
        }
        com.bytedance.adsdk.IL.bX.IL.tuV.bg bgVar4 = bgVar2;
        com.bytedance.adsdk.IL.bX.IL.tuV.IL il6 = il2;
        float f2 = fNextDouble;
        com.bytedance.adsdk.IL.bX.bg.IL il7 = il3;
        boolean z = zNextBoolean;
        if (eqn == null) {
            eqn = new com.bytedance.adsdk.IL.bX.bg.eqN(java.util.Collections.singletonList(new com.bytedance.adsdk.IL.iR.bg(100)));
        }
        return new com.bytedance.adsdk.IL.bX.IL.ldr(strNextString, iRVar2, bXVarBg, eqn, ldrVarBX, ldrVarBX2, ilBg, bgVar4, il6, f2, arrayList, il7, z);
    }
}
