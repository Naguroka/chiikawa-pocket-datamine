package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
public class kMt {
    public static com.bytedance.adsdk.IL.iR bg(android.util.JsonReader jsonReader) throws java.io.IOException {
        int i;
        byte b;
        float fBg = com.bytedance.adsdk.IL.ldr.ldr.bg();
        android.util.LongSparseArray<com.bytedance.adsdk.IL.bX.bX.zx> longSparseArray = new android.util.LongSparseArray<>();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        java.util.HashMap map3 = new java.util.HashMap();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        android.util.SparseArray<com.bytedance.adsdk.IL.bX.eqN> sparseArray = new android.util.SparseArray<>();
        com.bytedance.adsdk.IL.iR.bX bXVar = new com.bytedance.adsdk.IL.iR.bX();
        com.bytedance.adsdk.IL.iR.bg bgVar = new com.bytedance.adsdk.IL.iR.bg();
        com.bytedance.adsdk.IL.iR.IL il = new com.bytedance.adsdk.IL.iR.IL();
        com.bytedance.adsdk.IL.iR iRVar = new com.bytedance.adsdk.IL.iR();
        jsonReader.beginObject();
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        java.lang.String strNextString = null;
        int iNextInt = 0;
        int iNextInt2 = 0;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            byte b2 = -1;
            switch (strNextName.hashCode()) {
                case -1408207997:
                    i = iNextInt2;
                    if (strNextName.equals("assets")) {
                        b2 = 0;
                    }
                    break;
                case -1109732030:
                    i = iNextInt2;
                    if (strNextName.equals("layers")) {
                        b2 = 1;
                    }
                    break;
                case -865448777:
                    i = iNextInt2;
                    if (strNextName.equals("globalEvent")) {
                        b2 = 2;
                    }
                    break;
                case 104:
                    i = iNextInt2;
                    if (strNextName.equals(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS)) {
                        b = 3;
                        b2 = b;
                    }
                    break;
                case 118:
                    i = iNextInt2;
                    if (strNextName.equals("v")) {
                        b = 4;
                        b2 = b;
                    }
                    break;
                case 119:
                    i = iNextInt2;
                    if (strNextName.equals("w")) {
                        b = 5;
                        b2 = b;
                    }
                    break;
                case 3208:
                    i = iNextInt2;
                    if (strNextName.equals(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_DEADLINE)) {
                        b = 6;
                        b2 = b;
                    }
                    break;
                case 3276:
                    i = iNextInt2;
                    if (strNextName.equals("fr")) {
                        b = 7;
                        b2 = b;
                    }
                    break;
                case 3292:
                    i = iNextInt2;
                    if (strNextName.equals("gc")) {
                        b = 8;
                        b2 = b;
                    }
                    break;
                case 3367:
                    i = iNextInt2;
                    if (strNextName.equals("ip")) {
                        b = 9;
                        b2 = b;
                    }
                    break;
                case 3553:
                    i = iNextInt2;
                    if (strNextName.equals("op")) {
                        b = 10;
                        b2 = b;
                    }
                    break;
                case 94623709:
                    i = iNextInt2;
                    if (strNextName.equals("chars")) {
                        b = 11;
                        b2 = b;
                    }
                    break;
                case 97615364:
                    i = iNextInt2;
                    if (strNextName.equals("fonts")) {
                        b = 12;
                        b2 = b;
                    }
                    break;
                case 110364485:
                    i = iNextInt2;
                    if (strNextName.equals("timer")) {
                        b = 13;
                        b2 = b;
                    }
                    break;
                case 839250809:
                    i = iNextInt2;
                    if (strNextName.equals("markers")) {
                        b = 14;
                        b2 = b;
                    }
                    break;
                default:
                    i = iNextInt2;
                    break;
            }
            switch (b2) {
                case 0:
                    bg(jsonReader, iRVar, map, map2);
                    break;
                case 1:
                    bg(jsonReader, iRVar, arrayList, longSparseArray);
                    break;
                case 2:
                    bg(jsonReader, il);
                    break;
                case 3:
                    iNextInt2 = jsonReader.nextInt();
                    continue;
                case 4:
                    java.lang.String[] strArrSplit = jsonReader.nextString().split("\\.");
                    if (!com.bytedance.adsdk.IL.ldr.ldr.bg(java.lang.Integer.parseInt(strArrSplit[0]), java.lang.Integer.parseInt(strArrSplit[1]), java.lang.Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        iRVar.bg("Lottie only supports bodymovin >= 4.4.0");
                    }
                    break;
                case 5:
                    iNextInt = jsonReader.nextInt();
                    break;
                case 6:
                    strNextString = jsonReader.nextString();
                    break;
                case 7:
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    break;
                case 8:
                    bg(jsonReader, bgVar);
                    break;
                case 9:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 10:
                    fNextDouble2 = ((float) jsonReader.nextDouble()) - 0.01f;
                    break;
                case 11:
                    bg(jsonReader, iRVar, sparseArray);
                    break;
                case 12:
                    bg(jsonReader, map3);
                    break;
                case 13:
                    bg(jsonReader, bXVar);
                    break;
                case 14:
                    bg(jsonReader, arrayList2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
            iNextInt2 = i;
        }
        jsonReader.endObject();
        iRVar.bg(new android.graphics.Rect(0, 0, (int) (iNextInt * fBg), (int) (iNextInt2 * fBg)), fNextDouble, fNextDouble2, fNextDouble3, arrayList, longSparseArray, map, map2, sparseArray, map3, arrayList2, bXVar, strNextString, bgVar, il);
        return iRVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    private static void bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR.IL il) {
        byte b;
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                java.lang.String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3239) {
                    if (iHashCode == 3237004 && strNextName.equals("inel")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                } else if (strNextName.equals("el")) {
                    b = 1;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    il.IL = new int[][]{new int[]{-1, -1}};
                    jsonReader.beginArray();
                    if (jsonReader.hasNext()) {
                        jsonReader.beginArray();
                        for (int i = 0; i < 2; i++) {
                            if (jsonReader.hasNext()) {
                                il.IL[0][i] = jsonReader.nextInt();
                            }
                        }
                        jsonReader.endArray();
                    }
                    jsonReader.endArray();
                } else if (b == 1) {
                    il.bg = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    private static void bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR.bg bgVar) {
        byte b;
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                java.lang.String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3139) {
                    if (iHashCode != 3232) {
                        if (iHashCode == 3666 && strNextName.equals("se")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                    } else if (strNextName.equals("ee")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (strNextName.equals("be")) {
                    b = 1;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    bgVar.bg = jsonReader.nextInt();
                } else if (b == 1) {
                    bgVar.IL = IL(jsonReader);
                } else if (b == 2) {
                    bgVar.bX = IL(jsonReader);
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (java.lang.Exception unused) {
        }
    }

    private static java.util.Map<java.lang.String, java.lang.Object> IL(android.util.JsonReader jsonReader) throws java.io.IOException {
        java.util.HashMap map = new java.util.HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("lottie_back")) {
                java.util.HashMap map2 = new java.util.HashMap();
                map.put("lottie_back", map2);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    java.lang.String strNextName2 = jsonReader.nextName();
                    strNextName2.hashCode();
                    if (strNextName2.equals("hd")) {
                        map2.put("hd", java.lang.Integer.valueOf(jsonReader.nextInt()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    private static void bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR.bX bXVar) {
        byte b;
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                java.lang.String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3123) {
                    if (iHashCode != 3239) {
                        if (iHashCode != 3355) {
                            if (iHashCode != 3418) {
                                if (iHashCode != 3704) {
                                    if (iHashCode == 3237004 && strNextName.equals("inel")) {
                                        b = 4;
                                    } else {
                                        b = -1;
                                    }
                                } else if (strNextName.equals("tl")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                            } else if (strNextName.equals("ke")) {
                                b = 0;
                            } else {
                                b = -1;
                            }
                        } else if (strNextName.equals("id")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                    } else if (strNextName.equals("el")) {
                        b = 5;
                    } else {
                        b = -1;
                    }
                } else if (strNextName.equals("at")) {
                    b = 3;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    bXVar.bg = jsonReader.nextInt();
                } else if (b == 1) {
                    bXVar.IL = jsonReader.nextString();
                } else if (b == 2) {
                    bXVar.bX = jsonReader.nextString();
                } else if (b == 3) {
                    bXVar.eqN = jsonReader.nextString();
                } else if (b == 4) {
                    bXVar.zx = new int[]{-1, -1};
                    jsonReader.beginArray();
                    for (int i = 0; i < 2; i++) {
                        if (jsonReader.hasNext()) {
                            bXVar.zx[i] = jsonReader.nextInt();
                        }
                    }
                    jsonReader.endArray();
                } else if (b == 5) {
                    bXVar.ldr = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (java.lang.Exception unused) {
        }
    }

    private static void bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar, java.util.List<com.bytedance.adsdk.IL.bX.bX.zx> list, android.util.LongSparseArray<com.bytedance.adsdk.IL.bX.bX.zx> longSparseArray) throws java.io.IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.IL.bX.bX.zx zxVarBg = com.bytedance.adsdk.IL.zx.rri.bg(jsonReader, iRVar);
            zxVarBg.VB();
            com.bytedance.adsdk.IL.bX.bX.zx.bg bgVar = com.bytedance.adsdk.IL.bX.bX.zx.bg.IMAGE;
            list.add(zxVarBg);
            longSparseArray.put(zxVarBg.zx(), zxVarBg);
        }
        jsonReader.endArray();
    }

    private static void bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar, java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.IL.bX.bX.zx>> map, java.util.Map<java.lang.String, com.bytedance.adsdk.IL.eo> map2) throws java.io.IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.util.LongSparseArray longSparseArray = new android.util.LongSparseArray();
            jsonReader.beginObject();
            java.lang.String strNextString = null;
            java.lang.String strNextString2 = null;
            java.lang.String strNextString3 = null;
            java.lang.String strNextString4 = null;
            java.util.List<com.bytedance.adsdk.IL.eo.bg> listBX = null;
            java.lang.String strNextString5 = null;
            int[][] iArr = null;
            int iNextInt = 0;
            int iNextInt2 = 0;
            while (jsonReader.hasNext()) {
                java.lang.String strNextName = jsonReader.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "layers":
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            com.bytedance.adsdk.IL.bX.bX.zx zxVarBg = com.bytedance.adsdk.IL.zx.rri.bg(jsonReader, iRVar);
                            longSparseArray.put(zxVarBg.zx(), zxVarBg);
                            arrayList.add(zxVarBg);
                        }
                        jsonReader.endArray();
                        break;
                    case "h":
                        iNextInt2 = jsonReader.nextInt();
                        break;
                    case "p":
                        strNextString2 = jsonReader.nextString();
                        break;
                    case "u":
                        strNextString3 = jsonReader.nextString();
                        break;
                    case "w":
                        iNextInt = jsonReader.nextInt();
                        break;
                    case "el":
                        strNextString5 = jsonReader.nextString();
                        break;
                    case "id":
                        strNextString = jsonReader.nextString();
                        break;
                    case "tc":
                        jsonReader.beginArray();
                        listBX = bX(jsonReader);
                        jsonReader.endArray();
                        break;
                    case "rel":
                        strNextString4 = jsonReader.nextString();
                        break;
                    case "inel":
                        iArr = new int[][]{new int[]{-1, -1}};
                        jsonReader.beginArray();
                        if (jsonReader.hasNext()) {
                            jsonReader.beginArray();
                            for (int i = 0; i < 2; i++) {
                                if (jsonReader.hasNext()) {
                                    iArr[0][i] = jsonReader.nextInt();
                                }
                            }
                            jsonReader.endArray();
                        }
                        jsonReader.endArray();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            if (strNextString2 != null) {
                com.bytedance.adsdk.IL.eo eoVar = new com.bytedance.adsdk.IL.eo(iNextInt, iNextInt2, strNextString, strNextString2, strNextString3, strNextString4, listBX, strNextString5, iArr);
                map2.put(eoVar.iR(), eoVar);
            } else {
                map.put(strNextString, arrayList);
            }
        }
        jsonReader.endArray();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    private static java.util.List<com.bytedance.adsdk.IL.eo.bg> bX(android.util.JsonReader jsonReader) {
        byte b;
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (jsonReader.hasNext()) {
                com.bytedance.adsdk.IL.eo.bg bgVar = new com.bytedance.adsdk.IL.eo.bg();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    java.lang.String strNextName = jsonReader.nextName();
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != 99) {
                        if (iHashCode != 102) {
                            if (iHashCode != 108) {
                                if (iHashCode != 115) {
                                    if (iHashCode != 3153) {
                                        if (iHashCode == 3449 && strNextName.equals("le")) {
                                            b = 1;
                                        } else {
                                            b = -1;
                                        }
                                    } else if (strNextName.equals(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_BUFFER_STARVATION)) {
                                        b = 5;
                                    } else {
                                        b = -1;
                                    }
                                } else if (strNextName.equals(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS)) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                            } else if (strNextName.equals(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE)) {
                                b = 0;
                            } else {
                                b = -1;
                            }
                        } else if (strNextName.equals("f")) {
                            b = 4;
                        } else {
                            b = -1;
                        }
                    } else if (strNextName.equals("c")) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        bgVar.bg = jsonReader.nextInt();
                    } else if (b == 1) {
                        bgVar.IL = jsonReader.nextInt();
                    } else if (b == 2) {
                        bgVar.zx = jsonReader.nextInt();
                    } else if (b == 3) {
                        bgVar.bX = jsonReader.nextString();
                    } else if (b == 4) {
                        bgVar.eqN = jsonReader.nextString();
                    } else if (b == 5) {
                        bgVar.ldr = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                arrayList.add(bgVar);
            }
            return arrayList;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private static void bg(android.util.JsonReader jsonReader, java.util.Map<java.lang.String, com.bytedance.adsdk.IL.bX.bX> map) throws java.io.IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("list")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.IL.bX.bX bXVarBg = com.bytedance.adsdk.IL.zx.yDt.bg(jsonReader);
                    map.put(bXVarBg.IL(), bXVarBg);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    private static void bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar, android.util.SparseArray<com.bytedance.adsdk.IL.bX.eqN> sparseArray) throws java.io.IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.IL.bX.eqN eqnBg = com.bytedance.adsdk.IL.zx.Ta.bg(jsonReader, iRVar);
            sparseArray.put(eqnBg.hashCode(), eqnBg);
        }
        jsonReader.endArray();
    }

    private static void bg(android.util.JsonReader jsonReader, java.util.List<com.bytedance.adsdk.IL.bX.ldr> list) throws java.io.IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            float fNextDouble = 0.0f;
            java.lang.String strNextString = null;
            float fNextDouble2 = 0.0f;
            while (jsonReader.hasNext()) {
                java.lang.String strNextName = jsonReader.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "cm":
                        strNextString = jsonReader.nextString();
                        break;
                    case "dr":
                        fNextDouble2 = (float) jsonReader.nextDouble();
                        break;
                    case "tm":
                        fNextDouble = (float) jsonReader.nextDouble();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            list.add(new com.bytedance.adsdk.IL.bX.ldr(strNextString, fNextDouble, fNextDouble2));
        }
        jsonReader.endArray();
    }
}
