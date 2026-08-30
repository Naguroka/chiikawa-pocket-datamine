package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1177Yw extends com.facebook.ads.redexgen.core.BC {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"hKoa2yITZJ5k97cBUGvRmaJeewJ", "hPJiLAFD5JxPyt7IiL", "IjDuRYReq7EwKVoJGoAu0", "v", "6es3mjvaA3VWyPv3uj", "UGQAdGPABwkSCUhUUsZu2mkY3iozmckQ", "N9t7LqoVZtJBHPDtx6gFeqCCQFc4aoCh", "9LzPEDzojfUQvvnuUbV49lrk9sF9njiE"};
    public long A00;
    public java.nio.ByteBuffer A01;
    public final com.facebook.ads.redexgen.core.BF A02 = new com.facebook.ads.redexgen.core.BF();
    public final int A03;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 124);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{-24, 4, -24, 10, -38, 13, -2, -2, -3, 10, -72, 12, 7, 7, -72, 11, 5, -7, 4, 4, -72, -64};
    }

    static {
        A05();
    }

    public C1177Yw(int i) {
        this.A03 = i;
    }

    public static com.facebook.ads.redexgen.core.C1177Yw A02() {
        return new com.facebook.ads.redexgen.core.C1177Yw(0);
    }

    private java.nio.ByteBuffer A04(int i) {
        if (this.A03 == 1) {
            return java.nio.ByteBuffer.allocate(i);
        }
        if (this.A03 == 2) {
            java.nio.ByteBuffer byteBufferAllocateDirect = java.nio.ByteBuffer.allocateDirect(i);
            java.lang.String[] strArr = A05;
            if (strArr[7].charAt(4) == strArr[5].charAt(4)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A05;
            strArr2[4] = "EnQTDBbcwdEGVgGYQy";
            strArr2[1] = "cOX79vVexcECC7XhRL";
            return byteBufferAllocateDirect;
        }
        throw new java.lang.IllegalStateException(A03(4, 18, 28) + (this.A01 == null ? 0 : this.A01.capacity()) + A03(0, 3, 76) + i + A03(3, 1, 101));
    }

    @Override // com.facebook.ads.redexgen.core.BC
    public final void A07() {
        super.A07();
        if (this.A01 != null) {
            this.A01.clear();
        }
    }

    public final void A08() {
        this.A01.flip();
    }

    public final void A09(int i) throws java.lang.IllegalStateException {
        if (this.A01 == null) {
            this.A01 = A04(i);
            return;
        }
        int position = this.A01.capacity();
        int iPosition = this.A01.position();
        int capacity = iPosition + i;
        if (position >= capacity) {
            return;
        }
        java.nio.ByteBuffer byteBufferA04 = A04(capacity);
        if (iPosition > 0) {
            this.A01.position(0);
            this.A01.limit(iPosition);
            byteBufferA04.put(this.A01);
        }
        this.A01 = byteBufferA04;
    }

    public final boolean A0A() {
        return A06(1073741824);
    }

    public final boolean A0B() {
        return this.A01 == null && this.A03 == 0;
    }
}
