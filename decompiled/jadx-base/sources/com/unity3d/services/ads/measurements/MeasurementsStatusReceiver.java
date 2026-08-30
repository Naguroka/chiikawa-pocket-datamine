package com.unity3d.services.ads.measurements;

/* JADX INFO: compiled from: MeasurementsStatusReceiver.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u0003j\u0002`\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/unity3d/services/ads/measurements/MeasurementsStatusReceiver;", "Landroid/os/OutcomeReceiver;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "eventSender", "Lcom/unity3d/services/core/webview/bridge/IEventSender;", "(Lcom/unity3d/services/core/webview/bridge/IEventSender;)V", "onError", "", "error", "onResult", "status", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MeasurementsStatusReceiver implements android.os.OutcomeReceiver<java.lang.Integer, java.lang.Exception> {
    private final com.unity3d.services.core.webview.bridge.IEventSender eventSender;

    public MeasurementsStatusReceiver(com.unity3d.services.core.webview.bridge.IEventSender eventSender) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventSender, "eventSender");
        this.eventSender = eventSender;
    }

    @Override // android.os.OutcomeReceiver
    public /* bridge */ /* synthetic */ void onResult(java.lang.Integer num) {
        onResult(num.intValue());
    }

    public void onResult(int status) {
        this.eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.MEASUREMENTS, com.unity3d.services.ads.measurements.MeasurementsEvents.AVAILABLE, java.lang.Integer.valueOf(status));
    }

    @Override // android.os.OutcomeReceiver
    public void onError(java.lang.Exception error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.MEASUREMENTS, com.unity3d.services.ads.measurements.MeasurementsEvents.NOT_AVAILABLE, com.unity3d.services.ads.measurements.MeasurementsErrors.ERROR_EXCEPTION, error.toString());
    }
}
