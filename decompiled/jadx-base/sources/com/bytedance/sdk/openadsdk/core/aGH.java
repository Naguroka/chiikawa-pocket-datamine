package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes4.dex */
public class aGH implements com.bytedance.sdk.component.adexpress.zx.IL, com.bytedance.sdk.component.utils.JAA.bg, com.bytedance.sdk.openadsdk.eo.IL {
    private static final java.util.Map<java.lang.String, java.lang.Boolean> Kg;
    private java.lang.String CQc;
    private com.bytedance.sdk.openadsdk.PX.IL DDQ;
    private com.bytedance.sdk.openadsdk.PX.ldr Dxa;
    private com.bytedance.sdk.openadsdk.core.Kg.yDt Fy;
    boolean IL;
    private com.bytedance.sdk.openadsdk.PX.eqN JAA;
    private org.json.JSONObject Ja;
    private com.bytedance.sdk.component.bg.VzQ LKE;
    private org.json.JSONObject LZ;
    private int Lq;
    private java.lang.String PX;
    private android.content.Context Pae;
    private com.bytedance.sdk.openadsdk.core.Ta.eqN.IL RJ;
    private int Ta;
    private com.bytedance.sdk.openadsdk.PX.WR Uq;
    private com.bytedance.sdk.openadsdk.core.IL.eqN Uw;
    private java.lang.ref.WeakReference<android.view.View> VB;
    private java.util.HashMap<java.lang.String, com.bytedance.sdk.openadsdk.core.eo> VJ;
    private java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> VW;
    private org.json.JSONObject VzQ;
    private com.bytedance.sdk.openadsdk.eo.bX WR;
    private com.bytedance.sdk.openadsdk.eqN.eqN.zx ZQc;
    private boolean bN;
    protected java.util.Map<java.lang.String, java.lang.Object> bg;
    private java.lang.String eo;
    private java.lang.ref.WeakReference<com.bytedance.sdk.component.WR.eqN> eqN;
    private com.bytedance.sdk.openadsdk.core.widget.ldr iR;
    private boolean jz;
    private com.bytedance.sdk.openadsdk.PX.zx kMt;
    private java.lang.String ldr;
    private com.bytedance.sdk.openadsdk.core.widget.bg.bg qC;
    private com.bytedance.sdk.openadsdk.PX.bg rri;
    private com.bytedance.sdk.openadsdk.core.aGH.bX sVc;
    private com.bytedance.sdk.openadsdk.eo.eqN tC;
    private com.bytedance.sdk.component.adexpress.IL.VB tuV;
    private com.bytedance.sdk.openadsdk.core.aGH.bg txA;
    private com.bytedance.sdk.openadsdk.core.model.tuV xxp;
    private java.lang.String yDt;
    private boolean vb = true;
    private boolean aGH = true;
    private boolean daV = false;
    private boolean ayS = false;
    boolean bX = false;
    private boolean uu = false;
    private final com.bytedance.sdk.component.utils.JAA zx = new com.bytedance.sdk.component.utils.JAA(android.os.Looper.getMainLooper(), this);

    public static class IL {
        public java.lang.String IL;
        public java.lang.String bX;
        public java.lang.String bg;
        public org.json.JSONObject eqN;
        public int zx;
    }

    public interface bg {
        void bg();
    }

    static {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        Kg = concurrentHashMap;
        concurrentHashMap.put("log_event", java.lang.Boolean.TRUE);
        concurrentHashMap.put("private", java.lang.Boolean.TRUE);
        concurrentHashMap.put("dispatch_message", java.lang.Boolean.TRUE);
        concurrentHashMap.put("custom_event", java.lang.Boolean.TRUE);
        concurrentHashMap.put("log_event_v3", java.lang.Boolean.TRUE);
    }

    public com.bytedance.sdk.openadsdk.core.aGH bg(com.bytedance.sdk.openadsdk.core.widget.bg.bg bgVar) {
        this.qC = bgVar;
        return this;
    }

    public aGH(android.content.Context context) {
        this.Pae = context;
    }

