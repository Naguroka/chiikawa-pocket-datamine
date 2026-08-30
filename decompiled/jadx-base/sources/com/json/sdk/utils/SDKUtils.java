package com.json.sdk.utils;

/* JADX INFO: loaded from: classes5.dex */
public class SDKUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f3405a = "SDKUtils";
    private static java.lang.String b = null;
    private static java.lang.String c = null;
    private static java.lang.String d = null;
    private static int e = 0;
    private static java.lang.String f = null;
    private static java.util.Map<java.lang.String, java.lang.String> g = null;
    private static java.lang.String h = "";
    private static final java.util.concurrent.atomic.AtomicInteger i = new java.util.concurrent.atomic.AtomicInteger(1);

    class a implements android.content.DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    private static int a() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        int i2;
        int i3;
        do {
            atomicInteger = i;
            i2 = atomicInteger.get();
            i3 = i2 + 1;
            if (i3 > 16777215) {
                i3 = 1;
            }
        } while (!atomicInteger.compareAndSet(i2, i3));
        return i2;
    }

    public static int convertDpToPx(int i2) {
        return (int) android.util.TypedValue.applyDimension(0, i2, android.content.res.Resources.getSystem().getDisplayMetrics());
    }

    public static int convertPxToDp(int i2) {
        return (int) android.util.TypedValue.applyDimension(1, i2, android.content.res.Resources.getSystem().getDisplayMetrics());
    }

    public static java.lang.String decodeString(java.lang.String str) {
        try {
            return java.net.URLDecoder.decode(str, com.adjust.sdk.Constants.ENCODING);
        } catch (java.io.UnsupportedEncodingException e2) {
            com.json.l9.d().a(e2);
            com.json.sdk.utils.Logger.d(f3405a, "Failed decoding string " + e2.getMessage());
            return "";
        }
    }

    public static int dpToPx(long j) {
        return (int) ((j * android.content.res.Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static java.lang.String encodeString(java.lang.String str) {
        try {
            return java.net.URLEncoder.encode(str, com.adjust.sdk.Constants.ENCODING).replace("+", "%20");
        } catch (java.io.UnsupportedEncodingException e2) {
            com.json.l9.d().a(e2);
            return "";
        }
    }

    public static byte[] encrypt(java.lang.String str) {
        java.security.MessageDigest messageDigest;
        try {
            messageDigest = java.security.MessageDigest.getInstance(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            try {
                messageDigest.reset();
                messageDigest.update(str.getBytes(com.adjust.sdk.Constants.ENCODING));
            } catch (java.io.UnsupportedEncodingException e2) {
                e = e2;
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            } catch (java.security.NoSuchAlgorithmException e3) {
                e = e3;
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
        } catch (java.io.UnsupportedEncodingException | java.security.NoSuchAlgorithmException e4) {
            e = e4;
            messageDigest = null;
        }
        if (messageDigest != null) {
            return messageDigest.digest();
        }
        return null;
    }

    public static java.lang.String fetchDemandSourceId(com.json.br brVar) {
        return fetchDemandSourceId(brVar.a());
    }

    public static java.lang.String fetchDemandSourceId(org.json.JSONObject jSONObject) {
        java.lang.String strOptString = jSONObject.optString("demandSourceId");
        return !android.text.TextUtils.isEmpty(strOptString) ? strOptString : jSONObject.optString("demandSourceName");
    }

    public static java.lang.String flatMapToJsonAsString(java.util.Map<java.lang.String, java.lang.String> map) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (map != null) {
            java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry<java.lang.String, java.lang.String> next = it.next();
                try {
                    jSONObject.putOpt(next.getKey(), encodeString(next.getValue()));
                } catch (org.json.JSONException e2) {
                    com.json.l9.d().a(e2);
                    com.json.sdk.utils.Logger.i(f3405a, "flatMapToJsonAsStringfailed " + e2.toString());
                }
                it.remove();
            }
        }
        return jSONObject.toString();
    }

    public static int generateViewId() {
        return android.view.View.generateViewId();
    }

    public static int getActivityUIFlags(boolean z) {
        return z ? 5894 : 1798;
    }

    public static java.lang.String getAdvertiserId() {
        return b;
    }

    public static java.lang.String getControllerConfig() {
        return f;
    }

    public static org.json.JSONObject getControllerConfigAsJSONObject() {
        try {
            return new org.json.JSONObject(getControllerConfig());
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            return new org.json.JSONObject();
        }
    }

    public static java.lang.String getControllerUrl() {
        return !android.text.TextUtils.isEmpty(d) ? d : "";
    }

    public static int getDebugMode() {
        return e;
    }

    public static java.lang.String getFileName(java.lang.String str) {
        java.lang.String[] strArrSplit = str.split(java.io.File.separator);
        try {
            return java.net.URLEncoder.encode(strArrSplit[strArrSplit.length - 1].split("\\?")[0], com.adjust.sdk.Constants.ENCODING);
        } catch (java.io.UnsupportedEncodingException e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            return null;
        }
    }

    public static java.util.Map<java.lang.String, java.lang.String> getInitSDKParams() {
        return g;
    }

    public static java.lang.String getLimitAdTracking() {
        return c;
    }

    public static java.lang.String getMD5(java.lang.String str) {
        try {
            java.lang.String string = new java.math.BigInteger(1, java.security.MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
            while (string.length() < 32) {
                string = "0" + string;
            }
            return string;
        } catch (java.security.NoSuchAlgorithmException e2) {
            com.json.l9.d().a(e2);
            throw new java.lang.RuntimeException(e2);
        }
    }

    public static int getMinOSVersionSupport() {
        return getControllerConfigAsJSONObject().optInt(com.ironsource.y8.d.b);
    }

    public static org.json.JSONObject getNetworkConfiguration() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            return getControllerConfigAsJSONObject().getJSONObject(com.ironsource.y8.a.b);
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            return jSONObject;
        }
    }

    public static org.json.JSONObject getOrientation(android.content.Context context) {
        com.json.Cif cifF = com.json.im.S().f();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("orientation", translateOrientation(cifF.F(context)));
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
        return jSONObject;
    }

    public static com.ironsource.zg.e getProductType(java.lang.String str) {
        com.ironsource.zg.e eVar = com.ironsource.zg.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        com.ironsource.zg.e eVar2 = com.ironsource.zg.e.Interstitial;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        return null;
    }

    public static java.lang.String getSDKVersion() {
        return "8.6.1";
    }

    public static java.lang.String getTesterParameters() {
        return h;
    }

    public static java.lang.String getValueFromJsonObject(java.lang.String str, java.lang.String str2) {
        try {
            return new org.json.JSONObject(str).getString(str2);
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            return null;
        }
    }

    public static boolean isApplicationVisible(android.content.Context context) {
        java.lang.String packageName = context.getPackageName();
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.processName.equalsIgnoreCase(packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExternalStorageAvailable() {
        try {
            java.lang.String externalStorageState = android.os.Environment.getExternalStorageState();
            return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            return false;
        }
    }

    public static boolean isIronSourceActivity(android.app.Activity activity) {
        return (activity instanceof com.json.sdk.controller.ControllerActivity) || (activity instanceof com.json.sdk.controller.OpenUrlActivity);
    }

    public static void loadGoogleAdvertiserInfo(android.content.Context context) {
        com.json.Cif cifF = com.json.im.S().f();
        java.lang.String strP = cifF.p(context);
        java.lang.String strA = cifF.a(context);
        if (!android.text.TextUtils.isEmpty(strP)) {
            b = strP;
        }
        if (android.text.TextUtils.isEmpty(strA)) {
            return;
        }
        c = strA;
    }

    public static java.util.Map<java.lang.String, java.lang.String> mergeHashMaps(java.util.Map<java.lang.String, java.lang.String>[] mapArr) {
        java.util.HashMap map = new java.util.HashMap();
        if (mapArr == null) {
            return map;
        }
        for (java.util.Map<java.lang.String, java.lang.String> map2 : mapArr) {
            if (map2 != null) {
                map.putAll(map2);
            }
        }
        return map;
    }

    public static org.json.JSONObject mergeJSONObjects(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) throws java.lang.Exception {
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (jSONObject != null) {
            jSONObject3 = new org.json.JSONObject(jSONObject.toString());
        }
        if (jSONObject2 != null) {
            jSONArray = jSONObject2.names();
        }
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                java.lang.String string = jSONArray.getString(i2);
                jSONObject3.putOpt(string, jSONObject2.opt(string));
            }
        }
        return jSONObject3;
    }

    public static int pxToDp(long j) {
        return (int) ((j / android.content.res.Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static java.lang.String requireNonEmptyOrNull(java.lang.String str, java.lang.String str2) {
        if (str != null) {
            return str;
        }
        throw new java.lang.NullPointerException(str2);
    }

    public static <T> T requireNonNull(T t, java.lang.String str) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(str);
    }

    public static void setControllerConfig(java.lang.String str) {
        f = str;
        com.json.im.M().n().a(getControllerConfigAsJSONObject());
    }

    public static void setControllerUrl(java.lang.String str) {
        d = str;
    }

    public static void setDebugMode(int i2) {
        e = i2;
    }

    public static void setInitSDKParams(java.util.Map<java.lang.String, java.lang.String> map) {
        g = map;
    }

    public static void setTesterParameters(java.lang.String str) {
        h = str;
    }

    public static void showNoInternetDialog(android.content.Context context) {
        new android.app.AlertDialog.Builder(context).setMessage("No Internet Connection").setPositiveButton("Ok", new com.ironsource.sdk.utils.SDKUtils.a()).show();
    }

    public static java.lang.String translateDeviceOrientation(int i2) {
        if (i2 != 1) {
            return i2 != 2 ? "none" : com.ironsource.y8.h.C;
        }
        return com.ironsource.y8.h.D;
    }

    public static java.lang.String translateOrientation(int i2) {
        if (i2 != 1) {
            return i2 != 2 ? "none" : com.ironsource.y8.h.C;
        }
        return com.ironsource.y8.h.D;
    }

    public static java.lang.String translateRequestedOrientation(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 11) {
                    if (i2 != 12) {
                        switch (i2) {
                            case 6:
                            case 8:
                                break;
                            case 7:
                            case 9:
                                break;
                            default:
                                return "none";
                        }
                    }
                }
            }
            return com.ironsource.y8.h.D;
        }
        return com.ironsource.y8.h.C;
    }

    public static void updateControllerConfig(java.lang.String str, org.json.JSONObject jSONObject) {
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(f);
            jSONObject2.put(str, jSONObject);
            f = jSONObject2.toString();
        } catch (org.json.JSONException e2) {
            com.json.l9.d().a(e2);
            com.json.sdk.utils.Logger.i(f3405a, "Unable to update controllerConfigs: " + e2.toString());
        }
    }
}
