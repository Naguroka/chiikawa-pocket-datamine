package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1160Yf implements com.facebook.ads.redexgen.core.CF {
    public static byte[] A07;
    public static java.lang.String[] A08 = {"B", "", "BrvSCWdfcuCaq5cVU07ZhXt", "qubJP7lsNWbo", "NFdit9VNslJwWcMc3jsN0gE8Kfr4ZGkz", "XUMceIPS5Pe", "7dzq6MzNvuPcuITQcDTRqTS6G3kR4", "NdQzj"};
    public int A00;
    public int A01;
    public long A02;
    public com.facebook.ads.redexgen.core.CH A03;
    public final byte[] A06 = new byte[8];
    public final java.util.ArrayDeque<com.facebook.ads.redexgen.core.CE> A05 = new java.util.ArrayDeque<>();
    public final com.facebook.ads.redexgen.core.CM A04 = new com.facebook.ads.redexgen.core.CM();

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 112);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{26, kotlin.io.encoding.Base64.padSymbol, 37, 50, okio.Utf8.REPLACEMENT_BYTE, 58, 55, 115, 54, okio.Utf8.REPLACEMENT_BYTE, 54, 62, 54, kotlin.io.encoding.Base64.padSymbol, 39, 115, 39, 42, 35, 54, 115, 87, 112, 104, 127, 114, 119, 122, 62, 120, 114, 113, 127, 106, 62, 109, 119, 100, 123, 36, 62, 79, 104, 112, 103, 106, 111, 98, 38, 111, 104, 114, 99, 97, 99, 116, 38, 117, 111, 124, 99, 60, 38, 74, 109, 107, 112, 119, 126, 57, 124, 117, 124, 116, 124, 119, 109, 57, 106, 112, 99, 124, 35, 57};
    }

    static {
        A05();
    }

    private double A00(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, int i) throws java.lang.InterruptedException, java.io.IOException {
        long jA02 = A02(interfaceC0610By, i);
        if (i == 4) {
            return java.lang.Float.intBitsToFloat((int) jA02);
        }
        return java.lang.Double.longBitsToDouble(jA02);
    }

    private long A01(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        interfaceC0610By.AFq();
        while (true) {
            interfaceC0610By.AEO(this.A06, 0, 4);
            int iA00 = com.facebook.ads.redexgen.core.CM.A00(this.A06[0]);
            if (iA00 != -1 && iA00 <= 4) {
                int iA01 = (int) com.facebook.ads.redexgen.core.CM.A01(this.A06, iA00, false);
                if (this.A03.A9V(iA01)) {
                    interfaceC0610By.AGq(iA00);
                    return iA01;
                }
            }
            interfaceC0610By.AGq(1);
        }
    }

    private long A02(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, int i) throws java.lang.InterruptedException, java.io.IOException {
        interfaceC0610By.readFully(this.A06, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long value = this.A06[i2] & 255;
            j = (j << 8) | value;
        }
        return j;
    }

    private java.lang.String A04(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, int i) throws java.lang.InterruptedException, java.io.IOException {
        if (i == 0) {
            return A03(0, 0, 30);
        }
        byte[] bArr = new byte[i];
        interfaceC0610By.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new java.lang.String(bArr, 0, i);
    }

    @Override // com.facebook.ads.redexgen.core.CF
    public final void A9E(com.facebook.ads.redexgen.core.CH ch) {
        this.A03 = ch;
    }

    @Override // com.facebook.ads.redexgen.core.CF
    public final boolean AEm(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By) throws java.lang.InterruptedException, java.io.IOException {
        com.facebook.ads.redexgen.core.AbstractC0730Hf.A04(this.A03 != null);
        while (true) {
            if (!this.A05.isEmpty() && interfaceC0610By.A86() >= this.A05.peek().A01) {
                this.A03.A5t(this.A05.pop().A00);
                return true;
            }
            if (this.A01 == 0) {
                long jA05 = this.A04.A05(interfaceC0610By, true, false, 4);
                if (jA05 == -2) {
                    jA05 = A01(interfaceC0610By);
                }
                if (jA05 == -1) {
                    return false;
                }
                this.A00 = (int) jA05;
                this.A01 = 1;
            }
            if (this.A01 == 1) {
                this.A02 = this.A04.A05(interfaceC0610By, false, true, 8);
                this.A01 = 2;
            }
            int iA7G = this.A03.A7G(this.A00);
            switch (iA7G) {
                case 0:
                    int type = (int) this.A02;
                    interfaceC0610By.AGq(type);
                    this.A01 = 0;
                    break;
                case 1:
                    long jA86 = interfaceC0610By.A86();
                    this.A05.push(new com.facebook.ads.redexgen.core.CE(this.A00, jA86 + this.A02));
                    this.A03.AGv(this.A00, jA86, this.A02);
                    this.A01 = 0;
                    return true;
                case 2:
                    if (this.A02 <= 8) {
                        this.A03.A9I(this.A00, A02(interfaceC0610By, (int) this.A02));
                        this.A01 = 0;
                        return true;
                    }
                    throw new com.facebook.ads.redexgen.core.A0(A03(41, 22, 118) + this.A02);
                case 3:
                    if (this.A02 <= 2147483647L) {
                        this.A03.AH4(this.A00, A04(interfaceC0610By, (int) this.A02));
                        java.lang.String[] strArr = A08;
                        if (strArr[1].length() != strArr[6].length()) {
                            A08[5] = "v9OYcHmszrYMWEDCAU9Hgpqe";
                            this.A01 = 0;
                            return true;
                        }
                    } else {
                        throw new com.facebook.ads.redexgen.core.A0(A03(63, 21, 105) + this.A02);
                    }
                case 4:
                    this.A03.A4O(this.A00, (int) this.A02, interfaceC0610By);
                    this.A01 = 0;
                    return true;
                case 5:
                    long j = this.A02;
                    java.lang.String[] strArr2 = A08;
                    if (strArr2[0].length() != strArr2[7].length()) {
                        A08[5] = "vAyuGOD2hEh31pcAQ6Q6YJ2Y";
                        if (j == 4 || this.A02 == 8) {
                            com.facebook.ads.redexgen.core.CH ch = this.A03;
                            int i = this.A00;
                            int i2 = (int) this.A02;
                            java.lang.String[] strArr3 = A08;
                            if (strArr3[0].length() != strArr3[7].length()) {
                                java.lang.String[] strArr4 = A08;
                                strArr4[1] = "";
                                strArr4[6] = "C2oGTReXvdUdZ5Jz61Ig1r0mq6v7c";
                                ch.A65(i, A00(interfaceC0610By, i2));
                                this.A01 = 0;
                                return true;
                            }
                            ch.A65(i, A00(interfaceC0610By, i2));
                            this.A01 = 0;
                            return true;
                        }
                        throw new com.facebook.ads.redexgen.core.A0(A03(21, 20, 110) + this.A02);
                    }
                    break;
                default:
                    throw new com.facebook.ads.redexgen.core.A0(A03(0, 21, 35) + iA7G);
            }
            throw new java.lang.RuntimeException();
        }
    }

    @Override // com.facebook.ads.redexgen.core.CF
    public final void reset() {
        this.A01 = 0;
        this.A05.clear();
        this.A04.A06();
    }
}
