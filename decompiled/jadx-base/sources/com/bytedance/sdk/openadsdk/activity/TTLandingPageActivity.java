package com.bytedance.sdk.openadsdk.activity;

/* JADX INFO: loaded from: classes4.dex */
public class TTLandingPageActivity extends com.bytedance.sdk.openadsdk.activity.TTBaseActivity {
    private int DDQ;
    private com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr Fy;
    com.bytedance.sdk.openadsdk.common.Lq IL;
    private android.widget.ImageView Kg;
    private java.lang.String LZ;
    private java.lang.String Lq;
    private android.widget.Button PX;
    private com.bytedance.sdk.openadsdk.core.zx.ldr Ta;
    private int Uw;
    private com.bytedance.sdk.openadsdk.common.yDt VB;
    private com.bytedance.sdk.openadsdk.utils.VB VJ;
    private boolean VW;
    private java.lang.String VzQ;
    private android.widget.TextView WR;
    private com.bytedance.sdk.openadsdk.core.widget.bg.zx ZQc;
    private com.bytedance.sdk.openadsdk.common.PX aGH;
    private com.bytedance.sdk.openadsdk.common.eqN ayS;
    com.bytedance.sdk.openadsdk.common.TTAdDislikeToast bX;
    com.bytedance.sdk.openadsdk.eqN.VB bg;
    private com.bytedance.sdk.openadsdk.core.widget.bg.ldr.bg daV;
    private android.content.Context eo;
    private com.bykv.vk.openvk.preload.falconx.loader.ILoader kMt;
    private com.bytedance.sdk.component.WR.eqN ldr;
    private java.lang.String rri;
    private com.bytedance.sdk.openadsdk.core.model.tuV tuV;
    private com.bytedance.sdk.openadsdk.core.aGH vb;
    private int xxp;
    private java.lang.String yDt;
    private final java.util.concurrent.atomic.AtomicBoolean tC = new java.util.concurrent.atomic.AtomicBoolean(true);
    private final java.util.concurrent.atomic.AtomicInteger JAA = new java.util.concurrent.atomic.AtomicInteger(0);
    private final java.util.concurrent.atomic.AtomicInteger Ja = new java.util.concurrent.atomic.AtomicInteger(0);
    private final java.util.concurrent.atomic.AtomicInteger Uq = new java.util.concurrent.atomic.AtomicInteger(0);
    final java.util.concurrent.atomic.AtomicBoolean eqN = new java.util.concurrent.atomic.AtomicBoolean(false);
    final java.util.concurrent.atomic.AtomicBoolean zx = new java.util.concurrent.atomic.AtomicBoolean(false);
    private java.lang.String LKE = "ダウンロード";

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        bg(3);
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.yDt.zx()) {
            finish();
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.VzQ.IL(this);
        } catch (java.lang.Throwable unused) {
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            setContentView(IL());
            android.content.Intent intent = getIntent();
            int intExtra = intent.getIntExtra("sdk_version", 1);
            this.yDt = intent.getStringExtra("adid");
            this.Lq = intent.getStringExtra("log_extra");
            this.xxp = intent.getIntExtra("source", -1);
            java.lang.String stringExtra = intent.getStringExtra("url");
            this.LZ = stringExtra;
            IL(4);
            java.lang.String stringExtra2 = intent.getStringExtra("web_title");
            this.VzQ = intent.getStringExtra("event_tag");
            this.rri = intent.getStringExtra("gecko_id");
            if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                java.lang.String stringExtra3 = intent.getStringExtra(com.bytedance.sdk.openadsdk.TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra3 != null) {
                    try {
                        this.tuV = com.bytedance.sdk.openadsdk.core.IL.bg(new org.json.JSONObject(stringExtra3));
                    } catch (java.lang.Exception e) {
                        com.bytedance.sdk.component.utils.PX.bg("TTAD.LandingPageAct", "TTLandingPageActivity - onCreate MultiGlobalInfo : ", e);
                    }
                }
            } else {
                this.tuV = com.bytedance.sdk.openadsdk.core.JAA.bg().IL();
                com.bytedance.sdk.openadsdk.core.JAA.bg().ldr();
            }
            if (this.tuV == null) {
                finish();
                return;
            }
            zx();
            if (!android.text.TextUtils.isEmpty(this.rri)) {
                this.kMt = com.bytedance.sdk.openadsdk.iR.IL.bg().IL();
                int iBg = com.bytedance.sdk.openadsdk.iR.IL.bg().bg(this.kMt, this.rri);
                this.Uw = iBg;
                this.DDQ = iBg > 0 ? 2 : 0;
            }
            this.eo = this;
            if (this.ldr != null) {
                com.bytedance.sdk.openadsdk.core.widget.bg.bX.bg(this).bg(false).IL(false).bg(this.ldr.getWebView());
            }
            com.bytedance.sdk.component.WR.eqN eqn = this.ldr;
            if (eqn != null && eqn.getWebView() != null) {
                com.bytedance.sdk.openadsdk.eqN.VB vbBg = new com.bytedance.sdk.openadsdk.eqN.VB(this.tuV, this.ldr.getWebView(), new com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.bg(this.Uw, this.tuV, "landingpage", this), this.DDQ).bg(true);
                this.bg = vbBg;
                this.daV = vbBg.bg;
                this.ayS = com.bytedance.sdk.openadsdk.utils.ayS.bg(this.tuV, this.ldr, this.eo, this.VzQ);
            }
            ldr();
            this.ldr.setLandingPage(true);
            this.ldr.setTag("landingpage");
            this.ldr.setMaterialMeta(this.tuV.mLT());
            com.bytedance.sdk.openadsdk.core.widget.bg.zx zxVar = new com.bytedance.sdk.openadsdk.core.widget.bg.zx(this.eo, this.vb, this.yDt, this.ayS, this.bg, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
                public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
                    super.onPageFinished(webView, str);
                    try {
                        if (com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.Ta != null && !com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.isFinishing()) {
                            com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.Ta.setVisibility(8);
                        }
                    } catch (java.lang.Throwable unused2) {
                    }
                    if (com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.aGH != null) {
                        com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.aGH.IL();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
                public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, java.lang.String str) {
                    try {
                        if (!android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.rri)) {
                            com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.JAA.incrementAndGet();
                            com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel webResourceResponseModelBg = com.bytedance.sdk.openadsdk.iR.IL.bg().bg(com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.kMt, com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.rri, str);
                            if (webResourceResponseModelBg != null && webResourceResponseModelBg.getWebResourceResponse() != null) {
                                com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.Uq.incrementAndGet();
                                return webResourceResponseModelBg.getWebResourceResponse();
                            }
                            if (webResourceResponseModelBg != null && webResourceResponseModelBg.getMsg() == 2) {
                                com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.Ja.incrementAndGet();
                            }
                            return super.shouldInterceptRequest(webView, str);
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (java.lang.Throwable th) {
                        com.bytedance.sdk.component.utils.PX.bg("TTAD.LandingPageAct", "shouldInterceptRequest url error", th);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }
            };
            this.ZQc = zxVar;
            zxVar.bg(this.tuV);
            this.ldr.setWebViewClient(this.ZQc);
            com.bytedance.sdk.component.WR.eqN eqn2 = this.ldr;
            if (eqn2 != null) {
                eqn2.setUserAgentString(com.bytedance.sdk.openadsdk.utils.xxp.bg(eqn2.getWebView(), intExtra));
            }
            com.bytedance.sdk.component.WR.eqN eqn3 = this.ldr;
            if (eqn3 != null) {
                eqn3.setMixedContentMode(0);
            }
            com.bytedance.sdk.openadsdk.eqN.bX.bg(this.tuV, "landingpage", this.DDQ);
            com.bytedance.sdk.openadsdk.utils.tuV.bg(this.ldr, stringExtra);
            this.ldr.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.bg.eqN(this.vb, this.bg, this.ayS) { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.5
                @Override // com.bytedance.sdk.openadsdk.core.widget.bg.eqN, android.webkit.WebChromeClient
                public void onProgressChanged(android.webkit.WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    if (com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.aGH != null) {
                        com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.aGH.bg(i);
                    }
                    if (com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.Ta == null || com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.isFinishing()) {
                        return;
                    }
                    if (i != 100 || !com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.Ta.isShown()) {
                        com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.Ta.setProgress(i);
                    } else {
                        com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.Ta.setVisibility(8);
                    }
                }
            });
            if (this.ldr.getWebView() != null) {
                this.ldr.getWebView().setOnScrollChangeListener(new com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.IL(this.bg));
                this.ldr.getWebView().setOnTouchListener(new com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.bX(this.bg, this.ayS));
            }
            this.ldr.setDownloadListener(new android.webkit.DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.6
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j) {
                    if (com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.Fy != null) {
                        com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.Fy.eqN();
                    }
                }
            });
            android.widget.TextView textView = this.WR;
            if (textView != null) {
                if (android.text.TextUtils.isEmpty(stringExtra2)) {
                    stringExtra2 = com.bytedance.sdk.component.utils.Fy.bg(this, "tt_web_title_default");
                }
                textView.setText(stringExtra2);
            }
            bX();
            com.bytedance.sdk.openadsdk.utils.VB vbBg2 = com.bytedance.sdk.openadsdk.utils.ldr.bg(this, new com.bytedance.sdk.openadsdk.utils.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.7
                @Override // com.bytedance.sdk.openadsdk.utils.ldr.bg
                public void IL() {
                }

                @Override // com.bytedance.sdk.openadsdk.utils.ldr.bg
                public android.view.View bg() {
                    return com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.Kg;
                }
            });
            this.VJ = vbBg2;
            vbBg2.bg(0L);
            com.bytedance.sdk.openadsdk.eqN.bX.bg.bg(android.os.SystemClock.elapsedRealtime() - jElapsedRealtime, this.tuV, "landingpage", this.kMt, this.rri);
        } catch (java.lang.Throwable unused2) {
            finish();
        }
    }

    public static class bg implements com.bytedance.sdk.openadsdk.eqN.eo {
        private final com.bytedance.sdk.openadsdk.core.model.tuV IL;
        private final java.lang.String bX;
        private final int bg;
        private final java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity> eqN;

        public bg(int i, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity tTLandingPageActivity) {
            this.bg = i;
            this.IL = tuv;
            this.bX = str;
            this.eqN = new java.lang.ref.WeakReference<>(tTLandingPageActivity);
        }

        @Override // com.bytedance.sdk.openadsdk.eqN.eo
        public void bg(int i) {
            com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity tTLandingPageActivity = this.eqN.get();
            if (tTLandingPageActivity != null) {
                com.bytedance.sdk.openadsdk.eqN.bX.bg.bg(this.bg, tTLandingPageActivity.Ja.get(), tTLandingPageActivity.Uq.get(), tTLandingPageActivity.JAA.get() - tTLandingPageActivity.Uq.get(), this.IL, this.bX, i);
            }
        }
    }

    private static class IL implements android.view.View.OnScrollChangeListener {
        private final java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.eqN.VB> bg;

        public IL(com.bytedance.sdk.openadsdk.eqN.VB vb) {
            this.bg = new java.lang.ref.WeakReference<>(vb);
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(android.view.View view, int i, int i2, int i3, int i4) {
            com.bytedance.sdk.openadsdk.eqN.VB vb = this.bg.get();
            if (vb != null) {
                vb.IL(i2);
            }
        }
    }

    private static class bX implements android.view.View.OnTouchListener {
        private final java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.common.eqN> IL;
        private final java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.eqN.VB> bg;

        public bX(com.bytedance.sdk.openadsdk.eqN.VB vb, com.bytedance.sdk.openadsdk.common.eqN eqn) {
            this.bg = new java.lang.ref.WeakReference<>(vb);
            this.IL = new java.lang.ref.WeakReference<>(eqn);
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
            com.bytedance.sdk.openadsdk.eqN.VB vb = this.bg.get();
            if (vb != null) {
                vb.bg(motionEvent);
            }
            com.bytedance.sdk.openadsdk.common.eqN eqn = this.IL.get();
            if (eqn == null) {
                return false;
            }
            eqn.bg(motionEvent);
            return false;
        }
    }

    private android.view.View IL() {
        com.bytedance.sdk.openadsdk.core.zx.bX bXVar = new com.bytedance.sdk.openadsdk.core.zx.bX(this);
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            bXVar.setFitsSystemWindows(true);
        }
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar = new com.bytedance.sdk.openadsdk.core.zx.zx(this);
        zxVar.setOrientation(1);
        bXVar.addView(zxVar, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.common.yDt ydt = new com.bytedance.sdk.openadsdk.common.yDt(this, new com.bytedance.sdk.openadsdk.common.yDt.bg() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.8
            @Override // com.bytedance.sdk.openadsdk.common.yDt.bg
            public android.view.View bg(android.content.Context context) {
                return new com.bytedance.sdk.openadsdk.common.eo(context);
            }
        });
        ydt.setId(com.bytedance.sdk.openadsdk.utils.Ta.Ld);
        zxVar.addView(ydt, new android.widget.LinearLayout.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 44.0f)));
        com.bytedance.sdk.openadsdk.core.zx.bX bXVar2 = new com.bytedance.sdk.openadsdk.core.zx.bX(this);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        zxVar.addView(bXVar2, layoutParams);
        com.bytedance.sdk.component.WR.eqN eqn = new com.bytedance.sdk.component.WR.eqN(this);
        eqn.setId(com.bytedance.sdk.openadsdk.utils.Ta.Pae);
        bXVar2.addView(eqn, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.common.yDt ydt2 = new com.bytedance.sdk.openadsdk.common.yDt(this, new com.bytedance.sdk.openadsdk.common.yDt.bg() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.9
            @Override // com.bytedance.sdk.openadsdk.common.yDt.bg
            public android.view.View bg(android.content.Context context) {
                return new com.bytedance.sdk.openadsdk.common.iR(context);
            }
        });
        ydt2.setId(com.bytedance.sdk.openadsdk.utils.Ta.GZ);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 81;
        bXVar2.addView(ydt2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.zx.ldr ldrVar = new com.bytedance.sdk.openadsdk.core.zx.ldr(this, null, android.R.style.Widget.ProgressBar.Horizontal);
        ldrVar.setId(com.bytedance.sdk.openadsdk.utils.Ta.zCS);
        ldrVar.setProgress(1);
        ldrVar.setVisibility(8);
        ldrVar.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.Kg.bg(this, "tt_browser_progress_style"));
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 3.0f));
        layoutParams3.gravity = 49;
        bXVar2.addView(ldrVar, layoutParams3);
        com.bytedance.sdk.openadsdk.common.PX px = new com.bytedance.sdk.openadsdk.common.PX(this);
        px.setId(520093721);
        bXVar.addView(px, new android.widget.FrameLayout.LayoutParams(-1, -1));
        return bXVar;
    }

    private void bg(int i) {
        if (i == 1 || android.os.Build.VERSION.SDK_INT == 26) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT == 27) {
            try {
                setRequestedOrientation(i);
            } catch (java.lang.Throwable unused) {
            }
        } else {
            setRequestedOrientation(i);
        }
    }

    private void bX() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.tuV;
        if (tuv == null || tuv.jz() != 4) {
            return;
        }
        com.bytedance.sdk.openadsdk.common.yDt ydt = this.VB;
        if (ydt != null) {
            ydt.setVisibility(0);
        }
        android.widget.Button button = (android.widget.Button) findViewById(com.bytedance.sdk.openadsdk.utils.Ta.jA);
        this.PX = button;
        if (button != null) {
            bg(eqN());
            if (this.Fy == null) {
                this.Fy = com.bytedance.sdk.openadsdk.VzQ.bg.bg.iR.bg(this, this.tuV, android.text.TextUtils.isEmpty(this.VzQ) ? com.bytedance.sdk.openadsdk.utils.ayS.IL(this.xxp) : this.VzQ);
            }
            com.bytedance.sdk.openadsdk.core.IL.bg bgVar = new com.bytedance.sdk.openadsdk.core.IL.bg(this, this.tuV, this.VzQ, this.xxp);
            bgVar.bg(false);
            this.PX.setOnClickListener(bgVar);
            this.PX.setOnTouchListener(bgVar);
            bgVar.bX(true);
            bgVar.bg(this.Fy);
        }
    }

    private java.lang.String eqN() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.tuV;
        if (tuv != null && !android.text.TextUtils.isEmpty(tuv.zCS())) {
            this.LKE = this.tuV.zCS();
        }
        return this.LKE;
    }

    private void bg(final java.lang.String str) {
        android.widget.Button button;
        if (android.text.TextUtils.isEmpty(str) || (button = this.PX) == null) {
            return;
        }
        button.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.10
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.PX == null || com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.isFinishing()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.PX.setText(str);
            }
        });
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bX();
    }

    private void zx() {
        com.bytedance.sdk.component.WR.eqN eqn = (com.bytedance.sdk.component.WR.eqN) findViewById(com.bytedance.sdk.openadsdk.utils.Ta.Pae);
        this.ldr = eqn;
        com.bytedance.sdk.openadsdk.utils.ayS.bg(this.tuV, eqn);
        this.VB = (com.bytedance.sdk.openadsdk.common.yDt) findViewById(com.bytedance.sdk.openadsdk.utils.Ta.GZ);
        com.bytedance.sdk.openadsdk.common.yDt ydt = (com.bytedance.sdk.openadsdk.common.yDt) findViewById(com.bytedance.sdk.openadsdk.utils.Ta.Ld);
        com.bytedance.sdk.openadsdk.common.PX px = (com.bytedance.sdk.openadsdk.common.PX) findViewById(520093721);
        this.aGH = px;
        if (px != null) {
            px.bg(this.tuV);
            this.aGH.bg();
        }
        if (ydt != null) {
            ydt.setVisibility(0);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(520093720);
        if (imageView != null) {
            imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.11
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    if (com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.ldr != null) {
                        if (com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.daV != null) {
                            com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.daV.bg();
                        }
                        if (com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.ldr.zx()) {
                            com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.ldr.ldr();
                        } else if (com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.iR()) {
                            com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.onBackPressed();
                        } else {
                            com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.finish();
                        }
                    }
                }
            });
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(520093716);
        this.Kg = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.12
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.finish();
                }
            });
        }
        this.WR = (android.widget.TextView) findViewById(com.bytedance.sdk.openadsdk.utils.Ta.xFs);
        com.bytedance.sdk.openadsdk.core.zx.ldr ldrVar = (com.bytedance.sdk.openadsdk.core.zx.ldr) findViewById(com.bytedance.sdk.openadsdk.utils.Ta.zCS);
        this.Ta = ldrVar;
        if (ldrVar != null) {
            ldrVar.setVisibility(0);
        }
        android.view.View viewFindViewById = findViewById(com.bytedance.sdk.openadsdk.utils.Ta.hff);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.bg();
                }
            });
        }
    }

    private void ldr() {
        com.bytedance.sdk.openadsdk.core.aGH agh = new com.bytedance.sdk.openadsdk.core.aGH(this);
        this.vb = agh;
        agh.IL(this.ldr).bX(this.yDt).eqN(this.Lq).bg(this.tuV).IL(this.xxp).bg(this.tuV.ZQc()).zx(this.tuV.PC()).bg(this.ldr).IL("landingpage");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        com.bytedance.sdk.openadsdk.core.aGH agh = this.vb;
        if (agh != null) {
            agh.eo();
        }
        com.bytedance.sdk.openadsdk.eqN.VB vb = this.bg;
        if (vb != null) {
            vb.iR();
        }
        if (!this.VW) {
            this.VW = true;
            bg(4);
        }
        com.bytedance.sdk.openadsdk.utils.VB vb2 = this.VJ;
        if (vb2 != null) {
            vb2.bg();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.eqN.VB vb = this.bg;
        if (vb != null) {
            vb.Kg();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        com.bytedance.sdk.openadsdk.utils.VB vb = this.VJ;
        if (vb != null) {
            vb.IL();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (iR() && !this.tC.getAndSet(true)) {
            Kg();
            IL(0);
        } else {
            try {
                super.onBackPressed();
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.LandingPageAct", "onBackPressed: ", th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean iR() {
        return !android.text.TextUtils.isEmpty(this.LZ) && this.LZ.contains("__luban_sdk");
    }

    private void IL(final int i) {
        if (this.Kg == null || !iR()) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.3
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.Kg, i);
            }
        });
    }

    private void Kg() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.vb.bg("temai_back_event", jSONObject);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        com.bytedance.sdk.component.WR.eqN eqn;
        super.onDestroy();
        com.bytedance.sdk.openadsdk.eqN.VB vb = this.bg;
        if (vb != null && (eqn = this.ldr) != null) {
            vb.bg(eqn);
        }
        try {
            if (getWindow() != null) {
                ((android.view.ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.bytedance.sdk.component.WR.eqN eqn2 = this.ldr;
        if (eqn2 != null) {
            com.bytedance.sdk.openadsdk.core.daV.bg(eqn2.getWebView());
        }
        this.ldr = null;
        com.bytedance.sdk.openadsdk.core.aGH agh = this.vb;
        if (agh != null) {
            agh.VB();
        }
        com.bytedance.sdk.openadsdk.eqN.VB vb2 = this.bg;
        if (vb2 != null) {
            vb2.bX(true);
        }
        if (!android.text.TextUtils.isEmpty(this.rri)) {
            com.bytedance.sdk.openadsdk.eqN.bX.bg.bg(this.Uq.get(), this.JAA.get(), this.tuV);
        }
        com.bytedance.sdk.openadsdk.iR.IL.bg().bg(this.kMt);
        com.bytedance.sdk.openadsdk.utils.VB vb3 = this.VJ;
        if (vb3 != null) {
            vb3.bX();
        }
    }

    protected void bg() {
        if (isFinishing()) {
            return;
        }
        if (this.zx.get()) {
            eo();
            return;
        }
        if (this.IL == null) {
            WR();
        }
        com.bytedance.sdk.openadsdk.common.Lq lq = this.IL;
        if (lq != null) {
            lq.bg();
        }
    }

    private void WR() {
        try {
            if (this.IL == null) {
                com.bytedance.sdk.openadsdk.common.Lq lq = new com.bytedance.sdk.openadsdk.common.Lq(this.eo, this.tuV);
                this.IL = lq;
                lq.setDislikeSource("landing_page");
                this.IL.setCallback(new com.bytedance.sdk.openadsdk.common.Lq.bg() { // from class: com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.4
                    @Override // com.bytedance.sdk.openadsdk.common.Lq.bg
                    public void bg(android.view.View view) {
                        com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.eqN.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.Lq.bg
                    public void IL(android.view.View view) {
                        com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.eqN.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.Lq.bg
                    public void bg(com.bytedance.sdk.openadsdk.FilterWord filterWord) {
                        if (com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.zx.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.zx.set(true);
                        com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.this.VB();
                    }
                });
            }
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(android.R.id.content);
            frameLayout.addView(this.IL);
            if (this.bX == null) {
                com.bytedance.sdk.openadsdk.common.TTAdDislikeToast tTAdDislikeToast = new com.bytedance.sdk.openadsdk.common.TTAdDislikeToast(this.eo);
                this.bX = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.ApmHelper.reportCustomError("initDislike error", "LandingPageActivity", th);
        }
    }

    private void eo() {
        com.bytedance.sdk.openadsdk.common.TTAdDislikeToast tTAdDislikeToast = this.bX;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void VB() {
        com.bytedance.sdk.openadsdk.common.TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.bX) == null) {
            return;
        }
        tTAdDislikeToast.show(com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getDislikeSendTip());
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.bX.bg(this, this.tuV);
    }
}
