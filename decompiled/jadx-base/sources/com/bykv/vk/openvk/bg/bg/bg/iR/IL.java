package com.bykv.vk.openvk.bg.bg.bg.iR;

/* JADX INFO: loaded from: classes3.dex */
public class IL {
    private static final java.security.MessageDigest bg = bg();
    private static final char[] IL = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private IL() {
    }

    private static java.security.MessageDigest bg() {
        try {
            return java.security.MessageDigest.getInstance("md5");
        } catch (java.security.NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static java.lang.String bg(java.lang.String str) {
        byte[] bArrDigest;
        java.security.MessageDigest messageDigest = bg;
        if (messageDigest == null || android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes(java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING));
        synchronized (com.bykv.vk.openvk.bg.bg.bg.iR.IL.class) {
            bArrDigest = messageDigest.digest(bytes);
        }
        return bg(bArrDigest);
    }

    public static java.lang.String bg(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = IL;
            cArr[i] = cArr2[(b & 240) >> 4];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new java.lang.String(cArr);
    }
}
