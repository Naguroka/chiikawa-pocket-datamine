package com.bytedance.sdk.component.utils;

/* JADX INFO: loaded from: classes3.dex */
public class Kg {
    private static final byte[] IL;
    private static final byte[] bX;
    private static final byte[] bg;
    private static final byte[] eqN;
    private static final int iR;
    private static final byte[] ldr;
    private static final byte[] zx;

    static {
        byte[] bArr = {-1, -40, -1};
        bg = bArr;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, 26, 10};
        IL = bArr2;
        byte[] bArr3 = {0, 0, 1, 0};
        bX = bArr3;
        byte[] bArrBg = bg("BM");
        eqN = bArrBg;
        zx = bg("GIF87a");
        ldr = bg("GIF89a");
        iR = ((java.lang.Integer) java.util.Collections.max(java.util.Arrays.asList(java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(bArr2.length), java.lang.Integer.valueOf(bArr3.length), java.lang.Integer.valueOf(bArrBg.length), 6))).intValue();
    }

    public static int bg() {
        return iR;
    }

    public static final java.lang.String bg(byte[] bArr) {
        if (IL(bArr)) {
            return "jpeg";
        }
        if (bX(bArr)) {
            return "png";
        }
        if (eqN(bArr)) {
            return "gif";
        }
        if (zx(bArr)) {
            return "bmp";
        }
        return ldr(bArr) ? "ico" : "other";
    }

    private static boolean IL(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = bg;
        return length >= bArr2.length && bg(bArr, bArr2);
    }

    private static boolean bX(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = IL;
        return length >= bArr2.length && bg(bArr, bArr2);
    }

    private static boolean eqN(byte[] bArr) {
        return (bArr.length >= 6 && bg(bArr, zx)) || bg(bArr, ldr);
    }

    private static boolean zx(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = eqN;
        return length >= bArr2.length && bg(bArr, bArr2);
    }

    private static boolean ldr(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = bX;
        return length >= bArr2.length && bg(bArr, bArr2);
    }

    private static boolean bg(byte[] bArr, byte[] bArr2) {
        return bg(bArr, bArr2, 0);
    }

    private static boolean bg(byte[] bArr, byte[] bArr2, int i) {
        if (bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static byte[] bg(java.lang.String str) {
        try {
            return str.getBytes("ASCII");
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.RuntimeException("ASCII not found!", e);
        }
    }
}
