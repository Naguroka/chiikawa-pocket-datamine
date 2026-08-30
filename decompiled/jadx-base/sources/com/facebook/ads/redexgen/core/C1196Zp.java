package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1196Zp extends com.facebook.ads.redexgen.core.AbstractC05097w {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"v5MZzRzrTL11f6lKUt2ZQD1OVIavmnrt", "OQAuAlzJEKPfh7ZgcR4xCXzzkMNpdJq1", "ORBVlGZaT9NsACLTU7PLH6nx7c52uYSI", "kFePfToViPIZQeUiwoBs", "eRXXWt8NkKb0AEFThzS2KgPgrvMEJJml", "Br8mzprdPK1S49BanGBC", "SoemqsWiEpTnAycOeZvswJMc9fMJVUnI", "UAbmRevtk8pEhuOi2MMFgEMoVQVmS6xB"};
    public static final com.facebook.ads.redexgen.core.C7q A02;
    public static final com.facebook.ads.redexgen.core.C7q A03;
    public static final com.facebook.ads.redexgen.core.C7q[] A04;
    public static final java.lang.String A05;
    public static final java.lang.String A06;
    public static final java.lang.String A07;
    public static final java.lang.String A08;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 98);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{122, 103, 122, 40, 43, 118, 119, 126, 119, 102, 119, 18, 116, 96, 125, 127, 18, 70, 93, 89, 87, 92, 65, 18, 101, 122, 119, 96, 119, 18, 124, 125, 102, 18, 119, 106, 123, 97, 102, 97, 18, 26, 97, 119, 126, 119, 113, 102, 18, 3, 18, 116, 96, 125, 127, 18, 87, 68, 87, 92, 70, 65, 18, 101, 122, 119, 96, 119, 18, 70, 93, 89, 87, 92, 65, 28, 27, 38, kotlin.io.encoding.Base64.padSymbol, 59, 46, 42, 55, 49, 48, 126, 41, 54, 59, 48, 126, 42, 44, 39, 55, 48, 57, 126, 42, 49, 126, 58, 59, 50, 59, 42, 59, 126, kotlin.io.encoding.Base64.padSymbol, 54, 55, 50, 58, 50, 59, 45, 45, 126, 42, 49, 53, 59, 48, 45, 112, 124, 91, 67, 84, 89, 92, 81, 21, 65, 90, 94, 80, 91, 27, 20, 5, 24, 20, 36, 53, 40, 36, 80, 32, 34, 57, kotlin.io.encoding.Base64.padSymbol, 49, 34, 41, 80, 59, 53, 41, 66, 81, 66, 73, 83, 84, 5, 30, 26, 20, 31, 125, 102, 98, 108, 103, 86, 96, 109, 67, 88, 92, 82, 89, 68};
    }

    static {
        A04();
        A03 = new com.facebook.ads.redexgen.core.C7q(0, A00(org.objectweb.asm.Opcodes.TABLESWITCH, 8, 107), A00(org.objectweb.asm.Opcodes.D2L, 16, 18));
        A02 = new com.facebook.ads.redexgen.core.C7q(1, A00(org.objectweb.asm.Opcodes.IF_ACMPEQ, 5, 19), A00(139, 4, 34));
        A04 = new com.facebook.ads.redexgen.core.C7q[]{A03, A02};
        A08 = com.facebook.ads.redexgen.core.C1196Zp.class.getSimpleName();
        com.facebook.ads.redexgen.core.C7q[] c7qArr = A04;
        java.lang.String strA00 = A00(org.objectweb.asm.Opcodes.GETSTATIC, 6, 85);
        A06 = com.facebook.ads.redexgen.core.AbstractC05097w.A02(strA00, c7qArr);
        A07 = com.facebook.ads.redexgen.core.AbstractC05097w.A03(strA00, A04, A02);
        A05 = A00(5, 71, 80) + A03.A01 + A00(0, 3, 56) + A00(org.objectweb.asm.Opcodes.IF_ICMPEQ, 6, 69) + A00(4, 1, 103) + com.facebook.ads.redexgen.core.C1197Zq.A09.A01 + A00(3, 1, 99);
    }

    public C1196Zp(com.facebook.ads.redexgen.core.C05067s c05067s) {
        super(c05067s);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC05097w
    public final java.lang.String A06() {
        return A00(org.objectweb.asm.Opcodes.GETSTATIC, 6, 85);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC05097w
    public final com.facebook.ads.redexgen.core.C7q[] A0A() {
        return A04;
    }

    public final android.database.Cursor A0B() {
        return A05().rawQuery(A06, null);
    }

    public final java.lang.String A0C(java.lang.String str) throws android.database.sqlite.SQLiteException, java.lang.IllegalArgumentException {
        if (!android.text.TextUtils.isEmpty(str)) {
            android.database.Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = A05().rawQuery(A07, new java.lang.String[]{str});
                java.lang.String string = cursorRawQuery.moveToNext() ? cursorRawQuery.getString(A03.A00) : null;
                if (!android.text.TextUtils.isEmpty(string)) {
                    return string;
                }
                java.lang.String string2 = java.util.UUID.randomUUID().toString();
                android.content.ContentValues contentValues = new android.content.ContentValues(2);
                contentValues.put(A03.A01, string2);
                contentValues.put(A02.A01, str);
                A05().insertOrThrow(A00(org.objectweb.asm.Opcodes.GETSTATIC, 6, 85), null, contentValues);
                return string2;
            } finally {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            }
        }
        throw new java.lang.IllegalArgumentException(A00(125, 14, 87));
    }

    public final void A0D(com.facebook.ads.redexgen.core.C1198Zr c1198Zr) {
        try {
            A05().execSQL(A05);
        } catch (android.database.SQLException e) {
            com.facebook.ads.redexgen.core.InterfaceC05037o interfaceC05037oA04 = c1198Zr.A04();
            if (A01[0].charAt(14) != 'l') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A01;
            strArr[7] = "zGpOEoeFk9mKuFaHfebiepQHWPBtYRlV";
            strArr[4] = "gQOnf7kUk2P1iMeHKJrfxPX4gK9wMRl8";
            if (interfaceC05037oA04.A9O()) {
                android.util.Log.e(A08, A00(76, 49, 60), e);
            }
        }
    }
}
