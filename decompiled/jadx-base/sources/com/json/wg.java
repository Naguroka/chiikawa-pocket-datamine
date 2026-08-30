package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class wg implements com.json.y2 {
    private static final java.lang.String b = "wg";
    private static com.json.wg c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map<java.lang.String, com.json.qh> f3534a = java.util.Collections.synchronizedMap(new java.util.HashMap());

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.vg f3535a;
        final /* synthetic */ android.content.Context b;
        final /* synthetic */ java.lang.String c;

        a(com.json.vg vgVar, android.content.Context context, java.lang.String str) {
            this.f3535a = vgVar;
            this.b = context;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.wg.this.f3534a.put(this.c, new com.json.qg(this.f3535a, this.b));
        }
    }

    private com.json.og a(org.json.JSONObject jSONObject) {
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONObject.getString(com.ironsource.y8.h.O));
            java.lang.String string = jSONObject2.get("height").toString();
            java.lang.String string2 = jSONObject2.get("width").toString();
            return new com.json.og(java.lang.Integer.parseInt(string2), java.lang.Integer.parseInt(string), jSONObject2.get("label").toString());
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            return new com.json.og();
        }
    }

    public static synchronized com.json.wg a() {
        if (c == null) {
            c = new com.json.wg();
        }
        return c;
    }

    private com.json.og b(org.json.JSONObject jSONObject) {
        com.json.og ogVar = new com.json.og();
        try {
            return a(jSONObject);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return ogVar;
        }
    }

    private boolean d(org.json.JSONObject jSONObject) {
        return jSONObject.optBoolean(com.ironsource.y8.h.s0);
    }

    @Override // com.json.y2
    public com.json.qh a(java.lang.String str) {
        if (str.isEmpty() || !this.f3534a.containsKey(str)) {
            return null;
        }
        return this.f3534a.get(str);
    }

    public void a(com.json.rg rgVar, org.json.JSONObject jSONObject, android.content.Context context, java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        java.lang.String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            com.json.sdk.utils.Logger.i(b, "loadWithUrl fail - adViewId is empty");
            throw new java.lang.Exception("adViewId is empty");
        }
        com.json.og ogVarB = b(jSONObject);
        if (this.f3534a.containsKey(string)) {
            com.json.sdk.utils.Logger.i(b, "sendMessageToAd fail - collection already contain adViewId");
            throw new java.lang.Exception("collection already contain adViewId");
        }
        com.json.vg vgVar = new com.json.vg(rgVar, context, string, ogVarB);
        vgVar.e(com.json.sdk.utils.IronSourceStorageUtils.getNetworkStorageDir(context));
        vgVar.b(jSONObject, str, str2);
        if (d(jSONObject)) {
            com.json.cg.f2559a.d(new com.ironsource.wg.a(vgVar, context, string));
        } else {
            this.f3534a.put(string, vgVar);
        }
    }

    public void a(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        java.lang.String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            com.json.sdk.utils.Logger.i(b, "removeAdView fail - adViewId is empty");
            throw new java.lang.Exception("adViewId is empty");
        }
        if (!this.f3534a.containsKey(string)) {
            com.json.sdk.utils.Logger.i(b, "removeAdView fail - collection does not contain adViewId");
            throw new java.lang.Exception("collection does not contain adViewId");
        }
        com.json.qh qhVar = this.f3534a.get(string);
        if (qhVar != null) {
            qhVar.a(jSONObject, str, str2);
        }
    }

    public void b(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        java.lang.String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            com.json.sdk.utils.Logger.i(b, "performWebViewAction fail - adViewId is empty");
            throw new java.lang.Exception("adViewId is empty");
        }
        if (!this.f3534a.containsKey(string)) {
            com.json.sdk.utils.Logger.i(b, "performWebViewAction fail - collection does not contain adViewId");
            throw new java.lang.Exception("collection does not contain adViewId");
        }
        com.json.qh qhVar = this.f3534a.get(string);
        java.lang.String string2 = jSONObject.getString(com.ironsource.y8.h.v0);
        if (qhVar != null) {
            qhVar.a(string2, str, str2);
        }
    }

    public java.lang.String c(org.json.JSONObject jSONObject) throws org.json.JSONException {
        if (jSONObject == null || !jSONObject.has("adViewId")) {
            return (jSONObject == null || !jSONObject.has("params")) ? "" : new org.json.JSONObject(jSONObject.getString("params")).getString("adViewId");
        }
        return jSONObject.getString("adViewId");
    }

    public void c(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        java.lang.String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            com.json.sdk.utils.Logger.i(b, "removeAdView fail - adViewId is empty");
            throw new java.lang.Exception("adViewId is empty");
        }
        if (!this.f3534a.containsKey(string)) {
            com.json.sdk.utils.Logger.i(b, "removeAdView fail - collection does not contain adViewId");
            throw new java.lang.Exception("collection does not contain adViewId");
        }
        com.json.qh qhVar = this.f3534a.get(string);
        this.f3534a.remove(string);
        if (qhVar != null) {
            qhVar.a(str, str2);
        }
    }

    public void d(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        java.lang.String string = new org.json.JSONObject(jSONObject.getString("params")).getString("adViewId");
        if (string.isEmpty()) {
            com.json.sdk.utils.Logger.i(b, "sendMessageToAd fail - adViewId is empty");
            throw new java.lang.Exception("adViewId is empty");
        }
        if (!this.f3534a.containsKey(string)) {
            com.json.sdk.utils.Logger.i(b, "sendMessageToAd fail - collection does not contain adViewId");
            throw new java.lang.Exception("collection does not contain adViewId");
        }
        com.json.qh qhVar = this.f3534a.get(string);
        if (qhVar != null) {
            qhVar.c(jSONObject, str, str2);
        }
    }
}
