package com.bytedance.sdk.component.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    private static java.lang.String bg;

    @java.lang.Deprecated
    public static java.lang.String bg(java.lang.String str, java.lang.String str2) {
        try {
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(str2.getBytes(), "AES");
            if (android.text.TextUtils.isEmpty(bg)) {
                bg = bg("AES/CBC/PKCS5Padding");
            }
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(bg);
            cipher.init(1, secretKeySpec);
            return android.util.Base64.encodeToString(cipher.doFinal(str.getBytes(com.json.zb.N)), 0);
        } catch (java.lang.Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public static java.lang.String bg(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(str3.getBytes(), "AES");
        try {
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, new javax.crypto.spec.IvParameterSpec(str2.getBytes()));
            return android.util.Base64.encodeToString(cipher.doFinal(str.getBytes(com.json.zb.N)), 0);
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.IL(th.getMessage());
            return null;
        }
    }

    public static java.lang.String IL(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bArrDecode = android.util.Base64.decode(str, 0);
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(str3.getBytes(), "AES");
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new javax.crypto.spec.IvParameterSpec(str2.getBytes()));
            return new java.lang.String(cipher.doFinal(bArrDecode));
        } catch (java.lang.Throwable th) {
            com.bytedance.sdk.component.utils.PX.IL(th.getMessage());
            return null;
        }
    }

    @java.lang.Deprecated
    public static java.lang.String IL(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bArrDecode = android.util.Base64.decode(str, 0);
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(str2.getBytes(), "AES");
            if (android.text.TextUtils.isEmpty(bg)) {
                bg = bg("AES/CBC/PKCS5Padding");
            }
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(bg);
            cipher.init(2, secretKeySpec);
            return new java.lang.String(cipher.doFinal(bArrDecode));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.lang.String bg(java.lang.String str) {
        int[] iArr = new int[str.length()];
        iArr[4] = 6;
        iArr[5] = 1;
        iArr[6] = 1;
        return new java.lang.String(bg(str.getBytes(), iArr));
    }

    public static byte[] bg(byte[] bArr, int[] iArr) {
        if (bArr == null || bArr.length == 0 || iArr == null || iArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = (byte) (bArr[i] ^ iArr[i % iArr.length]);
        }
        return bArr2;
    }
}
