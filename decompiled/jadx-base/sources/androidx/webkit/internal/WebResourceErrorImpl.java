package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class WebResourceErrorImpl extends androidx.webkit.WebResourceErrorCompat {
    private org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface mBoundaryInterface;
    private android.webkit.WebResourceError mFrameworksImpl;

    public WebResourceErrorImpl(java.lang.reflect.InvocationHandler invocationHandler) {
        this.mBoundaryInterface = (org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    public WebResourceErrorImpl(android.webkit.WebResourceError webResourceError) {
        this.mFrameworksImpl = webResourceError;
    }

    private android.webkit.WebResourceError getFrameworksImpl() {
        if (this.mFrameworksImpl == null) {
            this.mFrameworksImpl = androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter().convertWebResourceError(java.lang.reflect.Proxy.getInvocationHandler(this.mBoundaryInterface));
        }
        return this.mFrameworksImpl;
    }

    private org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface getBoundaryInterface() {
        if (this.mBoundaryInterface == null) {
            this.mBoundaryInterface = (org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface.class, androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter().convertWebResourceError(this.mFrameworksImpl));
        }
        return this.mBoundaryInterface;
    }

    @Override // androidx.webkit.WebResourceErrorCompat
    public int getErrorCode() {
        androidx.webkit.internal.ApiFeature.M m = androidx.webkit.internal.WebViewFeatureInternal.WEB_RESOURCE_ERROR_GET_CODE;
        if (m.isSupportedByFramework()) {
            return androidx.webkit.internal.ApiHelperForM.getErrorCode(getFrameworksImpl());
        }
        if (m.isSupportedByWebView()) {
            return getBoundaryInterface().getErrorCode();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.WebResourceErrorCompat
    public java.lang.CharSequence getDescription() {
        androidx.webkit.internal.ApiFeature.M m = androidx.webkit.internal.WebViewFeatureInternal.WEB_RESOURCE_ERROR_GET_DESCRIPTION;
        if (m.isSupportedByFramework()) {
            return androidx.webkit.internal.ApiHelperForM.getDescription(getFrameworksImpl());
        }
        if (m.isSupportedByWebView()) {
            return getBoundaryInterface().getDescription();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
