package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class ApiHelperForM {
    private ApiHelperForM() {
    }

    public static void postMessage(android.webkit.WebMessagePort webMessagePort, android.webkit.WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    public static void close(android.webkit.WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    public static void setWebMessageCallback(android.webkit.WebMessagePort webMessagePort, final androidx.webkit.WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat) {
        webMessagePort.setWebMessageCallback(new android.webkit.WebMessagePort.WebMessageCallback() { // from class: androidx.webkit.internal.ApiHelperForM.1
            @Override // android.webkit.WebMessagePort.WebMessageCallback
            public void onMessage(android.webkit.WebMessagePort webMessagePort2, android.webkit.WebMessage webMessage) {
                webMessageCallbackCompat.onMessage(new androidx.webkit.internal.WebMessagePortImpl(webMessagePort2), androidx.webkit.internal.WebMessagePortImpl.frameworkMessageToCompat(webMessage));
            }
        });
    }

    public static void setWebMessageCallback(android.webkit.WebMessagePort webMessagePort, final androidx.webkit.WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat, android.os.Handler handler) {
        webMessagePort.setWebMessageCallback(new android.webkit.WebMessagePort.WebMessageCallback() { // from class: androidx.webkit.internal.ApiHelperForM.2
            @Override // android.webkit.WebMessagePort.WebMessageCallback
            public void onMessage(android.webkit.WebMessagePort webMessagePort2, android.webkit.WebMessage webMessage) {
                webMessageCallbackCompat.onMessage(new androidx.webkit.internal.WebMessagePortImpl(webMessagePort2), androidx.webkit.internal.WebMessagePortImpl.frameworkMessageToCompat(webMessage));
            }
        }, handler);
    }

    public static android.webkit.WebMessage createWebMessage(androidx.webkit.WebMessageCompat webMessageCompat) {
        return new android.webkit.WebMessage(webMessageCompat.getData(), androidx.webkit.internal.WebMessagePortImpl.compatToPorts(webMessageCompat.getPorts()));
    }

    public static androidx.webkit.WebMessageCompat createWebMessageCompat(android.webkit.WebMessage webMessage) {
        return new androidx.webkit.WebMessageCompat(webMessage.getData(), androidx.webkit.internal.WebMessagePortImpl.portsToCompat(webMessage.getPorts()));
    }

    public static int getErrorCode(android.webkit.WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    public static java.lang.CharSequence getDescription(android.webkit.WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    public static void setOffscreenPreRaster(android.webkit.WebSettings webSettings, boolean z) {
        webSettings.setOffscreenPreRaster(z);
    }

    public static boolean getOffscreenPreRaster(android.webkit.WebSettings webSettings) {
        return webSettings.getOffscreenPreRaster();
    }

    public static void postVisualStateCallback(android.webkit.WebView webView, long j, final androidx.webkit.WebViewCompat.VisualStateCallback visualStateCallback) {
        webView.postVisualStateCallback(j, new android.webkit.WebView.VisualStateCallback() { // from class: androidx.webkit.internal.ApiHelperForM.3
            @Override // android.webkit.WebView.VisualStateCallback
            public void onComplete(long j2) {
                visualStateCallback.onComplete(j2);
            }
        });
    }

    public static void postWebMessage(android.webkit.WebView webView, android.webkit.WebMessage webMessage, android.net.Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    public static android.webkit.WebMessagePort[] createWebMessageChannel(android.webkit.WebView webView) {
        return webView.createWebMessageChannel();
    }
}
