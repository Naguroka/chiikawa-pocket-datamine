package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
public class ZQc implements com.bytedance.adsdk.IL.zx.bN<com.bytedance.adsdk.IL.bX.IL.yDt> {
    public static final com.bytedance.adsdk.IL.zx.ZQc bg = new com.bytedance.adsdk.IL.zx.ZQc();

    private ZQc() {
    }

    @Override // com.bytedance.adsdk.IL.zx.bN
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.IL.bX.IL.yDt IL(android.util.JsonReader jsonReader, float f) throws java.io.IOException {
        if (jsonReader.peek() == android.util.JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        java.util.List<android.graphics.PointF> listBg = null;
        java.util.List<android.graphics.PointF> listBg2 = null;
        java.util.List<android.graphics.PointF> listBg3 = null;
        boolean zNextBoolean = false;
        while (true) {
            if (jsonReader.hasNext()) {
                java.lang.String strNextName = jsonReader.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "c":
                        zNextBoolean = jsonReader.nextBoolean();
                        break;
                    case "i":
                        listBg2 = com.bytedance.adsdk.IL.zx.Fy.bg(jsonReader, f);
                        break;
                    case "o":
                        listBg3 = com.bytedance.adsdk.IL.zx.Fy.bg(jsonReader, f);
                        break;
                    case "v":
                        listBg = com.bytedance.adsdk.IL.zx.Fy.bg(jsonReader, f);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            } else {
                jsonReader.endObject();
                if (jsonReader.peek() == android.util.JsonToken.END_ARRAY) {
                    jsonReader.endArray();
                }
                if (listBg == null || listBg2 == null || listBg3 == null) {
                    throw new java.lang.IllegalArgumentException("Shape data was missing information.");
                }
                if (listBg.isEmpty()) {
                    return new com.bytedance.adsdk.IL.bX.IL.yDt(new android.graphics.PointF(), false, java.util.Collections.emptyList());
                }
                int size = listBg.size();
                android.graphics.PointF pointF = listBg.get(0);
                java.util.ArrayList arrayList = new java.util.ArrayList(size);
                for (int i = 1; i < size; i++) {
                    android.graphics.PointF pointF2 = listBg.get(i);
                    int i2 = i - 1;
                    arrayList.add(new com.bytedance.adsdk.IL.bX.bg(com.bytedance.adsdk.IL.ldr.zx.bg(listBg.get(i2), listBg3.get(i2)), com.bytedance.adsdk.IL.ldr.zx.bg(pointF2, listBg2.get(i)), pointF2));
                }
                if (zNextBoolean) {
                    android.graphics.PointF pointF3 = listBg.get(0);
                    int i3 = size - 1;
                    arrayList.add(new com.bytedance.adsdk.IL.bX.bg(com.bytedance.adsdk.IL.ldr.zx.bg(listBg.get(i3), listBg3.get(i3)), com.bytedance.adsdk.IL.ldr.zx.bg(pointF3, listBg2.get(0)), pointF3));
                }
                return new com.bytedance.adsdk.IL.bX.IL.yDt(pointF, zNextBoolean, arrayList);
            }
        }
    }
}
