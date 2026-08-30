package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class K6 {
    public static byte[] A0C;
    public static java.lang.String[] A0D = {"u7auSF2QbA7keT455OtLfVATNnMuonV2", "9Ni6xyVwZaeKacoBimRjslH6Dei", "NGE2fLmKrMN6Gw2Fz9z7jAXvyfAydpGl", "srT3S5MN", "jMoNZ8Vk", "oZZQeSbHWWSZcPAQallJMC7N5h2", "GNfhbJ55AYf3nQ2lY9fIFOrmofPjrLRg", "qccEv4BxkjzqCatZiOtTgryF8DF84JXr"};
    public int A00;
    public com.facebook.ads.redexgen.core.C7j A01;
    public com.facebook.ads.redexgen.core.EnumC0783Jl A02;
    public com.facebook.ads.redexgen.core.C0826Lf A03;
    public java.lang.String A04;
    public java.lang.String A05;
    public java.lang.String A06;
    public java.lang.String A07;
    public boolean A08;
    public final com.facebook.ads.redexgen.core.InterfaceC05148d A09;
    public final com.facebook.ads.internal.protocol.AdPlacementType A0A;
    public final com.facebook.ads.redexgen.core.C0788Jq A0B;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 78);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A0C = new byte[]{-34, -95, -105, -102, -75, -101, -82, -90, -101, -88, -97, -101, -92, -103, -101, -75, -86, -81, -90, -101, -52, -49, -22, -35, -48, -37, -38, -35, -33, -44, -39, -46, -22, -50, -38, -39, -47, -44, -46, -22, -41, -52, -34, -33, -22, -32, -37, -49, -52, -33, -48, -22, -33, -44, -40, -48, 11, 18, 13, 40, 18, 13, -29, -22, -27, 0, -11, -22, -18, -26, 0, -11, -16, -20, -26, -17, -105, -96, -99, -103, -94, -88, -77, -90, -103, -91, -87, -103, -89, -88, -77, -99, -104, -109, -97, -96, -96, -111, -59, -58, -50, -48, -32, -62, -59, -32, -54, -59, -74, -55, -59, -61, -78, -48, -71, -70, -65, -59, -60, -9, -12, -8, -10, -9, 3, -74, -79, -77, -82, -54, -59, -57, -62, -32, -57, -51, -62, -56, -92, -82, -70, -88, -80, -89, -81, -92, -70, -100, -97, -70, -96, -77, -85, -96, -83, -92, -96, -87, -98, -96, 4, 0, 24, 11, -2, 12, 13, 11, 2, -4, 13, -2, -3, -34, -45, -27, -26, -15, -27, -45, -24, -41, -42, -15, -34, -31, -43, -45, -34, -41, -28, -21, -29, -11, -41, -38, -23, -11, -24, -37, -25, -21, -37, -23, -22, -37, -38, -77, -81, -92, -90, -88, -80, -88, -79, -73, -62, -84, -89, -50, -54, -65, -63, -61, -53, -61, -52, -46, -35, -46, -41, -50, -61, 21, 8, 20, 24, 8, 22, 23, 34, 23, 12, 16, 8, -4, -3, -22, -20, -12, 8, -3, -5, -22, -20, -18, -7, -22, -14, -11, -15, -26, -7, -22, 4, -18, -23, -58, -73, -59, -58, -47, -65, -63, -74, -73, -13, -27, -32, -16, -28};
    }

    static {
        A02();
    }

    public K6(com.facebook.ads.redexgen.core.C7j c7j, java.lang.String str, com.facebook.ads.redexgen.core.C0826Lf c0826Lf, com.facebook.ads.redexgen.core.EnumC0783Jl enumC0783Jl, int i, com.facebook.ads.redexgen.core.C0788Jq c0788Jq, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.facebook.ads.redexgen.core.InterfaceC05148d interfaceC05148d) {
        this.A01 = c7j;
        this.A06 = str;
        this.A03 = c0826Lf;
        this.A02 = enumC0783Jl;
        this.A00 = i;
        this.A0B = c0788Jq;
        this.A0A = enumC0783Jl.A05(this.A01);
        this.A07 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A09 = interfaceC05148d;
    }

    private long A00() {
        android.content.SharedPreferences sharedPreferencesA00 = com.facebook.ads.redexgen.core.KJ.A00(this.A01);
        java.lang.String strA01 = A01(0, 0, 79);
        java.lang.String strA02 = A01(org.objectweb.asm.Opcodes.LRETURN, 17, 68);
        java.lang.String lastSavedLocale = sharedPreferencesA00.getString(strA02, strA01);
        if (lastSavedLocale == null) {
            return 0L;
        }
        if (lastSavedLocale.equals(java.util.Locale.getDefault().toString())) {
            return com.facebook.ads.redexgen.core.C2T.A00(this.A01.A01()).A09();
        }
        sharedPreferencesA00.edit().putString(strA02, java.util.Locale.getDefault().toString()).apply();
        return 0L;
    }

    private void A03(java.util.Map<java.lang.String, java.lang.String> params, java.lang.String str, java.lang.String str2) {
        params.put(str, str2);
    }

    public final int A04() {
        return this.A00;
    }

    public final com.facebook.ads.redexgen.core.InterfaceC05148d A05() {
        return this.A09;
    }

    public final com.facebook.ads.internal.protocol.AdPlacementType A06() {
        return this.A0A;
    }

    public final com.facebook.ads.redexgen.core.EnumC0783Jl A07() {
        return this.A02;
    }

    public final com.facebook.ads.redexgen.core.C0826Lf A08() {
        return this.A03;
    }

    public final java.lang.String A09() {
        return this.A06;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0157  */
    /* JADX WARN: Code duplicated, block: B:36:0x0197  */
    public final java.util.Map<java.lang.String, java.lang.String> A0A(java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String strA01;
        java.util.HashMap map2 = new java.util.HashMap(map);
        A03(map2, A01(125, 4, 31), com.facebook.ads.redexgen.core.C6H.A00().A03());
        if (com.facebook.ads.redexgen.core.C6H.A00().A04()) {
            strA01 = A01(0, 1, 96);
        } else {
            strA01 = A01(1, 1, 34);
        }
        A03(map2, A01(129, 9, 51), strA01);
        A03(map2, A01(93, 5, 2), java.lang.String.valueOf(this.A09.A9Y()));
        java.lang.String idfaFlag = A01(207, 12, 21);
        A03(map2, idfaFlag, this.A06);
        if (this.A0A != com.facebook.ads.internal.protocol.AdPlacementType.UNKNOWN) {
            A03(map2, A01(219, 14, 48), this.A0A.toString().toLowerCase());
        }
        if (this.A03 != null) {
            A03(map2, A01(276, 5, 78), java.lang.String.valueOf(this.A03.A01()));
            A03(map2, A01(119, 6, 97), java.lang.String.valueOf(this.A03.A00()));
        }
        com.facebook.ads.redexgen.core.EnumC0783Jl enumC0783Jl = this.A02;
        java.lang.String[] strArr = A0D;
        java.lang.String idfaFlag2 = strArr[3];
        if (idfaFlag2.length() == strArr[4].length()) {
            java.lang.String[] strArr2 = A0D;
            strArr2[1] = "MtgCRt6raT7lLAmxmnhZWRhCoK6";
            strArr2[5] = "TefOAifnH3N8w6fQm3K3ucYxLzr";
            if (enumC0783Jl != null) {
                java.lang.String strValueOf = java.lang.String.valueOf(this.A02.A04());
                java.lang.String[] strArr3 = A0D;
                java.lang.String idfaFlag3 = strArr3[1];
                if (idfaFlag3.length() == strArr3[5].length()) {
                    java.lang.String[] strArr4 = A0D;
                    strArr4[2] = "oEScE6GwBx0T7gd10O4WpCDAWbiGO08C";
                    strArr4[6] = "F3x5JK4fAwlkZj0maRZJGdAXlKAKJxnY";
                    A03(map2, A01(256, 11, 87), strValueOf);
                }
            }
            if (this.A09.isTestMode(this.A01)) {
                A03(map2, A01(267, 9, 36), A01(1, 1, 34));
            }
            com.facebook.ads.redexgen.core.InterfaceC05148d interfaceC05148d = this.A09;
            java.lang.String[] strArr5 = A0D;
            if (strArr5[2].charAt(1) != strArr5[6].charAt(1)) {
                java.lang.String[] strArr6 = A0D;
                strArr6[1] = "P1GrzNsZRgJooEVm5vEQxHxZ4Z0";
                strArr6[5] = "F8cEJY3nZiqqQFAmyopMZkDj7B2";
                if (interfaceC05148d.A8V() != null) {
                    A03(map2, A01(98, 10, 51), this.A09.A8V());
                }
            } else if (interfaceC05148d.A8V() != null) {
                A03(map2, A01(98, 10, 51), this.A09.A8V());
            }
            if (this.A00 != 0) {
                A03(map2, A01(org.objectweb.asm.Opcodes.ARRAYLENGTH, 17, 72), java.lang.String.valueOf(this.A00));
            }
            boolean z = this.A08;
            java.lang.String[] strArr7 = A0D;
            if (strArr7[1].length() == strArr7[5].length()) {
                java.lang.String[] strArr8 = A0D;
                strArr8[2] = "uWxLBVxijt65dRlk9T2Hn2WYlcbw5EIA";
                strArr8[6] = "gJEIMXTCWTN9wPxeCuHJDhMtmXZzR3hI";
                if (z) {
                    A03(map2, A01(138, 22, 13), java.lang.String.valueOf(this.A08));
                }
            } else if (z) {
                A03(map2, A01(138, 22, 13), java.lang.String.valueOf(this.A08));
            }
            A03(map2, A01(org.objectweb.asm.Opcodes.IF_ICMPNE, 13, 107), java.lang.String.valueOf(com.facebook.ads.redexgen.core.M4.A02(this.A01)));
            A03(map2, A01(233, 12, 117), com.facebook.ads.redexgen.core.C0841Lu.A05(java.lang.System.currentTimeMillis()));
            if (this.A0B.A06() && this.A0B.A04() != null) {
                A03(map2, A01(56, 6, 123), this.A0B.A04());
            }
            java.lang.String strA05 = this.A0B.A05();
            if (!android.text.TextUtils.isEmpty(strA05)) {
                A03(map2, A01(62, 14, 83), strA05);
            }
            if (this.A07 != null) {
                A03(map2, A01(245, 11, 91), this.A07);
            }
            A03(map2, A01(76, 17, 6), java.util.UUID.randomUUID().toString());
            java.lang.String strA06 = com.facebook.ads.redexgen.core.C0841Lu.A06(A00());
            java.lang.String[] strArr9 = A0D;
            if (strArr9[3].length() != strArr9[4].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr10 = A0D;
            strArr10[2] = "NkXVy20xQPZxPDFffPbPKKxnGzq6Q1tn";
            strArr10[6] = "9D5jR9gI4cGNuuYNFYJ1hn06wNsfKLn7";
            A03(map2, A01(20, 36, 61), strA06);
            if (this.A05 != null) {
                A03(map2, A01(108, 11, 35), this.A05);
            }
            if (this.A04 != null) {
                A03(map2, A01(2, 18, 8), this.A04);
            }
            return map2;
        }
        throw new java.lang.RuntimeException();
    }
}
