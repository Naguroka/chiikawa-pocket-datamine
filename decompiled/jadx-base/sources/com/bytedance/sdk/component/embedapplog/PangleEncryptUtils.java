package com.bytedance.sdk.component.embedapplog;

/* JADX INFO: loaded from: classes3.dex */
class PangleEncryptUtils {
    private static native byte[] ttDecrypt(byte[] bArr, int i);

    private static native byte[] ttEncrypt(byte[] bArr, int i);

    PangleEncryptUtils() {
    }

    static {
        try {
            java.lang.System.loadLibrary("tobEmbedPagEncrypt");
        } catch (java.lang.UnsatisfiedLinkError e) {
            android.util.Log.e("pangle-encrypt", e.getMessage());
        }
    }

    static byte[] encrypt(byte[] bArr, int i) {
        try {
            return ttEncrypt(bArr, i);
        } catch (java.lang.Throwable th) {
            android.util.Log.e("pangle-encrypt", "encrypt exception " + th.getMessage());
            return null;
        }
    }

    static byte[] decrypt(byte[] bArr, int i) {
        try {
            return ttDecrypt(bArr, i);
        } catch (java.lang.Throwable th) {
            android.util.Log.e("pangle-encrypt", "decrypt exception " + th.getMessage());
            return null;
        }
    }
}
