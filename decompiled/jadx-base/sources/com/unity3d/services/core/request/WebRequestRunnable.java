package com.unity3d.services.core.request;

/* JADX INFO: loaded from: classes6.dex */
public class WebRequestRunnable implements java.lang.Runnable {
    private final java.lang.String _body;
    private boolean _canceled = false;
    private final int _connectTimeout;
    private com.unity3d.services.core.request.WebRequest _currentRequest;
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> _headers;
    private final com.unity3d.services.core.request.IWebRequestListener _listener;
    private final int _readTimeout;
    private final java.lang.String _type;
    private final java.lang.String _url;

    public WebRequestRunnable(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, com.unity3d.services.core.request.IWebRequestListener iWebRequestListener) {
        this._url = str;
        this._type = str2;
        this._body = str3;
        this._connectTimeout = i;
        this._readTimeout = i2;
        this._headers = map;
        this._listener = iWebRequestListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.unity3d.services.core.log.DeviceLog.debug("Handling request message: " + this._url + " type=" + this._type);
        try {
            makeRequest(this._url, this._type, this._headers, this._body, this._connectTimeout, this._readTimeout);
        } catch (java.lang.Error unused) {
            com.unity3d.services.core.log.DeviceLog.error("Out of memory error while doing web request.");
            ((com.unity3d.services.core.request.metrics.SDKMetricsSender) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.request.metrics.SDKMetricsSender.class)).sendEvent("native_webview_oom", null, new java.util.HashMap<java.lang.String, java.lang.String>() { // from class: com.unity3d.services.core.request.WebRequestRunnable.1
                {
                    put("src", "WebRequestRunnable");
                    put("url", com.unity3d.services.core.request.WebRequestRunnable.this._url);
                    put("type", com.unity3d.services.core.request.WebRequestRunnable.this._type);
                }
            });
            onFailed("Out of memory error while doing web request.");
        } catch (java.net.MalformedURLException e) {
            com.unity3d.services.core.log.DeviceLog.exception("Malformed URL", e);
            onFailed("Malformed URL");
        }
    }

    public void setCancelStatus(boolean z) {
        com.unity3d.services.core.request.WebRequest webRequest;
        this._canceled = z;
        if (!z || (webRequest = this._currentRequest) == null) {
            return;
        }
        webRequest.cancel();
    }

    private void makeRequest(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, java.lang.String str3, int i, int i2) throws java.net.MalformedURLException {
        if (this._canceled) {
            return;
        }
        com.unity3d.services.core.request.WebRequest webRequest = new com.unity3d.services.core.request.WebRequest(str, str2, map, i, i2);
        this._currentRequest = webRequest;
        if (str3 != null) {
            webRequest.setBody(str3);
        }
        try {
            java.lang.String strMakeRequest = this._currentRequest.makeRequest();
            if (this._currentRequest.isCanceled()) {
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> responseHeaders = this._currentRequest.getResponseHeaders();
            if (responseHeaders != null) {
                for (java.lang.String str4 : responseHeaders.keySet()) {
                    if (str4 != null && !str4.contentEquals("null")) {
                        java.lang.String[] strArr = new java.lang.String[responseHeaders.get(str4).size()];
                        for (int i3 = 0; i3 < responseHeaders.get(str4).size(); i3++) {
                            strArr[i3] = responseHeaders.get(str4).get(i3);
                        }
                        bundle.putStringArray(str4, strArr);
                    }
                }
            }
            if (this._currentRequest.isCanceled()) {
                return;
            }
            onSucceed(strMakeRequest, this._currentRequest.getResponseCode(), getResponseHeaders(bundle));
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Error completing request", e);
            onFailed(e.getClass().getName() + ": " + e.getMessage());
        }
    }

    private void onSucceed(java.lang.String str, int i, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        this._listener.onComplete(this._url, str, i, map);
    }

    private void onFailed(java.lang.String str) {
        this._listener.onFailed(this._url, str);
    }

    private java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders(android.os.Bundle bundle) {
        if (bundle.isEmpty()) {
            return null;
        }
        java.util.HashMap map = new java.util.HashMap();
        for (java.lang.String str : bundle.keySet()) {
            java.lang.String[] stringArray = bundle.getStringArray(str);
            if (stringArray != null) {
                map.put(str, new java.util.ArrayList(java.util.Arrays.asList(stringArray)));
            }
        }
        return map;
    }
}
