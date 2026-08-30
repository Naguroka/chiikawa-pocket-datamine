package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class WebResourceRequestAdapter {
    private final org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface mBoundaryInterface;

    public WebResourceRequestAdapter(org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface webResourceRequestBoundaryInterface) {
        this.mBoundaryInterface = webResourceRequestBoundaryInterface;
    }

    public boolean isRedirect() {
        return this.mBoundaryInterface.isRedirect();
    }
}
