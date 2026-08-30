package com.bytedance.adsdk.ugeno.iR;

/* JADX INFO: loaded from: classes3.dex */
public class Kg {
    private static android.util.TypedValue bX;
    private static final java.lang.Object IL = new java.lang.Object();
    public static android.os.Handler bg = new android.os.Handler(android.os.Looper.getMainLooper());

    public static float bg(android.content.Context context, java.lang.String str) {
        float f;
        float f2 = context.getResources().getDisplayMetrics().density;
        try {
            f = java.lang.Float.parseFloat(str);
        } catch (java.lang.NumberFormatException unused) {
            f = 0.0f;
        }
        return (f * f2) + 0.5f;
    }

    public static float bg(android.content.Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static int IL(android.content.Context context, float f) {
        float f2 = context.getResources().getDisplayMetrics().density;
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }

    public static android.graphics.Bitmap bg(android.content.Context context, android.graphics.Bitmap bitmap, int i) {
        try {
            if (android.os.Build.VERSION.SDK_INT < 26) {
                return null;
            }
            android.graphics.Bitmap bitmapCreateScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, java.lang.Math.round(bitmap.getWidth() * 0.2f), java.lang.Math.round(bitmap.getHeight() * 0.2f), false);
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmapCreateScaledBitmap);
            android.renderscript.RenderScript renderScriptCreate = android.renderscript.RenderScript.create(context);
            if (renderScriptCreate == null) {
                return null;
            }
            android.renderscript.ScriptIntrinsicBlur scriptIntrinsicBlurCreate = android.renderscript.ScriptIntrinsicBlur.create(renderScriptCreate, android.renderscript.Element.U8_4(renderScriptCreate));
            android.renderscript.Allocation allocationCreateFromBitmap = android.renderscript.Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
            android.renderscript.Allocation allocationCreateFromBitmap2 = android.renderscript.Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(i);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            return bitmapCreateBitmap;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static android.graphics.drawable.Drawable bg(android.content.Context context, int i) {
        return context.getDrawable(i);
    }

    public static boolean bg() {
        return android.os.Looper.getMainLooper() == android.os.Looper.myLooper();
    }

    public static void bg(java.lang.Runnable runnable) {
        if (bg()) {
            runnable.run();
        } else {
            bg.post(runnable);
        }
    }
}
