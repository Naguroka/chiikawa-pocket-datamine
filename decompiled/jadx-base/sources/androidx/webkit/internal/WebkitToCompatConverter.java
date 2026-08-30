package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class WebkitToCompatConverter {
    private final org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface mImpl;

    public WebkitToCompatConverter(org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.mImpl = webkitToCompatConverterBoundaryInterface;
    }

    public androidx.webkit.internal.WebSettingsAdapter convertSettings(android.webkit.WebSettings webSettings) {
        return new androidx.webkit.internal.WebSettingsAdapter((org.chromium.support_lib_boundary.WebSettingsBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebSettingsBoundaryInterface.class, this.mImpl.convertSettings(webSettings)));
    }

    public androidx.webkit.internal.WebResourceRequestAdapter convertWebResourceRequest(android.webkit.WebResourceRequest webResourceRequest) {
        return new androidx.webkit.internal.WebResourceRequestAdapter((org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface.class, this.mImpl.convertWebResourceRequest(webResourceRequest)));
    }

    public java.lang.reflect.InvocationHandler convertServiceWorkerSettings(android.webkit.ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return this.mImpl.convertServiceWorkerSettings(serviceWorkerWebSettings);
    }

    public android.webkit.ServiceWorkerWebSettings convertServiceWorkerSettings(java.lang.reflect.InvocationHandler invocationHandler) {
        return (android.webkit.ServiceWorkerWebSettings) this.mImpl.convertServiceWorkerSettings(invocationHandler);
    }

    public java.lang.reflect.InvocationHandler convertWebResourceError(android.webkit.WebResourceError webResourceError) {
        return this.mImpl.convertWebResourceError(webResourceError);
    }

    public android.webkit.WebResourceError convertWebResourceError(java.lang.reflect.InvocationHandler invocationHandler) {
        return (android.webkit.WebResourceError) this.mImpl.convertWebResourceError(invocationHandler);
    }

    public java.lang.reflect.InvocationHandler convertSafeBrowsingResponse(android.webkit.SafeBrowsingResponse safeBrowsingResponse) {
        return this.mImpl.convertSafeBrowsingResponse(safeBrowsingResponse);
    }

    public android.webkit.SafeBrowsingResponse convertSafeBrowsingResponse(java.lang.reflect.InvocationHandler invocationHandler) {
        return (android.webkit.SafeBrowsingResponse) this.mImpl.convertSafeBrowsingResponse(invocationHandler);
    }

    public java.lang.reflect.InvocationHandler convertWebMessagePort(android.webkit.WebMessagePort webMessagePort) {
        return this.mImpl.convertWebMessagePort(webMessagePort);
    }

    public android.webkit.WebMessagePort convertWebMessagePort(java.lang.reflect.InvocationHandler invocationHandler) {
        return (android.webkit.WebMessagePort) this.mImpl.convertWebMessagePort(invocationHandler);
    }

    public androidx.webkit.internal.CookieManagerAdapter convertCookieManager(android.webkit.CookieManager cookieManager) {
        return new androidx.webkit.internal.CookieManagerAdapter((org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface.class, this.mImpl.convertCookieManager(cookieManager)));
    }
}
