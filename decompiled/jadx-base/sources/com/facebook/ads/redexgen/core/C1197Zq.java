package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1197Zq extends com.facebook.ads.redexgen.core.AbstractC05097w {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"S72iqLUHJq0HxavSC6ufHzOfLzRtkhG1", "2e23vyAJ1VfrYECWW2PuMy9", "U", "BHx2UoB4woyKjmRGK8g7VJyuwo8iE1MX", "2k4S21J4fALKY04XcYptMZ4CnaCsWgOl", "PftoDMjSF3TujDQXHZcKzxMpxF8wabcx", "G9sGcewQNY3LQ1dDEReskE69oTmTF8fU", "WiiYP1Z6q1ZZMC28sRcL9b9"};
    public static final com.facebook.ads.redexgen.core.C7q A02;
    public static final com.facebook.ads.redexgen.core.C7q A03;
    public static final com.facebook.ads.redexgen.core.C7q A04;
    public static final com.facebook.ads.redexgen.core.C7q A05;
    public static final com.facebook.ads.redexgen.core.C7q A06;
    public static final com.facebook.ads.redexgen.core.C7q A07;
    public static final com.facebook.ads.redexgen.core.C7q A08;
    public static final com.facebook.ads.redexgen.core.C7q A09;
    public static final com.facebook.ads.redexgen.core.C7q A0A;
    public static final com.facebook.ads.redexgen.core.C7q[] A0B;
    public static final java.lang.String A0C;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 77);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-104, -75, -104, -73, -102, -97, -91, -106, -104, -106, -93, -9, -22, -26, -15, -47, -61, -54, -61, -63, -46, -98, -88, -98, -60, -48, -51, -53, -98, -29, -12, -29, -20, -14, -15, -98, -43, -58, -61, -48, -61, -98, -29, -43, -36, -43, -45, -28, -80, -13, -1, 5, -2, 4, -72, -70, -71, -80, -42, -30, -33, -35, -80, -11, 6, -11, -2, 4, 3, 21, 6, 25, 21, 32, 17, 36, 32, -20, 28, 30, 21, 25, 13, 30, 37, -20, 23, 17, 37, 13, -2, 17, 13, -39, 11, -2, -1, -2, 11, -2, 7, -4, -2, 12, -39, 45, 40, 36, 30, 39, 44, -39, 8, 7, -39, 14, 9, -3, -6, 13, -2, -39, -4, -6, 12, -4, -6, -3, -2, -39, 8, 7, -39, -3, -2, 5, -2, 13, -2, -39, 11, -2, 12, 13, 11, 2, -4, 13, -74, -55, -55, -70, -62, -59, -55, 24, 21, 40, 21, -77, -60, -77, -68, -62, -83, -73, -78, 19, 36, 19, 28, 34, 33, -63, -61, -70, -64, -61, -70, -59, -54, 23, 9, 23, 23, 13, 19, 18, 3, 13, 8, -33, -47, -33, -33, -43, -37, -38, -53, -32, -43, -39, -47, -29, -40, -36, -44, -37, -42, -46, -52, -43, -58, -48, -53, -55, -50, -59, -70};
    }

    static {
        A04();
        A04 = new com.facebook.ads.redexgen.core.C7q(0, A00(org.objectweb.asm.Opcodes.IF_ICMPEQ, 8, 1), A00(73, 16, 127));
        A09 = new com.facebook.ads.redexgen.core.C7q(1, A00(207, 8, 26), A00(89, 59, 108));
        java.lang.String strA00 = A00(org.objectweb.asm.Opcodes.LRETURN, 8, 4);
        java.lang.String strA01 = A00(4, 7, 4);
        A05 = new com.facebook.ads.redexgen.core.C7q(2, strA00, strA01);
        java.lang.String strA02 = A00(215, 4, 8);
        java.lang.String strA03 = A00(69, 4, 116);
        A0A = new com.facebook.ads.redexgen.core.C7q(3, strA02, strA03);
        java.lang.String strA04 = A00(com.ironsource.g3.c.b.d, 4, 34);
        java.lang.String strA05 = A00(11, 4, 88);
        A08 = new com.facebook.ads.redexgen.core.C7q(4, strA04, strA05);
        A07 = new com.facebook.ads.redexgen.core.C7q(5, A00(org.objectweb.asm.Opcodes.ATHROW, 12, 31), strA05);
        A06 = new com.facebook.ads.redexgen.core.C7q(6, A00(org.objectweb.asm.Opcodes.PUTFIELD, 10, 87), strA03);
        A03 = new com.facebook.ads.redexgen.core.C7q(7, A00(155, 4, 103), strA03);
        A02 = new com.facebook.ads.redexgen.core.C7q(8, A00(org.objectweb.asm.Opcodes.LCMP, 7, 8), strA01);
        A0B = new com.facebook.ads.redexgen.core.C7q[]{A04, A09, A05, A0A, A08, A07, A06, A03, A02};
        A0C = com.facebook.ads.redexgen.core.AbstractC05097w.A02(A00(org.objectweb.asm.Opcodes.GOTO, 6, 97), A0B);
    }

    public C1197Zq(com.facebook.ads.redexgen.core.C05067s c05067s) {
        super(c05067s);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC05097w
    public final java.lang.String A06() {
        return A00(org.objectweb.asm.Opcodes.GOTO, 6, 97);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC05097w
    public final com.facebook.ads.redexgen.core.C7q[] A0A() {
        return A0B;
    }

    public final android.database.Cursor A0B() {
        return A05().rawQuery(A00(42, 27, 67), null);
    }

    public final android.database.Cursor A0C() {
        return A05().rawQuery(A0C, null);
    }

    public final android.database.Cursor A0D(java.lang.String str) {
        return A05().rawQuery(A00(15, 27, 49) + A04.A01 + A00(0, 4, 43), new java.lang.String[]{str});
    }

    public final java.lang.String A0E(java.lang.String str, int i, java.lang.String str2, double d, double d2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map) throws android.database.sqlite.SQLiteException {
        java.lang.String string = java.util.UUID.randomUUID().toString();
        android.content.ContentValues contentValues = new android.content.ContentValues(9);
        java.lang.String eventId = A04.A01;
        contentValues.put(eventId, string);
        java.lang.String eventId2 = A09.A01;
        contentValues.put(eventId2, str);
        contentValues.put(A05.A01, java.lang.Integer.valueOf(i));
        java.lang.String eventId3 = A0A.A01;
        contentValues.put(eventId3, str2);
        contentValues.put(A08.A01, java.lang.Double.valueOf(d));
        contentValues.put(A07.A01, java.lang.Double.valueOf(d2));
        java.lang.String eventId4 = A06.A01;
        contentValues.put(eventId4, str3);
        java.lang.String str4 = A03.A01;
        java.lang.String eventId5 = map != null ? new org.json.JSONObject(map).toString() : null;
        contentValues.put(str4, eventId5);
        java.lang.String str5 = A02.A01;
        java.lang.String[] strArr = A01;
        if (strArr[5].charAt(26) != strArr[3].charAt(26)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A01;
        strArr2[5] = "LHixrdeQ9nvdAu8uzIal1NDup18dDyzZ";
        strArr2[3] = "Oc0hVPeTX1hGgtg7NBB4ZrhrOq8xlSVE";
        contentValues.put(str5, (java.lang.Integer) 0);
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseA05 = A05();
        java.lang.String eventId6 = A00(org.objectweb.asm.Opcodes.GOTO, 6, 97);
        sQLiteDatabaseA05.insertOrThrow(eventId6, null, contentValues);
        return string;
    }

    public final boolean A0F(java.lang.String str) {
        return A05().delete(A00(org.objectweb.asm.Opcodes.GOTO, 6, 97), new java.lang.StringBuilder().append(A04.A01).append(A00(0, 4, 43)).toString(), new java.lang.String[]{str}) > 0;
    }
}
