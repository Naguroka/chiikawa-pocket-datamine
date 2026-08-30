package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class ApiHelperForP {
    private ApiHelperForP() {
    }

    public static android.webkit.TracingController getTracingControllerInstance() {
        return android.webkit.TracingController.getInstance();
    }

    public static boolean isTracing(android.webkit.TracingController tracingController) {
        return tracingController.isTracing();
    }

    public static void start(android.webkit.TracingController tracingController, androidx.webkit.TracingConfig tracingConfig) {
        tracingController.start(new android.webkit.TracingConfig.Builder().addCategories(tracingConfig.getPredefinedCategories()).addCategories(tracingConfig.getCustomIncludedCategories()).setTracingMode(tracingConfig.getTracingMode()).build());
    }

    public static boolean stop(android.webkit.TracingController tracingController, java.io.OutputStream outputStream, java.util.concurrent.Executor executor) {
        return tracingController.stop(outputStream, executor);
    }

    public static java.lang.ClassLoader getWebViewClassLoader() {
        return android.webkit.WebView.getWebViewClassLoader();
    }

    public static android.os.Looper getWebViewLooper(android.webkit.WebView webView) {
        return webView.getWebViewLooper();
    }

    public static void setDataDirectorySuffix(java.lang.String str) {
        android.webkit.WebView.setDataDirectorySuffix(str);
    }
}
