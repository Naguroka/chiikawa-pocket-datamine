package com.bytedance.sdk.component.embedapplog;

/* JADX INFO: loaded from: classes3.dex */
class PangleEncryptUtilsType4 {
    private static int getCryptFailedReason(int i) {
        switch (i) {
            case 501:
                return 6;
            case 502:
                return 4;
            case 503:
                return 1;
            case 504:
                return 3;
            case 505:
            case 506:
                return 2;
            default:
                return 0;
        }
    }

    PangleEncryptUtilsType4() {
    }

    static org.json.JSONObject encrypt(org.json.JSONObject jSONObject, com.bytedance.sdk.component.embedapplog.IDefaultEncrypt iDefaultEncrypt) {
        android.util.Pair<java.lang.Integer, org.json.JSONObject> pairCypher4Encrypt;
        try {
            pairCypher4Encrypt = com.bytedance.sdk.component.pglcrypt.PglCryptUtils.getInstance().cypher4Encrypt(jSONObject);
        } catch (java.lang.Throwable th) {
            android.util.Log.e("pangle-encrypt", "encrypt exception " + th.getMessage());
            pairCypher4Encrypt = null;
        }
        if (pairCypher4Encrypt != null && ((java.lang.Integer) pairCypher4Encrypt.first).intValue() == 0 && pairCypher4Encrypt.second != null) {
            return (org.json.JSONObject) pairCypher4Encrypt.second;
        }
        if (iDefaultEncrypt == null) {
            return null;
        }
        try {
            return iDefaultEncrypt.encrypt(jSONObject, pairCypher4Encrypt == null ? 0 : getCryptFailedReason(((java.lang.Integer) pairCypher4Encrypt.first).intValue()));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    static android.util.Pair<java.lang.Integer, byte[]> encryptWithoutBase64(byte[] bArr) {
        android.util.Pair<java.lang.Integer, byte[]> pairCypher4Encrypt;
        byte[] bArr2 = null;
        if (bArr == null) {
            return null;
        }
        try {
            pairCypher4Encrypt = com.bytedance.sdk.component.pglcrypt.PglCryptUtils.getInstance().cypher4Encrypt(bArr);
        } catch (java.lang.Throwable th) {
            android.util.Log.e("pangle-encrypt", "encrypt exception " + th.getMessage());
            pairCypher4Encrypt = null;
        }
        int cryptFailedReason = 0;
        if (pairCypher4Encrypt != null && ((java.lang.Integer) pairCypher4Encrypt.first).intValue() == 0 && pairCypher4Encrypt.second != null && ((byte[]) pairCypher4Encrypt.second).length > 0) {
            bArr2 = (byte[]) pairCypher4Encrypt.second;
        } else if (pairCypher4Encrypt != null) {
            cryptFailedReason = getCryptFailedReason(((java.lang.Integer) pairCypher4Encrypt.first).intValue());
        }
        return new android.util.Pair<>(java.lang.Integer.valueOf(cryptFailedReason), bArr2);
    }

    static android.util.Pair<java.lang.Integer, java.lang.String> decrypt(java.lang.String str) {
        try {
            android.util.Pair<java.lang.Integer, java.lang.String> pairCypher4Decrypt = com.bytedance.sdk.component.pglcrypt.PglCryptUtils.getInstance().cypher4Decrypt(str);
            return new android.util.Pair<>(java.lang.Integer.valueOf(getCryptFailedReason(((java.lang.Integer) pairCypher4Decrypt.first).intValue())), pairCypher4Decrypt.second);
        } catch (java.lang.Throwable th) {
            android.util.Log.e("pangle-encrypt", "decrypt exception " + th.getMessage());
            return new android.util.Pair<>(2, null);
        }
    }
}
