package com.json.sdk.controller;

/* JADX INFO: loaded from: classes5.dex */
final class g {
    private static final java.lang.String c = "com.ironsource.sdk.controller.g";
    private static final java.lang.String d = "functionName";
    private static final java.lang.String e = "params";
    private static final java.lang.String f = "hash";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.json.sdk.controller.b f3317a;
    private final com.json.sdk.controller.s b;

    g(com.json.sdk.controller.b bVar, com.json.sdk.controller.s sVar) {
        this.f3317a = bVar;
        this.b = sVar;
    }

    private java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("functionName", com.json.sdk.utils.SDKUtils.encodeString(str));
            jSONObject.put("params", com.json.sdk.utils.SDKUtils.encodeString(str2));
            jSONObject.put(f, com.json.sdk.utils.SDKUtils.encodeString(str3));
        } catch (org.json.JSONException e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
        return jSONObject.toString();
    }

    private void a(java.lang.Exception exc) {
        com.json.mediationsdk.logger.IronLog.INTERNAL.error(exc.toString());
        com.json.sdk.utils.Logger.i(c, "messageHandler failed with exception " + exc.getMessage());
    }

    private void a(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        this.f3317a.a(str, str2);
    }

    private void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f3317a.a(a(str, str2, str3));
    }

    @android.webkit.JavascriptInterface
    public void messageHandler(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            com.json.sdk.utils.Logger.i(c, "messageHandler(" + str + " " + str3 + ")");
            if (this.b.a(str, str2, str3)) {
                a(str, str2);
            } else {
                b(str, str2, str3);
            }
        } catch (java.lang.Exception e2) {
            a(e2);
        }
    }
}
