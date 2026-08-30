package com.unity3d.services.ads.webplayer;

/* JADX INFO: loaded from: classes6.dex */
public class WebPlayerView extends android.webkit.WebView {
    private java.util.Map<java.lang.String, java.lang.String> _erroredSettings;
    private java.lang.reflect.Method _evaluateJavascript;
    private org.json.JSONObject _eventSettings;
    private java.lang.Runnable _unsubscribeLayoutChange;
    private java.lang.String viewId;

    public WebPlayerView(android.content.Context context, java.lang.String str, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        super(context);
        this._evaluateJavascript = null;
        this._unsubscribeLayoutChange = null;
        this.viewId = str;
        android.webkit.WebSettings settings = getSettings();
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        try {
            this._evaluateJavascript = android.webkit.WebView.class.getMethod("evaluateJavascript", java.lang.String.class, android.webkit.ValueCallback.class);
        } catch (java.lang.NoSuchMethodException e) {
            com.unity3d.services.core.log.DeviceLog.exception("Method evaluateJavascript not found", e);
            this._evaluateJavascript = null;
        }
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        settings.setDomStorageEnabled(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setPluginState(android.webkit.WebSettings.PluginState.OFF);
        settings.setRenderPriority(android.webkit.WebSettings.RenderPriority.NORMAL);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setInitialScale(0);
        setBackgroundColor(0);
        com.unity3d.services.core.misc.ViewUtilities.setBackground(this, new android.graphics.drawable.ColorDrawable(0));
        setBackgroundResource(0);
        setSettings(jSONObject, jSONObject2);
        setWebViewClient(new com.unity3d.services.ads.webplayer.WebPlayerView.WebPlayerClient());
        setWebChromeClient(new com.unity3d.services.ads.webplayer.WebPlayerView.WebPlayerChromeClient());
        setDownloadListener(new com.unity3d.services.ads.webplayer.WebPlayerView.WebPlayerDownloadListener());
        addJavascriptInterface(new com.unity3d.services.ads.webplayer.WebPlayerBridgeInterface(str), "webplayerbridge");
        com.unity3d.services.ads.webplayer.WebPlayerViewCache.getInstance().addWebPlayer(str, this);
        subscribeOnLayoutChange();
    }

    private void subscribeOnLayoutChange() {
        java.lang.Runnable runnable = this._unsubscribeLayoutChange;
        if (runnable != null) {
            runnable.run();
        }
        final android.view.View.OnLayoutChangeListener onLayoutChangeListener = new android.view.View.OnLayoutChangeListener() { // from class: com.unity3d.services.ads.webplayer.WebPlayerView.1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                com.unity3d.services.ads.webplayer.WebPlayerView.this.onLayoutChange();
            }
        };
        addOnLayoutChangeListener(onLayoutChangeListener);
        this._unsubscribeLayoutChange = new java.lang.Runnable() { // from class: com.unity3d.services.ads.webplayer.WebPlayerView.2
            @Override // java.lang.Runnable
            public void run() {
                com.unity3d.services.ads.webplayer.WebPlayerView.this.removeOnLayoutChangeListener(onLayoutChangeListener);
            }
        };
    }

    @Override // android.webkit.WebView
    public void destroy() {
        super.destroy();
        com.unity3d.services.ads.webplayer.WebPlayerViewCache.getInstance().removeWebPlayer(this.viewId);
        java.lang.Runnable runnable = this._unsubscribeLayoutChange;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void setEventSettings(org.json.JSONObject jSONObject) {
        this._eventSettings = jSONObject;
    }

    public void setSettings(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        java.util.Map<java.lang.String, java.lang.String> map = this._erroredSettings;
        if (map != null) {
            map.clear();
        }
        setTargetSettings(getSettings(), jSONObject);
        setTargetSettings(this, jSONObject2);
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        onLayoutChange();
    }

    public void onLayoutChange() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        com.unity3d.services.ads.webplayer.WebPlayerEventBridge.sendFrameUpdate(this.viewId, iArr[0], iArr[1], getWidth(), getHeight(), getAlpha());
    }

