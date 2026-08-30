package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidSendWebViewClientErrorDiagnostics.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidSendWebViewClientErrorDiagnostics;", "Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "", "errors", "", "Lcom/unity3d/ads/adplayer/model/WebViewClientError;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidSendWebViewClientErrorDiagnostics implements com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics {
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidSendWebViewClientErrorDiagnostics(com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    @Override // com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics
    public void invoke(java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError> errors) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errors, "errors");
        for (com.unity3d.ads.adplayer.model.WebViewClientError webViewClientError : errors) {
            java.lang.String url = webViewClientError.getUrl();
            java.util.Map mapMapOf = !(url == null || url.length() == 0) ? kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("webview_url", webViewClientError.getUrl())) : null;
            java.util.Map mapMutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("reason", java.lang.Integer.valueOf(webViewClientError.getReason().getCode())));
            if (webViewClientError.getStatusCode() != null) {
                mapMutableMapOf.put("webview_error_code", webViewClientError.getStatusCode());
            }
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "webview_error", null, mapMapOf, mapMutableMapOf, null, 18, null);
        }
    }
}
