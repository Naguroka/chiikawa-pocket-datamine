package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class ProxyControllerImpl extends androidx.webkit.ProxyController {
    private org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface mBoundaryInterface;

    @Override // androidx.webkit.ProxyController
    public void setProxyOverride(androidx.webkit.ProxyConfig proxyConfig, java.util.concurrent.Executor executor, java.lang.Runnable runnable) {
        androidx.webkit.internal.ApiFeature.NoFramework noFramework = androidx.webkit.internal.WebViewFeatureInternal.PROXY_OVERRIDE;
        androidx.webkit.internal.ApiFeature.NoFramework noFramework2 = androidx.webkit.internal.WebViewFeatureInternal.PROXY_OVERRIDE_REVERSE_BYPASS;
        java.lang.String[][] strArrProxyRulesToStringArray = proxyRulesToStringArray(proxyConfig.getProxyRules());
        java.lang.String[] strArr = (java.lang.String[]) proxyConfig.getBypassRules().toArray(new java.lang.String[0]);
        if (noFramework.isSupportedByWebView() && !proxyConfig.isReverseBypassEnabled()) {
            getBoundaryInterface().setProxyOverride(strArrProxyRulesToStringArray, strArr, runnable, executor);
        } else {
            if (noFramework.isSupportedByWebView() && noFramework2.isSupportedByWebView()) {
                getBoundaryInterface().setProxyOverride(strArrProxyRulesToStringArray, strArr, runnable, executor, proxyConfig.isReverseBypassEnabled());
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Override // androidx.webkit.ProxyController
    public void clearProxyOverride(java.util.concurrent.Executor executor, java.lang.Runnable runnable) {
        if (androidx.webkit.internal.WebViewFeatureInternal.PROXY_OVERRIDE.isSupportedByWebView()) {
            getBoundaryInterface().clearProxyOverride(runnable, executor);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static java.lang.String[][] proxyRulesToStringArray(java.util.List<androidx.webkit.ProxyConfig.ProxyRule> list) {
        java.lang.String[][] strArr = (java.lang.String[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.String.class, list.size(), 2);
        for (int i = 0; i < list.size(); i++) {
            strArr[i][0] = list.get(i).getSchemeFilter();
            strArr[i][1] = list.get(i).getUrl();
        }
        return strArr;
    }

    private org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface getBoundaryInterface() {
        if (this.mBoundaryInterface == null) {
            this.mBoundaryInterface = androidx.webkit.internal.WebViewGlueCommunicator.getFactory().getProxyController();
        }
        return this.mBoundaryInterface;
    }
}
