package com.unity3d.services.ads.operation;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AdOperation implements com.unity3d.services.ads.operation.IAdOperation {
    private static java.lang.String invocationClassName = "webview";
    private java.lang.String _invocationMethodName;
    private com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocation _webViewBridgeInvocation;

    protected AdOperation(com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocation iWebViewBridgeInvocation, java.lang.String str) throws java.lang.NullPointerException {
        this._invocationMethodName = str;
        if (str == null || str.isEmpty()) {
            throw new java.lang.IllegalArgumentException("invocationMethodName cannot be null");
        }
        this._webViewBridgeInvocation = iWebViewBridgeInvocation;
        if (iWebViewBridgeInvocation == null) {
            throw new java.lang.IllegalArgumentException("webViewBridgeInvocation cannot be null");
        }
    }

    @Override // com.unity3d.services.ads.operation.IAdOperation
    public void invoke(int i, java.lang.Object... objArr) {
        this._webViewBridgeInvocation.invoke(invocationClassName, this._invocationMethodName, i, objArr);
    }
}
