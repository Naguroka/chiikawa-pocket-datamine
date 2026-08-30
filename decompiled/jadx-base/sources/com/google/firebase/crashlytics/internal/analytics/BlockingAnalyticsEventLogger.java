package com.google.firebase.crashlytics.internal.analytics;

/* JADX INFO: loaded from: classes5.dex */
public class BlockingAnalyticsEventLogger implements com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver, com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger {
    static final java.lang.String APP_EXCEPTION_EVENT_NAME = "_ae";
    private final com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger baseAnalyticsEventLogger;
    private java.util.concurrent.CountDownLatch eventLatch;
    private final java.util.concurrent.TimeUnit timeUnit;
    private final int timeout;
    private final java.lang.Object latchLock = new java.lang.Object();
    private boolean callbackReceived = false;

    public BlockingAnalyticsEventLogger(com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger, int i, java.util.concurrent.TimeUnit timeUnit) {
        this.baseAnalyticsEventLogger = crashlyticsOriginAnalyticsEventLogger;
        this.timeout = i;
        this.timeUnit = timeUnit;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(java.lang.String str, android.os.Bundle bundle) {
        synchronized (this.latchLock) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().v("Logging event " + str + " to Firebase Analytics with params " + bundle);
            this.eventLatch = new java.util.concurrent.CountDownLatch(1);
            this.callbackReceived = false;
            this.baseAnalyticsEventLogger.logEvent(str, bundle);
            com.google.firebase.crashlytics.internal.Logger.getLogger().v("Awaiting app exception callback from Analytics...");
            try {
                if (this.eventLatch.await(this.timeout, this.timeUnit)) {
                    this.callbackReceived = true;
                    com.google.firebase.crashlytics.internal.Logger.getLogger().v("App exception callback received from Analytics listener.");
                } else {
                    com.google.firebase.crashlytics.internal.Logger.getLogger().w("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            } catch (java.lang.InterruptedException unused) {
                com.google.firebase.crashlytics.internal.Logger.getLogger().e("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.eventLatch = null;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver
    public void onEvent(java.lang.String str, android.os.Bundle bundle) {
        java.util.concurrent.CountDownLatch countDownLatch = this.eventLatch;
        if (countDownLatch != null && APP_EXCEPTION_EVENT_NAME.equals(str)) {
            countDownLatch.countDown();
        }
    }

    boolean isCallbackReceived() {
        return this.callbackReceived;
    }
}
