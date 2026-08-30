package com.unity3d.services.ads.topics;

/* JADX INFO: compiled from: TopicsService.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/unity3d/services/ads/topics/TopicsService;", "", "context", "Landroid/content/Context;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "eventSender", "Lcom/unity3d/services/core/webview/bridge/IEventSender;", "(Landroid/content/Context;Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/services/core/webview/bridge/IEventSender;)V", "topicsManager", "Landroid/adservices/topics/TopicsManager;", "checkAvailability", "Lcom/unity3d/services/ads/topics/TopicsStatus;", "getTopics", "", "adsSdkName", "", "shouldRecordObservation", "", "getTopicsManager", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TopicsService {
    private final com.unity3d.services.core.domain.ISDKDispatchers dispatchers;
    private final com.unity3d.services.core.webview.bridge.IEventSender eventSender;
    private final android.adservices.topics.TopicsManager topicsManager;

    public TopicsService(android.content.Context context, com.unity3d.services.core.domain.ISDKDispatchers dispatchers, com.unity3d.services.core.webview.bridge.IEventSender eventSender) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventSender, "eventSender");
        this.dispatchers = dispatchers;
        this.eventSender = eventSender;
        this.topicsManager = getTopicsManager(context);
    }

    public final com.unity3d.services.ads.topics.TopicsStatus checkAvailability() {
        if (com.unity3d.services.core.device.Device.getApiLevel() < 33) {
            return com.unity3d.services.ads.topics.TopicsStatus.ERROR_API_BELOW_33;
        }
        if (android.os.ext.SdkExtensions.getExtensionVersion(1000000) < 4) {
            return com.unity3d.services.ads.topics.TopicsStatus.ERROR_EXTENSION_BELOW_4;
        }
        if (this.topicsManager == null) {
            return com.unity3d.services.ads.topics.TopicsStatus.ERROR_TOPICSMANAGER_NULL;
        }
        if (!android.adservices.AdServicesState.isAdServicesStateEnabled()) {
            return com.unity3d.services.ads.topics.TopicsStatus.ERROR_AD_SERVICES_DISABLED;
        }
        return com.unity3d.services.ads.topics.TopicsStatus.TOPICS_AVAILABLE;
    }

    public final void getTopics(java.lang.String adsSdkName, boolean shouldRecordObservation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adsSdkName, "adsSdkName");
        com.unity3d.services.ads.topics.TopicsReceiver topicsReceiver = new com.unity3d.services.ads.topics.TopicsReceiver(this.eventSender);
        android.adservices.topics.GetTopicsRequest getTopicsRequestBuild = new android.adservices.topics.GetTopicsRequest.Builder().setAdsSdkName(adsSdkName).setShouldRecordObservation(shouldRecordObservation).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(getTopicsRequestBuild, "Builder().setAdsSdkName(…ecordObservation).build()");
        try {
            android.adservices.topics.TopicsManager topicsManager = this.topicsManager;
            if (topicsManager != null) {
                topicsManager.getTopics(getTopicsRequestBuild, kotlinx.coroutines.ExecutorsKt.asExecutor(this.dispatchers.getDefault()), topicsReceiver);
            }
        } catch (java.lang.Exception e) {
            this.eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.TOPICS, com.unity3d.services.ads.topics.TopicsEvents.NOT_AVAILABLE, com.unity3d.services.ads.topics.TopicsErrors.ERROR_EXCEPTION, e.toString());
            com.unity3d.services.core.log.DeviceLog.debug("Failed to get topics with error: " + e);
        }
    }

    private final android.adservices.topics.TopicsManager getTopicsManager(android.content.Context context) {
        if (com.unity3d.services.core.device.Device.getApiLevel() >= 33 && android.os.ext.SdkExtensions.getExtensionVersion(1000000) >= 4) {
            return (android.adservices.topics.TopicsManager) context.getSystemService(android.adservices.topics.TopicsManager.class);
        }
        return null;
    }
}
