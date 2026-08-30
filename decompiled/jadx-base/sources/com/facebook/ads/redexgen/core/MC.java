package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class MC {
    public static android.graphics.Bitmap A00(android.graphics.Bitmap bitmap) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(-1.0f, 1.0f);
        matrix.postTranslate(bitmap.getWidth(), 0.0f);
        return android.graphics.Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static android.graphics.Bitmap A01(com.facebook.ads.redexgen.core.MB mb) {
        byte[] bArrDecode = android.util.Base64.decode(mb.A01(com.facebook.ads.redexgen.core.LP.A02), 0);
        return android.graphics.BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static android.graphics.Bitmap A02(com.facebook.ads.redexgen.core.MB mb) {
        byte[] bArrDecode = android.util.Base64.decode(mb.A01(com.facebook.ads.redexgen.core.LP.A02), 0);
        return A00(android.graphics.BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
    }

    public static android.graphics.drawable.Drawable A03(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, com.facebook.ads.redexgen.core.MB mb) {
        return new android.graphics.drawable.BitmapDrawable(c1199Zs.getResources(), A01(mb));
    }
}
