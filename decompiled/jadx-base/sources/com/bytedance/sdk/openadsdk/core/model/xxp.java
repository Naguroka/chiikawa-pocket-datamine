package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: loaded from: classes4.dex */
public class xxp implements android.os.Handler.Callback {
    private int ApA;
    private com.bytedance.sdk.openadsdk.eqN.VB CQc;
    private android.view.View DDQ;
    private boolean Dxa;
    private com.bytedance.sdk.openadsdk.core.widget.VzQ Fy;
    private int GvG;
    android.widget.FrameLayout IL;
    private com.bytedance.sdk.openadsdk.common.PX JAA;
    private android.view.View Ja;
    android.widget.FrameLayout Kg;
    private com.bytedance.sdk.openadsdk.VzQ.bg.bg.ldr LKE;
    private android.widget.TextView LZ;
    private android.os.Handler Lq;
    com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg PX;
    private com.bykv.vk.openvk.preload.falconx.loader.ILoader Pae;
    com.bytedance.sdk.openadsdk.core.IL.bg Ta;
    private long Uq;
    private android.widget.ImageView Uw;
    android.animation.ObjectAnimator VB;
    private java.lang.String VJ;
    private final android.app.Activity VW;
    private android.widget.TextView VzQ;
    android.animation.ObjectAnimator WR;
    private int ZQc;
    private final android.view.View ayS;
    private com.bytedance.sdk.openadsdk.core.widget.bg.zx bN;
    android.widget.TextView bX;
    android.widget.ImageView bg;
    private final com.bytedance.sdk.openadsdk.core.Ta.eqN.IL daV;
    android.animation.ObjectAnimator eo;
    android.widget.FrameLayout eqN;
    final com.bytedance.sdk.openadsdk.core.model.tuV iR;
    private java.lang.String jz;
    private android.widget.FrameLayout kMt;
    private com.bytedance.sdk.openadsdk.common.eqN lM;
    android.widget.RelativeLayout ldr;
    private com.bytedance.sdk.component.WR.eqN rri;
    private com.bytedance.sdk.openadsdk.core.aGH tC;
    private android.widget.TextView tuV;
    private boolean uu;
    private android.view.View vb;
    private android.view.View xxp;
    com.bytedance.sdk.openadsdk.core.IL.IL yDt;
    android.view.View zx;
    private final java.util.concurrent.atomic.AtomicBoolean aGH = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicBoolean qC = new java.util.concurrent.atomic.AtomicBoolean(false);
    private volatile int RJ = 0;
    private volatile int txA = 0;
    private volatile int sVc = 0;

    static /* synthetic */ int PX(com.bytedance.sdk.openadsdk.core.model.xxp xxpVar) {
        int i = xxpVar.txA;
        xxpVar.txA = i + 1;
        return i;
    }

    static /* synthetic */ int Ta(com.bytedance.sdk.openadsdk.core.model.xxp xxpVar) {
        int i = xxpVar.sVc;
        xxpVar.sVc = i + 1;
        return i;
    }

    static /* synthetic */ int eo(com.bytedance.sdk.openadsdk.core.model.xxp xxpVar) {
        int i = xxpVar.RJ;
        xxpVar.RJ = i + 1;
        return i;
    }

