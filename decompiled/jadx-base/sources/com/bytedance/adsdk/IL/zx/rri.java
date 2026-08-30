package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
public class rri {
    public static com.bytedance.adsdk.IL.bX.bX.zx bg(com.bytedance.adsdk.IL.iR iRVar) {
        android.graphics.Rect rectEqN = iRVar.eqN();
        return new com.bytedance.adsdk.IL.bX.bX.zx(java.util.Collections.emptyList(), iRVar, "__container", -1L, com.bytedance.adsdk.IL.bX.bX.zx.bg.PRE_COMP, -1L, null, java.util.Collections.emptyList(), new com.bytedance.adsdk.IL.bX.bg.PX(), 0, 0, 0, 0.0f, 0.0f, rectEqN.width(), rectEqN.height(), null, null, java.util.Collections.emptyList(), com.bytedance.adsdk.IL.bX.bX.zx.IL.NONE, null, false, null, null);
    }

    public static com.bytedance.adsdk.IL.bX.bX.zx bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar) throws java.io.IOException {
        com.bytedance.adsdk.IL.bX.bX.zx.IL il = com.bytedance.adsdk.IL.bX.bX.zx.IL.NONE;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        jsonReader.beginObject();
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        java.lang.Float fValueOf2 = java.lang.Float.valueOf(1.0f);
        com.bytedance.adsdk.IL.bX.bX.zx.IL il2 = il;
        com.bytedance.adsdk.IL.bX.bX.zx.bg bgVar = null;
        java.lang.String strNextString = null;
        com.bytedance.adsdk.IL.bX.bg.PX pxBg = null;
        com.bytedance.adsdk.IL.bX.bg.eo eoVarLdr = null;
        com.bytedance.adsdk.IL.bX.bg.VB vbBg = null;
        com.bytedance.adsdk.IL.bX.bg.IL ilBg = null;
        com.bytedance.adsdk.IL.bX.IL.bg bgVarBg = null;
        com.bytedance.adsdk.IL.zx.eo eoVarBg = null;
        long jNextInt = 0;
        int iNextInt = 0;
        int iNextInt2 = 0;
        int color = 0;
        boolean zNextBoolean = false;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fIR = 0.0f;
        long jNextInt2 = -1;
        float fNextDouble4 = 1.0f;
        java.lang.String strNextString2 = "UNSET";
        java.lang.String strNextString3 = null;
        float fNextDouble5 = 0.0f;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "parent":
                    jNextInt2 = jsonReader.nextInt();
                    break;
                case "shapes":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.bytedance.adsdk.IL.bX.IL.bX bXVarBg = com.bytedance.adsdk.IL.zx.Kg.bg(jsonReader, iRVar);
                        if (bXVarBg != null) {
                            arrayList2.add(bXVarBg);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case "h":
                    fNextDouble3 = (float) (jsonReader.nextDouble() * ((double) com.bytedance.adsdk.IL.ldr.ldr.bg()));
                    break;
                case "t":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        java.lang.String strNextName2 = jsonReader.nextName();
                        strNextName2.hashCode();
                        if (strNextName2.equals(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY)) {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                vbBg = com.bytedance.adsdk.IL.zx.IL.bg(jsonReader, iRVar);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        } else if (strNextName2.equals("d")) {
                            eoVarLdr = com.bytedance.adsdk.IL.zx.eqN.ldr(jsonReader, iRVar);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case "w":
                    fNextDouble2 = (float) (jsonReader.nextDouble() * ((double) com.bytedance.adsdk.IL.ldr.ldr.bg()));
                    break;
                case "cl":
                    strNextString3 = jsonReader.nextString();
                    break;
                case "ef":
                    jsonReader.beginArray();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            java.lang.String strNextName3 = jsonReader.nextName();
                            strNextName3.hashCode();
                            if (strNextName3.equals("nm")) {
                                arrayList3.add(jsonReader.nextString());
                            } else if (strNextName3.equals("ty")) {
                                int iNextInt3 = jsonReader.nextInt();
                                if (iNextInt3 == 29) {
                                    bgVarBg = com.bytedance.adsdk.IL.zx.zx.bg(jsonReader, iRVar);
                                } else if (iNextInt3 == 25) {
                                    eoVarBg = new com.bytedance.adsdk.IL.zx.VB().bg(jsonReader, iRVar);
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    iRVar.bg("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(java.lang.String.valueOf(arrayList3)));
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ip":
                    fNextDouble5 = (float) jsonReader.nextDouble();
                    break;
                case "ks":
                    pxBg = com.bytedance.adsdk.IL.zx.bX.bg(jsonReader, iRVar);
                    break;
                case "nm":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "op":
                    fIR = (float) jsonReader.nextDouble();
                    break;
                case "sc":
                    color = android.graphics.Color.parseColor(jsonReader.nextString());
                    break;
                case "sh":
                    iNextInt2 = (int) (jsonReader.nextInt() * com.bytedance.adsdk.IL.ldr.ldr.bg());
                    break;
                case "sr":
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    break;
                case "st":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "sw":
                    iNextInt = (int) (jsonReader.nextInt() * com.bytedance.adsdk.IL.ldr.ldr.bg());
                    break;
                case "tm":
                    ilBg = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar, false);
                    break;
                case "tt":
                    int iNextInt4 = jsonReader.nextInt();
                    if (iNextInt4 >= com.bytedance.adsdk.IL.bX.bX.zx.IL.values().length) {
                        iRVar.bg("Unsupported matte type: ".concat(java.lang.String.valueOf(iNextInt4)));
                        break;
                    } else {
                        il2 = com.bytedance.adsdk.IL.bX.bX.zx.IL.values()[iNextInt4];
                        int i = com.bytedance.adsdk.IL.zx.rri.AnonymousClass1.bg[il2.ordinal()];
                        if (i == 1) {
                            iRVar.bg("Unsupported matte type: Luma");
                        } else if (i == 2) {
                            iRVar.bg("Unsupported matte type: Luma Inverted");
                        }
                        iRVar.bg(1);
                        break;
                    }
                    break;
                case "ty":
                    int iNextInt5 = jsonReader.nextInt();
                    if (iNextInt5 < com.bytedance.adsdk.IL.bX.bX.zx.bg.UNKNOWN.ordinal()) {
                        bgVar = com.bytedance.adsdk.IL.bX.bX.zx.bg.values()[iNextInt5];
                        break;
                    } else {
                        bgVar = com.bytedance.adsdk.IL.bX.bX.zx.bg.UNKNOWN;
                        break;
                    }
                    break;
                case "ind":
                    jNextInt = jsonReader.nextInt();
                    break;
                case "refId":
                    strNextString = jsonReader.nextString();
                    break;
                case "masksProperties":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(com.bytedance.adsdk.IL.zx.JAA.bg(jsonReader, iRVar));
                    }
                    iRVar.bg(arrayList.size());
                    jsonReader.endArray();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        if (fNextDouble5 > 0.0f) {
            arrayList4.add(new com.bytedance.adsdk.IL.iR.bg(iRVar, fValueOf, fValueOf, null, 0.0f, java.lang.Float.valueOf(fNextDouble5)));
        }
        if (fIR <= 0.0f) {
            fIR = iRVar.iR();
        }
        arrayList4.add(new com.bytedance.adsdk.IL.iR.bg(iRVar, fValueOf2, fValueOf2, null, fNextDouble5, java.lang.Float.valueOf(fIR)));
        arrayList4.add(new com.bytedance.adsdk.IL.iR.bg(iRVar, fValueOf, fValueOf, null, fIR, java.lang.Float.valueOf(Float.MAX_VALUE)));
        if (strNextString2.endsWith(".ai") || "ai".equals(strNextString3)) {
            iRVar.bg("Convert your Illustrator layers to shape layers.");
        }
        return new com.bytedance.adsdk.IL.bX.bX.zx(arrayList2, iRVar, strNextString2, jNextInt, bgVar, jNextInt2, strNextString, arrayList, pxBg, iNextInt, iNextInt2, color, fNextDouble4, fNextDouble, fNextDouble2, fNextDouble3, eoVarLdr, vbBg, arrayList4, il2, ilBg, zNextBoolean, bgVarBg, eoVarBg);
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.IL.zx.rri$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] bg;

        static {
            int[] iArr = new int[com.bytedance.adsdk.IL.bX.bX.zx.IL.values().length];
            bg = iArr;
            try {
                iArr[com.bytedance.adsdk.IL.bX.bX.zx.IL.LUMA.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                bg[com.bytedance.adsdk.IL.bX.bX.zx.IL.LUMA_INVERTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }
}
