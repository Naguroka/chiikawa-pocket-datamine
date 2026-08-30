package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class hh {
    public static com.json.bc a(org.json.JSONObject jSONObject) {
        return new com.ironsource.bc.a(jSONObject.optString(com.json.zb.r)).b().b(jSONObject.optBoolean("enabled")).a(new com.json.fh()).a(a()).a(false).a();
    }

    public static com.json.eh a(android.content.Context context, java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) throws java.lang.Exception {
        com.ironsource.eh.b bVar = new com.ironsource.eh.b();
        if (map != null && map.containsKey("sessionid")) {
            bVar.c(map.get("sessionid"));
        }
        bVar.a(context);
        return bVar.d(str).a(str2).a();
    }

    public static com.ironsource.zg.e a(com.json.sa saVar, com.ironsource.zg.e eVar) {
        if (saVar == null || saVar.g() == null || saVar.g().get("rewarded") == null) {
            return eVar;
        }
        return java.lang.Boolean.parseBoolean(saVar.g().get("rewarded")) ? com.ironsource.zg.e.RewardedVideo : com.ironsource.zg.e.Interstitial;
    }

    private static java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> a() {
        java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> arrayList = new java.util.ArrayList<>();
        arrayList.add(new android.util.Pair<>("Content-Type", com.json.zb.L));
        arrayList.add(new android.util.Pair<>(com.json.zb.M, com.json.zb.N));
        return arrayList;
    }

    public static boolean a(com.json.sa saVar) {
        if (saVar == null || saVar.g().get("inAppBidding") == null) {
            return false;
        }
        return java.lang.Boolean.parseBoolean(saVar.g().get("inAppBidding"));
    }
}
