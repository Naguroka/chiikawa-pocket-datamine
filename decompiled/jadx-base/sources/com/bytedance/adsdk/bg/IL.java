package com.bytedance.adsdk.bg;

/* JADX INFO: loaded from: classes3.dex */
public class IL implements com.bytedance.adsdk.bg.zx {
    @Override // com.bytedance.adsdk.bg.zx
    public java.lang.Object bg(org.json.JSONObject jSONObject, java.lang.Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            for (java.lang.Object obj : objArr) {
                java.lang.String strValueOf = java.lang.String.valueOf(obj);
                if (!android.text.TextUtils.isEmpty(strValueOf) && !android.text.TextUtils.equals(strValueOf, "null")) {
                    return strValueOf;
                }
            }
        }
        return null;
    }
}
