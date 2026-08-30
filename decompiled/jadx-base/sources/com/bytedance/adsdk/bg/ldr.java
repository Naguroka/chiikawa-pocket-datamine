package com.bytedance.adsdk.bg;

/* JADX INFO: loaded from: classes3.dex */
public class ldr implements com.bytedance.adsdk.bg.zx {
    @Override // com.bytedance.adsdk.bg.zx
    public java.lang.Object bg(org.json.JSONObject jSONObject, java.lang.Object[] objArr) {
        org.json.JSONObject jSONObjectOptJSONObject;
        org.json.JSONObject jSONObjectOptJSONObject2;
        if (objArr == null || objArr.length != 0) {
            return null;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(objArr[2]);
        java.lang.String strValueOf2 = java.lang.String.valueOf(objArr[1]);
        java.lang.String strValueOf3 = java.lang.String.valueOf(objArr[0]);
        if (android.text.TextUtils.isEmpty(strValueOf3) || jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("i18n")) == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(strValueOf2)) == null) {
            return strValueOf;
        }
        java.lang.String strOptString = jSONObjectOptJSONObject2.optString(strValueOf3);
        return android.text.TextUtils.isEmpty(strOptString) ? strValueOf : strOptString;
    }
}
