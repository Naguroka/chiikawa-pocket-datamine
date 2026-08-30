package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class WebMessageCallbackAdapter implements org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface {
    private final androidx.webkit.WebMessagePortCompat.WebMessageCallbackCompat mImpl;

    public WebMessageCallbackAdapter(androidx.webkit.WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat) {
        this.mImpl = webMessageCallbackCompat;
    }

    @Override // org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface
    public void onMessage(java.lang.reflect.InvocationHandler invocationHandler, java.lang.reflect.InvocationHandler invocationHandler2) {
        androidx.webkit.WebMessageCompat webMessageCompatWebMessageCompatFromBoundaryInterface = androidx.webkit.internal.WebMessageAdapter.webMessageCompatFromBoundaryInterface((org.chromium.support_lib_boundary.WebMessageBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebMessageBoundaryInterface.class, invocationHandler2));
        if (webMessageCompatWebMessageCompatFromBoundaryInterface != null) {
            this.mImpl.onMessage(new androidx.webkit.internal.WebMessagePortImpl(invocationHandler), webMessageCompatWebMessageCompatFromBoundaryInterface);
        }
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public java.lang.String[] getSupportedFeatures() {
        return new java.lang.String[]{"WEB_MESSAGE_CALLBACK_ON_MESSAGE"};
    }
}
