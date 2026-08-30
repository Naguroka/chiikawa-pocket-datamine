package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1153Xy implements com.facebook.ads.redexgen.core.DI {
    public static java.lang.String[] A06 = {"7KhjQyd5srDfISX3OvJPA40QhHjbX7cJ", "dUap2eKxV", "ODCKCF1tjk2SY", "dx04XVkYXAdYdHLxgcFE2nTowHcN6V0M", "AglIOiNCR1Dak6huZtCiSMmc6GzIjF8M", "UIjiXptLQ8bS6WOpqXDFU5DO", "flVaSkZhqYGEIEuowlI", "61jPiQbS2wfpOxkxi4o"};
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final com.facebook.ads.redexgen.core.DB A04;
    public final com.facebook.ads.redexgen.core.I4 A05 = new com.facebook.ads.redexgen.core.I4(32);

    public C1153Xy(com.facebook.ads.redexgen.core.DB db) {
        this.A04 = db;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x010e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0117  */
    /* JADX WARN: Code duplicated, block: B:44:0x0127  */
    /* JADX WARN: Code duplicated, block: B:50:0x014b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0155  */
    /* JADX WARN: Code duplicated, block: B:63:0x0124 A[SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.core.DI
    public final void A4o(com.facebook.ads.redexgen.core.I4 i4, boolean z) {
        boolean z2;
        int bodyBytesToRead;
        int payloadStartPosition;
        int payloadStartOffset = -1;
        if (z) {
            int payloadStartPosition2 = i4.A0E();
            int payloadStartOffset2 = i4.A06();
            payloadStartOffset = payloadStartOffset2 + payloadStartPosition2;
        }
        if (this.A03) {
            if (!z) {
                return;
            }
            this.A03 = false;
            i4.A0Y(payloadStartOffset);
            this.A00 = 0;
        }
        while (payloadStartPosition > 0) {
            int i = this.A00;
            if (A06[1].length() != 9) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A06;
            strArr[6] = "Q2Y4tUBv36Q6sRpvhIV";
            strArr[7] = "rjxSBrPQ8nf1dRknAco";
            if (i < 3) {
                if (this.A00 == 0) {
                    int iA0E = i4.A0E();
                    int tableId = i4.A06();
                    i4.A0Y(tableId - 1);
                    if (iA0E == 255) {
                        this.A03 = true;
                        return;
                    }
                }
                int iMin = java.lang.Math.min(i4.A04(), 3 - this.A00);
                byte[] bArr = this.A05.A00;
                int headerBytesToRead = this.A00;
                i4.A0c(bArr, headerBytesToRead, iMin);
                int headerBytesToRead2 = this.A00;
                this.A00 = headerBytesToRead2 + iMin;
                int headerBytesToRead3 = this.A00;
                if (headerBytesToRead3 == 3) {
                    this.A05.A0W(3);
                    this.A05.A0Z(1);
                    int secondHeaderByte = this.A05.A0E();
                    int iA0E2 = this.A05.A0E();
                    int headerBytesToRead4 = secondHeaderByte & 128;
                    this.A02 = headerBytesToRead4 != 0;
                    int headerBytesToRead5 = secondHeaderByte & 15;
                    this.A01 = ((headerBytesToRead5 << 8) | iA0E2) + 3;
                    int iA05 = this.A05.A05();
                    int headerBytesToRead6 = this.A01;
                    if (iA05 < headerBytesToRead6) {
                        byte[] bArr2 = this.A05.A00;
                        com.facebook.ads.redexgen.core.I4 i5 = this.A05;
                        int i2 = this.A01;
                        int headerBytesToRead7 = bArr2.length;
                        i5.A0W(java.lang.Math.min(androidx.core.view.InputDeviceCompat.SOURCE_TOUCHSCREEN, java.lang.Math.max(i2, headerBytesToRead7 * 2)));
                        java.lang.System.arraycopy(bArr2, 0, this.A05.A00, 0, 3);
                    }
                }
            } else {
                int iA04 = i4.A04();
                int headerBytesToRead8 = this.A01;
                int payloadStartPosition3 = this.A00;
                int iMin2 = java.lang.Math.min(iA04, headerBytesToRead8 - payloadStartPosition3);
                byte[] bArr3 = this.A05.A00;
                int payloadStartPosition4 = this.A00;
                i4.A0c(bArr3, payloadStartPosition4, iMin2);
                int secondHeaderByte2 = this.A00 + iMin2;
                java.lang.String[] strArr2 = A06;
                java.lang.String str = strArr2[6];
                java.lang.String str2 = strArr2[7];
                int bodyBytesToRead2 = str.length();
                int payloadStartPosition5 = str2.length();
                if (bodyBytesToRead2 != payloadStartPosition5) {
                    this.A00 = secondHeaderByte2;
                    int bodyBytesToRead3 = this.A00;
                    int payloadStartPosition6 = this.A01;
                    if (bodyBytesToRead3 == payloadStartPosition6) {
                        z2 = this.A02;
                        bodyBytesToRead = A06[2].length();
                        if (bodyBytesToRead != 12) {
                            A06[1] = "n9xVZhrIv";
                            if (z2) {
                                byte[] bArr4 = this.A05.A00;
                                int bodyBytesToRead4 = this.A01;
                                payloadStartPosition = com.facebook.ads.redexgen.core.IK.A09(bArr4, 0, bodyBytesToRead4, -1);
                                if (payloadStartPosition != 0) {
                                    this.A03 = true;
                                    return;
                                } else {
                                    com.facebook.ads.redexgen.core.I4 i6 = this.A05;
                                    int payloadStartPosition7 = this.A01;
                                    i6.A0W(payloadStartPosition7 - 4);
                                }
                            } else {
                                com.facebook.ads.redexgen.core.I4 i7 = this.A05;
                                int payloadStartPosition8 = this.A01;
                                i7.A0W(payloadStartPosition8);
                            }
                        } else {
                            java.lang.String[] strArr3 = A06;
                            strArr3[6] = "pz9f4PYVe3KcMtmdSos";
                            strArr3[7] = "DEtYMSixJlouUmY2wxK";
                            if (z2) {
                                byte[] bArr5 = this.A05.A00;
                                int bodyBytesToRead5 = this.A01;
                                payloadStartPosition = com.facebook.ads.redexgen.core.IK.A09(bArr5, 0, bodyBytesToRead5, -1);
                                if (payloadStartPosition != 0) {
                                    this.A03 = true;
                                    return;
                                } else {
                                    com.facebook.ads.redexgen.core.I4 i8 = this.A05;
                                    int payloadStartPosition9 = this.A01;
                                    i8.A0W(payloadStartPosition9 - 4);
                                }
                            } else {
                                com.facebook.ads.redexgen.core.I4 i9 = this.A05;
                                int payloadStartPosition10 = this.A01;
                                i9.A0W(payloadStartPosition10);
                            }
                        }
                        this.A04.A4n(this.A05);
                        this.A00 = 0;
                    } else {
                        continue;
                    }
                } else {
                    java.lang.String[] strArr4 = A06;
                    strArr4[4] = "mbEza70vKSWcIGq9KQJUc5ck0lbgeNs0";
                    strArr4[3] = "DDGUdUFwq7gohVd7sScFWF3MfEU7a9up";
                    this.A00 = secondHeaderByte2;
                    int bodyBytesToRead6 = this.A00;
                    int payloadStartPosition11 = this.A01;
                    if (bodyBytesToRead6 == payloadStartPosition11) {
                        z2 = this.A02;
                        bodyBytesToRead = A06[2].length();
                        if (bodyBytesToRead != 12) {
                            A06[1] = "n9xVZhrIv";
                            if (z2) {
                                byte[] bArr6 = this.A05.A00;
                                int bodyBytesToRead7 = this.A01;
                                payloadStartPosition = com.facebook.ads.redexgen.core.IK.A09(bArr6, 0, bodyBytesToRead7, -1);
                                if (payloadStartPosition != 0) {
                                    this.A03 = true;
                                    return;
                                } else {
                                    com.facebook.ads.redexgen.core.I4 i10 = this.A05;
                                    int payloadStartPosition12 = this.A01;
                                    i10.A0W(payloadStartPosition12 - 4);
                                }
                            } else {
                                com.facebook.ads.redexgen.core.I4 i11 = this.A05;
                                int payloadStartPosition13 = this.A01;
                                i11.A0W(payloadStartPosition13);
                            }
                        } else {
                            java.lang.String[] strArr5 = A06;
                            strArr5[6] = "pz9f4PYVe3KcMtmdSos";
                            strArr5[7] = "DEtYMSixJlouUmY2wxK";
                            if (z2) {
                                byte[] bArr7 = this.A05.A00;
                                int bodyBytesToRead8 = this.A01;
                                payloadStartPosition = com.facebook.ads.redexgen.core.IK.A09(bArr7, 0, bodyBytesToRead8, -1);
                                if (payloadStartPosition != 0) {
                                    this.A03 = true;
                                    return;
                                } else {
                                    com.facebook.ads.redexgen.core.I4 i12 = this.A05;
                                    int payloadStartPosition14 = this.A01;
                                    i12.A0W(payloadStartPosition14 - 4);
                                }
                            } else {
                                com.facebook.ads.redexgen.core.I4 i13 = this.A05;
                                int payloadStartPosition15 = this.A01;
                                i13.A0W(payloadStartPosition15);
                            }
                        }
                        this.A04.A4n(this.A05);
                        this.A00 = 0;
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.DI
    public final void A9F(com.facebook.ads.redexgen.core.IG ig, com.facebook.ads.redexgen.core.InterfaceC0611Bz interfaceC0611Bz, com.facebook.ads.redexgen.core.DH dh) {
        this.A04.A9F(ig, interfaceC0611Bz, dh);
        this.A03 = true;
    }

    @Override // com.facebook.ads.redexgen.core.DI
    public final void AG6() {
        this.A03 = true;
    }
}
