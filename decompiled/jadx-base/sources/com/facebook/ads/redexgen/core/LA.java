package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class LA {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"NoYeCqw0NuwsBVSvR8aiyPnoj7", "APA6ODPEmALJh8xHCjcwQdd6vsoZzjc", "og2YXunKDp8EqsbnYhzdu6qR", "YLuKSEsrRIdzXIjkloLmDmBrtZDR6KFi", "8qSAHAaIpnwwIsCvL7AfoFTJYv1h46H2", "PXVMr", "05SrQOor", "5yYP5"};
    public static final java.util.Map<com.facebook.ads.redexgen.core.EnumC0781Jj, com.facebook.ads.redexgen.core.EnumC0783Jl> A02;

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 18);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{104, 74, 69, 12, 95, 11, 72, 89, 78, 74, 95, 78, 11, 106, 79, 120, 66, 81, 78, 11, 94, 88, 66, 69, 76, 11, 95, 67, 66, 88, 11, 92, 66, 79, 95, 67, 11, 74, 69, 79, 11, 67, 78, 66, 76, 67, 95, 5, 50, 9, 12, 9, 8, 16, 9, 71, 38, 3, 52, 14, 29, 2, 71, 19, 30, 23, 2, 73};
    }

    static {
        A07();
        A02 = new java.util.HashMap();
        A02.put(com.facebook.ads.redexgen.core.EnumC0781Jj.A09, com.facebook.ads.redexgen.core.EnumC0783Jl.A0D);
        A02.put(com.facebook.ads.redexgen.core.EnumC0781Jj.A07, com.facebook.ads.redexgen.core.EnumC0783Jl.A0F);
        A02.put(com.facebook.ads.redexgen.core.EnumC0781Jj.A06, com.facebook.ads.redexgen.core.EnumC0783Jl.A0E);
    }

    public static com.facebook.ads.AdSize A00(com.facebook.ads.redexgen.core.EnumC0781Jj enumC0781Jj) {
        return com.facebook.ads.AdSize.fromWidthAndHeight(enumC0781Jj.A04(), enumC0781Jj.A03());
    }

    public static com.facebook.ads.AdSize A01(com.facebook.ads.redexgen.core.EnumC0783Jl enumC0783Jl) {
        for (java.util.Map.Entry<com.facebook.ads.redexgen.core.EnumC0781Jj, com.facebook.ads.redexgen.core.EnumC0783Jl> entry : A02.entrySet()) {
            if (entry.getValue() == enumC0783Jl) {
                com.facebook.ads.redexgen.core.EnumC0781Jj key = entry.getKey();
                if (A01[3].charAt(31) == 'z') {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A01;
                strArr[5] = "vUJqh";
                strArr[7] = "m1G2X";
                return A00(key);
            }
        }
        return com.facebook.ads.AdSize.BANNER_320_50;
    }

    public static com.facebook.ads.redexgen.core.EnumC0781Jj A02(int i) {
        switch (i) {
            case 4:
                return com.facebook.ads.redexgen.core.EnumC0781Jj.A05;
            case 5:
                return com.facebook.ads.redexgen.core.EnumC0781Jj.A06;
            case 6:
                return com.facebook.ads.redexgen.core.EnumC0781Jj.A07;
            case 7:
                return com.facebook.ads.redexgen.core.EnumC0781Jj.A09;
            case 100:
                return com.facebook.ads.redexgen.core.EnumC0781Jj.A08;
            default:
                throw new java.lang.IllegalArgumentException(A06(48, 20, 117));
        }
    }

    public static com.facebook.ads.redexgen.core.EnumC0781Jj A03(int i, int i2) {
        if (com.facebook.ads.redexgen.core.EnumC0781Jj.A08.A03() == i2 && com.facebook.ads.redexgen.core.EnumC0781Jj.A08.A04() == i) {
            return com.facebook.ads.redexgen.core.EnumC0781Jj.A08;
        }
        if (com.facebook.ads.redexgen.core.EnumC0781Jj.A05.A03() == i2) {
            int iA04 = com.facebook.ads.redexgen.core.EnumC0781Jj.A05.A04();
            java.lang.String[] strArr = A01;
            if (strArr[5].length() != strArr[7].length()) {
                throw new java.lang.RuntimeException();
            }
            A01[3] = "mZi1y4qoTe3Eq90wST2K5ufjmqQARasa";
            if (iA04 == i) {
                return com.facebook.ads.redexgen.core.EnumC0781Jj.A05;
            }
        }
        if (com.facebook.ads.redexgen.core.EnumC0781Jj.A06.A03() == i2 && com.facebook.ads.redexgen.core.EnumC0781Jj.A06.A04() == i) {
            return com.facebook.ads.redexgen.core.EnumC0781Jj.A06;
        }
        if (com.facebook.ads.redexgen.core.EnumC0781Jj.A07.A03() == i2 && com.facebook.ads.redexgen.core.EnumC0781Jj.A07.A04() == i) {
            return com.facebook.ads.redexgen.core.EnumC0781Jj.A07;
        }
        if (com.facebook.ads.redexgen.core.EnumC0781Jj.A09.A03() == i2) {
            com.facebook.ads.redexgen.core.EnumC0781Jj enumC0781Jj = com.facebook.ads.redexgen.core.EnumC0781Jj.A09;
            java.lang.String[] strArr2 = A01;
            if (strArr2[6].length() == strArr2[0].length()) {
                throw new java.lang.RuntimeException();
            }
            A01[3] = "Hv8n5Vk5MDnKIrkb6r8Yx0AFcMxyPOg2";
            if (enumC0781Jj.A04() == i) {
                return com.facebook.ads.redexgen.core.EnumC0781Jj.A09;
            }
        }
        throw new java.lang.IllegalArgumentException(A06(0, 48, 57));
    }

    public static com.facebook.ads.redexgen.core.EnumC0781Jj A04(com.facebook.ads.AdSize adSize) {
        return A03(adSize.getWidth(), adSize.getHeight());
    }

    public static com.facebook.ads.redexgen.core.EnumC0783Jl A05(com.facebook.ads.redexgen.core.EnumC0781Jj enumC0781Jj) {
        com.facebook.ads.redexgen.core.EnumC0783Jl adTemplate = A02.get(enumC0781Jj);
        if (adTemplate == null) {
            return com.facebook.ads.redexgen.core.EnumC0783Jl.A0G;
        }
        return adTemplate;
    }
}
