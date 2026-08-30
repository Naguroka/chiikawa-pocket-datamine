package com.bytedance.adsdk.ugeno.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class Kg {
    public static com.bytedance.adsdk.ugeno.eqN.IL.bg bg(java.lang.String str, org.json.JSONObject jSONObject) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        com.bytedance.adsdk.ugeno.eqN.IL.bg bgVar = new com.bytedance.adsdk.ugeno.eqN.IL.bg();
        android.net.Uri uri = android.net.Uri.parse(str);
        if (uri == null) {
            return null;
        }
        if (!android.text.TextUtils.isEmpty(uri.getScheme())) {
            bgVar.bg(uri.getScheme());
        }
        java.lang.String authority = uri.getAuthority();
        if (android.text.TextUtils.isEmpty(authority)) {
            authority = uri.getPath();
        }
        bgVar.IL(authority);
        java.util.HashMap map = new java.util.HashMap();
        java.util.Set<java.lang.String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null && queryParameterNames.size() > 0) {
            for (java.lang.String str2 : queryParameterNames) {
                map.put(str2, com.bytedance.adsdk.ugeno.bX.IL.bg(uri.getQueryParameter(str2), jSONObject));
            }
        }
        bgVar.bg(map);
        return bgVar;
    }
}
