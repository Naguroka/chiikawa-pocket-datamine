package com.bytedance.adsdk.ugeno.eqN.bX;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bg {
    protected com.bytedance.adsdk.ugeno.IL.bX IL;
    protected android.content.Context Kg;
    protected com.bytedance.adsdk.ugeno.eqN.IL bX;
    protected com.bytedance.adsdk.ugeno.eqN.iR bg;
    protected com.bytedance.adsdk.ugeno.eqN.IL.bg eqN;
    protected java.lang.String iR;
    protected java.lang.String ldr;
    protected java.util.Map<java.lang.String, java.lang.String> zx;

    public abstract boolean bg(java.lang.Object... objArr);

    public bg(android.content.Context context) {
        this.Kg = context;
    }

    public void bg() {
        this.eqN = this.bX.bg();
        com.bytedance.adsdk.ugeno.eqN.IL il = this.bX;
        if (il == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.eqN.IL.bg bgVarBg = il.bg();
        this.eqN = bgVarBg;
        if (bgVarBg == null) {
            return;
        }
        this.zx = bgVarBg.bX();
        this.ldr = this.eqN.IL();
        this.iR = this.eqN.bg();
    }

    public java.lang.String IL() {
        return this.ldr;
    }

    public void bg(com.bytedance.adsdk.ugeno.IL.bX bXVar) {
        this.IL = bXVar;
    }

    public void bg(com.bytedance.adsdk.ugeno.eqN.IL il) {
        this.bX = il;
    }

    public void bg(com.bytedance.adsdk.ugeno.eqN.iR iRVar) {
        this.bg = iRVar;
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.eqN.bX.bg$bg, reason: collision with other inner class name */
    public static class C0091bg {
        public static com.bytedance.adsdk.ugeno.eqN.bX.bg bg(android.content.Context context, com.bytedance.adsdk.ugeno.IL.bX bXVar, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
            com.bytedance.adsdk.ugeno.eqN.IL ilBg;
            com.bytedance.adsdk.ugeno.eqN.IL.bg bgVarBg;
            if (bXVar == null || jSONObject == null || (ilBg = com.bytedance.adsdk.ugeno.eqN.IL.bg(jSONObject, jSONObject2)) == null || (bgVarBg = ilBg.bg()) == null) {
                return null;
            }
            if (android.text.TextUtils.equals(bgVarBg.bg(), "custom")) {
                com.bytedance.adsdk.ugeno.eqN.bX.IL il = new com.bytedance.adsdk.ugeno.eqN.bX.IL(context);
                il.bg(bXVar);
                il.bg(ilBg);
                il.bg();
                return il;
            }
            com.bytedance.adsdk.ugeno.eqN.bX bXVarBg = com.bytedance.adsdk.ugeno.eqN.ldr.bg(bgVarBg.IL());
            if (bXVarBg == null) {
                return null;
            }
            com.bytedance.adsdk.ugeno.eqN.bX.bg bgVarBg2 = bXVarBg.bg(context);
            bgVarBg2.bg(bXVar);
            bgVarBg2.bg(ilBg);
            bgVarBg2.bg();
            return bgVarBg2;
        }
    }
}
