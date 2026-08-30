package com.bytedance.sdk.openadsdk.activity;

/* JADX INFO: loaded from: classes4.dex */
public class TTAppOpenAdActivity extends com.bytedance.sdk.openadsdk.activity.TTBaseActivity implements com.bytedance.sdk.component.utils.JAA.bg {
    private static com.bytedance.sdk.openadsdk.bg.eqN.IL Kg;
    private boolean DDQ;
    private java.lang.String Fy;
    private int JAA;
    private int Ja;
    private com.bytedance.sdk.openadsdk.core.model.tuV LZ;
    private com.bytedance.sdk.openadsdk.eqN.iR Lq;
    private com.bytedance.sdk.openadsdk.common.TTAdDislikeToast PX;
    private com.bytedance.sdk.openadsdk.component.bX Uq;
    private android.widget.FrameLayout Uw;
    private com.bytedance.sdk.openadsdk.common.Lq VB;
    private boolean VzQ;
    private com.bytedance.sdk.openadsdk.AdSlot aGH;
    private com.bytedance.sdk.openadsdk.component.ldr.IL eo;
    private com.bytedance.sdk.openadsdk.bg.eqN.IL rri;
    private com.bytedance.sdk.openadsdk.IListenerManager tC;
    private int tuV;
    private float vb;
    private float xxp;
    protected final java.util.concurrent.atomic.AtomicBoolean bg = new java.util.concurrent.atomic.AtomicBoolean(false);
    protected final com.bytedance.sdk.component.utils.JAA IL = new com.bytedance.sdk.component.utils.JAA(android.os.Looper.getMainLooper(), this);
    final java.util.concurrent.atomic.AtomicBoolean bX = new java.util.concurrent.atomic.AtomicBoolean(false);
    final java.util.concurrent.atomic.AtomicBoolean eqN = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final com.bytedance.sdk.openadsdk.component.Kg.bg WR = new com.bytedance.sdk.openadsdk.component.Kg.bg();
    protected boolean zx = false;
    private final java.util.concurrent.atomic.AtomicBoolean Ta = new java.util.concurrent.atomic.AtomicBoolean(false);
    private com.bytedance.sdk.openadsdk.utils.daV yDt = com.bytedance.sdk.openadsdk.utils.daV.IL();
    private final java.util.concurrent.atomic.AtomicBoolean kMt = new java.util.concurrent.atomic.AtomicBoolean(false);
    long ldr = 0;
    private volatile boolean VW = false;
    private final com.bytedance.sdk.openadsdk.component.bg VJ = new com.bytedance.sdk.openadsdk.component.bg() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.1
        @Override // com.bytedance.sdk.openadsdk.component.bg, com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
        public void IL(long j, int i) {
            com.bytedance.sdk.openadsdk.component.Kg.bX bXVarIR;
            java.lang.Object[] objArr = new java.lang.Object[2];
            java.lang.String str = "onError() called with: totalPlayTime = [" + j + "], percent = [" + i + com.ironsource.y8.i.e;
            if (com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.Uq != null && (bXVarIR = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.Uq.iR()) != null) {
                bXVarIR.bg(true);
            }
            com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.tuV();
            com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.bg, com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
        public void bg() {
            java.lang.Object[] objArr = new java.lang.Object[2];
            com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.tuV();
            com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.bg, com.bykv.vk.openvk.bg.bg.bg.eqN.bX.bg
        public void bg(long j, long j2) {
            com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.WR.bg(j);
            if (!com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.zx && com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.Uq != null && com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.Uq.iR() != null && com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.Uq.iR().eqN()) {
                com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.Uq.iR().iR();
            }
            com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.PX();
        }

        @Override // com.bytedance.sdk.openadsdk.component.bg, com.bytedance.sdk.openadsdk.component.ldr.bg
        public void bg(android.view.View view) {
            com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.Fy();
        }

        @Override // com.bytedance.sdk.openadsdk.component.bg, com.bytedance.sdk.openadsdk.component.ldr.bg
        public void IL(android.view.View view) {
            com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.bg();
        }

        @Override // com.bytedance.sdk.openadsdk.component.bg, com.bytedance.sdk.openadsdk.component.ldr.bg
        public void IL() {
            com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.VW = true;
            java.lang.Object[] objArr = new java.lang.Object[2];
            if (com.bytedance.sdk.openadsdk.Fy.bg.bg("splash_auto_close_switch", 0) == 0) {
                if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
                    com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.bg("onAdTimeOver");
                } else if (com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.rri != null) {
                    com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.rri.bX();
                }
                com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.finish();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.bg, com.bytedance.sdk.openadsdk.component.ldr.bg
        public void bg(int i, int i2, boolean z) {
            if (com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.Uq != null) {
                com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.Uq.bg(i, i2, z || i == 0);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.bg
        public void bX() {
            com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.ldr();
            com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.yDt.eqN();
            com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.vb();
            if (com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.VzQ) {
                com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.VB();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.bg
        public void eqN() {
            com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.bg
        public void zx() {
            com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.VzQ();
        }
    };
    private final java.lang.Runnable daV = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.5
        @Override // java.lang.Runnable
        public void run() {
            if (com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.Ta.get()) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.LZ != null && com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.LZ.HXG() && com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.LZ.hi() != null && com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.LZ.hi().bg() != null) {
                com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.LZ.hi().bg().bg(0L);
            }
            com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.Lq = new com.bytedance.sdk.openadsdk.eqN.iR();
            com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.Lq.bg(java.lang.System.currentTimeMillis(), 1.0f);
            com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.yDt.eqN();
            if (com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.eo != null) {
                com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.eo.IL();
            }
            if (com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.Uq != null) {
                com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.Uq.zx();
            }
            com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.xxp();
            android.view.View viewFindViewById = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.findViewById(android.R.id.content);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (viewFindViewById != null) {
                try {
                    jSONObject.put("width", viewFindViewById.getWidth());
                    jSONObject.put("height", viewFindViewById.getHeight());
                    jSONObject.put("alpha", viewFindViewById.getAlpha());
                } catch (org.json.JSONException e) {
                    android.util.Log.e("TTAppOpenAdActivity", "run: ", e);
                    com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.finish();
                    return;
                }
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("root_view", jSONObject.toString());
            jSONObject2.put("ad_root", com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.JAA);
            jSONObject2.put("openad_creative_type", com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.VzQ ? "video_normal_ad" : "image_normal_ad");
            if (com.bytedance.sdk.openadsdk.component.WR.Kg.bX() == null) {
                jSONObject2.put("appicon_acquirefail", "1");
            }
            if (com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.DDQ || com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.LZ.eK()) {
                jSONObject2.put("dynamic_show_type", com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.Lq());
                com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.bg(jSONObject2);
            }
            jSONObject2.put("is_icon_only", com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.LZ.NC() ? 1 : 0);
            com.bytedance.sdk.openadsdk.eqN.bX.bg(com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.LZ, "open_ad", jSONObject2);
            com.bytedance.sdk.openadsdk.rri.bg.zx.bg(com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.findViewById(android.R.id.content), com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.LZ, new com.bytedance.sdk.openadsdk.rri.bg.zx.bg(com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.Lq()));
            com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.Ta.set(true);
        }
    };

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.core.VzQ.IL(getApplicationContext());
        if (!IL(bundle)) {
            finish();
            return;
        }
        if (!com.bytedance.sdk.openadsdk.core.yDt.zx()) {
            finish();
            return;
        }
        if (bundle != null) {
            com.bytedance.sdk.openadsdk.eqN.bX.zx(this.LZ, "open_ad", (org.json.JSONObject) null);
        }
        this.VzQ = com.bytedance.sdk.openadsdk.core.model.tuV.zx(this.LZ);
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String str = "onCreate: isVideo is " + this.VzQ;
        if (this.VzQ) {
            this.WR.bg((float) this.LZ.Dxa().ldr());
        } else {
            this.WR.bg(com.bytedance.sdk.openadsdk.core.VzQ.eqN().rri(java.lang.String.valueOf(this.tuV)));
        }
        com.bytedance.sdk.openadsdk.component.ldr.IL il = new com.bytedance.sdk.openadsdk.component.ldr.IL(this.WR);
        this.eo = il;
        il.bg(this.VJ);
        iR();
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this);
        this.Uw = frameLayout;
        frameLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        try {
            setContentView(this.Uw);
            this.Uw.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.2
                /* JADX WARN: Code duplicated, block: B:9:0x0023  */
                @Override // java.lang.Runnable
                public void run() {
                    boolean z;
                    try {
                        int iJAA = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.LZ.JAA();
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity tTAppOpenAdActivity = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this;
                        if (tTAppOpenAdActivity.LZ == null || com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.LZ.tC() != 2) {
                            z = false;
                        } else {
                            z = true;
                            if (iJAA == 1) {
                                z = false;
                            }
                        }
                        tTAppOpenAdActivity.DDQ = z;
                        if (com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.DDQ) {
                            com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity tTAppOpenAdActivity2 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this;
                            com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity tTAppOpenAdActivity3 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this;
                            tTAppOpenAdActivity2.Uq = new com.bytedance.sdk.openadsdk.component.IL(tTAppOpenAdActivity3, tTAppOpenAdActivity3.LZ, com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.Uw, com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.VJ, com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.Ja, com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.VzQ, com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.WR, com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.eo);
                        } else {
                            com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity tTAppOpenAdActivity4 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this;
                            com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity tTAppOpenAdActivity5 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this;
                            tTAppOpenAdActivity4.Uq = new com.bytedance.sdk.openadsdk.component.bX(tTAppOpenAdActivity5, tTAppOpenAdActivity5.LZ, com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.Uw, com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.VJ, com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.Ja, com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.VzQ, com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.WR);
                            com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.Uq.bg(com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.xxp, com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.vb);
                        }
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.Uq.bg((android.view.ViewGroup) com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.Uw);
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.Uq.bg();
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.Uq.IL();
                    } catch (java.lang.Throwable th) {
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.finish();
                        com.bytedance.sdk.component.utils.PX.bg("TTAppOpenAdActivity", th.getMessage());
                    }
                }
            });
            try {
                final android.view.View decorView = getWindow().getDecorView();
                if (android.os.Build.VERSION.SDK_INT >= 35) {
                    decorView.setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.3
                        @Override // android.view.View.OnApplyWindowInsetsListener
                        public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
                            java.util.List<android.graphics.Rect> boundingRects;
                            try {
                                android.view.DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                                if (displayCutout != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
                                    decorView.setPadding(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                                }
                            } catch (java.lang.Throwable unused) {
                            }
                            return windowInsets;
                        }
                    });
                }
            } catch (java.lang.Throwable unused) {
            }
        } catch (java.lang.Throwable unused2) {
            com.bytedance.sdk.openadsdk.yDt.bX.IL();
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ldr() {
        android.util.Log.d("TTAppOpenAdActivity", "startCountDownTimer() called");
        this.eo.IL(com.bytedance.sdk.openadsdk.core.VzQ.eqN().tC(java.lang.String.valueOf(this.tuV)));
        this.eo.bg(this.WR.bg());
    }

    private void iR() {
        if (26 == android.os.Build.VERSION.SDK_INT) {
            if (getResources().getConfiguration().orientation == 1) {
                this.Ja = 1;
            } else {
                this.Ja = 2;
            }
        } else {
            this.Ja = this.LZ.xFs();
        }
        Kg();
    }

    private void Kg() {
        int iMin;
        int iMax;
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String str = "changeScreenOrientation: mOrientation=" + this.Ja;
        if (android.os.Build.VERSION.SDK_INT != 26) {
            if (android.os.Build.VERSION.SDK_INT == 27) {
                try {
                    WR();
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.bg("TTAppOpenAdActivity", th.getMessage());
                    return;
                }
            } else {
                WR();
            }
        }
        android.util.Pair<java.lang.Integer, java.lang.Integer> pairKg = com.bytedance.sdk.openadsdk.utils.ZQc.Kg(getApplicationContext());
        if (this.Ja == 2) {
            iMin = java.lang.Math.max(((java.lang.Integer) pairKg.first).intValue(), ((java.lang.Integer) pairKg.second).intValue());
            iMax = java.lang.Math.min(((java.lang.Integer) pairKg.first).intValue(), ((java.lang.Integer) pairKg.second).intValue());
        } else {
            iMin = java.lang.Math.min(((java.lang.Integer) pairKg.first).intValue(), ((java.lang.Integer) pairKg.second).intValue());
            iMax = java.lang.Math.max(((java.lang.Integer) pairKg.first).intValue(), ((java.lang.Integer) pairKg.second).intValue());
        }
        this.vb = iMax;
        this.xxp = iMin;
        float fBg = com.bytedance.sdk.openadsdk.utils.ZQc.bg();
        if (com.bytedance.sdk.openadsdk.utils.ZQc.bX((android.app.Activity) this)) {
            int i = this.Ja;
            if (i == 1) {
                this.vb -= fBg;
            } else if (i == 2) {
                this.xxp -= fBg;
            }
        }
        com.bytedance.sdk.openadsdk.component.bX bXVar = this.Uq;
        if (bXVar != null) {
            bXVar.bg(this.xxp, this.vb);
        }
    }

    private void WR() {
        if (this.Ja == 2) {
            if (zx()) {
                setRequestedOrientation(8);
            } else {
                setRequestedOrientation(0);
            }
        } else {
            setRequestedOrientation(1);
        }
        if (this.Ja == 2 || !com.bytedance.sdk.openadsdk.utils.ZQc.bX((android.app.Activity) this)) {
            getWindow().addFlags(1024);
        }
    }

    protected void bg() {
        if (isFinishing()) {
            return;
        }
        if (this.eqN.get()) {
            Ta();
            return;
        }
        if (this.VB == null) {
            try {
                eo();
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.openadsdk.ApmHelper.reportCustomError("initDislike error", "TTAppOpenAdActivity", th);
            }
        }
        com.bytedance.sdk.openadsdk.common.Lq lq = this.VB;
        if (lq != null) {
            lq.bg();
        }
    }

    private void eo() {
        if (this.VB == null) {
            com.bytedance.sdk.openadsdk.common.Lq lq = new com.bytedance.sdk.openadsdk.common.Lq(this, this.LZ);
            this.VB = lq;
            lq.setDislikeSource("video_player");
            this.VB.setCallback(new com.bytedance.sdk.openadsdk.common.Lq.bg() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.4
                @Override // com.bytedance.sdk.openadsdk.common.Lq.bg
                public void bg(android.view.View view) {
                    com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.bX.set(true);
                    com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.bX();
                }

                @Override // com.bytedance.sdk.openadsdk.common.Lq.bg
                public void IL(android.view.View view) {
                    com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.bX.set(false);
                    com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.IL();
                }

                @Override // com.bytedance.sdk.openadsdk.common.Lq.bg
                public void bg(com.bytedance.sdk.openadsdk.FilterWord filterWord) {
                    if (com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.eqN.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.eqN.set(true);
                    com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.yDt();
                }
            });
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(android.R.id.content);
        frameLayout.addView(this.VB);
        if (this.PX == null) {
            com.bytedance.sdk.openadsdk.common.TTAdDislikeToast tTAdDislikeToast = new com.bytedance.sdk.openadsdk.common.TTAdDislikeToast(this);
            this.PX = tTAdDislikeToast;
            frameLayout.addView(tTAdDislikeToast);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void VB() {
        if (!this.VzQ || this.LZ.NC() || this.VW) {
            return;
        }
        this.IL.sendEmptyMessageDelayed(100, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void PX() {
        if (!this.VzQ || this.LZ.NC()) {
            return;
        }
        this.IL.removeMessages(100);
    }

    private void Ta() {
        this.PX.show(com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yDt() {
        this.PX.show(com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getDislikeSendTip());
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (com.bytedance.sdk.openadsdk.core.VzQ.eqN().LZ(java.lang.String.valueOf(this.tuV)) == 1) {
            if (this.WR.IL() >= ((long) com.bytedance.sdk.openadsdk.core.VzQ.eqN().tC(java.lang.String.valueOf(this.tuV))) * 1000) {
                Fy();
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            if (!this.DDQ) {
                this.yDt.eqN();
            }
            com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.LZ;
            if (tuv != null && tuv.vTg() && !this.LZ.NU()) {
                this.LZ.iR(true);
                com.bytedance.sdk.openadsdk.core.model.tuV tuv2 = this.LZ;
                com.bytedance.sdk.openadsdk.eqN.bX.bg(tuv2, "open_ad", tuv2.dRo());
            }
        } else if (this.Ta.get()) {
            if (this.yDt.zx()) {
                com.bytedance.sdk.openadsdk.eqN.bX.bg(java.lang.String.valueOf(this.yDt.bX()), this.LZ, "open_ad", this.Lq);
            }
            this.yDt = com.bytedance.sdk.openadsdk.utils.daV.IL();
        }
        com.bytedance.sdk.openadsdk.rri.bg.zx.bg(this.LZ, z ? 4 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() {
        com.bytedance.sdk.openadsdk.component.bX bXVar;
        super.onResume();
        this.zx = true;
        if (this.bg.getAndSet(true)) {
            if (this.kMt.get()) {
                tuV();
                if (this.VzQ && (bXVar = this.Uq) != null && bXVar.iR() != null) {
                    this.Uq.iR().bg(3);
                }
                finish();
                return;
            }
            IL();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.zx = false;
        bX();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.LZ != null) {
            com.bytedance.sdk.openadsdk.ldr.IL.bg().bg("videoForceBreak", this.LZ);
        }
        this.IL.removeCallbacksAndMessages(null);
        com.bytedance.sdk.openadsdk.component.ldr.IL il = this.eo;
        if (il != null) {
            il.zx();
        }
        com.bytedance.sdk.openadsdk.rri.bg.zx.bg(this.LZ);
        if (this.VzQ) {
            com.bytedance.sdk.openadsdk.component.eqN.bg.bg(this.LZ, this.WR.IL(), this.WR.bg(), true);
        } else {
            com.bytedance.sdk.openadsdk.component.eqN.bg.bg(this.LZ, -1L, this.WR.bg(), false);
        }
        if (this.yDt.zx() && this.Ta.get()) {
            com.bytedance.sdk.openadsdk.eqN.bX.bg(java.lang.String.valueOf(this.yDt.bX()), this.LZ, "open_ad", this.Lq);
            this.yDt = com.bytedance.sdk.openadsdk.utils.daV.IL();
        }
        com.bytedance.sdk.openadsdk.component.bX bXVar = this.Uq;
        if (bXVar != null) {
            bXVar.bX();
        }
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            bg("recycleRes");
        }
        Kg = null;
        this.rri = null;
        com.bytedance.sdk.openadsdk.common.Lq lq = this.VB;
        if (lq != null) {
            lq.setCallback(null);
        }
        if (com.bytedance.sdk.openadsdk.core.settings.xxp.zU().JAA(java.lang.String.valueOf(this.tuV)) != 1 || com.bytedance.sdk.openadsdk.core.model.tuV.ldr(this.LZ)) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.ldr.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()).bg(this.aGH);
    }

    void IL() {
        if (this.bX.get()) {
            return;
        }
        if (this.VzQ) {
            com.bytedance.sdk.openadsdk.component.bX bXVar = this.Uq;
            if (bXVar != null && bXVar.iR() != null && this.Uq.iR().zx()) {
                this.Uq.iR().eo();
            }
            VB();
        }
        com.bytedance.sdk.openadsdk.component.ldr.IL il = this.eo;
        if (il != null) {
            il.bX();
        }
    }

    void bX() {
        if (this.VzQ) {
            com.bytedance.sdk.openadsdk.component.bX bXVar = this.Uq;
            if (bXVar != null && bXVar.iR() != null && this.Uq.iR().eqN()) {
                this.Uq.iR().iR();
            }
            PX();
        }
        com.bytedance.sdk.openadsdk.component.ldr.IL il = this.eo;
        if (il != null) {
            il.eqN();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int Lq() {
        if (this.LZ.eK()) {
            return 5;
        }
        if (this.DDQ) {
            return this.Uq.eqN();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.json.JSONObject bg(org.json.JSONObject jSONObject) {
        if (Lq() == 0) {
            return this.Uq.bg(jSONObject);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vb() {
        if (this.Ta.get()) {
            return;
        }
        try {
            getWindow().getDecorView().post(this.daV);
        } catch (java.lang.Throwable unused) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xxp() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            bg("onAdShow");
            return;
        }
        com.bytedance.sdk.openadsdk.bg.eqN.IL il = this.rri;
        if (il != null) {
            il.bg();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void VzQ() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            bg(com.json.ju.f);
        } else {
            com.bytedance.sdk.openadsdk.bg.eqN.IL il = this.rri;
            if (il != null) {
                il.onAdClicked();
            }
        }
        if (com.bytedance.sdk.openadsdk.core.settings.xxp.zU().kMt(java.lang.String.valueOf(this.tuV))) {
            this.kMt.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tuV() {
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            bg("onAdSkip");
            return;
        }
        com.bytedance.sdk.openadsdk.bg.eqN.IL il = this.rri;
        if (il != null) {
            il.IL();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Fy() {
        com.bytedance.sdk.openadsdk.component.bX bXVar;
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.bytedance.sdk.openadsdk.core.kMt.bX(this.tuV);
        tuV();
        if (this.VzQ && (bXVar = this.Uq) != null && bXVar.iR() != null) {
            this.Uq.iR().bg(4);
        }
        com.bytedance.sdk.openadsdk.component.eqN.bg.bg(this.LZ, (int) this.WR.IL(), this.eo.bg(), this.WR.bg());
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.LZ;
        if (tuv != null && tuv.HXG() && this.LZ.hi() != null && this.LZ.hi().bg() != null) {
            com.bytedance.sdk.openadsdk.core.PX.eqN eqnBg = this.LZ.hi().bg();
            com.bytedance.sdk.openadsdk.component.bX bXVar2 = this.Uq;
            long jPX = (bXVar2 == null || bXVar2.iR() == null) ? 0L : this.Uq.iR().PX();
            eqnBg.ldr(jPX);
            eqnBg.zx(jPX);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(final java.lang.String str) {
        com.bytedance.sdk.openadsdk.utils.VJ.bX(new com.bytedance.sdk.component.Kg.Kg("AppOpenAd_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.eqN().executeAppOpenAdCallback(com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.Fy, str);
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.bg("TTAppOpenAdActivity", "open_ad", "executeAppOpenAdCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    protected com.bytedance.sdk.openadsdk.IListenerManager eqN() {
        if (this.tC == null) {
            this.tC = com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.bg.bg().bg(7));
        }
        return this.tC;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.app.Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new android.view.View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.7
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.isFinishing()) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this.getWindow().getDecorView().postDelayed(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.7.1
                            @Override // java.lang.Runnable
                            public void run() {
                                com.bytedance.sdk.openadsdk.utils.ZQc.bg((android.app.Activity) com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this);
                            }
                        }, 2500L);
                    } catch (java.lang.Exception e) {
                        com.bytedance.sdk.component.utils.PX.bg("TTAppOpenAdActivity", e.getMessage());
                    }
                }
            }
        });
    }

    private boolean IL(android.os.Bundle bundle) {
        if (com.bytedance.sdk.openadsdk.multipro.IL.bX()) {
            android.content.Intent intent = getIntent();
            if (intent != null) {
                java.lang.String stringExtra = intent.getStringExtra(com.bytedance.sdk.openadsdk.TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.LZ = com.bytedance.sdk.openadsdk.core.IL.bg(new org.json.JSONObject(stringExtra));
                    } catch (java.lang.Exception e) {
                        com.bytedance.sdk.component.utils.PX.bg("TTAppOpenAdActivity", "open_ad", "initData MultiGlobalInfo throws ", e);
                    }
                }
                this.Fy = intent.getStringExtra(com.bytedance.sdk.openadsdk.TTAdConstant.MULTI_PROCESS_META_MD5);
            }
        } else {
            this.LZ = com.bytedance.sdk.openadsdk.core.JAA.bg().IL();
            this.rri = com.bytedance.sdk.openadsdk.core.JAA.bg().zx();
            com.bytedance.sdk.openadsdk.core.JAA.bg().ldr();
        }
        bg(getIntent());
        bg(bundle);
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.LZ;
        if (tuv == null) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            finish();
            return false;
        }
        this.aGH = tuv.VW();
        this.LZ.bg(this.ldr);
        this.tuV = this.LZ.IGR();
        com.bytedance.sdk.openadsdk.utils.IL.bg(this.LZ);
        return true;
    }

    protected void bg(android.content.Intent intent) {
        if (intent != null) {
            this.JAA = intent.getIntExtra(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_SOURCE, 0);
            this.ldr = intent.getLongExtra("start_show_time", 0L);
        }
    }

    protected void bg(android.os.Bundle bundle) {
        if (bundle != null) {
            if (this.rri == null) {
                this.rri = Kg;
                Kg = null;
            }
            try {
                java.lang.String string = bundle.getString("material_meta");
                this.Fy = bundle.getString(com.bytedance.sdk.openadsdk.TTAdConstant.MULTI_PROCESS_META_MD5);
                this.JAA = bundle.getInt(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_SOURCE, 0);
                this.ldr = bundle.getLong("start_show_time", 0L);
                this.LZ = com.bytedance.sdk.openadsdk.core.IL.bg(new org.json.JSONObject(string));
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("TTAppOpenAdActivity", th.getMessage());
            }
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        try {
            com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.LZ;
            bundle.putString("material_meta", tuv != null ? tuv.ZTq().toString() : null);
            bundle.putString(com.bytedance.sdk.openadsdk.TTAdConstant.MULTI_PROCESS_META_MD5, this.Fy);
            bundle.putInt(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_SOURCE, this.JAA);
            bundle.putLong("start_show_time", this.ldr);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("TTAppOpenAdActivity", th.getMessage());
        }
        Kg = this.rri;
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.component.utils.JAA.bg
    public void bg(android.os.Message message) {
        com.bytedance.sdk.openadsdk.component.bX bXVar;
        if (message.what == 100) {
            if (this.VzQ && (bXVar = this.Uq) != null && bXVar.iR() != null) {
                this.Uq.iR().bg(1);
            }
            tuV();
            finish();
        }
    }

    protected boolean zx() {
        try {
            return getIntent().getIntExtra("orientation_angle", 0) == 3;
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("TTAppOpenAdActivity", e.getMessage());
            return false;
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.bX.bg(this, this.LZ);
    }
}
