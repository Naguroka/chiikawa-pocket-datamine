package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1148Xt implements com.facebook.ads.redexgen.core.InterfaceC0609Bx {
    public static byte[] A0C;
    public static java.lang.String[] A0D = {"ufcbpOhQhqfww", "8gjJwrnRxopXUt5RDr9dLAGWyYcJb", "RrpJOHcsb4Pm36IqzzuwB0Pwd2F", "CxEKAMRBe9nENfTzQqU3HZQRCQOPz", "jAhDY7r0a3RmtejP3i1VUzMRlFDw44q1", "N2iKKo93X7k9EaQngNkn4845L63", "a2luvlJkNDqKc6tsACEIqhpgDPphGsh0", "cjBBox4hJsENN3ORgD9lVAgfXCMAx7I4"};
    public static final com.facebook.ads.redexgen.core.C0 A0E;
    public static final long A0F;
    public static final long A0G;
    public static final long A0H;
    public int A00;
    public int A01;
    public com.facebook.ads.redexgen.core.InterfaceC0611Bz A02;
    public com.facebook.ads.redexgen.core.DI A03;
    public boolean A04;
    public final int A05;
    public final android.util.SparseArray<com.facebook.ads.redexgen.core.DI> A06;
    public final android.util.SparseBooleanArray A07;
    public final android.util.SparseIntArray A08;
    public final com.facebook.ads.redexgen.core.DG A09;
    public final com.facebook.ads.redexgen.core.I4 A0A;
    public final java.util.List<com.facebook.ads.redexgen.core.IG> A0B;

    public static java.lang.String A0D(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 25);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A0G() {
        A0C = new byte[]{101, 103, 81, 87, -127, -97, -84, -84, -83, -78, 94, -92, -89, -84, -94, 94, -79, -73, -84, -95, 94, -96, -73, -78, -93, 108, 94, -117, -83, -79, -78, 94, -86, -89, -87, -93, -86, -73, 94, -84, -83, -78, 94, -97, 94, -110, -80, -97, -84, -79, -82, -83, -80, -78, 94, -111, -78, -80, -93, -97, -85, 108, 105, 101, 103, 87, -48, -51, -34, -53};
    }

    static {
        A0G();
        A0E = new com.facebook.ads.redexgen.core.C1151Xw();
        A0F = com.facebook.ads.redexgen.core.IK.A08(A0D(0, 4, 11));
        A0G = com.facebook.ads.redexgen.core.IK.A08(A0D(62, 4, 11));
        A0H = com.facebook.ads.redexgen.core.IK.A08(A0D(66, 4, 111));
    }

    public C1148Xt() {
        this(0);
    }

    public C1148Xt(int i) {
        this(1, i);
    }

    public C1148Xt(int i, int i2) {
        this(i, new com.facebook.ads.redexgen.core.IG(0L), new com.facebook.ads.redexgen.core.YA(i2));
    }

    public C1148Xt(int i, com.facebook.ads.redexgen.core.IG ig, com.facebook.ads.redexgen.core.DG dg) {
        this.A09 = (com.facebook.ads.redexgen.core.DG) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(dg);
        this.A05 = i;
        if (i == 1 || i == 2) {
            this.A0B = java.util.Collections.singletonList(ig);
        } else {
            this.A0B = new java.util.ArrayList();
            this.A0B.add(ig);
        }
        this.A0A = new com.facebook.ads.redexgen.core.I4(new byte[9400], 0);
        this.A07 = new android.util.SparseBooleanArray();
        this.A06 = new android.util.SparseArray<>();
        this.A08 = new android.util.SparseIntArray();
        A0F();
    }

    public static /* synthetic */ int A01(com.facebook.ads.redexgen.core.C1148Xt c1148Xt) {
        int i = c1148Xt.A01;
        c1148Xt.A01 = i + 1;
        return i;
    }

    public static /* synthetic */ long A06() {
        long j = A0F;
        java.lang.String[] strArr = A0D;
        if (strArr[3].length() != strArr[1].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0D;
        strArr2[5] = "Mvsf3JxSGosjXzwBkJPQGIwLB4q";
        strArr2[2] = "plT0rwNDmkTcKTqeWkJB2rosyoD";
        return j;
    }

    private void A0F() {
        this.A07.clear();
        this.A06.clear();
        android.util.SparseArray<com.facebook.ads.redexgen.core.DI> sparseArrayA4z = this.A09.A4z();
        int size = sparseArrayA4z.size();
        for (int i = 0; i < size; i++) {
            android.util.SparseArray<com.facebook.ads.redexgen.core.DI> sparseArray = this.A06;
            int initialPayloadReadersSize = sparseArrayA4z.keyAt(i);
            sparseArray.put(initialPayloadReadersSize, sparseArrayA4z.valueAt(i));
            int initialPayloadReadersSize2 = A0D[4].charAt(29);
            if (initialPayloadReadersSize2 != 52) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0D;
            strArr[5] = "LIVsYOsH3dPANi1wlFOQjbxCQA0";
            strArr[2] = "j5LCk1ZVCLyx7AviJpanN8L4qxZ";
        }
        this.A06.put(0, new com.facebook.ads.redexgen.core.C1153Xy(new com.facebook.ads.redexgen.core.C1150Xv(this)));
        this.A03 = null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final void A9D(com.facebook.ads.redexgen.core.InterfaceC0611Bz interfaceC0611Bz) {
        this.A02 = interfaceC0611Bz;
        interfaceC0611Bz.AG8(new com.facebook.ads.redexgen.core.C1169Yo(androidx.media3.common.C.TIME_UNSET));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00da  */
    /* JADX WARN: Code duplicated, block: B:57:0x0111  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final int AEk(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, com.facebook.ads.redexgen.core.C4 c4) throws java.lang.InterruptedException, java.io.IOException {
        boolean z;
        com.facebook.ads.redexgen.core.DI di;
        byte[] bArr = this.A0A.A00;
        if (9400 - this.A0A.A06() < 188) {
            int iA04 = this.A0A.A04();
            if (iA04 > 0) {
                java.lang.System.arraycopy(bArr, this.A0A.A06(), bArr, 0, iA04);
            }
            this.A0A.A0b(bArr, iA04);
        }
        while (this.A0A.A04() < 188) {
            int iA07 = this.A0A.A07();
            int i = 9400 - iA07;
            if (A0D[0].length() == 16) {
                throw new java.lang.RuntimeException();
            }
            A0D[4] = "1oj2MbBvlwZ6JQLLPcWPgTE4BOWCk41T";
            int i2 = interfaceC0610By.read(bArr, iA07, i);
            if (i2 == -1) {
                return -1;
            }
            this.A0A.A0X(iA07 + i2);
        }
        int iA08 = this.A0A.A07();
        int limit = this.A0A.A06();
        while (limit < iA08 && bArr[limit] != 71) {
            limit++;
        }
        this.A0A.A0Y(limit);
        int searchStart = limit + 188;
        if (searchStart > iA08) {
            this.A00 += limit - limit;
            if (this.A05 != 2 || this.A00 <= 376) {
                return 0;
            }
            throw new com.facebook.ads.redexgen.core.A0(A0D(4, 58, 37));
        }
        this.A00 = 0;
        int pid = this.A0A.A08();
        if ((8388608 & pid) != 0) {
            this.A0A.A0Y(searchStart);
            return 0;
        }
        int i3 = 4194304 & pid;
        java.lang.String[] strArr = A0D;
        if (strArr[3].length() != strArr[1].length()) {
            java.lang.String[] strArr2 = A0D;
            strArr2[6] = "oSlGQSBdab59ioUXQrMjR2UoDgRakuxX";
            strArr2[7] = "2NhJrSGQI0g1wS3zjq0KnyirHvzSHHoS";
            if (i3 != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            java.lang.String[] strArr3 = A0D;
            strArr3[5] = "IMKoiDvvCDDjTstg5y8jUH39vKJ";
            strArr3[2] = "dNVNz1d7KLdHR07hVoK1ajJHU4Y";
            if (i3 != 0) {
                z = true;
            } else {
                z = false;
            }
        }
        int tsPacketHeader = (2096896 & pid) >> 8;
        boolean payloadUnitStartIndicator = (pid & 32) != 0;
        boolean payloadExists = (pid & 16) != 0;
        if (payloadExists) {
            di = this.A06.get(tsPacketHeader);
        } else {
            di = null;
        }
        if (di != null) {
            if (this.A05 != 2) {
                int previousCounter = pid & 15;
                int i4 = this.A08.get(tsPacketHeader, previousCounter - 1);
                this.A08.put(tsPacketHeader, previousCounter);
                if (i4 == previousCounter) {
                    this.A0A.A0Y(searchStart);
                    return 0;
                }
                if (previousCounter != ((i4 + 1) & 15)) {
                    di.AG6();
                }
            }
            if (payloadUnitStartIndicator) {
                this.A0A.A0Z(this.A0A.A0E());
            }
            this.A0A.A0X(searchStart);
            di.A4o(this.A0A, z);
            this.A0A.A0X(iA08);
            this.A0A.A0Y(searchStart);
            return 0;
        }
        this.A0A.A0Y(searchStart);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final void AG7(long j, long j2) {
        int size = this.A0B.size();
        for (int i = 0; i < size; i++) {
            this.A0B.get(i).A08();
        }
        this.A0A.A0V();
        this.A08.clear();
        A0F();
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final boolean AGs(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        byte[] bArr = this.A0A.A00;
        interfaceC0610By.AEO(bArr, 0, 940);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                int j = A0D[4].charAt(29);
                if (j != 52) {
                    throw new java.lang.RuntimeException();
                }
                A0D[4] = "eeZVGRLgQ6ycx1TKwzFGL5x5hafhS4uk";
                if (i2 == 5) {
                    interfaceC0610By.AGq(i);
                    return true;
                }
                int j2 = bArr[(i2 * 188) + i];
                if (j2 != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }
}
