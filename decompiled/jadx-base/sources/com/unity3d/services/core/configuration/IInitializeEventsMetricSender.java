package com.unity3d.services.core.configuration;

/* JADX INFO: loaded from: classes6.dex */
public interface IInitializeEventsMetricSender {
    java.lang.Long configRequestDuration();

    void didConfigRequestEnd(boolean z);

    void didConfigRequestStart();

    void didInitStart();

    void didPrivacyConfigRequestEnd(boolean z);

    void didPrivacyConfigRequestStart();

    java.lang.Long duration();

    java.util.Map<java.lang.String, java.lang.String> getRetryTags();

    java.lang.Long initializationStartTimeStamp();

    void onRetryConfig();

    void onRetryWebview();

    java.lang.Long privacyConfigDuration();

    void sdkDidInitialize();

    void sdkInitializeFailed(java.lang.String str, com.unity3d.services.core.configuration.ErrorState errorState);

    void sdkTokenDidBecomeAvailableWithConfig(boolean z);

    void sendMetric(com.unity3d.services.core.request.metrics.Metric metric);

    java.lang.Long tokenDuration();
}
