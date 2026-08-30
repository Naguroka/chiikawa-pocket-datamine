package com.bytedance.sdk.component.zx.bX;

/* JADX INFO: loaded from: classes3.dex */
public class ldr {
    private final com.bytedance.sdk.component.zx.Ta IL;
    private java.util.concurrent.ExecutorService Kg;
    private com.bytedance.sdk.component.zx.VzQ WR;
    private com.bytedance.sdk.component.zx.PX iR;
    private com.bytedance.sdk.component.zx.eqN ldr;
    private java.util.Map<java.lang.String, java.util.List<com.bytedance.sdk.component.zx.bX.bX>> bg = new java.util.concurrent.ConcurrentHashMap();
    private java.util.Map<java.lang.String, com.bytedance.sdk.component.zx.tuV> bX = new java.util.HashMap();
    private java.util.Map<java.lang.String, com.bytedance.sdk.component.zx.Fy> eqN = new java.util.HashMap();
    private java.util.Map<java.lang.String, com.bytedance.sdk.component.zx.bX> zx = new java.util.HashMap();

    public ldr(android.content.Context context, com.bytedance.sdk.component.zx.Ta ta) {
        this.IL = (com.bytedance.sdk.component.zx.Ta) com.bytedance.sdk.component.zx.bX.Kg.bg(ta);
        com.bytedance.sdk.component.zx.bX.bg.bg.bg(context, ta.WR());
    }

    public java.util.Collection<com.bytedance.sdk.component.zx.tuV> bg() {
        return this.bX.values();
    }

    public java.util.Collection<com.bytedance.sdk.component.zx.Fy> IL() {
        return this.eqN.values();
    }

    public java.util.Collection<com.bytedance.sdk.component.zx.bX> bX() {
        return this.zx.values();
    }

    public com.bytedance.sdk.component.zx.tuV bg(com.bytedance.sdk.component.zx.IL il) {
        if (il == null) {
            il = com.bytedance.sdk.component.zx.bX.bg.bg.iR();
        }
        java.lang.String string = il.zx().toString();
        com.bytedance.sdk.component.zx.tuV tuv = this.bX.get(string);
        if (tuv != null) {
            return tuv;
        }
        com.bytedance.sdk.component.zx.tuV tuvEqN = eqN(il);
        this.bX.put(string, tuvEqN);
        return tuvEqN;
    }

    private com.bytedance.sdk.component.zx.tuV eqN(com.bytedance.sdk.component.zx.IL il) {
        com.bytedance.sdk.component.zx.tuV tuvZx = this.IL.zx();
        if (tuvZx != null) {
            return com.bytedance.sdk.component.zx.bX.bg.IL.bg.bg(tuvZx);
        }
        return com.bytedance.sdk.component.zx.bX.bg.IL.bg.bg(il.IL());
    }

    public com.bytedance.sdk.component.zx.Fy IL(com.bytedance.sdk.component.zx.IL il) {
        if (il == null) {
            il = com.bytedance.sdk.component.zx.bX.bg.bg.iR();
        }
        java.lang.String string = il.zx().toString();
        com.bytedance.sdk.component.zx.Fy fy = this.eqN.get(string);
        if (fy != null) {
            return fy;
        }
        com.bytedance.sdk.component.zx.Fy fyZx = zx(il);
        this.eqN.put(string, fyZx);
        return fyZx;
    }

    private com.bytedance.sdk.component.zx.Fy zx(com.bytedance.sdk.component.zx.IL il) {
        com.bytedance.sdk.component.zx.Fy fyLdr = this.IL.ldr();
        return fyLdr != null ? fyLdr : com.bytedance.sdk.component.zx.bX.bg.IL.zx.bg(il.IL());
    }

