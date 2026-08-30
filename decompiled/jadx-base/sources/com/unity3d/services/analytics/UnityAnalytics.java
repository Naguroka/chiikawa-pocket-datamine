package com.unity3d.services.analytics;

/* JADX INFO: loaded from: classes6.dex */
public class UnityAnalytics {
    protected static org.json.JSONArray eventQueue = new org.json.JSONArray();

    private enum AnalyticsEventType {
        POSTEVENT
    }

    private static org.json.JSONObject createItemAcquired(java.lang.String str, java.lang.Float f, java.lang.String str2, java.lang.Float f2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.unity3d.services.analytics.AcquisitionType acquisitionType) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("currency_type", acquisitionType.toString());
        map.put("transaction_context", str);
        map.put("amount", f);
        map.put(com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_ID, str2);
        map.put("balance", f2);
        map.put("item_type", str3);
        map.put("level", str4);
        map.put("transaction_id", str5);
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("custom_params", map);
        map2.put("ts", 1533594423477L);
        map2.put("name", "item_acquired");
        java.util.HashMap map3 = new java.util.HashMap();
        map3.put("type", "analytics.custom.v1");
        map3.put(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, map2);
        return new org.json.JSONObject(map3);
    }

    private static org.json.JSONObject createItemSpent(java.lang.String str, java.lang.Float f, java.lang.String str2, java.lang.Float f2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.unity3d.services.analytics.AcquisitionType acquisitionType) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("currency_type", acquisitionType.toString());
        map.put("transaction_context", str);
        map.put("amount", f);
        map.put(com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_ID, str2);
        map.put("balance", f2);
        map.put("item_type", str3);
        map.put("level", str4);
        map.put("transaction_id", str5);
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("custom_params", map);
        map2.put("ts", java.lang.Long.valueOf(new java.util.Date().getTime()));
        map2.put("name", "item_spent");
        java.util.HashMap map3 = new java.util.HashMap();
        map3.put("type", "analytics.custom.v1");
        map3.put(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, map2);
        return new org.json.JSONObject(map3);
    }

    private static org.json.JSONObject createLevelFail(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("level_index", str);
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("custom_params", map);
        map2.put("ts", java.lang.Long.valueOf(new java.util.Date().getTime()));
        map2.put("name", "level_fail");
        java.util.HashMap map3 = new java.util.HashMap();
        map3.put("type", "analytics.custom.v1");
        map3.put(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, map2);
        return new org.json.JSONObject(map3);
    }

    private static org.json.JSONObject createLevelUp(java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("new_level_index", str);
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("custom_params", map);
        map2.put("ts", java.lang.Long.valueOf(new java.util.Date().getTime()));
        map2.put("name", com.google.firebase.analytics.FirebaseAnalytics.Event.LEVEL_UP);
        java.util.HashMap map3 = new java.util.HashMap();
        map3.put("type", "analytics.custom.v1");
        map3.put(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, map2);
        return new org.json.JSONObject(map3);
    }

    private static org.json.JSONObject createAdComplete(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("rewarded", bool);
        map.put("network", str);
        map.put(com.google.ads.mediation.facebook.FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, str2);
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("custom_params", map);
        map2.put("ts", java.lang.Long.valueOf(new java.util.Date().getTime()));
        map2.put("name", "ad_complete");
        java.util.HashMap map3 = new java.util.HashMap();
        map3.put("type", "analytics.custom.v1");
        map3.put(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, map2);
        return new org.json.JSONObject(map3);
    }

    private static org.json.JSONObject createIapTransaction(java.lang.String str, java.lang.Float f, java.lang.String str2, java.lang.Boolean bool, java.lang.String str3) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("ts", java.lang.Long.valueOf(new java.util.Date().getTime()));
        map.put("productid", str);
        map.put("amount", f);
        map.put("currency", str2);
        map.put(androidx.core.app.NotificationCompat.CATEGORY_PROMO, bool);
        map.put("receipt", str3);
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("type", "analytics.transaction.v1");
        map2.put(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, map);
        return new org.json.JSONObject(map2);
    }

    public static void onItemAcquired(java.lang.String str, java.lang.Float f, java.lang.String str2, java.lang.Float f2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.unity3d.services.analytics.AcquisitionType acquisitionType) {
        postEvent(createItemAcquired(str, f, str2, f2, str3, str4, str5, acquisitionType));
    }

    public static void onItemSpent(java.lang.String str, java.lang.Float f, java.lang.String str2, java.lang.Float f2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.unity3d.services.analytics.AcquisitionType acquisitionType) {
        postEvent(createItemSpent(str, f, str2, f2, str3, str4, str5, acquisitionType));
    }

    public static void onLevelFail(java.lang.String str) {
        postEvent(createLevelFail(str));
    }

    public static void onLevelUp(java.lang.String str) {
        postEvent(createLevelUp(str));
    }

    public static void onAdComplete(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        postEvent(createAdComplete(str, str2, bool));
    }

    public static void onIapTransaction(java.lang.String str, java.lang.Float f, java.lang.String str2, java.lang.Boolean bool, java.lang.String str3) {
        postEvent(createIapTransaction(str, f, str2, bool, str3));
    }

    public static void onEvent(org.json.JSONObject jSONObject) {
        postEvent(jSONObject);
    }

    private static synchronized void postEvent(org.json.JSONObject jSONObject) {
        if (eventQueue.length() < 200) {
            eventQueue.put(jSONObject);
        }
        com.unity3d.services.core.webview.WebViewApp currentApp = com.unity3d.services.core.webview.WebViewApp.getCurrentApp();
        if (currentApp != null && java.lang.Boolean.valueOf(currentApp.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.ANALYTICS, com.unity3d.services.analytics.UnityAnalytics.AnalyticsEventType.POSTEVENT, eventQueue.toString())).booleanValue()) {
            eventQueue = new org.json.JSONArray();
        }
    }
}
