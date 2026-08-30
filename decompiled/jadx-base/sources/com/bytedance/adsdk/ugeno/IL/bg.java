package com.bytedance.adsdk.ugeno.IL;

/* JADX INFO: loaded from: classes3.dex */
public class bg<E extends android.view.ViewGroup> extends com.bytedance.adsdk.ugeno.IL.bX {
    protected java.util.List<com.bytedance.adsdk.ugeno.IL.bX<android.view.View>> bg;

    public bg(android.content.Context context) {
        this(context, null);
    }

    public bg(android.content.Context context, com.bytedance.adsdk.ugeno.IL.bg bgVar) {
        super(context, bgVar);
        this.bg = new java.util.ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    public void IL() {
        super.IL();
    }

    public void bg(com.bytedance.adsdk.ugeno.IL.bX bXVar) {
        if (bXVar == null) {
            return;
        }
        this.bg.add(bXVar);
        android.view.View viewWR = bXVar.WR();
        if (viewWR != null) {
            ((android.view.ViewGroup) this.ldr).addView(viewWR);
        }
    }

    public void bg(com.bytedance.adsdk.ugeno.IL.bX bXVar, android.view.ViewGroup.LayoutParams layoutParams) {
        if (bXVar == null) {
            return;
        }
        this.bg.add(bXVar);
        android.view.View viewWR = bXVar.WR();
        if (viewWR != null) {
            ((android.view.ViewGroup) this.ldr).addView(viewWR, layoutParams);
        }
    }

    public java.util.List<com.bytedance.adsdk.ugeno.IL.bX<android.view.View>> bg() {
        return this.bg;
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    public com.bytedance.adsdk.ugeno.IL.bX bg(java.lang.String str) {
        com.bytedance.adsdk.ugeno.IL.bX<T> bXVarBX;
        if (!android.text.TextUtils.isEmpty(str) && android.text.TextUtils.equals(str, this.PX)) {
            return this;
        }
        for (com.bytedance.adsdk.ugeno.IL.bX<android.view.View> bXVar : this.bg) {
            if (bXVar != null && (bXVarBX = bXVar.bX(str)) != 0) {
                return bXVarBX;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    public com.bytedance.adsdk.ugeno.IL.bX IL(java.lang.String str) {
        com.bytedance.adsdk.ugeno.IL.bX<T> bXVarEqN;
        if (!android.text.TextUtils.isEmpty(str) && android.text.TextUtils.equals(str, this.Ta)) {
            return this;
        }
        for (com.bytedance.adsdk.ugeno.IL.bX<android.view.View> bXVar : this.bg) {
            if (bXVar != null && (bXVarEqN = bXVar.eqN(str)) != 0) {
                return bXVarEqN;
            }
        }
        return null;
    }

    public com.bytedance.adsdk.ugeno.IL.bg.C0081bg bX() {
        return new com.bytedance.adsdk.ugeno.IL.bg.C0081bg();
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.IL.bg$bg, reason: collision with other inner class name */
    public static class C0081bg {
        protected boolean Fy;
        protected float Kg;
        protected android.view.ViewGroup.LayoutParams LZ;
        protected boolean Lq;
        protected float PX;
        protected boolean Ta;
        protected float VB;
        protected boolean VzQ;
        protected float WR;
        protected float bX;
        protected float eo;
        protected float eqN;
        protected float iR;
        protected float ldr;
        protected boolean tuV;
        protected boolean vb;
        protected boolean xxp;
        protected boolean yDt;
        protected float zx;
        protected float bg = -2.0f;
        protected float IL = -2.0f;

        public void bg(android.content.Context context, java.lang.String str, java.lang.String str2) {
            if (android.text.TextUtils.isEmpty(str)) {
            }
            str.hashCode();
            switch (str) {
                case "paddingLeft":
                    this.WR = com.bytedance.adsdk.ugeno.iR.Kg.bg(context, str2);
                    this.Ta = true;
                    break;
                case "height":
                    if (android.text.TextUtils.equals(str2, "match_parent")) {
                        this.IL = -1.0f;
                        break;
                    } else {
                        if (android.text.TextUtils.equals(str2, "wrap_content")) {
                            this.IL = -2.0f;
                        } else {
                            this.IL = com.bytedance.adsdk.ugeno.iR.Kg.bg(context, str2);
                        }
                        break;
                    }
                    break;
                case "margin":
                    this.bX = com.bytedance.adsdk.ugeno.iR.Kg.bg(context, str2);
                    break;
                case "marginTop":
                    this.ldr = com.bytedance.adsdk.ugeno.iR.Kg.bg(context, str2);
                    this.tuV = true;
                    break;
                case "padding":
                    this.Kg = com.bytedance.adsdk.ugeno.iR.Kg.bg(context, str2);
                    break;
                case "marginBottom":
                    this.iR = com.bytedance.adsdk.ugeno.iR.Kg.bg(context, str2);
                    this.Fy = true;
                    break;
                case "paddingTop":
                    this.eo = com.bytedance.adsdk.ugeno.iR.Kg.bg(context, str2);
                    this.Lq = true;
                    break;
                case "width":
                    if (android.text.TextUtils.equals(str2, "match_parent")) {
                        this.bg = -1.0f;
                        break;
                    } else {
                        if (android.text.TextUtils.equals(str2, "wrap_content")) {
                            this.bg = -2.0f;
                        } else {
                            this.bg = com.bytedance.adsdk.ugeno.iR.Kg.bg(context, str2);
                        }
                        break;
                    }
                    break;
                case "paddingBottom":
                    this.PX = com.bytedance.adsdk.ugeno.iR.Kg.bg(context, str2);
                    this.vb = true;
                    break;
                case "paddingRight":
                    this.VB = com.bytedance.adsdk.ugeno.iR.Kg.bg(context, str2);
                    this.yDt = true;
                    break;
                case "marginRight":
                    this.zx = com.bytedance.adsdk.ugeno.iR.Kg.bg(context, str2);
                    this.VzQ = true;
                    break;
                case "marginLeft":
                    this.eqN = com.bytedance.adsdk.ugeno.iR.Kg.bg(context, str2);
                    this.xxp = true;
                    break;
            }
        }

        public java.lang.String toString() {
            return "LayoutParams{mWidth=" + this.bg + ", mHeight=" + this.IL + ", mMargin=" + this.bX + ", mMarginLeft=" + this.eqN + ", mMarginRight=" + this.zx + ", mMarginTop=" + this.ldr + ", mMarginBottom=" + this.iR + ", mParams=" + this.LZ + '}';
        }

        public android.view.ViewGroup.LayoutParams bg() {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams((int) this.bg, (int) this.IL);
            marginLayoutParams.leftMargin = (int) (this.xxp ? this.eqN : this.bX);
            marginLayoutParams.rightMargin = (int) (this.VzQ ? this.zx : this.bX);
            marginLayoutParams.topMargin = (int) (this.tuV ? this.ldr : this.bX);
            marginLayoutParams.bottomMargin = (int) (this.Fy ? this.iR : this.bX);
            return marginLayoutParams;
        }
    }
}
