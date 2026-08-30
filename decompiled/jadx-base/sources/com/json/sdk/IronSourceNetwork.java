package com.json.sdk;

/* JADX INFO: loaded from: classes5.dex */
public class IronSourceNetwork {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final java.lang.String f3272a = "IronSourceNetwork";
    private static com.json.wj b;
    private static java.util.List<com.json.jo> c = new java.util.ArrayList();
    private static com.json.zj d;

    private static synchronized void a() throws java.lang.Exception {
        if (b == null) {
            throw new java.lang.NullPointerException("Call initSDK first");
        }
    }

    private static void a(android.content.Context context, org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) throws java.lang.Exception {
        if (jSONObject != null) {
            com.json.bc bcVarA = com.json.hh.a(jSONObject);
            if (bcVarA.a()) {
                com.json.gh.a(bcVarA, com.json.hh.a(context, str, str2, map));
            }
        }
    }

    public static synchronized void addInitListener(com.json.jo joVar) {
        com.json.zj zjVar = d;
        if (zjVar == null) {
            c.add(joVar);
        } else if (zjVar.b()) {
            joVar.onSuccess();
        } else {
            joVar.onFail(d.getError());
        }
    }

    public static synchronized void destroyAd(com.json.mj mjVar) throws java.lang.Exception {
        a();
        b.b(mjVar);
    }

    public static synchronized com.json.sdk.controller.e getControllerManager() {
        return b.a();
    }

    public static java.lang.String getVersion() {
        return com.json.sdk.utils.SDKUtils.getSDKVersion();
    }

    public static synchronized void initSDK(android.content.Context context, java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.json.sdk.utils.Logger.e(f3272a, "applicationKey is NULL");
            return;
        }
        if (b == null) {
            com.json.sdk.utils.SDKUtils.setInitSDKParams(map);
            try {
                a(context, com.json.sdk.utils.SDKUtils.getNetworkConfiguration().optJSONObject("events"), str2, str, map);
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                com.json.sdk.utils.Logger.e(f3272a, "Failed to init event tracker: " + e.getMessage());
            }
            b = com.json.qj.a(context, str, str2);
        }
    }

    public static synchronized boolean isAdAvailableForInstance(com.json.mj mjVar) {
        com.json.wj wjVar = b;
        if (wjVar == null) {
            return false;
        }
        return wjVar.a(mjVar);
    }

    public static synchronized void loadAd(com.json.mj mjVar, java.util.Map<java.lang.String, java.lang.String> map) throws java.lang.Exception {
        a();
        b.a(mjVar, map);
    }

    public static synchronized void loadAdView(android.app.Activity activity, com.json.mj mjVar, java.util.Map<java.lang.String, java.lang.String> map) throws java.lang.Exception {
        a();
        b.b(activity, mjVar, map);
    }

    public static void onPause(android.app.Activity activity) {
        com.json.wj wjVar = b;
        if (wjVar == null) {
            return;
        }
        wjVar.onPause(activity);
    }

    public static void onResume(android.app.Activity activity) {
        com.json.wj wjVar = b;
        if (wjVar == null) {
            return;
        }
        wjVar.onResume(activity);
    }

    public static synchronized void release(android.app.Activity activity) {
        com.json.wj wjVar = b;
        if (wjVar == null) {
            return;
        }
        wjVar.a(activity);
    }

    public static synchronized void showAd(android.app.Activity activity, com.json.mj mjVar, java.util.Map<java.lang.String, java.lang.String> map) throws java.lang.Exception {
        a();
        b.a(activity, mjVar, map);
    }

    public static synchronized void updateInitFailed(com.json.ah ahVar) {
        d = new com.json.zj(ahVar);
        java.util.Iterator<com.json.jo> it = c.iterator();
        while (it.hasNext()) {
            it.next().onFail(ahVar);
        }
        c.clear();
    }

    public static synchronized void updateInitSucceeded() {
        d = new com.json.zj();
        java.util.Iterator<com.json.jo> it = c.iterator();
        while (it.hasNext()) {
            it.next().onSuccess();
        }
        c.clear();
    }
}