    public com.bytedance.sdk.component.zx.bX bX(com.bytedance.sdk.component.zx.IL il) {
        if (il == null) {
            il = com.bytedance.sdk.component.zx.bX.bg.bg.iR();
        }
        java.lang.String string = il.zx().toString();
        com.bytedance.sdk.component.zx.bX bXVar = this.zx.get(string);
        if (bXVar != null) {
            return bXVar;
        }
        com.bytedance.sdk.component.zx.bX bXVarLdr = ldr(il);
        this.zx.put(string, bXVarLdr);
        return bXVarLdr;
    }

    public com.bytedance.sdk.component.zx.bX bg(java.lang.String str) {
        return bX(com.bytedance.sdk.component.zx.bX.bg.bg.bg(new java.io.File(str)));
    }

    private com.bytedance.sdk.component.zx.bX ldr(com.bytedance.sdk.component.zx.IL il) {
        com.bytedance.sdk.component.zx.bX bXVarIR = this.IL.iR();
        return bXVarIR != null ? bXVarIR : new com.bytedance.sdk.component.zx.bX.bg.bg.IL(il.zx(), il.bg(), ldr());
    }

    public com.bytedance.sdk.component.zx.eqN eqN() {
        if (this.ldr == null) {
            this.ldr = WR();
        }
        return this.ldr;
    }

    private com.bytedance.sdk.component.zx.eqN WR() {
        com.bytedance.sdk.component.zx.eqN eqN = this.IL.eqN();
        return eqN == null ? com.bytedance.sdk.component.zx.IL.IL.bg() : eqN;
    }

    public com.bytedance.sdk.component.zx.PX zx() {
        if (this.iR == null) {
            this.iR = eo();
        }
        return this.iR;
    }

    private com.bytedance.sdk.component.zx.PX eo() {
        com.bytedance.sdk.component.zx.PX pxBg = this.IL.bg();
        return pxBg != null ? pxBg : com.bytedance.sdk.component.zx.bg.IL.bg();
    }

    public java.util.concurrent.ExecutorService ldr() {
        java.util.concurrent.ExecutorService executorServiceBg;
        com.bytedance.sdk.component.zx.tC tCVarBX = this.IL.bX();
        if (tCVarBX != null && (executorServiceBg = tCVarBX.bg()) != null) {
            return executorServiceBg;
        }
        if (this.Kg == null) {
            this.Kg = VB();
        }
        return this.Kg;
    }

    private java.util.concurrent.ExecutorService VB() {
        java.util.concurrent.ExecutorService executorServiceIL = this.IL.IL();
        return executorServiceIL != null ? executorServiceIL : com.bytedance.sdk.component.zx.bg.bX.bg();
    }

    public java.util.Map<java.lang.String, java.util.List<com.bytedance.sdk.component.zx.bX.bX>> iR() {
        return this.bg;
    }

    public com.bytedance.sdk.component.zx.bX.IL.bg bg(com.bytedance.sdk.component.zx.bX.bX bXVar) {
        android.widget.ImageView.ScaleType scaleTypeEqN = bXVar.eqN();
        if (scaleTypeEqN == null) {
            scaleTypeEqN = com.bytedance.sdk.component.zx.bX.IL.bg.bg;
        }
        android.widget.ImageView.ScaleType scaleType = scaleTypeEqN;
        android.graphics.Bitmap.Config configVB = bXVar.VB();
        if (configVB == null) {
            configVB = com.bytedance.sdk.component.zx.bX.IL.bg.IL;
        }
        return new com.bytedance.sdk.component.zx.bX.IL.bg(bXVar.IL(), bXVar.bX(), scaleType, configVB, bXVar.iR(), bXVar.Kg());
    }

    public com.bytedance.sdk.component.zx.VzQ Kg() {
        if (this.WR == null) {
            this.WR = PX();
        }
        return this.WR;
    }

    private com.bytedance.sdk.component.zx.VzQ PX() {
        com.bytedance.sdk.component.zx.VzQ vzQKg = this.IL.Kg();
        return vzQKg == null ? new com.bytedance.sdk.component.zx.bX.iR() : vzQKg;
    }
}
