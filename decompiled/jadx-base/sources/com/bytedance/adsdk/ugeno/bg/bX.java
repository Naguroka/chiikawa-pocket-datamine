package com.bytedance.adsdk.ugeno.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bX {
    public static int bg(int i) {
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return 1;
        }
        return i - 1;
    }

    public static com.bytedance.adsdk.ugeno.bg.IL bg(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.adsdk.ugeno.bg.IL il = new com.bytedance.adsdk.ugeno.bg.IL();
        il.IL(jSONObject.optLong("delay"));
        il.bg(jSONObject.optLong("duration"));
        il.bg(jSONObject.optInt("playCount", 1));
        il.bg(jSONObject.optString("playDirection"));
        il.IL(jSONObject.optString("transformOrigin"));
        il.bX(jSONObject.optString("timingFunction", "linear"));
        il.bg(jSONObject.optJSONObject("effect"));
        il.bg(bg(jSONObject.optJSONArray("keyframes")));
        return il;
    }

    public static java.util.Map<java.lang.String, java.util.TreeMap<java.lang.Float, java.lang.String>> bg(org.json.JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        java.util.HashMap map = new java.util.HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                float fOptDouble = (float) jSONObjectOptJSONObject.optDouble(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET);
                java.util.Iterator<java.lang.String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    java.lang.String next = itKeys.next();
                    java.util.TreeMap treeMap = (java.util.TreeMap) map.get(next);
                    if (!android.text.TextUtils.equals(next, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET)) {
                        if (map.containsKey(next) && treeMap != null) {
                            treeMap.put(java.lang.Float.valueOf(fOptDouble), jSONObjectOptJSONObject.optString(next));
                        } else {
                            java.util.TreeMap treeMap2 = new java.util.TreeMap();
                            new android.util.Pair(java.lang.Float.valueOf(fOptDouble), jSONObjectOptJSONObject.optString(next));
                            treeMap2.put(java.lang.Float.valueOf(fOptDouble), jSONObjectOptJSONObject.optString(next));
                            map.put(next, treeMap2);
                        }
                    }
                }
            }
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    public static int bg(java.lang.String str) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != -1408024454) {
            if (iHashCode == -1039745817 && str.equals(com.adjust.sdk.Constants.NORMAL)) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals("alternate")) {
            b = 0;
        } else {
            b = -1;
        }
        return b != 0 ? 1 : 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    public static android.view.animation.Interpolator IL(java.lang.String str) {
        byte b;
        switch (str) {
            case "ease_in":
                b = 0;
                break;
            case "linear":
                b = 3;
                break;
            case "ease_out":
                b = 2;
                break;
            case "ease_in_out":
                b = 1;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return new android.view.animation.AccelerateInterpolator();
        }
        if (b == 1) {
            return new android.view.animation.AccelerateDecelerateInterpolator();
        }
        if (b == 2) {
            return new android.view.animation.DecelerateInterpolator();
        }
        return new android.view.animation.LinearInterpolator();
    }

    public static float[] bX(java.lang.String str) {
        float[] fArr = {0.0f, 0.0f};
        org.json.JSONArray jSONArrayBg = com.bytedance.adsdk.ugeno.iR.IL.bg(str, (org.json.JSONArray) null);
        if (jSONArrayBg != null && jSONArrayBg.length() == 2) {
            fArr[0] = (float) jSONArrayBg.optDouble(0);
            fArr[1] = (float) jSONArrayBg.optDouble(1);
        }
        return fArr;
    }
}
