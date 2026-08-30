package com.json.sdk.controller;

/* JADX INFO: loaded from: classes5.dex */
public class v implements com.json.sdk.controller.l, com.json.lo, android.webkit.DownloadListener {
    private static final java.lang.String b0 = "about:blank";
    public static int c0 = 0;
    public static java.lang.String d0 = "is_store";
    public static java.lang.String e0 = "external_url";
    public static java.lang.String f0 = "secondary_web_view";
    private static java.lang.String g0 = "success";
    private static java.lang.String h0 = "fail";
    private java.lang.String A;
    private com.json.sdk.controller.d B;
    private com.json.jv C;
    private com.json.x2 D;
    private com.json.ta G;
    private com.json.sdk.controller.o H;
    private com.json.sdk.controller.q I;
    private com.json.sdk.controller.u J;
    private com.json.sdk.controller.i K;
    private com.json.sdk.controller.a L;
    private com.json.sdk.controller.j M;
    private com.json.p3 N;
    private com.json.v9 O;
    private com.json.fw P;
    private com.json.sdk.controller.c Q;
    private com.json.s8 R;
    private org.json.JSONObject S;
    private com.ironsource.sdk.controller.l.a T;
    private com.ironsource.sdk.controller.l.b U;
    private com.json.i9 V;
    private boolean W;
    com.json.b9 Y;
    final com.json.fk Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.json.cg f3355a;
    private com.json.oo a0;
    private com.json.e9 b;
    private java.lang.String f;
    private java.lang.String g;
    private final com.json.db h;
    private boolean i;
    private com.ironsource.sdk.controller.v.p j;
    private boolean k;
    private android.os.CountDownTimer l;
    public android.os.CountDownTimer m;
    private final com.ironsource.sdk.controller.v.o q;
    private android.view.View r;
    private android.widget.FrameLayout s;
    private android.webkit.WebChromeClient.CustomViewCallback t;
    private android.widget.FrameLayout u;
    private com.ironsource.sdk.controller.v.u v;
    private java.lang.String w;
    private com.json.s9 x;
    private com.json.r9 y;
    private com.json.q9 z;
    private java.lang.String c = "v";
    private java.lang.String d = "IronSource";
    private final java.lang.String e = "We're sorry, some error occurred. we will investigate it";
    private int n = 50;
    private int o = 50;
    private java.lang.String p = com.ironsource.y8.e.b;
    private java.lang.Object E = new java.lang.Object();
    private boolean F = false;
    private final com.json.Cif X = com.json.im.S().f();

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.sdk.controller.v.this.a(1);
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.json.ah f3357a;

        b(com.json.ah ahVar) {
            this.f3357a = ahVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.sdk.controller.v.this.Q.b("controller html - failed to download - " + this.f3357a.b());
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f3358a;

        c(android.content.Context context) {
            this.f3358a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.sdk.controller.v.this.e(this.f3358a);
        }
    }

    class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f3359a;

