package com.unity3d.services.core.webview.bridge.invocation;

/* JADX INFO: loaded from: classes6.dex */
public class WebViewBridgeInvocationRunnable implements java.lang.Runnable {
    private static com.unity3d.services.core.webview.bridge.CallbackStatus _callbackStatus;
    private static android.os.ConditionVariable _responseTimeout;
    private java.lang.String _className;
    private com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocationCallback _invocationCallback;
    private java.lang.Object[] _invocationParameters;
    private java.lang.String _methodName;
    private int _timeoutLengthInMilliSeconds;
    private java.lang.reflect.Method _webViewBridgeCallbackMethod;
    private com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker _webViewBridgeInvoker;

    public WebViewBridgeInvocationRunnable(com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocationCallback iWebViewBridgeInvocationCallback, com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker iWebViewBridgeInvoker, java.lang.String str, java.lang.String str2, int i, java.lang.Object... objArr) {
        try {
            this._webViewBridgeCallbackMethod = com.unity3d.services.core.webview.bridge.invocation.WebViewBridgeInvocationRunnable.class.getMethod("onInvocationComplete", com.unity3d.services.core.webview.bridge.CallbackStatus.class);
            this._invocationCallback = iWebViewBridgeInvocationCallback;
            this._webViewBridgeInvoker = iWebViewBridgeInvoker;
            this._className = str;
            this._methodName = str2;
            this._timeoutLengthInMilliSeconds = i;
            this._invocationParameters = objArr;
        } catch (java.lang.NoSuchMethodException e) {
            throw new java.lang.IllegalArgumentException("WebViewBridgeInvocation callback method cannot be found", e);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        _callbackStatus = null;
        _responseTimeout = new android.os.ConditionVariable();
        boolean zInvokeMethod = this._webViewBridgeInvoker.invokeMethod(this._className, this._methodName, this._webViewBridgeCallbackMethod, this._invocationParameters);
        com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocationCallback iWebViewBridgeInvocationCallback = this._invocationCallback;
        if (iWebViewBridgeInvocationCallback == null) {
            return;
        }
        if (!zInvokeMethod) {
            iWebViewBridgeInvocationCallback.onFailure("WebViewBridgeInvocationRunnable:run: invokeMethod failure", null);
            return;
        }
        if (_responseTimeout.block(this._timeoutLengthInMilliSeconds)) {
            if (_callbackStatus == com.unity3d.services.core.webview.bridge.CallbackStatus.OK) {
                this._invocationCallback.onSuccess();
                return;
            } else {
                this._invocationCallback.onFailure("WebViewBridgeInvocationRunnable:run CallbackStatus.Error", _callbackStatus);
                return;
            }
        }
        this._invocationCallback.onTimeout();
    }

    public static synchronized void onInvocationComplete(com.unity3d.services.core.webview.bridge.CallbackStatus callbackStatus) {
        _callbackStatus = callbackStatus;
        android.os.ConditionVariable conditionVariable = _responseTimeout;
        if (conditionVariable != null) {
            conditionVariable.open();
        }
    }
}
