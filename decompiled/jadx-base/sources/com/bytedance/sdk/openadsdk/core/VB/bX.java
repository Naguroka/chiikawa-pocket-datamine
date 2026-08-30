package com.bytedance.sdk.openadsdk.core.VB;

/* JADX INFO: loaded from: classes4.dex */
public class bX {
    private static java.lang.String bg = "";

    public static boolean bg(int i) {
        return i == 10 || i == 9;
    }

    public static org.json.JSONObject bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str) {
        org.json.JSONObject jSONObjectZTq = tuv.ZTq();
        try {
            jSONObjectZTq.put("show_dislike", tuv.ZyO());
            jSONObjectZTq.put("language", com.bytedance.sdk.openadsdk.core.PX.bg());
            if ("open_ad".equals(str)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.lang.String strLdr = com.bytedance.sdk.openadsdk.core.WR.IL().ldr();
                int iIR = com.bytedance.sdk.openadsdk.core.WR.IL().iR();
                jSONObject.put("app_name", strLdr);
                jSONObject.put("app_icon_id", "@".concat(java.lang.String.valueOf(iIR)));
                jSONObjectZTq.put("open_app_info", jSONObject);
            }
            jSONObjectZTq.put(com.json.ce.y, com.json.y8.d);
            org.json.JSONArray jSONArrayBX = bX(tuv);
            if (jSONArrayBX != null) {
                jSONObjectZTq.put("dpa_data", jSONArrayBX);
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("UgenUtils", "parseUGenDataInfo exception", th.getMessage());
        }
        return jSONObjectZTq;
    }

    private static org.json.JSONArray bX(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        try {
            com.bytedance.sdk.openadsdk.core.model.tuV.bg bgVarLKE = tuv.LKE();
            if (bgVarLKE == null) {
                return null;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(bgVarLKE.VB());
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.putOpt("original_price", java.lang.Double.valueOf(jSONObject.optDouble("original_price", 0.0d)));
            jSONObject2.putOpt("price_unit", jSONObject.optString("price_unit"));
            jSONObject2.putOpt(com.google.firebase.analytics.FirebaseAnalytics.Param.DISCOUNT, java.lang.Double.valueOf(jSONObject.optDouble(com.google.firebase.analytics.FirebaseAnalytics.Param.DISCOUNT, 0.0d)));
            jSONObject2.putOpt("product_name", jSONObject.optString("dpa_product_name"));
            jSONObject2.putOpt("description", jSONObject.optString("dpa_description"));
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("dpa_images");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                jSONObject2.putOpt("image", jSONArrayOptJSONArray.get(0));
            }
            jSONObject2.putOpt("brand_name", jSONObject.optString("dpa_brand_name"));
            jSONObject2.putOpt("sale_price_i18n", java.lang.Integer.valueOf(jSONObject.optInt("sale_price_i18n")));
            jSONObject2.putOpt("real_price", java.lang.Double.valueOf(jSONObject.optDouble("real_price", 0.0d)));
            jSONObject2.put("button_text", tuv.zCS());
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            org.json.JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("dpa_related_products");
            if (jSONArrayOptJSONArray2 != null) {
                jSONArray.put(jSONObject2);
                for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                    try {
                        org.json.JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i);
                        jSONObject3.put("button_text", tuv.zCS());
                        jSONArray.put(jSONObject3);
                    } catch (java.lang.Throwable unused) {
                    }
                }
            }
            return jSONArray;
        } catch (java.lang.Throwable unused2) {
            return null;
        }
    }

    public static boolean bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return tuv != null && tuv.JAA() == 7;
    }

    public static java.lang.String bg() {
        return bg;
    }

    public static boolean IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return tuv != null && tuv.JAA() == 10;
    }

    public static org.json.JSONObject bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.openadsdk.core.VB.zx.bX bXVar) {
        org.json.JSONObject jSONObject;
        bXVar.bg("ad");
        java.lang.String strXxp = "";
        bg = "";
        org.json.JSONObject jSONObject2 = null;
        try {
            com.bytedance.sdk.openadsdk.core.model.tuV.bg bgVarLKE = tuv.LKE();
            if (bgVarLKE != null) {
                strXxp = bgVarLKE.xxp();
                if (android.text.TextUtils.isEmpty(strXxp) && !android.text.TextUtils.isEmpty(bgVarLKE.vb()) && !android.text.TextUtils.isEmpty(bgVarLKE.ldr())) {
                    strXxp = com.bytedance.sdk.openadsdk.core.VB.bg.IL.bg().bg("ad", bgVarLKE.ldr(), bgVarLKE.vb());
                }
            }
            if (!android.text.TextUtils.isEmpty(strXxp)) {
                try {
                    jSONObject = new org.json.JSONObject(strXxp);
                    try {
                        try {
                            bg = "getTemplate success";
                            bXVar.IL("local");
                            return jSONObject;
                        } catch (org.json.JSONException unused) {
                            java.lang.String strConcat = "parse json exception data is ".concat(java.lang.String.valueOf(strXxp));
                            bg = strConcat;
                            bXVar.bg(2, strConcat, "local");
                            return null;
                        }
                    } catch (java.lang.Throwable th) {
                        jSONObject2 = jSONObject;
                        th = th;
                        java.lang.String str = "get template error " + th.getMessage();
                        bg = str;
                        bXVar.bg(2, str, "local");
                        return jSONObject2;
                    }
                } catch (org.json.JSONException unused2) {
                    jSONObject = null;
                }
            } else {
                java.lang.String str2 = "local data is null id is " + bgVarLKE.ldr() + " md5 is " + bgVarLKE.vb();
                bg = str2;
                bXVar.bg(3, str2, "net");
                return null;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }
}
