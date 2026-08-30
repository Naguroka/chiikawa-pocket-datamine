package com.bytedance.adsdk.ugeno.core;

/* JADX INFO: loaded from: classes3.dex */
public class zx {
    private org.json.JSONObject IL;
    private java.lang.String bX;
    private org.json.JSONObject bg;
    private org.json.JSONObject eqN;
    private boolean iR;
    private org.json.JSONObject ldr;
    private java.lang.String zx;

    public zx(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        this(jSONObject, jSONObject2, null);
    }

    public zx(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3) {
        org.json.JSONObject jSONObjectOptJSONObject;
        if (jSONObject != null) {
            if (jSONObject.has("body")) {
                this.bg = jSONObject.optJSONObject("body");
            } else {
                this.bg = jSONObject.optJSONObject("main_template");
            }
            this.IL = jSONObject.optJSONObject("sub_templates");
            if (jSONObject.has(com.adjust.sdk.Constants.REFERRER_API_META)) {
                jSONObjectOptJSONObject = jSONObject.optJSONObject(com.adjust.sdk.Constants.REFERRER_API_META);
            } else {
                jSONObjectOptJSONObject = jSONObject.optJSONObject("template_info");
            }
            if (jSONObjectOptJSONObject != null) {
                if (jSONObject.has("body")) {
                    this.iR = true;
                    java.lang.String strOptString = jSONObjectOptJSONObject.optString("version");
                    this.bX = strOptString;
                    if (android.text.TextUtils.isEmpty(strOptString)) {
                        this.bX = "3.0";
                    }
                } else {
                    this.bX = jSONObjectOptJSONObject.optString("sdk_version");
                }
                if (jSONObjectOptJSONObject.has("adType")) {
                    this.zx = jSONObjectOptJSONObject.optString("adType");
                }
            } else if (jSONObject.has("body")) {
                this.bX = "3.0";
                this.iR = true;
            }
            this.eqN = jSONObject2;
            this.ldr = jSONObject3;
        }
    }

    public com.bytedance.adsdk.ugeno.core.zx.bg bg() {
        return bg(this.bg, (com.bytedance.adsdk.ugeno.core.zx.bg) null);
    }

    public java.lang.String IL() {
        return this.bX;
    }

