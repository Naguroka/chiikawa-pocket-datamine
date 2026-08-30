package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YA implements com.facebook.ads.redexgen.core.DG {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"cIjxyHfF4Na70tICip7PjClMAECqLvv0", "9aUAN45Mq7beaYYSufaRXM2isnlLIkV", "GuAir45aTTB50QXIHWfmC0qQ4cZq0cFY", "OsaiShoZ91YGkIKMbq6YsdhM0xqeQg5", "wBv9up3nepL5Ac8Xs16wGAkzLLltYgux", "zowfRFb8Dia0VESuGHm8djXuo2UZUy6k", "uBL8Vc0B5ju99YZh9bBxt9eVlbaSb0DY", "BNCmp3pud8dxM9Up6jxNWO9qhbdYLcuY"};
    public final int A00;
    public final java.util.List<com.facebook.ads.internal.exoplayer2.thirdparty.Format> A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private com.facebook.ads.redexgen.core.DC A00(com.facebook.ads.redexgen.core.DF df) {
        java.lang.String strA01;
        int i;
        if (A03(32)) {
            return new com.facebook.ads.redexgen.core.DC(this.A01);
        }
        com.facebook.ads.redexgen.core.I4 i4 = new com.facebook.ads.redexgen.core.I4(df.A03);
        java.util.List<com.facebook.ads.internal.exoplayer2.thirdparty.Format> arrayList = this.A01;
        while (true) {
            int iA04 = i4.A04();
            if (A03[4].charAt(8) != 'e') {
                throw new java.lang.RuntimeException();
            }
            A03[4] = "YsEgYg82e8potbHC6n5ts5MsX7rqhB3Q";
            if (iA04 <= 0) {
                return new com.facebook.ads.redexgen.core.DC(arrayList);
            }
            int iA0E = i4.A0E();
            int iA06 = i4.A06() + i4.A0E();
            if (iA0E == 134) {
                arrayList = new java.util.ArrayList<>();
                int iA0E2 = i4.A0E() & 31;
                for (int i2 = 0; i2 < iA0E2; i2++) {
                    java.lang.String strA0S = i4.A0S(3);
                    int iA0E3 = i4.A0E();
                    if ((iA0E3 & 128) != 0) {
                        strA01 = A01(19, 19, 62);
                        i = iA0E3 & 63;
                    } else {
                        strA01 = A01(0, 19, 79);
                        i = 1;
                    }
                    arrayList.add(com.facebook.ads.internal.exoplayer2.thirdparty.Format.A08(null, strA01, null, -1, 0, strA0S, i, null));
                    i4.A0Z(2);
                }
            }
            i4.A0Y(iA06);
        }
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 88);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{118, 103, 103, 123, 126, 116, 118, 99, 126, 120, 121, 56, 116, 114, 118, 58, 33, 39, 47, 7, 22, 22, 10, 15, 5, 7, 18, 15, 9, 8, 73, 5, 3, 7, 75, 81, 86, 94};
    }

    static {
        A02();
    }

    public YA() {
        this(0);
    }

    public YA(int i) {
        this(i, java.util.Collections.emptyList());
    }

    public YA(int i, java.util.List<com.facebook.ads.internal.exoplayer2.thirdparty.Format> list) {
        this.A00 = i;
        if (!A03(32) && list.isEmpty()) {
            list = java.util.Collections.singletonList(com.facebook.ads.internal.exoplayer2.thirdparty.Format.A00(null, A01(0, 19, 79), 0, null));
        }
        this.A01 = list;
    }

    private boolean A03(int i) {
        return (this.A00 & i) != 0;
    }

    @Override // com.facebook.ads.redexgen.core.DG
    public final android.util.SparseArray<com.facebook.ads.redexgen.core.DI> A4z() {
        return new android.util.SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.core.DG
    public final com.facebook.ads.redexgen.core.DI A55(int i, com.facebook.ads.redexgen.core.DF df) {
        switch (i) {
            case 2:
                return new com.facebook.ads.redexgen.core.Y1(new com.facebook.ads.redexgen.core.Y7());
            case 3:
            case 4:
                return new com.facebook.ads.redexgen.core.Y1(new com.facebook.ads.redexgen.core.Y2(df.A01));
            case 15:
                if (A03(2)) {
                    return null;
                }
                return new com.facebook.ads.redexgen.core.Y1(new com.facebook.ads.redexgen.core.YB(false, df.A01));
            case 17:
                if (A03(2)) {
                    return null;
                }
                return new com.facebook.ads.redexgen.core.Y1(new com.facebook.ads.redexgen.core.Y3(df.A01));
            case 21:
                return new com.facebook.ads.redexgen.core.Y1(new com.facebook.ads.redexgen.core.Y4());
            case 27:
                if (A03(4)) {
                    return null;
                }
                return new com.facebook.ads.redexgen.core.Y1(new com.facebook.ads.redexgen.core.Y6(A00(df), A03(1), A03(8)));
            case 36:
                return new com.facebook.ads.redexgen.core.Y1(new com.facebook.ads.redexgen.core.Y5(A00(df)));
            case 89:
                return new com.facebook.ads.redexgen.core.Y1(new com.facebook.ads.redexgen.core.Y8(df.A02));
            case 129:
            case 135:
                return new com.facebook.ads.redexgen.core.Y1(new com.facebook.ads.redexgen.core.YE(df.A01));
            case 130:
            case 138:
                return new com.facebook.ads.redexgen.core.Y1(new com.facebook.ads.redexgen.core.Y9(df.A01));
            case 134:
                if (A03(16)) {
                    return null;
                }
                return new com.facebook.ads.redexgen.core.C1153Xy(new com.facebook.ads.redexgen.core.C1152Xx());
            default:
                return null;
        }
    }
}
