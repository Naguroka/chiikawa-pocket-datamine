package com.bytedance.sdk.component.adexpress.zx;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bg implements com.bytedance.sdk.component.adexpress.IL.VB, com.bytedance.sdk.component.adexpress.IL.eqN<com.bytedance.sdk.component.WR.eqN>, com.bytedance.sdk.component.adexpress.bg, com.bytedance.sdk.component.adexpress.theme.bg {
    protected boolean IL;
    private java.lang.String Kg;
    private com.bytedance.sdk.component.adexpress.IL.Ta PX;
    private boolean Ta;
    private com.bytedance.sdk.component.adexpress.IL.Kg VB;
    private volatile com.bytedance.sdk.component.adexpress.IL.iR WR;
    protected com.bytedance.sdk.component.WR.eqN bX;
    protected org.json.JSONObject bg;
    private boolean eo;
    private java.lang.String iR;
    private android.content.Context ldr;
    private int yDt;
    protected int eqN = 8;
    protected java.util.concurrent.atomic.AtomicBoolean zx = new java.util.concurrent.atomic.AtomicBoolean(false);
    private boolean Lq = false;

    protected void WR() {
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.eqN
    public int bX() {
        return 0;
    }

    public abstract void bg(int i);

    protected void eo() {
    }

    public abstract void iR();

    public bg(android.content.Context context, com.bytedance.sdk.component.adexpress.IL.Ta ta, com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver) {
        this.eo = false;
        this.ldr = context;
        this.PX = ta;
        this.iR = ta.eqN();
        themeStatusBroadcastReceiver.bg(this);
        if (com.bytedance.sdk.component.adexpress.eqN.IL()) {
            PX();
            return;
        }
        com.bytedance.sdk.component.WR.eqN eqnTa = Ta();
        this.bX = eqnTa;
        if (eqnTa == null) {
            android.util.Log.d("WebViewRender", "initWebView: create WebView");
            if (com.bytedance.sdk.component.adexpress.eqN.bg() != null) {
                this.bX = new com.bytedance.sdk.component.WR.eqN(com.bytedance.sdk.component.adexpress.eqN.bg());
                return;
            }
            return;
        }
        this.eo = true;
        android.util.Log.d("WebViewRender", "initWebView: reuse WebView");
    }

    private void PX() {
        if (this.ldr == null && com.bytedance.sdk.component.adexpress.eqN.bg() != null) {
            this.ldr = com.bytedance.sdk.component.adexpress.eqN.bg();
        }
        if (this.ldr != null) {
            com.bytedance.sdk.component.WR.eqN eqnTa = Ta();
            this.bX = eqnTa;
            if (eqnTa == null) {
                android.util.Log.d("WebViewRender", "initWebView: create WebView by act");
                this.bX = new com.bytedance.sdk.component.WR.eqN(new android.content.MutableContextWrapper(this.ldr.getApplicationContext()));
            } else {
                this.eo = true;
                android.util.Log.d("WebViewRender", "initWebView: reuse WebView");
            }
        }
    }

    private com.bytedance.sdk.component.WR.eqN Ta() {
        if (this.PX.rri()) {
            return com.bytedance.sdk.component.adexpress.zx.zx.bg().bg(this.ldr, this.iR);
        }
        return com.bytedance.sdk.component.adexpress.zx.zx.bg().IL(this.ldr, this.iR);
    }

    private void yDt() {
        if (this.PX.rri()) {
            com.bytedance.sdk.component.adexpress.zx.zx.bg().IL(this.bX);
        } else {
            com.bytedance.sdk.component.adexpress.zx.zx.bg().bX(this.bX);
        }
    }

    public void bg(java.lang.String str) {
        this.Kg = str;
    }

    public com.bytedance.sdk.component.WR.eqN bg() {
        return this.bX;
    }

    public void bg(com.bytedance.sdk.component.adexpress.IL.Kg kg) {
        this.VB = kg;
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.eqN
    public void bg(com.bytedance.sdk.component.adexpress.IL.iR iRVar) {
        this.WR = iRVar;
        if (bg() == null || bg().getWebView() == null) {
            this.WR.bg(102, "SSWebview null is " + (bg() == null) + " or Webview is null");
            return;
        }
        if (android.text.TextUtils.isEmpty(this.Kg)) {
            this.WR.bg(102, "url is empty");
            return;
        }
        if (!this.PX.rri()) {
            if (!this.Lq && !com.bytedance.sdk.component.adexpress.bg.IL.IL.bg(this.bg)) {
                this.WR.bg(103, "data null is " + (this.bg == null));
                return;
            } else if (this.Lq && !com.bytedance.sdk.component.adexpress.bg.IL.IL.bX(this.bg)) {
                this.WR.bg(103, "choice ad data null is " + (this.bg == null));
                return;
            }
        } else if (bX() == 9 && !com.bytedance.sdk.component.adexpress.bg.IL.IL.IL(this.bg)) {
            this.WR.bg(103, "data null is " + (this.bg == null));
            return;
        }
        this.PX.zx().bg(this.eo);
        if (this.eo) {
            try {
                this.bX.Ta();
                this.PX.zx();
                com.bytedance.sdk.component.utils.VB.bg(this.bX.getWebView(), "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();");
                return;
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.adexpress.zx.zx.bg().zx(this.bX);
                this.WR.bg(102, "load exception is " + e.getMessage());
                return;
            }
        }
        com.bytedance.sdk.component.WR.eqN eqnBg = bg();
        eqnBg.Ta();
        this.PX.zx();
        eqnBg.a_(this.Kg);
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.eqN
    /* JADX INFO: renamed from: IL, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.WR.eqN zx() {
        return bg();
    }

    public void eqN() {
        if (this.zx.get()) {
            return;
        }
        this.zx.set(true);
        iR();
        if (this.bX.getParent() != null) {
            ((android.view.ViewGroup) this.bX.getParent()).removeView(this.bX);
        }
        if (this.IL) {
            yDt();
        } else {
            com.bytedance.sdk.component.adexpress.zx.zx.bg().zx(this.bX);
        }
    }

    public void ldr() {
        if (bg() == null) {
            return;
        }
        try {
            bg().getWebView().resumeTimers();
        } catch (java.lang.Exception unused) {
        }
    }

    public void bg(boolean z) {
        this.Ta = z;
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.VB
    public void bg(final com.bytedance.sdk.component.adexpress.IL.yDt ydt) {
        if (ydt == null) {
            if (this.WR != null) {
                this.WR.bg(105, "renderResult is null");
                return;
            }
            return;
        }
        boolean zBX = ydt.bX();
        final float fEqN = (float) ydt.eqN();
        final float fZx = (float) ydt.zx();
        if (bX() == 0 && (fEqN <= 0.0f || fZx <= 0.0f)) {
            if (this.WR != null) {
                this.WR.bg(105, "width is " + fEqN + "height is " + fZx);
            }
        } else {
            this.IL = zBX;
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                bg(ydt, fEqN, fZx);
            } else {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.bytedance.sdk.component.adexpress.zx.bg.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.component.adexpress.zx.bg.this.bg(ydt, fEqN, fZx);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(com.bytedance.sdk.component.adexpress.IL.yDt ydt, float f, float f2) {
        ydt.VB();
        boolean z = this.IL;
        if (z && !this.Ta) {
            bg(f, f2);
            bg(this.eqN);
            if (this.WR != null) {
                this.WR.bg(bg(), ydt);
                return;
            }
            return;
        }
        if (!z) {
            com.bytedance.sdk.component.adexpress.zx.zx.bg().zx(this.bX);
        }
        bg(ydt.VB(), ydt.eo());
    }

    @Override // com.bytedance.sdk.component.adexpress.IL.VB
    public void bg(android.view.View view, int i, com.bytedance.sdk.component.adexpress.bX bXVar) {
        com.bytedance.sdk.component.adexpress.IL.Kg kg = this.VB;
        if (kg != null) {
            kg.bg(view, i, bXVar);
        }
    }

    private void bg(float f, float f2) {
        this.PX.zx().zx();
        if (bX() == 9) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) bg().getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            }
            layoutParams.width = -1;
            layoutParams.height = -1;
            bg().setLayoutParams(layoutParams);
            return;
        }
        int iBg = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.ldr, f);
        int iBg2 = (int) com.bytedance.sdk.component.adexpress.eqN.Kg.bg(this.ldr, f2);
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) bg().getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new android.widget.FrameLayout.LayoutParams(iBg, iBg2);
        }
        layoutParams2.width = iBg;
        layoutParams2.height = iBg2;
        bg().setLayoutParams(layoutParams2);
    }

    private void bg(int i, java.lang.String str) {
        if (this.WR != null) {
            this.WR.bg(i, str);
        }
    }

    private int IL(android.app.Activity activity) {
        return activity.hashCode();
    }

    public void Kg() {
        WR();
        android.app.Activity activityBg = com.bytedance.sdk.component.utils.IL.bg(this.bX);
        if (activityBg != null) {
            this.yDt = IL(activityBg);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.bg
    public void bg(android.app.Activity activity) {
        if (this.yDt == 0 || activity == null || activity.hashCode() != this.yDt) {
            return;
        }
        eqN();
        eo();
    }

    public void bg(org.json.JSONObject jSONObject) {
        this.bg = jSONObject;
    }

    public com.bytedance.sdk.component.adexpress.IL.Ta VB() {
        return this.PX;
    }

    public void IL(boolean z) {
        this.Lq = z;
    }
}
