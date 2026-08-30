package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class bk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f2537a = 1024;
    public static final java.lang.String b = "RSA/ECB/PKCS1Padding";

    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return android.util.Base64.encodeToString(a(str.getBytes(com.adjust.sdk.Constants.ENCODING), a(str2)), 0).replaceAll(java.lang.System.getProperty("line.separator"), "");
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("exception on string encryption error: " + e.getMessage());
            return "";
        }
    }

    public static java.security.KeyPair a() {
        try {
            java.security.KeyPairGenerator keyPairGenerator = java.security.KeyPairGenerator.getInstance(b);
            keyPairGenerator.initialize(1024);
            return keyPairGenerator.genKeyPair();
        } catch (java.security.NoSuchAlgorithmException e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("exception on key generation error: " + e.getMessage());
            throw new java.lang.RuntimeException(e);
        }
    }

    private static java.security.interfaces.RSAPublicKey a(java.lang.String str) throws java.security.spec.InvalidKeySpecException, java.security.NoSuchAlgorithmException, java.io.UnsupportedEncodingException {
        return (java.security.interfaces.RSAPublicKey) java.security.KeyFactory.getInstance("RSA").generatePublic(new java.security.spec.X509EncodedKeySpec(android.util.Base64.decode(str, 0)));
    }

    public static byte[] a(byte[] bArr, java.security.PrivateKey privateKey) {
        try {
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(b);
            cipher.init(2, privateKey);
            return cipher.doFinal(bArr);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("exception on decryption error: " + e.getMessage());
            throw new java.lang.RuntimeException(e);
        }
    }

    public static byte[] a(byte[] bArr, java.security.PublicKey publicKey) {
        try {
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(b);
            cipher.init(1, publicKey);
            return cipher.doFinal(bArr);
        } catch (java.lang.Exception e) {
            com.json.l9.d().a(e);
            com.json.mediationsdk.logger.IronLog.INTERNAL.error("exception on encryption error: " + e.getMessage());
            throw new java.lang.RuntimeException(e);
        }
    }
}
