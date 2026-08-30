package com.unity3d.services.core.webview.bridge;

/* JADX INFO: loaded from: classes6.dex */
public abstract class WebViewBridgeSharedObjectStore<T extends com.unity3d.services.core.webview.bridge.IWebViewSharedObject> implements com.unity3d.services.core.webview.bridge.IWebViewBridgeSharedObjectStore<T> {
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, T> _sharedObjects = new java.util.concurrent.ConcurrentHashMap<>();

    @Override // com.unity3d.services.core.webview.bridge.IWebViewBridgeSharedObjectStore
    public T get(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return this._sharedObjects.get(str);
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewBridgeSharedObjectStore
    public void set(T t) {
        if (t == null) {
            return;
        }
        this._sharedObjects.put(t.getId(), t);
    }

    public void remove(T t) {
        if (t == null) {
            return;
        }
        remove(t.getId());
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewBridgeSharedObjectStore
    public void remove(java.lang.String str) {
        this._sharedObjects.remove(str);
    }
}
