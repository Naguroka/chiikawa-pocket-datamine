package com.unity3d.services.core.webview.bridge;

/* JADX INFO: loaded from: classes6.dex */
public class WebViewBridgeInvoker implements com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker {
    @Override // com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker
    public boolean invokeMethod(java.lang.String str, java.lang.String str2, java.lang.reflect.Method method, java.lang.Object... objArr) {
        return com.unity3d.services.core.webview.WebViewApp.getCurrentApp().invokeMethod(str, str2, method, objArr);
    }
}
