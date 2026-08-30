package androidx.webkit;

/* JADX INFO: loaded from: classes3.dex */
public class WebViewClientCompat extends android.webkit.WebViewClient implements org.chromium.support_lib_boundary.WebViewClientBoundaryInterface {
    private static final java.lang.String[] sSupportedFeatures = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SafeBrowsingThreat {
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onPageCommitVisible(android.webkit.WebView webView, java.lang.String str) {
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public boolean onWebAuthnIntent(android.webkit.WebView webView, android.app.PendingIntent pendingIntent, java.lang.reflect.InvocationHandler invocationHandler) {
        return false;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final java.lang.String[] getSupportedFeatures() {
        return sSupportedFeatures;
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, java.lang.reflect.InvocationHandler invocationHandler) {
        onReceivedError(webView, webResourceRequest, new androidx.webkit.internal.WebResourceErrorImpl(invocationHandler));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        onReceivedError(webView, webResourceRequest, new androidx.webkit.internal.WebResourceErrorImpl(webResourceError));
    }

    public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, androidx.webkit.WebResourceErrorCompat webResourceErrorCompat) {
        if (androidx.webkit.WebViewFeature.isFeatureSupported("WEB_RESOURCE_ERROR_GET_CODE") && androidx.webkit.WebViewFeature.isFeatureSupported("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && androidx.webkit.internal.ApiHelperForLollipop.isForMainFrame(webResourceRequest)) {
            onReceivedError(webView, webResourceErrorCompat.getErrorCode(), webResourceErrorCompat.getDescription().toString(), androidx.webkit.internal.ApiHelperForLollipop.getUrl(webResourceRequest).toString());
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onSafeBrowsingHit(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, int i, java.lang.reflect.InvocationHandler invocationHandler) {
        onSafeBrowsingHit(webView, webResourceRequest, i, new androidx.webkit.internal.SafeBrowsingResponseImpl(invocationHandler));
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, int i, android.webkit.SafeBrowsingResponse safeBrowsingResponse) {
        onSafeBrowsingHit(webView, webResourceRequest, i, new androidx.webkit.internal.SafeBrowsingResponseImpl(safeBrowsingResponse));
    }

    public void onSafeBrowsingHit(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, int i, androidx.webkit.SafeBrowsingResponseCompat safeBrowsingResponseCompat) {
        if (androidx.webkit.WebViewFeature.isFeatureSupported("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            safeBrowsingResponseCompat.showInterstitial(true);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, androidx.webkit.internal.ApiHelperForLollipop.getUrl(webResourceRequest).toString());
    }
}
