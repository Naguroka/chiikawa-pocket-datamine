package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class ApiHelperForLollipop {
    private ApiHelperForLollipop() {
    }

    public static boolean isForMainFrame(android.webkit.WebResourceRequest webResourceRequest) {
        return webResourceRequest.isForMainFrame();
    }

    public static android.net.Uri getUrl(android.webkit.WebResourceRequest webResourceRequest) {
        return webResourceRequest.getUrl();
    }
}
