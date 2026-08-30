package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5V, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C5V {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"MJXAzUwyiLvMzZCrP1QJf8uMs9b", "sHuNTXgsBnW3HGqskl7KH5QkikNWpABj", "q8u9vKEVkpk3dMxroB1EFzM5kwDKfJOq", "eyGwnlQBA4bCraIcft5FxvFgN7f8TC5N", "FmmRYKiwjJl3dX1FB2pV6kIWJpsNLC6h", "flBitaWG3wpDSjkerYNuTkR3r5UhRox3", "xkUQOvOGGj42jMnQjSDdoLzQvdQiYUba", "XqZ9VL6XKZ5Y"};
    public final android.content.Intent A00;
    public final com.facebook.ads.redexgen.core.C5Q A01;
    public final com.facebook.ads.redexgen.core.C1199Zs A02;
    public final com.facebook.ads.redexgen.core.J7 A03;

    public static java.lang.String A0K(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 59);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0L() {
        A04 = new byte[]{99, 127, 4, 1, 58, 1, 4, 17, 4, 58, 7, 16, 11, 1, 9, 0, 43, 41, 36, 36, 45, 58, 28, 49, 56, 45, 119, 124, 117, 125, 122, 113, 112, 85, 112, 80, 117, 96, 117, 86, 97, 122, 112, 120, 113, 35, 44, 41, 49, 32, 55, 32, 33, 26, 38, 41, 44, 38, 46, 26, 33, 32, 41, 36, 60, 26, 40, 54, 124, 115, 102, 123, 100, 119, 83, 118, 86, 115, 102, 115, 80, 103, 124, 118, 126, 119, 104, 127, 109, 123, 104, 126, 127, 126, 76, 115, 126, 127, 117, 91, 126, 94, 123, 110, 123, 88, 111, 116, 126, 118, 127, 36, 59, 54, 55, kotlin.io.encoding.Base64.padSymbol, 13, 38, 59, okio.Utf8.REPLACEMENT_BYTE, 55, 13, 34, kotlin.io.encoding.Base64.padSymbol, 62, 62, 59, 60, 53, 13, 59, 60, 38, 55, 32, 36, 51, 62};
    }

    static {
        A0L();
    }

    public C5V(com.facebook.ads.redexgen.core.C5Q c5q, android.content.Intent intent, com.facebook.ads.redexgen.core.J7 j7, com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        this.A01 = c5q;
        this.A00 = intent;
        this.A03 = j7;
        this.A02 = c1199Zs;
    }

    private com.facebook.ads.redexgen.core.AbstractC1341cD A00() {
        int i = android.os.Build.VERSION.SDK_INT;
        java.lang.String strA0K = A0K(68, 18, 41);
        if (i >= 33) {
            return (com.facebook.ads.redexgen.core.AbstractC1341cD) this.A00.getSerializableExtra(strA0K, com.facebook.ads.redexgen.core.AbstractC1341cD.class);
        }
        android.content.Intent intent = this.A00;
        java.lang.String[] strArr = A05;
        if (strArr[6].charAt(13) != strArr[2].charAt(13)) {
            throw new java.lang.RuntimeException();
        }
        A05[1] = "LmjecX6z1NXmevkMdudhCsYVgseeBlBL";
        return (com.facebook.ads.redexgen.core.AbstractC1341cD) intent.getSerializableExtra(strA0K);
    }

    private com.facebook.ads.redexgen.core.C1339cB A01() {
        int i = android.os.Build.VERSION.SDK_INT;
        java.lang.String strA0K = A0K(26, 19, 47);
        if (i >= 33) {
            return (com.facebook.ads.redexgen.core.C1339cB) this.A00.getSerializableExtra(strA0K, com.facebook.ads.redexgen.core.C1339cB.class);
        }
        return (com.facebook.ads.redexgen.core.C1339cB) this.A00.getSerializableExtra(strA0K);
    }

    private com.facebook.ads.redexgen.core.C0689Fm A02() {
        int i = android.os.Build.VERSION.SDK_INT;
        java.lang.String strA0K = A0K(2, 14, 94);
        if (i >= 33) {
            return (com.facebook.ads.redexgen.core.C0689Fm) this.A00.getSerializableExtra(strA0K, com.facebook.ads.redexgen.core.C0689Fm.class);
        }
        return (com.facebook.ads.redexgen.core.C0689Fm) this.A00.getSerializableExtra(strA0K);
    }

    private com.facebook.ads.redexgen.core.C0687Fk A03() {
        int i = android.os.Build.VERSION.SDK_INT;
        java.lang.String strA0K = A0K(86, 25, 33);
        if (i >= 33) {
            return (com.facebook.ads.redexgen.core.C0687Fk) this.A00.getSerializableExtra(strA0K, com.facebook.ads.redexgen.core.C0687Fk.class);
        }
        return (com.facebook.ads.redexgen.core.C0687Fk) this.A00.getSerializableExtra(strA0K);
    }

    private com.facebook.ads.redexgen.core.MS A05() {
        if (com.facebook.ads.redexgen.core.C0762Im.A2j(this.A02)) {
            java.lang.String stringExtra = this.A00.getStringExtra(A0K(45, 23, 126));
            com.facebook.ads.redexgen.core.C5Q c5q = this.A01;
            com.facebook.ads.redexgen.core.C1199Zs c1199Zs = this.A02;
            com.facebook.ads.redexgen.core.J7 j7 = this.A03;
            com.facebook.ads.redexgen.core.C1244ab c1244ab = new com.facebook.ads.redexgen.core.C1244ab(this.A01);
            android.content.Intent intent = this.A00;
            java.lang.String clickDelayMs = A0K(16, 10, 115);
            java.lang.String stringExtra2 = intent.getStringExtra(clickDelayMs);
            if (stringExtra == null) {
                stringExtra = A0K(0, 2, 117);
            }
            int i = java.lang.Integer.parseInt(stringExtra);
            if (A05[5].charAt(3) != 'i') {
                throw new java.lang.RuntimeException();
            }
            A05[4] = "YY09SF1W0j6b6KfCSgRusx8TJPca7HgC";
            return new com.facebook.ads.redexgen.core.CI(c5q, c1199Zs, j7, c1244ab, stringExtra2, i);
        }
        return new com.facebook.ads.redexgen.core.VY(this.A01, this.A02, this.A03, new com.facebook.ads.redexgen.core.C1244ab(this.A01));
    }

    private com.facebook.ads.redexgen.core.VA A06() {
        com.facebook.ads.redexgen.core.C0689Fm c0689FmA02 = A02();
        if (c0689FmA02 == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.VA(this.A02, this.A03, new com.facebook.ads.redexgen.core.C1244ab(this.A01), c0689FmA02, null, new com.facebook.ads.redexgen.core.V6());
    }

    private com.facebook.ads.redexgen.core.VA A07() {
        com.facebook.ads.redexgen.core.C0687Fk c0687FkA03 = A03();
        if (c0687FkA03 == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.VA(this.A02, this.A03, new com.facebook.ads.redexgen.core.Ej(this.A01), c0687FkA03, c0687FkA03.A0m(), new com.facebook.ads.redexgen.core.V5());
    }

    private final com.facebook.ads.redexgen.core.V9 A08() {
        return new com.facebook.ads.redexgen.core.V9(this.A02, this.A01);
    }

    private com.facebook.ads.redexgen.core.V7 A09(android.widget.RelativeLayout relativeLayout) {
        com.facebook.ads.redexgen.core.V7 v7 = new com.facebook.ads.redexgen.core.V7(this.A02, new com.facebook.ads.redexgen.core.C1243aa(this), this.A03, new com.facebook.ads.redexgen.core.C1244ab(this.A01));
        v7.A05(relativeLayout);
        v7.A04(this.A00.getIntExtra(A0K(111, 27, 105), 200));
        com.facebook.ads.redexgen.core.M3.A0M(relativeLayout, androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        return v7;
    }

    private com.facebook.ads.redexgen.core.BO A0A() {
        com.facebook.ads.redexgen.core.C0689Fm c0689FmA02 = A02();
        if (c0689FmA02 == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.BO(this.A02, this.A03, new com.facebook.ads.redexgen.core.C1244ab(this.A01), c0689FmA02, new com.facebook.ads.redexgen.core.V6(), 1);
    }

    private com.facebook.ads.redexgen.core.BO A0B() {
        com.facebook.ads.redexgen.core.C0687Fk c0687FkA03 = A03();
        if (c0687FkA03 == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.BO(this.A02, this.A03, new com.facebook.ads.redexgen.core.C1244ab(this.A01), c0687FkA03, new com.facebook.ads.redexgen.core.V5(), 0);
    }

    private com.facebook.ads.redexgen.core.UE A0C() {
        com.facebook.ads.redexgen.core.C0926Pb c0926PbA02;
        com.facebook.ads.redexgen.core.AbstractC1341cD abstractC1341cDA00 = A00();
        if (abstractC1341cDA00 == null || (c0926PbA02 = com.facebook.ads.redexgen.core.AbstractC0927Pc.A02(abstractC1341cDA00.A0l())) == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.UE(this.A02, new com.facebook.ads.redexgen.core.C1244ab(this.A01), c0926PbA02, abstractC1341cDA00.A1U());
    }

    private com.facebook.ads.redexgen.core.C1041Tm A0D(com.facebook.ads.redexgen.core.KG kg) {
        com.facebook.ads.redexgen.core.N9 v5;
        com.facebook.ads.redexgen.core.MR ej;
        com.facebook.ads.redexgen.core.C1339cB c1339cBA01 = A01();
        if (c1339cBA01 == null) {
            return null;
        }
        if (kg == com.facebook.ads.redexgen.core.KG.A04) {
            v5 = new com.facebook.ads.redexgen.core.V6();
            ej = new com.facebook.ads.redexgen.core.C1244ab(this.A01);
        } else {
            v5 = new com.facebook.ads.redexgen.core.V5();
            ej = new com.facebook.ads.redexgen.core.Ej(this.A01);
        }
        return new com.facebook.ads.redexgen.core.C1041Tm(this.A02, v5, this.A03, c1339cBA01, new com.facebook.ads.redexgen.core.C04766f(this.A02), ej);
    }

    private com.facebook.ads.redexgen.core.A4 A0E() {
        com.facebook.ads.redexgen.core.C0689Fm c0689FmA02 = A02();
        if (c0689FmA02 != null) {
            return new com.facebook.ads.redexgen.core.A4(this.A02, new com.facebook.ads.redexgen.core.V6(), this.A03, c0689FmA02, new com.facebook.ads.redexgen.core.C04766f(this.A02), new com.facebook.ads.redexgen.core.C1244ab(this.A01));
        }
        if (A05[1].charAt(5) != 'X') {
            throw new java.lang.RuntimeException();
        }
        A05[3] = "TvLwsmu9uaa0faVP4fF8b7PGg31O8U7I";
        return null;
    }

    private com.facebook.ads.redexgen.core.C05379a A0F() {
        com.facebook.ads.redexgen.core.C0689Fm c0689FmA02 = A02();
        if (c0689FmA02 == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.C05379a(this.A02, new com.facebook.ads.redexgen.core.V6(), this.A03, c0689FmA02, new com.facebook.ads.redexgen.core.C04766f(this.A02), new com.facebook.ads.redexgen.core.C1244ab(this.A01));
    }

    private com.facebook.ads.redexgen.core.C05379a A0G() {
        com.facebook.ads.redexgen.core.C0687Fk c0687FkA03 = A03();
        if (c0687FkA03 == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.C05379a(this.A02, new com.facebook.ads.redexgen.core.V5(), this.A03, c0687FkA03, new com.facebook.ads.redexgen.core.C04766f(this.A02), new com.facebook.ads.redexgen.core.Ej(this.A01));
    }

    private com.facebook.ads.redexgen.core.TZ A0H() {
        com.facebook.ads.redexgen.core.C0687Fk c0687FkA03;
        com.facebook.ads.redexgen.core.C0687Fk c0687FkA04 = A03();
        if (c0687FkA04 == null || (c0687FkA03 = A03()) == null) {
            return null;
        }
        return new com.facebook.ads.redexgen.core.TZ(this.A02, this.A03, c0687FkA04, c0687FkA03, new com.facebook.ads.redexgen.core.Ej(this.A01), this.A01);
    }

    private com.facebook.ads.redexgen.core.C9Z A0I() {
        com.facebook.ads.redexgen.core.C0689Fm dataBundle = A02();
        if (dataBundle == null) {
            return null;
        }
        dataBundle.A0s(this.A01.A08());
        return new com.facebook.ads.redexgen.core.C9Z(this.A02, this.A03, new com.facebook.ads.redexgen.core.C04766f(this.A02), new com.facebook.ads.redexgen.core.C1244ab(this.A01), dataBundle);
    }

    private com.facebook.ads.redexgen.core.C9Z A0J() {
        com.facebook.ads.redexgen.core.C0687Fk dataBundle = A03();
        if (dataBundle == null) {
            return null;
        }
        dataBundle.A0s(this.A01.A08());
        return new com.facebook.ads.redexgen.core.C9Z(this.A02, this.A03, new com.facebook.ads.redexgen.core.C04766f(this.A02), new com.facebook.ads.redexgen.core.C1244ab(this.A01), dataBundle);
    }

    public final com.facebook.ads.redexgen.core.MS A0M(com.facebook.ads.redexgen.core.KG kg, android.widget.RelativeLayout relativeLayout) {
        if (kg == null) {
            return null;
        }
        switch (com.facebook.ads.redexgen.core.C5U.A00[kg.ordinal()]) {
            case 1:
                if (relativeLayout != null) {
                    return A09(relativeLayout);
                }
                return null;
            case 2:
                return A0J();
            case 3:
                return A0G();
            case 4:
                return A07();
            case 5:
                return A05();
            case 6:
                com.facebook.ads.redexgen.core.C05379a c05379aA0F = A0F();
                if (A05[4].charAt(13) != '3') {
                    A05[1] = "IIJ0HXviRARge0yizoGTY0JUA2Nzjczv";
                    return c05379aA0F;
                }
                java.lang.String[] strArr = A05;
                strArr[6] = "UHMFNKnwuKHYyMbevaCPtufG1H9dhH1t";
                strArr[2] = "s6UgSHR7PtydXMVItCKPjBxPhDp7nABU";
                return c05379aA0F;
            case 7:
                return A0E();
            case 8:
                return A0I();
            case 9:
                return A06();
            case 10:
                return A0C();
            case 11:
                com.facebook.ads.redexgen.core.BO boA0A = A0A();
                if (A05[5].charAt(3) != 'i') {
                    throw new java.lang.RuntimeException();
                }
                A05[3] = "7AQwH6OZkLua7JLoKEhUfmskdEmJStMK";
                return boA0A;
            case 12:
                return A0B();
            case 13:
            case 14:
                return A0D(kg);
            case 15:
                return A08();
            case 16:
                return A0H();
            default:
                return null;
        }
    }
}
