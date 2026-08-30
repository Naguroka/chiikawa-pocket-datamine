package com.bytedance.adsdk.ugeno.WR.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bg extends com.bytedance.adsdk.ugeno.WR.ldr.IL {
    private java.lang.String FFy;
    private boolean HXG;
    private com.bytedance.adsdk.ugeno.iR.bg.C0092bg IEI;
    private java.lang.String ZTq;
    private int bu;
    private java.lang.String gCm;
    private int gtr;
    private boolean hi;
    private java.lang.String rr;

    public bg(android.content.Context context) {
        super(context);
        this.gCm = "row";
    }

    @Override // com.bytedance.adsdk.ugeno.WR.ldr.IL, com.bytedance.adsdk.ugeno.IL.bX
    public void IL() {
        super.IL();
        bX();
        ((com.bytedance.adsdk.ugeno.WR.ldr.bg) this.ldr).setGravity(17);
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    protected void CQc() {
        super.CQc();
        if (this.HXG) {
            ((com.bytedance.adsdk.ugeno.WR.ldr.bg) this.ldr).setTextColor(this.bu);
        }
        if (this.hi) {
            if (this.huT) {
                bg(this.IEI);
            } else {
                eqN(this.gtr);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    protected void uu() {
        super.uu();
        if (this.HXG) {
            ((com.bytedance.adsdk.ugeno.WR.ldr.bg) this.ldr).setTextColor(this.IL);
        }
        if (this.hi) {
            if (this.huT) {
                bg(this.ZyO);
            } else {
                eqN(this.ayS);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    public void IL(android.graphics.drawable.Drawable drawable) {
        byte b;
        if (drawable == null) {
            return;
        }
        switch (this.gCm) {
            case "column_reverse":
                b = 2;
                break;
            case "column":
                b = 1;
                break;
            case "row_reverse":
                b = 0;
                break;
            case "row":
                b = 3;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            ((com.bytedance.adsdk.ugeno.WR.ldr.bg) this.ldr).setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null);
            return;
        }
        if (b == 1) {
            ((com.bytedance.adsdk.ugeno.WR.ldr.bg) this.ldr).setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        } else if (b == 2) {
            ((com.bytedance.adsdk.ugeno.WR.ldr.bg) this.ldr).setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawable);
        } else {
            ((com.bytedance.adsdk.ugeno.WR.ldr.bg) this.ldr).setCompoundDrawablesWithIntrinsicBounds(drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        }
    }

    private void bX() {
        if (android.text.TextUtils.isEmpty(this.ZTq)) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.WR.ldr.bg) this.ldr).setCompoundDrawables(null, null, null, null);
        if (this.ZTq.startsWith("local://")) {
            try {
                IL(com.bytedance.adsdk.ugeno.iR.Kg.bg(this.bX, com.bytedance.adsdk.ugeno.iR.eqN.bg(this.bX, this.ZTq.replace("local://", ""))));
                return;
            } catch (java.lang.Throwable unused) {
                return;
            }
        }
        com.bytedance.adsdk.ugeno.eqN.bg().IL().bg(this.eo, this.ZTq, new com.bytedance.adsdk.ugeno.bg.InterfaceC0086bg() { // from class: com.bytedance.adsdk.ugeno.WR.bg.bg.1
            @Override // com.bytedance.adsdk.ugeno.bg.InterfaceC0086bg
            public void bg(final android.graphics.Bitmap bitmap) {
                if (bitmap == null) {
                    return;
                }
                com.bytedance.adsdk.ugeno.iR.Kg.bg(new java.lang.Runnable() { // from class: com.bytedance.adsdk.ugeno.WR.bg.bg.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.adsdk.ugeno.WR.bg.bg.this.IL(new android.graphics.drawable.BitmapDrawable(com.bytedance.adsdk.ugeno.WR.bg.bg.this.bX.getResources(), bitmap));
                    }
                });
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.WR.ldr.IL, com.bytedance.adsdk.ugeno.IL.bX
    public void bg(java.lang.String str, java.lang.String str2) {
        super.bg(str, str2);
        str.hashCode();
        switch (str) {
            case "direction":
                this.gCm = str2;
                break;
            case "highlightTextColor":
            case "highlightedTextColor":
                this.bu = com.bytedance.adsdk.ugeno.iR.bg.bg(str2);
                this.HXG = true;
                break;
            case "image":
                this.ZTq = str2;
                break;
            case "highlightImage":
                this.FFy = str2;
                break;
            case "highlightBackgroundColor":
                if (com.bytedance.adsdk.ugeno.iR.bg.bX(str2)) {
                    this.huT = true;
                    this.IEI = com.bytedance.adsdk.ugeno.iR.bg.IL(str2);
                } else {
                    this.gtr = com.bytedance.adsdk.ugeno.iR.bg.bg(str2);
                    this.huT = false;
                }
                this.hi = true;
                break;
            case "highlightBackgroundImage":
                this.rr = str2;
                break;
        }
    }
}
