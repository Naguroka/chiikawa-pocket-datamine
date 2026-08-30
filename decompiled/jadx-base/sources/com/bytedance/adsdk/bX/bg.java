package com.bytedance.adsdk.bX;

/* JADX INFO: loaded from: classes3.dex */
public class bg extends com.bytedance.adsdk.ugeno.IL.bX<com.bytedance.adsdk.IL.ldr> {
    private boolean FFy;
    private float HXG;
    private boolean IEI;
    protected android.widget.ImageView.ScaleType IL;
    private java.lang.String ZTq;
    protected android.widget.ImageView.ScaleType bg;
    private float bu;
    private java.lang.String gCm;
    private int gtr;
    private java.util.HashMap<java.lang.String, android.graphics.Bitmap> hi;

    @java.lang.Deprecated
    private boolean rr;

    public bg(android.content.Context context) {
        super(context);
        this.gCm = "images";
        this.HXG = 1.0f;
        this.bg = android.widget.ImageView.ScaleType.FIT_CENTER;
        this.IL = android.widget.ImageView.ScaleType.FIT_XY;
        this.hi = new java.util.HashMap<>();
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.IL.ldr eqN() {
        com.bytedance.adsdk.IL.ldr ldrVar = new com.bytedance.adsdk.IL.ldr(this.bX);
        ldrVar.bg(this);
        return ldrVar;
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    public void IL() {
        super.IL();
        ((com.bytedance.adsdk.IL.ldr) this.ldr).setProgress(this.bu);
        if (this.HXG <= 0.0f) {
            this.HXG = 1.0f;
        }
        ((com.bytedance.adsdk.IL.ldr) this.ldr).setSpeed(this.HXG);
        if (this.ZTq.startsWith("local")) {
            ((com.bytedance.adsdk.IL.ldr) this.ldr).setAnimation(iR(this.ZTq));
            ((com.bytedance.adsdk.IL.ldr) this.ldr).setImageAssetsFolder(this.gCm);
        } else {
            ((com.bytedance.adsdk.IL.ldr) this.ldr).setAnimationFromUrl(this.ZTq);
        }
        ((com.bytedance.adsdk.IL.ldr) this.ldr).setImageAssetDelegate(new com.bytedance.adsdk.bX.bg.AnonymousClass1());
        if (DDQ()) {
            ((com.bytedance.adsdk.IL.ldr) this.ldr).setScaleType(this.IL);
        } else {
            ((com.bytedance.adsdk.IL.ldr) this.ldr).setScaleType(this.bg);
        }
        if (DDQ()) {
            ((com.bytedance.adsdk.IL.ldr) this.ldr).setRepeatCount(this.gtr);
        } else {
            ((com.bytedance.adsdk.IL.ldr) this.ldr).bg(this.rr);
        }
        bX();
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.bX.bg$1, reason: invalid class name */
    class AnonymousClass1 implements com.bytedance.adsdk.IL.eqN {
        AnonymousClass1() {
        }

        @Override // com.bytedance.adsdk.IL.eqN
        public android.graphics.Bitmap bg(final com.bytedance.adsdk.IL.eo eoVar) {
            final java.lang.String strBg;
            if (eoVar == null) {
                return null;
            }
            java.lang.String strWR = eoVar.WR();
            java.lang.String strKg = eoVar.Kg();
            if (!android.text.TextUtils.isEmpty(strWR) && android.text.TextUtils.isEmpty(strKg)) {
                strBg = com.bytedance.adsdk.ugeno.bX.IL.bg(strWR, com.bytedance.adsdk.bX.bg.this.zx);
            } else if (!android.text.TextUtils.isEmpty(strKg) && android.text.TextUtils.isEmpty(strWR)) {
                strBg = com.bytedance.adsdk.ugeno.bX.IL.bg(strKg, com.bytedance.adsdk.bX.bg.this.zx);
            } else {
                strBg = (android.text.TextUtils.isEmpty(strKg) || android.text.TextUtils.isEmpty(strWR)) ? null : com.bytedance.adsdk.ugeno.bX.IL.bg(strWR, com.bytedance.adsdk.bX.bg.this.zx) + com.bytedance.adsdk.ugeno.bX.IL.bg(strKg, com.bytedance.adsdk.bX.bg.this.zx);
            }
            if (android.text.TextUtils.isEmpty(strBg)) {
                return null;
            }
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) com.bytedance.adsdk.bX.bg.this.hi.get(strBg);
            if (bitmap != null) {
                return bitmap;
            }
            com.bytedance.adsdk.ugeno.eqN.bg().IL().bg(com.bytedance.adsdk.bX.bg.this.eo, strBg, new com.bytedance.adsdk.ugeno.bg.InterfaceC0086bg() { // from class: com.bytedance.adsdk.bX.bg.1.1
                @Override // com.bytedance.adsdk.ugeno.bg.InterfaceC0086bg
                public void bg(android.graphics.Bitmap bitmap2) {
                    if (bitmap2 != null) {
                        final android.graphics.Bitmap bitmapCreateScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap2, eoVar.bg(), eoVar.IL(), false);
                        com.bytedance.adsdk.bX.bg.this.hi.put(strBg, bitmapCreateScaledBitmap);
                        com.bytedance.adsdk.ugeno.iR.Kg.bg(new java.lang.Runnable() { // from class: com.bytedance.adsdk.bX.bg.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((com.bytedance.adsdk.IL.ldr) com.bytedance.adsdk.bX.bg.this.ldr).bg(eoVar.iR(), bitmapCreateScaledBitmap);
                            }
                        });
                    }
                }
            });
            return (android.graphics.Bitmap) com.bytedance.adsdk.bX.bg.this.hi.get(strBg);
        }
    }

