package com.bytedance.sdk.openadsdk.tuV;

/* JADX INFO: loaded from: classes4.dex */
public class Kg {
    private int ApA;
    private long CQc;
    private java.lang.String DCn;
    private int DDQ;
    private int Dt;
    private java.lang.String Dxa;
    private org.json.JSONObject FFy;
    private java.lang.String Fx;
    private java.lang.String Fy;
    private boolean GR;
    private boolean GZ;
    private boolean Gih;
    private int GvG;
    private org.json.JSONObject HXG;
    private volatile boolean IE;
    private java.lang.String IEI;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener IGR;
    public final java.lang.String IL;
    private java.lang.String JAA;
    private java.lang.String JMw;
    private long Ja;
    private boolean JaB;
    private int JlG;
    private int JxS;
    private int KRc;
    private final android.os.Handler Kg;
    private long LKE;
    private java.lang.String LZ;
    private int Ld;
    private com.bytedance.sdk.openadsdk.tuV.IL Lq;
    private com.bytedance.sdk.openadsdk.tuV.Kg.bg Ny;
    private boolean PC;
    private final android.os.Handler PX;
    private int Pae;
    private com.bytedance.sdk.openadsdk.tuV.bg RFq;
    private boolean RJ;
    private int RiO;
    private java.lang.Runnable Ta;
    private long Uq;
    private long Uw;
    private java.lang.Runnable VB;
    private java.lang.String VHL;
    private long VJ;
    private long VW;
    private volatile boolean Vm;
    private boolean VzQ;
    private java.lang.Runnable WR;
    private long Ys;
    private long ZQc;
    private java.lang.String ZTq;
    private java.lang.String ZyO;
    private long aGH;
    private boolean aMs;
    private long ayS;
    private int bCU;
    private java.lang.String bN;
    private android.content.Context bOf;
    public final java.lang.String bX;
    public final java.lang.String bg;
    private java.lang.String bu;
    private int cZH;
    private int dFf;
    private org.json.JSONObject dS;
    private long daV;
    private boolean dtS;
    private com.bytedance.sdk.openadsdk.tuV.ldr eDa;
    private float eK;
    private java.lang.Runnable eo;
    public final java.lang.String eqN;
    private int ews;
    private java.util.List<org.json.JSONObject> fE;
    private java.util.Map<java.lang.String, java.lang.String> gCm;
    private boolean gJ;
    private java.lang.String gXn;
    private java.lang.String gtr;
    private int hff;
    private float hi;
    private java.lang.String huT;
    private final java.lang.String iR;
    private com.bytedance.sdk.openadsdk.tuV.bX jA;
    private org.json.JSONObject jf;
    private int jz;
    private boolean kMt;
    private android.webkit.WebView kU;
    private int lM;
    private final java.lang.String ldr;
    private int mLT;
    private int mZk;
    private int ovC;
    private java.lang.String qC;
    private boolean qSG;
    private java.lang.ref.WeakReference<android.view.View> qp;
    private float rgo;
    private java.lang.String rr;
    private boolean rri;
    private int sVc;
    private boolean tC;
    private java.util.Set<java.lang.String> tuV;
    private int txA;
    private java.lang.String uV;
    private int uny;
    private java.lang.String uu;
    private boolean vb;
    private int wS;
    private boolean wq;
    private int xFs;
    private boolean xxp;
    private java.lang.Runnable yDt;
    private int yda;
    private long zCS;
    private int zU;
    public final java.lang.String zx;

    public enum bg {
        LAND_PAGE,
        FEED,
        OTHER,
        FEED_AWEME
    }

    public java.lang.String LKE() {
        return "function playable_callJS(){return \"Android call the JS method is callJS\";}";
    }

    static /* synthetic */ int PX(com.bytedance.sdk.openadsdk.tuV.Kg kg) {
        int i = kg.jz;
        kg.jz = i + 1;
        return i;
    }

    static /* synthetic */ int Ta(com.bytedance.sdk.openadsdk.tuV.Kg kg) {
        int i = kg.Pae;
        kg.Pae = i + 1;
        return i;
    }

