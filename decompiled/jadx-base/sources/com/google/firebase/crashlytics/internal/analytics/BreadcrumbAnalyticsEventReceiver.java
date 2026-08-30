package com.google.firebase.crashlytics.internal.analytics;

/* JADX INFO: loaded from: classes5.dex */
public class BreadcrumbAnalyticsEventReceiver implements com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver, com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource {
    private static final java.lang.String BREADCRUMB_NAME_KEY = "name";
    private static final java.lang.String BREADCRUMB_PARAMS_KEY = "parameters";
    private static final java.lang.String BREADCRUMB_PREFIX = "$A$:";
    private com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler breadcrumbHandler;

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver
    public void onEvent(java.lang.String str, android.os.Bundle bundle) {
        com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler breadcrumbHandler = this.breadcrumbHandler;
        if (breadcrumbHandler != null) {
            try {
                breadcrumbHandler.handleBreadcrumb(BREADCRUMB_PREFIX + serializeEvent(str, bundle));
            } catch (org.json.JSONException unused) {
                com.google.firebase.crashlytics.internal.Logger.getLogger().w("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public void registerBreadcrumbHandler(com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler breadcrumbHandler) {
        this.breadcrumbHandler = breadcrumbHandler;
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    private static java.lang.String serializeEvent(java.lang.String str, android.os.Bundle bundle) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        for (java.lang.String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put(BREADCRUMB_PARAMS_KEY, jSONObject2);
        return jSONObject.toString();
    }
}
