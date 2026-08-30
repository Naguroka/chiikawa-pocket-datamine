package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class D0 {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"qTZEp", "4FC", "GVjMT7IO", "idgz8GTtDxXm2DT6Q4W8HIp0oNrYHYmb", "FbpHKh3QT1SdWaw7OeCQFPuoblxH9zoB", "jQTmnshEA3vQhZuIt4EWQ9mfUiSmLT6K", "Lm0", "luRz3eSIkgTHKYiDYnp1YmzqTFiN9rHv"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static com.facebook.ads.redexgen.core.C0637Cz A04(com.facebook.ads.redexgen.core.I4 i4) throws com.facebook.ads.redexgen.core.A0 {
        A0A(1, i4, false);
        long jA0K = i4.A0K();
        int iA0E = i4.A0E();
        long jA0K2 = i4.A0K();
        int iA0A = i4.A0A();
        int iA0A2 = i4.A0A();
        int iA0A3 = i4.A0A();
        int iA0E2 = i4.A0E();
        return new com.facebook.ads.redexgen.core.C0637Cz(jA0K, iA0E, jA0K2, iA0A, iA0A2, iA0A3, (int) java.lang.Math.pow(2.0d, iA0E2 & 15), (int) java.lang.Math.pow(2.0d, (iA0E2 & androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK) >> 4), (i4.A0E() & 1) > 0, java.util.Arrays.copyOf(i4.A00, i4.A07()));
    }

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 127);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{82, 107, 118, 102, 109, 119, 81, 112, 109, 104, 35, 62, 54, 35, 37, 50, 35, 34, 102, 37, 46, 39, 52, 39, 37, 50, 35, 52, 53, 102, 97, 48, 41, 52, 36, 47, 53, 97, 37, 56, 48, 37, 35, 52, 37, 36, 96, 35, 47, 36, 37, 96, 34, 47, 47, 43, 96, 52, 47, 96, 51, 52, 33, 50, 52, 96, 55, 41, 52, 40, 96, 27, 112, 56, 117, 118, 108, 96, 112, 56, 116, 115, 108, 96, 112, 56, 116, 114, 29, 96, 33, 52, 96, 122, 103, 111, 122, 124, 107, 122, 123, okio.Utf8.REPLACEMENT_BYTE, 119, 122, 126, 123, 122, 109, okio.Utf8.REPLACEMENT_BYTE, 107, 102, 111, 122, okio.Utf8.REPLACEMENT_BYTE, 59, 49, 50, 50, 47, 125, 41, 36, 45, 56, 125, 58, 47, 56, 60, 41, 56, 47, 125, 41, 53, 60, 51, 125, 108, 125, 51, 50, 41, 125, 57, 56, 62, 50, 57, 60, okio.Utf8.REPLACEMENT_BYTE, 49, 56, 103, 125, 123, 111, 124, 112, 116, 115, 122, kotlin.io.encoding.Base64.padSymbol, 127, 116, 105, kotlin.io.encoding.Base64.padSymbol, 124, 123, 105, 120, 111, kotlin.io.encoding.Base64.padSymbol, 112, 114, 121, 120, 110, kotlin.io.encoding.Base64.padSymbol, 115, 114, 105, kotlin.io.encoding.Base64.padSymbol, 110, 120, 105, kotlin.io.encoding.Base64.padSymbol, 124, 110, kotlin.io.encoding.Base64.padSymbol, 120, 101, 109, 120, 126, 105, 120, 121, 32, 52, 39, 43, 47, 40, 33, 102, 36, 47, 50, 102, 35, 62, 54, 35, 37, 50, 35, 34, 102, 50, 41, 102, 36, 35, 102, 53, 35, 50, 77, 78, 78, 74, 84, 81, 1, 85, 88, 81, 68, 1, 70, 83, 68, 64, 85, 68, 83, 1, 85, 73, 64, 79, 1, 19, 1, 79, 78, 85, 1, 69, 68, 66, 78, 69, 64, 67, 77, 68, 27, 1, 114, 126, 111, 111, 118, 113, 120, okio.Utf8.REPLACEMENT_BYTE, 107, 102, 111, 122, okio.Utf8.REPLACEMENT_BYTE, 112, 107, 119, 122, 109, okio.Utf8.REPLACEMENT_BYTE, 107, 119, 126, 113, okio.Utf8.REPLACEMENT_BYTE, 47, okio.Utf8.REPLACEMENT_BYTE, 113, 112, 107, okio.Utf8.REPLACEMENT_BYTE, 108, 106, 111, 111, 112, 109, 107, 122, 123, 37, okio.Utf8.REPLACEMENT_BYTE, 76, 80, 93, 95, 89, 84, 83, 80, 88, 89, 78, 28, 83, 90, 28, 72, 85, 81, 89, 28, 88, 83, 81, 93, 85, 82, 28, 72, 78, 93, 82, 79, 90, 83, 78, 81, 79, 28, 82, 83, 72, 28, 70, 89, 78, 83, 89, 88, 28, 83, 73, 72, 48, 39, 49, 43, 38, 55, 39, 22, 59, 50, 39, 98, 37, 48, 39, 35, 54, 39, 48, 98, 54, 42, 35, 44, 98, 112, 98, 43, 49, 98, 44, 45, 54, 98, 38, 39, 33, 45, 38, 35, 32, 46, 39, 48, 43, 100, 54, 33, 55, 33, 54, 50, 33, 32, 100, 38, 45, 48, 55, 100, 41, 49, 55, 48, 100, 38, 33, 100, 62, 33, 54, 43, 100, 37, 34, 48, 33, 54, 100, 41, 37, 52, 52, 45, 42, 35, 100, 39, 43, 49, 52, 40, 45, 42, 35, 100, 55, 48, 33, 52, 55, 4, 31, 31, 80, 3, 24, 31, 2, 4, 80, 24, 21, 17, 20, 21, 2, 74, 80};
    }

    static {
        A06();
    }

    public static int A00(int i) {
        int val = 0;
        while (i > 0) {
            val++;
            i >>>= 1;
        }
        return val;
    }

    public static long A01(long j, long j2) {
        return (long) java.lang.Math.floor(java.lang.Math.pow(j, 1.0d / j2));
    }

    public static com.facebook.ads.redexgen.core.C0634Cw A02(com.facebook.ads.redexgen.core.C0632Cu c0632Cu) throws com.facebook.ads.redexgen.core.A0 {
        long jA01;
        if (c0632Cu.A02(24) == 5653314) {
            int iA02 = c0632Cu.A02(16);
            int lookupType = c0632Cu.A02(24);
            long[] jArr = new long[lookupType];
            boolean zA04 = c0632Cu.A04();
            if (!zA04) {
                boolean zA05 = c0632Cu.A04();
                for (int i = 0; i < entries; i++) {
                    if (zA05) {
                        if (c0632Cu.A04()) {
                            int entries = c0632Cu.A02(5);
                            jArr[i] = entries + 1;
                        } else {
                            int dimensions = A01[6].length();
                            if (dimensions != 3) {
                                throw new java.lang.RuntimeException();
                            }
                            java.lang.String[] strArr = A01;
                            strArr[3] = "wR6h3maZmxl0uQXATft44Ivu3PtnVRRZ";
                            strArr[4] = "pgjbIMIA6qbvamypHITi6jF5BEk3eZha";
                            jArr[i] = 0;
                        }
                    } else {
                        int entries2 = c0632Cu.A02(5);
                        jArr[i] = entries2 + 1;
                    }
                }
            } else {
                int j = c0632Cu.A02(5) + 1;
                int num = 0;
                while (num < entries) {
                    int entries3 = lookupType - num;
                    int i2 = c0632Cu.A02(A00(entries3));
                    for (int i3 = 0; i3 < i2; i3++) {
                        int entries4 = jArr.length;
                        if (num >= entries4) {
                            break;
                        }
                        jArr[num] = j;
                        num++;
                    }
                    j++;
                }
            }
            int iA03 = c0632Cu.A02(4);
            if (iA03 <= 2) {
                if (iA03 == 1 || iA03 == 2) {
                    c0632Cu.A03(32);
                    c0632Cu.A03(32);
                    int iA04 = c0632Cu.A02(4) + 1;
                    c0632Cu.A03(1);
                    if (iA03 == 1) {
                        if (iA02 != 0) {
                            jA01 = A01(lookupType, iA02);
                        } else {
                            jA01 = 0;
                        }
                    } else {
                        jA01 = ((long) lookupType) * ((long) iA02);
                    }
                    int entries5 = (int) (((long) iA04) * jA01);
                    c0632Cu.A03(entries5);
                }
                return new com.facebook.ads.redexgen.core.C0634Cw(iA02, lookupType, jArr, iA03, zA04);
            }
            throw new com.facebook.ads.redexgen.core.A0(A05(228, 42, 94) + iA03);
        }
        throw new com.facebook.ads.redexgen.core.A0(A05(38, 55, 63) + c0632Cu.A01());
    }

    public static com.facebook.ads.redexgen.core.C0635Cx A03(com.facebook.ads.redexgen.core.I4 i4) throws com.facebook.ads.redexgen.core.A0 {
        A0A(3, i4, false);
        int length = (int) i4.A0K();
        java.lang.String strA0S = i4.A0S(length);
        int length2 = strA0S.length();
        int i = 7 + 4 + length2;
        long jA0K = i4.A0K();
        int length3 = (int) jA0K;
        java.lang.String[] strArr = new java.lang.String[length3];
        int i2 = i + 4;
        for (int i3 = 0; i3 < jA0K; i3++) {
            int length4 = (int) i4.A0K();
            strArr[i3] = i4.A0S(length4);
            int length5 = strArr[i3].length();
            i2 = i2 + 4 + length5;
        }
        int length6 = i4.A0E();
        if ((length6 & 1) != 0) {
            return new com.facebook.ads.redexgen.core.C0635Cx(strA0S, strArr, i2 + 1);
        }
        java.lang.String vendor = A05(org.objectweb.asm.Opcodes.IFNULL, 30, 57);
        throw new com.facebook.ads.redexgen.core.A0(vendor);
    }

    public static void A07(int i, com.facebook.ads.redexgen.core.C0632Cu c0632Cu) throws com.facebook.ads.redexgen.core.A0 {
        int submaps;
        int iA02 = c0632Cu.A02(6) + 1;
        for (int i2 = 0; i2 < iA02; i2++) {
            int iA03 = c0632Cu.A02(16);
            switch (iA03) {
                case 0:
                    if (c0632Cu.A04()) {
                        submaps = c0632Cu.A02(4) + 1;
                    } else {
                        submaps = 1;
                    }
                    if (c0632Cu.A04()) {
                        int i3 = c0632Cu.A02(8);
                        int i4 = i3 + 1;
                        for (int i5 = 0; i5 < i4; i5++) {
                            int mappingsCount = i - 1;
                            c0632Cu.A03(A00(mappingsCount));
                            int mappingsCount2 = i - 1;
                            c0632Cu.A03(A00(mappingsCount2));
                        }
                    }
                    if (A01[6].length() != 3) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr = A01;
                    strArr[5] = "JOEGydLRZ18FabkiFWUulairw0GZ2Gkh";
                    strArr[7] = "5Wral0wZEQZa4E9pz2QUd29KUvRb4rco";
                    int mappingsCount3 = c0632Cu.A02(2);
                    if (mappingsCount3 == 0) {
                        if (submaps > 1) {
                            for (int mappingsCount4 = 0; mappingsCount4 < i; mappingsCount4++) {
                                c0632Cu.A03(4);
                            }
                        }
                        for (int mappingsCount5 = 0; mappingsCount5 < submaps; mappingsCount5++) {
                            c0632Cu.A03(8);
                            c0632Cu.A03(8);
                            c0632Cu.A03(8);
                        }
                    } else {
                        throw new com.facebook.ads.redexgen.core.A0(A05(406, 58, 59));
                    }
                    break;
                    break;
                default:
                    android.util.Log.e(A05(0, 10, 123), A05(270, 41, 96) + iA03);
                    break;
            }
        }
    }

    public static void A08(com.facebook.ads.redexgen.core.C0632Cu c0632Cu) throws com.facebook.ads.redexgen.core.A0 {
        int iA02 = c0632Cu.A02(6) + 1;
        for (int i = 0; i < iA02; i++) {
            int iA03 = c0632Cu.A02(16);
            switch (iA03) {
                case 0:
                    c0632Cu.A03(8);
                    c0632Cu.A03(16);
                    c0632Cu.A03(16);
                    c0632Cu.A03(6);
                    c0632Cu.A03(8);
                    int floorCount = c0632Cu.A02(4);
                    int floorCount2 = floorCount + 1;
                    for (int i2 = 0; i2 < floorCount2; i2++) {
                        c0632Cu.A03(8);
                    }
                    break;
                case 1:
                    int count = c0632Cu.A02(5);
                    int i3 = -1;
                    int[] iArr = new int[count];
                    for (int floorCount3 = 0; floorCount3 < count; floorCount3++) {
                        iArr[floorCount3] = c0632Cu.A02(4);
                        if (iArr[floorCount3] > i3) {
                            i3 = iArr[floorCount3];
                        }
                    }
                    int[] iArr2 = new int[i3 + 1];
                    for (int partitions = 0; partitions < iArr2.length; partitions++) {
                        iArr2[partitions] = c0632Cu.A02(3) + 1;
                        int iA04 = c0632Cu.A02(2);
                        if (iA04 > 0) {
                            c0632Cu.A03(8);
                        }
                        int i4 = 0;
                        while (true) {
                            int i5 = 1 << iA04;
                            int floorCount4 = A01[6].length();
                            if (floorCount4 != 3) {
                                throw new java.lang.RuntimeException();
                            }
                            A01[0] = "oMe7Qc0x9PNGvy6iAx0YL";
                            if (i4 < i5) {
                                c0632Cu.A03(8);
                                java.lang.String[] strArr = A01;
                                java.lang.String str = strArr[5];
                                java.lang.String str2 = strArr[7];
                                int floorCount5 = str.charAt(15);
                                if (floorCount5 != str2.charAt(15)) {
                                    java.lang.String[] strArr2 = A01;
                                    strArr2[5] = "KjY4n0tPpUSoA65ieUd6JosIwFBfZm4u";
                                    strArr2[7] = "GT6M0xAjFwvMFnv3NZosdSbEhZuyGvXt";
                                    i4++;
                                } else {
                                    A01[6] = "sWC";
                                    i4 += 0;
                                }
                            }
                        }
                    }
                    c0632Cu.A03(2);
                    int partitions2 = c0632Cu.A02(4);
                    int i6 = 0;
                    int floorCount6 = 0;
                    for (int i7 = 0; i7 < count; i7++) {
                        i6 += iArr2[iArr[i7]];
                        while (floorCount6 < i6) {
                            c0632Cu.A03(partitions2);
                            floorCount6++;
                        }
                    }
                    break;
                default:
                    throw new com.facebook.ads.redexgen.core.A0(A05(114, 41, 34) + iA03);
            }
        }
    }

    public static void A09(com.facebook.ads.redexgen.core.C0632Cu c0632Cu) throws com.facebook.ads.redexgen.core.A0 {
        int iA02 = c0632Cu.A02(6) + 1;
        for (int i = 0; i < iA02; i++) {
            int residueCount = c0632Cu.A02(16);
            if (residueCount <= 2) {
                c0632Cu.A03(24);
                c0632Cu.A03(24);
                c0632Cu.A03(24);
                int iA03 = c0632Cu.A02(6) + 1;
                c0632Cu.A03(8);
                int[] iArr = new int[iA03];
                for (int i2 = 0; i2 < iA03; i2++) {
                    int iA04 = 0;
                    int lowBits = c0632Cu.A02(3);
                    java.lang.String[] strArr = A01;
                    java.lang.String str = strArr[5];
                    java.lang.String str2 = strArr[7];
                    int residueCount2 = str.charAt(15);
                    if (residueCount2 == str2.charAt(15)) {
                        throw new java.lang.RuntimeException();
                    }
                    A01[1] = "Fzm";
                    if (c0632Cu.A04()) {
                        iA04 = c0632Cu.A02(5);
                    }
                    iArr[i2] = (iA04 * 8) + lowBits;
                }
                for (int i3 = 0; i3 < iA03; i3++) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        int residueCount3 = iArr[i3];
                        if ((residueCount3 & (1 << i4)) != 0) {
                            c0632Cu.A03(8);
                        }
                    }
                }
            } else {
                throw new com.facebook.ads.redexgen.core.A0(A05(363, 43, 61));
            }
        }
    }

    public static boolean A0A(int i, com.facebook.ads.redexgen.core.I4 i4, boolean z) throws com.facebook.ads.redexgen.core.A0 {
        if (i4.A04() < 7) {
            if (z) {
                return false;
            }
            throw new com.facebook.ads.redexgen.core.A0(A05(464, 18, 15) + i4.A04());
        }
        if (i4.A0E() != i) {
            if (z) {
                return false;
            }
            throw new com.facebook.ads.redexgen.core.A0(A05(93, 21, 96) + java.lang.Integer.toHexString(i));
        }
        if (i4.A0E() == 118 && i4.A0E() == 111 && i4.A0E() == 114 && i4.A0E() == 98 && i4.A0E() == 105) {
            int iA0E = i4.A0E();
            if (A01[0].length() == 3) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A01;
            strArr[3] = "cEFw80voMQ3YbzzTADHjyBYd9BAt2Eq9";
            strArr[4] = "t97577fmCTvKx9PENiZekz1qhGw5m7zB";
            if (iA0E == 115) {
                return true;
            }
        }
        if (z) {
            return false;
        }
        throw new com.facebook.ads.redexgen.core.A0(A05(10, 28, 57));
    }

    public static com.facebook.ads.redexgen.core.C0636Cy[] A0B(com.facebook.ads.redexgen.core.C0632Cu c0632Cu) {
        int iA02 = c0632Cu.A02(6) + 1;
        com.facebook.ads.redexgen.core.C0636Cy[] c0636CyArr = new com.facebook.ads.redexgen.core.C0636Cy[iA02];
        for (int windowType = 0; windowType < iA02; windowType++) {
            boolean zA04 = c0632Cu.A04();
            int iA03 = c0632Cu.A02(16);
            int i = c0632Cu.A02(16);
            c0636CyArr[windowType] = new com.facebook.ads.redexgen.core.C0636Cy(zA04, iA03, i, c0632Cu.A02(8));
        }
        return c0636CyArr;
    }

    public static com.facebook.ads.redexgen.core.C0636Cy[] A0C(com.facebook.ads.redexgen.core.I4 i4, int i) throws com.facebook.ads.redexgen.core.A0 {
        A0A(5, i4, false);
        int iA0E = i4.A0E() + 1;
        com.facebook.ads.redexgen.core.C0632Cu c0632Cu = new com.facebook.ads.redexgen.core.C0632Cu(i4.A00);
        int numberOfBooks = i4.A06();
        c0632Cu.A03(numberOfBooks * 8);
        for (int numberOfBooks2 = 0; numberOfBooks2 < iA0E; numberOfBooks2++) {
            A02(c0632Cu);
        }
        int numberOfBooks3 = c0632Cu.A02(6);
        int timeCount = numberOfBooks3 + 1;
        for (int i2 = 0; i2 < timeCount; i2++) {
            int numberOfBooks4 = c0632Cu.A02(16);
            if (numberOfBooks4 != 0) {
                throw new com.facebook.ads.redexgen.core.A0(A05(311, 52, 67));
            }
        }
        A08(c0632Cu);
        A09(c0632Cu);
        A07(i, c0632Cu);
        com.facebook.ads.redexgen.core.C0636Cy[] c0636CyArrA0B = A0B(c0632Cu);
        if (c0632Cu.A04()) {
            return c0636CyArrA0B;
        }
        throw new com.facebook.ads.redexgen.core.A0(A05(155, 43, 98));
    }
}
