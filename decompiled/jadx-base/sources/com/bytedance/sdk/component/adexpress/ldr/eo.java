package com.bytedance.sdk.component.adexpress.ldr;

/* JADX INFO: loaded from: classes3.dex */
public class eo extends com.bytedance.adsdk.IL.ldr {
    private java.lang.String IL;
    private java.util.Map<java.lang.String, android.graphics.Bitmap> bg;

    public void setAnimationsLoop(boolean z) {
    }

    public void setData(java.util.Map<java.lang.String, java.lang.String> map) {
    }

    public void setLottieAdDescMaxLength(int i) {
    }

    public void setLottieAdTitleMaxLength(int i) {
    }

    public void setLottieAppNameMaxLength(int i) {
    }

    public eo(android.content.Context context) {
        super(context);
        this.bg = new java.util.HashMap();
    }

    public void setImageLottieTosPath(java.lang.String str) {
        this.IL = str;
    }

    public void Kg() {
        if (android.text.TextUtils.isEmpty(this.IL)) {
            return;
        }
        setProgress(0.0f);
        bg(true);
        setAnimationFromUrl(this.IL);
        setImageAssetDelegate(new com.bytedance.adsdk.IL.eqN() { // from class: com.bytedance.sdk.component.adexpress.ldr.eo.1
            @Override // com.bytedance.adsdk.IL.eqN
            public android.graphics.Bitmap bg(final com.bytedance.adsdk.IL.eo eoVar) {
                final java.lang.String strIR = eoVar.iR();
                java.lang.String strWR = eoVar.WR();
                java.lang.String strKg = eoVar.Kg();
                if (android.text.TextUtils.equals(strIR, "image_0") && android.text.TextUtils.equals(strKg, "Lark20201123-180048_2.png")) {
                    strKg = "hand.png";
                }
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) com.bytedance.sdk.component.adexpress.ldr.eo.this.bg.get(strIR);
                if (bitmap != null) {
                    return bitmap;
                }
                java.lang.Object[] objArr = new java.lang.Object[4];
                if (android.text.TextUtils.isEmpty(strWR) || !android.text.TextUtils.isEmpty(strKg)) {
                    if (android.text.TextUtils.isEmpty(strKg) || !android.text.TextUtils.isEmpty(strWR)) {
                        strWR = (android.text.TextUtils.isEmpty(strKg) || android.text.TextUtils.isEmpty(strWR)) ? "" : strWR + strKg;
                    } else {
                        strWR = strKg;
                    }
                }
                if (android.text.TextUtils.isEmpty(strWR)) {
                    return null;
                }
                com.bytedance.sdk.component.zx.eo eoVarBg = com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().zx().bg(strWR).bg(new com.bytedance.sdk.component.zx.Kg() { // from class: com.bytedance.sdk.component.adexpress.ldr.eo.1.1
                    @Override // com.bytedance.sdk.component.zx.Kg
                    public android.graphics.Bitmap bg(android.graphics.Bitmap bitmap2) {
                        android.graphics.Bitmap bitmapCreateScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap2, eoVar.bg(), eoVar.IL(), false);
                        com.bytedance.sdk.component.adexpress.ldr.eo.this.bg.put(strIR, bitmapCreateScaledBitmap);
                        return bitmapCreateScaledBitmap;
                    }
                });
                com.bytedance.sdk.component.adexpress.ldr.eo eoVar2 = com.bytedance.sdk.component.adexpress.ldr.eo.this;
                eoVarBg.bg(new com.bytedance.sdk.component.adexpress.ldr.eo.bg(eoVar2, eoVar, strIR, eoVar2.bg));
                return (android.graphics.Bitmap) com.bytedance.sdk.component.adexpress.ldr.eo.this.bg.get(strIR);
            }
        });
        bg();
    }

    private static class bg implements com.bytedance.sdk.component.zx.xxp<android.graphics.Bitmap> {
        private final com.bytedance.adsdk.IL.eo IL;
        private final java.lang.String bX;
        private final java.lang.ref.WeakReference<com.bytedance.sdk.component.adexpress.ldr.eo> bg;
        private final java.util.Map<java.lang.String, android.graphics.Bitmap> eqN;

        @Override // com.bytedance.sdk.component.zx.xxp
        public void bg(int i, java.lang.String str, java.lang.Throwable th) {
        }

        public bg(com.bytedance.sdk.component.adexpress.ldr.eo eoVar, com.bytedance.adsdk.IL.eo eoVar2, java.lang.String str, java.util.Map<java.lang.String, android.graphics.Bitmap> map) {
            this.bg = new java.lang.ref.WeakReference<>(eoVar);
            this.IL = eoVar2;
            this.bX = str;
            this.eqN = map;
        }

        @Override // com.bytedance.sdk.component.zx.xxp
        public void bg(com.bytedance.sdk.component.zx.VB<android.graphics.Bitmap> vb) {
            android.graphics.Bitmap bitmapCreateScaledBitmap = android.graphics.Bitmap.createScaledBitmap(vb.IL(), this.IL.bg(), this.IL.IL(), false);
            this.eqN.put(this.bX, bitmapCreateScaledBitmap);
            com.bytedance.sdk.component.adexpress.ldr.eo eoVar = this.bg.get();
            if (eoVar != null) {
                eoVar.bg(this.IL.iR(), bitmapCreateScaledBitmap);
            }
        }
    }
}
