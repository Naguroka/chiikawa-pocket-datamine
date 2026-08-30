package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class gw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.String f2700a = "gw";

    public static android.widget.FrameLayout a(android.content.Context context, android.view.View view) {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(context);
        frameLayout2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        frameLayout2.setVisibility(8);
        android.widget.FrameLayout frameLayout3 = new android.widget.FrameLayout(context);
        frameLayout3.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        frameLayout3.addView(view);
        frameLayout.addView(frameLayout2, layoutParams);
        frameLayout.addView(frameLayout3);
        return frameLayout;
    }

    private static void a(android.webkit.WebSettings webSettings) {
        webSettings.setDisplayZoomControls(false);
    }

    public static void a(android.webkit.WebView webView) {
        android.webkit.WebSettings settings = webView.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        try {
            a(settings);
            b(settings);
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            com.json.sdk.utils.Logger.e(f2700a, "setWebSettings - " + th.toString());
        }
    }

    private static void b(android.webkit.WebSettings webSettings) {
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }
}
