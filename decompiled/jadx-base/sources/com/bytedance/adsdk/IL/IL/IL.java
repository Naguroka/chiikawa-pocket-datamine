package com.bytedance.adsdk.IL.IL;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    private static final java.lang.Object bg = new java.lang.Object();
    private final android.content.Context IL;
    private final java.lang.String bX;
    private com.bytedance.adsdk.IL.eqN eqN;
    private final java.util.Map<java.lang.String, com.bytedance.adsdk.IL.eo> zx;

    public IL(android.graphics.drawable.Drawable.Callback callback, java.lang.String str, com.bytedance.adsdk.IL.eqN eqn, java.util.Map<java.lang.String, com.bytedance.adsdk.IL.eo> map) {
        if (!android.text.TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.bX = str + '/';
        } else {
            this.bX = str;
        }
        this.zx = map;
        bg(eqn);
        if (!(callback instanceof android.view.View)) {
            this.IL = null;
        } else {
            this.IL = ((android.view.View) callback).getContext().getApplicationContext();
        }
    }

    public void bg(com.bytedance.adsdk.IL.eqN eqn) {
        this.eqN = eqn;
    }

    public android.graphics.Bitmap bg(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            com.bytedance.adsdk.IL.eo eoVar = this.zx.get(str);
            android.graphics.Bitmap bitmapEo = eoVar.eo();
            eoVar.bg(null);
            return bitmapEo;
        }
        android.graphics.Bitmap bitmapEo2 = this.zx.get(str).eo();
        IL(str, bitmap);
        return bitmapEo2;
    }

    public android.graphics.Bitmap bg(java.lang.String str) {
        com.bytedance.adsdk.IL.eo eoVar = this.zx.get(str);
        if (eoVar == null) {
            return null;
        }
        android.graphics.Bitmap bitmapEo = eoVar.eo();
        if (bitmapEo != null) {
            return bitmapEo;
        }
        com.bytedance.adsdk.IL.eqN eqn = this.eqN;
        if (eqn != null) {
            return eqn.bg(eoVar);
        }
        android.content.Context context = this.IL;
        if (context == null) {
            return null;
        }
        java.lang.String strKg = eoVar.Kg();
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = org.objectweb.asm.Opcodes.IF_ICMPNE;
        if (strKg.startsWith("data:") && strKg.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = android.util.Base64.decode(strKg.substring(strKg.indexOf(44) + 1), 0);
                return IL(str, android.graphics.BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (java.lang.IllegalArgumentException unused) {
                return null;
            }
        }
        try {
            if (android.text.TextUtils.isEmpty(this.bX)) {
                throw new java.lang.IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                android.graphics.Bitmap bitmapDecodeStream = android.graphics.BitmapFactory.decodeStream(context.getAssets().open(this.bX + strKg), null, options);
                if (bitmapDecodeStream == null) {
                    return null;
                }
                return IL(str, com.bytedance.adsdk.IL.ldr.ldr.bg(bitmapDecodeStream, eoVar.bg(), eoVar.IL()));
            } catch (java.lang.IllegalArgumentException unused2) {
                return null;
            }
        } catch (java.io.IOException unused3) {
            return null;
        }
    }

    public boolean bg(android.content.Context context) {
        return (context == null && this.IL == null) || this.IL.equals(context);
    }

    private android.graphics.Bitmap IL(java.lang.String str, android.graphics.Bitmap bitmap) {
        synchronized (bg) {
            this.zx.get(str).bg(bitmap);
        }
        return bitmap;
    }
}
