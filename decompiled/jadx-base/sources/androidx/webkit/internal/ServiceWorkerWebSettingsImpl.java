package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class ServiceWorkerWebSettingsImpl extends androidx.webkit.ServiceWorkerWebSettingsCompat {
    private org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface mBoundaryInterface;
    private android.webkit.ServiceWorkerWebSettings mFrameworksImpl;

    public ServiceWorkerWebSettingsImpl(android.webkit.ServiceWorkerWebSettings serviceWorkerWebSettings) {
        this.mFrameworksImpl = serviceWorkerWebSettings;
    }

    public ServiceWorkerWebSettingsImpl(java.lang.reflect.InvocationHandler invocationHandler) {
        this.mBoundaryInterface = (org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface.class, invocationHandler);
    }

    private android.webkit.ServiceWorkerWebSettings getFrameworksImpl() {
        if (this.mFrameworksImpl == null) {
            this.mFrameworksImpl = androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter().convertServiceWorkerSettings(java.lang.reflect.Proxy.getInvocationHandler(this.mBoundaryInterface));
        }
        return this.mFrameworksImpl;
    }

    private org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface getBoundaryInterface() {
        if (this.mBoundaryInterface == null) {
            this.mBoundaryInterface = (org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface.class, androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter().convertServiceWorkerSettings(this.mFrameworksImpl));
        }
        return this.mBoundaryInterface;
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setCacheMode(int i) {
        androidx.webkit.internal.ApiFeature.N n = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_CACHE_MODE;
        if (n.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForN.setCacheMode(getFrameworksImpl(), i);
        } else {
            if (n.isSupportedByWebView()) {
                getBoundaryInterface().setCacheMode(i);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public int getCacheMode() {
        androidx.webkit.internal.ApiFeature.N n = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_CACHE_MODE;
        if (n.isSupportedByFramework()) {
            return androidx.webkit.internal.ApiHelperForN.getCacheMode(getFrameworksImpl());
        }
        if (n.isSupportedByWebView()) {
            return getBoundaryInterface().getCacheMode();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setAllowContentAccess(boolean z) {
        androidx.webkit.internal.ApiFeature.N n = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_CONTENT_ACCESS;
        if (n.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForN.setAllowContentAccess(getFrameworksImpl(), z);
        } else {
            if (n.isSupportedByWebView()) {
                getBoundaryInterface().setAllowContentAccess(z);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean getAllowContentAccess() {
        androidx.webkit.internal.ApiFeature.N n = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_CONTENT_ACCESS;
        if (n.isSupportedByFramework()) {
            return androidx.webkit.internal.ApiHelperForN.getAllowContentAccess(getFrameworksImpl());
        }
        if (n.isSupportedByWebView()) {
            return getBoundaryInterface().getAllowContentAccess();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setAllowFileAccess(boolean z) {
        androidx.webkit.internal.ApiFeature.N n = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_FILE_ACCESS;
        if (n.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForN.setAllowFileAccess(getFrameworksImpl(), z);
        } else {
            if (n.isSupportedByWebView()) {
                getBoundaryInterface().setAllowFileAccess(z);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean getAllowFileAccess() {
        androidx.webkit.internal.ApiFeature.N n = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_FILE_ACCESS;
        if (n.isSupportedByFramework()) {
            return androidx.webkit.internal.ApiHelperForN.getAllowFileAccess(getFrameworksImpl());
        }
        if (n.isSupportedByWebView()) {
            return getBoundaryInterface().getAllowFileAccess();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setBlockNetworkLoads(boolean z) {
        androidx.webkit.internal.ApiFeature.N n = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_BLOCK_NETWORK_LOADS;
        if (n.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForN.setBlockNetworkLoads(getFrameworksImpl(), z);
        } else {
            if (n.isSupportedByWebView()) {
                getBoundaryInterface().setBlockNetworkLoads(z);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean getBlockNetworkLoads() {
        androidx.webkit.internal.ApiFeature.N n = androidx.webkit.internal.WebViewFeatureInternal.SERVICE_WORKER_BLOCK_NETWORK_LOADS;
        if (n.isSupportedByFramework()) {
            return androidx.webkit.internal.ApiHelperForN.getBlockNetworkLoads(getFrameworksImpl());
        }
        if (n.isSupportedByWebView()) {
            return getBoundaryInterface().getBlockNetworkLoads();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public java.util.Set<java.lang.String> getRequestedWithHeaderOriginAllowList() {
        if (androidx.webkit.internal.WebViewFeatureInternal.REQUESTED_WITH_HEADER_ALLOW_LIST.isSupportedByWebView()) {
            return getBoundaryInterface().getRequestedWithHeaderOriginAllowList();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setRequestedWithHeaderOriginAllowList(java.util.Set<java.lang.String> set) {
        if (androidx.webkit.internal.WebViewFeatureInternal.REQUESTED_WITH_HEADER_ALLOW_LIST.isSupportedByWebView()) {
            getBoundaryInterface().setRequestedWithHeaderOriginAllowList(set);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
