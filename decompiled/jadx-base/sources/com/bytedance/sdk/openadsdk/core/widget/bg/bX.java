package com.bytedance.sdk.openadsdk.core.widget.bg;

/* JADX INFO: loaded from: classes4.dex */
public class bX {
    private final java.lang.ref.WeakReference<android.content.Context> bg;
    private boolean IL = true;
    private final boolean bX = true;
    private final boolean eqN = true;
    private final boolean zx = false;
    private final boolean ldr = true;
    private boolean iR = true;

    public static com.bytedance.sdk.openadsdk.core.widget.bg.bX bg(android.content.Context context) {
        return new com.bytedance.sdk.openadsdk.core.widget.bg.bX(context);
    }

    private bX(android.content.Context context) {
        this.bg = new java.lang.ref.WeakReference<>(context);
    }

    public com.bytedance.sdk.openadsdk.core.widget.bg.bX bg(boolean z) {
        this.iR = z;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.widget.bg.bX IL(boolean z) {
        this.IL = z;
        return this;
    }

    public void bg(android.webkit.WebView webView) {
        if (webView == null || this.bg.get() == null) {
            return;
        }
        IL(webView);
        android.webkit.WebSettings settings = webView.getSettings();
        bg(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("SSWebSettings", e.getMessage());
        }
        try {
            if (this.IL) {
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
            } else {
                settings.setSupportZoom(false);
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("SSWebSettings", th.getMessage());
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setSavePassword(false);
        try {
            if (this.iR) {
                webView.setLayerType(2, null);
            } else {
                webView.setLayerType(0, null);
            }
        } catch (java.lang.Throwable th2) {
            com.bytedance.sdk.component.utils.PX.bg("SSWebSettings", th2.getMessage());
        }
    }

    public static void IL(android.webkit.WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.IL(th.toString());
        }
    }

    private void bg(android.webkit.WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.IL(th.toString());
        }
    }
}
