package com.json.mediationsdk.utils;

/* JADX INFO: loaded from: classes5.dex */
public class IronSourceUtils {
    private static final java.lang.String DEFAULT_IS_EVENTS_FORMATTER_TYPE = "default_is_events_formatter_type";
    private static final java.lang.String DEFAULT_IS_EVENTS_URL = "default_is_events_url";
    private static final java.lang.String DEFAULT_IS_NON_CONNECTIVITY_EVENTS = "default_is_non_connectivity_events";
    private static final java.lang.String DEFAULT_IS_OPT_IN_EVENTS = "default_is_opt_in_events";
    private static final java.lang.String DEFAULT_IS_OPT_OUT_EVENTS = "default_is_opt_out_events";
    private static final java.lang.String DEFAULT_IS_TRIGGER_EVENTS = "default_is_trigger_events";
    private static final java.lang.String DEFAULT_PXL_EVENTS_URL = "default_pxl_events_url";
    private static final java.lang.String DEFAULT_PXL_TRIGGER_EVENTS = "default_pxl_trigger_events";
    private static final java.lang.String DEFAULT_RV_EVENTS_FORMATTER_TYPE = "default_rv_events_formatter_type";
    private static final java.lang.String DEFAULT_RV_EVENTS_URL = "default_rv_events_url";
    private static final java.lang.String DEFAULT_RV_NON_CONNECTIVITY_EVENTS = "default_rv_non_connectivity_events";
    private static final java.lang.String DEFAULT_RV_OPT_IN_EVENTS = "default_rv_opt_in_events";
    private static final java.lang.String DEFAULT_RV_OPT_OUT_EVENTS = "default_rv_opt_out_events";
    private static final java.lang.String DEFAULT_RV_TRIGGER_EVENTS = "default_rv_trigger_events";
    private static final java.lang.String FIRST_SESSION_TIMESTAMP = "firstSessionTimestamp";
    private static final java.lang.String GENERAL_PROPERTIES = "general_properties";
    private static final java.lang.String LAST_RESPONSE = "last_response";
    private static final java.lang.String PROVIDER_PRIORITY = "providerPriority";
    private static final java.lang.String SDK_VERSION = "8.6.1";
    private static final java.lang.String SHARED_PREFERENCES_NAME = "Mediation_Shared_Preferences";
    private static int serr = 1;
    private static java.util.concurrent.atomic.AtomicBoolean mDidCreateSessionID = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static java.lang.String mSessionId = null;
    private static java.lang.Boolean mFirstSession = null;
    private static com.json.mediationsdk.utils.IronSourceUtils instance = new com.json.mediationsdk.utils.IronSourceUtils();

    public static void createAndStartWorker(java.lang.Runnable runnable, java.lang.String str) {
        java.lang.Thread thread = new java.lang.Thread(runnable, str);
        thread.setUncaughtExceptionHandler(new com.json.mediationsdk.logger.d());
        thread.start();
    }

