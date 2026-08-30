package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class ApiHelperForN {
    private ApiHelperForN() {
    }

    public static java.io.File getDataDir(android.content.Context context) {
        return context.getDataDir();
    }

    public static android.webkit.ServiceWorkerController getServiceWorkerControllerInstance() {
        return android.webkit.ServiceWorkerController.getInstance();
    }

    public static android.webkit.ServiceWorkerWebSettings getServiceWorkerWebSettings(android.webkit.ServiceWorkerController serviceWorkerController) {
        return serviceWorkerController.getServiceWorkerWebSettings();
    }

    public static androidx.webkit.internal.ServiceWorkerWebSettingsImpl getServiceWorkerWebSettingsImpl(android.webkit.ServiceWorkerController serviceWorkerController) {
        return new androidx.webkit.internal.ServiceWorkerWebSettingsImpl(getServiceWorkerWebSettings(serviceWorkerController));
    }

    public static void setServiceWorkerClient(android.webkit.ServiceWorkerController serviceWorkerController, android.webkit.ServiceWorkerClient serviceWorkerClient) {
        serviceWorkerController.setServiceWorkerClient(serviceWorkerClient);
    }

    public static void setServiceWorkerClientCompat(android.webkit.ServiceWorkerController serviceWorkerController, androidx.webkit.ServiceWorkerClientCompat serviceWorkerClientCompat) {
        serviceWorkerController.setServiceWorkerClient(new androidx.webkit.internal.FrameworkServiceWorkerClient(serviceWorkerClientCompat));
    }

    public static void setCacheMode(android.webkit.ServiceWorkerWebSettings serviceWorkerWebSettings, int i) {
        serviceWorkerWebSettings.setCacheMode(i);
    }

    public static int getCacheMode(android.webkit.ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getCacheMode();
    }

    public static void setAllowContentAccess(android.webkit.ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z) {
        serviceWorkerWebSettings.setAllowContentAccess(z);
    }

    public static boolean getAllowContentAccess(android.webkit.ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getAllowContentAccess();
    }

    public static void setAllowFileAccess(android.webkit.ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z) {
        serviceWorkerWebSettings.setAllowFileAccess(z);
    }

    public static boolean getAllowFileAccess(android.webkit.ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getAllowFileAccess();
    }

    public static void setBlockNetworkLoads(android.webkit.ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z) {
        serviceWorkerWebSettings.setBlockNetworkLoads(z);
    }

    public static boolean getBlockNetworkLoads(android.webkit.ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getBlockNetworkLoads();
    }

    public static boolean isRedirect(android.webkit.WebResourceRequest webResourceRequest) {
        return webResourceRequest.isRedirect();
    }

    public static void setDisabledActionModeMenuItems(android.webkit.WebSettings webSettings, int i) {
        webSettings.setDisabledActionModeMenuItems(i);
    }

    public static int getDisabledActionModeMenuItems(android.webkit.WebSettings webSettings) {
        return webSettings.getDisabledActionModeMenuItems();
    }
}
