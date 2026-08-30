package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class WebViewProviderAdapter {
    org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface mImpl;

    public WebViewProviderAdapter(org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.mImpl = webViewProviderBoundaryInterface;
    }

    public void insertVisualStateCallback(long j, androidx.webkit.WebViewCompat.VisualStateCallback visualStateCallback) {
        this.mImpl.insertVisualStateCallback(j, org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.VisualStateCallbackAdapter(visualStateCallback)));
    }

    public androidx.webkit.WebMessagePortCompat[] createWebMessageChannel() {
        java.lang.reflect.InvocationHandler[] invocationHandlerArrCreateWebMessageChannel = this.mImpl.createWebMessageChannel();
        androidx.webkit.WebMessagePortCompat[] webMessagePortCompatArr = new androidx.webkit.WebMessagePortCompat[invocationHandlerArrCreateWebMessageChannel.length];
        for (int i = 0; i < invocationHandlerArrCreateWebMessageChannel.length; i++) {
            webMessagePortCompatArr[i] = new androidx.webkit.internal.WebMessagePortImpl(invocationHandlerArrCreateWebMessageChannel[i]);
        }
        return webMessagePortCompatArr;
    }

    public void postWebMessage(androidx.webkit.WebMessageCompat webMessageCompat, android.net.Uri uri) {
        this.mImpl.postMessageToMainFrame(org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.WebMessageAdapter(webMessageCompat)), uri);
    }

    public void addWebMessageListener(java.lang.String str, java.lang.String[] strArr, androidx.webkit.WebViewCompat.WebMessageListener webMessageListener) {
        this.mImpl.addWebMessageListener(str, strArr, org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.WebMessageListenerAdapter(webMessageListener)));
    }

    public androidx.webkit.internal.ScriptHandlerImpl addDocumentStartJavaScript(java.lang.String str, java.lang.String[] strArr) {
        return androidx.webkit.internal.ScriptHandlerImpl.toScriptHandler(this.mImpl.addDocumentStartJavaScript(str, strArr));
    }

    public void removeWebMessageListener(java.lang.String str) {
        this.mImpl.removeWebMessageListener(str);
    }

    public android.webkit.WebViewClient getWebViewClient() {
        return this.mImpl.getWebViewClient();
    }

    public android.webkit.WebChromeClient getWebChromeClient() {
        return this.mImpl.getWebChromeClient();
    }

    public androidx.webkit.WebViewRenderProcess getWebViewRenderProcess() {
        return androidx.webkit.internal.WebViewRenderProcessImpl.forInvocationHandler(this.mImpl.getWebViewRenderer());
    }

    public androidx.webkit.WebViewRenderProcessClient getWebViewRenderProcessClient() {
        java.lang.reflect.InvocationHandler webViewRendererClient = this.mImpl.getWebViewRendererClient();
        if (webViewRendererClient == null) {
            return null;
        }
        return ((androidx.webkit.internal.WebViewRenderProcessClientAdapter) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.getDelegateFromInvocationHandler(webViewRendererClient)).getWebViewRenderProcessClient();
    }

    public void setWebViewRenderProcessClient(java.util.concurrent.Executor executor, androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient) {
        this.mImpl.setWebViewRendererClient(webViewRenderProcessClient != null ? org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.WebViewRenderProcessClientAdapter(executor, webViewRenderProcessClient)) : null);
    }

    public void setProfileWithName(java.lang.String str) {
        this.mImpl.setProfile(str);
    }

    public androidx.webkit.Profile getProfile() {
        return new androidx.webkit.internal.ProfileImpl((org.chromium.support_lib_boundary.ProfileBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.ProfileBoundaryInterface.class, this.mImpl.getProfile()));
    }

    public boolean isAudioMuted() {
        return this.mImpl.isAudioMuted();
    }

    public void setAudioMuted(boolean z) {
        this.mImpl.setAudioMuted(z);
    }
}
