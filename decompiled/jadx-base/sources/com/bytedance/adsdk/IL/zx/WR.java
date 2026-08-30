package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
public class WR implements com.bytedance.adsdk.IL.zx.bN<com.bytedance.adsdk.IL.bX.IL> {
    public static final com.bytedance.adsdk.IL.zx.WR bg = new com.bytedance.adsdk.IL.zx.WR();

    private WR() {
    }

    @Override // com.bytedance.adsdk.IL.zx.bN
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.IL.bX.IL IL(android.util.JsonReader jsonReader, float f) throws java.io.IOException {
        com.bytedance.adsdk.IL.bX.IL.bg bgVar = com.bytedance.adsdk.IL.bX.IL.bg.CENTER;
        jsonReader.beginObject();
        com.bytedance.adsdk.IL.bX.IL.bg bgVar2 = bgVar;
        java.lang.String strNextString = null;
        java.lang.String strNextString2 = null;
        android.graphics.PointF pointF = null;
        android.graphics.PointF pointF2 = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt = 0;
        int iBg = 0;
        int iBg2 = 0;
        boolean zNextBoolean = true;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "f":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "j":
                    int iNextInt2 = jsonReader.nextInt();
                    if (iNextInt2 > com.bytedance.adsdk.IL.bX.IL.bg.CENTER.ordinal() || iNextInt2 < 0) {
                        bgVar2 = com.bytedance.adsdk.IL.bX.IL.bg.CENTER;
                        break;
                    } else {
                        bgVar2 = com.bytedance.adsdk.IL.bX.IL.bg.values()[iNextInt2];
                        break;
                    }
                    break;
                case "s":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "t":
                    strNextString = jsonReader.nextString();
                    break;
                case "fc":
                    iBg = com.bytedance.adsdk.IL.zx.Fy.bg(jsonReader);
                    break;
                case "lh":
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    break;
                case "ls":
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    break;
                case "of":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ps":
                    jsonReader.beginArray();
                    android.graphics.PointF pointF3 = new android.graphics.PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                    jsonReader.endArray();
                    pointF = pointF3;
                    break;
                case "sc":
                    iBg2 = com.bytedance.adsdk.IL.zx.Fy.bg(jsonReader);
                    break;
                case "sw":
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    break;
                case "sz":
                    jsonReader.beginArray();
                    android.graphics.PointF pointF4 = new android.graphics.PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                    jsonReader.endArray();
                    pointF2 = pointF4;
                    break;
                case "tr":
                    iNextInt = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.IL.bX.IL(strNextString, strNextString2, fNextDouble, bgVar2, iNextInt, fNextDouble2, fNextDouble3, iBg, iBg2, fNextDouble4, zNextBoolean, pointF, pointF2);
    }
}
