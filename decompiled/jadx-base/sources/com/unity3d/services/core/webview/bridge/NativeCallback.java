package com.unity3d.services.core.webview.bridge;

/* JADX INFO: loaded from: classes6.dex */
public class NativeCallback {
    private static java.util.concurrent.atomic.AtomicInteger _callbackCount = new java.util.concurrent.atomic.AtomicInteger(0);
    private java.lang.reflect.Method _callback;
    private java.lang.String _id;
    private final com.unity3d.services.core.webview.bridge.INativeCallbackSubject _nativeCallbackSubject;

    public NativeCallback(java.lang.reflect.Method method) {
        this(method, com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE.getWebViewAppNativeCallbackSubject());
    }

    public NativeCallback(java.lang.reflect.Method method, com.unity3d.services.core.webview.bridge.INativeCallbackSubject iNativeCallbackSubject) {
        this._callback = method;
        this._id = this._callback.getName().toUpperCase(java.util.Locale.US) + "_" + _callbackCount.getAndIncrement();
        this._nativeCallbackSubject = iNativeCallbackSubject;
    }

    public java.lang.String getId() {
        return this._id;
    }

    public void invoke(java.lang.String str, java.lang.Object... objArr) throws java.lang.Exception {
        java.lang.Object[] array;
        try {
            com.unity3d.services.core.webview.bridge.CallbackStatus callbackStatusValueOf = com.unity3d.services.core.webview.bridge.CallbackStatus.valueOf(str);
            if (objArr == null) {
                array = new java.lang.Object[]{callbackStatusValueOf};
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(objArr));
                arrayList.add(0, callbackStatusValueOf);
                array = arrayList.toArray();
            }
            this._callback.invoke(null, array);
            this._nativeCallbackSubject.remove(this);
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.error("Illegal status");
            this._nativeCallbackSubject.remove(this);
            throw e;
        }
    }
}