    public xxp(android.app.Activity activity, final com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, android.widget.FrameLayout frameLayout, com.bytedance.sdk.openadsdk.core.Ta.eqN.IL il, android.view.View view) {
        this.VW = activity;
        this.iR = tuv;
        this.VJ = str;
        this.daV = il;
        this.ayS = view;
        this.ZQc = com.bytedance.sdk.openadsdk.utils.ayS.bg(str);
        if (tuv != null) {
            this.jz = tuv.qp();
        }
        if (!android.text.TextUtils.isEmpty(this.jz)) {
            this.Pae = com.bytedance.sdk.openadsdk.iR.IL.bg().IL();
            int iBg = com.bytedance.sdk.openadsdk.iR.IL.bg().bg(this.Pae, this.jz);
            this.ApA = iBg;
            this.GvG = iBg > 0 ? 2 : 0;
        }
        boolean zBX = bX(tuv);
        boolean zEqN = eqN(tuv);
        if (IL(tuv)) {
            this.VJ = "landingpage_split_screen";
        } else if (zBX) {
            this.VJ = "landingpage_direct";
        } else if (zEqN) {
            this.VJ = "aggregate_page";
        }
        this.Ta = new com.bytedance.sdk.openadsdk.core.IL.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), tuv, this.VJ, com.bytedance.sdk.openadsdk.utils.ayS.bg(str));
        java.util.HashMap map = new java.util.HashMap();
        map.put("click_scence", 1);
        this.Ta.bg(map);
        android.view.View viewFindViewById = activity.findViewById(android.R.id.content);
        this.Ta.bg(viewFindViewById);
        com.bytedance.sdk.openadsdk.core.IL.IL il2 = new com.bytedance.sdk.openadsdk.core.IL.IL(activity, tuv, this.VJ, com.bytedance.sdk.openadsdk.utils.ayS.bg(str), true) { // from class: com.bytedance.sdk.openadsdk.core.model.xxp.1
            @Override // com.bytedance.sdk.openadsdk.core.IL.IL
            public boolean bg(com.bytedance.sdk.openadsdk.core.model.eo eoVar, java.util.Map<java.lang.String, java.lang.Object> map2) {
                if (com.bytedance.sdk.openadsdk.core.model.xxp.iR(tuv) && com.bytedance.sdk.openadsdk.core.model.xxp.this.bN != null) {
                    com.bytedance.sdk.openadsdk.core.model.xxp.this.bN.bg(eoVar);
                    com.bytedance.sdk.openadsdk.core.model.xxp.this.bN.bg(map2);
                    if (com.bytedance.sdk.openadsdk.core.model.xxp.ldr(com.bytedance.sdk.openadsdk.core.model.xxp.this.iR) || com.bytedance.sdk.openadsdk.core.model.xxp.this.Dxa) {
                        return true;
                    }
                }
                return super.bg(eoVar, map2);
            }
        };
        this.yDt = il2;
        il2.bg(map);
        this.yDt.bg(viewFindViewById);
        this.Kg = frameLayout;
        if (zBX || zEqN) {
            try {
                android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper(), this);
                this.Lq = handler;
                handler.sendMessage(handler.obtainMessage(100, 0, 0));
            } catch (java.lang.Exception e) {
                android.util.Log.e("LandingPageModel", "LandingPageModel: ", e);
            }
        }
    }

    public void bg(com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg bgVar) {
        this.PX = bgVar;
    }

    public void bg() {
        long jBg;
        android.view.View view;
        java.lang.Long lValueOf = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
        com.bytedance.sdk.component.WR.eqN eqn = (com.bytedance.sdk.component.WR.eqN) this.ayS.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.LZ);
        this.rri = eqn;
        if (eqn != null && !com.bytedance.sdk.openadsdk.core.model.tuV.bg(this.iR)) {
            this.rri.f_();
        } else {
            com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.view.View) this.rri, 8);
        }
        this.kMt = (android.widget.FrameLayout) this.ayS.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.Fy);
        this.JAA = (com.bytedance.sdk.openadsdk.common.PX) this.ayS.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.JAA);
        this.Ja = this.ayS.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.tC);
        this.Uw = (android.widget.ImageView) this.ayS.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.rri);
        this.DDQ = this.ayS.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.daV);
        this.IL = (android.widget.FrameLayout) this.ayS.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.VzQ);
        this.bg = (android.widget.ImageView) this.ayS.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.tuV);
        this.ldr = (android.widget.RelativeLayout) this.ayS.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.kMt);
        this.bX = (android.widget.TextView) this.ayS.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.Hn);
        this.eqN = (android.widget.FrameLayout) this.ayS.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.eo);
        android.view.View viewFindViewById = this.ayS.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.Ja);
        this.vb = viewFindViewById;
        if (viewFindViewById == null) {
            this.vb = this.ayS.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.ZQc);
        }
        this.xxp = this.VW.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.Uw);
        this.VzQ = (android.widget.TextView) this.ayS.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.Uq);
        this.tuV = (android.widget.TextView) this.ayS.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.aGH);
        this.Fy = (com.bytedance.sdk.openadsdk.core.widget.VzQ) this.ayS.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.DDQ);
        this.LZ = (android.widget.TextView) this.ayS.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.VW);
        if (this.bX != null && this.iR.WR() != null) {
            this.bX.setText(this.iR.WR().zx());
        }
        this.zx = this.ayS.findViewById(com.bytedance.sdk.openadsdk.utils.Ta.VJ);
        if ((bX(this.iR) || IL(this.iR) || eqN(this.iR)) && this.iR.WR() != null) {
            android.view.View view2 = this.zx;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            if (eqN(this.iR)) {
                jBg = this.iR.WR().bX();
            } else {
                jBg = this.iR.WR().bg();
            }
            com.bytedance.sdk.openadsdk.core.yDt.bX().postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.xxp.6
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.openadsdk.core.model.xxp.this.aGH.get()) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.eqN.bX.bg(com.bytedance.sdk.openadsdk.core.model.xxp.this.iR, com.bytedance.sdk.openadsdk.core.model.xxp.this.VJ, java.lang.System.currentTimeMillis() - com.bytedance.sdk.openadsdk.core.model.xxp.this.Uq, false);
                    com.bytedance.sdk.openadsdk.core.model.xxp.this.PX();
                }
            }, jBg * 1000);
        }
        Kg();
        if (IL(this.iR)) {
            yDt();
            if (!bX()) {
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.kMt.getLayoutParams();
                layoutParams.weight = 2.33f;
                this.kMt.setLayoutParams(layoutParams);
            }
        }
        if ((bX(this.iR) || eqN(this.iR)) && (view = this.DDQ) != null) {
            view.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.common.PX px = this.JAA;
        if (px != null) {
            px.bg(this.iR);
        }
        com.bytedance.sdk.openadsdk.eqN.bX.bg.bg(android.os.SystemClock.elapsedRealtime() - lValueOf.longValue(), this.iR, this.VJ, this.Pae, this.jz);
    }

    private void Kg() {
        com.bytedance.sdk.openadsdk.common.PX px;
        com.bytedance.sdk.component.WR.eqN eqn = this.rri;
        if (eqn != null && eqn.getWebView() != null) {
            com.bytedance.sdk.openadsdk.core.widget.bg.bX.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()).bg(false).IL(false).bg(this.rri.getWebView());
            com.bytedance.sdk.component.WR.eqN eqn2 = this.rri;
            if (eqn2 != null && eqn2.getWebView() != null) {
                com.bytedance.sdk.openadsdk.eqN.VB vbBg = new com.bytedance.sdk.openadsdk.eqN.VB(this.iR, this.rri.getWebView(), new com.bytedance.sdk.openadsdk.core.model.xxp.IL(this.ApA, this.iR, this.VJ, this), this.GvG).bg(true);
                this.CQc = vbBg;
                vbBg.bg(this.VJ);
                com.bytedance.sdk.openadsdk.common.eqN eqnBg = com.bytedance.sdk.openadsdk.utils.ayS.bg(this.iR, this.rri, this.VW, this.VJ);
                this.lM = eqnBg;
                if (eqnBg != null) {
                    eqnBg.bg(this.VJ);
                }
                com.bytedance.sdk.openadsdk.utils.ayS.bg(this.iR, this.rri);
            }
            WR();
            this.rri.setLandingPage(true);
            this.rri.setTag(this.VJ);
            this.rri.setMaterialMeta(this.iR.mLT());
            com.bytedance.sdk.openadsdk.core.widget.bg.zx zxVar = new com.bytedance.sdk.openadsdk.core.widget.bg.zx(com.bytedance.sdk.openadsdk.core.VzQ.bg(), this.tC, this.iR.Ys(), this.lM, this.CQc, true) { // from class: com.bytedance.sdk.openadsdk.core.model.xxp.7
                @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
                public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
                    super.onPageFinished(webView, str);
                    com.bytedance.sdk.openadsdk.core.model.xxp.this.eo();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
                public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    com.bytedance.sdk.openadsdk.core.model.xxp.this.daV.VB();
                    com.bytedance.sdk.openadsdk.core.model.xxp.this.Uq = java.lang.System.currentTimeMillis();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
                public void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    java.lang.String strEqN = eqN(str2);
                    if (this.ldr != null) {
                        this.ldr.bg(webView, i, str, str2, eqN(str2), (webView == null || str2 == null || !str2.equals(webView.getUrl())) ? false : true);
                    }
                    boolean z = strEqN != null && strEqN.startsWith("image");
                    boolean z2 = strEqN != null && strEqN.startsWith("mp4");
                    if (z || z2 || com.bytedance.sdk.openadsdk.core.model.xxp.this.aGH.get()) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.core.model.xxp.this.PX();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
                public void onReceivedSslError(android.webkit.WebView webView, android.webkit.SslErrorHandler sslErrorHandler, android.net.http.SslError sslError) {
                    if (sslErrorHandler != null) {
                        com.bytedance.sdk.openadsdk.core.model.xxp.this.PX();
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.bg.zx, android.webkit.WebViewClient
                public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, java.lang.String str) {
                    try {
                        if (android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.xxp.this.jz)) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        com.bytedance.sdk.openadsdk.core.model.xxp.eo(com.bytedance.sdk.openadsdk.core.model.xxp.this);
                        com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel webResourceResponseModelBg = com.bytedance.sdk.openadsdk.iR.IL.bg().bg(com.bytedance.sdk.openadsdk.core.model.xxp.this.Pae, com.bytedance.sdk.openadsdk.core.model.xxp.this.jz, str);
                        if (webResourceResponseModelBg != null && webResourceResponseModelBg.getWebResourceResponse() != null) {
                            com.bytedance.sdk.openadsdk.core.model.xxp.PX(com.bytedance.sdk.openadsdk.core.model.xxp.this);
                            return webResourceResponseModelBg.getWebResourceResponse();
                        }
                        if (webResourceResponseModelBg != null && webResourceResponseModelBg.getMsg() == 2) {
                            com.bytedance.sdk.openadsdk.core.model.xxp.Ta(com.bytedance.sdk.openadsdk.core.model.xxp.this);
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (java.lang.Throwable th) {
                        com.bytedance.sdk.component.utils.PX.bg("LandingPageModel", "shouldInterceptRequest url error", th);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }
            };
            this.bN = zxVar;
            this.rri.setWebViewClient(zxVar);
            this.bN.bg(this.iR);
            this.bN.bg(this.VJ);
            this.rri.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.bg.eqN(this.tC, this.CQc, this.lM) { // from class: com.bytedance.sdk.openadsdk.core.model.xxp.8
                @Override // com.bytedance.sdk.openadsdk.core.widget.bg.eqN, android.webkit.WebChromeClient
                public void onProgressChanged(android.webkit.WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    if (com.bytedance.sdk.openadsdk.core.model.xxp.this.VW != null && !com.bytedance.sdk.openadsdk.core.model.xxp.this.VW.isFinishing() && i == 100) {
                        com.bytedance.sdk.openadsdk.core.model.xxp.this.eo();
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.xxp.this.JAA != null) {
                        com.bytedance.sdk.openadsdk.core.model.xxp.this.JAA.bg(i);
                    }
                }
            });
            if (this.LKE == null) {
                this.LKE = com.bytedance.sdk.openadsdk.VzQ.bg.bg.iR.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), this.iR, this.VJ);
            }
            this.rri.setDownloadListener(new android.webkit.DownloadListener() { // from class: com.bytedance.sdk.openadsdk.core.model.xxp.9
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j) {
                    if (com.bytedance.sdk.openadsdk.core.model.xxp.this.LKE != null) {
                        com.bytedance.sdk.openadsdk.core.model.xxp.this.LKE.eqN();
                    }
                }
            });
            com.bytedance.sdk.component.WR.eqN eqn3 = this.rri;
            eqn3.setUserAgentString(com.bytedance.sdk.openadsdk.utils.xxp.bg(eqn3.getWebView(), com.bytedance.sdk.openadsdk.BuildConfig.VERSION_CODE));
            this.rri.setMixedContentMode(0);
            this.rri.getWebView().setOnScrollChangeListener(new android.view.View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.model.xxp.10
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(android.view.View view, int i, int i2, int i3, int i4) {
                    if (com.bytedance.sdk.openadsdk.core.model.xxp.this.CQc != null) {
                        com.bytedance.sdk.openadsdk.core.model.xxp.this.CQc.IL(i2);
                    }
                }
            });
            this.rri.getWebView().setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.xxp.11
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    if ((!com.bytedance.sdk.openadsdk.core.model.xxp.this.Dxa || com.bytedance.sdk.openadsdk.core.model.xxp.iR(com.bytedance.sdk.openadsdk.core.model.xxp.this.iR)) && !com.bytedance.sdk.openadsdk.core.model.xxp.eqN(com.bytedance.sdk.openadsdk.core.model.xxp.this.iR)) {
                        com.bytedance.sdk.openadsdk.core.model.xxp.this.yDt.onTouch(view, motionEvent);
                    }
                    if ((!com.bytedance.sdk.openadsdk.core.model.xxp.this.Dxa || com.bytedance.sdk.openadsdk.core.model.xxp.iR(com.bytedance.sdk.openadsdk.core.model.xxp.this.iR)) && !com.bytedance.sdk.openadsdk.core.model.xxp.eqN(com.bytedance.sdk.openadsdk.core.model.xxp.this.iR) && motionEvent.getAction() == 1 && com.bytedance.sdk.openadsdk.core.model.xxp.this.yDt.iR()) {
                        com.bytedance.sdk.openadsdk.core.model.xxp.this.rri.getWebView().performClick();
                        com.bytedance.sdk.openadsdk.core.model.xxp.this.Dxa = true;
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.xxp.this.CQc != null) {
                        com.bytedance.sdk.openadsdk.core.model.xxp.this.CQc.bg(motionEvent);
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.xxp.this.lM == null) {
                        return false;
                    }
                    com.bytedance.sdk.openadsdk.core.model.xxp.this.lM.bg(motionEvent);
                    return false;
                }
            });
            this.rri.getWebView().setOnClickListener(this.yDt);
            com.bytedance.sdk.openadsdk.eqN.bX.bg(this.iR, this.VJ, this.GvG);
            com.bytedance.sdk.openadsdk.utils.tuV.bg(this.rri, this.iR.GvG());
            this.uu = true;
        }
        if (this.rri == null || (px = this.JAA) == null) {
            return;
        }
        px.bg();
    }

    public static class IL implements com.bytedance.sdk.openadsdk.eqN.eo {
        private final com.bytedance.sdk.openadsdk.core.model.tuV IL;
        private final java.lang.String bX;
        private final int bg;
        private final java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.core.model.xxp> eqN;

        public IL(int i, com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, com.bytedance.sdk.openadsdk.core.model.xxp xxpVar) {
            this.bg = i;
            this.IL = tuv;
            this.bX = str;
            this.eqN = new java.lang.ref.WeakReference<>(xxpVar);
        }

        @Override // com.bytedance.sdk.openadsdk.eqN.eo
        public void bg(int i) {
            com.bytedance.sdk.openadsdk.core.model.xxp xxpVar = this.eqN.get();
            if (xxpVar != null) {
                com.bytedance.sdk.openadsdk.eqN.bX.bg.bg(this.bg, xxpVar.sVc, xxpVar.txA, xxpVar.RJ - xxpVar.txA, this.IL, this.bX, i);
            }
        }
    }

    private void WR() {
        com.bytedance.sdk.openadsdk.core.aGH agh = new com.bytedance.sdk.openadsdk.core.aGH(this.VW);
        this.tC = agh;
        agh.IL(this.rri).bX(this.iR.Ys()).eqN(this.iR.Ny()).bg(this.iR).IL(eqN(this.iR) ? this.ZQc : -1).bg(this.iR.ZQc()).IL(this.VJ).zx(this.iR.PC()).bg(this.rri).bg(new com.bytedance.sdk.openadsdk.core.widget.ldr() { // from class: com.bytedance.sdk.openadsdk.core.model.xxp.12
            @Override // com.bytedance.sdk.openadsdk.core.widget.ldr
            public void bg() {
                if (!com.bytedance.sdk.openadsdk.core.model.xxp.eqN(com.bytedance.sdk.openadsdk.core.model.xxp.this.iR) || !(com.bytedance.sdk.openadsdk.core.model.xxp.this.VW instanceof com.bytedance.sdk.openadsdk.core.Ta.eqN.IL)) {
                    if (com.bytedance.sdk.openadsdk.core.model.xxp.this.bN != null) {
                        com.bytedance.sdk.openadsdk.core.model.xxp.this.bN.IL();
                        return;
                    }
                    return;
                }
                ((com.bytedance.sdk.openadsdk.core.Ta.eqN.IL) com.bytedance.sdk.openadsdk.core.model.xxp.this.VW).c_();
            }
        });
    }

    public static boolean bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv == null || Kg(tuv)) {
            return false;
        }
        return bX(tuv) || IL(tuv) || eqN(tuv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eo() {
        if (this.aGH.get() || this.qC.get()) {
            return;
        }
        this.aGH.set(true);
        com.bytedance.sdk.openadsdk.eqN.bX.bg(this.iR, this.VJ, java.lang.System.currentTimeMillis() - this.Uq, true);
        VB();
    }

    private void VB() {
        this.ldr.setVisibility(8);
        if (bX(this.iR) || eqN(this.iR) || !bX()) {
            return;
        }
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, "timeVisible", 0.0f, 1.0f);
        this.VB = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(100L);
        this.VB.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.xxp.13
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) com.bytedance.sdk.openadsdk.core.model.xxp.this.kMt.getLayoutParams();
                layoutParams.weight = (float) (((double) ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.25d);
                com.bytedance.sdk.openadsdk.core.model.xxp.this.bg((float) (1.0d - (((double) ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.2d)));
                com.bytedance.sdk.openadsdk.core.model.xxp.this.kMt.setLayoutParams(layoutParams);
            }
        });
        this.VB.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void PX() {
        if (this.aGH.get()) {
            return;
        }
        Ta();
        this.qC.set(true);
        this.daV.Kg();
        com.bytedance.sdk.openadsdk.common.PX px = this.JAA;
        if (px != null) {
            px.IL();
        }
        if (eqN(this.iR)) {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(java.lang.System.currentTimeMillis(), this.iR, this.VJ, "show_agg_backup");
            android.view.View view = this.xxp;
            if (view != null) {
                view.setVisibility(0);
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.xxp.getLayoutParams();
                layoutParams.addRule(13);
                layoutParams.addRule(10, 0);
                this.xxp.setLayoutParams(layoutParams);
                android.widget.RelativeLayout relativeLayout = this.ldr;
                if (relativeLayout != null) {
                    relativeLayout.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.xxp.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(android.view.View view2) {
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        this.vb.setVisibility(0);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.vb.getLayoutParams();
        layoutParams2.addRule(13);
        layoutParams2.addRule(10, 0);
        this.vb.setLayoutParams(layoutParams2);
        if (this.iR.sVc() != null && !android.text.TextUtils.isEmpty(this.iR.sVc().bg())) {
            com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(this.iR.sVc().bg(), this.iR.sVc().IL(), this.iR.sVc().bX(), this.Fy, this.iR);
        }
        this.VzQ.setText(this.iR.bN());
        this.tuV.setText(this.iR.cZH());
        if (this.LZ != null) {
            IL();
            this.LZ.setClickable(true);
            this.LZ.setOnClickListener(this.Ta);
            this.LZ.setOnTouchListener(this.Ta);
        }
    }

    private void Ta() {
        if ((bX(this.iR) || eqN(this.iR)) && (this.VW instanceof com.bytedance.sdk.openadsdk.core.Ta.eqN.IL)) {
            this.daV.VB();
            this.daV.PX();
        }
    }

    protected void IL() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.iR;
        if (tuv == null || android.text.TextUtils.isEmpty(tuv.zCS())) {
            return;
        }
        this.LZ.setText(this.iR.zCS());
    }

    private void yDt() {
        if (bX()) {
            this.Ja.setVisibility(0);
            android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(this.Uw, "translationY", 16.0f, 0.0f).setDuration(500L);
            this.WR = duration;
            duration.setRepeatMode(2);
            this.WR.setRepeatCount(-1);
            this.WR.start();
            this.Ja.setClickable(true);
            this.Ja.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.xxp.3
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    if (!com.bytedance.sdk.openadsdk.core.model.xxp.this.Dxa) {
                        com.bytedance.sdk.openadsdk.core.model.xxp.this.yDt.onTouch(view, motionEvent);
                    }
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
                        return false;
                    }
                    com.bytedance.sdk.openadsdk.core.model.xxp.this.eo = android.animation.ObjectAnimator.ofFloat(this, "timeSlide", 0.0f, 1.0f);
                    com.bytedance.sdk.openadsdk.core.model.xxp.this.eo.setDuration(200L);
                    com.bytedance.sdk.openadsdk.core.model.xxp.this.eo.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.xxp.3.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) com.bytedance.sdk.openadsdk.core.model.xxp.this.kMt.getLayoutParams();
                            layoutParams.weight = (float) (((double) (((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * 2.07f)) + 0.25d);
                            com.bytedance.sdk.openadsdk.core.model.xxp.this.bg((float) (0.800000011920929d - (((double) ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue()) * 0.5d)));
                            com.bytedance.sdk.openadsdk.core.model.xxp.this.kMt.setLayoutParams(layoutParams);
                        }
                    });
                    if (com.bytedance.sdk.openadsdk.core.model.xxp.this.yDt.iR()) {
                        com.bytedance.sdk.openadsdk.core.model.xxp.this.Ja.performClick();
                        com.bytedance.sdk.openadsdk.core.model.xxp.this.Dxa = true;
                    }
                    com.bytedance.sdk.openadsdk.core.model.xxp.this.eo.start();
                    com.bytedance.sdk.openadsdk.core.model.xxp.this.Ja.setVisibility(8);
                    return true;
                }
            });
            this.Ja.setOnClickListener(this.yDt);
        }
        if (!Lq()) {
            this.Kg.setVisibility(8);
            this.IL.setVisibility(0);
            this.bg.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            this.bg.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.xxp.4
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    com.bytedance.sdk.openadsdk.eqN.bX.IL(com.bytedance.sdk.openadsdk.core.model.xxp.this.iR, com.bytedance.sdk.openadsdk.core.model.xxp.this.VJ);
                }
            });
            com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.iR;
            if (tuv != null && tuv.lM() != null && this.iR.lM().size() > 0 && this.iR.lM().get(0) != null && !android.text.TextUtils.isEmpty(this.iR.lM().get(0).bg())) {
                com.bytedance.sdk.openadsdk.xxp.bX.bg().bg(this.iR.lM().get(0), this.bg, this.iR);
            }
        }
        try {
            java.lang.String strBg = this.iR.lM().get(0).bg();
            com.bytedance.sdk.openadsdk.WR.eqN.bg().bg(strBg).bg(this.iR.lM().get(0).IL()).IL(this.iR.lM().get(0).bX()).zx(com.bytedance.sdk.openadsdk.utils.ZQc.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg())).eqN(com.bytedance.sdk.openadsdk.utils.ZQc.bX(com.bytedance.sdk.openadsdk.core.VzQ.bg())).bX(2).bg(new com.bytedance.sdk.openadsdk.core.model.xxp.bg()).bg(new com.bytedance.sdk.openadsdk.WR.IL(this.iR, strBg, new com.bytedance.sdk.component.zx.xxp<android.graphics.Bitmap>() { // from class: com.bytedance.sdk.openadsdk.core.model.xxp.5
                @Override // com.bytedance.sdk.component.zx.xxp
                public void bg(int i, java.lang.String str, java.lang.Throwable th) {
                }

                @Override // com.bytedance.sdk.component.zx.xxp
                public void bg(com.bytedance.sdk.component.zx.VB<android.graphics.Bitmap> vb) {
                    try {
                        android.graphics.Bitmap bitmapIL = vb.IL();
                        if (bitmapIL != null && vb.bX() != null) {
                            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(com.bytedance.sdk.openadsdk.core.VzQ.bg().getResources(), bitmapIL);
                            if (!com.bytedance.sdk.openadsdk.core.model.xxp.this.Lq()) {
                                com.bytedance.sdk.openadsdk.core.model.xxp.this.IL.setBackground(bitmapDrawable);
                                return;
                            }
                            com.bytedance.sdk.openadsdk.core.model.xxp.this.eqN.setBackground(bitmapDrawable);
                            android.view.View viewEo = com.bytedance.sdk.openadsdk.core.model.xxp.this.daV.eo();
                            if (viewEo == null || !(viewEo.getParent() instanceof android.view.View)) {
                                return;
                            }
                            android.view.View view = (android.view.View) viewEo.getParent();
                            view.setBackground(bitmapDrawable);
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
            }));
        } catch (java.lang.Exception unused) {
        }
    }

    private static class bg implements com.bytedance.sdk.component.zx.Kg {
        @Override // com.bytedance.sdk.component.zx.Kg
        public android.graphics.Bitmap bg(android.graphics.Bitmap bitmap) {
            return com.bytedance.sdk.component.adexpress.eqN.bg.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), bitmap, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Lq() {
        return com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.iR);
    }

    public boolean bX() {
        return this.iR.bOf() == 15 || this.iR.bOf() == 16;
    }

    public void bg(float f) {
        try {
            this.daV.WR();
        } catch (java.lang.Throwable unused) {
        }
    }

    public static boolean IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return tuv != null && tuv.jz() == 3 && tuv.vb() == 6 && !com.bytedance.sdk.openadsdk.core.model.rri.IL(tuv) && tuv.xFs() == 1 && (tuv.jf() == 0.0f || tuv.jf() == 100.0f);
    }

    public static boolean bX(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv == null) {
            return false;
        }
        if (Kg(tuv)) {
            return true;
        }
        return tuv.jz() == 3 && tuv.vb() == 5 && !com.bytedance.sdk.openadsdk.core.model.rri.IL(tuv) && (tuv.jf() == 0.0f || tuv.jf() == 100.0f);
    }

    public static boolean eqN(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return tuv != null && tuv.vb() == 33;
    }

    public static boolean zx(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return bX(tuv) && !Kg(tuv);
    }

    public static boolean ldr(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return (tuv == null || tuv.JaB() == 1 || !iR(tuv)) ? false : true;
    }

    public static boolean iR(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        if (tuv != null) {
            return tuv.vb() == 19 || tuv.vb() == 20;
        }
        return false;
    }

    public static boolean Kg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return tuv != null && tuv.vb() == 19;
    }

    public static boolean WR(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        return (tuv == null || !com.bytedance.sdk.openadsdk.core.VzQ.eqN().tC() || !tuv.ayS() || IL(tuv) || bX(tuv) || eqN(tuv)) ? false : true;
    }

    public void eqN() {
        android.widget.FrameLayout frameLayout = this.kMt;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            android.view.View view = this.DDQ;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public void zx() {
        com.bytedance.sdk.component.WR.eqN eqn;
        com.bytedance.sdk.openadsdk.eqN.VB vb = this.CQc;
        if (vb != null && (eqn = this.rri) != null) {
            vb.bg(eqn);
        }
        android.os.Handler handler = this.Lq;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        android.animation.ObjectAnimator objectAnimator = this.eo;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.eo.cancel();
        }
        android.animation.ObjectAnimator objectAnimator2 = this.VB;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.VB.cancel();
        }
        com.bytedance.sdk.openadsdk.common.PX px = this.JAA;
        if (px != null) {
            px.IL();
        }
        android.animation.ObjectAnimator objectAnimator3 = this.WR;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        com.bytedance.sdk.component.WR.eqN eqn2 = this.rri;
        if (eqn2 != null) {
            com.bytedance.sdk.openadsdk.core.daV.bg(eqn2.getWebView());
        }
        this.rri = null;
        com.bytedance.sdk.openadsdk.core.aGH agh = this.tC;
        if (agh != null) {
            agh.VB();
        }
        com.bytedance.sdk.openadsdk.eqN.VB vb2 = this.CQc;
        if (vb2 != null) {
            vb2.bX(true);
        }
        if (!android.text.TextUtils.isEmpty(this.jz) && this.uu) {
            com.bytedance.sdk.openadsdk.eqN.bX.bg.bg(this.txA, this.RJ, this.iR);
        }
        com.bytedance.sdk.openadsdk.iR.IL.bg().bg(this.Pae);
    }

    public void ldr() {
        com.bytedance.sdk.openadsdk.core.aGH agh = this.tC;
        if (agh != null) {
            agh.eo();
        }
        com.bytedance.sdk.openadsdk.eqN.VB vb = this.CQc;
        if (vb != null) {
            vb.iR();
        }
    }

    public void iR() {
        com.bytedance.sdk.openadsdk.eqN.VB vb = this.CQc;
        if (vb != null) {
            vb.Kg();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        long jEqN;
        com.bytedance.sdk.openadsdk.core.model.tuV tuv;
        com.bytedance.sdk.openadsdk.core.model.tuV tuv2;
        if (message.what == 100) {
            int i = message.arg1;
            if (bX(this.iR) && (tuv2 = this.iR) != null && tuv2.WR() != null) {
                jEqN = this.iR.WR().IL();
            } else {
                jEqN = (!eqN(this.iR) || (tuv = this.iR) == null || tuv.WR() == null) ? 20L : this.iR.WR().eqN();
            }
            com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg bgVar = this.PX;
            if (bgVar != null) {
                bgVar.bg(((long) i) * 1000, jEqN * 1000);
            }
            long j = i;
            if (j >= jEqN) {
                com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg bgVar2 = this.PX;
                if (bgVar2 != null) {
                    bgVar2.bg(jEqN * 1000, 100);
                }
            } else if (j < jEqN && this.Lq != null) {
                android.os.Message messageObtain = android.os.Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i + 1;
                this.Lq.sendMessageDelayed(messageObtain, 1000L);
            }
        }
        return true;
    }
}
