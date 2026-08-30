package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes6.dex */
public interface WebViewClientBoundaryInterface extends org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface {
    void onPageCommitVisible(android.webkit.WebView webView, java.lang.String str);

    void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, java.lang.reflect.InvocationHandler invocationHandler);

    void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse);

    void onSafeBrowsingHit(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, int i, java.lang.reflect.InvocationHandler invocationHandler);

    boolean onWebAuthnIntent(android.webkit.WebView webView, android.app.PendingIntent pendingIntent, java.lang.reflect.InvocationHandler invocationHandler);

    boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest);
}
