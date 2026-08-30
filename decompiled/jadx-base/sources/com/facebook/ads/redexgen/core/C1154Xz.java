package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1154Xz implements com.facebook.ads.redexgen.core.InterfaceC0609Bx {
    public static java.lang.String[] A08 = {"TOwSaeopWt9RIXmRrRQZwDuesIPAjimN", "m0YfCnzLjOMwBkPVrsGxjCiWTjg4eRpW", "OSs4RcvEx1fqe6WQBFkQnVWQQo5eEQ5g", "d1b9lbTXuFgKm0nY", "40KeqNYkGIg2lKcWJqrJfIqB2UKZ02Df", "7BwS2S40JWuyc5xmMzDJ", "w0DKA7VvSD5aMvU9byhgHeDf3SsHODBV", "AZ8mKiYMDCexUwniF0cO0Lykq6xa72Qc"};
    public static final com.facebook.ads.redexgen.core.C0 A09 = new com.facebook.ads.redexgen.core.Y0();
    public long A00;
    public com.facebook.ads.redexgen.core.InterfaceC0611Bz A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final android.util.SparseArray<com.facebook.ads.redexgen.core.DA> A05;
    public final com.facebook.ads.redexgen.core.I4 A06;
    public final com.facebook.ads.redexgen.core.IG A07;

    public C1154Xz() {
        this(new com.facebook.ads.redexgen.core.IG(0L));
    }

    public C1154Xz(com.facebook.ads.redexgen.core.IG ig) {
        this.A07 = ig;
        this.A06 = new com.facebook.ads.redexgen.core.I4(4096);
        this.A05 = new android.util.SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final void A9D(com.facebook.ads.redexgen.core.InterfaceC0611Bz interfaceC0611Bz) {
        this.A01 = interfaceC0611Bz;
        interfaceC0611Bz.AG8(new com.facebook.ads.redexgen.core.C1169Yo(androidx.media3.common.C.TIME_UNSET));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final int AEk(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, com.facebook.ads.redexgen.core.C4 c4) throws java.lang.InterruptedException, java.io.IOException {
        long j;
        if (!interfaceC0610By.AEP(this.A06.A00, 0, 4, true)) {
            return -1;
        }
        this.A06.A0Y(0);
        int iA08 = this.A06.A08();
        if (iA08 == 441) {
            return -1;
        }
        if (iA08 == 442) {
            interfaceC0610By.AEO(this.A06.A00, 0, 10);
            this.A06.A0Y(9);
            int nextStartCode = this.A06.A0E();
            interfaceC0610By.AGq((nextStartCode & 7) + 14);
            return 0;
        }
        if (iA08 == 443) {
            interfaceC0610By.AEO(this.A06.A00, 0, 2);
            this.A06.A0Y(0);
            int nextStartCode2 = this.A06.A0I();
            interfaceC0610By.AGq(nextStartCode2 + 6);
            return 0;
        }
        int nextStartCode3 = iA08 & androidx.core.view.InputDeviceCompat.SOURCE_ANY;
        if ((nextStartCode3 >> 8) != 1) {
            interfaceC0610By.AGq(1);
            return 0;
        }
        int i = iA08 & 255;
        com.facebook.ads.redexgen.core.DA da = this.A05.get(i);
        if (!this.A02) {
            if (da == null) {
                com.facebook.ads.redexgen.core.D3 elementaryStreamReader = null;
                if (i == 189) {
                    elementaryStreamReader = new com.facebook.ads.redexgen.core.YE();
                    this.A03 = true;
                    this.A00 = interfaceC0610By.A86();
                } else if ((i & 224) == 192) {
                    elementaryStreamReader = new com.facebook.ads.redexgen.core.Y2();
                    this.A03 = true;
                    this.A00 = interfaceC0610By.A86();
                } else if ((i & androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK) == 224) {
                    elementaryStreamReader = new com.facebook.ads.redexgen.core.Y7();
                    this.A04 = true;
                    this.A00 = interfaceC0610By.A86();
                }
                if (elementaryStreamReader != null) {
                    elementaryStreamReader.A5B(this.A01, new com.facebook.ads.redexgen.core.DH(i, 256));
                    da = new com.facebook.ads.redexgen.core.DA(elementaryStreamReader, this.A07);
                    this.A05.put(i, da);
                }
            }
            if (this.A03 && this.A04) {
                j = this.A00 + 8192;
            } else {
                j = 1048576;
            }
            if (interfaceC0610By.A86() > j) {
                this.A02 = true;
                this.A01.A5u();
            }
        }
        interfaceC0610By.AEO(this.A06.A00, 0, 2);
        this.A06.A0Y(0);
        int nextStartCode4 = this.A06.A0I();
        int i2 = nextStartCode4 + 6;
        if (da == null) {
            interfaceC0610By.AGq(i2);
        } else {
            com.facebook.ads.redexgen.core.I4 i4 = this.A06;
            if (A08[3].length() != 16) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A08;
            strArr[1] = "j5TposUyMNBjvJQv7fBjXCxPICHPLvzQ";
            strArr[4] = "7epKzrJqV329mASYJ56vhWx8nQlYd13J";
            i4.A0W(i2);
            interfaceC0610By.readFully(this.A06.A00, 0, i2);
            this.A06.A0Y(6);
            da.A03(this.A06);
            com.facebook.ads.redexgen.core.I4 i5 = this.A06;
            int nextStartCode5 = this.A06.A05();
            i5.A0X(nextStartCode5);
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final void AG7(long j, long j2) {
        this.A07.A08();
        for (int i = 0; i < i; i++) {
            com.facebook.ads.redexgen.core.DA daValueAt = this.A05.valueAt(i);
            java.lang.String[] strArr = A08;
            java.lang.String str = strArr[6];
            java.lang.String str2 = strArr[2];
            int length = str.length();
            int i2 = str2.length();
            if (length != i2) {
                throw new java.lang.RuntimeException();
            }
            A08[0] = "i2l135vnIgvDI5cE6wxXd3NswI9xNsO1";
            daValueAt.A02();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0609Bx
    public final boolean AGs(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        byte[] bArr = new byte[14];
        interfaceC0610By.AEO(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        int packStuffingLength = bArr[13] & 7;
        interfaceC0610By.A3s(packStuffingLength);
        interfaceC0610By.AEO(bArr, 0, 3);
        int packStuffingLength2 = bArr[0];
        int i = (packStuffingLength2 & 255) << 16;
        int packStuffingLength3 = bArr[1];
        int i2 = i | ((packStuffingLength3 & 255) << 8);
        int packStuffingLength4 = bArr[2];
        return 1 == ((packStuffingLength4 & 255) | i2);
    }
}
