package com.google.firebase.crashlytics;

/* JADX INFO: loaded from: classes5.dex */
public class AnalyticsDeferredProxy {
    private final com.google.firebase.inject.Deferred<com.google.firebase.analytics.connector.AnalyticsConnector> analyticsConnectorDeferred;
    private volatile com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger analyticsEventLogger;
    private final java.util.List<com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler> breadcrumbHandlerList;
    private volatile com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource breadcrumbSource;

    public AnalyticsDeferredProxy(com.google.firebase.inject.Deferred<com.google.firebase.analytics.connector.AnalyticsConnector> deferred) {
        this(deferred, new com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource(), new com.google.firebase.crashlytics.internal.analytics.UnavailableAnalyticsEventLogger());
    }

    public AnalyticsDeferredProxy(com.google.firebase.inject.Deferred<com.google.firebase.analytics.connector.AnalyticsConnector> deferred, com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource breadcrumbSource, com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger analyticsEventLogger) {
        this.analyticsConnectorDeferred = deferred;
        this.breadcrumbSource = breadcrumbSource;
        this.breadcrumbHandlerList = new java.util.ArrayList();
        this.analyticsEventLogger = analyticsEventLogger;
        init();
    }

    public com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource getDeferredBreadcrumbSource() {
        return new com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource() { // from class: com.google.firebase.crashlytics.AnalyticsDeferredProxy$$ExternalSyntheticLambda0
            @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
            public final void registerBreadcrumbHandler(com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler breadcrumbHandler) {
                this.f$0.m829x77abb2bd(breadcrumbHandler);
            }
        };
    }

    /* JADX INFO: renamed from: lambda$getDeferredBreadcrumbSource$0$com-google-firebase-crashlytics-AnalyticsDeferredProxy, reason: not valid java name */
    /* synthetic */ void m829x77abb2bd(com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler breadcrumbHandler) {
        synchronized (this) {
            if (this.breadcrumbSource instanceof com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource) {
                this.breadcrumbHandlerList.add(breadcrumbHandler);
            }
            this.breadcrumbSource.registerBreadcrumbHandler(breadcrumbHandler);
        }
    }

    public com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger getAnalyticsEventLogger() {
        return new com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger() { // from class: com.google.firebase.crashlytics.AnalyticsDeferredProxy$$ExternalSyntheticLambda1
            @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
            public final void logEvent(java.lang.String str, android.os.Bundle bundle) {
                this.f$0.m828xdd1a3d95(str, bundle);
            }
        };
    }

    /* JADX INFO: renamed from: lambda$getAnalyticsEventLogger$1$com-google-firebase-crashlytics-AnalyticsDeferredProxy, reason: not valid java name */
    /* synthetic */ void m828xdd1a3d95(java.lang.String str, android.os.Bundle bundle) {
        this.analyticsEventLogger.logEvent(str, bundle);
    }

    private void init() {
        this.analyticsConnectorDeferred.whenAvailable(new com.google.firebase.inject.Deferred.DeferredHandler() { // from class: com.google.firebase.crashlytics.AnalyticsDeferredProxy$$ExternalSyntheticLambda2
            @Override // com.google.firebase.inject.Deferred.DeferredHandler
            public final void handle(com.google.firebase.inject.Provider provider) {
                this.f$0.m830xec284ea4(provider);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$init$2$com-google-firebase-crashlytics-AnalyticsDeferredProxy, reason: not valid java name */
    /* synthetic */ void m830xec284ea4(com.google.firebase.inject.Provider provider) {
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("AnalyticsConnector now available.");
        com.google.firebase.analytics.connector.AnalyticsConnector analyticsConnector = (com.google.firebase.analytics.connector.AnalyticsConnector) provider.get();
        com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger = new com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger(analyticsConnector);
        com.google.firebase.crashlytics.CrashlyticsAnalyticsListener crashlyticsAnalyticsListener = new com.google.firebase.crashlytics.CrashlyticsAnalyticsListener();
        if (subscribeToAnalyticsEvents(analyticsConnector, crashlyticsAnalyticsListener) != null) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().d("Registered Firebase Analytics listener.");
            com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver breadcrumbAnalyticsEventReceiver = new com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver();
            com.google.firebase.crashlytics.internal.analytics.BlockingAnalyticsEventLogger blockingAnalyticsEventLogger = new com.google.firebase.crashlytics.internal.analytics.BlockingAnalyticsEventLogger(crashlyticsOriginAnalyticsEventLogger, 500, java.util.concurrent.TimeUnit.MILLISECONDS);
            synchronized (this) {
                java.util.Iterator<com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler> it = this.breadcrumbHandlerList.iterator();
                while (it.hasNext()) {
                    breadcrumbAnalyticsEventReceiver.registerBreadcrumbHandler(it.next());
                }
                crashlyticsAnalyticsListener.setBreadcrumbEventReceiver(breadcrumbAnalyticsEventReceiver);
                crashlyticsAnalyticsListener.setCrashlyticsOriginEventReceiver(blockingAnalyticsEventLogger);
                this.breadcrumbSource = breadcrumbAnalyticsEventReceiver;
                this.analyticsEventLogger = blockingAnalyticsEventLogger;
            }
            return;
        }
        com.google.firebase.crashlytics.internal.Logger.getLogger().w("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    private static com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle subscribeToAnalyticsEvents(com.google.firebase.analytics.connector.AnalyticsConnector analyticsConnector, com.google.firebase.crashlytics.CrashlyticsAnalyticsListener crashlyticsAnalyticsListener) {
        com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle analyticsConnectorHandleRegisterAnalyticsConnectorListener = analyticsConnector.registerAnalyticsConnectorListener("clx", crashlyticsAnalyticsListener);
        if (analyticsConnectorHandleRegisterAnalyticsConnectorListener == null) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().d("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            analyticsConnectorHandleRegisterAnalyticsConnectorListener = analyticsConnector.registerAnalyticsConnectorListener(com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN, crashlyticsAnalyticsListener);
            if (analyticsConnectorHandleRegisterAnalyticsConnectorListener != null) {
                com.google.firebase.crashlytics.internal.Logger.getLogger().w("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return analyticsConnectorHandleRegisterAnalyticsConnectorListener;
    }
}
