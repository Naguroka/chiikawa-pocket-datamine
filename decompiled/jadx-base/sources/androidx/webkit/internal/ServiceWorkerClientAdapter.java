package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class ServiceWorkerClientAdapter implements org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface {
    private final androidx.webkit.ServiceWorkerClientCompat mClient;

    public ServiceWorkerClientAdapter(androidx.webkit.ServiceWorkerClientCompat serviceWorkerClientCompat) {
        this.mClient = serviceWorkerClientCompat;
    }

    @Override // org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebResourceRequest webResourceRequest) {
        return this.mClient.shouldInterceptRequest(webResourceRequest);
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public java.lang.String[] getSupportedFeatures() {
        return new java.lang.String[]{"SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST"};
    }
}
