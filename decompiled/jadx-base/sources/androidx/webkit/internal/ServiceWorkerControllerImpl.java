package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class ServiceWorkerControllerImpl extends androidx.webkit.ServiceWorkerControllerCompat {
    private org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface mBoundaryInterface;
    private android.webkit.ServiceWorkerController mFrameworksImpl;
    private final androidx.webkit.ServiceWorkerWebSettingsCompat mWebSettings;

    public ServiceWorkerControllerImpl() {
        androidx.webkit.internal.ApiFeature.N n = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_BASIC_USAGE;
        if (n.isSupportedByFramework()) {
            this.mFrameworksImpl = androidx.webkit.internal.ApiHelperForN.getServiceWorkerControllerInstance();
            this.mBoundaryInterface = null;
            this.mWebSettings = androidx.webkit.internal.ApiHelperForN.getServiceWorkerWebSettingsImpl(getFrameworksImpl());
        } else {
            if (n.isSupportedByWebView()) {
                this.mFrameworksImpl = null;
                this.mBoundaryInterface = androidx.webkit.internal.WebViewGlueCommunicator.getFactory().getServiceWorkerController();
                this.mWebSettings = new androidx.webkit.internal.ServiceWorkerWebSettingsImpl(this.mBoundaryInterface.getServiceWorkerWebSettings());
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    private android.webkit.ServiceWorkerController getFrameworksImpl() {
        if (this.mFrameworksImpl == null) {
            this.mFrameworksImpl = androidx.webkit.internal.ApiHelperForN.getServiceWorkerControllerInstance();
        }
        return this.mFrameworksImpl;
    }

    private org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface getBoundaryInterface() {
        if (this.mBoundaryInterface == null) {
            this.mBoundaryInterface = androidx.webkit.internal.WebViewGlueCommunicator.getFactory().getServiceWorkerController();
        }
        return this.mBoundaryInterface;
    }

    @Override // androidx.webkit.ServiceWorkerControllerCompat
    public androidx.webkit.ServiceWorkerWebSettingsCompat getServiceWorkerWebSettings() {
        return this.mWebSettings;
    }

    @Override // androidx.webkit.ServiceWorkerControllerCompat
    public void setServiceWorkerClient(androidx.webkit.ServiceWorkerClientCompat serviceWorkerClientCompat) {
        androidx.webkit.internal.ApiFeature.N n = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_BASIC_USAGE;
        if (n.isSupportedByFramework()) {
            if (serviceWorkerClientCompat == null) {
                androidx.webkit.internal.ApiHelperForN.setServiceWorkerClient(getFrameworksImpl(), null);
                return;
            } else {
                androidx.webkit.internal.ApiHelperForN.setServiceWorkerClientCompat(getFrameworksImpl(), serviceWorkerClientCompat);
                return;
            }
        }
        if (!n.isSupportedByWebView()) {
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
        if (serviceWorkerClientCompat == null) {
            getBoundaryInterface().setServiceWorkerClient(null);
        } else {
            getBoundaryInterface().setServiceWorkerClient(org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.ServiceWorkerClientAdapter(serviceWorkerClientCompat)));
        }
    }
}
