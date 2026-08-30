package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class xxp {
    public static void bg(android.net.Uri uri, com.bytedance.sdk.openadsdk.core.aGH agh) {
        if (agh == null || !agh.bg(uri)) {
            return;
        }
        try {
            agh.IL(uri);
        } catch (java.lang.Exception e) {
            new java.lang.StringBuilder("TTAndroidObj handleUri exception: ").append(e);
        }
    }

    public static java.lang.String bg(android.webkit.WebView webView, int i) {
        if (webView == null) {
            return "";
        }
        java.lang.String userAgentString = webView.getSettings().getUserAgentString();
        if (android.text.TextUtils.isEmpty(userAgentString)) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(userAgentString);
        sb.append(" open_news open_news_u_s/").append(i);
        return sb.toString();
    }
}
