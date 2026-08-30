package com.unity3d.services.core.webview.bridge;

/* JADX INFO: loaded from: classes6.dex */
public class Invocation {
    private static java.util.concurrent.atomic.AtomicInteger _idCount = new java.util.concurrent.atomic.AtomicInteger(0);
    private static java.util.Map<java.lang.Integer, com.unity3d.services.core.webview.bridge.Invocation> _invocationSets;
    private com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker _invocationCallbackInvoker;
    private int _invocationId;
    private java.util.ArrayList<java.util.ArrayList<java.lang.Object>> _invocations;
    private java.util.ArrayList<java.util.ArrayList<java.lang.Object>> _responses;
    private final com.unity3d.services.core.webview.bridge.IWebViewBridge _webViewBridge;

    public Invocation() {
        this(com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker(), com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE.getWebViewBridge());
    }

    public Invocation(com.unity3d.services.core.webview.bridge.IWebViewBridge iWebViewBridge) {
        this(com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker(), iWebViewBridge);
    }

    public Invocation(com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker iInvocationCallbackInvoker, com.unity3d.services.core.webview.bridge.IWebViewBridge iWebViewBridge) {
        this._invocationCallbackInvoker = iInvocationCallbackInvoker;
        this._webViewBridge = iWebViewBridge;
        this._invocationId = _idCount.getAndIncrement();
        if (_invocationSets == null) {
            _invocationSets = new java.util.HashMap();
        }
        _invocationSets.put(java.lang.Integer.valueOf(this._invocationId), this);
    }

    public void addInvocation(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (this._invocations == null) {
            this._invocations = new java.util.ArrayList<>();
        }
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        arrayList.add(str);
        arrayList.add(str2);
        arrayList.add(objArr);
        arrayList.add(webViewCallback);
        this._invocations.add(arrayList);
    }

    public boolean nextInvocation() {
        java.util.ArrayList<java.util.ArrayList<java.lang.Object>> arrayList = this._invocations;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        java.util.ArrayList<java.lang.Object> arrayListRemove = this._invocations.remove(0);
        java.lang.String str = (java.lang.String) arrayListRemove.get(0);
        java.lang.String str2 = (java.lang.String) arrayListRemove.get(1);
        java.lang.Object[] objArr = (java.lang.Object[]) arrayListRemove.get(2);
        try {
            this._webViewBridge.handleInvocation(str, str2, objArr, (com.unity3d.services.core.webview.bridge.WebViewCallback) arrayListRemove.get(3));
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception(java.lang.String.format("Error handling invocation %s.%s(%s)", str, str2, java.util.Arrays.toString(objArr)), e);
        }
        return true;
    }

    public void setInvocationResponse(com.unity3d.services.core.webview.bridge.CallbackStatus callbackStatus, java.lang.Enum r3, java.lang.Object... objArr) {
        if (this._responses == null) {
            this._responses = new java.util.ArrayList<>();
        }
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        arrayList.add(callbackStatus);
        arrayList.add(r3);
        arrayList.add(objArr);
        this._responses.add(arrayList);
    }

    public void sendInvocationCallback() {
        _invocationSets.remove(java.lang.Integer.valueOf(getId()));
        this._invocationCallbackInvoker.invokeCallback(this);
    }

    public int getId() {
        return this._invocationId;
    }

    public java.util.ArrayList<java.util.ArrayList<java.lang.Object>> getResponses() {
        return this._responses;
    }

    public static synchronized com.unity3d.services.core.webview.bridge.Invocation getInvocationById(int i) {
        java.util.Map<java.lang.Integer, com.unity3d.services.core.webview.bridge.Invocation> map = _invocationSets;
        if (map == null || !map.containsKey(java.lang.Integer.valueOf(i))) {
            return null;
        }
        return _invocationSets.get(java.lang.Integer.valueOf(i));
    }
}
