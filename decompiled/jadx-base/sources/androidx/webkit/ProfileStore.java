package androidx.webkit;

/* JADX INFO: loaded from: classes3.dex */
public interface ProfileStore {
    boolean deleteProfile(java.lang.String str);

    java.util.List<java.lang.String> getAllProfileNames();

    androidx.webkit.Profile getOrCreateProfile(java.lang.String str);

    androidx.webkit.Profile getProfile(java.lang.String str);

    static androidx.webkit.ProfileStore getInstance() {
        if (androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            return androidx.webkit.internal.ProfileStoreImpl.getInstance();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
