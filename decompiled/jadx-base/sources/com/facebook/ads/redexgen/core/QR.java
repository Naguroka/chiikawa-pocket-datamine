package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class QR {
    public static boolean A00;
    public static byte[] A01;
    public static java.lang.String[] A02 = {"LOnHKZUk03MjG3VYzMMYiec9SpPsFOh7", "Pbkw0DRwc7jrPzgwHcPKSBrc9yMoULer", "Hj", "S7", "LLbZvFImhG4qXHtXSuU8lE9QXb8BQ4aR", "3BEuw5zYnH62E4dXOlScK8tmPuoX0Dzi", "Tjz3D17CMTsDMz51rRXrrUvPJCeC", "mII8e5HllIg"};

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 60);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{81, 124, 102, 101, 121, 116, 108, 88, 112, 97, 103, 124, 118, 102, 53, 124, 102, 53, 123, 96, 121, 121, 59, 25, 46, 56, 36, 62, 57, 40, 46, 56, 107, 34, 56, 107, 37, 62, 39, 39, 101, 37, 18, 31, 26, 23, 18, 7, 26, 28, 29, 83, 21, 18, 26, 31, 22, 23, 93, 107, 105, 106};
    }

    static {
        A03();
        A00 = true;
    }

    public static android.graphics.drawable.BitmapDrawable A00(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.String str) {
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] bArrDecode = android.util.Base64.decode(str, 0);
            android.graphics.Bitmap overlayBm = android.graphics.BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            if (overlayBm != null && (!A00 || A05(c1199Zs, overlayBm))) {
                android.graphics.drawable.BitmapDrawable overlayRepeat = new android.graphics.drawable.BitmapDrawable(overlayBm);
                overlayRepeat.setTileModeXY(android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.REPEAT);
                android.content.res.Resources resources = c1199Zs.getResources();
                if (resources != null) {
                    android.util.DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    if (displayMetrics != null) {
                        overlayRepeat.setTargetDensity(displayMetrics.densityDpi);
                    } else {
                        A04(c1199Zs, A02(0, 23, 41));
                    }
                } else {
                    A04(c1199Zs, A02(23, 18, 119));
                }
                return overlayRepeat;
            }
            return null;
        } catch (java.lang.Throwable th) {
            c1199Zs.A07().AA0(A02(59, 3, 58), com.facebook.ads.redexgen.core.C8E.A1u, new com.facebook.ads.redexgen.core.C8F(th));
            return null;
        }
    }

    public static com.facebook.ads.redexgen.core.QS A01(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.String str) {
        android.graphics.drawable.BitmapDrawable bitmapDrawableA00;
        try {
            if (android.text.TextUtils.isEmpty(str) || (bitmapDrawableA00 = A00(c1199Zs, str)) == null) {
                return null;
            }
            com.facebook.ads.redexgen.core.QS qs = new com.facebook.ads.redexgen.core.QS(c1199Zs);
            int i = android.os.Build.VERSION.SDK_INT;
            if (A02[5].charAt(7) != 'Y') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A02;
            strArr[2] = "s0";
            strArr[3] = "kN";
            if (i >= 16) {
                qs.setBackground(bitmapDrawableA00);
            } else {
                qs.setBackgroundDrawable(bitmapDrawableA00);
            }
            qs.setClickable(false);
            qs.setFocusable(false);
            return qs;
        } catch (java.lang.Throwable th) {
            c1199Zs.A07().AA0(A02(59, 3, 58), com.facebook.ads.redexgen.core.C8E.A1u, new com.facebook.ads.redexgen.core.C8F(th));
            return null;
        }
    }

    public static void A04(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, java.lang.String str) {
        c1199Zs.A07().AA0(A02(59, 3, 58), com.facebook.ads.redexgen.core.C8E.A1u, new com.facebook.ads.redexgen.core.C8F(str));
    }

    public static boolean A05(com.facebook.ads.redexgen.core.C1199Zs c1199Zs, android.graphics.Bitmap bitmap) {
        for (int i = 0; i < x; i++) {
            for (int pixel = 0; pixel < x; pixel++) {
                int x = bitmap.getPixel(i, pixel);
                if (android.graphics.Color.alpha(x) / 255.0f > 0.03f) {
                    A04(c1199Zs, A02(41, 18, 79));
                    return false;
                }
            }
        }
        java.lang.String[] strArr = A02;
        if (strArr[2].length() != strArr[3].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A02;
        strArr2[0] = "LR4kTGqXNNTRbn07qZCCCo1h4xvtCqSD";
        strArr2[4] = "LZTU5gCJod3YylAEiVGeMzo2seGubyq7";
        return true;
    }
}
