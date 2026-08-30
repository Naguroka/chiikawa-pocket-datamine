package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class CM {
    public static byte[] A03;
    public static final long[] A04;
    public int A00;
    public int A01;
    public final byte[] A02 = new byte[8];

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 103);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-38, -5, -84, 2, -19, -8, -11, -16, -84, 2, -19, -2, -11, -6, 0, -84, -8, -15, -6, -13, 0, -12, -84, -7, -19, -1, -9, -84, -14, -5, 1, -6, -16};
    }

    static {
        A03();
        A04 = new long[]{128, 64, 32, 16, 8, 4, 2, 1};
    }

    public static int A00(int i) {
        for (int i2 = 0; i2 < varIntLength; i2++) {
            if ((A04[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
        }
        return -1;
    }

    public static long A01(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= A04[i - 1] ^ (-1);
        }
        for (int i2 = 1; i2 < i; i2++) {
            long varint = bArr[i2];
            j = (j << 8) | (varint & 255);
        }
        return j;
    }

    public final int A04() {
        return this.A00;
    }

    public final long A05(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, boolean z, boolean z2, int i) throws java.lang.InterruptedException, java.io.IOException {
        if (this.A01 == 0) {
            if (!interfaceC0610By.AEp(this.A02, 0, 1, z)) {
                return -1L;
            }
            int firstByte = this.A02[0] & 255;
            this.A00 = A00(firstByte);
            if (this.A00 != -1) {
                this.A01 = 1;
            } else {
                throw new java.lang.IllegalStateException(A02(0, 33, 37));
            }
        }
        int firstByte2 = this.A00;
        if (firstByte2 > i) {
            this.A01 = 0;
            return -2L;
        }
        if (this.A00 != 1) {
            interfaceC0610By.readFully(this.A02, 1, this.A00 - 1);
        }
        this.A01 = 0;
        return A01(this.A02, this.A00, z2);
    }

    public final void A06() {
        this.A01 = 0;
        this.A00 = 0;
    }
}
