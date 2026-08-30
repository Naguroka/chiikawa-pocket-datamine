package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class GI {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"FufaAEcqYi1G7tiijYXUMT1veLHgs7nM", "iBdN4E7Slakzgwn7FAnIqO8NtqRonFIN", "cJ", "z4EdrUWrkzDfAPCtqZZYbP8SuccPnYZi", "8CSpdghdkgfGizDgmfFGVsRmRhkb", "CNVa6zzE1fySGY8Zp9tznCkCxd92", "W5FsCsCjtAZQtW2uBDEVk9oMyFLBYPtt", "48tj3wwOhdWyPbi2sJTO0tcPxvbWxPx7"};

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 35);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{85, 20, 19, 52, 96, 106, 74, 96, 106, 86, 45, 4, 81, 117, kotlin.io.encoding.Base64.padSymbol, 79, 1, 0, 80, 38};
    }

    static {
        A03();
    }

    public static com.facebook.ads.redexgen.core.GM A00(com.facebook.ads.redexgen.core.GM gm, java.lang.String[] strArr, java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.GM> map) {
        if (gm == null && strArr == null) {
            return null;
        }
        int i = 0;
        if (gm == null && strArr.length == 1) {
            return map.get(strArr[0]);
        }
        if (gm == null && strArr.length > 1) {
            com.facebook.ads.redexgen.core.GM gm2 = new com.facebook.ads.redexgen.core.GM();
            int length = strArr.length;
            while (i < length) {
                gm2.A0E(map.get(strArr[i]));
                i++;
            }
            return gm2;
        }
        if (gm != null && strArr != null && strArr.length == 1) {
            return gm.A0E(map.get(strArr[0]));
        }
        if (gm != null && strArr != null) {
            int length2 = strArr.length;
            java.lang.String[] strArr2 = A01;
            if (strArr2[1].charAt(22) != strArr2[3].charAt(22)) {
                throw new java.lang.RuntimeException();
            }
            A01[6] = "ngOgRnx5U34GWisnu9p9YQLiRsQ4UNda";
            if (length2 > 1) {
                int length3 = strArr.length;
                while (i < length3) {
                    gm.A0E(map.get(strArr[i]));
                    i++;
                }
                return gm;
            }
        }
        return gm;
    }

    public static java.lang.String A02(java.lang.String str) {
        java.lang.String strA01 = A01(1, 2, 58);
        java.lang.String strA02 = A01(0, 1, 124);
        java.lang.String strReplaceAll = str.replaceAll(strA01, strA02);
        java.lang.String out = A01(4, 5, 99);
        java.lang.String strReplaceAll2 = strReplaceAll.replaceAll(out, strA02);
        java.lang.String strA03 = A01(3, 1, 55);
        java.lang.String strReplaceAll3 = strReplaceAll2.replaceAll(strA02, strA03);
        java.lang.String out2 = A01(9, 11, 46);
        return strReplaceAll3.replaceAll(out2, strA03);
    }

    public static void A04(android.text.SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0) {
            char cCharAt = spannableStringBuilder.charAt(length);
            java.lang.String[] strArr = A01;
            java.lang.String str = strArr[4];
            java.lang.String str2 = strArr[5];
            int length2 = str.length();
            int position = str2.length();
            if (length2 == position) {
                A01[2] = "jH";
                if (cCharAt != ' ') {
                    break;
                } else {
                    length--;
                }
            } else {
                throw new java.lang.RuntimeException();
            }
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }

    public static void A05(android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, com.facebook.ads.redexgen.core.GM gm) {
        if (gm.A07() != -1) {
            spannableStringBuilder.setSpan(new android.text.style.StyleSpan(gm.A07()), i, i2, 33);
        }
        boolean zA0P = gm.A0P();
        java.lang.String[] strArr = A01;
        if (strArr[7].charAt(14) != strArr[0].charAt(14)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A01;
        strArr2[7] = "GiKke0o7duIHnZiFD13wbUhxGmBWK7Wf";
        strArr2[0] = "qc1VlaTFR3Amkvik8bEsaJqvap8peqhx";
        if (zA0P) {
            spannableStringBuilder.setSpan(new android.text.style.StrikethroughSpan(), i, i2, 33);
        }
        if (gm.A0Q()) {
            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i, i2, 33);
        }
        if (gm.A0O()) {
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(gm.A05()), i, i2, 33);
        }
        if (gm.A0N()) {
            spannableStringBuilder.setSpan(new android.text.style.BackgroundColorSpan(gm.A04()), i, i2, 33);
        }
        if (gm.A0L() != null) {
            spannableStringBuilder.setSpan(new android.text.style.TypefaceSpan(gm.A0L()), i, i2, 33);
        }
        if (gm.A08() != null) {
            spannableStringBuilder.setSpan(new android.text.style.AlignmentSpan.Standard(gm.A08()), i, i2, 33);
        }
        switch (gm.A06()) {
            case 1:
                spannableStringBuilder.setSpan(new android.text.style.AbsoluteSizeSpan((int) gm.A03(), true), i, i2, 33);
                return;
            case 2:
                spannableStringBuilder.setSpan(new android.text.style.RelativeSizeSpan(gm.A03()), i, i2, 33);
                return;
            case 3:
                spannableStringBuilder.setSpan(new android.text.style.RelativeSizeSpan(gm.A03() / 100.0f), i, i2, 33);
                return;
            default:
                return;
        }
    }
}
