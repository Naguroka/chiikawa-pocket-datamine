package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class Base64Utils {
    public static byte[] decode(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return android.util.Base64.decode(str, 0);
    }

    public static byte[] decodeUrlSafe(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return android.util.Base64.decode(str, 10);
    }

    public static byte[] decodeUrlSafeNoPadding(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return android.util.Base64.decode(str, 11);
    }

    public static java.lang.String encode(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return android.util.Base64.encodeToString(bArr, 0);
    }

    public static java.lang.String encodeUrlSafe(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return android.util.Base64.encodeToString(bArr, 10);
    }

    public static java.lang.String encodeUrlSafeNoPadding(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return android.util.Base64.encodeToString(bArr, 11);
    }
}
