package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1163Yi extends com.facebook.ads.redexgen.core.CB {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"swRCXzzYsYoP8OECiDxTO54f3LG38", "4mMxchX9eTKWcUMbEzzbeTKtMtPaQOs", "Xh7ZpLnI5g0AvtHLdYA6RWKofXnumxIG", "5RXJ", "Vqtapz8Iv", "pVwTkokalGpdr", "NZeIzFT7NtL3BMGbT6cfoawDteogj", "Nl9nBczWjc"};
    public long A00;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 123);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0A() {
        A01 = new byte[]{89, 106, 103, 86, 105, 94, 100, 99, 51, 50, 17, 41, 56, 37, 8, 37, 56, 37};
    }

    static {
        A0A();
    }

    public C1163Yi() {
        super(null);
        this.A00 = androidx.media3.common.C.TIME_UNSET;
    }

    public static int A00(com.facebook.ads.redexgen.core.I4 i4) {
        return i4.A0E();
    }

    public static java.lang.Boolean A01(com.facebook.ads.redexgen.core.I4 i4) {
        return java.lang.Boolean.valueOf(i4.A0E() == 1);
    }

    public static java.lang.Double A02(com.facebook.ads.redexgen.core.I4 i4) {
        return java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(i4.A0L()));
    }

    public static java.lang.Object A03(com.facebook.ads.redexgen.core.I4 i4, int i) {
        switch (i) {
            case 0:
                return A02(i4);
            case 1:
                return A01(i4);
            case 2:
                return A05(i4);
            case 3:
                return A09(i4);
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            default:
                return null;
            case 8:
                java.util.HashMap<java.lang.String, java.lang.Object> mapA08 = A08(i4);
                if (A02[2].charAt(22) != 'K') {
                    throw new java.lang.RuntimeException();
                }
                A02[2] = "Sxm2Bc4tXHoV7tL5LxeqP9KUDfvbsTCx";
                return mapA08;
            case 10:
                return A06(i4);
            case 11:
                return A07(i4);
        }
    }

    public static java.lang.String A05(com.facebook.ads.redexgen.core.I4 i4) {
        int iA0I = i4.A0I();
        int iA06 = i4.A06();
        i4.A0Z(iA0I);
        return new java.lang.String(i4.A00, iA06, iA0I);
    }

    public static java.util.ArrayList<java.lang.Object> A06(com.facebook.ads.redexgen.core.I4 i4) {
        int iA0H = i4.A0H();
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(iA0H);
        for (int i = 0; i < iA0H; i++) {
            int count = A00(i4);
            arrayList.add(A03(i4, count));
        }
        return arrayList;
    }

    public static java.util.Date A07(com.facebook.ads.redexgen.core.I4 i4) {
        java.util.Date date = new java.util.Date((long) A02(i4).doubleValue());
        i4.A0Z(2);
        return date;
    }

    public static java.util.HashMap<java.lang.String, java.lang.Object> A08(com.facebook.ads.redexgen.core.I4 i4) {
        int iA0H = i4.A0H();
        java.util.HashMap<java.lang.String, java.lang.Object> map = new java.util.HashMap<>(iA0H);
        for (int type = 0; type < iA0H; type++) {
            java.lang.String key = A05(i4);
            if (A02[5].length() == 3) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A02;
            strArr[1] = "s6CWgTXMjjwS89lYbS7BwJEShue9hkZ";
            strArr[3] = "FaY1";
            int count = A00(i4);
            map.put(key, A03(i4, count));
        }
        return map;
    }

    public static java.util.HashMap<java.lang.String, java.lang.Object> A09(com.facebook.ads.redexgen.core.I4 i4) {
        java.util.HashMap<java.lang.String, java.lang.Object> map = new java.util.HashMap<>();
        while (true) {
            java.lang.String strA05 = A05(i4);
            int iA00 = A00(i4);
            if (iA00 == 9) {
                return map;
            }
            map.put(strA05, A03(i4, iA00));
        }
    }

    @Override // com.facebook.ads.redexgen.core.CB
    public final void A0B(com.facebook.ads.redexgen.core.I4 i4, long j) throws com.facebook.ads.redexgen.core.A0 {
        if (A00(i4) == 2) {
            if (!A04(8, 10, 73).equals(A05(i4)) || A00(i4) != 8) {
                return;
            }
            java.util.Map<java.lang.String, java.lang.Object> metadata = A08(i4);
            java.lang.String name = A04(0, 8, 122);
            if (metadata.containsKey(name)) {
                double durationSeconds = ((java.lang.Double) metadata.get(name)).doubleValue();
                if (durationSeconds > 0.0d) {
                    this.A00 = (long) (1000000.0d * durationSeconds);
                    return;
                }
                return;
            }
            return;
        }
        throw new com.facebook.ads.redexgen.core.A0();
    }

    @Override // com.facebook.ads.redexgen.core.CB
    public final boolean A0C(com.facebook.ads.redexgen.core.I4 i4) {
        return true;
    }

    public final long A0D() {
        return this.A00;
    }
}
