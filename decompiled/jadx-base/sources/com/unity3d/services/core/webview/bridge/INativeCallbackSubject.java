package com.unity3d.services.core.webview.bridge;

/* JADX INFO: compiled from: INativeCallbackSubject.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/unity3d/services/core/webview/bridge/INativeCallbackSubject;", "", "getCallback", "Lcom/unity3d/services/core/webview/bridge/NativeCallback;", "callbackId", "", "remove", "", "callback", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface INativeCallbackSubject {
    com.unity3d.services.core.webview.bridge.NativeCallback getCallback(java.lang.String callbackId);

    void remove(com.unity3d.services.core.webview.bridge.NativeCallback callback);
}
