package com.bytedance.adsdk.ugeno.yoga.IL;

/* JADX INFO: loaded from: classes3.dex */
public class bg extends com.bytedance.adsdk.ugeno.IL.bg<com.bytedance.adsdk.ugeno.yoga.Kg> {
    private com.bytedance.adsdk.ugeno.yoga.IL FFy;
    private com.bytedance.adsdk.ugeno.yoga.ldr IL;
    private com.bytedance.adsdk.ugeno.yoga.xxp ZTq;
    private com.bytedance.adsdk.ugeno.yoga.iR gCm;
    private com.bytedance.adsdk.ugeno.yoga.PX gtr;
    private com.bytedance.adsdk.ugeno.yoga.IL rr;

    public bg(android.content.Context context) {
        super(context);
        this.IL = com.bytedance.adsdk.ugeno.yoga.ldr.ROW;
        this.ZTq = com.bytedance.adsdk.ugeno.yoga.xxp.NO_WRAP;
        this.gCm = com.bytedance.adsdk.ugeno.yoga.iR.FLEX_START;
        this.FFy = com.bytedance.adsdk.ugeno.yoga.IL.STRETCH;
        this.rr = com.bytedance.adsdk.ugeno.yoga.IL.STRETCH;
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    /* JADX INFO: renamed from: Pae, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.yoga.Kg eqN() {
        com.bytedance.adsdk.ugeno.yoga.Kg kg = new com.bytedance.adsdk.ugeno.yoga.Kg(this.bX);
        kg.bg(this);
        this.gtr = kg.getYogaNode();
        return kg;
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    protected void kMt() {
        if (this.uu) {
            com.bytedance.adsdk.ugeno.eqN.bg().IL().bg(this.eo, this.ZQc, new com.bytedance.adsdk.ugeno.bg.InterfaceC0086bg() { // from class: com.bytedance.adsdk.ugeno.yoga.IL.bg.1
                @Override // com.bytedance.adsdk.ugeno.bg.InterfaceC0086bg
                public void bg(android.graphics.Bitmap bitmap) {
                    final android.graphics.Bitmap bitmapBg;
                    if (bitmap == null || (bitmapBg = com.bytedance.adsdk.ugeno.iR.Kg.bg(com.bytedance.adsdk.ugeno.yoga.IL.bg.this.bX, bitmap, (int) com.bytedance.adsdk.ugeno.yoga.IL.bg.this.CQc)) == null) {
                        return;
                    }
                    com.bytedance.adsdk.ugeno.iR.Kg.bg(new java.lang.Runnable() { // from class: com.bytedance.adsdk.ugeno.yoga.IL.bg.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.adsdk.ugeno.yoga.IL.bg.this.bg(new android.graphics.drawable.BitmapDrawable(bitmapBg));
                        }
                    });
                }
            });
            return;
        }
        android.widget.ImageView imageView = new android.widget.ImageView(this.bX);
        com.bytedance.adsdk.ugeno.eqN.bg().IL().bg(this.eo, this.ZQc, imageView, this.ldr.getWidth(), this.ldr.getHeight());
        if (!this.qC || this.LKE == android.widget.ImageView.ScaleType.FIT_XY) {
            imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        } else {
            imageView.setScaleType(this.LKE);
        }
        com.bytedance.adsdk.ugeno.yoga.Kg.bg bgVar = new com.bytedance.adsdk.ugeno.yoga.Kg.bg(-1, -1);
        bgVar.ldr(com.bytedance.adsdk.ugeno.yoga.Lq.ABSOLUTE.bg());
        if (this.ldr instanceof com.bytedance.adsdk.ugeno.yoga.Kg) {
            ((com.bytedance.adsdk.ugeno.yoga.Kg) this.ldr).addView(imageView, 0, bgVar);
            bg(imageView);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    protected void bg(android.graphics.drawable.Drawable drawable) {
        android.widget.ImageView imageView = new android.widget.ImageView(this.bX);
        imageView.setImageDrawable(drawable);
        if (!this.qC || this.LKE == android.widget.ImageView.ScaleType.FIT_XY) {
            imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        } else {
            imageView.setScaleType(this.LKE);
        }
        com.bytedance.adsdk.ugeno.yoga.Kg.bg bgVar = new com.bytedance.adsdk.ugeno.yoga.Kg.bg(-1, -1);
        bgVar.ldr(com.bytedance.adsdk.ugeno.yoga.Lq.ABSOLUTE.bg());
        if (this.ldr instanceof com.bytedance.adsdk.ugeno.yoga.Kg) {
            ((com.bytedance.adsdk.ugeno.yoga.Kg) this.ldr).addView(imageView, 0, bgVar);
            bg(imageView);
        }
    }

    private void bg(final android.widget.ImageView imageView) {
        this.ldr.post(new java.lang.Runnable() { // from class: com.bytedance.adsdk.ugeno.yoga.IL.bg.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.adsdk.ugeno.yoga.PX pxBg;
                if (com.bytedance.adsdk.ugeno.yoga.IL.bg.this.ldr == null || (pxBg = ((com.bytedance.adsdk.ugeno.yoga.Kg) com.bytedance.adsdk.ugeno.yoga.IL.bg.this.ldr).bg(imageView)) == null) {
                    return;
                }
                pxBg.eqN(com.bytedance.adsdk.ugeno.yoga.IL.bg.this.ldr.getWidth());
                pxBg.ldr(com.bytedance.adsdk.ugeno.yoga.IL.bg.this.ldr.getHeight());
                com.bytedance.adsdk.ugeno.yoga.IL.bg.this.ldr.requestLayout();
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bg, com.bytedance.adsdk.ugeno.IL.bX
    public void IL() {
        super.IL();
        this.gtr.bg(this.IL);
        this.gtr.bg(this.ZTq);
        this.gtr.bg(this.gCm);
        this.gtr.bg(this.FFy);
        this.gtr.bX(this.rr);
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    protected void VB() {
        float f = this.aGH ? this.Ja : this.JAA;
        float f2 = this.VW ? this.Uw : this.JAA;
        float f3 = this.VJ ? this.DDQ : this.JAA;
        float f4 = this.daV ? this.Uq : this.JAA;
        this.gtr.IL(com.bytedance.adsdk.ugeno.yoga.zx.LEFT, f);
        this.gtr.IL(com.bytedance.adsdk.ugeno.yoga.zx.RIGHT, f2);
        this.gtr.IL(com.bytedance.adsdk.ugeno.yoga.zx.TOP, f3);
        this.gtr.IL(com.bytedance.adsdk.ugeno.yoga.zx.BOTTOM, f4);
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bg
    public void bg(com.bytedance.adsdk.ugeno.IL.bX bXVar) {
        super.bg(bXVar);
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bg
    public void bg(com.bytedance.adsdk.ugeno.IL.bX bXVar, android.view.ViewGroup.LayoutParams layoutParams) {
        if (bXVar == null) {
            return;
        }
        this.bg.add(bXVar);
        android.view.View viewWR = bXVar.WR();
        if (viewWR != null) {
            ((com.bytedance.adsdk.ugeno.yoga.Kg) this.ldr).addView(viewWR, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bg
    /* JADX INFO: renamed from: RJ, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.yoga.IL.bg.C0095bg bX() {
        return new com.bytedance.adsdk.ugeno.yoga.IL.bg.C0095bg();
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    public void bg(java.lang.String str, java.lang.String str2) {
        super.bg(str, str2);
        str.hashCode();
        switch (str) {
            case "alignItems":
                this.FFy = com.bytedance.adsdk.ugeno.yoga.IL.bg(str2);
                break;
            case "flexDirection":
                this.IL = com.bytedance.adsdk.ugeno.yoga.ldr.bg(str2);
                break;
            case "alignContent":
                this.rr = com.bytedance.adsdk.ugeno.yoga.IL.bg(str2);
                break;
            case "flexWrap":
                this.ZTq = com.bytedance.adsdk.ugeno.yoga.xxp.bg(str2);
                break;
            case "justifyContent":
                this.gCm = com.bytedance.adsdk.ugeno.yoga.iR.bg(str2);
                break;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.yoga.IL.bg$bg, reason: collision with other inner class name */
    public static class C0095bg extends com.bytedance.adsdk.ugeno.IL.bg.C0081bg {
        private boolean CQc;
        public int DDQ;
        private boolean LKE;
        public int Uq;
        public float VJ;
        public int VW;
        private boolean ZQc;
        public int aGH;
        private boolean ayS;
        private boolean daV;
        private boolean uu;
        public int tC = 1;
        public float rri = 0.0f;
        public float kMt = 1.0f;
        public int JAA = com.bytedance.adsdk.ugeno.yoga.IL.AUTO.bg();
        public float Ja = -1.0f;
        public int Uw = com.bytedance.adsdk.ugeno.yoga.Lq.RELATIVE.bg();

        @Override // com.bytedance.adsdk.ugeno.IL.bg.C0081bg
        public void bg(android.content.Context context, java.lang.String str, java.lang.String str2) {
            if (android.text.TextUtils.isEmpty(str)) {
            }
            super.bg(context, str, str2);
            str.hashCode();
            switch (str) {
                case "flexBasis":
                    this.daV = true;
                    this.Ja = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, -1.0f);
                    break;
                case "bottom":
                    this.ZQc = true;
                    this.Uq = (int) com.bytedance.adsdk.ugeno.iR.Kg.bg(context, com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0));
                    break;
                case "top":
                    this.ayS = true;
                    this.DDQ = (int) com.bytedance.adsdk.ugeno.iR.Kg.bg(context, com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0));
                    break;
                case "left":
                    this.LKE = true;
                    this.aGH = (int) com.bytedance.adsdk.ugeno.iR.Kg.bg(context, com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0));
                    break;
                case "order":
                    this.tC = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 1);
                    break;
                case "ratio":
                    this.uu = true;
                    this.VJ = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0.0f);
                    break;
                case "right":
                    this.CQc = true;
                    this.VW = (int) com.bytedance.adsdk.ugeno.iR.Kg.bg(context, com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0));
                    break;
                case "position":
                    this.Uw = com.bytedance.adsdk.ugeno.yoga.Lq.bg(str2).bg();
                    break;
                case "flexShrink":
                    this.kMt = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 1.0f);
                    break;
                case "flexGrow":
                    this.rri = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0.0f);
                    break;
                case "alignSelf":
                    this.JAA = com.bytedance.adsdk.ugeno.yoga.IL.bg(str2).bg();
                    break;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.IL.bg.C0081bg
        /* JADX INFO: renamed from: IL, reason: merged with bridge method [inline-methods] */
        public com.bytedance.adsdk.ugeno.yoga.Kg.bg bg() {
            com.bytedance.adsdk.ugeno.yoga.Kg.bg bgVar = new com.bytedance.adsdk.ugeno.yoga.Kg.bg((int) this.bg, (int) this.IL);
            bgVar.PX((int) (this.xxp ? this.eqN : this.bX));
            bgVar.yDt((int) (this.VzQ ? this.zx : this.bX));
            bgVar.VB((int) (this.tuV ? this.ldr : this.bX));
            bgVar.Ta((int) (this.Fy ? this.iR : this.bX));
            bgVar.bg(this.tC);
            bgVar.zx(this.JAA);
            bgVar.IL(this.rri);
            bgVar.bX(this.kMt);
            if (this.daV) {
                bgVar.eqN(this.Ja);
            }
            bgVar.ldr(this.Uw);
            if (this.ayS) {
                bgVar.iR(this.DDQ);
            }
            if (this.ZQc) {
                bgVar.WR(this.Uq);
            }
            if (this.LKE) {
                bgVar.Kg(this.aGH);
            }
            if (this.CQc) {
                bgVar.eo(this.VW);
            }
            if (this.uu && bX()) {
                float f = this.VJ;
                if (f > 0.0f) {
                    bgVar.Lq(f);
                }
            }
            return bgVar;
        }

        public boolean bX() {
            if (this.bg == -1.0f && this.IL == -1.0f) {
                return false;
            }
            return this.bg == -2.0f || this.IL == -2.0f;
        }

        @Override // com.bytedance.adsdk.ugeno.IL.bg.C0081bg
        public java.lang.String toString() {
            return "LayoutParams{mOrder=" + this.tC + ", mFlexGrow=" + this.rri + ", mFlexShrink=" + this.kMt + ", mAlignSelf=" + this.JAA + ", mFlexBasis=" + this.Ja + ", mPosition=" + this.Uw + ", mTop=" + this.DDQ + ", mBottom=" + this.Uq + ", mLeft=" + this.aGH + ", mRight=" + this.VW + '}';
        }
    }
}
