package com.bytedance.adsdk.ugeno.WR.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class bX extends com.bytedance.adsdk.ugeno.IL.bX<com.bytedance.adsdk.ugeno.WR.eqN.bg> {
    private float FFy;
    protected android.widget.ImageView.ScaleType IL;
    protected boolean ZTq;
    protected java.lang.String bg;
    private int gCm;
    private float rr;

    public bX(android.content.Context context) {
        super(context);
        this.IL = android.widget.ImageView.ScaleType.FIT_XY;
        this.gCm = -1;
        this.FFy = -1.0f;
        this.rr = -1.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    public void IL() {
        super.IL();
        bX();
        ((com.bytedance.adsdk.ugeno.WR.eqN.bg) this.ldr).setScaleType(this.IL);
        ((com.bytedance.adsdk.ugeno.WR.eqN.bg) this.ldr).setBorderColor(this.gXn);
        ((com.bytedance.adsdk.ugeno.WR.eqN.bg) this.ldr).setCornerRadius(this.Dxa);
        ((com.bytedance.adsdk.ugeno.WR.eqN.bg) this.ldr).setBorderWidth(this.lM);
        if (this.gCm != -1) {
            ((com.bytedance.adsdk.ugeno.WR.eqN.bg) this.ldr).setColorFilter(this.gCm);
        }
    }

    public void Kg(java.lang.String str) {
        this.bg = str;
    }

    private void bX() {
        if (android.text.TextUtils.isEmpty(this.bg)) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.WR.eqN.bg) this.ldr).setImageDrawable(null);
        if (this.bg.startsWith("local://")) {
            try {
                ((com.bytedance.adsdk.ugeno.WR.eqN.bg) this.ldr).setImageResource(com.bytedance.adsdk.ugeno.iR.eqN.bg(this.bX, this.bg.replace("local://", "")));
            } catch (java.lang.Throwable unused) {
            }
        } else {
            if (this.bg.startsWith("@")) {
                try {
                    ((com.bytedance.adsdk.ugeno.WR.eqN.bg) this.ldr).setImageResource(java.lang.Integer.parseInt(this.bg.substring(1)));
                    return;
                } catch (java.lang.Exception unused2) {
                    return;
                }
            }
            Pae();
        }
    }

    private void Pae() {
        if (this.FFy > 0.0f) {
            com.bytedance.adsdk.ugeno.eqN.bg().IL().bg(this.eo, this.bg, new com.bytedance.adsdk.ugeno.bg.InterfaceC0086bg() { // from class: com.bytedance.adsdk.ugeno.WR.eqN.bX.1
                @Override // com.bytedance.adsdk.ugeno.bg.InterfaceC0086bg
                public void bg(android.graphics.Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    final android.graphics.Bitmap bitmapBg = com.bytedance.adsdk.ugeno.iR.Kg.bg(com.bytedance.adsdk.ugeno.WR.eqN.bX.this.bX, bitmap, (int) com.bytedance.adsdk.ugeno.WR.eqN.bX.this.FFy);
                    if (bitmapBg != null) {
                        com.bytedance.adsdk.ugeno.iR.Kg.bg(new java.lang.Runnable() { // from class: com.bytedance.adsdk.ugeno.WR.eqN.bX.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((com.bytedance.adsdk.ugeno.WR.eqN.bg) com.bytedance.adsdk.ugeno.WR.eqN.bX.this.ldr).setImageBitmap(bitmapBg);
                            }
                        });
                    }
                    if (com.bytedance.adsdk.ugeno.WR.eqN.bX.this.ZTq || com.bytedance.adsdk.ugeno.WR.eqN.bX.this.rr > 0.0f) {
                        android.graphics.Bitmap bitmapBg2 = com.bytedance.adsdk.ugeno.iR.Kg.bg(com.bytedance.adsdk.ugeno.WR.eqN.bX.this.bX, bitmap, com.bytedance.adsdk.ugeno.WR.eqN.bX.this.rr > 0.0f ? (int) com.bytedance.adsdk.ugeno.WR.eqN.bX.this.rr : 10);
                        if (bitmapBg2 != null) {
                            final android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(com.bytedance.adsdk.ugeno.WR.eqN.bX.this.bX.getResources(), bitmapBg2);
                            com.bytedance.adsdk.ugeno.iR.Kg.bg(new java.lang.Runnable() { // from class: com.bytedance.adsdk.ugeno.WR.eqN.bX.1.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    ((com.bytedance.adsdk.ugeno.WR.eqN.bg) com.bytedance.adsdk.ugeno.WR.eqN.bX.this.ldr).setBackground(bitmapDrawable);
                                }
                            });
                        }
                    }
                }
            });
            return;
        }
        com.bytedance.adsdk.ugeno.eqN.bg().IL().bg(this.eo, this.bg, (android.widget.ImageView) this.ldr, ((com.bytedance.adsdk.ugeno.WR.eqN.bg) this.ldr).getWidth(), ((com.bytedance.adsdk.ugeno.WR.eqN.bg) this.ldr).getHeight());
        if (this.ZTq || this.rr > 0.0f) {
            com.bytedance.adsdk.ugeno.eqN.bg().IL().bg(this.eo, this.bg, new com.bytedance.adsdk.ugeno.bg.InterfaceC0086bg() { // from class: com.bytedance.adsdk.ugeno.WR.eqN.bX.2
                @Override // com.bytedance.adsdk.ugeno.bg.InterfaceC0086bg
                public void bg(android.graphics.Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    final android.graphics.Bitmap bitmapBg = com.bytedance.adsdk.ugeno.iR.Kg.bg(com.bytedance.adsdk.ugeno.WR.eqN.bX.this.bX, bitmap, com.bytedance.adsdk.ugeno.WR.eqN.bX.this.rr > 0.0f ? (int) com.bytedance.adsdk.ugeno.WR.eqN.bX.this.rr : 10);
                    com.bytedance.adsdk.ugeno.iR.Kg.bg(new java.lang.Runnable() { // from class: com.bytedance.adsdk.ugeno.WR.eqN.bX.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (bitmapBg != null) {
                                ((com.bytedance.adsdk.ugeno.WR.eqN.bg) com.bytedance.adsdk.ugeno.WR.eqN.bX.this.ldr).setBackground(new android.graphics.drawable.BitmapDrawable(com.bytedance.adsdk.ugeno.WR.eqN.bX.this.bX.getResources(), bitmapBg));
                            }
                        }
                    });
                }
            });
        }
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.WR.eqN.bg eqN() {
        com.bytedance.adsdk.ugeno.WR.eqN.bg bgVar = new com.bytedance.adsdk.ugeno.WR.eqN.bg(this.bX);
        bgVar.bg(this);
        return bgVar;
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    public void bg(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
        }
        super.bg(str, str2);
        str.hashCode();
        switch (str) {
            case "scaleMode":
            case "scaleType":
                this.IL = iR(str2);
                break;
            case "imageBlur":
                this.FFy = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, -1.0f);
                break;
            case "isBgGaussianBlur":
                this.ZTq = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, false);
                break;
            case "src":
                this.bg = str2;
                break;
            case "tintColor":
                this.gCm = com.bytedance.adsdk.ugeno.iR.bg.bg(str2);
                break;
            case "imageBgBlur":
                this.rr = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, -1.0f);
                break;
        }
    }

    private android.widget.ImageView.ScaleType iR(java.lang.String str) {
        android.widget.ImageView.ScaleType scaleType = android.widget.ImageView.ScaleType.FIT_XY;
        str.hashCode();
        switch (str) {
            case "center":
                return android.widget.ImageView.ScaleType.CENTER;
            case "fitEnd":
                return android.widget.ImageView.ScaleType.FIT_END;
            case "fitStart":
                return android.widget.ImageView.ScaleType.FIT_START;
            case "centerInside":
                return android.widget.ImageView.ScaleType.CENTER_INSIDE;
            case "fit":
            case "fitCenter":
                return android.widget.ImageView.ScaleType.FIT_CENTER;
            case "crop":
            case "centerCrop":
                return android.widget.ImageView.ScaleType.CENTER_CROP;
            case "fill":
            case "fitXY":
                return android.widget.ImageView.ScaleType.FIT_XY;
            default:
                return scaleType;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX, com.bytedance.adsdk.ugeno.bX
    public void iR() {
        super.iR();
        ((com.bytedance.adsdk.ugeno.WR.eqN.bg) this.ldr).post(new java.lang.Runnable() { // from class: com.bytedance.adsdk.ugeno.WR.eqN.bX.3
            @Override // java.lang.Runnable
            public void run() {
                android.graphics.drawable.Drawable drawable = ((com.bytedance.adsdk.ugeno.WR.eqN.bg) com.bytedance.adsdk.ugeno.WR.eqN.bX.this.ldr).getDrawable();
                if (android.os.Build.VERSION.SDK_INT < 28 || !(drawable instanceof android.graphics.drawable.AnimatedImageDrawable)) {
                    return;
                }
                ((android.graphics.drawable.AnimatedImageDrawable) drawable).start();
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX, com.bytedance.adsdk.ugeno.bX
    public void Kg() {
        super.Kg();
        android.graphics.drawable.Drawable drawable = ((com.bytedance.adsdk.ugeno.WR.eqN.bg) this.ldr).getDrawable();
        if (android.os.Build.VERSION.SDK_INT < 28 || !(drawable instanceof android.graphics.drawable.AnimatedImageDrawable)) {
            return;
        }
        ((android.graphics.drawable.AnimatedImageDrawable) drawable).stop();
    }
}
