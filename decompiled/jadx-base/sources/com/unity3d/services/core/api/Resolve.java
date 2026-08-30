package com.unity3d.services.core.api;

/* JADX INFO: loaded from: classes6.dex */
public class Resolve {
    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void resolve(final java.lang.String str, java.lang.String str2, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (com.unity3d.services.core.request.WebRequestThread.resolve(str2, new com.unity3d.services.core.request.IResolveHostListener() { // from class: com.unity3d.services.core.api.Resolve.1
            @Override // com.unity3d.services.core.request.IResolveHostListener
            public void onResolve(java.lang.String str3, java.lang.String str4) {
                if (com.unity3d.services.core.webview.WebViewApp.getCurrentApp() != null) {
                    com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.RESOLVE, com.unity3d.services.core.request.ResolveHostEvent.COMPLETE, str, str3, str4);
                }
            }

            @Override // com.unity3d.services.core.request.IResolveHostListener
            public void onFailed(java.lang.String str3, com.unity3d.services.core.request.ResolveHostError resolveHostError, java.lang.String str4) {
                if (com.unity3d.services.core.webview.WebViewApp.getCurrentApp() != null) {
                    com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.RESOLVE, com.unity3d.services.core.request.ResolveHostEvent.FAILED, str, str3, resolveHostError.name(), str4);
                }
            }
        })) {
            webViewCallback.invoke(str);
        } else {
            webViewCallback.error(com.unity3d.services.core.request.ResolveHostError.INVALID_HOST, str);
        }
    }
}
