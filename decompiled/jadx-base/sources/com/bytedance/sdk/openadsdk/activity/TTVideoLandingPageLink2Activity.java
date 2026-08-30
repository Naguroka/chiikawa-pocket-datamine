package com.bytedance.sdk.openadsdk.activity;

/* JADX INFO: loaded from: classes4.dex */
public class TTVideoLandingPageLink2Activity extends com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity implements com.bytedance.sdk.openadsdk.eo.eqN {
    private com.bytedance.sdk.openadsdk.core.widget.PAGLogoView Dt;
    private boolean GZ;
    private com.bytedance.sdk.openadsdk.common.PX GvG;
    private android.widget.TextView Ld;
    private com.bytedance.sdk.openadsdk.core.widget.bg.zx Ny;
    com.bytedance.sdk.openadsdk.common.Lq RJ;
    private com.bytedance.sdk.openadsdk.common.eqN RiO;
    private com.bytedance.sdk.openadsdk.common.xxp Ys;
    private android.widget.TextView bCU;
    private android.widget.LinearLayout dS;
    private android.view.View gXn;
    private android.view.View lM;
    com.bytedance.sdk.openadsdk.common.TTAdDislikeToast txA;
    private long wS;
    private boolean zCS;
    private boolean cZH = false;
    final java.util.concurrent.atomic.AtomicBoolean sVc = new java.util.concurrent.atomic.AtomicBoolean(false);
    final java.util.concurrent.atomic.AtomicBoolean ApA = new java.util.concurrent.atomic.AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.yDt.zx() || this.vb == null || this.bg == null) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.common.eqN eqnBg = com.bytedance.sdk.openadsdk.utils.ayS.bg(this.vb, this.bg, this.zx, this.VW);
        this.RiO = eqnBg;
        if (eqnBg != null) {
            eqnBg.bg("landingpage_split_screen");
        }
        this.zCS = com.bytedance.sdk.openadsdk.core.VzQ.eqN().tC();
        if (this.bg.getWebView() != null) {
            this.bg.getWebView().setOnScrollChangeListener(new android.view.View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.1
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(android.view.View view, int i, int i2, int i3, int i4) {
                    if (com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.uu != null) {
                        com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.uu.IL(i2);
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.widget.bg.zx zxVar = new com.bytedance.sdk.openadsdk.core.widget.bg.zx(this.zx, this.eo, this.Kg, this.RiO, this.uu, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.7
            @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
            public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
                super.onPageFinished(webView, str);
                try {
                    if (com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.lM != null && !com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.GZ) {
                        com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.lM.setVisibility(8);
                    }
                    if (com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.dS != null) {
                        com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.dS.setVisibility(0);
                    }
                    com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.cZH = true;
                    com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.yDt();
                    com.bytedance.sdk.openadsdk.eqN.bX.bg(com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.vb, com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.VW, java.lang.System.currentTimeMillis() - com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.wS, true);
                } catch (java.lang.Throwable unused) {
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
            public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.wS = java.lang.System.currentTimeMillis();
            }
        };
        this.Ny = zxVar;
        zxVar.bg(this.vb);
        this.bg.setWebViewClient(this.Ny);
        this.bg.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.bg.eqN(this.eo, this.uu, this.RiO) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.8
            @Override // com.bytedance.sdk.openadsdk.core.widget.bg.eqN, android.webkit.WebChromeClient
            public void onProgressChanged(android.webkit.WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.zCS && com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.Ys != null && i == 100) {
                    com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.Ys.bg(webView, com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.jz);
                }
                if (com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.GvG != null) {
                    com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.GvG.bg(i);
                }
            }
        });
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.bytedance.sdk.openadsdk.utils.Ta.Hn);
        if (textView != null && this.vb.WR() != null) {
            textView.setText(this.vb.WR().zx());
        }
        com.bytedance.sdk.openadsdk.core.yDt.bX().postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.GZ = true;
                    if (com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.GvG != null) {
                        com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.GvG.IL();
                    }
                    com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.gXn.setVisibility(0);
                    if (com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.Dt != null) {
                        com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.Dt.setVisibility(0);
                    }
                    if (com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.cZH) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.eqN.bX.bg(com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.vb, com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.VW, java.lang.System.currentTimeMillis() - com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.wS, false);
                } catch (java.lang.Exception unused) {
                }
            }
        }, (this.vb == null || this.vb.WR() == null) ? 10000L : this.vb.WR().bg() * 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    protected android.view.View bg() {
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar = new com.bytedance.sdk.openadsdk.core.zx.zx(this);
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            zxVar.setFitsSystemWindows(true);
        }
        zxVar.setOrientation(1);
        zxVar.setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.zx.bX bXVar = new com.bytedance.sdk.openadsdk.core.zx.bX(this);
        zxVar.addView(bXVar, new android.widget.LinearLayout.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 220.0f)));
        com.bytedance.sdk.openadsdk.core.zx.bX bXVar2 = new com.bytedance.sdk.openadsdk.core.zx.bX(this);
        bXVar2.setId(com.bytedance.sdk.openadsdk.utils.Ta.LKE);
        bXVar.addView(bXVar2, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar2 = new com.bytedance.sdk.openadsdk.core.zx.zx(this);
        zxVar2.setOrientation(0);
        zxVar2.setPadding(0, com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 20.0f), 0, 0);
        bXVar.addView(zxVar2, new android.widget.FrameLayout.LayoutParams(-1, -2));
        android.view.View view = new android.view.View(this);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        zxVar2.addView(view, layoutParams);
        com.bytedance.sdk.openadsdk.core.widget.Lq lq = new com.bytedance.sdk.openadsdk.core.widget.Lq(this);
        lq.setId(520093713);
        lq.setGravity(17);
        lq.setText(com.bytedance.sdk.component.utils.Fy.bg(this, "tt_reward_feedback"));
        lq.setTextColor(-1);
        lq.setTextSize(2, 14.0f);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 28.0f));
        int iBX = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 16.0f);
        layoutParams2.rightMargin = iBX;
        layoutParams2.leftMargin = iBX;
        zxVar2.addView(lq, layoutParams2);
        com.bytedance.sdk.openadsdk.core.widget.yDt ydt = new com.bytedance.sdk.openadsdk.core.widget.yDt(this);
        ydt.setId(com.bytedance.sdk.openadsdk.utils.Ta.CQc);
        ydt.setPadding(com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 7.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 7.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 7.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 7.0f));
        ydt.setImageResource(com.bytedance.sdk.component.utils.Fy.eqN(this, "tt_video_close_drawable"));
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 28.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 28.0f));
        layoutParams3.rightMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 12.0f);
        zxVar2.addView(ydt, layoutParams3);
        com.bytedance.sdk.openadsdk.core.zx.iR iRVar = new com.bytedance.sdk.openadsdk.core.zx.iR(this);
        iRVar.setVisibility(8);
        iRVar.setId(com.bytedance.sdk.openadsdk.utils.Ta.uu);
        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 10.0f);
        zxVar.addView(iRVar, layoutParams4);
        com.bytedance.sdk.openadsdk.core.widget.bg bgVar = new com.bytedance.sdk.openadsdk.core.widget.bg(this);
        bgVar.setId(com.bytedance.sdk.openadsdk.utils.Ta.qC);
        bgVar.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        bgVar.setVisibility(8);
        android.widget.RelativeLayout.LayoutParams layoutParams5 = new android.widget.RelativeLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 44.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 44.0f));
        layoutParams5.addRule(9);
        layoutParams5.leftMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 5.0f);
        iRVar.addView(bgVar, layoutParams5);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg = new com.bytedance.sdk.openadsdk.core.zx.Kg(this);
        kg.setId(com.bytedance.sdk.openadsdk.utils.Ta.Dxa);
        kg.setBackground(com.bytedance.sdk.openadsdk.utils.Kg.bg(this, "tt_circle_solid_mian"));
        kg.setGravity(17);
        kg.setTextColor(-1);
        kg.setTextSize(2, 19.0f);
        kg.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        android.widget.RelativeLayout.LayoutParams layoutParams6 = new android.widget.RelativeLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 44.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 44.0f));
        layoutParams6.addRule(9);
        layoutParams6.leftMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 5.0f);
        iRVar.addView(kg, layoutParams6);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg2 = new com.bytedance.sdk.openadsdk.core.zx.Kg(this);
        kg2.setId(com.bytedance.sdk.openadsdk.utils.Ta.bN);
        kg2.setMaxLines(1);
        kg2.setEllipsize(android.text.TextUtils.TruncateAt.END);
        kg2.setTextColor(android.graphics.Color.parseColor("#e5000000"));
        kg2.setTextSize(2, 12.0f);
        android.widget.RelativeLayout.LayoutParams layoutParams7 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(15);
        layoutParams7.leftMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 5.0f);
        layoutParams7.rightMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 80.0f);
        layoutParams7.addRule(1, com.bytedance.sdk.openadsdk.utils.Ta.Dxa);
        iRVar.addView(kg2, layoutParams7);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg3 = new com.bytedance.sdk.openadsdk.core.zx.Kg(this);
        kg3.setId(com.bytedance.sdk.openadsdk.utils.Ta.jz);
        kg3.setClickable(true);
        kg3.setMaxLines(1);
        kg3.setEllipsize(android.text.TextUtils.TruncateAt.END);
        kg3.setFocusable(true);
        kg3.setGravity(17);
        kg3.setText(com.bytedance.sdk.component.utils.Fy.bg(this, "tt_video_mobile_go_detail"));
        kg3.setTextColor(-1);
        kg3.setTextSize(2, 14.0f);
        kg3.setPadding(com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 2.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 2.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 2.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 2.0f));
        kg3.setBackground(com.bytedance.sdk.openadsdk.utils.Kg.bg(this, "tt_ad_cover_btn_begin_bg"));
        android.widget.RelativeLayout.LayoutParams layoutParams8 = new android.widget.RelativeLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 90.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 36.0f));
        layoutParams8.addRule(11);
        layoutParams8.addRule(15);
        layoutParams8.rightMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 5.0f);
        iRVar.addView(kg3, layoutParams8);
        com.bytedance.sdk.openadsdk.core.zx.bX bXVar3 = new com.bytedance.sdk.openadsdk.core.zx.bX(this);
        zxVar.addView(bXVar3, new android.widget.LinearLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.component.WR.eqN eqn = new com.bytedance.sdk.component.WR.eqN(this);
        eqn.setId(com.bytedance.sdk.openadsdk.utils.Ta.Pae);
        android.widget.FrameLayout.LayoutParams layoutParams9 = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams9.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 2.0f);
        bXVar3.addView(eqn, layoutParams9);
        com.bytedance.sdk.openadsdk.core.zx.iR iRVar2 = new com.bytedance.sdk.openadsdk.core.zx.iR(this);
        iRVar2.setId(com.bytedance.sdk.openadsdk.utils.Ta.RJ);
        iRVar2.setBackgroundColor(android.graphics.Color.parseColor("#F8F8F8"));
        bXVar3.addView(iRVar2, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.common.PX px = new com.bytedance.sdk.openadsdk.common.PX(this);
        px.setId(com.bytedance.sdk.openadsdk.utils.Ta.txA);
        iRVar2.addView(px, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.zx.zx zxVar3 = new com.bytedance.sdk.openadsdk.core.zx.zx(this);
        zxVar3.setId(com.bytedance.sdk.openadsdk.utils.Ta.ZQc);
        zxVar3.setOrientation(1);
        zxVar3.setVisibility(8);
        android.widget.RelativeLayout.LayoutParams layoutParams10 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams10.addRule(13);
        iRVar2.addView(zxVar3, layoutParams10);
        com.bytedance.sdk.openadsdk.core.widget.VzQ vzQ = new com.bytedance.sdk.openadsdk.core.widget.VzQ(this);
        vzQ.setId(com.bytedance.sdk.openadsdk.utils.Ta.sVc);
        android.widget.LinearLayout.LayoutParams layoutParams11 = new android.widget.LinearLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 80.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 80.0f));
        layoutParams11.gravity = 17;
        zxVar3.addView(vzQ, layoutParams11);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg4 = new com.bytedance.sdk.openadsdk.core.zx.Kg(this);
        kg4.setId(com.bytedance.sdk.openadsdk.utils.Ta.ApA);
        kg4.setTextColor(android.graphics.Color.parseColor("#161823"));
        kg4.setTextSize(0, com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 24.0f));
        android.widget.LinearLayout.LayoutParams layoutParams12 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams12.gravity = 17;
        layoutParams12.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 12.0f);
        zxVar3.addView(kg4, layoutParams12);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg5 = new com.bytedance.sdk.openadsdk.core.zx.Kg(this);
        kg5.setId(com.bytedance.sdk.openadsdk.utils.Ta.GvG);
        kg5.setTextColor(android.graphics.Color.parseColor("#80161823"));
        kg5.setTextSize(0, com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 16.0f));
        kg5.setTextAlignment(4);
        android.widget.LinearLayout.LayoutParams layoutParams13 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams13.gravity = 17;
        int iBX2 = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 60.0f);
        layoutParams13.rightMargin = iBX2;
        layoutParams13.leftMargin = iBX2;
        layoutParams13.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 8.0f);
        zxVar3.addView(kg5, layoutParams13);
        com.bytedance.sdk.openadsdk.core.zx.Kg kg6 = new com.bytedance.sdk.openadsdk.core.zx.Kg(this);
        kg6.setId(com.bytedance.sdk.openadsdk.utils.Ta.lM);
        kg6.setGravity(17);
        kg6.setTextColor(-1);
        kg6.setText(com.bytedance.sdk.component.utils.Fy.bg(this, "tt_video_mobile_go_detail"));
        kg6.setBackground(com.bytedance.sdk.openadsdk.utils.Kg.bg(this, "tt_reward_video_download_btn_bg"));
        android.widget.LinearLayout.LayoutParams layoutParams14 = new android.widget.LinearLayout.LayoutParams(com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 255.0f), com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 44.0f));
        layoutParams14.gravity = 17;
        layoutParams14.topMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 32.0f);
        zxVar3.addView(kg6, layoutParams14);
        com.bytedance.sdk.openadsdk.core.widget.PAGLogoView pAGLogoView = new com.bytedance.sdk.openadsdk.core.widget.PAGLogoView(this);
        this.Dt = pAGLogoView;
        pAGLogoView.setId(com.bytedance.sdk.openadsdk.utils.Ta.gXn);
        this.Dt.setVisibility(8);
        android.widget.RelativeLayout.LayoutParams layoutParams15 = new android.widget.RelativeLayout.LayoutParams(-2, com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 14.0f));
        layoutParams15.addRule(12);
        layoutParams15.leftMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 18.0f);
        layoutParams15.bottomMargin = com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 61.0f);
        iRVar2.addView(this.Dt, layoutParams15);
        com.bytedance.sdk.openadsdk.common.yDt ydt2 = new com.bytedance.sdk.openadsdk.common.yDt(this, new com.bytedance.sdk.openadsdk.common.yDt.bg() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.10
            @Override // com.bytedance.sdk.openadsdk.common.yDt.bg
            public android.view.View bg(android.content.Context context) {
                return new com.bytedance.sdk.openadsdk.common.iR(context);
            }
        });
        ydt2.setId(com.bytedance.sdk.openadsdk.utils.Ta.GZ);
        android.widget.FrameLayout.LayoutParams layoutParams16 = new android.widget.FrameLayout.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 48.0f));
        layoutParams16.gravity = 81;
        bXVar3.addView(ydt2, layoutParams16);
        com.bytedance.sdk.openadsdk.common.yDt ydt3 = new com.bytedance.sdk.openadsdk.common.yDt(this, new com.bytedance.sdk.openadsdk.common.yDt.bg() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.11
            @Override // com.bytedance.sdk.openadsdk.common.yDt.bg
            public android.view.View bg(android.content.Context context) {
                return new com.bytedance.sdk.openadsdk.common.Kg(context);
            }
        });
        ydt3.setId(com.bytedance.sdk.openadsdk.utils.Ta.bCU);
        android.widget.FrameLayout.LayoutParams layoutParams17 = new android.widget.FrameLayout.LayoutParams(-1, com.bytedance.sdk.openadsdk.utils.ZQc.bX(this, 44.0f));
        layoutParams17.gravity = 80;
        bXVar3.addView(ydt3, layoutParams17);
        return zxVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    protected void bX() {
        super.bX();
        android.widget.TextView textView = (android.widget.TextView) findViewById(520093713);
        if (textView != null) {
            textView.setText(com.bytedance.sdk.component.utils.Fy.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), "tt_reward_feedback"));
            textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.12
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.PX();
                }
            });
        }
        this.bCU = (android.widget.TextView) findViewById(520093714);
        this.GvG = (com.bytedance.sdk.openadsdk.common.PX) findViewById(com.bytedance.sdk.openadsdk.utils.Ta.txA);
        this.lM = findViewById(com.bytedance.sdk.openadsdk.utils.Ta.RJ);
        this.gXn = findViewById(com.bytedance.sdk.openadsdk.utils.Ta.ZQc);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.bytedance.sdk.openadsdk.utils.Ta.ApA);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.bytedance.sdk.openadsdk.utils.Ta.GvG);
        com.bytedance.sdk.openadsdk.core.widget.VzQ vzQ = (com.bytedance.sdk.openadsdk.core.widget.VzQ) findViewById(com.bytedance.sdk.openadsdk.utils.Ta.sVc);
        this.Ld = (android.widget.TextView) findViewById(com.bytedance.sdk.openadsdk.utils.Ta.lM);
        if (this.vb.sVc() != null && !android.text.TextUtils.isEmpty(this.vb.sVc().bg())) {
            com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(this.vb.sVc(), vzQ, this.vb);
        }
        textView2.setText(this.vb.bN());
        textView3.setText(this.vb.cZH());
        findViewById(com.bytedance.sdk.openadsdk.utils.Ta.gXn).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.13
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.bg(com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.zx, com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.vb, com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.VW);
            }
        });
        if (this.bg != null && this.bg.getWebView() != null) {
            com.bytedance.sdk.openadsdk.utils.ayS.bg(this.vb, this.bg);
        }
        boolean zTC = com.bytedance.sdk.openadsdk.core.VzQ.eqN().tC();
        this.zCS = zTC;
        if (zTC) {
            ((com.bytedance.sdk.openadsdk.common.yDt) findViewById(com.bytedance.sdk.openadsdk.utils.Ta.bCU)).setVisibility(0);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.bytedance.sdk.openadsdk.utils.Ta.bOf);
            this.dS = linearLayout;
            linearLayout.setVisibility(8);
            this.Ys = new com.bytedance.sdk.openadsdk.common.xxp(this, this.dS, this.bg, this.vb, "landingpage_split_screen");
            if (this.bg.getWebView() != null) {
                this.bg.getWebView().setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.14
                    float bg = 0.0f;

                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            this.bg = motionEvent.getY();
                        }
                        if (com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.uu != null) {
                            com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.uu.bg(motionEvent);
                        }
                        if (com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.RiO != null) {
                            com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.RiO.bg(motionEvent);
                        }
                        if (motionEvent.getAction() == 2) {
                            float y = motionEvent.getY();
                            float f = this.bg;
                            if (y - f > 8.0f) {
                                if (com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.Ys != null) {
                                    com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.Ys.bg();
                                }
                                return false;
                            }
                            if (y - f < -8.0f && com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.Ys != null) {
                                com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.Ys.IL();
                            }
                        }
                        return false;
                    }
                });
            }
        } else if (this.bg.getWebView() != null) {
            this.bg.getWebView().setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.2
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    if (com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.uu != null) {
                        com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.uu.bg(motionEvent);
                    }
                    if (com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.RiO == null) {
                        return false;
                    }
                    com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.RiO.bg(motionEvent);
                    return false;
                }
            });
        }
        com.bytedance.sdk.openadsdk.common.PX px = this.GvG;
        if (px != null) {
            px.bg(this.vb);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ta() {
        com.bytedance.sdk.openadsdk.eqN.bX.bg(this.vb, "landingpage_split_screen", "click_video", (org.json.JSONObject) null);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.sdk.openadsdk.common.PX px = this.GvG;
        if (px != null) {
            px.bg();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    protected void eqN() {
        if (zx()) {
            super.eqN();
            if (this.yDt != null) {
                if (this.yDt.getNativeVideoController() != null) {
                    this.yDt.getNativeVideoController().bg(false);
                    ((com.bytedance.sdk.openadsdk.core.Ta.IL.bX) this.yDt.getNativeVideoController()).iR(false);
                    this.PX.setClickable(true);
                    this.PX.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.3
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                            if (motionEvent.getAction() != 0) {
                                return false;
                            }
                            com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.Ta();
                            return false;
                        }
                    });
                }
                this.yDt.getNativeVideoController().bg(new com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.4
                    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
                    public void IL(long j, int i) {
                    }

                    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
                    public void bg() {
                    }

                    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
                    public void bg(long j, int i) {
                    }

                    @Override // com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
                    public void bg(long j, long j2) {
                        if (com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.bCU != null) {
                            int iMax = (int) java.lang.Math.max(0L, (j2 - j) / 1000);
                            com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.bCU.setText(java.lang.String.valueOf(iMax));
                            if (iMax <= 0) {
                                com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.bCU.setVisibility(8);
                            }
                        }
                    }
                });
                return;
            }
            return;
        }
        try {
            android.widget.ImageView imageView = new android.widget.ImageView(this);
            imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(this.vb.lM().get(0), imageView, this.vb);
            this.PX.setVisibility(0);
            this.PX.removeAllViews();
            this.PX.addView(imageView);
            imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.5
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    com.bytedance.sdk.openadsdk.eqN.bX.IL(com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.vb, "landingpage_split_screen");
                }
            });
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    protected boolean zx() {
        return this.Ta == 5 || this.Ta == 15 || this.Ta == 50;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    public void WR() {
        super.WR();
        if (this.vb != null) {
            this.vb.ldr(true);
        }
        android.widget.TextView textView = this.Ld;
        if (textView != null) {
            textView.setText(IL());
            this.Ld.setClickable(true);
            this.Ld.setOnClickListener(this.Pae);
            this.Ld.setOnTouchListener(this.Pae);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yDt() {
        com.bytedance.sdk.openadsdk.common.PX px = this.GvG;
        if (px != null) {
            px.IL();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity, android.app.Activity
    protected void onDestroy() {
        yDt();
        if (!this.GZ && this.uu != null && this.bg != null && this.GvG.getVisibility() == 8) {
            this.uu.bg(this.bg);
        }
        super.onDestroy();
    }

    private void Lq() {
        com.bytedance.sdk.openadsdk.common.TTAdDislikeToast tTAdDislikeToast = this.txA;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getDislikeTip());
    }

    protected void PX() {
        if (isFinishing()) {
            return;
        }
        if (this.ApA.get()) {
            Lq();
            return;
        }
        if (this.RJ == null) {
            vb();
        }
        com.bytedance.sdk.openadsdk.common.Lq lq = this.RJ;
        if (lq != null) {
            lq.bg();
        }
    }

    private void vb() {
        try {
            if (this.RJ == null) {
                com.bytedance.sdk.openadsdk.common.Lq lq = new com.bytedance.sdk.openadsdk.common.Lq(this.zx, this.vb);
                this.RJ = lq;
                lq.setDislikeSource("landing_page");
                this.RJ.setCallback(new com.bytedance.sdk.openadsdk.common.Lq.bg() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.6
                    @Override // com.bytedance.sdk.openadsdk.common.Lq.bg
                    public void bg(android.view.View view) {
                        com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.sVc.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.Lq.bg
                    public void IL(android.view.View view) {
                        com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.sVc.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.Lq.bg
                    public void bg(com.bytedance.sdk.openadsdk.FilterWord filterWord) {
                        if (com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.ApA.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.ApA.set(true);
                        com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.this.xxp();
                    }
                });
            }
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(android.R.id.content);
            frameLayout.addView(this.RJ);
            if (this.txA == null) {
                com.bytedance.sdk.openadsdk.common.TTAdDislikeToast tTAdDislikeToast = new com.bytedance.sdk.openadsdk.common.TTAdDislikeToast(this.zx);
                this.txA = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.ApmHelper.reportCustomError("initDislike error", "TTVideoLandingPageLink2Activity", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xxp() {
        com.bytedance.sdk.openadsdk.common.TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.txA) == null) {
            return;
        }
        tTAdDislikeToast.show(com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getDislikeSendTip());
    }
}
