package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: loaded from: classes4.dex */
public class zx {
    private int IL;
    private java.util.List<java.lang.Integer> bX;
    private int bg;
    private int eqN;
    private int iR;
    private int ldr;
    private java.util.List<java.lang.String> zx;

    public boolean bg() {
        return this.ldr == 1;
    }

    public void bg(int i) {
        this.ldr = i;
    }

    public int IL() {
        int i = this.iR;
        if (i >= 2) {
            return i;
        }
        return 0;
    }

    public void IL(int i) {
        this.iR = i;
    }

    public java.util.List<java.lang.String> bX() {
        return this.zx;
    }

    public void bg(java.util.List<java.lang.String> list) {
        this.zx = list;
    }

    public int eqN() {
        return this.bg;
    }

    public void bX(int i) {
        this.bg = i;
    }

    public int zx() {
        return this.IL;
    }

    public void eqN(int i) {
        this.IL = i;
    }

    public java.util.List<java.lang.Integer> ldr() {
        return this.bX;
    }

    public void IL(java.util.List<java.lang.Integer> list) {
        this.bX = list;
    }

    public int iR() {
        return this.eqN;
    }

    public void zx(int i) {
        this.eqN = i;
    }

    public org.json.JSONObject Kg() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("interceptor_x", this.bg);
            jSONObject.put("interceptor_y", this.IL);
            if (this.bX != null) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.Iterator<java.lang.Integer> it = this.bX.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().intValue());
                }
                jSONObject.put("interceptor_page", jSONArray);
            }
            jSONObject.put("interceptor_interval_time", this.eqN);
            if (this.zx != null) {
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                java.util.Iterator<java.lang.String> it2 = this.zx.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next());
                }
                jSONObject.put("url_regular", jSONArray2);
            }
            jSONObject.put("is_act", this.ldr);
            jSONObject.put("boc_index", this.iR);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.IL(th.getMessage());
        }
        return jSONObject;
    }
}
