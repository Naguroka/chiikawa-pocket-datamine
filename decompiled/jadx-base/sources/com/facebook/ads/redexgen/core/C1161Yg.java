package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1161Yg extends com.facebook.ads.redexgen.core.CB {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"lGyDkwtSGWnyBDNx8VCH6YS5wU7hPdWQ", "PgowCxsSC8EJKJT6apDR", "LPWWnTonb9RlyYc30tl", "RtHeIiqAKzH58z", "0jwO409h5d63SGevyEOv", "LIh4yarHvfESg0ILrv8Z9A7hNJPgMM", "W4YWO", "dzZdewsfodUdBsfR1Ihh4NImnUsz5jl1"};
    public int A00;
    public int A01;
    public boolean A02;
    public final com.facebook.ads.redexgen.core.I4 A03;
    public final com.facebook.ads.redexgen.core.I4 A04;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 84);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        java.lang.String[] strArr = A06;
        if (strArr[0].charAt(5) != strArr[7].charAt(5)) {
            throw new java.lang.RuntimeException();
        }
        A06[5] = "sxdlVolwhrQkkfqceIwrm1GozpbCc1";
        A05 = new byte[]{-34, -15, -20, -19, -9, -88, -18, -9, -6, -11, -23, -4, -88, -10, -9, -4, -88, -5, -3, -8, -8, -9, -6, -4, -19, -20, -62, -88, 71, 58, 53, 54, 64, 0, 50, 71, 52};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.CB
    public final void A0B(com.facebook.ads.redexgen.core.I4 i4, long j) throws com.facebook.ads.redexgen.core.A0 {
        int iA0E = i4.A0E();
        long jA09 = j + (((long) i4.A09()) * 1000);
        if (iA0E == 0 && !this.A02) {
            com.facebook.ads.redexgen.core.I4 i5 = new com.facebook.ads.redexgen.core.I4(new byte[i4.A04()]);
            i4.A0c(i5.A00, 0, i4.A04());
            com.facebook.ads.redexgen.core.IM imA00 = com.facebook.ads.redexgen.core.IM.A00(i5);
            this.A01 = imA00.A02;
            super.A00.A69(com.facebook.ads.internal.exoplayer2.thirdparty.Format.A03(null, A00(28, 9, 125), null, -1, -1, imA00.A03, imA00.A01, -1.0f, imA00.A04, -1, imA00.A00, null));
            this.A02 = true;
            return;
        }
        if (iA0E == 1 && this.A02) {
            byte[] bArr = this.A03.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i = 4 - this.A01;
            int i2 = 0;
            while (i4.A04() > 0) {
                i4.A0c(this.A03.A00, i, this.A01);
                this.A03.A0Y(0);
                int iA0H = this.A03.A0H();
                this.A04.A0Y(0);
                super.A00.AFv(this.A04, 4);
                super.A00.AFv(i4, iA0H);
                i2 = i2 + 4 + iA0H;
            }
            super.A00.AFw(jA09, this.A00 == 1 ? 1 : 0, i2, 0, null);
        }
    }

    static {
        A01();
    }

    public C1161Yg(com.facebook.ads.redexgen.core.C9 c9) {
        super(c9);
        this.A04 = new com.facebook.ads.redexgen.core.I4(com.facebook.ads.redexgen.core.I0.A03);
        this.A03 = new com.facebook.ads.redexgen.core.I4(4);
    }

    @Override // com.facebook.ads.redexgen.core.CB
    public final boolean A0C(com.facebook.ads.redexgen.core.I4 i4) throws com.facebook.ads.redexgen.core.C1162Yh {
        int iA0E = i4.A0E();
        int header = iA0E >> 4;
        int frameType = header & 15;
        int i = iA0E & 15;
        if (i == 7) {
            this.A00 = frameType;
            return frameType != 5;
        }
        throw new com.facebook.ads.redexgen.core.C1162Yh(A00(0, 28, 52) + i);
    }
}
