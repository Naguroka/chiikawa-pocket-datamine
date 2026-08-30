package com.bytedance.sdk.openadsdk.activity;

/* JADX INFO: loaded from: classes4.dex */
public class TTPlayableLandingPageActivity extends com.bytedance.sdk.openadsdk.activity.TTBaseActivity implements com.bytedance.sdk.component.utils.JAA.bg, com.bytedance.sdk.openadsdk.PX.iR, com.bytedance.sdk.openadsdk.core.IL.eqN {
    private static final com.bytedance.sdk.openadsdk.tuV.iR.bg Pae = new com.bytedance.sdk.openadsdk.tuV.iR.bg() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.1
        @Override // com.bytedance.sdk.openadsdk.tuV.iR.bg
        public void bg(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg(str, str2, th);
        }
    };
    private int CQc;
    private boolean DDQ;
    private com.bytedance.sdk.openadsdk.core.aGH Fy;
    com.bytedance.sdk.openadsdk.common.TTAdDislikeToast IL;
    private com.bytedance.sdk.openadsdk.core.model.tuV Ja;
    private int LKE;
    private com.bytedance.sdk.openadsdk.core.aGH LZ;
    private com.bytedance.sdk.openadsdk.core.zx.ldr Lq;
    private com.bytedance.sdk.openadsdk.core.widget.yDt PX;
    private android.content.Context Ta;
    private boolean Uq;
    private com.bytedance.sdk.openadsdk.core.widget.Lq VB;
    private java.lang.String VJ;
    private java.lang.String VzQ;
    private com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr aGH;
    private com.bytedance.sdk.openadsdk.eqN.eqN.zx bN;
    com.bytedance.sdk.openadsdk.core.Ja bg;
    private android.widget.RelativeLayout eo;
    private com.bytedance.sdk.openadsdk.eqN.VB jz;
    private java.lang.String kMt;
    private com.bykv.vk.openvk.preload.falconx.loader.ILoader qC;
    private java.lang.String rri;
    private com.bytedance.sdk.openadsdk.tuV.bg.bg sVc;
    private int tC;
    private java.lang.String tuV;
    private boolean txA;
    private com.bytedance.sdk.openadsdk.tuV.Kg uu;
    private com.bytedance.sdk.openadsdk.core.widget.VB vb;
    private com.bytedance.sdk.openadsdk.core.widget.eo xxp;
    private int yDt;
    private com.bytedance.sdk.component.WR.eqN zx;
    private boolean ldr = true;
    private boolean Kg = false;
    private boolean WR = true;
    final java.util.concurrent.atomic.AtomicBoolean bX = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.lang.String JAA = "embeded_ad";
    private final com.bytedance.sdk.component.utils.JAA Uw = new com.bytedance.sdk.component.utils.JAA(android.os.Looper.getMainLooper(), this);
    private final java.util.concurrent.atomic.AtomicBoolean VW = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicInteger daV = new java.util.concurrent.atomic.AtomicInteger(0);
    private final java.util.concurrent.atomic.AtomicInteger ayS = new java.util.concurrent.atomic.AtomicInteger(0);
    private final java.util.concurrent.atomic.AtomicInteger ZQc = new java.util.concurrent.atomic.AtomicInteger(0);
    private boolean Dxa = false;
    protected com.bytedance.sdk.openadsdk.PX.eqN eqN = new com.bytedance.sdk.openadsdk.PX.eqN() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.8
        @Override // com.bytedance.sdk.openadsdk.PX.eqN
        public void bg() {
            if (!com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.isFinishing() && com.bytedance.sdk.openadsdk.core.model.rri.yDt(com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.Ja) && com.bytedance.sdk.openadsdk.core.model.rri.vb(com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.Ja)) {
                com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.Uw.removeMessages(2);
                com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.Uw.sendMessage(com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.bg(1, 0));
            }
        }

        @Override // com.bytedance.sdk.openadsdk.PX.eqN
        public void IL() {
            if (com.bytedance.sdk.openadsdk.core.model.rri.yDt(com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.Ja) && com.bytedance.sdk.openadsdk.core.model.rri.Lq(com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.Ja)) {
                com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.Uw.sendMessageDelayed(com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.bg(0, 0), 1000L);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.PX.eqN
        public void bg(int i) {
            if (!com.bytedance.sdk.openadsdk.core.model.rri.yDt(com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.Ja) || com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.vb == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.vb.setProgress(i);
        }
    };
    private int RJ = 1;

    /* JADX INFO: Access modifiers changed from: private */
    public android.os.Message bg(int i, int i2) {
        android.os.Message messageObtain = android.os.Message.obtain();
        messageObtain.what = 2;
        messageObtain.arg1 = i;
        if (i == 3) {
            messageObtain.arg2 = i2;
        }
        return messageObtain;
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        com.bytedance.sdk.openadsdk.tuV.bg.bg bgVar;
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.yDt.zx()) {
            finish();
            return;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            requestWindowFeature(1);
            getWindow().addFlags(1024);
            getWindow().addFlags(16777216);
            com.bytedance.sdk.openadsdk.core.VzQ.IL(this);
        } catch (java.lang.Throwable unused) {
        }
        bg(bundle);
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.Ja;
        if (tuv == null) {
            return;
        }
        this.txA = tuv.kCH();
        int iXxp = com.bytedance.sdk.openadsdk.core.model.rri.xxp(this.Ja);
        if (iXxp == 0) {
            setRequestedOrientation(14);
        } else if (iXxp == 1) {
            setRequestedOrientation(1);
        } else if (iXxp == 2) {
            setRequestedOrientation(0);
            this.RJ = 2;
        }
        this.Ta = this;
        try {
            setContentView(eqN());
            WR();
            ldr();
            if (this.txA) {
                yDt();
                this.sVc.bg(false, (com.bytedance.sdk.openadsdk.PX.zx) null);
            } else {
                bg();
                VB();
                if (!android.text.TextUtils.isEmpty(this.VJ)) {
                    this.qC = com.bytedance.sdk.openadsdk.iR.IL.bg().IL();
                    int iBg = com.bytedance.sdk.openadsdk.iR.IL.bg().bg(this.qC, this.VJ);
                    this.LKE = iBg;
                    this.CQc = iBg > 0 ? 2 : 0;
                }
                Kg();
                com.bytedance.sdk.openadsdk.eqN.eqN.zx zxVar = this.bN;
                if (zxVar != null) {
                    zxVar.iR();
                }
            }
            iR();
            com.bytedance.sdk.openadsdk.eqN.bX.bg.bg(android.os.SystemClock.elapsedRealtime() - jElapsedRealtime, this.Ja, "embeded_ad", this.qC, this.VJ);
            if (!this.txA || (bgVar = this.sVc) == null) {
                return;
            }
            bgVar.bg();
        } catch (java.lang.Throwable unused2) {
            finish();
        }
    }

    private android.view.View eqN() {
        com.bytedance.sdk.openadsdk.core.zx.bX bXVar = new com.bytedance.sdk.openadsdk.core.zx.bX(this);
        bXVar.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        if (this.txA) {
            this.sVc = new com.bytedance.sdk.openadsdk.tuV.bg.bg(this.Ta, this.Ja, this.RJ, this.Dxa, bXVar);
        } else {
            this.zx = new com.bytedance.sdk.component.WR.eqN(this);
            this.zx.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            this.zx.setVisibility(4);
            this.Lq = new com.bytedance.sdk.openadsdk.core.zx.ldr(this, null, android.R.style.Widget.ProgressBar.Horizontal);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 3.0f));
            layoutParams.gravity = 49;
            this.Lq.setLayoutParams(layoutParams);
            this.Lq.setProgress(1);
            this.Lq.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.Kg.bg(this, "tt_browser_progress_style"));
            this.vb = new com.bytedance.sdk.openadsdk.core.widget.VB(this);
            this.vb.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            this.vb.setClickable(true);
            this.vb.setFocusable(true);
            this.xxp = new com.bytedance.sdk.openadsdk.core.widget.eo(this);
            this.xxp.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        this.PX = new com.bytedance.sdk.openadsdk.core.widget.yDt(this);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 28.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 28.0f));
        layoutParams2.leftMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 12.0f);
        layoutParams2.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 20.0f);
        this.PX.setLayoutParams(layoutParams2);
        this.PX.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        this.PX.setImageDrawable(com.bytedance.sdk.openadsdk.utils.Kg.bg(this, "tt_unmute_wrapper"));
        this.VB = new com.bytedance.sdk.openadsdk.core.widget.Lq(this);
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-2, com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 28.0f));
        layoutParams3.gravity = 8388661;
        layoutParams3.leftMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 16.0f);
        layoutParams3.rightMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 80.0f);
        layoutParams3.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 20.0f);
        this.VB.setLayoutParams(layoutParams3);
        this.VB.setGravity(17);
        this.VB.setText(com.bytedance.sdk.component.utils.Fy.bg(this, "tt_reward_feedback"));
        this.VB.setTextColor(-1);
        this.VB.setTextSize(14.0f);
        this.eo = new com.bytedance.sdk.openadsdk.core.zx.iR(this);
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 28.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 28.0f));
        layoutParams4.gravity = 8388661;
        layoutParams4.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 20.0f);
        layoutParams4.rightMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 24.0f);
        this.eo.setLayoutParams(layoutParams4);
        this.eo.setBackground(com.bytedance.sdk.openadsdk.utils.Kg.bg(this, "tt_mute_btn_bg"));
        this.eo.setGravity(17);
        this.eo.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.zx.eqN eqn = new com.bytedance.sdk.openadsdk.core.zx.eqN(this);
        eqn.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 12.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 12.0f)));
        eqn.setImageDrawable(com.bytedance.sdk.component.utils.Fy.bX(this, "tt_video_close_drawable"));
        eqn.setVisibility(0);
        this.eo.addView(eqn);
        if (!this.txA) {
            bXVar.addView(this.zx);
            bXVar.addView(this.Lq);
            bXVar.addView(this.xxp);
            bXVar.addView(this.vb);
        }
        bXVar.addView(this.PX);
        bXVar.addView(this.VB);
        bXVar.addView(this.eo);
        return bXVar;
    }

    private void zx() {
        if (this.uu != null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.WR.IL().xxp()) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg(Pae);
        }
        com.bytedance.sdk.openadsdk.tuV.bg bgVar = new com.bytedance.sdk.openadsdk.tuV.bg() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.9
            @Override // com.bytedance.sdk.openadsdk.tuV.bg
            public void bg(int i, java.lang.String str) {
                super.bg(i, str);
                if (com.bytedance.sdk.openadsdk.core.model.rri.rri(com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.Ja)) {
                    com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.Uw.sendMessage(com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.bg(3, com.bytedance.sdk.openadsdk.core.model.rri.bg(i)));
                    com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.eo();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.tuV.bg
            public com.bytedance.sdk.openadsdk.tuV.eqN bg() {
                java.lang.String strLdr = com.bytedance.sdk.openadsdk.common.IL.ldr();
                strLdr.hashCode();
                switch (strLdr) {
                    case "2g":
                        return com.bytedance.sdk.openadsdk.tuV.eqN.TYPE_2G;
                    case "3g":
                        return com.bytedance.sdk.openadsdk.tuV.eqN.TYPE_3G;
                    case "4g":
                        return com.bytedance.sdk.openadsdk.tuV.eqN.TYPE_4G;
                    case "5g":
                        return com.bytedance.sdk.openadsdk.tuV.eqN.TYPE_5G;
                    case "wifi":
                        return com.bytedance.sdk.openadsdk.tuV.eqN.TYPE_WIFI;
                    default:
                        return com.bytedance.sdk.openadsdk.tuV.eqN.TYPE_UNKNOWN;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.tuV.bg
            public void bg(org.json.JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.eqN.bX.IL(com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.Ja, "embeded_ad", "playable_track", jSONObject);
            }
        };
        com.bytedance.sdk.openadsdk.tuV.bX bXVar = new com.bytedance.sdk.openadsdk.tuV.bX() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.10
            @Override // com.bytedance.sdk.openadsdk.tuV.bX
            public void bg(java.lang.String str, org.json.JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.Fy.bg(str, jSONObject);
            }
        };
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_CONTENT_ID, this.VzQ);
            jSONObject.put("log_extra", this.tuV);
            this.uu = com.bytedance.sdk.openadsdk.tuV.Kg.bg(getApplicationContext(), this.zx.getWebView(), bXVar, bgVar).iR(this.rri).zx(com.bytedance.sdk.openadsdk.common.IL.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg())).bg(com.bytedance.sdk.openadsdk.common.IL.bg()).bX(jSONObject).IL(com.bytedance.sdk.openadsdk.common.IL.zx()).bg("sdkEdition", com.bytedance.sdk.openadsdk.common.IL.bX()).eqN(com.bytedance.sdk.openadsdk.common.IL.eqN()).eqN(false).bg(this.Dxa).bg(com.bytedance.sdk.openadsdk.core.model.rri.Fy(this.Ja)).IL(com.bytedance.sdk.openadsdk.core.model.rri.Fy(this.Ja)).zx(true);
        } catch (java.lang.Throwable unused) {
        }
        if (this.uu == null) {
            com.bytedance.sdk.component.utils.PX.bg("Pangle", "new PlayablePlugin Object failed, mPlayablePlugin is null");
            return;
        }
        if (!android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.rri.VB(this.Ja))) {
            this.uu.bX(com.bytedance.sdk.openadsdk.core.model.rri.VB(this.Ja));
        }
        java.util.Set<java.lang.String> setVB = this.uu.VB();
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this.uu);
        for (java.lang.String str : setVB) {
            if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str)) {
                this.Fy.bg().bg(str, new com.bytedance.sdk.component.bg.zx<org.json.JSONObject, org.json.JSONObject>() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.11
                    @Override // com.bytedance.sdk.component.bg.zx
                    public org.json.JSONObject bg(org.json.JSONObject jSONObject2, com.bytedance.sdk.component.bg.ldr ldrVar) {
                        try {
                            com.bytedance.sdk.openadsdk.tuV.Kg kg = (com.bytedance.sdk.openadsdk.tuV.Kg) weakReference.get();
                            if (kg == null) {
                                return null;
                            }
                            return kg.eqN(bg(), jSONObject2);
                        } catch (java.lang.Throwable unused2) {
                            return null;
                        }
                    }
                });
            }
        }
    }

    private void ldr() {
        if (this.Ja.jz() == 4) {
            this.aGH = com.bytedance.sdk.openadsdk.VzQ.bg.bg.iR.bg(this.Ta, this.Ja, "interaction");
        }
    }

    private void iR() {
        int i = com.bytedance.sdk.openadsdk.core.VzQ.eqN().Uw(java.lang.String.valueOf(this.Ja.IGR())).xxp;
        if (i >= 0) {
            this.Uw.sendEmptyMessageDelayed(1, ((long) i) * 1000);
        } else {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.eo, 0);
        }
    }

    private void bg(android.os.Bundle bundle) {
        android.content.Intent intent = getIntent();
        if (intent != null) {
            this.yDt = intent.getIntExtra("sdk_version", 1);
            this.VzQ = intent.getStringExtra("adid");
            this.tuV = intent.getStringExtra("log_extra");
            this.tC = intent.getIntExtra("source", -1);
            this.DDQ = intent.getBooleanExtra("ad_pending_download", false);
            this.rri = intent.getStringExtra("url");
            this.VJ = intent.getStringExtra("gecko_id");
            this.kMt = intent.getStringExtra("web_title");
            if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                java.lang.String stringExtra = intent.getStringExtra(com.bytedance.sdk.openadsdk.TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.Ja = com.bytedance.sdk.openadsdk.core.IL.bg(new org.json.JSONObject(stringExtra));
                    } catch (java.lang.Exception e) {
                        com.bytedance.sdk.component.utils.PX.bg("TTPWPActivity", "TTPlayableLandingPageActivity - onCreate MultiGlobalInfo : ", e);
                    }
                }
            } else {
                this.Ja = com.bytedance.sdk.openadsdk.core.JAA.bg().IL();
                com.bytedance.sdk.openadsdk.core.JAA.bg().ldr();
            }
        }
        if (bundle != null) {
            try {
                this.yDt = bundle.getInt("sdk_version", 1);
                this.VzQ = bundle.getString("adid");
                this.tuV = bundle.getString("log_extra");
                this.tC = bundle.getInt("source", -1);
                this.DDQ = bundle.getBoolean("ad_pending_download", false);
                this.rri = bundle.getString("url");
                this.kMt = bundle.getString("web_title");
                java.lang.String string = bundle.getString("material_meta", null);
                if (!android.text.TextUtils.isEmpty(string)) {
                    this.Ja = com.bytedance.sdk.openadsdk.core.IL.bg(new org.json.JSONObject(string));
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        if (this.Ja == null) {
            com.bytedance.sdk.component.utils.PX.bg("TTPWPActivity", "material is null, no data to display");
            finish();
        } else {
            try {
                this.Dxa = com.bytedance.sdk.openadsdk.core.VzQ.eqN().xxp(this.Ja.VW().getCodeId());
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("TTPWPActivity", th.getMessage());
            }
        }
    }

    private void Kg() {
        com.bytedance.sdk.component.WR.eqN eqn = this.zx;
        if (eqn == null) {
            return;
        }
        eqn.setLandingPage(true);
        this.zx.setTag("landingpage");
        this.zx.setMaterialMeta(this.Ja.mLT());
        com.bytedance.sdk.openadsdk.eqN.VB vbBg = new com.bytedance.sdk.openadsdk.eqN.VB(this.Ja, this.zx.getWebView(), new com.bytedance.sdk.openadsdk.eqN.eo() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.12
            @Override // com.bytedance.sdk.openadsdk.eqN.eo
            public void bg(int i) {
                com.bytedance.sdk.openadsdk.eqN.bX.bg.bg(com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.LKE, com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.ZQc.get(), com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.ayS.get(), com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.daV.get() - com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.ayS.get(), com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.Ja, "embeded_ad", i);
            }
        }, this.CQc).bg(true);
        this.jz = vbBg;
        vbBg.bg("embeded_ad");
        this.jz.bg(this.bN);
        this.jz.bg(this.uu);
        this.zx.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.bg.zx(this.Ta, this.Fy, this.VzQ, this.jz, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.13
            @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
            public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
            public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
                super.onPageFinished(webView, str);
                com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.Kg = true;
                if (com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.isFinishing()) {
                    return;
                }
                if (com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.uu != null) {
                    com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.uu.WR(str);
                }
                try {
                    com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.eqN.IL();
                } catch (java.lang.Throwable unused) {
                }
                try {
                    if (com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.Lq != null) {
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.Lq.setVisibility(8);
                    }
                    if (com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.ldr) {
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.eo();
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.bg("py_loading_success");
                        if (this.bX != null) {
                            this.bX.IL(true);
                        }
                    }
                } catch (java.lang.Throwable unused2) {
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
            public void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
                if (com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.rri != null && webResourceRequest != null && webResourceRequest.getUrl() != null && com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.rri.equals(webResourceRequest.getUrl().toString())) {
                    com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.ldr = false;
                }
                if (com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.uu != null && webResourceRequest != null) {
                    try {
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.uu.bg(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    } catch (java.lang.Throwable unused) {
                    }
                }
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
            public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.ldr = false;
                if (com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.uu == null || webResourceError == null || webResourceRequest == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.uu.bg(webResourceError.getErrorCode(), java.lang.String.valueOf(webResourceError.getDescription()), java.lang.String.valueOf(webResourceRequest.getUrl()));
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
            public void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
                super.onReceivedError(webView, i, str, str2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
            public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, java.lang.String str) {
                try {
                    if (com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.uu != null) {
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.uu.eo(str);
                    }
                    if (!android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.VJ)) {
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.daV.incrementAndGet();
                    }
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel webResourceResponseModelBg = com.bytedance.sdk.openadsdk.iR.IL.bg().bg(com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.qC, com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.VJ, str);
                    long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
                    if (com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.bN != null) {
                        com.bytedance.sdk.component.adexpress.eqN.eo.bg bgVarBg = com.bytedance.sdk.component.adexpress.eqN.eo.bg(str);
                        int i = (webResourceResponseModelBg == null || webResourceResponseModelBg.getWebResourceResponse() == null) ? 2 : 1;
                        if (bgVarBg == com.bytedance.sdk.component.adexpress.eqN.eo.bg.HTML) {
                            com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.bN.bg(str, jCurrentTimeMillis, jCurrentTimeMillis2, i);
                        } else if (bgVarBg == com.bytedance.sdk.component.adexpress.eqN.eo.bg.JS) {
                            com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.bN.IL(str, jCurrentTimeMillis, jCurrentTimeMillis2, i);
                        }
                    }
                    if (webResourceResponseModelBg != null && webResourceResponseModelBg.getWebResourceResponse() != null) {
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.ayS.incrementAndGet();
                        if (com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.uu != null) {
                            com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.uu.VB(str);
                        }
                        return webResourceResponseModelBg.getWebResourceResponse();
                    }
                    if (webResourceResponseModelBg != null && webResourceResponseModelBg.getMsg() == 2) {
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.ZQc.incrementAndGet();
                    }
                    return super.shouldInterceptRequest(webView, str);
                } catch (java.lang.Exception unused) {
                    return super.shouldInterceptRequest(webView, str);
                }
            }
        });
        bg(this.zx);
        com.bytedance.sdk.openadsdk.utils.tuV.bg(this.zx, this.rri);
        com.bytedance.sdk.openadsdk.tuV.Kg kg = this.uu;
        if (kg != null) {
            kg.Kg(this.rri);
        }
        this.zx.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.bg.eqN(this.Fy, this.jz) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.14
            @Override // com.bytedance.sdk.openadsdk.core.widget.bg.eqN, android.webkit.WebChromeClient
            public void onProgressChanged(android.webkit.WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.isFinishing()) {
                    return;
                }
                try {
                    com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.eqN.bg(i);
                } catch (java.lang.Throwable unused) {
                }
                if (com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.Lq != null) {
                    if (i == 100) {
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.Kg = true;
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.Lq.setVisibility(8);
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.eo();
                        return;
                    }
                    com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.Lq.setProgress(i);
                }
            }
        });
        this.zx.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.15
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                if (com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.jz == null) {
                    return false;
                }
                com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.jz.bg(motionEvent);
                return false;
            }
        });
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        try {
            com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.Ja;
            bundle.putString("material_meta", tuv != null ? tuv.ZTq().toString() : null);
            bundle.putInt("sdk_version", this.yDt);
            bundle.putString("adid", this.VzQ);
            bundle.putString("log_extra", this.tuV);
            bundle.putInt("source", this.tC);
            bundle.putBoolean("ad_pending_download", this.DDQ);
            bundle.putString("url", this.rri);
            bundle.putString("web_title", this.kMt);
            bundle.putString("event_tag", "embeded_ad");
        } catch (java.lang.Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    private void WR() {
        android.widget.RelativeLayout relativeLayout = this.eo;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    if (com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.bN != null) {
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.bN.Kg();
                    }
                    com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.Uw.sendMessage(com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.bg(4, 0));
                    com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.bg("playable_close");
                    com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.finish();
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.widget.Lq lq = this.VB;
        if (lq != null) {
            lq.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.IL();
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.widget.yDt ydt = this.PX;
        if (ydt != null) {
            ydt.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity tTPlayableLandingPageActivity = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this;
                    tTPlayableLandingPageActivity.Dxa = !tTPlayableLandingPageActivity.Dxa;
                    com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity tTPlayableLandingPageActivity2 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this;
                    tTPlayableLandingPageActivity2.bX(tTPlayableLandingPageActivity2.Dxa);
                    if (com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.uu != null) {
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.uu.bg(com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.Dxa);
                    }
                }
            });
        }
        if (this.txA) {
            return;
        }
        this.zx.setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.zx, 4);
        this.vb.IL(this.Ja, this.RJ);
    }

    protected void bg() {
        if (this.vb == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.Ja;
        if (tuv != null && !com.bytedance.sdk.openadsdk.core.model.rri.yDt(tuv)) {
            this.vb.bX();
            return;
        }
        this.vb.IL(this.Ja, this.RJ);
        if (this.vb.getDownloadButton() != null) {
            com.bytedance.sdk.openadsdk.core.IL.bg bgVar = new com.bytedance.sdk.openadsdk.core.IL.bg(this, this.Ja, "embeded_ad", this.tC) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.5
                @Override // com.bytedance.sdk.openadsdk.core.IL.bg, com.bytedance.sdk.openadsdk.core.IL.IL, com.bytedance.sdk.openadsdk.core.IL.bX
                public void bg(android.view.View view, float f, float f2, float f3, float f4, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray, boolean z) {
                    if (this.ldr == null || this.ldr.tuV() != 1 || z) {
                        super.bg(view, f, f2, f3, f4, sparseArray, z);
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.DDQ = true;
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.Uq = true;
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        try {
                            jSONObject.put("playable_url", com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.rri);
                        } catch (org.json.JSONException e) {
                            com.bytedance.sdk.component.utils.PX.bg("TTPWPActivity", "onClick JSON ERROR", e);
                        }
                        com.bytedance.sdk.openadsdk.eqN.bX.IL(com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.Ja, this.iR, "click_playable_download_button_loading", jSONObject);
                    }
                }
            };
            bgVar.bg(this.aGH);
            this.vb.getDownloadButton().setOnClickListener(bgVar);
        }
        if (com.bytedance.sdk.openadsdk.core.model.rri.vb(this.Ja)) {
            this.Uw.sendMessageDelayed(bg(2, com.bytedance.sdk.openadsdk.core.model.rri.bg(2)), com.bytedance.sdk.openadsdk.core.model.rri.LZ(this.Ja));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eo() {
        if (this.VW.getAndSet(true)) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.model.rri.rri(this.Ja) && (!this.Kg || !this.ldr)) {
            if (this.xxp == null || this.vb == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.IL.bg bgVar = new com.bytedance.sdk.openadsdk.core.IL.bg(this, this.Ja, "embeded_ad", this.tC);
            bgVar.bg(this.aGH);
            this.xxp.bg(this.Ja, "embeded_ad", bgVar);
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.xxp, 0);
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.vb, 8);
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.PX, 8);
            return;
        }
        com.bytedance.sdk.component.WR.eqN eqn = this.zx;
        if (eqn == null || this.vb == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) eqn, 0);
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.vb, 8);
    }

    private void bg(com.bytedance.sdk.component.WR.eqN eqn) {
        if (eqn == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.bg.bX.bg(this.Ta).bg(false).IL(false).bg(eqn.getWebView());
        eqn.setUserAgentString(com.bytedance.sdk.openadsdk.utils.xxp.bg(eqn.getWebView(), this.yDt));
        eqn.setMixedContentMode(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(java.lang.String str) {
        com.bytedance.sdk.openadsdk.eqN.bX.bg(java.lang.System.currentTimeMillis(), this.Ja, "embeded_ad", str);
    }

    private void VB() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.Ja);
        this.bN = new com.bytedance.sdk.openadsdk.eqN.VzQ(3, "embeded_ad", this.Ja);
        this.Fy = new com.bytedance.sdk.openadsdk.core.aGH(this);
        this.Fy.IL(this.zx).bg(this.Ja).bg(arrayList).bX(this.VzQ).eqN(this.tuV).IL("embeded_ad").IL(this.tC).bg(this).bg(this.bN).bg(this.eqN).bg(this.zx).zx(this.Ja.PC());
        zx();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.eqN.eqN.zx zxVar = this.bN;
        if (zxVar != null) {
            zxVar.eo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        com.bytedance.sdk.openadsdk.core.aGH agh = this.Fy;
        if (agh != null) {
            agh.eo();
            com.bytedance.sdk.component.WR.eqN eqn = this.zx;
            if (eqn != null) {
                this.Fy.IL(eqn.getVisibility() == 0);
            }
        }
        com.bytedance.sdk.openadsdk.core.aGH agh2 = this.LZ;
        if (agh2 != null) {
            agh2.eo();
        }
        com.bytedance.sdk.openadsdk.tuV.Kg kg = this.uu;
        if (kg != null) {
            kg.bX(true);
        }
        com.bytedance.sdk.openadsdk.eqN.VB vb = this.jz;
        if (vb != null) {
            vb.iR();
        }
        com.bytedance.sdk.openadsdk.utils.DeviceUtils.AudioInfoReceiver.bg((com.bytedance.sdk.openadsdk.PX.iR) this);
        if (com.bytedance.sdk.openadsdk.utils.DeviceUtils.iR() == 0) {
            this.Dxa = true;
        }
        bX(this.Dxa);
        com.bytedance.sdk.openadsdk.tuV.bg.bg bgVar = this.sVc;
        if (bgVar != null) {
            bgVar.IL();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        com.bytedance.sdk.openadsdk.core.aGH agh = this.Fy;
        if (agh != null) {
            agh.IL(false);
        }
        com.bytedance.sdk.openadsdk.tuV.Kg kg = this.uu;
        if (kg != null) {
            kg.bg(true);
            this.uu.bX(false);
        }
        com.bytedance.sdk.openadsdk.utils.DeviceUtils.AudioInfoReceiver.IL((com.bytedance.sdk.openadsdk.PX.iR) this);
        com.bytedance.sdk.openadsdk.tuV.bg.bg bgVar = this.sVc;
        if (bgVar != null) {
            bgVar.bX();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.eqN.eqN.zx zxVar = this.bN;
        if (zxVar != null) {
            zxVar.WR();
        }
        com.bytedance.sdk.openadsdk.eqN.VB vb = this.jz;
        if (vb != null) {
            vb.Kg();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        com.bytedance.sdk.openadsdk.eqN.eqN.zx zxVar = this.bN;
        if (zxVar != null) {
            zxVar.Kg();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.bytedance.sdk.openadsdk.tuV.bg.bg bgVar = this.sVc;
        if (bgVar != null) {
            bgVar.eqN();
        }
        com.bytedance.sdk.openadsdk.eqN.eqN.zx zxVar = this.bN;
        if (zxVar != null) {
            zxVar.bg(true);
            this.bN.PX();
        }
        this.Uw.removeCallbacksAndMessages(null);
        try {
            if (getWindow() != null) {
                ((android.view.ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (java.lang.Throwable unused) {
        }
        if (!android.text.TextUtils.isEmpty(this.VJ)) {
            com.bytedance.sdk.openadsdk.eqN.bX.bg.bg(this.ayS.get(), this.daV.get(), this.Ja);
        }
        com.bytedance.sdk.openadsdk.iR.IL.bg().bg(this.qC);
        com.bytedance.sdk.component.WR.eqN eqn = this.zx;
        if (eqn != null) {
            com.bytedance.sdk.openadsdk.core.daV.bg(eqn.getWebView());
            this.zx.PX();
        }
        this.zx = null;
        com.bytedance.sdk.openadsdk.core.aGH agh = this.Fy;
        if (agh != null) {
            agh.VB();
        }
        com.bytedance.sdk.openadsdk.core.aGH agh2 = this.LZ;
        if (agh2 != null) {
            agh2.VB();
        }
        com.bytedance.sdk.openadsdk.tuV.Kg kg = this.uu;
        if (kg != null) {
            kg.ayS();
        }
        com.bytedance.sdk.openadsdk.eqN.VB vb = this.jz;
        if (vb != null) {
            vb.bX(true);
        }
        com.bytedance.sdk.openadsdk.core.Ja ja = this.bg;
        if (ja != null) {
            ja.IL();
        }
    }

    @Override // com.bytedance.sdk.component.utils.JAA.bg
    public void bg(android.os.Message message) {
        int i = message.what;
        if (i == 1) {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.eo, 0);
            return;
        }
        if (i != 2) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.VB vb = this.vb;
        if (vb == null || !vb.eqN()) {
            int i2 = message.arg1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("remove_loading_page_type", message.arg1);
                if (message.arg2 != 0) {
                    jSONObject.put("remove_loading_page_reason", message.arg2);
                }
                jSONObject.put("playable_url", this.rri);
                com.bytedance.sdk.openadsdk.core.widget.VB vb2 = this.vb;
                jSONObject.put("duration", vb2 != null ? vb2.getDisplayDuration() : 0L);
            } catch (org.json.JSONException e) {
                com.bytedance.sdk.component.utils.PX.bg("TTPWPActivity", "handleMsg json error", e);
            }
            com.bytedance.sdk.openadsdk.eqN.bX.IL(this.Ja, "embeded_ad", "remove_loading_page", jSONObject);
            this.Uw.removeMessages(2);
            com.bytedance.sdk.openadsdk.core.widget.VB vb3 = this.vb;
            if (vb3 != null) {
                vb3.bX();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.IL.eqN
    public void bg(boolean z) {
        com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr ldrVar;
        this.DDQ = true;
        this.Uq = z;
        if (!z) {
            try {
                android.widget.Toast.makeText(this.Ta, "Download later", 0).show();
            } catch (java.lang.Throwable unused) {
            }
        }
        if (!this.Uq || (ldrVar = this.aGH) == null) {
            return;
        }
        ldrVar.eqN();
    }

    protected void IL() {
        if (this.Ja == null || isFinishing()) {
            return;
        }
        if (this.bX.get()) {
            PX();
            return;
        }
        if (this.bg == null) {
            bX();
        }
        this.bg.bg(new com.bytedance.sdk.openadsdk.core.Ja.bg() { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.6
            @Override // com.bytedance.sdk.openadsdk.core.Ja.bg
            public void bg() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.Ja.bg
            public void bg(int i, java.lang.String str) {
                if (com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.bX.get() || android.text.TextUtils.isEmpty(str)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.bX.set(true);
                com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.Ta();
            }
        });
        com.bytedance.sdk.openadsdk.core.Ja ja = this.bg;
        if (ja != null) {
            ja.bg();
        }
    }

    void bX() {
        if (this.Ja != null) {
            this.bg = new com.bytedance.sdk.openadsdk.bX.bX(this, this.Ja.Ny(), this.Ja.kU(), this.Ja.ZTq().toString(), "playable");
        }
        if (this.IL == null) {
            this.IL = new com.bytedance.sdk.openadsdk.common.TTAdDislikeToast(this);
            ((android.widget.FrameLayout) findViewById(android.R.id.content)).addView(this.IL);
        }
    }

    private void PX() {
        com.bytedance.sdk.openadsdk.common.TTAdDislikeToast tTAdDislikeToast = this.IL;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getDislikeTip());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ta() {
        com.bytedance.sdk.openadsdk.common.TTAdDislikeToast tTAdDislikeToast = this.IL;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getDislikeSendTip());
        }
    }

    protected void bX(boolean z) {
        android.graphics.drawable.Drawable drawableBg;
        try {
            this.Dxa = z;
            if (z) {
                drawableBg = com.bytedance.sdk.openadsdk.utils.Kg.bg(this.Ta, "tt_mute_wrapper");
            } else {
                drawableBg = com.bytedance.sdk.openadsdk.utils.Kg.bg(this.Ta, "tt_unmute_wrapper");
            }
            this.PX.setImageDrawable(drawableBg);
            com.bytedance.sdk.openadsdk.tuV.Kg kg = this.uu;
            if (kg != null) {
                kg.bg(z);
            }
            com.bytedance.sdk.openadsdk.tuV.bg.bg bgVar = this.sVc;
            if (bgVar != null) {
                bgVar.bg(z);
            }
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("TTPWPActivity", e.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.PX.iR
    public void bg(int i) {
        bX(i <= 0);
    }

    private void yDt() {
        com.bytedance.sdk.openadsdk.core.IL.bg bgVar = new com.bytedance.sdk.openadsdk.core.IL.bg(this, this.Ja, "embeded_ad", this.tC) { // from class: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.7
            @Override // com.bytedance.sdk.openadsdk.core.IL.bg, com.bytedance.sdk.openadsdk.core.IL.IL, com.bytedance.sdk.openadsdk.core.IL.bX
            public void bg(android.view.View view, float f, float f2, float f3, float f4, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg> sparseArray, boolean z) {
                if (this.ldr == null || this.ldr.tuV() != 1 || z) {
                    super.bg(view, f, f2, f3, f4, sparseArray, z);
                    com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.DDQ = true;
                    com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.Uq = true;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("playable_url", com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.rri);
                    } catch (org.json.JSONException e) {
                        com.bytedance.sdk.component.utils.PX.bg("TTPWPActivity", "onClick JSON ERROR", e);
                    }
                    com.bytedance.sdk.openadsdk.eqN.bX.IL(com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this.Ja, this.iR, "click_playable_download_button_loading", jSONObject);
                }
            }
        };
        bgVar.bg(this.aGH);
        com.bytedance.sdk.openadsdk.tuV.bg.bg bgVar2 = this.sVc;
        if (bgVar2 != null) {
            bgVar2.bg(bgVar);
        }
    }
}
