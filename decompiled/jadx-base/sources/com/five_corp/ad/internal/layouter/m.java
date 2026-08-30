package com.five_corp.ad.internal.layouter;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m {
    public static android.graphics.drawable.BitmapDrawable a(java.lang.String str, android.content.res.Resources resources, com.five_corp.ad.internal.logger.a aVar) {
        if (str == null) {
            return null;
        }
        try {
            byte[] bArrDecode = android.util.Base64.decode(str, 0);
            android.graphics.Bitmap bitmapDecodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            if (bitmapDecodeByteArray == null) {
                aVar.a(4, "WatermarkDrawableBuilder.build BitmapFactory.decodeByteArray failed, input: [" + str + com.ironsource.y8.i.e);
                return null;
            }
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(resources, bitmapDecodeByteArray);
            android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            bitmapDrawable.setTargetDensity(resources.getDisplayMetrics());
            return bitmapDrawable;
        } catch (java.lang.Exception e) {
            aVar.a(4, "WatermarkDrawableBuilder.build Base64.decode failed, input: [" + str + "], exception: " + android.util.Log.getStackTraceString(e));
            return null;
        }
    }
}
