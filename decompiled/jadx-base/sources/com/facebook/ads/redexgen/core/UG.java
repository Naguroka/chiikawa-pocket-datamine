package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UG implements com.facebook.ads.redexgen.core.InterfaceC0925Pa {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"j0Llx0J1MSgFmdDCajgZS", "WqPPZqRc0dX4AocYH9RDHKNy8FKfctFv", "x4SSjhhb9i0sKdnf0Wf5s", "xtX3gCAokrJDAeXWoUYA8plxhmXwCeOm", "uRKBJqZuIeGTpbClJ99Pe9ZmQekDyja2", "rD1ESZhEMARN2moY0NiI8P2eIcx2KKt8", "vMF11DxP2anc735da3YXnRmNGLge", "xeUiMncNmqcgkFgn7eafy8FxNu3C"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.BN A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            java.lang.String[] strArr = A02;
            if (strArr[2].length() != strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A02;
            strArr2[6] = "mcgN6rOfJkIrJEn9BPtko0s6E0JP";
            strArr2[7] = "7NujJgKdrQLNFT4Mmbwt8V3uSlrM";
            if (i4 >= length) {
                return new java.lang.String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 20);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{47, 46, 88, 27, 10, 25, 11, 16, 29, 28, 28, 14, 9, 52, 29, 2, 14, 28};
    }

    static {
        A01();
    }

    public UG(com.facebook.ads.redexgen.core.BN bn) {
        this.A00 = bn;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0925Pa
    public final void ADE() {
        com.facebook.ads.redexgen.core.C1198Zr context = com.facebook.ads.redexgen.core.AbstractC04997i.A00();
        if (context != null) {
            context.A07().AA0(A00(10, 8, 127), com.facebook.ads.redexgen.core.C8E.A2g, new com.facebook.ads.redexgen.core.C8F(A00(0, 10, 108)));
        }
    }
}
