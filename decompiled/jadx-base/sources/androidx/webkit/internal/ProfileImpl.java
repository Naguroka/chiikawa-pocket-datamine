package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class ProfileImpl implements androidx.webkit.Profile {
    private final org.chromium.support_lib_boundary.ProfileBoundaryInterface mProfileImpl;

    ProfileImpl(org.chromium.support_lib_boundary.ProfileBoundaryInterface profileBoundaryInterface) {
        this.mProfileImpl = profileBoundaryInterface;
    }

    private ProfileImpl() {
        this.mProfileImpl = null;
    }

    @Override // androidx.webkit.Profile
    public java.lang.String getName() {
        if (androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            return this.mProfileImpl.getName();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.Profile
    public android.webkit.CookieManager getCookieManager() throws java.lang.IllegalStateException {
        if (androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            return this.mProfileImpl.getCookieManager();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.Profile
    public android.webkit.WebStorage getWebStorage() throws java.lang.IllegalStateException {
        if (androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            return this.mProfileImpl.getWebStorage();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.Profile
    public android.webkit.GeolocationPermissions getGeolocationPermissions() throws java.lang.IllegalStateException {
        if (androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            return this.mProfileImpl.getGeoLocationPermissions();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.Profile
    public android.webkit.ServiceWorkerController getServiceWorkerController() throws java.lang.IllegalStateException {
        if (androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            return this.mProfileImpl.getServiceWorkerController();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
