package com.unity3d.services.core.webview.bridge;

/* JADX INFO: loaded from: classes6.dex */
public interface IWebViewBridgeSharedObjectStore<T extends com.unity3d.services.core.webview.bridge.IWebViewSharedObject> {
    T get(java.lang.String str);

    void remove(java.lang.String str);

    void set(T t);
}
