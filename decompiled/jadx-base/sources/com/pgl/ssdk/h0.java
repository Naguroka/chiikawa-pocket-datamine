package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class h0 {
    public static java.lang.String a() {
        android.content.pm.ApplicationInfo applicationInfo;
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return "!version_error!";
        }
        android.content.pm.PackageInfo currentWebViewPackage = android.webkit.WebView.getCurrentWebViewPackage();
        return (currentWebViewPackage == null || (applicationInfo = currentWebViewPackage.applicationInfo) == null) ? "!error!" : applicationInfo.publicSourceDir;
    }
}
