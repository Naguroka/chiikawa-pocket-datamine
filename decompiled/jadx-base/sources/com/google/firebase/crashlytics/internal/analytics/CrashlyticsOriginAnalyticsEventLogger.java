package com.google.firebase.crashlytics.internal.analytics;

/* JADX INFO: loaded from: classes5.dex */
public class CrashlyticsOriginAnalyticsEventLogger implements com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger {
    static final java.lang.String FIREBASE_ANALYTICS_ORIGIN_CRASHLYTICS = "clx";
    private final com.google.firebase.analytics.connector.AnalyticsConnector analyticsConnector;

    public CrashlyticsOriginAnalyticsEventLogger(com.google.firebase.analytics.connector.AnalyticsConnector analyticsConnector) {
        this.analyticsConnector = analyticsConnector;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(java.lang.String str, android.os.Bundle bundle) {
        this.analyticsConnector.logEvent(FIREBASE_ANALYTICS_ORIGIN_CRASHLYTICS, str, bundle);
    }
}
