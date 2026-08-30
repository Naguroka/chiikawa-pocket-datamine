package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class XP implements com.facebook.ads.redexgen.core.InterfaceC0696Fv {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"q1g32zvoAQJitbnj3kQF8wmNW7veOCWn", "KsaAC8YjoMGJChouvV8VId7KrUuqOJCk", "o6f3mRIKrW8efzr6XwfXPwRcZoghN3oD", "REIwhco5kB4G3k30FaVNZH5vs6sRKT21", "qQ8hwRe1NnEjdiH7DukqvWEYyVCX6RS7", "NOEtA1tjy6NxfLNTeEpIfmePtNQlRpNw", "432pej62syR5Z0UxeGKhT0qGaSDmzBGz", "Pr1x84V6QjFlC6ENVmoBp9zzcVDIgNGT"};

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 63);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{57, 12, 12, 29, 21, 8, 12, 29, 28, 88, 12, 23, 88, 27, 10, 29, 25, 12, 29, 88, 28, 29, 27, 23, 28, 29, 10, 88, 30, 23, 10, 88, 13, 22, 11, 13, 8, 8, 23, 10, 12, 29, 28, 88, 30, 23, 10, 21, 25, 12, 1, 16, 16, 12, 9, 3, 1, 20, 9, 15, 14, 79, 3, 5, 1, 77, 86, 80, 88, 118, 103, 103, 123, 126, 116, 118, 99, 126, 120, 121, 56, 116, 114, 118, 58, 32, 39, 47, 120, 105, 105, 117, 112, 122, 120, 109, 112, 118, 119, 54, 125, 111, 123, 106, 108, 123, 106, 49, 32, 32, 60, 57, 51, 49, 36, 57, okio.Utf8.REPLACEMENT_BYTE, 62, 127, 32, 55, 35, 13, 28, 28, 0, 5, 15, 13, 24, 5, 3, 2, 67, 24, 24, 1, 0, 71, 20, 1, 0, 100, 117, 117, 105, 108, 102, 100, 113, 108, 106, 107, 42, 125, 40, 104, 117, 49, 40, 102, 96, 100, 40, 51, 53, kotlin.io.encoding.Base64.padSymbol, 20, 5, 5, 25, 28, 22, 20, 1, 28, 26, 27, 90, 13, 88, 24, 5, 65, 88, 3, 1, 1, 1, 16, 16, 12, 9, 3, 1, 20, 9, 15, 14, 79, 24, 77, 17, 21, 9, 3, 11, 20, 9, 13, 5, 77, 20, 24, 83, 7, 126, 111, 111, 115, 118, 124, 126, 107, 118, 112, 113, 48, 103, 50, 108, 106, 125, 109, 118, 111, 77, 92, 65, 77, 22, 79, 77, 77, 17, 0, 29, 17, 74, 29, 72, 22, 22, 4};
    }

    static {
        A01();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0009  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0696Fv
    public final com.facebook.ads.redexgen.core.XQ A4v(com.facebook.ads.internal.exoplayer2.thirdparty.Format format) {
        byte b;
        java.lang.String str = format.A0O;
        switch (str.hashCode()) {
            case -1351681404:
                if (!str.equals(A00(88, 19, 38))) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case -1248334819:
                if (!str.equals(A00(107, 15, 111))) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case -1026075066:
                if (!str.equals(A00(org.objectweb.asm.Opcodes.GOTO, 21, 74))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -1004728940:
                if (!str.equals(A00(236, 8, 6))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 691401887:
                if (!str.equals(A00(188, 28, 95))) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 822864842:
                if (!str.equals(A00(244, 10, 90))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 930165504:
                if (!str.equals(A00(org.objectweb.asm.Opcodes.D2I, 25, 58))) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 1566015601:
                if (!str.equals(A00(50, 19, 95))) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case 1566016562:
                if (!str.equals(A00(69, 19, 40))) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case 1668750253:
                if (!str.equals(A00(216, 20, 32))) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 1693976202:
                if (!str.equals(A00(122, 20, 83))) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return new com.facebook.ads.redexgen.core.DP() { // from class: com.facebook.ads.redexgen.X.44
                    public static byte[] A05;
                    public static java.lang.String[] A06 = {"5F5cxYdx0LKPil0ajw3GbpYLT7etgF31", "fOxzE9ZV4JlsRGjdoo7dV8KulyNBfr9E", "eEUtzxx4vW", "aDPglCd54FV7XTVXwPGrLoRK5PMilD0L", "T8", "NkWz0HAqjAnp44zCa91cwSe9MeY1HrSH", "IMzm5Ejj5mH4jimf0JzHbRqQJ285LAhr", "T9e7N5pQDbPcuWmbFwNGAPupqQB687yI"};
                    public final com.facebook.ads.redexgen.core.GN A00;
                    public final com.facebook.ads.redexgen.core.GT A01;
                    public final com.facebook.ads.redexgen.core.GW A02;
                    public final com.facebook.ads.redexgen.core.I4 A03;
                    public final java.util.List<com.facebook.ads.redexgen.core.GR> A04;

                    public static java.lang.String A02(int i, int i2, int i3) {
                        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
                        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 93);
                        }
                        return new java.lang.String(bArrCopyOfRange);
                    }

                    public static void A03() {
                        A05 = new byte[]{-51, -84, -1, 0, 5, -8, -15, -84, -18, -8, -5, -17, -9, -84, 3, -19, -1, -84, -14, -5, 1, -6, -16, -84, -19, -14, 0, -15, -2, -84, 0, -12, -15, -84, -14, -11, -2, -1, 0, -84, -17, 1, -15, -70, -84, -83, -78, -93, -15, -14, -9, -22, -29, -66, -52, -55, -35, -37, -37, -85, -52, -54, -42, -53, -52, -39};
                    }

                    static {
                        A03();
                    }

                    {
                        A02(53, 13, 10);
                        this.A02 = new com.facebook.ads.redexgen.core.GW();
                        this.A03 = new com.facebook.ads.redexgen.core.I4();
                        this.A01 = new com.facebook.ads.redexgen.core.GT();
                        this.A00 = new com.facebook.ads.redexgen.core.GN();
                        this.A04 = new java.util.ArrayList();
                    }

                    public static int A00(com.facebook.ads.redexgen.core.I4 i4) {
                        int currentInputPosition = -1;
                        int iA06 = 0;
                        while (currentInputPosition == -1) {
                            iA06 = i4.A06();
                            java.lang.String strA0P = i4.A0P();
                            if (strA0P == null) {
                                currentInputPosition = 0;
                            } else if (A02(48, 5, 65).equals(strA0P)) {
                                currentInputPosition = 2;
                            } else if (A02(44, 4, 1).startsWith(strA0P)) {
                                currentInputPosition = 1;
                            } else {
                                currentInputPosition = 3;
                            }
                        }
                        i4.A0Y(iA06);
                        return currentInputPosition;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.facebook.ads.redexgen.core.DP
                    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
                    public final com.facebook.ads.redexgen.core.XE A0b(byte[] bArr, int i, boolean z) throws com.facebook.ads.redexgen.core.C0695Fu {
                        this.A03.A0b(bArr, i);
                        this.A01.A0E();
                        this.A04.clear();
                        com.facebook.ads.redexgen.core.GX.A04(this.A03);
                        while (!android.text.TextUtils.isEmpty(this.A03.A0P())) {
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        while (true) {
                            int iA00 = A00(this.A03);
                            if (iA00 != 0) {
                                if (iA00 == 1) {
                                    A04(this.A03);
                                } else if (iA00 == 2) {
                                    if (arrayList.isEmpty()) {
                                        this.A03.A0P();
                                        com.facebook.ads.redexgen.core.GR styleBlock = this.A00.A0E(this.A03);
                                        if (styleBlock != null) {
                                            this.A04.add(styleBlock);
                                        }
                                    } else {
                                        throw new com.facebook.ads.redexgen.core.C0695Fu(A02(0, 44, 47));
                                    }
                                } else if (iA00 == 3 && this.A02.A0G(this.A03, this.A01, this.A04)) {
                                    arrayList.add(this.A01.A0D());
                                    this.A01.A0E();
                                }
                            } else {
                                return new com.facebook.ads.redexgen.core.XE(arrayList);
                            }
                        }
                    }

                    public static void A04(com.facebook.ads.redexgen.core.I4 i4) {
                        boolean zIsEmpty;
                        do {
                            zIsEmpty = android.text.TextUtils.isEmpty(i4.A0P());
                            if (A06[0].charAt(19) != 'G') {
                                throw new java.lang.RuntimeException();
                            }
                            A06[6] = "CZqzLdLpoWwYlPjJuNUsakBQS84mnH0T";
                        } while (!zIsEmpty);
                    }
                };
            case 1:
                return new com.facebook.ads.redexgen.core.C04264g(format.A0P);
            case 2:
                return new com.facebook.ads.redexgen.core.DP() { // from class: com.facebook.ads.redexgen.X.45
                    public static byte[] A02;
                    public static java.lang.String[] A03 = {"jrvdoaDBM3cqePrWf", "m40r4JyL3iKqeGLO2h6Tk", "RcvraOg6mbbP34aEVmi7jYPv5OcRlKTM", "myTPvQ3QT6z6", "YpxDkO8RECuwBTRpYFK7ysMlySnmjB", "CwlHvyUXkKbItp91Wk", "ZsF2mL", "xPpZ8RCHbSet6uyWCTIV2"};
                    public static final int A04;
                    public static final int A05;
                    public static final int A06;
                    public final com.facebook.ads.redexgen.core.GT A00;
                    public final com.facebook.ads.redexgen.core.I4 A01;

                    public static java.lang.String A02(int i, int i2, int i3) {
                        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
                        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 9);
                        }
                        return new java.lang.String(bArrCopyOfRange);
                    }

                    public static void A03() {
                        A02 = new byte[]{124, -95, -106, -94, -96, -93, -97, -104, -89, -104, 83, -128, -93, 103, -118, -104, -107, -87, -89, -89, 83, -121, -94, -93, 83, 127, -104, -87, -104, -97, 83, -107, -94, -85, 83, -101, -104, -108, -105, -104, -91, 83, -103, -94, -88, -95, -105, 97, 83, 120, 109, 121, 119, 122, 118, 111, 126, 111, 42, -128, 126, 126, 42, 109, 127, 111, 42, 108, 121, -126, 42, 114, 111, 107, 110, 111, 124, 42, 112, 121, 127, 120, 110, 56, -61, -26, -86, -51, -37, -40, -20, -22, -22, -70, -37, -39, -27, -38, -37, -24, -80, -95, -71, -84, -55, -54, -54, -67, -109, -111, -111, -128};
                    }

                    static {
                        A03();
                        A04 = com.facebook.ads.redexgen.core.IK.A08(A02(100, 4, 55));
                        A05 = com.facebook.ads.redexgen.core.IK.A08(A02(104, 4, 77));
                        A06 = com.facebook.ads.redexgen.core.IK.A08(A02(108, 4, 20));
                    }

                    {
                        A02(84, 16, 109);
                        this.A01 = new com.facebook.ads.redexgen.core.I4();
                        this.A00 = new com.facebook.ads.redexgen.core.GT();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.facebook.ads.redexgen.core.DP
                    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
                    public final com.facebook.ads.redexgen.core.XG A0b(byte[] bArr, int i, boolean z) throws com.facebook.ads.redexgen.core.C0695Fu {
                        this.A01.A0b(bArr, i);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        while (true) {
                            int iA04 = this.A01.A04();
                            java.lang.String[] strArr = A03;
                            if (strArr[6].length() == strArr[5].length()) {
                                throw new java.lang.RuntimeException();
                            }
                            java.lang.String[] strArr2 = A03;
                            strArr2[3] = "2AOvC9NWdqZd";
                            strArr2[0] = "YZRt9rHsEfBtjbBQ4";
                            if (iA04 > 0) {
                                if (this.A01.A04() >= 8) {
                                    int iA08 = this.A01.A08();
                                    int boxSize = this.A01.A08();
                                    if (boxSize == A06) {
                                        arrayList.add(A01(this.A01, this.A00, iA08 - 8));
                                    } else {
                                        this.A01.A0Z(iA08 - 8);
                                    }
                                } else {
                                    throw new com.facebook.ads.redexgen.core.C0695Fu(A02(0, 48, 42));
                                }
                            } else {
                                return new com.facebook.ads.redexgen.core.XG(arrayList);
                            }
                        }
                    }

                    public static com.facebook.ads.redexgen.core.XF A01(com.facebook.ads.redexgen.core.I4 i4, com.facebook.ads.redexgen.core.GT gt, int i) throws com.facebook.ads.redexgen.core.C0695Fu {
                        gt.A0E();
                        while (i > 0) {
                            if (i >= 8) {
                                int boxSize = i4.A08();
                                int iA08 = i4.A08();
                                int payloadLength = boxSize - 8;
                                byte[] bArr = i4.A00;
                                int boxSize2 = i4.A06();
                                java.lang.String strA0R = com.facebook.ads.redexgen.core.IK.A0R(bArr, boxSize2, payloadLength);
                                i4.A0Z(payloadLength);
                                i = (i - 8) - payloadLength;
                                int boxSize3 = A05;
                                if (iA08 == boxSize3) {
                                    com.facebook.ads.redexgen.core.GW.A08(strA0R, gt);
                                } else {
                                    int boxSize4 = A04;
                                    if (iA08 == boxSize4) {
                                        com.facebook.ads.redexgen.core.GW.A0C(null, strA0R.trim(), gt, java.util.Collections.emptyList());
                                    }
                                }
                            } else {
                                throw new com.facebook.ads.redexgen.core.C0695Fu(A02(48, 36, 1));
                            }
                        }
                        return gt.A0D();
                    }
                };
            case 3:
                return new com.facebook.ads.redexgen.core.DP() { // from class: com.facebook.ads.redexgen.X.47
                    public static byte[] A01;
                    public static java.lang.String[] A02 = {"Q7JJv3z7PkgXqFR6EtNnsFWUhkJfDLEs", "gmWMr9Qk53qaXSdnVHvemR", "OW99De4FTdA6Oa6qk4bO3w", "WoL", "rm8iY0Glnb70LQ8B0", "dizBvxRUVycGfpYpaNZ336Cn8ei27tcP", "ilEcyhsvi9H23eDmjQBvPkD3CdelIFai", "Rua8GDCisFLxJnBCYVdBnrEUaSrihtBi"};
                    public static final com.facebook.ads.redexgen.core.GE A03;
                    public static final com.facebook.ads.redexgen.core.GF A04;
                    public static final java.util.regex.Pattern A05;
                    public static final java.util.regex.Pattern A06;
                    public static final java.util.regex.Pattern A07;
                    public static final java.util.regex.Pattern A08;
                    public static final java.util.regex.Pattern A09;
                    public final org.xmlpull.v1.XmlPullParserFactory A00;

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code duplicated, block: B:21:0x0091  */
                    /* JADX WARN: Code duplicated, block: B:23:0x0095 A[PHI: r6
  0x0095: PHI (r6v7 double) = (r6v0 double), (r6v1 double), (r6v2 double), (r6v3 double), (r6v4 double), (r6v5 double), (r6v6 double) binds: [B:22:0x0092, B:34:0x00e3, B:33:0x00df, B:32:0x00d8, B:31:0x00cf, B:30:0x00cd, B:27:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Code duplicated, block: B:25:0x009d  */
                    /* JADX WARN: Code duplicated, block: B:27:0x00ac  */
                    /* JADX WARN: Code duplicated, block: B:28:0x00bb  */
                    /* JADX WARN: Code duplicated, block: B:30:0x00cd  */
                    /* JADX WARN: Code duplicated, block: B:31:0x00cf  */
                    /* JADX WARN: Code duplicated, block: B:32:0x00d8  */
                    /* JADX WARN: Code duplicated, block: B:33:0x00df  */
                    /* JADX WARN: Code duplicated, block: B:34:0x00e3  */
                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    public static long A00(java.lang.String str2, com.facebook.ads.redexgen.core.GF gf) throws com.facebook.ads.redexgen.core.C0695Fu {
                        double d;
                        int i;
                        java.util.regex.Matcher matcher = A06.matcher(str2);
                        byte b2 = 5;
                        if (matcher.matches()) {
                            double d2 = (java.lang.Long.parseLong(matcher.group(1)) * 3600) + (java.lang.Long.parseLong(matcher.group(2)) * 60) + java.lang.Long.parseLong(matcher.group(3));
                            java.lang.String strGroup = matcher.group(4);
                            double d3 = d2 + (strGroup != null ? java.lang.Double.parseDouble(strGroup) : 0.0d);
                            java.lang.String strGroup2 = matcher.group(5);
                            double d4 = d3 + (strGroup2 != null ? java.lang.Long.parseLong(strGroup2) / gf.A00 : 0.0d);
                            java.lang.String strGroup3 = matcher.group(6);
                            return (long) (1000000.0d * (d4 + (strGroup3 != null ? (java.lang.Long.parseLong(strGroup3) / ((double) gf.A01)) / ((double) gf.A00) : 0.0d)));
                        }
                        java.util.regex.Matcher matcher2 = A08.matcher(str2);
                        if (!matcher2.matches()) {
                            throw new com.facebook.ads.redexgen.core.C0695Fu(A08(556, 27, 28) + str2);
                        }
                        double d5 = java.lang.Double.parseDouble(matcher2.group(1));
                        java.lang.String strGroup4 = matcher2.group(2);
                        switch (strGroup4.hashCode()) {
                            case 102:
                                if (strGroup4.equals(A08(1072, 1, 64))) {
                                    b2 = 4;
                                } else {
                                    b2 = -1;
                                }
                                switch (b2) {
                                    case 0:
                                        d5 *= 3600.0d;
                                        return (long) (1000000.0d * d5);
                                    case 1:
                                        d5 *= 60.0d;
                                        return (long) (1000000.0d * d5);
                                    case 2:
                                    default:
                                        return (long) (1000000.0d * d5);
                                    case 3:
                                        d5 /= 1000.0d;
                                        return (long) (1000000.0d * d5);
                                    case 4:
                                        d = gf.A00;
                                        if (A02[5].charAt(13) != 'p') {
                                            d5 /= d;
                                        } else {
                                            A02[5] = "GvE1N8GiPZru1pUKh0LjeI06hxDnqyMK";
                                            d5 /= d;
                                        }
                                        return (long) (1000000.0d * d5);
                                    case 5:
                                        i = gf.A02;
                                        if (A02[3].length() != 29) {
                                            java.lang.String[] strArr = A02;
                                            strArr[1] = "4PYxPVSLae5R2XdfCVSnOC";
                                            strArr[2] = "YaYW7qCWZNcJQz4EdrDzpH";
                                            d5 /= (double) i;
                                            return (long) (1000000.0d * d5);
                                        }
                                        throw new java.lang.RuntimeException();
                                }
                            case 104:
                                if (strGroup4.equals(A08(1178, 1, 110))) {
                                    b2 = 0;
                                } else {
                                    b2 = -1;
                                }
                                switch (b2) {
                                    case 0:
                                        d5 *= 3600.0d;
                                        return (long) (1000000.0d * d5);
                                    case 1:
                                        d5 *= 60.0d;
                                        return (long) (1000000.0d * d5);
                                    case 2:
                                    default:
                                        return (long) (1000000.0d * d5);
                                    case 3:
                                        d5 /= 1000.0d;
                                        return (long) (1000000.0d * d5);
                                    case 4:
                                        d = gf.A00;
                                        if (A02[5].charAt(13) != 'p') {
                                            d5 /= d;
                                        } else {
                                            A02[5] = "GvE1N8GiPZru1pUKh0LjeI06hxDnqyMK";
                                            d5 /= d;
                                        }
                                        return (long) (1000000.0d * d5);
                                    case 5:
                                        i = gf.A02;
                                        if (A02[3].length() != 29) {
                                            java.lang.String[] strArr2 = A02;
                                            strArr2[1] = "4PYxPVSLae5R2XdfCVSnOC";
                                            strArr2[2] = "YaYW7qCWZNcJQz4EdrDzpH";
                                            d5 /= (double) i;
                                            return (long) (1000000.0d * d5);
                                        }
                                        throw new java.lang.RuntimeException();
                                }
                            case 109:
                                if (strGroup4.equals(A08(1247, 1, 49))) {
                                    b2 = 1;
                                } else {
                                    b2 = -1;
                                }
                                switch (b2) {
                                    case 0:
                                        d5 *= 3600.0d;
                                        return (long) (1000000.0d * d5);
                                    case 1:
                                        d5 *= 60.0d;
                                        return (long) (1000000.0d * d5);
                                    case 2:
                                    default:
                                        return (long) (1000000.0d * d5);
                                    case 3:
                                        d5 /= 1000.0d;
                                        return (long) (1000000.0d * d5);
                                    case 4:
                                        d = gf.A00;
                                        if (A02[5].charAt(13) != 'p') {
                                            d5 /= d;
                                        } else {
                                            A02[5] = "GvE1N8GiPZru1pUKh0LjeI06hxDnqyMK";
                                            d5 /= d;
                                        }
                                        return (long) (1000000.0d * d5);
                                    case 5:
                                        i = gf.A02;
                                        if (A02[3].length() != 29) {
                                            java.lang.String[] strArr3 = A02;
                                            strArr3[1] = "4PYxPVSLae5R2XdfCVSnOC";
                                            strArr3[2] = "YaYW7qCWZNcJQz4EdrDzpH";
                                            d5 /= (double) i;
                                            return (long) (1000000.0d * d5);
                                        }
                                        throw new java.lang.RuntimeException();
                                }
                            case 115:
                                java.lang.String[] strArr4 = A02;
                                if (strArr4[1].length() == strArr4[2].length()) {
                                    A02[3] = "4AHzGHVHs5GrGlqc";
                                    if (strGroup4.equals(A08(com.json.mediationsdk.utils.IronSourceConstants.RV_AUCTION_SUCCESS, 1, 73))) {
                                        b2 = 2;
                                    } else {
                                        b2 = -1;
                                    }
                                    switch (b2) {
                                        case 0:
                                            d5 *= 3600.0d;
                                            return (long) (1000000.0d * d5);
                                        case 1:
                                            d5 *= 60.0d;
                                            return (long) (1000000.0d * d5);
                                        case 2:
                                        default:
                                            return (long) (1000000.0d * d5);
                                        case 3:
                                            d5 /= 1000.0d;
                                            return (long) (1000000.0d * d5);
                                        case 4:
                                            d = gf.A00;
                                            if (A02[5].charAt(13) != 'p') {
                                                d5 /= d;
                                            } else {
                                                A02[5] = "GvE1N8GiPZru1pUKh0LjeI06hxDnqyMK";
                                                d5 /= d;
                                            }
                                            return (long) (1000000.0d * d5);
                                        case 5:
                                            i = gf.A02;
                                            if (A02[3].length() != 29) {
                                                java.lang.String[] strArr5 = A02;
                                                strArr5[1] = "4PYxPVSLae5R2XdfCVSnOC";
                                                strArr5[2] = "YaYW7qCWZNcJQz4EdrDzpH";
                                                d5 /= (double) i;
                                                return (long) (1000000.0d * d5);
                                            }
                                            break;
                                    }
                                }
                                throw new java.lang.RuntimeException();
                            case 116:
                                if (!strGroup4.equals(A08(1374, 1, 62))) {
                                    b2 = -1;
                                }
                                switch (b2) {
                                    case 0:
                                        d5 *= 3600.0d;
                                        return (long) (1000000.0d * d5);
                                    case 1:
                                        d5 *= 60.0d;
                                        return (long) (1000000.0d * d5);
                                    case 2:
                                    default:
                                        return (long) (1000000.0d * d5);
                                    case 3:
                                        d5 /= 1000.0d;
                                        return (long) (1000000.0d * d5);
                                    case 4:
                                        d = gf.A00;
                                        if (A02[5].charAt(13) != 'p') {
                                            d5 /= d;
                                        } else {
                                            A02[5] = "GvE1N8GiPZru1pUKh0LjeI06hxDnqyMK";
                                            d5 /= d;
                                        }
                                        return (long) (1000000.0d * d5);
                                    case 5:
                                        i = gf.A02;
                                        if (A02[3].length() != 29) {
                                            java.lang.String[] strArr6 = A02;
                                            strArr6[1] = "4PYxPVSLae5R2XdfCVSnOC";
                                            strArr6[2] = "YaYW7qCWZNcJQz4EdrDzpH";
                                            d5 /= (double) i;
                                            return (long) (1000000.0d * d5);
                                        }
                                        throw new java.lang.RuntimeException();
                                }
                            case 3494:
                                java.lang.String[] strArr7 = A02;
                                if (strArr7[6].charAt(31) != strArr7[7].charAt(31)) {
                                    throw new java.lang.RuntimeException();
                                }
                                A02[5] = "fa3Cjx2CI1Qa8pGSOxwZ2EhJfzDhw0hA";
                                if (strGroup4.equals(A08(1256, 2, 81))) {
                                    b2 = 3;
                                } else {
                                    b2 = -1;
                                }
                                switch (b2) {
                                    case 0:
                                        d5 *= 3600.0d;
                                        return (long) (1000000.0d * d5);
                                    case 1:
                                        d5 *= 60.0d;
                                        return (long) (1000000.0d * d5);
                                    case 2:
                                    default:
                                        return (long) (1000000.0d * d5);
                                    case 3:
                                        d5 /= 1000.0d;
                                        return (long) (1000000.0d * d5);
                                    case 4:
                                        d = gf.A00;
                                        if (A02[5].charAt(13) != 'p') {
                                            d5 /= d;
                                        } else {
                                            A02[5] = "GvE1N8GiPZru1pUKh0LjeI06hxDnqyMK";
                                            d5 /= d;
                                        }
                                        return (long) (1000000.0d * d5);
                                    case 5:
                                        i = gf.A02;
                                        if (A02[3].length() != 29) {
                                            java.lang.String[] strArr8 = A02;
                                            strArr8[1] = "4PYxPVSLae5R2XdfCVSnOC";
                                            strArr8[2] = "YaYW7qCWZNcJQz4EdrDzpH";
                                            d5 /= (double) i;
                                            return (long) (1000000.0d * d5);
                                        }
                                        throw new java.lang.RuntimeException();
                                }
                            default:
                                b2 = -1;
                                switch (b2) {
                                    case 0:
                                        d5 *= 3600.0d;
                                        return (long) (1000000.0d * d5);
                                    case 1:
                                        d5 *= 60.0d;
                                        return (long) (1000000.0d * d5);
                                    case 2:
                                    default:
                                        return (long) (1000000.0d * d5);
                                    case 3:
                                        d5 /= 1000.0d;
                                        return (long) (1000000.0d * d5);
                                    case 4:
                                        d = gf.A00;
                                        if (A02[5].charAt(13) != 'p') {
                                            d5 /= d;
                                        } else {
                                            A02[5] = "GvE1N8GiPZru1pUKh0LjeI06hxDnqyMK";
                                            d5 /= d;
                                        }
                                        return (long) (1000000.0d * d5);
                                    case 5:
                                        i = gf.A02;
                                        if (A02[3].length() != 29) {
                                            java.lang.String[] strArr9 = A02;
                                            strArr9[1] = "4PYxPVSLae5R2XdfCVSnOC";
                                            strArr9[2] = "YaYW7qCWZNcJQz4EdrDzpH";
                                            d5 /= (double) i;
                                            return (long) (1000000.0d * d5);
                                        }
                                        throw new java.lang.RuntimeException();
                                }
                        }
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code duplicated, block: B:10:0x0057  */
                    /* JADX WARN: Code duplicated, block: B:18:0x0085  */
                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    private com.facebook.ads.redexgen.core.GG A03(org.xmlpull.v1.XmlPullParser xmlPullParser, com.facebook.ads.redexgen.core.GG gg, java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.GH> map, com.facebook.ads.redexgen.core.GF gf) throws com.facebook.ads.redexgen.core.C0695Fu {
                        byte b2;
                        com.facebook.ads.redexgen.core.AnonymousClass47 anonymousClass47 = this;
                        long jA00 = androidx.media3.common.C.TIME_UNSET;
                        long jA01 = androidx.media3.common.C.TIME_UNSET;
                        long jA02 = androidx.media3.common.C.TIME_UNSET;
                        java.lang.String strA08 = A08(0, 0, 90);
                        java.lang.String[] strArr = null;
                        int attributeCount = xmlPullParser.getAttributeCount();
                        com.facebook.ads.redexgen.core.GM gmA06 = anonymousClass47.A06(xmlPullParser, null);
                        int i = 0;
                        while (i < attributeCount) {
                            java.lang.String attributeName = xmlPullParser.getAttributeName(i);
                            java.lang.String[] strArr2 = A02;
                            if (strArr2[1].length() == strArr2[2].length()) {
                                A02[4] = "YixuFoEwtSnXH8w7l";
                                java.lang.String attributeValue = xmlPullParser.getAttributeValue(i);
                                switch (attributeName.hashCode()) {
                                    case -934795532:
                                        if (!attributeName.equals(A08(1291, 6, 32))) {
                                            b2 = -1;
                                        } else {
                                            b2 = 4;
                                        }
                                        break;
                                    case 99841:
                                        if (!attributeName.equals(A08(1058, 3, 21))) {
                                            b2 = -1;
                                        } else {
                                            b2 = 2;
                                        }
                                        break;
                                    case 100571:
                                        if (!attributeName.equals(A08(1063, 3, 72))) {
                                            b2 = -1;
                                        } else {
                                            b2 = 1;
                                        }
                                        break;
                                    case 93616297:
                                        if (!attributeName.equals(A08(1003, 5, 98))) {
                                            b2 = -1;
                                        } else {
                                            b2 = 0;
                                        }
                                        break;
                                    case 109780401:
                                        if (!attributeName.equals(A08(1350, 5, 103))) {
                                            b2 = -1;
                                        } else {
                                            b2 = 3;
                                        }
                                        break;
                                    default:
                                        b2 = -1;
                                        break;
                                }
                                switch (b2) {
                                    case 0:
                                        jA01 = A00(attributeValue, gf);
                                        if (A02[3].length() == 29) {
                                            throw new java.lang.RuntimeException();
                                        }
                                        A02[4] = "dQoDQglF0B7EvNpDs";
                                        break;
                                        break;
                                    case 1:
                                        jA02 = A00(attributeValue, gf);
                                        if (A02[0].charAt(22) != 'S') {
                                            A02[4] = "ntIDxfuQXDdGI2t9y";
                                        }
                                        break;
                                    case 2:
                                        jA00 = A00(attributeValue, gf);
                                        break;
                                    case 3:
                                        java.lang.String[] strArrA0D = anonymousClass47.A0D(attributeValue);
                                        if (strArrA0D.length > 0) {
                                            strArr = strArrA0D;
                                        }
                                        break;
                                    case 4:
                                        boolean zContainsKey = map.containsKey(attributeValue);
                                        java.lang.String[] strArr3 = A02;
                                        if (strArr3[6].charAt(31) == strArr3[7].charAt(31)) {
                                            A02[3] = "L0ZtifNqpxSGUOW";
                                            if (zContainsKey) {
                                                strA08 = attributeValue;
                                            }
                                        } else {
                                            A02[0] = "5h0BzYvwjwJJ0RRHlMSIfGfJueQmiYKk";
                                            if (zContainsKey) {
                                                strA08 = attributeValue;
                                            }
                                        }
                                        break;
                                }
                                i++;
                                anonymousClass47 = this;
                            }
                            throw new java.lang.RuntimeException();
                        }
                        if (gg != null && gg.A02 != androidx.media3.common.C.TIME_UNSET) {
                            if (jA01 != androidx.media3.common.C.TIME_UNSET) {
                                jA01 += gg.A02;
                            }
                            if (jA02 != androidx.media3.common.C.TIME_UNSET) {
                                jA02 += gg.A02;
                            }
                        }
                        if (jA02 == androidx.media3.common.C.TIME_UNSET) {
                            if (jA00 != androidx.media3.common.C.TIME_UNSET) {
                                jA02 = jA01 + jA00;
                            } else if (gg != null) {
                                long j = gg.A01;
                                if (A02[5].charAt(13) != 'p') {
                                    throw new java.lang.RuntimeException();
                                }
                                A02[0] = "hz7aEmxbm3wpG3zoF0cWffVXztLcHnN4";
                                if (j != androidx.media3.common.C.TIME_UNSET) {
                                    jA02 = gg.A01;
                                }
                            }
                        }
                        return com.facebook.ads.redexgen.core.GG.A05(xmlPullParser.getName(), jA01, jA02, gmA06, strArr, strA08);
                    }

                    public static java.lang.String A08(int i, int i2, int i3) {
                        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
                        int i4 = 0;
                        while (true) {
                            int length = bArrCopyOfRange.length;
                            if (A02[3].length() == 29) {
                                throw new java.lang.RuntimeException();
                            }
                            A02[5] = "lfPYUvG2csO3ophSdE9ghMM7c7M5WNIy";
                            if (i4 >= length) {
                                return new java.lang.String(bArrCopyOfRange);
                            }
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 70);
                            i4++;
                        }
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    private java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.GM> A09(org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.GM> map, java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.GH> map2, com.facebook.ads.redexgen.core.GE ge) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
                        com.facebook.ads.redexgen.core.GH ghA04;
                        do {
                            xmlPullParser.next();
                            java.lang.String strA08 = A08(1350, 5, 103);
                            if (com.facebook.ads.redexgen.core.IL.A04(xmlPullParser, strA08)) {
                                java.lang.String strA00 = com.facebook.ads.redexgen.core.IL.A00(xmlPullParser, strA08);
                                com.facebook.ads.redexgen.core.GM gmA06 = A06(xmlPullParser, new com.facebook.ads.redexgen.core.GM());
                                if (strA00 != null) {
                                    java.lang.String[] strArrA0D = A0D(strA00);
                                    for (java.lang.String str2 : strArrA0D) {
                                        gmA06.A0E(map.get(str2));
                                    }
                                }
                                java.lang.String strA0M = gmA06.A0M();
                                if (A02[4].length() != 17) {
                                    throw new java.lang.RuntimeException();
                                }
                                A02[5] = "7fn6ufwdKmfvopYXTYWOtezKPVwS6HMn";
                                if (strA0M != null) {
                                    map.put(gmA06.A0M(), gmA06);
                                }
                            } else if (com.facebook.ads.redexgen.core.IL.A04(xmlPullParser, A08(1291, 6, 32)) && (ghA04 = A04(xmlPullParser, ge)) != null) {
                                map2.put(ghA04.A07, ghA04);
                            }
                        } while (!com.facebook.ads.redexgen.core.IL.A03(xmlPullParser, A08(1179, 4, 5)));
                        return map;
                    }

                    public static void A0A() {
                        A01 = new byte[]{13, 60, 13, 4, 70, 33, 13, 23, 14, 6, 12, 69, 22, 66, 1, 16, 7, 3, 22, 7, 66, 58, 15, 14, 50, 23, 14, 14, 50, 3, 16, 17, 7, 16, 36, 3, 1, 22, 13, 16, 27, 66, 11, 12, 17, 22, 3, 12, 1, 7, 83, 116, 124, 121, 112, 113, 53, 101, 116, 103, 102, 124, 123, 114, 53, 119, 116, 118, 126, 114, 103, 122, 96, 123, 113, 53, 99, 116, 121, 96, 112, 47, 53, 28, 59, 51, 54, okio.Utf8.REPLACEMENT_BYTE, 62, 122, 42, 59, 40, 41, 51, 52, kotlin.io.encoding.Base64.padSymbol, 122, 57, 53, 54, 53, 40, 122, 44, 59, 54, 47, okio.Utf8.REPLACEMENT_BYTE, 96, 122, 96, 71, 79, 74, 67, 66, 6, 86, 71, 84, 85, 79, 72, 65, 6, 64, 73, 72, 82, 117, 79, 92, 67, 6, 80, 71, 74, 83, 67, 28, 6, 94, 112, 121, 120, 101, 126, 121, 112, 55, 122, 118, 123, 113, 120, 101, 122, 114, 115, 55, 116, 114, 123, 123, 55, 101, 114, 100, 120, 123, 98, 99, 126, 120, 121, 45, 55, 64, 110, 103, 102, 123, 96, 103, 110, 41, 123, 108, 110, 96, 102, 103, 41, 126, 96, 125, 97, 41, 100, 104, 101, 111, 102, 123, 100, 108, 109, 41, 108, 113, 125, 108, 103, 125, 51, 41, okio.Utf8.REPLACEMENT_BYTE, 17, 24, 25, 4, 31, 24, 17, 86, 4, 19, 17, 31, 25, 24, 86, 1, 31, 2, 30, 86, 27, 23, 26, 16, 25, 4, 27, 19, 18, 86, 25, 4, 31, 17, 31, 24, 76, 86, okio.Utf8.REPLACEMENT_BYTE, 17, 24, 25, 4, 31, 24, 17, 86, 4, 19, 17, 31, 25, 24, 86, 1, 31, 2, 30, 86, 3, 24, 5, 3, 6, 6, 25, 4, 2, 19, 18, 86, 19, 14, 2, 19, 24, 2, 76, 86, 25, 55, 62, okio.Utf8.REPLACEMENT_BYTE, 34, 57, 62, 55, 112, 34, 53, 55, 57, okio.Utf8.REPLACEMENT_BYTE, 62, 112, 39, 57, 36, 56, 112, 37, 62, 35, 37, 32, 32, okio.Utf8.REPLACEMENT_BYTE, 34, 36, 53, 52, 112, okio.Utf8.REPLACEMENT_BYTE, 34, 57, 55, 57, 62, 106, 112, 84, 122, 115, 114, 111, 116, 115, 122, kotlin.io.encoding.Base64.padSymbol, 111, 120, 122, 116, 114, 115, kotlin.io.encoding.Base64.padSymbol, 106, 116, 105, 117, 114, 104, 105, kotlin.io.encoding.Base64.padSymbol, 124, 115, kotlin.io.encoding.Base64.padSymbol, 120, 101, 105, 120, 115, 105, 37, 11, 2, 3, 30, 5, 2, 11, 76, 30, 9, 11, 5, 3, 2, 76, 27, 5, 24, 4, 3, 25, 24, 76, 13, 2, 76, 3, 30, 5, 11, 5, 2, 112, 94, 87, 86, 75, 80, 87, 94, 25, 76, 87, 74, 76, 73, 73, 86, 75, 77, 92, 93, 25, 77, 88, 94, 3, 25, 99, 68, 92, 75, 70, 67, 78, 10, 73, 79, 70, 70, 10, 88, 79, 89, 69, 70, 95, 94, 67, 69, 68, 10, 123, 92, 68, 83, 94, 91, 86, 18, 87, 74, 66, 64, 87, 65, 65, 91, 93, 92, 18, 84, 93, 64, 18, 84, 93, 92, 70, 97, 91, 72, 87, 8, 18, 21, 32, 7, 31, 8, 5, 0, 13, 73, 7, 28, 4, 11, 12, 27, 73, 6, 15, 73, 12, 7, 29, 27, 0, 12, 26, 73, 15, 6, 27, 73, 15, 6, 7, 29, 58, 0, 19, 12, 83, 73, 25, 62, 38, 49, 60, 57, 52, 112, 37, 62, 57, 36, 112, 54, okio.Utf8.REPLACEMENT_BYTE, 34, 112, 54, okio.Utf8.REPLACEMENT_BYTE, 62, 36, 3, 57, 42, 53, 106, 112, 119, 23, 59, 54, 60, 53, 40, 55, okio.Utf8.REPLACEMENT_BYTE, 62, 122, 46, 51, 55, okio.Utf8.REPLACEMENT_BYTE, 122, okio.Utf8.REPLACEMENT_BYTE, 34, 42, 40, okio.Utf8.REPLACEMENT_BYTE, 41, 41, 51, 53, 52, 96, 122, 73, 113, 104, 112, 109, 116, 104, 97, 36, 114, 101, 104, 113, 97, 119, 36, 109, 106, 36, 98, 107, 106, 112, 87, 109, 126, 97, 36, 101, 112, 112, 118, 109, 102, 113, 112, 97, 42, 36, 84, 109, 103, 111, 109, 106, 99, 36, 112, 108, 97, 36, 119, 97, 103, 107, 106, 96, 36, 114, 101, 104, 113, 97, 36, 98, 107, 118, 36, 114, 97, 118, 112, 109, 103, 101, 104, 36, 98, 107, 106, 112, 36, 119, 109, 126, 97, 36, 101, 106, 96, 36, 109, 99, 106, 107, 118, 109, 106, 99, 36, 112, 108, 97, 36, 98, 109, 118, 119, 112, 42, 40, 14, 11, 11, 9, 30, 8, 8, 18, 21, 28, 91, 11, 26, 9, 8, 30, 9, 91, 30, 9, 9, 20, 9, 99, 67, 90, 91, 115, 82, 84, 88, 83, 82, 69, 117, 78, 65, 66, 76, 69, 0, 84, 79, 0, 68, 69, 67, 79, 68, 69, 0, 83, 79, 85, 82, 67, 69, 14, 53, 62, 35, 43, 62, 56, 47, 62, okio.Utf8.REPLACEMENT_BYTE, 123, 62, 41, 41, 52, 41, 123, 44, 51, 62, 53, 123, 41, 62, 58, okio.Utf8.REPLACEMENT_BYTE, 50, 53, 60, 123, 50, 53, 43, 46, 47, 117, 68, 107, 51, 21, 99, 99, 16, 123, 102, 114, 22, 97, 101, 98, 116, 16, 123, 102, 114, 22, 96, 98, 99, 59, 51, 55, 46, 38, 55, 110, 98, 111, 107, 29, 110, 5, 24, 12, 104, 30, 29, 10, 15, 105, 27, 110, 5, 24, 12, 104, 30, 28, 10, 28, 29, 93, 73, 88, 73, 70, 73, 88, 70, 73, 83, 73, 65, 28, 17, 45, 91, 40, 67, 94, 74, 46, 40, 67, 94, 74, 46, 88, 90, 73, 91, 40, 67, 94, 74, 46, 40, 67, 94, 74, 46, 90, 73, 91, 40, 67, 94, 74, 46, 40, 67, 94, 74, 46, 90, 91, 76, 73, 91, 47, 93, 40, 67, 94, 74, 46, 88, 90, 15, 73, 91, 40, 67, 94, 74, 46, 40, 67, 94, 74, 46, 90, 91, 76, 73, 47, 93, 91, 40, 67, 94, 74, 46, 88, 90, 90, 76, 90, 76, 87, 39, 81, 37, 29, 82, 80, 89, 81, 37, 29, 82, 80, 93, 40, 94, 42, 18, 93, 42, 88, 73, 42, 18, 92, 73, 95, 83, 86, 94, 42, 18, 93, 42, 88, 73, 42, 18, 92, 73, 95, 83, 82, 111, 104, 122, 107, 124, 72, 75, 73, 65, 77, 88, 69, 95, 68, 78, 105, 69, 
                        70, 69, 88, 70, 65, 67, 77, 74, 26, 23, 28, 1, 36, 41, 42, 34, 116, 100, 10, 12, 5, 5, 59, 12, 26, 6, 5, 28, 29, 0, 6, 7, 84, 82, 89, 67, 82, 69, 0, 12, 15, 12, 17, 37, 40, 50, 49, 45, 32, 56, 0, 45, 40, 38, 47, 98, 111, 112, 55, 38, 33, 121, 113, 107, 96, 106, 40, 53, 57, 40, 35, 57, 96, 74, 67, 66, 88, 106, 77, 65, 69, 64, 85, 80, 89, 88, 66, 101, 95, 76, 83, 0, 9, 8, 18, 53, 18, 31, 10, 3, 118, 127, 126, 100, 71, 117, 121, 119, 120, 100, 21, 1, 18, 30, 22, 33, 18, 7, 22, 105, 125, 110, 98, 106, 93, 110, 123, 106, 66, 122, 99, 123, 102, 127, 99, 102, 106, 125, 58, 46, kotlin.io.encoding.Base64.padSymbol, 49, 57, 14, kotlin.io.encoding.Base64.padSymbol, 40, 57, 17, 41, 48, 40, 53, 44, 48, 53, 57, 46, 124, 56, 51, 57, 47, 50, 123, 40, 124, 52, kotlin.io.encoding.Base64.padSymbol, 42, 57, 124, 110, 124, 44, kotlin.io.encoding.Base64.padSymbol, 46, 40, 47, 64, 43, 38, 34, 39, 45, 49, 49, 53, 127, 106, 106, 50, 50, 50, 107, 50, 118, 107, 42, 55, 34, 106, 43, 54, 106, 49, 49, 40, 41, 102, 53, 36, 55, 36, 40, 32, 49, 32, 55, 91, 86, 75, 86, 67, 78, 75, 65, 11, 6, 30, 8, 18, 19, 118, 127, 124, 110, 13, 8, 15, 4, 21, 9, 19, 14, 20, 6, 9, 26, 52, 60, 45, 56, kotlin.io.encoding.Base64.padSymbol, 56, 45, 56, 122, 100, 17, 16, 19, 22, 17, 26, 11, 23, 13, 16, 10, 24, 23, 64, 65, 91, 64, 74, 75, 92, 66, 71, 64, 75, 25, 4, 31, 17, 31, 24, 45, 110, 102, 20, 3, 1, 15, 9, 8, 125, 102, 104, 103, 123, 124, 56, 38, 59, okio.Utf8.REPLACEMENT_BYTE, 46, 113, 47, 42, okio.Utf8.REPLACEMENT_BYTE, 42, 29, 3, 30, 26, 11, 84, 7, 3, 15, 9, 11, 49, 47, 50, 54, 39, 120, 43, 44, 36, 45, 48, 47, 35, 54, 43, 45, 44, 58, 57, 40, 39, 40, 47, 58, 41, 47, 82, 85, 88, 77, 68, 127, 120, 117, 96, 101, 98, 107, 51, 53, 34, 6, 50, 33, 45, 37, 18, 33, 52, 37, 12, 106, 123, 102, 106, 95, 114, 119, 121, 112, 22, 7, 26, 22, 38, 7, 1, 13, 16, 3, 22, 11, 13, 12, 52, 41, 35, 43, 18, 33, 52, 37, 70, 70, 76, 87, 93, 92, 75, 85, 80, 87, 92};
                        java.lang.String[] strArr = A02;
                        if (strArr[6].charAt(31) != strArr[7].charAt(31)) {
                            throw new java.lang.RuntimeException();
                        }
                        A02[3] = "o1LT8QyoUiXDPP";
                    }

                    static {
                        A0A();
                        A06 = java.util.regex.Pattern.compile(A08(856, 85, 53));
                        A08 = java.util.regex.Pattern.compile(A08(819, 37, 115));
                        A07 = java.util.regex.Pattern.compile(A08(790, 29, 13));
                        A09 = java.util.regex.Pattern.compile(A08(954, 29, 48));
                        A05 = java.util.regex.Pattern.compile(A08(941, 13, 63));
                        A04 = new com.facebook.ads.redexgen.core.GF(30.0f, 1, 1);
                        A03 = new com.facebook.ads.redexgen.core.GE(32, 15);
                    }

                    {
                        A08(717, 11, 113);
                        try {
                            this.A00 = org.xmlpull.v1.XmlPullParserFactory.newInstance();
                            this.A00.setNamespaceAware(true);
                        } catch (org.xmlpull.v1.XmlPullParserException e) {
                            throw new java.lang.RuntimeException(A08(5, 45, 36), e);
                        }
                    }

                    private com.facebook.ads.redexgen.core.GE A01(org.xmlpull.v1.XmlPullParser xmlPullParser, com.facebook.ads.redexgen.core.GE ge) throws com.facebook.ads.redexgen.core.C0695Fu {
                        java.lang.String attributeValue = xmlPullParser.getAttributeValue(A08(1183, 35, 3), A08(1018, 14, 47));
                        if (attributeValue == null) {
                            return ge;
                        }
                        java.util.regex.Matcher matcher = A05.matcher(attributeValue);
                        boolean zMatches = matcher.matches();
                        java.lang.String strA08 = A08(org.objectweb.asm.Opcodes.D2I, 36, 81);
                        java.lang.String strA09 = A08(717, 11, 113);
                        if (!zMatches) {
                            java.lang.String cellResolution = strA08 + attributeValue;
                            android.util.Log.w(strA09, cellResolution);
                            return ge;
                        }
                        try {
                            java.lang.String cellResolution2 = matcher.group(1);
                            int i = java.lang.Integer.parseInt(cellResolution2);
                            java.lang.String cellResolution3 = matcher.group(2);
                            int i2 = java.lang.Integer.parseInt(cellResolution3);
                            if (i != 0 && i2 != 0) {
                                return new com.facebook.ads.redexgen.core.GE(i, i2);
                            }
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            java.lang.String cellResolution4 = A08(430, 24, 108);
                            java.lang.StringBuilder sbAppend = sb.append(cellResolution4).append(i);
                            java.lang.String cellResolution5 = A08(0, 1, 107);
                            throw new com.facebook.ads.redexgen.core.C0695Fu(sbAppend.append(cellResolution5).append(i2).toString());
                        } catch (java.lang.NumberFormatException unused) {
                            java.lang.String cellResolution6 = strA08 + attributeValue;
                            android.util.Log.w(strA09, cellResolution6);
                            return ge;
                        }
                    }

                    private com.facebook.ads.redexgen.core.GF A02(org.xmlpull.v1.XmlPullParser xmlPullParser) throws com.facebook.ads.redexgen.core.C0695Fu {
                        int i = 30;
                        java.lang.String strA08 = A08(com.json.mediationsdk.utils.IronSourceConstants.RV_API_IS_CAPPED_TRUE, 9, 53);
                        java.lang.String strA09 = A08(1183, 35, 3);
                        java.lang.String attributeValue = xmlPullParser.getAttributeValue(strA09, strA08);
                        if (attributeValue != null) {
                            i = java.lang.Integer.parseInt(attributeValue);
                        }
                        float f = 1.0f;
                        java.lang.String attributeValue2 = xmlPullParser.getAttributeValue(strA09, A08(1119, 19, 73));
                        if (attributeValue2 != null) {
                            java.lang.String[] strArrA0l = com.facebook.ads.redexgen.core.IK.A0l(attributeValue2, A08(0, 1, 107));
                            if (strArrA0l.length == 2) {
                                int frameRate = java.lang.Integer.parseInt(strArrA0l[0]);
                                float f2 = frameRate;
                                int frameRate2 = java.lang.Integer.parseInt(strArrA0l[1]);
                                f = f2 / frameRate2;
                            } else {
                                java.lang.String frameRateString = A08(1138, 40, 26);
                                throw new com.facebook.ads.redexgen.core.C0695Fu(frameRateString);
                            }
                        }
                        int i2 = A04.A01;
                        java.lang.String attributeValue3 = xmlPullParser.getAttributeValue(strA09, A08(1362, 12, 6));
                        if (attributeValue3 != null) {
                            i2 = java.lang.Integer.parseInt(attributeValue3);
                        }
                        int i3 = A04.A02;
                        java.lang.String attributeValue4 = xmlPullParser.getAttributeValue(strA09, A08(1398, 8, 6));
                        if (attributeValue4 != null) {
                            i3 = java.lang.Integer.parseInt(attributeValue4);
                        }
                        return new com.facebook.ads.redexgen.core.GF(i * f, i2, i3);
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code duplicated, block: B:20:0x0096  */
                    private com.facebook.ads.redexgen.core.GH A04(org.xmlpull.v1.XmlPullParser xmlPullParser, com.facebook.ads.redexgen.core.GE ge) {
                        java.lang.String strA00 = com.facebook.ads.redexgen.core.IL.A00(xmlPullParser, A08(1218, 2, 116));
                        if (strA00 == null) {
                            return null;
                        }
                        java.lang.String strA01 = com.facebook.ads.redexgen.core.IL.A00(xmlPullParser, A08(1282, 6, 48));
                        java.lang.String strA08 = A08(717, 11, 113);
                        if (strA01 != null) {
                            java.util.regex.Matcher matcher = A09.matcher(strA01);
                            if (matcher.matches()) {
                                byte b2 = 1;
                                try {
                                    float f = java.lang.Float.parseFloat(matcher.group(1)) / 100.0f;
                                    float f2 = java.lang.Float.parseFloat(matcher.group(2)) / 100.0f;
                                    java.lang.String strA02 = com.facebook.ads.redexgen.core.IL.A00(xmlPullParser, A08(1066, 6, 11));
                                    if (strA02 != null) {
                                        java.util.regex.Matcher matcher2 = A09.matcher(strA02);
                                        if (matcher2.matches()) {
                                            try {
                                                float width = java.lang.Float.parseFloat(matcher2.group(1)) / 100.0f;
                                                float f3 = java.lang.Float.parseFloat(matcher2.group(2)) / 100.0f;
                                                int i = 0;
                                                java.lang.String strA03 = com.facebook.ads.redexgen.core.IL.A00(xmlPullParser, A08(com.json.mediationsdk.logger.IronSourceError.ERROR_IS_ALL_SMASHES_SESSION_CAPPED, 12, 7));
                                                if (strA03 != null) {
                                                    java.lang.String strA0M = com.facebook.ads.redexgen.core.IK.A0M(strA03);
                                                    switch (strA0M.hashCode()) {
                                                        case -1364013995:
                                                            if (!strA0M.equals(A08(1032, 6, 113))) {
                                                                b2 = -1;
                                                            } else {
                                                                b2 = 0;
                                                            }
                                                            break;
                                                        case 92734940:
                                                            if (!strA0M.equals(A08(983, 5, 72))) {
                                                                b2 = -1;
                                                            }
                                                            break;
                                                        default:
                                                            b2 = -1;
                                                            break;
                                                    }
                                                    switch (b2) {
                                                        case 0:
                                                            i = 1;
                                                            f2 += f3 / 2.0f;
                                                            break;
                                                        case 1:
                                                            i = 2;
                                                            f2 += f3;
                                                            break;
                                                    }
                                                }
                                                int lineAnchor = ge.A01;
                                                return new com.facebook.ads.redexgen.core.GH(strA00, f, f2, 0, i, width, 1, 1.0f / lineAnchor);
                                            } catch (java.lang.NumberFormatException unused) {
                                                android.util.Log.w(strA08, A08(org.objectweb.asm.Opcodes.GETSTATIC, 39, 79) + strA01);
                                                return null;
                                            }
                                        }
                                        android.util.Log.w(strA08, A08(256, 41, 48) + strA01);
                                        return null;
                                    }
                                    if (A02[5].charAt(13) == 'p') {
                                        java.lang.String[] strArr = A02;
                                        strArr[6] = "dhqlpsLC5WagVEdGwRptFx7biaDz0NZi";
                                        strArr[7] = "azoOFIoYAKi5Ld8sxOStbAiEzPz3JTBi";
                                        android.util.Log.w(strA08, A08(338, 33, 91));
                                        return null;
                                    }
                                } catch (java.lang.NumberFormatException unused2) {
                                    android.util.Log.w(strA08, A08(217, 39, 48) + strA01);
                                    return null;
                                }
                            } else {
                                android.util.Log.w(strA08, A08(297, 41, 22) + strA01);
                                return null;
                            }
                        } else {
                            java.lang.String strA09 = A08(371, 33, 42);
                            if (A02[5].charAt(13) == 'p') {
                                A02[0] = "lDCdMRxypowSXCEQ3GYTTCytanBmrDPY";
                                android.util.Log.w(strA08, strA09);
                                return null;
                            }
                        }
                        throw new java.lang.RuntimeException();
                    }

                    private com.facebook.ads.redexgen.core.GM A05(com.facebook.ads.redexgen.core.GM gm) {
                        return gm == null ? new com.facebook.ads.redexgen.core.GM() : gm;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code duplicated, block: B:109:0x020e A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
                    /* JADX WARN: Code duplicated, block: B:112:0x0299 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:114:0x0028 A[DONT_GENERATE, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:131:0x0028 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:135:0x0028 A[DONT_GENERATE, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:136:0x0028 A[DONT_GENERATE, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
                    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
                    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
                    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
                    /* JADX WARN: Code duplicated, block: B:21:0x0076  */
                    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
                    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
                    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
                    /* JADX WARN: Code duplicated, block: B:28:0x009b  */
                    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
                    /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
                    /* JADX WARN: Code duplicated, block: B:32:0x00b7  */
                    /* JADX WARN: Code duplicated, block: B:33:0x00c1  */
                    /* JADX WARN: Code duplicated, block: B:34:0x00cb  */
                    /* JADX WARN: Code duplicated, block: B:35:0x00d5  */
                    /* JADX WARN: Code duplicated, block: B:37:0x00e0  */
                    /* JADX WARN: Code duplicated, block: B:40:0x00e6  */
                    /* JADX WARN: Code duplicated, block: B:42:0x00f5  */
                    /* JADX WARN: Code duplicated, block: B:43:0x00f7  */
                    /* JADX WARN: Code duplicated, block: B:45:0x0106  */
                    /* JADX WARN: Code duplicated, block: B:46:0x0108  */
                    /* JADX WARN: Code duplicated, block: B:48:0x0117  */
                    /* JADX WARN: Code duplicated, block: B:49:0x0119  */
                    /* JADX WARN: Code duplicated, block: B:51:0x0128  */
                    /* JADX WARN: Code duplicated, block: B:52:0x012a  */
                    /* JADX WARN: Code duplicated, block: B:55:0x013a  */
                    /* JADX WARN: Code duplicated, block: B:56:0x0146  */
                    /* JADX WARN: Code duplicated, block: B:57:0x0152  */
                    /* JADX WARN: Code duplicated, block: B:58:0x015e  */
                    /* JADX WARN: Code duplicated, block: B:59:0x016a  */
                    /* JADX WARN: Code duplicated, block: B:60:0x0176  */
                    /* JADX WARN: Code duplicated, block: B:61:0x018d  */
                    /* JADX WARN: Code duplicated, block: B:62:0x0197  */
                    /* JADX WARN: Code duplicated, block: B:65:0x01c4  */
                    /* JADX WARN: Code duplicated, block: B:68:0x01f1  */
                    /* JADX WARN: Code duplicated, block: B:6:0x001a  */
                    /* JADX WARN: Code duplicated, block: B:70:0x0204  */
                    private com.facebook.ads.redexgen.core.GM A06(org.xmlpull.v1.XmlPullParser xmlPullParser, com.facebook.ads.redexgen.core.GM gm) {
                        byte b2;
                        java.lang.String strA0M;
                        int attributeCount;
                        java.lang.String strA0M2;
                        int attributeCount2;
                        com.facebook.ads.redexgen.core.GM gmA05;
                        java.lang.String strA08;
                        int i;
                        int attributeCount3 = xmlPullParser.getAttributeCount();
                        for (int i2 = 0; i2 < attributeCount3; i2++) {
                            java.lang.String attributeValue = xmlPullParser.getAttributeValue(i2);
                            java.lang.String attributeName = xmlPullParser.getAttributeName(i2);
                            int attributeCount4 = attributeName.hashCode();
                            byte b3 = 4;
                            byte b4 = 2;
                            switch (attributeCount4) {
                                case -1550943582:
                                    if (attributeName.equals(A08(1091, 9, 32))) {
                                        b2 = 6;
                                    } else {
                                        b2 = -1;
                                    }
                                    java.lang.String strA09 = A08(717, 11, 113);
                                    switch (b2) {
                                        case 0:
                                            if (A08(1350, 5, 103).equals(xmlPullParser.getName())) {
                                                gm = A05(gm).A0G(attributeValue);
                                            }
                                            break;
                                        case 1:
                                            gm = A05(gm);
                                            try {
                                                int attributeCount5 = com.facebook.ads.redexgen.core.AbstractC0735Hk.A03(attributeValue);
                                                gm.A0A(attributeCount5);
                                            } catch (java.lang.IllegalArgumentException unused) {
                                                android.util.Log.w(strA09, A08(50, 33, 83) + attributeValue);
                                            }
                                            break;
                                        case 2:
                                            gm = A05(gm);
                                            try {
                                                int attributeCount6 = com.facebook.ads.redexgen.core.AbstractC0735Hk.A03(attributeValue);
                                                gm.A0B(attributeCount6);
                                            } catch (java.lang.IllegalArgumentException unused2) {
                                                android.util.Log.w(strA09, A08(83, 28, 28) + attributeValue);
                                            }
                                            break;
                                        case 3:
                                            gm = A05(gm).A0F(attributeValue);
                                            break;
                                        case 4:
                                            try {
                                                gm = A05(gm);
                                                A0B(attributeValue, gm);
                                            } catch (com.facebook.ads.redexgen.core.C0695Fu unused3) {
                                                android.util.Log.w(strA09, A08(111, 31, 96) + attributeValue);
                                            }
                                            break;
                                        case 5:
                                            gmA05 = A05(gm);
                                            strA08 = A08(1012, 4, 0);
                                            i = A02[4].length();
                                            if (i == 17) {
                                                throw new java.lang.RuntimeException();
                                            }
                                            A02[0] = "yrvVxtIDciql8HLlyPVX9f0c1nZtUr6R";
                                            gm = gmA05.A0H(strA08.equalsIgnoreCase(attributeValue));
                                            break;
                                            break;
                                        case 6:
                                            gm = A05(gm).A0I(A08(com.json.mediationsdk.utils.IronSourceConstants.RV_MEDIATION_LOAD_ERROR, 6, 100).equalsIgnoreCase(attributeValue));
                                            break;
                                        case 7:
                                            strA0M = com.facebook.ads.redexgen.core.IK.A0M(attributeValue);
                                            attributeCount = strA0M.hashCode();
                                            switch (attributeCount) {
                                                case -1364013995:
                                                    if (!strA0M.equals(A08(1032, 6, 113))) {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 100571:
                                                    if (strA0M.equals(A08(1063, 3, 72))) {
                                                        b3 = 3;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3317767:
                                                    if (strA0M.equals(A08(1232, 4, 92))) {
                                                        b3 = 0;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 108511772:
                                                    if (strA0M.equals(A08(1297, 5, 73))) {
                                                        b3 = 2;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 109757538:
                                                    if (strA0M.equals(A08(1345, 5, 29))) {
                                                        b3 = 1;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b3 = -1;
                                                    break;
                                            }
                                            switch (b3) {
                                                case 0:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_NORMAL);
                                                    break;
                                                case 1:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_NORMAL);
                                                    break;
                                                case 2:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_OPPOSITE);
                                                    break;
                                                case 3:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_OPPOSITE);
                                                    break;
                                                case 4:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_CENTER);
                                                    break;
                                            }
                                            break;
                                        case 8:
                                            strA0M2 = com.facebook.ads.redexgen.core.IK.A0M(attributeValue);
                                            attributeCount2 = strA0M2.hashCode();
                                            switch (attributeCount2) {
                                                case -1461280213:
                                                    if (strA0M2.equals(A08(1271, 11, 104))) {
                                                        b4 = 3;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -1026963764:
                                                    if (!strA0M2.equals(A08(1408, 9, 127))) {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 913457136:
                                                    if (strA0M2.equals(A08(1258, 13, 57))) {
                                                        b4 = 1;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 1679736913:
                                                    if (strA0M2.equals(A08(1236, 11, 39))) {
                                                        b4 = 0;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b4 = -1;
                                                    break;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    gm = A05(gm).A0J(true);
                                                    break;
                                                case 1:
                                                    gm = A05(gm).A0J(false);
                                                    break;
                                                case 2:
                                                    gm = A05(gm).A0K(true);
                                                    break;
                                                case 3:
                                                    gm = A05(gm).A0K(false);
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                                case -1224696685:
                                    if (attributeName.equals(A08(1073, 10, 106))) {
                                        b2 = 3;
                                    } else {
                                        b2 = -1;
                                    }
                                    java.lang.String strA010 = A08(717, 11, 113);
                                    switch (b2) {
                                        case 0:
                                            if (A08(1350, 5, 103).equals(xmlPullParser.getName())) {
                                                gm = A05(gm).A0G(attributeValue);
                                            }
                                            break;
                                        case 1:
                                            gm = A05(gm);
                                            int attributeCount7 = com.facebook.ads.redexgen.core.AbstractC0735Hk.A03(attributeValue);
                                            gm.A0A(attributeCount7);
                                            break;
                                        case 2:
                                            gm = A05(gm);
                                            int attributeCount8 = com.facebook.ads.redexgen.core.AbstractC0735Hk.A03(attributeValue);
                                            gm.A0B(attributeCount8);
                                            break;
                                        case 3:
                                            gm = A05(gm).A0F(attributeValue);
                                            break;
                                        case 4:
                                            gm = A05(gm);
                                            A0B(attributeValue, gm);
                                            break;
                                        case 5:
                                            gmA05 = A05(gm);
                                            strA08 = A08(1012, 4, 0);
                                            i = A02[4].length();
                                            if (i == 17) {
                                                throw new java.lang.RuntimeException();
                                            }
                                            A02[0] = "yrvVxtIDciql8HLlyPVX9f0c1nZtUr6R";
                                            gm = gmA05.A0H(strA08.equalsIgnoreCase(attributeValue));
                                            break;
                                            break;
                                        case 6:
                                            gm = A05(gm).A0I(A08(com.json.mediationsdk.utils.IronSourceConstants.RV_MEDIATION_LOAD_ERROR, 6, 100).equalsIgnoreCase(attributeValue));
                                            break;
                                        case 7:
                                            strA0M = com.facebook.ads.redexgen.core.IK.A0M(attributeValue);
                                            attributeCount = strA0M.hashCode();
                                            switch (attributeCount) {
                                                case -1364013995:
                                                    if (!strA0M.equals(A08(1032, 6, 113))) {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 100571:
                                                    if (strA0M.equals(A08(1063, 3, 72))) {
                                                        b3 = 3;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3317767:
                                                    if (strA0M.equals(A08(1232, 4, 92))) {
                                                        b3 = 0;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 108511772:
                                                    if (strA0M.equals(A08(1297, 5, 73))) {
                                                        b3 = 2;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 109757538:
                                                    if (strA0M.equals(A08(1345, 5, 29))) {
                                                        b3 = 1;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b3 = -1;
                                                    break;
                                            }
                                            switch (b3) {
                                                case 0:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_NORMAL);
                                                    break;
                                                case 1:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_NORMAL);
                                                    break;
                                                case 2:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_OPPOSITE);
                                                    break;
                                                case 3:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_OPPOSITE);
                                                    break;
                                                case 4:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_CENTER);
                                                    break;
                                            }
                                            break;
                                        case 8:
                                            strA0M2 = com.facebook.ads.redexgen.core.IK.A0M(attributeValue);
                                            attributeCount2 = strA0M2.hashCode();
                                            switch (attributeCount2) {
                                                case -1461280213:
                                                    if (strA0M2.equals(A08(1271, 11, 104))) {
                                                        b4 = 3;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -1026963764:
                                                    if (!strA0M2.equals(A08(1408, 9, 127))) {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 913457136:
                                                    if (strA0M2.equals(A08(1258, 13, 57))) {
                                                        b4 = 1;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 1679736913:
                                                    if (strA0M2.equals(A08(1236, 11, 39))) {
                                                        b4 = 0;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b4 = -1;
                                                    break;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    gm = A05(gm).A0J(true);
                                                    break;
                                                case 1:
                                                    gm = A05(gm).A0J(false);
                                                    break;
                                                case 2:
                                                    gm = A05(gm).A0K(true);
                                                    break;
                                                case 3:
                                                    gm = A05(gm).A0K(false);
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                                case -1065511464:
                                    if (attributeName.equals(A08(1375, 9, 88))) {
                                        b2 = 7;
                                    } else {
                                        b2 = -1;
                                    }
                                    java.lang.String strA011 = A08(717, 11, 113);
                                    switch (b2) {
                                        case 0:
                                            if (A08(1350, 5, 103).equals(xmlPullParser.getName())) {
                                                gm = A05(gm).A0G(attributeValue);
                                            }
                                            break;
                                        case 1:
                                            gm = A05(gm);
                                            int attributeCount9 = com.facebook.ads.redexgen.core.AbstractC0735Hk.A03(attributeValue);
                                            gm.A0A(attributeCount9);
                                            break;
                                        case 2:
                                            gm = A05(gm);
                                            int attributeCount10 = com.facebook.ads.redexgen.core.AbstractC0735Hk.A03(attributeValue);
                                            gm.A0B(attributeCount10);
                                            break;
                                        case 3:
                                            gm = A05(gm).A0F(attributeValue);
                                            break;
                                        case 4:
                                            gm = A05(gm);
                                            A0B(attributeValue, gm);
                                            break;
                                        case 5:
                                            gmA05 = A05(gm);
                                            strA08 = A08(1012, 4, 0);
                                            i = A02[4].length();
                                            if (i == 17) {
                                                throw new java.lang.RuntimeException();
                                            }
                                            A02[0] = "yrvVxtIDciql8HLlyPVX9f0c1nZtUr6R";
                                            gm = gmA05.A0H(strA08.equalsIgnoreCase(attributeValue));
                                            break;
                                            break;
                                        case 6:
                                            gm = A05(gm).A0I(A08(com.json.mediationsdk.utils.IronSourceConstants.RV_MEDIATION_LOAD_ERROR, 6, 100).equalsIgnoreCase(attributeValue));
                                            break;
                                        case 7:
                                            strA0M = com.facebook.ads.redexgen.core.IK.A0M(attributeValue);
                                            attributeCount = strA0M.hashCode();
                                            switch (attributeCount) {
                                                case -1364013995:
                                                    if (!strA0M.equals(A08(1032, 6, 113))) {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 100571:
                                                    if (strA0M.equals(A08(1063, 3, 72))) {
                                                        b3 = 3;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3317767:
                                                    if (strA0M.equals(A08(1232, 4, 92))) {
                                                        b3 = 0;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 108511772:
                                                    if (strA0M.equals(A08(1297, 5, 73))) {
                                                        b3 = 2;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 109757538:
                                                    if (strA0M.equals(A08(1345, 5, 29))) {
                                                        b3 = 1;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b3 = -1;
                                                    break;
                                            }
                                            switch (b3) {
                                                case 0:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_NORMAL);
                                                    break;
                                                case 1:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_NORMAL);
                                                    break;
                                                case 2:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_OPPOSITE);
                                                    break;
                                                case 3:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_OPPOSITE);
                                                    break;
                                                case 4:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_CENTER);
                                                    break;
                                            }
                                            break;
                                        case 8:
                                            strA0M2 = com.facebook.ads.redexgen.core.IK.A0M(attributeValue);
                                            attributeCount2 = strA0M2.hashCode();
                                            switch (attributeCount2) {
                                                case -1461280213:
                                                    if (strA0M2.equals(A08(1271, 11, 104))) {
                                                        b4 = 3;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -1026963764:
                                                    if (!strA0M2.equals(A08(1408, 9, 127))) {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 913457136:
                                                    if (strA0M2.equals(A08(1258, 13, 57))) {
                                                        b4 = 1;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 1679736913:
                                                    if (strA0M2.equals(A08(1236, 11, 39))) {
                                                        b4 = 0;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b4 = -1;
                                                    break;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    gm = A05(gm).A0J(true);
                                                    break;
                                                case 1:
                                                    gm = A05(gm).A0J(false);
                                                    break;
                                                case 2:
                                                    gm = A05(gm).A0K(true);
                                                    break;
                                                case 3:
                                                    gm = A05(gm).A0K(false);
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                                case -879295043:
                                    if (attributeName.equals(A08(1384, 14, 36))) {
                                        b2 = 8;
                                    } else {
                                        b2 = -1;
                                    }
                                    java.lang.String strA012 = A08(717, 11, 113);
                                    switch (b2) {
                                        case 0:
                                            if (A08(1350, 5, 103).equals(xmlPullParser.getName())) {
                                                gm = A05(gm).A0G(attributeValue);
                                            }
                                            break;
                                        case 1:
                                            gm = A05(gm);
                                            int attributeCount11 = com.facebook.ads.redexgen.core.AbstractC0735Hk.A03(attributeValue);
                                            gm.A0A(attributeCount11);
                                            break;
                                        case 2:
                                            gm = A05(gm);
                                            int attributeCount12 = com.facebook.ads.redexgen.core.AbstractC0735Hk.A03(attributeValue);
                                            gm.A0B(attributeCount12);
                                            break;
                                        case 3:
                                            gm = A05(gm).A0F(attributeValue);
                                            break;
                                        case 4:
                                            gm = A05(gm);
                                            A0B(attributeValue, gm);
                                            break;
                                        case 5:
                                            gmA05 = A05(gm);
                                            strA08 = A08(1012, 4, 0);
                                            i = A02[4].length();
                                            if (i == 17) {
                                                throw new java.lang.RuntimeException();
                                            }
                                            A02[0] = "yrvVxtIDciql8HLlyPVX9f0c1nZtUr6R";
                                            gm = gmA05.A0H(strA08.equalsIgnoreCase(attributeValue));
                                            break;
                                            break;
                                        case 6:
                                            gm = A05(gm).A0I(A08(com.json.mediationsdk.utils.IronSourceConstants.RV_MEDIATION_LOAD_ERROR, 6, 100).equalsIgnoreCase(attributeValue));
                                            break;
                                        case 7:
                                            strA0M = com.facebook.ads.redexgen.core.IK.A0M(attributeValue);
                                            attributeCount = strA0M.hashCode();
                                            switch (attributeCount) {
                                                case -1364013995:
                                                    if (!strA0M.equals(A08(1032, 6, 113))) {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 100571:
                                                    if (strA0M.equals(A08(1063, 3, 72))) {
                                                        b3 = 3;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3317767:
                                                    if (strA0M.equals(A08(1232, 4, 92))) {
                                                        b3 = 0;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 108511772:
                                                    if (strA0M.equals(A08(1297, 5, 73))) {
                                                        b3 = 2;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 109757538:
                                                    if (strA0M.equals(A08(1345, 5, 29))) {
                                                        b3 = 1;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b3 = -1;
                                                    break;
                                            }
                                            switch (b3) {
                                                case 0:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_NORMAL);
                                                    break;
                                                case 1:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_NORMAL);
                                                    break;
                                                case 2:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_OPPOSITE);
                                                    break;
                                                case 3:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_OPPOSITE);
                                                    break;
                                                case 4:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_CENTER);
                                                    break;
                                            }
                                            break;
                                        case 8:
                                            strA0M2 = com.facebook.ads.redexgen.core.IK.A0M(attributeValue);
                                            attributeCount2 = strA0M2.hashCode();
                                            switch (attributeCount2) {
                                                case -1461280213:
                                                    if (strA0M2.equals(A08(1271, 11, 104))) {
                                                        b4 = 3;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -1026963764:
                                                    if (!strA0M2.equals(A08(1408, 9, 127))) {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 913457136:
                                                    if (strA0M2.equals(A08(1258, 13, 57))) {
                                                        b4 = 1;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 1679736913:
                                                    if (strA0M2.equals(A08(1236, 11, 39))) {
                                                        b4 = 0;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b4 = -1;
                                                    break;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    gm = A05(gm).A0J(true);
                                                    break;
                                                case 1:
                                                    gm = A05(gm).A0J(false);
                                                    break;
                                                case 2:
                                                    gm = A05(gm).A0K(true);
                                                    break;
                                                case 3:
                                                    gm = A05(gm).A0K(false);
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                                case -734428249:
                                    java.lang.String[] strArr = A02;
                                    java.lang.String str2 = strArr[6];
                                    java.lang.String str3 = strArr[7];
                                    int i3 = str2.charAt(31);
                                    int attributeCount13 = str3.charAt(31);
                                    if (i3 == attributeCount13) {
                                        java.lang.String[] strArr2 = A02;
                                        strArr2[1] = "r2BCbcpgAwE6PoxX7IVYlY";
                                        strArr2[2] = "VSzXWCem4uU9iZ8UK3byg9";
                                        if (attributeName.equals(A08(1100, 10, 86))) {
                                            b2 = 5;
                                        } else {
                                            b2 = -1;
                                        }
                                        java.lang.String strA013 = A08(717, 11, 113);
                                        switch (b2) {
                                            case 0:
                                                if (A08(1350, 5, 103).equals(xmlPullParser.getName())) {
                                                    gm = A05(gm).A0G(attributeValue);
                                                }
                                                break;
                                            case 1:
                                                gm = A05(gm);
                                                int attributeCount14 = com.facebook.ads.redexgen.core.AbstractC0735Hk.A03(attributeValue);
                                                gm.A0A(attributeCount14);
                                                break;
                                            case 2:
                                                gm = A05(gm);
                                                int attributeCount15 = com.facebook.ads.redexgen.core.AbstractC0735Hk.A03(attributeValue);
                                                gm.A0B(attributeCount15);
                                                break;
                                            case 3:
                                                gm = A05(gm).A0F(attributeValue);
                                                break;
                                            case 4:
                                                gm = A05(gm);
                                                A0B(attributeValue, gm);
                                                break;
                                            case 5:
                                                gmA05 = A05(gm);
                                                strA08 = A08(1012, 4, 0);
                                                i = A02[4].length();
                                                if (i == 17) {
                                                    A02[0] = "yrvVxtIDciql8HLlyPVX9f0c1nZtUr6R";
                                                    gm = gmA05.A0H(strA08.equalsIgnoreCase(attributeValue));
                                                }
                                                break;
                                            case 6:
                                                gm = A05(gm).A0I(A08(com.json.mediationsdk.utils.IronSourceConstants.RV_MEDIATION_LOAD_ERROR, 6, 100).equalsIgnoreCase(attributeValue));
                                                break;
                                            case 7:
                                                strA0M = com.facebook.ads.redexgen.core.IK.A0M(attributeValue);
                                                attributeCount = strA0M.hashCode();
                                                switch (attributeCount) {
                                                    case -1364013995:
                                                        if (!strA0M.equals(A08(1032, 6, 113))) {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 100571:
                                                        if (strA0M.equals(A08(1063, 3, 72))) {
                                                            b3 = 3;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 3317767:
                                                        if (strA0M.equals(A08(1232, 4, 92))) {
                                                            b3 = 0;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 108511772:
                                                        if (strA0M.equals(A08(1297, 5, 73))) {
                                                            b3 = 2;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    case 109757538:
                                                        if (strA0M.equals(A08(1345, 5, 29))) {
                                                            b3 = 1;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        break;
                                                    default:
                                                        b3 = -1;
                                                        break;
                                                }
                                                switch (b3) {
                                                    case 0:
                                                        gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_NORMAL);
                                                        break;
                                                    case 1:
                                                        gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_NORMAL);
                                                        break;
                                                    case 2:
                                                        gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_OPPOSITE);
                                                        break;
                                                    case 3:
                                                        gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_OPPOSITE);
                                                        break;
                                                    case 4:
                                                        gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_CENTER);
                                                        break;
                                                }
                                                break;
                                            case 8:
                                                strA0M2 = com.facebook.ads.redexgen.core.IK.A0M(attributeValue);
                                                attributeCount2 = strA0M2.hashCode();
                                                switch (attributeCount2) {
                                                    case -1461280213:
                                                        if (strA0M2.equals(A08(1271, 11, 104))) {
                                                            b4 = 3;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case -1026963764:
                                                        if (!strA0M2.equals(A08(1408, 9, 127))) {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 913457136:
                                                        if (strA0M2.equals(A08(1258, 13, 57))) {
                                                            b4 = 1;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    case 1679736913:
                                                        if (strA0M2.equals(A08(1236, 11, 39))) {
                                                            b4 = 0;
                                                        } else {
                                                            b4 = -1;
                                                        }
                                                        break;
                                                    default:
                                                        b4 = -1;
                                                        break;
                                                }
                                                switch (b4) {
                                                    case 0:
                                                        gm = A05(gm).A0J(true);
                                                        break;
                                                    case 1:
                                                        gm = A05(gm).A0J(false);
                                                        break;
                                                    case 2:
                                                        gm = A05(gm).A0K(true);
                                                        break;
                                                    case 3:
                                                        gm = A05(gm).A0K(false);
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                    }
                                    throw new java.lang.RuntimeException();
                                case 3355:
                                    if (attributeName.equals(A08(1218, 2, 116))) {
                                        b2 = 0;
                                    } else {
                                        b2 = -1;
                                    }
                                    java.lang.String strA014 = A08(717, 11, 113);
                                    switch (b2) {
                                        case 0:
                                            if (A08(1350, 5, 103).equals(xmlPullParser.getName())) {
                                                gm = A05(gm).A0G(attributeValue);
                                            }
                                            break;
                                        case 1:
                                            gm = A05(gm);
                                            int attributeCount16 = com.facebook.ads.redexgen.core.AbstractC0735Hk.A03(attributeValue);
                                            gm.A0A(attributeCount16);
                                            break;
                                        case 2:
                                            gm = A05(gm);
                                            int attributeCount17 = com.facebook.ads.redexgen.core.AbstractC0735Hk.A03(attributeValue);
                                            gm.A0B(attributeCount17);
                                            break;
                                        case 3:
                                            gm = A05(gm).A0F(attributeValue);
                                            break;
                                        case 4:
                                            gm = A05(gm);
                                            A0B(attributeValue, gm);
                                            break;
                                        case 5:
                                            gmA05 = A05(gm);
                                            strA08 = A08(1012, 4, 0);
                                            i = A02[4].length();
                                            if (i == 17) {
                                                throw new java.lang.RuntimeException();
                                            }
                                            A02[0] = "yrvVxtIDciql8HLlyPVX9f0c1nZtUr6R";
                                            gm = gmA05.A0H(strA08.equalsIgnoreCase(attributeValue));
                                            break;
                                            break;
                                        case 6:
                                            gm = A05(gm).A0I(A08(com.json.mediationsdk.utils.IronSourceConstants.RV_MEDIATION_LOAD_ERROR, 6, 100).equalsIgnoreCase(attributeValue));
                                            break;
                                        case 7:
                                            strA0M = com.facebook.ads.redexgen.core.IK.A0M(attributeValue);
                                            attributeCount = strA0M.hashCode();
                                            switch (attributeCount) {
                                                case -1364013995:
                                                    if (!strA0M.equals(A08(1032, 6, 113))) {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 100571:
                                                    if (strA0M.equals(A08(1063, 3, 72))) {
                                                        b3 = 3;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3317767:
                                                    if (strA0M.equals(A08(1232, 4, 92))) {
                                                        b3 = 0;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 108511772:
                                                    if (strA0M.equals(A08(1297, 5, 73))) {
                                                        b3 = 2;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 109757538:
                                                    if (strA0M.equals(A08(1345, 5, 29))) {
                                                        b3 = 1;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b3 = -1;
                                                    break;
                                            }
                                            switch (b3) {
                                                case 0:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_NORMAL);
                                                    break;
                                                case 1:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_NORMAL);
                                                    break;
                                                case 2:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_OPPOSITE);
                                                    break;
                                                case 3:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_OPPOSITE);
                                                    break;
                                                case 4:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_CENTER);
                                                    break;
                                            }
                                            break;
                                        case 8:
                                            strA0M2 = com.facebook.ads.redexgen.core.IK.A0M(attributeValue);
                                            attributeCount2 = strA0M2.hashCode();
                                            switch (attributeCount2) {
                                                case -1461280213:
                                                    if (strA0M2.equals(A08(1271, 11, 104))) {
                                                        b4 = 3;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -1026963764:
                                                    if (!strA0M2.equals(A08(1408, 9, 127))) {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 913457136:
                                                    if (strA0M2.equals(A08(1258, 13, 57))) {
                                                        b4 = 1;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 1679736913:
                                                    if (strA0M2.equals(A08(1236, 11, 39))) {
                                                        b4 = 0;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b4 = -1;
                                                    break;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    gm = A05(gm).A0J(true);
                                                    break;
                                                case 1:
                                                    gm = A05(gm).A0J(false);
                                                    break;
                                                case 2:
                                                    gm = A05(gm).A0K(true);
                                                    break;
                                                case 3:
                                                    gm = A05(gm).A0K(false);
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                                case 94842723:
                                    if (attributeName.equals(A08(com.json.mediationsdk.logger.IronSourceError.ERROR_RV_SHOW_EXCEPTION, 5, 37))) {
                                        b2 = 2;
                                    } else {
                                        b2 = -1;
                                    }
                                    java.lang.String strA015 = A08(717, 11, 113);
                                    switch (b2) {
                                        case 0:
                                            if (A08(1350, 5, 103).equals(xmlPullParser.getName())) {
                                                gm = A05(gm).A0G(attributeValue);
                                            }
                                            break;
                                        case 1:
                                            gm = A05(gm);
                                            int attributeCount18 = com.facebook.ads.redexgen.core.AbstractC0735Hk.A03(attributeValue);
                                            gm.A0A(attributeCount18);
                                            break;
                                        case 2:
                                            gm = A05(gm);
                                            int attributeCount19 = com.facebook.ads.redexgen.core.AbstractC0735Hk.A03(attributeValue);
                                            gm.A0B(attributeCount19);
                                            break;
                                        case 3:
                                            gm = A05(gm).A0F(attributeValue);
                                            break;
                                        case 4:
                                            gm = A05(gm);
                                            A0B(attributeValue, gm);
                                            break;
                                        case 5:
                                            gmA05 = A05(gm);
                                            strA08 = A08(1012, 4, 0);
                                            i = A02[4].length();
                                            if (i == 17) {
                                                throw new java.lang.RuntimeException();
                                            }
                                            A02[0] = "yrvVxtIDciql8HLlyPVX9f0c1nZtUr6R";
                                            gm = gmA05.A0H(strA08.equalsIgnoreCase(attributeValue));
                                            break;
                                            break;
                                        case 6:
                                            gm = A05(gm).A0I(A08(com.json.mediationsdk.utils.IronSourceConstants.RV_MEDIATION_LOAD_ERROR, 6, 100).equalsIgnoreCase(attributeValue));
                                            break;
                                        case 7:
                                            strA0M = com.facebook.ads.redexgen.core.IK.A0M(attributeValue);
                                            attributeCount = strA0M.hashCode();
                                            switch (attributeCount) {
                                                case -1364013995:
                                                    if (!strA0M.equals(A08(1032, 6, 113))) {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 100571:
                                                    if (strA0M.equals(A08(1063, 3, 72))) {
                                                        b3 = 3;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3317767:
                                                    if (strA0M.equals(A08(1232, 4, 92))) {
                                                        b3 = 0;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 108511772:
                                                    if (strA0M.equals(A08(1297, 5, 73))) {
                                                        b3 = 2;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 109757538:
                                                    if (strA0M.equals(A08(1345, 5, 29))) {
                                                        b3 = 1;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b3 = -1;
                                                    break;
                                            }
                                            switch (b3) {
                                                case 0:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_NORMAL);
                                                    break;
                                                case 1:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_NORMAL);
                                                    break;
                                                case 2:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_OPPOSITE);
                                                    break;
                                                case 3:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_OPPOSITE);
                                                    break;
                                                case 4:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_CENTER);
                                                    break;
                                            }
                                            break;
                                        case 8:
                                            strA0M2 = com.facebook.ads.redexgen.core.IK.A0M(attributeValue);
                                            attributeCount2 = strA0M2.hashCode();
                                            switch (attributeCount2) {
                                                case -1461280213:
                                                    if (strA0M2.equals(A08(1271, 11, 104))) {
                                                        b4 = 3;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -1026963764:
                                                    if (!strA0M2.equals(A08(1408, 9, 127))) {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 913457136:
                                                    if (strA0M2.equals(A08(1258, 13, 57))) {
                                                        b4 = 1;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 1679736913:
                                                    if (strA0M2.equals(A08(1236, 11, 39))) {
                                                        b4 = 0;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b4 = -1;
                                                    break;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    gm = A05(gm).A0J(true);
                                                    break;
                                                case 1:
                                                    gm = A05(gm).A0J(false);
                                                    break;
                                                case 2:
                                                    gm = A05(gm).A0K(true);
                                                    break;
                                                case 3:
                                                    gm = A05(gm).A0K(false);
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                                case 365601008:
                                    if (attributeName.equals(A08(1083, 8, 112))) {
                                        b2 = 4;
                                    } else {
                                        b2 = -1;
                                    }
                                    java.lang.String strA016 = A08(717, 11, 113);
                                    switch (b2) {
                                        case 0:
                                            if (A08(1350, 5, 103).equals(xmlPullParser.getName())) {
                                                gm = A05(gm).A0G(attributeValue);
                                            }
                                            break;
                                        case 1:
                                            gm = A05(gm);
                                            int attributeCount110 = com.facebook.ads.redexgen.core.AbstractC0735Hk.A03(attributeValue);
                                            gm.A0A(attributeCount110);
                                            break;
                                        case 2:
                                            gm = A05(gm);
                                            int attributeCount111 = com.facebook.ads.redexgen.core.AbstractC0735Hk.A03(attributeValue);
                                            gm.A0B(attributeCount111);
                                            break;
                                        case 3:
                                            gm = A05(gm).A0F(attributeValue);
                                            break;
                                        case 4:
                                            gm = A05(gm);
                                            A0B(attributeValue, gm);
                                            break;
                                        case 5:
                                            gmA05 = A05(gm);
                                            strA08 = A08(1012, 4, 0);
                                            i = A02[4].length();
                                            if (i == 17) {
                                                throw new java.lang.RuntimeException();
                                            }
                                            A02[0] = "yrvVxtIDciql8HLlyPVX9f0c1nZtUr6R";
                                            gm = gmA05.A0H(strA08.equalsIgnoreCase(attributeValue));
                                            break;
                                            break;
                                        case 6:
                                            gm = A05(gm).A0I(A08(com.json.mediationsdk.utils.IronSourceConstants.RV_MEDIATION_LOAD_ERROR, 6, 100).equalsIgnoreCase(attributeValue));
                                            break;
                                        case 7:
                                            strA0M = com.facebook.ads.redexgen.core.IK.A0M(attributeValue);
                                            attributeCount = strA0M.hashCode();
                                            switch (attributeCount) {
                                                case -1364013995:
                                                    if (!strA0M.equals(A08(1032, 6, 113))) {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 100571:
                                                    if (strA0M.equals(A08(1063, 3, 72))) {
                                                        b3 = 3;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3317767:
                                                    if (strA0M.equals(A08(1232, 4, 92))) {
                                                        b3 = 0;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 108511772:
                                                    if (strA0M.equals(A08(1297, 5, 73))) {
                                                        b3 = 2;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 109757538:
                                                    if (strA0M.equals(A08(1345, 5, 29))) {
                                                        b3 = 1;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b3 = -1;
                                                    break;
                                            }
                                            switch (b3) {
                                                case 0:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_NORMAL);
                                                    break;
                                                case 1:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_NORMAL);
                                                    break;
                                                case 2:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_OPPOSITE);
                                                    break;
                                                case 3:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_OPPOSITE);
                                                    break;
                                                case 4:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_CENTER);
                                                    break;
                                            }
                                            break;
                                        case 8:
                                            strA0M2 = com.facebook.ads.redexgen.core.IK.A0M(attributeValue);
                                            attributeCount2 = strA0M2.hashCode();
                                            switch (attributeCount2) {
                                                case -1461280213:
                                                    if (strA0M2.equals(A08(1271, 11, 104))) {
                                                        b4 = 3;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -1026963764:
                                                    if (!strA0M2.equals(A08(1408, 9, 127))) {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 913457136:
                                                    if (strA0M2.equals(A08(1258, 13, 57))) {
                                                        b4 = 1;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 1679736913:
                                                    if (strA0M2.equals(A08(1236, 11, 39))) {
                                                        b4 = 0;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b4 = -1;
                                                    break;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    gm = A05(gm).A0J(true);
                                                    break;
                                                case 1:
                                                    gm = A05(gm).A0J(false);
                                                    break;
                                                case 2:
                                                    gm = A05(gm).A0K(true);
                                                    break;
                                                case 3:
                                                    gm = A05(gm).A0K(false);
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                                case 1287124693:
                                    if (attributeName.equals(A08(988, 15, 108))) {
                                        b2 = 1;
                                    } else {
                                        b2 = -1;
                                    }
                                    java.lang.String strA017 = A08(717, 11, 113);
                                    switch (b2) {
                                        case 0:
                                            if (A08(1350, 5, 103).equals(xmlPullParser.getName())) {
                                                gm = A05(gm).A0G(attributeValue);
                                            }
                                            break;
                                        case 1:
                                            gm = A05(gm);
                                            int attributeCount112 = com.facebook.ads.redexgen.core.AbstractC0735Hk.A03(attributeValue);
                                            gm.A0A(attributeCount112);
                                            break;
                                        case 2:
                                            gm = A05(gm);
                                            int attributeCount113 = com.facebook.ads.redexgen.core.AbstractC0735Hk.A03(attributeValue);
                                            gm.A0B(attributeCount113);
                                            break;
                                        case 3:
                                            gm = A05(gm).A0F(attributeValue);
                                            break;
                                        case 4:
                                            gm = A05(gm);
                                            A0B(attributeValue, gm);
                                            break;
                                        case 5:
                                            gmA05 = A05(gm);
                                            strA08 = A08(1012, 4, 0);
                                            i = A02[4].length();
                                            if (i == 17) {
                                                throw new java.lang.RuntimeException();
                                            }
                                            A02[0] = "yrvVxtIDciql8HLlyPVX9f0c1nZtUr6R";
                                            gm = gmA05.A0H(strA08.equalsIgnoreCase(attributeValue));
                                            break;
                                            break;
                                        case 6:
                                            gm = A05(gm).A0I(A08(com.json.mediationsdk.utils.IronSourceConstants.RV_MEDIATION_LOAD_ERROR, 6, 100).equalsIgnoreCase(attributeValue));
                                            break;
                                        case 7:
                                            strA0M = com.facebook.ads.redexgen.core.IK.A0M(attributeValue);
                                            attributeCount = strA0M.hashCode();
                                            switch (attributeCount) {
                                                case -1364013995:
                                                    if (!strA0M.equals(A08(1032, 6, 113))) {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 100571:
                                                    if (strA0M.equals(A08(1063, 3, 72))) {
                                                        b3 = 3;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3317767:
                                                    if (strA0M.equals(A08(1232, 4, 92))) {
                                                        b3 = 0;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 108511772:
                                                    if (strA0M.equals(A08(1297, 5, 73))) {
                                                        b3 = 2;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 109757538:
                                                    if (strA0M.equals(A08(1345, 5, 29))) {
                                                        b3 = 1;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b3 = -1;
                                                    break;
                                            }
                                            switch (b3) {
                                                case 0:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_NORMAL);
                                                    break;
                                                case 1:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_NORMAL);
                                                    break;
                                                case 2:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_OPPOSITE);
                                                    break;
                                                case 3:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_OPPOSITE);
                                                    break;
                                                case 4:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_CENTER);
                                                    break;
                                            }
                                            break;
                                        case 8:
                                            strA0M2 = com.facebook.ads.redexgen.core.IK.A0M(attributeValue);
                                            attributeCount2 = strA0M2.hashCode();
                                            switch (attributeCount2) {
                                                case -1461280213:
                                                    if (strA0M2.equals(A08(1271, 11, 104))) {
                                                        b4 = 3;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -1026963764:
                                                    if (!strA0M2.equals(A08(1408, 9, 127))) {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 913457136:
                                                    if (strA0M2.equals(A08(1258, 13, 57))) {
                                                        b4 = 1;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 1679736913:
                                                    if (strA0M2.equals(A08(1236, 11, 39))) {
                                                        b4 = 0;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b4 = -1;
                                                    break;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    gm = A05(gm).A0J(true);
                                                    break;
                                                case 1:
                                                    gm = A05(gm).A0J(false);
                                                    break;
                                                case 2:
                                                    gm = A05(gm).A0K(true);
                                                    break;
                                                case 3:
                                                    gm = A05(gm).A0K(false);
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                                default:
                                    b2 = -1;
                                    java.lang.String strA018 = A08(717, 11, 113);
                                    switch (b2) {
                                        case 0:
                                            if (A08(1350, 5, 103).equals(xmlPullParser.getName())) {
                                                gm = A05(gm).A0G(attributeValue);
                                            }
                                            break;
                                        case 1:
                                            gm = A05(gm);
                                            int attributeCount114 = com.facebook.ads.redexgen.core.AbstractC0735Hk.A03(attributeValue);
                                            gm.A0A(attributeCount114);
                                            break;
                                        case 2:
                                            gm = A05(gm);
                                            int attributeCount115 = com.facebook.ads.redexgen.core.AbstractC0735Hk.A03(attributeValue);
                                            gm.A0B(attributeCount115);
                                            break;
                                        case 3:
                                            gm = A05(gm).A0F(attributeValue);
                                            break;
                                        case 4:
                                            gm = A05(gm);
                                            A0B(attributeValue, gm);
                                            break;
                                        case 5:
                                            gmA05 = A05(gm);
                                            strA08 = A08(1012, 4, 0);
                                            i = A02[4].length();
                                            if (i == 17) {
                                                throw new java.lang.RuntimeException();
                                            }
                                            A02[0] = "yrvVxtIDciql8HLlyPVX9f0c1nZtUr6R";
                                            gm = gmA05.A0H(strA08.equalsIgnoreCase(attributeValue));
                                            break;
                                            break;
                                        case 6:
                                            gm = A05(gm).A0I(A08(com.json.mediationsdk.utils.IronSourceConstants.RV_MEDIATION_LOAD_ERROR, 6, 100).equalsIgnoreCase(attributeValue));
                                            break;
                                        case 7:
                                            strA0M = com.facebook.ads.redexgen.core.IK.A0M(attributeValue);
                                            attributeCount = strA0M.hashCode();
                                            switch (attributeCount) {
                                                case -1364013995:
                                                    if (!strA0M.equals(A08(1032, 6, 113))) {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 100571:
                                                    if (strA0M.equals(A08(1063, 3, 72))) {
                                                        b3 = 3;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3317767:
                                                    if (strA0M.equals(A08(1232, 4, 92))) {
                                                        b3 = 0;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 108511772:
                                                    if (strA0M.equals(A08(1297, 5, 73))) {
                                                        b3 = 2;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 109757538:
                                                    if (strA0M.equals(A08(1345, 5, 29))) {
                                                        b3 = 1;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b3 = -1;
                                                    break;
                                            }
                                            switch (b3) {
                                                case 0:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_NORMAL);
                                                    break;
                                                case 1:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_NORMAL);
                                                    break;
                                                case 2:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_OPPOSITE);
                                                    break;
                                                case 3:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_OPPOSITE);
                                                    break;
                                                case 4:
                                                    gm = A05(gm).A0D(android.text.Layout.Alignment.ALIGN_CENTER);
                                                    break;
                                            }
                                            break;
                                        case 8:
                                            strA0M2 = com.facebook.ads.redexgen.core.IK.A0M(attributeValue);
                                            attributeCount2 = strA0M2.hashCode();
                                            switch (attributeCount2) {
                                                case -1461280213:
                                                    if (strA0M2.equals(A08(1271, 11, 104))) {
                                                        b4 = 3;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case -1026963764:
                                                    if (!strA0M2.equals(A08(1408, 9, 127))) {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 913457136:
                                                    if (strA0M2.equals(A08(1258, 13, 57))) {
                                                        b4 = 1;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                case 1679736913:
                                                    if (strA0M2.equals(A08(1236, 11, 39))) {
                                                        b4 = 0;
                                                    } else {
                                                        b4 = -1;
                                                    }
                                                    break;
                                                default:
                                                    b4 = -1;
                                                    break;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    gm = A05(gm).A0J(true);
                                                    break;
                                                case 1:
                                                    gm = A05(gm).A0J(false);
                                                    break;
                                                case 2:
                                                    gm = A05(gm).A0K(true);
                                                    break;
                                                case 3:
                                                    gm = A05(gm).A0K(false);
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                        }
                        return gm;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.facebook.ads.redexgen.core.DP
                    /* JADX INFO: renamed from: A07, reason: merged with bridge method [inline-methods] */
                    public final com.facebook.ads.redexgen.core.XI A0b(byte[] bArr, int i, boolean z) throws com.facebook.ads.redexgen.core.C0695Fu {
                        try {
                            org.xmlpull.v1.XmlPullParser xmlPullParserNewPullParser = this.A00.newPullParser();
                            java.util.HashMap map = new java.util.HashMap();
                            java.util.Map<java.lang.String, com.facebook.ads.internal.exoplayer2.thirdparty.text.ttml.TtmlRegion> regionMap = new java.util.HashMap<>();
                            regionMap.put(A08(0, 0, 90), new com.facebook.ads.redexgen.core.GH(null));
                            try {
                                xmlPullParserNewPullParser.setInput(new java.io.ByteArrayInputStream(bArr, 0, i), null);
                                com.facebook.ads.redexgen.core.XI xi = null;
                                java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
                                int i2 = 0;
                                com.facebook.ads.redexgen.core.GF gfA02 = A04;
                                com.facebook.ads.redexgen.core.GE geA01 = A03;
                                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                                    com.facebook.ads.redexgen.core.GG gg = (com.facebook.ads.redexgen.core.GG) arrayDeque.peek();
                                    if (i2 == 0) {
                                        java.lang.String name = xmlPullParserNewPullParser.getName();
                                        java.lang.String strA08 = A08(1406, 2, 116);
                                        if (eventType == 2) {
                                            if (strA08.equals(name)) {
                                                gfA02 = A02(xmlPullParserNewPullParser);
                                                geA01 = A01(xmlPullParserNewPullParser, A03);
                                            }
                                            boolean zA0C = A0C(name);
                                            java.lang.String strA09 = A08(717, 11, 113);
                                            if (!zA0C) {
                                                android.util.Log.i(strA09, A08(404, 26, 127) + xmlPullParserNewPullParser.getName());
                                                i2++;
                                            } else if (A08(1179, 4, 5).equals(name)) {
                                                A09(xmlPullParserNewPullParser, map, regionMap, geA01);
                                            } else {
                                                try {
                                                    com.facebook.ads.redexgen.core.GG node = A03(xmlPullParserNewPullParser, gg, regionMap, gfA02);
                                                    arrayDeque.push(node);
                                                    if (gg != null) {
                                                        gg.A0E(node);
                                                    }
                                                } catch (com.facebook.ads.redexgen.core.C0695Fu e) {
                                                    android.util.Log.w(strA09, A08(693, 24, 61), e);
                                                    i2++;
                                                    if (A02[4].length() != 17) {
                                                        throw new java.lang.RuntimeException();
                                                    }
                                                    A02[3] = "wLwBbwjFX";
                                                }
                                            }
                                        } else if (eventType != 4) {
                                            if (eventType == 3) {
                                                if (xmlPullParserNewPullParser.getName().equals(strA08)) {
                                                    xi = new com.facebook.ads.redexgen.core.XI((com.facebook.ads.redexgen.core.GG) arrayDeque.peek(), map, regionMap);
                                                }
                                                arrayDeque.pop();
                                            }
                                        } else {
                                            gg.A0E(com.facebook.ads.redexgen.core.GG.A04(xmlPullParserNewPullParser.getText()));
                                        }
                                    } else if (eventType == 2) {
                                        i2++;
                                    } else if (eventType == 3) {
                                        i2--;
                                    }
                                    xmlPullParserNewPullParser.next();
                                }
                                return xi;
                            } catch (java.io.IOException e2) {
                                e = e2;
                                throw new java.lang.IllegalStateException(A08(751, 36, 29), e);
                            } catch (org.xmlpull.v1.XmlPullParserException e3) {
                                e = e3;
                                throw new com.facebook.ads.redexgen.core.C0695Fu(A08(728, 23, 102), e);
                            }
                        } catch (java.io.IOException e4) {
                            e = e4;
                        } catch (org.xmlpull.v1.XmlPullParserException e5) {
                            e = e5;
                        }
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code duplicated, block: B:16:0x006f  */
                    public static void A0B(java.lang.String str2, com.facebook.ads.redexgen.core.GM gm) throws com.facebook.ads.redexgen.core.C0695Fu {
                        java.util.regex.Matcher matcher;
                        byte b2;
                        java.lang.String[] strArrA0l = com.facebook.ads.redexgen.core.IK.A0l(str2, A08(787, 3, 94));
                        if (strArrA0l.length == 1) {
                            java.util.regex.Pattern pattern = A07;
                            if (A02[4].length() != 17) {
                                throw new java.lang.RuntimeException();
                            }
                            A02[3] = "DcJ2SXub95tq9AheLlcOmjYh8kVu";
                            matcher = pattern.matcher(str2);
                        } else if (strArrA0l.length == 2) {
                            matcher = A07.matcher(strArrA0l[1]);
                            android.util.Log.w(A08(717, 11, 113), A08(583, 110, 66));
                        } else {
                            throw new com.facebook.ads.redexgen.core.C0695Fu(A08(488, 40, 47) + strArrA0l.length + A08(4, 1, 46));
                        }
                        boolean zMatches = matcher.matches();
                        java.lang.String strA08 = A08(2, 2, 108);
                        if (zMatches) {
                            java.lang.String strGroup = matcher.group(3);
                            switch (strGroup.hashCode()) {
                                case 37:
                                    if (!strGroup.equals(A08(1, 1, 95))) {
                                        b2 = -1;
                                    } else {
                                        b2 = 2;
                                    }
                                    break;
                                case 3240:
                                    if (!strGroup.equals(A08(com.json.mediationsdk.logger.IronSourceError.ERROR_DO_IS_LOAD_MISSING_ACTIVITY, 2, 90))) {
                                        b2 = -1;
                                    } else {
                                        b2 = 1;
                                    }
                                    break;
                                case 3592:
                                    if (!strGroup.equals(A08(1289, 2, 88))) {
                                        b2 = -1;
                                    } else {
                                        b2 = 0;
                                    }
                                    break;
                                default:
                                    b2 = -1;
                                    break;
                            }
                            switch (b2) {
                                case 0:
                                    gm.A0C(1);
                                    break;
                                case 1:
                                    gm.A0C(2);
                                    break;
                                case 2:
                                    gm.A0C(3);
                                    break;
                                default:
                                    throw new com.facebook.ads.redexgen.core.C0695Fu(A08(528, 28, 22) + strGroup + strA08);
                            }
                            gm.A09(java.lang.Float.valueOf(matcher.group(1)).floatValue());
                            return;
                        }
                        throw new com.facebook.ads.redexgen.core.C0695Fu(A08(454, 34, 116) + str2 + strA08);
                    }

                    /* JADX WARN: Code duplicated, block: B:34:0x010c  */
                    public static boolean A0C(java.lang.String str2) {
                        if (!str2.equals(A08(1406, 2, 116)) && !str2.equals(A08(1179, 4, 5))) {
                            boolean zEquals = str2.equals(A08(1008, 4, 62));
                            if (A02[0].charAt(22) == 'S') {
                                throw new java.lang.RuntimeException();
                            }
                            A02[3] = "E5HYNNOiriUFt8R2ATYR1tl";
                            if (!zEquals && !str2.equals(A08(1055, 3, 64)) && !str2.equals(A08(1288, 1, 27)) && !str2.equals(A08(1341, 4, 15)) && !str2.equals(A08(1016, 2, 80)) && !str2.equals(A08(1350, 5, 103)) && !str2.equals(A08(1355, 7, 74))) {
                                if (A02[3].length() == 29) {
                                    throw new java.lang.RuntimeException();
                                }
                                A02[0] = "op5mOD95onNurLD34PjoeHN8rErjnv6q";
                                if (!str2.equals(A08(1226, 6, 33)) && !str2.equals(A08(1291, 6, 32)) && !str2.equals(A08(1248, 8, 31))) {
                                    boolean zEquals2 = str2.equals(A08(1313, 11, 40));
                                    java.lang.String[] strArr = A02;
                                    if (strArr[1].length() != strArr[2].length()) {
                                        java.lang.String[] strArr2 = A02;
                                        strArr2[6] = "Evdruy3r944QMgrROg1CaBLGcGa0F8Li";
                                        strArr2[7] = "grtUNlyk4McEpbwOCeqe0Yf71vkfQFqi";
                                        if (!zEquals2) {
                                            if (str2.equals(A08(com.json.mediationsdk.utils.IronSourceConstants.RV_AD_UNIT_CAPPED, 10, 13)) && !str2.equals(A08(1324, 17, 4))) {
                                                return false;
                                            }
                                        }
                                    } else {
                                        A02[4] = "By9OHgbswqQHFQwxP";
                                        if (!zEquals2) {
                                            if (str2.equals(A08(com.json.mediationsdk.utils.IronSourceConstants.RV_AD_UNIT_CAPPED, 10, 13))) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }

                    private java.lang.String[] A0D(java.lang.String str2) {
                        java.lang.String strTrim = str2.trim();
                        return strTrim.isEmpty() ? new java.lang.String[0] : com.facebook.ads.redexgen.core.IK.A0l(strTrim, A08(787, 3, 94));
                    }
                };
            case 4:
                return new com.facebook.ads.redexgen.core.DP() { // from class: com.facebook.ads.redexgen.X.4Q
                    public static byte[] A01;
                    public static java.lang.String[] A02 = {"OtT0LVQqk9RRHcQl9suaXVs0lQy2Xi2B", "6vOb", "M1GK", "Q3AOLP3m2yMSgayKU1WrD6hHOweB9S3H", "F1kiItxEw59xVPIC9WgcG0LVYvZuut6s", "hrS3LC0HlCWsxOkana5b4FKEJhzBz64C", "cblU074", "WiaS5fbm8COclwCTLJ"};
                    public static final java.util.regex.Pattern A03;
                    public final java.lang.StringBuilder A00;

                    public static java.lang.String A02(int i, int i2, int i3) {
                        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
                        int i4 = 0;
                        while (true) {
                            int length = bArrCopyOfRange.length;
                            java.lang.String[] strArr = A02;
                            if (strArr[2].length() != strArr[1].length()) {
                                throw new java.lang.RuntimeException();
                            }
                            A02[6] = "OHBI6AMzh";
                            if (i4 >= length) {
                                return new java.lang.String(bArrCopyOfRange);
                            }
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 61);
                            i4++;
                        }
                    }

                    public static void A03() {
                        java.lang.String[] strArr = A02;
                        if (strArr[3].charAt(27) != strArr[5].charAt(27)) {
                            throw new java.lang.RuntimeException();
                        }
                        java.lang.String[] strArr2 = A02;
                        strArr2[0] = "Nx0nP4euuoKlaME2hNpQquavIXdn2ckR";
                        strArr2[4] = "3saTitcRJ2ReIxQT7kbEn3BtIwhGo3t4";
                        A01 = new byte[]{-12, 26, 42, -10, -14, 10, 8, 15, 15, 8, 13, 6, -65, 8, 13, 21, 0, 11, 8, 3, -65, 8, 13, 3, 4, 23, -39, -65, -83, -59, -61, -54, -54, -61, -56, -63, 122, -61, -56, -48, -69, -58, -61, -66, 122, -50, -61, -57, -61, -56, -63, -108, 122, -39, -5, -24, -8, -17, -10, -54, -21, -23, -11, -22, -21, -8, -83, -58, -67, -48, -56, -67, -69, -52, -67, -68, 120, -67, -58, -68, -27, -4, -77, -79, -79, -56, -61, -79, -27, -19, -76, -78, -61, -78, -56, -79, -27, -19, -76, -78, -61, -79, -27, -19, -76, -78, -75, -79, -27, -19, -76, -78, -78, -27, -4, -77, -74, -74, -57, -27, -4, -77, -79, -79, -56, -61, -79, -27, -19, -76, -78, -61, -78, -56, -79, -27, -19, -76, -78, -61, -79, -27, -19, -76, -78, -75, -79, -27, -19, -76, -78, -78, -56, -27, -4, -77};
                    }

                    static {
                        A03();
                        A03 = java.util.regex.Pattern.compile(A02(80, 76, 76));
                    }

                    {
                        A02(53, 13, 73);
                        this.A00 = new java.lang.StringBuilder();
                    }

                    public static long A00(java.util.regex.Matcher matcher, int i) {
                        long j = java.lang.Long.parseLong(matcher.group(i + 1)) * 60 * 60 * 1000;
                        long timestampMs = java.lang.Long.parseLong(matcher.group(i + 2));
                        long j2 = j + (timestampMs * 60 * 1000);
                        long timestampMs2 = java.lang.Long.parseLong(matcher.group(i + 3));
                        long j3 = j2 + (timestampMs2 * 1000);
                        long timestampMs3 = java.lang.Long.parseLong(matcher.group(i + 4));
                        return 1000 * (j3 + timestampMs3);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.facebook.ads.redexgen.core.DP
                    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
                    public final com.facebook.ads.redexgen.core.XJ A0b(byte[] bArr, int i, boolean z) {
                        java.lang.String strA02 = A02(53, 13, 73);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        com.facebook.ads.redexgen.core.C0745Hu c0745Hu = new com.facebook.ads.redexgen.core.C0745Hu();
                        com.facebook.ads.redexgen.core.I4 subripData = new com.facebook.ads.redexgen.core.I4(bArr, i);
                        while (true) {
                            java.lang.String strA0P = subripData.A0P();
                            if (strA0P == null) {
                                break;
                            }
                            if (strA0P.length() != 0) {
                                try {
                                    java.lang.Integer.parseInt(strA0P);
                                    boolean z2 = false;
                                    java.lang.String strA0P2 = subripData.A0P();
                                    if (strA0P2 == null) {
                                        android.util.Log.w(strA02, A02(66, 14, 27));
                                        break;
                                    }
                                    java.util.regex.Matcher matcher = A03.matcher(strA0P2);
                                    if (A02[7].length() != 18) {
                                        throw new java.lang.RuntimeException();
                                    }
                                    A02[7] = "1qm0qGLZ04MjzjLSxI";
                                    if (matcher.matches()) {
                                        c0745Hu.A04(A00(matcher, 1));
                                        if (!android.text.TextUtils.isEmpty(matcher.group(6))) {
                                            z2 = true;
                                            c0745Hu.A04(A00(matcher, 6));
                                        }
                                        this.A00.setLength(0);
                                        while (true) {
                                            java.lang.String strA0P3 = subripData.A0P();
                                            if (android.text.TextUtils.isEmpty(strA0P3)) {
                                                break;
                                            }
                                            if (this.A00.length() > 0) {
                                                this.A00.append(A02(0, 4, 123));
                                            }
                                            this.A00.append(strA0P3.trim());
                                        }
                                        arrayList.add(new com.facebook.ads.redexgen.core.C0693Fs(android.text.Html.fromHtml(this.A00.toString())));
                                        if (z2) {
                                            arrayList.add(null);
                                        }
                                    } else {
                                        android.util.Log.w(strA02, A02(28, 25, 29) + strA0P2);
                                    }
                                } catch (java.lang.NumberFormatException unused) {
                                    android.util.Log.w(strA02, A02(4, 24, 98) + strA0P);
                                }
                            }
                        }
                        com.facebook.ads.redexgen.core.C0693Fs[] c0693FsArr = new com.facebook.ads.redexgen.core.C0693Fs[arrayList.size()];
                        arrayList.toArray(c0693FsArr);
                        return new com.facebook.ads.redexgen.core.XJ(c0693FsArr, c0745Hu.A05());
                    }
                };
            case 5:
                final java.util.List<byte[]> list = format.A0P;
                return new com.facebook.ads.redexgen.core.DP(list) { // from class: com.facebook.ads.redexgen.X.46
                    public static byte[] A07;
                    public static java.lang.String[] A08 = {"sj6Q1BeWjF6K1JUJsYy6pD", "UWU3GT", "YBjsjOcLll", "qdxWVIRB3qQm1B3o2sbKY5IbL9FH0hor", "FAZgRoMoQSemNfZfZZuAf", "nuzZ152GP4LbG", "bCqOeUg8Y6EuywmPRf", "YV0eqaSi"};
                    public static final int A09;
                    public static final int A0A;
                    public float A00;
                    public int A01;
                    public int A02;
                    public int A03;
                    public java.lang.String A04;
                    public boolean A05;
                    public final com.facebook.ads.redexgen.core.I4 A06;

                    public static java.lang.String A00(int i, int i2, int i3) {
                        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
                        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 52);
                        }
                        return new java.lang.String(bArrCopyOfRange);
                    }

                    public static void A02() {
                        A07 = new byte[]{33, 23, 0, 27, 20, 8, 36, 111, 59, 24, 57, okio.Utf8.REPLACEMENT_BYTE, 51, 56, 57, 46, 8, 9, 27, 112, 108, 107, okio.Utf8.REPLACEMENT_BYTE, 62, 44, 71, 82, 59, 0, 11, 22, 30, 11, 13, 26, 11, 10, 78, 29, 27, 12, 26, 7, 26, 2, 11, 78, 8, 1, 28, 3, 15, 26, 64, 12, 30, 17, 12, 82, 12, 26, 13, 22, 25, 44, 58, 45, 54, 57, 78, 73, 68, 81, 47, 57, 52, 35};
                    }

                    static {
                        A02();
                        A09 = com.facebook.ads.redexgen.core.IK.A08(A00(69, 4, 9));
                        A0A = com.facebook.ads.redexgen.core.IK.A08(A00(73, 4, 111));
                    }

                    {
                        super(A00(5, 11, 104));
                        this.A06 = new com.facebook.ads.redexgen.core.I4();
                        A07(list);
                    }

                    public static java.lang.String A01(com.facebook.ads.redexgen.core.I4 i4) throws com.facebook.ads.redexgen.core.C0695Fu {
                        char firstChar;
                        A08(i4.A04() >= 2);
                        int iA0I = i4.A0I();
                        if (iA0I == 0) {
                            return A00(0, 0, 88);
                        }
                        int iA04 = i4.A04();
                        if (A08[2].length() != 10) {
                            throw new java.lang.RuntimeException();
                        }
                        A08[2] = "HPbsPvSCkr";
                        if (iA04 >= 2 && ((firstChar = i4.A02()) == 65279 || firstChar == 65534)) {
                            return i4.A0T(iA0I, java.nio.charset.Charset.forName(A00(16, 6, 105)));
                        }
                        java.lang.String strA00 = A00(22, 5, 94);
                        java.lang.String[] strArr = A08;
                        java.lang.String str2 = strArr[0];
                        java.lang.String str3 = strArr[5];
                        int length = str2.length();
                        int textLength = str3.length();
                        if (length != textLength) {
                            A08[3] = "rvE6pRP6oc75068eKKdpjEgvFDLvSRuA";
                            return i4.A0T(iA0I, java.nio.charset.Charset.forName(strA00));
                        }
                        A08[7] = "YAbwhueU";
                        return i4.A0T(iA0I, java.nio.charset.Charset.forName(strA00));
                    }

                    public static void A03(android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
                        if (i != i2) {
                            int colorArgb = i5 | 33;
                            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(((i & 255) << 24) | (i >>> 8)), i3, i4, colorArgb);
                        }
                    }

                    public static void A04(android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
                        if (i != i2) {
                            int i6 = i5 | 33;
                            int flags = i & 1;
                            boolean z = flags != 0;
                            int flags2 = i & 2;
                            boolean z2 = flags2 != 0;
                            if (z) {
                                if (z2) {
                                    spannableStringBuilder.setSpan(new android.text.style.StyleSpan(3), i3, i4, i6);
                                } else {
                                    spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), i3, i4, i6);
                                }
                            } else if (z2) {
                                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i3, i4, i6);
                            }
                            int flags3 = i & 4;
                            boolean z3 = flags3 != 0;
                            if (z3) {
                                spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i3, i4, i6);
                            }
                            if (!z3 && !z && !z2) {
                                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(0), i3, i4, i6);
                            }
                        }
                    }

                    public static void A05(android.text.SpannableStringBuilder spannableStringBuilder, java.lang.String str2, java.lang.String str3, int i, int i2, int i3) {
                        if (str2 != str3) {
                            spannableStringBuilder.setSpan(new android.text.style.TypefaceSpan(str2), i, i2, i3 | 33);
                        }
                    }

                    private void A06(com.facebook.ads.redexgen.core.I4 i4, android.text.SpannableStringBuilder spannableStringBuilder) throws com.facebook.ads.redexgen.core.C0695Fu {
                        A08(i4.A04() >= 12);
                        int iA0I = i4.A0I();
                        int iA0I2 = i4.A0I();
                        i4.A0Z(2);
                        int colorRgba = i4.A0E();
                        i4.A0Z(1);
                        int iA08 = i4.A08();
                        A04(spannableStringBuilder, colorRgba, this.A03, iA0I, iA0I2, 0);
                        int fontFace = this.A02;
                        A03(spannableStringBuilder, iA08, fontFace, iA0I, iA0I2, 0);
                    }

                    private void A07(java.util.List<byte[]> list2) {
                        java.lang.String strA00 = A00(54, 10, 75);
                        if (list2 != null && list2.size() == 1 && (list2.get(0).length == 48 || list2.get(0).length == 53)) {
                            byte[] initializationBytes = list2.get(0);
                            this.A03 = initializationBytes[24];
                            this.A02 = ((initializationBytes[26] & 255) << 24) | ((initializationBytes[27] & 255) << 16) | ((initializationBytes[28] & 255) << 8) | (initializationBytes[29] & 255);
                            if (A00(0, 5, 70).equals(com.facebook.ads.redexgen.core.IK.A0R(initializationBytes, 43, initializationBytes.length - 43))) {
                                strA00 = A00(64, 5, 107);
                            }
                            this.A04 = strA00;
                            this.A01 = initializationBytes[25] * 20;
                            this.A05 = (initializationBytes[0] & 32) != 0;
                            if (this.A05) {
                                float f = ((initializationBytes[10] & 255) << 8) | (initializationBytes[11] & 255);
                                int requestedVerticalPlacement = this.A01;
                                this.A00 = f / requestedVerticalPlacement;
                                this.A00 = com.facebook.ads.redexgen.core.IK.A00(this.A00, 0.0f, 0.95f);
                                return;
                            }
                            this.A00 = 0.85f;
                            return;
                        }
                        this.A03 = 0;
                        this.A02 = -1;
                        this.A04 = strA00;
                        this.A05 = false;
                        this.A00 = 0.85f;
                    }

                    public static void A08(boolean z) throws com.facebook.ads.redexgen.core.C0695Fu {
                        if (z) {
                        } else {
                            throw new com.facebook.ads.redexgen.core.C0695Fu(A00(27, 27, 90));
                        }
                    }

                    @Override // com.facebook.ads.redexgen.core.DP
                    public final com.facebook.ads.redexgen.core.InterfaceC0694Ft A0b(byte[] bArr, int i, boolean z) throws com.facebook.ads.redexgen.core.C0695Fu {
                        this.A06.A0b(bArr, i);
                        java.lang.String cueTextString = A01(this.A06);
                        if (cueTextString.isEmpty()) {
                            com.facebook.ads.redexgen.core.XH xh = com.facebook.ads.redexgen.core.XH.A01;
                            if (A08[2].length() == 10) {
                                A08[7] = "3cYR8cSPmC5bjkzTt";
                                return xh;
                            }
                        } else {
                            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(cueTextString);
                            A04(spannableStringBuilder, this.A03, 0, 0, spannableStringBuilder.length(), 16711680);
                            A03(spannableStringBuilder, this.A02, -1, 0, spannableStringBuilder.length(), 16711680);
                            A05(spannableStringBuilder, this.A04, A00(54, 10, 75), 0, spannableStringBuilder.length(), 16711680);
                            float fA00 = this.A00;
                            while (this.A06.A04() >= 8) {
                                int iA06 = this.A06.A06();
                                int requestedVerticalPlacement = this.A06.A08();
                                int iA08 = this.A06.A08();
                                if (iA08 == A09) {
                                    A08(this.A06.A04() >= 2);
                                    int atomType = this.A06.A0I();
                                    for (int atomSize = 0; atomSize < atomType; atomSize++) {
                                        com.facebook.ads.redexgen.core.I4 i4 = this.A06;
                                        if (A08[1].length() == 6) {
                                            A08[7] = "K6DxG7jCQQet2xH5VdPl5OgFKzFbW";
                                            A06(i4, spannableStringBuilder);
                                        }
                                    }
                                } else if (iA08 == A0A && this.A05) {
                                    int position = this.A06.A04();
                                    java.lang.String[] strArr = A08;
                                    if (strArr[6].length() == strArr[4].length()) {
                                        throw new java.lang.RuntimeException();
                                    }
                                    A08[7] = "iBd2tHQU60lGQ74NnW";
                                    A08(position >= 2);
                                    fA00 = com.facebook.ads.redexgen.core.IK.A00(this.A06.A0I() / this.A01, 0.0f, 0.95f);
                                }
                                this.A06.A0Y(iA06 + requestedVerticalPlacement);
                            }
                            return new com.facebook.ads.redexgen.core.XH(new com.facebook.ads.redexgen.core.C0693Fs(spannableStringBuilder, null, fA00, 0, 0, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
                        }
                        throw new java.lang.RuntimeException();
                    }
                };
            case 6:
            case 7:
                return new com.facebook.ads.redexgen.core.C5A(format.A0O, format.A03);
            case 8:
                final int i = format.A03;
                return new com.facebook.ads.redexgen.core.DD(i) { // from class: com.facebook.ads.redexgen.X.52
                    public static byte[] A09;
                    public static java.lang.String[] A0A = {"EWwn6kg", "sEDXBDjrWp0Vneo976MhoJrsYcWIYN6Q", "S7VRRu9Yx770AGv7wX8aTsHMlPhnJMSA", "CWg8HfU", "qgbV75i4foMMAXtqLGhU3LERU50xbQB4", "VV27SlS", "2iyarXf7dWJxe7qXUXDD0TZONEHNOfMn", "7b0wVmZ"};
                    public int A00;
                    public com.facebook.ads.redexgen.core.G0 A01;
                    public com.facebook.ads.redexgen.core.G1 A02;
                    public java.util.List<com.facebook.ads.redexgen.core.C0693Fs> A03;
                    public java.util.List<com.facebook.ads.redexgen.core.C0693Fs> A04;
                    public final int A05;
                    public final com.facebook.ads.redexgen.core.G0[] A08;
                    public final com.facebook.ads.redexgen.core.I4 A07 = new com.facebook.ads.redexgen.core.I4();
                    public final com.facebook.ads.redexgen.core.I3 A06 = new com.facebook.ads.redexgen.core.I3();

                    public static java.lang.String A00(int i2, int i3, int i4) {
                        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A09, i2, i2 + i3);
                        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 104);
                        }
                        return new java.lang.String(bArrCopyOfRange);
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    private void A03() {
                        this.A01.A0C(this.A06.A04(4), this.A06.A04(2), this.A06.A04(2), this.A06.A0F(), this.A06.A0F(), this.A06.A04(3), this.A06.A04(3));
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    private void A04() {
                        int iA01 = com.facebook.ads.redexgen.core.G0.A01(this.A06.A04(2), this.A06.A04(2), this.A06.A04(2), this.A06.A04(2));
                        int iA02 = com.facebook.ads.redexgen.core.G0.A01(this.A06.A04(2), this.A06.A04(2), this.A06.A04(2), this.A06.A04(2));
                        this.A06.A08(2);
                        this.A01.A0B(iA01, iA02, com.facebook.ads.redexgen.core.G0.A00(this.A06.A04(2), this.A06.A04(2), this.A06.A04(2)));
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    private void A06() {
                        int iA01 = com.facebook.ads.redexgen.core.G0.A01(this.A06.A04(2), this.A06.A04(2), this.A06.A04(2), this.A06.A04(2));
                        int iA04 = this.A06.A04(2);
                        int iA00 = com.facebook.ads.redexgen.core.G0.A00(this.A06.A04(2), this.A06.A04(2), this.A06.A04(2));
                        if (this.A06.A0F()) {
                            iA04 |= 4;
                        }
                        boolean zA0F = this.A06.A0F();
                        int iA05 = this.A06.A04(2);
                        int iA06 = this.A06.A04(2);
                        int iA07 = this.A06.A04(2);
                        this.A06.A08(8);
                        this.A01.A0D(iA01, iA00, zA0F, iA04, iA05, iA06, iA07);
                    }

                    public static void A09() {
                        A09 = new byte[]{95, 87, 12, 26, 14, 10, 26, 17, 28, 26, 95, 17, 10, 18, 29, 26, 13, 95, 13, 4, 83, 76, 65, 74, 4, 70, 72, 75, 71, 79, 119, 77, 94, 65, 4, 77, 87, 4, 20, 80, 66, 89, 16, 30, 23, 22, 11, 16, 23, 30, 89, 9, 24, 26, 18, 28, 13, 50, 62, 124, 107, 106, 62, 125, 107, 108, 108, 123, 112, 106, 62, 119, 112, 122, 123, 102, 62, 119, 109, 62, 111, 73, 77, 27, 28, 20, 104, 73, 79, 67, 72, 73, 94, 100, 82, 85, 85, 66, 73, 83, 75, 94, 7, 82, 73, 84, 82, 87, 87, 72, 85, 83, 66, 67, 7, 100, 104, 106, 106, 102, 105, 99, 120, 98, 127, 115, 22, 7, 100, 72, 74, 74, 70, 73, 67, 29, 7, 10, 60, 59, 59, 44, 39, kotlin.io.encoding.Base64.padSymbol, 37, 48, 105, 60, 39, 58, 60, 57, 57, 38, 59, kotlin.io.encoding.Base64.padSymbol, 44, 45, 105, 10, 6, 4, 4, 8, 7, 13, 22, 25, 120, 127, 105, 10, 38, 36, 36, 40, 39, 45, 115, 105, 31, 47, 45, 24, 56, 11, 58, 56, 48, 62, 47, 123, 62, 53, okio.Utf8.REPLACEMENT_BYTE, 62, okio.Utf8.REPLACEMENT_BYTE, 123, 43, 41, 62, 54, 58, 47, 46, 41, 62, 55, 34, 96, 123, 40, 50, 33, 62, 123, 50, 40, 123, 28, 55, 58, 54, 44, 55, 45, 60, 43, 60, kotlin.io.encoding.Base64.padSymbol, 121, 29, 13, 15, 26, 26, 6, 9, 24, 26, 18, 28, 13, 6, 29, 24, 13, 24, 121, 59, 60, okio.Utf8.REPLACEMENT_BYTE, 54, 43, 60, 121, 29, 13, 15, 26, 26, 6, 9, 24, 26, 18, 28, 13, 6, 10, 13, 24, 11, 13, 114, 85, 77, 90, 87, 82, 95, 27, 120, 11, 27, 88, 84, 86, 86, 90, 85, 95, 1, 27, 88, 127, 103, 112, 125, 120, 117, 49, 82, 32, 49, 114, 126, 124, 124, 112, 127, 117, 43, 49, 62, 25, 1, 22, 27, 30, 19, 87, 48, 69, 87, 20, 31, 22, 5, 22, 20, 3, 18, 5, 77, 87, 46, 9, 17, 6, 11, 14, 3, 71, 32, 84, 71, 4, 15, 6, 21, 6, 4, 19, 2, 21, 93, 71, 96, 71, 95, 72, 69, 64, 77, 9, 75, 72, 90, 76, 9, 74, 70, 68, 68, 72, 71, 77, 19, 9, 104, 79, 87, 64, 77, 72, 69, 1, 68, 89, 85, 68, 79, 69, 68, 69, 1, 66, 78, 76, 76, 64, 79, 69, 27, 1, 99, 117, 98, 102, 121, 115, 117, 94, 101, 125, 114, 117, 98, 48, 121, 99, 48, 126, 127, 126, kotlin.io.encoding.Base64.padSymbol, 106, 117, 98, 127, 48, 56};
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    private void A0E(int i2) {
                        com.facebook.ads.redexgen.core.G0 g0 = this.A08[i2];
                        this.A06.A08(2);
                        boolean zA0F = this.A06.A0F();
                        boolean zA0F2 = this.A06.A0F();
                        boolean zA0F3 = this.A06.A0F();
                        int iA04 = this.A06.A04(3);
                        boolean zA0F4 = this.A06.A0F();
                        int iA05 = this.A06.A04(7);
                        int iA06 = this.A06.A04(8);
                        int iA07 = this.A06.A04(4);
                        int iA08 = this.A06.A04(4);
                        this.A06.A08(2);
                        int iA09 = this.A06.A04(6);
                        this.A06.A08(2);
                        g0.A0F(zA0F, zA0F2, zA0F3, iA04, zA0F4, iA05, iA06, iA08, iA09, iA07, this.A06.A04(3), this.A06.A04(3));
                    }

                    static {
                        A09();
                    }

                    {
                        this.A05 = i == -1 ? 1 : i;
                        this.A08 = new com.facebook.ads.redexgen.core.G0[8];
                        for (int i2 = 0; i2 < 8; i2++) {
                            this.A08[i2] = new com.facebook.ads.redexgen.core.G0();
                        }
                        this.A01 = this.A08[0];
                        A08();
                    }

                    private java.util.List<com.facebook.ads.redexgen.core.C0693Fs> A01() {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (int i2 = 0; i2 < 8; i2++) {
                            if (!this.A08[i2].A0H() && this.A08[i2].A0I()) {
                                arrayList.add(this.A08[i2].A05());
                            }
                        }
                        java.util.Collections.sort(arrayList);
                        return java.util.Collections.unmodifiableList(arrayList);
                    }

                    private void A02() {
                        if (this.A02 == null) {
                            return;
                        }
                        A07();
                        this.A02 = null;
                    }

                    private void A05() {
                        this.A06.A08(4);
                        int iA04 = this.A06.A04(4);
                        this.A06.A08(2);
                        int column = this.A06.A04(6);
                        this.A01.A0A(iA04, column);
                    }

                    private void A07() {
                        int i2 = this.A02.A00;
                        int i3 = (this.A02.A01 * 2) - 1;
                        java.lang.String strA00 = A00(80, 13, 68);
                        if (i2 != i3) {
                            android.util.Log.w(strA00, A00(org.objectweb.asm.Opcodes.GETFIELD, 39, 51) + ((this.A02.A01 * 2) - 1) + A00(57, 23, 118) + this.A02.A00 + A00(0, 18, 23) + this.A02.A02 + A00(39, 18, 17));
                            return;
                        }
                        this.A06.A0C(this.A02.A03, this.A02.A00);
                        int iA04 = this.A06.A04(3);
                        int iA05 = this.A06.A04(5);
                        if (iA04 == 7) {
                            this.A06.A08(2);
                            int serviceNumber = this.A06.A04(6);
                            iA04 += serviceNumber;
                        }
                        if (iA05 == 0) {
                            if (iA04 != 0) {
                                android.util.Log.w(strA00, A00(406, 27, 120) + iA04 + A00(18, 21, 76));
                                return;
                            }
                            return;
                        }
                        int i4 = this.A05;
                        java.lang.String[] strArr = A0A;
                        java.lang.String str2 = strArr[0];
                        java.lang.String str3 = strArr[3];
                        int blockSize = str2.length();
                        int serviceNumber2 = str3.length();
                        if (blockSize != serviceNumber2) {
                            throw new java.lang.RuntimeException();
                        }
                        java.lang.String[] strArr2 = A0A;
                        strArr2[0] = "uwh0e1P";
                        strArr2[3] = "5GXt8h9";
                        if (iA04 != i4) {
                            return;
                        }
                        boolean z = false;
                        while (serviceNumber > 0) {
                            int iA06 = this.A06.A04(8);
                            if (iA06 != 16) {
                                if (iA06 <= 31) {
                                    A0A(iA06);
                                } else if (iA06 <= 127) {
                                    A0F(iA06);
                                    z = true;
                                } else if (iA06 <= 159) {
                                    A0B(iA06);
                                    java.lang.String[] strArr3 = A0A;
                                    java.lang.String str4 = strArr3[1];
                                    java.lang.String str5 = strArr3[4];
                                    int blockSize2 = str4.charAt(25);
                                    int serviceNumber3 = str5.charAt(25);
                                    if (blockSize2 == serviceNumber3) {
                                        throw new java.lang.RuntimeException();
                                    }
                                    java.lang.String[] strArr4 = A0A;
                                    strArr4[5] = "H4RHeeV";
                                    strArr4[7] = "urBgRDU";
                                    z = true;
                                } else if (iA06 <= 255) {
                                    A0G(iA06);
                                    z = true;
                                } else {
                                    android.util.Log.w(strA00, A00(358, 22, 65) + iA06);
                                }
                            } else {
                                int iA07 = this.A06.A04(8);
                                if (iA07 <= 31) {
                                    A0C(iA07);
                                } else if (iA07 <= 127) {
                                    A0H(iA07);
                                    z = true;
                                } else if (iA07 <= 159) {
                                    A0D(iA07);
                                } else if (iA07 <= 255) {
                                    A0I(iA07);
                                    z = true;
                                } else {
                                    android.util.Log.w(strA00, A00(380, 26, 73) + iA07);
                                }
                            }
                        }
                        if (z) {
                            this.A03 = A01();
                        }
                    }

                    private void A08() {
                        for (int i2 = 0; i2 < 8; i2++) {
                            this.A08[i2].A08();
                        }
                    }

                    private void A0A(int i2) {
                        switch (i2) {
                            case 0:
                            case 14:
                                return;
                            case 3:
                                java.util.List<com.facebook.ads.redexgen.core.C0693Fs> listA01 = A01();
                                java.lang.String[] strArr = A0A;
                                if (strArr[0].length() != strArr[3].length()) {
                                    throw new java.lang.RuntimeException();
                                }
                                java.lang.String[] strArr2 = A0A;
                                strArr2[0] = "cYQNrPy";
                                strArr2[3] = "NObDRxg";
                                this.A03 = listA01;
                                return;
                            case 8:
                                this.A01.A06();
                                return;
                            case 12:
                                A08();
                                return;
                            case 13:
                                this.A01.A09('\n');
                                return;
                            default:
                                java.lang.String strA00 = A00(80, 13, 68);
                                if (i2 >= 17 && i2 <= 23) {
                                    android.util.Log.w(strA00, A00(93, 44, 79) + i2);
                                    this.A06.A08(8);
                                    return;
                                }
                                java.lang.String[] strArr3 = A0A;
                                if (strArr3[5].length() != strArr3[7].length()) {
                                    throw new java.lang.RuntimeException();
                                }
                                java.lang.String[] strArr4 = A0A;
                                strArr4[6] = "9gEQCvPFdreLq8ucaHGbo1FFHbhoOPYc";
                                strArr4[2] = "adIHl6UCoaxd1uqvYvCbAbAxB8winlNV";
                                if (i2 >= 24 && i2 <= 31) {
                                    android.util.Log.w(strA00, A00(org.objectweb.asm.Opcodes.L2F, 43, 33) + i2);
                                    this.A06.A08(16);
                                    return;
                                } else {
                                    android.util.Log.w(strA00, A00(274, 20, 83) + i2);
                                    return;
                                }
                        }
                    }

                    private void A0B(int i2) {
                        switch (i2) {
                            case 128:
                            case 129:
                            case 130:
                            case org.objectweb.asm.Opcodes.LXOR /* 131 */:
                            case org.objectweb.asm.Opcodes.IINC /* 132 */:
                            case org.objectweb.asm.Opcodes.I2L /* 133 */:
                            case 134:
                            case 135:
                                int i3 = i2 - 128;
                                int window = this.A00;
                                if (window == i3) {
                                    return;
                                }
                                this.A00 = i3;
                                this.A01 = this.A08[i3];
                                return;
                            case 136:
                                for (int i4 = 1; i4 <= 8; i4++) {
                                    boolean zA0F = this.A06.A0F();
                                    java.lang.String[] strArr = A0A;
                                    java.lang.String str2 = strArr[1];
                                    java.lang.String str3 = strArr[4];
                                    int iCharAt = str2.charAt(25);
                                    int i5 = str3.charAt(25);
                                    if (iCharAt != i5) {
                                        java.lang.String[] strArr2 = A0A;
                                        strArr2[6] = "VSRryxZmfi4amJJNw0pQQYma4vvNhg8X";
                                        strArr2[2] = "BL4DcjhEJuwqzgj4jkdydFuK8kSbCD4I";
                                        if (zA0F) {
                                            int i6 = 8 - i4;
                                            this.A08[i6].A07();
                                        }
                                    }
                                    break;
                                }
                                return;
                            case org.objectweb.asm.Opcodes.L2F /* 137 */:
                                for (int i7 = 1; i7 <= 8; i7++) {
                                    if (this.A06.A0F()) {
                                        int i8 = 8 - i7;
                                        this.A08[i8].A0E(true);
                                    }
                                }
                                return;
                            case 138:
                                for (int i9 = 1; i9 <= 8; i9++) {
                                    if (this.A06.A0F()) {
                                        int i10 = 8 - i9;
                                        this.A08[i10].A0E(false);
                                    }
                                }
                                return;
                            case 139:
                                for (int i11 = 1; i11 <= 8; i11++) {
                                    if (this.A06.A0F()) {
                                        int i12 = 8 - i11;
                                        com.facebook.ads.redexgen.core.G0 g0 = this.A08[i12];
                                        g0.A0E(!g0.A0I());
                                    }
                                }
                                return;
                            case 140:
                                for (int i13 = 1; i13 <= 8; i13++) {
                                    if (this.A06.A0F()) {
                                        int i14 = 8 - i13;
                                        this.A08[i14].A08();
                                    }
                                }
                                return;
                            case 141:
                                this.A06.A08(8);
                                return;
                            case org.objectweb.asm.Opcodes.D2I /* 142 */:
                                return;
                            case org.objectweb.asm.Opcodes.D2L /* 143 */:
                                A08();
                                return;
                            case org.objectweb.asm.Opcodes.D2F /* 144 */:
                                if (!this.A01.A0G()) {
                                    this.A06.A08(16);
                                    return;
                                } else {
                                    A03();
                                    return;
                                }
                            case org.objectweb.asm.Opcodes.I2B /* 145 */:
                                if (!this.A01.A0G()) {
                                    this.A06.A08(24);
                                    return;
                                } else {
                                    A04();
                                    return;
                                }
                            case org.objectweb.asm.Opcodes.I2C /* 146 */:
                                if (!this.A01.A0G()) {
                                    this.A06.A08(16);
                                    return;
                                } else {
                                    A05();
                                    return;
                                }
                            case org.objectweb.asm.Opcodes.I2S /* 147 */:
                            case org.objectweb.asm.Opcodes.LCMP /* 148 */:
                            case org.objectweb.asm.Opcodes.FCMPL /* 149 */:
                            case 150:
                            default:
                                android.util.Log.w(A00(80, 13, 68), A00(294, 20, 121) + i2);
                                return;
                            case org.objectweb.asm.Opcodes.DCMPL /* 151 */:
                                if (!this.A01.A0G()) {
                                    this.A06.A08(32);
                                    return;
                                } else {
                                    A06();
                                    return;
                                }
                            case org.objectweb.asm.Opcodes.DCMPG /* 152 */:
                            case 153:
                            case 154:
                            case 155:
                            case 156:
                            case 157:
                            case 158:
                            case org.objectweb.asm.Opcodes.IF_ICMPEQ /* 159 */:
                                int i15 = i2 - 152;
                                A0E(i15);
                                int window2 = this.A00;
                                if (window2 == i15) {
                                    return;
                                }
                                this.A00 = i15;
                                com.facebook.ads.redexgen.core.G0[] g0Arr = this.A08;
                                java.lang.String[] strArr3 = A0A;
                                java.lang.String str4 = strArr3[0];
                                java.lang.String str5 = strArr3[3];
                                int length = str4.length();
                                int window3 = str5.length();
                                if (length == window3) {
                                    java.lang.String[] strArr4 = A0A;
                                    strArr4[6] = "c4ioSCGe7KNKl4RmGo77tuqVZW7GRO5r";
                                    strArr4[2] = "kTXdjMmR3ZZloMRgG8kAyk2rxzgndvqM";
                                    this.A01 = g0Arr[i15];
                                    return;
                                }
                                break;
                        }
                        throw new java.lang.RuntimeException();
                    }

                    private void A0C(int i2) {
                        if (i2 <= 7) {
                            return;
                        }
                        if (i2 <= 15) {
                            this.A06.A08(8);
                            return;
                        }
                        if (i2 <= 23) {
                            com.facebook.ads.redexgen.core.I3 i3 = this.A06;
                            java.lang.String[] strArr = A0A;
                            if (strArr[0].length() != strArr[3].length()) {
                                throw new java.lang.RuntimeException();
                            }
                            java.lang.String[] strArr2 = A0A;
                            strArr2[6] = "PcALpDXfdKTOGVICfCKaZZ0xZ5oW4rSk";
                            strArr2[2] = "2XC1KBXrSpvLkiHBNbmrl8w830zrIApy";
                            i3.A08(16);
                            return;
                        }
                        if (i2 > 31) {
                            return;
                        }
                        this.A06.A08(24);
                    }

                    private void A0D(int i2) {
                        if (i2 <= 135) {
                            this.A06.A08(32);
                            return;
                        }
                        if (i2 <= 143) {
                            this.A06.A08(40);
                        } else {
                            if (i2 > 159) {
                                return;
                            }
                            this.A06.A08(2);
                            int length = this.A06.A04(6);
                            this.A06.A08(length * 8);
                        }
                    }

                    private void A0F(int i2) {
                        if (i2 == 127) {
                            this.A01.A09((char) 9835);
                        } else {
                            this.A01.A09((char) (i2 & 255));
                        }
                    }

                    private void A0G(int i2) {
                        this.A01.A09((char) (i2 & 255));
                    }

                    private void A0H(int i2) {
                        switch (i2) {
                            case 32:
                                com.facebook.ads.redexgen.core.G0 g0 = this.A01;
                                java.lang.String[] strArr = A0A;
                                if (strArr[5].length() == strArr[7].length()) {
                                    java.lang.String[] strArr2 = A0A;
                                    strArr2[0] = "YILzIjH";
                                    strArr2[3] = "ddyJCuS";
                                    g0.A09(' ');
                                    return;
                                }
                                break;
                            case 33:
                                this.A01.A09(kotlin.text.Typography.nbsp);
                                return;
                            case 37:
                                this.A01.A09(kotlin.text.Typography.ellipsis);
                                return;
                            case 42:
                                this.A01.A09((char) 352);
                                return;
                            case 44:
                                this.A01.A09((char) 338);
                                return;
                            case 48:
                                this.A01.A09((char) 9608);
                                return;
                            case 49:
                                this.A01.A09(kotlin.text.Typography.leftSingleQuote);
                                return;
                            case 50:
                                com.facebook.ads.redexgen.core.G0 g1 = this.A01;
                                java.lang.String[] strArr3 = A0A;
                                if (strArr3[0].length() == strArr3[3].length()) {
                                    java.lang.String[] strArr4 = A0A;
                                    strArr4[0] = "Xjh0Xhk";
                                    strArr4[3] = "lPudXCI";
                                    g1.A09(kotlin.text.Typography.rightSingleQuote);
                                    return;
                                }
                                break;
                            case 51:
                                this.A01.A09(kotlin.text.Typography.leftDoubleQuote);
                                return;
                            case 52:
                                this.A01.A09(kotlin.text.Typography.rightDoubleQuote);
                                return;
                            case 53:
                                this.A01.A09(kotlin.text.Typography.bullet);
                                return;
                            case 57:
                                this.A01.A09(kotlin.text.Typography.tm);
                                return;
                            case 58:
                                this.A01.A09((char) 353);
                                return;
                            case 60:
                                this.A01.A09((char) 339);
                                return;
                            case 61:
                                this.A01.A09((char) 8480);
                                return;
                            case 63:
                                this.A01.A09((char) 376);
                                return;
                            case 118:
                                this.A01.A09((char) 8539);
                                return;
                            case 119:
                                this.A01.A09((char) 8540);
                                return;
                            case 120:
                                this.A01.A09((char) 8541);
                                return;
                            case 121:
                                this.A01.A09((char) 8542);
                                return;
                            case 122:
                                this.A01.A09((char) 9474);
                                return;
                            case 123:
                                this.A01.A09((char) 9488);
                                return;
                            case 124:
                                this.A01.A09((char) 9492);
                                return;
                            case 125:
                                this.A01.A09((char) 9472);
                                return;
                            case 126:
                                this.A01.A09((char) 9496);
                                return;
                            case 127:
                                this.A01.A09((char) 9484);
                                return;
                            default:
                                android.util.Log.w(A00(80, 13, 68), A00(314, 22, 31) + i2);
                                return;
                        }
                        throw new java.lang.RuntimeException();
                    }

                    private void A0I(int i2) {
                        if (i2 == 160) {
                            this.A01.A09((char) 13252);
                            return;
                        }
                        android.util.Log.w(A00(80, 13, 68), A00(336, 22, 15) + i2);
                        this.A01.A09('_');
                    }

                    @Override // com.facebook.ads.redexgen.core.DD
                    /* JADX INFO: renamed from: A0L */
                    public final /* bridge */ /* synthetic */ com.facebook.ads.redexgen.core.DO A5Q() throws com.facebook.ads.redexgen.core.C0695Fu {
                        return super.A5Q();
                    }

                    @Override // com.facebook.ads.redexgen.core.DD
                    /* JADX INFO: renamed from: A0M */
                    public final /* bridge */ /* synthetic */ com.facebook.ads.redexgen.core.DM A5R() throws com.facebook.ads.redexgen.core.C0695Fu {
                        return super.A5R();
                    }

                    @Override // com.facebook.ads.redexgen.core.DD
                    public final com.facebook.ads.redexgen.core.XN A0N() {
                        this.A04 = this.A03;
                        return new com.facebook.ads.redexgen.core.XN(this.A03);
                    }

                    @Override // com.facebook.ads.redexgen.core.DD
                    /* JADX INFO: renamed from: A0O */
                    public final /* bridge */ /* synthetic */ void AEj(com.facebook.ads.redexgen.core.DO r1) throws com.facebook.ads.redexgen.core.C0695Fu {
                        super.AEj(r1);
                    }

                    @Override // com.facebook.ads.redexgen.core.DD
                    public final void A0P(com.facebook.ads.redexgen.core.DO r9) {
                        this.A07.A0b(r9.A01.array(), r9.A01.limit());
                        while (this.A07.A04() >= 3) {
                            int iA0E = this.A07.A0E() & 7;
                            int ccType = iA0E & 3;
                            int ccTypeAndValid = iA0E & 4;
                            int ccTypeAndValid2 = ccTypeAndValid == 4 ? 1 : 0;
                            byte bA0E = (byte) this.A07.A0E();
                            byte bA0E2 = (byte) this.A07.A0E();
                            if (ccType == 2 || ccType == 3) {
                                if (ccTypeAndValid2 != 0) {
                                    if (ccType == 3) {
                                        A02();
                                        int sequenceNumber = (bA0E & 192) >> 6;
                                        int ccTypeAndValid3 = bA0E & okio.Utf8.REPLACEMENT_BYTE;
                                        if (ccTypeAndValid3 == 0) {
                                            ccTypeAndValid3 = 64;
                                        }
                                        this.A02 = new com.facebook.ads.redexgen.core.G1(sequenceNumber, ccTypeAndValid3);
                                        byte[] bArr = this.A02.A03;
                                        com.facebook.ads.redexgen.core.G1 g1 = this.A02;
                                        int ccTypeAndValid4 = g1.A00;
                                        g1.A00 = ccTypeAndValid4 + 1;
                                        bArr[ccTypeAndValid4] = bA0E2;
                                    } else {
                                        com.facebook.ads.redexgen.core.AbstractC0730Hf.A03(ccType == 2);
                                        if (this.A02 == null) {
                                            android.util.Log.e(A00(80, 13, 68), A00(219, 55, 49));
                                        } else {
                                            byte[] bArr2 = this.A02.A03;
                                            com.facebook.ads.redexgen.core.G1 g2 = this.A02;
                                            int ccTypeAndValid5 = g2.A00;
                                            g2.A00 = ccTypeAndValid5 + 1;
                                            bArr2[ccTypeAndValid5] = bA0E;
                                            byte[] bArr3 = this.A02.A03;
                                            com.facebook.ads.redexgen.core.G1 g3 = this.A02;
                                            int ccTypeAndValid6 = g3.A00;
                                            g3.A00 = ccTypeAndValid6 + 1;
                                            bArr3[ccTypeAndValid6] = bA0E2;
                                        }
                                    }
                                    int ccTypeAndValid7 = this.A02.A00;
                                    if (ccTypeAndValid7 == (this.A02.A01 * 2) - 1) {
                                        A02();
                                    }
                                }
                            }
                        }
                    }

                    @Override // com.facebook.ads.redexgen.core.DD
                    public final boolean A0R() {
                        return this.A03 != this.A04;
                    }

                    @Override // com.facebook.ads.redexgen.core.DD, com.facebook.ads.redexgen.core.BG
                    public final /* bridge */ /* synthetic */ void AEy() {
                        super.AEy();
                    }

                    @Override // com.facebook.ads.redexgen.core.DD, com.facebook.ads.redexgen.core.XQ
                    public final /* bridge */ /* synthetic */ void AGb(long j) {
                        super.AGb(j);
                    }

                    @Override // com.facebook.ads.redexgen.core.DD, com.facebook.ads.redexgen.core.BG
                    public final void flush() {
                        super.flush();
                        this.A03 = null;
                        this.A04 = null;
                        this.A00 = 0;
                        this.A01 = this.A08[this.A00];
                        A08();
                        this.A02 = null;
                    }
                };
            case 9:
                final java.util.List<byte[]> list2 = format.A0P;
                return new com.facebook.ads.redexgen.core.DP(list2) { // from class: com.facebook.ads.redexgen.X.4l
                    public static byte[] A01;
                    public final com.facebook.ads.redexgen.core.GC A00;

                    static {
                        A02();
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    {
                        super(A01(0, 10, 34));
                        com.facebook.ads.redexgen.core.I4 i4 = new com.facebook.ads.redexgen.core.I4(list2.get(0));
                        this.A00 = new com.facebook.ads.redexgen.core.GC(i4.A0I(), i4.A0I());
                    }

                    public static java.lang.String A01(int i2, int i3, int i4) {
                        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i2, i2 + i3);
                        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 15);
                        }
                        return new java.lang.String(bArrCopyOfRange);
                    }

                    public static void A02() {
                        A01 = new byte[]{105, 91, 79, 105, 72, 78, 66, 73, 72, 95};
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // com.facebook.ads.redexgen.core.DP
                    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
                    public final com.facebook.ads.redexgen.core.XM A0b(byte[] bArr, int i2, boolean z) {
                        if (z) {
                            this.A00.A0J();
                        }
                        return new com.facebook.ads.redexgen.core.XM(this.A00.A0I(bArr, i2));
                    }
                };
            case 10:
                return new com.facebook.ads.redexgen.core.DP() { // from class: com.facebook.ads.redexgen.X.4h
                    public static byte[] A05;
                    public static java.lang.String[] A06 = {"UvMYifKJN5XlDmqCGtoDO0VU32zAs0FL", "LFobEXKDhJRa7BUCwy1CSsuZBtPalNbY", "ro3O9ZnhusAXVRGM6YuStMwfegsJiS0G", "gsFfqdBKr6navDc5yRQhzfKcOOsGbQ", "SHwoitQ0ze1bIMgolnOCecLrl", "CWI1un3bs31rMxD1NtaCqa2ehlmyLiT7", "lv3cYkOFFWI0GOqNSEdNKMwlCNEEK2B6", "PQFtR4q9OWZxFn8N6coU55QUIwEDXAuT"};
                    public int A00;
                    public java.util.zip.Inflater A01;
                    public byte[] A02;
                    public final com.facebook.ads.redexgen.core.GD A03;
                    public final com.facebook.ads.redexgen.core.I4 A04;

                    public static java.lang.String A01(int i2, int i3, int i4) {
                        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i2, i2 + i3);
                        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 20);
                        }
                        return new java.lang.String(bArrCopyOfRange);
                    }

                    public static void A02() {
                        A05 = new byte[]{-74, -51, -39, -86, -53, -55, -43, -54, -53, -40};
                    }

                    static {
                        A02();
                    }

                    {
                        A01(0, 10, 82);
                        this.A04 = new com.facebook.ads.redexgen.core.I4();
                        this.A03 = new com.facebook.ads.redexgen.core.GD();
                    }

                    public static com.facebook.ads.redexgen.core.C0693Fs A00(com.facebook.ads.redexgen.core.I4 i4, com.facebook.ads.redexgen.core.GD gd) {
                        int limit = i4.A07();
                        int nextSectionPosition = i4.A0E();
                        int sectionLength = i4.A0I();
                        int sectionType = i4.A06() + sectionLength;
                        if (sectionType > limit) {
                            i4.A0Y(limit);
                            return null;
                        }
                        com.facebook.ads.redexgen.core.C0693Fs c0693FsA06 = null;
                        switch (nextSectionPosition) {
                            case 20:
                                gd.A05(i4, sectionLength);
                                break;
                            case 21:
                                gd.A03(i4, sectionLength);
                                break;
                            case 22:
                                gd.A04(i4, sectionLength);
                                break;
                            case 128:
                                c0693FsA06 = gd.A06();
                                gd.A07();
                                break;
                        }
                        i4.A0Y(sectionType);
                        return c0693FsA06;
                    }

                    private boolean A03(byte[] bArr, int i2) {
                        if (i2 != 0) {
                            byte b2 = bArr[0];
                            if (A06[4].length() != 8) {
                                java.lang.String[] strArr = A06;
                                strArr[5] = "6pK7fmhXCRN42blRkXgjJqqaTbJzjww9";
                                strArr[0] = "5cyMB82Qe4eQ9b0iXLvblRB56WWXPKQX";
                                if (b2 == 120) {
                                    if (this.A01 == null) {
                                        this.A01 = new java.util.zip.Inflater();
                                        this.A02 = new byte[i2];
                                    }
                                    this.A00 = 0;
                                    if (A06[4].length() != 8) {
                                        java.lang.String[] strArr2 = A06;
                                        strArr2[7] = "JfGFZwjGFYzvyVPtO8XWKYF6pfAF7Jfg";
                                        strArr2[1] = "RpDMGSzow5LfXP9Y2O2bh4szGjZC1AcN";
                                        this.A01.setInput(bArr, 0, i2);
                                        while (!this.A01.finished() && !this.A01.needsDictionary() && !this.A01.needsInput()) {
                                            try {
                                                if (this.A00 == this.A02.length) {
                                                    this.A02 = java.util.Arrays.copyOf(this.A02, this.A02.length * 2);
                                                }
                                                this.A00 += this.A01.inflate(this.A02, this.A00, this.A02.length - this.A00);
                                            } catch (java.util.zip.DataFormatException unused) {
                                                java.util.zip.Inflater inflater = this.A01;
                                                java.lang.String[] strArr3 = A06;
                                                if (strArr3[2].charAt(2) != strArr3[6].charAt(2)) {
                                                    throw new java.lang.RuntimeException();
                                                }
                                                java.lang.String[] strArr4 = A06;
                                                strArr4[2] = "Dj3w457lu91y2nqDmk4H7qNB2BzBHZDv";
                                                strArr4[6] = "4Q3Gz3VI2xUNooldbcStPnBcvxw4W1CH";
                                                inflater.reset();
                                                return false;
                                            } catch (java.lang.Throwable th) {
                                                this.A01.reset();
                                                throw th;
                                            }
                                        }
                                        boolean zFinished = this.A01.finished();
                                        this.A01.reset();
                                        return zFinished;
                                    }
                                }
                            }
                            throw new java.lang.RuntimeException();
                        }
                        return false;
                    }

                    @Override // com.facebook.ads.redexgen.core.DP
                    public final com.facebook.ads.redexgen.core.InterfaceC0694Ft A0b(byte[] bArr, int i2, boolean z) throws com.facebook.ads.redexgen.core.C0695Fu {
                        if (A03(bArr, i2)) {
                            this.A04.A0b(this.A02, this.A00);
                        } else {
                            this.A04.A0b(bArr, i2);
                        }
                        this.A03.A07();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        while (this.A04.A04() >= 3) {
                            com.facebook.ads.redexgen.core.C0693Fs c0693FsA00 = A00(this.A04, this.A03);
                            if (c0693FsA00 != null) {
                                arrayList.add(c0693FsA00);
                            }
                        }
                        return new com.facebook.ads.redexgen.core.XL(java.util.Collections.unmodifiableList(arrayList));
                    }
                };
            default:
                throw new java.lang.IllegalArgumentException(A00(0, 50, 71));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0696Fv
    public final boolean AH7(com.facebook.ads.internal.exoplayer2.thirdparty.Format format) {
        java.lang.String str = format.A0O;
        java.lang.String mimeType = A00(236, 8, 6);
        if (!mimeType.equals(str)) {
            java.lang.String mimeType2 = A00(244, 10, 90);
            if (!mimeType2.equals(str)) {
                java.lang.String mimeType3 = A00(122, 20, 83);
                if (!mimeType3.equals(str)) {
                    java.lang.String mimeType4 = A00(org.objectweb.asm.Opcodes.GOTO, 21, 74);
                    if (!mimeType4.equals(str)) {
                        java.lang.String mimeType5 = A00(216, 20, 32);
                        if (!mimeType5.equals(str)) {
                            java.lang.String mimeType6 = A00(188, 28, 95);
                            if (!mimeType6.equals(str)) {
                                java.lang.String mimeType7 = A00(50, 19, 95);
                                if (!mimeType7.equals(str)) {
                                    java.lang.String mimeType8 = A00(org.objectweb.asm.Opcodes.D2I, 25, 58);
                                    if (!mimeType8.equals(str)) {
                                        java.lang.String strA00 = A00(69, 19, 40);
                                        if (A01[0].charAt(25) != '7') {
                                            throw new java.lang.RuntimeException();
                                        }
                                        A01[6] = "W6hkZ8M6OfBj1T0wHxtu1K3YRZUS86qO";
                                        if (!strA00.equals(str)) {
                                            java.lang.String mimeType9 = A00(88, 19, 38);
                                            if (!mimeType9.equals(str)) {
                                                java.lang.String mimeType10 = A00(107, 15, 111);
                                                if (!mimeType10.equals(str)) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
