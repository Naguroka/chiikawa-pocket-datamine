package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public class AdSDKNotificationManager {
    private static final java.util.List<com.facebook.ads.AdSDKNotificationListener> sNotificationListeners = java.util.Collections.synchronizedList(new java.util.ArrayList());

    public static void addSDKNotificationListener(com.facebook.ads.AdSDKNotificationListener adSDKNotificationListener) {
        java.util.List<com.facebook.ads.AdSDKNotificationListener> list = sNotificationListeners;
        synchronized (list) {
            list.add(adSDKNotificationListener);
        }
    }

    public static void removeSDKNotificationListener(com.facebook.ads.AdSDKNotificationListener adSDKNotificationListener) {
        java.util.List<com.facebook.ads.AdSDKNotificationListener> list = sNotificationListeners;
        synchronized (list) {
            list.remove(adSDKNotificationListener);
        }
    }

    public static java.util.List<com.facebook.ads.AdSDKNotificationListener> getNotificationListeners() {
        return sNotificationListeners;
    }
}
