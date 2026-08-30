package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0I, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0I {
    public static byte[] A00;
    public static final java.lang.String A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 17);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{91, 78, 76, 6, 52, 3, 3, 30, 3, 81, 18, 29, 30, 2, 24, 31, 22, 81, 3, 20, 2, 30, 4, 3, 18, 20, 107, 98, 19};
    }

    static {
        A04();
        A01 = com.facebook.ads.redexgen.core.C0I.class.getSimpleName();
    }

    public static java.lang.String A01(java.lang.String str) {
        android.webkit.MimeTypeMap singleton = android.webkit.MimeTypeMap.getSingleton();
        java.lang.String extension = android.webkit.MimeTypeMap.getFileExtensionFromUrl(str);
        if (android.text.TextUtils.isEmpty(extension)) {
            return null;
        }
        return singleton.getMimeTypeFromExtension(extension);
    }

    public static java.lang.String A02(java.lang.String str) {
        try {
            return A03(java.security.MessageDigest.getInstance(A00(26, 3, 55)).digest(str.getBytes()));
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public static java.lang.String A03(byte[] bArr) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (byte b : bArr) {
            stringBuffer.append(java.lang.String.format(java.util.Locale.US, A00(0, 4, 111), java.lang.Byte.valueOf(b)));
        }
        return stringBuffer.toString();
    }

    public static void A05(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException e) {
                android.util.Log.e(A01, A00(4, 22, 96), e);
            }
        }
    }
}
