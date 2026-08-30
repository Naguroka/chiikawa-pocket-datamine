package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC05097w {
    public static byte[] A01;
    public final com.facebook.ads.redexgen.core.C05067s A00;

    static {
        A04();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 3);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{85, 93, 87, 74, 87, 72, 54, 80, 68, 89, 91, 54, 84, 35, 60, 49, 38, 49, 84, 95, 4, 8, 79, 94, 73, 77, 88, 73, 44, 88, 77, 78, 64, 73, 44, 6, 16, 13, 18, 98, 22, 3, 0, 14, 7, 98, 11, 4, 98, 7, 26, 11, 17, 22, 17, 98, 34, 52, kotlin.io.encoding.Base64.padSymbol, 52, 50, 37, 81};
    }

    public abstract java.lang.String A06();

    public abstract com.facebook.ads.redexgen.core.C7q[] A0A();

    public AbstractC05097w(com.facebook.ads.redexgen.core.C05067s c05067s) {
        this.A00 = c05067s;
    }

    private java.lang.String A00() {
        com.facebook.ads.redexgen.core.C7q[] c7qArrA0A = A0A();
        if (c7qArrA0A.length < 1) {
            return null;
        }
        java.lang.String result = A01(0, 0, 12);
        for (int i = 0; i < c7qArrA0A.length - 1; i++) {
            result = result + c7qArrA0A[i].A02() + A01(20, 2, 43);
        }
        return result + c7qArrA0A[c7qArrA0A.length - 1].A02();
    }

    public static java.lang.String A02(java.lang.String str, com.facebook.ads.redexgen.core.C7q[] c7qArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(A01(56, 7, 114));
        for (int i = 0; i < c7qArr.length - 1; i++) {
            sb.append(c7qArr[i].A01);
            sb.append(A01(20, 2, 43));
        }
        sb.append(c7qArr[c7qArr.length - 1].A01);
        sb.append(A01(6, 6, 21));
        sb.append(str);
        return sb.toString();
    }

    public static java.lang.String A03(java.lang.String str, com.facebook.ads.redexgen.core.C7q[] c7qArr, com.facebook.ads.redexgen.core.C7q c7q) {
        return A02(str, c7qArr) + A01(12, 7, 119) + c7q.A01 + A01(2, 4, 116);
    }

    public final android.database.sqlite.SQLiteDatabase A05() {
        return this.A00.A0E();
    }

    public final void A07(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(22, 13, 15) + A06() + A01(0, 2, 118) + A00() + A01(19, 1, 117));
    }

    public final void A08(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(35, 21, 65) + A06());
    }

    public final boolean A09() {
        return A05().delete(A06(), null, null) > 0;
    }
}
