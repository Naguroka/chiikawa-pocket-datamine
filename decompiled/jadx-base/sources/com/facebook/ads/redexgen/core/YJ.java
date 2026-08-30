package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YJ extends com.facebook.ads.redexgen.core.AbstractC0631Ct {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"9zUE1kBCLrpctXUh4di4teUCMMnlOwHm", "hxL5RrPmAhc7c6Sqok7geqGtoBQuG54z", "7qxsi95CwX1d32mD6PhTx1jG463xSlTg", "ROqSYZWleG9mDiFvnXHBa66Bw", "byItOkkTBkpZWV9t1cXQ", "rK61A2vaMRzsIHVSYP2n5X", "FfCvZ6O62JH3XUMkSbfnO7", "CFRLGqs9mpPSc58Q2JPSfTLdlWu7MMes"};
    public static final int A03;
    public static final byte[] A04;
    public boolean A00;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 68);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-26, 7, 12, 10, -16, 4, -13, -8, -2, -66, -2, -1, 4, 2};
    }

    static {
        A02();
        A03 = com.facebook.ads.redexgen.core.IK.A08(A01(0, 4, 83));
        A04 = new byte[]{79, 112, 117, 115, 72, 101, 97, 100};
    }

    private long A00(byte[] bArr) {
        int i;
        int i2;
        int frames = bArr[0] & 255;
        int toc = frames & 3;
        switch (toc) {
            case 0:
                i = 1;
                break;
            case 1:
            case 2:
                i = 2;
                break;
            default:
                int toc2 = bArr[1];
                i = toc2 & 63;
                break;
        }
        int config = frames >> 3;
        int frames2 = config & 3;
        if (config >= 16) {
            i2 = 2500 << frames2;
        } else if (config >= 12) {
            int length = frames2 & 1;
            java.lang.String[] strArr = A02;
            java.lang.String str = strArr[6];
            java.lang.String str2 = strArr[5];
            int frames3 = str.length();
            int toc3 = str2.length();
            if (frames3 != toc3) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A02;
            strArr2[6] = "3r7DJYLfzRYqaRlcvCuDWA";
            strArr2[5] = "1ZUf0xo6oEwAlYAqSthqXk";
            i2 = 10000 << length;
        } else if (frames2 == 3) {
            i2 = 60000;
        } else {
            i2 = 10000 << frames2;
        }
        return ((long) i) * ((long) i2);
    }

    private void A03(java.util.List<byte[]> initializationData, int i) {
        initializationData.add(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.nativeOrder()).putLong((((long) i) * androidx.media3.common.C.NANOS_PER_SECOND) / 48000).array());
    }

    public static boolean A04(com.facebook.ads.redexgen.core.I4 i4) {
        if (i4.A04() < A04.length) {
            return false;
        }
        byte[] bArr = new byte[A04.length];
        byte[] header = A04;
        i4.A0c(bArr, 0, header.length);
        byte[] header2 = A04;
        return java.util.Arrays.equals(bArr, header2);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0631Ct
    public final long A07(com.facebook.ads.redexgen.core.I4 i4) {
        return A04(A00(i4.A00));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0631Ct
    public final void A09(boolean z) {
        super.A09(z);
        if (z) {
            this.A00 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0631Ct
    public final boolean A0A(com.facebook.ads.redexgen.core.I4 i4, long j, com.facebook.ads.redexgen.core.C0630Cs c0630Cs) throws java.lang.InterruptedException, java.io.IOException {
        if (!this.A00) {
            byte[] bArrCopyOf = java.util.Arrays.copyOf(i4.A00, i4.A07());
            int i = bArrCopyOf[9] & 255;
            int i2 = ((bArrCopyOf[11] & 255) << 8) | (bArrCopyOf[10] & 255);
            java.util.ArrayList arrayList = new java.util.ArrayList(3);
            arrayList.add(bArrCopyOf);
            A03(arrayList, i2);
            A03(arrayList, 3840);
            c0630Cs.A00 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A07(null, A01(4, 10, 75), null, -1, -1, i, androidx.media3.extractor.OpusUtil.SAMPLE_RATE, arrayList, null, 0, null);
            this.A00 = true;
            return true;
        }
        boolean headerPacket = i4.A08() == A03;
        java.lang.String[] strArr = A02;
        if (strArr[2].charAt(8) == strArr[0].charAt(8)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A02;
        strArr2[2] = "JHJxUYNn6gdFJmATsQeXbTNgPw95NmiQ";
        strArr2[0] = "1OX1ZlBLBQsnobg1X9ALf0NdaXPdAO6N";
        i4.A0Y(0);
        return headerPacket;
    }
}
