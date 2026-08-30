package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class SafeBrowsingResponseImpl extends androidx.webkit.SafeBrowsingResponseCompat {
    private org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface mBoundaryInterface;
    private android.webkit.SafeBrowsingResponse mFrameworksImpl;

    public SafeBrowsingResponseImpl(java.lang.reflect.InvocationHandler invocationHandler) {
        this.mBoundaryInterface = (org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    public SafeBrowsingResponseImpl(android.webkit.SafeBrowsingResponse safeBrowsingResponse) {
        this.mFrameworksImpl = safeBrowsingResponse;
    }

    private android.webkit.SafeBrowsingResponse getFrameworksImpl() {
        if (this.mFrameworksImpl == null) {
            this.mFrameworksImpl = androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter().convertSafeBrowsingResponse(java.lang.reflect.Proxy.getInvocationHandler(this.mBoundaryInterface));
        }
        return this.mFrameworksImpl;
    }

    private org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface getBoundaryInterface() {
        if (this.mBoundaryInterface == null) {
            this.mBoundaryInterface = (org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface.class, androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter().convertSafeBrowsingResponse(this.mFrameworksImpl));
        }
        return this.mBoundaryInterface;
    }

    @Override // androidx.webkit.SafeBrowsingResponseCompat
    public void showInterstitial(boolean z) {
        androidx.webkit.internal.ApiFeature.O_MR1 o_mr1 = androidx.webkit.internal.WebViewFeatureInternal.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL;
        if (o_mr1.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForOMR1.showInterstitial(getFrameworksImpl(), z);
        } else {
            if (o_mr1.isSupportedByWebView()) {
                getBoundaryInterface().showInterstitial(z);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Override // androidx.webkit.SafeBrowsingResponseCompat
    public void proceed(boolean z) {
        androidx.webkit.internal.ApiFeature.O_MR1 o_mr1 = androidx.webkit.internal.WebViewFeatureInternal.SAFE_BROWSING_RESPONSE_PROCEED;
        if (o_mr1.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForOMR1.proceed(getFrameworksImpl(), z);
        } else {
            if (o_mr1.isSupportedByWebView()) {
                getBoundaryInterface().proceed(z);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Override // androidx.webkit.SafeBrowsingResponseCompat
    public void backToSafety(boolean z) {
        androidx.webkit.internal.ApiFeature.O_MR1 o_mr1 = androidx.webkit.internal.WebViewFeatureInternal.SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY;
        if (o_mr1.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForOMR1.backToSafety(getFrameworksImpl(), z);
        } else {
            if (o_mr1.isSupportedByWebView()) {
                getBoundaryInterface().backToSafety(z);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }
}
