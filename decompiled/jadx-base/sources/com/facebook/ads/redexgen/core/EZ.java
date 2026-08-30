package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EZ implements com.facebook.ads.redexgen.core.InterfaceC1155Ya {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"hDr4AhOelyV4M87pxxzrySU8", "ag02JsPBw1CSC6lAevKl8ElSb7ghegxm", "8KgIWPNY6Gpuv5I23X99L6M1", "BC5znNfWRALdfcPg4enkL0n", "sH1sq28fUh4pGPjb57fY53htTKBjXus7", "cCA6T6hrJ6nKn0yn0LF0tCx", "oJ6ugJrvZKDALziksWoJHm", "OeXUOmYCRuSHACW5UkCDsaSWUNhRh"};
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 122);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        java.lang.String[] strArr = A04;
        if (strArr[5].length() != strArr[3].length()) {
            throw new java.lang.RuntimeException();
        }
        A04[4] = "eDFZ3Zqg0xNSdShrMJsmVraFmK4fXi8F";
        A03 = new byte[]{48, 60, 83, 71, 87, 76, 37, 97, 100, 113, 100, 37, 118, 108, 127, 96, 37, 104, 108, 118, 104, 100, 113, 102, 109, okio.Utf8.REPLACEMENT_BYTE, 37, 26, 46, 62, 37, 31, 41, 41, 39, 41, 62};
    }

    static {
        A02();
    }

    public EZ(long[] jArr, long[] jArr2, long j) {
        this.A02 = jArr;
        this.A01 = jArr2;
        this.A00 = j;
    }

    public static com.facebook.ads.redexgen.core.EZ A00(long j, long j2, com.facebook.ads.redexgen.core.C3 c3, com.facebook.ads.redexgen.core.I4 i4) {
        int iA0E;
        long j3 = j2;
        i4.A0Z(10);
        int numFrames = i4.A08();
        if (numFrames <= 0) {
            return null;
        }
        int sampleRate = c3.A03;
        long jA0F = com.facebook.ads.redexgen.core.IK.A0F(numFrames, ((long) (sampleRate >= 32000 ? 1152 : 576)) * 1000000, sampleRate);
        int iA0I = i4.A0I();
        int numFrames2 = i4.A0I();
        int iA0I2 = i4.A0I();
        i4.A0Z(2);
        long j4 = j3 + ((long) c3.A02);
        long[] jArr = new long[iA0I];
        long[] jArr2 = new long[iA0I];
        for (int scale = 0; scale < iA0I; scale++) {
            jArr[scale] = (((long) scale) * jA0F) / ((long) iA0I);
            jArr2[scale] = java.lang.Math.max(j3, j4);
            switch (iA0I2) {
                case 1:
                    iA0E = i4.A0E();
                    break;
                case 2:
                    iA0E = i4.A0I();
                    break;
                case 3:
                    iA0E = i4.A0G();
                    break;
                case 4:
                    iA0E = i4.A0H();
                    break;
                default:
                    return null;
            }
            j3 += (long) (iA0E * numFrames2);
        }
        if (j != -1 && j != j3) {
            android.util.Log.w(A01(27, 10, 54), A01(2, 25, 127) + j + A01(0, 2, 102) + j3);
        }
        return new com.facebook.ads.redexgen.core.EZ(jArr, jArr2, jA0F);
    }

    @Override // com.facebook.ads.redexgen.core.C6
    public final long A7F() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.C6
    public final com.facebook.ads.redexgen.core.C5 A8H(long j) {
        int iA0B = com.facebook.ads.redexgen.core.IK.A0B(this.A02, j, true, true);
        com.facebook.ads.redexgen.core.C7 c7 = new com.facebook.ads.redexgen.core.C7(this.A02[iA0B], this.A01[iA0B]);
        if (c7.A01 < j) {
            int tableIndex = this.A02.length;
            if (iA0B != tableIndex - 1) {
                int tableIndex2 = iA0B + 1;
                long j2 = this.A02[tableIndex2];
                int tableIndex3 = iA0B + 1;
                com.facebook.ads.redexgen.core.C7 nextSeekPoint = new com.facebook.ads.redexgen.core.C7(j2, this.A01[tableIndex3]);
                return new com.facebook.ads.redexgen.core.C5(c7, nextSeekPoint);
            }
        }
        return new com.facebook.ads.redexgen.core.C5(c7);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1155Ya
    public final long A8W(long j) {
        return this.A02[com.facebook.ads.redexgen.core.IK.A0B(this.A01, j, true, true)];
    }

    @Override // com.facebook.ads.redexgen.core.C6
    public final boolean A9h() {
        return true;
    }
}
