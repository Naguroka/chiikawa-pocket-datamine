package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
class qC {
    static com.bytedance.adsdk.IL.bX.IL.tuV bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar) throws java.io.IOException {
        int i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        float fNextDouble = 0.0f;
        java.lang.String strNextString = null;
        com.bytedance.adsdk.IL.bX.bg.IL il = null;
        com.bytedance.adsdk.IL.bX.bg.bg bgVarIR = null;
        com.bytedance.adsdk.IL.bX.bg.IL ilBg = null;
        com.bytedance.adsdk.IL.bX.IL.tuV.bg bgVar = null;
        com.bytedance.adsdk.IL.bX.IL.tuV.IL il2 = null;
        boolean zNextBoolean = false;
        com.bytedance.adsdk.IL.bX.bg.eqN eqn = null;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            int i2 = 1;
            switch (strNextName) {
                case "c":
                    bgVarIR = com.bytedance.adsdk.IL.zx.eqN.iR(jsonReader, iRVar);
                    continue;
                    break;
                case "d":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        java.lang.String strNextString2 = null;
                        com.bytedance.adsdk.IL.bX.bg.IL ilBg2 = null;
                        while (jsonReader.hasNext()) {
                            java.lang.String strNextName2 = jsonReader.nextName();
                            strNextName2.hashCode();
                            if (strNextName2.equals(com.json.zb.q)) {
                                strNextString2 = jsonReader.nextString();
                            } else if (strNextName2.equals("v")) {
                                ilBg2 = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        strNextString2.hashCode();
                        switch (strNextString2) {
                            case "d":
                            case "g":
                                i = 1;
                                iRVar.bg(true);
                                arrayList.add(ilBg2);
                                i2 = i;
                                break;
                            case "o":
                                il = ilBg2;
                                i2 = 1;
                                break;
                            default:
                                i = 1;
                                i2 = i;
                                break;
                        }
                    }
                    int i3 = i2;
                    jsonReader.endArray();
                    if (arrayList.size() != i3) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                    }
                    break;
                case "o":
                    eqn = com.bytedance.adsdk.IL.zx.eqN.IL(jsonReader, iRVar);
                    continue;
                    break;
                case "w":
                    ilBg = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar);
                    continue;
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    continue;
                    break;
                case "lc":
                    bgVar = com.bytedance.adsdk.IL.bX.IL.tuV.bg.values()[jsonReader.nextInt() - 1];
                    continue;
                    break;
                case "lj":
                    il2 = com.bytedance.adsdk.IL.bX.IL.tuV.IL.values()[jsonReader.nextInt() - 1];
                    continue;
                    break;
                case "ml":
                    fNextDouble = (float) jsonReader.nextDouble();
                    continue;
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    continue;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (eqn == null) {
            eqn = new com.bytedance.adsdk.IL.bX.bg.eqN(java.util.Collections.singletonList(new com.bytedance.adsdk.IL.iR.bg(100)));
        }
        return new com.bytedance.adsdk.IL.bX.IL.tuV(strNextString, il, arrayList, bgVarIR, eqn, ilBg, bgVar, il2, fNextDouble, zNextBoolean);
    }
}
