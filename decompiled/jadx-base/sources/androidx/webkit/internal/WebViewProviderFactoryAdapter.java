package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class WebViewProviderFactoryAdapter implements androidx.webkit.internal.WebViewProviderFactory {
    final org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface mImpl;

    public WebViewProviderFactoryAdapter(org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.mImpl = webViewProviderFactoryBoundaryInterface;
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface createWebView(android.webkit.WebView webView) {
        return (org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface.class, this.mImpl.createWebView(webView));
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface.class, this.mImpl.getWebkitToCompatConverter());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.StaticsBoundaryInterface getStatics() {
        return (org.chromium.support_lib_boundary.StaticsBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.StaticsBoundaryInterface.class, this.mImpl.getStatics());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public java.lang.String[] getWebViewFeatures() {
        return this.mImpl.getSupportedFeatures();
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        return (org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface.class, this.mImpl.getServiceWorkerController());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.TracingControllerBoundaryInterface getTracingController() {
        return (org.chromium.support_lib_boundary.TracingControllerBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.TracingControllerBoundaryInterface.class, this.mImpl.getTracingController());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface getProxyController() {
        return (org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface.class, this.mImpl.getProxyController());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface getDropDataProvider() {
        return (org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface.class, this.mImpl.getDropDataProvider());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface getProfileStore() {
        return (org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface.class, this.mImpl.getProfileStore());
    }
}
