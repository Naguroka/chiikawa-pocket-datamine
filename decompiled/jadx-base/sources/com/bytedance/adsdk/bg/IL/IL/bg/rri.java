package com.bytedance.adsdk.bg.IL.IL.bg;

/* JADX INFO: loaded from: classes3.dex */
public class rri implements com.bytedance.adsdk.bg.IL.IL.bg {
    private final java.lang.String bg;

    public rri(java.lang.String str) {
        this.bg = str;
    }

    @Override // com.bytedance.adsdk.bg.IL.IL.bg
    public java.lang.Object bg(java.util.Map<java.lang.String, org.json.JSONObject> map) {
        java.lang.Object objBg;
        if (map == null || map.size() <= 0 || (objBg = bg(this.bg, map.get("default_key"))) == org.json.JSONObject.NULL) {
            return null;
        }
        return objBg;
    }

    @Override // com.bytedance.adsdk.bg.IL.IL.bg
    public com.bytedance.adsdk.bg.IL.eqN.zx bg() {
        return com.bytedance.adsdk.bg.IL.eqN.ldr.VARIABLE;
    }

    public java.lang.String toString() {
        return "VariableNode [literals=" + this.bg + com.ironsource.y8.i.e;
    }

    @Override // com.bytedance.adsdk.bg.IL.IL.bg
    public java.lang.String IL() {
        return this.bg;
    }

    public java.lang.Object bg(java.lang.String str, org.json.JSONObject jSONObject) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return bg(str.split("\\."), 0, jSONObject);
    }

    private java.lang.Object bg(java.lang.String[] strArr, int i, org.json.JSONObject jSONObject) {
        java.lang.Object objOpt;
        if (strArr != null && strArr.length > 0 && i < strArr.length && jSONObject != null) {
            java.lang.String str = strArr[i];
            int iIndexOf = str.indexOf(com.ironsource.y8.i.d);
            int iIndexOf2 = str.indexOf(com.ironsource.y8.i.e);
            if (iIndexOf < 0 || iIndexOf2 < 0 || iIndexOf > iIndexOf2) {
                objOpt = jSONObject.opt(str);
            } else {
                java.lang.String strSubstring = str.substring(0, iIndexOf);
                try {
                    int i2 = java.lang.Integer.parseInt(str.substring(iIndexOf + 1, iIndexOf2));
                    java.lang.Object objOpt2 = jSONObject.opt(strSubstring);
                    objOpt = objOpt2 instanceof org.json.JSONArray ? ((org.json.JSONArray) objOpt2).opt(i2) : null;
                } catch (java.lang.NumberFormatException unused) {
                    return null;
                }
            }
            if (i == strArr.length - 1) {
                return objOpt;
            }
            if (objOpt instanceof java.lang.String) {
                try {
                    return bg(strArr, i + 1, new org.json.JSONObject((java.lang.String) objOpt));
                } catch (org.json.JSONException unused2) {
                    return objOpt;
                }
            }
            if (objOpt instanceof org.json.JSONObject) {
                return bg(strArr, i + 1, (org.json.JSONObject) objOpt);
            }
        }
        return null;
    }
}
