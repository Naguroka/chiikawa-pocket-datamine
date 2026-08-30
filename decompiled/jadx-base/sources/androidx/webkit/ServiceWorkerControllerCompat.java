package androidx.webkit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ServiceWorkerControllerCompat {
    public abstract androidx.webkit.ServiceWorkerWebSettingsCompat getServiceWorkerWebSettings();

    public abstract void setServiceWorkerClient(androidx.webkit.ServiceWorkerClientCompat serviceWorkerClientCompat);

    public static androidx.webkit.ServiceWorkerControllerCompat getInstance() {
        return androidx.webkit.ServiceWorkerControllerCompat.LAZY_HOLDER.INSTANCE;
    }

    private static class LAZY_HOLDER {
        static final androidx.webkit.ServiceWorkerControllerCompat INSTANCE = new androidx.webkit.internal.ServiceWorkerControllerImpl();

        private LAZY_HOLDER() {
        }
    }
}