    public java.util.List<com.bytedance.adsdk.ugeno.core.zx.bg> bX() {
        if (this.IL == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.String> itKeys = this.IL.keys();
        while (itKeys.hasNext()) {
            com.bytedance.adsdk.ugeno.core.zx.bg bgVarBg = bg(this.IL.optJSONObject(itKeys.next()), (com.bytedance.adsdk.ugeno.core.zx.bg) null);
            if (bgVarBg != null) {
                arrayList.add(bgVarBg);
            }
        }
        return arrayList;
    }

    private com.bytedance.adsdk.ugeno.core.zx.bg bg(org.json.JSONObject jSONObject, com.bytedance.adsdk.ugeno.core.zx.bg bgVar) {
        java.lang.String strOptString;
        java.lang.String strOptString2;
        com.bytedance.adsdk.ugeno.core.zx.bg bgVarBg;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.has("type")) {
            strOptString = jSONObject.optString("type");
        } else {
            strOptString = jSONObject.optString("name");
        }
        java.lang.String strOptString3 = jSONObject.optString("id");
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            if (!android.text.TextUtils.equals(next, "children")) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (org.json.JSONException unused) {
                }
            }
        }
        com.bytedance.adsdk.ugeno.core.zx.bg bgVar2 = new com.bytedance.adsdk.ugeno.core.zx.bg();
        bgVar2.bg = strOptString3;
        if (!this.iR || !android.text.TextUtils.equals("Video", strOptString)) {
            bgVar2.IL = strOptString;
        } else {
            bgVar2.IL = strOptString + "V3";
        }
        bgVar2.bX = jSONObject2;
        bgVar2.ldr = bgVar;
        bgVar2.iR = this.bX;
        bgVar2.Kg = this.zx;
        if (jSONObject2.has("i18n")) {
            bgVar2.eqN = jSONObject2.optJSONObject("i18n");
        }
        if (android.text.TextUtils.equals(strOptString, "CustomComponent")) {
            bg(jSONObject, bgVar2.bX);
        }
        org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                org.json.JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObject.has("type")) {
                    strOptString2 = jSONObject.optString("type");
                } else {
                    strOptString2 = jSONObject.optString("name");
                }
                java.lang.String strBg = com.bytedance.adsdk.ugeno.bX.IL.bg(jSONObjectOptJSONObject.optString("id"), this.eqN);
                if (android.text.TextUtils.equals(strOptString2, "Template")) {
                    org.json.JSONObject jSONObject3 = this.IL;
                    if (jSONObject3 != null) {
                        jSONObjectOptJSONObject = jSONObject3.optJSONObject(strBg);
                        bgVarBg = bg(jSONObjectOptJSONObject, bgVar2);
                    } else {
                        bgVarBg = null;
                    }
                } else {
                    bgVarBg = bg(jSONObjectOptJSONObject, bgVar2);
                }
                if (bgVarBg != null) {
                    bgVar2.bg(bgVarBg);
                }
            }
        }
        return bgVar2;
    }

    public boolean eqN() {
        return this.iR;
    }

    private void bg(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        if (this.ldr == null || jSONObject2 == null) {
            return;
        }
        try {
            java.lang.String strOptString = this.ldr.optString(jSONObject2.optString("targetId"));
            if (android.text.TextUtils.isEmpty(strOptString)) {
                return;
            }
            org.json.JSONObject jSONObject3 = new org.json.JSONObject(strOptString);
            org.json.JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("targetProps");
            if (jSONObjectOptJSONObject != null) {
                java.util.Iterator<java.lang.String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    java.lang.String next = itKeys.next();
                    java.lang.Object objOpt = jSONObjectOptJSONObject.opt(next);
                    if (android.text.TextUtils.equals(next, "events") && jSONObject3.has("events")) {
                        if (objOpt instanceof org.json.JSONArray) {
                            com.bytedance.adsdk.ugeno.iR.IL.bg(jSONObject3.optJSONArray("events"), (org.json.JSONArray) objOpt);
                        }
                    } else {
                        jSONObject3.put(next, objOpt);
                    }
                }
                org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new org.json.JSONArray();
                }
                jSONArrayOptJSONArray.put(jSONObject3);
                if (jSONObject.has("children")) {
                    return;
                }
                jSONObject.put("children", jSONArrayOptJSONArray);
            }
        } catch (org.json.JSONException unused) {
        }
    }

    public static boolean bg(com.bytedance.adsdk.ugeno.core.zx.bg bgVar) {
        return (bgVar == null || bgVar.bX == null) ? false : true;
    }

    public static class bg {
        private java.lang.String IL;
        private java.lang.String Kg;
        private org.json.JSONObject bX;
        private java.lang.String bg;
        private org.json.JSONObject eqN;
        private java.lang.String iR;
        private com.bytedance.adsdk.ugeno.core.zx.bg ldr;
        private java.util.List<com.bytedance.adsdk.ugeno.core.zx.bg> zx;

        public java.lang.String bg() {
            return this.bg;
        }

        public java.lang.String IL() {
            return this.iR;
        }

        public java.lang.String bX() {
            return this.IL;
        }

        public org.json.JSONObject eqN() {
            return this.bX;
        }

        public java.util.List<com.bytedance.adsdk.ugeno.core.zx.bg> zx() {
            return this.zx;
        }

        public void bg(com.bytedance.adsdk.ugeno.core.zx.bg bgVar) {
            if (this.zx == null) {
                this.zx = new java.util.ArrayList();
            }
            this.zx.add(bgVar);
        }

        public org.json.JSONObject ldr() {
            return this.eqN;
        }

        public java.lang.String toString() {
            return "UGNode{id='" + this.bg + "', name='" + this.IL + "'}";
        }
    }
}
