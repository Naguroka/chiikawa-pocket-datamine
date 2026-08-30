package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XT implements com.facebook.ads.redexgen.core.C9 {
    public static java.lang.String[] A0F = {"3qzXOmg4s2331UA7hG", "9bk", "VVdoXs4tz6DPKYHGOZRt6RiMCyELY1A5", "g7JlN9bgbBs41PAJ4JuNA0qeFJ1c1UUN", "LKvHqs3IZORZ6jeOQe1pAUwl2aVi1yge", "34f97P4Qb7PfWYgeR24LPv7AajWY1fA6", "GiS2v9udXUeFFnoeEASPbMACNgmzJ", "g0nN8wixzNmLcgKoJI"};
    public long A00;
    public long A01;
    public com.facebook.ads.internal.exoplayer2.thirdparty.Format A02;
    public com.facebook.ads.internal.exoplayer2.thirdparty.Format A03;
    public com.facebook.ads.redexgen.core.FE A04;
    public com.facebook.ads.redexgen.core.FE A05;
    public com.facebook.ads.redexgen.core.FE A06;
    public com.facebook.ads.redexgen.core.FF A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final com.facebook.ads.redexgen.core.InterfaceC0716Gr A0D;
    public final com.facebook.ads.redexgen.core.FD A0C = new com.facebook.ads.redexgen.core.FD();
    public final com.facebook.ads.redexgen.core.FC A0B = new com.facebook.ads.redexgen.core.FC();
    public final com.facebook.ads.redexgen.core.I4 A0E = new com.facebook.ads.redexgen.core.I4(32);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A07(com.facebook.ads.redexgen.core.C1177Yw c1177Yw, com.facebook.ads.redexgen.core.FC fc) {
        int iA0I;
        long j = fc.A01;
        this.A0E.A0W(1);
        A06(j, this.A0E.A00, 1);
        long j2 = j + 1;
        byte b = this.A0E.A00[0];
        boolean z = (b & 128) != 0;
        int i = b & 127;
        com.facebook.ads.redexgen.core.BF bf = c1177Yw.A02;
        java.lang.String[] strArr = A0F;
        if (strArr[7].length() != strArr[0].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0F;
        strArr2[7] = "6HdF621ULlaMIov5Sn";
        strArr2[0] = "aYQM3gHOLvWB46aIdh";
        if (bf.A04 == null) {
            c1177Yw.A02.A04 = new byte[16];
        }
        A06(j2, c1177Yw.A02.A04, i);
        long j3 = j2 + ((long) i);
        if (z) {
            this.A0E.A0W(2);
            A06(j3, this.A0E.A00, 2);
            j3 += 2;
            iA0I = this.A0E.A0I();
        } else {
            iA0I = 1;
        }
        int[] iArr = c1177Yw.A02.A06;
        if (iArr == null || iArr.length < iA0I) {
            iArr = new int[iA0I];
        }
        int[] iArr2 = c1177Yw.A02.A07;
        if (iArr2 == null || iArr2.length < iA0I) {
            iArr2 = new int[iA0I];
        }
        if (z) {
            int i2 = iA0I * 6;
            this.A0E.A0W(i2);
            A06(j3, this.A0E.A00, i2);
            j3 += (long) i2;
            this.A0E.A0Y(0);
            for (int i3 = 0; i3 < iA0I; i3++) {
                iArr[i3] = this.A0E.A0I();
                iArr2[i3] = this.A0E.A0H();
            }
        } else {
            iArr[0] = 0;
            iArr2[0] = fc.A00 - ((int) (j3 - fc.A01));
        }
        com.facebook.ads.redexgen.core.C8 c8 = fc.A02;
        c1177Yw.A02.A03(iA0I, iArr, iArr2, c8.A03, c1177Yw.A02.A04, c8.A01, c8.A02, c8.A00);
        int i4 = (int) (j3 - fc.A01);
        fc.A01 += (long) i4;
        fc.A00 -= i4;
    }

    public XT(com.facebook.ads.redexgen.core.InterfaceC0716Gr interfaceC0716Gr) {
        this.A0D = interfaceC0716Gr;
        this.A0A = interfaceC0716Gr.A7b();
        this.A04 = new com.facebook.ads.redexgen.core.FE(0L, this.A0A);
        this.A05 = this.A04;
        this.A06 = this.A04;
    }

    private int A00(int i) {
        if (!this.A06.A02) {
            this.A06.A02(this.A0D.A3t(), new com.facebook.ads.redexgen.core.FE(this.A06.A03, this.A0A));
        }
        return java.lang.Math.min(i, (int) (this.A06.A03 - this.A01));
    }

    public static com.facebook.ads.internal.exoplayer2.thirdparty.Format A01(com.facebook.ads.internal.exoplayer2.thirdparty.Format format, long j) {
        if (format == null) {
            return null;
        }
        if (j == 0) {
            return format;
        }
        long j2 = format.A0G;
        java.lang.String[] strArr = A0F;
        if (strArr[5].charAt(28) != strArr[4].charAt(28)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0F;
        strArr2[5] = "iKt3Y1BQ3CJXTdnfarGB4lWbdbXT1axy";
        strArr2[4] = "iefBNEa9mmKDxjNV7WvFRyBB3S0z1vzT";
        if (j2 != Long.MAX_VALUE) {
            return format.A0H(format.A0G + j);
        }
        return format;
    }

    private void A02(int i) {
        this.A01 += (long) i;
        if (this.A01 == this.A06.A03) {
            this.A06 = this.A06.A00;
        }
    }

    private void A03(long j) {
        while (j >= this.A05.A03) {
            this.A05 = this.A05.A00;
        }
    }

    private void A04(long j) {
        if (j == -1) {
            return;
        }
        while (j >= this.A04.A03) {
            this.A0D.AEz(this.A04.A01);
            this.A04 = this.A04.A01();
        }
        if (this.A05.A04 < this.A04.A04) {
            this.A05 = this.A04;
        }
    }

    private void A05(long j, java.nio.ByteBuffer byteBuffer, int i) {
        A03(j);
        while (i > 0) {
            int remaining = (int) (this.A05.A03 - j);
            int iMin = java.lang.Math.min(i, remaining);
            byte[] bArr = this.A05.A01.A01;
            int remaining2 = this.A05.A00(j);
            byteBuffer.put(bArr, remaining2, iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == this.A05.A03) {
                this.A05 = this.A05.A00;
            }
        }
    }

    private void A06(long j, byte[] bArr, int i) {
        A03(j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = java.lang.Math.min(i2, (int) (this.A05.A03 - j));
            byte[] bArr2 = this.A05.A01.A01;
            int toCopy = this.A05.A00(j);
            int remaining = i - i2;
            java.lang.System.arraycopy(bArr2, toCopy, bArr, remaining, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == this.A05.A03) {
                this.A05 = this.A05.A00;
            }
        }
    }

    private void A08(com.facebook.ads.redexgen.core.FE fe) {
        if (!fe.A02) {
            return;
        }
        boolean z = this.A06.A02;
        com.facebook.ads.redexgen.core.C0715Gq[] c0715GqArr = new com.facebook.ads.redexgen.core.C0715Gq[(z ? 1 : 0) + (((int) (this.A06.A04 - fe.A04)) / this.A0A)];
        for (int i = 0; i < c0715GqArr.length; i++) {
            c0715GqArr[i] = fe.A01;
            fe = fe.A01();
        }
        this.A0D.AF0(c0715GqArr);
    }

    private final void A09(boolean z) {
        this.A0C.A0H(z);
        A08(this.A04);
        this.A04 = new com.facebook.ads.redexgen.core.FE(0L, this.A0A);
        this.A05 = this.A04;
        this.A06 = this.A04;
        this.A01 = 0L;
        this.A0D.AHB();
    }

    public final int A0A() {
        return this.A0C.A07();
    }

    public final int A0B() {
        return this.A0C.A05();
    }

    public final int A0C() {
        return this.A0C.A06();
    }

    public final int A0D(long j, boolean z, boolean z2) {
        return this.A0C.A08(j, z, z2);
    }

    public final int A0E(com.facebook.ads.redexgen.core.C05569u c05569u, com.facebook.ads.redexgen.core.C1177Yw c1177Yw, boolean z, boolean z2, long j) {
        int result = this.A0C.A09(c05569u, c1177Yw, z, z2, this.A02, this.A0B);
        switch (result) {
            case -5:
                this.A02 = c05569u.A00;
                return -5;
            case -4:
                if (!c1177Yw.A04()) {
                    if (c1177Yw.A00 < j) {
                        c1177Yw.A00(Integer.MIN_VALUE);
                    }
                    boolean zA0A = c1177Yw.A0A();
                    java.lang.String[] strArr = A0F;
                    java.lang.String str = strArr[3];
                    java.lang.String str2 = strArr[2];
                    int iCharAt = str.charAt(7);
                    int result2 = str2.charAt(7);
                    if (iCharAt == result2) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr2 = A0F;
                    strArr2[7] = "nHnyKFMdmGIlRqyLio";
                    strArr2[0] = "5Se0YnkMdMNTcGBGkq";
                    if (zA0A) {
                        A07(c1177Yw, this.A0B);
                    }
                    int result3 = this.A0B.A00;
                    c1177Yw.A09(result3);
                    long j2 = this.A0B.A01;
                    java.nio.ByteBuffer byteBuffer = c1177Yw.A01;
                    int result4 = this.A0B.A00;
                    A05(j2, byteBuffer, result4);
                    return -4;
                }
                return -4;
            case -3:
                return -3;
            default:
                throw new java.lang.IllegalStateException();
        }
    }

    public final long A0F() {
        return this.A0C.A0B();
    }

    public final com.facebook.ads.internal.exoplayer2.thirdparty.Format A0G() {
        return this.A0C.A0E();
    }

    public final void A0H() {
        A04(this.A0C.A0A());
    }

    public final void A0I() {
        A09(false);
    }

    public final void A0J() {
        this.A0C.A0F();
        this.A05 = this.A04;
    }

    public final void A0K(long j, boolean z, boolean z2) {
        A04(this.A0C.A0D(j, z, z2));
    }

    public final void A0L(com.facebook.ads.redexgen.core.FF ff) {
        this.A07 = ff;
    }

    public final boolean A0M() {
        return this.A0C.A0I();
    }

    @Override // com.facebook.ads.redexgen.core.C9
    public final void A69(com.facebook.ads.internal.exoplayer2.thirdparty.Format format) {
        com.facebook.ads.internal.exoplayer2.thirdparty.Format formatA01 = A01(format, this.A00);
        boolean formatChanged = this.A0C.A0K(formatA01);
        this.A03 = format;
        this.A08 = false;
        if (this.A07 != null && formatChanged) {
            this.A07.ADv(formatA01);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C9
    public final int AFu(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, int i, boolean z) throws java.lang.InterruptedException, java.io.IOException {
        int i2 = interfaceC0610By.read(this.A06.A01.A01, this.A06.A00(this.A01), A00(i));
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            throw new java.io.EOFException();
        }
        A02(i2);
        return i2;
    }

    @Override // com.facebook.ads.redexgen.core.C9
    public final void AFv(com.facebook.ads.redexgen.core.I4 i4, int i) {
        while (i > 0) {
            int iA00 = A00(i);
            byte[] bArr = this.A06.A01.A01;
            int bytesAppended = this.A06.A00(this.A01);
            i4.A0c(bArr, bytesAppended, iA00);
            i -= iA00;
            A02(iA00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C9
    public final void AFw(long j, int i, int i2, int i3, com.facebook.ads.redexgen.core.C8 c8) {
        if (this.A08) {
            A69(this.A03);
        }
        if (this.A09) {
            if ((i & 1) == 0 || !this.A0C.A0J(j)) {
                return;
            }
            java.lang.String[] strArr = A0F;
            if (strArr[3].charAt(7) == strArr[2].charAt(7)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0F;
            strArr2[7] = "0U0U2SqxFsdc1RAk3H";
            strArr2[0] = "sNqMg87rvgY5P5a5aa";
            this.A09 = false;
        }
        this.A0C.A0G(j + this.A00, i, (this.A01 - ((long) i2)) - ((long) i3), i2, c8);
    }
}
