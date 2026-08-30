package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YM extends com.facebook.ads.redexgen.core.AbstractC0631Ct {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"P4OcMr", "yzGUgjKhy2TcBuT81YWAaiS5", "V9Tib6IfMi4NOqM1D0u830Y2yBdPdBt7", "OFAtjnGVyOXYsjxgv2tUilfsOLsGPVA2", "mLmiaTwnnACP94", "cQZMgeBNGwnvvvB3OnriOOb2AFb6ME4P", "wxDgqbrpyTXZpGk4hb9UcFKfmJ4Jr8rC", "ZIsPCe9SsRFytxGe4XrO3tcn"};
    public com.facebook.ads.redexgen.core.YN A00;
    public com.facebook.ads.redexgen.core.C0742Hr A01;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 102);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {34, 54, 39, 42, 44, 108, 37, 47, 34, 32};
        java.lang.String[] strArr = A03;
        if (strArr[2].charAt(3) == strArr[3].charAt(3)) {
            throw new java.lang.RuntimeException();
        }
        A03[0] = "xoHdp6";
        A02 = bArr;
    }

    static {
        A03();
    }

    private int A00(com.facebook.ads.redexgen.core.I4 i4) {
        int value = (i4.A00[2] & 255) >> 4;
        switch (value) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                int blockSizeCode = 576 << (value - 2);
                return blockSizeCode;
            case 6:
            case 7:
                i4.A0Z(4);
                i4.A0O();
                int value2 = value == 6 ? i4.A0E() : i4.A0I();
                i4.A0Y(0);
                int blockSizeCode2 = value2 + 1;
                return blockSizeCode2;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                int blockSizeCode3 = 256 << (value - 8);
                return blockSizeCode3;
            default:
                return -1;
        }
    }

    public static boolean A04(com.facebook.ads.redexgen.core.I4 i4) {
        if (i4.A04() >= 5 && i4.A0E() == 127) {
            long jA0M = i4.A0M();
            java.lang.String[] strArr = A03;
            if (strArr[7].length() != strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            A03[4] = "cSF3Iph02w2lMO";
            if (jA0M == 1179402563) {
                return true;
            }
        }
        return false;
    }

    public static boolean A05(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0631Ct
    public final long A07(com.facebook.ads.redexgen.core.I4 i4) {
        if (!A05(i4.A00)) {
            return -1L;
        }
        return A00(i4);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0631Ct
    public final void A09(boolean z) {
        super.A09(z);
        if (z) {
            if (A03[5].charAt(28) != 'M') {
                throw new java.lang.RuntimeException();
            }
            A03[5] = "Lwh1jCIc51N2CryTcfCaB8rWVU2cMDKL";
            this.A01 = null;
            this.A00 = null;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0631Ct
    public final boolean A0A(com.facebook.ads.redexgen.core.I4 i4, long j, com.facebook.ads.redexgen.core.C0630Cs c0630Cs) throws java.lang.InterruptedException, java.io.IOException {
        byte[] bArr = i4.A00;
        if (this.A01 == null) {
            this.A01 = new com.facebook.ads.redexgen.core.C0742Hr(bArr, 17);
            byte[] data = java.util.Arrays.copyOfRange(bArr, 9, i4.A07());
            data[4] = -128;
            java.util.List listSingletonList = java.util.Collections.singletonList(data);
            c0630Cs.A00 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A07(null, A02(0, 10, 37), null, -1, this.A01.A00(), this.A01.A01, this.A01.A06, listSingletonList, null, 0, null);
            return true;
        }
        if ((bArr[0] & 127) == 3) {
            this.A00 = new com.facebook.ads.redexgen.core.YN(this);
            this.A00.A01(i4);
            return true;
        }
        if (!A05(bArr)) {
            return true;
        }
        if (this.A00 != null) {
            this.A00.A00(j);
            c0630Cs.A01 = this.A00;
        }
        return false;
    }
}
