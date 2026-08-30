package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class TracingControllerImpl extends androidx.webkit.TracingController {
    private org.chromium.support_lib_boundary.TracingControllerBoundaryInterface mBoundaryInterface;
    private android.webkit.TracingController mFrameworksImpl;

    public TracingControllerImpl() {
        androidx.webkit.internal.ApiFeature.P p = androidx.webkit.internal.WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE;
        if (p.isSupportedByFramework()) {
            this.mFrameworksImpl = androidx.webkit.internal.ApiHelperForP.getTracingControllerInstance();
            this.mBoundaryInterface = null;
        } else {
            if (p.isSupportedByWebView()) {
                this.mFrameworksImpl = null;
                this.mBoundaryInterface = androidx.webkit.internal.WebViewGlueCommunicator.getFactory().getTracingController();
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    private android.webkit.TracingController getFrameworksImpl() {
        if (this.mFrameworksImpl == null) {
            this.mFrameworksImpl = androidx.webkit.internal.ApiHelperForP.getTracingControllerInstance();
        }
        return this.mFrameworksImpl;
    }

    private org.chromium.support_lib_boundary.TracingControllerBoundaryInterface getBoundaryInterface() {
        if (this.mBoundaryInterface == null) {
            this.mBoundaryInterface = androidx.webkit.internal.WebViewGlueCommunicator.getFactory().getTracingController();
        }
        return this.mBoundaryInterface;
    }

    @Override // androidx.webkit.TracingController
    public boolean isTracing() {
        androidx.webkit.internal.ApiFeature.P p = androidx.webkit.internal.WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE;
        if (p.isSupportedByFramework()) {
            return androidx.webkit.internal.ApiHelperForP.isTracing(getFrameworksImpl());
        }
        if (p.isSupportedByWebView()) {
            return getBoundaryInterface().isTracing();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @Override // androidx.webkit.TracingController
    public void start(androidx.webkit.TracingConfig tracingConfig) {
        if (tracingConfig == null) {
            throw new java.lang.IllegalArgumentException("Tracing config must be non null");
        }
        androidx.webkit.internal.ApiFeature.P p = androidx.webkit.internal.WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE;
        if (p.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForP.start(getFrameworksImpl(), tracingConfig);
        } else {
            if (p.isSupportedByWebView()) {
                getBoundaryInterface().start(tracingConfig.getPredefinedCategories(), tracingConfig.getCustomIncludedCategories(), tracingConfig.getTracingMode());
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Override // androidx.webkit.TracingController
    public boolean stop(java.io.OutputStream outputStream, java.util.concurrent.Executor executor) {
        androidx.webkit.internal.ApiFeature.P p = androidx.webkit.internal.WebViewFeatureInternal.TRACING_CONTROLLER_BASIC_USAGE;
        if (p.isSupportedByFramework()) {
            return androidx.webkit.internal.ApiHelperForP.stop(getFrameworksImpl(), outputStream, executor);
        }
        if (p.isSupportedByWebView()) {
            return getBoundaryInterface().stop(outputStream, executor);
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
