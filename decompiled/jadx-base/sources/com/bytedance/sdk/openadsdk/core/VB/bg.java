package com.bytedance.sdk.openadsdk.core.VB;

/* JADX INFO: loaded from: classes4.dex */
public class bg implements com.bytedance.adsdk.ugeno.bg {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.VB.bg$bg, reason: collision with other inner class name */
    public interface InterfaceC0146bg {
        void bg(android.graphics.drawable.Drawable drawable);
    }

    @Override // com.bytedance.adsdk.ugeno.bg
    public void bg(com.bytedance.adsdk.ugeno.core.Kg kg, java.lang.String str, android.widget.ImageView imageView) {
        java.lang.String strBg = bg(str);
        if (imageView instanceof com.bytedance.sdk.openadsdk.core.widget.zx) {
            com.bytedance.sdk.openadsdk.core.widget.zx zxVar = (com.bytedance.sdk.openadsdk.core.widget.zx) imageView;
            zxVar.setAdjustViewBounds(true);
            zxVar.setBackgroundColor(0);
            com.bytedance.sdk.openadsdk.WR.eqN.bg(strBg).bX(3).bg(android.graphics.Bitmap.Config.RGB_565).bg(new com.bytedance.sdk.openadsdk.core.VB.bg.IL(zxVar));
            return;
        }
        com.bytedance.sdk.component.zx.eo eoVarBg = com.bytedance.sdk.openadsdk.WR.eqN.bg(strBg);
        bg(kg, eoVarBg, strBg);
        eoVarBg.bg(imageView);
    }

    private static class IL implements com.bytedance.sdk.component.zx.xxp {
        private java.lang.ref.WeakReference<com.bytedance.sdk.openadsdk.core.widget.zx> bg;

        @Override // com.bytedance.sdk.component.zx.xxp
        public void bg(int i, java.lang.String str, java.lang.Throwable th) {
        }

        public IL(com.bytedance.sdk.openadsdk.core.widget.zx zxVar) {
            this.bg = new java.lang.ref.WeakReference<>(zxVar);
        }

