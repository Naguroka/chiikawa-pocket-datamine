package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC04816k {
    public static byte[] A00;

    static {
        A04();
    }

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 31);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{2, 6, 10, 12, 14};
    }

    public static int A00(android.graphics.BitmapFactory.Options options, int halfWidth, int i) {
        int width = options.outHeight;
        int height = options.outWidth;
        int halfHeight = 1;
        if (width > i || height > halfWidth) {
            int inSampleSize = width / 2;
            int width2 = height / 2;
            while (inSampleSize / halfHeight >= i && width2 / halfHeight >= halfWidth) {
                halfHeight *= 2;
            }
        }
        return halfHeight;
    }

    public static android.graphics.Bitmap A01(java.io.InputStream inputStream, int i, int i2) throws java.io.IOException {
        if (android.os.Build.VERSION.SDK_INT < 19) {
            return android.graphics.BitmapFactory.decodeStream(inputStream);
        }
        com.facebook.ads.redexgen.core.C0N c0n = new com.facebook.ads.redexgen.core.C0N(inputStream);
        c0n.mark(8192);
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        android.graphics.BitmapFactory.decodeStream(c0n, null, options);
        c0n.reset();
        if (!c0n.A00()) {
            options.inSampleSize = A00(options, i2, i);
            options.inJustDecodeBounds = false;
            return android.graphics.BitmapFactory.decodeStream(c0n, null, options);
        }
        return android.graphics.BitmapFactory.decodeStream(c0n);
    }

    public static android.graphics.Bitmap A02(java.lang.String str, int i, int i2, com.facebook.ads.redexgen.core.C7j c7j) {
        try {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            android.graphics.BitmapFactory.decodeFile(str, options);
            options.inSampleSize = A00(options, i2, i);
            options.inJustDecodeBounds = false;
            return android.graphics.BitmapFactory.decodeFile(str, options);
        } catch (java.lang.Throwable t) {
            c7j.A07().AA0(A03(0, 5, 116), com.facebook.ads.redexgen.core.C8E.A1h, new com.facebook.ads.redexgen.core.C8F(t));
            return null;
        }
    }
}
