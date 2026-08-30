package com.iab.omid.library.unity3d.internal;

/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.iab.omid.library.unity3d.internal.g f2462a = new com.iab.omid.library.unity3d.internal.g();

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.webkit.WebView f2463a;
        final /* synthetic */ java.lang.String b;

        a(android.webkit.WebView webView, java.lang.String str) {
            this.f2463a = webView;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.iab.omid.library.unity3d.internal.g.this.c(this.f2463a, this.b);
        }
    }

    private g() {
    }

    public static final com.iab.omid.library.unity3d.internal.g a() {
        return f2462a;
    }

    public void a(android.webkit.WebView webView, java.lang.String str) {
        a(webView, "finishSession", str);
    }

    public void a(android.webkit.WebView webView, java.lang.String str, float f) {
        a(webView, "setDeviceVolume", java.lang.Float.valueOf(f), str);
    }

    public void a(android.webkit.WebView webView, java.lang.String str, com.iab.omid.library.unity3d.adsession.ErrorType errorType, java.lang.String str2) {
        a(webView, "error", errorType.toString(), str2, str);
    }

    public void a(android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        a(webView, "setNativeViewHierarchy", str2, str);
    }

    public void a(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject) {
        a(webView, "publishMediaEvent", str2, jSONObject, str);
    }

    public void a(android.webkit.WebView webView, java.lang.String str, org.json.JSONObject jSONObject) {
        a(webView, com.ironsource.y8.a.f, jSONObject, str);
    }

    public void a(android.webkit.WebView webView, java.lang.String str, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3) {
        a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    void a(android.webkit.WebView webView, java.lang.String str, java.lang.Object... objArr) {
        if (webView == null) {
            com.iab.omid.library.unity3d.utils.d.a("The WebView is null for " + str);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
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
            c(webView, string);
        } else {
            handler.post(new com.iab.omid.library.unity3d.internal.g.a(webView, string));
        }
    }

    public void a(android.webkit.WebView webView, org.json.JSONObject jSONObject) {
        a(webView, "setLastActivity", jSONObject);
    }

    void a(java.lang.StringBuilder sb, java.lang.Object[] objArr) {
        java.lang.String string;
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        for (java.lang.Object obj : objArr) {
            if (obj == null) {
                string = "null";
            } else {
                if (obj instanceof java.lang.String) {
                    string = obj.toString();
                    if (!string.startsWith("{")) {
                        sb.append(kotlin.text.Typography.quote).append(string).append(kotlin.text.Typography.quote);
                    }
                } else {
                    sb.append(obj);
                }
                sb.append(",");
            }
            sb.append(string);
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
    }

    public void b(android.webkit.WebView webView, java.lang.String str) {
        a(webView, "publishImpressionEvent", str);
    }

    public void b(android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        a(webView, "setState", str2, str);
    }

    public void b(android.webkit.WebView webView, java.lang.String str, org.json.JSONObject jSONObject) {
        a(webView, "publishLoadedEvent", jSONObject, str);
    }

    public void c(android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        if (str == null || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        c(webView, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", str).replace("%INJECTION_ID%", str2));
    }

    public boolean c(android.webkit.WebView webView, java.lang.String str) {
        if (webView == null || android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            webView.evaluateJavascript(str, null);
            return true;
        } catch (java.lang.IllegalStateException unused) {
            webView.loadUrl("javascript: " + str);
            return true;
        }
    }
}
