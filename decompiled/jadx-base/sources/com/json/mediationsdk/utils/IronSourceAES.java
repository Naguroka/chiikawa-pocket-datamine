package com.json.mediationsdk.utils;

/* JADX INFO: loaded from: classes5.dex */
public class IronSourceAES {
    private static javax.crypto.spec.SecretKeySpec a(java.lang.String str) throws java.io.UnsupportedEncodingException {
        byte[] bArr = new byte[32];
        java.util.Arrays.fill(bArr, (byte) 0);
        byte[] bytes = str.getBytes(com.adjust.sdk.Constants.ENCODING);
        java.lang.System.arraycopy(bytes, 0, bArr, 0, bytes.length < 32 ? bytes.length : 32);
        return new javax.crypto.spec.SecretKeySpec(bArr, "AES");
    }

    public static synchronized java.lang.String compressAndEncrypt(java.lang.String str) {
        return compressAndEncrypt(com.json.jb.b().c(), str);
    }

    public static synchronized java.lang.String compressAndEncrypt(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            byte[] bArrA = com.json.sj.a(str2);
            if (bArrA != null) {
                return encodeFromBytes(str, bArrA);
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        return "";
    }

    public static synchronized java.lang.String decode(java.lang.String str, java.lang.String str2) {
        byte[] bArrDecodeToBytes = decodeToBytes(str, str2);
        if (bArrDecodeToBytes == null) {
            return "";
        }
        return new java.lang.String(bArrDecodeToBytes);
    }

    public static synchronized byte[] decodeToBytes(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            javax.crypto.spec.SecretKeySpec secretKeySpecA = a(str);
            byte[] bArr = new byte[16];
            java.util.Arrays.fill(bArr, (byte) 0);
            javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(bArr);
            byte[] bArrDecode = android.util.Base64.decode(str2, 0);
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(2, secretKeySpecA, ivParameterSpec);
            return cipher.doFinal(bArrDecode);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("exception on decryption error: " + e.getMessage());
            return null;
        }
    }

    public static synchronized java.lang.String decryptAndDecompress(java.lang.String str) {
        return decryptAndDecompress(com.json.jb.b().c(), str);
    }

    public static synchronized java.lang.String decryptAndDecompress(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            byte[] bArrDecodeToBytes = decodeToBytes(str, str2);
            if (bArrDecodeToBytes != null) {
                return com.json.sj.a(bArrDecodeToBytes);
            }
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        return "";
    }

    public static synchronized java.lang.String encode(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            return encodeFromBytes(str, str2.getBytes("UTF8"));
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    public static synchronized java.lang.String encodeFromBytes(java.lang.String str, byte[] bArr) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        if (bArr == null) {
            return "";
        }
        try {
            javax.crypto.spec.SecretKeySpec secretKeySpecA = a(str);
            byte[] bArr2 = new byte[16];
            java.util.Arrays.fill(bArr2, (byte) 0);
            javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(bArr2);
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKeySpecA, ivParameterSpec);
            return android.util.Base64.encodeToString(cipher.doFinal(bArr), 0).replaceAll(java.lang.System.getProperty("line.separator"), "");
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    public static synchronized java.lang.String encrypt(java.lang.String str) {
        return encode(com.json.jb.b().c(), str);
    }
}
