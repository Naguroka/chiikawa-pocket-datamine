package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tg {
    public static int b(byte[] bArr) {
        return bArr[9] & 255;
    }

    public static java.util.List a(byte[] bArr) {
        long jB = b(c(bArr));
        long jB2 = b(3840L);
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(a(jB));
        arrayList.add(a(jB2));
        return arrayList;
    }

    private static int c(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    private static long b(long j) {
        return (j * androidx.media3.common.C.NANOS_PER_SECOND) / 48000;
    }

    private static byte[] a(long j) {
        return java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong(j).array();
    }
}
