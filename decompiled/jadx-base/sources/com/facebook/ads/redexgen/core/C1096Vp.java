package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1096Vp extends com.facebook.ads.redexgen.core.KY {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"s6McyFvuEc1XiqBn", "hcEKpUAFoi0", "Uxw7Yfkl7Y0EbUXumb1zp", "2eIZNGpCiZfiyfWjpoEHXYEZ89sKOMjU", "P6wJZ5NPzNm0cd9T3B6a4kCxx00um", "avjdKGQRQHprL3nlmChXTO66aPxw1Ezk", "jTYXriUGWk0Q5Onqj2MBy1ZRmPDEVS5l", "vP4DO0q8Z4bTalFPzqbCoE7Mp2WJV4fR"};
    public final /* synthetic */ android.content.Context A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A02[3].charAt(28) == 'p') {
                throw new java.lang.RuntimeException();
            }
            A02[3] = "yencg2WQyjWgLr4Htapu7BwNwN3x2Tit";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 60);
            i4++;
        }
    }

    public static void A02() {
        A01 = new byte[]{-127, -80, -80, -115, -87, -82, -109, -92, -85, -106, -91, -78, -77, -87, -81, -82};
    }

    static {
        A02();
    }

    public C1096Vp(android.content.Context context) {
        this.A00 = context;
    }

    @Override // com.facebook.ads.redexgen.core.KY
    public final void A06() {
        int iA02;
        if (com.facebook.ads.redexgen.core.LE.A04 == com.facebook.ads.redexgen.core.LD.A02) {
            return;
        }
        android.content.SharedPreferences sharedPreferencesA00 = com.facebook.ads.redexgen.core.KJ.A00(this.A00);
        java.lang.String strA00 = A00(0, 16, 4);
        int i = sharedPreferencesA00.getInt(strA00, -1);
        if (i != -1) {
            int unused = com.facebook.ads.redexgen.core.LE.A00 = i;
            com.facebook.ads.redexgen.core.LD ld = com.facebook.ads.redexgen.core.LD.A02;
            java.lang.String[] strArr = A02;
            if (strArr[1].length() == strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            A02[5] = "hUCmhtQ8p32Ulvvxz3h93PNa760nZTZ8";
            com.facebook.ads.redexgen.core.LE.A04 = ld;
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            iA02 = com.facebook.ads.redexgen.core.LE.A03(this.A00);
        } else {
            iA02 = com.facebook.ads.redexgen.core.LE.A02(this.A00);
        }
        int unused2 = com.facebook.ads.redexgen.core.LE.A00 = iA02;
        sharedPreferencesA00.edit().putInt(strA00, iA02).commit();
        com.facebook.ads.redexgen.core.LE.A04 = com.facebook.ads.redexgen.core.LD.A02;
    }
}
