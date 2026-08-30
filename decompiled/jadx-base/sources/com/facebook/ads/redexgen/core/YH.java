package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YH extends com.facebook.ads.redexgen.core.AbstractC0631Ct {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"CfiERA", "aqzXLhx7II0vO15jWMUzXt7FO8HYio", "dQDUGs", "rXJ7u9pv7eoczgkakx2iUXR9KJyxjBER", "IxZhnB", "GbKHkLTg9xu9ykL3hBwLplXSwxhS4HIM", "Fj9fDEC3pUeWSTLe", "BpYov1BGFgNJjphL"};
    public int A00;
    public com.facebook.ads.redexgen.core.C0633Cv A01;
    public com.facebook.ads.redexgen.core.C0635Cx A02;
    public com.facebook.ads.redexgen.core.C0637Cz A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final com.facebook.ads.redexgen.core.C0633Cv A02(com.facebook.ads.redexgen.core.I4 i4) throws java.io.IOException {
        if (this.A03 == null) {
            this.A03 = com.facebook.ads.redexgen.core.D0.A04(i4);
            return null;
        }
        if (this.A02 == null) {
            this.A02 = com.facebook.ads.redexgen.core.D0.A03(i4);
            return null;
        }
        byte[] bArr = new byte[i4.A07()];
        java.lang.System.arraycopy(i4.A00, 0, bArr, 0, i4.A07());
        com.facebook.ads.redexgen.core.C0636Cy[] c0636CyArrA0C = com.facebook.ads.redexgen.core.D0.A0C(i4, this.A03.A05);
        return new com.facebook.ads.redexgen.core.C0633Cv(this.A03, this.A02, bArr, c0636CyArrA0C, com.facebook.ads.redexgen.core.D0.A00(c0636CyArrA0C.length - 1));
    }

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 86);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{117, 97, 112, 125, 123, 59, 98, 123, 102, 118, 125, 103};
    }

    static {
        A04();
    }

    public static int A00(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    public static int A01(byte b, com.facebook.ads.redexgen.core.C0633Cv c0633Cv) {
        if (!c0633Cv.A04[A00(b, c0633Cv.A00, 1)].A03) {
            com.facebook.ads.redexgen.core.C0637Cz c0637Cz = c0633Cv.A02;
            java.lang.String[] strArr = A06;
            java.lang.String str = strArr[4];
            java.lang.String str2 = strArr[2];
            int length = str.length();
            int modeNumber = str2.length();
            if (length != modeNumber) {
                throw new java.lang.RuntimeException();
            }
            A06[6] = "By5V";
            int modeNumber2 = c0637Cz.A03;
            return modeNumber2;
        }
        int modeNumber3 = c0633Cv.A02.A04;
        return modeNumber3;
    }

    public static void A05(com.facebook.ads.redexgen.core.I4 i4, long j) {
        i4.A0X(i4.A07() + 4);
        i4.A00[i4.A07() - 4] = (byte) (j & 255);
        i4.A00[i4.A07() - 3] = (byte) ((j >>> 8) & 255);
        i4.A00[i4.A07() - 2] = (byte) ((j >>> 16) & 255);
        i4.A00[i4.A07() - 1] = (byte) (255 & (j >>> 24));
    }

    public static boolean A06(com.facebook.ads.redexgen.core.I4 i4) {
        try {
            return com.facebook.ads.redexgen.core.D0.A0A(1, i4, true);
        } catch (com.facebook.ads.redexgen.core.A0 unused) {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0631Ct
    public final long A07(com.facebook.ads.redexgen.core.I4 i4) {
        int i = 0;
        if ((i4.A00[0] & 1) == 1) {
            return -1L;
        }
        byte[] bArr = i4.A00;
        if (A06[6].length() == 5) {
            throw new java.lang.RuntimeException();
        }
        A06[7] = "dvcdmR";
        int samplesInPacket = A01(bArr[0], this.A01);
        if (this.A04) {
            int packetBlockSize = this.A00;
            i = (packetBlockSize + samplesInPacket) / 4;
        }
        A05(i4, i);
        this.A04 = true;
        this.A00 = samplesInPacket;
        return i;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0631Ct
    public final void A08(long j) {
        super.A08(j);
        this.A04 = j != 0;
        this.A00 = this.A03 != null ? this.A03.A03 : 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0631Ct
    public final void A09(boolean z) {
        super.A09(z);
        if (z) {
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0631Ct
    public final boolean A0A(com.facebook.ads.redexgen.core.I4 i4, long j, com.facebook.ads.redexgen.core.C0630Cs c0630Cs) throws java.lang.InterruptedException, java.io.IOException {
        if (this.A01 == null) {
            this.A01 = A02(i4);
            if (this.A01 == null) {
                return true;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(this.A01.A02.A09);
            arrayList.add(this.A01.A03);
            c0630Cs.A00 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A07(null, A03(0, 12, 66), null, this.A01.A02.A02, -1, this.A01.A02.A05, (int) this.A01.A02.A06, arrayList, null, 0, null);
            return true;
        }
        return false;
    }
}