    protected void bX() {
        ((com.bytedance.adsdk.IL.ldr) this.ldr).bg();
    }

    @Override // com.bytedance.adsdk.ugeno.IL.bX
    public void bg(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
        }
        super.bg(str, str2);
        str.hashCode();
        switch (str) {
            case "scaleMode":
                this.IL = WR(str2);
                break;
            case "scaleType":
                this.bg = Kg(str2);
                break;
            case "progress":
                this.bu = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0.0f);
                break;
            case "imagePath":
                this.gCm = str2;
                break;
            case "autoReverse":
                this.FFy = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, false);
                break;
            case "src":
                this.ZTq = str2;
                break;
            case "loop":
                if (DDQ()) {
                    this.gtr = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 0);
                    break;
                } else {
                    this.rr = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, false);
                    break;
                }
                break;
            case "speed":
                this.HXG = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, 1.0f);
                break;
            case "autoPlay":
                this.IEI = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, false);
                break;
            case "autoplay":
                this.IEI = com.bytedance.adsdk.ugeno.iR.bX.bg(str2, true);
                break;
        }
    }

    private java.lang.String iR(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || !str.contains("local")) {
            return "";
        }
        if (str.contains("shake_phone")) {
            return "lottie_json/shake_phone.json";
        }
        return str.contains("swipe_right") ? "lottie_json/swipe_right.json" : "";
    }

    private android.widget.ImageView.ScaleType Kg(java.lang.String str) {
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
            case "fitXY":
                return android.widget.ImageView.ScaleType.FIT_XY;
            case "fitCenter":
                return android.widget.ImageView.ScaleType.FIT_CENTER;
            case "centerCrop":
                return android.widget.ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    private android.widget.ImageView.ScaleType WR(java.lang.String str) {
        android.widget.ImageView.ScaleType scaleType = android.widget.ImageView.ScaleType.FIT_XY;
        str.hashCode();
        switch (str) {
            case "fit":
                return android.widget.ImageView.ScaleType.FIT_CENTER;
            case "crop":
                return android.widget.ImageView.ScaleType.CENTER_CROP;
            case "fill":
                return android.widget.ImageView.ScaleType.FIT_XY;
            default:
                return scaleType;
        }
    }
}
