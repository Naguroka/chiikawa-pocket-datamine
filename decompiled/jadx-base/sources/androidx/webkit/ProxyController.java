package androidx.webkit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ProxyController {
    public abstract void clearProxyOverride(java.util.concurrent.Executor executor, java.lang.Runnable runnable);

    public abstract void setProxyOverride(androidx.webkit.ProxyConfig proxyConfig, java.util.concurrent.Executor executor, java.lang.Runnable runnable);

    public static androidx.webkit.ProxyController getInstance() {
        if (!androidx.webkit.WebViewFeature.isFeatureSupported(androidx.webkit.WebViewFeature.PROXY_OVERRIDE)) {
            throw new java.lang.UnsupportedOperationException("Proxy override not supported");
        }
        return androidx.webkit.ProxyController.LAZY_HOLDER.INSTANCE;
    }

    private static class LAZY_HOLDER {
        static final androidx.webkit.ProxyController INSTANCE = new androidx.webkit.internal.ProxyControllerImpl();

        private LAZY_HOLDER() {
        }
    }
}
