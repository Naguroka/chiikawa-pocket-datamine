package com.onevcat.uniwebview;

/* JADX INFO: renamed from: com.onevcat.uniwebview.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1587u {
    public static void a(android.app.Activity activity, java.lang.String host, java.lang.String realm) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "host");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realm, "realm");
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            android.webkit.WebViewDatabase.getInstance(activity).clearHttpAuthUsernamePassword();
            return;
        }
        android.webkit.WebView webView = new android.webkit.WebView(activity);
        webView.setHttpAuthUsernamePassword(host, realm, null, null);
        webView.destroy();
    }
}
