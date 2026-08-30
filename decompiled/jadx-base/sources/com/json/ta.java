package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map<java.lang.String, com.json.sa> f3429a = new java.util.LinkedHashMap();
    private final java.util.Map<java.lang.String, com.json.sa> b = new java.util.LinkedHashMap();
    private final java.util.Map<java.lang.String, com.json.sa> c = new java.util.LinkedHashMap();

    private void a(com.ironsource.zg.e eVar, java.lang.String str, com.json.sa saVar) {
        java.util.Map<java.lang.String, com.json.sa> mapB;
        if (android.text.TextUtils.isEmpty(str) || saVar == null || (mapB = b(eVar)) == null) {
            return;
        }
        mapB.put(str, saVar);
    }

    private java.util.Map<java.lang.String, com.json.sa> b(com.ironsource.zg.e eVar) {
        if (eVar.name().equalsIgnoreCase(com.ironsource.zg.e.RewardedVideo.name())) {
            return this.f3429a;
        }
        if (eVar.name().equalsIgnoreCase(com.ironsource.zg.e.Interstitial.name())) {
            return this.b;
        }
        if (eVar.name().equalsIgnoreCase(com.ironsource.zg.e.Banner.name())) {
            return this.c;
        }
        return null;
    }

    public com.json.sa a(com.ironsource.zg.e eVar, com.json.mj mjVar) {
        com.json.sa saVar = new com.json.sa(mjVar);
        a(eVar, mjVar.e(), saVar);
        return saVar;
    }

    public com.json.sa a(com.ironsource.zg.e eVar, java.lang.String str) {
        java.util.Map<java.lang.String, com.json.sa> mapB;
        if (android.text.TextUtils.isEmpty(str) || (mapB = b(eVar)) == null) {
            return null;
        }
        return mapB.get(str);
    }

    public com.json.sa a(com.ironsource.zg.e eVar, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, com.json.eo eoVar) {
        com.json.sa saVar = new com.json.sa(str, str, map, eoVar);
        a(eVar, str, saVar);
        return saVar;
    }

    public java.util.Collection<com.json.sa> a(com.ironsource.zg.e eVar) {
        java.util.Map<java.lang.String, com.json.sa> mapB = b(eVar);
        return mapB != null ? mapB.values() : new java.util.ArrayList();
    }

    public void b(com.ironsource.zg.e eVar, java.lang.String str) {
        java.util.Map<java.lang.String, com.json.sa> mapB;
        com.json.sa saVarRemove;
        if (android.text.TextUtils.isEmpty(str) || (mapB = b(eVar)) == null || (saVarRemove = mapB.remove(str)) == null) {
            return;
        }
        saVarRemove.a();
    }
}
