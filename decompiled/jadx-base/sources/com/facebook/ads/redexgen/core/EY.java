package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EY implements com.facebook.ads.redexgen.core.InterfaceC1155Ya {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"Xr6CfYARiXWi1tHF5rKzHnV8sizRHMyX", "wJO", "vhv6fx1WvUjVUT42a865NPYV6nOkfSqv", "ykO1A1PT3jL3Q8zq7D2WaGEX54xmjF9S", "j", "GNQC5jQwe2bl4DeUZLcdaEx2Qf8zZlwn", "pCroGV0GNScuUwFSTYQpDpdwc2fRC0On", "UPhRQNGhO5dHFWFW9SQSP3jiGA6NTJBd"};
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long[] A04;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 44);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{84, 88, 9, 24, 31, 22, 113, 53, 48, 37, 48, 113, 34, 56, 43, 52, 113, 60, 56, 34, 60, 48, 37, 50, 57, 107, 113, 52, 5, 2, 11, okio.Utf8.REPLACEMENT_BYTE, 9, 9, 7, 9, 30};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.C6
    public final com.facebook.ads.redexgen.core.C5 A8H(long j) {
        double d;
        if (!A9h()) {
            return new com.facebook.ads.redexgen.core.C5(new com.facebook.ads.redexgen.core.C7(0L, this.A02 + ((long) this.A00)));
        }
        long jA0E = com.facebook.ads.redexgen.core.IK.A0E(j, 0L, this.A03);
        double d2 = (jA0E * 100.0d) / this.A03;
        if (d2 <= 0.0d) {
            d = 0.0d;
        } else if (d2 >= 100.0d) {
            d = 256.0d;
        } else {
            int i = (int) d2;
            double d3 = this.A04[i];
            d = (((i == 99 ? 256.0d : this.A04[i + 1]) - d3) * (d2 - ((double) i))) + d3;
        }
        return new com.facebook.ads.redexgen.core.C5(new com.facebook.ads.redexgen.core.C7(jA0E, this.A02 + com.facebook.ads.redexgen.core.IK.A0E(java.lang.Math.round((d / 256.0d) * this.A01), this.A00, this.A01 - 1)));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1155Ya
    public final long A8W(long j) {
        long j2 = j - this.A02;
        if (!A9h() || j2 <= this.A00) {
            return 0L;
        }
        double d = (j2 * 256.0d) / this.A01;
        int iA0B = com.facebook.ads.redexgen.core.IK.A0B(this.A04, (long) d, true, true);
        long jA00 = A00(iA0B);
        long j3 = this.A04[iA0B];
        long jA01 = A00(iA0B + 1);
        long j4 = iA0B == 99 ? 256L : this.A04[iA0B + 1];
        return java.lang.Math.round((jA01 - jA00) * (j3 == j4 ? 0.0d : (d - j3) / (j4 - j3))) + jA00;
    }

    static {
        A03();
    }

    public EY(long j, int i, long j2) {
        this(j, i, j2, -1L, null);
    }

    public EY(long j, int i, long j2, long j3, long[] jArr) {
        this.A02 = j;
        this.A00 = i;
        this.A03 = j2;
        this.A01 = j3;
        this.A04 = jArr;
    }

    private long A00(int i) {
        return (this.A03 * ((long) i)) / 100;
    }

    public static com.facebook.ads.redexgen.core.EY A01(long durationUs, long dataSize, com.facebook.ads.redexgen.core.C3 c3, com.facebook.ads.redexgen.core.I4 i4) {
        int iA0H;
        int i = c3.A04;
        int i2 = c3.A03;
        int iA08 = i4.A08();
        if ((iA08 & 1) != 1 || (iA0H = i4.A0H()) == 0) {
            return null;
        }
        long jA0F = com.facebook.ads.redexgen.core.IK.A0F(iA0H, ((long) i) * 1000000, i2);
        int i3 = iA08 & 6;
        if (A06[4].length() == 20) {
            throw new java.lang.RuntimeException();
        }
        A06[4] = "W327rNxAr1Lp0kX";
        if (i3 != 6) {
            return new com.facebook.ads.redexgen.core.EY(dataSize, c3.A02, jA0F);
        }
        long jA0H = i4.A0H();
        long[] jArr = new long[100];
        for (int i5 = 0; i5 < 100; i5++) {
            long jA0E = i4.A0E();
            java.lang.String[] strArr = A06;
            java.lang.String str = strArr[6];
            java.lang.String str2 = strArr[2];
            int iCharAt = str.charAt(6);
            int i6 = str2.charAt(6);
            if (iCharAt == i6) {
                throw new java.lang.RuntimeException();
            }
            A06[7] = "SFqGi8tygZ59FROXyWZkbYPPfUMGUQ5V";
            jArr[i5] = jA0E;
        }
        if (durationUs != -1 && durationUs != dataSize + jA0H) {
            android.util.Log.w(A02(27, 10, 64), A02(2, 25, 125) + durationUs + A02(0, 2, 84) + (dataSize + jA0H));
        }
        return new com.facebook.ads.redexgen.core.EY(dataSize, c3.A02, jA0F, jA0H, jArr);
    }

    @Override // com.facebook.ads.redexgen.core.C6
    public final long A7F() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.C6
    public final boolean A9h() {
        return this.A04 != null;
    }
}
