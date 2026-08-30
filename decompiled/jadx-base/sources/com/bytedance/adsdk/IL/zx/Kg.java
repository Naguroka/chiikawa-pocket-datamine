package com.bytedance.adsdk.IL.zx;

/* JADX INFO: loaded from: classes3.dex */
class Kg {
    static com.bytedance.adsdk.IL.bX.IL.bX bg(android.util.JsonReader jsonReader, com.bytedance.adsdk.IL.iR iRVar) throws java.io.IOException {
        com.bytedance.adsdk.IL.bX.IL.bX bXVarBg;
        java.lang.String strNextString;
        jsonReader.beginObject();
        byte b = 2;
        int iNextInt = 2;
        while (true) {
            bXVarBg = null;
            if (!jsonReader.hasNext()) {
                strNextString = null;
                break;
            }
            java.lang.String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("d")) {
                iNextInt = jsonReader.nextInt();
            } else {
                if (strNextName.equals("ty")) {
                    strNextString = jsonReader.nextString();
                    break;
                }
                jsonReader.skipValue();
            }
        }
        if (strNextString == null) {
            return null;
        }
        strNextString.hashCode();
        switch (strNextString.hashCode()) {
            case 3239:
                b = !strNextString.equals("el") ? (byte) -1 : (byte) 0;
                break;
            case 3270:
                b = !strNextString.equals("fl") ? (byte) -1 : (byte) 1;
                break;
            case 3295:
                if (!strNextString.equals("gf")) {
                    b = -1;
                }
                break;
            case com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL /* 3307 */:
                b = !strNextString.equals("gr") ? (byte) -1 : (byte) 3;
                break;
            case com.json.mediationsdk.utils.IronSourceConstants.BN_INSTANCE_BOUND /* 3308 */:
                b = !strNextString.equals("gs") ? (byte) -1 : (byte) 4;
                break;
            case 3488:
                b = !strNextString.equals("mm") ? (byte) -1 : (byte) 5;
                break;
            case 3633:
                b = !strNextString.equals("rc") ? (byte) -1 : (byte) 6;
                break;
            case 3634:
                b = !strNextString.equals("rd") ? (byte) -1 : (byte) 7;
                break;
            case 3646:
                b = !strNextString.equals("rp") ? (byte) -1 : (byte) 8;
                break;
            case 3669:
                b = !strNextString.equals("sh") ? (byte) -1 : (byte) 9;
                break;
            case 3679:
                b = !strNextString.equals("sr") ? (byte) -1 : (byte) 10;
                break;
            case 3681:
                b = !strNextString.equals(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_STREAM_TYPE) ? (byte) -1 : (byte) 11;
                break;
            case 3705:
                b = !strNextString.equals("tm") ? (byte) -1 : (byte) 12;
                break;
            case 3710:
                b = !strNextString.equals("tr") ? (byte) -1 : (byte) 13;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                bXVarBg = com.bytedance.adsdk.IL.zx.ldr.bg(jsonReader, iRVar, iNextInt);
                break;
            case 1:
                bXVarBg = com.bytedance.adsdk.IL.zx.LKE.bg(jsonReader, iRVar);
                break;
            case 2:
                bXVarBg = com.bytedance.adsdk.IL.zx.xxp.bg(jsonReader, iRVar);
                break;
            case 3:
                bXVarBg = com.bytedance.adsdk.IL.zx.CQc.bg(jsonReader, iRVar);
                break;
            case 4:
                bXVarBg = com.bytedance.adsdk.IL.zx.VzQ.bg(jsonReader, iRVar);
                break;
            case 5:
                bXVarBg = com.bytedance.adsdk.IL.zx.Ja.bg(jsonReader);
                iRVar.bg("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                bXVarBg = com.bytedance.adsdk.IL.zx.VW.bg(jsonReader, iRVar);
                break;
            case 7:
                bXVarBg = com.bytedance.adsdk.IL.zx.daV.bg(jsonReader, iRVar);
                break;
            case 8:
                bXVarBg = com.bytedance.adsdk.IL.zx.VJ.bg(jsonReader, iRVar);
                break;
            case 9:
                bXVarBg = com.bytedance.adsdk.IL.zx.uu.bg(jsonReader, iRVar);
                break;
            case 10:
                bXVarBg = com.bytedance.adsdk.IL.zx.aGH.bg(jsonReader, iRVar, iNextInt);
                break;
            case 11:
                bXVarBg = com.bytedance.adsdk.IL.zx.qC.bg(jsonReader, iRVar);
                break;
            case 12:
                bXVarBg = com.bytedance.adsdk.IL.zx.Dxa.bg(jsonReader, iRVar);
                break;
            case 13:
                bXVarBg = com.bytedance.adsdk.IL.zx.bX.bg(jsonReader, iRVar);
                break;
        }
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return bXVarBg;
    }
}
