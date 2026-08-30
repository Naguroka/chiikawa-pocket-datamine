package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class FrameworkServiceWorkerClient extends android.webkit.ServiceWorkerClient {
    private final androidx.webkit.ServiceWorkerClientCompat mImpl;

    public FrameworkServiceWorkerClient(androidx.webkit.ServiceWorkerClientCompat serviceWorkerClientCompat) {
        this.mImpl = serviceWorkerClientCompat;
    }

    @Override // android.webkit.ServiceWorkerClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebResourceRequest webResourceRequest) {
        return this.mImpl.shouldInterceptRequest(webResourceRequest);
    }
}
