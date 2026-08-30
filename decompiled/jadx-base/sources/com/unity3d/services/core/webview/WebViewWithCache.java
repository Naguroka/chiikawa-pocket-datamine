package com.unity3d.services.core.webview;

/* JADX INFO: loaded from: classes6.dex */
public class WebViewWithCache extends com.unity3d.services.core.webview.WebView {
    public WebViewWithCache(android.content.Context context, boolean z, com.unity3d.services.core.configuration.IExperiments iExperiments) {
        this(context, z, com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE.getWebViewBridge(), com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker(), iExperiments);
    }

    public WebViewWithCache(android.content.Context context, boolean z, com.unity3d.services.core.webview.bridge.IWebViewBridge iWebViewBridge, com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker iInvocationCallbackInvoker, com.unity3d.services.core.configuration.IExperiments iExperiments) {
        super(context, z, iWebViewBridge, iInvocationCallbackInvoker, iExperiments);
        android.webkit.WebSettings settings = getSettings();
        settings.setCacheMode(-1);
        settings.setDomStorageEnabled(true);
        if (z) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
    }
}