    private Kg(android.content.Context context, android.webkit.WebView webView, com.bytedance.sdk.openadsdk.tuV.bX bXVar, com.bytedance.sdk.openadsdk.tuV.bg bgVar, com.bytedance.sdk.openadsdk.tuV.Kg.bg bgVar2) {
        this.ldr = "playable_stuck_check_ping";
        this.iR = "playable_apply_media_permission_callback";
        this.Kg = new android.os.Handler(android.os.Looper.getMainLooper());
        this.PX = new android.os.Handler(android.os.Looper.getMainLooper());
        this.vb = true;
        this.xxp = true;
        this.VzQ = true;
        this.bg = "PL_sdk_playable_global_viewable";
        this.IL = "PL_sdk_page_screen_blank";
        this.bX = "PL_sdk_playable_destroy_analyze_summary";
        this.eqN = "PL_sdk_playable_hardware_dialog_cancel";
        this.zx = "PL_sdk_playable_hardware_dialog_setting";
        this.tuV = new java.util.HashSet(java.util.Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.Fy = null;
        this.LZ = "embeded_ad";
        this.tC = true;
        this.rri = true;
        this.kMt = false;
        this.JAA = "";
        this.Ja = 10L;
        this.Uw = 10L;
        this.DDQ = 700;
        this.Uq = 0L;
        this.aGH = 0L;
        this.VW = -1L;
        this.VJ = -1L;
        this.daV = -1L;
        this.ayS = -1L;
        this.ZQc = -1L;
        this.LKE = -1L;
        this.CQc = -1L;
        this.uu = "";
        this.qC = "";
        this.Dxa = "";
        this.bN = "";
        this.jz = 0;
        this.Pae = 0;
        this.RJ = false;
        this.txA = 0;
        this.sVc = -1;
        this.ApA = 0;
        this.GvG = 0;
        this.lM = 0;
        this.gXn = null;
        this.GZ = false;
        this.bCU = 0;
        this.Ld = 0;
        this.wS = 0;
        this.cZH = 0;
        this.zCS = 0L;
        this.Ys = 0L;
        this.RiO = -2;
        this.Dt = 0;
        this.hff = 0;
        this.xFs = 0;
        this.jf = new org.json.JSONObject();
        this.gCm = new java.util.HashMap();
        this.FFy = new org.json.JSONObject();
        this.bu = "";
        this.hi = 0.0f;
        this.eK = 0.0f;
        this.GR = false;
        this.gJ = false;
        this.dtS = false;
        this.fE = new java.util.ArrayList();
        this.aMs = true;
        this.IE = true;
        this.Vm = true;
        this.IGR = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.tuV.Kg.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    android.view.View view = (android.view.View) com.bytedance.sdk.openadsdk.tuV.Kg.this.qp.get();
                    if (view == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.tuV.Kg.this.IL(view);
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.dFf = -1;
        this.RiO = 0;
        this.Ny = bgVar2;
        this.kU = webView;
        com.bytedance.sdk.openadsdk.tuV.WR.bg(webView);
        bg(webView);
        bg(context, bXVar, bgVar);
    }

    private Kg(android.content.Context context, int i, com.bytedance.sdk.openadsdk.tuV.bX bXVar, com.bytedance.sdk.openadsdk.tuV.bg bgVar) {
        this.ldr = "playable_stuck_check_ping";
        this.iR = "playable_apply_media_permission_callback";
        this.Kg = new android.os.Handler(android.os.Looper.getMainLooper());
        this.PX = new android.os.Handler(android.os.Looper.getMainLooper());
        this.vb = true;
        this.xxp = true;
        this.VzQ = true;
        this.bg = "PL_sdk_playable_global_viewable";
        this.IL = "PL_sdk_page_screen_blank";
        this.bX = "PL_sdk_playable_destroy_analyze_summary";
        this.eqN = "PL_sdk_playable_hardware_dialog_cancel";
        this.zx = "PL_sdk_playable_hardware_dialog_setting";
        this.tuV = new java.util.HashSet(java.util.Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.Fy = null;
        this.LZ = "embeded_ad";
        this.tC = true;
        this.rri = true;
        this.kMt = false;
        this.JAA = "";
        this.Ja = 10L;
        this.Uw = 10L;
        this.DDQ = 700;
        this.Uq = 0L;
        this.aGH = 0L;
        this.VW = -1L;
        this.VJ = -1L;
        this.daV = -1L;
        this.ayS = -1L;
        this.ZQc = -1L;
        this.LKE = -1L;
        this.CQc = -1L;
        this.uu = "";
        this.qC = "";
        this.Dxa = "";
        this.bN = "";
        this.jz = 0;
        this.Pae = 0;
        this.RJ = false;
        this.txA = 0;
        this.sVc = -1;
        this.ApA = 0;
        this.GvG = 0;
        this.lM = 0;
        this.gXn = null;
        this.GZ = false;
        this.bCU = 0;
        this.Ld = 0;
        this.wS = 0;
        this.cZH = 0;
        this.zCS = 0L;
        this.Ys = 0L;
        this.RiO = -2;
        this.Dt = 0;
        this.hff = 0;
        this.xFs = 0;
        this.jf = new org.json.JSONObject();
        this.gCm = new java.util.HashMap();
        this.FFy = new org.json.JSONObject();
        this.bu = "";
        this.hi = 0.0f;
        this.eK = 0.0f;
        this.GR = false;
        this.gJ = false;
        this.dtS = false;
        this.fE = new java.util.ArrayList();
        this.aMs = true;
        this.IE = true;
        this.Vm = true;
        this.IGR = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.tuV.Kg.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    android.view.View view = (android.view.View) com.bytedance.sdk.openadsdk.tuV.Kg.this.qp.get();
                    if (view == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.tuV.Kg.this.IL(view);
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.dFf = -1;
        this.RiO = i;
        this.Ny = com.bytedance.sdk.openadsdk.tuV.Kg.bg.LAND_PAGE;
        bg(context, bXVar, bgVar);
    }

    private void bg(android.content.Context context, com.bytedance.sdk.openadsdk.tuV.bX bXVar, com.bytedance.sdk.openadsdk.tuV.bg bgVar) {
        this.Fy = java.util.UUID.randomUUID().toString();
        this.bOf = context;
        this.RFq = bgVar;
        this.jA = bXVar;
        com.bytedance.sdk.openadsdk.tuV.eo.bg(bgVar);
        this.eDa = new com.bytedance.sdk.openadsdk.tuV.ldr(this);
        uu();
        if (this.kU == null) {
            this.dFf = 4;
            this.Kg.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.tuV.Kg.4
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.tuV.Kg.this.bg(5, "webview is null");
                }
            });
        }
    }

    private void uu() {
        this.Lq = new com.bytedance.sdk.openadsdk.tuV.IL(this, this.DDQ);
        this.WR = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.tuV.Kg.5
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.tuV.Kg.this.tC) {
                    com.bytedance.sdk.openadsdk.tuV.Kg.this.tC = false;
                    com.bytedance.sdk.openadsdk.tuV.Kg.this.Kg.removeCallbacks(com.bytedance.sdk.openadsdk.tuV.Kg.this.eo);
                    com.bytedance.sdk.openadsdk.tuV.Kg.this.bg(2, "ContainerLoadTimeOut");
                }
            }
        };
        this.eo = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.tuV.Kg.6
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.tuV.Kg.this.tC) {
                    com.bytedance.sdk.openadsdk.tuV.Kg.this.tC = false;
                    com.bytedance.sdk.openadsdk.tuV.Kg.this.IE = false;
                    com.bytedance.sdk.openadsdk.tuV.Kg.this.Kg.removeCallbacks(com.bytedance.sdk.openadsdk.tuV.Kg.this.WR);
                    com.bytedance.sdk.openadsdk.tuV.Kg.this.bg(3, "JSSDKLoadTimeOut");
                }
            }
        };
        this.Ta = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.tuV.Kg.7
            @Override // java.lang.Runnable
            public void run() {
                java.lang.System.currentTimeMillis();
                if (com.bytedance.sdk.openadsdk.tuV.Kg.this.kU != null) {
                    com.bytedance.sdk.openadsdk.tuV.Kg.this.kU.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new android.webkit.ValueCallback<java.lang.String>() { // from class: com.bytedance.sdk.openadsdk.tuV.Kg.7.1
                        @Override // android.webkit.ValueCallback
                        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(java.lang.String str) {
                            if (com.bytedance.sdk.openadsdk.tuV.Kg.this.Lq != null) {
                                com.bytedance.sdk.openadsdk.tuV.Kg.this.Lq.bg(java.lang.System.currentTimeMillis());
                            }
                        }
                    });
                }
                if (com.bytedance.sdk.openadsdk.tuV.Kg.this.PX != null) {
                    com.bytedance.sdk.openadsdk.tuV.Kg.this.PX.postDelayed(this, 500L);
                }
            }
        };
        this.yDt = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.tuV.Kg.8
            @Override // java.lang.Runnable
            public void run() {
                java.lang.System.currentTimeMillis();
                com.bytedance.sdk.openadsdk.tuV.Kg.this.bg("playable_stuck_check_ping", new org.json.JSONObject());
                if (com.bytedance.sdk.openadsdk.tuV.Kg.this.PX != null) {
                    com.bytedance.sdk.openadsdk.tuV.Kg.this.PX.postDelayed(this, 500L);
                }
            }
        };
        this.VB = new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.tuV.Kg.9
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.tuV.Kg.this.Ys <= 0) {
                    com.bytedance.sdk.openadsdk.tuV.Kg.this.IL(1, "Clicking on the hot zone causes the program to freeze.");
                } else {
                    if (com.bytedance.sdk.openadsdk.tuV.Kg.this.Ys - com.bytedance.sdk.openadsdk.tuV.Kg.this.zCS <= com.bytedance.sdk.openadsdk.tuV.Kg.this.DDQ) {
                        com.bytedance.sdk.openadsdk.tuV.Kg.this.VW();
                        com.bytedance.sdk.openadsdk.tuV.Kg.this.zCS = 0L;
                        com.bytedance.sdk.openadsdk.tuV.Kg.this.Ys = 0L;
                        return;
                    }
                    com.bytedance.sdk.openadsdk.tuV.Kg.this.IL(1, "Clicking on the hot zone causes the program to freeze.");
                }
            }
        };
    }

    private boolean PX(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("/union-fe/playable/") || str.contains("/union-fe-sg/playable/") || str.contains("/union-fe-i18n/playable/");
    }

    public void bg(android.view.View view) {
        if (view == null) {
            return;
        }
        try {
            this.qp = new java.lang.ref.WeakReference<>(view);
            IL(view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.IGR);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayablePlugin", "setViewForScreenSize error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(android.view.View view) {
        if (view == null) {
            return;
        }
        try {
            if (this.hff == view.getWidth() && this.xFs == view.getHeight()) {
                return;
            }
            this.hff = view.getWidth();
            this.xFs = view.getHeight();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("width", this.hff);
            jSONObject.put("height", this.xFs);
            bg("resize", jSONObject);
            this.jf = jSONObject;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayablePlugin", "resetViewDataJsonByView error", th);
        }
    }

    public android.content.Context bg() {
        return this.bOf;
    }

    public com.bytedance.sdk.openadsdk.tuV.Kg bg(java.lang.String str, java.lang.String str2) {
        this.gCm.put(str, str2);
        return this;
    }

    public java.util.Map<java.lang.String, java.lang.String> IL() {
        return this.gCm;
    }

    public com.bytedance.sdk.openadsdk.tuV.Kg bg(java.lang.String str) {
        this.huT = str;
        return this;
    }

    public com.bytedance.sdk.openadsdk.tuV.Kg IL(java.lang.String str) {
        this.ZyO = str;
        return this;
    }

    public org.json.JSONObject bX() {
        return this.HXG;
    }

    public com.bytedance.sdk.openadsdk.tuV.Kg bX(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("playable_style", str);
            this.HXG = jSONObject;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayablePlugin", "setPlayableStyle error", th);
        }
        return this;
    }

    public java.lang.String eqN() {
        return this.ZyO;
    }

    public java.lang.String zx() {
        return this.huT;
    }

    public com.bytedance.sdk.openadsdk.tuV.Kg eqN(java.lang.String str) {
        this.ZTq = str;
        return this;
    }

    public java.lang.String ldr() {
        return this.ZTq;
    }

    public com.bytedance.sdk.openadsdk.tuV.Kg zx(java.lang.String str) {
        this.uV = str;
        return this;
    }

    public java.lang.String iR() {
        return this.uV;
    }

    public com.bytedance.sdk.openadsdk.tuV.Kg bg(boolean z) {
        this.qSG = z;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("endcard_mute", this.qSG);
            bg("volumeChange", jSONObject);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayablePlugin", "setIsMute error", th);
        }
        return this;
    }

    public boolean Kg() {
        return this.qSG;
    }

    public com.bytedance.sdk.openadsdk.tuV.Kg IL(boolean z) {
        this.JaB = z;
        return this;
    }

    public com.bytedance.sdk.openadsdk.tuV.Kg bg(long j) {
        if (j <= 0) {
            this.Ja = 10L;
        } else {
            this.Ja = j;
        }
        return this;
    }

    public com.bytedance.sdk.openadsdk.tuV.Kg IL(long j) {
        if (j <= 0) {
            this.Uw = 10L;
        } else {
            this.Uw = j;
        }
        return this;
    }

    public void bg(int i) {
        this.dFf = i;
    }

    public com.bytedance.sdk.openadsdk.tuV.Kg bX(boolean z) {
        if (this.dFf == -1 || this.wq == z) {
            return this;
        }
        this.wq = z;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (!this.wq) {
                jSONObject.put("playable_background_show_type", this.Ld);
            }
        } catch (org.json.JSONException unused) {
        }
        bX(this.wq ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", jSONObject);
        if (this.VJ == -1 && this.wq) {
            this.VJ = java.lang.System.currentTimeMillis();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("render_type", this.dFf == 1 ? 1 : 2);
                int i = this.dFf;
                if (i != -1) {
                    jSONObject2.put("webview_state", i);
                }
            } catch (org.json.JSONException unused2) {
            }
            bX("PL_sdk_page_show", jSONObject2);
        }
        if (this.VJ != -1 && !this.wq && !this.GR) {
            this.GR = true;
        }
        if (this.wq) {
            this.VW = java.lang.System.currentTimeMillis();
        } else if (this.VW != -1) {
            this.Uq += java.lang.System.currentTimeMillis() - this.VW;
            this.VW = -1L;
        }
        try {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("viewStatus", this.wq);
            bg(com.ironsource.y8.g.U, jSONObject3);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayablePlugin", "setViewable error", th);
        }
        if (this.wq) {
            VW();
        } else {
            VJ();
        }
        return this;
    }

    public boolean WR() {
        return this.wq;
    }

    public com.bytedance.sdk.openadsdk.tuV.Kg eqN(boolean z) {
        this.Gih = z;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("send_click", this.Gih);
            bg("change_playable_click", jSONObject);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayablePlugin", "setPlayableClick error", th);
        }
        return this;
    }

    public org.json.JSONObject eo() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("send_click", this.Gih);
            return jSONObject;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayablePlugin", "getPlayableClickStatus error", th);
            return new org.json.JSONObject();
        }
    }

    public java.util.Set<java.lang.String> VB() {
        return this.eDa.bg();
    }

    public org.json.JSONObject PX() {
        try {
            boolean zBg = com.bytedance.sdk.openadsdk.tuV.zx.bg(this.bOf, "android.permission.RECORD_AUDIO");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("result", zBg);
            return jSONObject;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayablePlugin", "getCameraPermission error", th);
            return new org.json.JSONObject();
        }
    }

    public org.json.JSONObject Ta() {
        try {
            boolean zBg = com.bytedance.sdk.openadsdk.tuV.zx.bg(this.bOf, "android.permission.CAMERA");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("result", zBg);
            return jSONObject;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayablePlugin", "getCameraPermission error", th);
            return new org.json.JSONObject();
        }
    }

    public org.json.JSONObject yDt() {
        boolean zBg;
        boolean zBg2;
        try {
            boolean z = true;
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                zBg = com.bytedance.sdk.openadsdk.tuV.zx.bg(this.bOf, "android.permission.READ_MEDIA_IMAGES");
                zBg2 = true;
            } else {
                zBg = com.bytedance.sdk.openadsdk.tuV.zx.bg(this.bOf, "android.permission.READ_EXTERNAL_STORAGE");
                zBg2 = com.bytedance.sdk.openadsdk.tuV.zx.bg(this.bOf, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("isHasRead", zBg);
            jSONObject.put("isHasWrite", zBg2);
            if (!zBg || !zBg2) {
                z = false;
            }
            jSONObject.put("result", z);
            return jSONObject;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayablePlugin", "getCameraPermission error", th);
            return new org.json.JSONObject();
        }
    }

    public void bg(org.json.JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.tuV.bg bgVar = this.RFq;
        if (bgVar == null || bgVar.IL(jSONObject) || jSONObject == null) {
            return;
        }
        java.lang.String strOptString = jSONObject.optString("resource_base64");
        if (android.text.TextUtils.isEmpty(strOptString)) {
            return;
        }
        int iOptInt = jSONObject.optInt("resource_type", -1);
        java.lang.String strOptString2 = jSONObject.optString("resource_name", "playable_media");
        if (iOptInt == 1) {
            IL(strOptString2, strOptString);
        }
    }

    public void IL(org.json.JSONObject jSONObject) {
        if (this.RFq != null) {
            try {
                jSONObject.optBoolean("isPrevent", false);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public org.json.JSONObject Lq() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("scene_type", this.Ny.ordinal());
            jSONObject.put("safe_area_top_height", this.hi);
            jSONObject.put("safe_area_bottom_height", this.eK);
            jSONObject.put("playable_enter_from", this.GvG);
            jSONObject.put("playable_retry_count", this.ApA);
            jSONObject.put("playable_card_session", this.uu);
            jSONObject.put("playable_video_session", this.qC);
            jSONObject.put("playable_network_type", vb());
            jSONObject.put("aweme_id", this.bN);
            return jSONObject;
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayablePlugin", "playableInfo error", th);
            return new org.json.JSONObject();
        }
    }

    public void bg(java.lang.String str, org.json.JSONObject jSONObject) {
        if (com.bytedance.sdk.openadsdk.tuV.iR.bg() && jSONObject != null) {
            jSONObject.toString();
        }
        com.bytedance.sdk.openadsdk.tuV.bX bXVar = this.jA;
        if (bXVar != null) {
            bXVar.bg(str, jSONObject);
        }
    }

    public void IL(java.lang.String str, java.lang.String str2) {
        android.graphics.Bitmap bitmapBg;
        if (android.text.TextUtils.isEmpty(str2) || (bitmapBg = com.bytedance.sdk.openadsdk.tuV.zx.bg(str2)) == null) {
            return;
        }
        android.provider.MediaStore.Images.Media.insertImage(this.bOf.getContentResolver(), bitmapBg, str, "");
    }

    public java.lang.String vb() {
        com.bytedance.sdk.openadsdk.tuV.bg bgVar;
        if (android.text.TextUtils.isEmpty(this.Dxa) && (bgVar = this.RFq) != null) {
            this.Dxa = bgVar.bg().toString();
        }
        return this.Dxa;
    }

    public com.bytedance.sdk.openadsdk.tuV.bg xxp() {
        return this.RFq;
    }

    public org.json.JSONObject VzQ() {
        if (this.jf.isNull("width")) {
            android.view.View view = this.qp.get();
            if (view == null) {
                return this.jf;
            }
            IL(view);
        }
        return this.jf;
    }

    public org.json.JSONObject tuV() {
        return this.FFy;
    }

    public com.bytedance.sdk.openadsdk.tuV.Kg bX(org.json.JSONObject jSONObject) {
        this.FFy = jSONObject;
        return this;
    }

    public com.bytedance.sdk.openadsdk.tuV.Kg ldr(java.lang.String str) {
        this.LZ = str;
        return this;
    }

    public com.bytedance.sdk.openadsdk.tuV.Kg iR(java.lang.String str) {
        int iIndexOf;
        java.lang.String strDecode;
        this.bu = str;
        try {
            android.net.Uri uri = android.net.Uri.parse(str);
            java.lang.String scheme = uri.getScheme();
            if (androidx.webkit.ProxyConfig.MATCH_HTTP.equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                IL(0);
                if (str != null && (iIndexOf = str.indexOf("?")) != -1) {
                    str = str.substring(0, iIndexOf);
                }
            } else {
                java.lang.String host = uri.getHost();
                if (com.ironsource.y8.h.K.equalsIgnoreCase(host) || (host != null && host.contains(com.ironsource.y8.h.K))) {
                    IL(0);
                    java.lang.String queryParameter = uri.getQueryParameter("url");
                    if (!android.text.TextUtils.isEmpty(queryParameter) && (strDecode = android.net.Uri.decode(queryParameter)) != null) {
                        int iIndexOf2 = strDecode.indexOf("?");
                        str = iIndexOf2 != -1 ? strDecode.substring(0, iIndexOf2) : strDecode;
                    }
                } else if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                    if (this.RiO == -1) {
                        IL(2);
                    } else {
                        IL(1);
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        this.rr = str;
        return this;
    }

    public com.bytedance.sdk.openadsdk.tuV.Kg IL(int i) {
        this.RiO = i;
        return this;
    }

    public com.bytedance.sdk.openadsdk.tuV.Kg bg(float f) {
        this.rgo = f;
        return this;
    }

    public org.json.JSONObject Fy() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("devicePixelRatio", this.rgo);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("width", this.ovC);
            jSONObject2.put("height", this.ews);
            jSONObject.put("screen", jSONObject2);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("x", this.uny);
            jSONObject3.put("y", this.zU);
            jSONObject3.put("width", this.JxS);
            jSONObject3.put("height", this.KRc);
            jSONObject.put(com.ironsource.y8.h.K, jSONObject3);
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put("x", this.JlG);
            jSONObject4.put("y", this.yda);
            jSONObject4.put("width", this.mZk);
            jSONObject4.put("height", this.mLT);
            jSONObject.put("visible", jSONObject4);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayablePlugin", "getViewport error", th);
        }
        return jSONObject;
    }

    public void LZ() {
        com.bytedance.sdk.openadsdk.tuV.bg bgVar = this.RFq;
        if (bgVar != null) {
            bgVar.IL();
        }
    }

    public void tC() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (this.ZQc > 0) {
                jSONObject.put("playable_material_interactable_duration", java.lang.System.currentTimeMillis() - this.ZQc);
            } else {
                jSONObject.put("playable_material_interactable_duration", 0L);
            }
            if (this.daV > 0) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - this.daV;
                this.CQc = jCurrentTimeMillis;
                jSONObject.put("playable_material_interactable_load_duration", jCurrentTimeMillis);
            } else {
                jSONObject.put("playable_material_interactable_load_duration", 0L);
            }
            bX("PL_sdk_material_interactable", jSONObject);
        } catch (org.json.JSONException unused) {
        }
    }

    public void eqN(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            this.gXn = jSONObject.optString("section");
        }
    }

    public void rri() {
        this.sVc = 2;
    }

    public void kMt() {
        this.GZ = true;
    }

    public void JAA() {
        if (this.RFq != null) {
            com.bytedance.sdk.openadsdk.tuV.Kg.bg bgVar = com.bytedance.sdk.openadsdk.tuV.Kg.bg.FEED_AWEME;
        }
    }

    public void Ja() {
        if (this.RFq != null) {
            com.bytedance.sdk.openadsdk.tuV.Kg.bg bgVar = com.bytedance.sdk.openadsdk.tuV.Kg.bg.FEED_AWEME;
        }
    }

    public void zx(org.json.JSONObject jSONObject) {
        this.dS = jSONObject;
        this.lM++;
        VJ();
        this.Kg.removeCallbacks(this.VB);
        if (this.rri) {
            this.LKE = java.lang.System.currentTimeMillis();
            this.zCS = java.lang.System.currentTimeMillis();
            this.Ys = 0L;
            int i = this.RiO;
            if (i == 0) {
                android.webkit.WebView webView = this.kU;
                if (webView != null) {
                    webView.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new android.webkit.ValueCallback<java.lang.String>() { // from class: com.bytedance.sdk.openadsdk.tuV.Kg.10
                        @Override // android.webkit.ValueCallback
                        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(java.lang.String str) {
                            com.bytedance.sdk.openadsdk.tuV.Kg.this.Ys = java.lang.System.currentTimeMillis();
                        }
                    });
                }
            } else if (i == 1 || i == 2) {
                bg("playable_stuck_check_ping", new org.json.JSONObject());
            }
            this.Kg.postDelayed(this.VB, this.DDQ);
        }
    }

    public void Uw() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (this.ZQc > 0) {
                jSONObject.put("playable_material_first_frame_show_duration", java.lang.System.currentTimeMillis() - this.ZQc);
            } else {
                jSONObject.put("playable_material_first_frame_show_duration", 0L);
            }
            if (this.daV > 0) {
                jSONObject.put("playable_material_first_frame_load_duration", java.lang.System.currentTimeMillis() - this.daV);
            } else {
                jSONObject.put("playable_material_first_frame_load_duration", 0L);
            }
            bX("PL_sdk_material_first_frame_show", jSONObject);
        } catch (org.json.JSONException unused) {
        }
    }

    public void ldr(org.json.JSONObject jSONObject) {
        IL(2, jSONObject != null ? jSONObject.optString("error_msg", "The material directly invokes the exception pocket mask on the client") : "The material directly invokes the exception pocket mask on the client");
    }

    public void DDQ() {
        com.bytedance.sdk.openadsdk.tuV.IL il;
        this.Ys = java.lang.System.currentTimeMillis();
        int i = this.RiO;
        if ((i == 1 || i == 2) && (il = this.Lq) != null) {
            il.bg(java.lang.System.currentTimeMillis());
        }
    }

    public org.json.JSONObject iR(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return new org.json.JSONObject();
        }
        int iOptInt = jSONObject.optInt("type", 0);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        if (iOptInt == 1) {
            return PX();
        }
        if (iOptInt != 2) {
            return iOptInt != 3 ? jSONObject2 : yDt();
        }
        return Ta();
    }

    public org.json.JSONObject Kg(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return new org.json.JSONObject();
        }
        int iOptInt = jSONObject.optInt("type", 0);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            if (iOptInt == 1) {
                jSONObject2.put("result", com.bytedance.sdk.openadsdk.tuV.zx.IL(this.bOf, "android.permission.RECORD_AUDIO"));
            } else {
                if (iOptInt != 2) {
                    if (iOptInt == 3) {
                        jSONObject2.put("result", com.bytedance.sdk.openadsdk.tuV.zx.bg(this.bOf));
                    }
                    return jSONObject2;
                }
                jSONObject2.put("result", com.bytedance.sdk.openadsdk.tuV.zx.IL(this.bOf, "android.permission.CAMERA"));
            }
        } catch (org.json.JSONException unused) {
        }
        return jSONObject2;
    }

    public void Kg(java.lang.String str) {
        this.Dt = 1;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            this.daV = jCurrentTimeMillis;
            long j = this.VJ;
            jSONObject.put("playable_page_show_duration", j != -1 ? jCurrentTimeMillis - j : 0L);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayablePlugin", "reportUrlLoadStart error", th);
        }
        bX("PL_sdk_html_load_start", jSONObject);
        this.IE = true;
        this.Vm = true;
        if (this.aMs) {
            Uq();
            this.IE = false;
            this.Vm = false;
        }
        if (this.xxp) {
            try {
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
                java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer();
                if (com.bytedance.sdk.openadsdk.tuV.zx.bg(this.bOf, com.bytedance.sdk.openadsdk.tuV.zx.PX)) {
                    stringBuffer.append("Microphone_");
                    stringBuffer2.append("1");
                    if (com.bytedance.sdk.openadsdk.tuV.zx.IL(this.bOf, "android.permission.RECORD_AUDIO")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (com.bytedance.sdk.openadsdk.tuV.zx.bg(this.bOf, com.bytedance.sdk.openadsdk.tuV.zx.VB)) {
                    stringBuffer.append("Magetometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (com.bytedance.sdk.openadsdk.tuV.zx.bg(this.bOf, com.bytedance.sdk.openadsdk.tuV.zx.eo)) {
                    stringBuffer.append("Accelerometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (com.bytedance.sdk.openadsdk.tuV.zx.bg(this.bOf, com.bytedance.sdk.openadsdk.tuV.zx.WR)) {
                    stringBuffer.append("Gyro_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (com.bytedance.sdk.openadsdk.tuV.zx.bg(this.bOf, com.bytedance.sdk.openadsdk.tuV.zx.Kg)) {
                    stringBuffer.append("Camera_");
                    stringBuffer2.append("1");
                    if (com.bytedance.sdk.openadsdk.tuV.zx.IL(this.bOf, "android.permission.CAMERA")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (com.bytedance.sdk.openadsdk.tuV.zx.bg(this.bOf, com.bytedance.sdk.openadsdk.tuV.zx.iR)) {
                    stringBuffer.append("Photo");
                    stringBuffer2.append("1");
                    if (com.bytedance.sdk.openadsdk.tuV.zx.bg(this.bOf)) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("playable_available_hardware_name", stringBuffer.toString());
                jSONObject2.put("playable_available_hardware_code", stringBuffer2.toString());
                jSONObject2.put("playable_available_hardware_auth_code", stringBuffer3.toString());
                bX("PL_sdk_hardware_detect", jSONObject2);
                this.xxp = false;
            } catch (java.lang.Throwable th2) {
                com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayablePlugin", "Hardware detect error", th2);
            }
        }
    }

    public void Uq() {
        int i;
        int i2 = this.RiO;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            if (this.IE) {
                this.Kg.postDelayed(this.WR, this.Ja * 1000);
            }
            if ((this.Vm && PX(this.rr)) || (i = this.RiO) == 1 || i == 2) {
                this.Kg.postDelayed(this.eo, this.Uw * 1000);
            }
        }
    }

    public void WR(java.lang.String str) {
        android.webkit.WebView webView;
        boolean z = this.Dt == -1;
        this.Dt = 2;
        if (!z) {
            this.gtr = str;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                this.ayS = jCurrentTimeMillis;
                long j = this.daV;
                jSONObject.put("playable_html_load_start_duration", j != -1 ? jCurrentTimeMillis - j : 0L);
                jSONObject.put("playable_has_show", ZQc());
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayablePlugin", "reportUrlLoadFinish error", th);
            }
            bX("PL_sdk_html_load_finish", jSONObject);
        }
        this.IE = false;
        this.Kg.removeCallbacks(this.WR);
        try {
            if (this.RiO == 0) {
                if (this.vb && (webView = this.kU) != null) {
                    this.vb = false;
                    webView.evaluateJavascript(LKE(), new android.webkit.ValueCallback<java.lang.String>() { // from class: com.bytedance.sdk.openadsdk.tuV.Kg.11
                        @Override // android.webkit.ValueCallback
                        public /* bridge */ /* synthetic */ void onReceiveValue(java.lang.String str2) {
                        }
                    });
                }
                VW();
            }
        } catch (java.lang.Throwable th2) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayablePlugin", "crashMonitor error", th2);
        }
    }

    public void aGH() {
        this.Vm = false;
        this.Kg.removeCallbacks(this.eo);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (this.daV > 0) {
                jSONObject.put("playable_jssdk_load_success_duration", java.lang.System.currentTimeMillis() - this.daV);
            } else {
                jSONObject.put("playable_jssdk_load_success_duration", 0L);
            }
            bX("PL_sdk_jssdk_load_success", jSONObject);
        } catch (org.json.JSONException unused) {
        }
    }

    public void WR(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean zOptBoolean = jSONObject.optBoolean("success", true);
            if (zOptBoolean) {
                this.Dt = 3;
                VW();
            } else {
                this.Dt = -2;
            }
            if (zOptBoolean || !this.tC) {
                return;
            }
            this.tC = false;
            this.IE = false;
            this.Vm = false;
            this.Kg.removeCallbacks(this.WR);
            this.Kg.removeCallbacks(this.eo);
            bg(4, "CaseRenderFail");
        }
    }

    private void bX(int i, java.lang.String str) {
        com.bytedance.sdk.openadsdk.tuV.bg bgVar = this.RFq;
        if (bgVar != null) {
            bgVar.bg(i, str);
        }
    }

    protected void bg(int i, java.lang.String str) {
        VJ();
        bX(i, str);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("playable_code", i);
            jSONObject.put("playable_msg", str);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayablePlugin", "reportRenderFatal error", th);
        }
        bX("PL_sdk_global_faild", jSONObject);
    }

    public void IL(int i, java.lang.String str) {
        this.sVc = i;
        if (this.dS == null) {
            this.dS = new org.json.JSONObject();
        }
        try {
            this.dS.put("playable_stuck_type", i);
            this.dS.put("playable_stuck_reason", str);
            if (this.LKE > 0) {
                this.dS.put("playable_stuck_duration", java.lang.System.currentTimeMillis() - this.LKE);
            } else {
                this.dS.put("playable_stuck_duration", 0L);
            }
        } catch (java.lang.Throwable unused) {
        }
        bX("PL_sdk_page_stuck", this.dS);
        VJ();
        if (this.RFq == null || i != 2) {
            return;
        }
        this.dS = new org.json.JSONObject();
    }

    protected void IL(java.lang.String str, org.json.JSONObject jSONObject) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        zx(str, jSONObject);
    }

    private java.lang.String bX(java.lang.String str, java.lang.String str2) {
        java.lang.String queryParameter;
        java.lang.String queryParameter2;
        if (android.text.TextUtils.isEmpty(this.IEI) && !android.text.TextUtils.isEmpty(this.bu)) {
            android.net.Uri uri = android.net.Uri.parse(this.bu);
            java.lang.String host = uri.getHost();
            if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                queryParameter = uri.getQueryParameter("surl");
                queryParameter2 = uri.getQueryParameter("playable_hash");
            } else {
                queryParameter = "";
                queryParameter2 = "";
            }
            android.net.Uri.Builder builderAppendQueryParameter = new android.net.Uri.Builder().scheme(uri.getScheme()).authority(host).appendQueryParameter("surl", queryParameter);
            if (!android.text.TextUtils.isEmpty(queryParameter2)) {
                builderAppendQueryParameter.appendQueryParameter("playable_hash", queryParameter2);
            }
            this.IEI = builderAppendQueryParameter.toString();
        }
        return this.IEI;
    }

    private java.lang.String eqN(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = java.lang.String.format("rubeex://playable-minigamelite?id=%1s&schema=%2s", str, android.net.Uri.encode(str2));
        this.rr = str3;
        return str3;
    }

    private void qC() {
        java.lang.String str;
        if (this.FFy == null || (str = this.rr) == null || str.contains("/cid_")) {
            return;
        }
        java.lang.String strOptString = this.FFy.optString(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_CONTENT_ID);
        if (android.text.TextUtils.isEmpty(strOptString)) {
            return;
        }
        java.lang.String host = android.net.Uri.parse(this.rr).getHost();
        if (android.text.TextUtils.isEmpty(host)) {
            this.rr += "/cid_" + strOptString;
        } else {
            this.rr = this.rr.replace(host, host + "/cid_" + strOptString);
        }
    }

    private void zx(java.lang.String str, org.json.JSONObject jSONObject) {
        try {
            int i = this.RiO;
            if (i == 0) {
                if (this.Ny != com.bytedance.sdk.openadsdk.tuV.Kg.bg.LAND_PAGE && !PX(this.rr)) {
                    qC();
                }
                jSONObject.put("playable_url", this.rr);
            } else if (i == 3 || i == 4) {
                jSONObject.put("playable_url", eqN(this.JMw, this.VHL));
            } else if (i == 1 || i == 2) {
                jSONObject.put("playable_url", bX(this.DCn, this.Fx));
            }
            jSONObject.put("playable_render_type", this.RiO);
            if (this.RFq != null) {
                if (this.RiO == 0 && (this.Ny != com.bytedance.sdk.openadsdk.tuV.Kg.bg.LAND_PAGE || PX(this.rr))) {
                    this.RFq.bg(jSONObject);
                } else if (this.RiO != 0) {
                    this.RFq.bg(jSONObject);
                }
            }
        } catch (org.json.JSONException unused) {
        }
    }

    public void bX(java.lang.String str, org.json.JSONObject jSONObject) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        try {
            if (!this.RJ && this.Pae > 0) {
                this.RJ = true;
            }
            if ("PL_sdk_html_load_start".equals(str) || "PL_sdk_html_load_finish".equals(str) || "PL_sdk_html_load_error".equals(str)) {
                jSONObject.put("usecache", this.PC ? 1 : 0);
            }
            jSONObject.put("playable_event", str);
            jSONObject.put("playable_ts", java.lang.System.currentTimeMillis());
            jSONObject.put("playable_viewable", this.wq);
            jSONObject.put("playable_session_id", this.Fy);
            int i = this.RiO;
            if (i == 0) {
                if (this.Ny != com.bytedance.sdk.openadsdk.tuV.Kg.bg.LAND_PAGE && !PX(this.rr)) {
                    qC();
                }
                jSONObject.put("playable_url", this.rr);
            } else if (i == 3 || i == 4) {
                jSONObject.put("playable_url", eqN(this.JMw, this.VHL));
            } else if (i == 1 || i == 2) {
                jSONObject.put("playable_url", bX(this.DCn, this.Fx));
            }
            jSONObject.put("playable_full_url", this.bu);
            jSONObject.put("playable_replay_count", this.txA);
            jSONObject.put("playable_is_prerender", this.JaB);
            jSONObject.put("playable_is_preload", this.RJ);
            jSONObject.put("playable_render_type", this.RiO);
            jSONObject.put("playable_scenes_type", this.Ny.ordinal());
            java.lang.String str2 = "";
            jSONObject.put("playable_gecko_key", android.text.TextUtils.isEmpty(this.DCn) ? "" : this.DCn);
            if (!android.text.TextUtils.isEmpty(this.Fx)) {
                str2 = this.Fx;
            }
            jSONObject.put("playable_gecko_channel", str2);
            jSONObject.put("playable_sdk_version", "6.6.0");
            jSONObject.put("playable_minigamelite_id", this.JMw);
            jSONObject.put("playable_minigamelite_schema", this.VHL);
            jSONObject.put("playable_is_debug", this.gJ);
            jSONObject.put("playable_retry_count", this.ApA);
            jSONObject.put("playable_enter_from", this.GvG);
            jSONObject.put("playable_sequence", this.lM);
            jSONObject.put("playable_current_section", this.gXn);
            jSONObject.put("is_playable_finish", this.GZ);
            jSONObject.put("playable_card_session", this.uu);
            jSONObject.put("playable_video_session", this.qC);
            jSONObject.put("playable_network_type", vb());
            jSONObject.put("playable_lynx_version", this.JAA);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("ad_extra_data", jSONObject);
            jSONObject2.put("tag", this.LZ);
            jSONObject2.put("nt", 4);
            jSONObject2.put("category", "umeng");
            jSONObject2.put("is_ad_event", "1");
            jSONObject2.put("refer", "playable");
            jSONObject2.put("value", this.FFy.opt(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_CONTENT_ID));
            jSONObject2.put("log_extra", this.FFy.opt("log_extra"));
            int i2 = this.RiO;
            if (i2 != -1 && i2 != -2) {
                if (this.RFq != null) {
                    java.util.List<org.json.JSONObject> list = this.fE;
                    if (list != null && !list.isEmpty()) {
                        java.util.Iterator<org.json.JSONObject> it = this.fE.iterator();
                        while (it.hasNext()) {
                            org.json.JSONObject jSONObjectOptJSONObject = it.next().optJSONObject("ad_extra_data");
                            if (jSONObjectOptJSONObject != null) {
                                jSONObjectOptJSONObject.put("playable_render_type", this.RiO);
                                jSONObjectOptJSONObject.put("playable_url", this.rr);
                            }
                            this.RFq.bg(jSONObjectOptJSONObject);
                        }
                        this.fE.clear();
                    }
                    if (this.RiO == 0 && (this.Ny != com.bytedance.sdk.openadsdk.tuV.Kg.bg.LAND_PAGE || PX(this.rr))) {
                        this.RFq.bg(jSONObject);
                        return;
                    } else {
                        if (this.RiO != 0) {
                            this.RFq.bg(jSONObject);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.fE == null) {
                this.fE = new java.util.ArrayList();
            }
            this.fE.add(jSONObject2);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayablePlugin", "reportEvent error", th);
        }
    }

    public void eo(java.lang.String str) {
        this.Kg.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.tuV.Kg.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.tuV.Kg.PX(com.bytedance.sdk.openadsdk.tuV.Kg.this);
            }
        });
    }

    public void VB(java.lang.String str) {
        this.Kg.post(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.tuV.Kg.3
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.tuV.Kg.Ta(com.bytedance.sdk.openadsdk.tuV.Kg.this);
            }
        });
    }

    public void VW() {
        if (this.rri) {
            this.LKE = java.lang.System.currentTimeMillis();
            if (this.Ny == com.bytedance.sdk.openadsdk.tuV.Kg.bg.FEED_AWEME) {
                if (this.wq && this.Dt == 3) {
                    com.bytedance.sdk.openadsdk.tuV.IL il = this.Lq;
                    if (il != null && il.IL()) {
                        Dxa();
                        return;
                    } else {
                        if (this.Lq == null) {
                            this.Lq = new com.bytedance.sdk.openadsdk.tuV.IL(this, this.DDQ);
                            Dxa();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.wq && this.Dt == 2) {
                com.bytedance.sdk.openadsdk.tuV.IL il2 = this.Lq;
                if (il2 != null && il2.IL()) {
                    Dxa();
                } else if (this.Lq == null) {
                    this.Lq = new com.bytedance.sdk.openadsdk.tuV.IL(this, this.DDQ);
                    Dxa();
                }
            }
        }
    }

    private void Dxa() {
        java.lang.Runnable runnable;
        java.lang.Runnable runnable2;
        this.Lq.bg(java.lang.System.currentTimeMillis());
        android.os.Handler handler = this.PX;
        if (handler != null) {
            int i = this.RiO;
            if (i == 0 && (runnable2 = this.Ta) != null) {
                handler.post(runnable2);
            } else if ((i == 1 || i == 2) && (runnable = this.yDt) != null) {
                handler.post(runnable);
            }
            this.Lq.bg(500);
        }
    }

    public void VJ() {
        try {
            com.bytedance.sdk.openadsdk.tuV.IL il = this.Lq;
            if (il != null) {
                il.bg();
            }
            android.os.Handler handler = this.PX;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (java.lang.Throwable th) {
            new java.lang.StringBuilder("The stuttering detection has been paused due to a crash.-- ").append(th);
        }
    }

    public void daV() {
        this.hff = 0;
        this.xFs = 0;
        this.rgo = 0.0f;
        this.ovC = 0;
        this.ews = 0;
        this.zU = 0;
        this.uny = 0;
        this.JxS = 0;
        this.KRc = 0;
        this.yda = 0;
        this.JlG = 0;
        this.mZk = 0;
        this.mLT = 0;
    }

    public void ayS() {
        if (this.dtS) {
            return;
        }
        this.dtS = true;
        this.aGH = 0L;
        this.xxp = true;
        daV();
        try {
            android.view.View view = this.qp.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.IGR);
            }
        } catch (java.lang.Throwable unused) {
        }
        try {
            com.bytedance.sdk.openadsdk.tuV.IL il = this.Lq;
            if (il != null) {
                il.bg();
                this.Lq = null;
            }
            android.os.Handler handler = this.PX;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (java.lang.Throwable th) {
            new java.lang.StringBuilder("crash -- ").append(th);
        }
        try {
            if (!android.text.TextUtils.isEmpty(this.rr)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("playable_all_times", this.jz);
                jSONObject.put("playable_hit_times", this.Pae);
                int i = this.jz;
                if (i > 0) {
                    jSONObject.put("playable_hit_ratio", ((double) this.Pae) / (((double) i) * 1.0d));
                } else {
                    jSONObject.put("playable_hit_ratio", 0);
                }
                bX("PL_sdk_preload_times", jSONObject);
            }
        } catch (java.lang.Throwable unused2) {
        }
        try {
            if (!android.text.TextUtils.isEmpty(this.rr)) {
                if (this.VW != -1) {
                    this.Uq += java.lang.System.currentTimeMillis() - this.VW;
                    this.VW = -1L;
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("playable_user_play_duration", this.Uq);
                bX("PL_sdk_user_play_duration", jSONObject2);
            }
        } catch (java.lang.Throwable unused3) {
        }
        this.IE = false;
        this.Vm = false;
        this.Kg.removeCallbacks(this.WR);
        this.Kg.removeCallbacks(this.eo);
        this.Kg.removeCallbacksAndMessages(null);
    }

    public void bg(int i, java.lang.String str, java.lang.String str2) {
        this.Dt = -1;
        this.gtr = str2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("playable_code", i);
            jSONObject.put("playable_msg", str);
            jSONObject.put("playable_fail_url", str2);
            jSONObject.put("playable_has_show", ZQc());
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayablePlugin", "onWebReceivedError error", th);
        }
        bX("PL_sdk_html_load_error", jSONObject);
        if (this.tC) {
            this.tC = false;
            this.IE = false;
            this.Vm = false;
            this.Kg.removeCallbacks(this.WR);
            this.Kg.removeCallbacks(this.eo);
            bg(1, "ContainerLoadFail");
        }
    }

    public int ZQc() {
        return (this.VJ == -1 || !this.wq) ? 1 : 2;
    }

    public void bg(boolean z, java.lang.String str, int i) {
        if (z) {
            this.Dt = -1;
            this.gtr = str;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("playable_code", i);
                jSONObject.put("playable_msg", "url load error");
                jSONObject.put("playable_fail_url", str);
                jSONObject.put("playable_has_show", ZQc());
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.openadsdk.tuV.iR.bg("PlayablePlugin", "onWebReceivedHttpError error", th);
            }
            bX("PL_sdk_html_load_error", jSONObject);
            if (this.tC) {
                this.tC = false;
                this.IE = false;
                this.Vm = false;
                this.Kg.removeCallbacks(this.WR);
                this.Kg.removeCallbacks(this.eo);
                bg(1, "ContainerLoadFail");
            }
        }
    }

    public int CQc() {
        return this.dFf;
    }

    public org.json.JSONObject eqN(java.lang.String str, org.json.JSONObject jSONObject) {
        java.lang.System.currentTimeMillis();
        if (com.bytedance.sdk.openadsdk.tuV.iR.bg() && jSONObject != null) {
            jSONObject.toString();
        }
        org.json.JSONObject jSONObjectBg = this.eDa.bg(str, jSONObject);
        if (com.bytedance.sdk.openadsdk.tuV.iR.bg()) {
            java.lang.System.currentTimeMillis();
            if (jSONObjectBg != null) {
                jSONObjectBg.toString();
            }
        }
        return jSONObjectBg;
    }

    public com.bytedance.sdk.openadsdk.tuV.Kg zx(boolean z) {
        this.aMs = z;
        return this;
    }

    public void ldr(boolean z) {
        this.PC = z;
    }

    public static com.bytedance.sdk.openadsdk.tuV.Kg bg(android.content.Context context, android.webkit.WebView webView, com.bytedance.sdk.openadsdk.tuV.bX bXVar, com.bytedance.sdk.openadsdk.tuV.bg bgVar) {
        if (bXVar == null || bgVar == null) {
            return null;
        }
        if (webView == null) {
            return new com.bytedance.sdk.openadsdk.tuV.Kg(context, 0, bXVar, bgVar);
        }
        return new com.bytedance.sdk.openadsdk.tuV.Kg(context, webView, bXVar, bgVar, com.bytedance.sdk.openadsdk.tuV.Kg.bg.LAND_PAGE);
    }
}
