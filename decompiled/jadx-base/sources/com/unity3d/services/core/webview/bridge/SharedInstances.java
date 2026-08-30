package com.unity3d.services.core.webview.bridge;

/* JADX INFO: compiled from: SharedInstances.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/unity3d/services/core/webview/bridge/SharedInstances;", "", "()V", "webViewAppInvocationCallbackInvoker", "Lcom/unity3d/services/core/webview/bridge/IInvocationCallbackInvoker;", "getWebViewAppInvocationCallbackInvoker", "()Lcom/unity3d/services/core/webview/bridge/IInvocationCallbackInvoker;", "webViewAppNativeCallbackSubject", "Lcom/unity3d/services/core/webview/bridge/INativeCallbackSubject;", "getWebViewAppNativeCallbackSubject", "()Lcom/unity3d/services/core/webview/bridge/INativeCallbackSubject;", "webViewBridge", "Lcom/unity3d/services/core/webview/bridge/IWebViewBridge;", "getWebViewBridge", "()Lcom/unity3d/services/core/webview/bridge/IWebViewBridge;", "webViewEventSender", "Lcom/unity3d/services/core/webview/bridge/IEventSender;", "getWebViewEventSender", "()Lcom/unity3d/services/core/webview/bridge/IEventSender;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SharedInstances {
    public static final com.unity3d.services.core.webview.bridge.SharedInstances INSTANCE = new com.unity3d.services.core.webview.bridge.SharedInstances();
    private static final com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker = new com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker() { // from class: com.unity3d.services.core.webview.bridge.SharedInstances$$ExternalSyntheticLambda0
        @Override // com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker
        public final void invokeCallback(com.unity3d.services.core.webview.bridge.Invocation invocation) {
            com.unity3d.services.core.webview.bridge.SharedInstances.webViewAppInvocationCallbackInvoker$lambda$0(invocation);
        }
    };
    private static final com.unity3d.services.core.webview.bridge.INativeCallbackSubject webViewAppNativeCallbackSubject = new com.unity3d.services.core.webview.bridge.INativeCallbackSubject() { // from class: com.unity3d.services.core.webview.bridge.SharedInstances$webViewAppNativeCallbackSubject$1
        @Override // com.unity3d.services.core.webview.bridge.INativeCallbackSubject
        public void remove(com.unity3d.services.core.webview.bridge.NativeCallback callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
            com.unity3d.services.core.webview.WebViewApp.getCurrentApp().removeCallback(callback);
        }

        @Override // com.unity3d.services.core.webview.bridge.INativeCallbackSubject
        public com.unity3d.services.core.webview.bridge.NativeCallback getCallback(java.lang.String callbackId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackId, "callbackId");
            com.unity3d.services.core.webview.bridge.NativeCallback callback = com.unity3d.services.core.webview.WebViewApp.getCurrentApp().getCallback(callbackId);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(callback, "getCurrentApp().getCallback(callbackId)");
            return callback;
        }
    };
    private static final com.unity3d.services.core.webview.bridge.IEventSender webViewEventSender = new com.unity3d.services.core.webview.bridge.IEventSender() { // from class: com.unity3d.services.core.webview.bridge.SharedInstances$webViewEventSender$1
        @Override // com.unity3d.services.core.webview.bridge.IEventSender
        public boolean sendEvent(java.lang.Enum<?> eventCategory, java.lang.Enum<?> eventId, java.lang.Object... params) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventCategory, "eventCategory");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventId, "eventId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
            com.unity3d.services.core.webview.WebViewApp currentApp = com.unity3d.services.core.webview.WebViewApp.getCurrentApp();
            if (currentApp != null) {
                return currentApp.sendEvent(eventCategory, eventId, java.util.Arrays.copyOf(params, params.length));
            }
            return false;
        }

        @Override // com.unity3d.services.core.webview.bridge.IEventSender
        public boolean canSend() {
            return com.unity3d.services.core.webview.WebViewApp.getCurrentApp() != null;
        }
    };
    private static final com.unity3d.services.core.webview.bridge.IWebViewBridge webViewBridge = new com.unity3d.services.core.webview.bridge.IWebViewBridge() { // from class: com.unity3d.services.core.webview.bridge.SharedInstances$webViewBridge$1
        @Override // com.unity3d.services.core.webview.bridge.IWebViewBridge
        public void handleInvocation(java.lang.String className, java.lang.String methodName, java.lang.Object[] parameters, com.unity3d.services.core.webview.bridge.WebViewCallback callback) throws java.lang.Exception {
            com.unity3d.services.core.webview.bridge.WebViewBridge.getInstance().handleInvocation(className, methodName, parameters, callback);
        }

        @Override // com.unity3d.services.core.webview.bridge.IWebViewBridge
        public void handleCallback(java.lang.String callbackId, java.lang.String callbackStatus, java.lang.Object[] parameters) throws java.lang.Exception {
            com.unity3d.services.core.webview.bridge.WebViewBridge.getInstance().handleCallback(callbackId, callbackStatus, parameters);
        }
    };

    private SharedInstances() {
    }

    public final com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker getWebViewAppInvocationCallbackInvoker() {
        return webViewAppInvocationCallbackInvoker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void webViewAppInvocationCallbackInvoker$lambda$0(com.unity3d.services.core.webview.bridge.Invocation it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        com.unity3d.services.core.webview.WebViewApp.getCurrentApp().invokeCallback(it);
    }

    public final com.unity3d.services.core.webview.bridge.INativeCallbackSubject getWebViewAppNativeCallbackSubject() {
        return webViewAppNativeCallbackSubject;
    }

    public final com.unity3d.services.core.webview.bridge.IEventSender getWebViewEventSender() {
        return webViewEventSender;
    }

    public final com.unity3d.services.core.webview.bridge.IWebViewBridge getWebViewBridge() {
        return webViewBridge;
    }
}
