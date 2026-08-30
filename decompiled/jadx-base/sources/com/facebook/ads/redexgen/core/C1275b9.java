package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1275b9<T> implements com.facebook.ads.redexgen.core.InterfaceC03942z<T> {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"iLl0wsw23K5yUh77EmQ7aS", "GfoEaaBl8U8k0Q7PfB9fbljrax1waY16", "5gtDUT", "ShV5kwK9yY", "0fmlK", "YYoW0eMgewTEbJ6HTbYGGS2KWNlxhaI9", "", "sW1q2ctPu7RNrNZv5Ej0VW9PcKYvvqLT"};
    public int A00;
    public final java.lang.Object[] A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[0].length() == 2) {
                throw new java.lang.RuntimeException();
            }
            A03[0] = "a39lLlVm2wZ";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 94);
            i4++;
        }
    }

    public static void A01() {
        A02 = new byte[]{-15, 28, 34, 21, 17, 20, 41, -48, 25, 30, -48, 36, 24, 21, -48, 32, 31, 31, 28, -47, -63, -43, -46, -115, -38, -50, -27, -115, -35, -36, -36, -39, -115, -32, -42, -25, -46, -115, -38, -30, -32, -31, -115, -49, -46, -115, -85, -115, -99};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.b9 != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    public C1275b9(int i) {
        if (i > 0) {
            this.A01 = new java.lang.Object[i];
            return;
        }
        throw new java.lang.IllegalArgumentException(A00(20, 29, 15));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.b9 != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    private boolean A02(T instance) {
        for (int i = 0; i < i; i++) {
            if (this.A01[i] == instance) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.b9 != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC03942z
    public T A2x() {
        if (this.A00 <= 0) {
            return null;
        }
        int i = this.A00 - 1;
        T t = (T) this.A01[i];
        this.A01[i] = null;
        if (A03[1].charAt(25) == 't') {
            throw new java.lang.RuntimeException();
        }
        A03[1] = "CkflbgsNAkMx06fZnMm4opLTGkpn7A2i";
        this.A00--;
        return t;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.b9 != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC03942z
    public boolean AF1(T t) {
        if (!A02(t)) {
            int i = this.A00;
            java.lang.Object[] objArr = this.A01;
            if (A03[3].length() == 20) {
                throw new java.lang.RuntimeException();
            }
            A03[4] = "en1OjK";
            if (i < objArr.length) {
                this.A01[this.A00] = t;
                this.A00++;
                return true;
            }
            return false;
        }
        throw new java.lang.IllegalStateException(A00(0, 20, 82));
    }
}
