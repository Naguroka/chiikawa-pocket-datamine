package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
public class VB {
    private com.bytedance.adsdk.IL.bX.bg.IL IL;
    private com.bytedance.adsdk.IL.bX.bg.IL bX;
    private com.bytedance.adsdk.IL.bX.bg.bg bg;
    private com.bytedance.adsdk.IL.bX.bg.IL eqN;
    private com.bytedance.adsdk.IL.bX.bg.IL zx;

    com.bytedance.adsdk.IL.zx.eo bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar) throws java.io.IOException {
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    IL(jsonReader, iRVar);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        if (this.bg == null || this.IL == null || this.bX == null || this.eqN == null || this.zx == null) {
            return null;
        }
        return new com.bytedance.adsdk.IL.zx.eo(this.bg, this.IL, this.bX, this.eqN, this.zx);
    }

    private void IL(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar) throws java.io.IOException {
        jsonReader.beginObject();
        java.lang.String strNextString = "";
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("v")) {
                strNextString.hashCode();
                switch (strNextString) {
                    case "Distance":
                        this.eqN = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar);
                        break;
                    case "Opacity":
                        this.IL = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar, false);
                        break;
                    case "Direction":
                        this.bX = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar, false);
                        break;
                    case "Shadow Color":
                        this.bg = com.bytedance.adsdk.IL.zx.eqN.iR(jsonReader, iRVar);
                        break;
                    case "Softness":
                        this.zx = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            } else if (strNextName.equals("nm")) {
                strNextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }
}
