package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lkotlin/jvm/internal/Lambda;", "R", "Lkotlin/jvm/internal/FunctionBase;", "Ljava/io/Serializable;", "arity", "", "(I)V", "getArity", "()I", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AbstractC04866r<R> implements com.facebook.ads.redexgen.core.HY<R>, java.io.Serializable {
    public static byte[] A01;
    public final int A00;

    static {
        A04();
    }

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 115);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{60, 43, 32, 42, 43, 60, 2, 47, 35, 44, 42, 47, 26, 33, 29, 58, 60, 39, 32, 41, 102, 96, 96, 96, 103};
    }

    public AbstractC04866r(int i) {
        this.A00 = i;
    }

    public final java.lang.String toString() {
        java.lang.String strA01 = com.facebook.ads.redexgen.core.AbstractC1396d6.A01(this);
        com.facebook.ads.redexgen.core.C1397d7.A06(strA01, A03(0, 25, 61));
        return strA01;
    }
}