    public java.util.Map<java.lang.String, java.lang.String> getErroredSettings() {
        return this._erroredSettings;
    }

    private java.lang.Object setTargetSettings(java.lang.Object obj, org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                try {
                    org.json.JSONArray jSONArray = jSONObject.getJSONArray(next);
                    obj.getClass().getMethod(next, getTypes(jSONArray)).invoke(obj, getValues(jSONArray));
                } catch (java.lang.Exception e) {
                    addErroredSetting(next, e.getMessage());
                    com.unity3d.services.core.log.DeviceLog.exception("Setting errored", e);
                }
            }
        }
        return obj;
    }

    public void invokeJavascript(java.lang.String str) {
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new com.unity3d.services.ads.webplayer.WebPlayerView.JavaScriptInvocation(str, this));
    }

    public void sendEvent(org.json.JSONArray jSONArray) {
        invokeJavascript("javascript:window.nativebridge.receiveEvent(" + jSONArray.toString() + ")");
    }

    private class JavaScriptInvocation implements java.lang.Runnable {
        private java.lang.String _jsString;
        private android.webkit.WebView _webView;

        public JavaScriptInvocation(java.lang.String str, android.webkit.WebView webView) {
            this._jsString = str;
            this._webView = webView;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this._jsString != null) {
                try {
                    com.unity3d.services.ads.webplayer.WebPlayerView.this._evaluateJavascript.invoke(this._webView, this._jsString, null);
                    return;
                } catch (java.lang.Exception e) {
                    com.unity3d.services.core.log.DeviceLog.exception("Error while processing JavaScriptString", e);
                    return;
                }
            }
            com.unity3d.services.core.log.DeviceLog.error("Could not process JavaScript, the string is NULL");
        }
    }

    private java.lang.Class<?>[] getTypes(org.json.JSONArray jSONArray) throws org.json.JSONException, java.lang.ClassNotFoundException {
        if (jSONArray == null) {
            return null;
        }
        java.lang.Class<?>[] clsArr = new java.lang.Class[jSONArray.length()];
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                if (jSONArray.get(i) instanceof org.json.JSONObject) {
                    java.lang.Class<?> cls = java.lang.Class.forName(((org.json.JSONObject) jSONArray.get(i)).getString("className"));
                    if (cls != null) {
                        clsArr[i] = cls;
                    }
                } else {
                    clsArr[i] = getPrimitiveClass(jSONArray.get(i).getClass());
                }
            }
        }
        return clsArr;
    }

    public java.lang.Class<?> getPrimitiveClass(java.lang.Class<?> cls) {
        java.lang.String name = cls.getName();
        if (name.equals("java.lang.Byte")) {
            return java.lang.Byte.TYPE;
        }
        if (name.equals("java.lang.Short")) {
            return java.lang.Short.TYPE;
        }
        if (name.equals("java.lang.Integer")) {
            return java.lang.Integer.TYPE;
        }
        if (name.equals("java.lang.Long")) {
            return java.lang.Long.TYPE;
        }
        if (name.equals("java.lang.Character")) {
            return java.lang.Character.TYPE;
        }
        if (name.equals("java.lang.Float")) {
            return java.lang.Float.TYPE;
        }
        if (name.equals("java.lang.Double")) {
            return java.lang.Double.TYPE;
        }
        if (name.equals("java.lang.Boolean")) {
            return java.lang.Boolean.TYPE;
        }
        return name.equals("java.lang.Void") ? java.lang.Void.TYPE : cls;
    }

    private java.lang.Object[] getValues(org.json.JSONArray jSONArray) throws org.json.JSONException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
        java.lang.Class<?> cls;
        if (jSONArray == null) {
            return null;
        }
        java.lang.Object[] objArr = new java.lang.Object[jSONArray.length()];
        java.lang.Object[] objArr2 = new java.lang.Object[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.get(i) instanceof org.json.JSONObject) {
                org.json.JSONObject jSONObject = (org.json.JSONObject) jSONArray.get(i);
                java.lang.Object obj = jSONObject.get("value");
                java.lang.String string = jSONObject.getString("type");
                java.lang.String string2 = jSONObject.has("className") ? jSONObject.getString("className") : null;
                if (string2 != null && string.equals("Enum") && (cls = java.lang.Class.forName(string2)) != null) {
                    objArr2[i] = java.lang.Enum.valueOf(cls, (java.lang.String) obj);
                }
            } else {
                objArr2[i] = jSONArray.get(i);
            }
        }
        if (jSONArray != null) {
            java.lang.System.arraycopy(objArr2, 0, objArr, 0, jSONArray.length());
        }
        return objArr;
    }

    private void addErroredSetting(java.lang.String str, java.lang.String str2) {
        if (this._erroredSettings == null) {
            this._erroredSettings = new java.util.HashMap();
        }
        this._erroredSettings.put(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldCallSuper(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = this._eventSettings;
            if (jSONObject != null && jSONObject.has(str) && this._eventSettings.getJSONObject(str).has("callSuper")) {
                return this._eventSettings.getJSONObject(str).getBoolean("callSuper");
            }
            return true;
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Error getting super call status", e);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldSendEvent(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = this._eventSettings;
            if (jSONObject != null && jSONObject.has(str) && this._eventSettings.getJSONObject(str).has("sendEvent")) {
                return this._eventSettings.getJSONObject(str).getBoolean("sendEvent");
            }
            return false;
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Error getting send event status", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> T getReturnValue(java.lang.String str, java.lang.Class<T> cls, T t) {
        try {
            org.json.JSONObject jSONObject = this._eventSettings;
            if (jSONObject != null && jSONObject.has(str) && this._eventSettings.getJSONObject(str).has("returnValue")) {
                return cls.cast(this._eventSettings.getJSONObject(str).get("returnValue"));
            }
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Error getting default return value", e);
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasReturnValue(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = this._eventSettings;
            return jSONObject != null && jSONObject.has(str) && this._eventSettings.getJSONObject(str).has("returnValue");
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Error getting default return value", e);
            return false;
        }
    }

    private class WebPlayerClient extends android.webkit.WebViewClient {
        private WebPlayerClient() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(final android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
            com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.webplayer.WebPlayerView.WebPlayerClient.1
                @Override // java.lang.Runnable
                public void run() {
                    com.unity3d.services.core.misc.ViewUtilities.removeViewFromParent(webView);
                    webView.destroy();
                }
            });
            com.unity3d.services.ads.webplayer.WebPlayerEventBridge.error(com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId, com.unity3d.services.ads.webplayer.WebPlayerView.this.getUrl(), "UnityAds Sdk WebPlayer onRenderProcessGone : " + renderProcessGoneDetail.toString());
            com.unity3d.services.core.log.DeviceLog.error("UnityAds Sdk WebPlayer onRenderProcessGone : " + renderProcessGoneDetail.toString());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onPageStarted")) {
                super.onPageStarted(webView, str, bitmap);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onPageStarted")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.PAGE_STARTED, str, com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onPageFinished")) {
                super.onPageFinished(webView, str);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onPageFinished")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.PAGE_FINISHED, str, com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onReceivedError")) {
                super.onReceivedError(webView, i, str, str2);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onReceivedError")) {
                com.unity3d.services.ads.webplayer.WebPlayerEventBridge.error(com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId, str2, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onReceivedError")) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onReceivedError")) {
                java.lang.String string = "";
                java.lang.String string2 = (webResourceError == null || webResourceError.getDescription() == null) ? "" : webResourceError.getDescription().toString();
                if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    string = webResourceRequest.getUrl().toString();
                }
                com.unity3d.services.ads.webplayer.WebPlayerEventBridge.error(com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId, string, string2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onLoadResource")) {
                super.onLoadResource(webView, str);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onLoadResource")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.LOAD_RESOUCE, str, com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            if (sslError != null) {
                com.unity3d.services.core.log.DeviceLog.error("Received SSL error for '%s': %s", sslError.getUrl(), sslError.toString());
            } else {
                com.unity3d.services.core.log.DeviceLog.error("Received unknown SSL error: SslError was null");
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onReceivedSslError")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.SSL_ERROR, sslError != null ? sslError.getUrl() : "", com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedClientCertRequest(android.webkit.WebView webView, android.webkit.ClientCertRequest clientCertRequest) {
            java.lang.String host;
            int port;
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onReceivedClientCertRequest")) {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onReceivedClientCertRequest")) {
                if (clientCertRequest != null) {
                    host = clientCertRequest.getHost();
                    port = clientCertRequest.getPort();
                } else {
                    host = "";
                    port = -1;
                }
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.CLIENT_CERT_REQUEST, host, java.lang.Integer.valueOf(port), com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(android.webkit.WebView webView, android.webkit.HttpAuthHandler httpAuthHandler, java.lang.String str, java.lang.String str2) {
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onReceivedHttpAuthRequest")) {
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onReceivedHttpAuthRequest")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.HTTP_AUTH_REQUEST, str, str2, com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(android.webkit.WebView webView, float f, float f2) {
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onScaleChanged")) {
                super.onScaleChanged(webView, f, f2);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onScaleChanged")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.SCALE_CHANGED, java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2), com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedLoginRequest(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onReceivedLoginRequest")) {
                super.onReceivedLoginRequest(webView, str, str2, str3);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onReceivedLoginRequest")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.LOGIN_REQUEST, str, str2, str3, com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
            int i;
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onReceivedHttpError")) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onReceivedHttpError")) {
                java.lang.String str = "";
                java.lang.String string = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? "" : webResourceRequest.getUrl().toString();
                if (webResourceResponse != null) {
                    int statusCode = webResourceResponse.getStatusCode();
                    java.lang.String reasonPhrase = webResourceResponse.getReasonPhrase();
                    i = statusCode;
                    str = reasonPhrase;
                } else {
                    i = -1;
                }
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.HTTP_ERROR, string, str, java.lang.Integer.valueOf(i), com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
            java.lang.Boolean boolValueOf = false;
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("shouldOverrideUrlLoading")) {
                boolValueOf = java.lang.Boolean.valueOf(super.shouldOverrideUrlLoading(webView, webResourceRequest));
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("shouldOverrideUrlLoading")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.SHOULD_OVERRIDE_URL_LOADING, webResourceRequest.getUrl().toString(), webResourceRequest.getMethod(), com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.hasReturnValue("shouldOverrideUrlLoading")) {
                boolValueOf = (java.lang.Boolean) com.unity3d.services.ads.webplayer.WebPlayerView.this.getReturnValue("shouldOverrideUrlLoading", java.lang.Boolean.class, true);
            }
            return boolValueOf.booleanValue();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
            java.lang.Boolean boolValueOf = false;
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("shouldOverrideUrlLoading")) {
                boolValueOf = java.lang.Boolean.valueOf(super.shouldOverrideUrlLoading(webView, str));
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("shouldOverrideUrlLoading")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.SHOULD_OVERRIDE_URL_LOADING, str, com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.hasReturnValue("shouldOverrideUrlLoading")) {
                boolValueOf = (java.lang.Boolean) com.unity3d.services.ads.webplayer.WebPlayerView.this.getReturnValue("shouldOverrideUrlLoading", java.lang.Boolean.class, true);
            }
            return boolValueOf.booleanValue();
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(android.webkit.WebView webView, java.lang.String str) {
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onPageCommitVisible")) {
                super.onPageCommitVisible(webView, str);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onPageCommitVisible")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.PAGE_COMMIT_VISIBLE, str, com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebViewClient
        public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
            android.webkit.WebResourceResponse webResourceResponseShouldInterceptRequest = com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("shouldInterceptRequest") ? super.shouldInterceptRequest(webView, webResourceRequest) : null;
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("shouldInterceptRequest")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.SHOULD_INTERCEPT_REQUEST, webResourceRequest.getUrl().toString(), com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
            return webResourceResponseShouldInterceptRequest;
        }

        @Override // android.webkit.WebViewClient
        public void onFormResubmission(android.webkit.WebView webView, android.os.Message message, android.os.Message message2) {
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onFormResubmission")) {
                super.onFormResubmission(webView, message, message2);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onFormResubmission")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.FORM_RESUBMISSION, com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideKeyEvent(android.webkit.WebView webView, android.view.KeyEvent keyEvent) {
            java.lang.Boolean boolValueOf = false;
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("shouldOverrideKeyEvent")) {
                boolValueOf = java.lang.Boolean.valueOf(super.shouldOverrideKeyEvent(webView, keyEvent));
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("shouldOverrideKeyEvent")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.SHOULD_OVERRIDE_KEY_EVENT, java.lang.Integer.valueOf(keyEvent.getKeyCode()), java.lang.Integer.valueOf(keyEvent.getAction()), com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.hasReturnValue("shouldOverrideKeyEvent")) {
                boolValueOf = (java.lang.Boolean) com.unity3d.services.ads.webplayer.WebPlayerView.this.getReturnValue("shouldOverrideKeyEvent", java.lang.Boolean.class, true);
            }
            return boolValueOf.booleanValue();
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(android.webkit.WebView webView, android.view.KeyEvent keyEvent) {
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onUnhandledKeyEvent")) {
                super.onUnhandledKeyEvent(webView, keyEvent);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onUnhandledKeyEvent")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.UNHANDLED_KEY_EVENT, java.lang.Integer.valueOf(keyEvent.getKeyCode()), java.lang.Integer.valueOf(keyEvent.getAction()), com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
        }
    }

    private class WebPlayerChromeClient extends android.webkit.WebChromeClient {
        private WebPlayerChromeClient() {
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onGeolocationPermissionsShowPrompt")) {
                super.onGeolocationPermissionsShowPrompt(str, callback);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onGeolocationPermissionsShowPrompt")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.GEOLOCATION_PERMISSIONS_SHOW, str, com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(android.webkit.PermissionRequest permissionRequest) {
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onPermissionRequest")) {
                super.onPermissionRequest(permissionRequest);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onPermissionRequest")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.PERMISSION_REQUEST, (permissionRequest == null || permissionRequest.getOrigin() == null) ? "" : permissionRequest.getOrigin().toString(), com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(android.webkit.WebView webView, int i) {
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onProgressChanged")) {
                super.onProgressChanged(webView, i);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onProgressChanged")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.PROGRESS_CHANGED, java.lang.Integer.valueOf(i), com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(android.webkit.WebView webView, java.lang.String str) {
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onReceivedTitle")) {
                super.onReceivedTitle(webView, str);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onReceivedTitle")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.RECEIVED_TITLE, str, com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedIcon(android.webkit.WebView webView, android.graphics.Bitmap bitmap) {
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onReceivedIcon")) {
                super.onReceivedIcon(webView, bitmap);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onReceivedIcon")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.RECEIVED_ICON, com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTouchIconUrl(android.webkit.WebView webView, java.lang.String str, boolean z) {
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onReceivedTouchIconUrl")) {
                super.onReceivedTouchIconUrl(webView, str, z);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onReceivedTouchIconUrl")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.RECEIVED_TOUCH_ICON_URL, str, java.lang.Boolean.valueOf(z), com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onShowCustomView")) {
                super.onShowCustomView(view, customViewCallback);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onShowCustomView")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.SHOW_CUSTOM_VIEW, com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onHideCustomView")) {
                super.onHideCustomView();
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onHideCustomView")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.HIDE_CUSTOM_VIEW, com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(android.webkit.WebView webView, boolean z, boolean z2, android.os.Message message) {
            java.lang.Boolean boolValueOf;
            if (!com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onCreateWindow")) {
                boolValueOf = false;
            } else {
                boolValueOf = java.lang.Boolean.valueOf(super.onCreateWindow(webView, z, z2, message));
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onCreateWindow")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.CREATE_WINDOW, java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2), message, com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.hasReturnValue("onCreateWindow")) {
                boolValueOf = (java.lang.Boolean) com.unity3d.services.ads.webplayer.WebPlayerView.this.getReturnValue("onCreateWindow", java.lang.Boolean.class, false);
            }
            return boolValueOf.booleanValue();
        }

        @Override // android.webkit.WebChromeClient
        public void onRequestFocus(android.webkit.WebView webView) {
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onRequestFocus")) {
                super.onRequestFocus(webView);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onRequestFocus")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.REQUEST_FOCUS, com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onCloseWindow(android.webkit.WebView webView) {
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onCloseWindow")) {
                super.onCloseWindow(webView);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onCloseWindow")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.CLOSE_WINDOW, com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
            java.lang.Boolean boolValueOf = false;
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onJsAlert")) {
                boolValueOf = java.lang.Boolean.valueOf(super.onJsAlert(webView, str, str2, jsResult));
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onJsAlert")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.JS_ALERT, str, str2, jsResult, com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.hasReturnValue("onJsAlert")) {
                boolValueOf = (java.lang.Boolean) com.unity3d.services.ads.webplayer.WebPlayerView.this.getReturnValue("onJsAlert", java.lang.Boolean.class, true);
            }
            return boolValueOf.booleanValue();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
            java.lang.Boolean boolValueOf = false;
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onJsConfirm")) {
                boolValueOf = java.lang.Boolean.valueOf(super.onJsConfirm(webView, str, str2, jsResult));
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onJsConfirm")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.JS_CONFIRM, str, str2, com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.hasReturnValue("onJsConfirm")) {
                boolValueOf = (java.lang.Boolean) com.unity3d.services.ads.webplayer.WebPlayerView.this.getReturnValue("onJsConfirm", java.lang.Boolean.class, true);
            }
            return boolValueOf.booleanValue();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, android.webkit.JsPromptResult jsPromptResult) {
            java.lang.Boolean boolValueOf = false;
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onJsPrompt")) {
                boolValueOf = java.lang.Boolean.valueOf(super.onJsPrompt(webView, str, str2, str3, jsPromptResult));
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onJsPrompt")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.JS_PROMPT, str, str2, str3, com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.hasReturnValue("onJsPrompt")) {
                boolValueOf = (java.lang.Boolean) com.unity3d.services.ads.webplayer.WebPlayerView.this.getReturnValue("onJsPrompt", java.lang.Boolean.class, true);
            }
            return boolValueOf.booleanValue();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
            java.lang.Boolean boolValueOf = false;
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onConsoleMessage")) {
                boolValueOf = java.lang.Boolean.valueOf(super.onConsoleMessage(consoleMessage));
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onConsoleMessage")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.CONSOLE_MESSAGE, consoleMessage != null ? consoleMessage.message() : "", com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.hasReturnValue("onConsoleMessage")) {
                boolValueOf = (java.lang.Boolean) com.unity3d.services.ads.webplayer.WebPlayerView.this.getReturnValue("onConsoleMessage", java.lang.Boolean.class, true);
            }
            return boolValueOf.booleanValue();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(android.webkit.WebView webView, android.webkit.ValueCallback<android.net.Uri[]> valueCallback, android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
            java.lang.Boolean boolValueOf = false;
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldCallSuper("onShowFileChooser")) {
                boolValueOf = java.lang.Boolean.valueOf(super.onShowFileChooser(webView, valueCallback, fileChooserParams));
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onShowFileChooser")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.SHOW_FILE_CHOOSER, com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.hasReturnValue("onShowFileChooser")) {
                boolValueOf = (java.lang.Boolean) com.unity3d.services.ads.webplayer.WebPlayerView.this.getReturnValue("onShowFileChooser", java.lang.Boolean.class, true);
                if (boolValueOf.booleanValue()) {
                    valueCallback.onReceiveValue(null);
                }
            }
            return boolValueOf.booleanValue();
        }
    }

    private class WebPlayerDownloadListener implements android.webkit.DownloadListener {
        private WebPlayerDownloadListener() {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j) {
            if (com.unity3d.services.ads.webplayer.WebPlayerView.this.shouldSendEvent("onDownloadStart")) {
                com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.WEBPLAYER, com.unity3d.services.ads.webplayer.WebPlayerEvent.DOWNLOAD_START, str, str2, str3, str4, java.lang.Long.valueOf(j), com.unity3d.services.ads.webplayer.WebPlayerView.this.viewId);
            }
        }
    }
}
