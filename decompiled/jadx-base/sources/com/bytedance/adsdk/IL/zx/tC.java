package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
class tC {
    static <T> java.util.List<com.bytedance.adsdk.IL.iR.bg<T>> bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar, float f, com.bytedance.adsdk.IL.zx.bN<T> bNVar, boolean z) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jsonReader.peek() == android.util.JsonToken.STRING) {
            iRVar.bg("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("k")) {
                if (jsonReader.peek() == android.util.JsonToken.BEGIN_ARRAY) {
                    jsonReader.beginArray();
                    if (jsonReader.peek() == android.util.JsonToken.NUMBER) {
                        arrayList.add(com.bytedance.adsdk.IL.zx.LZ.bg(jsonReader, iRVar, f, bNVar, false, z));
                    } else {
                        while (jsonReader.hasNext()) {
                            arrayList.add(com.bytedance.adsdk.IL.zx.LZ.bg(jsonReader, iRVar, f, bNVar, true, z));
                        }
                    }
                    jsonReader.endArray();
                } else {
                    arrayList.add(com.bytedance.adsdk.IL.zx.LZ.bg(jsonReader, iRVar, f, bNVar, false, z));
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        bg(arrayList);
        return arrayList;
    }

    public static <T> void bg(java.util.List<? extends com.bytedance.adsdk.IL.iR.bg<T>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            com.bytedance.adsdk.IL.iR.bg<T> bgVar = list.get(i2);
            i2++;
            com.bytedance.adsdk.IL.iR.bg<T> bgVar2 = list.get(i2);
            bgVar.iR = java.lang.Float.valueOf(bgVar2.ldr);
            if (bgVar.IL == null && bgVar2.bg != null) {
                bgVar.IL = bgVar2.bg;
                if (bgVar instanceof com.bytedance.adsdk.IL.bg.IL.WR) {
                    ((com.bytedance.adsdk.IL.bg.IL.WR) bgVar).bg();
                }
            }
        }
        com.bytedance.adsdk.IL.iR.bg<T> bgVar3 = list.get(i);
        if ((bgVar3.bg == null || bgVar3.IL == null) && list.size() > 1) {
            list.remove(bgVar3);
        }
    }
}
