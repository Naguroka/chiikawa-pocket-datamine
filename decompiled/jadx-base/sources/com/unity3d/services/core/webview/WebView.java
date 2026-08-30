package com.unity3d.services.core.webview;

/* JADX INFO: compiled from: WebView.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0019H\u0016R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/unity3d/services/core/webview/WebView;", "Landroid/webkit/WebView;", "Lcom/unity3d/services/core/di/IServiceComponent;", "context", "Landroid/content/Context;", "shouldNotRequireGesturePlayback", "", "webViewBridge", "Lcom/unity3d/services/core/webview/bridge/IWebViewBridge;", "callbackInvoker", "Lcom/unity3d/services/core/webview/bridge/IInvocationCallbackInvoker;", com.json.pr.d, "Lcom/unity3d/services/core/configuration/IExperiments;", "(Landroid/content/Context;ZLcom/unity3d/services/core/webview/bridge/IWebViewBridge;Lcom/unity3d/services/core/webview/bridge/IInvocationCallbackInvoker;Lcom/unity3d/services/core/configuration/IExperiments;)V", "sdkMetricsSender", "Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "getSdkMetricsSender", "()Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "sdkMetricsSender$delegate", "Lkotlin/Lazy;", "webViewBridgeInterface", "Lcom/unity3d/services/core/webview/bridge/WebViewBridgeInterface;", "evaluateJavascript", "", "script", "", "resultCallback", "Landroid/webkit/ValueCallback;", "loadUrl", "url", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class WebView extends android.webkit.WebView implements com.unity3d.services.core.di.IServiceComponent {

    /* JADX INFO: renamed from: sdkMetricsSender$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy sdkMetricsSender;
    private final com.unity3d.services.core.webview.bridge.WebViewBridgeInterface webViewBridgeInterface;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(android.content.Context context) {
        this(context, false, null, null, null, 30, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(android.content.Context context, boolean z) {
        this(context, z, null, null, null, 28, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(android.content.Context context, boolean z, com.unity3d.services.core.webview.bridge.IWebViewBridge webViewBridge) {
        this(context, z, webViewBridge, null, null, 24, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewBridge, "webViewBridge");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(android.content.Context context, boolean z, com.unity3d.services.core.webview.bridge.IWebViewBridge webViewBridge, com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker callbackInvoker) {
        this(context, z, webViewBridge, callbackInvoker, null, 16, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewBridge, "webViewBridge");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackInvoker, "callbackInvoker");
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public com.unity3d.services.core.di.IServiceProvider getServiceProvider() {
        return com.unity3d.services.core.di.IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public /* synthetic */ WebView(android.content.Context context, boolean z, com.unity3d.services.core.webview.bridge.IWebViewBridge iWebViewBridge, com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker iInvocationCallbackInvoker, com.unity3d.services.core.configuration.Experiments experiments, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? false : z, (i & 4) != 0 ? com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE.getWebViewBridge() : iWebViewBridge, (i & 8) != 0 ? com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker() : iInvocationCallbackInvoker, (i & 16) != 0 ? new com.unity3d.services.core.configuration.Experiments() : experiments);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebView(android.content.Context context, boolean z, com.unity3d.services.core.webview.bridge.IWebViewBridge webViewBridge, com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker callbackInvoker, com.unity3d.services.core.configuration.IExperiments experiments) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewBridge, "webViewBridge");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackInvoker, "callbackInvoker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experiments, "experiments");
        final com.unity3d.services.core.webview.WebView webView = this;
        final java.lang.String str = "";
        this.sdkMetricsSender = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.services.core.request.metrics.SDKMetricsSender>() { // from class: com.unity3d.services.core.webview.WebView$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.services.core.request.metrics.SDKMetricsSender, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.services.core.request.metrics.SDKMetricsSender invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = webView;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.request.metrics.SDKMetricsSender.class));
            }
        });
        final com.unity3d.services.core.webview.bridge.WebViewBridgeInterface webViewBridgeInterface = new com.unity3d.services.core.webview.bridge.WebViewBridgeInterface(webViewBridge, callbackInvoker);
        this.webViewBridgeInterface = webViewBridgeInterface;
        android.webkit.WebSettings settings = getSettings();
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setAllowFileAccess(true);
        settings.setBlockNetworkImage(false);
        settings.setBlockNetworkLoads(false);
        settings.setBuiltInZoomControls(false);
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(false);
        settings.setEnableSmoothTransition(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setJavaScriptEnabled(true);
        settings.setLightTouchEnabled(false);
        settings.setLoadWithOverviewMode(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setMixedContentMode(1);
        settings.setNeedInitialFocus(true);
        settings.setPluginState(android.webkit.WebSettings.PluginState.OFF);
        settings.setRenderPriority(android.webkit.WebSettings.RenderPriority.NORMAL);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(false);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(true);
        settings.setMediaPlaybackRequiresUserGesture(!z);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setInitialScale(0);
        setBackgroundColor(0);
        com.unity3d.services.core.misc.ViewUtilities.setBackground(this, new android.graphics.drawable.ColorDrawable(0));
        setBackgroundResource(0);
        boolean zIsWebMessageEnabled = experiments.isWebMessageEnabled();
        if (zIsWebMessageEnabled) {
            getSdkMetricsSender().sendMetric(com.unity3d.services.core.webview.WebViewMetricKt.webMessageListenerEnabledMetric());
        } else {
            getSdkMetricsSender().sendMetric(com.unity3d.services.core.webview.WebViewMetricKt.webMessageListenerDisabledMetric());
        }
        boolean zIsFeatureSupported = androidx.webkit.WebViewFeature.isFeatureSupported("WEB_MESSAGE_LISTENER");
        if (zIsFeatureSupported) {
            getSdkMetricsSender().sendMetric(com.unity3d.services.core.webview.WebViewMetricKt.webMessageListenerSupportedMetric());
        } else {
            getSdkMetricsSender().sendMetric(com.unity3d.services.core.webview.WebViewMetricKt.webMessageListenerUnsupportedMetric());
        }
        if (zIsWebMessageEnabled && zIsFeatureSupported) {
            com.unity3d.services.core.webview.WebView webView2 = this;
            androidx.webkit.WebViewCompat.addWebMessageListener(webView2, "handleInvocation", kotlin.collections.SetsKt.setOf(androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES), new androidx.webkit.WebViewCompat.WebMessageListener() { // from class: com.unity3d.services.core.webview.WebView$$ExternalSyntheticLambda0
                @Override // androidx.webkit.WebViewCompat.WebMessageListener
                public final void onPostMessage(android.webkit.WebView webView3, androidx.webkit.WebMessageCompat webMessageCompat, android.net.Uri uri, boolean z2, androidx.webkit.JavaScriptReplyProxy javaScriptReplyProxy) throws org.json.JSONException {
                    webViewBridgeInterface.onHandleInvocation(webView3, webMessageCompat, uri, z2, javaScriptReplyProxy);
                }
            });
            androidx.webkit.WebViewCompat.addWebMessageListener(webView2, "handleCallback", kotlin.collections.SetsKt.setOf(androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES), new androidx.webkit.WebViewCompat.WebMessageListener() { // from class: com.unity3d.services.core.webview.WebView$$ExternalSyntheticLambda1
                @Override // androidx.webkit.WebViewCompat.WebMessageListener
                public final void onPostMessage(android.webkit.WebView webView3, androidx.webkit.WebMessageCompat webMessageCompat, android.net.Uri uri, boolean z2, androidx.webkit.JavaScriptReplyProxy javaScriptReplyProxy) throws java.lang.Exception {
                    webViewBridgeInterface.onHandleCallback(webView3, webMessageCompat, uri, z2, javaScriptReplyProxy);
                }
            });
            return;
        }
        addJavascriptInterface(webViewBridgeInterface, "webviewbridge");
    }

    private final com.unity3d.services.core.request.metrics.SDKMetricsSender getSdkMetricsSender() {
        return (com.unity3d.services.core.request.metrics.SDKMetricsSender) this.sdkMetricsSender.getValue();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(final java.lang.String script, final android.webkit.ValueCallback<java.lang.String> resultCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(script, "script");
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.core.webview.WebView$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.unity3d.services.core.webview.WebView.evaluateJavascript$lambda$1(this.f$0, script, resultCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void evaluateJavascript$lambda$1(com.unity3d.services.core.webview.WebView this$0, java.lang.String script, android.webkit.ValueCallback valueCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(script, "$script");
        super.evaluateJavascript(script, valueCallback);
    }

    @Override // android.webkit.WebView
    public void loadUrl(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        com.unity3d.services.core.log.DeviceLog.debug("Loading url: " + url);
        super.loadUrl(url);
    }
}
