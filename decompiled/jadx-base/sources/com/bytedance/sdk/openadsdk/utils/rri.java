package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class rri {
    private static final java.lang.ThreadLocal<java.security.SecureRandom> bg = new java.lang.ThreadLocal<>();

    public static java.lang.String bg() {
        byte[] bArr = new byte[16];
        java.lang.ThreadLocal<java.security.SecureRandom> threadLocal = bg;
        java.security.SecureRandom secureRandom = threadLocal.get();
        if (secureRandom == null) {
            secureRandom = new java.security.SecureRandom();
            threadLocal.set(secureRandom);
        }
        secureRandom.nextBytes(bArr);
        byte b = (byte) (bArr[6] & 15);
        bArr[6] = b;
        bArr[6] = (byte) (b | 64);
        byte b2 = (byte) (bArr[8] & okio.Utf8.REPLACEMENT_BYTE);
        bArr[8] = b2;
        bArr[8] = (byte) (b2 | 128);
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < 8; i++) {
            j2 = (j2 << 8) | ((long) (bArr[i] & 255));
        }
        for (int i2 = 8; i2 < 16; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return new java.util.UUID(j2, j).toString();
    }
}
