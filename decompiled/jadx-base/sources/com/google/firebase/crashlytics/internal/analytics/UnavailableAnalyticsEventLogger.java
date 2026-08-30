package com.google.firebase.crashlytics.internal.analytics;

/* JADX INFO: loaded from: classes5.dex */
public class UnavailableAnalyticsEventLogger implements com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger {
    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(java.lang.String str, android.os.Bundle bundle) {
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
    }
}
