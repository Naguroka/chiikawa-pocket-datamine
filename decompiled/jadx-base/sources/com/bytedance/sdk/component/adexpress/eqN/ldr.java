package com.bytedance.sdk.component.adexpress.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class ldr {
    private static final byte[] bg = bg("VP8X");

    private static byte[] bg(java.lang.String str) {
        try {
            return str.getBytes("ASCII");
        } catch (java.io.UnsupportedEncodingException unused) {
            return new byte[1];
        }
    }

    private static void bX(android.widget.ImageView imageView, byte[] bArr, int i, int i2) {
        eqN(imageView, bArr, i, i2);
    }

    public static void bg(android.widget.ImageView imageView, byte[] bArr, int i, int i2) {
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            try {
                imageView.setImageDrawable(android.graphics.ImageDecoder.decodeDrawable(android.graphics.ImageDecoder.createSource(byteBufferWrap)));
            } catch (java.io.IOException unused) {
            }
        } else {
            eqN(imageView, bArr, i, i2);
        }
    }

    private static void eqN(android.widget.ImageView imageView, byte[] bArr, int i, int i2) {
        android.graphics.Bitmap bitmapBg = new com.bytedance.sdk.component.zx.bX.IL.bg(i, i2, imageView.getScaleType(), android.graphics.Bitmap.Config.ARGB_4444, i, i2).bg(bArr);
        if (bitmapBg != null) {
            imageView.setImageBitmap(bitmapBg);
        }
    }

    public static void IL(android.widget.ImageView imageView, byte[] bArr, int i, int i2) {
        if (android.text.TextUtils.equals("png", com.bytedance.sdk.component.utils.Kg.bg(java.util.Arrays.copyOfRange(bArr, 0, com.bytedance.sdk.component.utils.Kg.bg())))) {
            bX(imageView, bArr, i, i2);
        } else {
            bg(imageView, bArr, i, i2);
        }
    }

    public static boolean bg(byte[] bArr, int i) {
        try {
            boolean zBg = bg(bArr, i + 12, bg);
            int i2 = i + 20;
            if (bArr.length <= i2) {
                return false;
            }
            boolean z = (bArr[i2] & 2) == 2;
            if (zBg && z) {
                return true;
            }
        } catch (java.lang.Throwable unused) {
        }
        return false;
    }

    private static boolean bg(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
