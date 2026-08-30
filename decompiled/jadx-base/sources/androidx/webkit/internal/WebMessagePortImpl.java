package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class WebMessagePortImpl extends androidx.webkit.WebMessagePortCompat {
    private org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface mBoundaryInterface;
    private android.webkit.WebMessagePort mFrameworksImpl;

    public WebMessagePortImpl(android.webkit.WebMessagePort webMessagePort) {
        this.mFrameworksImpl = webMessagePort;
    }

    public WebMessagePortImpl(java.lang.reflect.InvocationHandler invocationHandler) {
        this.mBoundaryInterface = (org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface.class, invocationHandler);
    }

    private android.webkit.WebMessagePort getFrameworksImpl() {
        if (this.mFrameworksImpl == null) {
            this.mFrameworksImpl = androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter().convertWebMessagePort(java.lang.reflect.Proxy.getInvocationHandler(this.mBoundaryInterface));
        }
        return this.mFrameworksImpl;
    }

    private org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface getBoundaryInterface() {
        if (this.mBoundaryInterface == null) {
            this.mBoundaryInterface = (org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface.class, androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter().convertWebMessagePort(this.mFrameworksImpl));
        }
        return this.mBoundaryInterface;
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public void postMessage(androidx.webkit.WebMessageCompat webMessageCompat) {
        androidx.webkit.internal.ApiFeature.M m = androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_PORT_POST_MESSAGE;
        if (m.isSupportedByFramework() && webMessageCompat.getType() == 0) {
            androidx.webkit.internal.ApiHelperForM.postMessage(getFrameworksImpl(), compatToFrameworkMessage(webMessageCompat));
        } else {
            if (m.isSupportedByWebView() && androidx.webkit.internal.WebMessageAdapter.isMessagePayloadTypeSupportedByWebView(webMessageCompat.getType())) {
                getBoundaryInterface().postMessage(org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.WebMessageAdapter(webMessageCompat)));
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public void close() {
        androidx.webkit.internal.ApiFeature.M m = androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_PORT_CLOSE;
        if (m.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForM.close(getFrameworksImpl());
        } else {
            if (m.isSupportedByWebView()) {
                getBoundaryInterface().close();
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public void setWebMessageCallback(androidx.webkit.WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat) {
        androidx.webkit.internal.ApiFeature.M m = androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK;
        if (m.isSupportedByWebView()) {
            getBoundaryInterface().setWebMessageCallback(org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.WebMessageCallbackAdapter(webMessageCallbackCompat)));
        } else {
            if (m.isSupportedByFramework()) {
                androidx.webkit.internal.ApiHelperForM.setWebMessageCallback(getFrameworksImpl(), webMessageCallbackCompat);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public void setWebMessageCallback(android.os.Handler handler, androidx.webkit.WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat) {
        androidx.webkit.internal.ApiFeature.M m = androidx.webkit.internal.WebViewFeatureInternal.CREATE_WEB_MESSAGE_CHANNEL;
        if (m.isSupportedByWebView()) {
            getBoundaryInterface().setWebMessageCallback(org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.WebMessageCallbackAdapter(webMessageCallbackCompat)), handler);
        } else {
            if (m.isSupportedByFramework()) {
                androidx.webkit.internal.ApiHelperForM.setWebMessageCallback(getFrameworksImpl(), webMessageCallbackCompat, handler);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public android.webkit.WebMessagePort getFrameworkPort() {
        return getFrameworksImpl();
    }

    @Override // androidx.webkit.WebMessagePortCompat
    public java.lang.reflect.InvocationHandler getInvocationHandler() {
        return java.lang.reflect.Proxy.getInvocationHandler(getBoundaryInterface());
    }

    public static androidx.webkit.WebMessagePortCompat[] portsToCompat(android.webkit.WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        androidx.webkit.WebMessagePortCompat[] webMessagePortCompatArr = new androidx.webkit.WebMessagePortCompat[webMessagePortArr.length];
        for (int i = 0; i < webMessagePortArr.length; i++) {
            webMessagePortCompatArr[i] = new androidx.webkit.internal.WebMessagePortImpl(webMessagePortArr[i]);
        }
        return webMessagePortCompatArr;
    }

    public static android.webkit.WebMessagePort[] compatToPorts(androidx.webkit.WebMessagePortCompat[] webMessagePortCompatArr) {
        if (webMessagePortCompatArr == null) {
            return null;
        }
        int length = webMessagePortCompatArr.length;
        android.webkit.WebMessagePort[] webMessagePortArr = new android.webkit.WebMessagePort[length];
        for (int i = 0; i < length; i++) {
            webMessagePortArr[i] = webMessagePortCompatArr[i].getFrameworkPort();
        }
        return webMessagePortArr;
    }

    public static android.webkit.WebMessage compatToFrameworkMessage(androidx.webkit.WebMessageCompat webMessageCompat) {
        return androidx.webkit.internal.ApiHelperForM.createWebMessage(webMessageCompat);
    }

    public static androidx.webkit.WebMessageCompat frameworkMessageToCompat(android.webkit.WebMessage webMessage) {
        return androidx.webkit.internal.ApiHelperForM.createWebMessageCompat(webMessage);
    }
}
