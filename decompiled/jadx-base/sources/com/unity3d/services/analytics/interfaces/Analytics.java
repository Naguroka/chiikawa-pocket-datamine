package com.unity3d.services.analytics.interfaces;

/* JADX INFO: loaded from: classes6.dex */
public class Analytics {
    public static void initialize(com.unity3d.services.analytics.interfaces.IAnalytics iAnalytics) {
        com.unity3d.services.analytics.core.api.Analytics.setAnalyticsInterface(iAnalytics);
    }
}
