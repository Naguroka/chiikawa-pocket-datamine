package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
public class bX {
    public static com.bytedance.adsdk.IL.bX.bg.PX bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar) throws java.io.IOException {
        boolean z = jsonReader.peek() == android.util.JsonToken.BEGIN_OBJECT;
        if (z) {
            jsonReader.beginObject();
        }
        com.bytedance.adsdk.IL.bX.bg.IL il = null;
        com.bytedance.adsdk.IL.bX.bg.zx zxVarBg = null;
        com.bytedance.adsdk.IL.bX.bg.Ta<android.graphics.PointF, android.graphics.PointF> taIL = null;
        com.bytedance.adsdk.IL.bX.bg.iR iRVarEqN = null;
        com.bytedance.adsdk.IL.bX.bg.IL ilBg = null;
        com.bytedance.adsdk.IL.bX.bg.IL ilBg2 = null;
        com.bytedance.adsdk.IL.bX.bg.eqN eqnIL = null;
        com.bytedance.adsdk.IL.bX.bg.IL ilBg3 = null;
        com.bytedance.adsdk.IL.bX.bg.IL ilBg4 = null;
        while (jsonReader.hasNext()) {
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "a":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        java.lang.String strNextName2 = jsonReader.nextName();
                        strNextName2.hashCode();
                        if (strNextName2.equals("k")) {
                            zxVarBg = com.bytedance.adsdk.IL.zx.bg.bg(jsonReader, iRVar);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    continue;
                    break;
                case "o":
                    eqnIL = com.bytedance.adsdk.IL.zx.eqN.IL(jsonReader, iRVar);
                    continue;
                    break;
                case "p":
                    taIL = com.bytedance.adsdk.IL.zx.bg.IL(jsonReader, iRVar);
                    continue;
                    break;
                case "r":
                    break;
                case "s":
                    iRVarEqN = com.bytedance.adsdk.IL.zx.eqN.eqN(jsonReader, iRVar);
                    continue;
                    break;
                case "eo":
                    ilBg4 = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar, false);
                    continue;
                    break;
                case "rz":
                    iRVar.bg("Lottie doesn't support 3D layers.");
                    break;
                case "sa":
                    ilBg2 = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar, false);
                    continue;
                    break;
                case "sk":
                    ilBg = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar, false);
                    continue;
                    break;
                case "so":
                    ilBg3 = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar, false);
                    continue;
                    break;
                default:
                    jsonReader.skipValue();
                    continue;
                    break;
            }
            com.bytedance.adsdk.IL.bX.bg.IL ilBg5 = com.bytedance.adsdk.IL.zx.eqN.bg(jsonReader, iRVar, false);
            if (ilBg5.bX().isEmpty()) {
                ilBg5.bX().add(new com.bytedance.adsdk.IL.iR.bg(iRVar, java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), null, 0.0f, java.lang.Float.valueOf(iRVar.iR())));
            } else if (((com.bytedance.adsdk.IL.iR.bg) ilBg5.bX().get(0)).bg == 0) {
                ilBg5.bX().set(0, new com.bytedance.adsdk.IL.iR.bg(iRVar, java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), null, 0.0f, java.lang.Float.valueOf(iRVar.iR())));
            }
            il = ilBg5;
        }
        if (z) {
            jsonReader.endObject();
        }
        if (bg(zxVarBg)) {
            zxVarBg = null;
        }
        return new com.bytedance.adsdk.IL.bX.bg.PX(zxVarBg, bg(taIL) ? null : taIL, bg(iRVarEqN) ? null : iRVarEqN, bg(il) ? null : il, eqnIL, ilBg3, ilBg4, IL(ilBg) ? null : ilBg, bX(ilBg2) ? null : ilBg2);
    }

    private static boolean bg(com.bytedance.adsdk.IL.bX.bg.zx zxVar) {
        if (zxVar != null) {
            return zxVar.IL() && zxVar.bX().get(0).bg.equals(0.0f, 0.0f);
        }
        return true;
    }

    private static boolean bg(com.bytedance.adsdk.IL.bX.bg.Ta<android.graphics.PointF, android.graphics.PointF> ta) {
        if (ta != null) {
            return !(ta instanceof com.bytedance.adsdk.IL.bX.bg.WR) && ta.IL() && ta.bX().get(0).bg.equals(0.0f, 0.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean bg(com.bytedance.adsdk.IL.bX.bg.IL il) {
        if (il != null) {
            return il.IL() && ((java.lang.Float) ((com.bytedance.adsdk.IL.iR.bg) il.bX().get(0)).bg).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean bg(com.bytedance.adsdk.IL.bX.bg.iR iRVar) {
        if (iRVar != null) {
            return iRVar.IL() && ((com.bytedance.adsdk.IL.iR.bX) ((com.bytedance.adsdk.IL.iR.bg) iRVar.bX().get(0)).bg).IL(1.0f, 1.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean IL(com.bytedance.adsdk.IL.bX.bg.IL il) {
        if (il != null) {
            return il.IL() && ((java.lang.Float) ((com.bytedance.adsdk.IL.iR.bg) il.bX().get(0)).bg).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean bX(com.bytedance.adsdk.IL.bX.bg.IL il) {
        if (il != null) {
            return il.IL() && ((java.lang.Float) ((com.bytedance.adsdk.IL.iR.bg) il.bX().get(0)).bg).floatValue() == 0.0f;
        }
        return true;
    }
}
