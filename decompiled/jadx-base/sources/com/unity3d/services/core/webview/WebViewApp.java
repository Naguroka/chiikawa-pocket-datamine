package com.unity3d.services.core.webview;

/* JADX INFO: loaded from: classes6.dex */
public class WebViewApp implements com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker {
    private static final int INVOKE_JS_CHARS_LENGTH = 22;
    private static android.os.ConditionVariable _conditionVariable;
    private static com.unity3d.services.core.webview.WebViewApp _currentApp;
    private com.unity3d.services.core.configuration.Configuration _configuration;
    private final java.util.HashMap<java.lang.String, com.unity3d.services.core.webview.bridge.NativeCallback> _nativeCallbacks;
    private boolean _webAppLoaded;
    private com.unity3d.services.core.webview.WebView _webView;
    protected final com.unity3d.services.core.webview.bridge.IWebViewBridge _webViewBridge;
    private static final java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> _initialized = new java.util.concurrent.atomic.AtomicReference<>(false);
    private static final java.util.concurrent.atomic.AtomicReference<java.lang.String> _webAppFailureMessage = new java.util.concurrent.atomic.AtomicReference<>();
    private static final java.util.concurrent.atomic.AtomicReference<java.lang.Integer> _webAppFailureCode = new java.util.concurrent.atomic.AtomicReference<>();

    private WebViewApp(com.unity3d.services.core.configuration.Configuration configuration, boolean z, boolean z2) {
        this(configuration, z, z2, com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE.getWebViewBridge());
    }

    private WebViewApp(com.unity3d.services.core.configuration.Configuration configuration, boolean z, boolean z2, com.unity3d.services.core.webview.bridge.IWebViewBridge iWebViewBridge) {
        com.unity3d.services.core.webview.WebView webView;
        this._webAppLoaded = false;
        this._nativeCallbacks = new java.util.HashMap<>();
        setConfiguration(configuration);
        com.unity3d.services.core.webview.bridge.WebViewBridge.setClassTable(getConfiguration().getWebAppApiClassList());
        com.unity3d.services.core.configuration.IExperiments experiments = configuration.getExperiments();
        this._webViewBridge = iWebViewBridge;
        if (z) {
            webView = new com.unity3d.services.core.webview.WebViewWithCache(com.unity3d.services.core.properties.ClientProperties.getApplicationContext(), z2, experiments);
        } else {
            webView = new com.unity3d.services.core.webview.WebView(com.unity3d.services.core.properties.ClientProperties.getApplicationContext(), z2, com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE.getWebViewBridge(), com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker(), experiments);
        }
        this._webView = webView;
        webView.setWebViewClient(new com.unity3d.services.core.webview.WebViewApp.WebAppClient());
    }

    public WebViewApp() {
        this._webAppLoaded = false;
        this._nativeCallbacks = new java.util.HashMap<>();
        com.unity3d.services.core.webview.bridge.WebViewBridge.setClassTable(new java.lang.Class[0]);
        this._webViewBridge = com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE.getWebViewBridge();
        _conditionVariable = new android.os.ConditionVariable();
    }

    public void setWebAppLoaded(boolean z) {
        this._webAppLoaded = z;
    }

    public boolean isWebAppLoaded() {
        return this._webAppLoaded;
    }

    public void setWebAppFailureMessage(java.lang.String str) {
        _webAppFailureMessage.set(str);
    }

    public void setWebAppFailureCode(int i) {
        _webAppFailureCode.set(java.lang.Integer.valueOf(i));
    }

    public java.lang.String getWebAppFailureMessage() {
        return _webAppFailureMessage.get();
    }

    public int getWebAppFailureCode() {
        return _webAppFailureCode.get().intValue();
    }

    public void setWebAppInitialized(boolean z) {
        _initialized.set(java.lang.Boolean.valueOf(z));
        _conditionVariable.open();
    }

