package com.bytedance.sdk.component.adexpress.dynamic.zx;

/* JADX INFO: loaded from: classes3.dex */
public class ldr {
    private static java.util.HashMap<java.lang.String, java.lang.String> iR;
    private org.json.JSONObject IL;
    private com.bytedance.sdk.component.adexpress.dynamic.eqN.bX bX;
    private org.json.JSONObject bg;
    private com.bytedance.sdk.component.adexpress.dynamic.zx.ldr.bg eqN;
    private com.bytedance.sdk.component.adexpress.dynamic.eqN.eqN ldr;
    private com.bytedance.sdk.component.adexpress.dynamic.zx.bX zx;

    static {
        java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
        iR = map;
        map.put("subtitle", "description");
        iR.put("source", "source|app.app_name");
        iR.put("screenshot", "dynamic_creative.screenshot");
    }

    public ldr(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, org.json.JSONObject jSONObject4) {
        this.bg = jSONObject;
        this.IL = jSONObject2;
        this.bX = new com.bytedance.sdk.component.adexpress.dynamic.eqN.bX(jSONObject2);
        this.eqN = com.bytedance.sdk.component.adexpress.dynamic.zx.ldr.bg.bg(jSONObject3);
        this.ldr = com.bytedance.sdk.component.adexpress.dynamic.eqN.eqN.bg(jSONObject4);
    }

