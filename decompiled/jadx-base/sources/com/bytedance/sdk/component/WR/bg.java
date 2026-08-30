package com.bytedance.sdk.component.WR;

/* JADX INFO: loaded from: classes3.dex */
public class bg implements android.view.View.OnTouchListener, com.bytedance.sdk.component.utils.JAA.bg {
    private android.view.View.OnTouchListener Fy;
    private final int IL;
    private volatile float Kg;
    private android.view.ViewConfiguration LZ;
    private long PX;
    private int Ta;
    private long VB;
    private float VzQ;
    private final int bX;
    private final java.util.List<java.lang.Integer> eqN;
    private volatile float iR;
    private final android.content.Context ldr;
    private java.lang.String tuV;
    private boolean vb;
    private float xxp;
    private final int zx;
    private float WR = -1.0f;
    private float eo = -1.0f;
    private final android.os.Handler Lq = new com.bytedance.sdk.component.utils.JAA(com.bytedance.sdk.component.utils.iR.bg().getLooper(), this);
    com.bytedance.sdk.component.WR.bg.InterfaceC0101bg bg = new com.bytedance.sdk.component.WR.bg.InterfaceC0101bg() { // from class: com.bytedance.sdk.component.WR.bg.1
        @Override // com.bytedance.sdk.component.WR.bg.InterfaceC0101bg
        public void bg() {
            if (com.bytedance.sdk.component.WR.bg.this.WR == -1.0f && com.bytedance.sdk.component.WR.bg.this.eo == -1.0f && com.bytedance.sdk.component.WR.bg.this.PX == -1) {
                java.lang.Object[] objArr = new java.lang.Object[5];
                java.lang.Float.valueOf(com.bytedance.sdk.component.WR.bg.this.WR);
                java.lang.Float.valueOf(com.bytedance.sdk.component.WR.bg.this.eo);
                com.bytedance.sdk.component.WR.bg bgVar = com.bytedance.sdk.component.WR.bg.this;
                bgVar.WR = bgVar.iR;
                com.bytedance.sdk.component.WR.bg bgVar2 = com.bytedance.sdk.component.WR.bg.this;
                bgVar2.eo = bgVar2.Kg;
                com.bytedance.sdk.component.WR.bg bgVar3 = com.bytedance.sdk.component.WR.bg.this;
                bgVar3.PX = bgVar3.VB;
                com.bytedance.sdk.component.WR.bg.this.vb = true;
            }
            java.lang.Object[] objArr2 = new java.lang.Object[5];
            java.lang.Float.valueOf(com.bytedance.sdk.component.WR.bg.this.WR);
            java.lang.Float.valueOf(com.bytedance.sdk.component.WR.bg.this.eo);
        }

        @Override // com.bytedance.sdk.component.WR.bg.InterfaceC0101bg
        public void bg(int i) {
            com.bytedance.sdk.component.WR.bg.this.Ta = i;
            com.bytedance.sdk.component.WR.bg.this.IL();
        }
    };
    private int tC = -1;
    private final java.util.List<java.lang.Integer> yDt = new java.util.ArrayList();

    /* JADX INFO: renamed from: com.bytedance.sdk.component.WR.bg$bg, reason: collision with other inner class name */
    public interface InterfaceC0101bg {
        void bg();

        void bg(int i);
    }

    public bg(android.content.Context context, int i, int i2, java.util.List<java.lang.Integer> list, int i3) {
        this.ldr = context;
        if (i == -1) {
            this.IL = com.bytedance.sdk.component.utils.Ja.bg(context);
        } else {
            this.IL = com.bytedance.sdk.component.utils.Ja.bg(context, i);
        }
        this.bX = com.bytedance.sdk.component.utils.Ja.bg(context, i2);
        this.eqN = list;
        this.zx = i3;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        java.lang.Object[] objArr = new java.lang.Object[6];
        java.lang.Integer.valueOf(action);
        java.lang.Float.valueOf(motionEvent.getX());
        java.lang.Float.valueOf(motionEvent.getY());
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        this.VB = android.os.SystemClock.elapsedRealtime();
        this.iR = x;
        this.Kg = y;
        if (action == 0) {
            this.xxp = x;
            this.VzQ = y;
            java.lang.Object[] objArr2 = new java.lang.Object[5];
            java.lang.Float.valueOf(x);
            java.lang.Float.valueOf(this.VzQ);
        } else if (action == 1) {
            java.lang.Object[] objArr3 = new java.lang.Object[5];
            java.lang.Float.valueOf(x);
            java.lang.Float.valueOf(y);
            if (bg(x, y)) {
                int iBg = bg(this.iR, this.Kg, this.VB);
                boolean z = !this.yDt.contains(java.lang.Integer.valueOf(this.Ta));
                bg(view, motionEvent, iBg, z);
                if (z) {
                    this.yDt.add(java.lang.Integer.valueOf(this.Ta));
                }
                if (iBg == 0) {
                    motionEvent.setAction(3);
                }
            }
        }
        android.view.View.OnTouchListener onTouchListener = this.Fy;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }

