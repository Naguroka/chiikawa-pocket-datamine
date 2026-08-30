package com.bytedance.adsdk.bg;

/* JADX INFO: loaded from: classes3.dex */
public class eqN implements com.bytedance.adsdk.bg.zx {
    @Override // com.bytedance.adsdk.bg.zx
    /* JADX INFO: renamed from: IL, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean bg(org.json.JSONObject jSONObject, java.lang.Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return java.lang.Boolean.FALSE;
        }
        try {
            java.lang.Double.parseDouble(java.lang.String.valueOf(objArr[0]));
            return java.lang.Boolean.TRUE;
        } catch (java.lang.NumberFormatException unused) {
            return java.lang.Boolean.FALSE;
        }
    }
}