    public com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg bg(double d, int i, double d2, java.lang.String str, com.bytedance.sdk.component.adexpress.IL.Ta ta) {
        org.json.JSONObject jSONObject;
        this.bX.bg();
        try {
            jSONObject = new org.json.JSONObject(this.ldr.IL);
        } catch (org.json.JSONException unused) {
            jSONObject = null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kgBg = bg(com.bytedance.sdk.component.adexpress.dynamic.zx.eqN.bg(this.bg, jSONObject), (com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg) null);
        bg(kgBg);
        com.bytedance.sdk.component.adexpress.dynamic.zx.zx zxVar = new com.bytedance.sdk.component.adexpress.dynamic.zx.zx(d, i, d2, str, ta);
        com.bytedance.sdk.component.adexpress.dynamic.zx.zx.bg bgVar = new com.bytedance.sdk.component.adexpress.dynamic.zx.zx.bg();
        bgVar.bg = this.eqN.bg;
        bgVar.IL = this.eqN.IL;
        bgVar.bX = 0.0f;
        zxVar.bg(bgVar);
        zxVar.bg(kgBg, 0.0f, 0.0f);
        zxVar.bg();
        if (zxVar.bg.eqN == 65536.0f) {
            return null;
        }
        return zxVar.bg.ldr;
    }

    private void bg(com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        int iBg;
        if (kg == null) {
            return;
        }
        if (com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX() != null) {
            iBg = com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX().Lq();
        } else {
            iBg = com.bytedance.sdk.component.adexpress.eqN.Kg.bg(com.bytedance.sdk.component.adexpress.eqN.bg());
        }
        float fMin = this.eqN.bX ? this.eqN.bg : java.lang.Math.min(this.eqN.bg, com.bytedance.sdk.component.adexpress.eqN.Kg.IL(com.bytedance.sdk.component.adexpress.eqN.bg(), iBg));
        if (this.eqN.IL == 0.0f) {
            kg.zx(fMin);
            kg.eo().zx().eo("auto");
            kg.ldr(0.0f);
        } else {
            kg.zx(fMin);
            kg.ldr(this.eqN.bX ? this.eqN.IL : java.lang.Math.min(this.eqN.IL, com.bytedance.sdk.component.adexpress.eqN.Kg.IL(com.bytedance.sdk.component.adexpress.eqN.bg(), com.bytedance.sdk.component.adexpress.eqN.Kg.IL(com.bytedance.sdk.component.adexpress.eqN.bg()))));
            kg.eo().zx().eo("fixed");
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg bg(org.json.JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        int length;
        if (jSONObject == null) {
            return null;
        }
        java.lang.String strOptString = jSONObject.optString("type");
        if (android.text.TextUtils.equals(strOptString, "custom-component-vessel")) {
            int iOptInt = jSONObject.optInt("componentId");
            if (this.ldr != null) {
                com.bytedance.sdk.component.adexpress.dynamic.zx.bX bXVar = new com.bytedance.sdk.component.adexpress.dynamic.zx.bX();
                this.zx = bXVar;
                org.json.JSONObject jSONObjectBg = bXVar.bg(this.ldr.bg, iOptInt, jSONObject);
                if (jSONObjectBg != null) {
                    jSONObject = jSONObjectBg;
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kgBg = bg(jSONObject);
        kgBg.bg(kg);
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray == null) {
            kgBg.bg((java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg>) null);
            return kgBg;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            org.json.JSONArray jSONArrayOptJSONArray2 = jSONArrayOptJSONArray.optJSONArray(i);
            if (jSONArrayOptJSONArray2 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                if (android.text.TextUtils.equals(strOptString, "tag-group")) {
                    length = kgBg.eo().zx().Dt();
                } else {
                    length = jSONArrayOptJSONArray2.length();
                }
                for (int i2 = 0; i2 < length; i2++) {
                    com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kgBg2 = bg(jSONArrayOptJSONArray2.optJSONObject(i2), kgBg);
                    if (com.bytedance.sdk.component.adexpress.eqN.IL() && "skip-with-time".equals(kgBg.eo().IL()) && !com.ironsource.y8.h.T.equals(kgBg.rri()) && !android.text.TextUtils.isEmpty(kgBg.rri())) {
                        kgBg2.bX(kgBg.rri());
                    }
                    arrayList.add(kgBg2);
                    arrayList3.add(kgBg2);
                }
                arrayList2.add(arrayList3);
            }
        }
        if (arrayList.size() > 0) {
            kgBg.bg(arrayList);
        }
        if (arrayList2.size() > 0) {
            kgBg.IL(arrayList2);
        }
        return kgBg;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg bg(org.json.JSONObject jSONObject) {
        java.lang.String strBg;
        org.json.JSONObject jSONObject2;
        java.lang.String strOptString = jSONObject.optString("type");
        java.lang.String strOptString2 = jSONObject.optString("id");
        org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("values");
        com.bytedance.sdk.component.adexpress.dynamic.zx.WR.bg(strOptString, jSONObjectOptJSONObject);
        org.json.JSONObject jSONObjectBg = com.bytedance.sdk.component.adexpress.dynamic.zx.WR.bg(strOptString, com.bytedance.sdk.component.adexpress.dynamic.zx.WR.bg(jSONObject.optJSONArray("sceneValues")), jSONObjectOptJSONObject);
        com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg = new com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg();
        if (android.text.TextUtils.isEmpty(strOptString2)) {
            kg.IL(java.lang.String.valueOf(kg.hashCode()));
        } else {
            kg.IL(strOptString2);
        }
        if (jSONObjectOptJSONObject != null) {
            IL(kg);
            kg.bX((float) jSONObjectOptJSONObject.optDouble("x"));
            kg.eqN((float) jSONObjectOptJSONObject.optDouble("y"));
            kg.zx((float) jSONObjectOptJSONObject.optDouble("width"));
            kg.ldr((float) jSONObjectOptJSONObject.optDouble("height"));
            kg.iR(jSONObjectOptJSONObject.optInt("remainWidth"));
            com.bytedance.sdk.component.adexpress.dynamic.eqN.zx zxVar = new com.bytedance.sdk.component.adexpress.dynamic.eqN.zx();
            zxVar.bg(strOptString);
            zxVar.IL(jSONObjectOptJSONObject.optString("data"));
            zxVar.bX(jSONObjectOptJSONObject.optString("dataExtraInfo"));
            com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVarBg = com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr.bg(jSONObjectOptJSONObject);
            zxVar.bg(ldrVarBg);
            com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVarBg2 = com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr.bg(jSONObjectBg);
            if (ldrVarBg2 == null) {
                zxVar.IL(ldrVarBg);
            } else {
                zxVar.IL(ldrVarBg2);
            }
            bg(ldrVarBg);
            bg(ldrVarBg2);
            if (android.text.TextUtils.equals(strOptString, "video-image-budget") && (jSONObject2 = this.IL) != null) {
                bg(zxVar, jSONObject2.optInt("image_mode"));
            }
            java.lang.String strIL = zxVar.IL();
            com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVarZx = zxVar.zx();
            if (iR.containsKey(strIL) && !ldrVarZx.lM()) {
                ldrVarZx.Fy(iR.get(strIL));
            }
            if (ldrVarZx.lM()) {
                strBg = zxVar.bX();
            } else {
                strBg = bg(zxVar.bX());
            }
            if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
                if (android.text.TextUtils.equals(strIL, "star") || android.text.TextUtils.equals(strIL, "text_star")) {
                    strBg = bg("dynamic_creative.score_exact_i18n|");
                }
                if (android.text.TextUtils.equals(strIL, "score-count") || android.text.TextUtils.equals(strIL, "score-count-type-1") || android.text.TextUtils.equals(strIL, "score-count-type-2")) {
                    strBg = bg("dynamic_creative.comment_num_i18n|");
                }
                if ("root".equals(strIL) && ldrVarBg.uny()) {
                    strBg = bg("image.0.url");
                }
            }
            if (!android.text.TextUtils.isEmpty(bg()) && (android.text.TextUtils.equals("logo-union", strOptString) || android.text.TextUtils.equals("logo", strOptString))) {
                zxVar.IL(strBg + "adx:" + bg());
            } else {
                zxVar.IL(strBg);
            }
            kg.bg(zxVar);
        }
        return kg;
    }

    private void IL(com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        com.bytedance.sdk.component.adexpress.dynamic.eqN.bX bXVar;
        java.lang.Object objBg;
        java.lang.Object objBg2;
        java.lang.Object objBg3;
        java.lang.Object objBg4;
        if (kg == null || (bXVar = this.bX) == null || (objBg = bXVar.bg("image.0.url")) == null) {
            return;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(objBg);
        if (android.text.TextUtils.isEmpty(strValueOf) || (objBg2 = this.bX.bg(com.ironsource.y8.h.D0)) == null) {
            return;
        }
        java.lang.String strValueOf2 = java.lang.String.valueOf(objBg2);
        if (android.text.TextUtils.isEmpty(strValueOf2) || (objBg3 = this.bX.bg("description")) == null) {
            return;
        }
        java.lang.String strValueOf3 = java.lang.String.valueOf(objBg3);
        if (android.text.TextUtils.isEmpty(strValueOf3) || (objBg4 = this.bX.bg(com.ironsource.y8.h.H0)) == null) {
            return;
        }
        java.lang.String strValueOf4 = java.lang.String.valueOf(objBg4);
        if (android.text.TextUtils.isEmpty(strValueOf4)) {
            return;
        }
        java.lang.Object objBg5 = this.bX.bg("app.app_name");
        java.lang.Object objBg6 = this.bX.bg("source");
        if (objBg5 == null && objBg6 == null) {
            return;
        }
        if (objBg5 == null) {
            objBg5 = objBg6;
        }
        java.lang.String strValueOf5 = java.lang.String.valueOf(objBg5);
        if (android.text.TextUtils.isEmpty(strValueOf5)) {
            return;
        }
        kg.bg("imageUrl", strValueOf);
        kg.bg(com.ironsource.y8.h.D0, strValueOf2);
        kg.bg("description", strValueOf3);
        kg.bg(com.ironsource.y8.h.H0, strValueOf4);
        kg.bg("app_name", strValueOf5);
        kg.bg(true);
    }

    private void bg(com.bytedance.sdk.component.adexpress.dynamic.eqN.zx zxVar, int i) {
        int iLastIndexOf;
        if (i == 5 || i == 15 || i == 50 || i == 154) {
            zxVar.bg("video");
            java.lang.String strBg = com.bytedance.sdk.component.adexpress.dynamic.zx.WR.bg("video");
            zxVar.zx().Fy(strBg);
            java.lang.String strBg2 = com.bytedance.sdk.component.adexpress.dynamic.zx.WR.bg("video", "clickArea");
            if (!android.text.TextUtils.isEmpty(strBg2)) {
                zxVar.zx().Lq(strBg2);
                zxVar.iR().Lq(strBg2);
            }
            zxVar.iR().Fy(strBg);
            zxVar.IL(strBg);
            zxVar.zx().wq();
            return;
        }
        zxVar.bg("image");
        java.lang.String strBg3 = com.bytedance.sdk.component.adexpress.dynamic.zx.WR.bg("image");
        com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVarZx = zxVar.zx();
        ldrVarZx.Fy(strBg3);
        zxVar.iR().Fy(strBg3);
        java.lang.String strBg4 = com.bytedance.sdk.component.adexpress.dynamic.zx.WR.bg("image", "clickArea");
        if (!android.text.TextUtils.isEmpty(strBg4)) {
            ldrVarZx.Lq(strBg4);
            zxVar.iR().Lq(strBg4);
        }
        org.json.JSONObject jSONObjectUV = ldrVarZx.uV();
        if (jSONObjectUV != null) {
            ldrVarZx.rri(jSONObjectUV.optString("imageLottieTosPath"));
            ldrVarZx.PX(jSONObjectUV.optBoolean("animationsLoop"));
            ldrVarZx.Ja(jSONObjectUV.optInt("lottieAppNameMaxLength"));
            ldrVarZx.DDQ(jSONObjectUV.optInt("lottieAdDescMaxLength"));
            ldrVarZx.Uw(jSONObjectUV.optInt("lottieAdTitleMaxLength"));
        }
        zxVar.IL(strBg3);
        if (strBg3 != null && (iLastIndexOf = strBg3.lastIndexOf(".")) > 0) {
            java.lang.String strSubstring = strBg3.substring(0, iLastIndexOf);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("width", bg(strSubstring + ".width"));
                jSONObject.put("height", bg(strSubstring + ".height"));
            } catch (org.json.JSONException unused) {
            }
            zxVar.bX(jSONObject.toString());
        }
        ldrVarZx.GR();
    }

    private java.lang.String bg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        for (java.lang.String str2 : str.split("\\|")) {
            if (this.bX.IL(str2)) {
                java.lang.String strValueOf = java.lang.String.valueOf(this.bX.bg(str2));
                if (!android.text.TextUtils.isEmpty(strValueOf)) {
                    return strValueOf;
                }
            }
        }
        return "";
    }

    private java.lang.String bg() {
        com.bytedance.sdk.component.adexpress.dynamic.eqN.bX bXVar = this.bX;
        return bXVar == null ? "" : java.lang.String.valueOf(bXVar.bg("adx_name"));
    }

    private void bg(com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVar) {
        if (ldrVar == null) {
            return;
        }
        java.lang.String strUq = ldrVar.Uq();
        if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
            java.lang.String strBX = com.bytedance.sdk.component.adexpress.eqN.Kg.bX(com.bytedance.sdk.component.adexpress.eqN.bg());
            if ("zh".equals(strBX)) {
                strBX = "cn";
            }
            if (!android.text.TextUtils.isEmpty(strBX) && ldrVar.ldr() != null) {
                java.lang.String strOptString = ldrVar.ldr().optString(strBX);
                if (!android.text.TextUtils.isEmpty(strOptString)) {
                    strUq = strOptString;
                }
            }
        }
        if (android.text.TextUtils.isEmpty(strUq)) {
            return;
        }
        int iIndexOf = strUq.indexOf("{{");
        int iIndexOf2 = strUq.indexOf("}}");
        if (iIndexOf < 0 || iIndexOf2 < 0 || iIndexOf2 < iIndexOf) {
            ldrVar.PX(strUq);
            return;
        }
        java.lang.String strBg = bg(strUq.substring(iIndexOf + 2, iIndexOf2));
        java.lang.StringBuilder sb = new java.lang.StringBuilder(strUq.substring(0, iIndexOf));
        if (!android.text.TextUtils.isEmpty(strBg)) {
            sb.append(strBg);
        }
        sb.append(strUq.substring(iIndexOf2 + 2));
        ldrVar.PX(sb.toString());
    }

    static class bg {
        float IL;
        boolean bX;
        float bg;

        public static com.bytedance.sdk.component.adexpress.dynamic.zx.ldr.bg bg(org.json.JSONObject jSONObject) {
            com.bytedance.sdk.component.adexpress.dynamic.zx.ldr.bg bgVar = new com.bytedance.sdk.component.adexpress.dynamic.zx.ldr.bg();
            if (jSONObject != null) {
                bgVar.bg = (float) jSONObject.optDouble("width");
                bgVar.IL = (float) jSONObject.optDouble("height");
                bgVar.bX = jSONObject.optBoolean("isLandscape");
            }
            return bgVar;
        }
    }
}
