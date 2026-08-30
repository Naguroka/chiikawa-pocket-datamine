package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class IncompatibleApkWebViewProviderFactory implements androidx.webkit.internal.WebViewProviderFactory {
    private static final java.lang.String[] EMPTY_STRING_ARRAY = new java.lang.String[0];
    private static final java.lang.String UNSUPPORTED_EXCEPTION_EXPLANATION = "This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily";

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface createWebView(android.webkit.WebView webView) {
        throw new java.lang.UnsupportedOperationException(UNSUPPORTED_EXCEPTION_EXPLANATION);
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new java.lang.UnsupportedOperationException(UNSUPPORTED_EXCEPTION_EXPLANATION);
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.StaticsBoundaryInterface getStatics() {
        throw new java.lang.UnsupportedOperationException(UNSUPPORTED_EXCEPTION_EXPLANATION);
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public java.lang.String[] getWebViewFeatures() {
        return EMPTY_STRING_ARRAY;
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        throw new java.lang.UnsupportedOperationException(UNSUPPORTED_EXCEPTION_EXPLANATION);
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.TracingControllerBoundaryInterface getTracingController() {
        throw new java.lang.UnsupportedOperationException(UNSUPPORTED_EXCEPTION_EXPLANATION);
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface getProxyController() {
        throw new java.lang.UnsupportedOperationException(UNSUPPORTED_EXCEPTION_EXPLANATION);
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface getDropDataProvider() {
        throw new java.lang.UnsupportedOperationException(UNSUPPORTED_EXCEPTION_EXPLANATION);
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface getProfileStore() {
        throw new java.lang.UnsupportedOperationException(UNSUPPORTED_EXCEPTION_EXPLANATION);
    }
}
