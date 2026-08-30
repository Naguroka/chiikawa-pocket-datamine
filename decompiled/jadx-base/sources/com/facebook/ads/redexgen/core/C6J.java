package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6J, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C6J {
    public static byte[] A00;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 15);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{kotlin.io.encoding.Base64.padSymbol, 53, 56, 79, 64, 74, 92, 65, 71, 74, 71, 74, 127, 115, 114, 104, 121, 114, 104, 38, 51, 51, 127, 115, 113, 50, 122, 125, 127, 121, 126, 115, 115, 119, 50, 119, 125, 104, 125, 114, 125, 50, 108, 110, 115, 106, 117, 120, 121, 110, 50, 93, 104, 104, 110, 117, 126, 105, 104, 117, 115, 114, 85, 120, 76, 110, 115, 106, 117, 120, 121, 110, 18, 23, 19, 23, 10, 33, 10, 12, 31, 29, 21, 23, 16, 25};
    }

    public static com.facebook.ads.redexgen.core.C6I A00(android.content.ContentResolver contentResolver) {
        java.lang.String strA01 = A01(72, 14, 113);
        java.lang.String strA02 = A01(3, 9, 33);
        java.lang.String strA03 = A01(0, 3, 83);
        android.database.Cursor c = null;
        try {
            c = contentResolver.query(com.facebook.ads.redexgen.core.L5.A00(A01(12, 60, 19)), new java.lang.String[]{strA03, strA02, strA01}, null, null, null);
            if (c == null || !c.moveToFirst()) {
                return new com.facebook.ads.redexgen.core.C6I(null, null, false);
            }
            java.lang.String string = c.getString(c.getColumnIndex(strA03));
            java.lang.String attributionId = c.getString(c.getColumnIndex(strA02));
            return new com.facebook.ads.redexgen.core.C6I(string, attributionId, java.lang.Boolean.valueOf(c.getString(c.getColumnIndex(strA01))).booleanValue());
        } finally {
            if (c != null) {
                c.close();
            }
        }
    }
}
