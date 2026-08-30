package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class WebMessageAdapter implements org.chromium.support_lib_boundary.WebMessageBoundaryInterface {
    private static final java.lang.String[] sFeatures = {"WEB_MESSAGE_ARRAY_BUFFER"};
    private androidx.webkit.WebMessageCompat mWebMessageCompat;

    public WebMessageAdapter(androidx.webkit.WebMessageCompat webMessageCompat) {
        this.mWebMessageCompat = webMessageCompat;
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @java.lang.Deprecated
    public java.lang.String getData() {
        return this.mWebMessageCompat.getData();
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public java.lang.reflect.InvocationHandler getMessagePayload() {
        androidx.webkit.internal.WebMessagePayloadAdapter webMessagePayloadAdapter;
        int type = this.mWebMessageCompat.getType();
        if (type == 0) {
            webMessagePayloadAdapter = new androidx.webkit.internal.WebMessagePayloadAdapter(this.mWebMessageCompat.getData());
        } else if (type == 1) {
            webMessagePayloadAdapter = new androidx.webkit.internal.WebMessagePayloadAdapter((byte[]) java.util.Objects.requireNonNull(this.mWebMessageCompat.getArrayBuffer()));
        } else {
            throw new java.lang.IllegalStateException("Unknown web message payload type: " + this.mWebMessageCompat.getType());
        }
        return org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(webMessagePayloadAdapter);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public java.lang.reflect.InvocationHandler[] getPorts() {
        androidx.webkit.WebMessagePortCompat[] ports = this.mWebMessageCompat.getPorts();
        if (ports == null) {
            return null;
        }
        java.lang.reflect.InvocationHandler[] invocationHandlerArr = new java.lang.reflect.InvocationHandler[ports.length];
        for (int i = 0; i < ports.length; i++) {
            invocationHandlerArr[i] = ports[i].getInvocationHandler();
        }
        return invocationHandlerArr;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public java.lang.String[] getSupportedFeatures() {
        return sFeatures;
    }

    public static boolean isMessagePayloadTypeSupportedByWebView(int i) {
        if (i != 0) {
            return i == 1 && androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_ARRAY_BUFFER.isSupportedByWebView();
        }
        return true;
    }

    public static androidx.webkit.WebMessageCompat webMessageCompatFromBoundaryInterface(org.chromium.support_lib_boundary.WebMessageBoundaryInterface webMessageBoundaryInterface) {
        androidx.webkit.WebMessagePortCompat[] webMessagePortCompats = toWebMessagePortCompats(webMessageBoundaryInterface.getPorts());
        if (androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_ARRAY_BUFFER.isSupportedByWebView()) {
            org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type == 0) {
                return new androidx.webkit.WebMessageCompat(webMessagePayloadBoundaryInterface.getAsString(), webMessagePortCompats);
            }
            if (type != 1) {
                return null;
            }
            return new androidx.webkit.WebMessageCompat(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), webMessagePortCompats);
        }
        return new androidx.webkit.WebMessageCompat(webMessageBoundaryInterface.getData(), webMessagePortCompats);
    }

    private static androidx.webkit.WebMessagePortCompat[] toWebMessagePortCompats(java.lang.reflect.InvocationHandler[] invocationHandlerArr) {
        androidx.webkit.WebMessagePortCompat[] webMessagePortCompatArr = new androidx.webkit.WebMessagePortCompat[invocationHandlerArr.length];
        for (int i = 0; i < invocationHandlerArr.length; i++) {
            webMessagePortCompatArr[i] = new androidx.webkit.internal.WebMessagePortImpl(invocationHandlerArr[i]);
        }
        return webMessagePortCompatArr;
    }
}