        @Override // com.bytedance.sdk.component.zx.xxp
        public void bg(com.bytedance.sdk.component.zx.VB vb) {
            try {
                com.bytedance.sdk.openadsdk.core.widget.zx zxVar = this.bg.get();
                if (zxVar == null) {
                    return;
                }
                java.lang.Object objIL = vb.IL();
                if (objIL instanceof byte[]) {
                    if (vb.zx()) {
                        zxVar.bg((byte[]) objIL, false);
                        zxVar.setRepeatConfig(true);
                        zxVar.IL();
                        return;
                    }
                    zxVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.yDt.bg((byte[]) objIL, 0));
                    return;
                }
                if (objIL instanceof android.graphics.Bitmap) {
                    zxVar.setImageBitmap((android.graphics.Bitmap) objIL);
                }
            } catch (java.lang.Throwable th) {
                bg(1002, "", th);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bg
    public void bg(com.bytedance.adsdk.ugeno.core.Kg kg, java.lang.String str, android.widget.ImageView imageView, int i, int i2) {
        java.lang.String strBg = bg(str);
        com.bytedance.sdk.component.zx.eo eoVarBX = com.bytedance.sdk.openadsdk.WR.eqN.bg(strBg).bX(3);
        bg(kg, eoVarBX, strBg);
        eoVarBX.bg(new com.bytedance.sdk.openadsdk.core.VB.bg.bX(imageView, this, i, i2), 4);
    }

    private static class bX implements com.bytedance.sdk.component.zx.xxp {
        private final com.bytedance.sdk.openadsdk.core.VB.bg IL;
        private final int bX;
        private final java.lang.ref.WeakReference<android.widget.ImageView> bg;
        private final int eqN;

        @Override // com.bytedance.sdk.component.zx.xxp
        public void bg(int i, java.lang.String str, java.lang.Throwable th) {
        }

        public bX(android.widget.ImageView imageView, com.bytedance.sdk.openadsdk.core.VB.bg bgVar, int i, int i2) {
            this.bg = new java.lang.ref.WeakReference<>(imageView);
            this.IL = bgVar;
            this.bX = i;
            this.eqN = i2;
        }

        @Override // com.bytedance.sdk.component.zx.xxp
        public void bg(com.bytedance.sdk.component.zx.VB vb) {
            try {
                final android.widget.ImageView imageView = this.bg.get();
                if (imageView == null) {
                    return;
                }
                final java.lang.Object objIL = vb.IL();
                if (objIL instanceof byte[]) {
                    if (vb.zx()) {
                        if (android.os.Build.VERSION.SDK_INT <= 30) {
                            this.IL.bg((byte[]) objIL, imageView);
                            return;
                        } else {
                            this.IL.bg(imageView, (byte[]) objIL, this.bX, this.eqN);
                            return;
                        }
                    }
                    if (this.IL.bg((byte[]) objIL)) {
                        this.IL.bg(imageView, (byte[]) objIL, this.bX, this.eqN);
                        return;
                    }
                    final android.graphics.Bitmap bitmapBg = new com.bytedance.sdk.component.zx.bX.IL.bg(this.bX, this.eqN, imageView.getScaleType(), android.graphics.Bitmap.Config.RGB_565, this.bX, this.eqN).bg((byte[]) objIL);
                    if (bitmapBg != null) {
                        com.bytedance.sdk.openadsdk.utils.VJ.bg((java.lang.Runnable) new com.bytedance.sdk.component.Kg.Kg("load_static_img") { // from class: com.bytedance.sdk.openadsdk.core.VB.bg.bX.1
                            @Override // java.lang.Runnable
                            public void run() {
                                imageView.setImageBitmap(bitmapBg);
                            }
                        });
                        return;
                    }
                    return;
                }
                if (objIL instanceof android.graphics.Bitmap) {
                    com.bytedance.sdk.openadsdk.utils.VJ.bg((java.lang.Runnable) new com.bytedance.sdk.component.Kg.Kg("ug_load_bitmap") { // from class: com.bytedance.sdk.openadsdk.core.VB.bg.bX.2
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap((android.graphics.Bitmap) objIL);
                        }
                    });
                }
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.bg("ImageLoaderProvider", th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(final android.widget.ImageView imageView, byte[] bArr, int i, int i2) {
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            try {
                final android.graphics.drawable.Drawable drawableDecodeDrawable = android.graphics.ImageDecoder.decodeDrawable(android.graphics.ImageDecoder.createSource(byteBufferWrap));
                if (drawableDecodeDrawable != null) {
                    com.bytedance.sdk.openadsdk.utils.VJ.bg((java.lang.Runnable) new com.bytedance.sdk.component.Kg.Kg("loadAnimatedDrawable") { // from class: com.bytedance.sdk.openadsdk.core.VB.bg.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageDrawable(drawableDecodeDrawable);
                        }
                    });
                    return;
                }
                return;
            } catch (java.io.IOException e) {
                com.bytedance.sdk.component.utils.PX.bg("ImageLoaderProvider", e.getMessage());
                return;
            }
        }
        IL(imageView, bArr, i, i2);
    }

    private void IL(final android.widget.ImageView imageView, byte[] bArr, int i, int i2) {
        final android.graphics.Bitmap bitmapBg = new com.bytedance.sdk.component.zx.bX.IL.bg(i, i2, imageView.getScaleType(), android.graphics.Bitmap.Config.ARGB_4444, i, i2).bg(bArr);
        if (bitmapBg != null) {
            com.bytedance.sdk.openadsdk.utils.VJ.bg((java.lang.Runnable) new com.bytedance.sdk.component.Kg.Kg("loadStaticImage") { // from class: com.bytedance.sdk.openadsdk.core.VB.bg.2
                @Override // java.lang.Runnable
                public void run() {
                    imageView.setImageBitmap(bitmapBg);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg(byte[] bArr, final android.widget.ImageView imageView) {
        try {
            com.bytedance.sdk.component.utils.PX.bg("ImageLoaderProvider", "load animation image");
            bg(bArr, new com.bytedance.sdk.openadsdk.core.VB.bg.InterfaceC0146bg() { // from class: com.bytedance.sdk.openadsdk.core.VB.bg.3
                @Override // com.bytedance.sdk.openadsdk.core.VB.bg.InterfaceC0146bg
                public void bg(final android.graphics.drawable.Drawable drawable) {
                    com.bytedance.sdk.openadsdk.utils.VJ.bg(new java.lang.Runnable() { // from class: com.bytedance.sdk.openadsdk.core.VB.bg.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (android.os.Build.VERSION.SDK_INT >= 28) {
                                android.graphics.drawable.Drawable drawable2 = drawable;
                                if (drawable2 instanceof android.graphics.drawable.AnimatedImageDrawable) {
                                    ((android.graphics.drawable.AnimatedImageDrawable) drawable2).start();
                                }
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            });
        } catch (java.lang.Exception e) {
            com.bytedance.sdk.component.utils.PX.bg("ImageLoaderProvider", e.getMessage());
        }
    }

    private void bg(final byte[] bArr, final com.bytedance.sdk.openadsdk.core.VB.bg.InterfaceC0146bg interfaceC0146bg) {
        com.bytedance.sdk.openadsdk.utils.VJ.IL(new com.bytedance.sdk.component.Kg.Kg("pag_animation_drawable") { // from class: com.bytedance.sdk.openadsdk.core.VB.bg.4
            @Override // java.lang.Runnable
            public void run() {
                android.graphics.drawable.Drawable drawableIL = com.bytedance.sdk.openadsdk.core.VB.bg.this.IL(bArr);
                com.bytedance.sdk.openadsdk.core.VB.bg.InterfaceC0146bg interfaceC0146bg2 = interfaceC0146bg;
                if (interfaceC0146bg2 != null) {
                    interfaceC0146bg2.bg(drawableIL);
                }
            }
        });
    }

    public boolean bg(byte[] bArr) {
        return com.bytedance.sdk.component.adexpress.eqN.ldr.bg(bArr, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.graphics.drawable.Drawable IL(byte[] bArr) {
        java.io.FileOutputStream fileOutputStream;
        try {
            boolean zBX = com.bytedance.sdk.openadsdk.multipro.IL.bX();
            java.io.File fileBg = com.bytedance.sdk.component.utils.ldr.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), zBX, zBX ? "UGEN_GIF_AD_CACHE/" : "/UGEN_GIF_CACHE/", "TT_UGEN_GIF_FILE");
            fileOutputStream = new java.io.FileOutputStream(fileBg);
            try {
                fileOutputStream.write(bArr, 0, bArr.length);
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    android.graphics.drawable.Drawable drawableDecodeDrawable = android.graphics.ImageDecoder.decodeDrawable(android.graphics.ImageDecoder.createSource(fileBg));
                    try {
                        fileOutputStream.close();
                    } catch (java.lang.Throwable unused) {
                    }
                    return drawableDecodeDrawable;
                }
                android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(com.bytedance.sdk.openadsdk.core.VzQ.bg().getResources(), android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
                try {
                    fileOutputStream.close();
                } catch (java.lang.Throwable unused2) {
                }
                return bitmapDrawable;
            } catch (java.lang.Throwable th) {
                th = th;
                try {
                    com.bytedance.sdk.component.utils.PX.bg("ImageLoaderProvider", "GifView  getSourceByFile fail : ", th);
                    return null;
                } finally {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.lang.Throwable unused3) {
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bg
    public void bg(com.bytedance.adsdk.ugeno.core.Kg kg, java.lang.String str, com.bytedance.adsdk.ugeno.bg.InterfaceC0086bg interfaceC0086bg) {
        IL(kg, bg(str), interfaceC0086bg);
    }

    public void IL(com.bytedance.adsdk.ugeno.core.Kg kg, java.lang.String str, final com.bytedance.adsdk.ugeno.bg.InterfaceC0086bg interfaceC0086bg) {
        com.bytedance.sdk.component.zx.eo eoVarBX = com.bytedance.sdk.openadsdk.WR.eqN.bg(str).bX(1);
        bg(kg, eoVarBX, str);
        eoVarBX.bg(new com.bytedance.sdk.component.zx.xxp() { // from class: com.bytedance.sdk.openadsdk.core.VB.bg.5
            @Override // com.bytedance.sdk.component.zx.xxp
            public void bg(com.bytedance.sdk.component.zx.VB vb) {
                if (vb == null) {
                    interfaceC0086bg.bg(null);
                    return;
                }
                if (interfaceC0086bg != null) {
                    java.lang.Object objIL = vb.IL();
                    if (objIL instanceof android.graphics.Bitmap) {
                        interfaceC0086bg.bg((android.graphics.Bitmap) objIL);
                        return;
                    }
                    if (vb.IL() instanceof byte[]) {
                        try {
                            interfaceC0086bg.bg(android.graphics.BitmapFactory.decodeByteArray((byte[]) vb.IL(), 0, ((byte[]) vb.IL()).length));
                            return;
                        } catch (java.lang.Throwable unused) {
                        }
                    }
                    interfaceC0086bg.bg(null);
                }
            }

            @Override // com.bytedance.sdk.component.zx.xxp
            public void bg(int i, java.lang.String str2, java.lang.Throwable th) {
                com.bytedance.adsdk.ugeno.bg.InterfaceC0086bg interfaceC0086bg2 = interfaceC0086bg;
                if (interfaceC0086bg2 != null) {
                    interfaceC0086bg2.bg(null);
                }
            }
        }, 4);
    }

    private void bg(com.bytedance.adsdk.ugeno.core.Kg kg, com.bytedance.sdk.component.zx.eo eoVar, java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.Object> mapIL;
        if (kg == null || (mapIL = kg.IL()) == null) {
            return;
        }
        java.lang.Object obj = mapIL.get("image_info");
        if (obj instanceof java.util.Map) {
            eoVar.bg((java.lang.String) ((java.util.Map) obj).get(str));
        }
        java.lang.String str2 = (java.lang.String) mapIL.get("cache_dir");
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        eoVar.IL(str2);
    }

    private java.lang.String bg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || str.startsWith("http://") || str.startsWith("https://")) {
            return str;
        }
        if (str.indexOf(46) < 0) {
            str = str + ".png";
        }
        return com.bytedance.sdk.openadsdk.core.settings.xxp.zU().jA() + "static/" + str;
    }
}
