package com.bytedance.sdk.component.utils;

/* JADX INFO: loaded from: classes3.dex */
public class eqN {
    public static android.graphics.Bitmap bg(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bArrDecode = android.util.Base64.decode(str, 0);
            return android.graphics.BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static byte[] bg(android.graphics.Bitmap bitmap) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(bitmap.getByteCount());
        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static android.graphics.Bitmap bg(android.graphics.Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        if (i <= 0 || i2 <= 0) {
            return bitmap;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (i < width && i2 < height) {
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                matrix.postScale(i / width, i2 / height);
                return android.graphics.Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
            }
            return bitmap;
        } catch (java.lang.Throwable th) {
            th.getMessage();
            return null;
        }
    }
}
