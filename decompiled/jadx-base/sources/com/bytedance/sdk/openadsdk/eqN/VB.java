package com.bytedance.sdk.openadsdk.eqN;

/* JADX INFO: loaded from: classes4.dex */
public class VB {
    private static final int[] IL = {10, 30, 50, 75, 100};
    private java.lang.String ApA;
    private final java.util.concurrent.atomic.AtomicBoolean CQc;
    private final java.util.concurrent.atomic.AtomicInteger DDQ;
    private volatile long Dxa;
    private java.lang.String Fy;
    private long JAA;
    private boolean Ja;
    private final java.util.concurrent.atomic.AtomicBoolean Kg;
    private final java.util.concurrent.atomic.AtomicInteger LKE;
    private long LZ;
    private com.bytedance.sdk.openadsdk.core.widget.bg.ldr Lq;
    private java.lang.String PX;
    private final java.util.concurrent.atomic.AtomicBoolean Pae;
    private java.lang.String RJ;
    private java.lang.String Ta;
    private java.lang.ref.WeakReference<android.webkit.WebView> Uq;
    private final boolean Uw;
    private boolean VB;
    private boolean VJ;
    private com.bytedance.sdk.openadsdk.eqN.eqN.zx VW;
    private com.bytedance.sdk.openadsdk.eqN.Kg VzQ;
    private final java.util.concurrent.atomic.AtomicBoolean WR;
    private final java.util.concurrent.atomic.AtomicInteger ZQc;
    private boolean aGH;
    private volatile long ayS;
    private volatile long bN;
    private int bX;
    public com.bytedance.sdk.openadsdk.core.widget.bg.ldr.bg bg;
    private com.bytedance.sdk.openadsdk.eqN.eo daV;
    private int eo;
    private long eqN;
    private final java.util.concurrent.atomic.AtomicBoolean iR;
    private volatile long jz;
    private long kMt;
    private final java.util.concurrent.atomic.AtomicBoolean ldr;
    private int qC;
    private long rri;
    private final java.util.concurrent.atomic.AtomicBoolean sVc;
    private long tC;
    private final com.bytedance.sdk.openadsdk.core.model.tuV tuV;
    private long txA;
    private volatile int uu;
    private boolean vb;
    private com.bytedance.sdk.openadsdk.tuV.Kg xxp;
    private final android.content.Context yDt;
    private int zx;

    public com.bytedance.sdk.openadsdk.core.model.tuV bg() {
        return this.tuV;
    }

    public VB(com.bytedance.sdk.openadsdk.core.model.tuV tuv, android.webkit.WebView webView, com.bytedance.sdk.openadsdk.eqN.eo eoVar, int i) {
        this(tuv, webView);
        this.daV = eoVar;
        this.qC = i;
    }

    public VB(com.bytedance.sdk.openadsdk.core.model.tuV tuv, android.webkit.WebView webView) {
        this.bX = 0;
        this.eqN = -1L;
        this.zx = 1;
        this.ldr = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.iR = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.Kg = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.WR = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.eo = -1;
        this.Fy = "landingpage";
        this.LZ = 0L;
        this.tC = 0L;
        this.rri = 0L;
        this.kMt = 0L;
        this.JAA = 0L;
        this.Ja = false;
        this.Uw = false;
        this.DDQ = new java.util.concurrent.atomic.AtomicInteger(0);
        this.aGH = false;
        this.VJ = false;
        this.ayS = 0L;
        this.ZQc = new java.util.concurrent.atomic.AtomicInteger(0);
        this.LKE = new java.util.concurrent.atomic.AtomicInteger(0);
        this.CQc = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.uu = 0;
        this.qC = -1;
        this.Pae = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.sVc = new java.util.concurrent.atomic.AtomicBoolean(false);
        android.content.Context contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
        this.yDt = contextBg;
        this.tuV = tuv;
        if (webView == null) {
            return;
        }
        java.lang.ref.WeakReference<android.webkit.WebView> weakReference = new java.lang.ref.WeakReference<>(webView);
        this.Uq = weakReference;
        android.webkit.WebView webView2 = weakReference.get();
        if (webView2 == null) {
            return;
        }
        if (tuv != null && tuv.Pae()) {
            com.bytedance.sdk.openadsdk.core.widget.bg.ldr ldrVar = new com.bytedance.sdk.openadsdk.core.widget.bg.ldr(webView2, tuv, contextBg);
            this.Lq = ldrVar;
            this.bg = ldrVar.bX();
        }
        if (tuv != null && tuv.RJ() && com.bytedance.sdk.openadsdk.core.settings.xxp.zU().FFy()) {
            this.VzQ = new com.bytedance.sdk.openadsdk.eqN.Kg(tuv, webView);
        }
        if (webView instanceof com.bytedance.sdk.component.WR.bX) {
            this.txA = ((com.bytedance.sdk.component.WR.bX) webView2).bg;
        } else {
            this.txA = java.lang.System.currentTimeMillis();
        }
        try {
            webView2.addJavascriptInterface(new com.bytedance.sdk.openadsdk.eqN.VB.bg(), "JS_LANDING_PAGE_LOG_OBJ");
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("LandingPageLog", "addJavascriptInterface exception", e);
        }
        if (tuv != null && tuv.DCn() != null) {
            this.eqN = tuv.DCn().optLong("page_id", -1L);
        }
        this.ApA = java.lang.String.valueOf(android.os.SystemClock.elapsedRealtime());
    }

