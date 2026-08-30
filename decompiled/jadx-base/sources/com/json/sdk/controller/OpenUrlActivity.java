package com.json.sdk.controller;

/* JADX INFO: loaded from: classes5.dex */
public class OpenUrlActivity extends android.app.Activity {
    private static final java.lang.String j = "OpenUrlActivity";
    private static final int k = com.json.sdk.utils.SDKUtils.generateViewId();
    private static final int l = com.json.sdk.utils.SDKUtils.generateViewId();
    private com.json.sdk.controller.v b;
    private android.widget.ProgressBar c;
    boolean d;
    private android.widget.RelativeLayout e;
    private java.lang.String f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.webkit.WebView f3280a = null;
    private final android.os.Handler g = new android.os.Handler(android.os.Looper.getMainLooper());
    private boolean h = false;
    private final java.lang.Runnable i = new com.ironsource.sdk.controller.OpenUrlActivity.b();

    class a implements android.view.View.OnSystemUiVisibilityChangeListener {
        a() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            if ((i & androidx.core.view.InputDeviceCompat.SOURCE_TOUCHSCREEN) == 0) {
                com.json.sdk.controller.OpenUrlActivity.this.g.removeCallbacks(com.json.sdk.controller.OpenUrlActivity.this.i);
                com.json.sdk.controller.OpenUrlActivity.this.g.postDelayed(com.json.sdk.controller.OpenUrlActivity.this.i, 500L);
            }
        }
    }

    class b implements java.lang.Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.sdk.controller.OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(com.json.sdk.utils.SDKUtils.getActivityUIFlags(com.json.sdk.controller.OpenUrlActivity.this.h));
        }
    }

    private class c extends android.webkit.WebViewClient {
        private c() {
        }

        /* synthetic */ c(com.json.sdk.controller.OpenUrlActivity openUrlActivity, com.ironsource.sdk.controller.OpenUrlActivity.a aVar) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
            super.onPageFinished(webView, str);
            com.json.sdk.controller.OpenUrlActivity.this.c.setVisibility(4);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            com.json.sdk.controller.OpenUrlActivity.this.c.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
            super.onReceivedError(webView, i, str, str2);
            try {
                com.json.l8 featureFlagCatchUrlError = com.json.sdk.controller.FeaturesManager.getInstance().getFeatureFlagCatchUrlError();
                if (featureFlagCatchUrlError.c()) {
                    if (featureFlagCatchUrlError.e() && com.json.sdk.controller.OpenUrlActivity.this.b != null) {
                        com.json.sdk.controller.OpenUrlActivity.this.b.d(str, str2);
                    }
                    if (featureFlagCatchUrlError.d()) {
                        com.json.sdk.controller.OpenUrlActivity.this.finish();
                    }
                }
            } catch (java.lang.Throwable th) {
                com.json.l9.d().a(th);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
            com.json.sdk.utils.Logger.e(com.json.sdk.controller.OpenUrlActivity.j, "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            com.json.sdk.controller.OpenUrlActivity.this.finish();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
            if (!new com.json.ds(str, com.json.dk.e().d(), com.json.sdk.controller.FeaturesManager.getInstance().getFeatureFlagClickCheck().c()).a()) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            try {
                com.json.cv.a(com.json.sdk.controller.OpenUrlActivity.this, str);
                com.json.sdk.controller.OpenUrlActivity.this.b.z();
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(e instanceof android.content.ActivityNotFoundException ? com.ironsource.y8.c.x : com.ironsource.y8.c.y);
                if (com.json.sdk.controller.OpenUrlActivity.this.b != null) {
                    com.json.sdk.controller.OpenUrlActivity.this.b.d(sb.toString(), str);
                }
            }
            com.json.sdk.controller.OpenUrlActivity.this.finish();
            return true;
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final java.lang.String f3284a = "is_store";
        static final java.lang.String b = "external_url";
        static final java.lang.String c = "secondary_web_view";
        static final java.lang.String d = "immersive";
        static final java.lang.String e = "no activity to handle url";
        static final java.lang.String f = "activity failed to open with unspecified reason";

        private d() {
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.json.h f3285a;
        private int b;
        private java.lang.String c;
        private boolean d = false;
        private boolean e = false;
        private boolean f = false;

        public e(com.json.h hVar) {
            this.f3285a = hVar;
        }

        public android.content.Intent a(android.content.Context context) {
            android.content.Intent intentA = this.f3285a.a(context);
            intentA.putExtra("external_url", this.c);
            intentA.putExtra("secondary_web_view", this.d);
            intentA.putExtra("is_store", this.e);
            intentA.putExtra(com.ironsource.y8.h.v, this.f);
            if (!(context instanceof android.app.Activity)) {
                intentA.setFlags(this.b);
            }
            return intentA;
        }

        com.ironsource.sdk.controller.OpenUrlActivity.e a(int i) {
            this.b = i;
            return this;
        }

        public com.ironsource.sdk.controller.OpenUrlActivity.e a(java.lang.String str) {
            this.c = str;
            return this;
        }

        com.ironsource.sdk.controller.OpenUrlActivity.e a(boolean z) {
            this.f = z;
            return this;
        }

        public com.ironsource.sdk.controller.OpenUrlActivity.e b(boolean z) {
            this.d = z;
            return this;
        }

        public com.ironsource.sdk.controller.OpenUrlActivity.e c(boolean z) {
            this.e = z;
            return this;
        }
    }

    private void a() {
        if (this.c == null) {
            android.widget.ProgressBar progressBar = new android.widget.ProgressBar(new android.view.ContextThemeWrapper(this, android.R.style.Theme.Holo.Light.Dialog));
            this.c = progressBar;
            progressBar.setId(l);
        }
        if (findViewById(l) == null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.c.setLayoutParams(layoutParams);
            this.c.setVisibility(4);
            this.e.addView(this.c);
        }
    }

    private void b() {
        if (this.f3280a == null) {
            android.webkit.WebView webView = new android.webkit.WebView(getApplicationContext());
            this.f3280a = webView;
            webView.setId(k);
            this.f3280a.getSettings().setJavaScriptEnabled(true);
            this.f3280a.setWebViewClient(new com.ironsource.sdk.controller.OpenUrlActivity.c(this, null));
            loadUrl(this.f);
        }
        if (findViewById(k) == null) {
            this.e.addView(this.f3280a, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        }
        a();
        com.json.sdk.controller.v vVar = this.b;
        if (vVar != null) {
            vVar.a(true, com.ironsource.y8.h.Y);
        }
    }

    private void c() {
        android.webkit.WebView webView = this.f3280a;
        if (webView != null) {
            webView.destroy();
        }
    }

    private void d() {
        getWindow().addFlags(16);
    }

    private void e() {
        requestWindowFeature(1);
    }

    private void f() {
        getWindow().setFlags(1024, 1024);
    }

    private void g() {
        android.view.ViewGroup viewGroup;
        com.json.sdk.controller.v vVar = this.b;
        if (vVar != null) {
            vVar.a(false, com.ironsource.y8.h.Y);
            if (this.e == null || (viewGroup = (android.view.ViewGroup) this.f3280a.getParent()) == null) {
                return;
            }
            if (viewGroup.findViewById(k) != null) {
                viewGroup.removeView(this.f3280a);
            }
            if (viewGroup.findViewById(l) != null) {
                viewGroup.removeView(this.c);
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        com.json.sdk.controller.v vVar;
        if (this.d && (vVar = this.b) != null) {
            vVar.c(com.ironsource.y8.h.j);
        }
        super.finish();
    }

    public void loadUrl(java.lang.String str) {
        this.f3280a.stopLoading();
        this.f3280a.clearHistory();
        try {
            this.f3280a.loadUrl(str);
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            com.json.sdk.utils.Logger.e(j, "OpenUrlActivity:: loadUrl: " + th.toString());
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f3280a.canGoBack()) {
            this.f3280a.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.json.sdk.utils.Logger.i(j, "onCreate()");
        try {
            this.b = (com.json.sdk.controller.v) com.json.qj.b((android.content.Context) this).a().j();
            e();
            f();
            android.os.Bundle extras = getIntent().getExtras();
            this.f = extras.getString("external_url");
            this.d = extras.getBoolean("secondary_web_view");
            boolean booleanExtra = getIntent().getBooleanExtra(com.ironsource.y8.h.v, false);
            this.h = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new com.ironsource.sdk.controller.OpenUrlActivity.a());
                runOnUiThread(this.i);
            }
            android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this);
            this.e = relativeLayout;
            setContentView(relativeLayout, new android.view.ViewGroup.LayoutParams(-1, -1));
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        if (this.h && (i == 25 || i == 24)) {
            this.g.postDelayed(this.i, 500L);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        g();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.h && z) {
            runOnUiThread(this.i);
        }
    }
}
