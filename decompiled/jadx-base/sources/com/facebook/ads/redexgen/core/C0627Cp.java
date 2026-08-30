package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0627Cp {
    public static byte[] A0B;
    public static java.lang.String[] A0C = {"M4x7QQAOQI6QpLL27N40r77s8H3llNt7", "VbZ8gbE", "3mu4QP6lx6JwSRsSGHM9", "iNtvqmskXB4EiLFcreKpIjIsuOWl8BZN", "UGy7XP0WguBLL8fH3nmB9M42lC44", "4IqsIePyereERaJF3xBx8LZ4CJfzZOfk", "eqBm2QP", "urYUV7oulzGfvchXsojW"};
    public static final int A0D;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public final int[] A09 = new int[255];
    public final com.facebook.ads.redexgen.core.I4 A0A = new com.facebook.ads.redexgen.core.I4(255);

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 95);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A0B = new byte[]{24, 48, 48, 4, 11, 22, 30, 11, 13, 26, 11, 10, 78, 33, 9, 9, kotlin.io.encoding.Base64.padSymbol, 78, 13, 15, 30, 26, 27, 28, 11, 78, 30, 15, 26, 26, 11, 28, 0, 78, 15, 26, 78, 12, 11, 9, 7, 0, 78, 1, 8, 78, 30, 15, 9, 11, 44, 55, 42, 44, 41, 41, 54, 43, 45, 60, kotlin.io.encoding.Base64.padSymbol, 121, 59, 48, 45, 121, 42, 45, 43, 60, 56, 52, 121, 43, 60, 47, 48, 42, 48, 54, 55};
    }

    static {
        A01();
        A0D = com.facebook.ads.redexgen.core.IK.A08(A00(0, 4, 8));
    }

    public final void A02() {
        this.A03 = 0;
        this.A04 = 0;
        this.A05 = 0L;
        this.A08 = 0L;
        this.A07 = 0L;
        this.A06 = 0L;
        this.A02 = 0;
        this.A01 = 0;
        this.A00 = 0;
    }

    public final boolean A03(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, boolean z) throws java.lang.InterruptedException, java.io.IOException {
        this.A0A.A0V();
        A02();
        boolean hasEnoughBytes = interfaceC0610By.A7g() == -1 || interfaceC0610By.A7g() - interfaceC0610By.A81() >= 27;
        if (hasEnoughBytes) {
            boolean hasEnoughBytes2 = interfaceC0610By.AEP(this.A0A.A00, 0, 27, true);
            if (hasEnoughBytes2) {
                if (this.A0A.A0M() != A0D) {
                    if (z) {
                        return false;
                    }
                    throw new com.facebook.ads.redexgen.core.A0(A00(4, 46, 49));
                }
                this.A03 = this.A0A.A0E();
                if (A0C[4].length() == 23) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0C;
                strArr[2] = "QaTpKwTFDbpFrUb1B9Gy";
                strArr[7] = "wbjClO29YNoAV26336Re";
                if (this.A03 != 0) {
                    if (z) {
                        return false;
                    }
                    throw new com.facebook.ads.redexgen.core.A0(A00(50, 31, 6));
                }
                this.A04 = this.A0A.A0E();
                this.A05 = this.A0A.A0J();
                this.A08 = this.A0A.A0K();
                this.A07 = this.A0A.A0K();
                this.A06 = this.A0A.A0K();
                this.A02 = this.A0A.A0E();
                this.A01 = this.A02 + 27;
                this.A0A.A0V();
                interfaceC0610By.AEO(this.A0A.A00, 0, this.A02);
                for (int i = 0; i < this.A02; i++) {
                    this.A09[i] = this.A0A.A0E();
                    int i2 = this.A00;
                    this.A00 = i2 + this.A09[i];
                }
                return true;
            }
        }
        if (z) {
            return false;
        }
        throw new java.io.EOFException();
    }
}