    public void bg(long j) {
        this.tC = j;
    }

    public void bg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.bg.ldr ldrVar = this.Lq;
        if (ldrVar != null) {
            ldrVar.bg(str);
        }
        com.bytedance.sdk.openadsdk.eqN.Kg kg = this.VzQ;
        if (kg != null) {
            kg.bX(str);
        }
        this.Fy = str;
    }

    public void bg(int i) {
        this.qC = i;
    }

    public com.bytedance.sdk.openadsdk.eqN.eqN.zx IL() {
        return this.VW;
    }

    public void bg(com.bytedance.sdk.openadsdk.eqN.eqN.zx zxVar) {
        this.VW = zxVar;
    }

    public com.bytedance.sdk.openadsdk.eqN.VB bg(boolean z) {
        this.aGH = z;
        return this;
    }

    public boolean bX() {
        return this.VJ;
    }

    public void IL(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.RJ = str;
    }

    public void bg(com.bytedance.sdk.openadsdk.tuV.Kg kg) {
        this.xxp = kg;
    }

    public void IL(boolean z) {
        this.VJ = z;
    }

    public void eqN() {
        if (WR()) {
            this.Dxa = android.os.SystemClock.elapsedRealtime();
            com.bytedance.sdk.openadsdk.eqN.bX.bg(this.tuV, this.RJ);
        }
    }

    public void zx() {
        if (WR()) {
            this.bN = android.os.SystemClock.elapsedRealtime();
            ldr();
        }
    }

    public void ldr() {
        if (WR() && this.bN > 0 && this.jz > 0 && !this.Pae.getAndSet(true)) {
            com.bytedance.sdk.openadsdk.eqN.bX.IL(this.jz - this.bN, this.tuV, this.RJ, (java.lang.String) null);
        }
    }

    public void bg(android.webkit.WebView webView, int i) {
        if (webView == null) {
            return;
        }
        if (this.ayS == 0) {
            this.ayS = android.os.SystemClock.elapsedRealtime();
        }
        if (this.rri == 0 && i > 0) {
            this.rri = java.lang.System.currentTimeMillis();
        } else if (this.kMt == 0 && i == 100) {
            this.kMt = java.lang.System.currentTimeMillis();
        }
        if (this.bX != IL.length && ("landingpage".equals(this.Fy) || "landingpage_endcard".equals(this.Fy) || "landingpage_split_screen".equals(this.Fy) || "landingpage_direct".equals(this.Fy) || "aggregate_page".equals(this.Fy))) {
            int i2 = this.bX;
            while (true) {
                int[] iArr = IL;
                if (i2 >= iArr.length || i < iArr[this.bX]) {
                    break;
                }
                int i3 = i2 + 1;
                this.bX = i3;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("url", webView.getUrl());
                    long j = this.eqN;
                    if (j != -1) {
                        jSONObject.put("page_id", j);
                    }
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("pct", iArr[i2]);
                } catch (java.lang.Exception unused) {
                }
                bg("progress_load_finish", jSONObject);
                i2 = i3;
            }
        }
        if (i == 100) {
            bg(webView.getUrl(), "progress", java.lang.Math.min(this.kMt - this.rri, com.bytedance.sdk.openadsdk.TTAdConstant.AD_MAX_EVENT_TIME));
        }
    }

    private void bg(java.lang.String str, java.lang.String str2, long j) {
        if (this.Kg.compareAndSet(false, true)) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                if (str.length() > 200) {
                    int iIndexOf = str.indexOf(38, 200);
                    int i = com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT;
                    if (iIndexOf == -1 || iIndexOf > 300) {
                        iIndexOf = str.indexOf(63);
                    }
                    if (iIndexOf != -1 && iIndexOf <= 300) {
                        i = iIndexOf;
                    }
                    str = str.substring(0, i);
                }
                jSONObject.put("url", str);
                jSONObject.put("type", str2);
            } catch (java.lang.Throwable unused) {
            }
            bg("load_finish_progress", jSONObject, j);
        }
    }

    public void bg(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap, boolean z, int i) {
        this.vb = z;
        com.bytedance.sdk.openadsdk.core.widget.bg.ldr ldrVar = this.Lq;
        if (ldrVar != null && z) {
            ldrVar.IL(str);
            this.Lq.IL();
        }
        com.bytedance.sdk.openadsdk.eqN.Kg kg = this.VzQ;
        if (kg != null && z) {
            kg.bg(str, i);
        }
        java.lang.ref.WeakReference<android.webkit.WebView> weakReference = this.Uq;
        android.webkit.WebView webView2 = weakReference != null ? weakReference.get() : null;
        if (webView2 != null) {
            try {
                android.webkit.WebBackForwardList webBackForwardListCopyBackForwardList = webView2.copyBackForwardList();
                if (webBackForwardListCopyBackForwardList != null && webBackForwardListCopyBackForwardList.getCurrentIndex() > this.uu) {
                    this.ZQc.incrementAndGet();
                }
                this.uu = webBackForwardListCopyBackForwardList.getCurrentIndex();
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.utils.PX.bg("LandingPageLog", "copyBackForwardList exception", e);
            }
        }
        if (this.ayS == 0) {
            this.ayS = android.os.SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.eqN.eqN.zx zxVar = this.VW;
        if (zxVar != null) {
            zxVar.zx();
        }
        if (this.ldr.compareAndSet(false, true)) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
                int i2 = this.qC;
                if (i2 >= 0) {
                    jSONObject.putOpt("preload_status", java.lang.Integer.valueOf(i2));
                }
            } catch (java.lang.Exception unused) {
            }
            bg("load_start", jSONObject);
        }
    }

    public void bg(android.webkit.WebView webView, java.lang.String str, boolean z) {
        com.bytedance.sdk.openadsdk.core.widget.bg.ldr ldrVar = this.Lq;
        if (ldrVar != null && z) {
            ldrVar.bg();
        }
        com.bytedance.sdk.openadsdk.eqN.eqN.zx zxVar = this.VW;
        if (zxVar != null) {
            zxVar.ldr();
        }
        com.bytedance.sdk.openadsdk.eqN.Kg kg = this.VzQ;
        if (kg != null && z) {
            kg.bg(str);
        }
        if (webView != null && !this.Ja && this.aGH) {
            this.Ja = true;
            com.bytedance.sdk.component.utils.VB.bg(webView, "javascript:\nfunction sendScroll(){\n   var totalH = document.body.scrollHeight || document.documentElement.scrollHeight;\n   var clientH = window.innerHeight || document.documentElement.clientHeight;\n   var scrollH = document.body.scrollTop || document.documentElement.scrollTop;\n   var validH = scrollH + clientH;\n   var result = (validH/totalH*100).toFixed(2);\n   console.log('LandingPageLogscroll status: (' + scrollH + '+' + clientH + ')/' + totalH + '=' + result);\n   window.JS_LANDING_PAGE_LOG_OBJ.readPercent(result);\n}\nsendScroll();\nwindow.addEventListener('scroll', function(e){\n    sendScroll();\n});");
        }
        if (this.iR.compareAndSet(false, true)) {
            if (this.zx != 3) {
                this.zx = 2;
            }
            this.LZ = java.lang.System.currentTimeMillis();
            boolean z2 = this.zx == 2;
            int iEo = eo();
            if (z2) {
                long j = this.kMt - this.rri;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("error_code", this.eo);
                    jSONObject.put("error_msg", this.PX);
                    jSONObject.put("error_url", this.Ta);
                    int i = this.qC;
                    if (i >= 0) {
                        jSONObject.put("preload_status", i);
                    }
                    jSONObject.put("first_page", iEo);
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("url", this.tuV.GvG());
                    jSONObject.put("preload_h5_type", this.tuV.ULi());
                } catch (java.lang.Exception unused) {
                }
                bg(z, "0");
                long jMin = java.lang.Math.min(j, com.bytedance.sdk.openadsdk.TTAdConstant.AD_MAX_EVENT_TIME);
                bg("load_finish", jSONObject, jMin);
                if (WR()) {
                    this.jz = android.os.SystemClock.elapsedRealtime();
                    ldr();
                    com.bytedance.sdk.openadsdk.eqN.bX.bg(this.tuV, this.RJ, this.jz - this.Dxa);
                }
                bg(str, "load_finish", jMin);
                com.bytedance.sdk.openadsdk.eqN.eo eoVar = this.daV;
                if (eoVar != null) {
                    eoVar.bg(iEo);
                    return;
                }
                return;
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("error_code", this.eo);
                jSONObject2.put("error_msg", this.PX);
                jSONObject2.put("error_url", this.Ta);
                jSONObject2.put("first_page", iEo);
                int i2 = this.qC;
                if (i2 >= 0) {
                    jSONObject2.put("preload_status", i2);
                }
                jSONObject2.putOpt("render_type", "h5");
                jSONObject2.putOpt("render_type_2", 0);
                jSONObject2.put("url", this.tuV.GvG());
                jSONObject2.put("preload_h5_type", this.tuV.ULi());
            } catch (java.lang.Exception unused2) {
            }
            bg(z, "2");
            bg("load_fail", jSONObject2);
            if (WR()) {
                com.bytedance.sdk.openadsdk.eqN.bX.bg(this.tuV, this.RJ, android.os.SystemClock.elapsedRealtime() - this.Dxa, this.eo, this.PX, this.Ta);
            }
            if (this.VB) {
                jSONObject2.remove("render_type");
                jSONObject2.remove("render_type_2");
                bg("load_fail_main", jSONObject2);
            }
        }
    }

    private boolean WR() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv;
        return this.VJ && (tuv = this.tuV) != null && tuv.yN();
    }

    private java.lang.String bX(java.lang.String str) {
        return "javascript:".concat(java.lang.String.valueOf(str));
    }

    public void bg(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        com.bytedance.sdk.openadsdk.eqN.eqN.zx zxVar = this.VW;
        if (zxVar != null) {
            zxVar.bg((org.json.JSONObject) null);
        }
        if (!(str3 != null && str3.startsWith("image")) && this.zx != 2) {
            this.zx = 3;
        }
        this.eo = i;
        this.PX = str;
        this.Ta = str2;
        this.VB = z;
    }

    public void iR() {
        if (this.JAA == 0) {
            this.JAA = java.lang.System.currentTimeMillis();
        }
        this.LZ = java.lang.System.currentTimeMillis();
        if ("landingpage".equals(this.Fy) || "landingpage_endcard".equals(this.Fy) || "landingpage_split_screen".equals(this.Fy) || "landingpage_direct".equals(this.Fy) || "aggregate_page".equals(this.Fy)) {
            if (this.sVc.compareAndSet(false, true)) {
                com.bytedance.sdk.openadsdk.ldr.IL.bg().bg("landingStart", this.tuV, this.ApA);
            } else {
                com.bytedance.sdk.openadsdk.ldr.IL.bg().bg("landingContinue", this.tuV, this.ApA);
            }
        }
    }

    public void Kg() {
        if ("landingpage".equals(this.Fy) || "landingpage_endcard".equals(this.Fy) || "landingpage_split_screen".equals(this.Fy) || "landingpage_direct".equals(this.Fy) || "aggregate_page".equals(this.Fy)) {
            if (this.zx == 2) {
                if (this.tC > 0 || !bX()) {
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - java.lang.Math.max(this.LZ, this.tC);
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("load_status", this.zx);
                        jSONObject.put("max_scroll_percent", this.DDQ.get());
                        jSONObject.put("jump_times", this.ZQc.getAndSet(0));
                        jSONObject.put("click_times", this.LKE.getAndSet(0));
                        jSONObject.putOpt("render_type", "h5");
                        jSONObject.putOpt("render_type_2", 0);
                    } catch (org.json.JSONException unused) {
                    }
                    this.WR.set(true);
                    bg("stay_page", jSONObject, java.lang.Math.min(jCurrentTimeMillis, com.bytedance.sdk.openadsdk.TTAdConstant.AD_MAX_EVENT_TIME));
                    com.bytedance.sdk.openadsdk.ldr.IL.bg().bg("landingPause", this.tuV, this.ApA);
                }
            }
        }
    }

    public void bg(com.bytedance.sdk.component.WR.eqN eqn) {
        int iWS;
        android.graphics.Bitmap bitmapBg;
        com.bytedance.sdk.openadsdk.core.model.tuV tuv;
        if ((!"landingpage".equals(this.Fy) && !"landingpage_endcard".equals(this.Fy) && !"landingpage_split_screen".equals(this.Fy) && !"landingpage_direct".equals(this.Fy) && !"aggregate_page".equals(this.Fy)) || (iWS = com.bytedance.sdk.openadsdk.core.VzQ.eqN().wS()) == 0 || new java.util.Random().nextInt(100) + 1 > iWS || eqn == null || eqn.getWebView() == null || eqn.getVisibility() != 0 || (bitmapBg = com.bytedance.sdk.openadsdk.utils.ZQc.bg(eqn)) == null || (tuv = this.tuV) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.ZQc.bg(tuv, this.Fy, "landing_page_blank", bitmapBg, eqn.getUrl(), this.eqN);
    }

    public void bX(boolean z) {
        java.lang.ref.WeakReference<android.webkit.WebView> weakReference = this.Uq;
        android.webkit.WebView webView = weakReference != null ? weakReference.get() : null;
        if (webView != null) {
            try {
                webView.removeJavascriptInterface("JS_LANDING_PAGE_LOG_OBJ");
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.utils.PX.bg("LandingPageLog", "removeJavascriptInterface exception", e);
            }
        }
        if (this.iR.compareAndSet(false, true)) {
            bg(z, "1");
            if (this.aGH) {
                com.bytedance.sdk.openadsdk.eqN.bX.bg(this.tuV, this.Fy, java.lang.System.currentTimeMillis() - this.JAA, this.qC, eo());
            }
        } else if (this.zx == 2 && !this.WR.get()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("load_status", this.zx);
                jSONObject.put("max_scroll_percent", this.DDQ.get());
                jSONObject.put("jump_times", this.ZQc.getAndSet(0));
                jSONObject.put("click_times", this.LKE.getAndSet(0));
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
            } catch (org.json.JSONException unused) {
            }
            bg("stay_page", jSONObject, 0L);
        }
        if ("landingpage".equals(this.Fy) || "landingpage_endcard".equals(this.Fy) || "landingpage_split_screen".equals(this.Fy) || "landingpage_direct".equals(this.Fy) || "aggregate_page".equals(this.Fy)) {
            com.bytedance.sdk.openadsdk.ldr.IL.bg().bg("landingFinish", this.tuV, this.ApA);
        }
    }

    public void IL(android.webkit.WebView webView, java.lang.String str, boolean z) {
        com.bytedance.sdk.openadsdk.eqN.Kg kg = this.VzQ;
        if (kg == null || !z) {
            return;
        }
        kg.bg(webView, str);
    }

    private void bg(java.lang.String str, org.json.JSONObject jSONObject) {
        bg(str, jSONObject, -1L);
    }

    private void bg(final java.lang.String str, final org.json.JSONObject jSONObject, final long j) {
        if (!this.aGH || this.tuV == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.tuV.Kg kg = this.xxp;
        final int iZQc = kg != null ? kg.ZQc() : -1;
        com.bytedance.sdk.openadsdk.eqN.bX.bg(java.lang.System.currentTimeMillis(), this.tuV, this.Fy, str, new com.bytedance.sdk.openadsdk.yDt.bX.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.VB.1
            @Override // com.bytedance.sdk.openadsdk.yDt.bX.bg
            public org.json.JSONObject bg() {
                if (jSONObject == null) {
                    return null;
                }
                try {
                    boolean zIL = com.bytedance.sdk.openadsdk.core.model.rri.IL(com.bytedance.sdk.openadsdk.eqN.VB.this.tuV);
                    int i = 1;
                    jSONObject.put("is_playable", zIL ? 1 : 0);
                    org.json.JSONObject jSONObject2 = jSONObject;
                    if (!com.bytedance.sdk.openadsdk.core.Ta.bX.bg.bg().bg(com.bytedance.sdk.openadsdk.eqN.VB.this.tuV)) {
                        i = 0;
                    }
                    jSONObject2.put("usecache", i);
                    if (zIL && ("load_finish".equals(str) || "load_fail".equals(str))) {
                        jSONObject.put("playable_has_show", iZQc);
                    }
                } catch (org.json.JSONException unused) {
                }
                try {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    try {
                        jSONObject3.put("ad_extra_data", jSONObject.toString());
                        long j2 = j;
                        if (j2 > 0) {
                            jSONObject3.put("duration", j2);
                        }
                    } catch (org.json.JSONException unused2) {
                    }
                    return jSONObject3;
                } catch (org.json.JSONException unused3) {
                    return null;
                }
            }
        });
    }

    private class bg {
        @android.webkit.JavascriptInterface
        public java.lang.String getUrl() {
            return "";
        }

        private bg() {
        }

        @android.webkit.JavascriptInterface
        public void readPercent(java.lang.String str) {
            int i = 0;
            try {
                int iIntValue = java.lang.Float.valueOf(str).intValue();
                if (iIntValue > 100) {
                    i = 100;
                } else if (iIntValue >= 0) {
                    i = iIntValue;
                }
            } catch (java.lang.Throwable unused) {
            }
            com.bytedance.sdk.openadsdk.eqN.VB.this.DDQ.set(i);
        }
    }

    public void bg(android.view.MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.widget.bg.ldr ldrVar = this.Lq;
        if (ldrVar != null && this.vb) {
            ldrVar.bg(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.ayS != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.LKE.incrementAndGet();
                if (this.CQc.getAndSet(true)) {
                    return;
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("url", this.tuV.GvG());
                } catch (org.json.JSONException unused) {
                }
                bg("click_time", jSONObject, java.lang.Math.max(android.os.SystemClock.elapsedRealtime() - this.ayS, 0L));
            }
        }
    }

    public void bg(java.lang.String str, boolean z) {
        com.bytedance.sdk.openadsdk.core.widget.bg.ldr ldrVar = this.Lq;
        if (ldrVar != null && z) {
            ldrVar.bX(str);
        }
        com.bytedance.sdk.openadsdk.eqN.Kg kg = this.VzQ;
        if (kg == null || !z) {
            return;
        }
        kg.IL(str);
    }

    public void IL(int i) {
        com.bytedance.sdk.openadsdk.core.widget.bg.ldr ldrVar = this.Lq;
        if (ldrVar == null || !this.vb) {
            return;
        }
        ldrVar.bg(i);
    }

    private void bg(boolean z, final java.lang.String str) {
        if (z) {
            final int iEo = eo();
            com.bytedance.sdk.openadsdk.eqN.bX.bg(new com.bytedance.sdk.component.Kg.Kg("sendPrefLog") { // from class: com.bytedance.sdk.openadsdk.eqN.VB.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.bytedance.sdk.openadsdk.core.settings.iR iRVarJAA = com.bytedance.sdk.openadsdk.core.VzQ.eqN().JAA();
                        boolean zBg = com.bytedance.sdk.openadsdk.eqN.VB.this.bg(iRVarJAA, str);
                        if (zBg) {
                            if (!android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.iR.IL)) {
                                com.bytedance.sdk.openadsdk.eqN.VB.this.bg(iEo, str);
                                return;
                            }
                            if (android.text.TextUtils.isEmpty(iRVarJAA.bX) || !zBg) {
                                return;
                            }
                            java.lang.String str2 = iRVarJAA.bX;
                            com.bytedance.sdk.component.iR.IL.IL ilBX = com.bytedance.sdk.openadsdk.xxp.bX.bg().IL().bX();
                            ilBX.IL(str2);
                            java.util.HashMap map = new java.util.HashMap();
                            map.put("content-type", "application/json; charset=utf-8");
                            ilBX.eqN(map);
                            ilBX.bg(9);
                            ilBX.bg("sendPrefLog");
                            ilBX.bg(new com.bytedance.sdk.component.iR.bg.bg() { // from class: com.bytedance.sdk.openadsdk.eqN.VB.2.1
                                @Override // com.bytedance.sdk.component.iR.bg.bg
                                public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, java.io.IOException iOException) {
                                }

                                @Override // com.bytedance.sdk.component.iR.bg.bg
                                public void bg(com.bytedance.sdk.component.iR.IL.bX bXVar, com.bytedance.sdk.component.iR.IL il) {
                                    try {
                                        com.bytedance.sdk.openadsdk.core.settings.iR.IL = il.eqN();
                                        com.bytedance.sdk.openadsdk.eqN.VB.this.bg(iEo, str);
                                    } catch (java.lang.Exception e) {
                                        com.bytedance.sdk.component.utils.PX.bg("LandingPageLog", "TTWebViewClient : onPageFinished", e);
                                    }
                                }
                            });
                        }
                    } catch (java.lang.Throwable th) {
                        com.bytedance.sdk.component.utils.PX.IL(th.getMessage());
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(int i, java.lang.String str) {
        try {
            if (android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.iR.IL)) {
                return;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(com.bytedance.sdk.openadsdk.core.settings.iR.IL);
            jSONObject.putOpt(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_CONTENT_ID, bg().Ys());
            jSONObject.putOpt("ad_id", bg().Ys());
            jSONObject.put("log_extra", bg().Ny());
            com.bytedance.sdk.openadsdk.utils.ayS.bg(sb, "\"/** adInfo **/\"", jSONObject.toString());
            com.bytedance.sdk.openadsdk.utils.ayS.bg(sb, "\"/** first_page **/\"", java.lang.String.valueOf(i));
            com.bytedance.sdk.openadsdk.utils.ayS.bg(sb, "\"/** ix_to_externalurl **/\"", this.eqN != -1 ? "1" : "0");
            com.bytedance.sdk.openadsdk.utils.ayS.bg(sb, "\"/** preload_status **/\"", this.qC == 2 ? "2" : "0");
            com.bytedance.sdk.openadsdk.utils.ayS.bg(sb, "\"/** scene_state **/\"", str);
            com.bytedance.sdk.openadsdk.utils.ayS.bg(sb, "\"/** web_init_time **/\"", java.lang.String.valueOf(this.txA));
            com.bytedance.sdk.openadsdk.utils.ayS.bg(sb, "\"/** channel_name **/\"", "\"" + bg().qp() + "\"");
            com.bytedance.sdk.openadsdk.utils.ayS.bg(sb, "\"/** session_id **/\"", "\"" + java.util.UUID.randomUUID().toString() + "\"");
            com.bytedance.sdk.openadsdk.utils.ayS.bg(sb, "\"/** web_url **/\"", "\"" + bg().GvG() + "\"");
            java.lang.String string = sb.toString();
            if (android.text.TextUtils.isEmpty(string)) {
                return;
            }
            final java.lang.String strBX = bX(string);
            java.lang.ref.WeakReference<android.webkit.WebView> weakReference = this.Uq;
            final android.webkit.WebView webView = weakReference != null ? weakReference.get() : null;
            if (android.text.TextUtils.isEmpty(strBX) || webView == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.eqN.VB.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.utils.VB.bg(webView, strBX);
                }
            });
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.IL(th.getMessage());
        }
    }

    private int eo() {
        java.lang.ref.WeakReference<android.webkit.WebView> weakReference = this.Uq;
        android.webkit.WebView webView = weakReference != null ? weakReference.get() : null;
        if (webView != null) {
            try {
                android.webkit.WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
                if (webBackForwardListCopyBackForwardList != null && webBackForwardListCopyBackForwardList.getCurrentIndex() == 0) {
                    return 1;
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean bg(com.bytedance.sdk.openadsdk.core.settings.iR iRVar, java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "0":
                return iRVar.eqN;
            case "1":
                return iRVar.zx;
            case "2":
                return iRVar.ldr;
            default:
                return false;
        }
    }
}
