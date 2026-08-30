package com.bytedance.sdk.openadsdk.core.PX;

/* JADX INFO: loaded from: classes4.dex */
public class bg {
    com.bytedance.sdk.openadsdk.core.PX.IL IL;
    private double Kg;
    private java.lang.String Lq;
    private java.lang.String VB;
    private int WR;
    com.bytedance.sdk.openadsdk.core.PX.bX bX;
    private int eo;
    private java.lang.String eqN;
    private java.lang.String iR;
    private java.lang.String ldr;
    private java.lang.String zx;
    com.bytedance.sdk.openadsdk.core.PX.eqN bg = new com.bytedance.sdk.openadsdk.core.PX.eqN(this);
    private final java.util.Set<com.bytedance.sdk.openadsdk.core.PX.eo> PX = new java.util.HashSet();
    private java.lang.String Ta = "VAST_ACTION_BUTTON";
    private boolean yDt = false;

    public com.bytedance.sdk.openadsdk.core.PX.eqN bg() {
        return this.bg;
    }

    public com.bytedance.sdk.openadsdk.core.PX.IL IL() {
        return this.IL;
    }

    public com.bytedance.sdk.openadsdk.core.PX.bX bX() {
        return this.bX;
    }

    public java.lang.String eqN() {
        return this.eqN;
    }

    public java.lang.String zx() {
        return this.zx;
    }

    public java.lang.String ldr() {
        return this.ldr;
    }

    public java.lang.String iR() {
        return this.iR;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.PX.IL il) {
        if (il != null) {
            il.bg(this.iR);
        }
        this.IL = il;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.PX.bX bXVar) {
        if (bXVar != null) {
            bXVar.bg(this.iR);
        }
        this.bX = bXVar;
    }

    public void bg(java.lang.String str) {
        this.eqN = str;
    }

    public void IL(java.lang.String str) {
        this.zx = str;
    }

    public void bX(java.lang.String str) {
        this.ldr = str;
    }

    public void eqN(java.lang.String str) {
        this.iR = str;
    }

    public double Kg() {
        return this.Kg;
    }

    public void bg(double d) {
        this.Kg = d;
    }

    public java.lang.String WR() {
        com.bytedance.sdk.openadsdk.core.PX.bX bXVar;
        java.lang.String str = this.ldr;
        if (!android.text.TextUtils.isEmpty(this.Lq)) {
            java.lang.String str2 = this.Lq;
            this.Lq = null;
            return str2;
        }
        java.lang.String str3 = this.Ta;
        str3.hashCode();
        if (str3.equals("VAST_ICON")) {
            com.bytedance.sdk.openadsdk.core.PX.IL il = this.IL;
            if (il != null && !android.text.TextUtils.isEmpty(il.Kg)) {
                str = this.IL.Kg;
            }
        } else if (str3.equals("VAST_END_CARD") && (bXVar = this.bX) != null && !android.text.TextUtils.isEmpty(bXVar.Kg)) {
            str = this.bX.Kg;
        }
        this.Ta = "VAST_ACTION_BUTTON";
        return str;
    }

    public void zx(java.lang.String str) {
        this.Ta = str;
    }

    public org.json.JSONObject eo() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("videoTrackers", this.bg.bg());
        com.bytedance.sdk.openadsdk.core.PX.IL il = this.IL;
        if (il != null) {
            jSONObject.put("vastIcon", il.bg());
        }
        com.bytedance.sdk.openadsdk.core.PX.bX bXVar = this.bX;
        if (bXVar != null) {
            jSONObject.put("endCard", bXVar.bg());
        }
        jSONObject.put(com.ironsource.y8.h.D0, this.eqN);
        jSONObject.put("description", this.zx);
        jSONObject.put("clickThroughUrl", this.ldr);
        jSONObject.put("videoUrl", this.iR);
        jSONObject.put("videDuration", this.Kg);
        jSONObject.put("tag", this.VB);
        jSONObject.put("videoWidth", this.WR);
        jSONObject.put("videoHeight", this.eo);
        jSONObject.put("viewabilityVendor", vb());
        return jSONObject;
    }

    private org.json.JSONArray vb() {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (com.bytedance.sdk.openadsdk.core.PX.eo eoVar : this.PX) {
            if (eoVar != null) {
                jSONArray.put(eoVar.eqN());
            }
        }
        return jSONArray;
    }

    public static com.bytedance.sdk.openadsdk.core.PX.bg bg(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.PX.bg bgVar = new com.bytedance.sdk.openadsdk.core.PX.bg();
        bgVar.bg.bg(jSONObject.optJSONObject("videoTrackers"));
        bgVar.IL = com.bytedance.sdk.openadsdk.core.PX.IL.bg(jSONObject.optJSONObject("vastIcon"));
        bgVar.bX = com.bytedance.sdk.openadsdk.core.PX.bX.IL(jSONObject.optJSONObject("endCard"));
        bgVar.eqN = jSONObject.optString(com.ironsource.y8.h.D0);
        bgVar.zx = jSONObject.optString("description");
        bgVar.ldr = jSONObject.optString("clickThroughUrl");
        bgVar.iR = jSONObject.optString("videoUrl");
        bgVar.Kg = jSONObject.optDouble("videDuration");
        bgVar.VB = jSONObject.optString("tag");
        bgVar.WR = jSONObject.optInt("videoWidth");
        bgVar.WR = jSONObject.optInt("videoHeight");
        bgVar.PX.addAll(com.bytedance.sdk.openadsdk.core.PX.eo.bg(jSONObject.optJSONArray("viewabilityVendor")));
        return bgVar;
    }

    public void bg(com.bytedance.sdk.openadsdk.core.model.tuV tuv) {
        this.bg.bg(tuv);
        com.bytedance.sdk.openadsdk.core.PX.IL il = this.IL;
        if (il != null) {
            il.bg(tuv);
        }
        com.bytedance.sdk.openadsdk.core.PX.bX bXVar = this.bX;
        if (bXVar != null) {
            bXVar.bg(tuv);
        }
    }

    public java.lang.String VB() {
        return this.VB;
    }

    public void ldr(java.lang.String str) {
        this.VB = str;
        this.bg.bg(str);
    }

    public void bg(int i) {
        this.WR = i;
    }

    public void IL(int i) {
        this.eo = i;
    }

    public int PX() {
        return this.WR;
    }

    public int Ta() {
        return this.eo;
    }

    public void bg(java.util.Set<com.bytedance.sdk.openadsdk.core.PX.eo> set) {
        if (set == null || set.size() <= 0) {
            return;
        }
        this.PX.addAll(set);
    }

    public java.util.Set<com.bytedance.sdk.openadsdk.core.PX.eo> yDt() {
        return this.PX;
    }

    public void iR(java.lang.String str) {
        this.Lq = str;
    }

    public void Lq() {
        this.yDt = true;
    }
}
