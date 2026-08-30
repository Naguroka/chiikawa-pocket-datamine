package com.applovin.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinWebViewActivity extends android.app.Activity {
    public static final java.lang.String EVENT_DISMISSED_VIA_BACK_BUTTON = "dismissed_via_back_button";
    public static final java.lang.String INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON = "immersive_mode_on";
    public static final java.lang.String INTENT_EXTRA_KEY_LOAD_URL = "load_url";
    public static final java.lang.String INTENT_EXTRA_KEY_SDK_KEY = "sdk_key";
    public static final java.lang.String URI_PATH_WEBVIEW_EVENT = "webview_event";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f1611a = new java.util.concurrent.atomic.AtomicBoolean();
    private java.lang.String b;
    private android.webkit.WebView c;
    private com.applovin.sdk.AppLovinWebViewActivity.EventListener d;

    public interface EventListener {
        void onReceivedEvent(java.lang.String str);
    }

    class a extends com.applovin.impl.pi {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.j f1612a;

        a(com.applovin.impl.sdk.j jVar) {
            this.f1612a = jVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(com.applovin.impl.sdk.j jVar) {
            if (!((java.lang.Boolean) jVar.a(com.applovin.impl.sj.F5)).booleanValue() || !com.applovin.sdk.AppLovinWebViewActivity.this.f1611a.compareAndSet(false, true)) {
                com.applovin.sdk.AppLovinWebViewActivity.this.finish();
                return;
            }
            com.applovin.sdk.AppLovinWebViewActivity.this.a(jVar);
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(com.applovin.sdk.AppLovinWebViewActivity.this.b)) {
                com.applovin.sdk.AppLovinWebViewActivity.this.c.loadUrl(com.applovin.sdk.AppLovinWebViewActivity.this.b);
            }
        }

        @Override // com.applovin.impl.pi, android.webkit.WebViewClient
        public boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
            if (com.applovin.sdk.AppLovinWebViewActivity.this.c == webView) {
                com.applovin.sdk.AppLovinWebViewActivity.this.c.destroy();
                com.applovin.sdk.AppLovinWebViewActivity.this.c = null;
                com.applovin.sdk.AppLovinWebViewActivity appLovinWebViewActivity = com.applovin.sdk.AppLovinWebViewActivity.this;
                final com.applovin.impl.sdk.j jVar = this.f1612a;
                appLovinWebViewActivity.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.sdk.AppLovinWebViewActivity$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(jVar);
                    }
                });
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
            android.net.Uri uri = android.net.Uri.parse(str);
            java.lang.String scheme = uri.getScheme();
            java.lang.String host = uri.getHost();
            java.lang.String path = uri.getPath();
            this.f1612a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1612a.I().a("AppLovinWebViewActivity", "Handling url load: " + str);
            }
            if (!"applovin".equalsIgnoreCase(scheme) || !com.google.ads.mediation.applovin.AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(host) || com.applovin.sdk.AppLovinWebViewActivity.this.d == null) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            if (!path.endsWith(com.applovin.sdk.AppLovinWebViewActivity.URI_PATH_WEBVIEW_EVENT)) {
                return true;
            }
            java.util.Set<java.lang.String> queryParameterNames = uri.getQueryParameterNames();
            java.lang.String str2 = queryParameterNames.isEmpty() ? "" : (java.lang.String) queryParameterNames.toArray()[0];
            if (!com.applovin.impl.sdk.utils.StringUtils.isValidString(str2)) {
                this.f1612a.I();
                if (!com.applovin.impl.sdk.n.a()) {
                    return true;
                }
                this.f1612a.I().b("AppLovinWebViewActivity", "Failed to parse WebView event parameter");
                return true;
            }
            java.lang.String queryParameter = uri.getQueryParameter(str2);
            this.f1612a.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.f1612a.I().a("AppLovinWebViewActivity", "Parsed WebView event parameter name: " + str2 + " and value: " + queryParameter);
            }
            com.applovin.sdk.AppLovinWebViewActivity.this.d.onReceivedEvent(queryParameter);
            return true;
        }
    }

    public void loadUrl(java.lang.String str, com.applovin.sdk.AppLovinWebViewActivity.EventListener eventListener) {
        this.d = eventListener;
        this.b = str;
        this.f1611a.set(false);
        android.webkit.WebView webView = this.c;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.applovin.sdk.AppLovinWebViewActivity.EventListener eventListener = this.d;
        if (eventListener != null) {
            eventListener.onReceivedEvent(EVENT_DISMISSED_VIA_BACK_BUTTON);
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra(INTENT_EXTRA_KEY_SDK_KEY);
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            com.applovin.impl.sdk.n.h("AppLovinWebViewActivity", "No SDK key specified");
            finish();
            return;
        }
        a(com.applovin.sdk.AppLovinSdk.getInstance(stringExtra, new com.applovin.sdk.AppLovinSdkSettings(getApplicationContext()), getApplicationContext()).a());
        if (getIntent().getBooleanExtra(INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, false)) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra(INTENT_EXTRA_KEY_LOAD_URL);
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(stringExtra2)) {
            this.b = stringExtra2;
        }
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(this.b)) {
            this.c.loadUrl(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.j jVar) {
        android.webkit.WebView webViewB = com.applovin.impl.yp.b(this, "WebView Activity");
        this.c = webViewB;
        if (webViewB == null) {
            finish();
            return;
        }
        setContentView(webViewB);
        android.webkit.WebSettings settings = this.c.getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        this.c.setVerticalScrollBarEnabled(true);
        this.c.setHorizontalScrollBarEnabled(true);
        this.c.setScrollBarStyle(33554432);
        this.c.setWebViewClient(new com.applovin.sdk.AppLovinWebViewActivity.a(jVar));
    }
}
