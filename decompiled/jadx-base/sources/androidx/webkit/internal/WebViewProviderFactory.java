package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public interface WebViewProviderFactory {
    org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface createWebView(android.webkit.WebView webView);

    org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface getDropDataProvider();

    org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface getProfileStore();

    org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface getProxyController();

    org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface getServiceWorkerController();

    org.chromium.support_lib_boundary.StaticsBoundaryInterface getStatics();

    org.chromium.support_lib_boundary.TracingControllerBoundaryInterface getTracingController();

    java.lang.String[] getWebViewFeatures();

    org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter();
}
