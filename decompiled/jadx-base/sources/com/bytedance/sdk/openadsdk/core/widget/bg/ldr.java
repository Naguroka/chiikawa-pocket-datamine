package com.bytedance.sdk.openadsdk.core.widget.bg;

/* JADX INFO: loaded from: classes4.dex */
public class ldr implements com.bytedance.sdk.component.utils.JAA.bg {
    com.bytedance.sdk.openadsdk.core.model.tuV IL;
    boolean Kg;
    float Lq;
    float PX;
    float Ta;
    private long Uq;
    float VB;
    boolean VzQ;
    java.lang.String WR;
    private boolean aGH;
    android.content.Context bg;
    int eo;
    android.webkit.WebView eqN;
    boolean iR;
    long tuV;
    long vb;
    boolean xxp;
    float yDt;
    private final android.os.Handler Ja = new com.bytedance.sdk.component.utils.JAA(com.bytedance.sdk.openadsdk.core.yDt.IL().getLooper(), this);
    java.lang.String bX = "landingpage";
    int ldr = 0;
    private final java.lang.String Uw = ".*\\/serp\\?sc=.*&clkt=\\d+$";
    private final java.lang.String DDQ = ".*\\/\\?caf_results=.*&clkt=\\d+$";
    com.bytedance.sdk.openadsdk.core.widget.bg.ldr.bg kMt = new com.bytedance.sdk.openadsdk.core.widget.bg.ldr.bg() { // from class: com.bytedance.sdk.openadsdk.core.widget.bg.ldr.1
        @Override // com.bytedance.sdk.openadsdk.core.widget.bg.ldr.bg
        public void bg() {
            com.bytedance.sdk.openadsdk.core.widget.bg.ldr.this.Kg = true;
            com.bytedance.sdk.openadsdk.core.widget.bg.ldr.this.ldr();
            com.bytedance.sdk.openadsdk.core.widget.bg.ldr ldrVar = com.bytedance.sdk.openadsdk.core.widget.bg.ldr.this;
            ldrVar.bg(2, ldrVar.WR, com.bytedance.sdk.openadsdk.core.widget.bg.ldr.this.eo);
        }
    };
    android.view.GestureDetector JAA = new android.view.GestureDetector(com.bytedance.sdk.openadsdk.core.VzQ.bg(), new android.view.GestureDetector.SimpleOnGestureListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.bg.ldr.2
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
            com.bytedance.sdk.openadsdk.core.widget.bg.ldr.this.xxp = true;
            return false;
        }
    });
    int zx = com.bytedance.sdk.openadsdk.core.VzQ.eqN().hff();
    java.util.Map<java.lang.Integer, java.lang.Long> Fy = new java.util.HashMap();
    java.util.Map<java.lang.Integer, java.lang.Float> LZ = new java.util.HashMap();
    java.util.Map<java.lang.Integer, java.lang.Long> tC = new java.util.HashMap();
    java.util.List<java.lang.Integer> rri = new java.util.ArrayList();

    public interface bg {
        void bg();
    }

    public ldr(android.webkit.WebView webView, com.bytedance.sdk.openadsdk.core.model.tuV tuv, android.content.Context context) {
        this.IL = tuv;
        this.eqN = webView;
        this.bg = context;
    }

    public void bg(java.lang.String str) {
        this.bX = str;
    }

    public void IL(java.lang.String str) {
        this.WR = str;
        Kg();
        this.Fy.put(java.lang.Integer.valueOf(this.eo), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        this.tC.put(java.lang.Integer.valueOf(this.eo), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        this.aGH = zx();
    }

    public void bg() {
        IL(this.eo);
    }

    public void bg(int i) {
        float height = (i + this.eqN.getHeight()) / com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.bg, this.eqN.getContentHeight());
        java.lang.Float f = this.LZ.get(java.lang.Integer.valueOf(this.eo));
        float fFloatValue = f == null ? 0.0f : f.floatValue();
        java.lang.Object[] objArr = new java.lang.Object[6];
        java.lang.Float.valueOf(fFloatValue);
        java.lang.Float.valueOf(height);
        java.lang.Integer.valueOf(this.eo);
        if (height > fFloatValue) {
            this.LZ.put(java.lang.Integer.valueOf(this.eo), java.lang.Float.valueOf(height));
        }
    }

    public void IL() {
        this.eqN.getViewTreeObserver().addOnWindowFocusChangeListener(new android.view.ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.bg.ldr.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                java.lang.Boolean.valueOf(z);
                if (!z) {
                    if (!com.bytedance.sdk.openadsdk.core.widget.bg.ldr.this.Kg) {
                        com.bytedance.sdk.openadsdk.core.widget.bg.ldr.this.ldr();
                        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        if (jElapsedRealtime - com.bytedance.sdk.openadsdk.core.widget.bg.ldr.this.Uq >= 50) {
                            com.bytedance.sdk.openadsdk.core.widget.bg.ldr ldrVar = com.bytedance.sdk.openadsdk.core.widget.bg.ldr.this;
                            ldrVar.bg(3, ldrVar.WR, com.bytedance.sdk.openadsdk.core.widget.bg.ldr.this.eo);
                            com.bytedance.sdk.openadsdk.core.widget.bg.ldr.this.Uq = jElapsedRealtime;
                            return;
                        }
                        return;
                    }
                    com.bytedance.sdk.openadsdk.core.widget.bg.ldr.this.Kg = false;
                }
                if (z) {
                    com.bytedance.sdk.openadsdk.core.widget.bg.ldr.this.Kg();
                    com.bytedance.sdk.openadsdk.core.widget.bg.ldr.this.Fy.put(java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.core.widget.bg.ldr.this.eo), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                }
            }
        });
    }

    public void bX(java.lang.String str) {
        if (this.iR) {
            this.VzQ = true;
        }
        if (this.eo == 1 && !android.text.TextUtils.isEmpty(str) && str.contains("query=")) {
            int iIndexOf = str.indexOf("query=") + 6;
            int iIndexOf2 = str.indexOf(com.ironsource.y8.i.c, iIndexOf);
            if (iIndexOf < 0 || iIndexOf2 >= str.length() || iIndexOf2 <= iIndexOf) {
                return;
            }
            eqN(str.substring(iIndexOf, iIndexOf2));
        }
    }

    public void bg(android.view.MotionEvent motionEvent) {
        this.JAA.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.VB = motionEvent.getX();
            this.PX = motionEvent.getY();
            this.vb = android.os.SystemClock.elapsedRealtime();
        } else if (action != 1) {
            if (action != 3) {
                return;
            }
            bX(2);
        } else {
            this.tuV = android.os.SystemClock.elapsedRealtime() - this.vb;
            if (IL(motionEvent)) {
                eqN();
            } else {
                bX(1);
            }
        }
    }

    public com.bytedance.sdk.openadsdk.core.widget.bg.ldr.bg bX() {
        return this.kMt;
    }

    private void eqN(java.lang.String str) {
        if (iR()) {
            return;
        }
        com.bytedance.sdk.openadsdk.eqN.bX.bg(this.IL, new com.bytedance.sdk.openadsdk.yDt.bg.bg.C0170bg().bg(this.WR).IL(android.net.Uri.decode(str)).bg(), this.bX);
    }

    private void IL(int i) {
        if (iR() || this.rri.contains(java.lang.Integer.valueOf(i))) {
            return;
        }
        this.rri.add(java.lang.Integer.valueOf(i));
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.Long l = this.tC.get(java.lang.Integer.valueOf(i));
        com.bytedance.sdk.openadsdk.eqN.bX.IL(this.IL, new com.bytedance.sdk.openadsdk.yDt.bg.bg.C0170bg().bg(this.WR).bg(this.eo).eo(jElapsedRealtime - (l != null ? l.longValue() : jElapsedRealtime)).bg(), this.bX);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(int i, java.lang.String str, int i2) {
        if (iR()) {
            return;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.Long l = this.Fy.get(java.lang.Integer.valueOf(i2));
        long jLongValue = l != null ? l.longValue() : jElapsedRealtime;
        java.lang.Float f = this.LZ.get(java.lang.Integer.valueOf(i2));
        com.bytedance.sdk.openadsdk.eqN.bX.bX(this.IL, new com.bytedance.sdk.openadsdk.yDt.bg.bg.C0170bg().bg(str).bg(i2).Kg(jElapsedRealtime - jLongValue).WR(f == null ? 0.0f : f.floatValue()).IL(i).bg(), this.bX);
    }

    private void eqN() {
        if (iR()) {
            return;
        }
        com.bytedance.sdk.openadsdk.yDt.bg.bg bgVarBg = new com.bytedance.sdk.openadsdk.yDt.bg.bg.C0170bg().bg(this.WR).bg(this.eo).eqN(this.VB).zx(this.PX).ldr(this.Lq).iR(this.tuV).bg();
        android.os.Message messageObtain = android.os.Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = bgVarBg;
        this.Ja.sendMessageDelayed(messageObtain, 20L);
    }

    private void bX(int i) {
        if (iR()) {
            return;
        }
        ldr();
        this.iR = true;
        com.bytedance.sdk.openadsdk.yDt.bg.bg bgVarBg = new com.bytedance.sdk.openadsdk.yDt.bg.bg.C0170bg().bg(this.WR).bg(this.eo).bg(this.VB).IL(this.PX).bX(this.tuV).bX(i).bg();
        try {
            if (this.aGH) {
                android.webkit.WebView.HitTestResult hitTestResult = this.eqN.getHitTestResult();
                bgVarBg.bg(hitTestResult.getExtra());
                bgVarBg.bg(hitTestResult.getType());
            }
        } catch (java.lang.Throwable unused) {
        }
        android.os.Message messageObtain = android.os.Message.obtain();
        messageObtain.what = 200;
        messageObtain.obj = bgVarBg;
        this.Ja.sendMessageDelayed(messageObtain, 100L);
    }

    private boolean zx() {
        try {
            int i = this.eo;
            if (i == 2 || i == 3) {
                return java.util.regex.Pattern.matches(".*\\/serp\\?sc=.*&clkt=\\d+$", this.WR) || java.util.regex.Pattern.matches(".*\\/\\?caf_results=.*&clkt=\\d+$", this.WR);
            }
            return false;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("WebArbitrageBehavior", th.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ldr() {
        if (this.LZ.get(java.lang.Integer.valueOf(this.eo)) != null) {
            return;
        }
        float height = this.eqN.getHeight() / com.bytedance.sdk.openadsdk.utils.ZQc.bX(this.bg, this.eqN.getContentHeight());
        if (height < 0.0f || height > 1.0f) {
            height = 0.0f;
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        java.lang.Float.valueOf(height);
        java.lang.Integer.valueOf(this.eo);
        this.LZ.put(java.lang.Integer.valueOf(this.eo), java.lang.Float.valueOf(height));
    }

    private boolean iR() {
        int i = this.ldr + 1;
        this.ldr = i;
        if (i > this.zx) {
            return true;
        }
        return ("landingpage".equals(this.bX) || "landingpage_endcard".equals(this.bX) || "landingpage_split_screen".equals(this.bX) || "landingpage_direct".equals(this.bX)) ? false : true;
    }

    private boolean IL(android.view.MotionEvent motionEvent) {
        this.Ta = motionEvent.getX();
        float y = motionEvent.getY();
        this.yDt = y;
        float f = this.PX;
        if (y - f == 0.0f) {
            return false;
        }
        this.Lq = y - f;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Kg() {
        android.webkit.WebBackForwardList webBackForwardListCopyBackForwardList = this.eqN.copyBackForwardList();
        if (webBackForwardListCopyBackForwardList != null) {
            this.eo = webBackForwardListCopyBackForwardList.getCurrentIndex() + 1;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.Integer.valueOf(this.eo);
    }

    @Override // com.bytedance.sdk.component.utils.JAA.bg
    public void bg(android.os.Message message) {
        int i = message.what;
        com.bytedance.sdk.openadsdk.yDt.bg.bg bgVar = (com.bytedance.sdk.openadsdk.yDt.bg.bg) message.obj;
        if (i == 100) {
            bgVar.eqN(this.xxp ? 2 : 1);
            com.bytedance.sdk.openadsdk.eqN.bX.eqN(this.IL, bgVar, this.bX);
            this.xxp = false;
        } else if (i == 200) {
            if (this.VzQ) {
                bg(1, bgVar.bX(), bgVar.eqN());
            }
            bgVar.bX(this.VzQ ? 1 : 0);
            com.bytedance.sdk.openadsdk.eqN.bX.zx(this.IL, bgVar, this.bX);
            this.iR = false;
            this.VzQ = false;
        }
    }
}
