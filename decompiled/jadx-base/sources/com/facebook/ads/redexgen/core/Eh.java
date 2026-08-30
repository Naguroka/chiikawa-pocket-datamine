package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Eh extends com.facebook.ads.redexgen.core.AbstractC1195Zo<java.lang.String> {
    public static byte[] A08;
    public static java.lang.String[] A09 = {"ZKW0rplATEIsE5gjt8qXTQnY", "r6HJdeSoORQdJfGxA0AnZWlkU33wQIlK", "lLZOtDHAe6uwMhK1fYaqg", "CFnqFcdcZfU1FaRsph1ThokBMpi4uqZk", "TONJvFd", "LRRDDC4", "oqOd7Km", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST};
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C05067s A03;
    public final /* synthetic */ java.lang.String A04;
    public final /* synthetic */ java.lang.String A05;
    public final /* synthetic */ java.lang.String A06;
    public final /* synthetic */ java.util.Map A07;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 122);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {56, 53, 72, 53, 54, 53, 71, 57};
        if (A09[2].length() == 32) {
            throw new java.lang.RuntimeException();
        }
        A09[2] = "0lpDBp9tBU8jLddyd5eWZp";
        A08 = bArr;
    }

    static {
        A02();
    }

    public Eh(com.facebook.ads.redexgen.core.C05067s c05067s, java.lang.String str, java.lang.String str2, int i, double d, double d2, java.lang.String str3, java.util.Map map) {
        this.A03 = c05067s;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = i;
        this.A01 = d;
        this.A00 = d2;
        this.A04 = str3;
        this.A07 = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC05087v
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final java.lang.String A03() {
        java.lang.String eventId = A01(0, 8, 90);
        this.A03.A01.A07().A9A(this.A06);
        if (android.text.TextUtils.isEmpty(this.A05)) {
            return null;
        }
        com.facebook.ads.redexgen.core.C05067s.A07.lock();
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseA0E = null;
        try {
            try {
                sQLiteDatabaseA0E = this.A03.A0E();
                sQLiteDatabaseA0E.beginTransaction();
                java.lang.String strA0E = this.A03.A02.A0E(this.A03.A03.A0C(this.A05), this.A02, this.A06, this.A01, this.A00, this.A04, this.A07);
                sQLiteDatabaseA0E.setTransactionSuccessful();
                if (sQLiteDatabaseA0E != null && sQLiteDatabaseA0E.isOpen()) {
                    try {
                        if (sQLiteDatabaseA0E.inTransaction()) {
                            sQLiteDatabaseA0E.endTransaction();
                        }
                    } catch (java.lang.Exception e) {
                        this.A03.A01.A07().AA0(eventId, com.facebook.ads.redexgen.core.C8E.A0z, new com.facebook.ads.redexgen.core.C8F(e));
                    }
                }
                com.facebook.ads.redexgen.core.C05067s.A07.unlock();
                return strA0E;
            } catch (java.lang.Exception e2) {
                A01(com.facebook.ads.redexgen.core.EnumC05077u.A05);
                this.A03.A01.A07().AA0(eventId, com.facebook.ads.redexgen.core.C8E.A0y, new com.facebook.ads.redexgen.core.C8F(e2));
                if (sQLiteDatabaseA0E != null && sQLiteDatabaseA0E.isOpen()) {
                    try {
                        if (sQLiteDatabaseA0E.inTransaction()) {
                            sQLiteDatabaseA0E.endTransaction();
                        }
                    } catch (java.lang.Exception e3) {
                        this.A03.A01.A07().AA0(eventId, com.facebook.ads.redexgen.core.C8E.A0z, new com.facebook.ads.redexgen.core.C8F(e3));
                    }
                }
                com.facebook.ads.redexgen.core.C05067s.A07.unlock();
                return null;
            }
        } catch (java.lang.Throwable th) {
            if (sQLiteDatabaseA0E != null) {
                boolean zIsOpen = sQLiteDatabaseA0E.isOpen();
                if (A09[5].length() != 7) {
                    throw new java.lang.RuntimeException();
                }
                A09[2] = "rWG930h";
                if (zIsOpen) {
                    try {
                        if (sQLiteDatabaseA0E.inTransaction()) {
                            sQLiteDatabaseA0E.endTransaction();
                        }
                    } catch (java.lang.Exception e4) {
                        this.A03.A01.A07().AA0(eventId, com.facebook.ads.redexgen.core.C8E.A0z, new com.facebook.ads.redexgen.core.C8F(e4));
                    }
                }
            }
            com.facebook.ads.redexgen.core.C05067s.A07.unlock();
            throw th;
        }
    }
}
