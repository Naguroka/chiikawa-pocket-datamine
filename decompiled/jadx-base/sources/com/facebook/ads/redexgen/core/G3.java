package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class G3 {
    public static byte[] A00;
    public static final int A01;
    public static final int A02;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 72);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{9, 43, 39, 27, 58, 47, 50, -8, 8, -5, -27, -5, -11, -19, -24, -29, -5, -7, 0, 0, -7, -2, -9, -80, 2, -11, -3, -15, -7, -2, -12, -11, 2, -80, -1, -10, -80, -3, -15, -4, -10, -1, 2, -3, -11, -12, -80, -29, -43, -39, -80, -34, -47, -36, -80, 5, -2, -7, 4, -66};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A03(long j, com.facebook.ads.redexgen.core.I4 i4, com.facebook.ads.redexgen.core.C9[] c9Arr) {
        while (i4.A04() > 1) {
            int iA00 = A00(i4);
            int iA01 = A00(i4);
            int iA06 = i4.A06() + iA01;
            if (iA01 == -1 || iA01 > i4.A04()) {
                android.util.Log.w(A01(0, 7, 126), A01(15, 45, 72));
                iA06 = i4.A07();
            } else if (iA00 == 4 && iA01 >= 8) {
                int iA0E = i4.A0E();
                int iA0I = i4.A0I();
                int iA08 = iA0I == 49 ? i4.A08() : 0;
                int iA0E2 = i4.A0E();
                if (iA0I == 47) {
                    i4.A0Z(1);
                }
                boolean z = iA0E == 181 && (iA0I == 49 || iA0I == 47) && iA0E2 == 3;
                if (iA0I == 49) {
                    z &= iA08 == A02 || iA08 == A01;
                }
                if (z) {
                    int iA0E3 = i4.A0E() & 31;
                    i4.A0Z(1);
                    int i = iA0E3 * 3;
                    int iA07 = i4.A06();
                    for (com.facebook.ads.redexgen.core.C9 c9 : c9Arr) {
                        i4.A0Y(iA07);
                        c9.AFv(i4, i);
                        c9.AFw(j, 1, i, 0, null);
                    }
                }
            }
            i4.A0Y(iA06);
        }
    }

    static {
        A02();
        A02 = com.facebook.ads.redexgen.core.IK.A08(A01(11, 4, 108));
        A01 = com.facebook.ads.redexgen.core.IK.A08(A01(7, 4, 108));
    }

    public static int A00(com.facebook.ads.redexgen.core.I4 i4) {
        int i = 0;
        while (value != 0) {
            int b = i4.A0E();
            i += b;
            if (b != 255) {
                return i;
            }
        }
        return -1;
    }
}
