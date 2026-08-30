package com.unity3d.services.ads.operation;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AdModule<T extends com.unity3d.services.core.webview.bridge.IWebViewSharedObject, T2> extends com.unity3d.services.core.webview.bridge.WebViewBridgeSharedObjectStore<T> implements com.unity3d.services.ads.operation.IAdModule<T, T2> {
    protected java.util.concurrent.ExecutorService _executorService = com.unity3d.services.core.webview.bridge.invocation.WebViewBridgeInvocationSingleThreadedExecutor.getInstance().getExecutorService();
    protected com.unity3d.services.core.request.metrics.SDKMetricsSender _sdkMetrics;

    protected AdModule(com.unity3d.services.core.request.metrics.SDKMetricsSender sDKMetricsSender) {
        this._sdkMetrics = sDKMetricsSender;
    }

    @Override // com.unity3d.services.ads.operation.IAdModule
    public com.unity3d.services.core.request.metrics.SDKMetricsSender getMetricSender() {
        return this._sdkMetrics;
    }
}