    public void bg(android.view.View.OnTouchListener onTouchListener) {
        this.Fy = onTouchListener;
    }

    public com.bytedance.sdk.component.WR.bg.InterfaceC0101bg bg() {
        return this.bg;
    }

    private void bg(android.view.View view, android.view.MotionEvent motionEvent, int i, boolean z) {
        java.lang.String url;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        android.webkit.WebView webView = view instanceof android.webkit.WebView ? (android.webkit.WebView) view : null;
        if (webView != null) {
            try {
                url = webView.getUrl();
            } catch (java.lang.Throwable unused) {
            }
        } else {
            url = "";
        }
        jSONObject.put("arbi_current_url", url);
        jSONObject.put("click_x", motionEvent.getX());
        jSONObject.put("click_y", motionEvent.getY());
        int i2 = 1;
        jSONObject.put("is_interceptor", i == 0 ? 1 : 0);
        if (!z) {
            i2 = 0;
        }
        jSONObject.put("is_first_click", i2);
        jSONObject.put("click_timestamp", java.lang.System.currentTimeMillis());
        jSONObject.put("arbi_interceptor_type", i);
        jSONObject.put("current_url_index", this.Ta);
        android.os.Message messageObtain = android.os.Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = jSONObject;
        this.Lq.sendMessageDelayed(messageObtain, 200L);
    }

    private boolean bg(float f, float f2) {
        if (this.LZ == null) {
            this.LZ = android.view.ViewConfiguration.get(this.ldr);
        }
        if (this.tC == -1) {
            this.tC = this.LZ.getScaledTouchSlop();
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.Integer.valueOf(this.tC);
        if (java.lang.Math.abs(f - this.xxp) <= this.tC && java.lang.Math.abs(f2 - this.VzQ) <= this.tC) {
            java.lang.Object[] objArr2 = new java.lang.Object[9];
            java.lang.Float.valueOf(f);
            java.lang.Float.valueOf(this.xxp);
            java.lang.Float.valueOf(f2);
            java.lang.Float.valueOf(this.VzQ);
            return true;
        }
        java.lang.Object[] objArr3 = new java.lang.Object[9];
        java.lang.Float.valueOf(f);
        java.lang.Float.valueOf(this.xxp);
        java.lang.Float.valueOf(f2);
        java.lang.Float.valueOf(this.VzQ);
        return false;
    }

    public void bg(java.lang.String str) {
        this.tuV = str;
    }

    private int bg(float f, float f2, long j) {
        if (this.WR == -1.0f && this.eo == -1.0f && this.PX == -1) {
            return 1;
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        java.lang.Integer.valueOf(this.Ta);
        if (!this.eqN.contains(java.lang.Integer.valueOf(this.Ta))) {
            return 2;
        }
        if (j - this.PX > this.zx) {
            IL();
            return 3;
        }
        float fAbs = java.lang.Math.abs(f - this.WR);
        float fAbs2 = java.lang.Math.abs(f2 - this.eo);
        java.lang.Object[] objArr2 = new java.lang.Object[6];
        java.lang.Float.valueOf(f);
        java.lang.Float.valueOf(this.WR);
        java.lang.Float.valueOf(fAbs);
        java.lang.Object[] objArr3 = new java.lang.Object[6];
        java.lang.Float.valueOf(f2);
        java.lang.Float.valueOf(this.eo);
        java.lang.Float.valueOf(fAbs2);
        java.lang.Object[] objArr4 = new java.lang.Object[4];
        java.lang.Integer.valueOf(this.IL);
        java.lang.Integer.valueOf(this.bX);
        if (fAbs <= this.IL / 2.0f && fAbs2 <= this.bX / 2.0f) {
            return 0;
        }
        IL();
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL() {
        this.WR = -1.0f;
        this.eo = -1.0f;
        this.PX = -1L;
    }

    @Override // com.bytedance.sdk.component.utils.JAA.bg
    public void bg(android.os.Message message) {
        int i = message.what;
        java.lang.Object obj = message.obj;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (i == 100) {
            if (obj instanceof org.json.JSONObject) {
                jSONObject = (org.json.JSONObject) obj;
                try {
                    jSONObject.put("is_trigger_jump", this.vb ? 1 : 0);
                    this.vb = false;
                } catch (java.lang.Throwable unused) {
                }
            }
            if (com.bytedance.sdk.component.WR.bg.bg.bg().IL() != null) {
                com.bytedance.sdk.component.WR.bg.bg.bg().IL().bg(this.tuV, "arbitrage_click_event", jSONObject);
            }
        }
    }
}
