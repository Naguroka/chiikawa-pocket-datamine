package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0666Ee implements com.facebook.ads.redexgen.core.ZA, com.facebook.ads.redexgen.core.AF {
    public static byte[] A09;
    public static java.lang.String[] A0A = {"TGIDFoCBYxIF6ABX8Bb3YhgSCE6qJKJw", "k8x7EORVgyJpniE3v7l1sl2ahbf", "4b9Q5nu1tg7UbAwdel0cO", "y7Iepw7clTjfA3BSQvCr3z0BBal2gVJQ", "BkJkflNpLqMAXbClsZu1Tgk", "7g28kXVMy8F22eANNiIr0umbfD8", "uCFoYTNMIzRreI1EZJcJh", ""};
    public int A00;
    public int A01;
    public long A02;
    public com.facebook.ads.redexgen.core.AG A03;
    public com.facebook.ads.redexgen.core.FG A04;
    public boolean A05 = true;
    public boolean A06;
    public com.facebook.ads.internal.exoplayer2.thirdparty.Format[] A07;
    public final int A08;

    public static java.lang.String A0w(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A09, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            java.lang.String[] strArr = A0A;
            if (strArr[6].length() != strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            A0A[4] = "PtCLOxMd8VvSKNflPtLSreF";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 74);
            i4++;
        }
    }

    public static void A0x() {
        A09 = new byte[]{125, 127, 112, 95, 125, 111, 107, 119, 108, 123, 77, 123, 109, 109, 119, 113, 112};
    }

    public abstract void A15();

    public abstract void A16(long j, boolean z) throws com.facebook.ads.redexgen.core.C05449h;

    static {
        A0x();
    }

    public AbstractC0666Ee(int i) {
        this.A08 = i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<?> */
    public static boolean A0y(com.facebook.ads.redexgen.core.InterfaceC0593Bh<?> interfaceC0593Bh, com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (interfaceC0593Bh != null) {
            throw new java.lang.NullPointerException(A0w(0, 17, 84));
        }
        if (A0A[4].length() != 23) {
            throw new java.lang.RuntimeException();
        }
        A0A[7] = "AgFTFeTwA";
        return false;
    }

    public final int A0z() {
        return this.A00;
    }

    public final int A10(long j) {
        return this.A04.AGp(j - this.A02);
    }

    public final int A11(com.facebook.ads.redexgen.core.C05569u c05569u, com.facebook.ads.redexgen.core.C1177Yw c1177Yw, boolean z) {
        int iAEn = this.A04.AEn(c05569u, c1177Yw, z);
        if (iAEn == -4) {
            if (c1177Yw.A04()) {
                this.A05 = true;
                return this.A06 ? -4 : -3;
            }
            long j = c1177Yw.A00 + this.A02;
            java.lang.String[] strArr = A0A;
            java.lang.String str = strArr[5];
            java.lang.String str2 = strArr[1];
            int length = str.length();
            int result = str2.length();
            if (length == result) {
                java.lang.String[] strArr2 = A0A;
                strArr2[5] = "CzSSMfFdvLk6vI6nJvpBH5LM7Bz";
                strArr2[1] = "xvblbbOmPCw57hjiz1VSTisu9P6";
                c1177Yw.A00 = j;
                return iAEn;
            }
            throw new java.lang.RuntimeException();
        }
        if (iAEn == -5) {
            com.facebook.ads.internal.exoplayer2.thirdparty.Format format = c05569u.A00;
            if (format.A0G != Long.MAX_VALUE) {
                long j2 = format.A0G + this.A02;
                java.lang.String[] strArr3 = A0A;
                java.lang.String str3 = strArr3[6];
                java.lang.String str4 = strArr3[2];
                int length2 = str3.length();
                int result2 = str4.length();
                if (length2 == result2) {
                    A0A[4] = "tyRJUCaEOPSIcdTfNMFBVXS";
                    c05569u.A00 = format.A0H(j2);
                }
                throw new java.lang.RuntimeException();
            }
        }
        return iAEn;
    }

    public final com.facebook.ads.redexgen.core.AG A12() {
        return this.A03;
    }

    public void A13() throws com.facebook.ads.redexgen.core.C05449h {
    }

    public void A14() throws com.facebook.ads.redexgen.core.C05449h {
    }

    public void A17(boolean z) throws com.facebook.ads.redexgen.core.C05449h {
    }

    public void A18(com.facebook.ads.internal.exoplayer2.thirdparty.Format[] formatArr, long j) throws com.facebook.ads.redexgen.core.C05449h {
    }

    public final boolean A19() {
        return this.A05 ? this.A06 : this.A04.A9b();
    }

    public final com.facebook.ads.internal.exoplayer2.thirdparty.Format[] A1A() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.core.ZA
    public final void A5U() {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A01 == 1);
        this.A01 = 0;
        this.A04 = null;
        this.A07 = null;
        this.A06 = false;
        A15();
    }

    @Override // com.facebook.ads.redexgen.core.ZA
    public final void A5r(com.facebook.ads.redexgen.core.AG ag, com.facebook.ads.internal.exoplayer2.thirdparty.Format[] formatArr, com.facebook.ads.redexgen.core.FG fg, long j, boolean z, long j2) throws com.facebook.ads.redexgen.core.C05449h {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A01 == 0);
        this.A03 = ag;
        this.A01 = 1;
        A17(z);
        AFh(formatArr, fg, j2);
        A16(j, z);
    }

    @Override // com.facebook.ads.redexgen.core.ZA
    public final com.facebook.ads.redexgen.core.AF A6g() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.ZA
    public com.facebook.ads.redexgen.core.InterfaceC0746Hv A7l() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.ZA
    public final int A8P() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.ZA
    public final com.facebook.ads.redexgen.core.FG A8S() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.ZA, com.facebook.ads.redexgen.core.AF
    public final int A8a() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.core.AC
    public void A8t(int i, java.lang.Object obj) throws com.facebook.ads.redexgen.core.C05449h {
    }

    @Override // com.facebook.ads.redexgen.core.ZA
    public final boolean A8z() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.ZA
    public final boolean A9N() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.core.ZA
    public final void AAp() throws java.io.IOException {
        this.A04.AAm();
    }

    @Override // com.facebook.ads.redexgen.core.ZA
    public final void AFh(com.facebook.ads.internal.exoplayer2.thirdparty.Format[] formatArr, com.facebook.ads.redexgen.core.FG fg, long j) throws com.facebook.ads.redexgen.core.C05449h {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(!this.A06);
        this.A04 = fg;
        this.A05 = false;
        this.A07 = formatArr;
        this.A02 = j;
        A18(formatArr, j);
    }

    @Override // com.facebook.ads.redexgen.core.ZA
    public final void AFr(long j) throws com.facebook.ads.redexgen.core.C05449h {
        this.A06 = false;
        this.A05 = false;
        A16(j, false);
    }

    @Override // com.facebook.ads.redexgen.core.ZA
    public final void AGO() {
        this.A06 = true;
    }

    @Override // com.facebook.ads.redexgen.core.ZA
    public final void AGS(int i) {
        this.A00 = i;
    }

    public int AH8() throws com.facebook.ads.redexgen.core.C05449h {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.ZA
    public final void start() throws com.facebook.ads.redexgen.core.C05449h {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A01 == 1);
        this.A01 = 2;
        A13();
    }

    @Override // com.facebook.ads.redexgen.core.ZA
    public final void stop() throws com.facebook.ads.redexgen.core.C05449h {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A01 == 2);
        java.lang.String[] strArr = A0A;
        if (strArr[6].length() != strArr[2].length()) {
            throw new java.lang.RuntimeException();
        }
        A0A[4] = "rU4Km09Vru4RjUp4PpcuDly";
        this.A01 = 1;
        A14();
    }
}
