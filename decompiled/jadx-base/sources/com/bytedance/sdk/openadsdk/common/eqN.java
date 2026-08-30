package com.bytedance.sdk.openadsdk.common;

/* JADX INFO: loaded from: classes4.dex */
public class eqN implements com.bytedance.sdk.component.utils.JAA.bg {
    private int Fy;
    private final boolean IL;
    private float Kg;
    private boolean Lq;
    private java.lang.String VB;
    private int WR;
    private android.webkit.WebView bX;
    private final com.bytedance.sdk.openadsdk.core.model.tuV bg;
    private long eo;
    private final com.bytedance.sdk.component.WR.eqN eqN;
    private long vb;
    private boolean xxp;
    private int yDt;
    private com.bytedance.sdk.openadsdk.common.bX zx;
    private java.lang.String ldr = "landingpage";
    private final android.os.Handler iR = new com.bytedance.sdk.component.utils.JAA(com.bytedance.sdk.openadsdk.core.yDt.IL().getLooper(), this);
    private final java.util.concurrent.atomic.AtomicBoolean PX = new java.util.concurrent.atomic.AtomicBoolean(false);
    private java.util.regex.Pattern Ta = null;
    private long tuV = -1;
    private final java.util.List<java.lang.Integer> VzQ = new java.util.ArrayList();

    public eqN(com.bytedance.sdk.openadsdk.core.model.tuV tuv, com.bytedance.sdk.component.WR.eqN eqn, java.lang.String str, boolean z) {
        this.bg = tuv;
        this.eqN = eqn;
        this.IL = z;
        bg();
    }

    public void bg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.ldr = str;
    }

    private void bg() {
        com.bytedance.sdk.component.WR.eqN eqn = this.eqN;
        if (eqn != null) {
            this.bX = eqn.getWebView();
            android.view.View arbitrageLoadingView = this.eqN.getArbitrageLoadingView();
            if (arbitrageLoadingView instanceof com.bytedance.sdk.openadsdk.common.bX) {
                this.zx = (com.bytedance.sdk.openadsdk.common.bX) arbitrageLoadingView;
            }
        }
        this.WR = com.bytedance.sdk.openadsdk.core.settings.xxp.zU().rr();
        this.Kg = com.bytedance.sdk.openadsdk.core.settings.xxp.zU().gtr();
    }

    public void bg(android.webkit.WebView webView, java.lang.String str, boolean z) {
        if (z && ldr()) {
            eqN();
        }
    }

    public void bg(android.webkit.WebView webView, java.lang.String str) {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.bg;
        if (tuv == null || !com.bytedance.sdk.component.WR.IL.bg(tuv.eo().bX(), str)) {
            return;
        }
        this.yDt++;
        com.bytedance.sdk.component.utils.iR.IL().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.common.eqN.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.common.eqN.this.ldr()) {
                    com.bytedance.sdk.openadsdk.common.eqN.this.eqN();
                }
            }
        });
    }

    public void bg(android.webkit.WebView webView, int i) {
        com.bytedance.sdk.openadsdk.common.bX bXVar = this.zx;
        if (bXVar != null) {
            bXVar.bg(i);
        }
        if (this.xxp) {
            if (bg(i, 30)) {
                bg(30, webView);
            }
            if (bg(i, 50)) {
                bg(50, webView);
            }
            if (bg(i, 70)) {
                bg(70, webView);
            }
        }
        if (this.zx == null || i != 100) {
            return;
        }
        bg(1);
    }

    public void IL(android.webkit.WebView webView, java.lang.String str, boolean z) {
        if (!z || this.zx == null) {
            return;
        }
        bg(1);
    }

    public void bX(android.webkit.WebView webView, java.lang.String str, boolean z) {
        this.VzQ.clear();
        this.xxp = z;
        if (z) {
            this.Lq = true;
        }
        this.Fy = iR();
    }

    private void IL() {
        android.os.Handler handler = this.iR;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(1, this.WR);
        }
    }

    private void bX() {
        android.os.Handler handler = this.iR;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eqN() {
        if (com.bytedance.sdk.openadsdk.utils.VJ.zx()) {
            zx();
        } else {
            com.bytedance.sdk.component.utils.iR.IL().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.common.eqN.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.common.eqN.this.zx();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zx() {
        this.Lq = false;
        if (this.PX.getAndSet(true)) {
            return;
        }
        this.eo = android.os.SystemClock.elapsedRealtime();
        this.vb = java.lang.System.currentTimeMillis();
        Kg();
        android.webkit.WebView webView = this.bX;
        if (webView != null) {
            this.VB = webView.getUrl();
        }
        com.bytedance.sdk.openadsdk.common.bX bXVar = this.zx;
        if (bXVar == null) {
            return;
        }
        bXVar.setVisibility(0);
        this.zx.bg(this.bg);
        this.zx.bg();
        this.zx.setAlpha(this.Kg);
        this.zx.setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.common.eqN.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return true;
            }
        });
        bX();
        IL();
    }

    private void bg(final int i) {
        com.bytedance.sdk.component.utils.iR.IL().post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.common.eqN.4
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.common.eqN.this.zx != null) {
                    com.bytedance.sdk.openadsdk.common.eqN.this.PX.set(false);
                    com.bytedance.sdk.openadsdk.common.eqN.this.zx.bg(com.bytedance.sdk.openadsdk.common.eqN.this.bg, com.bytedance.sdk.openadsdk.common.eqN.this.ldr, i, com.bytedance.sdk.openadsdk.common.eqN.this.VB, com.bytedance.sdk.openadsdk.common.eqN.this.eo, com.bytedance.sdk.openadsdk.common.eqN.this.Lq, com.bytedance.sdk.openadsdk.common.eqN.this.yDt, com.bytedance.sdk.openadsdk.common.eqN.this.vb);
                    com.bytedance.sdk.openadsdk.common.eqN.this.yDt = 0;
                }
            }
        });
        bX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ldr() {
        return iR() > 0 && !this.PX.get();
    }

    private int iR() {
        try {
            return this.bX.copyBackForwardList().getCurrentIndex() + 1;
        } catch (java.lang.Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.component.utils.JAA.bg
    public void bg(android.os.Message message) {
        if (message.what == 1) {
            bg(0);
        }
    }

    public void bg(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.tuV = android.os.SystemClock.elapsedRealtime();
        }
    }

    private boolean bg(int i, int i2) {
        if (i < i2 || this.VzQ.contains(java.lang.Integer.valueOf(i2)) || this.Fy < 2) {
            return false;
        }
        this.VzQ.add(java.lang.Integer.valueOf(i2));
        return true;
    }

    private void bg(int i, android.webkit.WebView webView) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.Integer.valueOf(i);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("load_progress", i);
            jSONObject.put("progress_timestamp", java.lang.System.currentTimeMillis());
            jSONObject.put("arbi_current_url", webView.getUrl());
        } catch (java.lang.Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.eqN.bX.bX(this.bg, this.ldr, jSONObject);
    }

    private void Kg() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("loading_show_interval", android.os.SystemClock.elapsedRealtime() - this.tuV);
            jSONObject.put("loading_show_timestamp", this.vb);
            android.webkit.WebView webView = this.bX;
            jSONObject.put("arbi_current_url", webView != null ? webView.getUrl() : "");
        } catch (java.lang.Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.eqN.bX.IL(this.bg, this.ldr, jSONObject);
    }
}
