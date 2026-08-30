package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class rm extends com.applovin.impl.yl {
    private final java.lang.String h;
    private final java.util.List i;
    private final com.applovin.impl.oe j;
    private final java.util.Map k;
    private final java.util.Map l;
    private final java.util.Map m;
    private final com.applovin.mediation.MaxError n;

    public rm(java.lang.String str, java.util.List list, java.util.Map map, java.util.Map map2, com.applovin.mediation.MaxError maxError, com.applovin.impl.oe oeVar, com.applovin.impl.sdk.j jVar, boolean z) {
        super("TaskFireMediationPostbacks", jVar);
        this.h = str + "_urls";
        this.i = list;
        this.k = com.applovin.impl.yp.a(map, jVar);
        this.l = map2 == null ? new java.util.HashMap() : map2;
        this.n = maxError != null ? maxError : new com.applovin.impl.mediation.MaxErrorImpl(-1);
        this.j = oeVar;
        java.util.HashMap map3 = new java.util.HashMap(7);
        map3.put("AppLovin-Event-Type", str);
        if (z && oeVar != null) {
            map3.put("AppLovin-Ad-Network-Name", oeVar.c());
        }
        if (oeVar instanceof com.applovin.impl.fe) {
            com.applovin.impl.fe feVar = (com.applovin.impl.fe) oeVar;
            map3.put("AppLovin-Ad-Unit-Id", feVar.getAdUnitId());
            map3.put("AppLovin-Ad-Format", feVar.getFormat().getLabel());
            if (z) {
                map3.put("AppLovin-Third-Party-Ad-Placement-Id", feVar.T());
            }
        }
        if (maxError != null) {
            map3.put("AppLovin-Error-Code", java.lang.String.valueOf(maxError.getCode()));
            map3.put("AppLovin-Error-Message", maxError.getMessage());
        }
        this.m = map3;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List listF = f();
        if (com.applovin.impl.sdk.utils.CollectionUtils.isEmpty(listF)) {
            return;
        }
        java.util.Map mapE = e();
        java.util.Iterator it = listF.iterator();
        while (it.hasNext()) {
            android.net.Uri uri = android.net.Uri.parse(a(b((java.lang.String) it.next(), this.k), this.n));
            android.net.Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            java.util.HashMap map = new java.util.HashMap(this.l);
            for (java.lang.String str : uri.getQueryParameterNames()) {
                java.lang.String queryParameter = uri.getQueryParameter(str);
                if (mapE.containsKey(queryParameter)) {
                    com.applovin.impl.oe oeVar = this.j;
                    if (oeVar != null) {
                        map.put(str, oeVar.a((java.lang.String) mapE.get(queryParameter)));
                    }
                } else {
                    builderClearQuery.appendQueryParameter(str, queryParameter);
                }
            }
            map.putAll(this.f1547a.x().e());
            a(builderClearQuery.build().toString(), map);
        }
    }

    private void a(java.lang.String str, java.util.Map map) {
        b().W().e(com.applovin.impl.sdk.network.d.b().d(str).c("POST").a(this.m).a(false).c(map).c(((java.lang.Boolean) this.f1547a.a(com.applovin.impl.ue.O7)).booleanValue()).a());
    }

    private java.util.List f() {
        java.util.List list = this.i;
        if (list != null) {
            return list;
        }
        com.applovin.impl.oe oeVar = this.j;
        if (oeVar != null) {
            return oeVar.b(this.h);
        }
        return null;
    }

    private java.util.Map e() {
        try {
            return com.applovin.impl.sdk.utils.JsonUtils.toStringMap(new org.json.JSONObject((java.lang.String) this.f1547a.a(com.applovin.impl.ue.L6)));
        } catch (org.json.JSONException unused) {
            return java.util.Collections.EMPTY_MAP;
        }
    }

    private java.lang.String b(java.lang.String str, java.util.Map map) {
        for (java.lang.String str2 : map.keySet()) {
            str = str.replace(str2, com.applovin.impl.sdk.utils.StringUtils.emptyIfNull((java.lang.String) map.get(str2)));
        }
        return str;
    }

    private java.lang.String a(java.lang.String str, com.applovin.mediation.MaxError maxError) {
        int mediatedNetworkErrorCode;
        java.lang.String mediatedNetworkErrorMessage;
        if (maxError instanceof com.applovin.mediation.adapter.MaxAdapterError) {
            com.applovin.mediation.adapter.MaxAdapterError maxAdapterError = (com.applovin.mediation.adapter.MaxAdapterError) maxError;
            mediatedNetworkErrorCode = maxAdapterError.getMediatedNetworkErrorCode();
            mediatedNetworkErrorMessage = maxAdapterError.getMediatedNetworkErrorMessage();
        } else {
            mediatedNetworkErrorCode = 0;
            mediatedNetworkErrorMessage = "";
        }
        return str.replace("{ERROR_CODE}", java.lang.String.valueOf(maxError.getCode())).replace("{ERROR_MESSAGE}", com.applovin.impl.sdk.utils.StringUtils.encodeUriString(maxError.getMessage())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", java.lang.String.valueOf(mediatedNetworkErrorCode)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", com.applovin.impl.sdk.utils.StringUtils.encodeUriString(mediatedNetworkErrorMessage));
    }
}