    public static org.json.JSONObject deepMergeJSONObjects(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) throws org.json.JSONException {
        org.json.JSONObject jSONObject3 = new org.json.JSONObject(jSONObject.toString());
        java.util.Iterator<java.lang.String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            java.lang.Object objDeepMergeJSONObjects = jSONObject2.get(next);
            if ((objDeepMergeJSONObjects instanceof org.json.JSONObject) && jSONObject3.optJSONObject(next) != null) {
                objDeepMergeJSONObjects = deepMergeJSONObjects(jSONObject3.getJSONObject(next), (org.json.JSONObject) objDeepMergeJSONObjects);
            }
            jSONObject3.put(next, objDeepMergeJSONObjects);
        }
        return jSONObject3;
    }

    public static boolean doesClassExist(java.lang.String str) {
        try {
            java.lang.Class.forName(str);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    private static java.util.Map<com.unity3d.mediation.LevelPlay.AdFormat, java.util.Map<java.lang.String, org.json.JSONObject>> getAdUnitIds() {
        java.util.HashMap map = new java.util.HashMap();
        try {
            com.json.al alVarA = com.json.im.S().t().a();
            if (alVarA == null) {
                return map;
            }
            for (com.unity3d.mediation.LevelPlay.AdFormat adFormat : com.unity3d.mediation.LevelPlay.AdFormat.values()) {
                java.util.HashMap map2 = new java.util.HashMap();
                map.put(adFormat, map2);
                for (java.lang.String str : alVarA.a(adFormat)) {
                    if (!str.equals(com.json.y3.e)) {
                        map2.put(str, new org.json.JSONObject());
                    }
                }
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("failed to get ad unit ids - exception = " + e);
        }
        return map;
    }

    public static java.lang.String getBase64Auth(java.lang.String str, java.lang.String str2) {
        return "Basic " + android.util.Base64.encodeToString((str + ":" + str2).getBytes(), 10);
    }

    public static boolean getBooleanFromSharedPrefs(android.content.Context context, java.lang.String str, boolean z) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getBoolean(str, z);
    }

    public static java.lang.String getConnectionType(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return "none";
            }
            if (networkCapabilities.hasTransport(1)) {
                return com.json.u8.b;
            }
            return networkCapabilities.hasTransport(0) ? com.json.u8.g : "none";
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.NATIVE.error("failed to connection type - exception = " + e);
            return "none";
        }
    }

    public static java.lang.String getCurrentMethodName() {
        try {
            return new java.lang.Throwable().getStackTrace()[1].getMethodName();
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            return "";
        }
    }

    public static int getCurrentTimestamp() {
        return (int) (java.lang.System.currentTimeMillis() / 1000);
    }

    public static synchronized java.lang.String getDefaultEventsFormatterType(android.content.Context context, java.lang.String str, java.lang.String str2) {
        try {
            str2 = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultFormatterTypeByEventType(str), str2);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultEventsFormatterType(eventType: " + str + ", defaultFormatterType:" + str2 + ")", e);
        }
        return str2;
    }

    public static synchronized java.lang.String getDefaultEventsURL(android.content.Context context, java.lang.String str, java.lang.String str2) {
        try {
            str2 = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultEventsUrlByEventType(str), str2);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultEventsURL(eventType: " + str + ", defaultEventsURL:" + str2 + ")", e);
        }
        return str2;
    }

    private static java.lang.String getDefaultEventsUrlByEventType(java.lang.String str) {
        if (com.json.mediationsdk.utils.IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return DEFAULT_IS_EVENTS_URL;
        }
        if (com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
            return DEFAULT_RV_EVENTS_URL;
        }
        return com.json.mediationsdk.utils.IronSourceConstants.PIXEL_EVENT_TYPE.equals(str) ? DEFAULT_PXL_EVENTS_URL : "";
    }

    private static java.lang.String getDefaultFormatterTypeByEventType(java.lang.String str) {
        if (com.json.mediationsdk.utils.IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return DEFAULT_IS_EVENTS_FORMATTER_TYPE;
        }
        return (com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) || com.json.mediationsdk.utils.IronSourceConstants.PIXEL_EVENT_TYPE.equals(str)) ? DEFAULT_RV_EVENTS_FORMATTER_TYPE : "";
    }

    public static synchronized int[] getDefaultNonConnectivityEvents(android.content.Context context, java.lang.String str) {
        int[] iArr;
        iArr = null;
        try {
            java.lang.String string = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultNonConnectivityEventsByEventType(str), null);
            if (!android.text.TextUtils.isEmpty(string)) {
                java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(string, ",");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (stringTokenizer.hasMoreTokens()) {
                    arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(stringTokenizer.nextToken())));
                }
                int size = arrayList.size();
                iArr = new int[size];
                for (int i = 0; i < size; i++) {
                    iArr[i] = ((java.lang.Integer) arrayList.get(i)).intValue();
                }
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultNonConnectivityEvents(eventType: " + str + ")", e);
        }
        return iArr;
    }

    private static java.lang.String getDefaultNonConnectivityEventsByEventType(java.lang.String str) {
        if (com.json.mediationsdk.utils.IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return DEFAULT_IS_NON_CONNECTIVITY_EVENTS;
        }
        return com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? DEFAULT_RV_NON_CONNECTIVITY_EVENTS : "";
    }

    public static synchronized int[] getDefaultOptInEvents(android.content.Context context, java.lang.String str) {
        int[] iArr;
        iArr = null;
        try {
            java.lang.String string = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultOptInEventsByEventType(str), null);
            if (!android.text.TextUtils.isEmpty(string)) {
                java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(string, ",");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (stringTokenizer.hasMoreTokens()) {
                    arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(stringTokenizer.nextToken())));
                }
                int size = arrayList.size();
                iArr = new int[size];
                for (int i = 0; i < size; i++) {
                    iArr[i] = ((java.lang.Integer) arrayList.get(i)).intValue();
                }
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultOptInEvents(eventType: " + str + ")", e);
        }
        return iArr;
    }

    private static java.lang.String getDefaultOptInEventsByEventType(java.lang.String str) {
        if (com.json.mediationsdk.utils.IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return DEFAULT_IS_OPT_IN_EVENTS;
        }
        return com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? DEFAULT_RV_OPT_IN_EVENTS : "";
    }

    public static synchronized int[] getDefaultOptOutEvents(android.content.Context context, java.lang.String str) {
        int[] iArr;
        iArr = null;
        try {
            java.lang.String string = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultOptOutEventsByEventType(str), null);
            if (!android.text.TextUtils.isEmpty(string)) {
                java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(string, ",");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (stringTokenizer.hasMoreTokens()) {
                    arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(stringTokenizer.nextToken())));
                }
                int size = arrayList.size();
                iArr = new int[size];
                for (int i = 0; i < size; i++) {
                    iArr[i] = ((java.lang.Integer) arrayList.get(i)).intValue();
                }
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultOptOutEvents(eventType: " + str + ")", e);
        }
        return iArr;
    }

    private static java.lang.String getDefaultOptOutEventsByEventType(java.lang.String str) {
        if (com.json.mediationsdk.utils.IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return DEFAULT_IS_OPT_OUT_EVENTS;
        }
        return com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) ? DEFAULT_RV_OPT_OUT_EVENTS : "";
    }

    public static synchronized int[] getDefaultTriggerEvents(android.content.Context context, java.lang.String str) {
        int[] iArr;
        iArr = null;
        try {
            java.lang.String string = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(getDefaultTriggerEventsByEventType(str), null);
            if (!android.text.TextUtils.isEmpty(string)) {
                java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(string, ",");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (stringTokenizer.hasMoreTokens()) {
                    arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(stringTokenizer.nextToken())));
                }
                int size = arrayList.size();
                iArr = new int[size];
                for (int i = 0; i < size; i++) {
                    iArr[i] = ((java.lang.Integer) arrayList.get(i)).intValue();
                }
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultTriggerEvents(eventType: " + str + ")", e);
        }
        return iArr;
    }

    private static java.lang.String getDefaultTriggerEventsByEventType(java.lang.String str) {
        if (com.json.mediationsdk.utils.IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return DEFAULT_IS_TRIGGER_EVENTS;
        }
        if (com.json.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
            return DEFAULT_RV_TRIGGER_EVENTS;
        }
        return com.json.mediationsdk.utils.IronSourceConstants.PIXEL_EVENT_TYPE.equals(str) ? DEFAULT_PXL_TRIGGER_EVENTS : "";
    }

    public static java.lang.String getDeviceType(android.content.Context context) {
        return com.json.im.S().f().r(context) ? "Tablet" : "Phone";
    }

    public static boolean getFirstSession(android.content.Context context) {
        if (mFirstSession == null) {
            mFirstSession = java.lang.Boolean.valueOf(!com.json.ni.a(context));
        }
        return mFirstSession.booleanValue();
    }

    public static com.json.mediationsdk.utils.IronSourceUtils getInstance() {
        return instance;
    }

    public static int getIntFromSharedPrefs(android.content.Context context, java.lang.String str, int i) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getInt(str, i);
    }

    public static com.json.rj getIronSourceAdvId(android.content.Context context) {
        java.lang.String str;
        com.json.Cif cifF = com.json.im.S().f();
        if (context == null) {
            return null;
        }
        java.lang.String strB = com.json.mediationsdk.p.m().b(context);
        if (android.text.TextUtils.isEmpty(strB)) {
            strB = cifF.K(context);
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 0);
            str = com.json.mediationsdk.utils.IronSourceConstants.TYPE_UUID;
        } else {
            str = com.json.mediationsdk.utils.IronSourceConstants.TYPE_GAID;
        }
        return new com.json.rj(strB, str);
    }

    public static org.json.JSONObject getJsonForMetaData(java.lang.String str, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i = 0;
            for (int i2 = 0; i < list.size() && i2 < list2.size(); i2++) {
                java.lang.String str2 = list.get(i);
                java.lang.String str3 = list2.get(i2);
                if (!android.text.TextUtils.isEmpty(str3) && !str2.equals(str3)) {
                    str2 = str2 + ";" + str3;
                }
                arrayList.add(str2);
                i++;
            }
            jSONObject.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, str + ";" + android.text.TextUtils.join(",", arrayList));
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
        }
        return jSONObject;
    }

    public static org.json.JSONObject getJsonForUserId(boolean z) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (z) {
                jSONObject.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, "dynamic");
            }
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
        }
        return jSONObject;
    }

    public static java.lang.String getLastResponse(android.content.Context context) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(LAST_RESPONSE, "");
    }

    public static long getLongFromSharedPrefs(android.content.Context context, java.lang.String str, long j) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getLong(str, j);
    }

    public static java.lang.String getMD5(java.lang.String str) {
        try {
            java.lang.String string = new java.math.BigInteger(1, java.security.MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
            while (string.length() < 32) {
                string = "0" + string;
            }
            return string;
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            if (str == null) {
                com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "getMD5(input:null)", th);
                return "";
            }
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "getMD5(input:" + str + ")", th);
            return "";
        }
    }

    public static org.json.JSONObject getMediationAdditionalData(boolean z) {
        return getMediationAdditionalData(z, false, 1);
    }

    public static org.json.JSONObject getMediationAdditionalData(boolean z, boolean z2, int i) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (z) {
                jSONObject.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            }
            if (z2 && i != -1) {
                jSONObject.put(com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROGRAMMATIC, i);
            }
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
        }
        return jSONObject;
    }

    public static java.lang.String getMediationUserId() {
        return com.json.zd.a().a("userId");
    }

    public static java.lang.String getSDKVersion() {
        return "8.6.1";
    }

    public static java.lang.String getSHA256(java.lang.String str) {
        try {
            return java.lang.String.format("%064x", new java.math.BigInteger(1, java.security.MessageDigest.getInstance("SHA-256").digest(str.getBytes())));
        } catch (java.security.NoSuchAlgorithmException e) {
            com.json.l9.d().a(e);
            if (str == null) {
                com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "getSHA256(input:null)", e);
                return "";
            }
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "getSHA256(input:" + str + ")", e);
            return "";
        }
    }

    public static int getSerr() {
        return serr;
    }

    public static synchronized java.lang.String getSessionId() {
        if (mDidCreateSessionID.compareAndSet(false, true)) {
            mSessionId = java.util.UUID.randomUUID().toString();
        }
        return mSessionId;
    }

    public static java.lang.String getStringFromSharedPrefs(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(str, str2);
    }

    public static long getTimestamp() {
        return java.lang.System.currentTimeMillis();
    }

    public static java.lang.String getTransId(long j, java.lang.String str) {
        return getSHA256(java.lang.String.format("%s%s%s", java.lang.Long.valueOf(j), com.json.mediationsdk.p.m().n(), str));
    }

    public static java.lang.String getUserIdForNetworks() {
        java.lang.String strA = com.json.zd.a().a("userId");
        if (android.text.TextUtils.isEmpty(strA)) {
            return null;
        }
        return strA;
    }

    public static boolean isEncryptedResponse() {
        return serr == 1;
    }

    public static boolean isGooglePlayInstalled(android.content.Context context) {
        return com.json.zo.d(context);
    }

    public static boolean isNetworkConnected(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.NATIVE.error("failed to check if network is connected - exception = " + e);
            return false;
        }
    }

    public static org.json.JSONObject mergeJsons(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        try {
            if (jSONObject == null && jSONObject2 == null) {
                return new org.json.JSONObject();
            }
            if (jSONObject == null) {
                return jSONObject2;
            }
            if (jSONObject2 == null) {
                return jSONObject;
            }
            java.util.Iterator<java.lang.String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                if (!jSONObject.has(next)) {
                    jSONObject.put(next, jSONObject2.get(next));
                }
            }
            return jSONObject;
        } catch (org.json.JSONException e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    public static java.util.List<android.util.Pair<java.lang.String, java.lang.String>> parseJsonToPairList(org.json.JSONObject jSONObject) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            if (jSONObject != org.json.JSONObject.NULL) {
                java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    java.lang.String next = itKeys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        arrayList.add(new android.util.Pair(next, jSONObject.get(next).toString()));
                    }
                }
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        return arrayList;
    }

    public static java.util.Map<java.lang.String, java.lang.String> parseJsonToStringMap(org.json.JSONObject jSONObject) {
        java.util.HashMap map = new java.util.HashMap();
        try {
            if (jSONObject != org.json.JSONObject.NULL) {
                java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    java.lang.String next = itKeys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        map.put(next, jSONObject.get(next).toString());
                    }
                }
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        return map;
    }

    public static void saveBooleanToSharedPrefs(android.content.Context context, java.lang.String str, boolean z) {
        android.content.SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        editorEdit.putBoolean(str, z);
        editorEdit.apply();
    }

    public static synchronized void saveDefaultEventsFormatterType(android.content.Context context, java.lang.String str, java.lang.String str2) {
        try {
            android.content.SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
            editorEdit.putString(getDefaultFormatterTypeByEventType(str), str2);
            editorEdit.apply();
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultEventsFormatterType(eventType: " + str + ", formatterType:" + str2 + ")", e);
        }
    }

    public static synchronized void saveDefaultEventsURL(android.content.Context context, java.lang.String str, java.lang.String str2) {
        try {
            android.content.SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
            editorEdit.putString(getDefaultEventsUrlByEventType(str), str2);
            editorEdit.apply();
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultEventsURL(eventType: " + str + ", eventsUrl:" + str2 + ")", e);
        }
    }

    public static synchronized void saveDefaultNonConnectivityEvents(android.content.Context context, java.lang.String str, int[] iArr) {
        java.lang.String string;
        try {
            android.content.SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
            if (iArr != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                for (int i : iArr) {
                    sb.append(i).append(",");
                }
                string = sb.toString();
            } else {
                string = null;
            }
            editorEdit.putString(getDefaultNonConnectivityEventsByEventType(str), string);
            editorEdit.apply();
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultNonConnectivityEvents(eventType: " + str + ", nonConnectivityEvents:" + iArr + ")", e);
        }
    }

    public static synchronized void saveDefaultOptInEvents(android.content.Context context, java.lang.String str, int[] iArr) {
        java.lang.String string;
        try {
            android.content.SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
            if (iArr != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                for (int i : iArr) {
                    sb.append(i).append(",");
                }
                string = sb.toString();
            } else {
                string = null;
            }
            editorEdit.putString(getDefaultOptInEventsByEventType(str), string);
            editorEdit.apply();
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptInEvents(eventType: " + str + ", optInEvents:" + iArr + ")", e);
        }
    }

    public static synchronized void saveDefaultOptOutEvents(android.content.Context context, java.lang.String str, int[] iArr) {
        java.lang.String string;
        try {
            android.content.SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
            if (iArr != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                for (int i : iArr) {
                    sb.append(i).append(",");
                }
                string = sb.toString();
            } else {
                string = null;
            }
            editorEdit.putString(getDefaultOptOutEventsByEventType(str), string);
            editorEdit.apply();
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptOutEvents(eventType: " + str + ", optOutEvents:" + iArr + ")", e);
        }
    }

    public static synchronized void saveDefaultTriggerEvents(android.content.Context context, java.lang.String str, int[] iArr) {
        java.lang.String string;
        try {
            android.content.SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
            if (iArr != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                for (int i : iArr) {
                    sb.append(i).append(",");
                }
                string = sb.toString();
            } else {
                string = null;
            }
            editorEdit.putString(getDefaultTriggerEventsByEventType(str), string);
            editorEdit.apply();
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultTriggerEvents(eventType: " + str + ", triggerEvents:" + iArr + ")", e);
        }
    }

    public static void saveIntToSharedPrefs(android.content.Context context, java.lang.String str, int i) {
        android.content.SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        editorEdit.putInt(str, i);
        editorEdit.apply();
    }

    public static synchronized void saveLastResponse(android.content.Context context, java.lang.String str) {
        android.content.SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        editorEdit.putString(LAST_RESPONSE, str);
        editorEdit.apply();
    }

    public static void saveLongToSharedPrefs(android.content.Context context, java.lang.String str, long j) {
        android.content.SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        editorEdit.putLong(str, j);
        editorEdit.apply();
    }

    public static void saveStringToSharedPrefs(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences.Editor editorEdit = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public static synchronized void sendAutomationLog(java.lang.String str) {
        com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "automation_log:" + java.lang.Long.toString(java.lang.System.currentTimeMillis()) + " text: " + str, 0);
    }

    private static void setSerr(int i) {
        serr = i;
    }
}
