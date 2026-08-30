package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static java.lang.String f3558a = "ManRewInst_";

    public static java.lang.String a() {
        return java.lang.String.valueOf(java.lang.System.currentTimeMillis());
    }

    public static java.lang.String a(com.json.mj mjVar) {
        com.ironsource.zg.e eVar;
        if (mjVar.i()) {
            eVar = com.ironsource.zg.e.Banner;
        } else {
            eVar = mjVar.n() ? com.ironsource.zg.e.RewardedVideo : com.ironsource.zg.e.Interstitial;
        }
        return eVar.toString();
    }

    public static java.lang.String a(org.json.JSONObject jSONObject) {
        return jSONObject.optBoolean("rewarded") ? f3558a + jSONObject.optString("name") : jSONObject.optString("name");
    }

    public static java.lang.String b() {
        return java.util.UUID.randomUUID().toString();
    }
}
