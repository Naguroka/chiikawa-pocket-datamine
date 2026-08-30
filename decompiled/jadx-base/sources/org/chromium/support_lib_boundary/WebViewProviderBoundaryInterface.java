package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes6.dex */
public interface WebViewProviderBoundaryInterface {
    java.lang.reflect.InvocationHandler addDocumentStartJavaScript(java.lang.String str, java.lang.String[] strArr);

    void addWebMessageListener(java.lang.String str, java.lang.String[] strArr, java.lang.reflect.InvocationHandler invocationHandler);

    java.lang.reflect.InvocationHandler[] createWebMessageChannel();

    java.lang.reflect.InvocationHandler getProfile();

    android.webkit.WebChromeClient getWebChromeClient();

    android.webkit.WebViewClient getWebViewClient();

    java.lang.reflect.InvocationHandler getWebViewRenderer();

    java.lang.reflect.InvocationHandler getWebViewRendererClient();

    void insertVisualStateCallback(long j, java.lang.reflect.InvocationHandler invocationHandler);

    boolean isAudioMuted();

    void postMessageToMainFrame(java.lang.reflect.InvocationHandler invocationHandler, android.net.Uri uri);

    void removeWebMessageListener(java.lang.String str);

    void setAudioMuted(boolean z);

    void setProfile(java.lang.String str);

    void setWebViewRendererClient(java.lang.reflect.InvocationHandler invocationHandler);
}
