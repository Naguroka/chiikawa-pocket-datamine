package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1149Xu implements com.facebook.ads.redexgen.core.DB {
    public static java.lang.String[] A05 = {"aP5GMSbD9QVFje8cvlJudvi", "v6g8RP6NFwbqUpEKT7m8cJ2SogJSEfCl", "rQjBsbRQOzHAzNkuuqgehlew1XIqGU75", "eWDxd4p30EKOq2xQ4gEUcg97qw6dkh7r", "MMC4dVZNvWGdUjptuQtqV3wHkQKcWIXe", "aXp7xXci8Aq", "23LTrnxfULtk6fqi77xeMop", "anndeE2GIgf"};
    public final int A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1148Xt A04;
    public final com.facebook.ads.redexgen.core.I3 A03 = new com.facebook.ads.redexgen.core.I3(new byte[5]);
    public final android.util.SparseArray<com.facebook.ads.redexgen.core.DI> A01 = new android.util.SparseArray<>();
    public final android.util.SparseIntArray A02 = new android.util.SparseIntArray();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.DB
    public final void A4n(com.facebook.ads.redexgen.core.I4 i4) {
        com.facebook.ads.redexgen.core.IG ig;
        if (i4.A0E() != 2) {
            return;
        }
        if (this.A04.A05 == 1 || this.A04.A05 == 2 || this.A04.A01 == 1) {
            ig = (com.facebook.ads.redexgen.core.IG) this.A04.A0B.get(0);
        } else {
            ig = new com.facebook.ads.redexgen.core.IG(((com.facebook.ads.redexgen.core.IG) this.A04.A0B.get(0)).A03());
            this.A04.A0B.add(ig);
        }
        i4.A0Z(2);
        int iA0I = i4.A0I();
        int i = 5;
        i4.A0Z(5);
        i4.A0a(this.A03, 2);
        int i2 = 4;
        this.A03.A08(4);
        int i3 = 12;
        i4.A0Z(this.A03.A04(12));
        int i5 = 21;
        if (this.A04.A05 == 2 && this.A04.A03 == null) {
            this.A04.A03 = this.A04.A09.A55(21, new com.facebook.ads.redexgen.core.DF(21, null, null, new byte[0]));
            this.A04.A03.A9F(ig, this.A04.A02, new com.facebook.ads.redexgen.core.DH(iA0I, 21, 8192));
        }
        this.A01.clear();
        this.A02.clear();
        int iA04 = i4.A04();
        while (iA04 > 0) {
            i4.A0a(this.A03, i);
            int iA05 = this.A03.A04(8);
            this.A03.A08(3);
            int iA06 = this.A03.A04(13);
            this.A03.A08(i2);
            int iA07 = this.A03.A04(i3);
            com.facebook.ads.redexgen.core.DF dfA00 = A00(i4, iA07);
            if (iA05 == 6) {
                iA05 = dfA00.A00;
            }
            iA04 -= iA07 + 5;
            int i6 = this.A04.A05 == 2 ? iA05 : iA06;
            if (!this.A04.A07.get(i6)) {
                com.facebook.ads.redexgen.core.DI diA55 = (this.A04.A05 == 2 && iA05 == i5) ? this.A04.A03 : this.A04.A09.A55(iA05, dfA00);
                if (this.A04.A05 != 2 || iA06 < this.A02.get(i6, 8192)) {
                    android.util.SparseIntArray sparseIntArray = this.A02;
                    if (A05[4].charAt(28) != 'W') {
                        throw new java.lang.RuntimeException();
                    }
                    A05[4] = "tBuL7tHRZRPagGiu85nRQrAYjGR6WmAc";
                    sparseIntArray.put(i6, iA06);
                    this.A01.put(i6, diA55);
                }
            }
            i = 5;
            i2 = 4;
            i3 = 12;
            i5 = 21;
        }
        int size = this.A02.size();
        for (int i7 = 0; i7 < size; i7++) {
            int iKeyAt = this.A02.keyAt(i7);
            android.util.SparseBooleanArray sparseBooleanArray = this.A04.A07;
            if (A05[4].charAt(28) != 'W') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A05;
            strArr[5] = "OdJcp2etIVA";
            strArr[7] = "ISrtKVg7zHb";
            sparseBooleanArray.put(iKeyAt, true);
            com.facebook.ads.redexgen.core.DI diValueAt = this.A01.valueAt(i7);
            if (diValueAt != null) {
                if (diValueAt != this.A04.A03) {
                    diValueAt.A9F(ig, this.A04.A02, new com.facebook.ads.redexgen.core.DH(iA0I, iKeyAt, 8192));
                }
                this.A04.A06.put(this.A02.valueAt(i7), diValueAt);
            }
        }
        if (this.A04.A05 == 2) {
            if (this.A04.A04) {
                return;
            }
            this.A04.A02.A5u();
            this.A04.A01 = 0;
            this.A04.A04 = true;
            return;
        }
        this.A04.A06.remove(this.A00);
        this.A04.A01 = this.A04.A05 != 1 ? this.A04.A01 - 1 : 0;
        if (this.A04.A01 == 0) {
            this.A04.A02.A5u();
            this.A04.A04 = true;
        }
    }

    public C1149Xu(com.facebook.ads.redexgen.core.C1148Xt c1148Xt, int i) {
        this.A04 = c1148Xt;
        this.A00 = i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0078  */
    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    /* JADX WARN: Code duplicated, block: B:25:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0049 A[SYNTHETIC] */
    private com.facebook.ads.redexgen.core.DF A00(com.facebook.ads.redexgen.core.I4 i4, int i) {
        int iA06 = i4.A06();
        int i2 = iA06 + i;
        int descriptorTag = -1;
        java.lang.String strTrim = null;
        java.util.ArrayList arrayList = null;
        while (true) {
            int iA07 = i4.A06();
            int descriptorsStartPosition = A05[4].charAt(28);
            if (descriptorsStartPosition != 87) {
                throw new java.lang.RuntimeException();
            }
            A05[4] = "SrIpxGiPfGiAJEdHZUftjoGvUVPpWobB";
            if (iA07 < i2) {
                int iA0E = i4.A0E();
                int iA08 = i4.A06() + i4.A0E();
                if (iA0E == 5) {
                    long jA0M = i4.A0M();
                    if (jA0M != com.facebook.ads.redexgen.core.C1148Xt.A06()) {
                        long j = com.facebook.ads.redexgen.core.C1148Xt.A0G;
                        java.lang.String[] strArr = A05;
                        java.lang.String str = strArr[5];
                        java.lang.String str2 = strArr[7];
                        int descriptorsStartPosition2 = str.length();
                        if (descriptorsStartPosition2 != str2.length()) {
                            java.lang.String[] strArr2 = A05;
                            strArr2[5] = "4Omy7owK9uP";
                            strArr2[7] = "TrdkNfShwCJ";
                            if (jA0M == j) {
                                descriptorTag = 135;
                            } else if (jA0M == com.facebook.ads.redexgen.core.C1148Xt.A0H) {
                                descriptorTag = 36;
                            }
                        } else {
                            A05[4] = "BSNYThemH9cXFs6eaR5l1YwoHCaMWzYO";
                            if (jA0M == j) {
                                descriptorTag = 135;
                            } else if (jA0M == com.facebook.ads.redexgen.core.C1148Xt.A0H) {
                                descriptorTag = 36;
                            }
                        }
                    } else {
                        descriptorTag = 129;
                    }
                } else if (iA0E == 106) {
                    descriptorTag = 129;
                } else if (iA0E == 122) {
                    descriptorTag = 135;
                } else {
                    java.lang.String[] strArr3 = A05;
                    java.lang.String str3 = strArr3[5];
                    java.lang.String str4 = strArr3[7];
                    int descriptorsStartPosition3 = str3.length();
                    if (descriptorsStartPosition3 != str4.length()) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr4 = A05;
                    strArr4[1] = "8LkMam0ZqCGQ6NVF4AK0cQ7o6sgWqWvR";
                    strArr4[3] = "ZfVtxeYnYYOw989DTOuhcT77eFlSAu1r";
                    if (iA0E == 123) {
                        descriptorTag = 138;
                    } else if (iA0E == 10) {
                        strTrim = i4.A0S(3).trim();
                    } else if (iA0E == 89) {
                        descriptorTag = 89;
                        arrayList = new java.util.ArrayList();
                        while (i4.A06() < iA08) {
                            java.lang.String strTrim2 = i4.A0S(3).trim();
                            int iA0E2 = i4.A0E();
                            byte[] bArr = new byte[4];
                            i4.A0c(bArr, 0, 4);
                            arrayList.add(new com.facebook.ads.redexgen.core.DE(strTrim2, iA0E2, bArr));
                        }
                    }
                }
                i4.A0Z(iA08 - i4.A06());
            } else {
                i4.A0Y(i2);
                return new com.facebook.ads.redexgen.core.DF(descriptorTag, strTrim, arrayList, java.util.Arrays.copyOfRange(i4.A00, iA06, i2));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.DB
    public final void A9F(com.facebook.ads.redexgen.core.IG ig, com.facebook.ads.redexgen.core.InterfaceC0611Bz interfaceC0611Bz, com.facebook.ads.redexgen.core.DH dh) {
    }
}
