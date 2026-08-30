package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05107x {
    public static java.util.regex.Pattern A04;
    public static byte[] A05;
    public static java.lang.String[] A06 = {"USoK2cfxb51ZJPCyGLsl1oEqVq4F5A", "B1ix", "MKuQHzHoWScniLIuJtRpdi1IJiBszR7E", "m0RxAiB9UHr66yFH4", "lCsnFXMtzGCTFRX1SzzVAUWLGsHIck98", "YGB3OCwtMa2btxklJ7dtSCpn0L9PAA", "mK9fNeoXOGHAzqgN16GdwH9jtGNP", "UNrKSlTWuiH4lc0MNDNSZyV"};
    public final java.lang.Integer A00;
    public final java.lang.Integer A01;
    public final java.lang.String A02;
    public final java.util.Set<java.lang.String> A03;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 61);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{-27, -70, -48, -102, -24, -94, -102, -39, -94, -102, -39, -46, 11, -43, 35, 13, -12, -13, -64, -13, -10, -59, -12, -11, -11, -61, -63, -64, -41, -46, -59, -64, -12, -4, -61, -63, -59, -64, -12, -4, -61, -63, -63, -41, -11, -73};
        if (A06[4].charAt(7) != 't') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A06;
        strArr[7] = "QwSmp19ijd8ERy9gz24h9M2";
        strArr[3] = "mhynLWVjgi3uuGun3";
    }

    static {
        A04();
    }

    public C05107x(java.util.Set<java.lang.String> options, java.lang.Integer num, java.lang.Integer num2, java.lang.String str) {
        this.A03 = options;
        this.A03.remove(null);
        this.A00 = num;
        this.A01 = num2;
        this.A02 = str;
    }

    public C05107x(java.lang.String[] strArr, java.lang.Integer num, java.lang.Integer num2) {
        strArr = strArr == null ? new java.lang.String[0] : strArr;
        this.A03 = new java.util.LinkedHashSet();
        this.A03.addAll(java.util.Arrays.asList(strArr));
        this.A03.remove(null);
        this.A00 = num;
        this.A01 = num2;
        this.A02 = A01();
    }

    public static com.facebook.ads.redexgen.core.C05107x A00(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.lang.Integer numValueOf = null;
        java.lang.Integer numValueOf2 = null;
        java.util.regex.Matcher matcher = A03().matcher(str);
        while (true) {
            boolean zFind = matcher.find();
            if (A06[1].length() != 4) {
                throw new java.lang.RuntimeException();
            }
            A06[6] = "sKn9BxXmA7RSSQCmWRu2pi7wmb7A";
            if (zFind) {
                linkedHashSet.add(matcher.group(1));
                java.lang.String strGroup = matcher.group(2);
                java.lang.String strGroup2 = matcher.group(3);
                if (strGroup != null && strGroup2 != null) {
                    numValueOf = java.lang.Integer.valueOf(java.lang.Integer.parseInt(strGroup));
                    numValueOf2 = java.lang.Integer.valueOf(java.lang.Integer.parseInt(strGroup2));
                }
            } else {
                return new com.facebook.ads.redexgen.core.C05107x(linkedHashSet, numValueOf, numValueOf2, str);
            }
        }
    }

    private java.lang.String A01() {
        java.lang.String strA02;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str : this.A03) {
            java.util.Locale locale = java.util.Locale.US;
            if (this.A00 != null && this.A01 != null) {
                strA02 = A02(2, 10, 56);
            } else {
                java.lang.String[] strArr = A06;
                if (strArr[7].length() == strArr[3].length()) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A06;
                strArr2[0] = "nnUUoBTpU2YPqXP8sfrJzmkBvRy05q";
                strArr2[5] = "LOR0jcP8uyvbiYDNETVTqINk0FH7KZ";
                strA02 = A02(12, 4, 115);
            }
            sb.append(java.lang.String.format(locale, strA02, str.toUpperCase(), this.A00, this.A01));
        }
        return sb.toString();
    }

    public static java.util.regex.Pattern A03() {
        java.util.regex.Pattern pattern = A04;
        java.lang.String[] strArr = A06;
        if (strArr[7].length() == strArr[3].length()) {
            throw new java.lang.RuntimeException();
        }
        A06[6] = "PeUiXyVqTpDx";
        if (pattern == null) {
            A04 = java.util.regex.Pattern.compile(A02(16, 29, 91));
        }
        return A04;
    }

    public final java.lang.Integer A05() {
        return this.A00;
    }

    public final java.lang.Integer A06() {
        return this.A01;
    }

    public final java.lang.String A07() {
        return this.A02;
    }

    public final java.lang.String A08() {
        java.util.Iterator<java.lang.String> it = this.A03.iterator();
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(A02(1, 1, 34));
        while (it.hasNext()) {
            sbAppend.append(it.next());
            if (it.hasNext()) {
                sbAppend.append(A02(0, 1, 124));
            }
        }
        sbAppend.append(A02(45, 1, 29));
        return sbAppend.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.facebook.ads.redexgen.core.C05107x)) {
            return false;
        }
        com.facebook.ads.redexgen.core.C05107x c05107x = (com.facebook.ads.redexgen.core.C05107x) obj;
        if (this.A00 == c05107x.A00 || (this.A00 != null && this.A00.equals(c05107x.A00))) {
            return (this.A01 == c05107x.A01 || (this.A01 != null && this.A01.equals(c05107x.A01))) && this.A03.equals(c05107x.A03);
        }
        return false;
    }

    public final int hashCode() {
        return (this.A03.hashCode() * org.objectweb.asm.Opcodes.LXOR) + ((this.A00 == null ? -1 : this.A00.intValue()) * org.objectweb.asm.Opcodes.L2F) + ((this.A01 != null ? this.A01.intValue() : -1) * 139);
    }
}
