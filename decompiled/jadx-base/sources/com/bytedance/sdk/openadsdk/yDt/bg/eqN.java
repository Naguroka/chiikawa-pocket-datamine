package com.bytedance.sdk.openadsdk.yDt.bg;

/* JADX INFO: loaded from: classes4.dex */
public class eqN<T extends com.bytedance.sdk.openadsdk.yDt.bg.eqN> implements com.bytedance.sdk.openadsdk.yDt.bg.bX {
    private java.lang.String IL;
    private java.lang.String PX;
    private java.lang.String VB;
    private java.lang.String WR;
    private java.lang.String bX;
    private java.lang.String bg;
    private java.lang.String eo;
    private java.lang.String iR;
    private final java.lang.String eqN = com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME;
    private long zx = java.lang.System.currentTimeMillis() / 1000;
    private int ldr = 0;
    private int Kg = 0;

    private T vb() {
        return this;
    }

    public static com.bytedance.sdk.openadsdk.yDt.bg.eqN<com.bytedance.sdk.openadsdk.yDt.bg.eqN> IL() {
        return new com.bytedance.sdk.openadsdk.yDt.bg.eqN<>();
    }

    @Override // com.bytedance.sdk.openadsdk.yDt.bg.bX
    @com.bytedance.JProtect
    public org.json.JSONObject bg() {
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("ad_sdk_version", iR());
            jSONObject2.put("app_version", com.bytedance.sdk.openadsdk.utils.ayS.iR());
            jSONObject2.put(com.ironsource.aa.a.d, Kg());
            jSONObject2.put("conn_type", com.bytedance.sdk.component.utils.Lq.IL(com.bytedance.sdk.openadsdk.core.VzQ.bg()));
            jSONObject2.put(com.google.ads.mediation.pangle.PangleConstants.APP_ID, android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.WR.IL().eqN()) ? "" : com.bytedance.sdk.openadsdk.core.WR.IL().eqN());
            jSONObject2.put("device_info", Lq());
            if (!android.text.TextUtils.isEmpty(bX())) {
                jSONObject2.put("type", bX());
            }
            jSONObject2.put("error_code", VB());
            if (!android.text.TextUtils.isEmpty(PX())) {
                jSONObject2.put("error_msg", PX());
            }
            if (!android.text.TextUtils.isEmpty(zx())) {
                jSONObject2.put("rit", zx());
            }
            if (!android.text.TextUtils.isEmpty(ldr())) {
                jSONObject2.put("creative_id", ldr());
            }
            if (WR() > 0) {
                jSONObject2.put("adtype", WR());
            }
            if (!android.text.TextUtils.isEmpty(eo())) {
                jSONObject2.put("req_id", eo());
            }
            if (!android.text.TextUtils.isEmpty(Ta())) {
                jSONObject2.put("extra", Ta());
            }
            java.lang.String strEqN = eqN();
            if (android.text.TextUtils.isEmpty(strEqN)) {
                jSONObject = new org.json.JSONObject();
            } else {
                try {
                    jSONObject = new org.json.JSONObject(strEqN);
                } catch (java.lang.Exception unused) {
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                jSONObject.put("os_version_int", android.os.Build.VERSION.SDK_INT);
                jSONObject2.put("event_extra", jSONObject.toString());
            } else if (!android.text.TextUtils.isEmpty(strEqN)) {
                jSONObject2.put("event_extra", strEqN);
            }
            if (!android.text.TextUtils.isEmpty(yDt())) {
                jSONObject2.put("duration", yDt());
            }
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.bg("LogStatsBase", th.getMessage());
        }
        return jSONObject2;
    }

    @com.bytedance.JProtect
    private org.json.JSONObject Lq() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.json.ce.y, 1);
            jSONObject.put(com.json.ce.v, android.os.Build.MODEL);
            jSONObject.put("vendor", android.os.Build.MANUFACTURER);
            jSONObject.put(com.ironsource.y8.h.V, com.bytedance.sdk.openadsdk.utils.ayS.zx());
            jSONObject.put(com.json.ce.U, com.bytedance.sdk.openadsdk.utils.ayS.bX());
            jSONObject.put(com.json.ce.K0, com.bytedance.sdk.openadsdk.VzQ.bg.IL.bg.bg().IL());
        } catch (java.lang.Throwable unused) {
        }
        return jSONObject;
    }

    public java.lang.String bX() {
        return this.bg;
    }

    public T bg(java.lang.String str) {
        this.bg = str;
        return (T) vb();
    }

    public java.lang.String eqN() {
        return this.VB;
    }

    public T IL(java.lang.String str) {
        this.VB = str;
        return (T) vb();
    }

    public java.lang.String zx() {
        return this.IL;
    }

    public T bX(java.lang.String str) {
        this.IL = str;
        return (T) vb();
    }

    public java.lang.String ldr() {
        return this.bX;
    }

    public T eqN(java.lang.String str) {
        this.bX = str;
        return (T) vb();
    }

    public java.lang.String iR() {
        return android.text.TextUtils.isEmpty(com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME) ? "" : com.bytedance.sdk.openadsdk.BuildConfig.VERSION_NAME;
    }

    public long Kg() {
        return this.zx;
    }

    public int WR() {
        return this.ldr;
    }

    public T bg(int i) {
        this.ldr = i;
        return (T) vb();
    }

    public java.lang.String eo() {
        return this.iR;
    }

    public T zx(java.lang.String str) {
        this.iR = str;
        return (T) vb();
    }

    public int VB() {
        return this.Kg;
    }

    public T IL(int i) {
        this.Kg = i;
        return (T) vb();
    }

    public java.lang.String PX() {
        return this.WR;
    }

    public T ldr(java.lang.String str) {
        this.WR = str;
        return (T) vb();
    }

    public java.lang.String Ta() {
        return this.eo;
    }

    public T iR(java.lang.String str) {
        this.eo = str;
        return (T) vb();
    }

    public java.lang.String yDt() {
        return this.PX;
    }

    public T Kg(java.lang.String str) {
        this.PX = str;
        return (T) vb();
    }
}
