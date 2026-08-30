package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n4 {
    public static java.util.List b(com.applovin.impl.sdk.j jVar) {
        return a(com.applovin.sdk.R.raw.applovin_consent_flow_terms_of_service_and_privacy_policy, jVar);
    }

    public static java.util.List c(com.applovin.impl.sdk.j jVar) {
        return a(com.applovin.sdk.R.raw.applovin_consent_flow_unified_cmp, jVar);
    }

    private static java.util.List a(int i, com.applovin.impl.sdk.j jVar) {
        java.lang.String strA = com.applovin.impl.yp.a(i, com.applovin.impl.sdk.j.m(), jVar);
        if (!android.text.TextUtils.isEmpty(strA)) {
            org.json.JSONObject jSONObjectJsonObjectFromJsonString = com.applovin.impl.sdk.utils.JsonUtils.jsonObjectFromJsonString(strA, null);
            if (jSONObjectJsonObjectFromJsonString != null) {
                org.json.JSONArray jSONArray = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObjectJsonObjectFromJsonString, "states", new org.json.JSONArray());
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    arrayList.add(com.applovin.impl.i4.a(com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONArray, i2, new org.json.JSONObject()), jVar));
                }
                return arrayList;
            }
            throw new java.lang.IllegalStateException("Unable to parse consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
        }
        throw new java.lang.IllegalStateException("Unable to retrieve consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
    }

    public static java.util.List a(com.applovin.impl.sdk.j jVar) {
        return a(com.applovin.sdk.R.raw.applovin_consent_flow_privacy_policy, jVar);
    }
}
