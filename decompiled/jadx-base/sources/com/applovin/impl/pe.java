package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pe extends com.applovin.impl.e4 {
    private static final java.lang.String[] e = {"ads", "settings", "auto_init_adapters", "test_mode_idfas", "test_mode_auto_init_adapters", "ad_unit_signal_providers"};
    private static final java.lang.String[] f = {"ads", "settings", "signal_providers", "ad_unit_signal_providers"};

    public static void f(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (com.applovin.impl.sdk.utils.JsonUtils.valueExists(jSONObject, "signal_providers")) {
            org.json.JSONObject jSONObjectShallowCopy = com.applovin.impl.sdk.utils.JsonUtils.shallowCopy(jSONObject);
            com.applovin.impl.sdk.utils.JsonUtils.removeObjectsForKeys(jSONObjectShallowCopy, e);
            jVar.b(com.applovin.impl.uj.F, jSONObjectShallowCopy.toString());
            com.applovin.impl.fm.a(jSONObjectShallowCopy);
        }
    }

    public static void d(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (com.applovin.impl.sdk.utils.JsonUtils.valueExists(jSONObject, "ad_unit_signal_providers")) {
            com.applovin.impl.fm.a(jSONObject, jVar);
        }
    }

    public static void g(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (com.applovin.impl.sdk.utils.JsonUtils.valueExists(jSONObject, "ad_unit_signal_providers") && com.applovin.impl.sdk.utils.JsonUtils.valueExists(jSONObject, "signal_providers")) {
            try {
                java.util.HashSet hashSet = new java.util.HashSet();
                org.json.JSONArray jSONArray = com.applovin.impl.sdk.utils.JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
                for (int i = 0; i < jSONArray.length(); i++) {
                    hashSet.add(com.applovin.impl.sdk.utils.JsonUtils.getString(jSONArray.getJSONObject(i), "name", null));
                }
                java.util.HashSet hashSet2 = new java.util.HashSet();
                org.json.JSONObject jSONObject2 = com.applovin.impl.sdk.utils.JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (org.json.JSONObject) null);
                java.util.Iterator it = com.applovin.impl.sdk.utils.JsonUtils.toList(jSONObject2.names()).iterator();
                while (it.hasNext()) {
                    hashSet2.addAll(com.applovin.impl.sdk.utils.JsonUtils.getList(jSONObject2, (java.lang.String) it.next(), null));
                }
                if (hashSet.equals(hashSet2)) {
                    return;
                }
                java.util.Set differenceSet = com.applovin.impl.sdk.utils.CollectionUtils.getDifferenceSet(hashSet, hashSet2);
                com.applovin.impl.sdk.n.h("MediationConnectionUtils", "\"signal_providers\" contains extra network(s): " + differenceSet);
                java.util.Set differenceSet2 = com.applovin.impl.sdk.utils.CollectionUtils.getDifferenceSet(hashSet2, hashSet);
                com.applovin.impl.sdk.n.h("MediationConnectionUtils", "\"ad_unit_signal_providers\" contains extra network(s): " + differenceSet2);
                jVar.D().a(com.applovin.impl.ka.c0, "signalProvidersMismatch", (java.util.Map) com.applovin.impl.sdk.utils.CollectionUtils.hashMap("details", "extraSignalProviderNetworks=" + differenceSet + ",extraAdUnitSignalProviderNetworks=" + differenceSet2));
                com.applovin.impl.p6.a("Networks within \"signal_providers\" and \"ad_unit_signal_providers\" do not match.", new java.lang.Object[0]);
            } catch (org.json.JSONException e2) {
                com.applovin.impl.sdk.n.c("MediationConnectionUtils", "Failed to parse JSON", e2);
                jVar.D().a("MediationConnectionUtils", "verifyBidderNetworksMatchFromJson", e2);
                com.applovin.impl.p6.a((java.lang.Throwable) e2, "Failed to parse JSON in verifyBidderNetworksMatchFromJson", new java.lang.Object[0]);
            }
        }
    }

    public static void e(org.json.JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        if (jSONObject.length() == 0) {
            return;
        }
        if (!com.applovin.impl.sdk.utils.JsonUtils.valueExists(jSONObject, "auto_init_adapters") && !com.applovin.impl.sdk.utils.JsonUtils.valueExists(jSONObject, "test_mode_auto_init_adapters")) {
            jVar.c(com.applovin.impl.uj.G);
            return;
        }
        org.json.JSONObject jSONObjectShallowCopy = com.applovin.impl.sdk.utils.JsonUtils.shallowCopy(jSONObject);
        com.applovin.impl.sdk.utils.JsonUtils.removeObjectsForKeys(jSONObjectShallowCopy, f);
        jVar.b(com.applovin.impl.uj.G, jSONObjectShallowCopy.toString());
    }

    public static java.lang.String b(com.applovin.impl.sdk.j jVar) {
        return com.applovin.impl.e4.a((java.lang.String) jVar.a(com.applovin.impl.ue.F6), "1.0/mediate", jVar);
    }

    public static java.lang.String a(com.applovin.impl.sdk.j jVar) {
        return com.applovin.impl.e4.a((java.lang.String) jVar.a(com.applovin.impl.ue.G6), "1.0/mediate", jVar);
    }

    public static java.lang.String i(com.applovin.impl.sdk.j jVar) {
        return com.applovin.impl.e4.a((java.lang.String) jVar.a(com.applovin.impl.ue.F6), "1.0/mediate_debug", jVar);
    }

    public static java.lang.String h(com.applovin.impl.sdk.j jVar) {
        return com.applovin.impl.e4.a((java.lang.String) jVar.a(com.applovin.impl.ue.G6), "1.0/mediate_debug", jVar);
    }
}
