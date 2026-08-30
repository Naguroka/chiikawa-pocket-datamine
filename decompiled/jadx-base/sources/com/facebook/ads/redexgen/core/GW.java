package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class GW {
    public static byte[] A01;
    public static java.lang.String[] A02 = {androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "0bXtqnK7VrdXD0OF7yjeOhZXwD", "4DjlIcJyMhOrx13zbyn9Ua1RUzJozfx0", "beOSLAv7e2KhfeXoZ7t1Cc5ewaJxOMdg", "GNaumKrLUMzUxNnx56k9DhfmMoIfnfS2", "0kngC87KKeD1AW87c5HXBxKU7GMyFl67", "rK5XcwzMLXV02PJ3vhhpqELTOW5ZlmlZ", "bQ0kVf6GKUjzG3PLoijh7NiGkCWFuG9r"};
    public static final java.util.regex.Pattern A03;
    public static final java.util.regex.Pattern A04;
    public final java.lang.StringBuilder A00 = new java.lang.StringBuilder();

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 80);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{116, -53, -115, -65, -13, -22, -62, -42, -64, -47, -65, -13, -22, -62, -64, -99, -43, -63, -47, -10, -2, -23, -12, -15, -20, -88, -23, -12, -15, -17, -10, -11, -19, -10, -4, -88, -2, -23, -12, -3, -19, -62, -88, -31, 6, 14, -7, 4, 1, -4, -72, -7, 6, -5, 0, 7, 10, -72, 14, -7, 4, 13, -3, -46, -72, 13, 37, 35, 42, 42, 35, 40, 33, -38, 28, 27, 30, -38, 29, 47, 31, -38, 45, 31, 46, 46, 35, 40, 33, -12, -38, -57, -33, -35, -28, -28, -35, -30, -37, -108, -41, -23, -39, -108, -21, -35, -24, -36, -108, -42, -43, -40, -108, -36, -39, -43, -40, -39, -26, -82, -108, -79, -54, -57, -54, -53, -45, -54, 124, -65, -47, -63, 124, -49, -63, -48, -48, -59, -54, -61, 124, 3, 17, 14, 34, 32, 32, -17, 33, 17, -4, 13, 30, 31, 17, 30, -6, -65, -5, -51, -4, -54, -108, -56, -65, -105, -107, -56, -33, -105, -103, -103, -86, -56, -33, -105, -108, -56, -65, -105, -107, -108, -102, -106, -107, -85, -112, -8, 3, 0, -2, 5, -10, 2, 5, 47, 13, -45, -43, -34, -28, -43, -30, 50, 59, 49, -26, -13, 5, 43, 41, 48, 49, 52, 43, 48, 41, -30, 55, 48, 53, 55, 50, 50, 49, 52, 54, 39, 38, -30, 39, 48, 54, 43, 54, 59, -4, -30, -23, -24, -27, -38, -25, -32, -57, -64, -63, -49, 54, 51, 56, 47, -36, -28, -30, -34, -39, -39, -31, -38, -66, -78, -61, -64, 46, 45, 49, 39, 50, 39, 45, 44, -13, -22, -24, -23, -11, 45, 35, 52, 31, -59, -58, -77, -60, -58, 13, -51};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final boolean A0G(com.facebook.ads.redexgen.core.I4 i4, com.facebook.ads.redexgen.core.GT gt, java.util.List<com.facebook.ads.redexgen.core.GR> list) {
        java.lang.String strA0P = i4.A0P();
        if (strA0P == null) {
            return false;
        }
        java.util.regex.Matcher matcher = A03.matcher(strA0P);
        if (matcher.matches()) {
            return A0F(null, matcher, i4, gt, this.A00, list);
        }
        java.lang.String strA0P2 = i4.A0P();
        if (strA0P2 == null) {
            return false;
        }
        java.util.regex.Matcher matcher2 = A03.matcher(strA0P2);
        if (!matcher2.matches()) {
            return false;
        }
        java.lang.String strTrim = strA0P.trim();
        java.lang.StringBuilder sb = this.A00;
        if (A02[0].length() == 11) {
            throw new java.lang.RuntimeException();
        }
        A02[0] = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
        return A0F(strTrim, matcher2, i4, gt, sb, list);
    }

    static {
        A05();
        A03 = java.util.regex.Pattern.compile(A03(org.objectweb.asm.Opcodes.IF_ICMPLT, 26, 28));
        A04 = java.util.regex.Pattern.compile(A03(3, 12, 71));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    public static int A00(java.lang.String str) {
        byte b;
        switch (str.hashCode()) {
            case -1364013995:
                if (!str.equals(A03(org.objectweb.asm.Opcodes.MULTIANEWARRAY, 6, 32))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -1074341483:
                if (!str.equals(A03(254, 6, 37))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 100571:
                if (!str.equals(A03(com.ironsource.g3.c.b.d, 3, 125))) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 109757538:
                if (!str.equals(A03(281, 5, 2))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return 0;
            case 1:
            case 2:
                return 1;
            case 3:
                return 2;
            default:
                android.util.Log.w(A03(141, 15, 92), A03(43, 22, 72) + str);
                return Integer.MIN_VALUE;
        }
    }

    public static int A01(java.lang.String str, int i) {
        int iIndexOf = str.indexOf(62, i);
        if (iIndexOf == -1) {
            int index = str.length();
            return index;
        }
        int index2 = iIndexOf + 1;
        return index2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0099  */
    /* JADX WARN: Code duplicated, block: B:35:0x0101  */
    /* JADX WARN: Code duplicated, block: B:37:0x0104  */
    /* JADX WARN: Code duplicated, block: B:39:0x0107  */
    /* JADX WARN: Code duplicated, block: B:41:0x011d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0125  */
    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    /* JADX WARN: Code duplicated, block: B:6:0x000b  */
    public static android.text.Layout.Alignment A02(java.lang.String str) {
        byte b;
        android.text.Layout.Alignment alignment;
        java.lang.String[] strArr;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(A03(org.objectweb.asm.Opcodes.MULTIANEWARRAY, 6, 32))) {
                    b = 2;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
                        strArr = A02;
                        if (strArr[6].charAt(12) != strArr[4].charAt(12)) {
                            A02[7] = "bCR9WkA6eyEV4h8trRpw719hZYlamBiM";
                            return alignment;
                        }
                        A02[5] = "enxKCq4Pqw8aEUUsiy7ukDSLGbRSz6QP";
                        return alignment;
                    case 2:
                    case 3:
                        return android.text.Layout.Alignment.ALIGN_CENTER;
                    case 4:
                    case 5:
                        return android.text.Layout.Alignment.ALIGN_OPPOSITE;
                    default:
                        android.util.Log.w(A03(141, 15, 92), A03(18, 25, 56) + str);
                        return null;
                }
            case -1074341483:
                if (str.equals(A03(254, 6, 37))) {
                    b = 3;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
                        strArr = A02;
                        if (strArr[6].charAt(12) != strArr[4].charAt(12)) {
                            A02[7] = "bCR9WkA6eyEV4h8trRpw719hZYlamBiM";
                            return alignment;
                        }
                        A02[5] = "enxKCq4Pqw8aEUUsiy7ukDSLGbRSz6QP";
                        return alignment;
                    case 2:
                    case 3:
                        return android.text.Layout.Alignment.ALIGN_CENTER;
                    case 4:
                    case 5:
                        return android.text.Layout.Alignment.ALIGN_OPPOSITE;
                    default:
                        android.util.Log.w(A03(141, 15, 92), A03(18, 25, 56) + str);
                        return null;
                }
            case 100571:
                if (A02[3].charAt(28) == '7') {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A02;
                strArr2[1] = "7PGZJ1YTnIpz1MnKNXjKJKx4R3";
                strArr2[2] = "v8hq3OpfXgDX55q9kK7jSczfm00DK5LT";
                if (str.equals(A03(com.ironsource.g3.c.b.d, 3, 125))) {
                    b = 4;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
                        strArr = A02;
                        if (strArr[6].charAt(12) != strArr[4].charAt(12)) {
                            A02[7] = "bCR9WkA6eyEV4h8trRpw719hZYlamBiM";
                            return alignment;
                        }
                        A02[5] = "enxKCq4Pqw8aEUUsiy7ukDSLGbRSz6QP";
                        return alignment;
                    case 2:
                    case 3:
                        return android.text.Layout.Alignment.ALIGN_CENTER;
                    case 4:
                    case 5:
                        return android.text.Layout.Alignment.ALIGN_OPPOSITE;
                    default:
                        android.util.Log.w(A03(141, 15, 92), A03(18, 25, 56) + str);
                        return null;
                }
            case 3317767:
                if (A02[3].charAt(28) != '7') {
                    A02[7] = "bkmUT4CvzUSZ7MhYtPFhflsXwwbbKral";
                    if (str.equals(A03(244, 4, 11))) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else {
                    A02[3] = "0qLNhA3ZG3Ha7BOLINyaeyfMkN7XRdZP";
                    if (str.equals(A03(244, 3, 7))) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                }
                switch (b) {
                    case 0:
                    case 1:
                        alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
                        strArr = A02;
                        if (strArr[6].charAt(12) != strArr[4].charAt(12)) {
                            A02[7] = "bCR9WkA6eyEV4h8trRpw719hZYlamBiM";
                            return alignment;
                        }
                        A02[5] = "enxKCq4Pqw8aEUUsiy7ukDSLGbRSz6QP";
                        return alignment;
                    case 2:
                    case 3:
                        return android.text.Layout.Alignment.ALIGN_CENTER;
                    case 4:
                    case 5:
                        return android.text.Layout.Alignment.ALIGN_OPPOSITE;
                    default:
                        android.util.Log.w(A03(141, 15, 92), A03(18, 25, 56) + str);
                        return null;
                }
            case 108511772:
                java.lang.String[] strArr3 = A02;
                if (strArr3[1].length() != strArr3[2].length()) {
                    java.lang.String[] strArr4 = A02;
                    strArr4[1] = "OGE6p5hpKBtmmL4TatKRm53Fks";
                    strArr4[2] = "qQEY3lTQZErqF7rGXeP5Tr8yA96t3tim";
                    if (str.equals(A03(272, 5, 49))) {
                        b = 5;
                    } else {
                        b = -1;
                    }
                    switch (b) {
                        case 0:
                        case 1:
                            alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
                            strArr = A02;
                            if (strArr[6].charAt(12) != strArr[4].charAt(12)) {
                                A02[7] = "bCR9WkA6eyEV4h8trRpw719hZYlamBiM";
                                return alignment;
                            }
                            A02[5] = "enxKCq4Pqw8aEUUsiy7ukDSLGbRSz6QP";
                            return alignment;
                        case 2:
                        case 3:
                            return android.text.Layout.Alignment.ALIGN_CENTER;
                        case 4:
                        case 5:
                            return android.text.Layout.Alignment.ALIGN_OPPOSITE;
                        default:
                            android.util.Log.w(A03(141, 15, 92), A03(18, 25, 56) + str);
                            return null;
                    }
                }
                throw new java.lang.RuntimeException();
            case 109757538:
                if (str.equals(A03(281, 5, 2))) {
                    b = 0;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                        alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
                        strArr = A02;
                        if (strArr[6].charAt(12) != strArr[4].charAt(12)) {
                            A02[7] = "bCR9WkA6eyEV4h8trRpw719hZYlamBiM";
                            return alignment;
                        }
                        A02[5] = "enxKCq4Pqw8aEUUsiy7ukDSLGbRSz6QP";
                        return alignment;
                    case 2:
                    case 3:
                        return android.text.Layout.Alignment.ALIGN_CENTER;
                    case 4:
                    case 5:
                        return android.text.Layout.Alignment.ALIGN_OPPOSITE;
                    default:
                        android.util.Log.w(A03(141, 15, 92), A03(18, 25, 56) + str);
                        return null;
                }
            default:
                b = -1;
                switch (b) {
                    case 0:
                    case 1:
                        alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
                        strArr = A02;
                        if (strArr[6].charAt(12) != strArr[4].charAt(12)) {
                            A02[7] = "bCR9WkA6eyEV4h8trRpw719hZYlamBiM";
                            return alignment;
                        }
                        A02[5] = "enxKCq4Pqw8aEUUsiy7ukDSLGbRSz6QP";
                        return alignment;
                    case 2:
                    case 3:
                        return android.text.Layout.Alignment.ALIGN_CENTER;
                    case 4:
                    case 5:
                        return android.text.Layout.Alignment.ALIGN_OPPOSITE;
                    default:
                        android.util.Log.w(A03(141, 15, 92), A03(18, 25, 56) + str);
                        return null;
                }
        }
    }

    public static java.lang.String A04(java.lang.String str) {
        java.lang.String strTrim = str.trim();
        if (!strTrim.isEmpty()) {
            return com.facebook.ads.redexgen.core.IK.A0m(strTrim, A03(156, 5, 79))[0];
        }
        java.lang.String[] strArr = A02;
        if (strArr[1].length() == strArr[2].length()) {
            throw new java.lang.RuntimeException();
        }
        A02[5] = "42liCGy7Kchgdz7EhWQaYXlXohgkwLqz";
        return null;
    }

    public static void A06(android.text.SpannableStringBuilder spannableStringBuilder, com.facebook.ads.redexgen.core.GR gr, int i, int i2) {
        if (gr == null) {
            return;
        }
        int iA08 = gr.A08();
        if (A02[5].charAt(4) != 'C') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A02;
        strArr[6] = "VsLQDcA6s0fbGy4oRFjLDoSCdNYz0JtP";
        strArr[4] = "T1bcli7rjR90dcoQEJFyzT2kGGWOMofL";
        if (iA08 != -1) {
            spannableStringBuilder.setSpan(new android.text.style.StyleSpan(gr.A08()), i, i2, 33);
        }
        if (gr.A0O()) {
            spannableStringBuilder.setSpan(new android.text.style.StrikethroughSpan(), i, i2, 33);
        }
        if (gr.A0P()) {
            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i, i2, 33);
        }
        if (gr.A0N()) {
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(gr.A06()), i, i2, 33);
        }
        if (gr.A0M()) {
            spannableStringBuilder.setSpan(new android.text.style.BackgroundColorSpan(gr.A05()), i, i2, 33);
        }
        if (gr.A0H() != null) {
            spannableStringBuilder.setSpan(new android.text.style.TypefaceSpan(gr.A0H()), i, i2, 33);
        }
        if (gr.A0A() != null) {
            spannableStringBuilder.setSpan(new android.text.style.AlignmentSpan.Standard(gr.A0A()), i, i2, 33);
        }
        switch (gr.A07()) {
            case 1:
                spannableStringBuilder.setSpan(new android.text.style.AbsoluteSizeSpan((int) gr.A04(), true), i, i2, 33);
                return;
            case 2:
                spannableStringBuilder.setSpan(new android.text.style.RelativeSizeSpan(gr.A04()), i, i2, 33);
                return;
            case 3:
                spannableStringBuilder.setSpan(new android.text.style.RelativeSizeSpan(gr.A04() / 100.0f), i, i2, 33);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public static void A07(java.lang.String str, android.text.SpannableStringBuilder spannableStringBuilder) {
        byte b;
        switch (str.hashCode()) {
            case 3309:
                if (!str.equals(A03(com.ironsource.g3.c.b.g, 2, 47))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 3464:
                if (!str.equals(A03(252, 2, 32))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 96708:
                if (!str.equals(A03(192, 3, 69))) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 3374865:
                if (!str.equals(A03(260, 4, 0))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                spannableStringBuilder.append(kotlin.text.Typography.less);
                break;
            case 1:
                spannableStringBuilder.append(kotlin.text.Typography.greater);
                break;
            case 2:
                spannableStringBuilder.append(' ');
                break;
            case 3:
                spannableStringBuilder.append(kotlin.text.Typography.amp);
                break;
            default:
                android.util.Log.w(A03(141, 15, 92), A03(209, 31, 114) + str + A03(16, 2, 74));
                break;
        }
    }

    public static void A08(java.lang.String str, com.facebook.ads.redexgen.core.GT gt) {
        java.lang.String name = A03(141, 15, 92);
        java.util.regex.Matcher matcher = A04.matcher(str);
        while (matcher.find()) {
            java.lang.String strGroup = matcher.group(1);
            java.lang.String strGroup2 = matcher.group(2);
            try {
                if (A03(248, 4, 122).equals(strGroup)) {
                    A09(strGroup2, gt);
                } else if (A03(org.objectweb.asm.Opcodes.NEW, 5, 71).equals(strGroup)) {
                    gt.A0B(A02(strGroup2));
                } else if (A03(264, 8, 110).equals(strGroup)) {
                    A0A(strGroup2, gt);
                } else if (A03(277, 4, 106).equals(strGroup)) {
                    gt.A05(com.facebook.ads.redexgen.core.GX.A00(strGroup2));
                } else {
                    android.util.Log.w(name, A03(121, 20, 12) + strGroup + A03(15, 1, 19) + strGroup2);
                }
            } catch (java.lang.NumberFormatException unused) {
                android.util.Log.w(name, A03(65, 26, 106) + matcher.group());
            }
        }
    }

    public static void A09(java.lang.String str, com.facebook.ads.redexgen.core.GT gt) throws java.lang.NumberFormatException {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            gt.A06(A00(str.substring(iIndexOf + 1)));
            str = str.substring(0, iIndexOf);
        } else {
            gt.A06(Integer.MIN_VALUE);
        }
        if (str.endsWith(A03(2, 1, 24))) {
            gt.A03(com.facebook.ads.redexgen.core.GX.A00(str)).A07(0);
            return;
        }
        int commaIndex = java.lang.Integer.parseInt(str);
        if (commaIndex < 0) {
            commaIndex--;
        }
        gt.A03(commaIndex).A07(1);
    }

    public static void A0A(java.lang.String str, com.facebook.ads.redexgen.core.GT gt) throws java.lang.NumberFormatException {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            int commaIndex = iIndexOf + 1;
            gt.A08(A00(str.substring(commaIndex)));
            str = str.substring(0, iIndexOf);
        } else {
            gt.A08(Integer.MIN_VALUE);
        }
        gt.A04(com.facebook.ads.redexgen.core.GX.A00(str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cf A[LOOP:0: B:35:0x00cd->B:36:0x00cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:4:0x0011  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017 A[RETURN] */
    public static void A0B(java.lang.String str, com.facebook.ads.redexgen.core.GU gu, android.text.SpannableStringBuilder spannableStringBuilder, java.util.List<com.facebook.ads.redexgen.core.GR> list, java.util.List<com.facebook.ads.redexgen.core.GV> list2) {
        int start;
        int styleMatchesCount;
        int end;
        int i = gu.A00;
        int i2 = spannableStringBuilder.length();
        java.lang.String str2 = gu.A01;
        int start2 = str2.hashCode();
        switch (start2) {
            case 0:
                if (str2.equals(A03(0, 0, 62))) {
                    start = 6;
                } else {
                    start = -1;
                }
                switch (start) {
                    case 0:
                        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), i, i2, 33);
                        break;
                    case 1:
                        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i, i2, 33);
                        break;
                    case 2:
                        spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i, i2, 33);
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    default:
                        return;
                }
                list2.clear();
                A0D(list, str, gu, list2);
                styleMatchesCount = list2.size();
                for (end = 0; end < styleMatchesCount; end++) {
                    A06(spannableStringBuilder, list2.get(end).A01, i, i2);
                }
                return;
            case 98:
                if (str2.equals(A03(org.objectweb.asm.Opcodes.MONITOREXIT, 1, 125))) {
                    start = 0;
                } else {
                    start = -1;
                }
                switch (start) {
                    case 0:
                        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), i, i2, 33);
                        break;
                    case 1:
                        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i, i2, 33);
                        break;
                    case 2:
                        spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i, i2, 33);
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    default:
                        return;
                }
                list2.clear();
                A0D(list, str, gu, list2);
                styleMatchesCount = list2.size();
                while (end < styleMatchesCount) {
                    A06(spannableStringBuilder, list2.get(end).A01, i, i2);
                }
                return;
            case 99:
                if (str2.equals(A03(196, 1, 90))) {
                    start = 3;
                } else {
                    start = -1;
                }
                switch (start) {
                    case 0:
                        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), i, i2, 33);
                        break;
                    case 1:
                        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i, i2, 33);
                        break;
                    case 2:
                        spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i, i2, 33);
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    default:
                        return;
                }
                list2.clear();
                A0D(list, str, gu, list2);
                styleMatchesCount = list2.size();
                while (end < styleMatchesCount) {
                    A06(spannableStringBuilder, list2.get(end).A01, i, i2);
                }
                return;
            case 105:
                java.lang.String[] strArr = A02;
                java.lang.String str3 = strArr[1];
                java.lang.String str4 = strArr[2];
                int end2 = str3.length();
                int start3 = str4.length();
                if (end2 == start3) {
                    throw new java.lang.RuntimeException();
                }
                A02[7] = "bxBhnpp4r3F9KkdBNWptBBHUc7fuMdsj";
                if (str2.equals(A03(208, 1, 76))) {
                    start = 1;
                } else {
                    start = -1;
                }
                switch (start) {
                    case 0:
                        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), i, i2, 33);
                        break;
                    case 1:
                        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i, i2, 33);
                        break;
                    case 2:
                        spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i, i2, 33);
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    default:
                        return;
                }
                list2.clear();
                A0D(list, str, gu, list2);
                styleMatchesCount = list2.size();
                while (end < styleMatchesCount) {
                    A06(spannableStringBuilder, list2.get(end).A01, i, i2);
                }
                return;
            case 117:
                if (str2.equals(A03(286, 1, 72))) {
                    start = 2;
                } else {
                    start = -1;
                }
                switch (start) {
                    case 0:
                        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), i, i2, 33);
                        break;
                    case 1:
                        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i, i2, 33);
                        break;
                    case 2:
                        spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i, i2, 33);
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    default:
                        return;
                }
                list2.clear();
                A0D(list, str, gu, list2);
                styleMatchesCount = list2.size();
                while (end < styleMatchesCount) {
                    A06(spannableStringBuilder, list2.get(end).A01, i, i2);
                }
                return;
            case 118:
                if (str2.equals(A03(287, 1, 7))) {
                    start = 5;
                } else {
                    start = -1;
                }
                switch (start) {
                    case 0:
                        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), i, i2, 33);
                        break;
                    case 1:
                        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i, i2, 33);
                        break;
                    case 2:
                        spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i, i2, 33);
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    default:
                        return;
                }
                list2.clear();
                A0D(list, str, gu, list2);
                styleMatchesCount = list2.size();
                while (end < styleMatchesCount) {
                    A06(spannableStringBuilder, list2.get(end).A01, i, i2);
                }
                return;
            case 3314158:
                if (str2.equals(A03(androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK, 4, 41))) {
                    start = 4;
                } else {
                    start = -1;
                }
                switch (start) {
                    case 0:
                        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), i, i2, 33);
                        break;
                    case 1:
                        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i, i2, 33);
                        break;
                    case 2:
                        spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i, i2, 33);
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    default:
                        return;
                }
                list2.clear();
                A0D(list, str, gu, list2);
                styleMatchesCount = list2.size();
                while (end < styleMatchesCount) {
                    A06(spannableStringBuilder, list2.get(end).A01, i, i2);
                }
                return;
            default:
                start = -1;
                switch (start) {
                    case 0:
                        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), i, i2, 33);
                        break;
                    case 1:
                        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i, i2, 33);
                        break;
                    case 2:
                        spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i, i2, 33);
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    default:
                        return;
                }
                list2.clear();
                A0D(list, str, gu, list2);
                styleMatchesCount = list2.size();
                while (end < styleMatchesCount) {
                    A06(spannableStringBuilder, list2.get(end).A01, i, i2);
                }
                return;
        }
    }

    public static void A0C(java.lang.String str, java.lang.String str2, com.facebook.ads.redexgen.core.GT gt, java.util.List<com.facebook.ads.redexgen.core.GR> list) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iA01 = 0;
        while (iA01 < str2.length()) {
            char cCharAt = str2.charAt(iA01);
            switch (cCharAt) {
                case '&':
                    int spaceEndIndex = str2.indexOf(59, iA01 + 1);
                    int iIndexOf = str2.indexOf(32, iA01 + 1);
                    if (spaceEndIndex == -1) {
                        spaceEndIndex = iIndexOf;
                    } else if (iIndexOf != -1) {
                        spaceEndIndex = java.lang.Math.min(spaceEndIndex, iIndexOf);
                    }
                    if (spaceEndIndex != -1) {
                        A07(str2.substring(iA01 + 1, spaceEndIndex), spannableStringBuilder);
                        if (spaceEndIndex == iIndexOf) {
                            spannableStringBuilder.append((java.lang.CharSequence) A03(1, 1, 91));
                        }
                        iA01 = spaceEndIndex + 1;
                    } else {
                        spannableStringBuilder.append(cCharAt);
                        iA01++;
                    }
                    break;
                case '<':
                    if (iA01 + 1 >= str2.length()) {
                        iA01++;
                    } else {
                        int i = iA01;
                        boolean z = str2.charAt(i + 1) == '/';
                        iA01 = A01(str2, i + 1);
                        boolean z2 = str2.charAt(iA01 + (-2)) == '/';
                        java.lang.String fullTagExpression = str2.substring((z ? 2 : 1) + i, z2 ? iA01 - 2 : iA01 - 1);
                        java.lang.String strA04 = A04(fullTagExpression);
                        if (strA04 == null) {
                            continue;
                        } else {
                            boolean zA0E = A0E(strA04);
                            if (A02[7].charAt(0) != 'b') {
                                throw new java.lang.RuntimeException();
                            }
                            A02[5] = "hEv4CEbT3Ty4Wl9Tcg95bymjL25J8k7D";
                            if (zA0E) {
                                if (z) {
                                    while (!arrayDeque.isEmpty()) {
                                        com.facebook.ads.redexgen.core.GU gu = (com.facebook.ads.redexgen.core.GU) arrayDeque.pop();
                                        A0B(str, gu, spannableStringBuilder, list, arrayList);
                                        if (gu.A01.equals(strA04)) {
                                        }
                                        break;
                                    }
                                } else if (!z2) {
                                    arrayDeque.push(com.facebook.ads.redexgen.core.GU.A01(fullTagExpression, spannableStringBuilder.length()));
                                }
                            }
                        }
                    }
                    break;
                default:
                    spannableStringBuilder.append(cCharAt);
                    iA01++;
                    break;
            }
        }
        while (!arrayDeque.isEmpty()) {
            A0B(str, (com.facebook.ads.redexgen.core.GU) arrayDeque.pop(), spannableStringBuilder, list, arrayList);
        }
        A0B(str, com.facebook.ads.redexgen.core.GU.A00(), spannableStringBuilder, list, arrayList);
        gt.A0C(spannableStringBuilder);
    }

    public static void A0D(java.util.List<com.facebook.ads.redexgen.core.GR> list, java.lang.String str, com.facebook.ads.redexgen.core.GU gu, java.util.List<com.facebook.ads.redexgen.core.GV> list2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            com.facebook.ads.redexgen.core.GR gr = list.get(i);
            int i2 = gr.A09(str, gu.A01, gu.A03, gu.A02);
            if (i2 > 0) {
                list2.add(new com.facebook.ads.redexgen.core.GV(i2, gr));
            }
        }
        java.util.Collections.sort(list2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x00a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:4:0x0009  */
    /* JADX WARN: Code duplicated, block: B:6:0x000d A[RETURN] */
    public static boolean A0E(java.lang.String str) {
        byte b;
        switch (str.hashCode()) {
            case 98:
                if (str.equals(A03(org.objectweb.asm.Opcodes.MONITOREXIT, 1, 125))) {
                    b = 0;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return true;
                    default:
                        return false;
                }
            case 99:
                if (str.equals(A03(196, 1, 90))) {
                    b = 1;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return true;
                    default:
                        return false;
                }
            case 105:
                if (str.equals(A03(208, 1, 76))) {
                    b = 2;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return true;
                    default:
                        return false;
                }
            case 117:
                if (A02[0].length() != 11) {
                    A02[0] = "TB71hBx7ht8z";
                    if (str.equals(A03(286, 1, 72))) {
                        b = 4;
                    } else {
                        b = -1;
                    }
                    switch (b) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            return true;
                        default:
                            return false;
                    }
                }
                throw new java.lang.RuntimeException();
            case 118:
                if (str.equals(A03(287, 1, 7))) {
                    b = 5;
                } else {
                    b = -1;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return true;
                    default:
                        return false;
                }
            case 3314158:
                if (A02[3].charAt(28) != '7') {
                    java.lang.String[] strArr = A02;
                    strArr[1] = "3MdATCvstDHTUNUzCjQVNt1ukZ";
                    strArr[2] = "71LSpmQiAj9rYHqnoAGWnfkbV1NfksJ2";
                    if (str.equals(A03(androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK, 4, 41))) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                    switch (b) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            return true;
                        default:
                            return false;
                    }
                }
                throw new java.lang.RuntimeException();
            default:
                b = -1;
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public static boolean A0F(java.lang.String str, java.util.regex.Matcher matcher, com.facebook.ads.redexgen.core.I4 i4, com.facebook.ads.redexgen.core.GT gt, java.lang.StringBuilder sb, java.util.List<com.facebook.ads.redexgen.core.GR> list) {
        try {
            gt.A0A(com.facebook.ads.redexgen.core.GX.A01(matcher.group(1))).A09(com.facebook.ads.redexgen.core.GX.A01(matcher.group(2)));
            A08(matcher.group(3), gt);
            sb.setLength(0);
            while (true) {
                java.lang.String strA0P = i4.A0P();
                if (!android.text.TextUtils.isEmpty(strA0P)) {
                    int length = sb.length();
                    if (A02[0].length() == 11) {
                        throw new java.lang.RuntimeException();
                    }
                    A02[0] = "L6eB6jb6lgXv7JHHOjxuHI";
                    if (length > 0) {
                        sb.append(A03(0, 1, 26));
                    }
                    sb.append(strA0P.trim());
                } else {
                    A0C(str, sb.toString(), gt, list);
                    return true;
                }
            }
        } catch (java.lang.NumberFormatException unused) {
            android.util.Log.w(A03(141, 15, 92), A03(91, 30, 36) + matcher.group());
            return false;
        }
    }
}
