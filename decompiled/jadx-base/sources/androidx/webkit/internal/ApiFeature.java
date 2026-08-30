package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ApiFeature implements androidx.webkit.internal.ConditionallySupportedFeature {
    private static final java.util.Set<androidx.webkit.internal.ApiFeature> sValues = new java.util.HashSet();
    private final java.lang.String mInternalFeatureValue;
    private final java.lang.String mPublicFeatureValue;

    public abstract boolean isSupportedByFramework();

    ApiFeature(java.lang.String str, java.lang.String str2) {
        this.mPublicFeatureValue = str;
        this.mInternalFeatureValue = str2;
        sValues.add(this);
    }

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    public java.lang.String getPublicFeatureName() {
        return this.mPublicFeatureValue;
    }

    @Override // androidx.webkit.internal.ConditionallySupportedFeature
    public boolean isSupported() {
        return isSupportedByFramework() || isSupportedByWebView();
    }

    public boolean isSupportedByWebView() {
        return org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.containsFeature(androidx.webkit.internal.ApiFeature.LAZY_HOLDER.WEBVIEW_APK_FEATURES, this.mInternalFeatureValue);
    }

    public static java.util.Set<androidx.webkit.internal.ApiFeature> values() {
        return java.util.Collections.unmodifiableSet(sValues);
    }

    public static java.util.Set<java.lang.String> getWebViewApkFeaturesForTesting() {
        return androidx.webkit.internal.ApiFeature.LAZY_HOLDER.WEBVIEW_APK_FEATURES;
    }

    private static class LAZY_HOLDER {
        static final java.util.Set<java.lang.String> WEBVIEW_APK_FEATURES = new java.util.HashSet(java.util.Arrays.asList(androidx.webkit.internal.WebViewGlueCommunicator.getFactory().getWebViewFeatures()));

        private LAZY_HOLDER() {
        }
    }

    public static class NoFramework extends androidx.webkit.internal.ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return false;
        }

        NoFramework(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }
    }

    public static class M extends androidx.webkit.internal.ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return true;
        }

        M(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }
    }

    public static class N extends androidx.webkit.internal.ApiFeature {
        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return true;
        }

        N(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }
    }

    public static class O extends androidx.webkit.internal.ApiFeature {
        O(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return android.os.Build.VERSION.SDK_INT >= 26;
        }
    }

    public static class O_MR1 extends androidx.webkit.internal.ApiFeature {
        O_MR1(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return android.os.Build.VERSION.SDK_INT >= 27;
        }
    }

    public static class P extends androidx.webkit.internal.ApiFeature {
        P(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return android.os.Build.VERSION.SDK_INT >= 28;
        }
    }

    public static class Q extends androidx.webkit.internal.ApiFeature {
        Q(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return android.os.Build.VERSION.SDK_INT >= 29;
        }
    }

    public static class T extends androidx.webkit.internal.ApiFeature {
        T(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return android.os.Build.VERSION.SDK_INT >= 33;
        }
    }
}
