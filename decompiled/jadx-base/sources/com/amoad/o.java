package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class o extends android.webkit.WebView {
    private static final java.util.Map<java.lang.String, java.lang.String> k = new java.util.HashMap();
    private static com.amoad.c l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.amoad.o.c f324a;
    final java.lang.Object b;
    java.lang.String c;
    java.lang.String d;
    boolean e;
    boolean f;
    com.amoad.ResultListener g;
    android.os.Handler h;
    java.lang.String i;
    android.net.Uri j;
    private boolean m;
    private boolean n;
    private android.os.Handler o;
    private android.content.Context p;
    private com.amoad.a q;
    private final android.webkit.WebViewClient r;
    private android.webkit.WebChromeClient s;

    class a {
        a() {
        }

        @android.webkit.JavascriptInterface
        public final java.lang.String get(java.lang.String[] strArr) {
            java.lang.Object objE;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.lang.String str : strArr) {
                if ("app_id".equals(str)) {
                    objE = com.amoad.o.this.p.getPackageName();
                } else if ("app_version_code".equals(str)) {
                    objE = java.lang.Integer.valueOf(com.amoad.o.d(com.amoad.o.this.p));
                } else {
                    if ("app_version_name".equals(str)) {
                        objE = com.amoad.o.e(com.amoad.o.this.p);
                    }
                }
                com.amoad.o.b(jSONObject, str, objE);
            }
            return jSONObject.toString();
        }

        @android.webkit.JavascriptInterface
        public final void open(java.lang.String str) {
            com.amoad.AMoAdLogger.getInstance().d("bridge:".concat(java.lang.String.valueOf(str)));
            android.net.Uri uri = android.net.Uri.parse(str);
            if (str.startsWith("amoad://webview/test")) {
                com.amoad.o.a(2, com.amoad.o.a(uri));
                return;
            }
            if (str.startsWith("amoad://webview/log")) {
                com.amoad.o.a(3, com.amoad.o.a(uri));
                return;
            }
            if (str.startsWith("amoad://webview/trace")) {
                com.amoad.o.a(4, com.amoad.o.a(uri));
                return;
            }
            if (str.startsWith("amoad://webview/error")) {
                com.amoad.o.a(5, com.amoad.o.a(uri));
            } else if (str.startsWith("amoad://webview/request")) {
                com.amoad.o.a(com.amoad.o.this, uri);
            } else {
                str.startsWith("amoad://webview/app-del");
            }
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.amoad.Result f333a;
        org.json.JSONObject b;

        b(com.amoad.Result result, org.json.JSONObject jSONObject) {
            this.f333a = result;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.amoad.o.this.g != null) {
                com.amoad.o.this.g.onResult(com.amoad.o.this.c, com.amoad.o.this.d, this.f333a, this.b);
            }
        }
    }

    class c {
        c() {
        }

        final void a() {
            com.amoad.o.this.loadUrl("javascript:window.amoad.reloadCheckAd();");
        }
    }

    class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f335a;

        d(int i) {
            this.f335a = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            android.os.Handler handler;
            int i;
            synchronized (com.amoad.o.this.b) {
                if (!com.amoad.o.this.e) {
                    com.amoad.o.this.a();
                    if (com.amoad.o.this.f) {
                        handler = com.amoad.o.this.h;
                        i = this.f335a;
                        handler.postDelayed(this, i);
                    }
                } else if (com.amoad.o.this.f) {
                    com.amoad.o.this.f324a.a();
                    handler = com.amoad.o.this.h;
                    i = this.f335a;
                    handler.postDelayed(this, i);
                }
            }
        }
    }

    public o(android.content.Context context) {
        super(context);
        this.f324a = new com.amoad.o.c();
        this.b = new java.lang.Object();
        this.q = null;
        android.webkit.WebViewClient webViewClient = new android.webkit.WebViewClient() { // from class: com.amoad.o.5
            @Override // android.webkit.WebViewClient
            public final void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
                super.onLoadResource(webView, str);
                com.amoad.AMoAdLogger.getInstance().d("onLoadResource()".concat(java.lang.String.valueOf(str)));
            }

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
                com.amoad.AMoAdLogger.getInstance().d("onPageFinished()".concat(java.lang.String.valueOf(str)));
                if (com.amoad.o.this.m) {
                    return;
                }
                com.amoad.o.k(com.amoad.o.this);
                com.amoad.o.this.o.postDelayed(com.amoad.o.this.new b(com.amoad.Result.Failure, com.amoad.o.d(java.lang.String.format("{\"error\":\"%s\"}", "html load timeout"))), 30000L);
                com.amoad.o.c cVar = com.amoad.o.this.f324a;
                com.amoad.o.this.loadUrl(java.lang.String.format("javascript:window.amoad.initLoadCheckAd('%s', '%s', %s, '%s', '%s', '%s', %s);", com.amoad.o.l.b, com.amoad.o.l.f299a, java.lang.Boolean.valueOf(com.amoad.o.l.c), com.amoad.o.this.c, com.amoad.o.this.d, com.amoad.AMoAdBuildConfig.SDK_VERSION, com.amoad.o.this.i));
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
                com.amoad.AMoAdLogger.getInstance().d("onReceivedError()" + str + ":" + str2);
                com.amoad.o.m(com.amoad.o.this);
                com.amoad.o.this.o.post(com.amoad.o.this.new b(com.amoad.Result.Failure, com.amoad.o.d(java.lang.String.format("{\"error\":\"%s\"}", str))));
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
                com.amoad.AMoAdLogger.getInstance().d("shouldOverrideUrlLoading()".concat(java.lang.String.valueOf(str)));
                com.amoad.o.this.loadUrl("javascript:window.amoad.checkClicked();");
                com.amoad.o.a(com.amoad.o.this.p, android.net.Uri.parse(com.amoad.l.a(str, com.amoad.o.this.q, new android.util.Size(com.amoad.o.super.getMeasuredWidth(), com.amoad.o.super.getMeasuredHeight()))));
                return true;
            }
        };
        this.r = webViewClient;
        this.s = new android.webkit.WebChromeClient() { // from class: com.amoad.o.6
            @Override // android.webkit.WebChromeClient
            public final boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
                com.amoad.AMoAdLogger.getInstance().d("onConsoleMessage()" + consoleMessage.message());
                return super.onConsoleMessage(consoleMessage);
            }
        };
        this.p = getContext();
        this.o = new android.os.Handler();
        this.h = new android.os.Handler();
        android.webkit.WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAppCacheEnabled(true);
        settings.setCacheMode(-1);
        setBackgroundColor(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.amoad.o.3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    com.amoad.o.this.q = new com.amoad.a(motionEvent.getX(), motionEvent.getY());
                }
                return motionEvent.getAction() == 2;
            }
        });
        addJavascriptInterface(new com.amoad.o.a(), "android");
        setWebViewClient(webViewClient);
        setWebChromeClient(this.s);
    }

    static /* synthetic */ java.lang.String a(android.net.Uri uri) {
        return java.lang.String.format("{\"description\":\"%s\", \"sid\":\"%s\", \"tag\":\"%s\"}", a(uri, "description"), uri.getQueryParameter("sid"), uri.getQueryParameter("tag"));
    }

    private static java.lang.String a(android.net.Uri uri, java.lang.String str) {
        return com.amoad.l.b(uri.getQueryParameter(str), com.adjust.sdk.Constants.ENCODING);
    }

    static /* synthetic */ void a(int i, java.lang.String str) {
        if (i == 2) {
            com.amoad.AMoAdLogger.getInstance().v(str);
            return;
        }
        if (i == 3) {
            com.amoad.AMoAdLogger.getInstance().d(str);
        } else if (i == 4) {
            com.amoad.AMoAdLogger.getInstance().i(str);
        } else {
            if (i != 5) {
                return;
            }
            com.amoad.AMoAdLogger.getInstance().w(str);
        }
    }

    static /* synthetic */ void a(android.content.Context context, android.net.Uri uri) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", uri);
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        try {
            context.startActivity(intent);
        } catch (android.content.ActivityNotFoundException e) {
            com.amoad.AMoAdLogger.getInstance().e(e);
        }
    }

    static /* synthetic */ void a(com.amoad.o oVar, android.net.Uri uri) {
        java.lang.String queryParameter = uri.getQueryParameter("result");
        if ("retry".equals(queryParameter)) {
            com.amoad.o.c cVar = oVar.f324a;
            com.amoad.o.this.loadUrl(java.lang.String.format("javascript:window.amoad.checkResult('%s');", com.amoad.o.this.c));
            return;
        }
        org.json.JSONObject jSONObjectD = d(a(uri, "info"));
        if ("success".equals(queryParameter)) {
            oVar.n = true;
            oVar.o.removeCallbacksAndMessages(null);
            oVar.o.post(oVar.new b(com.amoad.Result.Success, jSONObjectD));
        } else if ("empty".equals(queryParameter)) {
            oVar.n = false;
            oVar.o.removeCallbacksAndMessages(null);
            oVar.o.post(oVar.new b(com.amoad.Result.Empty, jSONObjectD));
        } else if ("failure".equals(queryParameter)) {
            oVar.n = false;
            oVar.o.removeCallbacksAndMessages(null);
            oVar.o.post(oVar.new b(com.amoad.Result.Failure, jSONObjectD));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static org.json.JSONObject b(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (org.json.JSONException e) {
            com.amoad.AMoAdLogger.getInstance().w(e);
        }
        return jSONObject;
    }

    static /* synthetic */ void b(com.amoad.o oVar, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        k.put(oVar.j.toString(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(java.lang.String str) {
        if (str != null) {
            loadDataWithBaseURL(java.lang.String.format("%s://%s/", this.j.getScheme(), this.j.getHost()), str, "text/html", com.adjust.sdk.Constants.ENCODING, null);
        } else {
            this.o.post(new com.amoad.o.b(com.amoad.Result.Failure, d(java.lang.String.format("{\"error\":\"%s\"}", "html download failure"))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            com.amoad.AMoAdLogger.getInstance().w(e);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static org.json.JSONObject d(java.lang.String str) {
        try {
            return new org.json.JSONObject(str);
        } catch (org.json.JSONException unused) {
            return new org.json.JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String e(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            com.amoad.AMoAdLogger.getInstance().w(e);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String e(java.lang.String str) throws java.lang.Throwable {
        java.io.InputStreamReader inputStreamReader;
        java.lang.Throwable th;
        java.net.HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
            try {
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setReadTimeout(com.amoad.Native.f171a);
                httpURLConnection.setConnectTimeout(com.amoad.Native.f171a);
                httpURLConnection.connect();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                char[] cArr = new char[1024];
                inputStreamReader = new java.io.InputStreamReader(httpURLConnection.getInputStream());
                while (true) {
                    try {
                        int i = inputStreamReader.read(cArr);
                        if (i == -1) {
                            break;
                        }
                        sb.append(cArr, 0, i);
                    } catch (java.io.IOException unused) {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        if (inputStreamReader != null) {
                            try {
                                inputStreamReader.close();
                            } catch (java.io.IOException unused2) {
                            }
                        }
                        return null;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        if (inputStreamReader != null) {
                            try {
                                inputStreamReader.close();
                            } catch (java.io.IOException unused3) {
                            }
                        }
                        throw th;
                    }
                }
                java.lang.String string = sb.toString();
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                try {
                    inputStreamReader.close();
                } catch (java.io.IOException unused4) {
                }
                return string;
            } catch (java.io.IOException unused5) {
                inputStreamReader = null;
            } catch (java.lang.Throwable th3) {
                inputStreamReader = null;
                th = th3;
            }
        } catch (java.io.IOException unused6) {
            httpURLConnection = null;
            inputStreamReader = null;
        } catch (java.lang.Throwable th4) {
            inputStreamReader = null;
            th = th4;
            httpURLConnection = null;
        }
    }

    static /* synthetic */ boolean k(com.amoad.o oVar) {
        oVar.e = true;
        return true;
    }

    static /* synthetic */ boolean m(com.amoad.o oVar) {
        oVar.m = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.e = false;
        this.m = false;
        java.lang.String str = k.get(this.j.toString());
        if (android.text.TextUtils.isEmpty(str)) {
            com.amoad.bc.b(new java.lang.Runnable() { // from class: com.amoad.o.7
                @Override // java.lang.Runnable
                public final void run() throws java.lang.Throwable {
                    java.lang.String strE = com.amoad.o.e(com.amoad.o.this.j.toString());
                    com.amoad.o.b(com.amoad.o.this, strE);
                    com.amoad.o.this.c(strE);
                }
            });
        } else {
            c(str);
        }
    }

    @Override // android.webkit.WebView
    public final void loadDataWithBaseURL(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final java.lang.String str5) {
        com.amoad.bc.a(this.p, new java.lang.Runnable() { // from class: com.amoad.o.2
            @Override // java.lang.Runnable
            public final void run() {
                com.amoad.AMoAdLogger.getInstance().d("loadDataWithBaseURL()" + str);
                com.amoad.o.super.loadDataWithBaseURL(str, str2, str3, str4, str5);
            }
        });
    }

    @Override // android.webkit.WebView
    public final void loadUrl(final java.lang.String str) {
        com.amoad.bc.a(this.p, new java.lang.Runnable() { // from class: com.amoad.o.1
            @Override // java.lang.Runnable
            public final void run() {
                com.amoad.AMoAdLogger.getInstance().d("bridge:" + str);
                com.amoad.o.super.loadUrl(str);
            }
        });
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.n) {
            this.n = false;
            com.amoad.o.this.loadUrl("javascript:window.amoad.sendImp();");
        }
    }
}
