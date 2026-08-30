package com.unity3d.services.ads.measurements;

/* JADX INFO: compiled from: MeasurementsService.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0016\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/unity3d/services/ads/measurements/MeasurementsService;", "", "context", "Landroid/content/Context;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "eventSender", "Lcom/unity3d/services/core/webview/bridge/IEventSender;", "(Landroid/content/Context;Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/services/core/webview/bridge/IEventSender;)V", "measurementManager", "Landroid/adservices/measurement/MeasurementManager;", "checkAvailability", "", "getMeasurementManager", "registerClick", "url", "", "inputEvent", "Landroid/view/InputEvent;", "registerView", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MeasurementsService {
    private final com.unity3d.services.core.domain.ISDKDispatchers dispatchers;
    private final com.unity3d.services.core.webview.bridge.IEventSender eventSender;
    private final android.adservices.measurement.MeasurementManager measurementManager;

    public MeasurementsService(android.content.Context context, com.unity3d.services.core.domain.ISDKDispatchers dispatchers, com.unity3d.services.core.webview.bridge.IEventSender eventSender) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventSender, "eventSender");
        this.dispatchers = dispatchers;
        this.eventSender = eventSender;
        this.measurementManager = getMeasurementManager(context);
    }

    public final void checkAvailability() {
        if (com.unity3d.services.core.device.Device.getApiLevel() < 33) {
            this.eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.MEASUREMENTS, com.unity3d.services.ads.measurements.MeasurementsEvents.NOT_AVAILABLE, com.unity3d.services.ads.measurements.MeasurementsErrors.ERROR_API_BELOW_33);
            return;
        }
        if (android.os.ext.SdkExtensions.getExtensionVersion(1000000) < 4) {
            this.eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.MEASUREMENTS, com.unity3d.services.ads.measurements.MeasurementsEvents.NOT_AVAILABLE, com.unity3d.services.ads.measurements.MeasurementsErrors.ERROR_EXTENSION_BELOW_4);
            return;
        }
        if (this.measurementManager == null) {
            this.eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.MEASUREMENTS, com.unity3d.services.ads.measurements.MeasurementsEvents.NOT_AVAILABLE, com.unity3d.services.ads.measurements.MeasurementsErrors.ERROR_MANAGER_NULL);
        } else if (!android.adservices.AdServicesState.isAdServicesStateEnabled()) {
            this.eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.MEASUREMENTS, com.unity3d.services.ads.measurements.MeasurementsEvents.NOT_AVAILABLE, com.unity3d.services.ads.measurements.MeasurementsErrors.ERROR_AD_SERVICES_DISABLED);
        } else {
            this.measurementManager.getMeasurementApiStatus(kotlinx.coroutines.ExecutorsKt.asExecutor(this.dispatchers.getDefault()), new com.unity3d.services.ads.measurements.MeasurementsStatusReceiver(this.eventSender));
        }
    }

    public final void registerView(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        android.adservices.measurement.MeasurementManager measurementManager = this.measurementManager;
        if (measurementManager != null) {
            measurementManager.registerSource(android.net.Uri.parse(url), null, kotlinx.coroutines.ExecutorsKt.asExecutor(this.dispatchers.getDefault()), new com.unity3d.services.ads.measurements.MeasurementsReceiver(this.eventSender, com.unity3d.services.ads.measurements.MeasurementsEvents.VIEW_SUCCESSFUL, com.unity3d.services.ads.measurements.MeasurementsEvents.VIEW_ERROR));
        }
    }

    public final void registerClick(java.lang.String url, android.view.InputEvent inputEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputEvent, "inputEvent");
        android.adservices.measurement.MeasurementManager measurementManager = this.measurementManager;
        if (measurementManager != null) {
            measurementManager.registerSource(android.net.Uri.parse(url), inputEvent, kotlinx.coroutines.ExecutorsKt.asExecutor(this.dispatchers.getDefault()), new com.unity3d.services.ads.measurements.MeasurementsReceiver(this.eventSender, com.unity3d.services.ads.measurements.MeasurementsEvents.CLICK_SUCCESSFUL, com.unity3d.services.ads.measurements.MeasurementsEvents.CLICK_ERROR));
        }
    }

    private final android.adservices.measurement.MeasurementManager getMeasurementManager(android.content.Context context) {
        if (com.unity3d.services.core.device.Device.getApiLevel() >= 33 && android.os.ext.SdkExtensions.getExtensionVersion(1000000) >= 4) {
            return (android.adservices.measurement.MeasurementManager) context.getSystemService(android.adservices.measurement.MeasurementManager.class);
        }
        return null;
    }
}
