package com.iab.omid.library.ironsrc.internal;

/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.iab.omid.library.ironsrc.internal.g f2429a = new com.iab.omid.library.ironsrc.internal.g();

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.webkit.WebView f2430a;
        final /* synthetic */ java.lang.String b;

        a(com.iab.omid.library.ironsrc.internal.g gVar, android.webkit.WebView webView, java.lang.String str) {
            this.f2430a = webView;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2430a.loadUrl(this.b);
        }
    }

    private g() {
    }

    public static final com.iab.omid.library.ironsrc.internal.g a() {
        return f2429a;
    }

    public void a(android.webkit.WebView webView) {
        a(webView, "finishSession", new java.lang.Object[0]);
    }

    public void a(android.webkit.WebView webView, float f) {
        a(webView, "setDeviceVolume", java.lang.Float.valueOf(f));
    }

    public void a(android.webkit.WebView webView, com.iab.omid.library.ironsrc.adsession.ErrorType errorType, java.lang.String str) {
        a(webView, "error", errorType.toString(), str);
    }

    public void a(android.webkit.WebView webView, java.lang.String str) {
        a(webView, "setNativeViewHierarchy", str);
    }

    public void a(android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        if (str == null || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }

    public void a(android.webkit.WebView webView, java.lang.String str, org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            a(webView, "publishMediaEvent", str, jSONObject);
        } else {
            a(webView, "publishMediaEvent", str);
        }
    }

    public void a(android.webkit.WebView webView, java.lang.String str, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3) {
        a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    void a(android.webkit.WebView webView, java.lang.String str, java.lang.Object... objArr) {
        if (webView == null) {
            com.iab.omid.library.ironsrc.utils.d.a("The WebView is null for " + str);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        a(sb, objArr);
        sb.append(")}");
        a(webView, sb);
    }

    void a(android.webkit.WebView webView, java.lang.StringBuilder sb) {
        java.lang.String string = sb.toString();
        android.os.Handler handler = webView.getHandler();
        if (handler == null || android.os.Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(string);
        } else {
            handler.post(new com.iab.omid.library.ironsrc.internal.g.a(this, webView, string));
        }
    }

    public void a(android.webkit.WebView webView, org.json.JSONObject jSONObject) {
        a(webView, com.ironsource.y8.a.f, jSONObject);
    }

    void a(java.lang.StringBuilder sb, java.lang.Object[] objArr) {
        java.lang.StringBuilder sbAppend;
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        for (java.lang.Object obj : objArr) {
            if (obj == null) {
                sbAppend = sb.append(kotlin.text.Typography.quote);
            } else {
                if (obj instanceof java.lang.String) {
                    java.lang.String string = obj.toString();
                    if (string.startsWith("{")) {
                        sb.append(string);
                    } else {
                        sbAppend = sb.append(kotlin.text.Typography.quote).append(string);
                    }
                } else {
                    sb.append(obj);
                }
                sb.append(",");
            }
            sbAppend.append(kotlin.text.Typography.quote);
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
    }

    public void b(android.webkit.WebView webView) {
        a(webView, "publishImpressionEvent", new java.lang.Object[0]);
    }

    public void b(android.webkit.WebView webView, java.lang.String str) {
        a(webView, "setState", str);
    }

    public void b(android.webkit.WebView webView, org.json.JSONObject jSONObject) {
        a(webView, "publishLoadedEvent", jSONObject);
    }

    public void c(android.webkit.WebView webView) {
        a(webView, "publishLoadedEvent", new java.lang.Object[0]);
    }

    public void c(android.webkit.WebView webView, org.json.JSONObject jSONObject) {
        a(webView, "setLastActivity", jSONObject);
    }

    public boolean c(android.webkit.WebView webView, java.lang.String str) {
        if (webView == null || android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        webView.loadUrl("javascript: " + str);
        return true;
    }
}
