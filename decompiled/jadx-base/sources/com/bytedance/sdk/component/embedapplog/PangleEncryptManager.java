package com.bytedance.sdk.component.embedapplog;

/* JADX INFO: loaded from: classes3.dex */
public class PangleEncryptManager {
    public static final int CYPHER_VERSION_V4 = 4;
    public static final java.lang.String KEY_CYPHER = "cypher";

    public static byte[] encryptV3(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return com.bytedance.sdk.component.embedapplog.PangleEncryptUtils.encrypt(bArr, bArr.length);
    }

    public static byte[] decryptV3(byte[] bArr, int i) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return com.bytedance.sdk.component.embedapplog.PangleEncryptUtils.decrypt(bArr, bArr.length);
    }

    public static org.json.JSONObject encryptType4(org.json.JSONObject jSONObject, com.bytedance.sdk.component.embedapplog.IDefaultEncrypt iDefaultEncrypt) {
        return com.bytedance.sdk.component.embedapplog.PangleEncryptUtilsType4.encrypt(jSONObject, iDefaultEncrypt);
    }

    public static android.util.Pair<java.lang.Integer, byte[]> encryptType4WithoutBase64(byte[] bArr) {
        return com.bytedance.sdk.component.embedapplog.PangleEncryptUtilsType4.encryptWithoutBase64(bArr);
    }

    public static android.util.Pair<java.lang.Integer, java.lang.String> decryptType4(java.lang.String str) {
        return com.bytedance.sdk.component.embedapplog.PangleEncryptUtilsType4.decrypt(str);
    }
}
