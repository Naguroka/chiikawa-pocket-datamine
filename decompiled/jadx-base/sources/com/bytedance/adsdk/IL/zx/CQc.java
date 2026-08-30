package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
class CQc {
    static com.bytedance.adsdk.IL.bX.IL.xxp bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String strNextString = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "it":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.bytedance.adsdk.IL.bX.IL.bX bXVarBg = com.bytedance.adsdk.IL.zx.Kg.bg(jsonReader, iRVar);
                        if (bXVarBg != null) {
                            arrayList.add(bXVarBg);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.IL.bX.IL.xxp(strNextString, arrayList, zNextBoolean);
    }
}
