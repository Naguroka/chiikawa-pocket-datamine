package com.bytedance.sdk.component.utils;

/* JADX INFO: loaded from: classes3.dex */
public class zx {
    private static final char[] bg = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static java.lang.String bg(byte[] bArr) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("bytes is null");
        }
        return bg(bArr, 0, bArr.length);
    }

    public static java.lang.String bg(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("bytes is null");
        }
        if (i < 0 || i + i2 > bArr.length) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        int i3 = i2 * 2;
        char[] cArr = new char[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = bArr[i5 + i] & 255;
            int i7 = i4 + 1;
            char[] cArr2 = bg;
            cArr[i4] = cArr2[i6 >> 4];
            i4 = i7 + 1;
            cArr[i7] = cArr2[i6 & 15];
        }
        return new java.lang.String(cArr, 0, i3);
    }

    public static java.lang.String bg(java.io.File file) {
        java.io.FileInputStream fileInputStream;
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            if (messageDigest == null) {
                return null;
            }
            fileInputStream = new java.io.FileInputStream(file);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr, 0, 8192);
                    if (i <= 0) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i);
                }
                java.lang.String strBg = bg(messageDigest.digest());
                try {
                    fileInputStream.close();
                } catch (java.lang.Exception unused) {
                }
                return strBg;
            } catch (java.lang.Throwable unused2) {
            }
        } catch (java.lang.Throwable unused3) {
            fileInputStream = null;
        }
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (java.lang.Exception unused4) {
            }
        }
        return null;
    }

    public static java.lang.String bg(java.lang.String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
                    messageDigest.update(str.getBytes(com.adjust.sdk.Constants.ENCODING));
                    return bg(messageDigest.digest());
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return null;
    }
}
