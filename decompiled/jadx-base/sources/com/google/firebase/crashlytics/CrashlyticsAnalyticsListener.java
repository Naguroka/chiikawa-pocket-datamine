package com.google.firebase.crashlytics;

/* JADX INFO: loaded from: classes5.dex */
class CrashlyticsAnalyticsListener implements com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener {
    static final java.lang.String CRASHLYTICS_ORIGIN = "clx";
    static final java.lang.String EVENT_NAME_KEY = "name";
    static final java.lang.String EVENT_ORIGIN_KEY = "_o";
    static final java.lang.String EVENT_PARAMS_KEY = "params";
    private com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver breadcrumbEventReceiver;
    private com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver crashlyticsOriginEventReceiver;

    CrashlyticsAnalyticsListener() {
    }

    public void setCrashlyticsOriginEventReceiver(com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver analyticsEventReceiver) {
        this.crashlyticsOriginEventReceiver = analyticsEventReceiver;
    }

    public void setBreadcrumbEventReceiver(com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver analyticsEventReceiver) {
        this.breadcrumbEventReceiver = analyticsEventReceiver;
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener
    public void onMessageTriggered(int i, android.os.Bundle bundle) {
        java.lang.String string;
        com.google.firebase.crashlytics.internal.Logger.getLogger().v(java.lang.String.format(java.util.Locale.US, "Analytics listener received message. ID: %d, Extras: %s", java.lang.Integer.valueOf(i), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        android.os.Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new android.os.Bundle();
        }
        notifyEventReceivers(string, bundle2);
    }

    private void notifyEventReceivers(java.lang.String str, android.os.Bundle bundle) {
        com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver analyticsEventReceiver;
        if (CRASHLYTICS_ORIGIN.equals(bundle.getString(EVENT_ORIGIN_KEY))) {
            analyticsEventReceiver = this.crashlyticsOriginEventReceiver;
        } else {
            analyticsEventReceiver = this.breadcrumbEventReceiver;
        }
        notifyEventReceiver(analyticsEventReceiver, str, bundle);
    }

    private static void notifyEventReceiver(com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver analyticsEventReceiver, java.lang.String str, android.os.Bundle bundle) {
        if (analyticsEventReceiver == null) {
            return;
        }
        analyticsEventReceiver.onEvent(str, bundle);
    }
}
