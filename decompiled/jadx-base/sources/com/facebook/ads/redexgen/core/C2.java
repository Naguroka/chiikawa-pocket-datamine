package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2 {
    public final com.facebook.ads.redexgen.core.I4 A00 = new com.facebook.ads.redexgen.core.I4(10);

    public final com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata A00(com.facebook.ads.redexgen.core.InterfaceC0610By interfaceC0610By, com.facebook.ads.redexgen.core.InterfaceC0650Dn interfaceC0650Dn) throws java.lang.InterruptedException, java.io.IOException {
        int tagLength = 0;
        com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata metadataA0O = null;
        while (true) {
            try {
                interfaceC0610By.AEO(this.A00.A00, 0, 10);
                this.A00.A0Y(0);
                int iA0G = this.A00.A0G();
                int peekedId3Bytes = com.facebook.ads.redexgen.core.C1138Xi.A03;
                if (iA0G != peekedId3Bytes) {
                    break;
                }
                this.A00.A0Z(3);
                int iA0D = this.A00.A0D();
                int framesLength = iA0D + 10;
                if (metadataA0O == null) {
                    byte[] bArr = new byte[framesLength];
                    java.lang.System.arraycopy(this.A00.A00, 0, bArr, 0, 10);
                    interfaceC0610By.AEO(bArr, 10, iA0D);
                    metadataA0O = new com.facebook.ads.redexgen.core.C1138Xi(interfaceC0650Dn).A0O(bArr, framesLength);
                } else {
                    interfaceC0610By.A3s(iA0D);
                }
                tagLength += framesLength;
            } catch (java.io.EOFException unused) {
            }
        }
        interfaceC0610By.AFq();
        interfaceC0610By.A3s(tagLength);
        return metadataA0O;
    }
}