        d(android.content.Context context) {
            this.f3359a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.sdk.controller.v.this.f(this.f3359a);
        }
    }

    class e implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.zg.e f3360a;
        final /* synthetic */ java.lang.String b;

        e(com.ironsource.zg.e eVar, java.lang.String str) {
            this.f3360a = eVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.p9 p9VarA;
            com.ironsource.zg.e eVar = this.f3360a;
            if ((eVar == com.ironsource.zg.e.RewardedVideo || eVar == com.ironsource.zg.e.Interstitial) && (p9VarA = com.json.sdk.controller.v.this.a(eVar)) != null) {
                p9VarA.a(this.f3360a, this.b);
            }
        }
    }

    class f extends com.json.s8 {
        f(org.json.JSONObject jSONObject, android.content.Context context) {
            super(jSONObject, context);
        }

        @Override // com.json.s8, com.json.ef
        public void a() {
            if (com.json.sdk.controller.v.this.i) {
                com.json.sdk.controller.v.this.m("none");
            }
        }

        @Override // com.json.s8, com.json.ef
        public void a(java.lang.String str, org.json.JSONObject jSONObject) {
            if (com.json.sdk.controller.v.this.i) {
                com.json.sdk.controller.v.this.m(str);
            }
        }

        @Override // com.json.s8, com.json.ef
        public void b(java.lang.String str, org.json.JSONObject jSONObject) {
            if (jSONObject == null || !com.json.sdk.controller.v.this.i) {
                return;
            }
            try {
                jSONObject.put(com.ironsource.y8.i.t, str);
                com.json.sdk.controller.v.this.e(jSONObject);
            } catch (org.json.JSONException e) {
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    class g implements com.json.fw {
        g() {
        }

        @Override // com.json.fw
        public void a(java.lang.String str, org.json.JSONObject jSONObject) {
            com.json.sdk.controller.v.this.i(com.json.sdk.controller.v.this.e(str, jSONObject.toString()));
        }
    }

    class h implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.json.JSONObject f3362a;
        final /* synthetic */ android.webkit.WebView b;
        final /* synthetic */ java.lang.String c;

        h(org.json.JSONObject jSONObject, android.webkit.WebView webView, java.lang.String str) {
            this.f3362a = jSONObject;
            this.b = webView;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.sdk.controller.v.this.a(this.f3362a, this.b);
            com.json.sdk.controller.v.this.l("about:blank");
            com.json.sdk.controller.v.this.l(this.c);
        }
    }

    class i extends android.os.CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f3363a;

        class a implements java.lang.Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.json.sdk.controller.v.this.Q.b(com.ironsource.y8.c.j);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(long j, long j2, int i) {
            super(j, j2);
            this.f3363a = i;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "Loading Controller Timer Finish");
            int i = this.f3363a;
            if (i == 3) {
                com.json.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.i.a());
            } else {
                com.json.sdk.controller.v.this.a(i + 1);
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "Loading Controller Timer Tick " + j);
        }
    }

    class j implements com.ironsource.sdk.controller.v.s {
        j() {
        }

        @Override // com.ironsource.sdk.controller.v.s
        public void a(java.lang.String str, com.ironsource.zg.e eVar, com.json.sa saVar) {
            com.json.sdk.controller.v.this.a(str, eVar, saVar);
        }
    }

    class k implements com.ironsource.sdk.controller.v.s {
        k() {
        }

        @Override // com.ironsource.sdk.controller.v.s
        public void a(java.lang.String str, com.ironsource.zg.e eVar, com.json.sa saVar) {
            com.json.sdk.controller.v.this.a(str, eVar, saVar);
        }
    }

    class l implements com.ironsource.sdk.controller.v.s {
        l() {
        }

        @Override // com.ironsource.sdk.controller.v.s
        public void a(java.lang.String str, com.ironsource.zg.e eVar, com.json.sa saVar) {
            com.json.sdk.controller.v.this.a(str, eVar, saVar);
        }
    }

    class m implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.zg.e f3368a;
        final /* synthetic */ com.json.sa b;
        final /* synthetic */ java.lang.String c;

        m(com.ironsource.zg.e eVar, com.json.sa saVar, java.lang.String str) {
            this.f3368a = eVar;
            this.b = saVar;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.sa saVar;
            com.ironsource.zg.e eVar = com.ironsource.zg.e.RewardedVideo;
            com.ironsource.zg.e eVar2 = this.f3368a;
            if ((eVar != eVar2 && com.ironsource.zg.e.Interstitial != eVar2 && com.ironsource.zg.e.Banner != eVar2) || (saVar = this.b) == null || android.text.TextUtils.isEmpty(saVar.h())) {
                return;
            }
            com.json.p9 p9VarA = com.json.sdk.controller.v.this.a(this.f3368a);
            android.util.Log.d(com.json.sdk.controller.v.this.c, "onAdProductInitFailed (message:" + this.c + ")(" + this.f3368a + ")");
            if (p9VarA != null) {
                p9VarA.a(this.f3368a, this.b.h(), this.c);
            }
        }
    }

    class n implements java.lang.Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.sdk.controller.v.this.a(1);
        }
    }

    private class o extends android.webkit.WebChromeClient {
        private o() {
        }

        /* synthetic */ o(com.json.sdk.controller.v vVar, com.ironsource.sdk.controller.v.f fVar) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        public android.view.View getVideoLoadingProgressView() {
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(com.json.sdk.controller.v.this.Z.getContext());
            frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
            com.json.sdk.utils.Logger.i("MyApplication", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(android.webkit.WebView webView, boolean z, boolean z2, android.os.Message message) {
            android.webkit.WebView webView2 = new android.webkit.WebView(webView.getContext());
            webView2.setWebChromeClient(this);
            webView2.setWebViewClient(new com.ironsource.sdk.controller.v.q(com.json.sdk.controller.v.this, null));
            ((android.webkit.WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            com.json.sdk.utils.Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            com.json.sdk.utils.Logger.i("Test", "onHideCustomView");
            if (com.json.sdk.controller.v.this.r == null) {
                return;
            }
            com.json.sdk.controller.v.this.r.setVisibility(8);
            com.json.sdk.controller.v.this.s.removeView(com.json.sdk.controller.v.this.r);
            com.json.sdk.controller.v.this.r = null;
            com.json.sdk.controller.v.this.s.setVisibility(8);
            com.json.sdk.controller.v.this.t.onCustomViewHidden();
            com.json.sdk.controller.v.this.Z.setVisibility(0);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
            com.json.sdk.utils.Logger.i("Test", "onShowCustomView");
            com.json.sdk.controller.v.this.Z.setVisibility(8);
            if (com.json.sdk.controller.v.this.r != null) {
                com.json.sdk.utils.Logger.i("Test", "mCustomView != null");
                customViewCallback.onCustomViewHidden();
                return;
            }
            com.json.sdk.utils.Logger.i("Test", "mCustomView == null");
            com.json.sdk.controller.v.this.s.addView(view);
            com.json.sdk.controller.v.this.r = view;
            com.json.sdk.controller.v.this.t = customViewCallback;
            com.json.sdk.controller.v.this.s.setVisibility(0);
        }
    }

    static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.ironsource.zg.e f3371a;
        java.lang.String b;

        public p(com.ironsource.zg.e eVar, java.lang.String str) {
            this.f3371a = eVar;
            this.b = str;
        }

        java.lang.String a() {
            return this.b;
        }

        com.ironsource.zg.e b() {
            return this.f3371a;
        }
    }

    private class q extends android.webkit.WebViewClient {
        private q() {
        }

        /* synthetic */ q(com.json.sdk.controller.v vVar, com.ironsource.sdk.controller.v.f fVar) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
            com.json.sdk.utils.Logger.e(com.json.sdk.controller.v.this.c, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
            android.content.Context contextQ = com.json.sdk.controller.v.this.q();
            contextQ.startActivity(new com.ironsource.sdk.controller.OpenUrlActivity.e(new com.ironsource.sdk.controller.k.b()).a(str).b(false).a(contextQ));
            return true;
        }
    }

    public class r {

        class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f3374a;
            final /* synthetic */ java.lang.String b;

            a(java.lang.String str, java.lang.String str2) {
                this.f3374a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                java.lang.String str = this.f3374a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                android.util.Log.d(com.json.sdk.controller.v.this.c, "onRVShowFail(message:" + this.f3374a + ")");
                com.json.sdk.controller.v.this.x.d(this.b, str);
            }
        }

        class b implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f3375a;

            b(java.lang.String str) {
                this.f3375a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                android.util.Log.d(com.json.sdk.controller.v.this.c, "onInterstitialInitSuccess()");
                com.json.sdk.controller.v.this.y.a(com.ironsource.zg.e.Interstitial, this.f3375a, (com.json.w2) null);
            }
        }

        class c implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f3376a;
            final /* synthetic */ java.lang.String b;

            c(java.lang.String str, java.lang.String str2) {
                this.f3376a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                java.lang.String str = this.f3376a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                android.util.Log.d(com.json.sdk.controller.v.this.c, "onInterstitialInitFail(message:" + str + ")");
                com.json.sdk.controller.v.this.y.a(com.ironsource.zg.e.Interstitial, this.b, str);
            }
        }

        class d implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.json.p9 f3377a;
            final /* synthetic */ com.ironsource.zg.e b;
            final /* synthetic */ java.lang.String c;

            d(com.json.p9 p9Var, com.ironsource.zg.e eVar, java.lang.String str) {
                this.f3377a = p9Var;
                this.b = eVar;
                this.c = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f3377a.c(this.b, this.c);
            }
        }

        class e implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f3378a;
            final /* synthetic */ org.json.JSONObject b;

            e(java.lang.String str, org.json.JSONObject jSONObject) {
                this.f3378a = str;
                this.b = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.json.sdk.controller.v.this.y.a(this.f3378a, this.b);
            }
        }

        class f implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f3379a;
            final /* synthetic */ java.lang.String b;

            f(java.lang.String str, java.lang.String str2) {
                this.f3379a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                java.lang.String str = this.f3379a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                com.json.sdk.controller.v.this.y.c(this.b, str);
            }
        }

        class g implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f3380a;

            g(java.lang.String str) {
                this.f3380a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                android.util.Log.d(com.json.sdk.controller.v.this.c, "onBannerInitSuccess()");
                com.json.sdk.controller.v.this.z.a(com.ironsource.zg.e.Banner, this.f3380a, (com.json.w2) null);
            }
        }

        class h implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f3381a;
            final /* synthetic */ java.lang.String b;

            h(java.lang.String str, java.lang.String str2) {
                this.f3381a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                java.lang.String str = this.f3381a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                android.util.Log.d(com.json.sdk.controller.v.this.c, "onBannerInitFail(message:" + str + ")");
                com.json.sdk.controller.v.this.z.a(com.ironsource.zg.e.Banner, this.b, str);
            }
        }

        class i implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f3382a;
            final /* synthetic */ com.json.qg b;

            i(java.lang.String str, com.json.qg qgVar) {
                this.f3382a = str;
                this.b = qgVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                android.util.Log.d(com.json.sdk.controller.v.this.c, "onBannerLoadSuccess()");
                com.json.sdk.controller.v.this.z.a(this.f3382a, this.b);
            }
        }

        class j implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f3383a;
            final /* synthetic */ java.lang.String b;

            j(java.lang.String str, java.lang.String str2) {
                this.f3383a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                android.util.Log.d(com.json.sdk.controller.v.this.c, "onLoadBannerFail()");
                java.lang.String str = this.f3383a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                com.json.sdk.controller.v.this.z.a(this.b, str);
            }
        }

        class k implements java.lang.Runnable {
            k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.json.sdk.controller.v.this.F();
            }
        }

        class l implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f3385a;

            l(java.lang.String str) {
                this.f3385a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (new org.json.JSONObject(this.f3385a).has(com.ironsource.sdk.controller.f.b.MSG_ID)) {
                        com.json.sdk.controller.v.this.T.a(com.ironsource.sdk.controller.f.a.a(this.f3385a));
                    } else {
                        com.json.sdk.controller.v.this.U.a(com.json.km.a(this.f3385a));
                    }
                } catch (org.json.JSONException e) {
                    com.json.l9.d().a(e);
                    com.json.sdk.utils.Logger.e(com.json.sdk.controller.v.this.c, "failed to parse received message");
                    com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
                }
            }
        }

        class m implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ironsource.zg.e f3386a;
            final /* synthetic */ java.lang.String b;
            final /* synthetic */ java.lang.String c;
            final /* synthetic */ org.json.JSONObject d;

            m(com.ironsource.zg.e eVar, java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject) {
                this.f3386a = eVar;
                this.b = str;
                this.c = str2;
                this.d = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.json.p9 p9VarA;
                com.ironsource.zg.e eVar = this.f3386a;
                if ((eVar == com.ironsource.zg.e.Interstitial || eVar == com.ironsource.zg.e.RewardedVideo || eVar == com.ironsource.zg.e.Banner) && (p9VarA = com.json.sdk.controller.v.this.a(eVar)) != null) {
                    p9VarA.a(this.f3386a, this.b, this.c, this.d);
                }
            }
        }

        class n implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f3387a;

            n(java.lang.String str) {
                this.f3387a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "omidAPI(" + this.f3387a + ")");
                    com.json.sdk.controller.v.this.H.a(new com.json.br(this.f3387a).toString(), com.ironsource.sdk.controller.v.r.this.new w());
                } catch (java.lang.Exception e) {
                    com.json.l9.d().a(e);
                    com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
                    com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "omidAPI failed with exception " + e.getMessage());
                }
            }
        }

        class o implements java.lang.Runnable {
            o() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.json.sdk.controller.v.this.B();
            }
        }

        class p implements java.lang.Runnable {
            p() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.json.sdk.controller.v.this.Z.removeJavascriptInterface(com.json.y8.e);
            }
        }

        class q implements java.lang.Runnable {
            q() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.json.sdk.controller.v.this.Z.getSettings().setMixedContentMode(0);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$r$r, reason: collision with other inner class name */
        class RunnableC0249r implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f3391a;
            final /* synthetic */ java.lang.String b;
            final /* synthetic */ com.json.w2 c;

            RunnableC0249r(int i, java.lang.String str, com.json.w2 w2Var) {
                this.f3391a = i;
                this.b = str;
                this.c = w2Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f3391a <= 0) {
                    com.json.sdk.controller.v.this.x.c(this.b);
                } else {
                    android.util.Log.d(com.json.sdk.controller.v.this.c, "onRVInitSuccess()");
                    com.json.sdk.controller.v.this.x.a(com.ironsource.zg.e.RewardedVideo, this.b, this.c);
                }
            }
        }

        class s implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f3392a;

            s(java.lang.String str) {
                this.f3392a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.json.sdk.controller.v.this.M.a(new org.json.JSONObject(this.f3392a), com.ironsource.sdk.controller.v.r.this.new w());
                } catch (java.lang.Exception e) {
                    com.json.l9.d().a(e);
                    com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
                    com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "fileSystemAPI failed with exception " + e.getMessage());
                }
            }
        }

        class t implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f3393a;
            final /* synthetic */ java.lang.String b;
            final /* synthetic */ int c;

            t(java.lang.String str, java.lang.String str2, int i) {
                this.f3393a = str;
                this.b = str2;
                this.c = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f3393a.equalsIgnoreCase(com.ironsource.zg.e.RewardedVideo.toString())) {
                    com.json.sdk.controller.v.this.x.a(this.b, this.c);
                }
            }
        }

        class u implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f3394a;
            final /* synthetic */ int b;

            u(java.lang.String str, int i) {
                this.f3394a = str;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.json.sdk.controller.v.this.y.onInterstitialAdRewarded(this.f3394a, this.b);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$r$v, reason: collision with other inner class name */
        class RunnableC0250v implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.lang.String f3395a;
            final /* synthetic */ java.lang.String b;

            RunnableC0250v(java.lang.String str, java.lang.String str2) {
                this.f3395a = str;
                this.b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                java.lang.String str = this.f3395a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                android.util.Log.d(com.json.sdk.controller.v.this.c, "onRVInitFail(message:" + str + ")");
                com.json.sdk.controller.v.this.x.a(com.ironsource.zg.e.RewardedVideo, this.b, str);
            }
        }

        public class w implements com.json.mk {
            public w() {
            }

            @Override // com.json.mk
            public void a(boolean z, java.lang.String str, com.json.br brVar) {
                brVar.b(z ? com.json.sdk.controller.v.g0 : com.json.sdk.controller.v.h0, str);
                com.json.sdk.controller.v.this.a(brVar.toString(), z, (java.lang.String) null, (java.lang.String) null);
            }

            @Override // com.json.mk
            public void a(boolean z, java.lang.String str, java.lang.String str2) {
                com.json.br brVar = new com.json.br();
                brVar.b(z ? com.json.sdk.controller.v.g0 : com.json.sdk.controller.v.h0, str);
                brVar.b("data", str2);
                com.json.sdk.controller.v.this.a(brVar.toString(), z, (java.lang.String) null, (java.lang.String) null);
            }

            @Override // com.json.mk
            public void a(boolean z, java.lang.String str, org.json.JSONObject jSONObject) {
                try {
                    jSONObject.put(z ? com.json.sdk.controller.v.g0 : com.json.sdk.controller.v.h0, str);
                    com.json.sdk.controller.v.this.a(jSONObject.toString(), z, (java.lang.String) null, (java.lang.String) null);
                } catch (org.json.JSONException e) {
                    com.json.l9.d().a(e);
                    com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
                }
            }
        }

        public r() {
        }

        private void a(java.lang.String str, int i2) {
            com.json.sa saVarA;
            com.json.sdk.controller.v vVar = com.json.sdk.controller.v.this;
            com.ironsource.zg.e eVar = com.ironsource.zg.e.Interstitial;
            if (vVar.q(eVar.toString()) && (saVarA = com.json.sdk.controller.v.this.G.a(eVar, str)) != null && saVarA.k()) {
                com.json.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.r.u(str, i2));
            }
        }

        private void a(java.lang.String str, java.lang.String str2) {
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            com.json.sdk.controller.v.this.i(com.json.sdk.controller.v.this.e(str, str2));
        }

        private void a(java.lang.String str, boolean z) {
            com.json.sa saVarA = com.json.sdk.controller.v.this.G.a(com.ironsource.zg.e.Interstitial, str);
            if (saVarA != null) {
                saVarA.a(z);
            }
        }

        private void a(org.json.JSONObject jSONObject) {
            try {
                jSONObject.put("controllerSourceData", com.json.sdk.controller.v.this.B.f());
            } catch (java.lang.Exception e2) {
                com.json.l9.d().a(e2);
                com.json.sdk.utils.Logger.d(com.json.sdk.controller.v.this.c, "Unable to add controller source data into controllerConfig");
            }
        }

        private void a(org.json.JSONObject jSONObject, java.lang.String str) {
            if (a(str)) {
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
                    jSONObject.putOpt("testerABGroup", jSONObject2.get("testerABGroup"));
                    jSONObject.putOpt("testFriendlyName", jSONObject2.get("testFriendlyName"));
                } catch (org.json.JSONException e2) {
                    com.json.l9.d().a(e2);
                    com.json.sdk.utils.Logger.d(com.json.sdk.controller.v.this.c, "getControllerConfig Error while parsing Tester AB Group parameters");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z, java.lang.String str) {
            if (z) {
                com.json.sdk.controller.v.this.y.b(com.ironsource.zg.e.Interstitial, str);
                com.json.sdk.controller.v.this.y.b(str);
            }
            a(str, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z, java.lang.String str, java.lang.String str2) {
            if (z) {
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                com.json.sdk.controller.v.this.y.b(str2, str);
            }
            a(str2, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(java.lang.String str) {
            try {
                com.ironsource.p3.a aVarA = com.json.sdk.controller.v.this.N.a(com.json.sdk.controller.v.this.Z.getContext(), com.json.r3.a(str));
                com.json.sdk.controller.v.this.i(com.json.sdk.controller.v.this.e(aVarA.f(), aVarA.i().toString()));
            } catch (java.lang.Exception e2) {
                com.json.l9.d().a(e2);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
        }

        private void b(org.json.JSONObject jSONObject) {
            try {
                com.json.sdk.controller.FeaturesManager featuresManager = com.json.sdk.controller.FeaturesManager.getInstance();
                if (featuresManager.a().isEmpty()) {
                    return;
                }
                jSONObject.put(com.ironsource.y8.a.h, new org.json.JSONArray((java.util.Collection) featuresManager.a()));
            } catch (java.lang.Exception e2) {
                com.json.l9.d().a(e2);
                com.json.gh.a(com.json.ar.p, new com.json.bh().a(com.json.zb.A, e2.getMessage()).a());
                com.json.sdk.utils.Logger.d(com.json.sdk.controller.v.this.c, "getControllerConfig Error while adding supported features data from FeaturesManager");
            }
        }

        private void c(org.json.JSONObject jSONObject) {
            b(jSONObject);
            a(jSONObject, com.json.sdk.utils.SDKUtils.getTesterParameters());
            if (com.json.sdk.controller.v.this.W) {
                return;
            }
            a(jSONObject);
        }

        boolean a(java.lang.String str) {
            if (android.text.TextUtils.isEmpty(str) || str.contains("-1")) {
                return false;
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                return (jSONObject.getString("testerABGroup").isEmpty() || jSONObject.getString("testFriendlyName").isEmpty()) ? false : true;
            } catch (org.json.JSONException e2) {
                com.json.l9.d().a(e2);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
                return false;
            }
        }

        @android.webkit.JavascriptInterface
        public void adClicked(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "adClicked(" + str + ")");
            com.json.br brVar = new com.json.br(str);
            java.lang.String strD = brVar.d(com.ironsource.y8.h.m);
            java.lang.String strFetchDemandSourceId = com.json.sdk.utils.SDKUtils.fetchDemandSourceId(brVar);
            if (android.text.TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            com.ironsource.zg.e eVarG = com.json.sdk.controller.v.this.g(strD);
            com.json.p9 p9VarA = com.json.sdk.controller.v.this.a(eVarG);
            if (eVarG == null || p9VarA == null) {
                return;
            }
            com.json.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.r.d(p9VarA, eVarG, strFetchDemandSourceId));
        }

        @android.webkit.JavascriptInterface
        public void adCredited(java.lang.String str) {
            android.util.Log.d(com.json.sdk.controller.v.this.d, "adCredited(" + str + ")");
            com.json.br brVar = new com.json.br(str);
            java.lang.String strD = brVar.d(com.ironsource.y8.h.k);
            int i2 = strD != null ? java.lang.Integer.parseInt(strD) : 0;
            java.lang.String strFetchDemandSourceId = com.json.sdk.utils.SDKUtils.fetchDemandSourceId(brVar);
            java.lang.String strD2 = brVar.d(com.ironsource.y8.h.m);
            if (android.text.TextUtils.isEmpty(strD2)) {
                android.util.Log.d(com.json.sdk.controller.v.this.d, "adCredited | product type is missing");
            }
            if (com.ironsource.zg.e.Interstitial.toString().equalsIgnoreCase(strD2)) {
                a(strFetchDemandSourceId, i2);
            } else if (com.json.sdk.controller.v.this.q(strD2)) {
                com.json.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.r.t(strD2, strFetchDemandSourceId, i2));
            }
        }

        @android.webkit.JavascriptInterface
        public void adUnitsReady(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "adUnitsReady(" + str + ")");
            java.lang.String strFetchDemandSourceId = com.json.sdk.utils.SDKUtils.fetchDemandSourceId(new com.json.br(str));
            com.json.w2 w2Var = new com.json.w2(str);
            if (!w2Var.g()) {
                com.json.sdk.controller.v.this.a(str, false, com.ironsource.y8.c.r, (java.lang.String) null);
                return;
            }
            com.json.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
            java.lang.String strD = w2Var.d();
            if (com.ironsource.zg.e.RewardedVideo.toString().equalsIgnoreCase(strD) && com.json.sdk.controller.v.this.q(strD)) {
                com.json.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.r.RunnableC0249r(java.lang.Integer.parseInt(w2Var.c()), strFetchDemandSourceId, w2Var));
            }
        }

        @android.webkit.JavascriptInterface
        public void adViewAPI(java.lang.String str) {
            try {
                com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "adViewAPI(" + str + ")");
                com.json.sdk.controller.v.this.L.a(new com.json.br(str).toString(), new com.ironsource.sdk.controller.v.r.w());
            } catch (java.lang.Exception e2) {
                com.json.l9.d().a(e2);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
                com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "adViewAPI failed with exception " + e2.getMessage());
            }
        }

        @android.webkit.JavascriptInterface
        public void androidSandboxApi(final java.lang.String str) {
            com.json.cg.f2559a.b(new java.lang.Runnable() { // from class: com.ironsource.sdk.controller.v$r$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(str);
                }
            });
        }

        @android.webkit.JavascriptInterface
        public void bannerViewAPI(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "bannerViewAPI is not supported in this native version, only adview API");
        }

        void c(java.lang.String str) {
            com.json.sdk.controller.v.this.i(com.json.sdk.controller.v.this.a(com.ironsource.y8.g.d, str, (java.lang.String) null, (java.lang.String) null));
        }

        @android.webkit.JavascriptInterface
        public void cleanAdInstance(java.lang.String str) {
            com.ironsource.zg.e eVarG;
            try {
                com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "cleanAdInstance(" + str + ")");
                com.json.br brVar = new com.json.br(str);
                java.lang.String strD = brVar.d(com.ironsource.y8.h.m);
                java.lang.String strFetchDemandSourceId = com.json.sdk.utils.SDKUtils.fetchDemandSourceId(brVar);
                if (android.text.TextUtils.isEmpty(strFetchDemandSourceId) || (eVarG = com.json.sdk.controller.v.this.g(strD)) == null) {
                    return;
                }
                com.json.sdk.controller.v.this.G.b(eVarG, strFetchDemandSourceId);
            } catch (java.lang.Exception e2) {
                com.json.l9.d().a(e2);
                com.json.sdk.controller.v.this.a(str, false, e2.getMessage(), (java.lang.String) null);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
        }

        @android.webkit.JavascriptInterface
        public void clearLastUpdateTimeData(java.lang.String str) {
            try {
                java.util.ArrayList<java.lang.String> arrayListA = com.json.dk.e().a();
                com.json.br brVar = new com.json.br(str);
                if (!arrayListA.isEmpty()) {
                    brVar.b(com.ironsource.y8.h.x0, arrayListA.toString());
                }
                com.json.sdk.controller.v.this.a(brVar.toString(), true, (java.lang.String) null, (java.lang.String) null);
            } catch (java.lang.Exception e2) {
                com.json.l9.d().a(e2);
                com.json.sdk.controller.v.this.a(str, false, e2.getMessage(), (java.lang.String) null);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
        }

        @android.webkit.JavascriptInterface
        public void deleteFile(java.lang.String str) {
            try {
                com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "deleteFile(" + str + ")");
                com.json.br brVar = new com.json.br(str);
                java.lang.String strD = brVar.d(com.ironsource.y8.h.b);
                java.lang.String strD2 = brVar.d("path");
                if (strD2 != null && !android.text.TextUtils.isEmpty(strD)) {
                    com.json.ih ihVar = new com.json.ih(com.json.sdk.utils.IronSourceStorageUtils.buildAbsolutePathToDirInCache(com.json.sdk.controller.v.this.A, strD2), strD);
                    com.json.sdk.utils.IronSourceStorageUtils.ensurePathSafety(ihVar, com.json.sdk.controller.v.this.A);
                    if (!ihVar.exists()) {
                        com.json.sdk.controller.v.this.a(str, false, com.ironsource.y8.c.f, "1");
                        return;
                    } else {
                        com.json.sdk.controller.v.this.a(str, com.json.sdk.utils.IronSourceStorageUtils.deleteFile(ihVar), (java.lang.String) null, (java.lang.String) null);
                        return;
                    }
                }
                com.json.sdk.controller.v.this.a(str, false, com.ironsource.y8.c.g, "1");
            } catch (java.lang.Exception e2) {
                com.json.l9.d().a(e2);
                com.json.sdk.controller.v.this.a(str, false, e2.getMessage(), (java.lang.String) null);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
        }

        @android.webkit.JavascriptInterface
        public void deleteFolder(java.lang.String str) {
            try {
                com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "deleteFolder(" + str + ")");
                java.lang.String strD = new com.json.br(str).d("path");
                if (strD == null) {
                    com.json.sdk.controller.v.this.a(str, false, com.ironsource.y8.c.g, "1");
                    return;
                }
                com.json.ih ihVar = new com.json.ih(com.json.sdk.utils.IronSourceStorageUtils.buildAbsolutePathToDirInCache(com.json.sdk.controller.v.this.A, strD));
                com.json.sdk.utils.IronSourceStorageUtils.ensurePathSafety(ihVar, com.json.sdk.controller.v.this.A);
                if (!ihVar.exists()) {
                    com.json.sdk.controller.v.this.a(str, false, com.ironsource.y8.c.e, "1");
                } else {
                    com.json.sdk.controller.v.this.a(str, com.json.sdk.utils.IronSourceStorageUtils.deleteFolder(ihVar.getPath()), (java.lang.String) null, (java.lang.String) null);
                }
            } catch (java.lang.Exception e2) {
                com.json.l9.d().a(e2);
                com.json.sdk.controller.v.this.a(str, false, e2.getMessage(), (java.lang.String) null);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
        }

        @android.webkit.JavascriptInterface
        public void deviceDataAPI(java.lang.String str) {
            try {
                com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "deviceDataAPI(" + str + ")");
                com.json.sdk.controller.v.this.K.a(new com.json.br(str).toString(), new com.ironsource.sdk.controller.v.r.w());
            } catch (java.lang.Exception e2) {
                com.json.l9.d().a(e2);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
                com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "deviceDataAPI failed with exception " + e2.getMessage());
            }
        }

        @android.webkit.JavascriptInterface
        public void displayWebView(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "displayWebView(" + str + ")");
            com.json.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
            com.json.br brVar = new com.json.br(str);
            boolean zBooleanValue = ((java.lang.Boolean) brVar.b("display")).booleanValue();
            java.lang.String strD = brVar.d(com.ironsource.y8.h.m);
            boolean zC = brVar.c(com.ironsource.y8.h.u);
            java.lang.String strD2 = brVar.d("adViewId");
            java.lang.String strFetchDemandSourceId = com.json.sdk.utils.SDKUtils.fetchDemandSourceId(brVar);
            boolean zC2 = brVar.c(com.ironsource.y8.h.z0);
            if (!zBooleanValue) {
                com.json.sdk.controller.v.this.a(com.ironsource.sdk.controller.v.u.Gone);
                com.json.sdk.controller.v.this.o();
                return;
            }
            com.json.sdk.controller.v.this.F = brVar.c(com.ironsource.y8.h.v);
            boolean zC3 = brVar.c(com.ironsource.y8.h.y);
            com.ironsource.sdk.controller.v.u uVarV = com.json.sdk.controller.v.this.v();
            com.ironsource.sdk.controller.v.u uVar = com.ironsource.sdk.controller.v.u.Display;
            if (uVarV == uVar) {
                com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "State: " + com.json.sdk.controller.v.this.v);
                return;
            }
            com.json.sdk.controller.v.this.a(uVar);
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "State: " + com.json.sdk.controller.v.this.v);
            android.content.Context contextQ = com.json.sdk.controller.v.this.q();
            java.lang.String strT = com.json.sdk.controller.v.this.t();
            int iJ = com.json.sdk.controller.v.this.X.J(contextQ);
            if (zC) {
                com.json.sdk.controller.h hVar = new com.json.sdk.controller.h(contextQ);
                hVar.addView(com.json.sdk.controller.v.this.u);
                hVar.a(com.json.sdk.controller.v.this);
                return;
            }
            android.content.Intent intent = zC3 ? new android.content.Intent(contextQ, (java.lang.Class<?>) com.json.sdk.controller.InterstitialActivity.class) : new android.content.Intent(contextQ, (java.lang.Class<?>) com.json.sdk.controller.ControllerActivity.class);
            com.ironsource.zg.e eVar = com.ironsource.zg.e.RewardedVideo;
            if (eVar.toString().equalsIgnoreCase(strD)) {
                if ("application".equals(strT)) {
                    strT = com.json.sdk.utils.SDKUtils.translateRequestedOrientation(com.json.sdk.controller.v.this.X.L(contextQ));
                }
                intent.putExtra(com.ironsource.y8.h.m, eVar.toString());
                com.json.sdk.controller.v.this.D.a(eVar.ordinal());
                com.json.sdk.controller.v.this.D.f(strFetchDemandSourceId);
                if (com.json.sdk.controller.v.this.q(eVar.toString())) {
                    com.json.sdk.controller.v.this.x.b(eVar, strFetchDemandSourceId);
                }
            } else {
                com.ironsource.zg.e eVar2 = com.ironsource.zg.e.Interstitial;
                if (eVar2.toString().equalsIgnoreCase(strD)) {
                    if ("application".equals(strT)) {
                        strT = com.json.sdk.utils.SDKUtils.translateRequestedOrientation(com.json.sdk.controller.v.this.X.L(contextQ));
                    }
                    intent.putExtra(com.ironsource.y8.h.m, eVar2.toString());
                }
            }
            if (strD2 != null) {
                intent.putExtra("adViewId", strD2);
            }
            intent.putExtra(com.ironsource.y8.h.z0, zC2);
            intent.setFlags(536870912);
            intent.putExtra(com.ironsource.y8.h.v, com.json.sdk.controller.v.this.F);
            intent.putExtra(com.ironsource.y8.h.A, strT);
            intent.putExtra(com.ironsource.y8.h.B, iJ);
            com.json.sdk.controller.v vVar = com.json.sdk.controller.v.this;
            vVar.j = new com.ironsource.sdk.controller.v.p(vVar.g(strD), strFetchDemandSourceId);
            contextQ.startActivity(intent);
        }

        @android.webkit.JavascriptInterface
        public void dsSharedSignalsAPI(java.lang.String str) {
            try {
                com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "dsSharedSignalsAPI(" + str + ")");
                com.json.sdk.controller.v.this.O.a(new com.json.br(str).toString(), new com.ironsource.sdk.controller.v.r.w());
            } catch (java.lang.Exception e2) {
                com.json.l9.d().a(e2);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
                com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "dsSharedSignalsAPI failed with exception " + e2.getMessage());
            }
        }

        @android.webkit.JavascriptInterface
        public void fileSystemAPI(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "fileSystemAPI(" + str + ")");
            com.json.sdk.controller.v.this.a(new com.ironsource.sdk.controller.v.r.s(str));
        }

        /* JADX WARN: Code duplicated, block: B:10:0x005e  */
        @android.webkit.JavascriptInterface
        public void getApplicationInfo(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "getApplicationInfo(" + str + ")");
            java.lang.String strE = com.json.sdk.controller.v.this.e(str);
            java.lang.String strD = com.json.sdk.controller.v.this.d(str);
            com.json.br brVar = new com.json.br(str);
            java.lang.Object[] objArrF = com.json.sdk.controller.v.this.f(brVar.d(com.ironsource.y8.h.m), com.json.sdk.utils.SDKUtils.fetchDemandSourceId(brVar));
            java.lang.String str2 = (java.lang.String) objArrF[0];
            if (((java.lang.Boolean) objArrF[1]).booleanValue()) {
                if (android.text.TextUtils.isEmpty(strD)) {
                    strE = null;
                } else {
                    strE = strD;
                }
            } else if (android.text.TextUtils.isEmpty(strE)) {
                strE = null;
            }
            if (android.text.TextUtils.isEmpty(strE)) {
                return;
            }
            com.json.sdk.controller.v.this.i(com.json.sdk.controller.v.this.a(strE, str2, com.ironsource.y8.g.m, com.ironsource.y8.g.n));
        }

        @android.webkit.JavascriptInterface
        public void getCachedFilesMap(java.lang.String str) {
            com.json.sdk.controller.v vVar;
            java.lang.String str2;
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "getCachedFilesMap(" + str + ")");
            java.lang.String strE = com.json.sdk.controller.v.this.e(str);
            if (android.text.TextUtils.isEmpty(strE)) {
                return;
            }
            com.json.br brVar = new com.json.br(str);
            if (brVar.a("path")) {
                java.lang.String str3 = (java.lang.String) brVar.b("path");
                if (com.json.sdk.utils.IronSourceStorageUtils.isPathExist(com.json.sdk.controller.v.this.A, str3)) {
                    com.json.sdk.controller.v.this.i(com.json.sdk.controller.v.this.a(strE, com.json.sdk.utils.IronSourceStorageUtils.getCachedFilesMap(com.json.sdk.controller.v.this.A, str3), com.ironsource.y8.g.r, com.ironsource.y8.g.q));
                    return;
                }
                vVar = com.json.sdk.controller.v.this;
                str2 = com.ironsource.y8.c.t;
            } else {
                vVar = com.json.sdk.controller.v.this;
                str2 = com.ironsource.y8.c.s;
            }
            vVar.a(str, false, str2, (java.lang.String) null);
        }

        @android.webkit.JavascriptInterface
        public void getConnectivityInfo(java.lang.String str) {
            java.lang.String strE;
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "getConnectivityInfo(" + str + ")");
            com.json.br brVar = new com.json.br(str);
            java.lang.String strD = brVar.d(com.json.sdk.controller.v.g0);
            java.lang.String strD2 = brVar.d(com.json.sdk.controller.v.h0);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (com.json.sdk.controller.v.this.R != null) {
                jSONObject = com.json.sdk.controller.v.this.R.a(com.json.sdk.controller.v.this.Z.getContext());
            }
            if (jSONObject.length() > 0) {
                strE = com.json.sdk.controller.v.this.e(strD, jSONObject.toString());
            } else {
                strE = com.json.sdk.controller.v.this.e(strD2, com.json.sdk.controller.v.this.a("errMsg", com.ironsource.y8.c.A, null, null, null, null, null, null, null, false));
            }
            com.json.sdk.controller.v.this.i(strE);
        }

        @android.webkit.JavascriptInterface
        public void getControllerConfig(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "getControllerConfig(" + str + ")");
            java.lang.String strD = new com.json.br(str).d(com.json.sdk.controller.v.g0);
            if (android.text.TextUtils.isEmpty(strD)) {
                return;
            }
            org.json.JSONObject controllerConfigAsJSONObject = com.json.sdk.utils.SDKUtils.getControllerConfigAsJSONObject();
            c(controllerConfigAsJSONObject);
            com.json.sdk.controller.v.this.i(com.json.sdk.controller.v.this.e(strD, controllerConfigAsJSONObject.toString()));
        }

        @android.webkit.JavascriptInterface
        public void getDemandSourceState(java.lang.String str) {
            java.lang.String strD;
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "getMediationState(" + str + ")");
            com.json.br brVar = new com.json.br(str);
            java.lang.String strD2 = brVar.d("demandSourceName");
            java.lang.String strFetchDemandSourceId = com.json.sdk.utils.SDKUtils.fetchDemandSourceId(brVar);
            java.lang.String strD3 = brVar.d(com.ironsource.y8.h.m);
            if (strD3 == null || strD2 == null) {
                return;
            }
            try {
                com.ironsource.zg.e productType = com.json.sdk.utils.SDKUtils.getProductType(strD3);
                if (productType != null) {
                    com.json.sa saVarA = com.json.sdk.controller.v.this.G.a(productType, strFetchDemandSourceId);
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put(com.ironsource.y8.h.m, strD3);
                    jSONObject.put("demandSourceName", strD2);
                    jSONObject.put("demandSourceId", strFetchDemandSourceId);
                    if (saVarA == null || saVarA.a(-1)) {
                        strD = com.json.sdk.controller.v.this.d(str);
                    } else {
                        strD = com.json.sdk.controller.v.this.e(str);
                        jSONObject.put("state", saVarA.j());
                    }
                    a(strD, jSONObject.toString());
                }
            } catch (java.lang.Exception e2) {
                com.json.l9.d().a(e2);
                com.json.sdk.controller.v.this.a(str, false, e2.getMessage(), (java.lang.String) null);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0055  */
        @android.webkit.JavascriptInterface
        public void getDeviceStatus(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "getDeviceStatus(" + str + ")");
            java.lang.String strE = com.json.sdk.controller.v.this.e(str);
            java.lang.String strD = com.json.sdk.controller.v.this.d(str);
            com.json.sdk.controller.v vVar = com.json.sdk.controller.v.this;
            java.lang.Object[] objArrD = vVar.d(vVar.Z.getContext());
            java.lang.String str2 = (java.lang.String) objArrD[0];
            if (((java.lang.Boolean) objArrD[1]).booleanValue()) {
                if (android.text.TextUtils.isEmpty(strD)) {
                    strE = null;
                } else {
                    strE = strD;
                }
            } else if (android.text.TextUtils.isEmpty(strE)) {
                strE = null;
            }
            if (android.text.TextUtils.isEmpty(strE)) {
                return;
            }
            com.json.sdk.controller.v.this.i(com.json.sdk.controller.v.this.a(strE, str2, com.ironsource.y8.g.k, com.ironsource.y8.g.l));
        }

        @android.webkit.JavascriptInterface
        public void getDeviceVolume(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "getDeviceVolume(" + str + ")");
            try {
                android.content.Context context = com.json.sdk.controller.v.this.Z.getContext();
                float fA = com.json.wa.b(context).a(context);
                com.json.br brVar = new com.json.br(str);
                brVar.b(com.ironsource.y8.i.P, java.lang.String.valueOf(fA));
                com.json.sdk.controller.v.this.a(brVar.toString(), true, (java.lang.String) null, (java.lang.String) null);
            } catch (java.lang.Exception e2) {
                com.json.l9.d().a(e2);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
        }

        @android.webkit.JavascriptInterface
        public void getInitSummery(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "getInitSummery(" + str + ")");
            com.json.br brVar = new com.json.br(str);
            brVar.a(com.ironsource.y8.i.r0, com.json.sdk.controller.v.this.S);
            com.json.sdk.controller.v.this.a(brVar.toString(), true, (java.lang.String) null, (java.lang.String) null);
        }

        @android.webkit.JavascriptInterface
        public void getOrientation(java.lang.String str) {
            com.json.gh.a(com.json.ar.z, new com.json.bh().a(com.json.zb.y, str).a());
            java.lang.String strE = com.json.sdk.controller.v.this.e(str);
            java.lang.String string = com.json.sdk.utils.SDKUtils.getOrientation(com.json.sdk.controller.v.this.Z.getContext()).toString();
            if (android.text.TextUtils.isEmpty(strE)) {
                return;
            }
            com.json.sdk.controller.v.this.i(com.json.sdk.controller.v.this.a(strE, string, com.ironsource.y8.g.W, com.ironsource.y8.g.X));
        }

        @android.webkit.JavascriptInterface
        public void getUserData(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "getUserData(" + str + ")");
            com.json.br brVar = new com.json.br(str);
            if (!brVar.a(com.ironsource.y8.h.W)) {
                com.json.sdk.controller.v.this.a(str, false, com.ironsource.y8.c.F, (java.lang.String) null);
                return;
            }
            java.lang.String strE = com.json.sdk.controller.v.this.e(str);
            java.lang.String strD = brVar.d(com.ironsource.y8.h.W);
            com.json.sdk.controller.v.this.i(com.json.sdk.controller.v.this.e(strE, com.json.sdk.controller.v.this.a(strD, com.json.dk.e().a(strD), null, null, null, null, null, null, null, false)));
        }

        @android.webkit.JavascriptInterface
        public void iabTokenAPI(java.lang.String str) {
            try {
                com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "iabTokenAPI(" + str + ")");
                com.json.sdk.controller.v.this.J.a(new com.json.br(str).toString(), new com.ironsource.sdk.controller.v.r.w());
            } catch (java.lang.Exception e2) {
                com.json.l9.d().a(e2);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
                com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "iabTokenAPI failed with exception " + e2.getMessage());
            }
        }

        @android.webkit.JavascriptInterface
        public void initController(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "initController(" + str + ")");
            com.json.br brVar = new com.json.br(str);
            android.os.CountDownTimer countDownTimer = com.json.sdk.controller.v.this.m;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                com.json.sdk.controller.v.this.m = null;
            }
            if (brVar.a(com.ironsource.y8.h.q)) {
                java.lang.String strD = brVar.d(com.ironsource.y8.h.q);
                if (com.ironsource.y8.h.s.equalsIgnoreCase(strD)) {
                    com.json.sdk.controller.v.this.i = true;
                    com.json.sdk.controller.v.this.Q.c();
                } else if (com.ironsource.y8.h.r.equalsIgnoreCase(strD)) {
                    com.json.sdk.controller.v.this.Q.b();
                } else if (!com.ironsource.y8.h.t.equalsIgnoreCase(strD)) {
                    com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "No STAGE mentioned! should not get here!");
                } else {
                    com.json.sdk.controller.v.this.Q.b("controller js failed to initialize : " + brVar.d("errMsg"));
                }
            }
        }

        @android.webkit.JavascriptInterface
        public void omidAPI(java.lang.String str) {
            com.json.sdk.controller.v.this.c(new com.ironsource.sdk.controller.v.r.n(str));
        }

        @android.webkit.JavascriptInterface
        public void onAdWindowsClosed(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onAdWindowsClosed(" + str + ")");
            com.json.sdk.controller.v.this.D.a();
            com.json.sdk.controller.v.this.D.f(null);
            com.json.sdk.controller.v.this.j = null;
            com.json.br brVar = new com.json.br(str);
            java.lang.String strD = brVar.d(com.ironsource.y8.h.m);
            java.lang.String strFetchDemandSourceId = com.json.sdk.utils.SDKUtils.fetchDemandSourceId(brVar);
            com.ironsource.zg.e eVarG = com.json.sdk.controller.v.this.g(strD);
            android.util.Log.d(com.json.sdk.controller.v.this.d, "onAdClosed() with type " + eVarG);
            if (com.json.sdk.controller.v.this.q(strD)) {
                com.json.sdk.controller.v.this.a(eVarG, strFetchDemandSourceId);
            }
        }

        @android.webkit.JavascriptInterface
        public void onCleanUpNonDisplayBannersSuccess(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onCleanUpNonDisplayBannersSuccess() value=" + str);
        }

        @android.webkit.JavascriptInterface
        public void onGetApplicationInfoFail(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onGetApplicationInfoFail(" + str + ")");
            com.json.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
        }

        @android.webkit.JavascriptInterface
        public void onGetApplicationInfoSuccess(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onGetApplicationInfoSuccess(" + str + ")");
            com.json.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
        }

        @android.webkit.JavascriptInterface
        public void onGetCachedFilesMapFail(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onGetCachedFilesMapFail(" + str + ")");
            com.json.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
        }

        @android.webkit.JavascriptInterface
        public void onGetCachedFilesMapSuccess(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onGetCachedFilesMapSuccess(" + str + ")");
            com.json.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
        }

        @android.webkit.JavascriptInterface
        public void onGetDeviceStatusFail(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onGetDeviceStatusFail(" + str + ")");
            com.json.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
        }

        @android.webkit.JavascriptInterface
        public void onGetDeviceStatusSuccess(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onGetDeviceStatusSuccess(" + str + ")");
            com.json.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
        }

        @android.webkit.JavascriptInterface
        public void onInitBannerFail(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onInitBannerFail(" + str + ")");
            com.json.br brVar = new com.json.br(str);
            java.lang.String strD = brVar.d("errMsg");
            java.lang.String strFetchDemandSourceId = com.json.sdk.utils.SDKUtils.fetchDemandSourceId(brVar);
            if (android.text.TextUtils.isEmpty(strFetchDemandSourceId)) {
                com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onInitBannerFail failed with no demand source");
                return;
            }
            com.json.ta taVar = com.json.sdk.controller.v.this.G;
            com.ironsource.zg.e eVar = com.ironsource.zg.e.Banner;
            com.json.sa saVarA = taVar.a(eVar, strFetchDemandSourceId);
            if (saVarA != null) {
                saVarA.b(3);
            }
            if (com.json.sdk.controller.v.this.q(eVar.toString())) {
                com.json.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.r.h(strD, strFetchDemandSourceId));
            }
            com.json.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
        }

        @android.webkit.JavascriptInterface
        public void onInitBannerSuccess(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onInitBannerSuccess()");
            java.lang.String strFetchDemandSourceId = com.json.sdk.utils.SDKUtils.fetchDemandSourceId(new com.json.br(str));
            if (android.text.TextUtils.isEmpty(strFetchDemandSourceId)) {
                com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onInitBannerSuccess failed with no demand source");
            } else if (com.json.sdk.controller.v.this.q(com.ironsource.zg.e.Banner.toString())) {
                com.json.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.r.g(strFetchDemandSourceId));
            }
        }

        @android.webkit.JavascriptInterface
        public void onInitInterstitialFail(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onInitInterstitialFail(" + str + ")");
            com.json.br brVar = new com.json.br(str);
            java.lang.String strD = brVar.d("errMsg");
            java.lang.String strFetchDemandSourceId = com.json.sdk.utils.SDKUtils.fetchDemandSourceId(brVar);
            if (android.text.TextUtils.isEmpty(strFetchDemandSourceId)) {
                com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            com.json.ta taVar = com.json.sdk.controller.v.this.G;
            com.ironsource.zg.e eVar = com.ironsource.zg.e.Interstitial;
            com.json.sa saVarA = taVar.a(eVar, strFetchDemandSourceId);
            if (saVarA != null) {
                saVarA.b(3);
            }
            if (com.json.sdk.controller.v.this.q(eVar.toString())) {
                com.json.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.r.c(strD, strFetchDemandSourceId));
            }
            com.json.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
        }

        @android.webkit.JavascriptInterface
        public void onInitInterstitialSuccess(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onInitInterstitialSuccess()");
            java.lang.String strFetchDemandSourceId = com.json.sdk.utils.SDKUtils.fetchDemandSourceId(new com.json.br(str));
            if (android.text.TextUtils.isEmpty(strFetchDemandSourceId)) {
                com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onInitInterstitialSuccess failed with no demand source");
            } else if (com.json.sdk.controller.v.this.q(com.ironsource.zg.e.Interstitial.toString())) {
                com.json.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.r.b(strFetchDemandSourceId));
            }
        }

        @android.webkit.JavascriptInterface
        public void onInitRewardedVideoFail(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onInitRewardedVideoFail(" + str + ")");
            com.json.br brVar = new com.json.br(str);
            java.lang.String strD = brVar.d("errMsg");
            java.lang.String strFetchDemandSourceId = com.json.sdk.utils.SDKUtils.fetchDemandSourceId(brVar);
            com.json.ta taVar = com.json.sdk.controller.v.this.G;
            com.ironsource.zg.e eVar = com.ironsource.zg.e.RewardedVideo;
            com.json.sa saVarA = taVar.a(eVar, strFetchDemandSourceId);
            if (saVarA != null) {
                saVarA.b(3);
            }
            if (com.json.sdk.controller.v.this.q(eVar.toString())) {
                com.json.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.r.RunnableC0250v(strD, strFetchDemandSourceId));
            }
            com.json.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
        }

        @android.webkit.JavascriptInterface
        public void onLoadBannerFail(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onLoadBannerFail()");
            com.json.br brVar = new com.json.br(str);
            java.lang.String strD = brVar.d("errMsg");
            java.lang.String strFetchDemandSourceId = com.json.sdk.utils.SDKUtils.fetchDemandSourceId(brVar);
            com.json.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
            if (!android.text.TextUtils.isEmpty(strFetchDemandSourceId) && com.json.sdk.controller.v.this.q(com.ironsource.zg.e.Banner.toString())) {
                com.json.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.r.j(strD, strFetchDemandSourceId));
            }
        }

        @android.webkit.JavascriptInterface
        public void onLoadBannerSuccess(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onLoadBannerSuccess()");
            com.json.br brVar = new com.json.br(str);
            java.lang.String strFetchDemandSourceId = com.json.sdk.utils.SDKUtils.fetchDemandSourceId(brVar);
            java.lang.String strD = brVar.d("adViewId");
            com.json.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
            com.json.qh qhVarA = com.json.wg.a().a(strD);
            if (qhVarA == null) {
                com.json.sdk.controller.v.this.z.a(strFetchDemandSourceId, "not found view for the current adViewId= " + strD);
            } else if (qhVarA instanceof com.json.qg) {
                com.json.qg qgVar = (com.json.qg) qhVarA;
                if (com.json.sdk.controller.v.this.q(com.ironsource.zg.e.Banner.toString())) {
                    com.json.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.r.i(strFetchDemandSourceId, qgVar));
                }
            }
        }

        @android.webkit.JavascriptInterface
        public void onLoadInterstitialFail(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onLoadInterstitialFail(" + str + ")");
            com.json.br brVar = new com.json.br(str);
            java.lang.String strD = brVar.d("errMsg");
            java.lang.String strFetchDemandSourceId = com.json.sdk.utils.SDKUtils.fetchDemandSourceId(brVar);
            com.json.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
            if (android.text.TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            a(strFetchDemandSourceId, false);
            if (com.json.sdk.controller.v.this.q(com.ironsource.zg.e.Interstitial.toString())) {
                com.json.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.r.f(strD, strFetchDemandSourceId));
            }
        }

        @android.webkit.JavascriptInterface
        public void onLoadInterstitialSuccess(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onLoadInterstitialSuccess(" + str + ")");
            com.json.br brVar = new com.json.br(str);
            java.lang.String strFetchDemandSourceId = com.json.sdk.utils.SDKUtils.fetchDemandSourceId(brVar);
            org.json.JSONObject jSONObjectA = brVar.a();
            a(strFetchDemandSourceId, true);
            com.json.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
            if (com.json.sdk.controller.v.this.q(com.ironsource.zg.e.Interstitial.toString())) {
                com.json.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.r.e(strFetchDemandSourceId, jSONObjectA));
            }
        }

        @android.webkit.JavascriptInterface
        public void onReceivedMessage(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onReceivedMessage(" + str + ")");
            com.json.cg.f2559a.b(new com.ironsource.sdk.controller.v.r.l(str));
        }

        @android.webkit.JavascriptInterface
        public void onShowInterstitialFail(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onShowInterstitialFail(" + str + ")");
            com.json.br brVar = new com.json.br(str);
            final java.lang.String strD = brVar.d("errMsg");
            final java.lang.String strFetchDemandSourceId = com.json.sdk.utils.SDKUtils.fetchDemandSourceId(brVar);
            com.json.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
            if (android.text.TextUtils.isEmpty(strFetchDemandSourceId)) {
                return;
            }
            final boolean zQ = com.json.sdk.controller.v.this.q(com.ironsource.zg.e.Interstitial.toString());
            com.json.sdk.controller.v.this.b(new java.lang.Runnable() { // from class: com.ironsource.sdk.controller.v$r$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(zQ, strD, strFetchDemandSourceId);
                }
            });
        }

        @android.webkit.JavascriptInterface
        public void onShowInterstitialSuccess(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onShowInterstitialSuccess(" + str + ")");
            com.json.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
            final java.lang.String strFetchDemandSourceId = com.json.sdk.utils.SDKUtils.fetchDemandSourceId(new com.json.br(str));
            if (android.text.TextUtils.isEmpty(strFetchDemandSourceId)) {
                com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onShowInterstitialSuccess called with no demand");
                return;
            }
            com.json.x2 x2Var = com.json.sdk.controller.v.this.D;
            com.ironsource.zg.e eVar = com.ironsource.zg.e.Interstitial;
            x2Var.a(eVar.ordinal());
            com.json.sdk.controller.v.this.D.f(strFetchDemandSourceId);
            final boolean zQ = com.json.sdk.controller.v.this.q(eVar.toString());
            com.json.sdk.controller.v.this.b(new java.lang.Runnable() { // from class: com.ironsource.sdk.controller.v$r$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(zQ, strFetchDemandSourceId);
                }
            });
        }

        @android.webkit.JavascriptInterface
        public void onShowRewardedVideoFail(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onShowRewardedVideoFail(" + str + ")");
            com.json.br brVar = new com.json.br(str);
            java.lang.String strD = brVar.d("errMsg");
            java.lang.String strFetchDemandSourceId = com.json.sdk.utils.SDKUtils.fetchDemandSourceId(brVar);
            if (com.json.sdk.controller.v.this.q(com.ironsource.zg.e.RewardedVideo.toString())) {
                com.json.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.r.a(strD, strFetchDemandSourceId));
            }
            com.json.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
        }

        @android.webkit.JavascriptInterface
        public void onShowRewardedVideoSuccess(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onShowRewardedVideoSuccess(" + str + ")");
            com.json.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
        }

        @android.webkit.JavascriptInterface
        public void onVideoStatusChanged(java.lang.String str) {
            android.util.Log.d(com.json.sdk.controller.v.this.c, "onVideoStatusChanged(" + str + ")");
            com.json.br brVar = new com.json.br(str);
            java.lang.String strD = brVar.d(com.ironsource.y8.h.m);
            if (com.json.sdk.controller.v.this.C == null || android.text.TextUtils.isEmpty(strD)) {
                return;
            }
            java.lang.String strD2 = brVar.d("status");
            if (com.ironsource.y8.h.d0.equalsIgnoreCase(strD2)) {
                com.json.sdk.controller.v.this.C.onVideoStarted();
                return;
            }
            if (com.ironsource.y8.h.e0.equalsIgnoreCase(strD2)) {
                com.json.sdk.controller.v.this.C.onVideoPaused();
                return;
            }
            if (com.ironsource.y8.h.f0.equalsIgnoreCase(strD2)) {
                com.json.sdk.controller.v.this.C.onVideoResumed();
                return;
            }
            if (com.ironsource.y8.h.g0.equalsIgnoreCase(strD2)) {
                com.json.sdk.controller.v.this.C.onVideoEnded();
            } else if (com.ironsource.y8.h.h0.equalsIgnoreCase(strD2)) {
                com.json.sdk.controller.v.this.C.onVideoStopped();
            } else {
                com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onVideoStatusChanged: unknown status: " + strD2);
            }
        }

        @android.webkit.JavascriptInterface
        public void openUrl(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "openUrl(" + str + ")");
            com.json.br brVar = new com.json.br(str);
            com.ironsource.sdk.controller.p.c cVarA = new com.ironsource.sdk.controller.p.a(brVar.d("method"), new com.json.qo(com.json.sdk.controller.v.this.F, com.google.android.gms.drive.DriveFile.MODE_READ_WRITE)).a(brVar.c(com.ironsource.y8.h.L0) ? com.json.sdk.controller.v.this.Z.getContext() : com.json.sdk.controller.v.this.q(), new com.json.po(brVar.d("url"), brVar.d(com.ironsource.y8.h.V)));
            if (cVarA instanceof com.ironsource.sdk.controller.p.c.a) {
                com.json.sdk.controller.v.this.a(str, false, ((com.ironsource.sdk.controller.p.c.a) cVarA).b(), (java.lang.String) null);
            } else {
                com.json.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
            }
        }

        @android.webkit.JavascriptInterface
        public void pauseControllerWebview() {
            com.json.sdk.controller.v.this.c(new com.ironsource.sdk.controller.v.r.o());
        }

        @android.webkit.JavascriptInterface
        public void permissionsAPI(java.lang.String str) {
            try {
                com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "permissionsAPI(" + str + ")");
                com.json.sdk.controller.v.this.I.a(new com.json.br(str).toString(), new com.ironsource.sdk.controller.v.r.w());
            } catch (java.lang.Exception e2) {
                com.json.l9.d().a(e2);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
                com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "permissionsAPI failed with exception " + e2.getMessage());
            }
        }

        @android.webkit.JavascriptInterface
        public void postAdEventNotification(java.lang.String str) {
            try {
                com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "postAdEventNotification(" + str + ")");
                com.json.br brVar = new com.json.br(str);
                java.lang.String strD = brVar.d(com.ironsource.y8.h.j0);
                if (android.text.TextUtils.isEmpty(strD)) {
                    com.json.sdk.controller.v.this.a(str, false, com.ironsource.y8.c.w, (java.lang.String) null);
                    return;
                }
                java.lang.String strD2 = brVar.d(com.ironsource.y8.h.k0);
                java.lang.String strFetchDemandSourceId = com.json.sdk.utils.SDKUtils.fetchDemandSourceId(brVar);
                java.lang.String str2 = !android.text.TextUtils.isEmpty(strFetchDemandSourceId) ? strFetchDemandSourceId : strD2;
                org.json.JSONObject jSONObject = (org.json.JSONObject) brVar.b(com.ironsource.y8.h.l0);
                java.lang.String strD3 = brVar.d(com.ironsource.y8.h.m);
                com.ironsource.zg.e eVarG = com.json.sdk.controller.v.this.g(strD3);
                if (!com.json.sdk.controller.v.this.q(strD3)) {
                    com.json.sdk.controller.v.this.a(str, false, com.ironsource.y8.c.v, (java.lang.String) null);
                    return;
                }
                java.lang.String strE = com.json.sdk.controller.v.this.e(str);
                if (!android.text.TextUtils.isEmpty(strE)) {
                    com.json.sdk.controller.v.this.i(com.json.sdk.controller.v.this.a(strE, com.json.sdk.controller.v.this.a(com.ironsource.y8.h.m, strD3, com.ironsource.y8.h.j0, strD, "demandSourceName", strD2, "demandSourceId", str2, null, false), com.ironsource.y8.g.b0, com.ironsource.y8.g.c0));
                }
                com.json.sdk.controller.v.this.b(new com.ironsource.sdk.controller.v.r.m(eVarG, str2, strD, jSONObject));
            } catch (java.lang.Exception e2) {
                com.json.l9.d().a(e2);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
        }

        @android.webkit.JavascriptInterface
        public void removeCloseEventHandler(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "removeCloseEventHandler(" + str + ")");
            if (com.json.sdk.controller.v.this.l != null) {
                com.json.sdk.controller.v.this.l.cancel();
            }
            com.json.sdk.controller.v.this.k = true;
        }

        @android.webkit.JavascriptInterface
        public void removeMessagingInterface(java.lang.String str) {
            com.json.sdk.controller.v.this.c(new com.ironsource.sdk.controller.v.r.p());
        }

        @android.webkit.JavascriptInterface
        public void requestToDestroyBanner(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "onCleanUpNonDisplayBannersFail() value=" + str);
        }

        @android.webkit.JavascriptInterface
        public void resumeControllerWebview() {
            com.json.sdk.controller.v.this.c(new com.ironsource.sdk.controller.v.r.k());
        }

        @android.webkit.JavascriptInterface
        public void saveFile(java.lang.String str) {
            try {
                com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "saveFile(" + str + ")");
                com.json.br brVar = new com.json.br(str);
                java.lang.String strD = brVar.d("path");
                java.lang.String strD2 = brVar.d(com.ironsource.y8.h.b);
                if (android.text.TextUtils.isEmpty(strD2)) {
                    com.json.sdk.controller.v.this.a(str, false, com.ironsource.y8.c.g, "1");
                    return;
                }
                com.json.ih ihVar = new com.json.ih(com.json.sdk.utils.IronSourceStorageUtils.buildAbsolutePathToDirInCache(com.json.sdk.controller.v.this.A, strD), com.json.sdk.utils.SDKUtils.getFileName(strD2));
                com.json.sdk.utils.IronSourceStorageUtils.ensurePathSafety(ihVar, com.json.sdk.controller.v.this.A);
                if (com.json.sdk.controller.v.this.X.a(com.json.sdk.controller.v.this.A) <= 0) {
                    com.json.sdk.controller.v.this.a(str, false, com.json.a9.A, (java.lang.String) null);
                    return;
                }
                if (ihVar.exists()) {
                    com.json.sdk.controller.v.this.a(str, false, com.json.a9.z, (java.lang.String) null);
                    return;
                }
                if (!com.json.u8.h(com.json.sdk.controller.v.this.Z.getContext())) {
                    com.json.sdk.controller.v.this.a(str, false, com.json.a9.C, (java.lang.String) null);
                    return;
                }
                com.json.sdk.controller.v.this.a(str, true, (java.lang.String) null, (java.lang.String) null);
                com.json.sdk.controller.v.this.h.a(ihVar, strD2, brVar.a("connectionTimeout", 0), brVar.a("readTimeout", 0));
            } catch (java.lang.Exception e2) {
                com.json.l9.d().a(e2);
                com.json.sdk.controller.v.this.a(str, false, e2.getMessage(), (java.lang.String) null);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
        }

        @android.webkit.JavascriptInterface
        public void setBackButtonState(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "setBackButtonState(" + str + ")");
            com.json.dk.e().c(new com.json.br(str).d("state"));
        }

        @android.webkit.JavascriptInterface
        public void setForceClose(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "setForceClose(" + str + ")");
            com.json.br brVar = new com.json.br(str);
            java.lang.String strD = brVar.d("width");
            java.lang.String strD2 = brVar.d("height");
            com.json.sdk.controller.v.this.n = java.lang.Integer.parseInt(strD);
            com.json.sdk.controller.v.this.o = java.lang.Integer.parseInt(strD2);
            com.json.sdk.controller.v.this.p = brVar.d(com.ironsource.y8.h.L);
        }

        @android.webkit.JavascriptInterface
        public void setMixedContentAlwaysAllow(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "setMixedContentAlwaysAllow(" + str + ")");
            com.json.sdk.controller.v.this.c(new com.ironsource.sdk.controller.v.r.q());
        }

        @android.webkit.JavascriptInterface
        public void setOrientation(java.lang.String str) {
            try {
                com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "setOrientation(" + str + ")");
                java.lang.String strD = new com.json.br(str).d("orientation");
                com.json.sdk.controller.v.this.n(strD);
                if (com.json.sdk.controller.v.this.a0 != null) {
                    com.json.sdk.controller.v.this.a0.onOrientationChanged(strD, com.json.sdk.controller.v.this.X.J(com.json.sdk.controller.v.this.Z.getContext()));
                }
            } catch (java.lang.Exception e2) {
                com.json.l9.d().a(e2);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
        }

        @android.webkit.JavascriptInterface
        public void setStoreSearchKeys(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "setStoreSearchKeys(" + str + ")");
            com.json.dk.e().e(str);
        }

        @android.webkit.JavascriptInterface
        public void setUserData(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "setUserData(" + str + ")");
            com.json.br brVar = new com.json.br(str);
            if (!brVar.a(com.ironsource.y8.h.W)) {
                com.json.sdk.controller.v.this.a(str, false, com.ironsource.y8.c.F, (java.lang.String) null);
                return;
            }
            if (!brVar.a("value")) {
                com.json.sdk.controller.v.this.a(str, false, com.ironsource.y8.c.G, (java.lang.String) null);
                return;
            }
            java.lang.String strD = brVar.d(com.ironsource.y8.h.W);
            java.lang.String strD2 = brVar.d("value");
            com.json.dk.e().a(strD, strD2);
            com.json.sdk.controller.v.this.i(com.json.sdk.controller.v.this.e(com.json.sdk.controller.v.this.e(str), com.json.sdk.controller.v.this.a(strD, strD2, null, null, null, null, null, null, null, false)));
        }

        @android.webkit.JavascriptInterface
        public void setWebviewBackgroundColor(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "setWebviewBackgroundColor(" + str + ")");
            com.json.sdk.controller.v.this.p(str);
        }

        @android.webkit.JavascriptInterface
        public void stillAlive(java.lang.String str) {
            com.json.sdk.utils.Logger.i(com.json.sdk.controller.v.this.c, "stillAlive(" + str + ")");
            com.json.sdk.controller.v.this.b.a();
        }
    }

    private interface s {
        void a(java.lang.String str, com.ironsource.zg.e eVar, com.json.sa saVar);
    }

    static class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.lang.String f3397a;
        java.lang.String b;

        t() {
        }
    }

    public enum u {
        Display,
        Gone
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.v$v, reason: collision with other inner class name */
    private class C0251v extends android.webkit.WebViewClient {
        private C0251v() {
        }

        /* synthetic */ C0251v(com.json.sdk.controller.v vVar, com.ironsource.sdk.controller.v.f fVar) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
            com.json.sdk.utils.Logger.i("onPageFinished", str);
            if (str.contains("adUnit") || str.contains("index.html")) {
                com.json.sdk.controller.v.this.A();
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
            com.json.sdk.utils.Logger.i("onPageStarted", str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
            com.json.sdk.utils.Logger.i("onReceivedError", str2 + " " + str);
            if (str2.contains(com.json.y8.f) && com.json.sdk.controller.v.this.Q != null) {
                com.json.sdk.controller.v.this.Q.b("controller html - web-view receivedError on loading - " + str + " (errorCode: " + i + ")");
            }
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(android.webkit.WebView webView, android.webkit.RenderProcessGoneDetail renderProcessGoneDetail) {
            android.util.Log.e(com.json.sdk.controller.v.this.c, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            java.lang.String str = renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system";
            if (com.json.sdk.controller.v.this.Q != null) {
                com.json.sdk.controller.v.this.Q.c(str);
            }
            com.json.sdk.controller.v.this.w();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, java.lang.String str) {
            boolean zContains;
            com.json.sdk.utils.Logger.i("shouldInterceptRequest", str);
            try {
                zContains = new java.net.URL(str).getFile().contains("mraid.js");
            } catch (java.net.MalformedURLException e) {
                com.json.l9.d().a(e);
                zContains = false;
            }
            if (zContains) {
                java.lang.String str2 = "file://" + com.json.sdk.controller.v.this.A + java.io.File.separator + "mraid.js";
                try {
                    new java.io.FileInputStream(new java.io.File(str2));
                    return new android.webkit.WebResourceResponse("text/javascript", com.adjust.sdk.Constants.ENCODING, getClass().getResourceAsStream(str2));
                } catch (java.io.FileNotFoundException e2) {
                    com.json.l9.d().a(e2);
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
            com.json.sdk.utils.Logger.i("shouldOverrideUrlLoading", str);
            try {
                if (com.json.sdk.controller.v.this.h(str)) {
                    com.json.sdk.controller.v.this.z();
                    return true;
                }
            } catch (java.lang.Exception e) {
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public v(android.content.Context context, com.json.ta taVar, com.json.b9 b9Var, com.json.sdk.controller.c cVar, com.json.cg cgVar, int i2, com.json.db dbVar, java.lang.String str, com.ironsource.sdk.controller.l.a aVar, com.ironsource.sdk.controller.l.b bVar, java.lang.String str2, java.lang.String str3) throws java.lang.Throwable {
        com.json.fk fkVar = new com.json.fk(context, new com.ironsource.qk.a());
        this.Z = fkVar;
        com.json.sdk.utils.Logger.i(this.c, "C'tor");
        this.Y = b9Var;
        this.Q = cVar;
        this.f3355a = cgVar;
        this.G = taVar;
        a(context, fkVar);
        this.A = str;
        this.D = new com.json.x2();
        this.S = new org.json.JSONObject();
        this.h = dbVar;
        this.T = aVar;
        this.U = bVar;
        boolean zOptBoolean = com.json.sdk.utils.SDKUtils.getNetworkConfiguration().optBoolean(com.ironsource.y8.a.i, false);
        this.W = zOptBoolean;
        if (zOptBoolean) {
            this.V = new com.json.i9(new com.json.f9(com.json.sdk.utils.SDKUtils.getControllerUrl(), this.A, com.json.sdk.utils.SDKUtils.getNetworkConfiguration().optBoolean("useWebViewUserAgent", false), new com.json.ap(com.json.sdk.utils.SDKUtils.getControllerUrl())), new kotlin.jvm.functions.Function1() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return this.f$0.c((com.json.ih) obj);
                }
            }, dbVar, new com.ironsource.n9.a());
        } else {
            dbVar.a(this);
            this.B = new com.json.sdk.controller.d(com.json.sdk.utils.SDKUtils.getNetworkConfiguration(), this.A, com.json.sdk.utils.SDKUtils.getControllerUrl(), dbVar);
        }
        com.ironsource.sdk.controller.v.f fVar = null;
        com.ironsource.sdk.controller.v.o oVar = new com.ironsource.sdk.controller.v.o(this, fVar);
        this.q = oVar;
        fkVar.setWebViewClient(new com.json.sdk.controller.v.C0251v(this, fVar));
        fkVar.setWebChromeClient(oVar);
        com.json.gw.a(fkVar);
        a(fkVar);
        fkVar.setDownloadListener(this);
        this.R = c(context);
        b(context);
        b(i2);
        this.f = str2;
        this.g = str3;
        this.b = com.json.e9.a(com.json.sdk.controller.FeaturesManager.getInstance().getFeatureFlagHealthCheck());
    }

    private void G() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.json.p9 a(com.ironsource.zg.e eVar) {
        if (eVar == com.ironsource.zg.e.Interstitial) {
            return this.y;
        }
        if (eVar == com.ironsource.zg.e.RewardedVideo) {
            return this.x;
        }
        if (eVar == com.ironsource.zg.e.Banner) {
            return this.z;
        }
        return null;
    }

    private com.ironsource.sdk.controller.v.t a(com.ironsource.zg.e eVar, com.json.sa saVar) {
        com.ironsource.sdk.controller.v.t tVar = new com.ironsource.sdk.controller.v.t();
        if (eVar == com.ironsource.zg.e.RewardedVideo || eVar == com.ironsource.zg.e.Interstitial || eVar == com.ironsource.zg.e.Banner) {
            java.util.HashMap map = new java.util.HashMap();
            map.put(com.ironsource.y8.i.g, this.f);
            if (!android.text.TextUtils.isEmpty(this.g)) {
                map.put(com.ironsource.y8.i.f, this.g);
            }
            if (saVar != null) {
                if (saVar.g() != null) {
                    map.putAll(saVar.g());
                    map.put(com.ironsource.y8.h.y0, java.lang.String.valueOf(com.json.j0.f2778a.c(saVar.h())));
                }
                map.put("demandSourceName", saVar.f());
                map.put("demandSourceId", saVar.h());
            }
            java.lang.String strFlatMapToJsonAsString = com.json.sdk.utils.SDKUtils.flatMapToJsonAsString(map);
            com.ironsource.y8.g gVarA = com.ironsource.y8.g.a(eVar);
            java.lang.String strA = a(gVarA.f3581a, strFlatMapToJsonAsString, gVarA.b, gVarA.c);
            tVar.f3397a = gVarA.f3581a;
            tVar.b = strA;
        }
        return tVar;
    }

    private java.lang.String a(com.ironsource.zg.e eVar, org.json.JSONObject jSONObject) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("sessionDepth", java.lang.Integer.toString(jSONObject.optInt("sessionDepth")));
        java.lang.String strOptString = jSONObject.optString("demandSourceName");
        java.lang.String strFetchDemandSourceId = com.json.sdk.utils.SDKUtils.fetchDemandSourceId(jSONObject);
        com.json.sa saVarA = this.G.a(eVar, strFetchDemandSourceId);
        if (saVarA != null) {
            if (saVarA.g() != null) {
                map.putAll(saVarA.g());
            }
            if (!android.text.TextUtils.isEmpty(strOptString)) {
                map.put("demandSourceName", strOptString);
            }
            if (!android.text.TextUtils.isEmpty(strFetchDemandSourceId)) {
                map.put("demandSourceId", strFetchDemandSourceId);
            }
        }
        java.lang.String strFlatMapToJsonAsString = com.json.sdk.utils.SDKUtils.flatMapToJsonAsString(map);
        com.ironsource.y8.g gVarB = com.ironsource.y8.g.b(eVar);
        return a(gVarB.f3581a, strFlatMapToJsonAsString, gVarB.b, gVarB.c);
    }

    private java.lang.String a(java.lang.String str, java.lang.String str2) {
        return a(str, str2, com.ironsource.y8.h.g);
    }

    private java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(str2)) {
            return str;
        }
        try {
            return new org.json.JSONObject(str).put(str3, str2).toString();
        } catch (org.json.JSONException e2) {
            com.json.l9.d().a(e2);
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return new com.ironsource.sdk.controller.m.a(str, str2, str3, str4).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, boolean z) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
                jSONObject.put(str, com.json.sdk.utils.SDKUtils.encodeString(str2));
            }
            if (!android.text.TextUtils.isEmpty(str3) && !android.text.TextUtils.isEmpty(str4)) {
                jSONObject.put(str3, com.json.sdk.utils.SDKUtils.encodeString(str4));
            }
            if (!android.text.TextUtils.isEmpty(str5) && !android.text.TextUtils.isEmpty(str6)) {
                jSONObject.put(str5, com.json.sdk.utils.SDKUtils.encodeString(str6));
            }
            if (!android.text.TextUtils.isEmpty(str7) && !android.text.TextUtils.isEmpty(str8)) {
                jSONObject.put(str7, com.json.sdk.utils.SDKUtils.encodeString(str8));
            }
            if (!android.text.TextUtils.isEmpty(str9)) {
                jSONObject.put(str9, z);
            }
        } catch (org.json.JSONException e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
        return jSONObject.toString();
    }

    private void a(android.content.Context context, android.webkit.WebView webView) {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        this.u = new android.widget.FrameLayout(context);
        this.s = new android.widget.FrameLayout(context);
        this.s.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.s.setVisibility(8);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(webView);
        this.u.addView(this.s, layoutParams);
        this.u.addView(frameLayout);
    }

    private void a(android.webkit.WebSettings webSettings) {
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }

    private void a(android.webkit.WebView webView) {
        com.json.sdk.controller.s sVar = new com.json.sdk.controller.s(com.json.sdk.controller.s.a());
        webView.addJavascriptInterface(a(sVar), com.json.y8.d);
        webView.addJavascriptInterface(b(sVar), com.json.y8.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.json.ne neVar) {
        try {
            this.Q.a(neVar);
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.sdk.utils.Logger.e(this.c, "handleLoadAd: " + e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.json.qe qeVar) {
        qeVar.a(new com.json.re() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda2
            @Override // com.json.re
            public final void a(com.json.ne neVar) {
                this.f$0.a(neVar);
            }
        });
    }

    private void a(com.json.sa saVar, java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.Map<java.lang.String, java.lang.String> mapMergeHashMaps = com.json.sdk.utils.SDKUtils.mergeHashMaps(new java.util.Map[]{map, saVar.b()});
        if (map.containsKey("adm")) {
            this.b.a(new com.ironsource.e9.d() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda0
                @Override // com.ironsource.e9.d
                public final void a(com.json.qe qeVar) {
                    this.f$0.a(qeVar);
                }
            });
        }
        this.D.d(saVar.h(), true);
        i(a(com.ironsource.y8.g.D, com.json.sdk.utils.SDKUtils.flatMapToJsonAsString(mapMergeHashMaps), com.ironsource.y8.g.E, com.ironsource.y8.g.F));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.lang.String str, com.ironsource.zg.e eVar, com.json.sa saVar) {
        if (q(eVar.toString())) {
            b(new com.ironsource.sdk.controller.v.m(eVar, saVar, str));
        }
    }

    private void a(java.lang.String str, com.ironsource.zg.e eVar, com.json.sa saVar, com.ironsource.sdk.controller.v.s sVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            sVar.a("Application key are missing", eVar, saVar);
        } else {
            i(a(eVar, saVar).b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3) {
        java.lang.String strD = new com.json.br(str).d(z ? g0 : h0);
        if (android.text.TextUtils.isEmpty(strD)) {
            return;
        }
        i(e(strD, a(b(str, str2), str3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(org.json.JSONObject jSONObject, android.webkit.WebView webView) {
        boolean zOptBoolean = jSONObject.optBoolean("inspectWebview");
        if (zOptBoolean) {
            android.webkit.WebView.setWebContentsDebuggingEnabled(zOptBoolean);
        }
    }

    private java.lang.String b(java.lang.String str) {
        java.lang.String str2 = this.A + java.io.File.separator;
        return str.contains(str2) ? str.substring(str2.length()) : str;
    }

    private java.lang.String b(java.lang.String str, java.lang.String str2) {
        return a(str, str2, "errMsg");
    }

    private com.json.s8 c(android.content.Context context) {
        return new com.ironsource.sdk.controller.v.f(com.json.sdk.utils.SDKUtils.getControllerConfigAsJSONObject(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object c(com.json.ih ihVar) {
        this.h.a(this);
        if (ihVar == null || !ihVar.exists()) {
            a(new com.json.ih(com.json.y8.f), new com.json.ah(1, "Unable to download Html file"));
            return null;
        }
        a(ihVar);
        return null;
    }

    private java.lang.String c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return new com.ironsource.sdk.controller.m.a(str, null, str2, str3).a();
    }

    private void c(org.json.JSONObject jSONObject) throws org.json.JSONException {
        jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString("gpi"), com.json.zo.d(this.Z.getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String d(java.lang.String str) {
        return new com.json.br(str).d(h0);
    }

    private java.lang.String d(org.json.JSONObject jSONObject) {
        com.json.wa waVarB = com.json.wa.b(this.Z.getContext());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String sDKVersion = com.json.sdk.utils.SDKUtils.getSDKVersion();
        if (!android.text.TextUtils.isEmpty(sDKVersion)) {
            sb.append("SDKVersion=").append(sDKVersion).append(com.ironsource.y8.i.c);
        }
        java.lang.String strE = waVarB.e();
        if (!android.text.TextUtils.isEmpty(strE)) {
            sb.append("deviceOs=").append(strE);
        }
        android.net.Uri uri = android.net.Uri.parse(com.json.sdk.utils.SDKUtils.getControllerUrl());
        if (uri != null) {
            java.lang.String str = uri.getScheme() + ":";
            java.lang.String host = uri.getHost();
            int port = uri.getPort();
            if (port != -1) {
                host = host + ":" + port;
            }
            sb.append("&protocol=").append(str);
            sb.append("&domain=").append(host);
            if (jSONObject.keys().hasNext()) {
                try {
                    java.lang.String string = new org.json.JSONObject(jSONObject, new java.lang.String[]{com.ironsource.y8.i.Z, com.ironsource.y8.i.g}).toString();
                    if (!android.text.TextUtils.isEmpty(string)) {
                        sb.append(com.ironsource.y8.i.c).append("controllerConfig").append(com.ironsource.y8.i.b).append(string);
                    }
                } catch (org.json.JSONException e2) {
                    com.json.l9.d().a(e2);
                    com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
                }
            }
            sb.append("&debug=").append(r());
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object[] d(android.content.Context context) {
        boolean z;
        com.json.wa waVarB = com.json.wa.b(context);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.ironsource.y8.i.z, "none");
            jSONObject.put(com.ironsource.y8.i.A, com.json.sdk.utils.SDKUtils.translateDeviceOrientation(this.X.F(context)));
            java.lang.String strD = waVarB.d();
            if (strD != null) {
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.k), com.json.sdk.utils.SDKUtils.encodeString(strD));
            }
            java.lang.String strC = waVarB.c();
            if (strC != null) {
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.l), com.json.sdk.utils.SDKUtils.encodeString(strC));
                z = false;
            } else {
                z = true;
            }
            try {
                com.json.sdk.utils.SDKUtils.loadGoogleAdvertiserInfo(context);
                java.lang.String advertiserId = com.json.sdk.utils.SDKUtils.getAdvertiserId();
                if (!android.text.TextUtils.isEmpty(advertiserId)) {
                    com.json.sdk.utils.Logger.i(this.c, "add AID");
                    jSONObject.put("deviceIds[AID]", com.json.sdk.utils.SDKUtils.encodeString(advertiserId));
                }
                java.lang.String limitAdTracking = com.json.sdk.utils.SDKUtils.getLimitAdTracking();
                if (!android.text.TextUtils.isEmpty(limitAdTracking)) {
                    com.json.sdk.utils.Logger.i(this.c, "add LAT");
                    jSONObject.put(com.ironsource.y8.i.M, java.lang.Boolean.parseBoolean(limitAdTracking));
                }
                java.lang.String strE = waVarB.e();
                if (strE != null) {
                    jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.m), com.json.sdk.utils.SDKUtils.encodeString(strE));
                } else {
                    z = true;
                }
                java.lang.String strF = waVarB.f();
                if (strF != null) {
                    jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.n), strF.replaceAll("[^0-9/.]", ""));
                } else {
                    z = true;
                }
                java.lang.String strF2 = waVarB.f();
                if (strF2 != null) {
                    jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.o), com.json.sdk.utils.SDKUtils.encodeString(strF2));
                }
                java.lang.String strValueOf = java.lang.String.valueOf(waVarB.a());
                if (strValueOf != null) {
                    jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.p), strValueOf);
                } else {
                    z = true;
                }
                jSONObject.put(com.json.ce.Y, java.lang.String.valueOf(com.json.h1.a()));
                java.lang.String sDKVersion = com.json.sdk.utils.SDKUtils.getSDKVersion();
                if (sDKVersion != null) {
                    jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.q), com.json.sdk.utils.SDKUtils.encodeString(sDKVersion));
                }
                if (waVarB.b() != null && waVarB.b().length() > 0) {
                    jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.r), com.json.sdk.utils.SDKUtils.encodeString(waVarB.b()));
                }
                java.lang.String strB = com.json.v8.b(context);
                if (strB.equals("none")) {
                    z = true;
                } else {
                    jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.t), com.json.sdk.utils.SDKUtils.encodeString(strB));
                }
                java.lang.String strD2 = com.json.v8.d(context);
                if (strD2 != null) {
                    jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.u), com.json.sdk.utils.SDKUtils.encodeString(strD2));
                } else {
                    z = true;
                }
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.v), com.json.v8.e(context));
                jSONObject.put("uxt", com.json.sdk.utils.IronSourceStorageUtils.isUxt());
                java.lang.String language = context.getResources().getConfiguration().locale.getLanguage();
                if (!android.text.TextUtils.isEmpty(language)) {
                    jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.x), com.json.sdk.utils.SDKUtils.encodeString(language.toUpperCase(java.util.Locale.getDefault())));
                }
                jSONObject.put(com.ironsource.y8.i.y, com.json.sdk.utils.SDKUtils.encodeString(java.lang.String.valueOf(this.X.a(this.A))));
                java.lang.String strValueOf2 = java.lang.String.valueOf(this.X.r());
                if (android.text.TextUtils.isEmpty(strValueOf2)) {
                    z = true;
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.G)).append(com.ironsource.y8.i.d).append(com.json.sdk.utils.SDKUtils.encodeString("width")).append(com.ironsource.y8.i.e);
                    jSONObject.put(sb.toString(), com.json.sdk.utils.SDKUtils.encodeString(strValueOf2));
                }
                java.lang.String strValueOf3 = java.lang.String.valueOf(this.X.a());
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.G)).append(com.ironsource.y8.i.d).append(com.json.sdk.utils.SDKUtils.encodeString("height")).append(com.ironsource.y8.i.e);
                jSONObject.put(sb2.toString(), com.json.sdk.utils.SDKUtils.encodeString(strValueOf3));
                java.lang.String strG = com.json.z3.g(this.Z.getContext());
                if (!android.text.TextUtils.isEmpty(strG)) {
                    jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString("bundleId"), com.json.sdk.utils.SDKUtils.encodeString(strG));
                }
                java.lang.String strValueOf4 = java.lang.String.valueOf(this.X.h());
                if (!android.text.TextUtils.isEmpty(strValueOf4)) {
                    jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.K), com.json.sdk.utils.SDKUtils.encodeString(strValueOf4));
                }
                java.lang.String strValueOf5 = java.lang.String.valueOf(this.X.f());
                if (!android.text.TextUtils.isEmpty(strValueOf5)) {
                    jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.O), com.json.sdk.utils.SDKUtils.encodeString(strValueOf5));
                }
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.P), com.json.wa.b(context).a(context));
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.Y), this.X.x(context));
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString("mcc"), com.json.u8.b(context));
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString("mnc"), com.json.u8.c(context));
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.S), com.json.u8.f(context));
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.R), com.json.sdk.utils.SDKUtils.encodeString(com.json.u8.g(context)));
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.V), com.json.z3.f(context));
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.X), com.json.z3.d(context));
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.W), com.json.sdk.utils.SDKUtils.encodeString(com.json.z3.b(context)));
                java.lang.String strE2 = com.json.z3.e(context);
                if (!android.text.TextUtils.isEmpty(strE2)) {
                    jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.c0), com.json.sdk.utils.SDKUtils.encodeString(strE2));
                }
                c(jSONObject);
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.p0), this.X.A(context));
            } catch (org.json.JSONException e2) {
                e = e2;
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
        } catch (org.json.JSONException e3) {
            e = e3;
            z = false;
        }
        return new java.lang.Object[]{jSONObject.toString(), java.lang.Boolean.valueOf(z)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String e(java.lang.String str) {
        return new com.json.br(str).d(g0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String e(java.lang.String str, java.lang.String str2) {
        return new com.ironsource.sdk.controller.m.a(str, str2).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(android.content.Context context) {
        try {
            com.json.s8 s8Var = this.R;
            if (s8Var == null) {
                return;
            }
            s8Var.b(context);
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(th.toString());
        }
    }

    private java.lang.String f(java.lang.String str) {
        return new com.ironsource.sdk.controller.m.a(str).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(android.content.Context context) {
        try {
            com.json.s8 s8Var = this.R;
            if (s8Var == null) {
                return;
            }
            s8Var.c(context);
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(th.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.Object[] f(java.lang.String str, java.lang.String str2) {
        boolean z;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.util.Map<java.lang.String, java.lang.String> mapG = null;
        if (android.text.TextUtils.isEmpty(str)) {
            z = true;
        } else {
            com.json.sa saVarA = this.G.a(g(str), str2);
            if (saVarA != null) {
                mapG = saVarA.g();
                mapG.put("demandSourceName", saVarA.f());
                mapG.put("demandSourceId", saVarA.h());
            }
            try {
                jSONObject.put(com.ironsource.y8.h.m, str);
            } catch (org.json.JSONException e2) {
                com.json.l9.d().a(e2);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            }
            try {
                java.util.Map<java.lang.String, java.lang.String> initSDKParams = com.json.sdk.utils.SDKUtils.getInitSDKParams();
                if (initSDKParams != null) {
                    jSONObject = com.json.sdk.utils.SDKUtils.mergeJSONObjects(jSONObject, new org.json.JSONObject(initSDKParams));
                }
            } catch (java.lang.Exception e3) {
                com.json.l9.d().a(e3);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e3.toString());
            }
            z = false;
        }
        if (!android.text.TextUtils.isEmpty(this.g)) {
            try {
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.f), com.json.sdk.utils.SDKUtils.encodeString(this.g));
            } catch (org.json.JSONException e4) {
                com.json.l9.d().a(e4);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e4.toString());
            }
        }
        if (android.text.TextUtils.isEmpty(this.f)) {
            z = true;
        } else {
            try {
                jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(com.ironsource.y8.i.g), com.json.sdk.utils.SDKUtils.encodeString(this.f));
            } catch (org.json.JSONException e5) {
                com.json.l9.d().a(e5);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error(e5.toString());
            }
        }
        if (mapG != null && !mapG.isEmpty()) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : mapG.entrySet()) {
                if (entry.getKey().equalsIgnoreCase("sdkWebViewCache")) {
                    o(entry.getValue());
                }
                try {
                    jSONObject.put(com.json.sdk.utils.SDKUtils.encodeString(entry.getKey()), com.json.sdk.utils.SDKUtils.encodeString(entry.getValue()));
                } catch (org.json.JSONException e6) {
                    com.json.l9.d().a(e6);
                    com.json.mediationsdk.logger.IronLog.INTERNAL.error(e6.toString());
                }
            }
        }
        return new java.lang.Object[]{jSONObject.toString(), java.lang.Boolean.valueOf(z)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.ironsource.zg.e g(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        com.ironsource.zg.e eVar = com.ironsource.zg.e.Interstitial;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        com.ironsource.zg.e eVar2 = com.ironsource.zg.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        com.ironsource.zg.e eVar3 = com.ironsource.zg.e.Banner;
        if (str.equalsIgnoreCase(eVar3.toString())) {
            return eVar3;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(final java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        c(new java.lang.Runnable() { // from class: com.ironsource.sdk.controller.v$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.j(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(java.lang.String str) {
        this.Z.a(new com.ironsource.sdk.controller.m.b(str, r()).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(java.lang.String str) {
        try {
            com.json.sdk.utils.Logger.i(this.c, "load(): " + str);
            this.Z.loadUrl(str);
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            com.json.sdk.utils.Logger.e(this.c, "WebViewController::load: " + th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        com.json.oo ooVar = this.a0;
        if (ooVar != null) {
            ooVar.onCloseRequested();
        }
    }

    private void o(java.lang.String str) {
        android.webkit.WebSettings settings;
        int i2;
        if (str.equalsIgnoreCase("0")) {
            settings = this.Z.getSettings();
            i2 = 2;
        } else {
            settings = this.Z.getSettings();
            i2 = -1;
        }
        settings.setCacheMode(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(java.lang.String str) {
        android.webkit.WebView presentingView;
        com.json.br brVar = new com.json.br(str);
        java.lang.String strD = brVar.d("color");
        java.lang.String strD2 = brVar.d("adViewId");
        int color = !com.ironsource.y8.h.T.equalsIgnoreCase(strD) ? android.graphics.Color.parseColor(strD) : 0;
        if (strD2 != null) {
            presentingView = com.json.wg.a().a(strD2).getPresentingView();
            if (presentingView == null) {
                return;
            }
        } else {
            presentingView = this.Z;
        }
        presentingView.setBackgroundColor(color);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q(java.lang.String str) {
        boolean z = false;
        if (android.text.TextUtils.isEmpty(str)) {
            com.json.sdk.utils.Logger.d(this.c, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(com.ironsource.zg.e.Interstitial.toString()) ? !(!str.equalsIgnoreCase(com.ironsource.zg.e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(com.ironsource.zg.e.Banner.toString()) || this.z == null : this.x == null) : this.y != null) {
            z = true;
        }
        if (!z) {
            com.json.sdk.utils.Logger.d(this.c, "Trying to trigger a listener - no listener was found for product " + str);
        }
        return z;
    }

    public void A() {
        i(f(com.ironsource.y8.g.z));
    }

    public void B() {
        try {
            this.Z.onPause();
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            com.json.sdk.utils.Logger.i(this.c, "WebViewController: onPause() - " + th);
        }
    }

    public void C() {
        this.C = null;
    }

    public void D() {
        this.a0 = null;
    }

    public void E() {
        this.Z.requestFocus();
    }

    public void F() {
        try {
            this.Z.onResume();
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            com.json.sdk.utils.Logger.i(this.c, "WebViewController: onResume() - " + th);
        }
    }

    com.json.sdk.controller.g a(com.json.sdk.controller.s sVar) {
        return new com.json.sdk.controller.g(new com.json.sdk.controller.b(new com.ironsource.sdk.controller.v.r()), sVar);
    }

    @Override // com.json.sdk.controller.l
    public void a() {
        if (this.W) {
            this.V.a();
            return;
        }
        this.B.a(new com.json.bh());
        if (this.B.k()) {
            a(1);
        }
    }

    public void a(int i2) {
        if (!this.W && !this.B.m()) {
            com.json.sdk.utils.Logger.i(this.c, "load(): Mobile Controller HTML Does not exist");
            return;
        }
        org.json.JSONObject controllerConfigAsJSONObject = com.json.sdk.utils.SDKUtils.getControllerConfigAsJSONObject();
        java.lang.String strD = d(controllerConfigAsJSONObject);
        java.util.Map<java.lang.String, java.lang.String> initSDKParams = com.json.sdk.utils.SDKUtils.getInitSDKParams();
        if (initSDKParams != null && initSDKParams.containsKey("sessionid")) {
            strD = java.lang.String.format("%s&sessionid=%s", strD, initSDKParams.get("sessionid"));
        }
        this.f3355a.d(new com.ironsource.sdk.controller.v.h(controllerConfigAsJSONObject, this.Z, (this.W ? this.V.getHtmlFile() : this.B.g()).toURI().toString() + "?" + strD));
        this.m = new com.ironsource.sdk.controller.v.i(50000L, 1000L, i2).start();
    }

    @Override // com.json.sdk.controller.l
    public void a(android.app.Activity activity) {
        this.Y.a(activity);
    }

    @Override // com.json.sdk.controller.l
    public void a(android.content.Context context) {
        a(new com.ironsource.sdk.controller.v.d(context));
    }

    @Override // com.json.lo
    public void a(com.json.ih ihVar) {
        if (this.W && this.V.a(ihVar)) {
            a(1);
        } else if (ihVar.getName().contains(com.json.y8.f)) {
            this.B.a(new com.ironsource.sdk.controller.v.n());
        } else {
            c(ihVar.getName(), ihVar.getParent());
        }
    }

    @Override // com.json.lo
    public void a(com.json.ih ihVar, com.json.ah ahVar) {
        if (this.W && this.V.a(ihVar)) {
            this.Q.b("controller html - failed to download - " + ahVar.b());
        } else if (ihVar.getName().contains(com.json.y8.f)) {
            this.B.a(new com.ironsource.sdk.controller.v.a(), new com.ironsource.sdk.controller.v.b(ahVar));
        } else {
            b(ihVar.getName(), ihVar.getParent(), ahVar.b());
        }
    }

    public void a(com.json.jv jvVar) {
        this.C = jvVar;
    }

    public void a(com.json.oo ooVar) {
        this.a0 = ooVar;
        this.Z.a(ooVar);
    }

    public void a(com.json.p3 p3Var) {
        this.N = p3Var;
    }

    @Override // com.json.sdk.controller.l
    public void a(com.json.sa saVar) {
        java.util.Map<java.lang.String, java.lang.String> mapB = saVar.b();
        if (mapB != null) {
            i(a(com.ironsource.y8.g.R, com.json.sdk.utils.SDKUtils.flatMapToJsonAsString(mapB), com.ironsource.y8.g.O, com.ironsource.y8.g.P));
        }
        this.G.b(com.ironsource.zg.e.Banner, saVar.h());
    }

    @Override // com.json.sdk.controller.l
    public void a(com.json.sa saVar, java.util.Map<java.lang.String, java.lang.String> map, com.json.q9 q9Var) {
        java.util.Map<java.lang.String, java.lang.String> mapMergeHashMaps = com.json.sdk.utils.SDKUtils.mergeHashMaps(new java.util.Map[]{map, saVar.b()});
        if (map != null) {
            i(a(com.ironsource.y8.g.M, com.json.sdk.utils.SDKUtils.flatMapToJsonAsString(mapMergeHashMaps), com.ironsource.y8.g.N, com.ironsource.y8.g.Q));
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(com.json.sa saVar, java.util.Map<java.lang.String, java.lang.String> map, com.json.r9 r9Var) {
        i(a(com.ironsource.zg.e.Interstitial, new org.json.JSONObject(com.json.sdk.utils.SDKUtils.mergeHashMaps(new java.util.Map[]{map, saVar.b()}))));
    }

    public void a(com.json.sdk.controller.a aVar) {
        this.L = aVar;
        aVar.a(p());
    }

    @Override // com.json.sdk.controller.l
    public void a(com.ironsource.sdk.controller.f.c cVar, com.ironsource.sdk.controller.l.a aVar) {
        i(a(cVar.e(), cVar.h(), com.ironsource.y8.g.T, com.ironsource.y8.g.T));
    }

    public void a(com.json.sdk.controller.i iVar) {
        this.K = iVar;
    }

    public void a(com.json.sdk.controller.j jVar) {
        this.M = jVar;
    }

    public void a(com.json.sdk.controller.o oVar) {
        this.H = oVar;
    }

    public void a(com.json.sdk.controller.q qVar) {
        this.I = qVar;
    }

    public void a(com.json.sdk.controller.u uVar) {
        this.J = uVar;
    }

    public void a(com.ironsource.sdk.controller.v.u uVar) {
        this.v = uVar;
    }

    public void a(com.json.v9 v9Var) {
        this.O = v9Var;
    }

    public void a(com.json.x2 x2Var) {
        java.lang.String strB;
        com.json.p9 p9VarA;
        synchronized (this.E) {
            if (x2Var.j() && this.i) {
                android.util.Log.d(this.c, "restoreState(state:" + x2Var + ")");
                int iC = x2Var.c();
                if (iC != -1) {
                    com.ironsource.zg.e eVar = com.ironsource.zg.e.RewardedVideo;
                    if (iC == eVar.ordinal()) {
                        android.util.Log.d(this.c, "onRVAdClosed()");
                        strB = x2Var.b();
                        p9VarA = a(eVar);
                        if (p9VarA != null && !android.text.TextUtils.isEmpty(strB)) {
                            p9VarA.a(eVar, strB);
                        }
                    } else {
                        eVar = com.ironsource.zg.e.Interstitial;
                        if (iC == eVar.ordinal()) {
                            android.util.Log.d(this.c, "onInterstitialAdClosed()");
                            strB = x2Var.b();
                            p9VarA = a(eVar);
                            if (p9VarA != null && !android.text.TextUtils.isEmpty(strB)) {
                                p9VarA.a(eVar, strB);
                            }
                        }
                    }
                    x2Var.a(-1);
                    x2Var.f(null);
                } else {
                    android.util.Log.d(this.c, "No ad was opened");
                }
                java.lang.String strD = x2Var.d();
                java.lang.String strF = x2Var.f();
                for (com.json.sa saVar : this.G.a(com.ironsource.zg.e.Interstitial)) {
                    if (saVar.e() == 2) {
                        android.util.Log.d(this.c, "initInterstitial(appKey:" + strD + ", userId:" + strF + ", demandSource:" + saVar.f() + ")");
                        a(strD, strF, saVar, this.y);
                    }
                }
                java.lang.String strG = x2Var.g();
                java.lang.String strH = x2Var.h();
                for (com.json.sa saVar2 : this.G.a(com.ironsource.zg.e.RewardedVideo)) {
                    if (saVar2.e() == 2) {
                        java.lang.String strF2 = saVar2.f();
                        android.util.Log.d(this.c, "onRVNoMoreOffers()");
                        this.x.c(strF2);
                        android.util.Log.d(this.c, "initRewardedVideo(appKey:" + strG + ", userId:" + strH + ", demandSource:" + strF2 + ")");
                        a(strG, strH, saVar2, this.x);
                    }
                }
                x2Var.a(false);
            }
            this.D = x2Var;
        }
    }

    void a(com.ironsource.zg.e eVar, java.lang.String str) {
        b(new com.ironsource.sdk.controller.v.e(eVar, str));
    }

    void a(java.lang.Runnable runnable) {
        com.json.cg cgVar = this.f3355a;
        if (cgVar != null) {
            cgVar.b(runnable);
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(java.lang.String str, com.json.r9 r9Var) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("demandSourceName", str);
        java.lang.String strFlatMapToJsonAsString = com.json.sdk.utils.SDKUtils.flatMapToJsonAsString(map);
        this.D.d(str, true);
        i(a(com.ironsource.y8.g.D, strFlatMapToJsonAsString, com.ironsource.y8.g.E, com.ironsource.y8.g.F));
    }

    @Override // com.json.sdk.controller.l
    public void a(java.lang.String str, java.lang.String str2, com.json.sa saVar, com.json.q9 q9Var) {
        this.f = str;
        this.g = str2;
        this.z = q9Var;
        a(str, com.ironsource.zg.e.Banner, saVar, new com.ironsource.sdk.controller.v.l());
    }

    @Override // com.json.sdk.controller.l
    public void a(java.lang.String str, java.lang.String str2, com.json.sa saVar, com.json.r9 r9Var) {
        this.f = str;
        this.g = str2;
        this.y = r9Var;
        this.D.g(str);
        this.D.h(this.g);
        a(this.f, com.ironsource.zg.e.Interstitial, saVar, new com.ironsource.sdk.controller.v.k());
    }

    @Override // com.json.sdk.controller.l
    public void a(java.lang.String str, java.lang.String str2, com.json.sa saVar, com.json.s9 s9Var) {
        this.f = str;
        this.g = str2;
        this.x = s9Var;
        this.D.i(str);
        this.D.j(str2);
        a(str, com.ironsource.zg.e.RewardedVideo, saVar, new com.ironsource.sdk.controller.v.j());
    }

    @Override // com.json.sdk.controller.l
    public void a(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            this.S = jSONObject;
        }
    }

    @Override // com.json.sdk.controller.l
    public void a(org.json.JSONObject jSONObject, com.json.q9 q9Var) {
        i(a(com.ironsource.y8.g.M, jSONObject.toString(), com.ironsource.y8.g.N, com.ironsource.y8.g.Q));
    }

    @Override // com.json.sdk.controller.l
    public void a(org.json.JSONObject jSONObject, com.json.r9 r9Var) {
        i(a(com.ironsource.zg.e.Interstitial, jSONObject));
    }

    @Override // com.json.sdk.controller.l
    public void a(org.json.JSONObject jSONObject, com.json.s9 s9Var) {
        i(a(com.ironsource.zg.e.RewardedVideo, jSONObject));
    }

    public void a(boolean z, java.lang.String str) {
        i(e(com.ironsource.y8.g.U, a(com.ironsource.y8.h.K, str, null, null, null, null, null, null, com.ironsource.y8.h.o, z)));
    }

    @Override // com.json.sdk.controller.l
    public boolean a(java.lang.String str) {
        com.json.sa saVarA = this.G.a(com.ironsource.zg.e.Interstitial, str);
        return saVarA != null && saVarA.d();
    }

    com.json.sdk.controller.r b(com.json.sdk.controller.s sVar) {
        return new com.json.sdk.controller.r(sVar);
    }

    public void b(int i2) {
        c0 = i2;
    }

    @Override // com.json.sdk.controller.l
    public void b(android.content.Context context) {
        a(new com.ironsource.sdk.controller.v.c(context));
    }

    @Override // com.json.sdk.controller.l
    public void b(com.json.sa saVar) {
        java.util.Map<java.lang.String, java.lang.String> mapB = saVar.b();
        if (mapB != null) {
            i(e(com.ironsource.y8.g.S, com.json.sdk.utils.SDKUtils.flatMapToJsonAsString(mapB)));
        }
        this.G.b(com.ironsource.zg.e.Interstitial, saVar.h());
    }

    @Override // com.json.sdk.controller.l
    public void b(com.json.sa saVar, java.util.Map<java.lang.String, java.lang.String> map, com.json.r9 r9Var) {
        a(saVar, map);
    }

    void b(java.lang.Runnable runnable) {
        com.json.cg cgVar = this.f3355a;
        if (cgVar != null) {
            cgVar.c(runnable);
        }
    }

    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            i(e(com.ironsource.y8.g.p, a(com.ironsource.y8.h.b, str, "path", b(str2), "errMsg", str3, null, null, null, false)));
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
        }
    }

    @Override // com.json.sdk.controller.l
    public void b(org.json.JSONObject jSONObject) {
        i(e(com.ironsource.y8.g.d0, jSONObject != null ? jSONObject.toString() : null));
    }

    void c(java.lang.Runnable runnable) {
        com.json.cg cgVar = this.f3355a;
        if (cgVar != null) {
            cgVar.d(runnable);
        }
    }

    public void c(java.lang.String str) {
        if (str.equals(com.ironsource.y8.h.i)) {
            o();
        }
        i(e(com.ironsource.y8.g.y, a("action", str, null, null, null, null, null, null, null, false)));
    }

    public void c(java.lang.String str, java.lang.String str2) {
        try {
            i(e(com.ironsource.y8.g.o, a(com.ironsource.y8.h.b, str, "path", b(str2), null, null, null, null, null, false)));
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            b(str, str2, e2.getMessage());
        }
    }

    @Override // com.json.sdk.controller.l
    public void d() {
        i(f(com.ironsource.y8.g.s));
    }

    public void d(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = com.ironsource.y8.c.z;
        }
        i(e(com.ironsource.y8.g.Z, a("errMsg", str, "url", str2, null, null, null, null, null, false)));
    }

    @Override // com.json.sdk.controller.l
    public void destroy() {
        this.Z.destroy();
        com.json.db dbVar = this.h;
        if (dbVar != null) {
            dbVar.d();
        }
        com.json.s8 s8Var = this.R;
        if (s8Var != null) {
            s8Var.b();
        }
        android.os.CountDownTimer countDownTimer = this.m;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // com.json.sdk.controller.l
    public void e() {
        a(this.D);
    }

    public void e(org.json.JSONObject jSONObject) {
        com.json.sdk.utils.Logger.i(this.c, "device connection info changed: " + jSONObject.toString());
        i(e(com.ironsource.y8.g.x, a(com.ironsource.y8.i.h0, jSONObject.toString(), null, null, null, null, null, null, null, false)));
    }

    @Override // com.json.sdk.controller.l
    public void f() {
        i(f(com.ironsource.y8.g.t));
    }

    @Override // com.json.sdk.controller.l
    public com.ironsource.zg.c g() {
        return com.ironsource.zg.c.Web;
    }

    public void g(java.lang.String str, java.lang.String str2) {
        i(e(com.ironsource.y8.g.V, a(com.ironsource.y8.h.p, str2, com.ironsource.y8.h.m, str, null, null, null, null, null, false)));
    }

    public boolean h(java.lang.String str) {
        try {
            if (!new com.json.ds(str, com.json.dk.e().d(), com.json.sdk.controller.FeaturesManager.getInstance().getFeatureFlagClickCheck().c()).a()) {
                return false;
            }
            com.json.cv.a(q(), str);
            return true;
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            return false;
        }
    }

    public void k(java.lang.String str) {
        i(e(com.ironsource.y8.g.v, a("action", str, null, null, null, null, null, null, null, false)));
    }

    public void m(java.lang.String str) {
        try {
            java.lang.String strD = com.json.v8.d(this.Y.a());
            com.json.sdk.utils.Logger.i(this.c, "device status changed, connection type " + str);
            com.json.eh.a(str);
            com.json.eh.b(strD);
            i(e(com.ironsource.y8.g.w, a(com.ironsource.y8.i.t, str, com.ironsource.y8.i.u, strD, null, null, null, null, null, false)));
        } catch (java.lang.Exception e2) {
            com.json.l9.d().a(e2);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("Exception: " + android.util.Log.getStackTraceString(e2));
        }
    }

    public void n(java.lang.String str) {
        this.w = str;
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j2) {
        com.json.sdk.utils.Logger.i(this.c, str + " " + str4);
    }

    public com.json.fw p() {
        if (this.P == null) {
            this.P = new com.ironsource.sdk.controller.v.g();
        }
        return this.P;
    }

    public android.content.Context q() {
        return this.Y.a();
    }

    public int r() {
        return c0;
    }

    public android.widget.FrameLayout s() {
        return this.u;
    }

    public java.lang.String t() {
        return this.w;
    }

    public com.json.x2 u() {
        return this.D;
    }

    public com.ironsource.sdk.controller.v.u v() {
        return this.v;
    }

    public void w() {
        if (this.j == null) {
            return;
        }
        o();
        com.ironsource.zg.e eVarB = this.j.b();
        java.lang.String strA = this.j.a();
        if (q(eVarB.toString())) {
            a(eVarB, strA);
        }
    }

    public void x() {
        this.q.onHideCustomView();
    }

    public boolean y() {
        return this.r != null;
    }

    public void z() {
        i(f(com.ironsource.y8.g.Y));
    }
}
