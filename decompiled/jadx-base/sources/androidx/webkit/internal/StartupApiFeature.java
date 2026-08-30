package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class StartupApiFeature {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final java.lang.String METADATA_HOLDER_SERVICE_NAME = "org.chromium.android_webview.services.StartupFeatureMetadataHolder";
    private static final java.util.Set<androidx.webkit.internal.StartupApiFeature> sValues = new java.util.HashSet();
    private final java.lang.String mInternalFeatureValue;
    private final java.lang.String mPublicFeatureValue;

    public abstract boolean isSupportedByFramework();

    StartupApiFeature(java.lang.String str, java.lang.String str2) {
        this.mPublicFeatureValue = str;
        this.mInternalFeatureValue = str2;
        sValues.add(this);
    }

    public java.lang.String getPublicFeatureName() {
        return this.mPublicFeatureValue;
    }

    public boolean isSupported(android.content.Context context) {
        return isSupportedByFramework() || isSupportedByWebView(context);
    }

    public boolean isSupportedByWebView(android.content.Context context) {
        android.os.Bundle metaDataFromWebViewManifestOrNull = getMetaDataFromWebViewManifestOrNull(context);
        if (metaDataFromWebViewManifestOrNull == null) {
            return false;
        }
        return metaDataFromWebViewManifestOrNull.containsKey(this.mInternalFeatureValue);
    }

    public static java.util.Set<androidx.webkit.internal.StartupApiFeature> values() {
        return java.util.Collections.unmodifiableSet(sValues);
    }

    private static android.os.Bundle getMetaDataFromWebViewManifestOrNull(android.content.Context context) {
        android.content.pm.PackageInfo currentWebViewPackage = androidx.webkit.WebViewCompat.getCurrentWebViewPackage(context);
        if (currentWebViewPackage == null) {
            return null;
        }
        android.content.ComponentName componentName = new android.content.ComponentName(currentWebViewPackage.packageName, METADATA_HOLDER_SERVICE_NAME);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            try {
                return androidx.webkit.internal.ApiHelperForTiramisu.getServiceInfo(context.getPackageManager(), componentName, androidx.webkit.internal.ApiHelperForTiramisu.of(640L)).metaData;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        try {
            return getServiceInfo(context, componentName, 640).metaData;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            return null;
        }
    }

    private static android.content.pm.ServiceInfo getServiceInfo(android.content.Context context, android.content.ComponentName componentName, int i) throws android.content.pm.PackageManager.NameNotFoundException {
        return context.getPackageManager().getServiceInfo(componentName, i);
    }

    public static class P extends androidx.webkit.internal.StartupApiFeature {
        P(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.StartupApiFeature
        public final boolean isSupportedByFramework() {
            return android.os.Build.VERSION.SDK_INT >= 28;
        }
    }

    public static class NoFramework extends androidx.webkit.internal.StartupApiFeature {
        @Override // androidx.webkit.internal.StartupApiFeature
        public final boolean isSupportedByFramework() {
            return false;
        }

        NoFramework(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }
    }
}
