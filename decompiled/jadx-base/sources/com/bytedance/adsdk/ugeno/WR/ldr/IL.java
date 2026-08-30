package com.bytedance.adsdk.ugeno.WR.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class IL extends com.bytedance.adsdk.ugeno.IL.bX<com.bytedance.adsdk.ugeno.WR.ldr.bg> {
    private int FFy;
    private android.text.TextUtils.TruncateAt HXG;
    private int IEI;
    protected int IL;
    private float ZTq;
    protected java.lang.String bg;

    @java.lang.Deprecated
    private android.text.TextUtils.TruncateAt bu;
    private float eK;
    private float ews;
    private int gCm;
    private int gtr;
    private float hi;
    private float ovC;
    private int rgo;
    private int rr;
    private float zU;

    public IL(android.content.Context context) {
        super(context);
        this.IL = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        this.ZTq = 12.0f;
        this.FFy = Integer.MAX_VALUE;
        this.gtr = 2;
        this.hi = -1.0f;
        this.eK = 400.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.WR.ldr.bg eqN() {
        com.bytedance.adsdk.ugeno.WR.ldr.bg bgVar = new com.bytedance.adsdk.ugeno.WR.ldr.bg(this.bX);
        bgVar.bg(this);
        return bgVar;
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    public void IL() {
        super.IL();
        if (android.text.TextUtils.equals("null", this.bg)) {
            this.bg = "";
        }
        iR(this.bg);
        ((com.bytedance.adsdk.ugeno.WR.ldr.bg) this.ldr).setTextSize(1, this.ZTq);
        ((com.bytedance.adsdk.ugeno.WR.ldr.bg) this.ldr).setTextColor(this.IL);
        ((com.bytedance.adsdk.ugeno.WR.ldr.bg) this.ldr).setLines(this.rr);
        ((com.bytedance.adsdk.ugeno.WR.ldr.bg) this.ldr).setMaxLines(this.FFy);
        ((com.bytedance.adsdk.ugeno.WR.ldr.bg) this.ldr).setGravity(this.gtr);
        ((com.bytedance.adsdk.ugeno.WR.ldr.bg) this.ldr).setIncludeFontPadding(false);
        bg(this.IEI);
        if (DDQ()) {
            bg(this.HXG);
        } else {
            bg(this.bu);
        }
        if (android.os.Build.VERSION.SDK_INT >= 28 && this.hi >= 0.0f) {
            ((com.bytedance.adsdk.ugeno.WR.ldr.bg) this.ldr).setLineSpacing(0.0f, this.hi);
        }
        ((com.bytedance.adsdk.ugeno.WR.ldr.bg) this.ldr).setShadowLayer(this.zU, this.ovC, this.ews, this.rgo);
        if (this.gCm == 1) {
            ((com.bytedance.adsdk.ugeno.WR.ldr.bg) this.ldr).setTypeface(android.graphics.Typeface.DEFAULT, this.gCm);
        } else if (android.os.Build.VERSION.SDK_INT >= 28) {
            ((com.bytedance.adsdk.ugeno.WR.ldr.bg) this.ldr).setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, (int) this.eK, this.gCm == 2));
        } else if (this.eK >= 500.0f) {
            ((com.bytedance.adsdk.ugeno.WR.ldr.bg) this.ldr).setTypeface(android.graphics.Typeface.DEFAULT, 1);
        }
    }

    public void iR(java.lang.String str) {
        this.bg = str;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (android.text.TextUtils.equals("null", str)) {
            this.bg = "";
        }
        ((com.bytedance.adsdk.ugeno.WR.ldr.bg) this.ldr).setText(this.bg);
    }

    public void bg(int i) {
        this.IEI = i;
        if (i == Integer.MAX_VALUE) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.WR.ldr.bg) this.ldr).setPaintFlags(i);
    }

    public void bg(android.text.TextUtils.TruncateAt truncateAt) {
        if (truncateAt == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.WR.ldr.bg) this.ldr).setEllipsize(truncateAt);
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    public void bg(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
        }
        super.bg(str, str2);
        str.hashCode();
        switch (str) {
            case "shadowRadius":
            case "shadowBlur":
                this.zU = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0.0f);
                break;
            case "shadowColor":
                this.rgo = com.bytedance.adsdk.ugeno.iR.bg.bg(str2);
                break;
            case "textAlign":
                this.gtr = VB(str2);
                break;
            case "textColor":
                this.IL = com.bytedance.adsdk.ugeno.iR.bg.bg(str2);
                break;
            case "textStyle":
                this.gCm = eo(str2);
                break;
            case "textSize":
                this.ZTq = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0.0f);
                break;
            case "textDecoration":
                this.IEI = PX(str2);
                break;
            case "shadowDx":
                this.ovC = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0.0f);
                break;
            case "shadowDy":
                this.ews = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0.0f);
                break;
            case "fontWeight":
                this.eK = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, -1.0f);
                break;
            case "lineHeight":
                this.hi = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 1.0f);
                break;
            case "text":
                this.bg = str2;
                break;
            case "lines":
                this.rr = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0);
                break;
            case "ellipsis":
                this.HXG = WR(str2);
                break;
            case "maxLines":
                this.FFy = java.lang.Integer.parseInt(str2);
                break;
            case "ellipsize":
                this.bu = Kg(str2);
                break;
        }
    }

    private android.text.TextUtils.TruncateAt Kg(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "center":
                this.bu = android.text.TextUtils.TruncateAt.MIDDLE;
                break;
            case "end":
                this.bu = android.text.TextUtils.TruncateAt.END;
                break;
            case "start":
                this.bu = android.text.TextUtils.TruncateAt.START;
                break;
            default:
                this.bu = null;
                break;
        }
        return this.bu;
    }

    private android.text.TextUtils.TruncateAt WR(java.lang.String str) {
        if (android.text.TextUtils.equals(str, "none")) {
            return null;
        }
        return android.text.TextUtils.TruncateAt.END;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    private int eo(java.lang.String str) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != -1178781136) {
            if (iHashCode != -1039745817) {
                if (iHashCode == 3029637 && str.equals(androidx.media3.extractor.text.ttml.TtmlNode.BOLD)) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str.equals(com.adjust.sdk.Constants.NORMAL)) {
                b = 2;
            } else {
                b = -1;
            }
        } else if (str.equals(androidx.media3.extractor.text.ttml.TtmlNode.ITALIC)) {
            b = 1;
        } else {
            b = -1;
        }
        if (b != 0) {
            return b != 1 ? 0 : 2;
        }
        return 1;
    }

    private int VB(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "center":
                return 17;
            case "left":
                return 3;
            case "right":
                return 5;
            default:
                return 2;
        }
    }

    private int PX(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "underline":
                return 8;
            case "strikethrough":
                return 16;
            case "none":
            default:
                return Integer.MAX_VALUE;
        }
    }
}
