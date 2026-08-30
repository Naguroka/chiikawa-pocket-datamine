package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes6.dex */
public interface WebViewProviderFactoryBoundaryInterface {
    java.lang.reflect.InvocationHandler createWebView(android.webkit.WebView webView);

    java.lang.reflect.InvocationHandler getDropDataProvider();

    java.lang.reflect.InvocationHandler getProfileStore();

    java.lang.reflect.InvocationHandler getProxyController();

    java.lang.reflect.InvocationHandler getServiceWorkerController();

    java.lang.reflect.InvocationHandler getStatics();

    java.lang.String[] getSupportedFeatures();

    java.lang.reflect.InvocationHandler getTracingController();

    java.lang.reflect.InvocationHandler getWebkitToCompatConverter();
}
