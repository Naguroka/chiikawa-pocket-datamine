package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class WE implements com.facebook.ads.redexgen.core.C6X {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"mqH0C", "P", "Prv4rgxv4XvjDltPpSeqnrL7fWipLvZ8", "wRAQVkTW0Fdys8", "msKGEa7u", "", "70lhKNnmmmhMBIKZ0qoNvOWwjw91iHAS", "ylnG6cBHFe0YAiTdKU1DLGP7G6QidCUo"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1358cU A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.W7 A01;
    public final /* synthetic */ boolean A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 103);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{28, 55, okio.Utf8.REPLACEMENT_BYTE, 66, 59, 58, -10, 74, 69, -10, 58, 69, 77, 68, 66, 69, 55, 58, -10, 55, -10, 67, 59, 58, okio.Utf8.REPLACEMENT_BYTE, 55, 4};
    }

    static {
        A01();
    }

    public WE(com.facebook.ads.redexgen.core.W7 w7, com.facebook.ads.redexgen.core.C1358cU c1358cU, boolean z) {
        this.A01 = w7;
        this.A00 = c1358cU;
        this.A02 = z;
    }

    @Override // com.facebook.ads.redexgen.core.C6X
    public final void ABT() {
        if (this.A01.A0a != null) {
            this.A01.A0a.A0J();
            this.A01.A0a = null;
        }
        com.facebook.ads.internal.protocol.AdErrorType adErrorType = com.facebook.ads.internal.protocol.AdErrorType.CACHE_FAILURE_ERROR;
        java.lang.String strA00 = A00(0, 27, 111);
        this.A01.A0c.A0E().A38(com.facebook.ads.redexgen.core.C0841Lu.A01(this.A01.A00), adErrorType.getErrorCode(), strA00);
        if (this.A01.A0G != null) {
            this.A01.A0G.ABs(com.facebook.ads.redexgen.core.C0779Jg.A01(adErrorType, strA00));
        }
    }

    @Override // com.facebook.ads.redexgen.core.C6X
    public final void ABc() {
        this.A01.A0a = this.A00;
        if (this.A02 && this.A01.A0A != null) {
            this.A01.A0A.A0K();
        }
        if (this.A01.A0G != null) {
            if (this.A01.A0E.equals(com.facebook.ads.redexgen.core.JQ.A04) && !this.A01.A0q()) {
                this.A01.A0G.ACg();
            }
            if (this.A02) {
                com.facebook.ads.redexgen.core.W7 w7 = this.A01;
                java.lang.String[] strArr = A04;
                if (strArr[4].length() != strArr[0].length()) {
                    java.lang.String[] strArr2 = A04;
                    strArr2[4] = "lirdd0Qr";
                    strArr2[0] = "muvxx";
                    if (com.facebook.ads.redexgen.core.C0762Im.A1i(w7.A0c) && this.A01.A0z() != null && this.A01.A0z().A19()) {
                        this.A01.A0M = com.facebook.ads.redexgen.core.AbstractC0927Pc.A01(this.A01.A0c, this.A01.A0z(), 4, new com.facebook.ads.redexgen.core.WF(this));
                        return;
                    } else {
                        com.facebook.ads.redexgen.core.W7 w8 = this.A01;
                        if (A04[3].length() != 28) {
                            A04[6] = "Y1qaffLCA6OgZ6gO9VGOLjOrervRHVYN";
                            w8.A0G.AB6();
                            return;
                        }
                    }
                }
                throw new java.lang.RuntimeException();
            }
        }
    }
}
