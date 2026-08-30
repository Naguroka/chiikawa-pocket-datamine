package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
class zx {
    static com.bytedance.adsdk.IL.bX.IL.bg bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar) throws java.io.IOException {
        com.bytedance.adsdk.IL.bX.IL.bg bgVar = null;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.IL.bX.IL.bg bgVarIL = IL(jsonReader, iRVar);
                    if (bgVarIL != null) {
                        bgVar = bgVarIL;
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        return bgVar;
    }

    private static com.bytedance.adsdk.IL.bX.IL.bg IL(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar) throws java.io.IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.IL.bX.IL.bg bgVar = null;
        while (true) {
            boolean z = false;
            while (true) {
                if (jsonReader.hasNext()) {
                    java.lang.String strNextName = jsonReader.nextName();
                    strNextName.hashCode();
                    if (strNextName.equals("v")) {
                        if (z) {
                            bgVar = new com.bytedance.adsdk.IL.bX.IL.bg(com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar));
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("ty")) {
                        if (jsonReader.nextInt() == 0) {
                            z = true;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                } else {
                    jsonReader.endObject();
                    return bgVar;
                }
            }
        }
    }
}
