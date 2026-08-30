package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    public static com.bytedance.adsdk.IL.bX.bg.VB bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar) throws java.io.IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.IL.bX.bg.VB vbIL = null;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY)) {
                vbIL = IL(jsonReader, iRVar);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return vbIL == null ? new com.bytedance.adsdk.IL.bX.bg.VB(null, null, null, null) : vbIL;
    }

    private static com.bytedance.adsdk.IL.bX.bg.VB IL(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar) throws java.io.IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.IL.bX.bg.bg bgVarIR = null;
        com.bytedance.adsdk.IL.bX.bg.bg bgVarIR2 = null;
        com.bytedance.adsdk.IL.bX.bg.IL ilBg = null;
        com.bytedance.adsdk.IL.bX.bg.IL ilBg2 = null;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "t":
                    ilBg2 = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar);
                    break;
                case "fc":
                    bgVarIR = com.bytedance.adsdk.IL.zx.eqN.iR(jsonReader, iRVar);
                    break;
                case "sc":
                    bgVarIR2 = com.bytedance.adsdk.IL.zx.eqN.iR(jsonReader, iRVar);
                    break;
                case "sw":
                    ilBg = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.IL.bX.bg.VB(bgVarIR, bgVarIR2, ilBg, ilBg2);
    }
}
