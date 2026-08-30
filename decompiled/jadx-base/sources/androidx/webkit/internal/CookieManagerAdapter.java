package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class CookieManagerAdapter {
    private final org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface mBoundaryInterface;

    public CookieManagerAdapter(org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface webViewCookieManagerBoundaryInterface) {
        this.mBoundaryInterface = webViewCookieManagerBoundaryInterface;
    }

    public java.util.List<java.lang.String> getCookieInfo(java.lang.String str) {
        return this.mBoundaryInterface.getCookieInfo(str);
    }
}
