package com.bytedance.adsdk.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bX implements com.bytedance.adsdk.bg.zx {
    @Override // com.bytedance.adsdk.bg.zx
    /* JADX INFO: renamed from: IL, reason: merged with bridge method [inline-methods] */
    public java.lang.String bg(org.json.JSONObject jSONObject, java.lang.Object[] objArr) {
        if (objArr == null || objArr.length != 3) {
            return null;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(objArr[0]);
        if (android.text.TextUtils.isEmpty(strValueOf)) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(strValueOf);
            java.lang.String strValueOf2 = java.lang.String.valueOf(objArr[1]);
            if (android.text.TextUtils.isEmpty(strValueOf2)) {
                return null;
            }
            return jSONObject2.optString(strValueOf2, java.lang.String.valueOf(objArr[2]));
        } catch (org.json.JSONException unused) {
            return null;
        }
    }
}
