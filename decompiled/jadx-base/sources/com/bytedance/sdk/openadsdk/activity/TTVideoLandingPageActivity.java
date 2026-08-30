package com.bytedance.sdk.openadsdk.activity;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TTVideoLandingPageActivity extends com.bytedance.sdk.openadsdk.activity.TTBaseActivity implements com.bytedance.sdk.openadsdk.eo.eqN {
    protected com.bytedance.sdk.openadsdk.multipro.IL.bg CQc;
    protected android.widget.Button DDQ;
    private int GvG;
    protected android.widget.ImageView IL;
    protected android.widget.TextView JAA;
    protected android.widget.TextView Ja;
    protected java.lang.String Kg;
    protected int LKE;
    protected long Lq;
    protected android.widget.FrameLayout PX;
    private com.bykv.vk.openvk.preload.falconx.loader.ILoader RJ;
    protected com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr Uq;
    protected com.bytedance.sdk.openadsdk.common.yDt Uw;
    protected int VB;
    protected java.lang.String VW;
    protected java.lang.String WR;
    protected java.lang.String bN;
    protected android.widget.ImageView bX;
    protected com.bytedance.sdk.component.WR.eqN bg;
    protected com.bytedance.sdk.openadsdk.core.aGH eo;
    protected android.widget.TextView eqN;
    protected com.bytedance.sdk.openadsdk.core.widget.bg.ldr.bg jz;
    protected com.bytedance.sdk.openadsdk.core.widget.bg kMt;
    private int lM;
    protected int ldr;
    protected android.widget.TextView rri;
    protected android.widget.RelativeLayout tC;
    protected com.bytedance.sdk.openadsdk.eqN.VB uu;
    protected com.bytedance.sdk.openadsdk.core.model.tuV vb;
    protected com.bytedance.sdk.openadsdk.core.Ta.IL.ldr yDt;
    protected android.content.Context zx;
    protected int Ta = -1;
    protected int xxp = 0;
    protected int VzQ = 0;
    protected int tuV = 0;
    protected int Fy = 0;
    protected java.lang.String LZ = "ダウンロード";
    protected boolean aGH = false;
    protected boolean VJ = false;
    protected boolean daV = true;
    protected boolean ayS = false;
    protected java.lang.String ZQc = null;
    protected java.util.concurrent.atomic.AtomicBoolean qC = new java.util.concurrent.atomic.AtomicBoolean(true);
    protected org.json.JSONArray Dxa = null;
    private final java.util.concurrent.atomic.AtomicInteger txA = new java.util.concurrent.atomic.AtomicInteger(0);
    private final java.util.concurrent.atomic.AtomicInteger sVc = new java.util.concurrent.atomic.AtomicInteger(0);
    private final java.util.concurrent.atomic.AtomicInteger ApA = new java.util.concurrent.atomic.AtomicInteger(0);
    protected com.bytedance.sdk.openadsdk.core.IL.bg Pae = null;
    private final com.bykv.vk.openvk.bg.bg.bg.eqN.bX.IL gXn = new com.bykv.vk.openvk.bg.bg.bg.eqN.bX.IL() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.11
        @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.IL
        public void bg(boolean z) {
            com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.aGH = z;
            if (com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.isFinishing()) {
                return;
            }
            if (z) {
                com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.bg, 8);
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.PX.getLayoutParams();
                com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.VzQ = marginLayoutParams.leftMargin;
                com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.xxp = marginLayoutParams.topMargin;
                com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.tuV = marginLayoutParams.width;
                com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.Fy = marginLayoutParams.height;
                marginLayoutParams.width = -1;
                marginLayoutParams.height = -1;
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.leftMargin = 0;
                com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.PX.setLayoutParams(marginLayoutParams);
                return;
            }
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.bg, 0);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.PX.getLayoutParams();
            marginLayoutParams2.width = com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.tuV;
            marginLayoutParams2.height = com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.Fy;
            marginLayoutParams2.leftMargin = com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.VzQ;
            marginLayoutParams2.topMargin = com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.xxp;
            com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.PX.setLayoutParams(marginLayoutParams2);
        }
    };
    private final com.bytedance.sdk.component.utils.rri.bg GZ = new com.bytedance.sdk.component.utils.rri.bg() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2
        @Override // com.bytedance.sdk.component.utils.rri.bg
        public void bg(android.content.Context context, android.content.Intent intent, boolean z, final int i) {
            com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2.1
                @Override // java.lang.Runnable
                public void run() {
                    bg(i);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void bg(int i) {
            if (com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.LKE == 0 && i != 0 && com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.bg != null && com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.ZQc != null) {
                com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.bg.a_(com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.ZQc);
            }
            if (com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.yDt != null && com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.yDt.getNativeVideoController() != null && !com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.VJ && com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.LKE != i) {
                ((com.bytedance.sdk.openadsdk.core.Ta.IL.bX) com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.yDt.getNativeVideoController()).bX(i);
            }
            com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.LKE = i;
        }
    };

    protected abstract android.view.View bg();

    protected abstract boolean zx();

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.yDt.zx()) {
            finish();
            return;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            getWindow().addFlags(16777216);
        } catch (java.lang.Throwable unused) {
        }
        try {
            com.bytedance.sdk.openadsdk.core.VzQ.IL(this);
        } catch (java.lang.Throwable unused2) {
        }
        this.LKE = com.bytedance.sdk.component.utils.Lq.bX(getApplicationContext());
        try {
            setContentView(bg());
            this.zx = this;
            android.content.Intent intent = getIntent();
            this.ldr = intent.getIntExtra("sdk_version", 1);
            this.Kg = intent.getStringExtra("adid");
            this.WR = intent.getStringExtra("log_extra");
            this.VB = intent.getIntExtra("source", -1);
            this.ZQc = intent.getStringExtra("url");
            java.lang.String stringExtra = intent.getStringExtra("web_title");
            this.VW = intent.getStringExtra("event_tag");
            this.bN = intent.getStringExtra("gecko_id");
            this.ayS = intent.getBooleanExtra("video_is_auto_play", true);
            if (bundle != null && bundle.getLong("video_play_position") > 0) {
                this.Lq = bundle.getLong("video_play_position", 0L);
            }
            java.lang.String stringExtra2 = intent.getStringExtra(com.bytedance.sdk.openadsdk.TTAdConstant.MULTI_PROCESS_DATA);
            if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                java.lang.String stringExtra3 = intent.getStringExtra(com.bytedance.sdk.openadsdk.TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra3 != null) {
                    try {
                        this.vb = com.bytedance.sdk.openadsdk.core.IL.bg(new org.json.JSONObject(stringExtra3));
                    } catch (java.lang.Exception unused3) {
                    }
                }
                com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.vb;
                if (tuv != null) {
                    this.Ta = tuv.bOf();
                }
            } else {
                com.bytedance.sdk.openadsdk.core.model.tuV tuvIL = com.bytedance.sdk.openadsdk.core.JAA.bg().IL();
                this.vb = tuvIL;
                if (tuvIL != null) {
                    this.Ta = tuvIL.bOf();
                }
                com.bytedance.sdk.openadsdk.core.JAA.bg().ldr();
            }
            if (this.vb == null) {
                finish();
                return;
            }
            if (!android.text.TextUtils.isEmpty(this.bN)) {
                this.RJ = com.bytedance.sdk.openadsdk.iR.IL.bg().IL();
                int iBg = com.bytedance.sdk.openadsdk.iR.IL.bg().bg(this.RJ, this.bN);
                this.GvG = iBg;
                this.lM = iBg > 0 ? 2 : 0;
            }
            if (stringExtra2 != null) {
                try {
                    this.CQc = com.bytedance.sdk.openadsdk.multipro.IL.bg.bg(new org.json.JSONObject(stringExtra2));
                } catch (java.lang.Exception unused4) {
                }
                com.bytedance.sdk.openadsdk.multipro.IL.bg bgVar = this.CQc;
                if (bgVar != null) {
                    this.Lq = bgVar.iR;
                }
            }
            if (bundle != null) {
                java.lang.String string = bundle.getString("material_meta");
                if (this.vb == null) {
                    try {
                        this.vb = com.bytedance.sdk.openadsdk.core.IL.bg(new org.json.JSONObject(string));
                    } catch (java.lang.Throwable unused5) {
                    }
                }
                long j = bundle.getLong("video_play_position");
                if (j > 0) {
                    this.Lq = j;
                }
            }
            bX();
            WR();
            Ta();
            bg(4);
            if (this.bg != null) {
                com.bytedance.sdk.openadsdk.core.widget.bg.bX.bg(this.zx).bg(true).IL(false).bg(this.bg.getWebView());
                com.bytedance.sdk.openadsdk.eqN.VB vbBg = new com.bytedance.sdk.openadsdk.eqN.VB(this.vb, this.bg.getWebView(), new com.bytedance.sdk.openadsdk.eqN.eo() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.1
                    @Override // com.bytedance.sdk.openadsdk.eqN.eo
                    public void bg(int i) {
                        com.bytedance.sdk.openadsdk.eqN.bX.bg.bg(com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.GvG, com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.ApA.get(), com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.sVc.get(), com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.txA.get() - com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.sVc.get(), com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.vb, "landingpage_split_screen", i);
                    }
                }, this.lM).bg(true);
                this.uu = vbBg;
                this.jz = vbBg.bg;
                this.uu.bg("landingpage_split_screen");
            }
            com.bytedance.sdk.component.WR.eqN eqn = this.bg;
            if (eqn != null) {
                eqn.setLandingPage(true);
                this.bg.setTag("landingpage_split_screen");
                this.bg.setMaterialMeta(this.vb.mLT());
                this.bg.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.bg.zx(this.zx, this.eo, this.Kg, this.uu, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.4
                    @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
                    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, java.lang.String str) {
                        try {
                            if (!android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.bN)) {
                                com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.txA.incrementAndGet();
                                com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel webResourceResponseModelBg = com.bytedance.sdk.openadsdk.iR.IL.bg().bg(com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.RJ, com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.bN, str);
                                if (webResourceResponseModelBg != null && webResourceResponseModelBg.getWebResourceResponse() != null) {
                                    com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.sVc.incrementAndGet();
                                    return webResourceResponseModelBg.getWebResourceResponse();
                                }
                                if (webResourceResponseModelBg != null && webResourceResponseModelBg.getMsg() == 2) {
                                    com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.ApA.incrementAndGet();
                                }
                                return super.shouldInterceptRequest(webView, str);
                            }
                            return super.shouldInterceptRequest(webView, str);
                        } catch (java.lang.Throwable th) {
                            com.bytedance.sdk.component.utils.PX.bg("TTVideoLandingPage", "shouldInterceptRequest url error", th);
                            return super.shouldInterceptRequest(webView, str);
                        }
                    }
                });
                com.bytedance.sdk.component.WR.eqN eqn2 = this.bg;
                eqn2.setUserAgentString(com.bytedance.sdk.openadsdk.utils.xxp.bg(eqn2.getWebView(), this.ldr));
            }
            com.bytedance.sdk.component.WR.eqN eqn3 = this.bg;
            if (eqn3 != null) {
                eqn3.setMixedContentMode(0);
            }
            com.bytedance.sdk.openadsdk.eqN.bX.bg(this.vb, "landingpage_split_screen", this.lM);
            com.bytedance.sdk.openadsdk.utils.tuV.bg(this.bg, this.ZQc);
            this.bg.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.bg.eqN(this.eo, this.uu) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.5
                @Override // com.bytedance.sdk.openadsdk.core.widget.bg.eqN, android.webkit.WebChromeClient
                public void onProgressChanged(android.webkit.WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                }
            });
            this.bg.setDownloadListener(new android.webkit.DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.6
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j2) {
                    if (com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.Uq != null) {
                        com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.Uq.eqN();
                    }
                }
            });
            android.widget.TextView textView = this.eqN;
            if (textView != null) {
                if (android.text.TextUtils.isEmpty(stringExtra)) {
                    stringExtra = com.bytedance.sdk.component.utils.Fy.bg(this, "tt_web_title_default");
                }
                textView.setText(stringExtra);
            }
            eo();
            eqN();
            PX();
            com.bytedance.sdk.openadsdk.eqN.bX.bg.bg(android.os.SystemClock.elapsedRealtime() - jElapsedRealtime, this.vb, "landingpage_split_screen", this.RJ, this.bN);
        } catch (java.lang.Throwable unused6) {
            finish();
        }
    }

    private void PX() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.vb;
        if (tuv == null || tuv.jz() != 4) {
            return;
        }
        this.Uw.setVisibility(0);
        android.widget.Button button = (android.widget.Button) findViewById(com.bytedance.sdk.openadsdk.utils.Ta.jA);
        this.DDQ = button;
        if (button != null) {
            bg(IL());
            this.DDQ.setOnClickListener(this.Pae);
            this.DDQ.setOnTouchListener(this.Pae);
        }
    }

    protected java.lang.String IL() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.vb;
        if (tuv != null && !android.text.TextUtils.isEmpty(tuv.zCS())) {
            this.LZ = this.vb.zCS();
        }
        return this.LZ;
    }

    private void bg(final java.lang.String str) {
        android.widget.Button button;
        if (android.text.TextUtils.isEmpty(str) || (button = this.DDQ) == null) {
            return;
        }
        button.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.7
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.DDQ == null || com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.isFinishing()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.DDQ.setText(str);
            }
        });
    }

    protected void bX() {
        this.Uw = (com.bytedance.sdk.openadsdk.common.yDt) findViewById(com.bytedance.sdk.openadsdk.utils.Ta.GZ);
        this.bg = (com.bytedance.sdk.component.WR.eqN) findViewById(com.bytedance.sdk.openadsdk.utils.Ta.Pae);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(520093720);
        this.IL = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    if (com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.bg != null) {
                        if (com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.jz != null) {
                            com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.jz.bg();
                        }
                        if (!com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.bg.zx()) {
                            if (com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.xxp()) {
                                com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.onBackPressed();
                                return;
                            } else {
                                com.bytedance.sdk.openadsdk.eqN.bX.bg(com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.vb, "embeded_ad", "detail_back", com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.ldr(), com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.iR(), (com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.yDt == null || com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.yDt.getNativeVideoController() == null) ? null : com.bytedance.sdk.openadsdk.utils.ayS.bg(com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.vb, com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.yDt.getNativeVideoController().ldr(), com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.yDt.getNativeVideoController().PX()), (com.bytedance.sdk.openadsdk.eqN.iR) null);
                                com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.finish();
                                return;
                            }
                        }
                        com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.bg.ldr();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.Ta.IL.ldr ldrVar = this.yDt;
        if (ldrVar != null) {
            ldrVar.setIsAutoPlay(this.ayS);
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.bytedance.sdk.openadsdk.utils.Ta.CQc);
        this.bX = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.9
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    if (com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.yDt != null) {
                        com.bytedance.sdk.openadsdk.eqN.bX.bg(com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.vb, "embeded_ad", "detail_skip", com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.ldr(), com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.iR(), com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.yDt.getNativeVideoController() != null ? com.bytedance.sdk.openadsdk.utils.ayS.bg(com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.vb, com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.yDt.getNativeVideoController().ldr(), com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.yDt.getNativeVideoController().PX()) : null, (com.bytedance.sdk.openadsdk.eqN.iR) null);
                    }
                    com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.finish();
                }
            });
        }
        this.eqN = (android.widget.TextView) findViewById(com.bytedance.sdk.openadsdk.utils.Ta.xFs);
        this.PX = (android.widget.FrameLayout) findViewById(com.bytedance.sdk.openadsdk.utils.Ta.LKE);
        this.tC = (android.widget.RelativeLayout) findViewById(com.bytedance.sdk.openadsdk.utils.Ta.uu);
        this.rri = (android.widget.TextView) findViewById(com.bytedance.sdk.openadsdk.utils.Ta.Dxa);
        this.JAA = (android.widget.TextView) findViewById(com.bytedance.sdk.openadsdk.utils.Ta.bN);
        this.Ja = (android.widget.TextView) findViewById(com.bytedance.sdk.openadsdk.utils.Ta.jz);
        this.kMt = (com.bytedance.sdk.openadsdk.core.widget.bg) findViewById(com.bytedance.sdk.openadsdk.utils.Ta.qC);
        Kg();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        PX();
    }

    protected void eqN() {
        if (zx()) {
            try {
                com.bytedance.sdk.openadsdk.core.Ta.IL.ldr ldrVar = new com.bytedance.sdk.openadsdk.core.Ta.IL.ldr(this.zx, this.vb, true, null);
                this.yDt = ldrVar;
                if (ldrVar.getNativeVideoController() != null) {
                    this.yDt.getNativeVideoController().bg(false);
                }
                if (this.VJ) {
                    this.PX.setVisibility(0);
                    this.PX.removeAllViews();
                    this.PX.addView(this.yDt);
                    this.yDt.IL(true);
                } else {
                    if (!this.ayS) {
                        this.Lq = 0L;
                    }
                    if (this.CQc != null && this.yDt.getNativeVideoController() != null) {
                        this.yDt.getNativeVideoController().IL(this.CQc.iR);
                        this.yDt.getNativeVideoController().bX(this.CQc.zx);
                        this.yDt.setIsQuiet(com.bytedance.sdk.openadsdk.core.VzQ.eqN().bX(java.lang.String.valueOf(this.vb.IGR())));
                    }
                    if (this.yDt.bg(this.Lq, this.daV, this.VJ)) {
                        this.PX.setVisibility(0);
                        this.PX.removeAllViews();
                        this.PX.addView(this.yDt);
                    }
                    if (this.yDt.getNativeVideoController() != null) {
                        this.yDt.getNativeVideoController().bg(false);
                        this.yDt.getNativeVideoController().bg(this.gXn);
                    }
                }
                java.lang.String strBg = this.vb.lM().get(0).bg();
                com.bytedance.sdk.openadsdk.WR.eqN.bg().bg(strBg).bg(this.vb.lM().get(0).IL()).IL(this.vb.lM().get(0).bX()).zx(com.bytedance.sdk.openadsdk.utils.ZQc.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg())).eqN(com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg())).bX(2).bg(new com.bytedance.sdk.openadsdk.WR.IL(this.vb, strBg, new com.bytedance.sdk.component.zx.xxp<android.graphics.Bitmap>() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.10
                    @Override // com.bytedance.sdk.component.zx.xxp
                    public void bg(int i, java.lang.String str, java.lang.Throwable th) {
                    }

                    @Override // com.bytedance.sdk.component.zx.xxp
                    public void bg(com.bytedance.sdk.component.zx.VB<android.graphics.Bitmap> vb) {
                        try {
                            new com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.bg(vb.IL(), com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.yDt.getNativeVideoController().Ta()).execute(new java.lang.Void[0]);
                        } catch (java.lang.Exception unused) {
                        }
                    }
                }), 4);
                this.yDt.findViewById(520093726).setOnTouchListener(null);
                this.yDt.findViewById(520093726).setOnClickListener(null);
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.utils.PX.bg("TTVideoLandingPage", e.getMessage());
                if (this.yDt == null) {
                    com.bytedance.sdk.openadsdk.ApmHelper.reportCustomError("mNativeVideoTsView is null", "FUNCTION EXCEPTION", e);
                }
            }
            if (this.LKE == 0) {
                try {
                    android.widget.Toast.makeText(this, com.bytedance.sdk.component.utils.Fy.bg(this, "tt_no_network"), 0).show();
                } catch (java.lang.Throwable unused) {
                }
            }
        }
    }

    protected long ldr() {
        com.bytedance.sdk.openadsdk.core.Ta.IL.ldr ldrVar = this.yDt;
        if (ldrVar == null || ldrVar.getNativeVideoController() == null) {
            return 0L;
        }
        return this.yDt.getNativeVideoController().Kg();
    }

    protected int iR() {
        com.bytedance.sdk.openadsdk.core.Ta.IL.ldr ldrVar = this.yDt;
        if (ldrVar == null || ldrVar.getNativeVideoController() == null) {
            return 0;
        }
        return this.yDt.getNativeVideoController().eo();
    }

    protected void Kg() {
        java.lang.String strBN;
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.vb;
        if (tuv == null || tuv.jz() != 4) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.tC, 0);
        if (!android.text.TextUtils.isEmpty(this.vb.wS())) {
            strBN = this.vb.wS();
        } else if (!android.text.TextUtils.isEmpty(this.vb.cZH())) {
            strBN = this.vb.cZH();
        } else {
            strBN = !android.text.TextUtils.isEmpty(this.vb.bN()) ? this.vb.bN() : "";
        }
        if (this.vb.sVc() != null && this.vb.sVc().bg() != null) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.kMt, 0);
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.rri, 4);
            com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(this.vb.sVc(), this.kMt, this.vb);
        } else if (!android.text.TextUtils.isEmpty(strBN)) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.kMt, 4);
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.rri, 0);
            this.rri.setText(strBN.substring(0, 1));
        }
        if (!android.text.TextUtils.isEmpty(this.vb.zCS())) {
            this.Ja.setText(this.vb.zCS());
        }
        if (!android.text.TextUtils.isEmpty(strBN)) {
            this.JAA.setText(strBN);
        }
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.JAA, 0);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.Ja, 0);
    }

    public void WR() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.vb;
        if (tuv == null) {
            return;
        }
        this.Uq = com.bytedance.sdk.openadsdk.VzQ.bg.bg.iR.bg(this, tuv, this.VW);
        com.bytedance.sdk.openadsdk.core.IL.bg bgVar = new com.bytedance.sdk.openadsdk.core.IL.bg(this, this.vb, this.VW, this.VB);
        this.Pae = bgVar;
        bgVar.bg(false);
        this.Pae.bX(true);
        this.Ja.setOnClickListener(this.Pae);
        this.Ja.setOnTouchListener(this.Pae);
        this.Pae.bg(this.Uq);
    }

    private void Ta() {
        com.bytedance.sdk.openadsdk.core.aGH agh = new com.bytedance.sdk.openadsdk.core.aGH(this);
        this.eo = agh;
        agh.IL(this.bg).bX(this.Kg).eqN(this.WR).IL(this.VB).bg(this.vb).bg(this.vb.ZQc()).bg(this.bg).IL("landingpage_split_screen").zx(this.vb.PC());
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.bytedance.sdk.openadsdk.core.Ta.IL.ldr ldrVar;
        if (this.aGH && (ldrVar = this.yDt) != null && ldrVar.getNativeVideoController() != null) {
            ((com.bykv.vk.openvk.bg.bg.bg.eqN.bg) this.yDt.getNativeVideoController()).zx(null, null);
            this.aGH = false;
        } else if (xxp() && !this.qC.getAndSet(true)) {
            VzQ();
            bg(0);
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.vb;
        bundle.putString("material_meta", tuv != null ? tuv.ZTq().toString() : null);
        bundle.putLong("video_play_position", this.Lq);
        bundle.putBoolean("is_complete", this.VJ);
        long jZx = this.Lq;
        com.bytedance.sdk.openadsdk.core.Ta.IL.ldr ldrVar = this.yDt;
        if (ldrVar != null && ldrVar.getNativeVideoController() != null) {
            jZx = this.yDt.getNativeVideoController().zx();
        }
        bundle.putLong("video_play_position", jZx);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (!this.daV) {
            yDt();
        }
        this.daV = false;
        com.bytedance.sdk.openadsdk.core.aGH agh = this.eo;
        if (agh != null) {
            agh.eo();
        }
        com.bytedance.sdk.openadsdk.eqN.VB vb = this.uu;
        if (vb != null) {
            vb.iR();
        }
    }

    private void yDt() {
        com.bytedance.sdk.openadsdk.core.Ta.IL.ldr ldrVar = this.yDt;
        if (ldrVar == null || ldrVar.getNativeVideoController() == null || vb()) {
            return;
        }
        this.yDt.Ta();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        Lq();
        com.bytedance.sdk.openadsdk.core.Ta.IL.ldr ldrVar = this.yDt;
        if (ldrVar == null || ldrVar.getNativeVideoController() == null) {
            return;
        }
        bg(this.yDt.getNativeVideoController());
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.eqN.VB vb = this.uu;
        if (vb != null) {
            vb.Kg();
        }
    }

    private void bg(com.bykv.vk.openvk.bg.bg.bg.eqN.bX bXVar) {
        this.VJ = this.VJ || bXVar.Lq();
        com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("sp_multi_native_video_data", "key_video_is_update_flag", java.lang.Boolean.TRUE);
        com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("sp_multi_native_video_data", "key_video_isfromvideodetailpage", java.lang.Boolean.TRUE);
        com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("sp_multi_native_video_data", "key_native_video_complete", java.lang.Boolean.valueOf(this.VJ));
        com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("sp_multi_native_video_data", "key_video_current_play_position", java.lang.Long.valueOf(bXVar.zx()));
        com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("sp_multi_native_video_data", "key_video_total_play_duration", java.lang.Long.valueOf(bXVar.Kg() + bXVar.ldr()));
        com.bytedance.sdk.openadsdk.multipro.eqN.bg.bg("sp_multi_native_video_data", "key_video_duration", java.lang.Long.valueOf(bXVar.Kg()));
    }

    private void Lq() {
        if (this.yDt == null || vb()) {
            return;
        }
        this.yDt.Ta();
    }

    private boolean vb() {
        com.bytedance.sdk.openadsdk.core.Ta.IL.ldr ldrVar = this.yDt;
        if (ldrVar == null || ldrVar.getNativeVideoController() == null) {
            return true;
        }
        return this.yDt.getNativeVideoController().Lq();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        VB();
        try {
            if (getWindow() != null) {
                ((android.view.ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
            this.vb.ldr(false);
        } catch (java.lang.Throwable unused) {
        }
        com.bytedance.sdk.component.WR.eqN eqn = this.bg;
        if (eqn != null) {
            com.bytedance.sdk.openadsdk.core.daV.bg(eqn.getWebView());
        }
        this.bg = null;
        com.bytedance.sdk.openadsdk.core.aGH agh = this.eo;
        if (agh != null) {
            agh.VB();
        }
        com.bytedance.sdk.openadsdk.core.Ta.IL.ldr ldrVar = this.yDt;
        if (ldrVar != null && ldrVar.getNativeVideoController() != null) {
            this.yDt.getNativeVideoController().eqN();
        }
        this.yDt = null;
        this.vb = null;
        com.bytedance.sdk.openadsdk.eqN.VB vb = this.uu;
        if (vb != null) {
            vb.bX(true);
        }
        if (!android.text.TextUtils.isEmpty(this.bN)) {
            com.bytedance.sdk.openadsdk.eqN.bX.bg.bg(this.sVc.get(), this.txA.get(), this.vb);
        }
        com.bytedance.sdk.openadsdk.iR.IL.bg().bg(this.RJ);
    }

    protected void eo() {
        com.bytedance.sdk.component.utils.rri.bg(this.GZ, this.zx);
    }

    protected void VB() {
        try {
            com.bytedance.sdk.component.utils.rri.bg(this.GZ);
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean xxp() {
        return !android.text.TextUtils.isEmpty(this.ZQc) && this.ZQc.contains("__luban_sdk");
    }

    private void bg(final int i) {
        if (this.bX == null || !xxp()) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.3
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.this.bX, i);
            }
        });
    }

    private void VzQ() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.eo.bg("temai_back_event", jSONObject);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.eo.eqN
    public void bg(boolean z, org.json.JSONArray jSONArray) {
        if (!z || jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        this.Dxa = jSONArray;
    }

    private static class bg extends android.os.AsyncTask<java.lang.Void, java.lang.Void, android.graphics.drawable.Drawable> {
        private final java.lang.ref.WeakReference<com.bykv.vk.openvk.bg.bg.bg.eqN.IL> IL;
        private final android.graphics.Bitmap bg;

        private bg(android.graphics.Bitmap bitmap, com.bykv.vk.openvk.bg.bg.bg.eqN.IL il) {
            this.bg = bitmap;
            this.IL = new java.lang.ref.WeakReference<>(il);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public android.graphics.drawable.Drawable doInBackground(java.lang.Void... voidArr) {
            try {
                android.graphics.Bitmap bitmapBg = com.bytedance.sdk.component.adexpress.eqN.bg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), this.bg, 25);
                if (bitmapBg == null) {
                    return null;
                }
                return new android.graphics.drawable.BitmapDrawable(com.bytedance.sdk.openadsdk.core.VzQ.bg().getResources(), bitmapBg);
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("TTVideoLandingPage", th.getMessage());
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(android.graphics.drawable.Drawable drawable) {
            java.lang.ref.WeakReference<com.bykv.vk.openvk.bg.bg.bg.eqN.IL> weakReference;
            if (drawable == null || (weakReference = this.IL) == null || weakReference.get() == null) {
                return;
            }
            this.IL.get().bg(drawable);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.bX.bg(this, this.vb);
    }
}
