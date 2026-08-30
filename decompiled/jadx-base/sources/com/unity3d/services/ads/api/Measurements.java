package com.unity3d.services.ads.api;

/* JADX INFO: loaded from: classes6.dex */
public class Measurements {
    private static final com.unity3d.services.ads.measurements.MeasurementsService measurementsService = (com.unity3d.services.ads.measurements.MeasurementsService) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.ads.measurements.MeasurementsService.class);

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void checkAvailability(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        measurementsService.checkAvailability();
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void registerView(java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        measurementsService.registerView(str);
        webViewCallback.invoke(new java.lang.Object[0]);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void registerClick(java.lang.String str, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (com.unity3d.services.ads.api.AdUnit.getAdUnitActivity() == null) {
            webViewCallback.error(com.unity3d.services.ads.measurements.MeasurementsErrors.ERROR_AD_UNIT_NULL, new java.lang.Object[0]);
            return;
        }
        if (com.unity3d.services.ads.api.AdUnit.getAdUnitActivity().getLayout() == null) {
            webViewCallback.error(com.unity3d.services.ads.measurements.MeasurementsErrors.ERROR_LAYOUT_NULL, new java.lang.Object[0]);
            return;
        }
        android.view.InputEvent lastInputEvent = com.unity3d.services.ads.api.AdUnit.getAdUnitActivity().getLayout().getLastInputEvent();
        if (lastInputEvent == null) {
            webViewCallback.error(com.unity3d.services.ads.measurements.MeasurementsErrors.ERROR_LAST_INPUT_EVENT_NULL, new java.lang.Object[0]);
        } else {
            measurementsService.registerClick(str, lastInputEvent);
            webViewCallback.invoke(new java.lang.Object[0]);
        }
    }
}
