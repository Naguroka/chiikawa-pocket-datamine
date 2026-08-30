package com.bytedance.sdk.component.utils;

/* JADX INFO: loaded from: classes3.dex */
public class VB {
    private static final com.bytedance.sdk.component.utils.VB.bg bg = new com.bytedance.sdk.component.utils.VB.IL();

    private static class bg {
        private bg() {
        }

        public void bg(android.webkit.WebView webView, java.lang.String str) {
            if (webView == null) {
                return;
            }
            try {
                webView.loadUrl(str);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    private static class IL extends com.bytedance.sdk.component.utils.VB.bg {
        private IL() {
            super();
        }

        @Override // com.bytedance.sdk.component.utils.VB.bg
        public void bg(android.webkit.WebView webView, java.lang.String str) {
            if (webView == null) {
                return;
            }
            boolean z = false;
            if (str != null && str.startsWith("javascript:")) {
                try {
                    webView.evaluateJavascript(str, null);
                    z = true;
                } catch (java.lang.Throwable th) {
                    boolean z2 = th instanceof java.lang.IllegalStateException;
                }
            }
            if (z) {
                return;
            }
            try {
                webView.loadUrl(str);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static void bg(android.webkit.WebView webView, java.lang.String str) {
        bg.bg(webView, str);
    }
}
