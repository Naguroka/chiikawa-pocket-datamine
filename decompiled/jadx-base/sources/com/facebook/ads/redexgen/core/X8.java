package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class X8 implements com.facebook.ads.redexgen.core.InterfaceC0724Gz {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"Ne7ZKUe", "PSO0U5rzFo7bmFbA9aIaTCLs4C45Ec76", "n2YcQoEvp", "A0Q5ZUOPoOCVUrviysnzG", "zb5q8BZfDBvmVPM7uFOoyQTMVCraB8xF", "52iGK0t26yzfPfzglwEyvTsLNRy5L", "Ycsm2ZrfC0lohk9KjHhsrMWfSuRqw1L2", "37ez3Sl1APBPbLkl98B7sVpsTL4MR"};
    public int A00;
    public com.facebook.ads.redexgen.core.H3 A01;
    public byte[] A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 76);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{11, 115, 42, 41, 59, 45, 126, 124, 89, 110, 110, 115, 110, 60, 107, 116, 117, 112, 121, 60, 108, 125, 110, 111, 117, 114, 123, 60, 94, 125, 111, 121, 42, 40, 60, 121, 114, 127, 115, 120, 121, 120, 60, 111, 104, 110, 117, 114, 123, 38, 60, 2, 4, 122, 22, 4, 20, 30, 30, 69, 126, 117, 104, 96, 117, 115, 100, 117, 116, 48, 69, 66, 89, 48, 118, 127, 98, 125, 113, 100, 42, 48, 88, 99, 126, 120, 125, 125, 98, 127, 121, 104, 105, 45, 126, 110, 101, 104, 96, 104, 55, 45, 118, 115, 102, 115};
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final android.net.Uri A8c() {
        if (this.A01 == null) {
            return null;
        }
        com.facebook.ads.redexgen.core.H3 h3 = this.A01;
        if (A04[0].length() == 15) {
            throw new java.lang.RuntimeException();
        }
        A04[2] = "GK7vJTRqbjO3";
        return h3.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final long AEE(com.facebook.ads.redexgen.core.H3 h3) throws java.io.IOException {
        this.A01 = h3;
        android.net.Uri uri = h3.A04;
        java.lang.String scheme = uri.getScheme();
        if (A00(102, 4, 94).equals(scheme)) {
            java.lang.String[] uriParts = com.facebook.ads.redexgen.core.IK.A0l(uri.getSchemeSpecificPart(), A00(0, 1, 107));
            if (uriParts.length == 2) {
                java.lang.String str = uriParts[1];
                java.lang.String dataString = uriParts[0];
                if (dataString.contains(A00(1, 7, 4))) {
                    try {
                        this.A02 = android.util.Base64.decode(str, 0);
                    } catch (java.lang.IllegalArgumentException e) {
                        java.lang.String scheme2 = A00(8, 43, 80) + str;
                        throw new com.facebook.ads.redexgen.core.A0(scheme2, e);
                    }
                } else {
                    this.A02 = java.net.URLDecoder.decode(str, A00(51, 8, 27)).getBytes();
                }
                return this.A02.length;
            }
            java.lang.String scheme3 = A00(59, 23, 92) + uri;
            throw new com.facebook.ads.redexgen.core.A0(scheme3);
        }
        java.lang.String scheme4 = A00(82, 20, 65) + scheme;
        throw new com.facebook.ads.redexgen.core.A0(scheme4);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final void close() throws java.io.IOException {
        this.A01 = null;
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0724Gz
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int length = this.A02.length;
        if (A04[2].length() == 11) {
            throw new java.lang.RuntimeException();
        }
        A04[0] = "UkFdkMsPJijR7VnNGK8H6arT";
        int i3 = length - this.A00;
        if (i3 == 0) {
            return -1;
        }
        int iMin = java.lang.Math.min(i2, i3);
        byte[] bArr2 = this.A02;
        int remainingBytes = this.A00;
        java.lang.System.arraycopy(bArr2, remainingBytes, bArr, i, iMin);
        int remainingBytes2 = this.A00;
        this.A00 = remainingBytes2 + iMin;
        return iMin;
    }
}
