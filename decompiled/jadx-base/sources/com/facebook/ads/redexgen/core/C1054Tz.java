package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1054Tz implements com.facebook.ads.redexgen.core.InterfaceC0891Ns {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"BeK4HZWWIRhrC207wWuIOn", "ZxUaKMHZMCvHIxTDkc1UvZSYXikI2iYM", "xy0Ab8m7NOX4ZRxTfyGPwRY1TRrgVPC4", "ij8auLNb9rfA8yI55JUjNirWgnYpCp0M", "e9T4yeifuMgQg3dKDn6E2LsVBs4fgiHR", "ibrxpSG6qut0wBAmR6wSiB8exNotCqiu", "LMYPYXdb4SaVI93FsN1uYFih9", "8N3vGs6nddgUWUG"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.A6 A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            java.lang.String[] strArr = A02;
            if (strArr[6].length() == strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            A02[2] = "F3dYTVgRpzEGoEWMN2T8FFCtbrhRHRBi";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 99);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{21, 19, 5, 18, okio.Utf8.REPLACEMENT_BYTE, 14, 1, 22, 9, 7, 1, 20, 9, 15, 14, okio.Utf8.REPLACEMENT_BYTE, 9, 1, 2};
    }

    static {
        A01();
    }

    public C1054Tz(com.facebook.ads.redexgen.core.A6 a6) {
        this.A00 = a6;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0891Ns
    public final void ACw(java.lang.String str) {
        this.A00.A0Q = false;
        this.A00.A0F.setProgress(100);
        com.facebook.ads.redexgen.core.M3.A0N(this.A00.A0F, 8);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0891Ns
    public final void ACy(java.lang.String str) {
        this.A00.A0Q = true;
        com.facebook.ads.redexgen.core.M3.A0N(this.A00.A0F, 0);
        this.A00.A0E.setUrl(str);
        if (!this.A00.A0P) {
            com.facebook.ads.redexgen.core.A6 a6 = this.A00;
            if (A02[5].charAt(30) != 'i') {
                throw new java.lang.RuntimeException();
            }
            A02[7] = "LFtEVX0D7i5Pos5vlgnVVb1H7Q5y";
            if (a6.A02 > 1) {
                this.A00.A0P = true;
                this.A00.A0g(A00(0, 19, 3));
            }
        }
        com.facebook.ads.redexgen.core.A6.A05(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0891Ns
    public final void ADG(int i) {
        if (this.A00.A0Q) {
            this.A00.A0F.setProgress(i);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0891Ns
    public final void ADJ(java.lang.String str) {
        this.A00.A0E.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0891Ns
    public final void ADL() {
        ((com.facebook.ads.redexgen.core.U6) this.A00).A0A.ABR(14);
    }
}
