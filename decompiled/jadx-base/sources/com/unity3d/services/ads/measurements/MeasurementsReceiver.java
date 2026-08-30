package com.unity3d.services.ads.measurements;

/* JADX INFO: compiled from: MeasurementsReceiver.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0003j\u0002`\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/unity3d/services/ads/measurements/MeasurementsReceiver;", "Landroid/os/OutcomeReceiver;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "eventSender", "Lcom/unity3d/services/core/webview/bridge/IEventSender;", "successEvent", "Lcom/unity3d/services/ads/measurements/MeasurementsEvents;", "errorEvent", "(Lcom/unity3d/services/core/webview/bridge/IEventSender;Lcom/unity3d/services/ads/measurements/MeasurementsEvents;Lcom/unity3d/services/ads/measurements/MeasurementsEvents;)V", "onError", "", "error", "onResult", "p0", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MeasurementsReceiver implements android.os.OutcomeReceiver<java.lang.Object, java.lang.Exception> {
    private final com.unity3d.services.ads.measurements.MeasurementsEvents errorEvent;
    private final com.unity3d.services.core.webview.bridge.IEventSender eventSender;
    private final com.unity3d.services.ads.measurements.MeasurementsEvents successEvent;

    public MeasurementsReceiver(com.unity3d.services.core.webview.bridge.IEventSender eventSender, com.unity3d.services.ads.measurements.MeasurementsEvents successEvent, com.unity3d.services.ads.measurements.MeasurementsEvents errorEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventSender, "eventSender");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successEvent, "successEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorEvent, "errorEvent");
        this.eventSender = eventSender;
        this.successEvent = successEvent;
        this.errorEvent = errorEvent;
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(java.lang.Object p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
        this.eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.MEASUREMENTS, this.successEvent, new java.lang.Object[0]);
    }

    @Override // android.os.OutcomeReceiver
    public void onError(java.lang.Exception error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.MEASUREMENTS, this.errorEvent, error.toString());
    }
}
