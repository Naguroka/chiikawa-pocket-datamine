package com.bytedance.sdk.openadsdk.core.WR;

/* JADX INFO: loaded from: classes4.dex */
public class bX {
    private static boolean bg = false;

    public static void bg() {
        if (!bg && com.bytedance.sdk.openadsdk.core.VzQ.eqN().Pae()) {
            com.bytedance.sdk.openadsdk.core.WR.IL.IL();
            bg = com.bytedance.sdk.openadsdk.core.WR.IL.IL().bX();
        }
    }

    public static void bg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) && com.bytedance.sdk.openadsdk.core.VzQ.eqN().Pae()) {
            com.bytedance.sdk.openadsdk.core.WR.IL.IL().bg(str);
        }
    }

    public static void IL(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || !com.bytedance.sdk.openadsdk.core.VzQ.eqN().Pae()) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.WR.IL.IL().IL(str);
    }

    public static void IL() {
        if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().Pae()) {
            com.bytedance.sdk.openadsdk.core.WR.IL.IL().bg();
        }
    }

    public static void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str) {
        long jOptLong;
        long jOptLong2;
        long jOptLong3;
        java.lang.Object obj;
        if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().Pae()) {
            java.util.HashMap map = new java.util.HashMap();
            map.put("ad_sdk_version", com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME);
            map.put("au_show", str);
            if (tuv != null) {
                java.lang.String strWaE = tuv.waE();
                java.lang.String strOptString = "-1";
                if (!android.text.TextUtils.isEmpty(strWaE)) {
                    map.put("request_id", strWaE);
                } else {
                    map.put("request_id", "-1");
                }
                try {
                    long j = -1;
                    if (tuv.DCn() != null) {
                        jOptLong = tuv.DCn().optLong("ad_id", -1L);
                        jOptLong2 = tuv.DCn().optLong("rit", -1L);
                        jOptLong3 = tuv.DCn().optLong("ad_slot_type", -1L);
                        strOptString = tuv.DCn().optString("ad_type", "-1");
                    } else {
                        jOptLong = -1;
                        jOptLong2 = -1;
                        jOptLong3 = -1;
                    }
                    map.put("ad_id", java.lang.Long.valueOf(jOptLong));
                    map.put("rit", java.lang.Long.valueOf(jOptLong2));
                    map.put("ad_slot_type", java.lang.Long.valueOf(jOptLong3));
                    map.put("ad_type", strOptString);
                    java.util.Map<java.lang.String, java.lang.Object> mapJA = tuv.jA();
                    if (mapJA != null && (obj = mapJA.get(com.bytedance.sdk.openadsdk.TTAdConstant.SDK_BIDDING_TYPE)) != null) {
                        j = java.lang.Long.parseLong(obj.toString());
                    }
                    map.put(com.bytedance.sdk.openadsdk.TTAdConstant.SDK_BIDDING_TYPE, java.lang.Long.valueOf(j));
                    com.bytedance.sdk.openadsdk.core.WR.IL.IL().bg(com.pgl.ssdk.ces.out.PglSSManager.REPORT_SCENE_ADSHOW, map);
                } catch (java.lang.Throwable unused) {
                }
            }
        }
    }

    public static java.util.Map<java.lang.String, java.lang.String> bg(java.lang.String str, java.lang.String str2) {
        if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().Pae()) {
            return com.bytedance.sdk.openadsdk.core.WR.IL.IL().bg(str, str2 != null ? str2.getBytes() : new byte[0]);
        }
        return new java.util.HashMap();
    }

    public static java.lang.String bX() {
        return com.bytedance.sdk.openadsdk.core.VzQ.eqN().Pae() ? com.bytedance.sdk.openadsdk.core.WR.IL.IL().zx() : "";
    }

    public static long eqN() {
        if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().Pae()) {
            return com.bytedance.sdk.openadsdk.core.WR.IL.IL().ldr();
        }
        return 0L;
    }

    public static int zx() {
        if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().Pae()) {
            return com.bytedance.sdk.openadsdk.core.WR.IL.IL().iR();
        }
        return 6;
    }

    public static void bg(android.view.MotionEvent motionEvent) {
        if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().Pae()) {
            com.bytedance.sdk.openadsdk.core.WR.IL.IL().bg(motionEvent);
        }
    }

    public static void bg(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().Pae()) {
                bg();
                if (zx() == 0) {
                    jSONObject.put("sec_did", com.bytedance.sdk.openadsdk.core.WR.IL.IL().eqN());
                    java.lang.String strBg = com.bytedance.sdk.component.utils.zx.bg(jSONObject.toString());
                    java.util.Map<java.lang.String, java.lang.String> mapBg = com.bytedance.sdk.openadsdk.core.WR.IL.IL().bg("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", strBg != null ? strBg.getBytes() : new byte[0]);
                    if (mapBg != null && mapBg.size() > 0) {
                        for (java.lang.String str : mapBg.keySet()) {
                            jSONObject.put(str, mapBg.get(str));
                        }
                        jSONObject.put("url", "https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250");
                        jSONObject.put("pangle_m", strBg);
                    } else {
                        jSONObject.put("pglx", "8");
                    }
                    jSONObject.put("ec", com.bytedance.sdk.openadsdk.core.WR.IL.IL().ldr());
                    return;
                }
                jSONObject.put("pglx", java.lang.String.valueOf(zx()));
                return;
            }
            jSONObject.put("pglx", "6");
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("SecSdkHelperUtil", th.getMessage());
            try {
                jSONObject.put("pglx", com.json.Cdo.e);
            } catch (org.json.JSONException unused) {
            }
        }
    }

    public static java.lang.String ldr() {
        if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().Pae()) {
            return com.bytedance.sdk.openadsdk.core.WR.IL.IL().eqN();
        }
        return null;
    }
}
