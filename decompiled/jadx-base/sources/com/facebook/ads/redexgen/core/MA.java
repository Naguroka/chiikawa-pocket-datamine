package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class MA {
    public static android.graphics.Bitmap A00(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.graphics.Bitmap bitmap, int i) throws android.renderscript.RSRuntimeException {
        android.renderscript.RenderScript renderScriptCreate = null;
        android.renderscript.Allocation allocationCreateFromBitmap = null;
        android.renderscript.Allocation output = null;
        android.renderscript.ScriptIntrinsicBlur scriptIntrinsicBlurCreate = null;
        try {
            renderScriptCreate = android.renderscript.RenderScript.create(c1199Zs);
            renderScriptCreate.setMessageHandler(new android.renderscript.RenderScript.RSMessageHandler());
            allocationCreateFromBitmap = android.renderscript.Allocation.createFromBitmap(renderScriptCreate, bitmap, android.renderscript.Allocation.MipmapControl.MIPMAP_NONE, 1);
            output = android.renderscript.Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
            scriptIntrinsicBlurCreate = android.renderscript.ScriptIntrinsicBlur.create(renderScriptCreate, android.renderscript.Element.U8_4(renderScriptCreate));
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.setRadius(i);
            scriptIntrinsicBlurCreate.forEach(output);
            output.copyTo(bitmap);
            return bitmap;
        } finally {
            if (renderScriptCreate != null) {
                renderScriptCreate.destroy();
            }
            if (allocationCreateFromBitmap != null) {
                allocationCreateFromBitmap.destroy();
            }
            if (output != null) {
                output.destroy();
            }
            if (scriptIntrinsicBlurCreate != null) {
                scriptIntrinsicBlurCreate.destroy();
            }
        }
    }

    public static android.graphics.Bitmap A01(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.graphics.Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth() / i2;
        int height = bitmap.getHeight() / i2;
        if (width == 0 || height == 0) {
            return null;
        }
        int height2 = android.os.Build.VERSION.SDK_INT;
        if (height2 < 18) {
            return null;
        }
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(width, height, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        canvas.scale(1.0f / i2, 1.0f / i2);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setFlags(3);
        paint.setColorFilter(new android.graphics.PorterDuffColorFilter(0, android.graphics.PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        try {
            android.graphics.Bitmap bitmapA00 = A00(c1199Zs, bitmapCreateBitmap, i);
            if (i2 != 1) {
                int height3 = bitmap.getWidth();
                int width2 = bitmap.getHeight();
                android.graphics.Bitmap bitmapCreateScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmapA00, height3, width2, true);
                bitmapA00.recycle();
                return bitmapCreateScaledBitmap;
            }
            return bitmapA00;
        } catch (android.renderscript.RSRuntimeException unused) {
            return new com.facebook.ads.redexgen.core.C1086Vf().A02(bitmapCreateBitmap, i);
        }
    }
}
