package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0748Hx {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"nXvlrNGYXanwKFKxckYF", com.json.mediationsdk.impressionData.ImpressionData.IMPRESSION_DATA_KEY_ABTEST, "QC6qUWFS60GKUUYeA4MZapqXqsMmI3vS", "czhP8H02Ev9YOfXIuS", "lopRyFs0vjceEr78rsaj4u7Yl", "ny4Ztm5fY14Zy", "JhDFckQh0xOKzX75Bu5yFTpT52B828", "5XgzWWjFe0UjIKQc45EJfpyV7HOKhYUT"};
    public static final java.util.ArrayList<com.facebook.ads.redexgen.core.C0747Hw> A02;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 96);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{-86, -49, -41, -62, -51, -54, -59, -127, -50, -54, -50, -58, -127, -43, -38, -47, -58, -101, -127, 27, 29, -25, -19, 25, 40, 40, 36, 33, 27, 25, 44, 33, 39, 38, -25, 27, 29, 25, -27, -18, -24, -16, 58, 73, 73, 69, 66, 60, 58, 77, 66, 72, 71, 8, 60, 62, 58, 6, 16, 9, 17, -37, -22, -22, -26, -29, -35, -37, -18, -29, -23, -24, -87, -34, -16, -36, -19, -17, -36, -19, 21, 36, 36, 32, 29, 23, 21, 40, 29, 35, 34, -29, 29, 24, -25, -13, 2, 2, -2, -5, -11, -13, 6, -5, 1, 0, -63, 2, -7, 5, -43, -28, -28, -32, -35, -41, -43, -24, -35, -29, -30, -93, -24, -24, -31, -32, -97, -20, -31, -32, -1, 14, 14, 10, 7, 1, -1, 18, 7, 13, 12, -51, 20, 13, 0, 17, 19, 0, 43, 58, 58, 54, 51, 45, 43, 62, 51, 57, 56, -7, 66, -9, 45, 43, 55, 47, 60, 43, -9, 55, 57, 62, 51, 57, 56, 3, 18, 18, 14, 11, 5, 3, 22, 11, 17, 16, -47, 26, -49, 7, 15, 21, 9, 18, 33, 33, 29, 26, 20, 18, 37, 26, 32, 31, -32, 41, -34, 30, 33, -27, -34, 20, 22, 18, -34, -25, -31, -23, -42, -27, -27, -31, -34, -40, -42, -23, -34, -28, -29, -92, -19, -94, -30, -27, -87, -94, -21, -23, -23, 31, 46, 46, 42, 39, 33, 31, 50, 39, 45, 44, -19, 54, -21, 47, 51, 39, 33, 41, 50, 39, 43, 35, -21, 50, 54, -15, 37, 62, 77, 77, 73, 70, 64, 62, 81, 70, 76, 75, 12, 85, 10, 79, 62, 84, 64, 64, 59, 74, 74, 70, 67, kotlin.io.encoding.Base64.padSymbol, 59, 78, 67, 73, 72, 9, 82, 7, 77, kotlin.io.encoding.Base64.padSymbol, 78, okio.Utf8.REPLACEMENT_BYTE, 13, 15, -43, -28, -28, -32, -35, -41, -43, -24, -35, -29, -30, -93, -20, -95, -25, -23, -42, -26, -35, -28, 30, 50, 33, 38, 44, 58, 78, kotlin.io.encoding.Base64.padSymbol, 66, 72, 8, 58, 60, 12, 14, 34, 17, 22, 28, -36, 18, 14, 16, -32, -7, 13, -4, 1, 7, -57, -3, -7, -5, -53, -59, 2, 7, -5, -9, 11, -6, -1, 5, -59, 3, 6, -54, -9, -61, 2, -9, 10, 3, 19, 39, 22, 27, 33, -31, 31, 34, 23, 25, -45, -25, -42, -37, -31, -95, -31, -30, -25, -27, -54, -34, -51, -46, -40, -104, -35, -37, -34, -50, -106, -47, -51, -54, -34, -51, -46, -40, -104, -33, -41, -51, -105, -51, -35, -36, -34, -14, -31, -26, -20, -84, -13, -21, -31, -85, -31, -15, -16, -85, -27, -31, -9, 11, -6, -1, 5, -59, 12, 5, 8, -8, -1, 9, 38, 59, 40, -10, -31, -10, -29, -77, -25, -13, -24, -23, -25, -44, -10, -23, -22, -19, -4, 41, 38, 40, -8, -41, -40, -42, -90, 47, okio.Utf8.REPLACEMENT_BYTE, 62, 46, 17, 33, 32, 18, -45, -29, -30, -41, 42, 58, 57, 50, 51, 49, -7, 1, 31, 29, -25, -19, -13, -16, 1, -68, 8, 22, 3, -47, 72, 68, 72, 64, 47, 84, 75, 64, -27, -24, -84, -39, 33, 36, -24, 21, -30, 12, 13, 18, 16, -11, -26, -7, -11, -35, -48, -53, -52, -42, -37, -50, -55, -54, -44, -108, -58, -37, -56, -31, -44, -49, -48, -38, -102, -45, -48, -31, -50, 78, 65, 60, kotlin.io.encoding.Base64.padSymbol, 71, 7, 69, 72, 12, 78, 5, kotlin.io.encoding.Base64.padSymbol, 75, -37, -50, -55, -54, -44, -108, -46, -43, -54, -52, 82, 69, 64, 65, 75, 11, 73, 76, 65, 67, 14, 37, 24, 19, 20, 30, -34, 38, 37, 18, -32, 51, 38, 33, 34, 44, -20, 53, -22, 51, 43, 33, -21, 44, 43, -17, -21, 51, 45, -11, 73, 60, 55, 56, 66, 2, 75, 0, 73, 65, 55, 1, 66, 65, 5, 1, 73, 67, 12, 51, 44, 47, 31, 38, 48, 27, 21, -43, -35, 24, 18, -46, -37, -31, -37, -93, 30, 24, -31};
    }

    static {
        A08();
        A02 = new java.util.ArrayList<>();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:6:0x000d A[RETURN] */
    public static int A00(java.lang.String str) {
        byte b;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(A04(350, 14, 56))) {
                    b = 2;
                }
                switch (b) {
                    case 0:
                        return 5;
                    case 1:
                    case 2:
                        return 6;
                    case 3:
                        return 7;
                    case 4:
                        return 8;
                    case 5:
                        return 14;
                    default:
                        return 0;
                }
            case -1095064472:
                if (str.equals(A04(com.bytedance.sdk.openadsdk.TTAdConstant.IMAGE_URL_CODE, 13, 9))) {
                    b = 3;
                }
                switch (b) {
                    case 0:
                        return 5;
                    case 1:
                    case 2:
                        return 6;
                    case 3:
                        return 7;
                    case 4:
                        return 8;
                    case 5:
                        return 14;
                    default:
                        return 0;
                }
            case 187078296:
                if (str.equals(A04(331, 9, 121))) {
                    b = 0;
                }
                switch (b) {
                    case 0:
                        return 5;
                    case 1:
                    case 2:
                        return 6;
                    case 3:
                        return 7;
                    case 4:
                        return 8;
                    case 5:
                        return 14;
                    default:
                        return 0;
                }
            case 1504578661:
                if (str.equals(A04(340, 10, 77))) {
                    b = 1;
                }
                switch (b) {
                    case 0:
                        return 5;
                    case 1:
                    case 2:
                        return 6;
                    case 3:
                        return 7;
                    case 4:
                        return 8;
                    case 5:
                        return 14;
                    default:
                        return 0;
                }
            case 1505942594:
                java.lang.String strA04 = A04(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PHASE, 16, 29);
                java.lang.String[] strArr = A01;
                if (strArr[5].length() != strArr[3].length()) {
                    A01[1] = "fm";
                    if (str.equals(strA04)) {
                        b = 4;
                    }
                } else {
                    A01[1] = "oH";
                    if (str.equals(strA04)) {
                        b = 4;
                    }
                }
                switch (b) {
                    case 0:
                        return 5;
                    case 1:
                    case 2:
                        return 6;
                    case 3:
                        return 7;
                    case 4:
                        return 8;
                    case 5:
                        return 14;
                    default:
                        return 0;
                }
            case 1556697186:
                java.lang.String[] strArr2 = A01;
                if (strArr2[6].length() != strArr2[0].length()) {
                    A01[4] = "XQV1rtrSOg8";
                    if (str.equals(A04(399, 13, 9))) {
                        b = 5;
                    }
                    switch (b) {
                        case 0:
                            return 5;
                        case 1:
                        case 2:
                            return 6;
                        case 3:
                            return 7;
                        case 4:
                            return 8;
                        case 5:
                            return 14;
                        default:
                            return 0;
                    }
                }
                throw new java.lang.RuntimeException();
        }
        b = -1;
        switch (b) {
            case 0:
                return 5;
            case 1:
            case 2:
                return 6;
            case 3:
                return 7;
            case 4:
                return 8;
            case 5:
                return 14;
            default:
                return 0;
        }
    }

    public static int A01(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return -1;
        }
        boolean zA09 = A09(str);
        if (A01[4].length() != 9) {
            java.lang.String[] strArr = A01;
            strArr[6] = "RJC1gwIZ7rbFn6fsQqldXDA2erGgWv";
            strArr[0] = "27hJvu9Qq1BWxS961NvI";
            if (zA09) {
                return 1;
            }
            if (A0B(str)) {
                return 2;
            }
            if (!A0A(str) && !A04(23, 19, 88).equals(str) && !A04(42, 19, 121).equals(str) && !A04(org.objectweb.asm.Opcodes.INSTANCEOF, 25, 81).equals(str) && !A04(306, 20, 20).equals(str)) {
                boolean zEquals = A04(110, 20, 20).equals(str);
                java.lang.String[] strArr2 = A01;
                if (strArr2[6].length() != strArr2[0].length()) {
                    A01[1] = "yK";
                    if (!zEquals && !A04(239, 28, 94).equals(str) && !A04(218, 21, 21).equals(str) && !A04(267, 19, 125).equals(str) && !A04(130, 18, 62).equals(str)) {
                        java.lang.String[] strArr3 = A01;
                        if (strArr3[5].length() != strArr3[3].length()) {
                            java.lang.String[] strArr4 = A01;
                            strArr4[6] = "Pi6X8Ic5BpSNrHRXVgoJ7B2wVh7XZC";
                            strArr4[0] = "bN719ZOEYj7GSd1MtUav";
                            if (A04(95, 15, 50).equals(str)) {
                                return 3;
                            }
                        } else if (A04(95, 15, 50).equals(str)) {
                            return 3;
                        }
                        if (A04(61, 19, 26).equals(str)) {
                            return 3;
                        }
                        if (A04(80, 15, 84).equals(str) || A04(org.objectweb.asm.Opcodes.DRETURN, 18, 66).equals(str) || A04(286, 20, 122).equals(str) || A04(org.objectweb.asm.Opcodes.LCMP, 27, 106).equals(str)) {
                            return 4;
                        }
                        return A02(str);
                    }
                    return 3;
                }
            } else {
                return 3;
            }
        }
        throw new java.lang.RuntimeException();
    }

    public static int A02(java.lang.String str) {
        int customMimeTypeCount = A02.size();
        if (0 < customMimeTypeCount) {
            A02.get(0);
            throw new java.lang.NullPointerException(A04(512, 8, 123));
        }
        return -1;
    }

    public static java.lang.String A03(int i) {
        switch (i) {
            case 32:
                return A04(561, 13, 120);
            case 33:
                return A04(542, 9, 5);
            case 35:
                return A04(551, 10, 11);
            case 64:
            case 102:
            case 103:
            case 104:
                return A04(364, 15, 54);
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return A04(584, 11, 124);
            case 105:
            case 107:
                return A04(379, 10, 82);
            case 106:
                return A04(574, 10, 5);
            case org.objectweb.asm.Opcodes.IF_ICMPGT /* 163 */:
                return A04(595, 10, 79);
            case org.objectweb.asm.Opcodes.IF_ACMPEQ /* 165 */:
                return A04(331, 9, 121);
            case org.objectweb.asm.Opcodes.IF_ACMPNE /* 166 */:
                return A04(340, 10, 77);
            case org.objectweb.asm.Opcodes.RET /* 169 */:
            case 172:
                return A04(com.bytedance.sdk.openadsdk.TTAdConstant.IMAGE_URL_CODE, 13, 9);
            case org.objectweb.asm.Opcodes.TABLESWITCH /* 170 */:
            case org.objectweb.asm.Opcodes.LOOKUPSWITCH /* 171 */:
                return A04(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PHASE, 16, 29);
            case org.objectweb.asm.Opcodes.LRETURN /* 173 */:
                return A04(389, 10, 18);
            case org.objectweb.asm.Opcodes.RETURN /* 177 */:
                return A04(com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, 19, 115);
            default:
                return null;
        }
    }

    public static java.lang.String A05(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String strTrim = str.trim();
        if (strTrim.startsWith(A04(453, 4, 101)) || strTrim.startsWith(A04(457, 4, 32))) {
            return A04(542, 9, 5);
        }
        if (strTrim.startsWith(A04(504, 4, 43)) || strTrim.startsWith(A04(508, 4, 64))) {
            return A04(551, 10, 11);
        }
        if (strTrim.startsWith(A04(660, 3, 72)) || strTrim.startsWith(A04(653, 4, 66))) {
            return A04(com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, 19, 115);
        }
        if (!strTrim.startsWith(A04(657, 3, 11))) {
            if (A01[4].length() == 9) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A01;
            strArr[5] = "Vr1W6v83OFzq7";
            strArr[3] = "7W7bBe2KxQVtiDDwhw";
            if (!strTrim.startsWith(A04(649, 4, 69))) {
                java.lang.String strA04 = A04(com.json.mediationsdk.logger.IronSourceError.ERROR_NO_INTERNET_CONNECTION, 4, 24);
                if (A01[1].length() != 2) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A01;
                strArr2[6] = "Btjplq8kPAGjfXOAnbhpFCySBxhN39";
                strArr2[0] = "OfeWHzVxD3vaWfBesMba";
                if (strTrim.startsWith(strA04)) {
                    java.lang.String mimeType = null;
                    if (strTrim.startsWith(A04(com.json.mediationsdk.logger.IronSourceError.ERROR_PLACEMENT_CAPPED, 5, 84))) {
                        java.lang.String strSubstring = strTrim.substring(5);
                        if (strSubstring.length() >= 2) {
                            try {
                                java.lang.String objectTypeString = strSubstring.substring(0, 2);
                                java.lang.String objectTypeHexString = com.facebook.ads.redexgen.core.IK.A0N(objectTypeString);
                                mimeType = A03(java.lang.Integer.parseInt(objectTypeHexString, 16));
                            } catch (java.lang.NumberFormatException unused) {
                            }
                        }
                    }
                    return mimeType == null ? A04(364, 15, 54) : mimeType;
                }
                if (strTrim.startsWith(A04(19, 4, 90)) || strTrim.startsWith(A04(472, 4, 101))) {
                    return A04(331, 9, 121);
                }
                if (strTrim.startsWith(A04(500, 4, 90)) || strTrim.startsWith(A04(476, 4, 19))) {
                    return A04(340, 10, 77);
                }
                if (strTrim.startsWith(A04(496, 4, 110))) {
                    return A04(350, 14, 56);
                }
                if (strTrim.startsWith(A04(480, 4, 107)) || strTrim.startsWith(A04(484, 4, 77))) {
                    return A04(com.bytedance.sdk.openadsdk.TTAdConstant.IMAGE_URL_CODE, 13, 9);
                }
                if (strTrim.startsWith(A04(488, 4, 15)) || strTrim.startsWith(A04(492, 4, 102))) {
                    return A04(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PHASE, 16, 29);
                }
                if (strTrim.startsWith(A04(529, 4, 61))) {
                    return A04(389, 10, 18);
                }
                if (strTrim.startsWith(A04(643, 6, 93))) {
                    return A04(441, 12, 54);
                }
                return A06(strTrim);
            }
        }
        java.lang.String strA05 = A04(605, 19, 93);
        if (A01[4].length() == 9) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr3 = A01;
        strArr3[6] = "V922PtFQPE4Rka8o3RmIKSxjMATVQg";
        strArr3[0] = "Xf02ukbJtnOUszpkvueX";
        return strA05;
    }

    public static java.lang.String A06(java.lang.String str) {
        int customMimeTypeCount = A02.size();
        if (0 < customMimeTypeCount) {
            A02.get(0);
            throw new java.lang.NullPointerException(A04(461, 11, 36));
        }
        return null;
    }

    public static java.lang.String A07(java.lang.String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(47);
        if (iIndexOf != -1) {
            return str.substring(0, iIndexOf);
        }
        throw new java.lang.IllegalArgumentException(A04(0, 19, 1) + str);
    }

    public static boolean A09(java.lang.String str) {
        return A04(326, 5, 93).equals(A07(str));
    }

    public static boolean A0A(java.lang.String str) {
        return A04(533, 4, 33).equals(A07(str));
    }

    public static boolean A0B(java.lang.String str) {
        return A04(537, 5, 7).equals(A07(str));
    }
}
