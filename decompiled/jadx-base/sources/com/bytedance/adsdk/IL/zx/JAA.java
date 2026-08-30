package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
class JAA {
    static com.bytedance.adsdk.IL.bX.IL.Kg bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar) throws java.io.IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.IL.bX.IL.Kg.bg bgVar = null;
        com.bytedance.adsdk.IL.bX.bg.Kg kgZx = null;
        com.bytedance.adsdk.IL.bX.bg.eqN eqnIL = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "o":
                    eqnIL = com.bytedance.adsdk.IL.zx.eqN.IL(jsonReader, iRVar);
                    break;
                case "pt":
                    kgZx = com.bytedance.adsdk.IL.zx.eqN.zx(jsonReader, iRVar);
                    break;
                case "inv":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "mode":
                    java.lang.String strNextString = jsonReader.nextString();
                    strNextString.hashCode();
                    switch (strNextString) {
                        case "a":
                            bgVar = com.bytedance.adsdk.IL.bX.IL.Kg.bg.MASK_MODE_ADD;
                            break;
                        case "i":
                            iRVar.bg("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            bgVar = com.bytedance.adsdk.IL.bX.IL.Kg.bg.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            bgVar = com.bytedance.adsdk.IL.bX.IL.Kg.bg.MASK_MODE_NONE;
                            break;
                        case "s":
                            bgVar = com.bytedance.adsdk.IL.bX.IL.Kg.bg.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            bgVar = com.bytedance.adsdk.IL.bX.IL.Kg.bg.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.IL.bX.IL.Kg(bgVar, kgZx, eqnIL, zNextBoolean);
    }
}
