package com.bytedance.adsdk.ugeno.zx;

/* JADX INFO: loaded from: classes3.dex */
public class ldr extends com.bytedance.adsdk.ugeno.IL.bg<com.bytedance.adsdk.ugeno.zx.zx> {
    private int FFy;
    private int IL;
    private int ZTq;
    private int gCm;
    private int rr;

    public ldr(android.content.Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    /* JADX INFO: renamed from: Pae, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.zx.zx eqN() {
        com.bytedance.adsdk.ugeno.zx.zx zxVar = new com.bytedance.adsdk.ugeno.zx.zx(this.bX);
        zxVar.bg(this);
        return zxVar;
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bg, com.bytedance.adsdk.ugeno.IL.bX
    public void IL() {
        super.IL();
        ((com.bytedance.adsdk.ugeno.zx.zx) this.ldr).setFlexDirection(this.IL);
        ((com.bytedance.adsdk.ugeno.zx.zx) this.ldr).setFlexWrap(this.ZTq);
        ((com.bytedance.adsdk.ugeno.zx.zx) this.ldr).setJustifyContent(this.gCm);
        ((com.bytedance.adsdk.ugeno.zx.zx) this.ldr).setAlignItems(this.FFy);
        ((com.bytedance.adsdk.ugeno.zx.zx) this.ldr).setAlignContent(this.rr);
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bg
    public com.bytedance.adsdk.ugeno.IL.bg.C0081bg bX() {
        return new com.bytedance.adsdk.ugeno.zx.ldr.bg();
    }

    public static class bg extends com.bytedance.adsdk.ugeno.IL.bg.C0081bg {
        public int tC = 1;
        public float rri = 0.0f;
        public float kMt = 0.0f;
        public int JAA = -1;
        public float Ja = -1.0f;
        public int Uw = -1;
        public int DDQ = -1;
        public int Uq = androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
        public int aGH = androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;

        @Override // com.bytedance.adsdk.ugeno.IL.bg.C0081bg
        public void bg(android.content.Context context, java.lang.String str, java.lang.String str2) {
            if (android.text.TextUtils.isEmpty(str)) {
            }
            super.bg(context, str, str2);
            str.hashCode();
            switch (str) {
                case "flexBasisPercent":
                    this.Ja = eqN(str2);
                    break;
                case "order":
                    this.tC = bg(str2);
                    break;
                case "flexShrink":
                    this.kMt = bX(str2);
                    break;
                case "flexGrow":
                    this.rri = IL(str2);
                    break;
                case "alignSelf":
                    this.JAA = zx(str2);
                    break;
            }
        }

        private int bg(java.lang.String str) {
            try {
                return java.lang.Integer.parseInt(str);
            } catch (java.lang.NumberFormatException unused) {
                return 1;
            }
        }

        private float IL(java.lang.String str) {
            try {
                return java.lang.Float.parseFloat(str);
            } catch (java.lang.Exception unused) {
                return 0.0f;
            }
        }

        private float bX(java.lang.String str) {
            try {
                return java.lang.Float.parseFloat(str);
            } catch (java.lang.Exception unused) {
                return 0.0f;
            }
        }

        private float eqN(java.lang.String str) {
            try {
                return java.lang.Float.parseFloat(str);
            } catch (java.lang.Exception unused) {
                return -1.0f;
            }
        }

        private int zx(java.lang.String str) {
            str.hashCode();
            switch (str) {
                case "stretch":
                    return 4;
                case "baseline":
                    return 3;
                case "center":
                    return 2;
                case "flex_start":
                    return 0;
                case "flex_end":
                    return 1;
                default:
                    return -1;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.IL.bg.C0081bg
        /* JADX INFO: renamed from: IL, reason: merged with bridge method [inline-methods] */
        public com.bytedance.adsdk.ugeno.zx.zx.bg bg() {
            com.bytedance.adsdk.ugeno.zx.zx.bg bgVar = new com.bytedance.adsdk.ugeno.zx.zx.bg((int) this.bg, (int) this.IL);
            bgVar.leftMargin = (int) this.eqN;
            bgVar.rightMargin = (int) this.zx;
            bgVar.topMargin = (int) this.ldr;
            bgVar.bottomMargin = (int) this.iR;
            bgVar.bX(this.tC);
            bgVar.eqN(this.JAA);
            bgVar.bg(this.rri);
            bgVar.IL(this.kMt);
            bgVar.bX(this.Ja);
            return bgVar;
        }

        @Override // com.bytedance.adsdk.ugeno.IL.bg.C0081bg
        public java.lang.String toString() {
            return "LayoutParams{mWidth=" + this.bg + ", mHeight=" + this.IL + ", mMargin=" + this.bX + ", mMarginLeft=" + this.eqN + ", mMarginRight=" + this.zx + ", mMarginTop=" + this.ldr + ", mMarginBottom=" + this.iR + ", mParams=" + this.LZ + ", mOrder=" + this.tC + ", mFlexGrow=" + this.rri + ", mFlexShrink=" + this.kMt + ", mAlignSelf=" + this.JAA + ", mFlexBasisPercent=" + this.Ja + ", mMinWidth=" + this.Uw + ", mMinHeight=" + this.DDQ + ", mMaxWidth=" + this.Uq + ", mMaxHeight=" + this.aGH + "} " + super.toString();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    public void bg(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
        }
        super.bg(str, str2);
        str.hashCode();
        switch (str) {
            case "alignItems":
                this.FFy = eo(str2);
                break;
            case "flexDirection":
                this.IL = iR(str2);
                break;
            case "alignContent":
                this.rr = VB(str2);
                break;
            case "flexWrap":
                this.ZTq = Kg(str2);
                break;
            case "justifyContent":
                this.gCm = WR(str2);
                break;
        }
    }

    int iR(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "column_reverse":
                return 3;
            case "column":
                return 2;
            case "row_reverse":
                return 1;
            default:
                return 0;
        }
    }

    private int Kg(java.lang.String str) {
        str.hashCode();
        return !str.equals("wrap") ? 0 : 1;
    }

    private int WR(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "center":
                return 2;
            case "space_around":
                return 4;
            case "space_between":
                return 3;
            case "flex_end":
                return 1;
            default:
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    private int eo(java.lang.String str) {
        byte b;
        switch (str) {
            case "stretch":
                b = 4;
                break;
            case "baseline":
                b = 3;
                break;
            case "center":
                b = 2;
                break;
            case "flex_start":
                b = 0;
                break;
            case "flex_end":
                b = 1;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return 0;
        }
        if (b == 1) {
            return 1;
        }
        if (b != 2) {
            return b != 3 ? 4 : 3;
        }
        return 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    private int VB(java.lang.String str) {
        byte b;
        switch (str) {
            case "stretch":
                b = 5;
                break;
            case "center":
                b = 2;
                break;
            case "space_around":
                b = 3;
                break;
            case "flex_start":
                b = 0;
                break;
            case "space_between":
                b = 4;
                break;
            case "flex_end":
                b = 1;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return 0;
        }
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            return 2;
        }
        if (b != 3) {
            return b != 4 ? 5 : 3;
        }
        return 4;
    }
}
