package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ys, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1173Ys implements com.facebook.ads.redexgen.core.InterfaceC0610By {
    public static java.lang.String[] A07 = {"UVRdrrF5AQHdn5VM3Ax7WcOvit3GJvfg", "IurwM7uI09sQtW0HXBAe", "aEKj", "lR", "u6F3mb", "doA9UZ62L24DYsON", "v0Wrh1Y4KqLJK8wLp", "upnoaaNR"};
    public int A00;
    public int A01;
    public long A02;
    public final long A04;
    public final com.facebook.ads.redexgen.core.InterfaceC0724Gz A05;
    public byte[] A03 = new byte[65536];
    public final byte[] A06 = new byte[4096];

    public C1173Ys(com.facebook.ads.redexgen.core.InterfaceC0724Gz interfaceC0724Gz, long j, long j2) {
        this.A05 = interfaceC0724Gz;
        this.A02 = j;
        this.A04 = j2;
    }

    private int A00(int i) {
        int bytesSkipped = java.lang.Math.min(this.A00, i);
        A05(bytesSkipped);
        return bytesSkipped;
    }

    private int A01(byte[] bArr, int i, int i2) {
        if (this.A00 == 0) {
            return 0;
        }
        int iMin = java.lang.Math.min(this.A00, i2);
        java.lang.System.arraycopy(this.A03, 0, bArr, i, iMin);
        A05(iMin);
        return iMin;
    }

    private int A02(byte[] bArr, int i, int i2, int i3, boolean z) throws java.lang.InterruptedException, java.io.IOException {
        if (!java.lang.Thread.interrupted()) {
            int i4 = this.A05.read(bArr, i + i3, i2 - i3);
            java.lang.String[] strArr = A07;
            if (strArr[2].length() == strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            A07[4] = "iBALdr";
            if (i4 == -1) {
                if (i3 == 0 && z) {
                    return -1;
                }
                throw new java.io.EOFException();
            }
            return i3 + i4;
        }
        throw new java.lang.InterruptedException();
    }

    private void A03(int i) {
        if (i != -1) {
            this.A02 += (long) i;
        }
    }

    private void A04(int i) {
        int i2 = this.A01 + i;
        int requiredLength = this.A03.length;
        if (i2 > requiredLength) {
            int requiredLength2 = this.A03.length;
            int requiredLength3 = 524288 + i2;
            int newPeekCapacity = com.facebook.ads.redexgen.core.IK.A06(requiredLength2 * 2, 65536 + i2, requiredLength3);
            this.A03 = java.util.Arrays.copyOf(this.A03, newPeekCapacity);
        }
    }

    private void A05(int i) {
        this.A00 -= i;
        this.A01 = 0;
        byte[] bArr = this.A03;
        if (this.A00 < this.A03.length - 524288) {
            bArr = new byte[this.A00 + 65536];
        }
        byte[] newPeekBuffer = this.A03;
        java.lang.System.arraycopy(newPeekBuffer, i, bArr, 0, this.A00);
        this.A03 = bArr;
    }

    public final boolean A06(int i, boolean z) throws java.lang.InterruptedException, java.io.IOException {
        A04(i);
        int iMin = java.lang.Math.min(this.A00 - this.A01, i);
        while (iMin < i) {
            iMin = A02(this.A03, this.A01, i, iMin, z);
            if (iMin == -1) {
                return false;
            }
        }
        int bytesPeeked = this.A01;
        this.A01 = bytesPeeked + i;
        int i2 = this.A00;
        int bytesPeeked2 = this.A01;
        this.A00 = java.lang.Math.max(i2, bytesPeeked2);
        if (A07[6].length() == 13) {
            throw new java.lang.RuntimeException();
        }
        A07[6] = "PCV";
        return true;
    }

    public final boolean A07(int i, boolean z) throws java.lang.InterruptedException, java.io.IOException {
        int iA00 = A00(i);
        while (iA00 < i && iA00 != -1) {
            int bytesSkipped = this.A06.length;
            iA00 = A02(this.A06, -iA00, java.lang.Math.min(i, bytesSkipped + iA00), iA00, z);
        }
        A03(iA00);
        return iA00 != -1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0610By
    public final void A3s(int i) throws java.lang.InterruptedException, java.io.IOException {
        A06(i, false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0610By
    public final long A7g() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0610By
    public final long A81() {
        return this.A02 + ((long) this.A01);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0610By
    public final long A86() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0610By
    public final void AEO(byte[] bArr, int i, int i2) throws java.lang.InterruptedException, java.io.IOException {
        AEP(bArr, i, i2, false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0610By
    public final boolean AEP(byte[] bArr, int i, int i2, boolean z) throws java.lang.InterruptedException, java.io.IOException {
        if (!A06(i2, z)) {
            return false;
        }
        java.lang.System.arraycopy(this.A03, this.A01 - i2, bArr, i, i2);
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0610By
    public final boolean AEp(byte[] bArr, int i, int i2, boolean z) throws java.lang.InterruptedException, java.io.IOException {
        int iA01 = A01(bArr, i, i2);
        while (iA01 < i2 && iA01 != -1) {
            iA01 = A02(bArr, i, i2, iA01, z);
        }
        A03(iA01);
        return iA01 != -1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0610By
    public final void AFq() {
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0610By
    public final int AGn(int i) throws java.lang.InterruptedException, java.io.IOException {
        int bytesSkipped = A00(i);
        if (bytesSkipped == 0) {
            bytesSkipped = A02(this.A06, 0, java.lang.Math.min(i, this.A06.length), 0, true);
        }
        A03(bytesSkipped);
        return bytesSkipped;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0610By
    public final void AGq(int i) throws java.lang.InterruptedException, java.io.IOException {
        A07(i, false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0610By
    public final int read(byte[] bArr, int i, int i2) throws java.lang.InterruptedException, java.io.IOException {
        int bytesRead = A01(bArr, i, i2);
        if (bytesRead == 0) {
            bytesRead = A02(bArr, i, i2, 0, true);
        }
        A03(bytesRead);
        return bytesRead;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0610By
    public final void readFully(byte[] bArr, int i, int i2) throws java.lang.InterruptedException, java.io.IOException {
        AEp(bArr, i, i2, false);
    }
}
