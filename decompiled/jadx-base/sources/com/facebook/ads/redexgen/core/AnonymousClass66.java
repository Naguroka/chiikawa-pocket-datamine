package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.66, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass66 extends com.facebook.ads.redexgen.core.AbstractC0666Ee implements android.os.Handler.Callback {
    public static java.lang.String[] A0D = {"3hA3hEaqtnmobtKNR2kBBTtved21rXwe", "d00WeJBXtxGdjHumPCogae6hmL", "V3BKelPK", "LQ7ajOPvMri4UVBGHGKq5A2XMp5US8wn", "aO3vNkBPz686GW1RQIhbehKuZYa8jCXF", "", "AGk0mWwzzGVlhCwytPNvLIpQoO", "GzTesuYtGJubeKMXgzMFnLbwnyU"};
    public int A00;
    public int A01;
    public com.facebook.ads.internal.exoplayer2.thirdparty.Format A02;
    public com.facebook.ads.redexgen.core.XQ A03;
    public com.facebook.ads.redexgen.core.DO A04;
    public com.facebook.ads.redexgen.core.DM A05;
    public com.facebook.ads.redexgen.core.DM A06;
    public boolean A07;
    public boolean A08;
    public final android.os.Handler A09;
    public final com.facebook.ads.redexgen.core.C05569u A0A;
    public final com.facebook.ads.redexgen.core.InterfaceC0696Fv A0B;
    public final com.facebook.ads.redexgen.core.InterfaceC0697Fw A0C;

    public AnonymousClass66(com.facebook.ads.redexgen.core.InterfaceC0697Fw interfaceC0697Fw, android.os.Looper looper) {
        this(interfaceC0697Fw, looper, com.facebook.ads.redexgen.core.InterfaceC0696Fv.A00);
    }

    public AnonymousClass66(com.facebook.ads.redexgen.core.InterfaceC0697Fw interfaceC0697Fw, android.os.Looper looper, com.facebook.ads.redexgen.core.InterfaceC0696Fv interfaceC0696Fv) {
        super(3);
        this.A0C = (com.facebook.ads.redexgen.core.InterfaceC0697Fw) com.facebook.ads.redexgen.core.AbstractC0730Hf.A01(interfaceC0697Fw);
        this.A09 = looper == null ? null : new android.os.Handler(looper, this);
        this.A0B = interfaceC0696Fv;
        this.A0A = new com.facebook.ads.redexgen.core.C05569u();
    }

    private long A00() {
        if (this.A01 == -1 || this.A01 >= this.A06.A7P()) {
            return Long.MAX_VALUE;
        }
        return this.A06.A7O(this.A01);
    }

    private void A01() {
        A06(java.util.Collections.emptyList());
    }

    private void A02() {
        this.A04 = null;
        this.A01 = -1;
        if (this.A06 != null) {
            this.A06.A08();
            this.A06 = null;
        }
        if (this.A05 != null) {
            this.A05.A08();
            this.A05 = null;
        }
    }

    private void A03() {
        A02();
        this.A03.AEy();
        this.A03 = null;
        this.A00 = 0;
    }

    private void A04() {
        A03();
        this.A03 = this.A0B.A4v(this.A02);
    }

    private void A05(java.util.List<com.facebook.ads.redexgen.core.C0693Fs> list) {
        this.A0C.ABg(list);
    }

    private void A06(java.util.List<com.facebook.ads.redexgen.core.C0693Fs> list) {
        if (this.A09 != null) {
            this.A09.obtainMessage(0, list).sendToTarget();
        } else {
            A05(list);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0666Ee
    public final void A15() {
        this.A02 = null;
        A01();
        A03();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0666Ee
    public final void A16(long j, boolean z) {
        A01();
        this.A07 = false;
        this.A08 = false;
        if (this.A00 != 0) {
            A04();
        } else {
            A02();
            this.A03.flush();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0666Ee
    public final void A18(com.facebook.ads.internal.exoplayer2.thirdparty.Format[] formatArr, long j) throws com.facebook.ads.redexgen.core.C05449h {
        this.A02 = formatArr[0];
        if (this.A03 != null) {
            this.A00 = 1;
        } else {
            this.A03 = this.A0B.A4v(this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.core.ZA
    public final boolean A9Q() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.core.ZA
    public final boolean A9b() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:51:0x010c  */
    @Override // com.facebook.ads.redexgen.core.ZA
    public final void AFe(long j, long j2) throws java.lang.Exception {
        com.facebook.ads.redexgen.core.DM dm;
        java.lang.String[] strArr;
        if (this.A08) {
            return;
        }
        if (this.A05 == null) {
            this.A03.AGb(j);
            try {
                this.A05 = this.A03.A5R();
            } catch (com.facebook.ads.redexgen.core.C0695Fu e) {
                throw com.facebook.ads.redexgen.core.C05449h.A01(e, A0z());
            }
        }
        if (A8P() != 2) {
            return;
        }
        boolean z = false;
        com.facebook.ads.redexgen.core.DM dm2 = this.A06;
        java.lang.String[] strArr2 = A0D;
        if (strArr2[5].length() == strArr2[2].length()) {
            throw new java.lang.RuntimeException();
        }
        A0D[7] = "HaKpHtSAcDStHfDy2x825hXC7ny";
        if (dm2 != null) {
            long jA00 = A00();
            while (jA00 <= j) {
                this.A01++;
                jA00 = A00();
                z = true;
            }
        }
        if (this.A05 != null) {
            boolean textRendererNeedsUpdate = this.A05.A04();
            if (!textRendererNeedsUpdate) {
                long j3 = ((com.facebook.ads.redexgen.core.AbstractC1176Yv) this.A05).A01;
                if (A0D[4].charAt(24) != 'c') {
                    java.lang.String[] strArr3 = A0D;
                    strArr3[5] = "";
                    strArr3[2] = "4FVTQdFf";
                    if (j3 <= j) {
                        dm = this.A06;
                        strArr = A0D;
                        if (strArr[1].length() != strArr[6].length()) {
                            java.lang.String[] strArr4 = A0D;
                            strArr4[5] = "";
                            strArr4[2] = "cCkc8Lor";
                            if (dm != null) {
                                this.A06.A08();
                            }
                        } else {
                            java.lang.String[] strArr5 = A0D;
                            strArr5[5] = "";
                            strArr5[2] = "MHQEiJiB";
                            if (dm != null) {
                                this.A06.A08();
                            }
                        }
                        this.A06 = this.A05;
                        this.A05 = null;
                        this.A01 = this.A06.A7r(j);
                        z = true;
                    }
                } else if (j3 <= j) {
                    dm = this.A06;
                    strArr = A0D;
                    if (strArr[1].length() != strArr[6].length()) {
                        java.lang.String[] strArr6 = A0D;
                        strArr6[5] = "";
                        strArr6[2] = "cCkc8Lor";
                        if (dm != null) {
                            this.A06.A08();
                        }
                    } else {
                        java.lang.String[] strArr7 = A0D;
                        strArr7[5] = "";
                        strArr7[2] = "MHQEiJiB";
                        if (dm != null) {
                            this.A06.A08();
                        }
                    }
                    this.A06 = this.A05;
                    this.A05 = null;
                    this.A01 = this.A06.A7r(j);
                    z = true;
                }
            } else if (!z && A00() == Long.MAX_VALUE) {
                if (this.A00 == 2) {
                    A04();
                } else {
                    A02();
                    if (A0D[4].charAt(24) == 'c') {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr8 = A0D;
                    strArr8[5] = "";
                    strArr8[2] = "Cihemvvi";
                    this.A08 = true;
                }
            }
        }
        if (z) {
            A06(this.A06.A6x(j));
        }
        if (this.A00 == 2) {
            return;
        }
        while (true) {
            try {
                boolean textRendererNeedsUpdate2 = this.A07;
                if (!textRendererNeedsUpdate2) {
                    if (this.A04 == null) {
                        this.A04 = this.A03.A5Q();
                        if (this.A04 == null) {
                            return;
                        }
                    }
                    if (this.A00 == 1) {
                        this.A04.A02(4);
                        this.A03.AEj(this.A04);
                        this.A04 = null;
                        this.A00 = 2;
                        return;
                    }
                    int iA11 = A11(this.A0A, this.A04, false);
                    if (iA11 == -4) {
                        boolean textRendererNeedsUpdate3 = this.A04.A04();
                        if (textRendererNeedsUpdate3) {
                            this.A07 = true;
                        } else {
                            this.A04.A00 = this.A0A.A00.A0G;
                            this.A04.A08();
                        }
                        this.A03.AEj(this.A04);
                        this.A04 = null;
                    } else if (iA11 == -3) {
                        return;
                    }
                } else {
                    return;
                }
            } catch (com.facebook.ads.redexgen.core.C0695Fu e2) {
                throw com.facebook.ads.redexgen.core.C05449h.A01(e2, A0z());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AF
    public final int AH6(com.facebook.ads.internal.exoplayer2.thirdparty.Format format) {
        if (this.A0B.AH7(format)) {
            return com.facebook.ads.redexgen.core.AbstractC0666Ee.A0y(null, format.A0H) ? 4 : 2;
        }
        if (!com.facebook.ads.redexgen.core.AbstractC0748Hx.A0A(format.A0O)) {
            return 0;
        }
        if (A0D[4].charAt(24) == 'c') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0D;
        strArr[5] = "";
        strArr[2] = "jIB0EZuh";
        return 1;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        switch (message.what) {
            case 0:
                java.util.List<com.facebook.ads.redexgen.core.C0693Fs> list = (java.util.List) message.obj;
                if (A0D[4].charAt(24) == 'c') {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0D;
                strArr[1] = "331Gsuq8S7wfWBS8jIctkbUTPr";
                strArr[6] = "KHUhuMJXaiRGhsQX4fJpTr5XSi";
                A05(list);
                return true;
            default:
                throw new java.lang.IllegalStateException();
        }
    }
}
