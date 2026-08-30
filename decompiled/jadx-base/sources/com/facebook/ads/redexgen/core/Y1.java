package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Y1 implements com.facebook.ads.redexgen.core.DI {
    public static byte[] A0C;
    public static java.lang.String[] A0D = {"dPoS8ir9YmCy1uQJIUom9RDvTe3XGwYa", "l0lwv2mLMBwIq41tHmV8ebPMigm2cPny", "3Vedj4HjY1Vy1h02zmvRTXoLyhzHWWtt", "FOcBY2kYLrpUeUKUAiAxljySmjgLjk6W", "ALj39rIBTGPBuuonTGTEnDBkGBpQhD2Z", "L897rBZtJXzoOwLre61GOmvLlU41bkCQ", "6efybmxQl5NXzOSuCJSu8aqAxjRTcf4e", "c"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public com.facebook.ads.redexgen.core.IG A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final com.facebook.ads.redexgen.core.D3 A0A;
    public final com.facebook.ads.redexgen.core.I3 A0B = new com.facebook.ads.redexgen.core.I3(new byte[10]);
    public int A03 = 0;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 29);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A0C = new byte[]{110, 35, 33, 60, 43, 110, 44, 55, 58, 43, kotlin.io.encoding.Base64.padSymbol, 38, 19, 5, 36, 19, 23, 18, 19, 4, 64, 123, 112, 109, 101, 112, 118, 97, 112, 113, 53, 102, 97, 116, 103, 97, 53, 118, 122, 113, 112, 53, 101, 103, 112, 115, 124, 109, 47, 53, 3, 56, 51, 46, 38, 51, 53, 34, 51, 50, 118, 37, 34, 55, 36, 34, 118, okio.Utf8.REPLACEMENT_BYTE, 56, 50, okio.Utf8.REPLACEMENT_BYTE, 53, 55, 34, 57, 36, 118, 36, 51, 55, 50, okio.Utf8.REPLACEMENT_BYTE, 56, 49, 118, 51, 46, 34, 51, 56, 50, 51, 50, 118, 62, 51, 55, 50, 51, 36, 96, 91, 80, 77, 69, 80, 86, 65, 80, 81, 21, 70, 65, 84, 71, 65, 21, 92, 91, 81, 92, 86, 84, 65, 90, 71, 15, 21, 80, 77, 69, 80, 86, 65, 80, 81, 21};
    }

    static {
        A02();
    }

    public Y1(com.facebook.ads.redexgen.core.D3 d3) {
        this.A0A = d3;
    }

    private void A01() {
        this.A0B.A07(0);
        this.A04 = androidx.media3.common.C.TIME_UNSET;
        if (this.A08) {
            this.A0B.A08(4);
            long jA04 = ((long) this.A0B.A04(3)) << 30;
            this.A0B.A08(1);
            long pts = this.A0B.A04(15) << 15;
            long j = jA04 | pts;
            this.A0B.A08(1);
            long pts2 = this.A0B.A04(15);
            long j2 = j | pts2;
            this.A0B.A08(1);
            if (!this.A09 && this.A07) {
                this.A0B.A08(4);
                long pts3 = this.A0B.A04(3);
                this.A0B.A08(1);
                long pts4 = (pts3 << 30) | ((long) (this.A0B.A04(15) << 15));
                this.A0B.A08(1);
                long pts5 = pts4 | ((long) this.A0B.A04(15));
                this.A0B.A08(1);
                this.A05.A07(pts5);
                this.A09 = true;
            }
            long jA07 = this.A05.A07(j2);
            java.lang.String[] strArr = A0D;
            if (strArr[0].length() != strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0D;
            strArr2[0] = "6AogH8RWxNyij6hxqSYa8P9zwf4Mdgm0";
            strArr2[4] = "6tyuKewD4n9B0EZuYotj001PJTEDYfzK";
            this.A04 = jA07;
        }
    }

    private void A03(int i) {
        this.A03 = i;
        this.A00 = 0;
    }

    private boolean A04() {
        this.A0B.A07(0);
        int iA04 = this.A0B.A04(24);
        if (iA04 != 1) {
            android.util.Log.w(A00(11, 9, 107), A00(20, 30, 8) + iA04);
            this.A02 = -1;
            return false;
        }
        this.A0B.A08(8);
        int iA05 = this.A0B.A04(16);
        this.A0B.A08(5);
        boolean zA0F = this.A0B.A0F();
        int packetLength = A0D[3].charAt(26);
        if (packetLength == 49) {
            throw new java.lang.RuntimeException();
        }
        A0D[3] = "JrJOHM6OOBIhOvjU9AJKw7oOnpU1hHPD";
        this.A06 = zA0F;
        this.A0B.A08(2);
        this.A08 = this.A0B.A0F();
        this.A07 = this.A0B.A0F();
        this.A0B.A08(6);
        int startCodePrefix = this.A0B.A04(8);
        this.A01 = startCodePrefix;
        if (iA05 == 0) {
            this.A02 = -1;
        } else {
            int startCodePrefix2 = iA05 + 6;
            int packetLength2 = startCodePrefix2 - 9;
            int startCodePrefix3 = this.A01;
            this.A02 = packetLength2 - startCodePrefix3;
        }
        return true;
    }

    private boolean A05(com.facebook.ads.redexgen.core.I4 i4, byte[] bArr, int i) {
        int iMin = java.lang.Math.min(i4.A04(), i - this.A00);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            i4.A0Z(iMin);
        } else {
            int bytesToRead = this.A00;
            i4.A0c(bArr, bytesToRead, iMin);
        }
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + iMin;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i;
    }

    @Override // com.facebook.ads.redexgen.core.DI
    public final void A4o(com.facebook.ads.redexgen.core.I4 i4, boolean z) throws com.facebook.ads.redexgen.core.A0 {
        int readLength;
        if (z) {
            int i = this.A03;
            java.lang.String strA00 = A00(11, 9, 107);
            switch (i) {
                case 2:
                    android.util.Log.w(strA00, A00(50, 50, 75));
                    break;
                case 3:
                    if (this.A02 != -1) {
                        android.util.Log.w(strA00, A00(100, 37, 40) + this.A02 + A00(0, 11, 83));
                    }
                    this.A0A.AEL();
                    break;
            }
            A03(1);
        }
        while (i4.A04() > 0) {
            switch (this.A03) {
                case 0:
                    i4.A0Z(i4.A04());
                    break;
                case 1:
                    if (A05(i4, this.A0B.A00, 9)) {
                        readLength = A04() ? 2 : 0;
                        A03(readLength);
                    }
                    break;
                case 2:
                    if (A05(i4, this.A0B.A00, java.lang.Math.min(10, this.A01)) && A05(i4, null, this.A01)) {
                        A01();
                        this.A0A.AEM(this.A04, this.A06);
                        A03(3);
                    }
                    break;
                case 3:
                    int iA04 = i4.A04();
                    readLength = this.A02 != -1 ? iA04 - this.A02 : 0;
                    if (readLength > 0) {
                        iA04 -= readLength;
                        i4.A0X(i4.A06() + iA04);
                    }
                    this.A0A.A4n(i4);
                    if (this.A02 != -1) {
                        this.A02 -= iA04;
                        if (this.A02 == 0) {
                            this.A0A.AEL();
                            A03(1);
                        }
                    }
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.DI
    public final void A9F(com.facebook.ads.redexgen.core.IG ig, com.facebook.ads.redexgen.core.InterfaceC0611Bz interfaceC0611Bz, com.facebook.ads.redexgen.core.DH dh) {
        this.A05 = ig;
        this.A0A.A5B(interfaceC0611Bz, dh);
    }

    @Override // com.facebook.ads.redexgen.core.DI
    public final void AG6() {
        this.A03 = 0;
        this.A00 = 0;
        this.A09 = false;
        this.A0A.AG6();
    }
}