    public void resetWebViewAppInitialization() {
        this._webAppLoaded = false;
        _webAppFailureCode.set(-1);
        _webAppFailureMessage.set("");
        _initialized.set(false);
    }

    public boolean isWebAppInitialized() {
        return _initialized.get().booleanValue();
    }

    public com.unity3d.services.core.webview.WebView getWebView() {
        return this._webView;
    }

    public void setWebView(com.unity3d.services.core.webview.WebView webView) {
        this._webView = webView;
    }

    public com.unity3d.services.core.configuration.Configuration getConfiguration() {
        return this._configuration;
    }

    public void setConfiguration(com.unity3d.services.core.configuration.Configuration configuration) {
        this._configuration = configuration;
    }

    private void invokeJavascriptMethod(java.lang.String str, java.lang.String str2, org.json.JSONArray jSONArray) {
        java.lang.String strBuildInvokeJavascript = buildInvokeJavascript(str, str2, jSONArray);
        com.unity3d.services.core.log.DeviceLog.debug("Invoking javascript: %s", strBuildInvokeJavascript);
        getWebView().evaluateJavascript(strBuildInvokeJavascript, null);
    }

    private java.lang.String buildInvokeJavascript(java.lang.String str, java.lang.String str2, org.json.JSONArray jSONArray) {
        java.lang.String string = jSONArray.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 22 + str2.length() + string.length());
        sb.append("javascript:window.");
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        sb.append("(");
        sb.append(string);
        sb.append(");");
        return sb.toString();
    }

    public boolean sendEvent(java.lang.Enum r6, java.lang.Enum r7, java.lang.Object... objArr) {
        if (!isWebAppLoaded()) {
            com.unity3d.services.core.log.DeviceLog.debug("sendEvent ignored because web app is not loaded");
            return false;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put(r6.name());
        jSONArray.put(r7.name());
        for (java.lang.Object obj : objArr) {
            jSONArray.put(obj);
        }
        try {
            invokeJavascriptMethod("nativebridge", "handleEvent", jSONArray);
            return true;
        } catch (java.lang.Error unused) {
            com.unity3d.services.core.log.DeviceLog.error("Out of memory error while sending event to WebView");
            ((com.unity3d.services.core.request.metrics.SDKMetricsSender) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.request.metrics.SDKMetricsSender.class)).sendEvent("native_webview_oom", null, new java.util.HashMap<java.lang.String, java.lang.String>(r6, r7) { // from class: com.unity3d.services.core.webview.WebViewApp.1
                final /* synthetic */ java.lang.Enum val$eventCategory;
                final /* synthetic */ java.lang.Enum val$eventId;

                {
                    this.val$eventCategory = r6;
                    this.val$eventId = r7;
                    put("src", "handleEvent");
                    put("eventCategory", r6.name());
                    put("eventId", r7.name());
                }
            });
            return false;
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Error while sending event to WebView", e);
            return false;
        }
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker
    public boolean invokeMethod(java.lang.String str, java.lang.String str2, java.lang.reflect.Method method, java.lang.Object... objArr) {
        if (!isWebAppLoaded()) {
            com.unity3d.services.core.log.DeviceLog.debug("invokeMethod ignored because web app is not loaded");
            return false;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        if (method != null) {
            com.unity3d.services.core.webview.bridge.NativeCallback nativeCallback = new com.unity3d.services.core.webview.bridge.NativeCallback(method);
            addCallback(nativeCallback);
            jSONArray.put(nativeCallback.getId());
        } else {
            jSONArray.put((java.lang.Object) null);
        }
        if (objArr != null) {
            for (java.lang.Object obj : objArr) {
                jSONArray.put(obj);
            }
        }
        try {
            invokeJavascriptMethod("nativebridge", "handleInvocation", jSONArray);
            return true;
        } catch (java.lang.Error unused) {
            com.unity3d.services.core.log.DeviceLog.error("Out of memory error while handling invocation to WebView");
            ((com.unity3d.services.core.request.metrics.SDKMetricsSender) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.request.metrics.SDKMetricsSender.class)).sendEvent("native_webview_oom", null, new java.util.HashMap<java.lang.String, java.lang.String>(str, str2) { // from class: com.unity3d.services.core.webview.WebViewApp.2
                final /* synthetic */ java.lang.String val$className;
                final /* synthetic */ java.lang.String val$methodName;

                {
                    this.val$className = str;
                    this.val$methodName = str2;
                    put("src", "handleInvocation");
                    put("className", str);
                    put("methodName", str2);
                }
            });
            return false;
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Error invoking javascript method", e);
            return false;
        }
    }

    public boolean invokeCallback(com.unity3d.services.core.webview.bridge.Invocation invocation) {
        if (!isWebAppLoaded()) {
            com.unity3d.services.core.log.DeviceLog.debug("invokeBatchCallback ignored because web app is not loaded");
            return false;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.ArrayList<java.util.ArrayList<java.lang.Object>> responses = invocation.getResponses();
        if (responses != null && !responses.isEmpty()) {
            for (java.util.ArrayList<java.lang.Object> arrayList : responses) {
                com.unity3d.services.core.webview.bridge.CallbackStatus callbackStatus = (com.unity3d.services.core.webview.bridge.CallbackStatus) arrayList.get(0);
                java.lang.Enum r6 = (java.lang.Enum) arrayList.get(1);
                java.lang.Object[] objArr = (java.lang.Object[]) arrayList.get(2);
                java.lang.String str = (java.lang.String) objArr[0];
                java.lang.Object[] objArrCopyOfRange = java.util.Arrays.copyOfRange(objArr, 1, objArr.length);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(str);
                arrayList2.add(callbackStatus.toString());
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                if (r6 != null) {
                    jSONArray2.put(r6.name());
                }
                for (java.lang.Object obj : objArrCopyOfRange) {
                    jSONArray2.put(obj);
                }
                arrayList2.add(jSONArray2);
                org.json.JSONArray jSONArray3 = new org.json.JSONArray();
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    jSONArray3.put(it.next());
                }
                jSONArray.put(jSONArray3);
            }
        }
        try {
            invokeJavascriptMethod("nativebridge", "handleCallback", jSONArray);
        } catch (java.lang.Error unused) {
            com.unity3d.services.core.log.DeviceLog.error("Out of memory error while invoking callback to WebView");
            ((com.unity3d.services.core.request.metrics.SDKMetricsSender) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.request.metrics.SDKMetricsSender.class)).sendEvent("native_webview_oom", null, new java.util.HashMap<java.lang.String, java.lang.String>(invocation) { // from class: com.unity3d.services.core.webview.WebViewApp.3
                final /* synthetic */ com.unity3d.services.core.webview.bridge.Invocation val$invocation;

                {
                    this.val$invocation = invocation;
                    put("src", "handleCallback");
                    put("invocation", invocation.toString());
                }
            });
            return false;
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Error while invoking batch response for WebView", e);
        }
        return true;
    }

    public void addCallback(com.unity3d.services.core.webview.bridge.NativeCallback nativeCallback) {
        synchronized (this._nativeCallbacks) {
            this._nativeCallbacks.put(nativeCallback.getId(), nativeCallback);
        }
    }

    public void removeCallback(com.unity3d.services.core.webview.bridge.NativeCallback nativeCallback) {
        synchronized (this._nativeCallbacks) {
            this._nativeCallbacks.remove(nativeCallback.getId());
        }
    }

    public com.unity3d.services.core.webview.bridge.NativeCallback getCallback(java.lang.String str) {
        com.unity3d.services.core.webview.bridge.NativeCallback nativeCallback;
        synchronized (this._nativeCallbacks) {
            nativeCallback = this._nativeCallbacks.get(str);
        }
        return nativeCallback;
    }

    public static com.unity3d.services.core.webview.WebViewApp getCurrentApp() {
        return _currentApp;
    }

    public static void setCurrentApp(com.unity3d.services.core.webview.WebViewApp webViewApp) {
        _currentApp = webViewApp;
    }

    public static com.unity3d.services.core.configuration.ErrorState create(com.unity3d.services.core.configuration.Configuration configuration) throws java.lang.IllegalThreadStateException {
        return create(configuration, false);
    }

    public static com.unity3d.services.core.configuration.ErrorState create(final com.unity3d.services.core.configuration.Configuration configuration, boolean z) throws java.lang.IllegalThreadStateException {
        com.unity3d.services.core.log.DeviceLog.entered();
        if (z) {
            return createWithRemoteUrl(configuration);
        }
        if (java.lang.Thread.currentThread().equals(android.os.Looper.getMainLooper().getThread())) {
            throw new java.lang.IllegalThreadStateException("Cannot call create() from main thread!");
        }
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.core.webview.WebViewApp.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.unity3d.services.core.configuration.Configuration configuration2 = configuration;
                    com.unity3d.services.core.webview.WebViewApp webViewApp = new com.unity3d.services.core.webview.WebViewApp(configuration2, configuration2.getExperiments().isWebAssetAdCaching(), configuration.getExperiments().isWebGestureNotRequired());
                    webViewApp.getWebView().loadDataWithBaseURL(new com.unity3d.services.core.webview.WebViewUrlBuilder("file://" + com.unity3d.services.core.properties.SdkProperties.getLocalWebViewFile(), configuration).getUrlWithQueryString(), configuration.getWebViewData(), "text/html", com.adjust.sdk.Constants.ENCODING, null);
                    com.unity3d.services.core.webview.WebViewApp.setCurrentApp(webViewApp);
                } catch (java.lang.Exception e) {
                    com.unity3d.services.core.log.DeviceLog.error("Unity Ads SDK unable to create WebViewApp " + e.getMessage());
                    com.unity3d.services.core.webview.WebViewApp._conditionVariable.open();
                }
            }
        });
        android.os.ConditionVariable conditionVariable = new android.os.ConditionVariable();
        _conditionVariable = conditionVariable;
        boolean zBlock = conditionVariable.block(configuration.getWebViewAppCreateTimeout());
        boolean z2 = getCurrentApp() != null;
        if (zBlock && z2 && (z2 && getCurrentApp().isWebAppInitialized())) {
            return null;
        }
        if (!zBlock) {
            return com.unity3d.services.core.configuration.ErrorState.CreateWebviewTimeout;
        }
        if (getCurrentApp() == null) {
            return com.unity3d.services.core.configuration.ErrorState.CreateWebview;
        }
        return getCurrentApp().getErrorStateFromWebAppCode();
    }

    private static com.unity3d.services.core.configuration.ErrorState createWithRemoteUrl(final com.unity3d.services.core.configuration.Configuration configuration) {
        if (java.lang.Thread.currentThread().equals(android.os.Looper.getMainLooper().getThread())) {
            throw new java.lang.IllegalThreadStateException("Cannot call create() from main thread!");
        }
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.core.webview.WebViewApp.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.unity3d.services.core.configuration.Configuration configuration2 = configuration;
                    com.unity3d.services.core.webview.WebViewApp webViewApp = new com.unity3d.services.core.webview.WebViewApp(configuration2, true, configuration2.getExperiments().isWebGestureNotRequired());
                    webViewApp.getWebView().loadUrl(new com.unity3d.services.core.webview.WebViewUrlBuilder(configuration.getWebViewUrl(), configuration).getUrlWithQueryString());
                    com.unity3d.services.core.webview.WebViewApp.setCurrentApp(webViewApp);
                } catch (java.lang.Exception unused) {
                    com.unity3d.services.core.log.DeviceLog.error("Unity Ads SDK unable to create WebViewApp");
                    com.unity3d.services.core.webview.WebViewApp._conditionVariable.open();
                }
            }
        });
        android.os.ConditionVariable conditionVariable = new android.os.ConditionVariable();
        _conditionVariable = conditionVariable;
        boolean zBlock = conditionVariable.block(configuration.getWebViewAppCreateTimeout());
        boolean z = getCurrentApp() != null;
        if (zBlock && z && (z && getCurrentApp().isWebAppInitialized())) {
            return null;
        }
        if (!zBlock) {
            return com.unity3d.services.core.configuration.ErrorState.CreateWebviewTimeout;
        }
        if (getCurrentApp() == null) {
            return com.unity3d.services.core.configuration.ErrorState.CreateWebview;
        }
        return getCurrentApp().getErrorStateFromWebAppCode();
    }

    public com.unity3d.services.core.configuration.ErrorState getErrorStateFromWebAppCode() {
        int webAppFailureCode = getWebAppFailureCode();
        if (webAppFailureCode == 1) {
            return com.unity3d.services.core.configuration.ErrorState.CreateWebviewGameIdDisabled;
        }
        if (webAppFailureCode == 2) {
            return com.unity3d.services.core.configuration.ErrorState.CreateWebviewConfigError;
        }
        if (webAppFailureCode == 3) {
            return com.unity3d.services.core.configuration.ErrorState.CreateWebviewInvalidArgument;
        }
        return com.unity3d.services.core.configuration.ErrorState.CreateWebview;
    }

    private static class WebAppClient extends android.webkit.WebViewClient {
        private WebAppClient() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
            com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.core.webview.WebViewApp.WebAppClient.1
                @Override // java.lang.Runnable
                public void run() {
                    if (com.unity3d.services.ads.api.AdUnit.getAdUnitActivity() != null) {
                        com.unity3d.services.ads.api.AdUnit.getAdUnitActivity().finish();
                    }
                    if (com.unity3d.services.core.webview.WebViewApp.getCurrentApp() != null && com.unity3d.services.core.webview.WebViewApp.getCurrentApp().getWebView() != null) {
                        com.unity3d.services.core.misc.ViewUtilities.removeViewFromParent(com.unity3d.services.core.webview.WebViewApp.getCurrentApp().getWebView());
                    }
                    com.unity3d.services.core.configuration.InitializeThread.reset();
                }
            });
            com.unity3d.services.core.log.DeviceLog.error("UnityAds SDK WebView render process gone with following reason : " + renderProcessGoneDetail.toString());
            ((com.unity3d.services.core.request.metrics.SDKMetricsSender) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.request.metrics.SDKMetricsSender.class)).sendEvent("native_webview_render_process_gone", null, new java.util.HashMap<java.lang.String, java.lang.String>(renderProcessGoneDetail) { // from class: com.unity3d.services.core.webview.WebViewApp.WebAppClient.2
                final /* synthetic */ android.webkit.RenderProcessGoneDetail val$detail;

                {
                    this.val$detail = renderProcessGoneDetail;
                    if (android.os.Build.VERSION.SDK_INT >= 26) {
                        put("dc", "" + renderProcessGoneDetail.didCrash());
                        put("pae", "" + renderProcessGoneDetail.rendererPriorityAtExit());
                    }
                }
            });
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
            super.onPageFinished(webView, str);
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads SDK finished loading URL inside WebView: " + str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads SDK attempts to load URL inside WebView: " + str);
            return false;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest != null && webResourceError != null) {
                com.unity3d.services.core.log.DeviceLog.error("Unity Ads SDK encountered an error (code: " + webResourceError.getErrorCode() + ")  in WebView while loading a resource " + webResourceRequest.getUrl());
            } else if (webResourceRequest != null) {
                com.unity3d.services.core.log.DeviceLog.error("Unity Ads SDK encountered an error in WebView while loading a resource " + webResourceRequest.getUrl());
            } else {
                com.unity3d.services.core.log.DeviceLog.error("Unity Ads SDK encountered an error in WebView while loading a resource");
            }
        }
    }
}
