package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1131Wz implements com.facebook.ads.redexgen.core.I6<java.lang.String> {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"uH4cRPiNAtd6hIF4d2nHkiKOYdeJaHzO", "JLNchjpJQuqbhh", "FWMzr4wbAebCjAMdCNncG5waeot5HoRB", "MfzvzGDE906n0IsIni7", "UQ8hk87iKtjST5OwSTOxRTAmcFw5heUv", "WkhjXxlb50SSewekCHh9frN5EhGMAbac", "AG13Y1v", "zPzrjTlkXgIdZhcUl4R5"};

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 11);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-94, -82, -89, -90, -29, -44, -25, -29, -81, -96, -77, -81, 106, -79, -81, -81, -119, 126, 125};
    }

    static {
        A01();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.I6
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final boolean A5x(java.lang.String str) {
        java.lang.String strA0M = com.facebook.ads.redexgen.core.IK.A0M(str);
        if (!android.text.TextUtils.isEmpty(strA0M) && ((!strA0M.contains(A00(4, 4, 100)) || strA0M.contains(A00(8, 8, 48))) && !strA0M.contains(A00(0, 4, 47)))) {
            boolean zContains = strA0M.contains(A00(16, 3, 6));
            java.lang.String[] strArr = A01;
            if (strArr[4].charAt(9) != strArr[0].charAt(9)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[5] = "NsSUytDbyDHOAvFQAY0dcpKHGU0KX3yK";
            strArr2[2] = "9aubWKHbvVA5AKhHWjYseXE5rNVVWtMF";
            if (!zContains) {
                return true;
            }
        }
        return false;
    }
}
