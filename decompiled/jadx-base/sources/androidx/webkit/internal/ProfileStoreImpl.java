package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class ProfileStoreImpl implements androidx.webkit.ProfileStore {
    private static androidx.webkit.ProfileStore sInstance;
    private final org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface mProfileStoreImpl;

    private ProfileStoreImpl(org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.mProfileStoreImpl = profileStoreBoundaryInterface;
    }

    private ProfileStoreImpl() {
        this.mProfileStoreImpl = null;
    }

    public static androidx.webkit.ProfileStore getInstance() {
        if (sInstance == null) {
            sInstance = new androidx.webkit.internal.ProfileStoreImpl(androidx.webkit.internal.WebViewGlueCommunicator.getFactory().getProfileStore());
        }
        return sInstance;
    }

    @Override // androidx.webkit.ProfileStore
    public androidx.webkit.Profile getOrCreateProfile(java.lang.String str) {
        if (androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            return new androidx.webkit.internal.ProfileImpl((org.chromium.support_lib_boundary.ProfileBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.ProfileBoundaryInterface.class, this.mProfileStoreImpl.getOrCreateProfile(str)));
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ProfileStore
    public androidx.webkit.Profile getProfile(java.lang.String str) {
        if (androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            java.lang.reflect.InvocationHandler profile = this.mProfileStoreImpl.getProfile(str);
            if (profile != null) {
                return new androidx.webkit.internal.ProfileImpl((org.chromium.support_lib_boundary.ProfileBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.ProfileBoundaryInterface.class, profile));
            }
            return null;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ProfileStore
    public java.util.List<java.lang.String> getAllProfileNames() {
        if (androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            return this.mProfileStoreImpl.getAllProfileNames();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.ProfileStore
    public boolean deleteProfile(java.lang.String str) throws java.lang.IllegalStateException {
        if (androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            return this.mProfileStoreImpl.deleteProfile(str);
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