    public com.bytedance.sdk.openadsdk.core.aGH IL(java.lang.String str) {
        this.ldr = str;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.aGH bg(com.bytedance.sdk.openadsdk.core.widget.ldr ldrVar) {
        this.iR = ldrVar;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.aGH bg(com.bytedance.sdk.component.WR.eqN eqn) {
        android.webkit.WebView webView = eqn.getWebView();
        if (webView == null) {
            return this;
        }
        try {
            com.bytedance.sdk.component.bg.VzQ vzQIL = com.bytedance.sdk.component.bg.VzQ.bg(webView).bg(new com.bytedance.sdk.openadsdk.VB.bg()).bg("ToutiaoJSBridge").bg(new com.bytedance.sdk.component.bg.PX() { // from class: com.bytedance.sdk.openadsdk.core.aGH.1
                @Override // com.bytedance.sdk.component.bg.PX
                public <T> T bg(java.lang.String str, java.lang.reflect.Type type) {
                    return null;
                }

                @Override // com.bytedance.sdk.component.bg.PX
                public <T> java.lang.String bg(T t) {
                    return null;
                }
            }).bg(com.bytedance.sdk.openadsdk.core.WR.IL().xxp()).IL(true).bg().IL();
            this.LKE = vzQIL;
            com.bytedance.sdk.openadsdk.VB.bg.ldr.bg(vzQIL, this);
            com.bytedance.sdk.openadsdk.VB.bg.bg.bg(this.LKE, this);
            com.bytedance.sdk.openadsdk.VB.bg.IL.bg(this.LKE, this);
            com.bytedance.sdk.openadsdk.VB.bg.bX.bg(this.LKE, this);
            com.bytedance.sdk.openadsdk.VB.bg.zx.bg(this.LKE, this);
            com.bytedance.sdk.openadsdk.VB.bg.Kg.bg(this.LKE, this);
            com.bytedance.sdk.openadsdk.VB.bg.eo.bg(this.LKE, this);
            com.bytedance.sdk.openadsdk.VB.bg.WR.bg(this.LKE, eqn);
            com.bytedance.sdk.openadsdk.VB.bg.iR.bg(this.LKE, this);
            com.bytedance.sdk.openadsdk.VB.bg.eqN.bg(this.LKE, this.LZ);
        } catch (java.lang.Exception unused) {
        }
        return this;
    }

    public com.bytedance.sdk.component.bg.VzQ bg() {
        return this.LKE;
    }

    private android.webkit.WebView Ta() {
        com.bytedance.sdk.component.WR.eqN eqn;
        java.lang.ref.WeakReference<com.bytedance.sdk.component.WR.eqN> weakReference = this.eqN;
        if (weakReference == null || (eqn = weakReference.get()) == null) {
            return null;
        }
        return eqn.getWebView();
    }

    public com.bytedance.sdk.openadsdk.core.aGH IL(com.bytedance.sdk.component.WR.eqN eqn) {
        this.eqN = new java.lang.ref.WeakReference<>(eqn);
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.aGH bg(com.bytedance.sdk.openadsdk.eqN.eqN.zx zxVar) {
        this.ZQc = zxVar;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.aGH bg(boolean z) {
        this.IL = z;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.aGH IL(boolean z) {
        this.ayS = z;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.aGH bX(java.lang.String str) {
        this.eo = str;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.aGH bg(android.view.View view) {
        this.VB = new java.lang.ref.WeakReference<>(view);
        return this;
    }

    @com.bytedance.JProtect
    private org.json.JSONObject yDt() {
        try {
            android.view.View view = this.VB.get();
            com.bytedance.sdk.component.WR.eqN eqn = this.eqN.get();
            if (view == null || eqn == null) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.AndroidObject", "setCloseButtonInfo error closeButton is null");
                return null;
            }
            int[] iArrIL = com.bytedance.sdk.openadsdk.utils.ZQc.IL(view);
            int[] iArrIL2 = com.bytedance.sdk.openadsdk.utils.ZQc.IL((android.view.View) eqn);
            if (iArrIL != null && iArrIL2 != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("x", com.bytedance.sdk.openadsdk.utils.ZQc.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg(), iArrIL[0] - iArrIL2[0]));
                jSONObject.put("y", com.bytedance.sdk.openadsdk.utils.ZQc.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg(), iArrIL[1] - iArrIL2[1]));
                jSONObject.put("w", com.bytedance.sdk.openadsdk.utils.ZQc.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg(), view.getWidth()));
                jSONObject.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, com.bytedance.sdk.openadsdk.utils.ZQc.eqN(com.bytedance.sdk.openadsdk.core.VzQ.bg(), view.getHeight()));
                jSONObject.put("isExist", true);
                return jSONObject;
            }
            com.bytedance.sdk.component.utils.PX.bg("TTAD.AndroidObject", "setCloseButtonInfo error position or webViewPosition is null");
            return null;
        } catch (java.lang.Throwable unused) {
        }
    }

    public com.bytedance.sdk.openadsdk.core.aGH bg(int i) {
        this.Lq = i;
        return this;
    }

    public void IL() {
        com.bytedance.sdk.component.bg.VzQ vzQ = this.LKE;
        if (vzQ == null) {
            return;
        }
        vzQ.bg();
        this.LKE = null;
    }

    public com.bytedance.sdk.openadsdk.core.aGH bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        this.xxp = tuv;
        if (tuv != null) {
            this.VzQ = tuv.hff();
        }
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.aGH bg(com.bytedance.sdk.openadsdk.PX.IL il) {
        this.DDQ = il;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.aGH bg(com.bytedance.sdk.openadsdk.PX.WR wr) {
        this.Uq = wr;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.model.tuV bX() {
        return this.xxp;
    }

    public boolean eqN() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.xxp;
        return tuv != null && tuv.rri();
    }

    public com.bytedance.sdk.openadsdk.core.aGH eqN(java.lang.String str) {
        this.PX = str;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.aGH IL(int i) {
        this.Ta = i;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.aGH zx(java.lang.String str) {
        this.yDt = str;
        return this;
    }

    private static java.util.List<java.lang.String> Lq() {
        return java.util.Arrays.asList("appInfo", "adInfo", "getTemplateInfo", "getTeMaiAds");
    }

    public com.bytedance.sdk.openadsdk.core.aGH bg(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.bg = map;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.aGH bg(com.bytedance.sdk.component.adexpress.IL.VB vb) {
        this.tuV = vb;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.aGH bg(com.bytedance.sdk.openadsdk.core.Kg.yDt ydt) {
        this.Fy = ydt;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.aGH bg(com.bytedance.sdk.openadsdk.core.IL.eqN eqn) {
        this.Uw = eqn;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.aGH bg(org.json.JSONObject jSONObject) {
        this.LZ = jSONObject;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.aGH bg(com.bytedance.sdk.openadsdk.PX.bg bgVar) {
        this.rri = bgVar;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.aGH bg(com.bytedance.sdk.openadsdk.PX.zx zxVar) {
        this.kMt = zxVar;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.aGH bg(com.bytedance.sdk.openadsdk.PX.eqN eqn) {
        this.JAA = eqn;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.aGH bg(java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> list) {
        this.VW = list;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.aGH bg(com.bytedance.sdk.openadsdk.PX.ldr ldrVar) {
        this.Dxa = ldrVar;
        return this;
    }

    public boolean zx() {
        return this.bX;
    }

    @com.bytedance.JProtect
    public static void IL(org.json.JSONObject jSONObject) throws java.lang.Exception {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<java.lang.String> it = Lq().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        jSONObject.put("appName", com.bytedance.sdk.openadsdk.common.IL.bg());
        jSONObject.put("innerAppName", com.bytedance.sdk.openadsdk.common.IL.zx());
        jSONObject.put(com.json.tk.SESSION_HISTORY_KEY_AD_ID, com.bytedance.sdk.openadsdk.common.IL.IL());
        jSONObject.put("sdkEdition", com.bytedance.sdk.openadsdk.common.IL.bX());
        jSONObject.put(com.ironsource.y8.i.W, com.bytedance.sdk.openadsdk.common.IL.eqN());
        jSONObject.put("netType", com.bytedance.sdk.openadsdk.common.IL.ldr());
        jSONObject.put("supportList", jSONArray);
        jSONObject.put("deviceId", com.bytedance.sdk.openadsdk.common.IL.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg()));
        if (com.bytedance.sdk.openadsdk.utils.DeviceUtils.IL(com.bytedance.sdk.openadsdk.core.VzQ.bg())) {
            jSONObject.put("device_platform", "Android_Pad");
        } else {
            jSONObject.put("device_platform", com.json.y8.d);
        }
        jSONObject.put("device_type", android.os.Build.VERSION.RELEASE);
    }

    private void Kg(org.json.JSONObject jSONObject) throws java.lang.Exception {
        if (this.bN) {
            com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.xxp;
            if ((tuv instanceof com.bytedance.sdk.openadsdk.core.model.Fy) && ((com.bytedance.sdk.openadsdk.core.model.Fy) tuv).Uzu()) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                jSONObject.put("adInfos", jSONArray);
                for (com.bytedance.sdk.openadsdk.core.model.tuV tuv2 : ((com.bytedance.sdk.openadsdk.core.model.Fy) this.xxp).mm()) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    bg(jSONObject2, tuv2);
                    jSONArray.put(jSONObject2);
                }
                return;
            }
        }
        bg(jSONObject, this.xxp);
    }

    public static void bg(org.json.JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.tuV tuv) throws java.lang.Exception {
        java.lang.String strYs = tuv.Ys();
        if (!android.text.TextUtils.isEmpty(strYs)) {
            jSONObject.put(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_CONTENT_ID, strYs);
        }
        java.lang.String strNy = tuv.Ny();
        if (!android.text.TextUtils.isEmpty(strNy)) {
            jSONObject.put("log_extra", strNy);
        }
        java.lang.String strPC = tuv.PC();
        if (!android.text.TextUtils.isEmpty(strPC)) {
            jSONObject.put("download_url", strPC);
        }
        jSONObject.put("dc", android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.VzQ.eqN().CQc()) ? com.bytedance.sdk.openadsdk.core.VzQ.eqN().CQc() : "SG");
        jSONObject.put("language", com.bytedance.sdk.openadsdk.core.PX.bg());
        jSONObject.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.xxp.zU().Ys());
    }

    private void WR(org.json.JSONObject jSONObject) throws java.lang.Exception {
        if (android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.rri.VB(this.xxp))) {
            return;
        }
        jSONObject.put("playable_style", com.bytedance.sdk.openadsdk.core.model.rri.VB(this.xxp));
    }

    /* JADX WARN: Code duplicated, block: B:225:0x039d A[PHI: r4
  0x039d: PHI (r4v19 org.json.JSONObject) = (r4v14 org.json.JSONObject), (r4v20 org.json.JSONObject) binds: [B:224:0x039b, B:206:0x0350] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: switch over string: strings are not added: [[cancel_download_app_ad]] */
    @com.bytedance.JProtect
    public org.json.JSONObject bg(com.bytedance.sdk.openadsdk.core.aGH.IL il, int i) throws java.lang.Exception {
        org.json.JSONObject jSONObjectYDt;
        android.content.Context context;
        org.json.JSONObject jSONObject;
        if (!androidx.core.app.NotificationCompat.CATEGORY_CALL.equals(il.bg)) {
            return null;
        }
        if (com.bytedance.sdk.openadsdk.core.WR.IL().xxp()) {
            android.util.Log.d("TTAD.AndroidObject", "[JSB-REQ] version:" + i + " method:" + il.bX);
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.lang.String str = il.bX;
        str.hashCode();
        switch (str) {
            case "subscribe_app_ad":
                rri();
                com.bytedance.sdk.openadsdk.eqN.bX.IL(this.xxp, this.CQc, 0, (org.json.JSONObject) null);
                android.content.Context context2 = this.Pae;
                if (context2 != null) {
                    this.WR.bg(context2, il.eqN, this.PX, this.Ta, this.vb);
                    break;
                } else {
                    com.bytedance.sdk.openadsdk.eqN.bX.IL(this.xxp, this.CQc, -1, (org.json.JSONObject) null);
                    break;
                }
                break;
            case "adInfo":
                Kg(jSONObject2);
                break;
            case "pauseWebView":
                xxp();
                break;
            case "changeVideoState":
                PX(il.eqN);
                break;
            case "openAdLandPageLinks":
                org.json.JSONObject jSONObject3 = il.eqN;
                if (bg(jSONObject3, jSONObject2)) {
                    bX(jSONObject3);
                    break;
                }
                break;
            case "webview_time_track":
                eo(il.eqN);
                break;
            case "clickEvent":
                eqN(il.eqN);
                break;
            case "appInfo":
                IL(jSONObject2);
                break;
            case "getScreenSize":
                com.bytedance.sdk.openadsdk.PX.bg bgVar = this.rri;
                if (bgVar != null) {
                    int iIL = bgVar.IL();
                    int iBg = this.rri.bg();
                    jSONObject2.put("width", iIL);
                    jSONObject2.put("height", iBg);
                    break;
                }
                break;
            case "openPrivacy":
                Fy();
                break;
            case "getMaterialMeta":
                VzQ(jSONObject2);
                break;
            case "send_temai_product_ids":
                xxp(il.eqN);
                break;
            case "getTeMaiAds":
                jSONObjectYDt = this.Ja;
                if (jSONObjectYDt != null) {
                    jSONObject2 = jSONObjectYDt;
                    break;
                }
                break;
            case "download_app_ad":
                this.uu = true;
                com.bytedance.sdk.openadsdk.eqN.bX.IL(this.xxp, this.CQc, 1, (org.json.JSONObject) null);
                com.bytedance.sdk.openadsdk.core.IL.eqN eqn = this.Uw;
                if (eqn != null) {
                    eqn.bg(this.aGH);
                    break;
                } else {
                    com.bytedance.sdk.openadsdk.eo.bX bXVar = this.WR;
                    if (bXVar != null && (context = this.Pae) != null) {
                        bXVar.bg(context, il.eqN, this.CQc);
                        com.bytedance.sdk.openadsdk.core.Ta.eqN.IL il2 = this.RJ;
                        if (il2 != null) {
                            il2.eqN();
                        }
                    } else {
                        com.bytedance.sdk.openadsdk.eqN.bX.IL(this.xxp, this.CQc, -2, (org.json.JSONObject) null);
                    }
                    break;
                }
                break;
            case "close":
                ldr();
                break;
            case "unsubscribe_app_ad":
                com.bytedance.sdk.openadsdk.eo.bX bXVar2 = this.WR;
                if (bXVar2 != null) {
                    bXVar2.bg(il.eqN);
                    break;
                }
                break;
            case "getCloseButtonInfo":
                jSONObjectYDt = yDt();
                if (jSONObjectYDt != null) {
                    jSONObject2 = jSONObjectYDt;
                    break;
                }
                break;
            case "isViewable":
                jSONObject2.put("viewStatus", this.ayS ? 1 : 0);
                break;
            case "getNativeSiteCustomData":
                com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.xxp;
                if (tuv != null && !android.text.TextUtils.isEmpty(tuv.daV())) {
                    jSONObject2.put("data", this.xxp.daV());
                    break;
                }
                break;
            case "sendReward":
                this.bX = true;
                com.bytedance.sdk.openadsdk.PX.zx zxVar = this.kMt;
                if (zxVar != null) {
                    zxVar.bg();
                    break;
                }
                break;
            case "dynamicTrack":
                vb(il.eqN);
                break;
            case "getTemplateInfo":
                org.json.JSONObject jSONObject4 = this.LZ;
                if (jSONObject4 != null) {
                    jSONObject4.put("setting", LZ());
                    com.bytedance.sdk.openadsdk.core.model.tuV tuv2 = this.xxp;
                    if (tuv2 != null) {
                        this.LZ.put("extension", tuv2.ews());
                    }
                }
                jSONObject2 = this.LZ;
                break;
            case "getCurrentVideoState":
                Ta(jSONObject2);
                break;
            case "getVolume":
                android.media.AudioManager audioManager = (android.media.AudioManager) com.bytedance.sdk.openadsdk.core.VzQ.bg().getSystemService("audio");
                jSONObject2.put("endcard_mute", (audioManager != null ? audioManager.getStreamVolume(3) : -1) <= 0);
                break;
            case "pauseWebViewTimers":
                VzQ();
                break;
            case "muteVideo":
                IL(this.Fy, il.eqN);
                break;
            case "renderDidFinish":
                yDt(il.eqN);
                break;
            case "removeLoading":
                com.bytedance.sdk.openadsdk.PX.eqN eqn2 = this.JAA;
                if (eqn2 != null) {
                    eqn2.bg();
                    break;
                }
                break;
            case "endcard_load":
                VB(il.eqN);
                break;
            case "getNetworkData":
                bg(il, jSONObject2);
                break;
            case "playable_style":
                WR(jSONObject2);
                break;
            case "sendLog":
                org.json.JSONObject jSONObject5 = il.eqN;
                if (jSONObject5 != null && (jSONObject = jSONObject5.getJSONObject("extJson")) != null && jSONObject.has("category") && jSONObject.has("tag") && jSONObject.has("label")) {
                    java.lang.String strOptString = jSONObject.optString("category");
                    java.lang.String strOptString2 = jSONObject.optString("tag");
                    java.lang.String strOptString3 = jSONObject.optString("label");
                    long jOptLong = jSONObject5.optLong("value");
                    long jOptLong2 = jSONObject5.optLong("extValue");
                    try {
                        jSONObject.putOpt("ua_policy", java.lang.Integer.valueOf(this.Lq));
                        break;
                    } catch (java.lang.Exception unused) {
                    }
                    if (com.json.z8.CLICK.equals(strOptString3)) {
                        jSONObject = Fy(jSONObject);
                    }
                    java.lang.String strBg = bg(strOptString2, strOptString3);
                    boolean zEqN = com.bytedance.sdk.openadsdk.core.model.xxp.eqN(this.xxp);
                    bg(jSONObject, zEqN, strOptString3);
                    com.bytedance.sdk.openadsdk.eqN.bX.bg(this.xxp, strOptString, strBg, strOptString3, jOptLong, jOptLong2, jSONObject, zEqN);
                    break;
                }
                break;
            case "skipVideo":
                tuV();
                break;
            case "landscape_click":
                android.content.Context context3 = this.Pae;
                if (context3 instanceof com.bytedance.sdk.openadsdk.core.Ta.eqN.IL) {
                    ((com.bytedance.sdk.openadsdk.core.Ta.eqN.IL) context3).eqN();
                    break;
                }
                break;
        }
        if (i == 1 && !android.text.TextUtils.isEmpty(il.IL)) {
            IL(il.IL, jSONObject2);
            if (com.bytedance.sdk.openadsdk.core.WR.IL().xxp()) {
                android.util.Log.d("TTAD.AndroidObject", "[JSB-RSP] version:" + i + " data=" + jSONObject2);
            }
        }
        return jSONObject2;
    }

    private void bg(org.json.JSONObject jSONObject, boolean z, java.lang.String str) {
        com.bytedance.sdk.openadsdk.core.widget.ldr ldrVar;
        if (z) {
            try {
                java.lang.String strOptString = jSONObject.optString("ad_extra_data");
                if (android.text.TextUtils.isEmpty(strOptString) || new org.json.JSONObject(strOptString).optInt("agg_request_type", -1) != 1 || !com.json.z8.CLICK.equals(str) || (ldrVar = this.iR) == null) {
                    return;
                }
                ldrVar.bg();
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.AndroidObject", "callAggClickListener faile", th);
            }
        }
    }

    private boolean bg(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        java.lang.String strOptString;
        int iOptInt;
        java.lang.String strOptString2;
        if (jSONObject != null) {
            iOptInt = jSONObject.optInt("landingStyle");
            strOptString = jSONObject.optString("url");
            strOptString2 = jSONObject.optString("fallback_url");
        } else {
            strOptString = null;
            iOptInt = -1;
            strOptString2 = null;
        }
        boolean z = false;
        if (iOptInt == 1) {
            if (!com.bytedance.sdk.component.utils.Lq.bg(strOptString)) {
                try {
                    jSONObject2.put("invalid_url", 1);
                } catch (org.json.JSONException e) {
                    com.bytedance.sdk.component.utils.PX.bg("TTAD.AndroidObject", "handleUrl, EX1->: ", e);
                }
            }
            return z;
        }
        if (iOptInt == 2) {
            try {
                if (android.text.TextUtils.isEmpty(strOptString) && android.text.TextUtils.isEmpty(strOptString2)) {
                    jSONObject2.put("empty_url", 1);
                } else if (!com.bytedance.sdk.component.utils.Lq.bg(strOptString2)) {
                    jSONObject2.put("invalid_url", 1);
                }
            } catch (org.json.JSONException e2) {
                com.bytedance.sdk.component.utils.PX.bg("TTAD.AndroidObject", "handleUrl, EX2->: ", e2);
            }
        }
        return z;
        z = true;
        return z;
    }

    public void ldr() {
        com.bytedance.sdk.openadsdk.PX.IL il;
        if (this.jz && (il = this.DDQ) != null) {
            il.bg();
            return;
        }
        android.content.Context context = this.Pae;
        if ((context instanceof android.app.Activity) && com.bytedance.sdk.openadsdk.utils.Fy.bg((android.app.Activity) context)) {
            ((android.app.Activity) this.Pae).finish();
        }
    }

    public void bX(org.json.JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.tuV.bg(vb(), this.Pae instanceof android.app.Activity, jSONObject, this.xxp, this.CQc, this.Ta, Ta(), this.iR);
    }

    private android.content.Context vb() {
        java.lang.ref.WeakReference<com.bytedance.sdk.component.WR.eqN> weakReference = this.eqN;
        android.app.Activity activityBg = (weakReference == null || weakReference.get() == null) ? null : com.bytedance.sdk.component.utils.IL.bg(this.eqN.get());
        return activityBg == null ? this.Pae : activityBg;
    }

    private void eo(org.json.JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.eqN.eqN.zx zxVar;
        if (jSONObject == null || (zxVar = this.ZQc) == null) {
            return;
        }
        zxVar.IL(jSONObject);
    }

    private void bg(java.lang.String str, boolean z) {
        if (this.ZQc == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            this.ZQc.bg(str);
        } else {
            this.ZQc.IL(str);
        }
    }

    private void xxp() {
        com.bytedance.sdk.openadsdk.PX.WR wr = this.Uq;
        if (wr == null) {
            return;
        }
        wr.bg();
    }

    private void VzQ() {
        com.bytedance.sdk.openadsdk.PX.WR wr = this.Uq;
        if (wr == null) {
            return;
        }
        wr.IL();
    }

    private void VB(org.json.JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.PX.IL il = this.DDQ;
        if (il == null || jSONObject == null) {
            return;
        }
        il.bg(jSONObject.optBoolean("isRenderSuc", false), jSONObject.optInt("code", -1), jSONObject.optString(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, ""));
    }

    @Override // com.bytedance.sdk.component.adexpress.zx.IL
    @android.webkit.JavascriptInterface
    public java.lang.String adInfo() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            Kg(jSONObject);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.zx.IL
    @android.webkit.JavascriptInterface
    public java.lang.String appInfo() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            IL(jSONObject);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.zx.IL
    @android.webkit.JavascriptInterface
    public java.lang.String getTemplateInfo() {
        bg("getTemplateInfo", true);
        try {
            org.json.JSONObject jSONObject = this.LZ;
            if (jSONObject != null) {
                jSONObject.put("setting", LZ());
                com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.xxp;
                if (tuv != null) {
                    this.LZ.put("extension", tuv.ews());
                }
            }
            bg("getTemplateInfo", false);
            return this.LZ.toString();
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.zx.IL
    @android.webkit.JavascriptInterface
    public void renderDidFinish(java.lang.String str) {
        try {
            yDt(new org.json.JSONObject(str));
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.zx.IL
    @android.webkit.JavascriptInterface
    public void muteVideo(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            com.bytedance.sdk.openadsdk.core.aGH.bX bXVar = this.sVc;
            if (bXVar != null) {
                com.bytedance.sdk.openadsdk.utils.VJ.IL(bXVar);
            }
            com.bytedance.sdk.openadsdk.core.aGH.bX bXVar2 = new com.bytedance.sdk.openadsdk.core.aGH.bX(this.Fy, jSONObject);
            this.sVc = bXVar2;
            com.bytedance.sdk.openadsdk.utils.VJ.bg(bXVar2);
        } catch (java.lang.Exception unused) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.AndroidObject", "");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.zx.IL
    @android.webkit.JavascriptInterface
    public void dynamicTrack(java.lang.String str) {
        try {
            vb(new org.json.JSONObject(str));
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.zx.IL
    @android.webkit.JavascriptInterface
    public void changeVideoState(java.lang.String str) {
        try {
            final org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aGH.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.core.aGH.this.PX(jSONObject);
                }
            });
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.zx.IL
    @android.webkit.JavascriptInterface
    public void clickEvent(java.lang.String str) {
        try {
            final org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aGH.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.core.aGH.this.eqN(jSONObject);
                }
            });
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.zx.IL
    @android.webkit.JavascriptInterface
    public void skipVideo() {
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aGH.4
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.aGH.this.tuV();
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.zx.IL
    @android.webkit.JavascriptInterface
    public java.lang.String getCurrentVideoState() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        Ta(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.zx.IL
    @android.webkit.JavascriptInterface
    public void initRenderFinish() {
        com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aGH.5
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.openadsdk.core.aGH.this.qC != null) {
                    com.bytedance.sdk.openadsdk.core.aGH.this.qC.bg();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.zx.IL
    public void bg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int iOptInt = jSONObject.optInt("time");
            java.lang.String strOptString = jSONObject.optString("flag");
            com.bytedance.sdk.openadsdk.core.Kg.yDt ydt = this.Fy;
            if (ydt != null) {
                ydt.bg(iOptInt, strOptString);
            }
        } catch (org.json.JSONException unused) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.AndroidObject", "requestPauseVideo json exception");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.zx.IL
    @android.webkit.JavascriptInterface
    public java.lang.String getData(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return this.LZ.toString();
        }
        try {
            org.json.JSONObject jSONObjectBg = com.bytedance.sdk.openadsdk.core.Kg.bg.IL.bg(this.LZ, new org.json.JSONObject(str));
            if (jSONObjectBg == null) {
                return this.LZ.toString();
            }
            return jSONObjectBg.toString();
        } catch (java.lang.Exception unused) {
            return this.LZ.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tuV() {
        com.bytedance.sdk.openadsdk.core.Kg.yDt ydt = this.Fy;
        if (ydt != null) {
            ydt.bg();
        }
    }

    private void Fy() {
        if (this.Pae == null || android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.VzQ.eqN().ayS())) {
            return;
        }
        com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.bg(this.Pae, this.xxp, this.CQc);
    }

    public void iR() {
        com.bytedance.sdk.openadsdk.core.Kg.yDt ydt = this.Fy;
        if (ydt != null) {
            ydt.IL();
        }
    }

    public void ldr(java.lang.String str) {
        this.CQc = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void IL(com.bytedance.sdk.openadsdk.core.Kg.yDt ydt, org.json.JSONObject jSONObject) {
        if (ydt == null || jSONObject == null) {
            return;
        }
        try {
            ydt.bg(jSONObject.optBoolean("mute", false));
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void PX(org.json.JSONObject jSONObject) {
        if (this.Fy == null || jSONObject == null) {
            return;
        }
        try {
            this.Fy.bg(jSONObject.optInt("stateType", -1));
        } catch (java.lang.Exception unused) {
        }
    }

    private boolean Ta(org.json.JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.Kg.yDt ydt = this.Fy;
        if (ydt != null && jSONObject != null) {
            double dBX = ydt.bX();
            int iEqN = this.Fy.eqN();
            java.lang.Object[] objArr = new java.lang.Object[4];
            java.lang.Double.valueOf(dBX);
            java.lang.Integer.valueOf(iEqN);
            try {
                jSONObject.put("currentTime", dBX / 1000.0d);
                jSONObject.put("state", iEqN);
                return true;
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    @com.bytedance.JProtect
    private org.json.JSONObject LZ() {
        return IL(this.xxp);
    }

    public static org.json.JSONObject IL(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        int iIGR;
        boolean zXxp;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (com.bytedance.sdk.openadsdk.core.VzQ.eqN() == null) {
            return jSONObject;
        }
        int i = 0;
        if (tuv != null) {
            try {
                iIGR = tuv.IGR();
            } catch (java.lang.Exception unused) {
            }
        } else {
            iIGR = 0;
        }
        int iFx = tuv != null ? tuv.Fx() : 0;
        int iEo = com.bytedance.sdk.openadsdk.core.VzQ.eqN().eo(java.lang.String.valueOf(iIGR));
        int iTuV = com.bytedance.sdk.openadsdk.core.VzQ.eqN().tuV(java.lang.String.valueOf(iIGR));
        boolean zLdr = com.bytedance.sdk.openadsdk.core.VzQ.eqN().ldr(java.lang.String.valueOf(iIGR));
        boolean z = com.bytedance.sdk.openadsdk.core.VzQ.eqN().Ta(java.lang.String.valueOf(iIGR)) == 1;
        if (iFx == 7 || iFx == 8) {
            zXxp = com.bytedance.sdk.openadsdk.core.VzQ.eqN().xxp(java.lang.String.valueOf(iIGR));
        } else {
            zXxp = com.bytedance.sdk.openadsdk.core.VzQ.eqN().bX(java.lang.String.valueOf(iIGR));
        }
        jSONObject.put("voice_control", zXxp);
        jSONObject.put("rv_skip_time", iEo);
        jSONObject.put("fv_skip_show", zLdr);
        jSONObject.put("iv_skip_time", iTuV);
        jSONObject.put("show_dislike", tuv != null && tuv.ZyO());
        jSONObject.put("video_adaptation", tuv != null ? tuv.DDQ() : 0);
        jSONObject.put("skip_change_to_close", z);
        if (tuv.eq() && com.bytedance.sdk.openadsdk.core.settings.xxp.zU().IEI()) {
            i = 1;
        }
        jSONObject.put("bar_render_platform", i);
        return jSONObject;
    }

    public void eqN(org.json.JSONObject jSONObject) {
        double d;
        double d2;
        double dOptDouble;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        org.json.JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.LZ.bg("TTAD.AndroidObject", "trigger Class1 method1");
        try {
            java.lang.String strOptString = jSONObject.optString(com.ironsource.sdk.controller.f.b.AD_ID);
            int iOptInt = jSONObject.optInt("areaType", 1);
            java.lang.String strOptString2 = jSONObject.optString("clickAreaType");
            org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("clickInfo");
            double d9 = 0.0d;
            if (jSONObjectOptJSONObject2 != null) {
                double dOptDouble2 = jSONObjectOptJSONObject2.optDouble("down_x", 0.0d);
                dOptDouble = jSONObjectOptJSONObject2.optDouble("down_y", 0.0d);
                double dOptDouble3 = jSONObjectOptJSONObject2.optDouble("up_x", 0.0d);
                double dOptDouble4 = jSONObjectOptJSONObject2.optDouble("up_y", 0.0d);
                double dOptDouble5 = jSONObjectOptJSONObject2.optDouble("down_time", 0.0d);
                double dOptDouble6 = jSONObjectOptJSONObject2.optDouble("up_time", 0.0d);
                double dOptDouble7 = jSONObjectOptJSONObject2.optDouble("button_x", 0.0d);
                double dOptDouble8 = jSONObjectOptJSONObject2.optDouble("button_y", 0.0d);
                double dOptDouble9 = jSONObjectOptJSONObject2.optDouble("button_width", 0.0d);
                double dOptDouble10 = jSONObjectOptJSONObject2.optDouble("button_height", 0.0d);
                jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("rectInfo");
                d8 = dOptDouble10;
                d9 = dOptDouble2;
                d2 = dOptDouble3;
                d3 = dOptDouble5;
                d4 = dOptDouble6;
                d5 = dOptDouble7;
                d6 = dOptDouble8;
                d7 = dOptDouble9;
                d = dOptDouble4;
            } else {
                d = 0.0d;
                d2 = 0.0d;
                dOptDouble = 0.0d;
                d3 = 0.0d;
                d4 = 0.0d;
                d5 = 0.0d;
                d6 = 0.0d;
                d7 = 0.0d;
                d8 = 0.0d;
                jSONObjectOptJSONObject = null;
            }
            com.bytedance.sdk.openadsdk.core.model.yDt ydtBg = new com.bytedance.sdk.openadsdk.core.model.yDt.bg().eqN((float) d9).bX((float) dOptDouble).IL((float) d2).bg((float) d).IL((long) d3).bg((long) d4).bX((int) d5).eqN((int) d6).zx((int) d7).ldr((int) d8).bg(strOptString2).bg((android.util.SparseArray<com.bytedance.sdk.openadsdk.core.IL.bX.bg>) null).bg(true).IL(iOptInt).bg(jSONObjectOptJSONObject).bg(jSONObject.optInt("clickAreaCategory", -1)).IL(jSONObjectOptJSONObject2).bg();
            com.bytedance.sdk.component.adexpress.IL.VB vb = this.tuV;
            if (vb != null) {
                vb.bg(null, iOptInt, ydtBg);
            }
            bg(strOptString, iOptInt, ydtBg);
        } catch (java.lang.Exception unused) {
            com.bytedance.sdk.component.adexpress.IL.VB vb2 = this.tuV;
            if (vb2 != null) {
                vb2.bg(null, -1, null);
            }
        }
    }

    @com.bytedance.JProtect
    private void yDt(org.json.JSONObject jSONObject) {
        int i;
        double dOptDouble;
        double dOptDouble2;
        com.bytedance.sdk.openadsdk.PX.ldr ldrVar;
        com.bytedance.sdk.openadsdk.core.aGH agh = this;
        if (agh.tuV == null || jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.eqN.eqN.zx zxVar = agh.ZQc;
        if (zxVar != null) {
            zxVar.vb();
        }
        com.bytedance.sdk.component.adexpress.IL.yDt ydt = new com.bytedance.sdk.component.adexpress.IL.yDt();
        ydt.bg(1);
        try {
            boolean zOptBoolean = jSONObject.optBoolean("isRenderSuc");
            org.json.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("AdSize");
            if (jSONObjectOptJSONObject != null) {
                dOptDouble = jSONObjectOptJSONObject.optDouble("width");
                dOptDouble2 = jSONObjectOptJSONObject.optDouble("height");
            } else {
                dOptDouble = 0.0d;
                dOptDouble2 = 0.0d;
            }
            org.json.JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("videoInfo");
            if (jSONObjectOptJSONObject2 != null) {
                try {
                    double dOptDouble3 = jSONObjectOptJSONObject2.optDouble("x");
                    double dOptDouble4 = jSONObjectOptJSONObject2.optDouble("y");
                    double dOptDouble5 = jSONObjectOptJSONObject2.optDouble("width");
                    double dOptDouble6 = jSONObjectOptJSONObject2.optDouble("height");
                    if (agh.Lq(jSONObjectOptJSONObject2)) {
                        ydt.bg((float) jSONObjectOptJSONObject2.optDouble("borderRadiusTopLeft"));
                        ydt.IL((float) jSONObjectOptJSONObject2.optDouble("borderRadiusTopRight"));
                        ydt.bX((float) jSONObjectOptJSONObject2.optDouble("borderRadiusBottomLeft"));
                        ydt.eqN((float) jSONObjectOptJSONObject2.optDouble("borderRadiusBottomRight"));
                    }
                    ydt.bX(dOptDouble3);
                    ydt.eqN(dOptDouble4);
                    ydt.zx(dOptDouble5);
                    ydt.ldr(dOptDouble6);
                } catch (java.lang.Exception unused) {
                    i = 101;
                    agh = this;
                }
            } else {
                dOptDouble2 = dOptDouble2;
            }
            try {
                java.lang.String strOptString = jSONObject.optString(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, com.bytedance.sdk.openadsdk.core.Kg.bg(101));
                int iOptInt = jSONObject.optInt("code", 101);
                try {
                    ydt.bg(zOptBoolean);
                    ydt.bg(dOptDouble);
                    ydt.IL(dOptDouble2);
                    ydt.bg(strOptString);
                    ydt.IL(iOptInt);
                    agh = this;
                    agh.tuV.bg(ydt);
                    if (jSONObjectOptJSONObject2 == null || (ldrVar = agh.Dxa) == null) {
                        return;
                    }
                    ldrVar.bg(ydt);
                    return;
                } catch (java.lang.Exception unused2) {
                    agh = this;
                }
            } catch (java.lang.Exception unused3) {
                agh = this;
                i = 101;
            }
        } catch (java.lang.Exception unused4) {
        }
        i = 101;
        ydt.IL(i);
        ydt.bg(com.bytedance.sdk.openadsdk.core.Kg.bg(i));
        agh.tuV.bg(ydt);
    }

    private boolean Lq(org.json.JSONObject jSONObject) {
        return jSONObject.has("borderRadiusTopLeft") && jSONObject.has("borderRadiusBottomLeft") && jSONObject.has("borderRadiusTopRight") && jSONObject.has("borderRadiusBottomRight");
    }

    private void vb(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            android.net.Uri uri = android.net.Uri.parse(jSONObject.optString("trackData"));
            if ("bytedance".equals(uri.getScheme().toLowerCase())) {
                com.bytedance.sdk.openadsdk.utils.xxp.bg(uri, this);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    private void xxp(org.json.JSONObject jSONObject) {
        if (jSONObject == null || this.tC == null) {
            return;
        }
        try {
            org.json.JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("temaiProductIds");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                this.tC.bg(true, jSONArrayOptJSONArray);
            } else {
                this.tC.bg(false, null);
            }
        } catch (java.lang.Exception unused) {
            this.tC.bg(false, null);
        }
    }

    private boolean VzQ(org.json.JSONObject jSONObject) {
        try {
            jSONObject.put("creatives", IL(this.VW));
        } catch (java.lang.Exception unused) {
        }
        return true;
    }

    private void bg(final com.bytedance.sdk.openadsdk.core.aGH.IL il, final org.json.JSONObject jSONObject) {
        if (il == null) {
            return;
        }
        try {
            bg(il.eqN, new com.bytedance.sdk.openadsdk.PX.bX() { // from class: com.bytedance.sdk.openadsdk.core.aGH.6
                @Override // com.bytedance.sdk.openadsdk.PX.bX
                public void bg(boolean z, java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> list) {
                    if (!z) {
                        com.bytedance.sdk.openadsdk.core.aGH.this.IL(il.IL, jSONObject);
                        return;
                    }
                    try {
                        jSONObject.put("creatives", com.bytedance.sdk.openadsdk.core.aGH.IL(list));
                        com.bytedance.sdk.openadsdk.core.aGH.this.IL(il.IL, jSONObject);
                    } catch (java.lang.Exception unused) {
                    }
                }
            });
        } catch (java.lang.Exception unused) {
        }
    }

    @com.bytedance.JProtect
    private boolean bg(java.lang.String str, int i, com.bytedance.sdk.openadsdk.core.model.yDt ydt) {
        java.util.HashMap<java.lang.String, com.bytedance.sdk.openadsdk.core.eo> map;
        if (android.text.TextUtils.isEmpty(str) || (map = this.VJ) == null || map.get(str) == null) {
            return false;
        }
        throw null;
    }

    @com.bytedance.JProtect
    public void bg(org.json.JSONObject jSONObject, final com.bytedance.sdk.openadsdk.PX.bX bXVar) {
        if (bXVar == null) {
            return;
        }
        try {
            final com.bytedance.sdk.openadsdk.PX.bX bXVar2 = new com.bytedance.sdk.openadsdk.PX.bX() { // from class: com.bytedance.sdk.openadsdk.core.aGH.7
                @Override // com.bytedance.sdk.openadsdk.PX.bX
                public void bg(final boolean z, final java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> list) {
                    com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aGH.7.1
                        @Override // java.lang.Runnable
                        public void run() {
                            bXVar.bg(z, list);
                        }
                    });
                }
            };
            if (this.xxp != null && !android.text.TextUtils.isEmpty(this.PX)) {
                int iFx = this.xxp.Fx();
                com.bytedance.sdk.openadsdk.AdSlot adSlotVW = this.xxp.VW();
                com.bytedance.sdk.openadsdk.core.model.LZ lz = new com.bytedance.sdk.openadsdk.core.model.LZ();
                lz.ldr = true;
                if (this.xxp.LKE() != null || this.xxp.uu() != null) {
                    lz.Kg = 2;
                }
                org.json.JSONObject jSONObject2 = this.VzQ;
                if (jSONObject2 == null) {
                    jSONObject2 = new org.json.JSONObject();
                }
                if (jSONObject != null) {
                    java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        java.lang.String next = itKeys.next();
                        jSONObject2.put(next, jSONObject.opt(next));
                    }
                }
                lz.iR = jSONObject2;
                com.bytedance.sdk.openadsdk.core.VzQ.bX().bg(adSlotVW, lz, iFx, new com.bytedance.sdk.openadsdk.core.Fy.bg() { // from class: com.bytedance.sdk.openadsdk.core.aGH.8
                    @Override // com.bytedance.sdk.openadsdk.core.Fy.bg
                    public void bg(int i, java.lang.String str) {
                        bXVar2.bg(false, null);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.Fy.bg
                    public void bg(com.bytedance.sdk.openadsdk.core.model.bg bgVar, com.bytedance.sdk.openadsdk.core.model.IL il) {
                        if (bgVar.bX() != null && !bgVar.bX().isEmpty()) {
                            com.bytedance.sdk.openadsdk.core.model.tuV tuv = bgVar.bX().get(0);
                            if (tuv != null) {
                                com.bytedance.sdk.openadsdk.core.aGH.this.VzQ = tuv.hff();
                            }
                            bXVar2.bg(true, bgVar.bX());
                            return;
                        }
                        bXVar2.bg(false, null);
                        il.bg(-3);
                        com.bytedance.sdk.openadsdk.core.model.IL.bg(il);
                    }
                });
                return;
            }
            bXVar2.bg(false, null);
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.AndroidObject", "get ads error", e);
        }
    }

    public static org.json.JSONArray IL(java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> list) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (list == null) {
            return jSONArray;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            jSONArray.put(list.get(i).ZTq());
        }
        return jSONArray;
    }

    private boolean tC() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.xxp;
        if (tuv == null || tuv.hff() == null || com.bytedance.sdk.openadsdk.core.model.rri.IL(this.xxp) || this.daV || this.xxp.hff().optInt("parent_type") != 2) {
            return false;
        }
        int iFx = this.xxp.Fx();
        if (iFx != 8 && iFx != 7) {
            return false;
        }
        this.daV = true;
        return true;
    }

    public void bX(boolean z) {
        this.bX = z;
    }

    public boolean Kg() {
        return this.uu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IL(java.lang.String str, org.json.JSONObject jSONObject) {
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            tuV(jSONObject2);
        } catch (java.lang.Exception unused) {
        }
    }

    private void tuV(org.json.JSONObject jSONObject) {
        android.webkit.WebView webViewTa;
        if (jSONObject == null || (webViewTa = Ta()) == null) {
            return;
        }
        com.bytedance.sdk.component.utils.VB.bg(webViewTa, "javascript:ToutiaoJSBridge._handleMessageFromToutiao(" + jSONObject + ")");
    }

    private void bX(java.lang.String str, org.json.JSONObject jSONObject) {
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("__msg_type", androidx.core.app.NotificationCompat.CATEGORY_EVENT);
            jSONObject2.put("__event_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            tuV(jSONObject2);
        } catch (java.lang.Exception unused) {
        }
    }

    private void iR(java.lang.String str) {
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(new java.lang.String(android.util.Base64.decode(str, 2)));
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                com.bytedance.sdk.openadsdk.core.aGH.IL il = new com.bytedance.sdk.openadsdk.core.aGH.IL();
                try {
                    org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        il.bg = jSONObjectOptJSONObject.optString("__msg_type", null);
                        il.IL = jSONObjectOptJSONObject.optString("__callback_id", null);
                        il.bX = jSONObjectOptJSONObject.optString("func");
                        il.eqN = jSONObjectOptJSONObject.optJSONObject("params");
                        il.zx = jSONObjectOptJSONObject.optInt("JSSDK");
                    }
                } catch (java.lang.Throwable unused) {
                }
                if (!android.text.TextUtils.isEmpty(il.bg) && !android.text.TextUtils.isEmpty(il.bX)) {
                    android.os.Message messageObtainMessage = this.zx.obtainMessage(11);
                    messageObtainMessage.obj = il;
                    this.zx.sendMessage(messageObtainMessage);
                }
            }
        } catch (java.lang.Exception unused2) {
        }
    }

    public boolean bg(android.net.Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            if (!"bytedance".equals(uri.getScheme())) {
                return false;
            }
            if (Kg.containsKey(uri.getHost())) {
                return true;
            }
        } catch (java.lang.Exception unused) {
        }
        return false;
    }

    public void IL(final android.net.Uri uri) {
        try {
            java.lang.String host = uri.getHost();
            if (!"log_event".equals(host) && !"custom_event".equals(host) && !"log_event_v3".equals(host)) {
                if ("private".equals(host) || "dispatch_message".equals(host)) {
                    WR(uri.toString());
                    return;
                }
                return;
            }
            com.bytedance.sdk.openadsdk.eqN.bX.bg(new com.bytedance.sdk.component.Kg.Kg("log_event_handleUri") { // from class: com.bytedance.sdk.openadsdk.core.aGH.9
                @Override // java.lang.Runnable
                public void run() {
                    long j;
                    java.lang.String strBg;
                    java.lang.String queryParameter = uri.getQueryParameter("category");
                    java.lang.String queryParameter2 = uri.getQueryParameter("tag");
                    com.bytedance.sdk.openadsdk.core.aGH.this.CQc = queryParameter2;
                    java.lang.String queryParameter3 = uri.getQueryParameter("label");
                    if (com.bytedance.sdk.openadsdk.core.aGH.this.Kg(queryParameter3)) {
                        long j2 = 0;
                        try {
                            j = java.lang.Long.parseLong(uri.getQueryParameter("value"));
                        } catch (java.lang.Exception unused) {
                            j = 0;
                        }
                        try {
                            j2 = java.lang.Long.parseLong(uri.getQueryParameter("ext_value"));
                        } catch (java.lang.Exception unused2) {
                        }
                        long j3 = j2;
                        java.lang.String queryParameter4 = uri.getQueryParameter("extra");
                        org.json.JSONObject jSONObjectFy = null;
                        if (!android.text.TextUtils.isEmpty(queryParameter4)) {
                            try {
                                org.json.JSONObject jSONObject = new org.json.JSONObject(queryParameter4);
                                try {
                                    jSONObject.putOpt("ua_policy", java.lang.Integer.valueOf(com.bytedance.sdk.openadsdk.core.aGH.this.Lq));
                                } catch (java.lang.Exception unused3) {
                                }
                                jSONObjectFy = jSONObject;
                            } catch (java.lang.Exception unused4) {
                            }
                        }
                        if (com.json.z8.CLICK.equals(queryParameter3)) {
                            jSONObjectFy = com.bytedance.sdk.openadsdk.core.aGH.this.Fy(jSONObjectFy);
                        }
                        if (!"landing_perf_error".equals(queryParameter3) && !"landing_perf_stats".equals(queryParameter3)) {
                            strBg = com.bytedance.sdk.openadsdk.core.aGH.this.bg(queryParameter2, queryParameter3);
                        } else {
                            try {
                                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                                for (java.lang.String str : uri.getQueryParameterNames()) {
                                    try {
                                        if ("extra".equals(str)) {
                                            jSONObject2.put("ad_extra_data", new org.json.JSONObject(uri.getQueryParameter(str)).optString("ad_extra_data"));
                                        } else {
                                            jSONObject2.put(str, uri.getQueryParameter(str));
                                        }
                                    } catch (java.lang.Exception unused5) {
                                    }
                                }
                                strBg = com.bytedance.sdk.openadsdk.core.aGH.this.ldr;
                                jSONObjectFy = jSONObject2;
                            } catch (java.lang.Exception unused6) {
                                return;
                            }
                        }
                        com.bytedance.sdk.openadsdk.eqN.bX.bg(com.bytedance.sdk.openadsdk.core.aGH.this.xxp, queryParameter, strBg, queryParameter3, j, j3, jSONObjectFy, com.bytedance.sdk.openadsdk.core.model.xxp.eqN(com.bytedance.sdk.openadsdk.core.aGH.this.xxp));
                    }
                }
            });
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Kg(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str) && "click_other".equals(str)) {
            return WR();
        }
        return true;
    }

    boolean WR() {
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.xxp;
        return tuv != null && tuv.qC() == 1;
    }

    public void bX(int i) {
        com.bytedance.sdk.openadsdk.core.Kg.yDt ydt = this.Fy;
        if (ydt != null) {
            ydt.IL(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.json.JSONObject Fy(org.json.JSONObject jSONObject) {
        if (this.bg != null) {
            if (jSONObject == null) {
                jSONObject = new org.json.JSONObject();
            }
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                java.lang.String strOptString = jSONObject.optString("ad_extra_data", null);
                if (strOptString != null) {
                    jSONObject2 = new org.json.JSONObject(strOptString);
                }
                for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : this.bg.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (java.lang.Exception e) {
                com.bytedance.sdk.component.utils.PX.IL(e.toString());
            }
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String bg(java.lang.String str, java.lang.String str2) {
        if (com.bytedance.sdk.openadsdk.core.model.xxp.eqN(this.xxp)) {
            return com.json.j5.v.equals(str2) ? com.bytedance.sdk.openadsdk.utils.ayS.bg(this.Ta) : "aggregate_page";
        }
        if (this.DDQ != null) {
            return com.bytedance.sdk.openadsdk.utils.ayS.bg(this.Ta);
        }
        return this.tuV == null ? com.bytedance.sdk.openadsdk.utils.ayS.IL(this.Ta) : str;
    }

    private void WR(java.lang.String str) {
        int iIndexOf;
        if (str != null && str.startsWith("bytedance://")) {
            try {
                if (str.equals("bytedance://dispatch_message/")) {
                    android.webkit.WebView webViewTa = Ta();
                    if (webViewTa != null) {
                        com.bytedance.sdk.component.utils.VB.bg(webViewTa, "javascript:ToutiaoJSBridge._fetchQueue()");
                        return;
                    }
                    return;
                }
                if (!str.startsWith("bytedance://private/setresult/") || (iIndexOf = str.indexOf(38, 30)) <= 0) {
                    return;
                }
                java.lang.String strSubstring = str.substring(30, iIndexOf);
                java.lang.String strSubstring2 = str.substring(iIndexOf + 1);
                if (!strSubstring.equals("SCENE_FETCHQUEUE") || strSubstring2.length() <= 0) {
                    return;
                }
                iR(strSubstring2);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public void eo() {
        tC();
    }

    public void VB() {
        com.bytedance.sdk.openadsdk.eo.bX bXVar = this.WR;
        if (bXVar != null) {
            bXVar.bg();
        }
        com.bytedance.sdk.openadsdk.core.aGH.bX bXVar2 = this.sVc;
        if (bXVar2 != null) {
            com.bytedance.sdk.openadsdk.utils.VJ.IL(bXVar2);
            this.sVc = null;
        }
        this.Pae = null;
        this.RJ = null;
    }

    @Override // com.bytedance.sdk.component.utils.JAA.bg
    public void bg(android.os.Message message) {
        if (message != null && message.what == 11 && (message.obj instanceof com.bytedance.sdk.openadsdk.core.aGH.IL)) {
            try {
                bg((com.bytedance.sdk.openadsdk.core.aGH.IL) message.obj, 1);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    private void rri() {
        if (this.WR == null) {
            this.WR = com.bytedance.sdk.openadsdk.eo.bg.bg(this, this.xxp);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.eo.IL
    public void bg(java.lang.String str, org.json.JSONObject jSONObject) {
        bX(str, jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.zx.IL
    @android.webkit.JavascriptInterface
    public void chooseAdResult(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int iOptInt = jSONObject.optInt("video_choose");
            long jOptLong = jSONObject.optLong("video_choose_duration");
            com.bytedance.sdk.openadsdk.PX.ldr ldrVar = this.Dxa;
            if (ldrVar != null) {
                ldrVar.bg(iOptInt, jOptLong);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public void PX() {
        com.bytedance.sdk.openadsdk.core.aGH.bg bgVar = this.txA;
        if (bgVar != null) {
            bgVar.bg();
        }
    }

    public void eqN(boolean z) {
        this.bN = z;
    }

    public void zx(boolean z) {
        this.jz = z;
    }

    public void zx(org.json.JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.tuV tuvBg = com.bytedance.sdk.openadsdk.core.IL.bg(jSONObject);
        if (tuvBg != null) {
            boolean zEqN = com.bytedance.sdk.openadsdk.core.model.xxp.eqN(this.xxp);
            bg(tuvBg, zEqN ? com.bytedance.sdk.openadsdk.utils.ayS.IL(this.Ta) : this.CQc, !zEqN);
        }
    }

    private void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv, java.lang.String str, boolean z) {
        com.bytedance.sdk.openadsdk.core.IL.bg bgVar = new com.bytedance.sdk.openadsdk.core.IL.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), tuv, str, this.Ta);
        bgVar.bg(com.bytedance.sdk.openadsdk.VzQ.bg.bg.iR.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), tuv, str));
        if (!z) {
            bgVar.bg(false);
        }
        bgVar.onClick(null);
    }

    public org.json.JSONObject ldr(org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.xxp;
            if (tuv instanceof com.bytedance.sdk.openadsdk.core.model.Fy) {
                java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> listBX = ((com.bytedance.sdk.openadsdk.core.model.Fy) tuv).eD().bX();
                for (int i = 0; i < listBX.size(); i++) {
                    jSONArray.put(bX(listBX.get(i)));
                }
            }
            jSONObject2.put("creatives", jSONArray);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject2;
    }

    private org.json.JSONObject bX(com.bytedance.sdk.openadsdk.core.model.tuV tuv) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("is_ad_event", "1");
        jSONObject2.put(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_CONTENT_ID, tuv.MM());
        jSONObject2.put("req_id", tuv.waE());
        jSONObject2.put("ad_id", tuv.Ys());
        jSONObject2.put("log_extra", tuv.Ny());
        jSONObject2.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.xxp.zU().Ys());
        jSONObject.put("ad_info", jSONObject2);
        jSONObject.put("endcard_creative", tuv.jUS());
        return jSONObject;
    }

    public void iR(org.json.JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.bg bgVarED;
        if (jSONObject == null) {
            return;
        }
        int iOptInt = jSONObject.optInt(com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        com.bytedance.sdk.openadsdk.core.model.tuV tuv = this.xxp;
        if (!(tuv instanceof com.bytedance.sdk.openadsdk.core.model.Fy) || (bgVarED = ((com.bytedance.sdk.openadsdk.core.model.Fy) tuv).eD()) == null) {
            return;
        }
        java.util.List<com.bytedance.sdk.openadsdk.core.model.tuV> listBX = bgVarED.bX();
        if (iOptInt < 0 || iOptInt >= listBX.size()) {
            return;
        }
        bg(listBX.get(iOptInt), this.CQc, false);
        com.bytedance.sdk.openadsdk.core.Ta.eqN.IL il = this.RJ;
        if (il != null) {
            il.eqN();
        }
    }

    public void bg(com.bytedance.sdk.openadsdk.core.Ta.eqN.IL il) {
        this.RJ = il;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.aGH.bg bgVar) {
        this.txA = bgVar;
    }

    private static class bX implements java.lang.Runnable {
        private final org.json.JSONObject IL;
        private final com.bytedance.sdk.openadsdk.core.Kg.yDt bg;

        public bX(com.bytedance.sdk.openadsdk.core.Kg.yDt ydt, org.json.JSONObject jSONObject) {
            this.bg = ydt;
            this.IL = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.aGH.IL(this.bg, this.IL);
        }
    }
}
