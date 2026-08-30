package com.bytedance.sdk.component.adexpress.dynamic.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class Kg {
    private float IL;
    private float Kg;
    private java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg>> PX;
    private java.lang.String Ta;
    private com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg VB;
    private com.bytedance.sdk.component.adexpress.dynamic.eqN.zx WR;
    private float bX;
    private java.lang.String bg;
    private java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> eo;
    private float eqN;
    private float iR;
    private float ldr;
    private boolean yDt;
    private float zx;
    private java.util.Map<java.lang.String, java.lang.String> Lq = new java.util.HashMap();
    private java.util.Map<java.lang.Integer, java.lang.String> vb = new java.util.HashMap();

    public java.lang.String bg() {
        return this.Ta;
    }

    public void bg(java.lang.String str) {
        this.Ta = str;
    }

    public java.util.Map<java.lang.Integer, java.lang.String> IL() {
        return this.vb;
    }

    public void bg(org.json.JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    return;
                }
                for (int i = 0; i < jSONArray.length(); i++) {
                    org.json.JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    this.vb.put(java.lang.Integer.valueOf(jSONObjectOptJSONObject.optInt("id")), jSONObjectOptJSONObject.optString("value"));
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public java.lang.String bX() {
        return this.bg;
    }

    public void IL(java.lang.String str) {
        this.bg = str;
    }

    public float eqN() {
        return this.eqN;
    }

    public void bg(float f) {
        this.eqN = f;
    }

    public float zx() {
        return this.zx;
    }

    public void IL(float f) {
        this.zx = f;
    }

    public float ldr() {
        return this.IL;
    }

    public void bX(float f) {
        this.IL = f;
    }

    public float iR() {
        return this.bX;
    }

    public void eqN(float f) {
        this.bX = f;
    }

    public float Kg() {
        return this.ldr;
    }

    public void zx(float f) {
        this.ldr = f;
    }

    public float WR() {
        return this.iR;
    }

    public void ldr(float f) {
        this.iR = f;
    }

    public void iR(float f) {
        this.Kg = f;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.eqN.zx eo() {
        return this.WR;
    }

    public void bg(com.bytedance.sdk.component.adexpress.dynamic.eqN.zx zxVar) {
        this.WR = zxVar;
    }

    public java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> VB() {
        return this.eo;
    }

    public void bg(java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> list) {
        this.eo = list;
    }

    public void bg(com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg kg) {
        this.VB = kg;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg PX() {
        return this.VB;
    }

    public int Ta() {
        com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVarZx = this.WR.zx();
        return ldrVarZx.txA() + ldrVarZx.sVc();
    }

    public int yDt() {
        com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVarZx = this.WR.zx();
        return ldrVarZx.Pae() + ldrVarZx.RJ();
    }

    public float Lq() {
        com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVarZx = this.WR.zx();
        return Ta() + ldrVarZx.Lq() + ldrVarZx.vb() + (ldrVarZx.PX() * 2.0f);
    }

    public float vb() {
        com.bytedance.sdk.component.adexpress.dynamic.eqN.ldr ldrVarZx = this.WR.zx();
        return yDt() + ldrVarZx.xxp() + ldrVarZx.yDt() + (ldrVarZx.PX() * 2.0f);
    }

    public void IL(java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg>> list) {
        this.PX = list;
    }

    public java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg>> xxp() {
        return this.PX;
    }

    public boolean VzQ() {
        java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> list = this.eo;
        return list == null || list.size() <= 0;
    }

    public boolean tuV() {
        return this.yDt;
    }

    public void bg(boolean z) {
        this.yDt = z;
    }

    public java.util.Map<java.lang.String, java.lang.String> Fy() {
        return this.Lq;
    }

    public void bg(java.lang.String str, java.lang.String str2) {
        this.Lq.put(str, str2);
    }

    public void LZ() {
        java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg>> list = this.PX;
        if (list == null || list.size() <= 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.List<com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg> list2 : this.PX) {
            if (list2 != null && list2.size() > 0) {
                arrayList.add(list2);
            }
        }
        this.PX = arrayList;
    }

    public boolean tC() {
        return android.text.TextUtils.equals(this.WR.zx().DDQ(), "flex");
    }

    public java.lang.String rri() {
        return this.WR.zx().rri();
    }

    public void bX(java.lang.String str) {
        this.WR.zx().ldr(str);
    }

    public java.lang.String toString() {
        return "DynamicLayoutUnit{id='" + this.bg + "', x=" + this.IL + ", y=" + this.bX + ", width=" + this.ldr + ", height=" + this.iR + ", remainWidth=" + this.Kg + ", rootBrick=" + this.WR + ", childrenBrickUnits=" + this.eo + '}';
    }

    public boolean kMt() {
        return this.WR.zx().RFq() < 0 || this.WR.zx().jA() < 0 || this.WR.zx().qp() < 0 || this.WR.zx().eDa() < 0;
    }

    public java.lang.String bg(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.WR.IL());
        sb.append(":");
        sb.append(this.bg);
        if (this.WR.zx() != null) {
            sb.append(":");
            sb.append(this.WR.zx().ovC());
        }
        sb.append(":");
        sb.append(i);
        return sb.toString();
    }
}
