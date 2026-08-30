package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YZ implements com.facebook.ads.redexgen.core.InterfaceC0609Bx {
    public static byte[] A0E;
    public static java.lang.String[] A0F = {"gDm2H1R3m6yZ3T7V59CZPndmLoiqHRQj", "YSWu78fDKIpmvI0F4t4nR2Q3czKooreS", "12WKKiTRAgVXDyndmQKPSMB1OWZuMVMS", "RRcKBVagkGMLXlkVdQcqgvrWfP2Vnh6L", "1", "PIbxLRQ24m9lmu6H9QUm2hoYxLQCtqJ9", "Ogtu3pi4aRA4nU43PccgmX4SJllkopYZ", "F8bPDucd7xmw9lysYZ4"};
    public static final com.facebook.ads.redexgen.core.C0 A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public com.facebook.ads.redexgen.core.InterfaceC0611Bz A04;
    public com.facebook.ads.redexgen.core.C9 A05;
    public com.facebook.ads.redexgen.core.InterfaceC1155Ya A06;
    public com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata A07;
    public final int A08;
    public final long A09;
    public final com.facebook.ads.redexgen.core.C1 A0A;
    public final com.facebook.ads.redexgen.core.C2 A0B;
    public final com.facebook.ads.redexgen.core.C3 A0C;
    public final com.facebook.ads.redexgen.core.I4 A0D;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 116);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A05() {
        if (A0F[4].length() != 1) {
            throw new java.lang.RuntimeException();
        }
        A0F[4] = androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS;
        A0E = new byte[]{71, 96, 104, 97, 96, 86, 82, 65, 80, 91, 86, 87, 19, 71, 92, 92, 19, 94, 82, 93, 74, 19, 81, 74, 71, 86, 64, 29, 90, 78, 94, 69, 28, 45, 42, 35};
    }

    static {
        A05();
        A0G = new com.facebook.ads.redexgen.core.C1156Yb();
        A0J = com.facebook.ads.redexgen.core.IK.A08(A04(32, 4, 48));
        A0H = com.facebook.ads.redexgen.core.IK.A08(A04(0, 4, 122));
        A0I = com.facebook.ads.redexgen.core.IK.A08(A04(28, 4, 120));
    }

    public YZ() {
        this(0);
    }

    public YZ(int i) {
        this(i, androidx.media3.common.C.TIME_UNSET);
    }

    public YZ(int i, long j) {
        this.A08 = i;
        this.A09 = j;
        this.A0D = new com.facebook.ads.redexgen.core.I4(10);
        this.A0C = new com.facebook.ads.redexgen.core.C3();
        this.A0A = new com.facebook.ads.redexgen.core.C1();
        this.A02 = androidx.media3.common.C.TIME_UNSET;
        this.A0B = new com.facebook.ads.redexgen.core.C2();
    }

    private int A00(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        if (this.A00 == 0) {
            interfaceC0610By.AFq();
            if (!interfaceC0610By.AEP(this.A0D.A00, 0, 4, true)) {
                return -1;
            }
            this.A0D.A0Y(0);
            int iA08 = this.A0D.A08();
            int sampleHeaderData = this.A01;
            if (A06(iA08, sampleHeaderData)) {
                int sampleHeaderData2 = com.facebook.ads.redexgen.core.C3.A00(iA08);
                if (sampleHeaderData2 != -1) {
                    com.facebook.ads.redexgen.core.C3.A04(iA08, this.A0C);
                    if (this.A02 == androidx.media3.common.C.TIME_UNSET) {
                        this.A02 = this.A06.A8W(interfaceC0610By.A86());
                        if (this.A09 != androidx.media3.common.C.TIME_UNSET) {
                            this.A02 += this.A09 - this.A06.A8W(0L);
                        }
                    }
                    int sampleHeaderData3 = this.A0C.A02;
                    this.A00 = sampleHeaderData3;
                }
            }
            interfaceC0610By.AGq(1);
            this.A01 = 0;
            return 0;
        }
        int iAFu = this.A05.AFu(interfaceC0610By, this.A00, true);
        if (iAFu == -1) {
            return -1;
        }
        int bytesAppended = this.A00;
        this.A00 = bytesAppended - iAFu;
        int bytesAppended2 = this.A00;
        if (bytesAppended2 > 0) {
            return 0;
        }
        long j = this.A02;
        long j2 = this.A03 * 1000000;
        int bytesAppended3 = this.A0C.A03;
        this.A05.AFw(j + (j2 / ((long) bytesAppended3)), 1, this.A0C.A02, 0, null);
        long j3 = this.A03;
        int bytesAppended4 = this.A0C.A04;
        this.A03 = j3 + ((long) bytesAppended4);
        this.A00 = 0;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r4 == r3) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A01(com.facebook.ads.redexgen.core.I4 i4, int i) {
        if (i4.A07() >= i + 4) {
            i4.A0Y(i);
            int iA08 = i4.A08();
            int headerData = A0J;
            if (iA08 != headerData) {
                int i2 = A0H;
                if (A0F[4].length() != 1) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0F;
                strArr[0] = "4CmTESmhzVSPcPiVjQG1aJL4QuOhOvuP";
                strArr[3] = "QBRZbVrwma52PJOV3OuwYxyYzHl6wY0l";
            }
            return iA08;
        }
        if (i4.A07() >= 40) {
            i4.A0Y(36);
            if (i4.A08() == A0I) {
                return A0I;
            }
            return 0;
        }
        return 0;
    }

    private com.facebook.ads.redexgen.core.C0662Ea A02(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        interfaceC0610By.AEO(this.A0D.A00, 0, 4);
        this.A0D.A0Y(0);
        com.facebook.ads.redexgen.core.C3.A04(this.A0D.A08(), this.A0C);
        return new com.facebook.ads.redexgen.core.C0662Ea(interfaceC0610By.A7g(), interfaceC0610By.A86(), this.A0C);
    }

    private com.facebook.ads.redexgen.core.InterfaceC1155Ya A03(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        com.facebook.ads.redexgen.core.I4 i4 = new com.facebook.ads.redexgen.core.I4(this.A0C.A02);
        interfaceC0610By.AEO(i4.A00, 0, this.A0C.A02);
        int i = 21;
        if ((this.A0C.A05 & 1) != 0) {
            if (this.A0C.A01 != 1) {
                i = 36;
            }
        } else if (this.A0C.A01 == 1) {
            i = 13;
        }
        int xingBase = A01(i4, i);
        if (xingBase == A0J || xingBase == A0H) {
            com.facebook.ads.redexgen.core.EY eyA01 = com.facebook.ads.redexgen.core.EY.A01(interfaceC0610By.A7g(), interfaceC0610By.A86(), this.A0C, i4);
            if (eyA01 != null && !this.A0A.A03()) {
                interfaceC0610By.AFq();
                interfaceC0610By.A3s(i + 141);
                com.facebook.ads.redexgen.core.I4 frame = this.A0D;
                interfaceC0610By.AEO(frame.A00, 0, 3);
                com.facebook.ads.redexgen.core.I4 frame2 = this.A0D;
                frame2.A0Y(0);
                com.facebook.ads.redexgen.core.C1 c1 = this.A0A;
                com.facebook.ads.redexgen.core.I4 frame3 = this.A0D;
                c1.A04(frame3.A0G());
            }
            interfaceC0610By.AGq(this.A0C.A02);
            if (eyA01 != null && !eyA01.A9h() && xingBase == A0H) {
                return A02(interfaceC0610By);
            }
            return eyA01;
        }
        if (xingBase == A0I) {
            com.facebook.ads.redexgen.core.EZ ezA00 = com.facebook.ads.redexgen.core.EZ.A00(interfaceC0610By.A7g(), interfaceC0610By.A86(), this.A0C, i4);
            interfaceC0610By.AGq(this.A0C.A02);
            return ezA00;
        }
        interfaceC0610By.AFq();
        return null;
    }

    public static boolean A06(int i, long j) {
        return ((long) ((-128000) & i)) == ((-128000) & j);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0083 A[EDGE_INSN: B:69:0x0083->B:32:0x0083 BREAK  A[LOOP:0: B:25:0x0061->B:70:0x0061], SYNTHETIC] */
    private boolean A07(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, boolean z) throws java.lang.InterruptedException, java.io.IOException {
        int iA08;
        int candidateSynchronizedHeaderData;
        int frameSize = 0;
        int i = 0;
        int searchedBytes = 0;
        int headerData = 0;
        int searchLimitBytes = z ? 16384 : 131072;
        interfaceC0610By.AFq();
        if (interfaceC0610By.A86() == 0) {
            int validFrameCount = this.A08;
            int validFrameCount2 = (validFrameCount & 2) != 0 ? 1 : 0;
            this.A07 = this.A0B.A00(interfaceC0610By, validFrameCount2 != 0 ? com.facebook.ads.redexgen.core.C1.A04 : null);
            com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata metadata = this.A07;
            if (A0F[5].charAt(2) != 98) {
                throw new java.lang.RuntimeException();
            }
            A0F[5] = "PEb5SRCKki47SruBSb47nBh27Jlp7yXw";
            if (metadata != null) {
                this.A0A.A05(this.A07);
            }
            searchedBytes = (int) interfaceC0610By.A81();
            if (!z) {
                interfaceC0610By.AGq(searchedBytes);
            }
        }
        while (true) {
            boolean zAEP = interfaceC0610By.AEP(this.A0D.A00, 0, 4, frameSize > 0);
            if (A0F[7].length() != 10) {
                A0F[4] = androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D;
                if (!zAEP) {
                    break;
                }
                this.A0D.A0Y(0);
                iA08 = this.A0D.A08();
                if ((i == 0 && !A06(iA08, i)) || (candidateSynchronizedHeaderData = com.facebook.ads.redexgen.core.C3.A00(iA08)) == -1) {
                    int candidateSynchronizedHeaderData2 = headerData + 1;
                    if (headerData == searchLimitBytes) {
                        if (z) {
                            return false;
                        }
                        throw new com.facebook.ads.redexgen.core.A0(A04(4, 24, 71));
                    }
                    frameSize = 0;
                    i = 0;
                    if (z) {
                        interfaceC0610By.AFq();
                        int validFrameCount3 = searchedBytes + candidateSynchronizedHeaderData2;
                        interfaceC0610By.A3s(validFrameCount3);
                    } else {
                        interfaceC0610By.AGq(1);
                    }
                    headerData = candidateSynchronizedHeaderData2;
                } else {
                    frameSize++;
                    if (frameSize == 1) {
                        com.facebook.ads.redexgen.core.C3.A04(iA08, this.A0C);
                        i = iA08;
                    } else if (frameSize == 4) {
                        break;
                    }
                    int validFrameCount4 = candidateSynchronizedHeaderData - 4;
                    interfaceC0610By.A3s(validFrameCount4);
                }
            } else {
                if (!zAEP) {
                    break;
                }
                this.A0D.A0Y(0);
                iA08 = this.A0D.A08();
                if (i == 0) {
                    frameSize++;
                    if (frameSize == 1) {
                        com.facebook.ads.redexgen.core.C3.A04(iA08, this.A0C);
                        i = iA08;
                    } else if (frameSize == 4) {
                        break;
                        break;
                    }
                    int validFrameCount5 = candidateSynchronizedHeaderData - 4;
                    interfaceC0610By.A3s(validFrameCount5);
                } else {
                    frameSize++;
                    if (frameSize == 1) {
                        com.facebook.ads.redexgen.core.C3.A04(iA08, this.A0C);
                        i = iA08;
                    } else if (frameSize == 4) {
                        break;
                        break;
                    }
                    int validFrameCount6 = candidateSynchronizedHeaderData - 4;
                    interfaceC0610By.A3s(validFrameCount6);
                }
            }
        }
        if (z) {
            interfaceC0610By.AGq(searchedBytes + headerData);
        } else {
            interfaceC0610By.AFq();
        }
        this.A01 = i;
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final void A9D(com.facebook.ads.redexgen.core.InterfaceC0611Bz interfaceC0611Bz) {
        this.A04 = interfaceC0611Bz;
        this.A05 = this.A04.AHA(0, 1);
        this.A04.A5u();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final int AEk(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, com.facebook.ads.redexgen.core.C4 c4) throws java.lang.InterruptedException, java.io.IOException {
        if (this.A01 == 0) {
            try {
                A07(interfaceC0610By, false);
            } catch (java.io.EOFException unused) {
                return -1;
            }
        }
        if (this.A06 == null) {
            this.A06 = A03(interfaceC0610By);
            if (this.A06 == null || (!this.A06.A9h() && (this.A08 & 1) != 0)) {
                this.A06 = A02(interfaceC0610By);
            }
            this.A04.AG8(this.A06);
            this.A05.A69(com.facebook.ads.internal.exoplayer2.thirdparty.Format.A05(null, this.A0C.A06, null, -1, 4096, this.A0C.A01, this.A0C.A03, -1, this.A0A.A00, this.A0A.A01, null, null, 0, null, (this.A08 & 2) != 0 ? null : this.A07));
        }
        return A00(interfaceC0610By);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final void AG7(long j, long j2) {
        this.A01 = 0;
        this.A02 = androidx.media3.common.C.TIME_UNSET;
        this.A03 = 0L;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final boolean AGs(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        return A07(interfaceC0610By, true);
    }
}
